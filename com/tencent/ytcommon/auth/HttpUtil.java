package com.tencent.ytcommon.auth;

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
    AppMethodBeat.i(17);
    paramString = (HttpURLConnection)new URL(paramString).openConnection();
    paramString.setConnectTimeout(paramInt);
    paramString.setReadTimeout(paramInt);
    AppMethodBeat.o(17);
    return paramString;
  }

  private static String getResponse(HttpURLConnection paramHttpURLConnection, HttpUtil.HttpResponseListener paramHttpResponseListener)
  {
    byte[] arrayOfByte = null;
    AppMethodBeat.i(18);
    int i;
    InputStream localInputStream;
    try
    {
      i = paramHttpURLConnection.getResponseCode();
      if (i == 200)
      {
        localInputStream = paramHttpURLConnection.getInputStream();
        paramHttpURLConnection = new StringBuilder();
        arrayOfByte = new byte[1024];
        while (true)
        {
          i = localInputStream.read(arrayOfByte);
          if (i == -1)
            break;
          paramHttpURLConnection.append(new String(arrayOfByte, 0, i));
        }
      }
    }
    catch (Exception paramHttpURLConnection)
    {
      AppMethodBeat.o(18);
      paramHttpURLConnection = arrayOfByte;
    }
    while (true)
    {
      return paramHttpURLConnection;
      localInputStream.close();
      paramHttpURLConnection = paramHttpURLConnection.toString();
      if (paramHttpResponseListener != null)
        paramHttpResponseListener.onSuccess(paramHttpURLConnection);
      AppMethodBeat.o(18);
      continue;
      if (paramHttpResponseListener != null)
        paramHttpResponseListener.onFail(i);
      AppMethodBeat.o(18);
      paramHttpURLConnection = arrayOfByte;
    }
  }

  public static String post(String paramString1, String paramString2, HttpUtil.HttpResponseListener paramHttpResponseListener)
  {
    AppMethodBeat.i(16);
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
    AppMethodBeat.o(16);
    return paramString1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.ytcommon.auth.HttpUtil
 * JD-Core Version:    0.6.2
 */