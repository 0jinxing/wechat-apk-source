package com.tencent.mm.plugin.music.g.a;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.music.cache.c;
import com.tencent.mm.plugin.music.cache.d;
import com.tencent.mm.plugin.music.cache.d.a;
import com.tencent.mm.plugin.music.cache.e;
import com.tencent.mm.plugin.music.cache.g;
import com.tencent.mm.plugin.music.f.c.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.qqmusic.mediaplayer.network.IMediaHTTPConnection;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.URL;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class a
  implements IMediaHTTPConnection
{
  private boolean mAllowCrossDomainRedirect;
  private boolean mAllowCrossProtocolRedirect;
  private HttpURLConnection mConnection;
  private long mCurrentOffset;
  private Map<String, String> mHeaders;
  private InputStream mInputStream;
  private String mMimeType;
  private long mTotalSize;
  private URL mURL;
  private com.tencent.mm.plugin.music.cache.a oNZ;
  public URL oOa;
  private byte[] oOb;

  public a()
  {
    AppMethodBeat.i(137675);
    this.mCurrentOffset = -1L;
    this.mURL = null;
    this.oOa = null;
    this.mHeaders = null;
    this.mConnection = null;
    this.mTotalSize = -1L;
    this.mMimeType = "";
    this.mInputStream = null;
    this.mAllowCrossDomainRedirect = true;
    this.mAllowCrossProtocolRedirect = true;
    this.oOb = new byte[1];
    AppMethodBeat.o(137675);
  }

  private static final boolean isLocalHost(URL paramURL)
  {
    boolean bool1 = false;
    AppMethodBeat.i(137679);
    if (paramURL == null)
      AppMethodBeat.o(137679);
    while (true)
    {
      return bool1;
      paramURL = paramURL.getHost();
      if (paramURL == null)
        AppMethodBeat.o(137679);
      else
        try
        {
          boolean bool2 = paramURL.equalsIgnoreCase("localhost");
          if (bool2)
          {
            AppMethodBeat.o(137679);
            bool1 = true;
          }
        }
        catch (IllegalArgumentException paramURL)
        {
          Logger.e("MicroMsg.Music.MMMediaHTTPConnection", "isLocalHost IllegalArgumentException:%s", new Object[] { String.valueOf(paramURL) });
          AppMethodBeat.o(137679);
        }
    }
  }

  private void seekTo(long paramLong)
  {
    AppMethodBeat.i(137680);
    teardownConnection();
    int i = 0;
    int j = i;
    try
    {
      Object localObject1 = this.mURL;
      j = i;
      boolean bool1 = isLocalHost((URL)localObject1);
      int k = 0;
      i = 0;
      if (bool1);
      try
      {
        for (this.mConnection = ((HttpURLConnection)((URL)localObject1).openConnection(Proxy.NO_PROXY)); ; this.mConnection = ((HttpURLConnection)((URL)localObject1).openConnection()))
        {
          this.mConnection.setConnectTimeout(30000);
          this.mConnection.setInstanceFollowRedirects(this.mAllowCrossDomainRedirect);
          m = 0;
          j = 0;
          if (this.mHeaders == null)
            break;
          localObject4 = this.mHeaders.entrySet().iterator();
          while (true)
          {
            m = j;
            if (!((Iterator)localObject4).hasNext())
              break;
            localObject1 = (Map.Entry)((Iterator)localObject4).next();
            this.mConnection.setRequestProperty((String)((Map.Entry)localObject1).getKey(), (String)((Map.Entry)localObject1).getValue());
            if ((j != 0) || (!"Accept-Encoding".equals(((Map.Entry)localObject1).getKey())))
              break label1190;
            j = 1;
          }
        }
      }
      catch (IOException localIOException1)
      {
        j = i;
        this.mTotalSize = -1L;
        this.mInputStream = null;
        this.mConnection = null;
        this.mCurrentOffset = -1L;
        Logger.e("MicroMsg.Music.MMMediaHTTPConnection", "seekTo exception:%s", new Object[] { localIOException1 + ", response:" + j });
        AppMethodBeat.o(137680);
        throw localIOException1;
      }
      Object localObject2;
      if (paramLong > 0L)
      {
        localObject2 = this.mConnection;
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>("bytes=");
        ((HttpURLConnection)localObject2).setRequestProperty("Range", paramLong + "-");
      }
      if (m == 0)
        this.mConnection.setRequestProperty("Accept-Encoding", "");
      m = this.mConnection.getResponseCode();
      g.cI(this.oOa.toString(), m);
      if ((m == 300) || (m == 301) || (m == 302) || (m == 303) || (m == 307))
      {
        k++;
        if (k > 20)
        {
          j = m;
          localObject2 = new java/net/NoRouteToHostException;
          j = m;
          ((NoRouteToHostException)localObject2).<init>("Too many redirects: ".concat(String.valueOf(k)));
          j = m;
          AppMethodBeat.o(137680);
          j = m;
          throw ((Throwable)localObject2);
        }
      }
    }
    catch (IOException localIOException2)
    {
      label1190: 
      while (true)
      {
        int m;
        continue;
        j = m;
        Object localObject3 = this.mConnection.getRequestMethod();
        if (m == 307)
        {
          j = m;
          if (!((String)localObject3).equals("GET"))
          {
            j = m;
            if (!((String)localObject3).equals("HEAD"))
            {
              j = m;
              localObject3 = new java/net/NoRouteToHostException;
              j = m;
              ((NoRouteToHostException)localObject3).<init>("Invalid redirect");
              j = m;
              AppMethodBeat.o(137680);
              j = m;
              throw ((Throwable)localObject3);
            }
          }
        }
        j = m;
        Object localObject4 = this.mConnection.getHeaderField("Location");
        if (localObject4 == null)
        {
          j = m;
          localObject3 = new java/net/NoRouteToHostException;
          j = m;
          ((NoRouteToHostException)localObject3).<init>("Invalid redirect");
          j = m;
          AppMethodBeat.o(137680);
          j = m;
          throw ((Throwable)localObject3);
        }
        j = m;
        localObject3 = new java/net/URL;
        j = m;
        ((URL)localObject3).<init>(this.mURL, (String)localObject4);
        j = m;
        if (!((URL)localObject3).getProtocol().equals("https"))
        {
          j = m;
          if (!((URL)localObject3).getProtocol().equals("http"))
          {
            j = m;
            localObject3 = new java/net/NoRouteToHostException;
            j = m;
            ((NoRouteToHostException)localObject3).<init>("Unsupported protocol redirect");
            j = m;
            AppMethodBeat.o(137680);
            j = m;
            throw ((Throwable)localObject3);
          }
        }
        j = m;
        boolean bool2 = this.mURL.getProtocol().equals(((URL)localObject3).getProtocol());
        j = m;
        if ((!this.mAllowCrossProtocolRedirect) && (!bool2))
        {
          j = m;
          localObject3 = new java/net/NoRouteToHostException;
          j = m;
          ((NoRouteToHostException)localObject3).<init>("Cross-protocol redirects are disallowed");
          j = m;
          AppMethodBeat.o(137680);
          j = m;
          throw ((Throwable)localObject3);
        }
        j = m;
        bool2 = this.mURL.getHost().equals(((URL)localObject3).getHost());
        j = m;
        if ((!this.mAllowCrossDomainRedirect) && (!bool2))
        {
          j = m;
          localObject3 = new java/net/NoRouteToHostException;
          j = m;
          ((NoRouteToHostException)localObject3).<init>("Cross-domain redirects are disallowed");
          j = m;
          AppMethodBeat.o(137680);
          j = m;
          throw ((Throwable)localObject3);
        }
        if (m != 307)
        {
          j = m;
          this.mURL = ((URL)localObject3);
        }
        i = m;
        continue;
        j = m;
        if (this.mAllowCrossDomainRedirect)
        {
          j = m;
          this.mURL = this.mConnection.getURL();
        }
        if (m == 206)
        {
          j = m;
          localObject3 = this.mConnection.getHeaderField("Content-Range");
          j = m;
          this.mTotalSize = -1L;
          if (localObject3 != null)
          {
            j = m;
            i = ((String)localObject3).lastIndexOf('/');
            if (i >= 0)
            {
              j = m;
              localObject3 = ((String)localObject3).substring(i + 1);
              j = m;
            }
          }
        }
        try
        {
          for (this.mTotalSize = bo.getLong((String)localObject3, 0L); ; this.mTotalSize = this.mConnection.getContentLength())
          {
            label974: j = m;
            if (TextUtils.isEmpty(this.mMimeType))
            {
              j = m;
              this.mMimeType = this.mConnection.getContentType();
              j = m;
              ab.i("MicroMsg.Music.MMMediaHTTPConnection", "mimeType:", new Object[] { this.mMimeType });
            }
            if ((paramLong <= 0L) || (m == 206))
              break;
            j = m;
            localObject3 = new java/net/ProtocolException;
            j = m;
            ((ProtocolException)localObject3).<init>();
            j = m;
            AppMethodBeat.o(137680);
            j = m;
            throw ((Throwable)localObject3);
            if (m != 200)
            {
              j = m;
              localObject3 = new java/io/IOException;
              j = m;
              ((IOException)localObject3).<init>();
              j = m;
              AppMethodBeat.o(137680);
              j = m;
              throw ((Throwable)localObject3);
            }
            j = m;
          }
          j = m;
          localObject3 = new java/io/BufferedInputStream;
          j = m;
          ((BufferedInputStream)localObject3).<init>(this.mConnection.getInputStream());
          j = m;
          this.mInputStream = ((InputStream)localObject3);
          j = m;
          this.mCurrentOffset = paramLong;
          AppMethodBeat.o(137680);
          return;
        }
        catch (NumberFormatException localNumberFormatException)
        {
          break label974;
        }
      }
    }
  }

  private void teardownConnection()
  {
    AppMethodBeat.i(137678);
    if (this.mConnection != null)
    {
      this.mInputStream = null;
      this.mConnection.disconnect();
      this.mConnection = null;
      this.mCurrentOffset = -1L;
    }
    AppMethodBeat.o(137678);
  }

  public final boolean connect(URL paramURL, Map<String, String> paramMap)
  {
    AppMethodBeat.i(137676);
    Logger.i("MicroMsg.Music.MMMediaHTTPConnection", "connect");
    Logger.i("MicroMsg.Music.MMMediaHTTPConnection", "connect: uri=" + paramURL + ", headers=" + paramMap);
    disconnect();
    this.mAllowCrossDomainRedirect = true;
    this.mURL = paramURL;
    this.oOa = paramURL;
    this.mHeaders = paramMap;
    this.mTotalSize = -1L;
    this.mMimeType = "";
    if (ah.bqo())
    {
      paramURL = this.mURL.toString();
      if (!e.bTG())
        break label560;
      paramURL = ((c)b.ar(c.class)).SP(paramURL);
    }
    while (true)
    {
      if ((!TextUtils.isEmpty(paramURL)) && (!paramURL.equalsIgnoreCase(this.mURL.toString())))
        ab.i("MicroMsg.Music.MMMediaHTTPConnection", "use temp shake music url to play:%s", new Object[] { paramURL });
      try
      {
        localObject1 = new java/net/URL;
        ((URL)localObject1).<init>(paramURL);
        this.mURL = ((URL)localObject1);
        if (this.mURL != null)
        {
          g.r(this.mURL.toString(), paramMap);
          Logger.i("MicroMsg.Music.MMMediaHTTPConnection", "headers=".concat(String.valueOf(paramMap)));
        }
        this.oNZ = new com.tencent.mm.plugin.music.cache.a(this);
        paramURL = this.oNZ;
        paramMap = paramURL.oKV.oOa.toString();
        paramURL.oKW = new d(paramMap);
        paramURL.oKW.gjQ = paramURL.oKV.getSize();
        localObject1 = paramURL.oKW;
        ab.i("MicroMsg.Music.IndexBitMgr", "initData");
        if (((d)localObject1).gjQ <= 0L)
        {
          ab.e("MicroMsg.Music.IndexBitMgr", "fileLength is invalid!");
          paramURL.oKX = new com.tencent.mm.plugin.music.cache.h(paramMap);
          if (new File(paramURL.oKX.fileName).exists())
            break label1092;
          ab.i("MicroMsg.Music.FileBytesCacheMgr", "piece file not exist, clear cache!");
          paramURL.oKW.clearCache();
          l = paramURL.oKV.getSize();
          localObject1 = paramURL.oKX;
          Logger.i("MicroMsg.Music.PieceFileCache", "open");
        }
      }
      catch (MalformedURLException paramURL)
      {
        try
        {
          while (true)
          {
            long l;
            Object localObject2 = new java/io/File;
            ((File)localObject2).<init>(((com.tencent.mm.plugin.music.cache.h)localObject1).fileName);
            if (!((File)localObject2).exists())
              ab.i("MicroMsg.Music.PieceFileCache", "create file:%b", new Object[] { Boolean.valueOf(((File)localObject2).createNewFile()) });
            RandomAccessFile localRandomAccessFile = new java/io/RandomAccessFile;
            localRandomAccessFile.<init>((File)localObject2, "rws");
            ((com.tencent.mm.plugin.music.cache.h)localObject1).randomAccessFile = localRandomAccessFile;
            Logger.e("MicroMsg.Music.PieceFileCache", "create RandomAccessFile file  %s  success", new Object[] { ((com.tencent.mm.plugin.music.cache.h)localObject1).fileName });
            paramURL.oKX.setLength(l);
            g.ah(paramMap, l);
            ab.i("MicroMsg.Music.FileBytesCacheMgr", "attach() fileLength is " + l + ",pieceFileCache length is " + paramURL.oKX.getLength());
            localObject1 = paramURL.oKV.getMIMEType();
            if ((!TextUtils.isEmpty((CharSequence)localObject1)) && (!"application/octet-stream".equalsIgnoreCase((String)localObject1)))
              g.fo(paramMap, (String)localObject1);
            paramURL.Lp = -1;
            paramURL.mSize = 0;
            paramURL.oKY = -1;
            paramURL.oKZ = 0;
            AppMethodBeat.o(137676);
            return true;
            label560: ab.e("MicroMsg.Music.MusicDataStorageImpl", "IMusicDataStorage service not exist");
            paramURL = null;
            break;
            paramURL = paramURL;
            ab.printErrStackTrace("MicroMsg.Music.MMMediaHTTPConnection", paramURL, "playUrl", new Object[0]);
            continue;
            if ((((d)localObject1).gjQ % 8192L == 0L) || (((d)localObject1).gjQ < 8192L));
            for (((d)localObject1).count = ((int)(((d)localObject1).gjQ / 8192L)); ; ((d)localObject1).count = ((int)(((d)localObject1).gjQ / 8192L) + 1))
            {
              if (((d)localObject1).gjQ <= 8192L)
              {
                ab.i("MicroMsg.Music.IndexBitMgr", "fileLength < PIECE_SIZE, count should be 1");
                ((d)localObject1).count = 1;
              }
              ab.i("MicroMsg.Music.IndexBitMgr", "fileLength:%d, count:%d", new Object[] { Long.valueOf(((d)localObject1).gjQ), Integer.valueOf(((d)localObject1).count) });
              ((d)localObject1).oLc = new BitSet(((d)localObject1).count);
              ((d)localObject1).cFI = g.SW(((d)localObject1).mUrl);
              if (!TextUtils.isEmpty(((d)localObject1).cFI))
                break label752;
              ab.e("MicroMsg.Music.IndexBitMgr", "initData musicId is null!'");
              break;
            }
            label752: ab.i("MicroMsg.Music.IndexBitMgr", "musicId:%s", new Object[] { ((d)localObject1).cFI });
            localObject2 = e.SQ(((d)localObject1).cFI);
            if (localObject2 == null)
            {
              ab.e("MicroMsg.Music.IndexBitMgr", "initData pMusic is null!'");
            }
            else
            {
              ab.i("MicroMsg.Music.IndexBitMgr", "initData music field_fileCacheComplete:%d", new Object[] { Integer.valueOf(((com.tencent.mm.aw.h)localObject2).fKw) });
              if ((((com.tencent.mm.aw.h)localObject2).fKv == null) || (((com.tencent.mm.aw.h)localObject2).fKv.length == 0))
              {
                ab.e("MicroMsg.Music.IndexBitMgr", "initData field_indexBitData is null!'");
              }
              else
              {
                ((d)localObject1).oLc = d.a.bb(((com.tencent.mm.aw.h)localObject2).fKv);
                if (((d)localObject1).oLc == null)
                {
                  ab.e("MicroMsg.Music.IndexBitMgr", "initData bitSet is null");
                  ((d)localObject1).oLc = new BitSet(((d)localObject1).count);
                }
                label1025: 
                do
                  while (true)
                  {
                    ab.i("MicroMsg.Music.IndexBitMgr", "initData bitSet:" + ((d)localObject1).oLc.toString());
                    ab.i("MicroMsg.Music.IndexBitMgr", "initData bitSet count %d, cardinality:" + ((d)localObject1).count + "," + ((d)localObject1).oLc.cardinality());
                    break;
                    if (((d)localObject1).count >= ((d)localObject1).oLc.cardinality())
                      break label1025;
                    ab.e("MicroMsg.Music.IndexBitMgr", "initData cont < bitSet.cardinality(), count:%d, cardinality:%d", new Object[] { Integer.valueOf(((d)localObject1).count), Integer.valueOf(((d)localObject1).oLc.cardinality()) });
                    ((d)localObject1).clearCache();
                  }
                while (((com.tencent.mm.aw.h)localObject2).fKy == 1);
                ab.i("MicroMsg.Music.IndexBitMgr", "remove dirty bit set from db, reset cache complete to 0");
                if (((d)localObject1).count > 1)
                {
                  ((d)localObject1).zA(((d)localObject1).count - 1);
                  ((d)localObject1).zA(((d)localObject1).count - 2);
                }
                while (true)
                {
                  ((d)localObject1).zx(0);
                  break;
                  ((d)localObject1).zA(((d)localObject1).count - 1);
                }
                label1092: if ((paramURL.oKX.bTH() != paramURL.oKV.getSize()) && (paramURL.oKV.getSize() != -1L))
                {
                  ab.i("MicroMsg.Music.FileBytesCacheMgr", "piece file length is not equals to real file length exist, clear cache!");
                  paramURL.oKW.clearCache();
                  localObject1 = paramURL.oKX;
                  Logger.i("MicroMsg.Music.PieceFileCache", "deleteFile");
                  com.tencent.mm.plugin.music.cache.h.HS(((com.tencent.mm.plugin.music.cache.h)localObject1).fileName);
                }
                else if (paramURL.oKV.getSize() == -1L)
                {
                  ab.i("MicroMsg.Music.FileBytesCacheMgr", "getFileLength is -1, network is disconnect!");
                }
                else
                {
                  ab.i("MicroMsg.Music.FileBytesCacheMgr", "piece file exist!");
                }
              }
            }
          }
        }
        catch (FileNotFoundException localFileNotFoundException)
        {
          while (true)
          {
            Logger.e("MicroMsg.Music.PieceFileCache", "file not found", localFileNotFoundException);
            Logger.e("MicroMsg.Music.PieceFileCache", "create RandomAccessFile file  %s  success", new Object[] { ((com.tencent.mm.plugin.music.cache.h)localObject1).fileName });
          }
        }
        catch (IOException localIOException)
        {
          while (true)
          {
            Logger.e("MicroMsg.Music.PieceFileCache", "io ", localIOException);
            Logger.e("MicroMsg.Music.PieceFileCache", "create RandomAccessFile file  %s  success", new Object[] { ((com.tencent.mm.plugin.music.cache.h)localObject1).fileName });
          }
        }
        finally
        {
          Object localObject1;
          Logger.e("MicroMsg.Music.PieceFileCache", "create RandomAccessFile file  %s  success", new Object[] { ((com.tencent.mm.plugin.music.cache.h)localObject1).fileName });
          AppMethodBeat.o(137676);
        }
      }
    }
    throw paramURL;
  }

  public final void disconnect()
  {
    AppMethodBeat.i(137677);
    Logger.i("MicroMsg.Music.MMMediaHTTPConnection", "disconnect");
    teardownConnection();
    this.mHeaders = null;
    this.mURL = null;
    if (this.oNZ != null)
    {
      com.tencent.mm.plugin.music.cache.a locala = this.oNZ;
      locala.bTx();
      locala.oKW.bTE();
      locala.oKX.close();
      locala.oKV = null;
      ab.i("MicroMsg.Music.FileBytesCacheMgr", "detach()");
      this.oNZ = null;
    }
    AppMethodBeat.o(137677);
  }

  public final String getMIMEType()
  {
    AppMethodBeat.i(137683);
    String str1;
    if (!TextUtils.isEmpty(this.mMimeType))
    {
      Logger.i("MicroMsg.Music.MMMediaHTTPConnection", "getMIMEType mimeType:" + this.mMimeType);
      str1 = this.mMimeType;
      AppMethodBeat.o(137683);
    }
    while (true)
    {
      return str1;
      str1 = g.SZ(this.oOa.toString());
      if (!TextUtils.isEmpty(str1))
      {
        this.mMimeType = str1;
        AppMethodBeat.o(137683);
      }
      else
      {
        if (this.mConnection == null);
        while (true)
        {
          try
          {
            l = System.currentTimeMillis();
            seekTo(0L);
            str1 = this.mConnection.getContentType();
            ab.d("MicroMsg.Music.MMMediaHTTPConnection", "getMIMEType cost time :%d!", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
            this.mMimeType = str1;
            if (TextUtils.isEmpty(str1))
              break label233;
            AppMethodBeat.o(137683);
          }
          catch (IOException localIOException)
          {
            Logger.e("MicroMsg.Music.MMMediaHTTPConnection", "getMIMEType exception:%s", new Object[] { String.valueOf(localIOException) });
            str2 = "";
            continue;
          }
          long l = System.currentTimeMillis();
          str2 = this.mConnection.getContentType();
          Logger.i("MicroMsg.Music.MMMediaHTTPConnection", "getMIMEType mimeType:".concat(String.valueOf(str2)));
          ab.d("MicroMsg.Music.MMMediaHTTPConnection", "getMIMEType cost time2 :%d!", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        }
        label233: String str2 = g.SY(this.oOa.toString());
        this.mMimeType = str2;
        if (!TextUtils.isEmpty(str2))
        {
          AppMethodBeat.o(137683);
        }
        else
        {
          str2 = "application/octet-stream";
          AppMethodBeat.o(137683);
        }
      }
    }
  }

  public final long getSize()
  {
    long l1 = -1L;
    AppMethodBeat.i(137682);
    if (this.mTotalSize > 0L)
    {
      l1 = this.mTotalSize;
      AppMethodBeat.o(137682);
    }
    while (true)
    {
      return l1;
      if (g.Ta(this.oOa.toString()) > 0L)
      {
        this.mTotalSize = g.Ta(this.oOa.toString());
        l1 = this.mTotalSize;
        AppMethodBeat.o(137682);
      }
      else
      {
        if (this.mConnection == null);
        try
        {
          long l2 = System.currentTimeMillis();
          seekTo(0L);
          ab.d("MicroMsg.Music.MMMediaHTTPConnection", "getSize cost time :%d!", new Object[] { Long.valueOf(System.currentTimeMillis() - l2) });
          if (this.mTotalSize > 0L)
          {
            l1 = this.mTotalSize;
            AppMethodBeat.o(137682);
          }
        }
        catch (IOException localIOException)
        {
          while (true)
          {
            Logger.e("MicroMsg.Music.MMMediaHTTPConnection", "getSize exception:%s", new Object[] { String.valueOf(localIOException) });
            this.mTotalSize = -1L;
          }
          if (g.ek(this.oOa.toString()) > 0L)
          {
            this.mTotalSize = g.ek(this.oOa.toString());
            l1 = this.mTotalSize;
            AppMethodBeat.o(137682);
          }
          else
          {
            AppMethodBeat.o(137682);
          }
        }
      }
    }
  }

  public final String getUri()
  {
    AppMethodBeat.i(137684);
    String str = this.mURL.toString();
    AppMethodBeat.o(137684);
    return str;
  }

  public final int readAt(long paramLong, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(137681);
    if (paramInt2 > this.oOb.length)
      this.oOb = new byte[paramInt2];
    Arrays.fill(this.oOb, 0, this.oOb.length, (byte)0);
    try
    {
      if (this.oNZ != null)
      {
        localObject1 = this.oNZ;
        localObject2 = this.oOb;
        i = (int)paramLong;
        if ((localObject2 == null) || (i < 0) || (paramInt2 < 0))
          ab.e("MicroMsg.Music.FileBytesCacheMgr", "read() params is invalid, offset:%d, size:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt2) });
        while (true)
        {
          j = -1;
          if (j <= 0)
            break label425;
          if (j != paramInt2)
          {
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>("read from cache, n%d, size %d ");
            Logger.i("MicroMsg.Music.MMMediaHTTPConnection", j + "," + paramInt2);
          }
          System.arraycopy(this.oOb, 0, paramArrayOfByte, paramInt1, j);
          AppMethodBeat.o(137681);
          paramInt1 = j;
          return paramInt1;
          if (((com.tencent.mm.plugin.music.cache.a)localObject1).oKV.getSize() > 0L)
            break;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("read(), fileLength is error, file length is ");
          ab.e("MicroMsg.Music.FileBytesCacheMgr", ((com.tencent.mm.plugin.music.cache.a)localObject1).oKV.getSize());
        }
      }
    }
    catch (ProtocolException paramArrayOfByte)
    {
      while (true)
      {
        Object localObject2;
        Logger.e("MicroMsg.Music.MMMediaHTTPConnection", "readAt " + paramLong + " / " + paramInt2 + " => " + paramArrayOfByte);
        g.cJ(this.oOa.toString(), 750);
        paramInt1 = -1010;
        AppMethodBeat.o(137681);
        continue;
        j = i + paramInt2;
        l = j;
        if (l <= ((com.tencent.mm.plugin.music.cache.a)localObject1).oKV.getSize())
          break label1302;
        ab.e("MicroMsg.Music.FileBytesCacheMgr", "read() endOffset is error,  startOffset %d, endOffset:%d, file length:%d ", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Long.valueOf(((com.tencent.mm.plugin.music.cache.a)localObject1).oKV.getSize()) });
        j = (int)((com.tencent.mm.plugin.music.cache.a)localObject1).oKV.getSize() - i;
        if (((com.tencent.mm.plugin.music.cache.a)localObject1).oKW.eE(i, j))
        {
          j = ((com.tencent.mm.plugin.music.cache.a)localObject1).oKX.b((byte[])localObject2, i, j);
          continue;
          if ((this.mTotalSize <= 0L) || (paramLong < this.mTotalSize) || (paramInt2 <= 0))
            break;
          ab.e("MicroMsg.Music.MMMediaHTTPConnection", "offset is illegal, mTotalSize:%d, offset:%d, size:%d", new Object[] { Long.valueOf(this.mTotalSize), Long.valueOf(paramLong), Integer.valueOf(paramInt2) });
          paramInt1 = 0;
          AppMethodBeat.o(137681);
        }
      }
      Logger.d("MicroMsg.Music.MMMediaHTTPConnection", "read from network");
      if (paramLong != this.mCurrentOffset)
        seekTo(paramLong);
      j = this.mInputStream.read(this.oOb, 0, paramInt2);
      if (j == -1);
      for (paramInt1 = 0; ; paramInt1 = j)
      {
        this.mCurrentOffset += paramInt1;
        if (this.oNZ != null)
        {
          paramArrayOfByte = this.oNZ;
          localObject1 = this.oOb;
          k = (int)paramLong;
          if ((localObject1 != null) && (k >= 0) && (paramInt1 >= 0))
            break label722;
          ab.e("MicroMsg.Music.FileBytesCacheMgr", "write() params is invalid, offset:%d, size:%d", new Object[] { Integer.valueOf(k), Integer.valueOf(paramInt1) });
        }
        AppMethodBeat.o(137681);
        break;
        System.arraycopy(this.oOb, 0, paramArrayOfByte, paramInt1, j);
      }
    }
    catch (NoRouteToHostException paramArrayOfByte)
    {
      while (true)
      {
        Logger.e("MicroMsg.Music.MMMediaHTTPConnection", "readAt " + paramLong + " / " + paramInt2 + " => " + paramArrayOfByte);
        g.cJ(this.oOa.toString(), 751);
        paramInt1 = -1010;
        AppMethodBeat.o(137681);
        continue;
        if (paramArrayOfByte.oKV.getSize() > 0L)
          break;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>("write() fileLength is error, file length is ");
        ab.e("MicroMsg.Music.FileBytesCacheMgr", paramArrayOfByte.oKV.getSize());
      }
    }
    catch (UnknownServiceException paramArrayOfByte)
    {
      while (true)
      {
        Logger.e("MicroMsg.Music.MMMediaHTTPConnection", "readAt " + paramLong + " / " + paramInt2 + " => " + paramArrayOfByte);
        g.cJ(this.oOa.toString(), 752);
        paramInt1 = -1010;
        AppMethodBeat.o(137681);
        continue;
        m = k + paramInt1;
        long l = m;
        if (l <= paramArrayOfByte.oKV.getSize())
          break;
        ab.e("MicroMsg.Music.FileBytesCacheMgr", "write() endOffset is error, endOffset:%d, file length:%d", new Object[] { Integer.valueOf(m), Long.valueOf(paramArrayOfByte.oKV.getSize()) });
      }
    }
    catch (IOException paramArrayOfByte)
    {
      while (true)
      {
        Logger.e("MicroMsg.Music.MMMediaHTTPConnection", "readAt " + paramLong + " / " + paramInt2 + " => -1 " + paramArrayOfByte);
        g.cJ(this.oOa.toString(), 753);
        paramInt1 = -1;
        AppMethodBeat.o(137681);
        continue;
        if ((!paramArrayOfByte.zu(k)) || (!paramArrayOfByte.zu(m)))
          break label1181;
        if ((!paramArrayOfByte.zv(k)) || (!paramArrayOfByte.zv(m)))
        {
          if (!paramArrayOfByte.zv(k))
            break;
          paramArrayOfByte.u((byte[])localObject1, k, paramInt1);
          if (paramArrayOfByte.mSize == 81920)
          {
            paramArrayOfByte.bTx();
            paramArrayOfByte.zw(m);
          }
        }
        if (m == paramArrayOfByte.oKV.getSize())
        {
          paramArrayOfByte.bTx();
          paramArrayOfByte.zw(m);
        }
      }
    }
    catch (Exception paramArrayOfByte)
    {
      label1302: 
      while (true)
      {
        Object localObject1;
        int i;
        int j;
        label425: int k;
        label722: int m;
        Logger.e("MicroMsg.Music.MMMediaHTTPConnection", "unknown exception ".concat(String.valueOf(paramArrayOfByte)));
        Logger.e("MicroMsg.Music.MMMediaHTTPConnection", "readAt " + paramLong + " / " + paramInt2 + " => -1");
        g.cJ(this.oOa.toString(), 754);
        paramInt1 = -1;
        AppMethodBeat.o(137681);
        continue;
        paramArrayOfByte.bTx();
        paramArrayOfByte.zw(k);
        paramArrayOfByte.u((byte[])localObject1, k, paramInt1);
        continue;
        label1181: if ((paramArrayOfByte.zu(k)) && (!paramArrayOfByte.zu(m)) && (paramArrayOfByte.zv(k)))
        {
          i = 81920 - paramArrayOfByte.mSize;
          j = paramInt1 - i;
          if (i > 0)
            paramArrayOfByte.u((byte[])localObject1, k, i);
          paramArrayOfByte.bTx();
          k += i;
          paramArrayOfByte.zw(k);
          if (j > 0)
            paramArrayOfByte.d((byte[])localObject1, i, k, j);
        }
        else
        {
          paramArrayOfByte.bTx();
          paramArrayOfByte.zw(k);
          paramArrayOfByte.u((byte[])localObject1, k, paramInt1);
          continue;
          j = paramInt2;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.g.a.a
 * JD-Core Version:    0.6.2
 */