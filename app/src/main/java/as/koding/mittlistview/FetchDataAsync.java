package as.koding.mittlistview;

import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by thomasorten on 27.02.2018.
 */

public class FetchDataAsync extends AsyncTask<String, Integer, ArrayList> {

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }
    @Override
    protected ArrayList doInBackground(String... params) {

        String urlString = params[0];
        ArrayList<Parkering> parkeringList = new ArrayList<Parkering>();

        try {
            URL url = new URL(urlString);
            String response = downloadUrl(url);

            JSONArray jsonArr = new JSONArray(response);

            for (int i = 0; i < jsonArr.length(); i++) {
                JSONObject firstObject = jsonArr.getJSONObject(i);

                String navn = firstObject.getString("parkeringstilbyderNavn");
                String adresse = firstObject.getString("adresse");
                parkeringList.add(new Parkering(navn, adresse));
            }

        } catch (Exception e) {
            Log.d("Exception", e.toString());
        }

        return parkeringList;
    }

    @Override
    protected void onPostExecute(ArrayList list) {
        super.onPostExecute(list);
    }

    private String downloadUrl(URL url) throws IOException {
        try {
            HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();
            httpConnection.setRequestMethod("GET");
            httpConnection.setRequestProperty("Content-length", "0");
            httpConnection.setUseCaches(false);
            httpConnection.setAllowUserInteraction(false);
            httpConnection.setConnectTimeout(100000);
            httpConnection.setReadTimeout(100000);
            httpConnection.connect();

            BufferedReader br = new BufferedReader(new InputStreamReader(httpConnection.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line + "\n");
            }
            br.close();
            return sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

}