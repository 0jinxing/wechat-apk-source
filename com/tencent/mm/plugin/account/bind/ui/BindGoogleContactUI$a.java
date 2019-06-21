package com.tencent.mm.plugin.account.bind.ui;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;

final class BindGoogleContactUI$a extends AsyncTask<Void, Void, Void>
{
  private String gqE;
  private String gqF;
  private boolean gqG;

  public BindGoogleContactUI$a(BindGoogleContactUI paramBindGoogleContactUI, String paramString)
  {
    this.gqE = paramString;
  }

  private Void aoY()
  {
    AppMethodBeat.i(13357);
    ab.i("MicroMsg.GoogleContact.BindGoogleContactUI", "doInBackground");
    try
    {
      localObject1 = this.gqE;
      Object localObject2 = "";
      localObject3 = new java/net/URL;
      ((URL)localObject3).<init>("https://www.googleapis.com/oauth2/v1/userinfo?access_token=".concat(String.valueOf(localObject1)));
      localObject3 = (HttpURLConnection)((URL)localObject3).openConnection();
      ((HttpURLConnection)localObject3).setRequestProperty("Charset", "UTF-8");
      ((HttpURLConnection)localObject3).setRequestMethod("GET");
      ((HttpURLConnection)localObject3).setConnectTimeout(20000);
      ((HttpURLConnection)localObject3).setReadTimeout(20000);
      int i = ((HttpURLConnection)localObject3).getResponseCode();
      ab.e("MicroMsg.GoogleContact.BindGoogleContactUI", "responseCode:".concat(String.valueOf(i)));
      if (200 == i)
      {
        localObject2 = new java/lang/StringBuffer;
        ((StringBuffer)localObject2).<init>();
        localObject1 = new java/io/BufferedReader;
        Object localObject4 = new java/io/InputStreamReader;
        ((InputStreamReader)localObject4).<init>(((HttpURLConnection)localObject3).getInputStream(), "UTF-8");
        ((BufferedReader)localObject1).<init>((Reader)localObject4);
        while (true)
        {
          localObject4 = ((BufferedReader)localObject1).readLine();
          if (localObject4 == null)
            break;
          ((StringBuffer)localObject2).append((String)localObject4);
        }
      }
    }
    catch (MalformedURLException localMalformedURLException)
    {
      Object localObject1;
      Object localObject3;
      ab.e("MicroMsg.GoogleContact.BindGoogleContactUI", "MalformedURLException:%s", new Object[] { localMalformedURLException.getMessage() });
      while (true)
      {
        AppMethodBeat.o(13357);
        return null;
        ((BufferedReader)localObject1).close();
        String str = localMalformedURLException.toString();
        ab.i("MicroMsg.GoogleContact.BindGoogleContactUI", "get EmailAccount respone:%s", new Object[] { str });
        ((HttpURLConnection)localObject3).disconnect();
        localObject3 = new org/json/JSONObject;
        ((JSONObject)localObject3).<init>(str);
        this.gqF = ((JSONObject)localObject3).optString("email");
        if (!TextUtils.isEmpty(this.gqF))
          this.gqG = true;
      }
    }
    catch (ProtocolException localProtocolException)
    {
      while (true)
        ab.e("MicroMsg.GoogleContact.BindGoogleContactUI", "ProtocolException:%s", new Object[] { localProtocolException.getMessage() });
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      while (true)
        ab.e("MicroMsg.GoogleContact.BindGoogleContactUI", "UnsupportedEncodingException:%s", new Object[] { localUnsupportedEncodingException.getMessage() });
    }
    catch (IOException localIOException)
    {
      while (true)
        ab.e("MicroMsg.GoogleContact.BindGoogleContactUI", "IOException:%s", new Object[] { localIOException.getMessage() });
    }
    catch (JSONException localJSONException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.GoogleContact.BindGoogleContactUI", localJSONException, "", new Object[0]);
    }
  }

  protected final void onPreExecute()
  {
    AppMethodBeat.i(13356);
    super.onPreExecute();
    ab.i("MicroMsg.GoogleContact.BindGoogleContactUI", "onPreExecute");
    this.gqG = false;
    AppMethodBeat.o(13356);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindGoogleContactUI.a
 * JD-Core Version:    0.6.2
 */