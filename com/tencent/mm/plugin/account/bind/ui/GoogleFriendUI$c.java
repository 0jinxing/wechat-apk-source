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
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

final class GoogleFriendUI$c extends AsyncTask<Void, Void, Void>
{
  private String gqE;
  private boolean gqG;
  private String gqI;

  public GoogleFriendUI$c(GoogleFriendUI paramGoogleFriendUI, String paramString)
  {
    this.gqI = paramString;
  }

  private Void aoY()
  {
    AppMethodBeat.i(13665);
    ab.i("MicroMsg.GoogleContact.GoogleFriendUI", "doInBackground");
    Object localObject1 = "";
    try
    {
      localObject2 = new java/net/URL;
      ((URL)localObject2).<init>("https://accounts.google.com/o/oauth2/token");
      localObject2 = (HttpURLConnection)((URL)localObject2).openConnection();
      ((HttpURLConnection)localObject2).setRequestProperty("Charset", "UTF-8");
      ((HttpURLConnection)localObject2).setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
      ((HttpURLConnection)localObject2).setRequestMethod("POST");
      ((HttpURLConnection)localObject2).setConnectTimeout(20000);
      ((HttpURLConnection)localObject2).setReadTimeout(20000);
      ((HttpURLConnection)localObject2).setDoInput(true);
      ((HttpURLConnection)localObject2).setDoOutput(true);
      localObject3 = new java/util/ArrayList;
      ((ArrayList)localObject3).<init>();
      Object localObject4 = new org/apache/http/message/BasicNameValuePair;
      ((BasicNameValuePair)localObject4).<init>("refresh_token", this.gqI);
      ((List)localObject3).add(localObject4);
      localObject4 = new org/apache/http/message/BasicNameValuePair;
      ((BasicNameValuePair)localObject4).<init>("client_id", "369820936870.apps.googleusercontent.com");
      ((List)localObject3).add(localObject4);
      localObject4 = new org/apache/http/message/BasicNameValuePair;
      ((BasicNameValuePair)localObject4).<init>("client_secret", "wcFhvo-s7wNcmQ9Zjr00H06u");
      ((List)localObject3).add(localObject4);
      localObject4 = new org/apache/http/message/BasicNameValuePair;
      ((BasicNameValuePair)localObject4).<init>("grant_type", "refresh_token");
      ((List)localObject3).add(localObject4);
      String str2 = m.au((List)localObject3);
      ab.i("MicroMsg.GoogleContact.GoogleFriendUI", "QueryString:%s".concat(String.valueOf(str2)));
      localObject4 = ((HttpURLConnection)localObject2).getOutputStream();
      localObject3 = new java/io/BufferedWriter;
      OutputStreamWriter localOutputStreamWriter = new java/io/OutputStreamWriter;
      localOutputStreamWriter.<init>((OutputStream)localObject4, "UTF-8");
      ((BufferedWriter)localObject3).<init>(localOutputStreamWriter);
      ((BufferedWriter)localObject3).write(str2);
      ((BufferedWriter)localObject3).flush();
      ((BufferedWriter)localObject3).close();
      int i = ((HttpURLConnection)localObject2).getResponseCode();
      ab.e("MicroMsg.GoogleContact.GoogleFriendUI", "responseCode:".concat(String.valueOf(i)));
      if (200 == i)
      {
        localObject3 = new java/lang/StringBuffer;
        ((StringBuffer)localObject3).<init>();
        localObject1 = new java/io/BufferedReader;
        localObject4 = new java/io/InputStreamReader;
        ((InputStreamReader)localObject4).<init>(((HttpURLConnection)localObject2).getInputStream(), "UTF-8");
        ((BufferedReader)localObject1).<init>((Reader)localObject4);
        while (true)
        {
          localObject4 = ((BufferedReader)localObject1).readLine();
          if (localObject4 == null)
            break;
          ((StringBuffer)localObject3).append((String)localObject4);
        }
      }
    }
    catch (ProtocolException localProtocolException)
    {
      Object localObject2;
      Object localObject3;
      ab.e("MicroMsg.GoogleContact.GoogleFriendUI", "ProtocolException:%s", new Object[] { localProtocolException.getMessage() });
      while (true)
      {
        AppMethodBeat.o(13665);
        return null;
        localProtocolException.close();
        String str1 = ((StringBuffer)localObject3).toString();
        ab.i("MicroMsg.GoogleContact.GoogleFriendUI", "exchange token respone:%s".concat(String.valueOf(str1)));
        ((HttpURLConnection)localObject2).disconnect();
        ab.i("MicroMsg.GoogleContact.GoogleFriendUI", "refresh response:%s", new Object[] { str1 });
        localObject2 = new org/json/JSONObject;
        ((JSONObject)localObject2).<init>(str1);
        this.gqE = ((JSONObject)localObject2).optString("access_token");
        this.gqG = true;
      }
    }
    catch (MalformedURLException localMalformedURLException)
    {
      while (true)
        ab.e("MicroMsg.GoogleContact.GoogleFriendUI", "MalformedURLException:%s", new Object[] { localMalformedURLException.getMessage() });
    }
    catch (IOException localIOException)
    {
      while (true)
        ab.e("MicroMsg.GoogleContact.GoogleFriendUI", "IOException:%s", new Object[] { localIOException.getMessage() });
    }
    catch (JSONException localJSONException)
    {
      while (true)
        ab.e("MicroMsg.GoogleContact.GoogleFriendUI", "JSONException:%s", new Object[] { localJSONException.getMessage() });
    }
  }

  protected final void onPreExecute()
  {
    AppMethodBeat.i(13664);
    super.onPreExecute();
    ab.i("MicroMsg.GoogleContact.GoogleFriendUI", "onPreExecute");
    this.gqG = false;
    AppMethodBeat.o(13664);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.GoogleFriendUI.c
 * JD-Core Version:    0.6.2
 */