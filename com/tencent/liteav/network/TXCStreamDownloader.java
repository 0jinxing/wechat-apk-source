package com.tencent.liteav.network;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;
import java.util.Vector;

public class TXCStreamDownloader extends com.tencent.liteav.basic.module.a
  implements com.tencent.liteav.basic.d.a, TXIStreamDownloader.a, d.a, f
{
  public static final String TAG = "TXCStreamDownloader";
  public static final int TXE_DOWNLOAD_ERROR_ALLADDRESS_FAILED = 12031;
  public static final int TXE_DOWNLOAD_ERROR_CONNECT_FAILED = 12011;
  public static final int TXE_DOWNLOAD_ERROR_DISCONNECT = 12012;
  public static final int TXE_DOWNLOAD_ERROR_GET_RTMP_ACC_URL_FAIL = 12030;
  public static final int TXE_DOWNLOAD_ERROR_NET_RECONNECT = 12015;
  public static final int TXE_DOWNLOAD_ERROR_READ_FAILED = 12013;
  public static final int TXE_DOWNLOAD_ERROR_WRITE_FAILED = 12014;
  public static final int TXE_DOWNLOAD_INFO_CONNECT_END = 12007;
  public static final int TXE_DOWNLOAD_INFO_CONNECT_FAILED = 12004;
  public static final int TXE_DOWNLOAD_INFO_CONNECT_SUCCESS = 12001;
  public static final int TXE_DOWNLOAD_INFO_HANDSHAKE_FAIL = 12005;
  public static final int TXE_DOWNLOAD_INFO_PLAY_BEGIN = 12008;
  public static final int TXE_DOWNLOAD_INFO_SERVER_REFUSE = 12009;
  private g mAccUrlFetcher;
  private Context mApplicationContext;
  private int mChannelType;
  private long mCurrentNalTs;
  private int mDownloadFormat;
  private TXIStreamDownloader mDownloader;
  private boolean mDownloaderRunning;
  private boolean mEnableMessage;
  private boolean mEnableNearestIP;
  private Handler mHandler;
  protected Map<String, String> mHeaders;
  private TXCStreamDownloader.DownloadStats mLastDownloadStats;
  private long mLastIFramelTs;
  private long mLastTimeStamp;
  private f mListener;
  private byte[] mListenerLock;
  private com.tencent.liteav.basic.d.a mNotifyListener;
  private String mOriginPlayUrl;
  private boolean mRecvFirstNal;
  private Runnable mReportNetStatusRunnalbe;
  private d mStreamSwitcher;
  private long mSwitchStartTime;

  static
  {
    AppMethodBeat.i(67564);
    com.tencent.liteav.basic.util.b.e();
    AppMethodBeat.o(67564);
  }

  public TXCStreamDownloader(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(67551);
    this.mDownloader = null;
    this.mListener = null;
    this.mListenerLock = new byte[0];
    this.mNotifyListener = null;
    this.mDownloaderRunning = false;
    this.mOriginPlayUrl = "";
    this.mEnableNearestIP = false;
    this.mChannelType = 0;
    this.mEnableMessage = false;
    this.mDownloadFormat = 1;
    this.mHandler = null;
    this.mLastTimeStamp = 0L;
    this.mLastDownloadStats = null;
    this.mRecvFirstNal = false;
    this.mSwitchStartTime = 0L;
    this.mCurrentNalTs = 0L;
    this.mLastIFramelTs = 0L;
    this.mStreamSwitcher = null;
    this.mReportNetStatusRunnalbe = new TXCStreamDownloader.3(this);
    if (paramInt == 0);
    for (this.mDownloader = new TXCFLVDownloader(paramContext); ; this.mDownloader = new TXCRTMPDownloader(paramContext))
      do
      {
        if (this.mDownloader != null)
        {
          this.mDownloader.setListener(this);
          this.mDownloader.setNotifyListener(this);
          this.mDownloader.setRestartListener(this);
        }
        this.mDownloadFormat = paramInt;
        this.mAccUrlFetcher = new g(paramContext);
        this.mApplicationContext = paramContext;
        if (this.mApplicationContext != null)
          this.mHandler = new Handler(this.mApplicationContext.getMainLooper());
        AppMethodBeat.o(67551);
        return;
      }
      while ((paramInt != 1) && (paramInt != 4));
  }

  private TXCStreamDownloader.DownloadStats getDownloadStats()
  {
    AppMethodBeat.i(67556);
    TXCStreamDownloader.DownloadStats localDownloadStats;
    if (this.mDownloader != null)
    {
      localDownloadStats = this.mDownloader.getDownloadStats();
      AppMethodBeat.o(67556);
    }
    while (true)
    {
      return localDownloadStats;
      localDownloadStats = null;
      AppMethodBeat.o(67556);
    }
  }

  private TXCStreamDownloader.a getRealTimeStreamInfo()
  {
    AppMethodBeat.i(67557);
    TXCStreamDownloader.a locala = new TXCStreamDownloader.a();
    if (this.mAccUrlFetcher != null)
    {
      locala.b = this.mAccUrlFetcher.a();
      locala.c = this.mAccUrlFetcher.b();
      locala.d = this.mAccUrlFetcher.c();
      locala.e = this.mAccUrlFetcher.d();
    }
    if (this.mDownloader != null)
    {
      locala.a = this.mDownloader.getCurrentStreamUrl();
      locala.f = this.mDownloader.isQuicChannel();
    }
    AppMethodBeat.o(67557);
    return locala;
  }

  private Long getSpeed(long paramLong1, long paramLong2, long paramLong3)
  {
    long l = 0L;
    AppMethodBeat.i(67560);
    if (paramLong1 > paramLong2);
    while (true)
    {
      paramLong1 = l;
      if (paramLong3 > 0L)
        paramLong1 = 8L * paramLong2 * 1000L / (1024L * paramLong3);
      AppMethodBeat.o(67560);
      return Long.valueOf(paramLong1);
      paramLong2 -= paramLong1;
    }
  }

  private void playStreamWithRawUrl(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(67553);
    if (this.mDownloader != null)
    {
      if ((paramString != null) && ((paramString.startsWith("http://")) || (paramString.startsWith("https://"))) && (paramString.contains(".flv")))
      {
        int i = this.mDownloader.connectRetryLimit;
        int j = this.mDownloader.connectRetryInterval;
        this.mDownloader = null;
        this.mDownloader = new TXCFLVDownloader(this.mApplicationContext);
        this.mDownloader.setListener(this);
        this.mDownloader.setNotifyListener(this);
        this.mDownloader.setRestartListener(this);
        this.mDownloader.connectRetryLimit = i;
        this.mDownloader.connectRetryInterval = j;
        this.mDownloader.setHeaders(this.mHeaders);
      }
      setStatusValue(7112, Long.valueOf(1L));
      Vector localVector = new Vector();
      localVector.add(new e(paramString, false));
      this.mDownloader.setOriginUrl(paramString);
      this.mDownloader.startDownload(localVector, false, false, paramBoolean);
    }
    AppMethodBeat.o(67553);
  }

  private void reportNetStatus()
  {
    AppMethodBeat.i(67558);
    reportNetStatusInternal();
    this.mHandler.postDelayed(this.mReportNetStatusRunnalbe, 2000L);
    AppMethodBeat.o(67558);
  }

  private void reportNetStatusInternal()
  {
    AppMethodBeat.i(67559);
    long l1 = TXCTimeUtil.getTimeTick();
    long l2 = l1 - this.mLastTimeStamp;
    TXCStreamDownloader.DownloadStats localDownloadStats = getDownloadStats();
    TXCStreamDownloader.a locala = getRealTimeStreamInfo();
    long l3;
    if (localDownloadStats != null)
    {
      if (this.mLastDownloadStats == null)
        break label398;
      l3 = getSpeed(this.mLastDownloadStats.afterParseVideoBytes, localDownloadStats.afterParseVideoBytes, l2).longValue();
      l2 = getSpeed(this.mLastDownloadStats.afterParseAudioBytes, localDownloadStats.afterParseAudioBytes, l2).longValue();
    }
    while (true)
    {
      setStatusValue(7101, Long.valueOf(l3));
      setStatusValue(7102, Long.valueOf(l2));
      setStatusValue(7103, Long.valueOf(localDownloadStats.firstVideoTS));
      setStatusValue(7104, Long.valueOf(localDownloadStats.firstAudioTS));
      if (locala != null)
      {
        setStatusValue(7105, Long.valueOf(locala.d));
        setStatusValue(7106, locala.e);
        if (!locala.f)
          break label393;
      }
      label393: for (l2 = 2L; ; l2 = 1L)
      {
        setStatusValue(7111, Long.valueOf(l2));
        setStatusValue(7113, locala.a);
        setStatusValue(7114, locala.b);
        setStatusValue(7115, locala.c);
        setStatusValue(7107, Long.valueOf(localDownloadStats.startTS));
        setStatusValue(7108, Long.valueOf(localDownloadStats.dnsTS));
        setStatusValue(7109, Long.valueOf(localDownloadStats.connTS));
        setStatusValue(7110, String.valueOf(localDownloadStats.serverIP));
        if (this.mDownloader != null)
        {
          int i = this.mDownloader.getConnectCountQuic();
          int j = this.mDownloader.getConnectCountTcp();
          setStatusValue(7117, Long.valueOf(i + 1));
          setStatusValue(7118, Long.valueOf(j + 1));
          setStatusValue(7119, this.mDownloader.getRealStreamUrl());
        }
        this.mLastTimeStamp = l1;
        this.mLastDownloadStats = localDownloadStats;
        AppMethodBeat.o(67559);
        return;
      }
      label398: l2 = 0L;
      l3 = 0L;
    }
  }

  private void tryResetRetryCount()
  {
    if (this.mDownloader != null)
      this.mDownloader.connectRetryTimes = 0;
  }

  public void onNotifyEvent(int paramInt, Bundle paramBundle)
  {
    int i = 3002;
    AppMethodBeat.i(67546);
    while (true)
    {
      Bundle localBundle;
      synchronized (this.mListenerLock)
      {
        if (this.mNotifyListener != null)
        {
          localBundle = new android/os/Bundle;
          localBundle.<init>();
        }
        switch (paramInt)
        {
        case 12002:
        case 12003:
        case 12006:
        case 12010:
        case 12016:
        case 12017:
        case 12018:
        case 12019:
        case 12020:
        case 12021:
        case 12022:
        case 12023:
        case 12024:
        case 12025:
        case 12026:
        case 12027:
        case 12028:
        case 12029:
        default:
          localBundle.putString("EVT_MSG", "UNKNOWN event = ".concat(String.valueOf(paramInt)));
          i = paramInt;
          String str = "";
          if (paramBundle != null)
            str = paramBundle.getString("EVT_MSG", "");
          if ((str != null) && (!str.isEmpty()))
            localBundle.putString("EVT_MSG", str);
          localBundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
          this.mNotifyListener.onNotifyEvent(i, localBundle);
          if (paramInt == 12001)
            reportNetStatusInternal();
          AppMethodBeat.o(67546);
          return;
        case 12005:
          localBundle.putString("EVT_MSG", "RTMP服务器握手失败");
          i = 3003;
          break;
        case 12012:
          localBundle.putString("EVT_MSG", "经多次自动重连失败，放弃连接");
          i = -2301;
          break;
        case 12011:
          localBundle.putString("EVT_MSG", "连接服务器失败");
        case 12013:
        case 12014:
        case 12030:
        case 12031:
        case 12007:
        case 12001:
        case 12004:
        case 12015:
        case 12008:
        case 12009:
        }
      }
      localBundle.putString("EVT_MSG", "读数据错误，网络连接断开");
      i = 3005;
      continue;
      localBundle.putString("EVT_MSG", "写数据错误，网络连接断开");
      i = 3005;
      continue;
      localBundle.putString("EVT_MSG", "获取加速拉流地址失败");
      i = -2302;
      continue;
      localBundle.putString("EVT_MSG", "所有拉流地址尝试失败,可以放弃治疗");
      i = -2301;
      continue;
      localBundle.putString("EVT_MSG", "连接结束");
      i = paramInt;
      continue;
      localBundle.putString("EVT_MSG", "已连接服务器");
      i = 2001;
      continue;
      localBundle.putString("EVT_MSG", "连接服务器失败");
      continue;
      localBundle.putString("EVT_MSG", "启动网络重连");
      i = 2103;
      continue;
      localBundle.putString("EVT_MSG", "开始拉流");
      i = 2002;
      continue;
      localBundle.putString("EVT_MSG", "服务器拒绝连接请求");
      i = 2103;
    }
  }

  public void onPullAudio(com.tencent.liteav.basic.g.a parama)
  {
    AppMethodBeat.i(67547);
    tryResetRetryCount();
    synchronized (this.mListenerLock)
    {
      if (this.mListener != null)
        this.mListener.onPullAudio(parama);
      AppMethodBeat.o(67547);
      return;
    }
  }

  public void onPullNAL(com.tencent.liteav.basic.g.b paramb)
  {
    AppMethodBeat.i(67548);
    tryResetRetryCount();
    if (!this.mRecvFirstNal)
    {
      reportNetStatusInternal();
      this.mRecvFirstNal = true;
    }
    synchronized (this.mListenerLock)
    {
      this.mCurrentNalTs = paramb.g;
      if (paramb.b == 0)
        this.mLastIFramelTs = paramb.g;
      if (this.mListener != null)
        this.mListener.onPullNAL(paramb);
      AppMethodBeat.o(67548);
      return;
    }
  }

  public void onRestartDownloader()
  {
    AppMethodBeat.i(67549);
    if (this.mHandler != null)
      this.mHandler.post(new TXCStreamDownloader.1(this));
    AppMethodBeat.o(67549);
  }

  public void onSwitchFinish(TXIStreamDownloader paramTXIStreamDownloader, boolean paramBoolean)
  {
    AppMethodBeat.i(67550);
    synchronized (this.mListenerLock)
    {
      int i = (int)(System.currentTimeMillis() - this.mSwitchStartTime);
      this.mSwitchStartTime = 0L;
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      localBundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
      if (paramBoolean)
      {
        this.mDownloader = paramTXIStreamDownloader;
        this.mDownloader.setListener(this);
        this.mDownloader.setNotifyListener(this);
        this.mDownloader.setRestartListener(this);
        localBundle.putInt("EVT_ID", 2015);
        localBundle.putCharSequence("EVT_MSG", "切换分辨率成功");
        if (this.mNotifyListener != null)
          this.mNotifyListener.onNotifyEvent(2015, localBundle);
        TXCDRApi.txReportDAU(this.mApplicationContext, com.tencent.liteav.basic.datareport.a.by, i, "");
        this.mStreamSwitcher = null;
        AppMethodBeat.o(67550);
        return;
      }
      localBundle.putInt("EVT_ID", 2015);
      localBundle.putCharSequence("EVT_MSG", "切换分辨率失败");
      if (this.mNotifyListener != null)
        this.mNotifyListener.onNotifyEvent(2015, localBundle);
      TXCDRApi.txReportDAU(this.mApplicationContext, com.tencent.liteav.basic.datareport.a.bz);
    }
  }

  public void setHeaders(Map<String, String> paramMap)
  {
    AppMethodBeat.i(67561);
    this.mHeaders = paramMap;
    if (this.mDownloader != null)
      this.mDownloader.setHeaders(this.mHeaders);
    AppMethodBeat.o(67561);
  }

  public void setListener(f paramf)
  {
    synchronized (this.mListenerLock)
    {
      this.mListener = paramf;
      return;
    }
  }

  public void setNotifyListener(com.tencent.liteav.basic.d.a parama)
  {
    synchronized (this.mListenerLock)
    {
      this.mNotifyListener = parama;
      return;
    }
  }

  public void setRetryInterval(int paramInt)
  {
    if (this.mDownloader != null)
      this.mDownloader.connectRetryInterval = paramInt;
  }

  public void setRetryTimes(int paramInt)
  {
    if (this.mDownloader != null)
      this.mDownloader.connectRetryLimit = paramInt;
  }

  public int start(String paramString, boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    boolean bool = true;
    AppMethodBeat.i(67552);
    this.mDownloaderRunning = true;
    this.mRecvFirstNal = false;
    this.mOriginPlayUrl = paramString;
    this.mEnableNearestIP = paramBoolean1;
    this.mChannelType = paramInt;
    this.mEnableMessage = paramBoolean2;
    setStatusValue(7116, Long.valueOf(0L));
    setStatusValue(7117, Long.valueOf(0L));
    setStatusValue(7118, Long.valueOf(0L));
    Vector localVector;
    if (paramString.startsWith("room"))
    {
      setStatusValue(7116, Long.valueOf(1L));
      setStatusValue(7112, Long.valueOf(2L));
      if (this.mDownloader != null)
      {
        localVector = new Vector();
        localVector.add(new e(paramString, true));
        this.mDownloader.setOriginUrl(paramString);
        this.mDownloader.startDownload(localVector, false, false, paramBoolean2);
      }
      if (this.mHandler != null)
        this.mHandler.postDelayed(this.mReportNetStatusRunnalbe, 2000L);
      AppMethodBeat.o(67552);
      return 0;
    }
    if ((paramBoolean1) && (this.mDownloadFormat == 4))
    {
      paramInt = this.mAccUrlFetcher.a(paramString, paramInt, new TXCStreamDownloader.2(this, paramString, paramBoolean2));
      if (paramInt != 0)
      {
        if (paramInt != -1)
          break label324;
        TXCDRApi.txReportDAU(this.mApplicationContext, com.tencent.liteav.basic.datareport.a.ay, paramInt, "invalid playUrl");
      }
      while (true)
      {
        TXCLog.e("TXCStreamDownloader", "getAccelerateStreamPlayUrl failed, result = " + paramInt + ", play stream with raw url");
        onNotifyEvent(12030, null);
        playStreamWithRawUrl(paramString, paramBoolean2);
        if (this.mHandler != null)
          this.mHandler.postDelayed(this.mReportNetStatusRunnalbe, 2000L);
        AppMethodBeat.o(67552);
        break;
        label324: if (paramInt == -2)
          TXCDRApi.txReportDAU(this.mApplicationContext, com.tencent.liteav.basic.datareport.a.ay, paramInt, "invalid streamID");
        else if (paramInt == -3)
          TXCDRApi.txReportDAU(this.mApplicationContext, com.tencent.liteav.basic.datareport.a.ay, paramInt, "invalid signature");
      }
    }
    if (this.mDownloader != null)
    {
      setStatusValue(7112, Long.valueOf(1L));
      localVector = new Vector();
      localVector.add(new e(paramString, false));
      this.mDownloader.setOriginUrl(paramString);
      paramString = this.mDownloader;
      if (this.mDownloadFormat != 4)
        break label476;
    }
    while (true)
    {
      paramString.startDownload(localVector, bool, paramBoolean1, paramBoolean2);
      if (this.mHandler != null)
        this.mHandler.postDelayed(this.mReportNetStatusRunnalbe, 2000L);
      AppMethodBeat.o(67552);
      break;
      label476: bool = false;
    }
  }

  public void stop()
  {
    AppMethodBeat.i(67554);
    this.mDownloaderRunning = false;
    this.mRecvFirstNal = false;
    if (this.mDownloader != null)
      this.mDownloader.stopDownload();
    if (this.mHandler != null)
      this.mHandler.removeCallbacks(this.mReportNetStatusRunnalbe);
    synchronized (this.mListenerLock)
    {
      if (this.mStreamSwitcher != null)
      {
        this.mStreamSwitcher.a(null);
        this.mStreamSwitcher.a();
        this.mStreamSwitcher = null;
      }
      AppMethodBeat.o(67554);
      return;
    }
  }

  public boolean switchStream(String paramString)
  {
    AppMethodBeat.i(67555);
    synchronized (this.mListenerLock)
    {
      if (this.mStreamSwitcher != null)
      {
        TXCLog.w("TXCStreamDownloader", "stream_switch stream is changing ignore this change");
        bool = false;
        AppMethodBeat.o(67555);
        return bool;
      }
      TXCFLVDownloader localTXCFLVDownloader = new com/tencent/liteav/network/TXCFLVDownloader;
      localTXCFLVDownloader.<init>(this.mApplicationContext);
      localTXCFLVDownloader.connectRetryLimit = this.mDownloader.connectRetryLimit;
      localTXCFLVDownloader.connectRetryInterval = this.mDownloader.connectRetryInterval;
      localTXCFLVDownloader.setHeaders(this.mHeaders);
      d locald = new com/tencent/liteav/network/d;
      locald.<init>(this);
      this.mStreamSwitcher = locald;
      this.mStreamSwitcher.a(this);
      this.mStreamSwitcher.a(this.mDownloader, localTXCFLVDownloader, this.mCurrentNalTs, this.mLastIFramelTs, paramString);
      this.mSwitchStartTime = System.currentTimeMillis();
      boolean bool = true;
      AppMethodBeat.o(67555);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.network.TXCStreamDownloader
 * JD-Core Version:    0.6.2
 */