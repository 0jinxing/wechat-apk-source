package com.tencent.mm.plugin.account.bind.ui;

import android.os.AsyncTask;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.account.friend.a.m;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

final class BindGoogleContactUI$b extends AsyncTask<Void, Void, Void>
{
  private boolean cxT;
  private String gqE;
  private String gqH;
  private String gqI;

  public BindGoogleContactUI$b(BindGoogleContactUI paramBindGoogleContactUI, String paramString)
  {
    this.gqH = paramString;
  }

  private Void aoY()
  {
    AppMethodBeat.i(13361);
    try
    {
      Object localObject1 = this.gqH;
      Object localObject2 = "";
      localObject3 = new java/net/URL;
      ((URL)localObject3).<init>("https://accounts.google.com/o/oauth2/token");
      localObject3 = (HttpURLConnection)((URL)localObject3).openConnection();
      ((HttpURLConnection)localObject3).setRequestProperty("Charset", "UTF-8");
      ((HttpURLConnection)localObject3).setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
      ((HttpURLConnection)localObject3).setRequestMethod("POST");
      ((HttpURLConnection)localObject3).setConnectTimeout(20000);
      ((HttpURLConnection)localObject3).setReadTimeout(20000);
      ((HttpURLConnection)localObject3).setDoInput(true);
      ((HttpURLConnection)localObject3).setDoOutput(true);
      localObject4 = new java/util/ArrayList;
      ((ArrayList)localObject4).<init>();
      Object localObject5 = new org/apache/http/message/BasicNameValuePair;
      ((BasicNameValuePair)localObject5).<init>("code", (String)localObject1);
      ((List)localObject4).add(localObject5);
      localObject1 = new org/apache/http/message/BasicNameValuePair;
      ((BasicNameValuePair)localObject1).<init>("client_id", "369820936870.apps.googleusercontent.com");
      ((List)localObject4).add(localObject1);
      localObject1 = new org/apache/http/message/BasicNameValuePair;
      ((BasicNameValuePair)localObject1).<init>("client_secret", "wcFhvo-s7wNcmQ9Zjr00H06u");
      ((List)localObject4).add(localObject1);
      localObject1 = new org/apache/http/message/BasicNameValuePair;
      ((BasicNameValuePair)localObject1).<init>("redirect_uri", "urn:ietf:wg:oauth:2.0:oob");
      ((List)localObject4).add(localObject1);
      localObject1 = new org/apache/http/message/BasicNameValuePair;
      ((BasicNameValuePair)localObject1).<init>("grant_type", "authorization_code");
      ((List)localObject4).add(localObject1);
      localObject4 = m.au((List)localObject4);
      ab.i("MicroMsg.GoogleContact.BindGoogleContactUI", "QueryString:%s", new Object[] { localObject4 });
      ((HttpURLConnection)localObject3).setRequestProperty("Content-length", String.valueOf(((String)localObject4).getBytes().length));
      OutputStream localOutputStream = ((HttpURLConnection)localObject3).getOutputStream();
      localObject5 = new java/io/BufferedWriter;
      localObject1 = new java/io/OutputStreamWriter;
      ((OutputStreamWriter)localObject1).<init>(localOutputStream, "UTF-8");
      ((BufferedWriter)localObject5).<init>((Writer)localObject1);
      ((BufferedWriter)localObject5).write((String)localObject4);
      ((BufferedWriter)localObject5).flush();
      ((BufferedWriter)localObject5).close();
      int i = ((HttpURLConnection)localObject3).getResponseCode();
      ab.e("MicroMsg.GoogleContact.BindGoogleContactUI", "responseCode:".concat(String.valueOf(i)));
      if (200 == i)
      {
        localObject2 = new java/lang/StringBuffer;
        ((StringBuffer)localObject2).<init>();
        localObject4 = new java/io/BufferedReader;
        localObject1 = new java/io/InputStreamReader;
        ((InputStreamReader)localObject1).<init>(((HttpURLConnection)localObject3).getInputStream(), "UTF-8");
        ((BufferedReader)localObject4).<init>((Reader)localObject1);
        while (true)
        {
          localObject1 = ((BufferedReader)localObject4).readLine();
          if (localObject1 == null)
            break;
          ((StringBuffer)localObject2).append((String)localObject1);
        }
      }
    }
    catch (MalformedURLException localMalformedURLException)
    {
      Object localObject3;
      Object localObject4;
      ab.e("MicroMsg.GoogleContact.BindGoogleContactUI", "MalformedURLException:%s" + localMalformedURLException.getMessage());
      while (true)
      {
        AppMethodBeat.o(13361);
        return null;
        ((BufferedReader)localObject4).close();
        String str = localMalformedURLException.toString();
        ab.i("MicroMsg.GoogleContact.BindGoogleContactUI", "exchange token respone:%s", new Object[] { str });
        ((HttpURLConnection)localObject3).disconnect();
        localObject3 = new org/json/JSONObject;
        ((JSONObject)localObject3).<init>(str);
        this.gqE = ((JSONObject)localObject3).optString("access_token");
        localObject3 = new org/json/JSONObject;
        ((JSONObject)localObject3).<init>(str);
        this.gqI = ((JSONObject)localObject3).optString("refresh_token");
        ab.i("MicroMsg.GoogleContact.BindGoogleContactUI", "response:%s", new Object[] { str });
        ab.i("MicroMsg.GoogleContact.BindGoogleContactUI", "mAccessToken:%s", new Object[] { this.gqE });
        ab.i("MicroMsg.GoogleContact.BindGoogleContactUI", "mRefreshToken:%s", new Object[] { this.gqI });
        this.cxT = true;
      }
    }
    catch (ProtocolException localProtocolException)
    {
      while (true)
        ab.e("MicroMsg.GoogleContact.BindGoogleContactUI", "ProtocolException:%s" + localProtocolException.getMessage());
    }
    catch (IOException localIOException)
    {
      while (true)
        ab.e("MicroMsg.GoogleContact.BindGoogleContactUI", "IOException:%s" + localIOException.getMessage());
    }
    catch (JSONException localJSONException)
    {
      while (true)
        ab.e("MicroMsg.GoogleContact.BindGoogleContactUI", "JSONException:%s" + localJSONException.getMessage());
    }
  }

  protected final void onPreExecute()
  {
    AppMethodBeat.i(13360);
    super.onPreExecute();
    ab.i("MicroMsg.GoogleContact.BindGoogleContactUI", "onPreExecute");
    this.gqE = "";
    this.gqI = "";
    this.cxT = false;
    AppMethodBeat.o(13360);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindGoogleContactUI.b
 * JD-Core Version:    0.6.2
 */