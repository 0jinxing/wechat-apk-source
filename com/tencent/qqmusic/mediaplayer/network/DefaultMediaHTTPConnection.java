package com.tencent.qqmusic.mediaplayer.network;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.URL;
import java.net.UnknownServiceException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DefaultMediaHTTPConnection
  implements IMediaHTTPConnection
{
  private static final int CONNECT_TIMEOUT_MS = 30000;
  private static final int HTTP_TEMP_REDIRECT = 307;
  private static final int MAX_REDIRECTS = 20;
  private static final String TAG = "MediaHTTPConnection";
  private static final boolean VERBOSE = false;
  private boolean mAllowCrossDomainRedirect = true;
  private boolean mAllowCrossProtocolRedirect = true;
  private HttpURLConnection mConnection = null;
  private long mCurrentOffset = -1L;
  private Map<String, String> mHeaders = null;
  private InputStream mInputStream = null;
  private long mTotalSize = -1L;
  private URL mURL = null;

  private boolean filterOutInternalHeaders(String paramString1, String paramString2)
  {
    AppMethodBeat.i(104790);
    boolean bool;
    if ("android-allow-cross-domain-redirect".equalsIgnoreCase(paramString1))
    {
      this.mAllowCrossDomainRedirect = parseBoolean(paramString2);
      this.mAllowCrossProtocolRedirect = this.mAllowCrossDomainRedirect;
      bool = true;
      AppMethodBeat.o(104790);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(104790);
    }
  }

  private static final boolean isLocalHost(URL paramURL)
  {
    boolean bool1 = false;
    AppMethodBeat.i(104793);
    if (paramURL == null)
      AppMethodBeat.o(104793);
    while (true)
    {
      return bool1;
      paramURL = paramURL.getHost();
      if (paramURL == null)
        AppMethodBeat.o(104793);
      else
        try
        {
          boolean bool2 = paramURL.equalsIgnoreCase("localhost");
          if (bool2)
          {
            bool1 = true;
            AppMethodBeat.o(104793);
          }
        }
        catch (IllegalArgumentException paramURL)
        {
          Logger.e("MediaHTTPConnection", "isLocalHost", paramURL);
          AppMethodBeat.o(104793);
        }
    }
  }

  private boolean parseBoolean(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(104789);
    try
    {
      if (Long.parseLong(paramString) != 0L)
        AppMethodBeat.o(104789);
      while (true)
      {
        return bool;
        AppMethodBeat.o(104789);
        bool = false;
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      while (true)
        if (("true".equalsIgnoreCase(paramString)) || ("yes".equalsIgnoreCase(paramString)))
        {
          AppMethodBeat.o(104789);
        }
        else
        {
          AppMethodBeat.o(104789);
          bool = false;
        }
    }
  }

  private void seekTo(long paramLong)
  {
    AppMethodBeat.i(104794);
    teardownConnection();
    label684: label875: 
    while (true)
    {
      int i;
      int j;
      int k;
      try
      {
        Object localObject1 = this.mURL;
        boolean bool1 = isLocalHost((URL)localObject1);
        i = 0;
        if (bool1)
        {
          this.mConnection = ((HttpURLConnection)((URL)localObject1).openConnection(Proxy.NO_PROXY));
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>("setConnectTimeout ");
          Logger.i("MediaHTTPConnection", this.mURL);
          this.mConnection.setConnectTimeout(30000);
          this.mConnection.setInstanceFollowRedirects(this.mAllowCrossDomainRedirect);
          j = 0;
          k = 0;
          if (this.mHeaders != null)
          {
            localObject1 = this.mHeaders.entrySet().iterator();
            j = k;
            if (((Iterator)localObject1).hasNext())
            {
              localObject4 = (Map.Entry)((Iterator)localObject1).next();
              this.mConnection.setRequestProperty((String)((Map.Entry)localObject4).getKey(), (String)((Map.Entry)localObject4).getValue());
              if ((k != 0) || (!"Accept-Encoding".equals(((Map.Entry)localObject4).getKey())))
                break label875;
              k = 1;
              continue;
            }
          }
        }
        else
        {
          this.mConnection = ((HttpURLConnection)((URL)localObject1).openConnection());
          continue;
        }
      }
      catch (IOException localIOException)
      {
        this.mTotalSize = -1L;
        this.mInputStream = null;
        this.mConnection = null;
        this.mCurrentOffset = -1L;
        Logger.e("MediaHTTPConnection", "seekTo", localIOException);
        AppMethodBeat.o(104794);
        throw localIOException;
      }
      Object localObject2;
      if (paramLong > 0L)
      {
        localObject2 = this.mConnection;
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>("bytes=");
        ((HttpURLConnection)localObject2).setRequestProperty("Range", paramLong + "-");
      }
      if (j == 0)
        this.mConnection.setRequestProperty("Accept-Encoding", "");
      try
      {
        k = this.mConnection.getResponseCode();
        if ((k != 300) && (k != 301) && (k != 302) && (k != 303) && (k != 307))
          break label684;
        i++;
        if (i > 20)
        {
          localObject2 = new java/net/NoRouteToHostException;
          ((NoRouteToHostException)localObject2).<init>("Too many redirects: ".concat(String.valueOf(i)));
          AppMethodBeat.o(104794);
          throw ((Throwable)localObject2);
        }
      }
      catch (Exception localException)
      {
        localObject4 = new java/io/IOException;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("An suspicious exception occurred: ");
        ((IOException)localObject4).<init>(localException.getMessage());
        AppMethodBeat.o(104794);
        throw ((Throwable)localObject4);
      }
      Object localObject3 = this.mConnection.getRequestMethod();
      if ((k == 307) && (!((String)localObject3).equals("GET")) && (!((String)localObject3).equals("HEAD")))
      {
        localObject3 = new java/net/NoRouteToHostException;
        ((NoRouteToHostException)localObject3).<init>("Invalid redirect");
        AppMethodBeat.o(104794);
        throw ((Throwable)localObject3);
      }
      Object localObject4 = this.mConnection.getHeaderField("Location");
      if (localObject4 == null)
      {
        localObject3 = new java/net/NoRouteToHostException;
        ((NoRouteToHostException)localObject3).<init>("Invalid redirect");
        AppMethodBeat.o(104794);
        throw ((Throwable)localObject3);
      }
      localObject3 = new java/net/URL;
      ((URL)localObject3).<init>(this.mURL, (String)localObject4);
      if ((!((URL)localObject3).getProtocol().equals("https")) && (!((URL)localObject3).getProtocol().equals("http")))
      {
        localObject3 = new java/net/NoRouteToHostException;
        ((NoRouteToHostException)localObject3).<init>("Unsupported protocol redirect");
        AppMethodBeat.o(104794);
        throw ((Throwable)localObject3);
      }
      boolean bool2 = this.mURL.getProtocol().equals(((URL)localObject3).getProtocol());
      if ((!this.mAllowCrossProtocolRedirect) && (!bool2))
      {
        localObject3 = new java/net/NoRouteToHostException;
        ((NoRouteToHostException)localObject3).<init>("Cross-protocol redirects are disallowed");
        AppMethodBeat.o(104794);
        throw ((Throwable)localObject3);
      }
      bool2 = this.mURL.getHost().equals(((URL)localObject3).getHost());
      if ((!this.mAllowCrossDomainRedirect) && (!bool2))
      {
        localObject3 = new java/net/NoRouteToHostException;
        ((NoRouteToHostException)localObject3).<init>("Cross-domain redirects are disallowed");
        AppMethodBeat.o(104794);
        throw ((Throwable)localObject3);
      }
      if (k != 307)
        this.mURL = ((URL)localObject3);
      continue;
      if (this.mAllowCrossDomainRedirect)
        this.mURL = this.mConnection.getURL();
      if (k == 206)
      {
        localObject3 = this.mConnection.getHeaderField("Content-Range");
        this.mTotalSize = -1L;
        if (localObject3 != null)
        {
          i = ((String)localObject3).lastIndexOf('/');
          if (i >= 0)
            localObject3 = ((String)localObject3).substring(i + 1);
        }
      }
      try
      {
        for (this.mTotalSize = Long.parseLong((String)localObject3); (paramLong > 0L) && (k != 206); this.mTotalSize = this.mConnection.getContentLength())
        {
          label762: localObject3 = new java/net/ProtocolException;
          ((ProtocolException)localObject3).<init>();
          AppMethodBeat.o(104794);
          throw ((Throwable)localObject3);
          if (k != 200)
          {
            localObject3 = new java/io/IOException;
            ((IOException)localObject3).<init>("failed! status code: ".concat(String.valueOf(k)));
            AppMethodBeat.o(104794);
            throw ((Throwable)localObject3);
          }
        }
        localObject3 = new java/io/BufferedInputStream;
        ((BufferedInputStream)localObject3).<init>(this.mConnection.getInputStream());
        this.mInputStream = ((InputStream)localObject3);
        this.mCurrentOffset = paramLong;
        AppMethodBeat.o(104794);
        return;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        break label762;
      }
    }
  }

  private void teardownConnection()
  {
    AppMethodBeat.i(104792);
    if (this.mConnection != null)
    {
      this.mInputStream = null;
      this.mConnection.disconnect();
      this.mConnection = null;
      this.mCurrentOffset = -1L;
    }
    AppMethodBeat.o(104792);
  }

  public boolean connect(URL paramURL, Map<String, String> paramMap)
  {
    AppMethodBeat.i(104788);
    disconnect();
    this.mAllowCrossDomainRedirect = true;
    this.mURL = paramURL;
    this.mHeaders = paramMap;
    AppMethodBeat.o(104788);
    return true;
  }

  public void disconnect()
  {
    AppMethodBeat.i(104791);
    teardownConnection();
    this.mHeaders = null;
    this.mURL = null;
    AppMethodBeat.o(104791);
  }

  public String getMIMEType()
  {
    AppMethodBeat.i(104797);
    if (this.mConnection == null);
    try
    {
      seekTo(0L);
      String str1 = this.mConnection.getContentType();
      AppMethodBeat.o(104797);
      return str1;
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        Logger.e("MediaHTTPConnection", "getMIMEType", localIOException);
        String str2 = "application/octet-stream";
        AppMethodBeat.o(104797);
      }
    }
  }

  public long getSize()
  {
    AppMethodBeat.i(104796);
    if (this.mConnection == null);
    try
    {
      seekTo(0L);
      l = this.mTotalSize;
      AppMethodBeat.o(104796);
      return l;
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        Logger.e("MediaHTTPConnection", "getSize", localIOException);
        long l = -1L;
        AppMethodBeat.o(104796);
      }
    }
  }

  public String getUri()
  {
    AppMethodBeat.i(104798);
    String str = this.mURL.toString();
    AppMethodBeat.o(104798);
    return str;
  }

  public int readAt(long paramLong, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(104795);
    try
    {
      if (paramLong != this.mCurrentOffset)
        seekTo(paramLong);
      int i = this.mInputStream.read(paramArrayOfByte, paramInt1, paramInt2);
      paramInt1 = i;
      if (i == -1)
        paramInt1 = 0;
      this.mCurrentOffset += paramInt1;
      AppMethodBeat.o(104795);
      return paramInt1;
    }
    catch (ProtocolException paramArrayOfByte)
    {
      while (true)
      {
        Logger.w("MediaHTTPConnection", "readAt " + paramLong + " / " + paramInt2 + " => " + paramArrayOfByte);
        AppMethodBeat.o(104795);
        paramInt1 = -1010;
      }
    }
    catch (NoRouteToHostException paramArrayOfByte)
    {
      while (true)
      {
        Logger.w("MediaHTTPConnection", "readAt " + paramLong + " / " + paramInt2 + " => " + paramArrayOfByte);
        AppMethodBeat.o(104795);
        paramInt1 = -1010;
      }
    }
    catch (UnknownServiceException paramArrayOfByte)
    {
      while (true)
      {
        Logger.w("MediaHTTPConnection", "readAt " + paramLong + " / " + paramInt2 + " => " + paramArrayOfByte);
        AppMethodBeat.o(104795);
        paramInt1 = -1010;
      }
    }
    catch (IOException paramArrayOfByte)
    {
      while (true)
      {
        paramInt1 = -2;
        AppMethodBeat.o(104795);
      }
    }
    catch (Exception paramArrayOfByte)
    {
      while (true)
      {
        paramInt1 = -3;
        AppMethodBeat.o(104795);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.network.DefaultMediaHTTPConnection
 * JD-Core Version:    0.6.2
 */