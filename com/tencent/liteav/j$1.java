package com.tencent.liteav;

import android.os.Handler;
import android.os.Looper;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;

class j$1
  implements Runnable
{
  j$1(j paramj, int paramInt, String paramString1, String paramString2, j.a parama)
  {
  }

  public void run()
  {
    AppMethodBeat.i(67448);
    j.a(this.e, 0L);
    j.b(this.e, 0L);
    j.c(this.e, 0L);
    j.a(this.e, "");
    j.b(this.e, "");
    if (this.a > 0)
      j.b(this.e, String.valueOf(this.a));
    j.c(this.e, this.b);
    j.a(this.e, TXCCommonUtil.getStreamIDByStreamUrl(this.c));
    Object localObject1 = String.format("http://%s/%s/%s/timeshift.m3u8?delay=0&appid=%s&txKbps=0", new Object[] { j.a(this.e), j.b(this.e), j.c(this.e), j.d(this.e) });
    try
    {
      Object localObject2 = new java/net/URL;
      ((URL)localObject2).<init>((String)localObject1);
      localObject2 = (HttpURLConnection)((URL)localObject2).openConnection();
      ((HttpURLConnection)localObject2).setDoOutput(true);
      ((HttpURLConnection)localObject2).setDoInput(true);
      ((HttpURLConnection)localObject2).setUseCaches(false);
      ((HttpURLConnection)localObject2).setConnectTimeout(5000);
      ((HttpURLConnection)localObject2).setReadTimeout(5000);
      ((HttpURLConnection)localObject2).setRequestMethod("GET");
      ((HttpURLConnection)localObject2).setRequestProperty("Charsert", "UTF-8");
      ((HttpURLConnection)localObject2).setRequestProperty("Content-Type", "text/plain;");
      localObject1 = new java/io/BufferedReader;
      Object localObject3 = new java/io/InputStreamReader;
      ((InputStreamReader)localObject3).<init>(((HttpURLConnection)localObject2).getInputStream());
      ((BufferedReader)localObject1).<init>((Reader)localObject3);
      StringBuilder localStringBuilder;
      for (localObject2 = ""; ; localObject2 = (String)localObject2 + (String)localObject3)
      {
        localObject3 = ((BufferedReader)localObject1).readLine();
        if (localObject3 == null)
          break;
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
      }
      TXCLog.e("TXCTimeShiftUtil", "prepareSeekTime: receive response, strResponse = ".concat(String.valueOf(localObject2)));
      localObject2 = j.d(this.e, (String)localObject2);
      long l1 = Long.parseLong((String)localObject2);
      long l2 = System.currentTimeMillis();
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>("time:");
      TXCLog.i("TXCTimeShiftUtil", (String)localObject2 + ",currentTime:" + l2 + ",diff:" + (l2 - l1));
      j.b(this.e, l1 * 1000L);
      j.c(this.e, l2 - j.e(this.e));
      if (this.d != null)
      {
        localObject1 = new android/os/Handler;
        ((Handler)localObject1).<init>(Looper.getMainLooper());
        localObject2 = new com/tencent/liteav/j$1$1;
        ((j.1.1)localObject2).<init>(this);
        ((Handler)localObject1).post((Runnable)localObject2);
      }
      AppMethodBeat.o(67448);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        j.b(this.e, 0L);
        AppMethodBeat.o(67448);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.j.1
 * JD-Core Version:    0.6.2
 */