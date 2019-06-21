package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.d;
import com.tencent.mm.model.d.a;
import com.tencent.mm.modelvideo.MMVideoView;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a;
import com.tencent.mm.pluginsdk.ui.CommonVideoView;
import com.tencent.mm.pluginsdk.ui.g;
import com.tencent.mm.pluginsdk.ui.h.a;
import com.tencent.mm.pluginsdk.ui.h.b;
import com.tencent.mm.pluginsdk.ui.h.c;
import com.tencent.mm.pluginsdk.ui.h.d;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.j;

public class AdLandingVideoWrapper extends RelativeLayout
  implements d.a, com.tencent.mm.pluginsdk.ui.h, h.a, h.b, h.c
{
  private boolean bkJ;
  private boolean fdh;
  private com.tencent.mm.pluginsdk.ui.h hZY;
  private g iaa;
  private float iac;
  private int iad;
  private boolean iae;
  private d iaf;
  private Context mContext;
  private h.b rcd;
  private h.d rce;
  private a rcf;
  public ap rcg;
  private String url;

  public AdLandingVideoWrapper(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public AdLandingVideoWrapper(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(37370);
    this.rce = h.d.vhF;
    this.fdh = false;
    this.iac = -1.0F;
    this.rcg = new ap(new AdLandingVideoWrapper.1(this), true);
    this.mContext = paramContext;
    this.iaf = new d();
    AppMethodBeat.o(37370);
  }

  private com.tencent.mm.pluginsdk.ui.h aFT()
  {
    AppMethodBeat.i(37372);
    CommonVideoView localCommonVideoView = new CommonVideoView(this.mContext);
    localCommonVideoView.setReporter(this);
    localCommonVideoView.setIMMVideoViewCallback(this);
    AppMethodBeat.o(37372);
    return localCommonVideoView;
  }

  private com.tencent.mm.pluginsdk.ui.h aFU()
  {
    AppMethodBeat.i(37373);
    MMVideoView localMMVideoView = new MMVideoView(this.mContext);
    localMMVideoView.setReporter(this);
    localMMVideoView.setIMMVideoViewCallback(this);
    localMMVideoView.setIMMDownloadFinish(this);
    String str = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.h.cqi();
    j.aih(str);
    localMMVideoView.setRootPath(str);
    localMMVideoView.setIOnlineVideoProxy(new a());
    AppMethodBeat.o(37373);
    return localMMVideoView;
  }

  private boolean cpS()
  {
    if ((this.bkJ) || (this.iae));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void aEX()
  {
    AppMethodBeat.i(37395);
    if (this.hZY != null)
      this.hZY.aEX();
    this.iaf.cy(false);
    setKeepScreenOn(false);
    AppMethodBeat.o(37395);
  }

  public final void akV()
  {
    AppMethodBeat.i(37394);
    if (this.hZY != null)
      this.hZY.akV();
    this.iaf.cy(false);
    setKeepScreenOn(false);
    AppMethodBeat.o(37394);
  }

  public final void akW()
  {
    AppMethodBeat.i(37393);
    if (this.hZY != null)
      this.hZY.akW();
    AppMethodBeat.o(37393);
  }

  public final void am(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(37398);
    ab.i("MicroMsg.AdLandingVideoWrapper", "%d onDownloadFinish path [%s] isPlayNow [%b]", new Object[] { Integer.valueOf(hashCode()), paramString, Boolean.valueOf(paramBoolean) });
    AppMethodBeat.o(37398);
  }

  public final boolean as(float paramFloat)
  {
    boolean bool = false;
    AppMethodBeat.i(37397);
    if (paramFloat <= 0.0F)
      AppMethodBeat.o(37397);
    while (true)
    {
      return bool;
      this.iac = paramFloat;
      if (this.hZY != null)
      {
        bool = this.hZY.as(this.iac);
        AppMethodBeat.o(37397);
      }
      else
      {
        AppMethodBeat.o(37397);
      }
    }
  }

  public final void c(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(37399);
    ab.w("MicroMsg.AdLandingVideoWrapper", "%d onError[%s %d, %d]", new Object[] { Integer.valueOf(hashCode()), paramString3, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (this.rcd != null)
      this.rcd.c(paramString1, paramString2, paramString3, paramInt1, paramInt2);
    com.tencent.mm.plugin.report.service.h.pYm.k(955L, 36L, 1L);
    AppMethodBeat.o(37399);
  }

  public final void c(boolean paramBoolean, String paramString, int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(37371);
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
        break label269;
      if (!cpS())
        break label233;
      ab.i("MicroMsg.AdLandingVideoWrapper", "%d use common video view !", new Object[] { Integer.valueOf(hashCode()) });
      this.hZY = aFT();
      paramInt = i;
    }
    while (true)
    {
      setScaleType(this.rce);
      as(this.iac);
      setMute(this.fdh);
      if (paramInt != 0)
      {
        setVideoFooterView(this.iaa);
        paramString = new RelativeLayout.LayoutParams(-1, -2);
        paramString.addRule(13);
        addView((View)this.hZY, paramString);
      }
      this.hZY.c(this.bkJ, this.url, this.iad);
      AppMethodBeat.o(37371);
      return;
      paramBoolean = false;
      break;
      label233: ab.i("MicroMsg.AdLandingVideoWrapper", "%d use mm video view !", new Object[] { Integer.valueOf(hashCode()) });
      this.hZY = aFU();
      paramInt = i;
      continue;
      label269: if (cpS())
      {
        if ((this.hZY instanceof MMVideoView))
        {
          this.hZY.stop();
          this.hZY.cpU();
          removeView((View)this.hZY);
          ab.i("MicroMsg.AdLandingVideoWrapper", "%d use common video view !", new Object[] { Integer.valueOf(hashCode()) });
          this.hZY = aFT();
          paramInt = i;
        }
        else
        {
          ab.i("MicroMsg.AdLandingVideoWrapper", "%d use last common video view !", new Object[] { Integer.valueOf(hashCode()) });
          this.hZY.stop();
          paramInt = 0;
        }
      }
      else if ((this.hZY instanceof CommonVideoView))
      {
        this.hZY.stop();
        this.hZY.cpU();
        removeView((View)this.hZY);
        ab.i("MicroMsg.AdLandingVideoWrapper", "%d use mm video view !", new Object[] { Integer.valueOf(hashCode()) });
        this.hZY = aFU();
        paramInt = i;
      }
      else
      {
        ab.i("MicroMsg.AdLandingVideoWrapper", "%d use last mm video view !", new Object[] { Integer.valueOf(hashCode()) });
        this.hZY.stop();
        paramInt = 0;
      }
    }
  }

  public final void cp(String paramString1, String paramString2)
  {
    AppMethodBeat.i(37400);
    ab.i("MicroMsg.AdLandingVideoWrapper", "%d onPrepared", new Object[] { Integer.valueOf(hashCode()) });
    if (this.rcd != null)
      this.rcd.cp(paramString1, paramString2);
    AppMethodBeat.o(37400);
  }

  public final void cpT()
  {
    AppMethodBeat.i(37374);
    this.rcg.stopTimer();
    this.rcg.ae(1000L, 1000L);
    AppMethodBeat.o(37374);
  }

  public final void cpU()
  {
    AppMethodBeat.i(37376);
    if (this.hZY != null)
      this.hZY.cpU();
    AppMethodBeat.o(37376);
  }

  public final void cq(String paramString1, String paramString2)
  {
    AppMethodBeat.i(37401);
    ab.i("MicroMsg.AdLandingVideoWrapper", "%d onVideoEnded", new Object[] { Integer.valueOf(hashCode()) });
    if (this.rcd != null)
      this.rcd.cq(paramString1, paramString2);
    com.tencent.mm.plugin.report.service.h.pYm.k(955L, 35L, 1L);
    AppMethodBeat.o(37401);
  }

  public final void cr(String paramString1, String paramString2)
  {
    AppMethodBeat.i(37403);
    ab.d("MicroMsg.AdLandingVideoWrapper", "%d onVideoPause", new Object[] { Integer.valueOf(hashCode()) });
    setKeepScreenOn(false);
    this.iaf.cy(false);
    if (this.rcd != null)
      this.rcd.cr(paramString1, paramString2);
    AppMethodBeat.o(37403);
  }

  public final void cs(String paramString1, String paramString2)
  {
    AppMethodBeat.i(37404);
    ab.d("MicroMsg.AdLandingVideoWrapper", "%d onVideoPlay", new Object[] { Integer.valueOf(hashCode()) });
    setKeepScreenOn(true);
    this.iaf.a(this);
    if (this.rcd != null)
      this.rcd.cs(paramString1, paramString2);
    AppMethodBeat.o(37404);
  }

  public final void ct(String paramString1, String paramString2)
  {
    AppMethodBeat.i(37405);
    if (this.rcd != null)
      this.rcd.ct(paramString1, paramString2);
    AppMethodBeat.o(37405);
  }

  public final void cu(String paramString1, String paramString2)
  {
    AppMethodBeat.i(37406);
    if (this.rcd != null)
      this.rcd.cu(paramString1, paramString2);
    AppMethodBeat.o(37406);
  }

  public final void d(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(37402);
    ab.i("MicroMsg.AdLandingVideoWrapper", "%d onGetVideoSize[%d %d]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (this.rcd != null)
      this.rcd.d(paramString1, paramString2, paramInt1, paramInt2);
    AppMethodBeat.o(37402);
  }

  public final boolean e(double paramDouble, boolean paramBoolean)
  {
    AppMethodBeat.i(37379);
    if (this.hZY != null)
    {
      paramBoolean = this.hZY.e(paramDouble, paramBoolean);
      AppMethodBeat.o(37379);
    }
    while (true)
    {
      return paramBoolean;
      paramBoolean = false;
      AppMethodBeat.o(37379);
    }
  }

  public int getCacheTimeSec()
  {
    AppMethodBeat.i(37385);
    int i;
    if (this.hZY != null)
    {
      i = this.hZY.getCacheTimeSec();
      AppMethodBeat.o(37385);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(37385);
    }
  }

  public int getCurrPosMs()
  {
    AppMethodBeat.i(37383);
    int i;
    if (this.hZY != null)
    {
      i = this.hZY.getCurrPosMs();
      AppMethodBeat.o(37383);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(37383);
    }
  }

  public int getCurrPosSec()
  {
    AppMethodBeat.i(37384);
    int i;
    if (this.hZY != null)
    {
      i = this.hZY.getCurrPosSec();
      AppMethodBeat.o(37384);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(37384);
    }
  }

  public int getPlayerType()
  {
    AppMethodBeat.i(37377);
    int i;
    if (this.hZY != null)
    {
      i = this.hZY.getPlayerType();
      AppMethodBeat.o(37377);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(37377);
    }
  }

  public int getVideoDurationSec()
  {
    AppMethodBeat.i(37382);
    int i;
    if (this.hZY != null)
    {
      i = this.hZY.getVideoDurationSec();
      AppMethodBeat.o(37382);
    }
    while (true)
    {
      return i;
      i = this.iad;
      AppMethodBeat.o(37382);
    }
  }

  public final void gp(long paramLong)
  {
    AppMethodBeat.i(37408);
    com.tencent.mm.plugin.report.service.h.pYm.a(600L, paramLong, 1L, false);
    AppMethodBeat.o(37408);
  }

  public final boolean isLive()
  {
    AppMethodBeat.i(37387);
    boolean bool;
    if (this.hZY != null)
    {
      bool = this.hZY.isLive();
      AppMethodBeat.o(37387);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(37387);
    }
  }

  public final boolean isPlaying()
  {
    AppMethodBeat.i(37386);
    boolean bool;
    if (this.hZY != null)
    {
      bool = this.hZY.isPlaying();
      AppMethodBeat.o(37386);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(37386);
    }
  }

  public final boolean pause()
  {
    boolean bool = false;
    AppMethodBeat.i(37391);
    if (this.hZY != null)
    {
      setKeepScreenOn(false);
      this.iaf.cy(false);
      bool = this.hZY.pause();
      AppMethodBeat.o(37391);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(37391);
    }
  }

  public final boolean s(double paramDouble)
  {
    AppMethodBeat.i(37378);
    boolean bool;
    if (this.hZY != null)
    {
      bool = this.hZY.s(paramDouble);
      AppMethodBeat.o(37378);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(37378);
    }
  }

  public void setCover(Bitmap paramBitmap)
  {
    AppMethodBeat.i(37388);
    if (this.hZY != null)
      this.hZY.setCover(paramBitmap);
    AppMethodBeat.o(37388);
  }

  public void setFullDirection(int paramInt)
  {
    AppMethodBeat.i(37381);
    if (this.hZY != null)
      this.hZY.setFullDirection(paramInt);
    AppMethodBeat.o(37381);
  }

  public void setIMMVideoViewCallback(h.b paramb)
  {
    this.rcd = paramb;
  }

  public void setIsShowBasicControls(boolean paramBoolean)
  {
    AppMethodBeat.i(37380);
    if (this.hZY != null)
      this.hZY.setIsShowBasicControls(paramBoolean);
    AppMethodBeat.o(37380);
  }

  public void setKeepScreenOn(boolean paramBoolean)
  {
    AppMethodBeat.i(37407);
    ab.d("MicroMsg.AdLandingVideoWrapper", "set keep screen on[%b] stack[%s]", new Object[] { Boolean.valueOf(paramBoolean), bo.dpG() });
    super.setKeepScreenOn(paramBoolean);
    AppMethodBeat.o(37407);
  }

  public void setMute(boolean paramBoolean)
  {
    AppMethodBeat.i(37392);
    this.fdh = paramBoolean;
    if (this.hZY != null)
      this.hZY.setMute(this.fdh);
    AppMethodBeat.o(37392);
  }

  public void setScaleType(h.d paramd)
  {
    AppMethodBeat.i(37396);
    this.rce = paramd;
    if (this.hZY != null)
      this.hZY.setScaleType(this.rce);
    AppMethodBeat.o(37396);
  }

  public void setVideoFooterView(g paramg)
  {
    AppMethodBeat.i(37375);
    this.iaa = paramg;
    if (this.hZY != null)
      this.hZY.setVideoFooterView(this.iaa);
    AppMethodBeat.o(37375);
  }

  public void setVideoPlayCallback(a parama)
  {
    this.rcf = parama;
  }

  public final void start()
  {
    AppMethodBeat.i(37389);
    if (this.hZY != null)
    {
      this.hZY.start();
      setKeepScreenOn(true);
      this.iaf.a(this);
    }
    AppMethodBeat.o(37389);
  }

  public final void stop()
  {
    AppMethodBeat.i(37390);
    if (this.hZY != null)
    {
      this.hZY.stop();
      this.iaf.cy(false);
      setKeepScreenOn(false);
    }
    AppMethodBeat.o(37390);
  }

  public final void wB(String paramString)
  {
    AppMethodBeat.i(37409);
    com.tencent.mm.plugin.report.service.h.pYm.X(14349, paramString);
    AppMethodBeat.o(37409);
  }

  public static abstract interface a
  {
    public abstract void Dq(int paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper
 * JD-Core Version:    0.6.2
 */