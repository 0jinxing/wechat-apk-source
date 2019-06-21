package com.tencent.mm.plugin.appbrand.jsapi.video;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.modelvideo.MMVideoView;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.pluginsdk.ui.CommonVideoView;
import com.tencent.mm.pluginsdk.ui.g;
import com.tencent.mm.pluginsdk.ui.h.a;
import com.tencent.mm.pluginsdk.ui.h.b;
import com.tencent.mm.pluginsdk.ui.h.c;
import com.tencent.mm.pluginsdk.ui.h.d;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.j;

public class AppBrandVideoWrapper extends RelativeLayout
  implements com.tencent.mm.model.d.a, d, h.a, h.b, h.c
{
  private boolean bkJ;
  private boolean fdh;
  private com.tencent.mm.pluginsdk.ui.h hZY;
  private d.b hZZ;
  protected int hZs;
  private g iaa;
  private d.g iab;
  private float iac;
  private int iad;
  private boolean iae;
  private com.tencent.mm.model.d iaf;
  private Context mContext;
  private String url;

  public AppBrandVideoWrapper(Context paramContext)
  {
    this(paramContext, null);
  }

  public AppBrandVideoWrapper(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public AppBrandVideoWrapper(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(131588);
    this.iab = d.g.iaj;
    this.fdh = false;
    this.iac = -1.0F;
    this.hZs = 0;
    this.mContext = paramContext;
    this.iaf = new com.tencent.mm.model.d();
    AppMethodBeat.o(131588);
  }

  private boolean a(boolean paramBoolean, String paramString1, String paramString2)
  {
    boolean bool = true;
    AppMethodBeat.i(131592);
    if ((paramBoolean) || (this.iae))
    {
      AppMethodBeat.o(131592);
      paramBoolean = bool;
    }
    while (true)
    {
      return paramBoolean;
      if (com.tencent.mm.compatible.util.d.fP(18))
      {
        AppMethodBeat.o(131592);
        paramBoolean = bool;
      }
      else
      {
        int i = ah.getContext().getSharedPreferences("system_config_prefs", com.tencent.mm.compatible.util.h.Mu()).getInt("appbrand_video_player", -1);
        ab.d("MicroMsg.AppBrandVideoWrapper", "checkUseSystemPlayer abtestFlag[%d]", new Object[] { Integer.valueOf(i) });
        if (i <= 0)
        {
          ab.i("MicroMsg.AppBrandVideoWrapper", "abtest is zero, use system player");
          AppMethodBeat.o(131592);
          paramBoolean = bool;
        }
        else if ((!bo.isNullOrNil(paramString1)) && (paramString1.contains(".m3u8")))
        {
          ab.i("MicroMsg.AppBrandVideoWrapper", "%d it is m3u8 file use system player.", new Object[] { Integer.valueOf(hashCode()) });
          gp(204L);
          AppMethodBeat.o(131592);
          paramBoolean = bool;
        }
        else if (r.ud(paramString2))
        {
          ab.i("MicroMsg.AppBrandVideoWrapper", "%d it is m3u8 file use system player.", new Object[] { Integer.valueOf(hashCode()) });
          gp(204L);
          AppMethodBeat.o(131592);
          paramBoolean = bool;
        }
        else
        {
          AppMethodBeat.o(131592);
          paramBoolean = false;
        }
      }
    }
  }

  public static void aDc()
  {
    AppMethodBeat.i(131587);
    AppBrandVideoView.setProxy(new AppBrandVideoWrapper.1());
    AppMethodBeat.o(131587);
  }

  private com.tencent.mm.pluginsdk.ui.h aFT()
  {
    AppMethodBeat.i(131590);
    CommonVideoView localCommonVideoView = new CommonVideoView(this.mContext);
    localCommonVideoView.setReporter(this);
    localCommonVideoView.KM(this.hZs);
    localCommonVideoView.setIMMVideoViewCallback(this);
    gp(200L);
    AppMethodBeat.o(131590);
    return localCommonVideoView;
  }

  private com.tencent.mm.pluginsdk.ui.h aFU()
  {
    AppMethodBeat.i(131591);
    MMVideoView localMMVideoView = new MMVideoView(this.mContext);
    localMMVideoView.setReporter(this);
    localMMVideoView.setIMMVideoViewCallback(this);
    localMMVideoView.setIOnlineVideoProxy(new AppBrandOnlineVideoProxy());
    localMMVideoView.setIMMDownloadFinish(this);
    String str = e.eSn + "appbrandvideo/";
    j.aih(str);
    localMMVideoView.setRootPath(str);
    gp(201L);
    AppMethodBeat.o(131591);
    return localMMVideoView;
  }

  public final void aEX()
  {
    AppMethodBeat.i(131612);
    if (this.hZY != null)
      this.hZY.aEX();
    this.iaf.cy(false);
    setKeepScreenOn(false);
    AppMethodBeat.o(131612);
  }

  public final void akV()
  {
    AppMethodBeat.i(131611);
    if (this.hZY != null)
      this.hZY.akV();
    this.iaf.cy(false);
    setKeepScreenOn(false);
    AppMethodBeat.o(131611);
  }

  public final void akW()
  {
    AppMethodBeat.i(131610);
    if (this.hZY != null)
      this.hZY.akW();
    AppMethodBeat.o(131610);
  }

  public final void am(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(131615);
    ab.i("MicroMsg.AppBrandVideoWrapper", "%d onDownloadFinish path [%s] isPlayNow [%b]", new Object[] { Integer.valueOf(hashCode()), paramString, Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      AppMethodBeat.o(131615);
      return;
    }
    int i;
    if (a(false, "", paramString))
    {
      if (!(this.hZY instanceof MMVideoView))
        break label305;
      this.hZY.stop();
      this.hZY.cpU();
      removeView((View)this.hZY);
      ab.i("MicroMsg.AppBrandVideoWrapper", "%d onDownloadFinish use common video view !", new Object[] { Integer.valueOf(hashCode()) });
      this.hZY = aFT();
      i = 1;
    }
    while (true)
    {
      setScaleType(this.iab);
      as(this.iac);
      setMute(this.fdh);
      if (i != 0)
      {
        setVideoFooterView(this.iaa);
        paramString = new RelativeLayout.LayoutParams(-1, -1);
        addView((View)this.hZY, paramString);
        this.hZY.c(this.bkJ, this.url, this.iad);
        this.hZY.start();
      }
      AppMethodBeat.o(131615);
      break;
      if ((this.hZY instanceof CommonVideoView))
      {
        this.hZY.stop();
        this.hZY.cpU();
        removeView((View)this.hZY);
        ab.i("MicroMsg.AppBrandVideoWrapper", "%d onDownloadFinish use mm video view !", new Object[] { Integer.valueOf(hashCode()) });
        this.hZY = aFU();
        i = 1;
      }
      else
      {
        label305: i = 0;
      }
    }
  }

  public final boolean as(float paramFloat)
  {
    boolean bool = false;
    AppMethodBeat.i(131614);
    if (paramFloat <= 0.0F)
      AppMethodBeat.o(131614);
    while (true)
    {
      return bool;
      this.iac = paramFloat;
      if (this.hZY != null)
      {
        bool = this.hZY.as(this.iac);
        AppMethodBeat.o(131614);
      }
      else
      {
        AppMethodBeat.o(131614);
      }
    }
  }

  public final void c(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(131616);
    ab.w("MicroMsg.AppBrandVideoWrapper", "%d onError[%s %d, %d]", new Object[] { Integer.valueOf(hashCode()), paramString3, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (this.hZZ != null)
      this.hZZ.H(paramString3, paramInt1, paramInt2);
    AppMethodBeat.o(131616);
  }

  public final void c(boolean paramBoolean, String paramString, int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(131589);
    this.iad = paramInt;
    this.bkJ = paramBoolean;
    PString localPString = new PString();
    localPString.value = paramString;
    if ((!bo.isNullOrNil(localPString.value)) && (localPString.value.indexOf("file://") == 0))
    {
      localPString.value = localPString.value.substring(7);
      paramBoolean = true;
      this.iae = paramBoolean;
      this.url = localPString.value;
      if (this.hZY != null)
        break label290;
      if (!a(this.bkJ, this.url, ""))
        break label254;
      ab.i("MicroMsg.AppBrandVideoWrapper", "%d use common video view !", new Object[] { Integer.valueOf(hashCode()) });
      this.hZY = aFT();
      paramInt = i;
    }
    while (true)
    {
      setScaleType(this.iab);
      as(this.iac);
      setMute(this.fdh);
      if (paramInt != 0)
      {
        setVideoFooterView(this.iaa);
        paramString = new RelativeLayout.LayoutParams(-1, -1);
        addView((View)this.hZY, paramString);
      }
      this.hZY.c(this.bkJ, this.url, this.iad);
      com.tencent.mm.sdk.g.d.post(new AppBrandVideoWrapper.2(this), "AppBrandVideo_checkVideoUrl");
      AppMethodBeat.o(131589);
      return;
      paramBoolean = false;
      break;
      label254: ab.i("MicroMsg.AppBrandVideoWrapper", "%d use mm video view !", new Object[] { Integer.valueOf(hashCode()) });
      this.hZY = aFU();
      paramInt = i;
      continue;
      label290: if (a(this.bkJ, this.url, ""))
      {
        if ((this.hZY instanceof MMVideoView))
        {
          this.hZY.stop();
          this.hZY.cpU();
          removeView((View)this.hZY);
          ab.i("MicroMsg.AppBrandVideoWrapper", "%d use common video view !", new Object[] { Integer.valueOf(hashCode()) });
          this.hZY = aFT();
          paramInt = i;
        }
        else
        {
          ab.i("MicroMsg.AppBrandVideoWrapper", "%d use last common video view !", new Object[] { Integer.valueOf(hashCode()) });
          this.hZY.stop();
          paramInt = 0;
        }
      }
      else if ((this.hZY instanceof CommonVideoView))
      {
        this.hZY.stop();
        this.hZY.cpU();
        removeView((View)this.hZY);
        ab.i("MicroMsg.AppBrandVideoWrapper", "%d use mm video view !", new Object[] { Integer.valueOf(hashCode()) });
        this.hZY = aFU();
        paramInt = i;
      }
      else
      {
        ab.i("MicroMsg.AppBrandVideoWrapper", "%d use last mm video view !", new Object[] { Integer.valueOf(hashCode()) });
        this.hZY.stop();
        paramInt = 0;
      }
    }
  }

  public final void cp(String paramString1, String paramString2)
  {
    AppMethodBeat.i(131617);
    ab.i("MicroMsg.AppBrandVideoWrapper", "%d onPrepared", new Object[] { Integer.valueOf(hashCode()) });
    if (this.hZZ != null)
      this.hZZ.aFq();
    if (isLive())
    {
      gp(203L);
      AppMethodBeat.o(131617);
    }
    while (true)
    {
      return;
      gp(202L);
      AppMethodBeat.o(131617);
    }
  }

  public final void cq(String paramString1, String paramString2)
  {
    AppMethodBeat.i(131618);
    ab.i("MicroMsg.AppBrandVideoWrapper", "%d onVideoEnded", new Object[] { Integer.valueOf(hashCode()) });
    if (this.hZZ != null)
      this.hZZ.aFr();
    AppMethodBeat.o(131618);
  }

  public final void cr(String paramString1, String paramString2)
  {
    AppMethodBeat.i(131620);
    ab.d("MicroMsg.AppBrandVideoWrapper", "%d onVideoPause", new Object[] { Integer.valueOf(hashCode()) });
    setKeepScreenOn(false);
    this.iaf.cy(false);
    if (this.hZZ != null)
      this.hZZ.aFs();
    AppMethodBeat.o(131620);
  }

  public final void cs(String paramString1, String paramString2)
  {
    AppMethodBeat.i(131621);
    ab.d("MicroMsg.AppBrandVideoWrapper", "%d onVideoPlay", new Object[] { Integer.valueOf(hashCode()) });
    setKeepScreenOn(true);
    this.iaf.a(this);
    if (this.hZZ != null)
      this.hZZ.aFt();
    AppMethodBeat.o(131621);
  }

  public final void ct(String paramString1, String paramString2)
  {
    AppMethodBeat.i(131622);
    if (this.hZZ != null)
      this.hZZ.aFu();
    AppMethodBeat.o(131622);
  }

  public final void cu(String paramString1, String paramString2)
  {
    AppMethodBeat.i(131623);
    if (this.hZZ != null)
      this.hZZ.aFv();
    AppMethodBeat.o(131623);
  }

  public final void d(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(131619);
    ab.i("MicroMsg.AppBrandVideoWrapper", "%d onGetVideoSize[%d %d]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (this.hZZ != null)
      this.hZZ.de(paramInt1, paramInt2);
    AppMethodBeat.o(131619);
  }

  public final boolean e(double paramDouble, boolean paramBoolean)
  {
    AppMethodBeat.i(131596);
    if (this.hZY != null)
    {
      paramBoolean = this.hZY.e(paramDouble, paramBoolean);
      AppMethodBeat.o(131596);
    }
    while (true)
    {
      return paramBoolean;
      paramBoolean = false;
      AppMethodBeat.o(131596);
    }
  }

  public int getCacheTimeSec()
  {
    AppMethodBeat.i(131602);
    int i;
    if (this.hZY != null)
    {
      i = this.hZY.getCacheTimeSec();
      AppMethodBeat.o(131602);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(131602);
    }
  }

  public int getCurrPosMs()
  {
    AppMethodBeat.i(131600);
    int i;
    if (this.hZY != null)
    {
      i = this.hZY.getCurrPosMs();
      AppMethodBeat.o(131600);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(131600);
    }
  }

  public int getCurrPosSec()
  {
    AppMethodBeat.i(131601);
    int i;
    if (this.hZY != null)
    {
      i = this.hZY.getCurrPosSec();
      AppMethodBeat.o(131601);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(131601);
    }
  }

  public int getPlayerType()
  {
    AppMethodBeat.i(131594);
    int i;
    if (this.hZY != null)
    {
      i = this.hZY.getPlayerType();
      AppMethodBeat.o(131594);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(131594);
    }
  }

  public int getVideoDurationSec()
  {
    AppMethodBeat.i(131599);
    int i;
    if (this.hZY != null)
    {
      i = this.hZY.getVideoDurationSec();
      AppMethodBeat.o(131599);
    }
    while (true)
    {
      return i;
      i = this.iad;
      AppMethodBeat.o(131599);
    }
  }

  public final void gp(long paramLong)
  {
    AppMethodBeat.i(131625);
    com.tencent.mm.plugin.report.service.h.pYm.a(600L, paramLong, 1L, false);
    AppMethodBeat.o(131625);
  }

  public final boolean isLive()
  {
    AppMethodBeat.i(131604);
    boolean bool;
    if (this.hZY != null)
    {
      bool = this.hZY.isLive();
      AppMethodBeat.o(131604);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(131604);
    }
  }

  public final boolean isPlaying()
  {
    AppMethodBeat.i(131603);
    boolean bool;
    if (this.hZY != null)
    {
      bool = this.hZY.isPlaying();
      AppMethodBeat.o(131603);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(131603);
    }
  }

  public final boolean pause()
  {
    boolean bool = false;
    AppMethodBeat.i(131608);
    if (this.hZY != null)
    {
      setKeepScreenOn(false);
      this.iaf.cy(false);
      bool = this.hZY.pause();
      AppMethodBeat.o(131608);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(131608);
    }
  }

  public final boolean s(double paramDouble)
  {
    AppMethodBeat.i(131595);
    boolean bool;
    if (this.hZY != null)
    {
      bool = this.hZY.s(paramDouble);
      AppMethodBeat.o(131595);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(131595);
    }
  }

  public void setControlBar(d.a parama)
  {
  }

  public void setCover(Bitmap paramBitmap)
  {
    AppMethodBeat.i(131605);
    if (this.hZY != null)
      this.hZY.setCover(paramBitmap);
    AppMethodBeat.o(131605);
  }

  public void setFullDirection(int paramInt)
  {
    AppMethodBeat.i(131598);
    if (this.hZY != null)
      this.hZY.setFullDirection(paramInt);
    AppMethodBeat.o(131598);
  }

  public void setIMMVideoViewCallback(d.b paramb)
  {
    this.hZZ = paramb;
  }

  public void setIsShowBasicControls(boolean paramBoolean)
  {
    AppMethodBeat.i(131597);
    if (this.hZY != null)
      this.hZY.setIsShowBasicControls(paramBoolean);
    AppMethodBeat.o(131597);
  }

  public void setKeepScreenOn(boolean paramBoolean)
  {
    AppMethodBeat.i(131624);
    ab.d("MicroMsg.AppBrandVideoWrapper", "set keep screen on[%b] stack[%s]", new Object[] { Boolean.valueOf(paramBoolean), bo.dpG() });
    super.setKeepScreenOn(paramBoolean);
    AppMethodBeat.o(131624);
  }

  public void setMute(boolean paramBoolean)
  {
    AppMethodBeat.i(131609);
    this.fdh = paramBoolean;
    if (this.hZY != null)
      this.hZY.setMute(this.fdh);
    AppMethodBeat.o(131609);
  }

  public void setScaleType(d.g paramg)
  {
    AppMethodBeat.i(131613);
    this.iab = paramg;
    com.tencent.mm.pluginsdk.ui.h localh;
    int i;
    if (this.hZY != null)
    {
      localh = this.hZY;
      paramg = this.iab;
      if (paramg != null)
      {
        paramg = paramg.name();
        i = -1;
      }
      switch (paramg.hashCode())
      {
      default:
        switch (i)
        {
        default:
          paramg = h.d.vhD;
        case 0:
        case 1:
        case 2:
        }
        break;
      case 1669509300:
      case 64314263:
      case 2157955:
      }
    }
    while (true)
    {
      localh.setScaleType(paramg);
      AppMethodBeat.o(131613);
      return;
      if (!paramg.equals("CONTAIN"))
        break;
      i = 0;
      break;
      if (!paramg.equals("COVER"))
        break;
      i = 1;
      break;
      if (!paramg.equals("FILL"))
        break;
      i = 2;
      break;
      paramg = h.d.vhF;
      continue;
      paramg = h.d.vhG;
      continue;
      paramg = h.d.vhE;
    }
  }

  public void setVideoFooterView(g paramg)
  {
    AppMethodBeat.i(131593);
    this.iaa = paramg;
    if (this.hZY != null)
      this.hZY.setVideoFooterView(this.iaa);
    AppMethodBeat.o(131593);
  }

  public void setVideoSource(int paramInt)
  {
    this.hZs = paramInt;
  }

  public final void start()
  {
    AppMethodBeat.i(131606);
    if (this.hZY != null)
    {
      this.hZY.start();
      setKeepScreenOn(true);
      this.iaf.a(this);
    }
    AppMethodBeat.o(131606);
  }

  public final void stop()
  {
    AppMethodBeat.i(131607);
    if (this.hZY != null)
    {
      this.hZY.stop();
      this.iaf.cy(false);
      setKeepScreenOn(false);
    }
    AppMethodBeat.o(131607);
  }

  public final void wB(String paramString)
  {
    AppMethodBeat.i(131626);
    com.tencent.mm.plugin.report.service.h.pYm.X(14349, paramString);
    AppMethodBeat.o(131626);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoWrapper
 * JD-Core Version:    0.6.2
 */