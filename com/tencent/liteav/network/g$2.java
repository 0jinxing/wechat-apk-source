package com.tencent.liteav.network;

import android.os.Handler;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.URL;
import java.util.Iterator;
import java.util.Vector;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

class g$2 extends Thread
{
  g$2(g paramg, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt, g.a parama)
  {
    super(paramString1);
  }

  public void run()
  {
    AppMethodBeat.i(67595);
    int i = -1;
    Object localObject1 = "";
    if ((this.a != null) && (!this.a.isEmpty()));
    for (int j = Integer.valueOf(this.a).intValue(); ; j = 0)
    {
      int k = 5;
      if (!g.a(this.g, true, this.a, this.b, this.c))
      {
        m = (int)g.a(this.g);
        k = m;
        if (m > 0);
      }
      for (int m = 1; ; m = k)
      {
        Object localObject3;
        int n;
        if (m > 0)
        {
          localObject3 = localObject1;
          n = i;
        }
        while (true)
        {
          label1024: Object localObject2;
          while (true)
          {
            Object localObject4;
            Object localObject5;
            Object localObject6;
            try
            {
              localObject4 = new org/json/JSONObject;
              localObject3 = localObject1;
              n = i;
              ((JSONObject)localObject4).<init>();
              localObject3 = localObject1;
              n = i;
              ((JSONObject)localObject4).put("bizid", j);
              localObject3 = localObject1;
              n = i;
              ((JSONObject)localObject4).put("stream_id", this.d);
              localObject3 = localObject1;
              n = i;
              ((JSONObject)localObject4).put("txSecret", this.c);
              localObject3 = localObject1;
              n = i;
              ((JSONObject)localObject4).put("txTime", this.b);
              localObject3 = localObject1;
              n = i;
              ((JSONObject)localObject4).put("type", 1);
              localObject3 = localObject1;
              n = i;
              localObject5 = ((JSONObject)localObject4).toString();
              localObject3 = localObject1;
              n = i;
              localObject4 = new java/net/URL;
              localObject3 = localObject1;
              n = i;
              ((URL)localObject4).<init>("https://livepull.myqcloud.com/getpulladdr");
              localObject3 = localObject1;
              n = i;
              localObject4 = (HttpsURLConnection)((URL)localObject4).openConnection();
              localObject3 = localObject1;
              n = i;
              ((HttpsURLConnection)localObject4).setDoOutput(true);
              localObject3 = localObject1;
              n = i;
              ((HttpsURLConnection)localObject4).setDoInput(true);
              localObject3 = localObject1;
              n = i;
              ((HttpsURLConnection)localObject4).setUseCaches(false);
              localObject3 = localObject1;
              n = i;
              ((HttpsURLConnection)localObject4).setConnectTimeout(5000);
              localObject3 = localObject1;
              n = i;
              ((HttpsURLConnection)localObject4).setReadTimeout(5000);
              localObject3 = localObject1;
              n = i;
              ((HttpsURLConnection)localObject4).setRequestMethod("POST");
              localObject3 = localObject1;
              n = i;
              ((HttpsURLConnection)localObject4).setRequestProperty("Charsert", "UTF-8");
              localObject3 = localObject1;
              n = i;
              ((HttpsURLConnection)localObject4).setRequestProperty("Content-Type", "text/plain;");
              localObject3 = localObject1;
              n = i;
              ((HttpsURLConnection)localObject4).setRequestProperty("Content-Length", String.valueOf(((String)localObject5).length()));
              localObject3 = localObject1;
              n = i;
              localObject6 = new java/lang/StringBuilder;
              localObject3 = localObject1;
              n = i;
              ((StringBuilder)localObject6).<init>("getAccelerateStreamPlayUrl: sendHttpRequest[ ");
              localObject3 = localObject1;
              n = i;
              TXCLog.e("TXRTMPAccUrlFetcher", (String)localObject5 + "] retryIndex = " + m);
              localObject3 = localObject1;
              n = i;
              localObject6 = new java/io/DataOutputStream;
              localObject3 = localObject1;
              n = i;
              ((DataOutputStream)localObject6).<init>(((HttpsURLConnection)localObject4).getOutputStream());
              localObject3 = localObject1;
              n = i;
              ((OutputStream)localObject6).write(((String)localObject5).getBytes());
              localObject3 = localObject1;
              n = i;
              localObject5 = new java/io/BufferedReader;
              localObject3 = localObject1;
              n = i;
              localObject6 = new java/io/InputStreamReader;
              localObject3 = localObject1;
              n = i;
              ((InputStreamReader)localObject6).<init>(((HttpsURLConnection)localObject4).getInputStream());
              localObject3 = localObject1;
              n = i;
              ((BufferedReader)localObject5).<init>((Reader)localObject6);
              localObject4 = "";
              localObject3 = localObject1;
              n = i;
              Object localObject7 = ((BufferedReader)localObject5).readLine();
              if (localObject7 != null)
              {
                localObject3 = localObject1;
                n = i;
                localObject6 = new java/lang/StringBuilder;
                localObject3 = localObject1;
                n = i;
                ((StringBuilder)localObject6).<init>();
                localObject3 = localObject1;
                n = i;
                localObject4 = (String)localObject4 + (String)localObject7;
                continue;
              }
              localObject3 = localObject1;
              n = i;
              TXCLog.e("TXRTMPAccUrlFetcher", "getAccelerateStreamPlayUrl: receive response, strResponse = ".concat(String.valueOf(localObject4)));
              localObject3 = localObject1;
              n = i;
              localObject5 = new org/json/JSONTokener;
              localObject3 = localObject1;
              n = i;
              ((JSONTokener)localObject5).<init>((String)localObject4);
              localObject3 = localObject1;
              n = i;
              localObject7 = (JSONObject)((JSONTokener)localObject5).nextValue();
              k = i;
              localObject3 = localObject1;
              n = i;
              if (((JSONObject)localObject7).has("code"))
              {
                localObject3 = localObject1;
                n = i;
                k = ((JSONObject)localObject7).getInt("code");
              }
              localObject4 = localObject1;
              if (k != 0)
              {
                localObject4 = localObject1;
                localObject3 = localObject1;
                n = k;
                if (((JSONObject)localObject7).has("message"))
                {
                  localObject3 = localObject1;
                  n = k;
                  localObject4 = ((JSONObject)localObject7).getString("message");
                }
                localObject3 = localObject4;
                n = k;
                localObject1 = new java/lang/StringBuilder;
                localObject3 = localObject4;
                n = k;
                ((StringBuilder)localObject1).<init>("getAccelerateStreamPlayUrl: errorCode = ");
                localObject3 = localObject4;
                n = k;
                TXCLog.e("TXRTMPAccUrlFetcher", k + " errorMessage = " + (String)localObject4);
              }
              localObject3 = localObject4;
              n = k;
              localObject1 = localObject4;
              i = k;
              if (((JSONObject)localObject7).has("pull_addr"))
              {
                localObject3 = localObject4;
                n = k;
                localObject5 = new java/util/Vector;
                localObject3 = localObject4;
                n = k;
                ((Vector)localObject5).<init>();
                localObject3 = localObject4;
                n = k;
                localObject6 = new java/util/Vector;
                localObject3 = localObject4;
                n = k;
                ((Vector)localObject6).<init>();
                localObject3 = localObject4;
                n = k;
                localObject1 = ((JSONObject)localObject7).getJSONArray("pull_addr");
                if (localObject1 != null)
                {
                  localObject3 = localObject4;
                  n = k;
                  if (((JSONArray)localObject1).length() != 0);
                }
                else
                {
                  localObject3 = localObject4;
                  n = k;
                  TXCLog.e("TXRTMPAccUrlFetcher", "getAccelerateStreamPlayUrl: no pull_addr");
                  localObject3 = localObject4;
                  n = k;
                  if (this.e != 1)
                    break label1350;
                  localObject3 = localObject4;
                  n = k;
                  localObject1 = localObject4;
                  i = k;
                  if (((Vector)localObject6).size() <= 0)
                    break label1337;
                  localObject3 = localObject4;
                  n = k;
                  localObject1 = g.b(this.g);
                  localObject3 = localObject4;
                  n = k;
                  localObject5 = new com/tencent/liteav/network/g$2$1;
                  localObject3 = localObject4;
                  n = k;
                  ((g.2.1)localObject5).<init>(this, (Vector)localObject6);
                  localObject3 = localObject4;
                  n = k;
                  ((Handler)localObject1).post((Runnable)localObject5);
                  AppMethodBeat.o(67595);
                  return;
                }
                i = 0;
                localObject3 = localObject4;
                n = k;
                if (i >= ((JSONArray)localObject1).length())
                  continue;
                localObject3 = localObject4;
                n = k;
                Object localObject8 = (JSONObject)((JSONArray)localObject1).get(i);
                if (localObject8 != null)
                {
                  localObject3 = localObject4;
                  n = k;
                  localObject7 = ((JSONObject)localObject8).getString("rtmp_url");
                  localObject3 = localObject4;
                  n = k;
                  if (((JSONObject)localObject8).getInt("proto") != 1)
                    continue;
                  bool = true;
                  localObject3 = localObject4;
                  n = k;
                  localObject8 = new java/lang/StringBuilder;
                  localObject3 = localObject4;
                  n = k;
                  ((StringBuilder)localObject8).<init>("getAccelerateStreamPlayUrl: streamUrl = ");
                  localObject3 = localObject4;
                  n = k;
                  TXCLog.e("TXRTMPAccUrlFetcher", (String)localObject7 + " Q channel = " + bool);
                  localObject3 = localObject4;
                  n = k;
                  localObject8 = TXCCommonUtil.getStreamIDByStreamUrl((String)localObject7);
                  if (localObject8 != null)
                  {
                    localObject3 = localObject4;
                    n = k;
                    if (((String)localObject8).equalsIgnoreCase(this.d))
                    {
                      if (!bool)
                        continue;
                      localObject3 = localObject4;
                      n = k;
                      localObject8 = new com/tencent/liteav/network/e;
                      localObject3 = localObject4;
                      n = k;
                      ((e)localObject8).<init>((String)localObject7, bool);
                      localObject3 = localObject4;
                      n = k;
                      ((Vector)localObject5).add(localObject8);
                    }
                  }
                }
                i++;
                continue;
                boolean bool = false;
                continue;
                localObject3 = localObject4;
                n = k;
                localObject8 = new com/tencent/liteav/network/e;
                localObject3 = localObject4;
                n = k;
                ((e)localObject8).<init>((String)localObject7, bool);
                localObject3 = localObject4;
                n = k;
                ((Vector)localObject6).add(localObject8);
                continue;
              }
            }
            catch (Exception localException1)
            {
              TXCLog.e("TXRTMPAccUrlFetcher", "getAccelerateStreamPlayUrl exception");
              localObject2 = localObject3;
              i = n;
            }
            try
            {
              label1337: label1350: 
              do
              {
                do
                {
                  sleep(1000L, 0);
                  m--;
                  break;
                  localObject3 = localObject4;
                  n = k;
                  if (this.e != 2)
                    break label1456;
                  localObject3 = localObject4;
                  n = k;
                  localObject2 = localObject4;
                  i = k;
                }
                while (((Vector)localObject5).size() <= 0);
                localObject3 = localObject4;
                n = k;
                localObject2 = g.b(this.g);
                localObject3 = localObject4;
                n = k;
                localObject6 = new com/tencent/liteav/network/g$2$2;
                localObject3 = localObject4;
                n = k;
                ((2)localObject6).<init>(this, (Vector)localObject5);
                localObject3 = localObject4;
                n = k;
                ((Handler)localObject2).post((Runnable)localObject6);
                AppMethodBeat.o(67595);
                break label1024;
                localObject3 = localObject4;
                n = k;
                localObject2 = ((Vector)localObject6).iterator();
                while (true)
                {
                  localObject3 = localObject4;
                  n = k;
                  if (!((Iterator)localObject2).hasNext())
                    break;
                  localObject3 = localObject4;
                  n = k;
                  ((Vector)localObject5).add((e)((Iterator)localObject2).next());
                }
                localObject3 = localObject4;
                n = k;
                localObject2 = localObject4;
                i = k;
              }
              while (((Vector)localObject5).size() <= 0);
              label1456: localObject3 = localObject4;
              n = k;
              localObject2 = g.b(this.g);
              localObject3 = localObject4;
              n = k;
              localObject6 = new com/tencent/liteav/network/g$2$3;
              localObject3 = localObject4;
              n = k;
              ((g.2.3)localObject6).<init>(this, (Vector)localObject5);
              localObject3 = localObject4;
              n = k;
              ((Handler)localObject2).post((Runnable)localObject6);
              AppMethodBeat.o(67595);
            }
            catch (Exception localException2)
            {
              while (true)
                TXCLog.e("TXRTMPAccUrlFetcher", "getAccelerateStreamPlayUrl exception sleep");
            }
          }
          g.b(this.g).post(new g.2.4(this, i, (String)localObject2));
          AppMethodBeat.o(67595);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.network.g.2
 * JD-Core Version:    0.6.2
 */