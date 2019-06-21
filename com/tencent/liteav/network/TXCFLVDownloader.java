package com.tencent.liteav.network;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;
import javax.net.ssl.SSLException;

public class TXCFLVDownloader extends TXIStreamDownloader
{
  private final int CONNECT_TIMEOUT;
  private final int FLV_HEAD_SIZE;
  private final int MAX_FRAME_SIZE;
  private final int MSG_CONNECT;
  private final int MSG_DISCONNECT;
  private final int MSG_QUIT;
  private final int MSG_RECONNECT;
  private final int MSG_RECV_DATA;
  private final int MSG_RESUME;
  private final int MSG_SEEK;
  private final int READ_STREAM_SIZE;
  public final String TAG;
  private HttpURLConnection mConnection;
  private long mContentLength;
  private long mDownloadedSize;
  private long mFLVParser;
  private Handler mFlvHandler;
  private HandlerThread mFlvThread;
  private InputStream mInputStream;
  private byte[] mPacketBytes;
  private String mPlayUrl;
  private boolean mRecvData;
  private TXCStreamDownloader.DownloadStats mStats;
  private boolean mbFirstAudio;
  private boolean mbFirstVideo;

  public TXCFLVDownloader(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(67596);
    this.TAG = "network.TXCFLVDownloader";
    this.FLV_HEAD_SIZE = 9;
    this.MAX_FRAME_SIZE = 1048576;
    this.MSG_CONNECT = 100;
    this.MSG_RECV_DATA = 101;
    this.MSG_DISCONNECT = 102;
    this.MSG_RECONNECT = 103;
    this.MSG_SEEK = 104;
    this.MSG_RESUME = 105;
    this.MSG_QUIT = 106;
    this.CONNECT_TIMEOUT = 8000;
    this.READ_STREAM_SIZE = 1388;
    this.mFlvThread = null;
    this.mFlvHandler = null;
    this.mInputStream = null;
    this.mConnection = null;
    this.mPacketBytes = null;
    this.mRecvData = false;
    this.mContentLength = 0L;
    this.mDownloadedSize = 0L;
    this.mFLVParser = 0L;
    this.mPlayUrl = "";
    this.mbFirstVideo = false;
    this.mbFirstAudio = false;
    this.mStats = null;
    this.mStats = new TXCStreamDownloader.DownloadStats();
    this.mStats.afterParseAudioBytes = 0L;
    this.mStats.dnsTS = 0L;
    this.mStats.startTS = TXCTimeUtil.getTimeTick();
    AppMethodBeat.o(67596);
  }

