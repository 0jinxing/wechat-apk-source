package com.tencent.youtu.ytcommon.auth;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpUtil
{
  private static final String CHARSET_UTF8 = "UTF-8";
  private static final int DEFAULT_TIMEOUT_MILLIS = 10000;

  private static HttpURLConnection buildConnection(String paramString, int paramInt)
  {
    AppMethodBeat.i(118055);
    paramString = (HttpURLConnection)new URL(paramString).openConnection();
    paramString.setConnectTimeout(paramInt);
    paramString.setReadTimeout(paramInt);
    AppMethodBeat.o(118055);
    return paramString;
  }

  private static String getResponse(HttpURLConnection paramHttpURLConnection, HttpUtil.HttpResponseListener paramHttpResponseListener)
  {
    StringBuilder localStringBuilder = null;
    AppMethodBeat.i(118056);
    int i;
    InputStream localInputStream;
    try
    {
      i = paramHttpURLConnection.getResponseCode();
      if (i == 200)
      {
        localInputStream = paramHttpURLConnection.getInputStream();
        localStringBuilder = new StringBuilder();
        paramHttpURLConnection = new byte[1024];
        while (true)
        {
          i = localInputStream.read(paramHttpURLConnection);
          if (i == -1)
            break;
          localStringBuilder.append(new String(paramHttpURLConnection, 0, i));
        }
      }
    }
    catch (Exception paramHttpURLConnection)
    {
      AppMethodBeat.o(118056);
      paramHttpURLConnection = localStringBuilder;
    }
    while (true)
    {
      return paramHttpURLConnection;
      localInputStream.close();
      paramHttpURLConnection = localStringBuilder.toString();
      if (paramHttpResponseListener != null)
        paramHttpResponseListener.onSuccess(paramHttpURLConnection);
      AppMethodBeat.o(118056);
      continue;
      if (paramHttpResponseListener != null)
        paramHttpResponseListener.onFail(i);
      AppMethodBeat.o(118056);
      paramHttpURLConnection = localStringBuilder;
    }
  }

  public static String post(String paramString1, String paramString2, HttpUtil.HttpResponseListener paramHttpResponseListener)
  {
    AppMethodBeat.i(118054);
    HttpURLConnection localHttpURLConnection = buildConnection(paramString1, 10000);
    localHttpURLConnection.setRequestProperty("Content-Type", "application/json");
    localHttpURLConnection.setRequestMethod("POST");
    if (!TextUtils.isEmpty(paramString2))
    {
      paramString1 = localHttpURLConnection.getOutputStream();
      BufferedWriter localBufferedWriter = new BufferedWriter(new OutputStreamWriter(paramString1, "UTF-8"));
      localBufferedWriter.write(paramString2);
      localBufferedWriter.flush();
      localBufferedWriter.close();
      paramString1.close();
    }
    paramString1 = getResponse(localHttpURLConnection, paramHttpResponseListener);
    AppMethodBeat.o(118054);
    return paramString1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.youtu.ytcommon.auth.HttpUtil
 * JD-Core Version:    0.6.2
 */