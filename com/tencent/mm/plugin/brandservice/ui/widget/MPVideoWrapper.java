package com.tencent.mm.plugin.brandservice.ui.widget;

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
import com.tencent.mm.plugin.appbrand.jsapi.video.d.b;
import com.tencent.mm.plugin.appbrand.jsapi.video.d.g;
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

public class MPVideoWrapper extends RelativeLayout
  implements com.tencent.mm.model.d.a, com.tencent.mm.plugin.appbrand.jsapi.video.d, h.a, h.b, h.c
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

  public MPVideoWrapper(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public MPVideoWrapper(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(14632);
    this.iab = d.g.iaj;
    this.fdh = false;
    this.iac = -1.0F;
    this.hZs = 0;
    this.mContext = paramContext;
    this.iaf = new com.tencent.mm.model.d();
    AppMethodBeat.o(14632);
  }

  private boolean a(boolean paramBoolean, String paramString1, String paramString2)
  {
    boolean bool = true;
    AppMethodBeat.i(14636);
    if ((paramBoolean) || (this.iae))
    {
      AppMethodBeat.o(14636);
      paramBoolean = bool;
    }
    while (true)
    {
      return paramBoolean;
      if (com.tencent.mm.compatible.util.d.fP(18))
      {
        AppMethodBeat.o(14636);
        paramBoolean = bool;
      }
      else
      {
        int i = ah.getContext().getSharedPreferences("system_config_prefs", com.tencent.mm.compatible.util.h.Mu()).getInt("appbrand_video_player", -1);
        ab.d("MicroMsg.AppBrandVideoWrapper", "checkUseSystemPlayer abtestFlag[%d]", new Object[] { Integer.valueOf(i) });
        if (i <= 0)
        {
          ab.i("MicroMsg.AppBrandVideoWrapper", "abtest is zero, use system player");
          AppMethodBeat.o(14636);
          paramBoolean = bool;
        }
        else if ((!bo.isNullOrNil(paramString1)) && (paramString1.contains(".m3u8")))
        {
          ab.i("MicroMsg.AppBrandVideoWrapper", "%d it is m3u8 file use system player.", new Object[] { Integer.valueOf(hashCode()) });
          gp(204L);
          AppMethodBeat.o(14636);
          paramBoolean = bool;
        }
        else if (r.ud(paramString2))
        {
          ab.i("MicroMsg.AppBrandVideoWrapper", "%d it is m3u8 file use system player.", new Object[] { Integer.valueOf(hashCode()) });
          gp(204L);
          AppMethodBeat.o(14636);
          paramBoolean = bool;
        }
        else
        {
          AppMethodBeat.o(14636);
          paramBoolean = false;
        }
      }
    }
  }

  private com.tencent.mm.pluginsdk.ui.h aFT()
  {
    AppMethodBeat.i(14634);
    MPCommonVideoView localMPCommonVideoView = new MPCommonVideoView(this.mContext);
    localMPCommonVideoView.setReporter(this);
    localMPCommonVideoView.KM(this.hZs);
    localMPCommonVideoView.setIMMVideoViewCallback(this);
    gp(200L);
    AppMethodBeat.o(14634);
    return localMPCommonVideoView;
  }

  private com.tencent.mm.pluginsdk.ui.h aFU()
  {
    AppMethodBeat.i(14635);
    MMVideoView localMMVideoView = new MMVideoView(this.mContext);
    localMMVideoView.setReporter(this);
    localMMVideoView.setIMMVideoViewCallback(this);
    localMMVideoView.setIMMDownloadFinish(this);
    String str = e.eSn + "appbrandvideo/";
    j.aih(str);
    localMMVideoView.setRootPath(str);
    gp(201L);
    AppMethodBeat.o(14635);
    return localMMVideoView;
  }

  public final void aEX()
  {
    AppMethodBeat.i(14656);
    if (this.hZY != null)
      this.hZY.aEX();
    this.iaf.cy(false);
    setKeepScreenOn(false);
    AppMethodBeat.o(14656);
  }

  public final void akV()
  {
    AppMethodBeat.i(14655);
    if (this.hZY != null)
      this.hZY.akV();
    this.iaf.cy(false);
    setKeepScreenOn(false);
    AppMethodBeat.o(14655);
  }

  public final void akW()
  {
    AppMethodBeat.i(14654);
    if (this.hZY != null)
      this.hZY.akW();
    AppMethodBeat.o(14654);
  }

  public final void am(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(14659);
    ab.i("MicroMsg.AppBrandVideoWrapper", "%d onDownloadFinish path [%s] isPlayNow [%b]", new Object[] { Integer.valueOf(hashCode()), paramString, Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      AppMethodBeat.o(14659);
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
      AppMethodBeat.o(14659);
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
    AppMethodBeat.i(14658);
    if (paramFloat <= 0.0F)
      AppMethodBeat.o(14658);
    while (true)
    {
      return bool;
      this.iac = paramFloat;
      if (this.hZY != null)
      {
        bool = this.hZY.as(this.iac);
        AppMethodBeat.o(14658);
      }
      else
      {
        AppMethodBeat.o(14658);
      }
    }
  }

  public final void c(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(14660);
    ab.w("MicroMsg.AppBrandVideoWrapper", "%d onError[%s %d, %d]", new Object[] { Integer.valueOf(hashCode()), paramString3, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (this.hZZ != null)
      this.hZZ.H(paramString3, paramInt1, paramInt2);
    AppMethodBeat.o(14660);
  }

  public final void c(boolean paramBoolean, String paramString, int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(14633);
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
      com.tencent.mm.sdk.g.d.post(new MPVideoWrapper.1(this), "AppBrandVideo_checkVideoUrl");
      AppMethodBeat.o(14633);
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
    AppMethodBeat.i(14661);
    ab.i("MicroMsg.AppBrandVideoWrapper", "%d onPrepared", new Object[] { Integer.valueOf(hashCode()) });
    if (this.hZZ != null)
      this.hZZ.aFq();
    if (isLive())
    {
      gp(203L);
      AppMethodBeat.o(14661);
    }
    while (true)
    {
      return;
      gp(202L);
      AppMethodBeat.o(14661);
    }
  }

  public final void cq(String paramString1, String paramString2)
  {
    AppMethodBeat.i(14662);
    ab.i("MicroMsg.AppBrandVideoWrapper", "%d onVideoEnded", new Object[] { Integer.valueOf(hashCode()) });
    if (this.hZZ != null)
      this.hZZ.aFr();
    AppMethodBeat.o(14662);
  }

  public final void cr(String paramString1, String paramString2)
  {
    AppMethodBeat.i(14664);
    ab.d("MicroMsg.AppBrandVideoWrapper", "%d onVideoPause", new Object[] { Integer.valueOf(hashCode()) });
    setKeepScreenOn(false);
    this.iaf.cy(false);
    if (this.hZZ != null)
      this.hZZ.aFs();
    AppMethodBeat.o(14664);
  }

  public final void cs(String paramString1, String paramString2)
  {
    AppMethodBeat.i(14665);
    ab.d("MicroMsg.AppBrandVideoWrapper", "%d onVideoPlay", new Object[] { Integer.valueOf(hashCode()) });
    setKeepScreenOn(true);
    this.iaf.a(this);
    if (this.hZZ != null)
      this.hZZ.aFt();
    AppMethodBeat.o(14665);
  }

  public final void ct(String paramString1, String paramString2)
  {
    AppMethodBeat.i(14666);
    if (this.hZZ != null)
      this.hZZ.aFu();
    AppMethodBeat.o(14666);
  }

  public final void cu(String paramString1, String paramString2)
  {
    AppMethodBeat.i(14667);
    if (this.hZZ != null)
      this.hZZ.aFv();
    AppMethodBeat.o(14667);
  }

  public final void d(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(14663);
    ab.i("MicroMsg.AppBrandVideoWrapper", "%d onGetVideoSize[%d %d]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (this.hZZ != null)
      this.hZZ.de(paramInt1, paramInt2);
    AppMethodBeat.o(14663);
  }

  public final boolean e(double paramDouble, boolean paramBoolean)
  {
    AppMethodBeat.i(14640);
    if (this.hZY != null)
    {
      paramBoolean = this.hZY.e(paramDouble, paramBoolean);
      AppMethodBeat.o(14640);
    }
    while (true)
    {
      return paramBoolean;
      paramBoolean = false;
      AppMethodBeat.o(14640);
    }
  }

  public int getCacheTimeSec()
  {
    AppMethodBeat.i(14646);
    int i;
    if (this.hZY != null)
    {
      i = this.hZY.getCacheTimeSec();
      AppMethodBeat.o(14646);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(14646);
    }
  }

  public int getCurrPosMs()
  {
    AppMethodBeat.i(14644);
    int i;
    if (this.hZY != null)
    {
      i = this.hZY.getCurrPosMs();
      AppMethodBeat.o(14644);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(14644);
    }
  }

  public int getCurrPosSec()
  {
    AppMethodBeat.i(14645);
    int i;
    if (this.hZY != null)
    {
      i = this.hZY.getCurrPosSec();
      AppMethodBeat.o(14645);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(14645);
    }
  }

  public int getPlayerType()
  {
    AppMethodBeat.i(14638);
    int i;
    if (this.hZY != null)
    {
      i = this.hZY.getPlayerType();
      AppMethodBeat.o(14638);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(14638);
    }
  }

  public int getVideoDurationSec()
  {
    AppMethodBeat.i(14643);
    int i;
    if (this.hZY != null)
    {
      i = this.hZY.getVideoDurationSec();
      AppMethodBeat.o(14643);
    }
    while (true)
    {
      return i;
      i = this.iad;
      AppMethodBeat.o(14643);
    }
  }

  public final void gp(long paramLong)
  {
    AppMethodBeat.i(14669);
    com.tencent.mm.plugin.report.service.h.pYm.a(600L, paramLong, 1L, false);
    AppMethodBeat.o(14669);
  }

  public final boolean isLive()
  {
    AppMethodBeat.i(14648);
    boolean bool;
    if (this.hZY != null)
    {
      bool = this.hZY.isLive();
      AppMethodBeat.o(14648);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(14648);
    }
  }

  public final boolean isPlaying()
  {
    AppMethodBeat.i(14647);
    boolean bool;
    if (this.hZY != null)
    {
      bool = this.hZY.isPlaying();
      AppMethodBeat.o(14647);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(14647);
    }
  }

  public final boolean pause()
  {
    boolean bool = false;
    AppMethodBeat.i(14652);
    if (this.hZY != null)
    {
      setKeepScreenOn(false);
      this.iaf.cy(false);
      bool = this.hZY.pause();
      AppMethodBeat.o(14652);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(14652);
    }
  }

  public final boolean s(double paramDouble)
  {
    AppMethodBeat.i(14639);
    boolean bool;
    if (this.hZY != null)
    {
      bool = this.hZY.s(paramDouble);
      AppMethodBeat.o(14639);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(14639);
    }
  }

  public void setControlBar(com.tencent.mm.plugin.appbrand.jsapi.video.d.a parama)
  {
  }

  public void setCover(Bitmap paramBitmap)
  {
    AppMethodBeat.i(14649);
    if (this.hZY != null)
      this.hZY.setCover(paramBitmap);
    AppMethodBeat.o(14649);
  }

  public void setFullDirection(int paramInt)
  {
    AppMethodBeat.i(14642);
    if (this.hZY != null)
      this.hZY.setFullDirection(paramInt);
    AppMethodBeat.o(14642);
  }

  public void setIMMVideoViewCallback(d.b paramb)
  {
    this.hZZ = paramb;
  }

  public void setIsShowBasicControls(boolean paramBoolean)
  {
    AppMethodBeat.i(14641);
    if (this.hZY != null)
      this.hZY.setIsShowBasicControls(paramBoolean);
    AppMethodBeat.o(14641);
  }

  public void setKeepScreenOn(boolean paramBoolean)
  {
    AppMethodBeat.i(14668);
    ab.d("MicroMsg.AppBrandVideoWrapper", "set keep screen on[%b] stack[%s]", new Object[] { Boolean.valueOf(paramBoolean), bo.dpG() });
    super.setKeepScreenOn(paramBoolean);
    AppMethodBeat.o(14668);
  }

  public void setMute(boolean paramBoolean)
  {
    AppMethodBeat.i(14653);
    this.fdh = paramBoolean;
    if (this.hZY != null)
      this.hZY.setMute(this.fdh);
    AppMethodBeat.o(14653);
  }

  public void setScaleType(d.g paramg)
  {
    AppMethodBeat.i(14657);
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
      AppMethodBeat.o(14657);
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
    AppMethodBeat.i(14637);
    this.iaa = paramg;
    if (this.hZY != null)
      this.hZY.setVideoFooterView(this.iaa);
    AppMethodBeat.o(14637);
  }

  public void setVideoSource(int paramInt)
  {
    this.hZs = paramInt;
  }

  public final void start()
  {
    AppMethodBeat.i(14650);
    if (this.hZY != null)
    {
      this.hZY.start();
      setKeepScreenOn(true);
      this.iaf.a(this);
    }
    AppMethodBeat.o(14650);
  }

  public final void stop()
  {
    AppMethodBeat.i(14651);
    if (this.hZY != null)
    {
      this.hZY.stop();
      this.iaf.cy(false);
      setKeepScreenOn(false);
    }
    AppMethodBeat.o(14651);
  }

  public final void wB(String paramString)
  {
    AppMethodBeat.i(14670);
    com.tencent.mm.plugin.report.service.h.pYm.X(14349, paramString);
    AppMethodBeat.o(14670);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.widget.MPVideoWrapper
 * JD-Core Version:    0.6.2
 */