  private void connect()
  {
    AppMethodBeat.i(67606);
    if (this.mConnection != null)
    {
      this.mConnection.disconnect();
      this.mConnection = null;
    }
    this.mConnection = ((HttpURLConnection)new URL(this.mPlayUrl).openConnection());
    this.mStats.dnsTS = TXCTimeUtil.getTimeTick();
    this.mConnection.setConnectTimeout(8000);
    this.mConnection.setReadTimeout(8000);
    this.mConnection.setRequestProperty("Accept-Encoding", "identity");
    this.mConnection.setInstanceFollowRedirects(true);
    if (this.mHeaders != null)
    {
      Iterator localIterator = this.mHeaders.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        this.mConnection.setRequestProperty((String)localEntry.getKey(), (String)localEntry.getValue());
      }
    }
    this.mConnection.connect();
    this.mInputStream = this.mConnection.getInputStream();
    this.mPacketBytes = new byte[1388];
    this.mRecvData = false;
    this.mContentLength = this.mConnection.getContentLength();
    this.mDownloadedSize = 0L;
    this.mStats.serverIP = InetAddress.getByName(this.mConnection.getURL().getHost()).getHostAddress();
    this.mStats.connTS = TXCTimeUtil.getTimeTick();
    sendNotifyEvent(12001);
    AppMethodBeat.o(67606);
  }

  private void disconnect()
  {
    AppMethodBeat.i(67608);
    if (this.mConnection != null)
    {
      this.mConnection.disconnect();
      this.mConnection = null;
    }
    if (this.mInputStream != null)
    {
      this.mInputStream.close();
      this.mInputStream = null;
    }
    AppMethodBeat.o(67608);
  }

  private native void nativeCleanData(long paramLong);

  private native long nativeInitFlvHander(String paramString, int paramInt, boolean paramBoolean);

  private native int nativeParseData(long paramLong, byte[] paramArrayOfByte, int paramInt);

  private native void nativeUninitFlvhander(long paramLong);

  private void postConnectMsg()
  {
    AppMethodBeat.i(67605);
    this.mInputStream = null;
    if (this.mConnection != null)
    {
      this.mConnection.disconnect();
      this.mConnection = null;
    }
    Message localMessage = new Message();
    localMessage.what = 100;
    localMessage.arg1 = 0;
    if (this.mFlvHandler != null)
      this.mFlvHandler.sendMessage(localMessage);
    AppMethodBeat.o(67605);
  }

  private void postDisconnectMsg()
  {
    AppMethodBeat.i(67604);
    if (this.mFlvHandler != null)
      this.mFlvHandler.sendEmptyMessage(102);
    AppMethodBeat.o(67604);
  }

  private void postReconnectMsg()
  {
    AppMethodBeat.i(67603);
    if (this.mFlvHandler != null)
      this.mFlvHandler.sendEmptyMessageDelayed(103, this.connectRetryInterval * 1000);
    AppMethodBeat.o(67603);
  }

  private void processMsgConnect()
  {
    AppMethodBeat.i(67597);
    try
    {
      connect();
      if (this.mFLVParser == 0L)
        this.mFLVParser = nativeInitFlvHander(this.mPlayUrl, 0, this.mEnableMessage);
      if (this.mFlvHandler != null)
        this.mFlvHandler.sendEmptyMessage(101);
      AppMethodBeat.o(67597);
      return;
    }
    catch (SocketTimeoutException localSocketTimeoutException)
    {
      while (true)
      {
        TXCLog.e("network.TXCFLVDownloader", "socket timeout, reconnect");
        postReconnectMsg();
        AppMethodBeat.o(67597);
      }
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      while (true)
      {
        TXCLog.e("network.TXCFLVDownloader", "file not found, reconnect");
        postReconnectMsg();
        AppMethodBeat.o(67597);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        TXCLog.e("network.TXCFLVDownloader", "exception, reconnect");
        postReconnectMsg();
        AppMethodBeat.o(67597);
      }
    }
    catch (Error localError)
    {
      while (true)
      {
        TXCLog.e("network.TXCFLVDownloader", "error, reconnect");
        postReconnectMsg();
        AppMethodBeat.o(67597);
      }
    }
  }

  private void processMsgDisConnect()
  {
    AppMethodBeat.i(67599);
    try
    {
      disconnect();
      label10: if (this.mFLVParser != 0L)
      {
        nativeUninitFlvhander(this.mFLVParser);
        this.mFLVParser = 0L;
      }
      AppMethodBeat.o(67599);
      return;
    }
    catch (Exception localException)
    {
      break label10;
    }
  }

  private void processMsgReconnect()
  {
    AppMethodBeat.i(67600);
    reconnect();
    AppMethodBeat.o(67600);
  }

  private void processMsgRecvData()
  {
    int i = 0;
    AppMethodBeat.i(67598);
    if (this.mInputStream != null);
    while (true)
    {
      try
      {
        int j = this.mInputStream.read(this.mPacketBytes, 0, 1388);
        Object localObject;
        if (j > 0)
        {
          this.mDownloadedSize += j;
          if (!this.mRecvData)
          {
            TXCLog.w("network.TXCFLVDownloader", "flv play receive first data");
            this.mRecvData = true;
          }
          if (this.mFLVParser != 0L)
          {
            localObject = this.mStats;
            ((TXCStreamDownloader.DownloadStats)localObject).beforeParseVideoBytes += j;
            i = nativeParseData(this.mFLVParser, this.mPacketBytes, j);
          }
          if (i > 1048576)
          {
            localObject = new java/lang/StringBuilder;
            ((StringBuilder)localObject).<init>("flv play parse frame: ");
            TXCLog.e("network.TXCFLVDownloader", i + " > 1048576,sart reconnect");
            postReconnectMsg();
            AppMethodBeat.o(67598);
          }
        }
        else if (j < 0)
        {
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>("http read: ");
          TXCLog.w("network.TXCFLVDownloader", j + " < 0, start reconnect");
          postReconnectMsg();
          AppMethodBeat.o(67598);
          continue;
        }
        if (this.mFlvHandler != null)
          this.mFlvHandler.sendEmptyMessage(101);
        AppMethodBeat.o(67598);
        continue;
      }
      catch (SocketTimeoutException localSocketTimeoutException)
      {
        TXCLog.w("network.TXCFLVDownloader", "socket timeout start reconnect");
        postReconnectMsg();
        AppMethodBeat.o(67598);
        continue;
      }
      catch (SocketException localSocketException)
      {
        TXCLog.w("network.TXCFLVDownloader", "socket exception start reconnect");
        postReconnectMsg();
        AppMethodBeat.o(67598);
        continue;
      }
      catch (SSLException localSSLException)
      {
        TXCLog.w("network.TXCFLVDownloader", "ssl exception start reconnect");
        postReconnectMsg();
        AppMethodBeat.o(67598);
        continue;
      }
      catch (EOFException localEOFException)
      {
        TXCLog.w("network.TXCFLVDownloader", "eof exception start reconnect");
        postReconnectMsg();
        AppMethodBeat.o(67598);
        continue;
      }
      catch (Exception localException)
      {
        TXCLog.e("network.TXCFLVDownloader", "exception");
        this.mInputStream = null;
        this.mConnection = null;
        AppMethodBeat.o(67598);
        continue;
      }
      catch (Error localError)
      {
        TXCLog.e("network.TXCFLVDownloader", "error");
        this.mInputStream = null;
        this.mConnection = null;
      }
      AppMethodBeat.o(67598);
    }
  }

  private void reconnect()
  {
    AppMethodBeat.i(67602);
    processMsgDisConnect();
    if (this.connectRetryTimes < this.connectRetryLimit)
    {
      this.connectRetryTimes += 1;
      TXCLog.d("network.TXCFLVDownloader", "reconnect retry time:" + this.connectRetryTimes + ", limit:" + this.connectRetryLimit);
      processMsgConnect();
      sendNotifyEvent(12015);
      AppMethodBeat.o(67602);
    }
    while (true)
    {
      return;
      TXCLog.e("network.TXCFLVDownloader", "reconnect all times retried, send failed event ");
      sendNotifyEvent(12012);
      AppMethodBeat.o(67602);
    }
  }

  private void startInternal()
  {
    AppMethodBeat.i(67601);
    if (this.mFlvThread == null)
    {
      this.mFlvThread = new HandlerThread("FlvThread");
      this.mFlvThread.start();
    }
    if (this.mFlvHandler == null)
      this.mFlvHandler = new TXCFLVDownloader.1(this, this.mFlvThread.getLooper());
    postConnectMsg();
    AppMethodBeat.o(67601);
  }

  public TXCStreamDownloader.DownloadStats getDownloadStats()
  {
    AppMethodBeat.i(67609);
    TXCStreamDownloader.DownloadStats localDownloadStats = new TXCStreamDownloader.DownloadStats();
    localDownloadStats.afterParseAudioBytes = this.mStats.afterParseAudioBytes;
    localDownloadStats.afterParseVideoBytes = this.mStats.afterParseVideoBytes;
    localDownloadStats.beforeParseVideoBytes = this.mStats.beforeParseVideoBytes;
    localDownloadStats.beforeParseAudioBytes = this.mStats.beforeParseAudioBytes;
    localDownloadStats.startTS = this.mStats.startTS;
    localDownloadStats.dnsTS = this.mStats.dnsTS;
    localDownloadStats.connTS = this.mStats.connTS;
    localDownloadStats.firstAudioTS = this.mStats.firstAudioTS;
    localDownloadStats.firstVideoTS = this.mStats.firstVideoTS;
    localDownloadStats.serverIP = this.mStats.serverIP;
    AppMethodBeat.o(67609);
    return localDownloadStats;
  }

  public String getRealStreamUrl()
  {
    AppMethodBeat.i(67607);
    String str;
    if (this.mConnection != null)
    {
      str = this.mConnection.getURL().toString();
      AppMethodBeat.o(67607);
    }
    while (true)
    {
      return str;
      str = null;
      AppMethodBeat.o(67607);
    }
  }

  public void onRecvAudioData(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(67613);
    if (!this.mbFirstAudio)
    {
      this.mbFirstAudio = true;
      this.mStats.firstAudioTS = TXCTimeUtil.getTimeTick();
      TXCLog.d("network.TXCFLVDownloader", "receive first audio with ts " + this.mStats.firstAudioTS);
    }
    TXCStreamDownloader.DownloadStats localDownloadStats = this.mStats;
    localDownloadStats.afterParseAudioBytes += paramArrayOfByte.length;
    super.onRecvAudioData(paramArrayOfByte, paramInt1, paramInt2, paramInt3);
    AppMethodBeat.o(67613);
  }

  public void onRecvVideoData(byte[] paramArrayOfByte, int paramInt1, long paramLong1, long paramLong2, int paramInt2)
  {
    AppMethodBeat.i(67612);
    if (!this.mbFirstVideo)
    {
      this.mbFirstVideo = true;
      this.mStats.firstVideoTS = TXCTimeUtil.getTimeTick();
      TXCLog.d("network.TXCFLVDownloader", "receive first video with ts " + this.mStats.firstVideoTS);
    }
    TXCStreamDownloader.DownloadStats localDownloadStats = this.mStats;
    localDownloadStats.afterParseVideoBytes += paramArrayOfByte.length;
    super.onRecvVideoData(paramArrayOfByte, paramInt1, paramLong1, paramLong2, paramInt2);
    AppMethodBeat.o(67612);
  }

  public void startDownload(Vector<e> paramVector, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    AppMethodBeat.i(67610);
    if (this.mIsRunning)
      AppMethodBeat.o(67610);
    while (true)
    {
      return;
      if ((paramVector == null) || (paramVector.isEmpty()))
      {
        AppMethodBeat.o(67610);
      }
      else
      {
        this.mEnableMessage = paramBoolean3;
        this.mIsRunning = true;
        this.mPlayUrl = ((e)paramVector.get(0)).a;
        TXCLog.d("network.TXCFLVDownloader", "start pull with url " + this.mPlayUrl);
        startInternal();
        AppMethodBeat.o(67610);
      }
    }
  }

  public void stopDownload()
  {
    AppMethodBeat.i(67611);
    if (!this.mIsRunning)
      AppMethodBeat.o(67611);
    while (true)
    {
      return;
      this.mIsRunning = false;
      TXCLog.d("network.TXCFLVDownloader", "stop pull");
      try
      {
        if (this.mFlvHandler != null)
        {
          this.mFlvHandler.removeCallbacksAndMessages(null);
          this.mFlvHandler.sendEmptyMessage(102);
          this.mFlvHandler.sendEmptyMessage(106);
          this.mFlvHandler = null;
        }
        AppMethodBeat.o(67611);
      }
      catch (Exception localException)
      {
        AppMethodBeat.o(67611);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.network.TXCFLVDownloader
 * JD-Core Version:    0.6.2
 */