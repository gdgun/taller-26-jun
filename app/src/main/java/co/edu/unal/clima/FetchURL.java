package co.edu.unal.clima;

import android.os.AsyncTask;

/**
 * Created by jiacontrerasp on 6/26/15.
 */
public class FetchURL extends AsyncTask<String ,Void, Void> {

    @Override
    protected Void doInBackground(String... strings) {

        String url = strings[0];
        return null;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected void onCancelled(Void aVoid) {
        super.onCancelled(aVoid);
    }

    @Override
    protected void onCancelled() {
        super.onCancelled();
    }
}
