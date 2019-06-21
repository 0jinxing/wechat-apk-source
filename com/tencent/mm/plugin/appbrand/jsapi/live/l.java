package com.tencent.mm.plugin.appbrand.jsapi.live;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.rtmp.ITXLivePushListener;
import com.tencent.rtmp.TXLivePushConfig;
import com.tencent.rtmp.TXLivePusher;
import com.tencent.rtmp.TXLivePusher.ITXSnapshotListener;
import com.tencent.rtmp.TXLivePusher.OnBGMNotify;
import com.tencent.rtmp.ui.TXCloudVideoView;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;

public final class l
  implements ITXLivePushListener, TXLivePusher.OnBGMNotify
{
  private String hGr;
  TXCloudVideoView hLH;
  private String hLP;
  private boolean hLV;
  private TXLivePushConfig hLZ;
  private boolean hLf;
  private String hMA;
  TXLivePusher hMa;
  ITXLivePushListener hMb;
  String hMc;
  private boolean hMd;
  private boolean hMe;
  private boolean hMf;
  TXLivePusher.ITXSnapshotListener hMg;
  TXLivePusher.OnBGMNotify hMh;
  private boolean hMi;
  private boolean hMj;
  boolean hMk;
  private int hMl;
  private int hMm;
  private int hMn;
  private int hMo;
  boolean hMp;
  private String hMq;
  private int hMr;
  private int hMs;
  private String hMt;
  private boolean hMu;
  private boolean hMv;
  private boolean hMw;
  private boolean hMx;
  private float hMy;
  private float hMz;
  private Context mContext;
  private boolean mEnableZoom;
  private boolean mFrontCamera;
  private Handler mHandler;
  boolean mInited;
  private int mMode;
  private boolean mMute;
  private float mWatermarkWidth;

  public l(Context paramContext)
  {
    AppMethodBeat.i(96143);
    this.mInited = false;
    this.hMd = false;
    this.mFrontCamera = true;
    this.hGr = "front";
    this.hMe = false;
    this.hMf = false;
    this.hMi = false;
    this.hMj = false;
    this.hMk = false;
    this.mMode = 1;
    this.hMl = 2;
    this.hMm = -1;
    this.hMn = -1;
    this.mMute = false;
    this.hMo = 0;
    this.hMp = true;
    this.hLP = "vertical";
    this.hMq = "high";
    this.hMr = 5;
    this.hMs = 3;
    this.hMt = "";
    this.hMu = false;
    this.hMv = false;
    this.mEnableZoom = true;
    this.hLf = false;
    this.hMw = false;
    this.hLV = false;
    this.hMx = false;
    this.hMy = 0.0F;
    this.hMz = 0.0F;
    this.mWatermarkWidth = 0.1F;
    this.hMA = "";
    this.mContext = paramContext;
    this.mHandler = new Handler(this.mContext.getMainLooper());
    this.hLZ = new TXLivePushConfig();
    this.hMa = new TXLivePusher(paramContext);
    this.hMa.setConfig(this.hLZ);
    this.hMa.setPushListener(this);
    this.hMa.setBGMNofify(this);
    AppMethodBeat.o(96143);
  }

  private void a(TXLivePusher.ITXSnapshotListener paramITXSnapshotListener)
  {
    AppMethodBeat.i(96150);
    if ((this.hMa != null) && (this.hMa.isPushing()))
      this.hMa.snapshot(new l.2(this, paramITXSnapshotListener));
    AppMethodBeat.o(96150);
  }

  static void l(String paramString, Bundle paramBundle)
  {
    AppMethodBeat.i(96157);
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if ((str.equalsIgnoreCase("pushUrl")) || (str.equalsIgnoreCase("orientation")) || (str.equalsIgnoreCase("backgroundImage")) || (str.equalsIgnoreCase("audioQuality")) || (str.equalsIgnoreCase("watermarkImage")) || (str.equalsIgnoreCase("devicePosition")))
        paramString = paramString + "\n" + str + " = " + paramBundle.getString(str);
      else if ((str.equalsIgnoreCase("mode")) || (str.equalsIgnoreCase("focusMode")) || (str.equalsIgnoreCase("beauty")) || (str.equalsIgnoreCase("whiteness")) || (str.equalsIgnoreCase("aspect")) || (str.equalsIgnoreCase("minBitrate")) || (str.equalsIgnoreCase("maxBitrate")))
        paramString = paramString + "\n" + str + " = " + paramBundle.getInt(str);
      else if ((str.equalsIgnoreCase("hide")) || (str.equalsIgnoreCase("autopush")) || (str.equalsIgnoreCase("muted")) || (str.equalsIgnoreCase("enableCamera")) || (str.equalsIgnoreCase("backgroundMute")) || (str.equalsIgnoreCase("zoom")) || (str.equalsIgnoreCase("needEvent")) || (str.equalsIgnoreCase("needBGMEvent")) || (str.equalsIgnoreCase("debug")) || (str.equalsIgnoreCase("mirror")))
        paramString = paramString + "\n" + str + " = " + paramBundle.getBoolean(str);
      else if ((str.equalsIgnoreCase("watermarkLeft")) || (str.equalsIgnoreCase("watermarkTop")) || (str.equalsIgnoreCase("watermarkWidth")))
        paramString = paramString + "\n" + str + " = " + paramBundle.getFloat(str);
    }
    ab.i("TXLivePusherJSAdapter", paramString);
    AppMethodBeat.o(96157);
  }

  public final i aDK()
  {
    AppMethodBeat.i(96149);
    i locali;
    if (this.hMe)
      if (this.hMf)
      {
        locali = c("start", null);
        AppMethodBeat.o(96149);
      }
    while (true)
    {
      return locali;
      locali = c("resume", null);
      AppMethodBeat.o(96149);
      continue;
      locali = new i();
      AppMethodBeat.o(96149);
    }
  }

  public final i c(String paramString, JSONObject paramJSONObject)
  {
    boolean bool1 = true;
    boolean bool2 = true;
    int i = 0;
    AppMethodBeat.i(96145);
    if (paramString == null)
    {
      paramString = new i(-1, "invalid params");
      AppMethodBeat.o(96145);
    }
    while (true)
    {
      return paramString;
      if (this.mInited)
        break;
      paramString = new i(-3, "uninited livePusher");
      AppMethodBeat.o(96145);
    }
    ab.i("TXLivePusherJSAdapter", "operateLivePusher: ".concat(String.valueOf(paramString)));
    if (paramString.equalsIgnoreCase("start"))
      if ((this.hMc != null) && (!this.hMc.isEmpty()) && (!this.hMa.isPushing()))
      {
        ea(this.hMp);
        this.hMa.startPusher(this.hMc);
      }
    while (true)
    {
      label139: paramString = new i();
      AppMethodBeat.o(96145);
      break;
      if (paramString.equalsIgnoreCase("stop"))
      {
        this.hMv = false;
        this.hMa.stopBGM();
        stopPreview();
        this.hMa.stopPusher();
      }
      else if (paramString.equalsIgnoreCase("pause"))
      {
        if ((this.hMv) && (this.hMa.isPushing()))
          this.hMa.turnOnFlashLight(false);
        this.hMa.pausePusher();
        this.hMj = this.hMi;
        if (this.hMj)
          c("pauseBGM", null);
      }
      else if (paramString.equalsIgnoreCase("resume"))
      {
        this.hMa.resumePusher();
        if (this.hMj)
          c("resumeBGM", null);
      }
      else if (paramString.equalsIgnoreCase("startPreview"))
      {
        if (this.hMa.isPushing())
        {
          ab.i("TXLivePusherJSAdapter", "do not support startPreview when pushing");
        }
        else
        {
          stopPreview();
          ea(this.hMp);
        }
      }
      else if (paramString.equalsIgnoreCase("stopPreview"))
      {
        if (this.hMa.isPushing())
          ab.i("TXLivePusherJSAdapter", "do not support stopPreview when pushing");
        else
          stopPreview();
      }
      else
      {
        if (paramString.equalsIgnoreCase("switchCamera"))
        {
          if (!this.mFrontCamera);
          while (true)
          {
            this.mFrontCamera = bool2;
            this.hLZ.setFrontCamera(this.mFrontCamera);
            this.hMa.switchCamera();
            break;
            bool2 = false;
          }
        }
        if (paramString.equalsIgnoreCase("snapshot"))
        {
          a(this.hMg);
        }
        else
        {
          if (paramString.equalsIgnoreCase("toggleTorch"))
          {
            if (this.hMa.isPushing())
            {
              if (!this.hMv)
              {
                bool2 = bool1;
                label484: bool1 = this.hMa.turnOnFlashLight(bool2);
                if (!bool1)
                  break label542;
                label498: this.hMv = bool2;
                if (!bool1)
                  break label551;
                label508: if (!bool1)
                  break label558;
              }
              label542: label551: label558: for (paramString = "Success"; ; paramString = "Failed")
              {
                paramString = new i(i, paramString);
                AppMethodBeat.o(96145);
                break;
                bool2 = false;
                break label484;
                bool2 = this.hMv;
                break label498;
                i = -2;
                break label508;
              }
            }
            paramString = new i(-2, "fail");
            AppMethodBeat.o(96145);
            break;
          }
          if (paramString.equalsIgnoreCase("playBGM"))
          {
            paramString = "";
            if (paramJSONObject != null)
              paramString = paramJSONObject.optString("BGMFilePath", "");
            ab.i("TXLivePusherJSAdapter", "playBGM filePath = ".concat(String.valueOf(paramString)));
            if ((paramString != null) && (paramString.length() > 0))
            {
              this.hMa.playBGM(paramString);
              continue;
            }
            paramString = new i(-2, "fail");
            AppMethodBeat.o(96145);
            break;
          }
          if (paramString.equalsIgnoreCase("stopBGM"))
          {
            this.hMa.stopBGM();
            this.hMi = false;
          }
          else if (paramString.equalsIgnoreCase("pauseBGM"))
          {
            this.hMa.pauseBGM();
            this.hMi = false;
          }
          else
          {
            if (!paramString.equalsIgnoreCase("resumeBGM"))
              break label752;
            this.hMa.resumeBGM();
            this.hMi = true;
          }
        }
      }
    }
    label752: if (paramString.equalsIgnoreCase("setBGMVolume"))
      if (paramJSONObject == null)
        break label812;
    label812: for (double d = paramJSONObject.optDouble("volume", 1.0D); ; d = 1.0D)
    {
      this.hMa.setBGMVolume((float)d);
      break label139;
      paramString = new i(-4, "invalid operate command");
      AppMethodBeat.o(96145);
      break;
    }
  }

  final void c(Bundle paramBundle, boolean paramBoolean)
  {
    AppMethodBeat.i(96156);
    if ((!paramBoolean) && (paramBundle.keySet().size() == 0))
    {
      AppMethodBeat.o(96156);
      return;
    }
    int i = paramBundle.getInt("mode", this.mMode);
    if ((paramBoolean) || (i != this.mMode));
    label92: int j;
    int k;
    int m;
    int n;
    int i1;
    switch (i)
    {
    default:
      j = this.hMm;
      k = this.hMn;
      m = paramBundle.getInt("minBitrate", -1);
      n = paramBundle.getInt("maxBitrate", -1);
      if ((m != -1) && (n != -1))
      {
        i1 = m;
        if (m < 200)
          i1 = 200;
        m = n;
        if (n > 1800)
          m = 1800;
        if (i1 <= m)
          j = i1;
      }
      break;
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    }
    while (true)
    {
      n = paramBundle.getInt("aspect", this.hMl);
      String str1 = paramBundle.getString("audioQuality", this.hMq);
      label228: int i2;
      label286: Object localObject;
      boolean bool1;
      label313: boolean bool2;
      label347: boolean bool3;
      label462: int i3;
      int i4;
      String str2;
      Bitmap localBitmap;
      boolean bool4;
      label560: boolean bool5;
      float f1;
      float f2;
      float f3;
      String str3;
      if (i == 6)
      {
        if (n == 1)
        {
          this.hLZ.setVideoResolution(13);
          if ((j != -1) && (m != -1) && (j <= m))
          {
            this.hLZ.setMinVideoBitrate(j);
            this.hLZ.setMaxVideoBitrate(m);
          }
          if (!str1.equalsIgnoreCase("low"))
            break label1288;
          this.hLZ.setAudioSampleRate(16000);
        }
      }
      else
      {
        i2 = paramBundle.getInt("focusMode", this.hMo);
        localObject = this.hLZ;
        if (i2 == 0)
          break label1311;
        bool1 = true;
        ((TXLivePushConfig)localObject).setTouchFocus(bool1);
        bool2 = paramBundle.getBoolean("enableCamera", this.hMp);
        localObject = this.hLZ;
        if (bool2)
          break label1317;
        bool1 = true;
        ((TXLivePushConfig)localObject).enablePureAudioPush(bool1);
        bool3 = this.mFrontCamera;
        bool1 = bool3;
        if (paramBundle.keySet().contains("devicePosition"))
        {
          this.hGr = paramBundle.getString("devicePosition", this.hGr);
          bool1 = bool3;
          if (this.hGr.equalsIgnoreCase("back"))
            bool1 = false;
          this.hLZ.setFrontCamera(bool1);
        }
        localObject = paramBundle.getString("orientation", this.hLP);
        i1 = 0;
        if (!((String)localObject).equalsIgnoreCase("horizontal"))
          break label1323;
        this.hLZ.setHomeOrientation(0);
        i1 = 90;
        i3 = paramBundle.getInt("beauty", this.hMr);
        i4 = paramBundle.getInt("whiteness", this.hMs);
        this.hLZ.setBeautyFilter(i3, i4, 5);
        str2 = paramBundle.getString("backgroundImage", this.hMt);
        localBitmap = BitmapFactory.decodeFile(str2);
        if (localBitmap != null)
          this.hLZ.setPauseImg(localBitmap);
        bool4 = paramBundle.getBoolean("backgroundMute", this.hMu);
        if (!bool4)
          break label1347;
        this.hLZ.setPauseFlag(3);
        bool5 = paramBundle.getBoolean("zoom", this.mEnableZoom);
        this.hLZ.setEnableZoom(bool5);
        bool3 = paramBundle.getBoolean("mirror", this.hMx);
        this.hMa.setMirror(bool3);
        f1 = paramBundle.getFloat("watermarkLeft", this.hMy);
        f2 = paramBundle.getFloat("watermarkTop", this.hMz);
        f3 = paramBundle.getFloat("watermarkWidth", this.mWatermarkWidth);
        str3 = paramBundle.getString("watermarkImage", this.hMA);
        localBitmap = BitmapFactory.decodeFile(str3);
        if (localBitmap == null)
          break label1358;
        this.hLZ.setWatermark(localBitmap, f1, f2, f3);
        label684: k = 0;
        if ((n != this.hMl) || (j != this.hMm) || (m != this.hMn) || (i2 != this.hMo) || (bool1 != this.mFrontCamera) || (bool2 != this.hMp) || (i3 != this.hMr) || (i4 != this.hMs) || (bool4 != this.hMu) || (bool5 != this.mEnableZoom) || (bool3 != this.hMx) || (f1 != this.hMy) || (f2 != this.hMz) || (f3 != this.mWatermarkWidth) || (!str2.equalsIgnoreCase(this.hMt)) || (!((String)localObject).equalsIgnoreCase(this.hLP)) || (!str1.equalsIgnoreCase(this.hMq)) || (!str3.equalsIgnoreCase(this.hMA)))
          k = 1;
        if ((paramBoolean) || (k != 0))
        {
          this.hMa.setConfig(this.hLZ);
          this.hMa.setRenderRotation(i1);
          this.hMa.setBeautyFilter(0, i3, i4, 2);
        }
        if (bool2 != this.hMp)
        {
          if (!bool2)
            break label1401;
          stopPreview();
          ea(bool2);
        }
      }
      while (true)
      {
        this.mMode = i;
        this.hMl = n;
        this.hMo = i2;
        this.hMp = bool2;
        this.mFrontCamera = bool1;
        this.hLP = ((String)localObject);
        this.hMr = i3;
        this.hMs = i4;
        this.hMu = bool4;
        this.hMt = str2;
        this.hMm = j;
        this.hMn = m;
        this.hMq = str1;
        this.mEnableZoom = bool5;
        this.hMx = bool3;
        this.hMy = f1;
        this.hMz = f2;
        this.mWatermarkWidth = f3;
        this.hMA = str3;
        this.hLf = paramBundle.getBoolean("needEvent", this.hLf);
        this.hMw = paramBundle.getBoolean("needBGMEvent", this.hMw);
        bool1 = paramBundle.getBoolean("muted", this.mMute);
        if ((paramBoolean) || (bool1 != this.mMute))
          this.hMa.setMute(bool1);
        this.mMute = bool1;
        bool1 = paramBundle.getBoolean("debug", this.hLV);
        if ((paramBoolean) || (bool1 != this.hLV))
          this.hLH.showLog(bool1);
        this.hLV = bool1;
        AppMethodBeat.o(96156);
        break;
        this.hMa.setVideoQuality(1, false, false);
        this.hLZ.setVideoEncodeGop(5);
        break label92;
        this.hMa.setVideoQuality(2, true, false);
        this.hLZ.setVideoEncodeGop(5);
        break label92;
        this.hMa.setVideoQuality(3, true, false);
        this.hLZ.setVideoEncodeGop(5);
        break label92;
        this.hMa.setVideoQuality(4, true, false);
        break label92;
        this.hMa.setVideoQuality(5, true, false);
        break label92;
        this.hMa.setVideoQuality(6, false, false);
        break label92;
        if (n != 2)
          break label228;
        this.hLZ.setVideoResolution(0);
        break label228;
        label1288: if (!str1.equalsIgnoreCase("high"))
          break label286;
        this.hLZ.setAudioSampleRate(48000);
        break label286;
        label1311: bool1 = false;
        break label313;
        label1317: bool1 = false;
        break label347;
        label1323: if (!((String)localObject).equalsIgnoreCase("vertical"))
          break label462;
        this.hLZ.setHomeOrientation(1);
        i1 = 0;
        break label462;
        label1347: this.hLZ.setPauseFlag(1);
        break label560;
        label1358: if ((!this.hMa.isPushing()) || (!paramBundle.keySet().contains("watermarkImage")))
          break label684;
        this.hLZ.setWatermark(localBitmap, f1, f2, f3);
        break label684;
        label1401: stopPreview();
      }
      m = k;
    }
  }

  final void ea(boolean paramBoolean)
  {
    AppMethodBeat.i(96146);
    if ((!this.hMd) && (paramBoolean))
    {
      this.hLH.setVisibility(0);
      this.hMa.startCameraPreview(this.hLH);
      this.hMd = true;
    }
    AppMethodBeat.o(96146);
  }

  public final i eb(boolean paramBoolean)
  {
    AppMethodBeat.i(96148);
    this.hMe = this.hMa.isPushing();
    i locali;
    if (this.hMe)
      if (paramBoolean)
      {
        this.hMf = paramBoolean;
        if ((this.hLf) && (this.hMb != null))
          this.hMb.onPushEvent(5000, new Bundle());
        locali = c("stop", null);
        AppMethodBeat.o(96148);
      }
    while (true)
    {
      return locali;
      locali = c("pause", null);
      AppMethodBeat.o(96148);
      continue;
      locali = new i();
      AppMethodBeat.o(96148);
    }
  }

  public final void onBGMComplete(int paramInt)
  {
    AppMethodBeat.i(96155);
    this.hMi = false;
    if ((this.hMw) && (this.hMh != null))
      this.hMh.onBGMComplete(paramInt);
    AppMethodBeat.o(96155);
  }

  public final void onBGMProgress(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(96154);
    if ((this.hMw) && (this.hMh != null))
      this.hMh.onBGMProgress(paramLong1, paramLong2);
    AppMethodBeat.o(96154);
  }

  public final void onBGMStart()
  {
    AppMethodBeat.i(96153);
    this.hMi = true;
    if ((this.hMw) && (this.hMh != null))
      this.hMh.onBGMStart();
    AppMethodBeat.o(96153);
  }

  public final void onNetStatus(Bundle paramBundle)
  {
    AppMethodBeat.i(96152);
    if (this.hMb != null)
      this.hMb.onNetStatus(paramBundle);
    ab.i("TXLivePusherJSAdapter", "onNetStatus:".concat(String.valueOf(String.format("%-16s %-16s %-16s %-12s %-12s %-12s %-12s %-14s %-14s %-14s %-16s %-16s", new Object[] { "CPU:" + paramBundle.getString("CPU_USAGE"), "RES:" + paramBundle.getInt("VIDEO_WIDTH") + "*" + paramBundle.getInt("VIDEO_HEIGHT"), "SPD:" + paramBundle.getInt("NET_SPEED") + "Kbps", "JIT:" + paramBundle.getInt("NET_JITTER"), "FPS:" + paramBundle.getInt("VIDEO_FPS"), "GOP:" + paramBundle.getInt("VIDEO_GOP") + "s", "ARA:" + paramBundle.getInt("AUDIO_BITRATE") + "Kbps", "QUE:" + paramBundle.getInt("CODEC_CACHE") + " | " + paramBundle.getInt("CACHE_SIZE") + "," + paramBundle.getInt("VIDEO_CACHE_SIZE") + "," + paramBundle.getInt("V_DEC_CACHE_SIZE") + " | " + paramBundle.getInt("AV_RECV_INTERVAL") + "," + paramBundle.getInt("AV_PLAY_INTERVAL") + "," + String.format("%.1f", new Object[] { Float.valueOf(paramBundle.getFloat("AUDIO_PLAY_SPEED")) }).toString(), "VRA:" + paramBundle.getInt("VIDEO_BITRATE") + "Kbps", "DRP:" + paramBundle.getInt("CODEC_DROP_CNT") + "|" + paramBundle.getInt("DROP_SIZE"), "SVR:" + paramBundle.getString("SERVER_IP"), "AUDIO:" + paramBundle.getString("AUDIO_PLAY_INFO") }))));
    AppMethodBeat.o(96152);
  }

  public final void onPushEvent(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(96151);
    if ((paramInt == -1307) || (paramInt == -1313))
      c("stop", null);
    while (true)
    {
      if ((this.hLf) && (this.hMb != null))
        this.hMb.onPushEvent(paramInt, paramBundle);
      paramBundle = paramBundle.getString("EVT_MSG");
      ab.i("TXLivePusherJSAdapter", "onPushEvent: event = " + paramInt + " message = " + paramBundle);
      AppMethodBeat.o(96151);
      return;
      if ((paramInt == 1003) && (this.hMv))
        this.hMa.turnOnFlashLight(this.hMv);
    }
  }

  public final void op(int paramInt)
  {
    AppMethodBeat.i(96144);
    this.mHandler.post(new l.1(this, paramInt));
    AppMethodBeat.o(96144);
  }

  final void stopPreview()
  {
    AppMethodBeat.i(96147);
    this.hMa.stopCameraPreview(true);
    this.hMd = false;
    AppMethodBeat.o(96147);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.live.l
 * JD-Core Version:    0.6.2
 */