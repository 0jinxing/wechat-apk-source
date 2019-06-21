package com.tencent.rtmp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Surface;
import android.view.TextureView;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.liteav.g;
import com.tencent.liteav.j;
import com.tencent.liteav.j.a;
import com.tencent.liteav.n;
import com.tencent.liteav.o;
import com.tencent.liteav.p;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.ugc.TXRecordCommon.ITXVideoRecordListener;
import java.util.Iterator;
import java.util.Vector;

public class TXLivePlayer
  implements com.tencent.liteav.basic.d.a
{
  public static final int PLAY_TYPE_LIVE_FLV = 1;
  public static final int PLAY_TYPE_LIVE_RTMP = 0;
  public static final int PLAY_TYPE_LIVE_RTMP_ACC = 5;
  public static final int PLAY_TYPE_LOCAL_VIDEO = 6;
  public static final int PLAY_TYPE_VOD_FLV = 2;
  public static final int PLAY_TYPE_VOD_HLS = 3;
  public static final int PLAY_TYPE_VOD_MP4 = 4;
  public static final String TAG = "TXLivePlayer";
  private TXLivePlayer.ITXAudioRawDataListener mAudioRawDataListener;
  private int mAudioRoute;
  private boolean mAutoPlay;
  private Vector<String> mCallFuncBeforeStartPlay;
  private TXLivePlayConfig mConfig;
  private Context mContext;
  private int mCurrentPlayType;
  private boolean mEnableHWDec;
  private boolean mIsNeedClearLastImg;
  private boolean mIsShiftPlaying;
  private long mLastReportTime;
  private ITXLivePlayListener mListener;
  private String mLivePlayUrl;
  private boolean mMute;
  private String mPlayUrl;
  private n mPlayer;
  private long mProgressStartTime;
  private float mRate;
  private int mRenderMode;
  private int mRenderRotation;
  private boolean mSnapshotRunning;
  private Surface mSurface;
  private int mSurfaceHeight;
  private int mSurfaceWidth;
  private TXCloudVideoView mTXCloudVideoView;
  private j mTimeShiftUtil;
  private TXLivePlayer.ITXVideoRawDataListener mVideoRawDataListener;

  public TXLivePlayer(Context paramContext)
  {
    AppMethodBeat.i(65938);
    this.mEnableHWDec = false;
    this.mIsNeedClearLastImg = true;
    this.mPlayUrl = "";
    this.mMute = false;
    this.mVideoRawDataListener = null;
    this.mAutoPlay = true;
    this.mRate = 1.0F;
    this.mSnapshotRunning = false;
    this.mAudioRoute = 0;
    this.mCurrentPlayType = -1;
    this.mCallFuncBeforeStartPlay = new Vector();
    this.mLastReportTime = 0L;
    TXCLog.init();
    this.mListener = null;
    this.mContext = paramContext.getApplicationContext();
    AppMethodBeat.o(65938);
  }

  private String checkPlayUrl(String paramString, int paramInt)
  {
    AppMethodBeat.i(65969);
    Object localObject = paramString;
    StringBuilder localStringBuilder;
    label55: label190: String str;
    if (paramInt != 6)
      try
      {
        localObject = paramString.getBytes("UTF-8");
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(localObject.length);
        paramInt = 0;
        if (paramInt < localObject.length)
        {
          int i;
          if (localObject[paramInt] < 0)
          {
            i = localObject[paramInt] + 256;
            if ((i > 32) && (i < 127) && (i != 34) && (i != 37) && (i != 60) && (i != 62) && (i != 91) && (i != 125) && (i != 92) && (i != 93) && (i != 94) && (i != 96) && (i != 123) && (i != 124))
              break label190;
            localStringBuilder.append(String.format("%%%02X", new Object[] { Integer.valueOf(i) }));
          }
          while (true)
          {
            paramInt++;
            break;
            i = localObject[paramInt];
            break label55;
            localStringBuilder.append((char)i);
          }
        }
      }
      catch (Exception localException)
      {
        str = paramString;
      }
    while (true)
    {
      paramString = str.trim();
      AppMethodBeat.o(65969);
      return paramString;
      str = localStringBuilder.toString();
    }
  }

  private boolean isAVCDecBlacklistDevices()
  {
    AppMethodBeat.i(65968);
    boolean bool;
    if ((Build.MANUFACTURER.equalsIgnoreCase("HUAWEI")) && (Build.MODEL.equalsIgnoreCase("Che2-TL00")))
    {
      bool = true;
      AppMethodBeat.o(65968);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(65968);
    }
  }

  private void postBitmapToMainThread(final TXLivePlayer.ITXSnapshotListener paramITXSnapshotListener, final Bitmap paramBitmap)
  {
    AppMethodBeat.i(65970);
    if (paramITXSnapshotListener == null)
      AppMethodBeat.o(65970);
    while (true)
    {
      return;
      new Handler(Looper.getMainLooper()).post(new Runnable()
      {
        public void run()
        {
          AppMethodBeat.i(65608);
          if (paramITXSnapshotListener != null)
            paramITXSnapshotListener.onSnapshot(paramBitmap);
          TXLivePlayer.access$202(TXLivePlayer.this, false);
          AppMethodBeat.o(65608);
        }
      });
      AppMethodBeat.o(65970);
    }
  }

  public boolean addVideoRawData(byte[] paramArrayOfByte)
  {
    boolean bool = false;
    AppMethodBeat.i(65964);
    TXCLog.d("TXLivePlayer", "liteav_api addVideoRawData ".concat(String.valueOf(paramArrayOfByte)));
    if ((this.mPlayUrl == null) || (this.mPlayUrl.isEmpty()))
      AppMethodBeat.o(65964);
    while (true)
    {
      return bool;
      if (this.mEnableHWDec)
      {
        TXLog.e("TXLivePlayer", "can not addVideoRawData because of hw decode has set!");
        AppMethodBeat.o(65964);
      }
      else if (this.mPlayer == null)
      {
        TXCLog.e("TXLivePlayer", "player hasn't created or not instanceof live player");
        AppMethodBeat.o(65964);
      }
      else
      {
        this.mPlayer.a(paramArrayOfByte);
        bool = true;
        AppMethodBeat.o(65964);
      }
    }
  }

  public boolean enableHardwareDecode(boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(65958);
    TXCLog.d("TXLivePlayer", "liteav_api enableHardwareDecode ".concat(String.valueOf(paramBoolean)));
    if (paramBoolean)
      if (Build.VERSION.SDK_INT < 18)
      {
        TXCLog.e("HardwareDecode", "enableHardwareDecode failed, android system build.version = " + Build.VERSION.SDK_INT + ", the minimum build.version should be 18(android 4.3 or later)");
        AppMethodBeat.o(65958);
        paramBoolean = bool;
      }
    while (true)
    {
      return paramBoolean;
      if (isAVCDecBlacklistDevices())
      {
        TXCLog.e("HardwareDecode", "enableHardwareDecode failed, MANUFACTURER = " + Build.MANUFACTURER + ", MODEL" + Build.MODEL);
        AppMethodBeat.o(65958);
        paramBoolean = bool;
      }
      else
      {
        this.mEnableHWDec = paramBoolean;
        if (this.mPlayer != null)
        {
          g localg1 = this.mPlayer.h();
          g localg2 = localg1;
          if (localg1 == null)
            localg2 = new g();
          localg2.i = this.mEnableHWDec;
          this.mPlayer.a(localg2);
        }
        paramBoolean = true;
        AppMethodBeat.o(65958);
      }
    }
  }

  public boolean isPlaying()
  {
    AppMethodBeat.i(65946);
    boolean bool;
    if (this.mPlayer != null)
    {
      bool = this.mPlayer.c();
      AppMethodBeat.o(65946);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(65946);
    }
  }

  public void onNotifyEvent(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(65963);
    if (paramInt == 15001)
    {
      if (this.mTXCloudVideoView != null)
        this.mTXCloudVideoView.setLogText(paramBundle, null, 0);
      if (this.mListener == null)
        break label276;
      this.mListener.onNetStatus(paramBundle);
      AppMethodBeat.o(65963);
    }
    while (true)
    {
      return;
      long l;
      if (paramInt == 2005)
      {
        l = paramBundle.getInt("EVT_PLAY_PROGRESS_MS") + this.mProgressStartTime;
        if (l > 0L)
        {
          paramBundle.putInt("EVT_PLAY_PROGRESS", (int)(l / 1000L));
          paramBundle.putInt("EVT_PLAY_PROGRESS_MS", (int)l);
          if (this.mListener != null)
            this.mListener.onPlayEvent(paramInt, paramBundle);
        }
        AppMethodBeat.o(65963);
      }
      else
      {
        if (this.mTXCloudVideoView != null)
          this.mTXCloudVideoView.setLogText(null, paramBundle, paramInt);
        if (this.mListener != null)
          this.mListener.onPlayEvent(paramInt, paramBundle);
        l = System.currentTimeMillis();
        if (paramInt == -1303)
        {
          if (l - this.mLastReportTime < 5000L)
            AppMethodBeat.o(65963);
          else
            this.mLastReportTime = l;
        }
        else
        {
          if ((paramInt != 2005) && (paramInt != 2012) && (this.mPlayUrl != null) && (this.mPlayUrl.length() > 0))
          {
            String str1 = paramBundle.getString("EVT_MSG");
            String str2 = this.mPlayUrl;
            int i = com.tencent.liteav.basic.datareport.a.T;
            paramBundle = str1;
            if (str1 == null)
              paramBundle = "";
            TXCDRApi.reportEvent40003(str2, i, paramInt, paramBundle, "");
          }
          label276: AppMethodBeat.o(65963);
        }
      }
    }
  }

  public void pause()
  {
    AppMethodBeat.i(65947);
    TXCLog.d("TXLivePlayer", "liteav_api pause ".concat(String.valueOf(this)));
    if (this.mPlayer != null)
    {
      TXCLog.w("TXLivePlayer", "pause play");
      this.mPlayer.a();
    }
    if ((this.mPlayUrl != null) && (this.mPlayUrl.length() > 0))
      TXCDRApi.reportEvent40003(this.mPlayUrl, com.tencent.liteav.basic.datareport.a.S, 0, "pause", "");
    AppMethodBeat.o(65947);
  }

  public int prepareLiveSeek(String paramString, int paramInt)
  {
    AppMethodBeat.i(65950);
    TXCLog.d("TXLivePlayer", "liteav_api prepareLiveSeek ".concat(String.valueOf(this)));
    if (this.mTimeShiftUtil == null)
      this.mTimeShiftUtil = new j(this.mContext);
    if (this.mTimeShiftUtil != null)
    {
      paramInt = this.mTimeShiftUtil.a(this.mPlayUrl, paramString, paramInt, new j.a()
      {
        public void onLiveTime(long paramAnonymousLong)
        {
          AppMethodBeat.i(65990);
          TXLivePlayer.access$002(TXLivePlayer.this, paramAnonymousLong);
          if (TXLivePlayer.this.mPlayer != null)
            TXLivePlayer.this.mPlayer.g();
          AppMethodBeat.o(65990);
        }
      });
      AppMethodBeat.o(65950);
    }
    while (true)
    {
      return paramInt;
      paramInt = -1;
      AppMethodBeat.o(65950);
    }
  }

  public void resume()
  {
    AppMethodBeat.i(65948);
    TXCLog.d("TXLivePlayer", "liteav_api resume ".concat(String.valueOf(this)));
    if (this.mPlayer != null)
    {
      TXCLog.w("TXLivePlayer", "resume play");
      this.mPlayer.b();
      setAudioRoute(this.mAudioRoute);
    }
    if ((this.mPlayUrl != null) && (this.mPlayUrl.length() > 0))
      TXCDRApi.reportEvent40003(this.mPlayUrl, com.tencent.liteav.basic.datareport.a.S, 0, "resume", "");
    AppMethodBeat.o(65948);
  }

  public int resumeLive()
  {
    AppMethodBeat.i(65951);
    TXCLog.d("TXLivePlayer", "liteav_api resumeLive ".concat(String.valueOf(this)));
    int i;
    if (this.mIsShiftPlaying)
    {
      this.mIsShiftPlaying = false;
      i = startPlay(this.mLivePlayUrl, 1);
      AppMethodBeat.o(65951);
    }
    while (true)
    {
      return i;
      i = -1;
      AppMethodBeat.o(65951);
    }
  }

  public void seek(int paramInt)
  {
    AppMethodBeat.i(65949);
    TXCLog.d("TXLivePlayer", "liteav_api ");
    String str;
    boolean bool;
    if (this.mPlayer != null)
      if ((this.mPlayer.f()) || (this.mIsShiftPlaying))
        if (this.mTimeShiftUtil != null)
        {
          str = this.mTimeShiftUtil.a(paramInt);
          if (TextUtils.isEmpty(str))
            break label113;
          if (startPlay(str, 3) != 0)
            break label108;
          bool = true;
          label73: this.mIsShiftPlaying = bool;
          if (!this.mIsShiftPlaying)
            break label139;
          this.mProgressStartTime = (paramInt * 1000);
          AppMethodBeat.o(65949);
        }
    while (true)
    {
      return;
      str = "";
      break;
      label108: bool = false;
      break label73;
      label113: if (this.mListener != null)
        this.mListener.onPlayEvent(-2301, new Bundle());
      label139: AppMethodBeat.o(65949);
      continue;
      this.mPlayer.e(paramInt);
      AppMethodBeat.o(65949);
    }
  }

  public void setAudioRawDataListener(TXLivePlayer.ITXAudioRawDataListener paramITXAudioRawDataListener)
  {
    AppMethodBeat.i(65967);
    TXCLog.d("TXLivePlayer", "liteav_api setAudioRawDataListener ".concat(String.valueOf(paramITXAudioRawDataListener)));
    this.mAudioRawDataListener = paramITXAudioRawDataListener;
    if (this.mPlayer != null)
      this.mPlayer.a(paramITXAudioRawDataListener);
    AppMethodBeat.o(65967);
  }

  public void setAudioRoute(int paramInt)
  {
    AppMethodBeat.i(65962);
    TXCLog.d("TXLivePlayer", "liteav_api setAudioRoute ".concat(String.valueOf(paramInt)));
    this.mAudioRoute = paramInt;
    if (this.mPlayer != null)
      this.mPlayer.a(this.mContext, this.mAudioRoute);
    AppMethodBeat.o(65962);
  }

  public void setAutoPlay(boolean paramBoolean)
  {
    AppMethodBeat.i(65960);
    TXCLog.d("TXLivePlayer", "liteav_api setAutoPlay ".concat(String.valueOf(paramBoolean)));
    this.mAutoPlay = paramBoolean;
    AppMethodBeat.o(65960);
  }

  public void setConfig(TXLivePlayConfig paramTXLivePlayConfig)
  {
    AppMethodBeat.i(65939);
    TXCLog.d("TXLivePlayer", "liteav_api setConfig ".concat(String.valueOf(this)));
    this.mConfig = paramTXLivePlayConfig;
    if (this.mConfig == null)
      this.mConfig = new TXLivePlayConfig();
    if (this.mPlayer != null)
    {
      g localg = this.mPlayer.h();
      paramTXLivePlayConfig = localg;
      if (localg == null)
        paramTXLivePlayConfig = new g();
      paramTXLivePlayConfig.a = this.mConfig.mCacheTime;
      paramTXLivePlayConfig.g = this.mConfig.mAutoAdjustCacheTime;
      paramTXLivePlayConfig.c = this.mConfig.mMinAutoAdjustCacheTime;
      paramTXLivePlayConfig.b = this.mConfig.mMaxAutoAdjustCacheTime;
      paramTXLivePlayConfig.d = this.mConfig.mVideoBlockThreshold;
      paramTXLivePlayConfig.e = this.mConfig.mConnectRetryCount;
      paramTXLivePlayConfig.f = this.mConfig.mConnectRetryInterval;
      paramTXLivePlayConfig.h = this.mConfig.mEnableAec;
      paramTXLivePlayConfig.j = this.mConfig.mEnableNearestIP;
      paramTXLivePlayConfig.l = this.mConfig.mRtmpChannelType;
      paramTXLivePlayConfig.i = this.mEnableHWDec;
      paramTXLivePlayConfig.m = this.mConfig.mCacheFolderPath;
      paramTXLivePlayConfig.n = this.mConfig.mMaxCacheItems;
      paramTXLivePlayConfig.k = this.mConfig.mEnableMessage;
      paramTXLivePlayConfig.o = this.mConfig.mHeaders;
      this.mPlayer.a(paramTXLivePlayConfig);
    }
    paramTXLivePlayConfig = "setConfig:" + this.mConfig.mCacheTime + ":" + this.mConfig.mAutoAdjustCacheTime + ":" + this.mConfig.mMinAutoAdjustCacheTime + ":" + this.mConfig.mMaxAutoAdjustCacheTime;
    if ((this.mPlayUrl != null) && (this.mPlayUrl.length() > 0))
    {
      TXCDRApi.reportEvent40003(this.mPlayUrl, com.tencent.liteav.basic.datareport.a.S, 0, paramTXLivePlayConfig, "");
      AppMethodBeat.o(65939);
    }
    while (true)
    {
      return;
      this.mCallFuncBeforeStartPlay.add(paramTXLivePlayConfig);
      AppMethodBeat.o(65939);
    }
  }

  public void setMute(boolean paramBoolean)
  {
    AppMethodBeat.i(65959);
    TXCLog.d("TXLivePlayer", "liteav_api setMute ".concat(String.valueOf(paramBoolean)));
    this.mMute = paramBoolean;
    if (this.mPlayer != null)
      this.mPlayer.b(paramBoolean);
    if ((this.mPlayUrl != null) && (this.mPlayUrl.length() > 0))
    {
      TXCDRApi.reportEvent40003(this.mPlayUrl, com.tencent.liteav.basic.datareport.a.S, 0, "setMute:".concat(String.valueOf(paramBoolean)), "");
      AppMethodBeat.o(65959);
    }
    while (true)
    {
      return;
      this.mCallFuncBeforeStartPlay.add("setMute:".concat(String.valueOf(paramBoolean)));
      AppMethodBeat.o(65959);
    }
  }

  public void setPlayListener(ITXLivePlayListener paramITXLivePlayListener)
  {
    AppMethodBeat.i(65952);
    TXCLog.d("TXLivePlayer", "liteav_api setPlayListener ".concat(String.valueOf(this)));
    this.mListener = paramITXLivePlayListener;
    AppMethodBeat.o(65952);
  }

  public void setPlayerView(TXCloudVideoView paramTXCloudVideoView)
  {
    AppMethodBeat.i(65940);
    TXCLog.d("TXLivePlayer", "liteav_api setPlayerView old view : " + this.mTXCloudVideoView + ", new view : " + paramTXCloudVideoView + ", " + this);
    this.mTXCloudVideoView = paramTXCloudVideoView;
    if (this.mPlayer != null)
      this.mPlayer.a(paramTXCloudVideoView);
    AppMethodBeat.o(65940);
  }

  public void setRate(float paramFloat)
  {
    AppMethodBeat.i(65961);
    TXCLog.d("TXLivePlayer", "liteav_api setRate ".concat(String.valueOf(paramFloat)));
    this.mRate = paramFloat;
    if (this.mPlayer != null)
      this.mPlayer.a(paramFloat);
    AppMethodBeat.o(65961);
  }

  public void setRenderMode(int paramInt)
  {
    AppMethodBeat.i(65956);
    TXCLog.d("TXLivePlayer", "liteav_api setRenderMode ".concat(String.valueOf(paramInt)));
    this.mRenderMode = paramInt;
    if (this.mPlayer != null)
      this.mPlayer.a(paramInt);
    AppMethodBeat.o(65956);
  }

  public void setRenderRotation(int paramInt)
  {
    AppMethodBeat.i(65957);
    TXCLog.d("TXLivePlayer", "liteav_api setRenderRotation ".concat(String.valueOf(paramInt)));
    this.mRenderRotation = paramInt;
    if (this.mPlayer != null)
      this.mPlayer.b(paramInt);
    AppMethodBeat.o(65957);
  }

  public void setSurface(Surface paramSurface)
  {
    AppMethodBeat.i(65941);
    TXCLog.d("TXLivePlayer", "liteav_api setSurface old : " + this.mSurface + ", new : " + paramSurface + ", " + this);
    this.mSurface = paramSurface;
    if (this.mPlayer != null)
      this.mPlayer.a(this.mSurface);
    AppMethodBeat.o(65941);
  }

  public void setSurfaceSize(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(65942);
    this.mSurfaceWidth = paramInt1;
    this.mSurfaceHeight = paramInt2;
    if (this.mPlayer != null)
      this.mPlayer.a(paramInt1, paramInt2);
    AppMethodBeat.o(65942);
  }

  public void setVideoRawDataListener(final TXLivePlayer.ITXVideoRawDataListener paramITXVideoRawDataListener)
  {
    AppMethodBeat.i(65965);
    TXCLog.d("TXLivePlayer", "liteav_api setVideoRawDataListener ".concat(String.valueOf(paramITXVideoRawDataListener)));
    this.mVideoRawDataListener = paramITXVideoRawDataListener;
    if (this.mPlayer == null)
      AppMethodBeat.o(65965);
    while (true)
    {
      return;
      if (paramITXVideoRawDataListener != null)
      {
        this.mPlayer.a(new o()
        {
          public void onVideoRawDataAvailable(byte[] paramAnonymousArrayOfByte, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
          {
            AppMethodBeat.i(65594);
            paramITXVideoRawDataListener.onVideoRawDataAvailable(paramAnonymousArrayOfByte, paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3);
            AppMethodBeat.o(65594);
          }
        });
        AppMethodBeat.o(65965);
      }
      else
      {
        this.mPlayer.a(null);
        AppMethodBeat.o(65965);
      }
    }
  }

  public void setVideoRecordListener(TXRecordCommon.ITXVideoRecordListener paramITXVideoRecordListener)
  {
    AppMethodBeat.i(65953);
    TXCLog.d("TXLivePlayer", "liteav_api setVideoRecordListener");
    if (this.mPlayer != null)
      this.mPlayer.a(paramITXVideoRecordListener);
    AppMethodBeat.o(65953);
  }

  public void snapshot(TXLivePlayer.ITXSnapshotListener paramITXSnapshotListener)
  {
    AppMethodBeat.i(65966);
    TXCLog.d("TXLivePlayer", "liteav_api snapshot ".concat(String.valueOf(paramITXSnapshotListener)));
    if ((this.mSnapshotRunning) || (paramITXSnapshotListener == null))
    {
      AppMethodBeat.o(65966);
      return;
    }
    this.mSnapshotRunning = true;
    if (this.mPlayer != null);
    for (Object localObject1 = this.mPlayer.d(); ; localObject1 = null)
    {
      while (true)
        if (localObject1 != null)
          try
          {
            Bitmap localBitmap1 = ((TextureView)localObject1).getBitmap();
            Bitmap localBitmap2 = localBitmap1;
            if (localBitmap1 != null)
            {
              localObject1 = ((TextureView)localObject1).getTransform(null);
              localBitmap2 = Bitmap.createBitmap(localBitmap1, 0, 0, localBitmap1.getWidth(), localBitmap1.getHeight(), (Matrix)localObject1, true);
              localBitmap1.recycle();
            }
            postBitmapToMainThread(paramITXSnapshotListener, localBitmap2);
            AppMethodBeat.o(65966);
          }
          catch (OutOfMemoryError localOutOfMemoryError)
          {
            while (true)
              Object localObject2 = null;
          }
      this.mSnapshotRunning = false;
      AppMethodBeat.o(65966);
      break;
    }
  }

  public int startPlay(String paramString, int paramInt)
  {
    int i = -1;
    AppMethodBeat.i(65943);
    TXCLog.d("TXLivePlayer", "liteav_api startPlay ".concat(String.valueOf(this)));
    if (TextUtils.isEmpty(paramString))
    {
      TXCLog.e("TXLivePlayer", "start play error when url is empty ".concat(String.valueOf(this)));
      AppMethodBeat.o(65943);
      paramInt = i;
    }
    while (true)
    {
      return paramInt;
      if ((!TextUtils.isEmpty(this.mPlayUrl)) && (isPlaying()))
      {
        if (this.mPlayUrl.equalsIgnoreCase(paramString))
        {
          TXCLog.e("TXLivePlayer", "start play error when new url is the same with old url  ".concat(String.valueOf(this)));
          AppMethodBeat.o(65943);
          paramInt = i;
        }
        else
        {
          TXCLog.w("TXLivePlayer", " stop old play when new url is not the same with old url  ".concat(String.valueOf(this)));
          if (this.mPlayer != null)
            this.mPlayer.a(false);
          this.mPlayUrl = "";
        }
      }
      else
      {
        TXCDRApi.initCrashReport(this.mContext);
        TXCLog.d("TXLivePlayer", "===========================================================================================================================================================");
        TXCLog.d("TXLivePlayer", "===========================================================================================================================================================");
        TXCLog.d("TXLivePlayer", "=====  StartPlay url = " + paramString + " playType = " + paramInt + " SDKVersion = " + TXCCommonUtil.getSDKID() + " , " + TXCCommonUtil.getSDKVersionStr() + "    ======");
        TXCLog.d("TXLivePlayer", "===========================================================================================================================================================");
        TXCLog.d("TXLivePlayer", "===========================================================================================================================================================");
        if ((this.mCurrentPlayType == -1) || (this.mCurrentPlayType != paramInt))
          this.mPlayer = p.a(this.mContext, paramInt);
        this.mCurrentPlayType = paramInt;
        if (this.mPlayer == null)
        {
          paramInt = -2;
          AppMethodBeat.o(65943);
        }
        else
        {
          this.mPlayUrl = checkPlayUrl(paramString, paramInt);
          setConfig(this.mConfig);
          if (this.mTXCloudVideoView != null)
          {
            this.mTXCloudVideoView.clearLog();
            this.mTXCloudVideoView.setVisibility(0);
          }
          this.mPlayer.a(this.mTXCloudVideoView);
          this.mPlayer.a(this);
          this.mPlayer.c(this.mAutoPlay);
          if (this.mSurface != null)
          {
            this.mPlayer.a(this.mSurface);
            this.mPlayer.a(this.mSurfaceWidth, this.mSurfaceHeight);
          }
          this.mPlayer.a(this.mPlayUrl, paramInt);
          this.mPlayer.b(this.mMute);
          this.mPlayer.a(this.mRate);
          this.mPlayer.b(this.mRenderRotation);
          this.mPlayer.a(this.mRenderMode);
          setAudioRoute(this.mAudioRoute);
          this.mPlayer.a(this.mAudioRawDataListener);
          setVideoRawDataListener(this.mVideoRawDataListener);
          if (this.mPlayer.f())
          {
            this.mLivePlayUrl = this.mPlayUrl;
            if (this.mTimeShiftUtil == null)
              break label589;
          }
          label589: for (long l = this.mTimeShiftUtil.a(); ; l = 0L)
          {
            this.mProgressStartTime = l;
            if (this.mProgressStartTime > 0L)
              this.mPlayer.g();
            Iterator localIterator = this.mCallFuncBeforeStartPlay.iterator();
            while (localIterator.hasNext())
            {
              paramString = (String)localIterator.next();
              TXCDRApi.reportEvent40003(this.mPlayUrl, com.tencent.liteav.basic.datareport.a.S, 0, paramString, "");
            }
          }
          this.mCallFuncBeforeStartPlay.clear();
          TXCDRApi.reportEvent40003(this.mPlayUrl, com.tencent.liteav.basic.datareport.a.S, 0, "startPlay:".concat(String.valueOf(paramInt)), "");
          AppMethodBeat.o(65943);
          paramInt = 0;
        }
      }
    }
  }

  public int startRecord(int paramInt)
  {
    int i = -1;
    AppMethodBeat.i(65954);
    TXCLog.d("TXLivePlayer", "liteav_api startRecord ".concat(String.valueOf(this)));
    if (Build.VERSION.SDK_INT < 18)
    {
      TXCLog.e("TXLivePlayer", "API levl is too low (record need 18, current is" + Build.VERSION.SDK_INT + ")");
      paramInt = -3;
      AppMethodBeat.o(65954);
    }
    while (true)
    {
      return paramInt;
      if (!isPlaying())
      {
        TXCLog.e("TXLivePlayer", "startRecord: there is no playing stream");
        AppMethodBeat.o(65954);
        paramInt = i;
      }
      else if (this.mPlayer != null)
      {
        paramInt = this.mPlayer.c(paramInt);
        AppMethodBeat.o(65954);
      }
      else
      {
        AppMethodBeat.o(65954);
        paramInt = i;
      }
    }
  }

  public int stopPlay(boolean paramBoolean)
  {
    AppMethodBeat.i(65945);
    TXCLog.d("TXLivePlayer", "liteav_api stopPlay " + paramBoolean + ", " + this);
    if ((this.mPlayUrl != null) && (this.mPlayUrl.length() > 0))
      TXCDRApi.reportEvent40003(this.mPlayUrl, com.tencent.liteav.basic.datareport.a.S, 0, "stopPlay", "");
    if ((paramBoolean) && (this.mTXCloudVideoView != null))
      this.mTXCloudVideoView.setVisibility(8);
    if (this.mPlayer != null)
      this.mPlayer.a(paramBoolean);
    this.mPlayUrl = "";
    this.mProgressStartTime = 0L;
    this.mTimeShiftUtil = null;
    this.mIsShiftPlaying = false;
    AppMethodBeat.o(65945);
    return 0;
  }

  public int stopRecord()
  {
    AppMethodBeat.i(65955);
    TXCLog.d("TXLivePlayer", "liteav_api stopRecord ".concat(String.valueOf(this)));
    int i;
    if (this.mPlayer != null)
    {
      i = this.mPlayer.e();
      AppMethodBeat.o(65955);
    }
    while (true)
    {
      return i;
      i = -1;
      AppMethodBeat.o(65955);
    }
  }

  public int switchStream(String paramString)
  {
    AppMethodBeat.i(65944);
    int i;
    if (this.mPlayer != null)
    {
      i = this.mPlayer.a(paramString);
      AppMethodBeat.o(65944);
    }
    while (true)
    {
      return i;
      i = -1;
      AppMethodBeat.o(65944);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.rtmp.TXLivePlayer
 * JD-Core Version:    0.6.2
 */