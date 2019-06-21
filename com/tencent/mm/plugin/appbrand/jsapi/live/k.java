package com.tencent.mm.plugin.appbrand.jsapi.live;

import android.content.Context;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.rtmp.ITXLivePlayListener;
import com.tencent.rtmp.TXLivePlayConfig;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.TXLivePlayer.ITXSnapshotListener;
import com.tencent.rtmp.ui.TXCloudVideoView;
import java.util.Iterator;
import java.util.Set;

public final class k
  implements ITXLivePlayListener
{
  TXCloudVideoView hLH;
  private TXLivePlayConfig hLI;
  TXLivePlayer hLJ;
  ITXLivePlayListener hLK;
  TXLivePlayer.ITXSnapshotListener hLL;
  String hLM;
  int hLN;
  boolean hLO;
  private String hLP;
  private String hLQ;
  private String hLR;
  private float hLS;
  private float hLT;
  private boolean hLU;
  private boolean hLV;
  boolean hLW;
  boolean hLX;
  boolean hLf;
  boolean mAutoPlay;
  private Context mContext;
  boolean mInited;
  private int mMode;
  private boolean mMute;

  public k(Context paramContext)
  {
    AppMethodBeat.i(96131);
    this.hLM = "";
    this.hLN = 0;
    this.mInited = false;
    this.hLO = false;
    this.mAutoPlay = false;
    this.mMode = 1;
    this.mMute = false;
    this.hLP = "vertical";
    this.hLQ = "contain";
    this.hLR = "speaker";
    this.hLS = 1.0F;
    this.hLT = 3.0F;
    this.hLU = true;
    this.hLf = false;
    this.hLV = false;
    this.hLW = true;
    this.hLX = true;
    this.mContext = paramContext;
    this.hLI = new TXLivePlayConfig();
    this.hLJ = new TXLivePlayer(this.mContext);
    this.hLJ.setConfig(this.hLI);
    this.hLJ.setPlayListener(this);
    AppMethodBeat.o(96131);
  }

  private void a(TXLivePlayer.ITXSnapshotListener paramITXSnapshotListener)
  {
    AppMethodBeat.i(96133);
    if (this.hLJ != null)
      this.hLJ.snapshot(new k.1(this, paramITXSnapshotListener));
    AppMethodBeat.o(96133);
  }

  static void l(String paramString, Bundle paramBundle)
  {
    AppMethodBeat.i(96139);
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if ((str.equalsIgnoreCase("playUrl")) || (str.equalsIgnoreCase("orientation")) || (str.equalsIgnoreCase("objectFit")) || (str.equalsIgnoreCase("soundMode")))
        paramString = paramString + "\n" + str + " = " + paramBundle.getString(str);
      else if ((str.equalsIgnoreCase("mode")) || (str.equalsIgnoreCase("playType")))
        paramString = paramString + "\n" + str + " = " + paramBundle.getInt(str);
      else if ((str.equalsIgnoreCase("minCache")) || (str.equalsIgnoreCase("maxCache")))
        paramString = paramString + "\n" + str + " = " + paramBundle.getFloat(str);
      else if ((str.equalsIgnoreCase("hide")) || (str.equalsIgnoreCase("autoplay")) || (str.equalsIgnoreCase("muted")) || (str.equalsIgnoreCase("backgroundMute")) || (str.equalsIgnoreCase("needEvent")) || (str.equalsIgnoreCase("debug")))
        paramString = paramString + "\n" + str + " = " + paramBundle.getBoolean(str);
    }
    ab.i("TXLivePlayerJSAdapter", paramString);
    AppMethodBeat.o(96139);
  }

  final void A(Bundle paramBundle)
  {
    AppMethodBeat.i(96138);
    this.mMute = paramBundle.getBoolean("muted", this.mMute);
    this.hLJ.setMute(this.mMute);
    this.hLP = paramBundle.getString("orientation", this.hLP);
    if (this.hLP.equalsIgnoreCase("horizontal"))
    {
      this.hLJ.setRenderRotation(270);
      this.hLQ = paramBundle.getString("objectFit", this.hLQ);
      if (!this.hLQ.equalsIgnoreCase("fillCrop"))
        break label328;
      this.hLJ.setRenderMode(0);
      label102: if (paramBundle.keySet().contains("soundMode"))
      {
        this.hLR = paramBundle.getString("soundMode", this.hLR);
        if (!this.hLR.equalsIgnoreCase("speaker"))
          break label351;
        this.hLJ.setAudioRoute(0);
      }
    }
    while (true)
    {
      this.hLS = paramBundle.getFloat("minCache", this.hLS);
      this.hLT = paramBundle.getFloat("maxCache", this.hLT);
      this.hLI.setAutoAdjustCacheTime(true);
      this.hLI.setCacheTime(this.hLS);
      this.hLI.setMinAutoAdjustCacheTime(this.hLS);
      this.hLI.setMaxAutoAdjustCacheTime(this.hLT);
      this.hLJ.setConfig(this.hLI);
      this.hLf = paramBundle.getBoolean("needEvent", this.hLf);
      this.hLW = paramBundle.getBoolean("autoPauseIfNavigate", this.hLW);
      this.hLX = paramBundle.getBoolean("autoPauseIfOpenNative", this.hLX);
      this.hLV = paramBundle.getBoolean("debug", this.hLV);
      this.hLH.showLog(this.hLV);
      AppMethodBeat.o(96138);
      return;
      if (!this.hLP.equalsIgnoreCase("vertical"))
        break;
      this.hLJ.setRenderRotation(0);
      break;
      label328: if (!this.hLQ.equalsIgnoreCase("contain"))
        break label102;
      this.hLJ.setRenderMode(1);
      break label102;
      label351: if (this.hLR.equalsIgnoreCase("ear"))
        this.hLJ.setAudioRoute(1);
    }
  }

  public final i Bd(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(96132);
    if (paramString == null)
    {
      paramString = new i(-1, "invalid params");
      AppMethodBeat.o(96132);
    }
    while (true)
    {
      return paramString;
      ab.i("TXLivePlayerJSAdapter", "operateLivePlayer: ".concat(String.valueOf(paramString)));
      if (!this.mInited)
      {
        paramString = new i(-3, "uninited livePlayer");
        AppMethodBeat.o(96132);
      }
      else
      {
        if (paramString.equalsIgnoreCase("play"))
        {
          Be(this.hLM);
          this.hLJ.startPlay(this.hLM, this.hLN);
        }
        while (true)
        {
          paramString = new i();
          AppMethodBeat.o(96132);
          break;
          if (paramString.equalsIgnoreCase("stop"))
          {
            this.hLJ.stopPlay(true);
          }
          else if (paramString.equalsIgnoreCase("pause"))
          {
            this.hLJ.pause();
          }
          else if (paramString.equalsIgnoreCase("resume"))
          {
            this.hLJ.resume();
          }
          else
          {
            if (paramString.equalsIgnoreCase("mute"))
            {
              if (!this.mMute);
              while (true)
              {
                this.mMute = bool;
                this.hLJ.setMute(this.mMute);
                break;
                bool = false;
              }
            }
            if (!paramString.equalsIgnoreCase("snapshot"))
              break label251;
            a(this.hLL);
          }
        }
        label251: paramString = new i(-4, "invalid operate command");
        AppMethodBeat.o(96132);
      }
    }
  }

  final void Be(String paramString)
  {
    AppMethodBeat.i(96137);
    boolean bool;
    if (paramString != null)
      if (!paramString.startsWith("room"))
      {
        bool = true;
        this.hLJ.enableHardwareDecode(bool);
        ab.i("TXLivePlayerJSAdapter", "checkHardWareDecoder: hardwareDecode = " + bool + ", playUrl = " + paramString);
        AppMethodBeat.o(96137);
      }
    while (true)
    {
      return;
      bool = false;
      break;
      ab.i("TXLivePlayerJSAdapter", "checkHardWareDecoder: invalid playUrl");
      AppMethodBeat.o(96137);
    }
  }

  public final void onNetStatus(Bundle paramBundle)
  {
    AppMethodBeat.i(96135);
    if (this.hLK != null)
      this.hLK.onNetStatus(paramBundle);
    ab.i("TXLivePlayerJSAdapter", "onNetStatus:".concat(String.valueOf(String.format("%-16s %-16s %-16s %-12s %-12s %-12s %-12s %-14s %-14s %-14s %-16s %-16s", new Object[] { "CPU:" + paramBundle.getString("CPU_USAGE"), "RES:" + paramBundle.getInt("VIDEO_WIDTH") + "*" + paramBundle.getInt("VIDEO_HEIGHT"), "SPD:" + paramBundle.getInt("NET_SPEED") + "Kbps", "JIT:" + paramBundle.getInt("NET_JITTER"), "FPS:" + paramBundle.getInt("VIDEO_FPS"), "GOP:" + paramBundle.getInt("VIDEO_GOP") + "s", "ARA:" + paramBundle.getInt("AUDIO_BITRATE") + "Kbps", "QUE:" + paramBundle.getInt("CODEC_CACHE") + " | " + paramBundle.getInt("CACHE_SIZE") + "," + paramBundle.getInt("VIDEO_CACHE_SIZE") + "," + paramBundle.getInt("V_DEC_CACHE_SIZE") + " | " + paramBundle.getInt("AV_RECV_INTERVAL") + "," + paramBundle.getInt("AV_PLAY_INTERVAL") + "," + String.format("%.1f", new Object[] { Float.valueOf(paramBundle.getFloat("AUDIO_PLAY_SPEED")) }).toString(), "VRA:" + paramBundle.getInt("VIDEO_BITRATE") + "Kbps", "DRP:" + paramBundle.getInt("CODEC_DROP_CNT") + "|" + paramBundle.getInt("DROP_SIZE"), "SVR:" + paramBundle.getString("SERVER_IP"), "AUDIO:" + paramBundle.getString("AUDIO_PLAY_INFO") }))));
    AppMethodBeat.o(96135);
  }

  public final void onPlayEvent(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(96134);
    if ((paramInt == 2006) || (paramInt == -2301))
      Bd("stop");
    if ((this.hLf) && (this.hLK != null))
      this.hLK.onPlayEvent(paramInt, paramBundle);
    paramBundle = paramBundle.getString("EVT_MSG");
    ab.i("TXLivePlayerJSAdapter", "onPushEvent: event = " + paramInt + " message = " + paramBundle);
    AppMethodBeat.o(96134);
  }

  final int z(Bundle paramBundle)
  {
    int i = 0;
    AppMethodBeat.i(96136);
    this.mMode = paramBundle.getInt("mode", this.mMode);
    if (this.mMode == 1)
      if (this.hLM == null)
        AppMethodBeat.o(96136);
    while (true)
    {
      return i;
      if ((this.hLM != null) && ((this.hLM.startsWith("http://")) || (this.hLM.startsWith("https://"))) && (this.hLM.contains(".flv")))
      {
        AppMethodBeat.o(96136);
        i = 1;
      }
      else
      {
        AppMethodBeat.o(96136);
        continue;
        i = 5;
        AppMethodBeat.o(96136);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.live.k
 * JD-Core Version:    0.6.2
 */