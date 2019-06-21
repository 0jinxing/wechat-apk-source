package com.tencent.rtmp;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Surface;
import com.tencent.liteav.audio.TXCAudioUGCRecorder;
import com.tencent.liteav.basic.c.e;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.TXCStatus;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.c.a;
import com.tencent.liteav.d;
import com.tencent.liteav.f;
import com.tencent.liteav.m;
import com.tencent.liteav.network.TXCStreamUploader;
import com.tencent.liteav.network.h;
import com.tencent.liteav.qos.TXCQoS;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.ugc.TXRecordCommon.ITXVideoRecordListener;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class TXLivePusher
  implements com.tencent.liteav.basic.d.a, c.a, m, com.tencent.liteav.qos.a
{
  public static final int RGB_BGRA = 4;
  public static final int RGB_RGBA = 5;
  private static final byte SEI_MSG_TYPE = -14;
  private static final String TAG;
  public static final int YUV_420P = 3;
  public static final int YUV_420SP = 1;
  public static final int YUV_420YpCbCr = 2;
  private TXLivePusher.AudioCustomProcessListener mAudioProcessListener;
  private float mBgmPitch;
  private Vector<String> mCallFuncBeforeStartPush;
  private com.tencent.liteav.c mCaptureAndEnc;
  private TXLivePushConfig mConfig;
  private Context mContext;
  private d mDataReport;
  private String mID;
  private boolean mIsRecording;
  private HashMap<Integer, Long> mLastReportTime;
  private ITXLivePushListener mListener;
  private com.tencent.liteav.muxer.c mMP4Muxer;
  private Handler mMainHandler;
  private ArrayList<TXLivePusher.MsgInfo> mMsgArray;
  private f mNewConfig;
  private boolean mNotifyStatus;
  private TXLivePusher.VideoCustomProcessListener mPreprocessListener;
  private String mPushUrl;
  private TXCQoS mQos;
  private TXRecordCommon.ITXVideoRecordListener mRecordListener;
  private long mRecordStartTime;
  private Runnable mSnapShotTimeOutRunnable;
  private boolean mSnapshotRunning;
  private boolean mStartMuxer;
  private TXCStreamUploader mStreamUploader;
  private TXCloudVideoView mTXCloudVideoView;
  private HashSet<String> mUserList;
  private String mVideoFilePath;
  private int mVideoQuality;
  private int mVoiceEnvironment;
  private int mVoiceKind;

  static
  {
    AppMethodBeat.i(65927);
    TAG = TXLivePusher.class.getSimpleName();
    AppMethodBeat.o(65927);
  }

  public TXLivePusher(Context paramContext)
  {
    AppMethodBeat.i(65825);
    this.mConfig = null;
    this.mListener = null;
    this.mVideoQuality = -1;
    this.mNewConfig = null;
    this.mCaptureAndEnc = null;
    this.mStreamUploader = null;
    this.mContext = null;
    this.mMainHandler = null;
    this.mQos = null;
    this.mDataReport = null;
    this.mPushUrl = "";
    this.mID = "";
    this.mSnapshotRunning = false;
    this.mVoiceKind = -1;
    this.mVoiceEnvironment = -1;
    this.mBgmPitch = 0.0F;
    this.mCallFuncBeforeStartPush = new Vector();
    this.mUserList = new HashSet();
    this.mLastReportTime = new HashMap();
    this.mMsgArray = new ArrayList();
    this.mSnapShotTimeOutRunnable = new TXLivePusher.2(this);
    this.mMP4Muxer = null;
    this.mStartMuxer = false;
    this.mVideoFilePath = "";
    this.mRecordStartTime = 0L;
    this.mIsRecording = false;
    this.mNotifyStatus = false;
    TXCLog.init();
    this.mNewConfig = new f();
    this.mContext = paramContext.getApplicationContext();
    this.mMainHandler = new Handler(Looper.getMainLooper());
    this.mCaptureAndEnc = new com.tencent.liteav.c(this.mContext);
    this.mCaptureAndEnc.a(this);
    e.a().a(null, this.mContext);
    this.mLastReportTime.put(Integer.valueOf(-1303), Long.valueOf(0L));
    this.mLastReportTime.put(Integer.valueOf(1101), Long.valueOf(0L));
    this.mLastReportTime.put(Integer.valueOf(1006), Long.valueOf(0L));
    AppMethodBeat.o(65825);
  }

  @TargetApi(16)
  private void addAudioTrack()
  {
    AppMethodBeat.i(65900);
    MediaFormat localMediaFormat = com.tencent.liteav.basic.util.b.a(TXCAudioUGCRecorder.getInstance().getSampleRate(), TXCAudioUGCRecorder.getInstance().getChannels(), 2);
    if (this.mMP4Muxer != null)
      this.mMP4Muxer.b(localMediaFormat);
    AppMethodBeat.o(65900);
  }

  private byte[] add_emulation_prevention_three_byte(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(65919);
    int i = paramArrayOfByte.length * 4 / 3 + 2;
    byte[] arrayOfByte = new byte[i];
    int j = 0;
    int n;
    for (int k = 0; (j < paramArrayOfByte.length) && (k < i); k = n + 1)
    {
      int m = j;
      n = k;
      if (j + 3 < paramArrayOfByte.length)
      {
        m = j;
        n = k;
        if (paramArrayOfByte[j] == 0)
        {
          m = j;
          n = k;
          if (paramArrayOfByte[(j + 1)] == 0)
          {
            m = j;
            n = k;
            if (paramArrayOfByte[(j + 2)] >= 0)
            {
              m = j;
              n = k;
              if (paramArrayOfByte[(j + 2)] <= 3)
              {
                int i1 = k + 1;
                n = j + 1;
                arrayOfByte[k] = ((byte)paramArrayOfByte[j]);
                k = i1 + 1;
                m = n + 1;
                arrayOfByte[i1] = ((byte)paramArrayOfByte[n]);
                n = k + 1;
                arrayOfByte[k] = ((byte)3);
              }
            }
          }
        }
      }
      arrayOfByte[n] = ((byte)paramArrayOfByte[m]);
      j = m + 1;
    }
    paramArrayOfByte = new byte[k];
    System.arraycopy(arrayOfByte, 0, paramArrayOfByte, 0, k);
    AppMethodBeat.o(65919);
    return paramArrayOfByte;
  }

  private byte[] appendSEIBuffer(int paramInt, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(65922);
    byte[] arrayOfByte1 = intToBytes(paramInt);
    byte[] arrayOfByte2 = new byte[arrayOfByte1.length + 1 + paramArrayOfByte.length + 1];
    arrayOfByte2[0] = ((byte)-14);
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 1, arrayOfByte1.length);
    paramInt = arrayOfByte1.length + 1;
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte2, paramInt, paramArrayOfByte.length);
    arrayOfByte2[(paramInt + paramArrayOfByte.length)] = ((byte)-128);
    AppMethodBeat.o(65922);
    return arrayOfByte2;
  }

  private void applyConfig()
  {
    int i = 5;
    int j = 1;
    AppMethodBeat.i(65916);
    if (this.mCaptureAndEnc == null)
      AppMethodBeat.o(65916);
    while (true)
    {
      return;
      this.mCaptureAndEnc.a(this.mNewConfig);
      if (this.mCaptureAndEnc.i())
      {
        int k;
        if (this.mStreamUploader != null)
        {
          if (!this.mNewConfig.I)
            break label270;
          k = this.mNewConfig.o;
          int m = this.mNewConfig.p;
          if (k >= 5)
            break label262;
          label84: if (m <= 1)
            break label267;
          m = j;
          label93: this.mStreamUploader.setRetryInterval(m);
          this.mStreamUploader.setRetryTimes(i);
          this.mStreamUploader.setVideoDropParams(false, this.mNewConfig.h, 1000);
        }
        while (true)
        {
          this.mStreamUploader.setSendStrategy(this.mNewConfig.I, this.mNewConfig.J);
          if (this.mQos == null)
            break label385;
          this.mQos.stop();
          this.mQos.setAutoAdjustBitrate(this.mNewConfig.g);
          this.mQos.setAutoAdjustStrategy(this.mNewConfig.f);
          this.mQos.setDefaultVideoResolution(this.mNewConfig.k);
          this.mQos.setVideoEncBitrate(this.mNewConfig.e, this.mNewConfig.d, this.mNewConfig.c);
          if (!this.mNewConfig.g)
            break label385;
          this.mQos.start(2000L);
          AppMethodBeat.o(65916);
          break;
          label262: i = k;
          break label84;
          label267: break label93;
          label270: this.mStreamUploader.setRetryInterval(this.mNewConfig.p);
          this.mStreamUploader.setRetryTimes(this.mNewConfig.o);
          this.mStreamUploader.setVideoDropParams(true, 40, 3000);
        }
      }
      if ((this.mNewConfig.K & 0x1) != 0)
      {
        if (this.mStreamUploader != null)
        {
          this.mStreamUploader.setAudioInfo(this.mNewConfig.q, this.mNewConfig.r);
          AppMethodBeat.o(65916);
        }
      }
      else
      {
        if (this.mStreamUploader != null)
          this.mStreamUploader.setAudioInfo(this.mNewConfig.q, 1);
        label385: AppMethodBeat.o(65916);
      }
    }
  }

  private void callbackRecordFail()
  {
    AppMethodBeat.i(65898);
    this.mMainHandler.post(new TXLivePusher.5(this));
    AppMethodBeat.o(65898);
  }

  private void callbackRecordSuccess(String paramString1, String paramString2)
  {
    AppMethodBeat.i(65899);
    this.mMainHandler.post(new TXLivePusher.6(this, paramString1, paramString2));
    AppMethodBeat.o(65899);
  }

  private int getAdjustStrategy(boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 1;
    if (paramBoolean1 == true)
      if (paramBoolean2 != true);
    while (true)
    {
      return i;
      i = 0;
      continue;
      i = -1;
    }
  }

  private int getQuicMode(int paramInt)
  {
    AppMethodBeat.i(65923);
    switch (paramInt)
    {
    default:
      paramInt = 0;
    case 1:
    case 2:
    case 3:
    case 6:
    case 4:
    case 5:
    }
    while (true)
    {
      AppMethodBeat.o(65923);
      return paramInt;
      paramInt = (int)com.tencent.liteav.basic.f.b.a().a("QUICMode", "Live");
      continue;
      paramInt = (int)com.tencent.liteav.basic.f.b.a().a("QUICMode", "Live");
      continue;
      paramInt = (int)com.tencent.liteav.basic.f.b.a().a("QUICMode", "Live");
      continue;
      paramInt = (int)com.tencent.liteav.basic.f.b.a().a("QUICMode", "RTC");
      continue;
      paramInt = (int)com.tencent.liteav.basic.f.b.a().a("QUICMode", "LinkMain");
      continue;
      paramInt = (int)com.tencent.liteav.basic.f.b.a().a("QUICMode", "LinkSub");
    }
  }

  private byte[] intToBytes(int paramInt)
  {
    int i = paramInt / 255 + 1;
    byte[] arrayOfByte = new byte[i];
    for (int j = 0; j < i - 1; j++)
      arrayOfByte[j] = ((byte)-1);
    arrayOfByte[(i - 1)] = ((byte)(byte)(paramInt % 255 & 0xFF));
    return arrayOfByte;
  }

  private void postBitmapToMainThread(TXLivePusher.ITXSnapshotListener paramITXSnapshotListener, Bitmap paramBitmap)
  {
    AppMethodBeat.i(65902);
    if (paramITXSnapshotListener == null)
      AppMethodBeat.o(65902);
    while (true)
    {
      return;
      new Handler(Looper.getMainLooper()).post(new TXLivePusher.8(this, paramITXSnapshotListener, paramBitmap));
      AppMethodBeat.o(65902);
    }
  }

  private void recordVideoData(com.tencent.liteav.basic.g.b paramb, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(65901);
    if (this.mRecordStartTime == 0L)
      this.mRecordStartTime = paramb.g;
    long l1 = paramb.g;
    long l2 = this.mRecordStartTime;
    int i;
    if (paramb.k == null)
    {
      if (paramb.b != 0)
        break label111;
      i = 1;
    }
    while (true)
    {
      this.mMP4Muxer.b(paramArrayOfByte, 0, paramArrayOfByte.length, paramb.g * 1000L, i);
      this.mMainHandler.post(new Runnable()
      {
        public void run()
        {
          AppMethodBeat.i(65592);
          if (TXLivePusher.this.mRecordListener != null)
            TXLivePusher.this.mRecordListener.onRecordProgress(this.val$progress);
          AppMethodBeat.o(65592);
        }
      });
      AppMethodBeat.o(65901);
      return;
      i = paramb.k.flags;
      continue;
      label111: i = 0;
    }
  }

  private void setAdjustStrategy(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(65903);
    int i = getAdjustStrategy(paramBoolean1, paramBoolean2);
    if (i == -1)
    {
      this.mConfig.setAutoAdjustBitrate(false);
      this.mConfig.setAutoAdjustStrategy(-1);
      AppMethodBeat.o(65903);
    }
    while (true)
    {
      return;
      this.mConfig.setAutoAdjustBitrate(true);
      this.mConfig.setAutoAdjustStrategy(i);
      AppMethodBeat.o(65903);
    }
  }

  private void startDataReportModule()
  {
    AppMethodBeat.i(65911);
    this.mDataReport = new d(this.mContext);
    this.mDataReport.d(this.mID);
    this.mDataReport.a(this.mNewConfig.c);
    this.mDataReport.b(this.mNewConfig.q);
    this.mDataReport.a(this.mNewConfig.a, this.mNewConfig.b);
    this.mDataReport.a(this.mPushUrl);
    this.mDataReport.a();
    AppMethodBeat.o(65911);
  }

  private void startEncoder()
  {
    AppMethodBeat.i(65913);
    if (this.mCaptureAndEnc != null)
    {
      this.mCaptureAndEnc.setID(this.mID);
      this.mCaptureAndEnc.a(this);
      this.mCaptureAndEnc.b(this.mVoiceKind, this.mVoiceEnvironment);
      this.mCaptureAndEnc.b(this.mBgmPitch);
      this.mCaptureAndEnc.e();
    }
    AppMethodBeat.o(65913);
  }

  private void startNetworkModule()
  {
    int i = 5;
    int j = 1;
    AppMethodBeat.i(65907);
    h localh = new h();
    localh.d = com.tencent.liteav.audio.b.a().d();
    localh.e = com.tencent.liteav.audio.b.a().e();
    localh.a = 0;
    localh.c = 20;
    localh.b = 0;
    localh.f = 3;
    localh.j = true;
    localh.l = true;
    localh.k = false;
    localh.h = 40;
    localh.i = 5000;
    localh.m = this.mNewConfig.I;
    localh.n = this.mNewConfig.J;
    localh.o = getQuicMode(this.mVideoQuality);
    this.mStreamUploader = new TXCStreamUploader(this.mContext, localh);
    this.mStreamUploader.setID(this.mID);
    int m;
    if ((this.mNewConfig.K & 0x1) != 0)
    {
      if (this.mStreamUploader != null)
        this.mStreamUploader.setAudioInfo(this.mNewConfig.q, this.mNewConfig.r);
      this.mStreamUploader.setNotifyListener(this);
      if ((this.mConfig.mEnablePureAudioPush) && (this.mCaptureAndEnc != null))
        this.mStreamUploader.setAudioMute(this.mCaptureAndEnc.m());
      this.mPushUrl = this.mStreamUploader.start(this.mPushUrl, this.mNewConfig.G, this.mNewConfig.H);
      if (this.mNewConfig.F)
        this.mStreamUploader.setMode(1);
      if (!this.mNewConfig.I)
        break label414;
      int k = this.mNewConfig.o;
      m = this.mNewConfig.p;
      if (k >= 5)
        break label405;
      k = i;
      label311: if (m <= 1)
        break label408;
      label317: this.mStreamUploader.setRetryInterval(j);
      this.mStreamUploader.setRetryTimes(k);
      this.mStreamUploader.setVideoDropParams(false, this.mNewConfig.h, 1000);
    }
    while (true)
    {
      this.mStreamUploader.setSendStrategy(this.mNewConfig.I, this.mNewConfig.J);
      AppMethodBeat.o(65907);
      return;
      if (this.mStreamUploader == null)
        break;
      this.mStreamUploader.setAudioInfo(this.mNewConfig.q, 1);
      break;
      label405: break label311;
      label408: j = m;
      break label317;
      label414: this.mStreamUploader.setRetryInterval(this.mNewConfig.p);
      this.mStreamUploader.setRetryTimes(this.mNewConfig.o);
      this.mStreamUploader.setVideoDropParams(true, 40, 3000);
    }
  }

  private void startQosModule()
  {
    AppMethodBeat.i(65909);
    this.mQos = new TXCQoS(true);
    this.mQos.setListener(this);
    this.mQos.setNotifyListener(this);
    this.mQos.setAutoAdjustBitrate(this.mNewConfig.g);
    this.mQos.setAutoAdjustStrategy(this.mNewConfig.f);
    this.mQos.setDefaultVideoResolution(this.mNewConfig.k);
    this.mQos.setVideoEncBitrate(this.mNewConfig.e, this.mNewConfig.d, this.mNewConfig.c);
    if (this.mNewConfig.g)
      this.mQos.start(2000L);
    AppMethodBeat.o(65909);
  }

  private void startStatusNotify()
  {
    AppMethodBeat.i(65905);
    this.mNotifyStatus = true;
    if (this.mMainHandler != null)
      this.mMainHandler.postDelayed(new TXLivePusher.9(this), 2000L);
    AppMethodBeat.o(65905);
  }

  private void statusNotify()
  {
    AppMethodBeat.i(65906);
    Object localObject = com.tencent.liteav.basic.util.b.a();
    int i = localObject[0] / 10;
    int j = localObject[1] / 10;
    String str = i + "/" + j + "%";
    int k = TXCStatus.d(this.mID, 7004);
    int m = TXCStatus.d(this.mID, 7003);
    int n = TXCStatus.d(this.mID, 7002);
    int i1 = TXCStatus.d(this.mID, 7001);
    int i2 = TXCStatus.d(this.mID, 7007);
    j = TXCStatus.d(this.mID, 7005);
    i = TXCStatus.d(this.mID, 7006);
    localObject = TXCStatus.c(this.mID, 7012);
    double d1 = TXCStatus.e(this.mID, 4001);
    int i3 = TXCStatus.d(this.mID, 4003);
    Bundle localBundle = new Bundle();
    localBundle.putInt("NET_SPEED", k + m);
    localBundle.putInt("VIDEO_FPS", (int)d1);
    double d2 = d1;
    if (d1 < 1.0D)
      d2 = 15.0D;
    localBundle.putInt("VIDEO_GOP", (int)(i3 * 10 / (int)d2 / 10.0F + 0.5D));
    localBundle.putInt("DROP_SIZE", i2);
    localBundle.putInt("VIDEO_BITRATE", i1);
    localBundle.putInt("AUDIO_BITRATE", n);
    localBundle.putInt("CODEC_CACHE", i);
    localBundle.putInt("CACHE_SIZE", j);
    localBundle.putCharSequence("SERVER_IP", (CharSequence)localObject);
    localBundle.putCharSequence("CPU_USAGE", str);
    if (this.mCaptureAndEnc != null)
    {
      localBundle.putString("AUDIO_PLAY_INFO", this.mCaptureAndEnc.d());
      localBundle.putInt("VIDEO_WIDTH", this.mCaptureAndEnc.b());
      localBundle.putInt("VIDEO_HEIGHT", this.mCaptureAndEnc.c());
    }
    if (this.mTXCloudVideoView != null)
      this.mTXCloudVideoView.setLogText(localBundle, null, 0);
    if (this.mListener != null)
      this.mListener.onNetStatus(localBundle);
    if (this.mDataReport != null)
      this.mDataReport.e();
    if ((this.mMainHandler != null) && (this.mNotifyStatus))
      this.mMainHandler.postDelayed(new TXLivePusher.10(this), 2000L);
    AppMethodBeat.o(65906);
  }

  private void stopDataReportModule()
  {
    AppMethodBeat.i(65912);
    if (this.mDataReport != null)
    {
      this.mDataReport.b();
      this.mDataReport = null;
    }
    AppMethodBeat.o(65912);
  }

  private void stopEncoder()
  {
    AppMethodBeat.i(65914);
    if (this.mCaptureAndEnc != null)
    {
      this.mCaptureAndEnc.a(null);
      this.mCaptureAndEnc.f();
      this.mCaptureAndEnc.a(null);
    }
    AppMethodBeat.o(65914);
  }

  private void stopNetworkModule()
  {
    AppMethodBeat.i(65908);
    if (this.mStreamUploader != null)
    {
      this.mStreamUploader.stop();
      this.mStreamUploader.setNotifyListener(null);
      this.mStreamUploader = null;
    }
    AppMethodBeat.o(65908);
  }

  private void stopQosModule()
  {
    AppMethodBeat.i(65910);
    if (this.mQos != null)
    {
      this.mQos.stop();
      this.mQos.setListener(null);
      this.mQos.setNotifyListener(null);
      this.mQos = null;
    }
    AppMethodBeat.o(65910);
  }

  private void stopStatusNotify()
  {
    this.mNotifyStatus = false;
  }

  private byte[] transferAvccToAnnexb(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(65918);
    int i = paramArrayOfByte.length;
    byte[] arrayOfByte = new byte[i];
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, i);
    int k;
    for (int j = 0; j + 4 < i; j = j + k + 4)
    {
      k = ByteBuffer.wrap(paramArrayOfByte, j, 4).getInt();
      if (j + 4 + k <= i)
      {
        arrayOfByte[j] = ((byte)0);
        arrayOfByte[(j + 1)] = ((byte)0);
        arrayOfByte[(j + 2)] = ((byte)0);
        arrayOfByte[(j + 3)] = ((byte)1);
      }
    }
    AppMethodBeat.o(65918);
    return arrayOfByte;
  }

  private void transferConfig(TXLivePushConfig paramTXLivePushConfig)
  {
    AppMethodBeat.i(65915);
    f localf = this.mNewConfig;
    localf.c = paramTXLivePushConfig.mVideoBitrate;
    localf.e = paramTXLivePushConfig.mMinVideoBitrate;
    localf.d = paramTXLivePushConfig.mMaxVideoBitrate;
    localf.f = paramTXLivePushConfig.mAutoAdjustStrategy;
    localf.g = paramTXLivePushConfig.mAutoAdjustBitrate;
    localf.h = paramTXLivePushConfig.mVideoFPS;
    localf.i = paramTXLivePushConfig.mVideoEncodeGop;
    localf.j = paramTXLivePushConfig.mHardwareAccel;
    localf.k = paramTXLivePushConfig.mVideoResolution;
    localf.n = paramTXLivePushConfig.mEnableVideoHardEncoderMainProfile;
    localf.q = paramTXLivePushConfig.mAudioSample;
    localf.r = paramTXLivePushConfig.mAudioChannels;
    localf.s = paramTXLivePushConfig.mEnableAec;
    localf.w = paramTXLivePushConfig.mPauseFlag;
    localf.v = paramTXLivePushConfig.mPauseFps;
    localf.t = paramTXLivePushConfig.mPauseImg;
    localf.u = paramTXLivePushConfig.mPauseTime;
    localf.F = paramTXLivePushConfig.mEnablePureAudioPush;
    localf.D = paramTXLivePushConfig.mTouchFocus;
    localf.E = paramTXLivePushConfig.mEnableZoom;
    localf.x = paramTXLivePushConfig.mWatermark;
    localf.y = paramTXLivePushConfig.mWatermarkX;
    localf.z = paramTXLivePushConfig.mWatermarkY;
    localf.A = paramTXLivePushConfig.mWatermarkXF;
    localf.B = paramTXLivePushConfig.mWatermarkYF;
    localf.C = paramTXLivePushConfig.mWatermarkWidth;
    localf.l = paramTXLivePushConfig.mHomeOrientation;
    localf.G = paramTXLivePushConfig.mEnableNearestIP;
    localf.H = paramTXLivePushConfig.mRtmpChannelType;
    localf.o = paramTXLivePushConfig.mConnectRetryCount;
    localf.p = paramTXLivePushConfig.mConnectRetryInterval;
    localf.m = paramTXLivePushConfig.mFrontCamera;
    localf.K = paramTXLivePushConfig.mCustomModeType;
    localf.L = paramTXLivePushConfig.mVideoEncoderXMirror;
    localf.M = paramTXLivePushConfig.mEnableHighResolutionCapture;
    localf.N = paramTXLivePushConfig.mEnableScreenCaptureAutoRotate;
    localf.a();
    AppMethodBeat.o(65915);
  }

  private void transferPushEvent(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(65917);
    switch (paramInt)
    {
    default:
      TXCLog.w(TAG, "unhandled event : ".concat(String.valueOf(paramInt)));
      AppMethodBeat.o(65917);
      return;
    case 1107:
      paramInt = 1107;
    case 1008:
    case 1103:
    case -1303:
    case 3002:
    case 3005:
    case -1307:
    case 1001:
    case 3003:
    case 1101:
    case 1002:
    case 3004:
    case 1102:
    case -1313:
    case 1005:
    case 1006:
    case 1004:
    case -1309:
    case -1308:
    case 1003:
    case -1301:
    case 1007:
    case -1302:
    case 1018:
    case 1019:
    case 1020:
    case 1021:
    }
    while (true)
    {
      if (this.mMainHandler != null)
        this.mMainHandler.post(new TXLivePusher.11(this, paramInt, paramBundle));
      AppMethodBeat.o(65917);
      break;
      paramInt = 1008;
      continue;
      paramInt = 1103;
      continue;
      paramInt = -1303;
      continue;
      paramInt = 3002;
      continue;
      paramInt = 3005;
      continue;
      paramInt = -1307;
      continue;
      paramInt = 1001;
      continue;
      paramInt = 3003;
      continue;
      paramInt = 1101;
      continue;
      paramInt = 1002;
      continue;
      paramInt = 3004;
      continue;
      paramInt = 1102;
      continue;
      paramInt = -1313;
      continue;
      paramInt = 1005;
      continue;
      paramInt = 1006;
      continue;
      paramInt = 1004;
      continue;
      paramInt = -1309;
      continue;
      paramInt = -1308;
      continue;
      paramInt = 1003;
      continue;
      paramInt = -1301;
      continue;
      paramInt = 1007;
      continue;
      paramInt = -1302;
      continue;
      paramInt = 1018;
      continue;
      paramInt = 1019;
      continue;
      paramInt = 1020;
      continue;
      paramInt = 1021;
    }
  }

  private void updateId(String paramString)
  {
    AppMethodBeat.i(65904);
    paramString = String.format("%s-%d", new Object[] { paramString, Long.valueOf(TXCTimeUtil.getTimeTick() % 10000L) });
    if (this.mStreamUploader != null)
      this.mStreamUploader.setID(paramString);
    if (this.mCaptureAndEnc != null)
      this.mCaptureAndEnc.setID(paramString);
    if (this.mDataReport != null)
      this.mDataReport.d(paramString);
    this.mID = paramString;
    AppMethodBeat.o(65904);
  }

  public TXLivePushConfig getConfig()
  {
    return this.mConfig;
  }

  public int getMaxZoom()
  {
    AppMethodBeat.i(65844);
    int i;
    if (this.mCaptureAndEnc == null)
    {
      i = 0;
      AppMethodBeat.o(65844);
    }
    while (true)
    {
      return i;
      i = this.mCaptureAndEnc.n();
      AppMethodBeat.o(65844);
    }
  }

  public int getMusicDuration(String paramString)
  {
    AppMethodBeat.i(65857);
    int i = this.mCaptureAndEnc.d(paramString);
    AppMethodBeat.o(65857);
    return i;
  }

  public boolean isPushing()
  {
    AppMethodBeat.i(65832);
    boolean bool;
    if (this.mCaptureAndEnc != null)
    {
      bool = this.mCaptureAndEnc.i();
      AppMethodBeat.o(65832);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(65832);
    }
  }

  public void onDetectFacePoints(float[] paramArrayOfFloat)
  {
    AppMethodBeat.i(65884);
    if (this.mPreprocessListener != null)
      this.mPreprocessListener.onDetectFacePoints(paramArrayOfFloat);
    AppMethodBeat.o(65884);
  }

  public void onEnableDropStatusChanged(boolean paramBoolean)
  {
    AppMethodBeat.i(65892);
    if (this.mStreamUploader != null)
      this.mStreamUploader.setDropEanble(paramBoolean);
    AppMethodBeat.o(65892);
  }

  public void onEncAudio(byte[] paramArrayOfByte, long paramLong, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(65893);
    if ((this.mStreamUploader != null) && (paramArrayOfByte != null))
      this.mStreamUploader.pushAAC(paramArrayOfByte, paramLong);
    if ((this.mIsRecording) && (this.mMP4Muxer != null) && (this.mStartMuxer) && (paramArrayOfByte != null))
      this.mMP4Muxer.a(paramArrayOfByte, 0, paramArrayOfByte.length, 1000L * paramLong, 0);
    AppMethodBeat.o(65893);
  }

  public void onEncVideo(com.tencent.liteav.basic.g.b paramb)
  {
    AppMethodBeat.i(65894);
    if (this.mQos != null)
      this.mQos.setHasVideo(true);
    if ((this.mStreamUploader != null) && (paramb != null) && (paramb.a != null));
    try
    {
      Object localObject1;
      Object localObject2;
      if ((this.mMsgArray != null) && (!this.mMsgArray.isEmpty()))
      {
        localObject1 = this.mMsgArray.iterator();
        int i = 0;
        int j;
        if (((Iterator)localObject1).hasNext())
        {
          localObject2 = (TXLivePusher.MsgInfo)((Iterator)localObject1).next();
          if (((TXLivePusher.MsgInfo)localObject2).ts <= paramb.g)
          {
            if (((TXLivePusher.MsgInfo)localObject2).msg.length <= 10240);
            for (j = ((TXLivePusher.MsgInfo)localObject2).msg.length; ; j = 10240)
            {
              i = j + 5 + i;
              break;
            }
          }
        }
        if (i != 0)
        {
          byte[] arrayOfByte1 = new byte[paramb.a.length + i];
          byte[] arrayOfByte2 = new byte[5];
          localObject1 = this.mMsgArray.iterator();
          i = 0;
          j = 0;
          if (((Iterator)localObject1).hasNext())
          {
            localObject2 = (TXLivePusher.MsgInfo)((Iterator)localObject1).next();
            if (((TXLivePusher.MsgInfo)localObject2).ts <= paramb.g)
            {
              if (((TXLivePusher.MsgInfo)localObject2).msg.length <= 10240);
              for (k = ((TXLivePusher.MsgInfo)localObject2).msg.length; ; k = 10240)
              {
                int m = k + 1;
                arrayOfByte2[0] = ((byte)(byte)(m >> 24 & 0xFF));
                arrayOfByte2[1] = ((byte)(byte)(m >> 16 & 0xFF));
                arrayOfByte2[2] = ((byte)(byte)(m >> 8 & 0xFF));
                arrayOfByte2[3] = ((byte)(byte)(m & 0xFF));
                arrayOfByte2[4] = ((byte)6);
                System.arraycopy(arrayOfByte2, 0, arrayOfByte1, j, 5);
                j += 5;
                System.arraycopy(((TXLivePusher.MsgInfo)localObject2).msg, 0, arrayOfByte1, j, k);
                i++;
                j += k;
                break;
              }
            }
          }
          for (int k = 0; k < i; k++)
            this.mMsgArray.remove(0);
          System.arraycopy(paramb.a, 0, arrayOfByte1, j, paramb.a.length);
          paramb.a = arrayOfByte1;
        }
      }
      this.mStreamUploader.pushNAL(paramb);
      if ((this.mIsRecording) && (this.mMP4Muxer != null) && (paramb != null) && (paramb.a != null))
      {
        localObject2 = transferAvccToAnnexb(paramb.a);
        if (!this.mStartMuxer)
        {
          if (paramb.b != 0)
            break label508;
          localObject1 = com.tencent.liteav.basic.util.b.a((byte[])localObject2, this.mCaptureAndEnc.b(), this.mCaptureAndEnc.c());
          if (localObject1 != null)
          {
            this.mMP4Muxer.a((MediaFormat)localObject1);
            this.mMP4Muxer.a();
            this.mStartMuxer = true;
            this.mRecordStartTime = 0L;
          }
        }
        recordVideoData(paramb, (byte[])localObject2);
      }
      label508: AppMethodBeat.o(65894);
      return;
    }
    finally
    {
      AppMethodBeat.o(65894);
    }
    throw paramb;
  }

  public void onEncVideoFormat(MediaFormat paramMediaFormat)
  {
    AppMethodBeat.i(65897);
    if ((this.mIsRecording) && (this.mMP4Muxer != null))
    {
      this.mMP4Muxer.a(paramMediaFormat);
      if (!this.mStartMuxer)
      {
        this.mMP4Muxer.a();
        this.mStartMuxer = true;
        this.mRecordStartTime = 0L;
      }
    }
    AppMethodBeat.o(65897);
  }

  public void onEncoderParamsChanged(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(65891);
    if (this.mCaptureAndEnc != null)
      this.mCaptureAndEnc.a(paramInt1, paramInt2, paramInt3);
    if ((paramInt2 != 0) && (paramInt3 != 0))
    {
      this.mNewConfig.a = paramInt2;
      this.mNewConfig.b = paramInt3;
    }
    if (paramInt1 != 0)
      this.mNewConfig.c = paramInt1;
    AppMethodBeat.o(65891);
  }

  public int onGetEncoderRealBitrate()
  {
    AppMethodBeat.i(65886);
    int i = TXCStatus.d(this.mID, 4002);
    AppMethodBeat.o(65886);
    return i;
  }

  public int onGetQueueInputSize()
  {
    AppMethodBeat.i(65887);
    int i = TXCStatus.d(this.mID, 7002);
    if (this.mNewConfig.I)
      i += TXCStatus.d(this.mID, 7001);
    while (true)
    {
      AppMethodBeat.o(65887);
      return i;
      i += TXCStatus.d(this.mID, 4002);
    }
  }

  public int onGetQueueOutputSize()
  {
    AppMethodBeat.i(65888);
    int i;
    if (this.mStreamUploader == null)
    {
      i = 0;
      AppMethodBeat.o(65888);
    }
    while (true)
    {
      return i;
      i = TXCStatus.d(this.mID, 7004) + TXCStatus.d(this.mID, 7003);
      AppMethodBeat.o(65888);
    }
  }

  public int onGetVideoDropCount()
  {
    AppMethodBeat.i(65890);
    int i = TXCStatus.d(this.mID, 7007);
    AppMethodBeat.o(65890);
    return i;
  }

  public int onGetVideoQueueCurrentCount()
  {
    AppMethodBeat.i(65889);
    int i = TXCStatus.d(this.mID, 7005);
    AppMethodBeat.o(65889);
    return i;
  }

  public int onGetVideoQueueMaxCount()
  {
    return 5;
  }

  public void onLogRecord(String paramString)
  {
    AppMethodBeat.i(65840);
    TXCLog.d("User", paramString);
    AppMethodBeat.o(65840);
  }

  public void onNotifyEvent(int paramInt, Bundle paramBundle)
  {
    int i = 1;
    AppMethodBeat.i(65882);
    if (this.mMainHandler != null)
      this.mMainHandler.post(new TXLivePusher.4(this, paramBundle, paramInt));
    transferPushEvent(paramInt, paramBundle);
    String str = this.mPushUrl;
    if ((str != null) && (str.length() > 0))
      if ((paramInt == 1018) || (paramInt == 1019) || (paramInt == 1021) || (paramInt == 1020))
      {
        switch (paramInt)
        {
        default:
          AppMethodBeat.o(65882);
        case 1018:
        case 1019:
        case 1021:
          while (true)
          {
            return;
            TXCDRApi.reportEvent40003(str, com.tencent.liteav.basic.datareport.a.R, 0, "enter", "");
            AppMethodBeat.o(65882);
            continue;
            TXCDRApi.reportEvent40003(str, com.tencent.liteav.basic.datareport.a.R, 0, "exit", "");
            AppMethodBeat.o(65882);
            continue;
            TXCDRApi.reportEvent40003(str, com.tencent.liteav.basic.datareport.a.R, 0, "reenter", "");
            AppMethodBeat.o(65882);
          }
        case 1020:
        }
        paramBundle = paramBundle.getString("EVT_MSG");
      }
    while (true)
    {
      Object localObject;
      JSONArray localJSONArray;
      HashSet localHashSet;
      try
      {
        localObject = new org/json/JSONObject;
        ((JSONObject)localObject).<init>(paramBundle);
        localJSONArray = ((JSONObject)localObject).getJSONArray("userlist");
        localHashSet = new java/util/HashSet;
        localHashSet.<init>();
        paramBundle = new java/lang/StringBuilder;
        paramBundle.<init>();
        if (((localJSONArray != null) && (localJSONArray.length() != 0)) || (this.mUserList.size() <= 0))
          break label318;
        j = i;
        if (j == 0)
          break label515;
        if (localHashSet.size() != 0)
          break label460;
        this.mUserList.clear();
        TXCDRApi.reportEvent40003(str, com.tencent.liteav.basic.datareport.a.R, 0, "userlist:", "");
        AppMethodBeat.o(65882);
      }
      catch (JSONException paramBundle)
      {
        AppMethodBeat.o(65882);
      }
      break;
      label318: if (localJSONArray != null)
      {
        j = 0;
        paramInt = 0;
        if (j < localJSONArray.length())
        {
          localObject = localJSONArray.getJSONObject(j).getString("userid");
          localHashSet.add(localObject);
          if (j == 0)
            paramBundle.append((String)localObject);
          while (true)
          {
            if ((this.mUserList == null) || (this.mUserList.size() <= 0) || (!this.mUserList.contains(localObject)))
              paramInt = 1;
            j++;
            break;
            paramBundle.append(":".concat(String.valueOf(localObject)));
          }
        }
        if (this.mUserList != null)
        {
          j = i;
          if (localJSONArray.length() != this.mUserList.size())
            continue;
        }
        j = paramInt;
        continue;
        label460: this.mUserList.clear();
        this.mUserList.addAll(localHashSet);
        paramInt = com.tencent.liteav.basic.datareport.a.R;
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>("userlist:");
        TXCDRApi.reportEvent40003(str, paramInt, 0, paramBundle.toString(), "");
        AppMethodBeat.o(65882);
        break;
        long l = System.currentTimeMillis();
        if ((paramInt == -1303) || (paramInt == 1101) || (paramInt == 1006))
        {
          if (l - ((Long)this.mLastReportTime.get(Integer.valueOf(paramInt))).longValue() < 5000L)
          {
            AppMethodBeat.o(65882);
            break;
          }
          this.mLastReportTime.put(Integer.valueOf(paramInt), Long.valueOf(l));
        }
        if ((paramInt != 1018) && (paramInt != 1019) && (paramInt != 1021) && (paramInt != 1020))
        {
          paramBundle = paramBundle.getString("EVT_MSG");
          TXCDRApi.reportEvent40003(str, com.tencent.liteav.basic.datareport.a.Q, paramInt, paramBundle, "");
        }
        AppMethodBeat.o(65882);
        break;
      }
      label515: int j = 0;
    }
  }

  public void onRecordPcm(byte[] paramArrayOfByte, long paramLong, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(65896);
    TXLivePusher.AudioCustomProcessListener localAudioCustomProcessListener = this.mAudioProcessListener;
    if (localAudioCustomProcessListener != null)
      localAudioCustomProcessListener.onRecordPcmData(paramArrayOfByte, paramLong, paramInt1, paramInt2, paramInt3);
    AppMethodBeat.o(65896);
  }

  public void onRecordRawPcm(byte[] paramArrayOfByte, long paramLong, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    AppMethodBeat.i(65895);
    TXLivePusher.AudioCustomProcessListener localAudioCustomProcessListener = this.mAudioProcessListener;
    if (localAudioCustomProcessListener != null)
      localAudioCustomProcessListener.onRecordRawPcmData(paramArrayOfByte, paramLong, paramInt1, paramInt2, paramInt3, paramBoolean);
    AppMethodBeat.o(65895);
  }

  public int onTextureCustomProcess(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(65883);
    if (this.mPreprocessListener != null)
    {
      paramInt1 = this.mPreprocessListener.onTextureCustomProcess(paramInt1, paramInt2, paramInt3);
      AppMethodBeat.o(65883);
    }
    while (true)
    {
      return paramInt1;
      paramInt1 = 0;
      AppMethodBeat.o(65883);
    }
  }

  public void onTextureDestoryed()
  {
    AppMethodBeat.i(65885);
    if (this.mPreprocessListener != null)
      this.mPreprocessListener.onTextureDestoryed();
    AppMethodBeat.o(65885);
  }

  public boolean pauseBGM()
  {
    AppMethodBeat.i(65852);
    TXCLog.d(TAG, "liteav_api pauseBGM ");
    boolean bool = this.mCaptureAndEnc.p();
    AppMethodBeat.o(65852);
    return bool;
  }

  public void pausePusher()
  {
    AppMethodBeat.i(65830);
    TXCLog.d(TAG, "liteav_api pausePusher ".concat(String.valueOf(this)));
    if (this.mCaptureAndEnc != null)
      this.mCaptureAndEnc.g();
    if ((this.mPushUrl != null) && (this.mPushUrl.length() > 0))
    {
      TXCDRApi.reportEvent40003(this.mPushUrl, com.tencent.liteav.basic.datareport.a.P, 0, "pausePusher", "");
      AppMethodBeat.o(65830);
    }
    while (true)
    {
      return;
      this.mCallFuncBeforeStartPush.add("pausePusher");
      AppMethodBeat.o(65830);
    }
  }

  public boolean playBGM(String paramString)
  {
    AppMethodBeat.i(65850);
    TXCLog.d(TAG, "liteav_api playBGM ".concat(String.valueOf(paramString)));
    boolean bool = this.mCaptureAndEnc.c(paramString);
    AppMethodBeat.o(65850);
    return bool;
  }

  public boolean resumeBGM()
  {
    AppMethodBeat.i(65853);
    TXCLog.d(TAG, "liteav_api resumeBGM ");
    boolean bool = this.mCaptureAndEnc.q();
    AppMethodBeat.o(65853);
    return bool;
  }

  public void resumePusher()
  {
    AppMethodBeat.i(65831);
    TXCLog.d(TAG, "liteav_api resumePusher ".concat(String.valueOf(this)));
    if (this.mCaptureAndEnc != null)
      this.mCaptureAndEnc.h();
    if ((this.mPushUrl != null) && (this.mPushUrl.length() > 0))
    {
      TXCDRApi.reportEvent40003(this.mPushUrl, com.tencent.liteav.basic.datareport.a.P, 0, "resumePusher", "");
      AppMethodBeat.o(65831);
    }
    while (true)
    {
      return;
      this.mCallFuncBeforeStartPush.add("resumePusher");
      AppMethodBeat.o(65831);
    }
  }

  public void sendCustomPCMData(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(65843);
    this.mCaptureAndEnc.a(paramArrayOfByte);
    AppMethodBeat.o(65843);
  }

  public int sendCustomVideoData(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = -1000;
    AppMethodBeat.i(65841);
    if (this.mCaptureAndEnc != null)
      switch (paramInt1)
      {
      case 4:
      default:
        AppMethodBeat.o(65841);
        paramInt1 = i;
      case 3:
      case 5:
      }
    while (true)
    {
      return paramInt1;
      for (paramInt1 = 1; ; paramInt1 = 2)
      {
        paramInt1 = this.mCaptureAndEnc.a(paramArrayOfByte, paramInt1, paramInt2, paramInt3);
        AppMethodBeat.o(65841);
        break;
      }
      AppMethodBeat.o(65841);
      paramInt1 = i;
    }
  }

  public int sendCustomVideoTexture(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(65842);
    if (this.mCaptureAndEnc != null)
    {
      paramInt1 = this.mCaptureAndEnc.c(paramInt1, paramInt2, paramInt3);
      AppMethodBeat.o(65842);
    }
    while (true)
    {
      return paramInt1;
      paramInt1 = -1000;
      AppMethodBeat.o(65842);
    }
  }

  @Deprecated
  public void sendMessage(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(65920);
    try
    {
      if (this.mMsgArray != null)
      {
        TXLivePusher.MsgInfo localMsgInfo = new com/tencent/rtmp/TXLivePusher$MsgInfo;
        localMsgInfo.<init>(this, null);
        localMsgInfo.ts = TXCTimeUtil.getTimeTick();
        localMsgInfo.msg = add_emulation_prevention_three_byte(paramArrayOfByte);
        this.mMsgArray.add(localMsgInfo);
      }
      return;
    }
    finally
    {
      AppMethodBeat.o(65920);
    }
    throw paramArrayOfByte;
  }

  public boolean sendMessageEx(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(65921);
    boolean bool;
    if ((paramArrayOfByte.length <= 0) || (paramArrayOfByte.length > 2048))
    {
      bool = false;
      AppMethodBeat.o(65921);
    }
    while (true)
    {
      return bool;
      try
      {
        if (this.mMsgArray != null)
        {
          TXLivePusher.MsgInfo localMsgInfo = new com/tencent/rtmp/TXLivePusher$MsgInfo;
          localMsgInfo.<init>(this, null);
          localMsgInfo.ts = TXCTimeUtil.getTimeTick();
          byte[] arrayOfByte = add_emulation_prevention_three_byte(paramArrayOfByte);
          localMsgInfo.msg = appendSEIBuffer(paramArrayOfByte.length, arrayOfByte);
          this.mMsgArray.add(localMsgInfo);
        }
        bool = true;
        AppMethodBeat.o(65921);
      }
      finally
      {
        AppMethodBeat.o(65921);
      }
    }
    throw paramArrayOfByte;
  }

  public void setAudioProcessListener(TXLivePusher.AudioCustomProcessListener paramAudioCustomProcessListener)
  {
    AppMethodBeat.i(65862);
    TXCLog.d(TAG, "liteav_api setAudioProcessListener ".concat(String.valueOf(paramAudioCustomProcessListener)));
    this.mAudioProcessListener = paramAudioCustomProcessListener;
    AppMethodBeat.o(65862);
  }

  public void setBGMNofify(TXLivePusher.OnBGMNotify paramOnBGMNotify)
  {
    AppMethodBeat.i(65849);
    TXCLog.d(TAG, "liteav_api setBGMNofify ".concat(String.valueOf(paramOnBGMNotify)));
    if (this.mCaptureAndEnc != null)
      this.mCaptureAndEnc.a(paramOnBGMNotify);
    AppMethodBeat.o(65849);
  }

  public boolean setBGMVolume(float paramFloat)
  {
    AppMethodBeat.i(65855);
    TXCLog.d(TAG, "liteav_api setBGMVolume ".concat(String.valueOf(paramFloat)));
    boolean bool = this.mCaptureAndEnc.e(paramFloat);
    AppMethodBeat.o(65855);
    return bool;
  }

  public boolean setBeautyFilter(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(65867);
    TXCLog.d(TAG, "liteav_api setBeautyFilter " + paramInt1 + ", " + paramInt2 + ", " + paramInt3 + ", " + paramInt4);
    if (this.mCaptureAndEnc != null)
    {
      this.mCaptureAndEnc.b(paramInt1);
      this.mCaptureAndEnc.b(paramInt2, paramInt3, paramInt4);
    }
    if (this.mConfig != null)
    {
      this.mConfig.mBeautyLevel = paramInt2;
      this.mConfig.mWhiteningLevel = paramInt3;
      this.mConfig.mRuddyLevel = paramInt4;
    }
    AppMethodBeat.o(65867);
    return true;
  }

  public void setBgmPitch(float paramFloat)
  {
    AppMethodBeat.i(65856);
    this.mBgmPitch = paramFloat;
    if (this.mCaptureAndEnc != null)
      this.mCaptureAndEnc.b(paramFloat);
    AppMethodBeat.o(65856);
  }

  public void setChinLevel(int paramInt)
  {
    AppMethodBeat.i(65877);
    TXCLog.d(TAG, "liteav_api setChinLevel ".concat(String.valueOf(paramInt)));
    e.a().a(null, this.mContext);
    if (this.mCaptureAndEnc != null)
      this.mCaptureAndEnc.g(paramInt);
    AppMethodBeat.o(65877);
  }

  public void setConfig(TXLivePushConfig paramTXLivePushConfig)
  {
    AppMethodBeat.i(65826);
    TXCLog.d(TAG, "liteav_api setConfig " + paramTXLivePushConfig + ", " + this);
    TXLivePushConfig localTXLivePushConfig = paramTXLivePushConfig;
    if (paramTXLivePushConfig == null)
      localTXLivePushConfig = new TXLivePushConfig();
    this.mConfig = localTXLivePushConfig;
    transferConfig(localTXLivePushConfig);
    applyConfig();
    paramTXLivePushConfig = "setConfig:" + this.mNewConfig.h + ":" + this.mNewConfig.a + "*" + this.mNewConfig.b + ":" + this.mNewConfig.c + ":" + this.mNewConfig.e + ":" + this.mNewConfig.d;
    if ((this.mPushUrl != null) && (this.mPushUrl.length() > 0))
    {
      TXCDRApi.reportEvent40003(this.mPushUrl, com.tencent.liteav.basic.datareport.a.P, 0, paramTXLivePushConfig, "");
      AppMethodBeat.o(65826);
    }
    while (true)
    {
      return;
      this.mCallFuncBeforeStartPush.add(paramTXLivePushConfig);
      AppMethodBeat.o(65826);
    }
  }

  public void setExposureCompensation(float paramFloat)
  {
    AppMethodBeat.i(65848);
    TXCLog.d(TAG, "liteav_api setExposureCompensation ".concat(String.valueOf(paramFloat)));
    if (this.mCaptureAndEnc == null)
      AppMethodBeat.o(65848);
    while (true)
    {
      return;
      this.mCaptureAndEnc.c(paramFloat);
      AppMethodBeat.o(65848);
    }
  }

  public void setEyeScaleLevel(int paramInt)
  {
    AppMethodBeat.i(65872);
    TXCLog.d(TAG, "liteav_api setEyeScaleLevel ".concat(String.valueOf(paramInt)));
    e.a().a(null, this.mContext);
    if (this.mConfig != null)
      this.mConfig.setEyeScaleLevel(paramInt);
    if (this.mCaptureAndEnc != null)
      this.mCaptureAndEnc.c(paramInt);
    AppMethodBeat.o(65872);
  }

  public void setFaceShortLevel(int paramInt)
  {
    AppMethodBeat.i(65876);
    TXCLog.d(TAG, "liteav_api setFaceShortLevel ".concat(String.valueOf(paramInt)));
    e.a().a(null, this.mContext);
    if (this.mCaptureAndEnc != null)
      this.mCaptureAndEnc.f(paramInt);
    AppMethodBeat.o(65876);
  }

  public void setFaceSlimLevel(int paramInt)
  {
    AppMethodBeat.i(65873);
    TXCLog.d(TAG, "liteav_api setFaceSlimLevel ".concat(String.valueOf(paramInt)));
    e.a().a(null, this.mContext);
    if (this.mConfig != null)
      this.mConfig.setFaceSlimLevel(paramInt);
    if (this.mCaptureAndEnc != null)
      this.mCaptureAndEnc.d(paramInt);
    AppMethodBeat.o(65873);
  }

  public void setFaceVLevel(int paramInt)
  {
    AppMethodBeat.i(65874);
    TXCLog.d(TAG, "liteav_api setFaceVLevel ".concat(String.valueOf(paramInt)));
    e.a().a(null, this.mContext);
    if (this.mCaptureAndEnc != null)
      this.mCaptureAndEnc.e(paramInt);
    AppMethodBeat.o(65874);
  }

  public void setFilter(Bitmap paramBitmap)
  {
    AppMethodBeat.i(65868);
    TXCLog.d(TAG, "liteav_api setFilter ".concat(String.valueOf(paramBitmap)));
    if (this.mCaptureAndEnc != null)
      this.mCaptureAndEnc.a(paramBitmap);
    AppMethodBeat.o(65868);
  }

  public void setFocusPosition(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(65846);
    if (this.mCaptureAndEnc != null)
      this.mCaptureAndEnc.a(paramFloat1, paramFloat2);
    AppMethodBeat.o(65846);
  }

  @TargetApi(18)
  public boolean setGreenScreenFile(String paramString)
  {
    AppMethodBeat.i(65871);
    TXCLog.d(TAG, "liteav_api setGreenScreenFile ".concat(String.valueOf(paramString)));
    e.a().a(null, this.mContext);
    boolean bool;
    if (this.mCaptureAndEnc != null)
    {
      bool = this.mCaptureAndEnc.b(paramString);
      AppMethodBeat.o(65871);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(65871);
    }
  }

  public boolean setMicVolume(float paramFloat)
  {
    AppMethodBeat.i(65854);
    TXCLog.d(TAG, "liteav_api setMicVolume ".concat(String.valueOf(paramFloat)));
    boolean bool = this.mCaptureAndEnc.d(paramFloat);
    AppMethodBeat.o(65854);
    return bool;
  }

  public boolean setMirror(boolean paramBoolean)
  {
    AppMethodBeat.i(65847);
    TXCLog.d(TAG, "liteav_api setMirror ".concat(String.valueOf(paramBoolean)));
    if (this.mConfig != null)
      this.mConfig.setVideoEncoderXMirror(paramBoolean);
    if (this.mCaptureAndEnc == null)
    {
      paramBoolean = false;
      AppMethodBeat.o(65847);
    }
    while (true)
    {
      return paramBoolean;
      this.mCaptureAndEnc.e(paramBoolean);
      paramBoolean = true;
      AppMethodBeat.o(65847);
    }
  }

  public void setMotionMute(boolean paramBoolean)
  {
    AppMethodBeat.i(65870);
    TXCLog.d(TAG, "liteav_api setMotionMute ".concat(String.valueOf(paramBoolean)));
    e.a().a(null, this.mContext);
    if (this.mCaptureAndEnc != null)
      this.mCaptureAndEnc.c(paramBoolean);
    AppMethodBeat.o(65870);
  }

  public void setMotionTmpl(String paramString)
  {
    AppMethodBeat.i(65869);
    TXCLog.d(TAG, "liteav_api motionPath ".concat(String.valueOf(paramString)));
    e.a().a(null, this.mContext);
    if (this.mCaptureAndEnc != null)
      this.mCaptureAndEnc.a(paramString);
    AppMethodBeat.o(65869);
  }

  public void setMute(boolean paramBoolean)
  {
    AppMethodBeat.i(65839);
    TXCLog.d(TAG, "liteav_api setMute ".concat(String.valueOf(paramBoolean)));
    if ((this.mPushUrl != null) && (this.mPushUrl.length() > 0))
      TXCDRApi.reportEvent40003(this.mPushUrl, com.tencent.liteav.basic.datareport.a.P, 0, "setMute:".concat(String.valueOf(paramBoolean)), "");
    while (true)
    {
      if (this.mCaptureAndEnc != null)
        this.mCaptureAndEnc.d(paramBoolean);
      if ((this.mConfig.mEnablePureAudioPush) && (this.mStreamUploader != null))
        this.mStreamUploader.setAudioMute(paramBoolean);
      AppMethodBeat.o(65839);
      return;
      this.mCallFuncBeforeStartPush.add("setMute:".concat(String.valueOf(paramBoolean)));
    }
  }

  public void setNoseSlimLevel(int paramInt)
  {
    AppMethodBeat.i(65878);
    TXCLog.d(TAG, "liteav_api setNoseSlimLevel ".concat(String.valueOf(paramInt)));
    e.a().a(null, this.mContext);
    if (this.mCaptureAndEnc != null)
      this.mCaptureAndEnc.h(paramInt);
    AppMethodBeat.o(65878);
  }

  public void setPushListener(ITXLivePushListener paramITXLivePushListener)
  {
    AppMethodBeat.i(65827);
    TXCLog.d(TAG, "liteav_api setPushListener ".concat(String.valueOf(paramITXLivePushListener)));
    this.mListener = paramITXLivePushListener;
    AppMethodBeat.o(65827);
  }

  public void setRenderRotation(int paramInt)
  {
    AppMethodBeat.i(65860);
    TXCLog.d(TAG, "liteav_api setRenderRotation ");
    if (this.mCaptureAndEnc == null)
      AppMethodBeat.o(65860);
    while (true)
    {
      return;
      this.mCaptureAndEnc.a(paramInt);
      AppMethodBeat.o(65860);
    }
  }

  public void setReverb(int paramInt)
  {
    AppMethodBeat.i(65880);
    TXCLog.d(TAG, "liteav_api setReverb ".concat(String.valueOf(paramInt)));
    if (this.mCaptureAndEnc == null)
      AppMethodBeat.o(65880);
    while (true)
    {
      return;
      this.mCaptureAndEnc.j(paramInt);
      AppMethodBeat.o(65880);
    }
  }

  public void setSpecialRatio(float paramFloat)
  {
    AppMethodBeat.i(65875);
    TXCLog.d(TAG, "liteav_api setSpecialRatio ".concat(String.valueOf(paramFloat)));
    e.a().a(null, this.mContext);
    if (this.mCaptureAndEnc != null)
      this.mCaptureAndEnc.a(paramFloat);
    AppMethodBeat.o(65875);
  }

  public void setSurface(Surface paramSurface)
  {
    AppMethodBeat.i(65835);
    TXCLog.d(TAG, "liteav_api setSurface ".concat(String.valueOf(paramSurface)));
    if (this.mCaptureAndEnc == null)
      AppMethodBeat.o(65835);
    while (true)
    {
      return;
      this.mCaptureAndEnc.a(paramSurface);
      AppMethodBeat.o(65835);
    }
  }

  public void setSurfaceSize(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(65836);
    TXCLog.d(TAG, "liteav_api setSurfaceSize " + paramInt1 + "," + paramInt2);
    if (this.mCaptureAndEnc == null)
      AppMethodBeat.o(65836);
    while (true)
    {
      return;
      this.mCaptureAndEnc.a(paramInt1, paramInt2);
      AppMethodBeat.o(65836);
    }
  }

  public void setVideoProcessListener(TXLivePusher.VideoCustomProcessListener paramVideoCustomProcessListener)
  {
    AppMethodBeat.i(65861);
    TXCLog.d(TAG, "liteav_api setVideoProcessListener ".concat(String.valueOf(paramVideoCustomProcessListener)));
    this.mPreprocessListener = paramVideoCustomProcessListener;
    if (this.mPreprocessListener == null)
    {
      if (this.mCaptureAndEnc == null)
        break label71;
      this.mCaptureAndEnc.a(null);
      AppMethodBeat.o(65861);
    }
    while (true)
    {
      return;
      if (this.mCaptureAndEnc != null)
        this.mCaptureAndEnc.a(this);
      label71: AppMethodBeat.o(65861);
    }
  }

  public void setVideoQuality(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool = false;
    int i = 1;
    AppMethodBeat.i(65879);
    TXCLog.d(TAG, "liteav_api setVideoQuality " + paramInt + ", " + paramBoolean1 + ", " + paramBoolean2);
    int j = paramInt;
    if (Build.VERSION.SDK_INT < 18)
      if (paramInt != 2)
      {
        j = paramInt;
        if (paramInt != 3);
      }
      else
      {
        j = 1;
      }
    Object localObject = "setVideoQuality:" + j + ":" + paramBoolean1 + ":" + paramBoolean2;
    if ((this.mPushUrl != null) && (this.mPushUrl.length() > 0))
      TXCDRApi.reportEvent40003(this.mPushUrl, com.tencent.liteav.basic.datareport.a.P, 0, (String)localObject, "");
    while (true)
    {
      if (this.mConfig == null)
        this.mConfig = new TXLivePushConfig();
      this.mConfig.setVideoFPS(18);
      switch (j)
      {
      default:
        this.mConfig.setHardwareAcceleration(2);
        TXCLog.e(TAG, "setVideoPushQuality: invalid quality ".concat(String.valueOf(j)));
        AppMethodBeat.o(65879);
        return;
        this.mCallFuncBeforeStartPush.add(localObject);
      case 1:
      case 2:
      case 3:
      case 6:
      case 4:
      case 5:
      }
    }
    this.mConfig.enableAEC(false);
    this.mConfig.setHardwareAcceleration(2);
    this.mConfig.setVideoResolution(0);
    this.mConfig.setAudioSampleRate(48000);
    setAdjustStrategy(paramBoolean1, paramBoolean2);
    this.mConfig.setMinVideoBitrate(301);
    this.mConfig.setVideoBitrate(800);
    this.mConfig.setMaxVideoBitrate(800);
    paramBoolean1 = false;
    paramBoolean2 = false;
    label339: this.mVideoQuality = j;
    localObject = this.mConfig;
    if (paramBoolean2)
    {
      label355: ((TXLivePushConfig)localObject).enableVideoHardEncoderMainProfile(bool);
      localObject = this.mConfig;
      if (!paramBoolean2)
        break label1058;
    }
    label1058: for (paramInt = i; ; paramInt = 3)
    {
      ((TXLivePushConfig)localObject).setVideoEncodeGop(paramInt);
      if (this.mNewConfig != null)
      {
        this.mNewConfig.I = paramBoolean2;
        this.mNewConfig.J = paramBoolean1;
      }
      setConfig(this.mConfig);
      AppMethodBeat.o(65879);
      break;
      this.mConfig.enableAEC(false);
      this.mConfig.setHardwareAcceleration(2);
      this.mConfig.setVideoResolution(1);
      this.mConfig.setAudioSampleRate(48000);
      setAdjustStrategy(paramBoolean1, paramBoolean2);
      this.mConfig.setMinVideoBitrate(600);
      this.mConfig.setVideoBitrate(1200);
      this.mConfig.setMaxVideoBitrate(1500);
      paramBoolean1 = false;
      paramBoolean2 = false;
      break label339;
      this.mConfig.enableAEC(false);
      this.mConfig.setHardwareAcceleration(1);
      this.mConfig.setVideoResolution(2);
      this.mConfig.setAudioSampleRate(48000);
      setAdjustStrategy(paramBoolean1, paramBoolean2);
      this.mConfig.setMinVideoBitrate(600);
      this.mConfig.setVideoBitrate(1800);
      this.mConfig.setMaxVideoBitrate(1800);
      paramBoolean1 = false;
      paramBoolean2 = false;
      break label339;
      this.mConfig.enableAEC(true);
      this.mConfig.setHardwareAcceleration(1);
      this.mConfig.setVideoResolution(0);
      this.mConfig.setAudioSampleRate(48000);
      this.mConfig.setAutoAdjustBitrate(true);
      this.mConfig.setAutoAdjustStrategy(5);
      this.mConfig.setMinVideoBitrate(190);
      this.mConfig.setVideoBitrate(400);
      this.mConfig.setMaxVideoBitrate(810);
      paramBoolean1 = true;
      paramBoolean2 = true;
      break label339;
      if (Build.VERSION.SDK_INT < 18)
      {
        this.mConfig.enableAEC(true);
        this.mConfig.setHardwareAcceleration(0);
        this.mConfig.setVideoResolution(0);
        this.mConfig.setAutoAdjustBitrate(true);
        this.mConfig.setAutoAdjustStrategy(4);
        this.mConfig.setMinVideoBitrate(301);
        this.mConfig.setVideoBitrate(800);
        this.mConfig.setMaxVideoBitrate(800);
      }
      while (true)
      {
        this.mConfig.setAudioSampleRate(48000);
        paramBoolean1 = false;
        paramBoolean2 = true;
        break;
        if (this.mVideoQuality == 1)
        {
          this.mConfig.enableAEC(true);
          this.mConfig.setHardwareAcceleration(1);
          this.mConfig.setVideoResolution(0);
          this.mConfig.setAutoAdjustBitrate(true);
          this.mConfig.setAutoAdjustStrategy(4);
          this.mConfig.setMinVideoBitrate(301);
          this.mConfig.setVideoBitrate(800);
          this.mConfig.setMaxVideoBitrate(800);
        }
        else if (this.mVideoQuality == 3)
        {
          this.mConfig.enableAEC(true);
          this.mConfig.setHardwareAcceleration(1);
          this.mConfig.setVideoResolution(2);
          this.mConfig.setAutoAdjustBitrate(true);
          this.mConfig.setAutoAdjustStrategy(4);
          this.mConfig.setMinVideoBitrate(600);
          this.mConfig.setVideoBitrate(1800);
          this.mConfig.setMaxVideoBitrate(1800);
        }
        else
        {
          this.mConfig.enableAEC(true);
          this.mConfig.setHardwareAcceleration(1);
          this.mConfig.setVideoResolution(1);
          this.mConfig.setAutoAdjustBitrate(true);
          this.mConfig.setAutoAdjustStrategy(4);
          this.mConfig.setMinVideoBitrate(600);
          this.mConfig.setVideoBitrate(1200);
          this.mConfig.setMaxVideoBitrate(1200);
        }
      }
      this.mConfig.enableAEC(true);
      this.mConfig.setHardwareAcceleration(1);
      this.mConfig.setVideoResolution(6);
      this.mConfig.setAutoAdjustBitrate(false);
      this.mConfig.setVideoBitrate(350);
      this.mConfig.setAudioSampleRate(48000);
      paramBoolean1 = false;
      paramBoolean2 = true;
      break label339;
      bool = true;
      break label355;
    }
  }

  public void setVideoRecordListener(TXRecordCommon.ITXVideoRecordListener paramITXVideoRecordListener)
  {
    AppMethodBeat.i(65866);
    TXCLog.d(TAG, "liteav_api setVideoRecordListener ".concat(String.valueOf(paramITXVideoRecordListener)));
    this.mRecordListener = paramITXVideoRecordListener;
    AppMethodBeat.o(65866);
  }

  public void setVoiceChangerType(int paramInt)
  {
    AppMethodBeat.i(65881);
    switch (paramInt)
    {
    default:
      this.mVoiceKind = -1;
      this.mVoiceEnvironment = -1;
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    case 10:
    case 11:
    }
    while (true)
    {
      if (this.mCaptureAndEnc != null)
        this.mCaptureAndEnc.b(this.mVoiceKind, this.mVoiceEnvironment);
      AppMethodBeat.o(65881);
      return;
      this.mVoiceKind = 6;
      this.mVoiceEnvironment = -1;
      continue;
      this.mVoiceKind = 4;
      this.mVoiceEnvironment = -1;
      continue;
      this.mVoiceKind = 5;
      this.mVoiceEnvironment = -1;
      continue;
      this.mVoiceKind = -1;
      this.mVoiceEnvironment = 9;
      continue;
      this.mVoiceKind = 536936433;
      this.mVoiceEnvironment = 50;
      continue;
      this.mVoiceKind = -1;
      this.mVoiceEnvironment = 5;
      continue;
      this.mVoiceKind = 13;
      this.mVoiceEnvironment = 1;
      continue;
      this.mVoiceKind = 13;
      this.mVoiceEnvironment = -1;
      continue;
      this.mVoiceKind = 10;
      this.mVoiceEnvironment = 4;
      continue;
      this.mVoiceKind = 10;
      this.mVoiceEnvironment = 20;
      continue;
      this.mVoiceKind = -1;
      this.mVoiceEnvironment = 2;
    }
  }

  public boolean setZoom(int paramInt)
  {
    AppMethodBeat.i(65845);
    TXCLog.d(TAG, "liteav_api setZoom ".concat(String.valueOf(paramInt)));
    boolean bool;
    if (this.mCaptureAndEnc == null)
    {
      bool = false;
      AppMethodBeat.o(65845);
    }
    while (true)
    {
      return bool;
      bool = this.mCaptureAndEnc.i(paramInt);
      AppMethodBeat.o(65845);
    }
  }

  public void snapshot(TXLivePusher.ITXSnapshotListener paramITXSnapshotListener)
  {
    AppMethodBeat.i(65863);
    TXCLog.d(TAG, "liteav_api snapshot ".concat(String.valueOf(paramITXSnapshotListener)));
    if ((this.mSnapshotRunning) || (paramITXSnapshotListener == null) || (this.mCaptureAndEnc == null))
      AppMethodBeat.o(65863);
    while (true)
    {
      return;
      if (this.mCaptureAndEnc != null)
      {
        this.mSnapshotRunning = true;
        this.mCaptureAndEnc.a(new TXLivePusher.1(this, paramITXSnapshotListener));
        this.mMainHandler.postDelayed(this.mSnapShotTimeOutRunnable, 2000L);
        AppMethodBeat.o(65863);
      }
      else
      {
        this.mSnapshotRunning = false;
        AppMethodBeat.o(65863);
      }
    }
  }

  public void startCameraPreview(TXCloudVideoView paramTXCloudVideoView)
  {
    AppMethodBeat.i(65833);
    TXCLog.d(TAG, "liteav_api startCameraPreview " + paramTXCloudVideoView + ", " + this);
    if ((this.mPushUrl != null) && (this.mPushUrl.length() > 0))
    {
      TXCDRApi.reportEvent40003(this.mPushUrl, com.tencent.liteav.basic.datareport.a.P, 0, "startPreview", "");
      setConfig(this.mConfig);
      if (!this.mNewConfig.F)
        break label120;
      TXCLog.e(TAG, "enable pure audio push , so can not start preview!");
      AppMethodBeat.o(65833);
    }
    while (true)
    {
      return;
      this.mCallFuncBeforeStartPush.add("startPreview");
      break;
      label120: if ((this.mTXCloudVideoView != paramTXCloudVideoView) && (this.mTXCloudVideoView != null))
        this.mTXCloudVideoView.removeVideoView();
      this.mTXCloudVideoView = paramTXCloudVideoView;
      if (this.mCaptureAndEnc == null)
        this.mCaptureAndEnc = new com.tencent.liteav.c(this.mContext);
      this.mCaptureAndEnc.a(this);
      this.mCaptureAndEnc.a(this);
      this.mCaptureAndEnc.a(paramTXCloudVideoView);
      this.mCaptureAndEnc.b(this.mConfig.mBeautyLevel, this.mConfig.mWhiteningLevel, this.mConfig.mRuddyLevel);
      e.a().a(null, this.mContext);
      AppMethodBeat.o(65833);
    }
  }

  public int startPusher(String paramString)
  {
    int i = -1;
    AppMethodBeat.i(65828);
    TXCLog.d(TAG, "liteav_api startPusher ".concat(String.valueOf(this)));
    if (TextUtils.isEmpty(paramString))
    {
      TXCLog.e(TAG, "start push error when url is empty ".concat(String.valueOf(this)));
      AppMethodBeat.o(65828);
    }
    while (true)
    {
      return i;
      if ((!TextUtils.isEmpty(this.mPushUrl)) && (isPushing()))
      {
        if (this.mPushUrl.equalsIgnoreCase(paramString))
        {
          TXCLog.w(TAG, "ignore start push when new url is the same with old url  ".concat(String.valueOf(this)));
          AppMethodBeat.o(65828);
        }
        else
        {
          TXCLog.w(TAG, " stop old push when new url is not the same with old url  ".concat(String.valueOf(this)));
          stopPusher();
        }
      }
      else
      {
        TXCLog.d(TAG, "================================================================================================================================================");
        TXCLog.d(TAG, "================================================================================================================================================");
        TXCLog.d(TAG, "============= startPush pushUrl = " + paramString + " SDKVersion = " + TXCCommonUtil.getSDKID() + " , " + TXCCommonUtil.getSDKVersionStr() + "=============");
        TXCLog.d(TAG, "================================================================================================================================================");
        TXCLog.d(TAG, "================================================================================================================================================");
        this.mPushUrl = paramString;
        updateId(this.mPushUrl);
        startNetworkModule();
        startEncoder();
        startQosModule();
        startDataReportModule();
        Iterator localIterator = this.mCallFuncBeforeStartPush.iterator();
        while (localIterator.hasNext())
        {
          paramString = (String)localIterator.next();
          TXCDRApi.reportEvent40003(this.mPushUrl, com.tencent.liteav.basic.datareport.a.P, 0, paramString, "");
        }
        this.mCallFuncBeforeStartPush.clear();
        TXCDRApi.reportEvent40003(this.mPushUrl, com.tencent.liteav.basic.datareport.a.P, 0, "startPush", "");
        startStatusNotify();
        if (this.mTXCloudVideoView != null)
          this.mTXCloudVideoView.clearLog();
        AppMethodBeat.o(65828);
        i = 0;
      }
    }
  }

  public int startRecord(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(65864);
    TXCLog.d(TAG, "liteav_api startRecord ".concat(String.valueOf(paramString)));
    if (Build.VERSION.SDK_INT < 18)
    {
      TXCLog.e(TAG, "API levl is too low (record need 18, current is" + Build.VERSION.SDK_INT + ")");
      i = -3;
      AppMethodBeat.o(65864);
    }
    while (true)
    {
      return i;
      if (this.mIsRecording)
      {
        TXCLog.w(TAG, "ignore start record when recording");
        i = -1;
        AppMethodBeat.o(65864);
      }
      else if ((this.mCaptureAndEnc == null) || (!this.mCaptureAndEnc.i()))
      {
        TXCLog.w(TAG, "ignore start record when not pushing");
        i = -2;
        AppMethodBeat.o(65864);
      }
      else
      {
        TXCLog.w(TAG, "start record ");
        this.mIsRecording = true;
        this.mVideoFilePath = paramString;
        paramString = new File(paramString);
        if (paramString.exists())
          paramString.delete();
        this.mMP4Muxer = new com.tencent.liteav.muxer.c(this.mContext, 1);
        this.mStartMuxer = false;
        this.mMP4Muxer.a(this.mVideoFilePath);
        addAudioTrack();
        TXCDRApi.txReportDAU(this.mContext.getApplicationContext(), com.tencent.liteav.basic.datareport.a.aM);
        if (this.mCaptureAndEnc != null)
          this.mCaptureAndEnc.s();
        AppMethodBeat.o(65864);
      }
    }
  }

  public void startScreenCapture()
  {
    AppMethodBeat.i(65858);
    TXCLog.d(TAG, "liteav_api startScreenCapture ");
    if (this.mCaptureAndEnc == null)
      AppMethodBeat.o(65858);
    while (true)
    {
      return;
      this.mCaptureAndEnc.k();
      AppMethodBeat.o(65858);
    }
  }

  public boolean stopBGM()
  {
    AppMethodBeat.i(65851);
    TXCLog.d(TAG, "liteav_api stopBGM ");
    boolean bool = this.mCaptureAndEnc.o();
    AppMethodBeat.o(65851);
    return bool;
  }

  public void stopCameraPreview(boolean paramBoolean)
  {
    AppMethodBeat.i(65834);
    TXCLog.d(TAG, "liteav_api stopCameraPreview " + paramBoolean + ", " + this);
    if ((this.mPushUrl != null) && (this.mPushUrl.length() > 0))
    {
      TXCDRApi.reportEvent40003(this.mPushUrl, com.tencent.liteav.basic.datareport.a.P, 0, "stopPreview", "");
      if (this.mCaptureAndEnc != null)
        break label100;
      AppMethodBeat.o(65834);
    }
    while (true)
    {
      return;
      this.mCallFuncBeforeStartPush.add("stopPreview");
      break;
      label100: this.mCaptureAndEnc.a(paramBoolean);
      AppMethodBeat.o(65834);
    }
  }

  public void stopPusher()
  {
    AppMethodBeat.i(65829);
    TXCLog.d(TAG, "liteav_api stopPusher ".concat(String.valueOf(this)));
    if ((this.mPushUrl != null) && (this.mPushUrl.length() > 0))
      TXCDRApi.reportEvent40003(this.mPushUrl, com.tencent.liteav.basic.datareport.a.P, 0, "stopPush", "");
    stopRecord();
    stopStatusNotify();
    stopDataReportModule();
    stopQosModule();
    stopEncoder();
    this.mNewConfig.I = false;
    stopNetworkModule();
    this.mPushUrl = "";
    this.mUserList.clear();
    AppMethodBeat.o(65829);
  }

  public void stopRecord()
  {
    AppMethodBeat.i(65865);
    TXCLog.d(TAG, "liteav_api stopRecord ");
    if ((this.mIsRecording) && (this.mMP4Muxer != null))
    {
      int i = this.mMP4Muxer.b();
      TXCLog.w(TAG, "start record ");
      this.mIsRecording = false;
      if (i == 0)
      {
        AsyncTask.execute(new TXLivePusher.3(this, this.mVideoFilePath));
        AppMethodBeat.o(65865);
      }
    }
    while (true)
    {
      return;
      callbackRecordFail();
      AppMethodBeat.o(65865);
    }
  }

  public void stopScreenCapture()
  {
    AppMethodBeat.i(65859);
    TXCLog.d(TAG, "liteav_api stopScreenCapture ");
    if (this.mCaptureAndEnc == null)
      AppMethodBeat.o(65859);
    while (true)
    {
      return;
      this.mCaptureAndEnc.l();
      AppMethodBeat.o(65859);
    }
  }

  public void switchCamera()
  {
    AppMethodBeat.i(65837);
    TXCLog.d(TAG, "liteav_api switchCamera ");
    if (this.mCaptureAndEnc == null)
      AppMethodBeat.o(65837);
    while (true)
    {
      return;
      this.mCaptureAndEnc.j();
      AppMethodBeat.o(65837);
    }
  }

  public boolean turnOnFlashLight(boolean paramBoolean)
  {
    AppMethodBeat.i(65838);
    TXCLog.d(TAG, "liteav_api turnOnFlashLight ".concat(String.valueOf(paramBoolean)));
    if (this.mCaptureAndEnc == null)
    {
      paramBoolean = false;
      AppMethodBeat.o(65838);
    }
    while (true)
    {
      return paramBoolean;
      paramBoolean = this.mCaptureAndEnc.b(paramBoolean);
      AppMethodBeat.o(65838);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.rtmp.TXLivePusher
 * JD-Core Version:    0.6.2
 */