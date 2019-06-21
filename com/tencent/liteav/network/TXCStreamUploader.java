package com.tencent.liteav.network;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.TXCStatus;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONObject;

public class TXCStreamUploader extends com.tencent.liteav.basic.module.a
  implements b
{
  public static final int RTMPSENDSTRATEGY_LIVE = 1;
  public static final int RTMPSENDSTRATEGY_REALTIME_QUIC = 3;
  public static final int RTMPSENDSTRATEGY_REALTIME_TCP = 2;
  static final String TAG = "TXCStreamUploader";
  public static final int TXE_UPLOAD_ERROR_ALLADDRESS_FAILED = 11011;
  public static final int TXE_UPLOAD_ERROR_INVALID_ADDRESS = 11019;
  public static final int TXE_UPLOAD_ERROR_NET_DISCONNECT = 11012;
  public static final int TXE_UPLOAD_ERROR_NET_RECONNECT = 11016;
  public static final int TXE_UPLOAD_ERROR_NO_DATA = 11013;
  public static final int TXE_UPLOAD_ERROR_NO_NETWORK = 11015;
  public static final int TXE_UPLOAD_ERROR_READ_FAILED = 11017;
  public static final int TXE_UPLOAD_ERROR_WRITE_FAILED = 11018;
  public static final int TXE_UPLOAD_INFO_CONNECT_FAILED = 11006;
  public static final int TXE_UPLOAD_INFO_CONNECT_SUCCESS = 11001;
  public static final int TXE_UPLOAD_INFO_HANDSHAKE_FAIL = 11005;
  public static final int TXE_UPLOAD_INFO_NET_BUSY = 11003;
  public static final int TXE_UPLOAD_INFO_PUBLISH_START = 11008;
  public static final int TXE_UPLOAD_INFO_PUSH_BEGIN = 11002;
  public static final int TXE_UPLOAD_INFO_ROOM_IN = 11021;
  public static final int TXE_UPLOAD_INFO_ROOM_NEED_REENTER = 11024;
  public static final int TXE_UPLOAD_INFO_ROOM_OUT = 11022;
  public static final int TXE_UPLOAD_INFO_ROOM_USERLIST = 11023;
  public static final int TXE_UPLOAD_INFO_SERVER_REFUSE = 11007;
  public static final int TXE_UPLOAD_MODE_AUDIO_ONLY = 1;
  public static final int TXE_UPLOAD_MODE_LINK_MIC = 2;
  public static final int TXE_UPLOAD_MODE_REAL_TIME = 0;
  public static final int TXE_UPLOAD_PROTOCOL_AV = 1;
  public static final int TXE_UPLOAD_PROTOCOL_RTMP = 0;
  private final int MSG_EVENT;
  private final int MSG_RECONNECT;
  private final int MSG_REPORT_STATUS;
  private final int MSG_RTMPPROXY_HEARTBEAT;
  private boolean mAudioMuted;
  private int mChannelType;
  private int mConnectCountQuic;
  private int mConnectCountTcp;
  private long mConnectSuccessTimeStamps;
  private Context mContext;
  private int mCurrentRecordIdx;
  private boolean mEnableNearestIP;
  private long mGoodPushTime;
  private Handler mHandler;
  private HandlerThread mHandlerThread;
  private c mIntelligentRoute;
  private ArrayList<a> mIpList;
  private boolean mIsPushing;
  private int mLastNetworkType;
  private long mLastTimeStamp;
  private TXCStreamUploader.UploadStats mLastUploadStats;
  private WeakReference<com.tencent.liteav.basic.d.a> mNotifyListener;
  private h mParam;
  private long mPushStartTS;
  private boolean mQuicChannel;
  private int mRetryCount;
  private long mRtmpMsgRecvThreadInstance;
  private Object mRtmpMsgRecvThreadLock;
  private boolean mRtmpProxyEnable;
  private int mRtmpProxyIPIndex;
  private Vector<String> mRtmpProxyIPList;
  private long mRtmpProxyInstance;
  private Object mRtmpProxyLock;
  private TXCStreamUploader.a mRtmpProxyParam;
  private String mRtmpUrl;
  private Thread mThread;
  private Object mThreadLock;
  private j mUploadQualityReport;
  private long mUploaderInstance;
  private Vector<com.tencent.liteav.basic.g.b> mVecPendingNAL;

  static
  {
    AppMethodBeat.i(67529);
    com.tencent.liteav.basic.util.b.e();
    AppMethodBeat.o(67529);
  }

  public TXCStreamUploader(Context paramContext, h paramh)
  {
    AppMethodBeat.i(67481);
    this.mUploaderInstance = 0L;
    this.mThread = null;
    this.mThreadLock = null;
    this.mIsPushing = false;
    this.mPushStartTS = 0L;
    this.mRtmpUrl = "";
    this.mQuicChannel = false;
    this.mChannelType = 0;
    this.mEnableNearestIP = true;
    this.mIntelligentRoute = null;
    this.mLastNetworkType = 255;
    this.mNotifyListener = null;
    this.mContext = null;
    this.mIpList = null;
    this.mCurrentRecordIdx = 0;
    this.mRetryCount = 0;
    this.mConnectSuccessTimeStamps = 0L;
    this.mGoodPushTime = 30000L;
    this.mHandlerThread = null;
    this.mHandler = null;
    this.MSG_RECONNECT = 101;
    this.MSG_EVENT = 102;
    this.MSG_REPORT_STATUS = 103;
    this.MSG_RTMPPROXY_HEARTBEAT = 104;
    this.mLastTimeStamp = 0L;
    this.mLastUploadStats = null;
    this.mVecPendingNAL = new Vector();
    this.mParam = null;
    this.mConnectCountQuic = 0;
    this.mConnectCountTcp = 0;
    this.mUploadQualityReport = null;
    this.mRtmpProxyEnable = false;
    this.mAudioMuted = false;
    this.mRtmpProxyParam = new TXCStreamUploader.a(this);
    this.mRtmpProxyIPList = new Vector();
    this.mRtmpProxyIPIndex = 0;
    this.mRtmpProxyInstance = 0L;
    this.mRtmpMsgRecvThreadInstance = 0L;
    this.mRtmpProxyLock = new Object();
    this.mRtmpMsgRecvThreadLock = new Object();
    this.mContext = paramContext;
    h localh = paramh;
    if (paramh == null)
    {
      localh = new h();
      localh.a = 0;
      localh.g = 3;
      localh.f = 3;
      localh.h = 40;
      localh.i = 1000;
      localh.j = true;
    }
    this.mParam = localh;
    this.mThreadLock = new Object();
    this.mIntelligentRoute = new c();
    this.mIntelligentRoute.a = this;
    this.mUploaderInstance = 0L;
    this.mRetryCount = 0;
    this.mCurrentRecordIdx = 0;
    this.mIpList = null;
    this.mIsPushing = false;
    this.mThread = null;
    this.mRtmpUrl = null;
    this.mLastNetworkType = 255;
    this.mHandlerThread = null;
    this.mUploadQualityReport = new j(paramContext);
    i.a().a(paramContext);
    AppMethodBeat.o(67481);
  }

  private String getAddressFromUrl(String paramString)
  {
    AppMethodBeat.i(67499);
    if (paramString != null)
    {
      int i = paramString.indexOf("://");
      if (i != -1)
      {
        paramString = paramString.substring(i + 3);
        i = paramString.indexOf("/");
        if (i != -1)
        {
          paramString = paramString.substring(0, i);
          AppMethodBeat.o(67499);
        }
      }
    }
    while (true)
    {
      return paramString;
      paramString = "";
      AppMethodBeat.o(67499);
    }
  }

  private boolean getNextRtmpProxyIP()
  {
    boolean bool = false;
    AppMethodBeat.i(67509);
    this.mRtmpProxyParam.f = 234L;
    this.mRtmpProxyParam.g = 80L;
    if ((this.mRtmpProxyIPList != null) && (this.mRtmpProxyIPList.size() > 0))
      if (this.mRtmpProxyIPIndex >= this.mRtmpProxyIPList.size())
      {
        this.mRtmpProxyIPIndex = 0;
        AppMethodBeat.o(67509);
      }
    while (true)
    {
      return bool;
      Object localObject = this.mRtmpUrl.split("://");
      if (localObject.length < 2)
      {
        AppMethodBeat.o(67509);
      }
      else
      {
        String str = localObject[1].substring(localObject[1].indexOf("/"));
        localObject = (String)this.mRtmpProxyIPList.get(this.mRtmpProxyIPIndex);
        this.mRtmpProxyParam.h = ((String)localObject);
        this.mRtmpUrl = ("room://" + (String)localObject + str);
        this.mQuicChannel = true;
        this.mRtmpProxyIPIndex += 1;
        AppMethodBeat.o(67509);
        bool = true;
        continue;
        AppMethodBeat.o(67509);
      }
    }
  }

  private HashMap getParamsFromUrl(String paramString)
  {
    AppMethodBeat.i(67508);
    HashMap localHashMap = new HashMap();
    paramString = paramString.split("[?]");
    if ((paramString == null) || (paramString.length < 2) || (paramString[1] == null) || (paramString[1].length() == 0))
      AppMethodBeat.o(67508);
    while (true)
    {
      return localHashMap;
      for (String[] arrayOfString : paramString[1].split("[&]"))
        if (arrayOfString.indexOf("=") != -1)
        {
          arrayOfString = arrayOfString.split("[=]");
          if (arrayOfString.length == 2)
            localHashMap.put(arrayOfString[0], arrayOfString[1]);
        }
      AppMethodBeat.o(67508);
    }
  }

  private TXCStreamUploader.b getRtmpRealConnectInfo()
  {
    int i = 1;
    AppMethodBeat.i(67497);
    Object localObject;
    if (!this.mEnableNearestIP)
    {
      localObject = new TXCStreamUploader.b(this, this.mRtmpUrl, false);
      AppMethodBeat.o(67497);
    }
    while (true)
    {
      return localObject;
      if (this.mIpList == null)
      {
        localObject = new TXCStreamUploader.b(this, this.mRtmpUrl, false);
        AppMethodBeat.o(67497);
      }
      else if ((this.mCurrentRecordIdx >= this.mIpList.size()) || (this.mCurrentRecordIdx < 0))
      {
        localObject = new TXCStreamUploader.b(this, this.mRtmpUrl, false);
        AppMethodBeat.o(67497);
      }
      else
      {
        a locala = (a)this.mIpList.get(this.mCurrentRecordIdx);
        localObject = this.mRtmpUrl.split("://");
        if (localObject.length < 2)
        {
          localObject = new TXCStreamUploader.b(this, this.mRtmpUrl, false);
          AppMethodBeat.o(67497);
        }
        else
        {
          String[] arrayOfString = localObject[1].split("/");
          arrayOfString[0] = (locala.a + ":" + locala.b);
          StringBuilder localStringBuilder = new StringBuilder(arrayOfString[0]);
          while (i < arrayOfString.length)
          {
            localStringBuilder.append("/");
            localStringBuilder.append(arrayOfString[i]);
            i++;
          }
          localObject = new TXCStreamUploader.b(this, localObject[0] + "://" + localStringBuilder.toString(), locala.c);
          AppMethodBeat.o(67497);
        }
      }
    }
  }

  private Long getSpeed(long paramLong1, long paramLong2, long paramLong3)
  {
    long l = 0L;
    AppMethodBeat.i(67505);
    if (paramLong1 > paramLong2);
    while (true)
    {
      paramLong1 = l;
      if (paramLong3 > 0L)
        paramLong1 = 8L * paramLong2 * 1000L / (1024L * paramLong3);
      AppMethodBeat.o(67505);
      return Long.valueOf(paramLong1);
      paramLong2 -= paramLong1;
    }
  }

  private void internalReconnect(boolean paramBoolean)
  {
    AppMethodBeat.i(67501);
    if (!this.mIsPushing)
      AppMethodBeat.o(67501);
    while (true)
    {
      return;
      if (this.mRtmpProxyEnable)
      {
        if (this.mLastNetworkType != com.tencent.liteav.basic.util.b.c(this.mContext))
        {
          TXCLog.e("TXCStreamUploader", "reconnect network switch from " + this.mLastNetworkType + " to " + com.tencent.liteav.basic.util.b.c(this.mContext));
          this.mLastNetworkType = com.tencent.liteav.basic.util.b.c(this.mContext);
          this.mRetryCount = 0;
          sendNotifyEvent(11024, String.format("网络类型发生变化，需要重新进房", new Object[0]));
          AppMethodBeat.o(67501);
        }
        else if (this.mRetryCount < this.mParam.f)
        {
          this.mRetryCount += 1;
          TXCDRApi.reportEvent40003(this.mRtmpUrl, com.tencent.liteav.basic.datareport.a.F, 0, "reconnect rtmp-proxy server", "reconnect retry count:" + this.mRetryCount + " retry limit:" + this.mParam.f);
          sendNotifyEvent(11016);
          startPushTask(this.mRtmpUrl, this.mQuicChannel, 0);
          AppMethodBeat.o(67501);
        }
        else if (getNextRtmpProxyIP())
        {
          this.mRetryCount = 0;
          TXCDRApi.reportEvent40003(this.mRtmpUrl, com.tencent.liteav.basic.datareport.a.F, 0, "reconnect rtmp-proxy server", "reconnect retry count:" + this.mRetryCount + " retry limit:" + this.mParam.f);
          sendNotifyEvent(11016);
          startPushTask(this.mRtmpUrl, this.mQuicChannel, 0);
          AppMethodBeat.o(67501);
        }
        else
        {
          TXCDRApi.reportEvent40003(this.mRtmpUrl, com.tencent.liteav.basic.datareport.a.E, 0, "connect rtmp-proxy server failed", "try all addresses");
          sendNotifyEvent(11011);
          AppMethodBeat.o(67501);
        }
      }
      else
      {
        this.mUploadQualityReport.c();
        if ((this.mEnableNearestIP) && (this.mLastNetworkType != com.tencent.liteav.basic.util.b.c(this.mContext)))
        {
          TXCLog.e("TXCStreamUploader", "reconnect network switch from " + this.mLastNetworkType + " to " + com.tencent.liteav.basic.util.b.c(this.mContext));
          this.mLastNetworkType = com.tencent.liteav.basic.util.b.c(this.mContext);
          this.mIntelligentRoute.a(this.mRtmpUrl, this.mChannelType);
          this.mRetryCount = 0;
          AppMethodBeat.o(67501);
        }
        else
        {
          if (!this.mEnableNearestIP)
            paramBoolean = false;
          if (this.mQuicChannel == true)
            paramBoolean = true;
          if ((paramBoolean == true) && (!nextRecordIdx(true)))
          {
            TXCLog.e("TXCStreamUploader", "reconnect: try all addresses failed");
            TXCDRApi.reportEvent40003(this.mRtmpUrl, com.tencent.liteav.basic.datareport.a.E, 0, "connect upload server failed", "try all addresses failed");
          }
          TXCStreamUploader.b localb = getRtmpRealConnectInfo();
          String str1 = getAddressFromUrl(localb.a);
          StringBuilder localStringBuilder = new StringBuilder("reconnect change ip: ").append(str1).append(" enableNearestIP: ").append(this.mEnableNearestIP).append(" last channel type: ");
          if (this.mQuicChannel);
          for (String str2 = "Q Channel"; ; str2 = "TCP")
          {
            TXCLog.e("TXCStreamUploader", str2);
            if (this.mQuicChannel != true)
              break label670;
            TXCLog.e("TXCStreamUploader", "reconnect last channel type is Q Channel，ignore retry limit");
            TXCDRApi.reportEvent40003(this.mRtmpUrl, com.tencent.liteav.basic.datareport.a.F, 0, "reconnect upload server:".concat(String.valueOf(str1)), "last channel type is Q Channel");
            startPushTask(localb.a, localb.b, 0);
            sendNotifyEvent(11016);
            AppMethodBeat.o(67501);
            break;
          }
          label670: TXCLog.e("TXCStreamUploader", "reconnect retry count:" + this.mRetryCount + " retry limit:" + this.mParam.f);
          if (this.mRetryCount < this.mParam.f)
          {
            this.mRetryCount += 1;
            TXCDRApi.reportEvent40003(this.mRtmpUrl, com.tencent.liteav.basic.datareport.a.F, 0, "reconnect upload server:".concat(String.valueOf(str1)), "retry count:" + this.mRetryCount + " retry limit:" + this.mParam.f);
            startPushTask(localb.a, localb.b, 0);
            sendNotifyEvent(11016);
            AppMethodBeat.o(67501);
          }
          else
          {
            TXCLog.e("TXCStreamUploader", "reconnect: try all times failed");
            TXCDRApi.reportEvent40003(this.mRtmpUrl, com.tencent.liteav.basic.datareport.a.E, 0, "connect upload server failed", "try all times failed");
            sendNotifyEvent(11011);
            AppMethodBeat.o(67501);
          }
        }
      }
    }
  }

  private boolean isQCloudStreamUrl(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(67506);
    if ((paramString == null) || (paramString.length() == 0))
      AppMethodBeat.o(67506);
    while (true)
    {
      return bool;
      int i = paramString.indexOf("://");
      if (i != -1)
      {
        paramString = paramString.substring("://".length() + i);
        if ((paramString != null) && (paramString.startsWith("cloud.tencent.com")))
        {
          bool = true;
          AppMethodBeat.o(67506);
        }
      }
      else
      {
        AppMethodBeat.o(67506);
      }
    }
  }

  private native void nativeCacheJNIParams();

  private native void nativeEnableDrop(long paramLong, boolean paramBoolean);

  private native TXCStreamUploader.UploadStats nativeGetStats(long paramLong);

  private native long nativeInitRtmpMsgRecvThreadInstance(long paramLong1, long paramLong2);

  private native long nativeInitRtmpProxyInstance(long paramLong1, long paramLong2, String paramString1, long paramLong3, String paramString2, long paramLong4, long paramLong5, String paramString3, boolean paramBoolean, String paramString4);

  private native long nativeInitUploader(String paramString1, String paramString2, boolean paramBoolean1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean2, int paramInt8);

  private native void nativeOnThreadRun(long paramLong);

  private native void nativePushAAC(long paramLong1, byte[] paramArrayOfByte, long paramLong2);

  private native void nativePushNAL(long paramLong1, byte[] paramArrayOfByte, int paramInt, long paramLong2, long paramLong3, long paramLong4);

  private native void nativeReleaseJNIParams();

  private native void nativeRtmpMsgRecvThreadStart(long paramLong);

  private native void nativeRtmpMsgRecvThreadStop(long paramLong);

  private native void nativeRtmpProxyEnterRoom(long paramLong);

  private native void nativeRtmpProxyLeaveRoom(long paramLong);

  private native void nativeRtmpProxySendHeartBeat(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7, long paramLong8, long paramLong9, long paramLong10, long paramLong11);

  private native void nativeSendRtmpProxyMsg(long paramLong, byte[] paramArrayOfByte);

  private native void nativeSetSendStrategy(long paramLong, int paramInt, boolean paramBoolean);

  private native void nativeSetVideoDropParams(long paramLong, boolean paramBoolean, int paramInt1, int paramInt2);

  private native void nativeStopPush(long paramLong);

  private native void nativeUninitRtmpMsgRecvThreadInstance(long paramLong);

  private native void nativeUninitRtmpProxyInstance(long paramLong);

  private native void nativeUninitUploader(long paramLong);

  private boolean nextRecordIdx(boolean paramBoolean)
  {
    AppMethodBeat.i(67498);
    if ((this.mIpList == null) || (this.mIpList.size() == 0))
    {
      AppMethodBeat.o(67498);
      paramBoolean = false;
    }
    while (true)
    {
      return paramBoolean;
      if (paramBoolean == true)
      {
        a locala = (a)this.mIpList.get(this.mCurrentRecordIdx);
        locala.e += 1;
      }
      if (this.mCurrentRecordIdx + 1 < this.mIpList.size())
      {
        this.mCurrentRecordIdx += 1;
        AppMethodBeat.o(67498);
        paramBoolean = true;
      }
      else
      {
        AppMethodBeat.o(67498);
        paramBoolean = false;
      }
    }
  }

  private void onRtmpProxyRoomEvent(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(67513);
    if (paramInt1 == 1)
    {
      sendNotifyEvent(11021, String.format("已在房间中，[%d]", new Object[] { Integer.valueOf(paramInt2) }));
      AppMethodBeat.o(67513);
    }
    while (true)
    {
      return;
      if (paramInt1 == 2)
        sendNotifyEvent(11022, String.format("不在房间中，[%d]", new Object[] { Integer.valueOf(paramInt2) }));
      AppMethodBeat.o(67513);
    }
  }

  private void onRtmpProxyUserListPushed(TXCStreamUploader.RtmpProxyUserInfo[] paramArrayOfRtmpProxyUserInfo)
  {
    AppMethodBeat.i(67512);
    if (paramArrayOfRtmpProxyUserInfo == null)
      AppMethodBeat.o(67512);
    while (true)
    {
      return;
      if (!this.mIsPushing)
        AppMethodBeat.o(67512);
      else if ((!this.mRtmpProxyEnable) || (this.mRtmpProxyParam == null))
        AppMethodBeat.o(67512);
      else
        try
        {
          JSONArray localJSONArray = new org/json/JSONArray;
          localJSONArray.<init>();
          for (int i = 0; i < paramArrayOfRtmpProxyUserInfo.length; i++)
          {
            JSONObject localJSONObject = new org/json/JSONObject;
            localJSONObject.<init>();
            localJSONObject.put("userid", paramArrayOfRtmpProxyUserInfo[i].account);
            localJSONObject.put("playurl", paramArrayOfRtmpProxyUserInfo[i].playUrl);
            localJSONArray.put(i, localJSONObject);
          }
          paramArrayOfRtmpProxyUserInfo = new org/json/JSONObject;
          paramArrayOfRtmpProxyUserInfo.<init>();
          paramArrayOfRtmpProxyUserInfo.put("userlist", localJSONArray);
          sendNotifyEvent(11023, paramArrayOfRtmpProxyUserInfo.toString());
          AppMethodBeat.o(67512);
        }
        catch (Exception paramArrayOfRtmpProxyUserInfo)
        {
          AppMethodBeat.o(67512);
        }
    }
  }

  private void onSendRtmpProxyMsg(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(67511);
    synchronized (this.mThreadLock)
    {
      if (this.mUploaderInstance != 0L)
        nativeSendRtmpProxyMsg(this.mUploaderInstance, paramArrayOfByte);
      AppMethodBeat.o(67511);
      return;
    }
  }

  private void parseProxyInfo(String paramString)
  {
    AppMethodBeat.i(67507);
    if ((paramString == null) || (paramString.length() == 0) || (!paramString.startsWith("room")))
      AppMethodBeat.o(67507);
    while (true)
    {
      return;
      this.mRtmpProxyParam.i = isQCloudStreamUrl(paramString);
      Object localObject1 = getParamsFromUrl(paramString);
      if (localObject1 == null)
      {
        AppMethodBeat.o(67507);
        continue;
      }
      if (((HashMap)localObject1).containsKey("sdkappid"))
        this.mRtmpProxyParam.a = Long.valueOf((String)((HashMap)localObject1).get("sdkappid")).longValue();
      if ((!((HashMap)localObject1).containsKey("roomid")) || (!((HashMap)localObject1).containsKey("userid")) || (!((HashMap)localObject1).containsKey("roomsig")))
      {
        AppMethodBeat.o(67507);
        continue;
      }
      this.mRtmpProxyParam.d = Long.valueOf((String)((HashMap)localObject1).get("roomid")).longValue();
      this.mRtmpProxyParam.c = ((String)((HashMap)localObject1).get("userid"));
      if (((HashMap)localObject1).containsKey("bizbuf"));
      try
      {
        Object localObject2 = (String)((HashMap)localObject1).get("bizbuf");
        this.mRtmpProxyParam.j = URLDecoder.decode((String)localObject2, "UTF-8");
        try
        {
          label212: localObject1 = URLDecoder.decode((String)((HashMap)localObject1).get("roomsig"), "UTF-8");
          localObject2 = new org/json/JSONObject;
          ((JSONObject)localObject2).<init>((String)localObject1);
          this.mRtmpProxyParam.b = 0L;
          boolean bool = ((JSONObject)localObject2).has("Key");
          if (!bool)
          {
            AppMethodBeat.o(67507);
            continue;
          }
          this.mRtmpProxyParam.e = ((JSONObject)localObject2).optString("Key");
          localObject1 = ((JSONObject)localObject2).optJSONObject("RtmpProxy");
          if (localObject1 != null)
            if ((((JSONObject)localObject1).has("Ip")) && (((JSONObject)localObject1).has("Port")))
            {
              bool = ((JSONObject)localObject1).has("Type");
              if (bool);
            }
            else
            {
              AppMethodBeat.o(67507);
              continue;
            }
          Object localObject3 = ((JSONObject)localObject2).optJSONArray("AccessList");
          if ((localObject3 != null) && (((JSONArray)localObject3).length() > 0))
            for (int i = 0; i < ((JSONArray)localObject3).length(); i++)
            {
              Object localObject4 = ((JSONArray)localObject3).getJSONObject(i);
              if ((localObject4 != null) && (((JSONObject)localObject4).has("Ip")) && (((JSONObject)localObject4).has("Port")) && (((JSONObject)localObject4).has("Type")))
              {
                localObject2 = ((JSONObject)localObject4).optString("Ip");
                long l = ((JSONObject)localObject4).optLong("Port");
                if (((JSONObject)localObject4).optLong("Type") == 2L)
                {
                  Vector localVector = this.mRtmpProxyIPList;
                  localObject4 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject4).<init>();
                  localVector.add((String)localObject2 + ":" + l);
                }
              }
            }
          bool = this.mRtmpProxyParam.i;
          if (bool)
          {
            if (localObject1 == null)
            {
              AppMethodBeat.o(67507);
              continue;
            }
            paramString = paramString.substring(0, paramString.indexOf("?"));
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject2 = this.mRtmpProxyParam.a + "_" + this.mRtmpProxyParam.d + "_" + this.mRtmpProxyParam.c;
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            this.mRtmpUrl = (paramString + "/webrtc/" + (String)localObject2 + "?real_rtmp_ip=" + ((JSONObject)localObject1).optString("Ip") + "&real_rtmp_port=" + ((JSONObject)localObject1).optLong("Port") + "&tinyid=" + this.mRtmpProxyParam.b + "&srctinyid=0");
            getNextRtmpProxyIP();
          }
          while (true)
          {
            this.mRtmpProxyEnable = true;
            AppMethodBeat.o(67507);
            break;
            this.mRtmpUrl = paramString;
            this.mQuicChannel = false;
          }
        }
        catch (Exception paramString)
        {
          AppMethodBeat.o(67507);
        }
      }
      catch (Exception localException)
      {
        break label212;
      }
    }
  }

  private void postReconnectMsg(String paramString, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(67482);
    Message localMessage = new Message();
    localMessage.what = 101;
    localMessage.obj = paramString;
    if (paramBoolean);
    for (int i = 2; ; i = 1)
    {
      localMessage.arg1 = i;
      if (this.mHandler != null)
        this.mHandler.sendMessageDelayed(localMessage, paramInt);
      AppMethodBeat.o(67482);
      return;
    }
  }

  private void reconnect(boolean paramBoolean)
  {
    AppMethodBeat.i(67500);
    stopPushTask();
    if (this.mHandler != null)
      this.mHandler.postDelayed(new TXCStreamUploader.3(this, paramBoolean), this.mParam.g * 1000);
    AppMethodBeat.o(67500);
  }

  private void reportNetStatus()
  {
    AppMethodBeat.i(67504);
    long l1 = TXCTimeUtil.getTimeTick();
    long l2 = l1 - this.mLastTimeStamp;
    TXCStreamUploader.UploadStats localUploadStats = getUploadStats();
    long l3 = 0L;
    long l4 = 0L;
    long l5 = 0L;
    long l6;
    if (localUploadStats != null)
    {
      if (this.mLastUploadStats == null)
        break label447;
      l6 = getSpeed(this.mLastUploadStats.inVideoBytes, localUploadStats.inVideoBytes, l2).longValue();
      l3 = getSpeed(this.mLastUploadStats.inAudioBytes, localUploadStats.inAudioBytes, l2).longValue();
      l5 = getSpeed(this.mLastUploadStats.outVideoBytes, localUploadStats.outVideoBytes, l2).longValue();
      l2 = getSpeed(this.mLastUploadStats.outAudioBytes, localUploadStats.outAudioBytes, l2).longValue();
      l4 = l5;
      l5 = l2;
    }
    while (true)
    {
      setStatusValue(7001, Long.valueOf(l6));
      setStatusValue(7002, Long.valueOf(l3));
      setStatusValue(7003, Long.valueOf(l4));
      setStatusValue(7004, Long.valueOf(l5));
      setStatusValue(7005, Long.valueOf(localUploadStats.videoCacheLen));
      setStatusValue(7006, Long.valueOf(localUploadStats.audioCacheLen));
      setStatusValue(7007, Long.valueOf(localUploadStats.videoDropCount));
      setStatusValue(7008, Long.valueOf(localUploadStats.audioDropCount));
      setStatusValue(7009, Long.valueOf(localUploadStats.startTS));
      setStatusValue(7010, Long.valueOf(localUploadStats.dnsTS));
      setStatusValue(7011, Long.valueOf(localUploadStats.connTS));
      setStatusValue(7012, String.valueOf(localUploadStats.serverIP));
      if (this.mQuicChannel);
      for (l5 = 2L; ; l5 = 1L)
      {
        setStatusValue(7013, Long.valueOf(l5));
        setStatusValue(7014, localUploadStats.connectionID);
        setStatusValue(7015, localUploadStats.connectionStats);
        this.mUploadQualityReport.a(localUploadStats.videoDropCount, localUploadStats.audioDropCount);
        this.mUploadQualityReport.b(localUploadStats.videoCacheLen, localUploadStats.audioCacheLen);
        this.mLastTimeStamp = l1;
        this.mLastUploadStats = localUploadStats;
        if (this.mHandler != null)
          this.mHandler.sendEmptyMessageDelayed(103, 2000L);
        AppMethodBeat.o(67504);
        return;
      }
      label447: l6 = 0L;
    }
  }

  private void rtmpProxySendHeartBeat()
  {
    AppMethodBeat.i(67510);
    ??? = com.tencent.liteav.basic.util.b.a();
    long l1 = ???[0] / 10;
    long l2 = ???[1] / 10;
    long l3 = TXCStatus.d(getID(), 7004);
    long l4 = TXCStatus.d(getID(), 7003);
    long l5 = TXCStatus.d(getID(), 1001);
    long l6 = TXCStatus.d(getID(), 4001);
    long l7 = TXCStatus.d(getID(), 7006);
    long l8 = TXCStatus.d(getID(), 7005);
    long l9 = TXCStatus.d(getID(), 7008);
    long l10 = TXCStatus.d(getID(), 7007);
    synchronized (this.mRtmpProxyLock)
    {
      nativeRtmpProxySendHeartBeat(this.mRtmpProxyInstance, l1, l2, l3, l4, l5, l6, l7, l8, l9, l10);
      AppMethodBeat.o(67510);
      return;
    }
  }

  private void sendNotifyEvent(int paramInt)
  {
    AppMethodBeat.i(67503);
    if (paramInt == 0)
    {
      reconnect(false);
      AppMethodBeat.o(67503);
    }
    while (true)
    {
      return;
      if (paramInt != 1)
        break;
      reconnect(true);
      AppMethodBeat.o(67503);
    }
    if (paramInt == 11001)
      this.mConnectSuccessTimeStamps = TXCTimeUtil.getTimeTick();
    Bundle localBundle;
    if (this.mNotifyListener != null)
    {
      localBundle = new Bundle();
      switch (paramInt)
      {
      case 11004:
      case 11009:
      case 11010:
      case 11014:
      default:
        localBundle.putString("EVT_MSG", "UNKNOWN");
      case 11011:
      case 11012:
      case 11013:
      case 11015:
      case 11006:
      case 11001:
      case 11005:
      case 11003:
      case 11002:
      case 11007:
      case 11008:
      case 11016:
      }
    }
    while (true)
    {
      while (true)
      {
        localBundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
        com.tencent.liteav.basic.util.b.a(this.mNotifyListener, paramInt, localBundle);
        AppMethodBeat.o(67503);
        break;
        localBundle.putString("EVT_MSG", "所有IP都已经尝试失败,可以放弃治疗");
        paramInt = -1307;
        continue;
        localBundle.putString("EVT_MSG", "经连续多次重连失败，放弃重连");
        paramInt = -1307;
        continue;
        localBundle.putString("EVT_MSG", "超过30s没有数据发送，主动断开连接");
        paramInt = -1307;
        continue;
        localBundle.putString("EVT_MSG", "没有网络，请检测WiFi或移动数据是否开启");
        paramInt = -1307;
        continue;
        localBundle.putString("EVT_MSG", "连接服务器失败");
        paramInt = 3002;
        continue;
        paramInt = 1001;
        localBundle.putString("EVT_MSG", "已经连接rtmp服务器");
        continue;
        paramInt = 3003;
        localBundle.putString("EVT_MSG", "RTMP服务器握手失败");
        continue;
        localBundle.putString("EVT_MSG", "上行带宽不足，数据发送不及时");
        paramInt = 1101;
        continue;
        paramInt = 1002;
        localBundle.putString("EVT_MSG", "rtmp开始推流");
        continue;
        paramInt = 3004;
        localBundle.putString("EVT_MSG", "服务器拒绝连接请求，可能是该推流地址已经被占用或过期，或者防盗链错误");
        continue;
        if (this.mRtmpProxyEnable)
          synchronized (this.mRtmpMsgRecvThreadLock)
          {
            nativeRtmpMsgRecvThreadStart(this.mRtmpMsgRecvThreadInstance);
          }
        synchronized (this.mRtmpProxyLock)
        {
          nativeRtmpProxyEnterRoom(this.mRtmpProxyInstance);
          if (this.mHandler != null)
            this.mHandler.sendEmptyMessageDelayed(104, 2000L);
          AppMethodBeat.o(67503);
          break;
          localObject1 = finally;
          AppMethodBeat.o(67503);
          throw localObject1;
        }
      }
      paramInt = 1102;
      localObject2.putString("EVT_MSG", "启动网络重连");
    }
  }

  private void sendNotifyEvent(int paramInt, String paramString)
  {
    AppMethodBeat.i(67502);
    if ((paramString == null) || (paramString.isEmpty()))
    {
      sendNotifyEvent(paramInt);
      if (paramInt != 11002)
        break label267;
      paramString = getUploadStats();
      if (paramString != null)
        this.mUploadQualityReport.a(paramString.dnsparseTimeCost, paramString.connectTimeCost, paramString.handshakeTimeCost);
      AppMethodBeat.o(67502);
    }
    while (true)
    {
      return;
      Bundle localBundle = new Bundle();
      localBundle.putString("EVT_MSG", paramString);
      localBundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
      int i = paramInt;
      switch (paramInt)
      {
      default:
        i = paramInt;
      case 11007:
      case 11008:
      case 11009:
      case 11010:
      case 11011:
      case 11012:
      case 11013:
      case 11014:
      case 11015:
      case 11016:
      case 11020:
      case 11006:
      case 11017:
      case 11018:
      case 11021:
      case 11022:
      case 11023:
      case 11024:
      case 11019:
      }
      while (true)
      {
        com.tencent.liteav.basic.util.b.a(this.mNotifyListener, i, localBundle);
        paramInt = i;
        break;
        i = 3002;
        continue;
        i = 3005;
        continue;
        i = 3005;
        continue;
        i = 1018;
        continue;
        i = 1019;
        continue;
        i = 1020;
        continue;
        i = 1021;
        continue;
        i = -1313;
      }
      label267: if (paramInt == 11003)
        this.mUploadQualityReport.d();
      AppMethodBeat.o(67502);
    }
  }

  private void startPushTask(String paramString, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(67495);
    TXCLog.d("TXCStreamUploader", "start push task");
    if ((this.mQuicChannel != paramBoolean) && (this.mQuicChannel == true))
      TXCDRApi.reportEvent40003(this.mRtmpUrl, com.tencent.liteav.basic.datareport.a.M, 0, "switch video push channel from quic to tcp", "limits:" + this.mParam.f + " current:" + this.mRetryCount);
    if (paramBoolean)
    {
      paramInt = this.mConnectCountQuic + 1;
      this.mConnectCountQuic = paramInt;
      setStatusValue(7017, Long.valueOf(paramInt));
    }
    while (true)
    {
      this.mThread = new TXCStreamUploader.2(this, "RTMPUpload", paramBoolean, paramString);
      this.mThread.start();
      AppMethodBeat.o(67495);
      return;
      paramInt = this.mConnectCountTcp + 1;
      this.mConnectCountTcp = paramInt;
      setStatusValue(7018, Long.valueOf(paramInt));
    }
  }

  private void stopPushTask()
  {
    AppMethodBeat.i(67496);
    TXCLog.d("TXCStreamUploader", "stop push task");
    synchronized (this.mThreadLock)
    {
      this.mVecPendingNAL.removeAllElements();
      nativeStopPush(this.mUploaderInstance);
      AppMethodBeat.o(67496);
      return;
    }
  }

  private void tryResetRetryCount()
  {
    AppMethodBeat.i(67487);
    if ((this.mConnectSuccessTimeStamps != 0L) && (TXCTimeUtil.getTimeTick() - this.mConnectSuccessTimeStamps > this.mParam.f * (this.mParam.g + 13) * 1000))
    {
      this.mRetryCount = 0;
      this.mConnectSuccessTimeStamps = 0L;
      TXCLog.d("TXCStreamUploader", "reset retry count");
    }
    AppMethodBeat.o(67487);
  }

  public String getConfusionIP(String paramString)
  {
    AppMethodBeat.i(67484);
    if (paramString != null)
    {
      int i = paramString.indexOf(".");
      if (i != -1)
      {
        String str = paramString.substring(i + 1);
        i = str.indexOf(".");
        if (i != -1)
        {
          paramString = "A.B.".concat(String.valueOf(str.substring(i + 1)));
          AppMethodBeat.o(67484);
        }
      }
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(67484);
    }
  }

  public TXCStreamUploader.UploadStats getUploadStats()
  {
    AppMethodBeat.i(67494);
    synchronized (this.mThreadLock)
    {
      TXCStreamUploader.UploadStats localUploadStats = nativeGetStats(this.mUploaderInstance);
      if (localUploadStats != null)
      {
        if (this.mQuicChannel == true)
        {
          l = 2L;
          localUploadStats.channelType = l;
        }
      }
      else
      {
        AppMethodBeat.o(67494);
        return localUploadStats;
      }
      long l = 1L;
    }
  }

  public int init()
  {
    return 0;
  }

  public void onFetchDone(int paramInt, ArrayList<a> paramArrayList)
  {
    AppMethodBeat.i(67483);
    if (!this.mIsPushing)
    {
      AppMethodBeat.o(67483);
      return;
    }
    if (paramArrayList != null)
    {
      TXCLog.e("TXCStreamUploader", "onFetchDone: code = " + paramInt + " ip count = " + paramArrayList.size());
      if (paramInt == 0)
      {
        this.mIpList = paramArrayList;
        paramInt = paramArrayList.size();
        this.mCurrentRecordIdx = 0;
      }
    }
    while (true)
    {
      label95: int i;
      if (paramInt > 0)
      {
        paramArrayList = "";
        Iterator localIterator = this.mIpList.iterator();
        paramInt = 0;
        if (localIterator.hasNext())
        {
          a locala = (a)localIterator.next();
          i = paramInt;
          if (locala != null)
          {
            i = paramInt;
            if (locala.c)
            {
              i = paramInt;
              if (locala.a != null)
              {
                i = paramInt;
                if (locala.a.length() > 0)
                  i = paramInt + 1;
              }
            }
          }
          if (locala == null)
            break label293;
          paramArrayList = paramArrayList + " " + getConfusionIP(locala.a) + ":" + locala.b;
        }
      }
      label293: 
      while (true)
      {
        paramInt = i;
        break label95;
        setStatusValue(7016, Long.valueOf(paramInt));
        setStatusValue(7019, "{" + paramArrayList + " }");
        paramArrayList = getRtmpRealConnectInfo();
        postReconnectMsg(paramArrayList.a, paramArrayList.b, 0);
        AppMethodBeat.o(67483);
        break;
      }
      paramInt = 0;
    }
  }

  public void pushAAC(byte[] paramArrayOfByte, long paramLong)
  {
    AppMethodBeat.i(67488);
    tryResetRetryCount();
    synchronized (this.mThreadLock)
    {
      if (this.mPushStartTS == 0L)
        this.mPushStartTS = (paramLong - 3600000L);
      if ((!this.mAudioMuted) || (!this.mRtmpProxyEnable))
        nativePushAAC(this.mUploaderInstance, paramArrayOfByte, paramLong - this.mPushStartTS);
      AppMethodBeat.o(67488);
      return;
    }
  }

  public void pushNAL(com.tencent.liteav.basic.g.b paramb)
  {
    AppMethodBeat.i(67489);
    tryResetRetryCount();
    synchronized (this.mThreadLock)
    {
      if (this.mUploaderInstance != 0L)
      {
        if (this.mPushStartTS == 0L)
          this.mPushStartTS = (paramb.h - 3600000L);
        if ((paramb != null) && (paramb.a != null) && (paramb.a.length > 0))
          nativePushNAL(this.mUploaderInstance, paramb.a, paramb.b, paramb.e, paramb.g - this.mPushStartTS, paramb.h - this.mPushStartTS);
        AppMethodBeat.o(67489);
        return;
      }
      if (paramb.b == 0)
        this.mVecPendingNAL.removeAllElements();
      this.mVecPendingNAL.add(paramb);
    }
  }

  public void setAudioInfo(int paramInt1, int paramInt2)
  {
    if (this.mParam != null)
    {
      this.mParam.d = paramInt2;
      this.mParam.e = paramInt1;
    }
  }

  public void setAudioMute(boolean paramBoolean)
  {
    AppMethodBeat.i(67490);
    synchronized (this.mThreadLock)
    {
      this.mAudioMuted = paramBoolean;
      if ((this.mRtmpProxyEnable) && (this.mUploaderInstance != 0L))
      {
        if (!this.mParam.m)
          break label77;
        if (!this.mQuicChannel)
          break label72;
      }
      label72: for (int i = 3; ; i = 2)
      {
        nativeSetSendStrategy(this.mUploaderInstance, i, false);
        AppMethodBeat.o(67490);
        return;
      }
      label77: i = 1;
    }
  }

  public void setDropEanble(boolean paramBoolean)
  {
    AppMethodBeat.i(67491);
    StringBuilder localStringBuilder = new StringBuilder("drop enable ");
    if (paramBoolean)
      ??? = "yes";
    while (true)
    {
      TXCLog.d("TXCStreamUploader", (String)???);
      synchronized (this.mThreadLock)
      {
        nativeEnableDrop(this.mUploaderInstance, paramBoolean);
        AppMethodBeat.o(67491);
        return;
        ??? = "no";
      }
    }
  }

  public void setMode(int paramInt)
  {
    if (this.mParam != null)
      this.mParam.a = paramInt;
  }

  public void setNotifyListener(com.tencent.liteav.basic.d.a parama)
  {
    AppMethodBeat.i(67480);
    this.mNotifyListener = new WeakReference(parama);
    AppMethodBeat.o(67480);
  }

  public void setRetryInterval(int paramInt)
  {
    if (this.mParam != null)
      this.mParam.g = paramInt;
  }

  public void setRetryTimes(int paramInt)
  {
    if (this.mParam != null)
      this.mParam.f = paramInt;
  }

  public void setSendStrategy(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(67493);
    this.mParam.m = paramBoolean1;
    this.mParam.n = paramBoolean2;
    this.mUploadQualityReport.a(paramBoolean1);
    int i;
    if (paramBoolean1)
      if (this.mQuicChannel)
        i = 3;
    while (true)
    {
      int j = i;
      if (!this.mRtmpProxyEnable)
        if (this.mIpList != null)
        {
          j = i;
          if (this.mIpList.size() != 0);
        }
        else
        {
          j = 1;
        }
      synchronized (this.mThreadLock)
      {
        if (this.mUploaderInstance != 0L)
          nativeSetSendStrategy(this.mUploaderInstance, j, paramBoolean2);
        setStatusValue(7020, Long.valueOf(j));
        AppMethodBeat.o(67493);
        return;
        i = 2;
        continue;
        i = 1;
      }
    }
  }

  public void setVideoDropParams(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(67492);
    ??? = new StringBuilder("drop params wait i frame:");
    String str;
    if (paramBoolean)
      str = "yes";
    while (true)
    {
      TXCLog.d("TXCStreamUploader", str + " max video count:" + paramInt1 + " max video cache time: " + paramInt2 + " ms");
      synchronized (this.mThreadLock)
      {
        this.mParam.j = paramBoolean;
        this.mParam.h = paramInt1;
        this.mParam.i = paramInt2;
        if (this.mUploaderInstance != 0L)
          nativeSetVideoDropParams(this.mUploaderInstance, this.mParam.j, this.mParam.h, this.mParam.i);
        AppMethodBeat.o(67492);
        return;
        str = "no";
      }
    }
  }

  public String start(String paramString, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(67485);
    if (this.mIsPushing == true)
    {
      paramString = this.mRtmpUrl;
      AppMethodBeat.o(67485);
      return paramString;
    }
    this.mIsPushing = true;
    this.mConnectSuccessTimeStamps = 0L;
    this.mRetryCount = 0;
    this.mRtmpUrl = paramString;
    this.mChannelType = paramInt;
    this.mPushStartTS = 0L;
    this.mConnectCountQuic = 0;
    this.mConnectCountTcp = 0;
    this.mRtmpProxyEnable = false;
    this.mRtmpProxyParam.a();
    this.mRtmpProxyIPList.clear();
    this.mRtmpProxyIPIndex = 0;
    this.mRtmpProxyInstance = 0L;
    this.mRtmpMsgRecvThreadInstance = 0L;
    setStatusValue(7016, Long.valueOf(0L));
    setStatusValue(7017, Long.valueOf(0L));
    setStatusValue(7018, Long.valueOf(0L));
    this.mUploadQualityReport.a();
    StringBuilder localStringBuilder = new StringBuilder("start push with url:").append(this.mRtmpUrl).append(" enable nearest ip:");
    if (paramBoolean);
    for (String str = "yes"; ; str = "no")
    {
      TXCLog.d("TXCStreamUploader", str + "channel type:" + paramInt);
      if (com.tencent.liteav.basic.util.b.c(this.mContext) != 255)
        break label245;
      sendNotifyEvent(11015);
      paramString = this.mRtmpUrl;
      AppMethodBeat.o(67485);
      break;
    }
    label245: this.mEnableNearestIP = paramBoolean;
    if (this.mHandlerThread == null)
    {
      this.mHandlerThread = new HandlerThread("RTMP_PUSH");
      this.mHandlerThread.start();
    }
    this.mHandler = new TXCStreamUploader.1(this, this.mHandlerThread.getLooper());
    parseProxyInfo(paramString);
    if (this.mRtmpProxyEnable)
    {
      this.mLastNetworkType = com.tencent.liteav.basic.util.b.c(this.mContext);
      nativeCacheJNIParams();
      label324: startPushTask(this.mRtmpUrl, this.mQuicChannel, 0);
    }
    while (true)
    {
      this.mHandler.sendEmptyMessageDelayed(103, 2000L);
      paramString = this.mRtmpUrl;
      AppMethodBeat.o(67485);
      break;
      if ((!this.mEnableNearestIP) || (this.mLastNetworkType == com.tencent.liteav.basic.util.b.c(this.mContext)))
        break label324;
      TXCLog.d("TXCStreamUploader", "fetching nearest ip list");
      this.mLastNetworkType = com.tencent.liteav.basic.util.b.c(this.mContext);
      this.mIntelligentRoute.a(paramString, paramInt);
    }
  }

  public void stop()
  {
    AppMethodBeat.i(67486);
    if (!this.mIsPushing)
      AppMethodBeat.o(67486);
    while (true)
    {
      return;
      this.mIsPushing = false;
      TXCLog.d("TXCStreamUploader", "stop push");
      if (this.mRtmpProxyEnable)
        synchronized (this.mRtmpProxyLock)
        {
          nativeRtmpProxyLeaveRoom(this.mRtmpProxyInstance);
        }
      synchronized (this.mThreadLock)
      {
        nativeStopPush(this.mUploaderInstance);
        this.mPushStartTS = 0L;
        if (this.mHandlerThread != null)
        {
          this.mHandlerThread.getLooper().quit();
          this.mHandlerThread = null;
        }
        if (this.mHandler != null)
          this.mHandler = null;
        if (this.mRtmpProxyEnable)
          nativeReleaseJNIParams();
        this.mUploadQualityReport.c();
        this.mUploadQualityReport.a();
        AppMethodBeat.o(67486);
        continue;
        localObject2 = finally;
        AppMethodBeat.o(67486);
        throw localObject2;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.network.TXCStreamUploader
 * JD-Core Version:    0.6.2
 */