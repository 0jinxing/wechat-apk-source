package com.tencent.mm.plugin.account.bind.ui;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.account.friend.a.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class GoogleFriendUI$b extends AsyncTask<Void, Void, Void>
{
  private String gtl;
  private GoogleFriendUI.a gtx = GoogleFriendUI.a.gtv;
  private Context mContext;

  private GoogleFriendUI$b(GoogleFriendUI paramGoogleFriendUI, Context paramContext, String paramString)
  {
    this.mContext = paramContext;
    this.gtl = paramString;
  }

  private static String A(InputStream paramInputStream)
  {
    AppMethodBeat.i(13660);
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    byte[] arrayOfByte = new byte[20480];
    while (true)
    {
      int i = paramInputStream.read(arrayOfByte, 0, 20480);
      if (i == -1)
        break;
      localByteArrayOutputStream.write(arrayOfByte, 0, i);
    }
    paramInputStream = new String(localByteArrayOutputStream.toByteArray(), "UTF-8");
    AppMethodBeat.o(13660);
    return paramInputStream;
  }

  private Void aoY()
  {
    AppMethodBeat.i(13659);
    ab.i("MicroMsg.GoogleContact.GoogleAPIAsyncTask", "doInBackground");
    int i = 0;
    int j = 1;
    while (true)
      try
      {
        ab.i("MicroMsg.GoogleContact.GoogleAPIAsyncTask", "startInde:%d, totalCount:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
        Object localObject1 = this.gtl;
        URL localURL = new java/net/URL;
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("https://www.google.com/m8/feeds/contacts/default/property-email?alt=");
        localURL.<init>("json" + "&max-results=100&start-index=" + j + "&access_token=" + (String)localObject1);
        ab.i("MicroMsg.GoogleContact.GoogleAPIAsyncTask", "requestURL:%s", new Object[] { localURL.toString() });
        localObject2 = (HttpURLConnection)localURL.openConnection();
        ((HttpURLConnection)localObject2).setRequestMethod("GET");
        ((HttpURLConnection)localObject2).setConnectTimeout(20000);
        i = ((HttpURLConnection)localObject2).getResponseCode();
        ab.i("MicroMsg.GoogleContact.GoogleAPIAsyncTask", "responseCode:%d", new Object[] { Integer.valueOf(i) });
        if (i == 200)
        {
          localObject1 = ((HttpURLConnection)localObject2).getInputStream();
          localObject2 = A((InputStream)localObject1);
          ((InputStream)localObject1).close();
          localObject1 = new org/json/JSONObject;
          ((JSONObject)localObject1).<init>((String)localObject2);
          k = ((JSONObject)localObject1).getJSONObject("feed").getJSONObject("openSearch$totalResults").getInt("$t");
          if (k > 0)
            vP((String)localObject2);
          if (k - j > 100)
          {
            j += 100;
            i = 1;
            if ((i != 0) && (!GoogleFriendUI.g(this.gtp)))
              continue;
            this.gtx = GoogleFriendUI.a.gts;
            AppMethodBeat.o(13659);
            return null;
          }
        }
        else
        {
          if (i == 401)
          {
            ab.e("MicroMsg.GoogleContact.GoogleAPIAsyncTask", "Server OAuth Error,Please Try Again.");
            ((HttpURLConnection)localObject2).disconnect();
            localObject2 = null;
            continue;
          }
          ab.e("MicroMsg.GoogleContact.GoogleAPIAsyncTask", "Unknow Error.");
          continue;
        }
      }
      catch (IOException localIOException)
      {
        this.gtx = GoogleFriendUI.a.gtu;
        ab.e("MicroMsg.GoogleContact.GoogleAPIAsyncTask", "IOException" + localIOException.getMessage());
        continue;
        i = 0;
      }
      catch (JSONException localJSONException)
      {
        int k;
        this.gtx = GoogleFriendUI.a.gtv;
        ab.e("MicroMsg.GoogleContact.GoogleAPIAsyncTask", "JSONException" + localJSONException.getMessage());
        continue;
        i = k;
      }
  }

  private void vP(String paramString)
  {
    AppMethodBeat.i(13661);
    JSONArray localJSONArray1 = new JSONObject(paramString).getJSONObject("feed").getJSONArray("entry");
    int i;
    Object localObject2;
    JSONArray localJSONArray2;
    Object localObject3;
    int j;
    if (localJSONArray1 != null)
    {
      i = 0;
      if (i < localJSONArray1.length())
      {
        paramString = "";
        localObject1 = localJSONArray1.getJSONObject(i).optJSONObject("id");
        localObject2 = localJSONArray1.getJSONObject(i).optJSONObject("title");
        localJSONArray2 = localJSONArray1.getJSONObject(i).optJSONArray("gd$email");
        localObject3 = localJSONArray1.getJSONObject(i).optJSONArray("link");
        if (localObject1 == null)
          break label445;
        localObject1 = ((JSONObject)localObject1).getString("$t");
        j = ((String)localObject1).lastIndexOf("/");
        if (j <= 0)
          break label445;
      }
    }
    label445: for (Object localObject1 = ((String)localObject1).substring(j + 1); ; localObject1 = "")
    {
      if (localObject2 != null);
      for (localObject2 = ((JSONObject)localObject2).getString("$t"); ; localObject2 = "")
      {
        String str1 = paramString;
        if (localObject3 != null)
        {
          j = 0;
          while (true)
          {
            str1 = paramString;
            if (j >= ((JSONArray)localObject3).length())
              break;
            String str2 = ((JSONArray)localObject3).getJSONObject(j).getString("rel");
            int k = str2.lastIndexOf("#");
            str1 = paramString;
            if (k > 0)
            {
              str2 = str2.substring(k + 1);
              str1 = paramString;
              if (!TextUtils.isEmpty(str2))
              {
                str1 = paramString;
                if ("photo".equals(str2))
                  str1 = ((JSONArray)localObject3).getJSONObject(j).getString("href");
              }
            }
            j++;
            paramString = str1;
          }
        }
        if (localJSONArray2 != null)
          for (j = 0; j < localJSONArray2.length(); j++)
          {
            localObject3 = localJSONArray2.getJSONObject(j).getString("address");
            if ((!TextUtils.isEmpty((CharSequence)localObject3)) && (bo.amW((String)localObject3)) && (!((String)localObject3).equals(GoogleFriendUI.h(this.gtp))))
            {
              paramString = new n();
              paramString.field_googleid = ((String)localObject1);
              paramString.field_googleitemid = ((String)localObject1 + (String)localObject3);
              paramString.field_googlename = ((String)localObject2);
              paramString.field_googlephotourl = str1;
              paramString.field_googlegmail = ((String)localObject3);
              if (!GoogleFriendUI.f(this.gtp).containsKey(localObject3))
              {
                GoogleFriendUI.e(this.gtp).add(paramString);
                GoogleFriendUI.f(this.gtp).put(localObject3, paramString);
              }
            }
          }
        i++;
        break;
        AppMethodBeat.o(13661);
        return;
      }
    }
  }

  protected final void onPreExecute()
  {
    AppMethodBeat.i(13658);
    super.onPreExecute();
    ab.i("MicroMsg.GoogleContact.GoogleAPIAsyncTask", "onPreExecute");
    GoogleFriendUI.e(this.gtp).clear();
    GoogleFriendUI.f(this.gtp).clear();
    AppMethodBeat.o(13658);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.GoogleFriendUI.b
 * JD-Core Version:    0.6.2
 */