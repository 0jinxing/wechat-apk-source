package com.tencent.mm.plugin.webview.fts.ui;

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
import com.tencent.mm.pluginsdk.ui.CommonVideoView;
import com.tencent.mm.pluginsdk.ui.g;
import com.tencent.mm.pluginsdk.ui.h.a;
import com.tencent.mm.pluginsdk.ui.h.b;
import com.tencent.mm.pluginsdk.ui.h.c;
import com.tencent.mm.pluginsdk.ui.h.d;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public class FtsVideoWrapper extends RelativeLayout
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
  private String url;

  public FtsVideoWrapper(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public FtsVideoWrapper(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(5777);
    this.rce = h.d.vhF;
    this.fdh = false;
    this.iac = -1.0F;
    this.mContext = paramContext;
    this.iaf = new d();
    AppMethodBeat.o(5777);
  }

  private com.tencent.mm.pluginsdk.ui.h aFT()
  {
    AppMethodBeat.i(5779);
    CommonVideoView localCommonVideoView = new CommonVideoView(this.mContext);
    localCommonVideoView.setReporter(this);
    localCommonVideoView.setIMMVideoViewCallback(this);
    AppMethodBeat.o(5779);
    return localCommonVideoView;
  }

  public final void aEX()
  {
    AppMethodBeat.i(5800);
    if (this.hZY != null)
      this.hZY.aEX();
    this.iaf.cy(false);
    setKeepScreenOn(false);
    AppMethodBeat.o(5800);
  }

  public final void akV()
  {
    AppMethodBeat.i(5799);
    if (this.hZY != null)
      this.hZY.akV();
    this.iaf.cy(false);
    setKeepScreenOn(false);
    AppMethodBeat.o(5799);
  }

  public final void akW()
  {
    AppMethodBeat.i(5798);
    if (this.hZY != null)
      this.hZY.akW();
    AppMethodBeat.o(5798);
  }

  public final void am(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(5803);
    ab.i("MicroMsg.AppBrandVideoWrapper", "%d onDownloadFinish path [%s] isPlayNow [%b]", new Object[] { Integer.valueOf(hashCode()), paramString, Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      AppMethodBeat.o(5803);
      return;
    }
    if ((this.hZY instanceof MMVideoView))
    {
      this.hZY.stop();
      this.hZY.cpU();
      removeView((View)this.hZY);
      ab.i("MicroMsg.AppBrandVideoWrapper", "%d onDownloadFinish use common video view !", new Object[] { Integer.valueOf(hashCode()) });
      this.hZY = aFT();
    }
    for (int i = 1; ; i = 0)
    {
      setScaleType(this.rce);
      as(this.iac);
      setMute(this.fdh);
      if (i != 0)
      {
        setVideoFooterView(this.iaa);
        paramString = new RelativeLayout.LayoutParams(-1, -2);
        paramString.addRule(13);
        addView((View)this.hZY, paramString);
        this.hZY.c(this.bkJ, this.url, this.iad);
        this.hZY.start();
      }
      AppMethodBeat.o(5803);
      break;
    }
  }

  public final boolean as(float paramFloat)
  {
    boolean bool = false;
    AppMethodBeat.i(5802);
    if (paramFloat <= 0.0F)
      AppMethodBeat.o(5802);
    while (true)
    {
      return bool;
      this.iac = paramFloat;
      if (this.hZY != null)
      {
        bool = this.hZY.as(this.iac);
        AppMethodBeat.o(5802);
      }
      else
      {
        AppMethodBeat.o(5802);
      }
    }
  }

  public final void c(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(5804);
    ab.w("MicroMsg.AppBrandVideoWrapper", "%d onError[%s %d, %d]", new Object[] { Integer.valueOf(hashCode()), paramString3, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (this.rcd != null)
      this.rcd.c(paramString1, paramString2, paramString3, paramInt1, paramInt2);
    AppMethodBeat.o(5804);
  }

  public final void c(boolean paramBoolean, String paramString, int paramInt)
  {
    AppMethodBeat.i(5778);
    this.iad = paramInt;
    this.bkJ = paramBoolean;
    PString localPString = new PString();
    localPString.value = paramString;
    bo.isNullOrNil(localPString.value);
    this.iae = false;
    this.url = localPString.value;
    if (this.hZY == null)
    {
      ab.i("MicroMsg.AppBrandVideoWrapper", "%d use common video view !", new Object[] { Integer.valueOf(hashCode()) });
      this.hZY = aFT();
      paramInt = 1;
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
      AppMethodBeat.o(5778);
      return;
      if ((this.hZY instanceof MMVideoView))
      {
        this.hZY.stop();
        this.hZY.cpU();
        removeView((View)this.hZY);
        ab.i("MicroMsg.AppBrandVideoWrapper", "%d use common video view !", new Object[] { Integer.valueOf(hashCode()) });
        this.hZY = aFT();
        paramInt = 1;
      }
      else
      {
        ab.i("MicroMsg.AppBrandVideoWrapper", "%d use last common video view !", new Object[] { Integer.valueOf(hashCode()) });
        this.hZY.stop();
        paramInt = 0;
      }
    }
  }

  public final void cp(String paramString1, String paramString2)
  {
    AppMethodBeat.i(5805);
    ab.i("MicroMsg.AppBrandVideoWrapper", "%d onPrepared", new Object[] { Integer.valueOf(hashCode()) });
    if (this.rcd != null)
      this.rcd.cp(paramString1, paramString2);
    AppMethodBeat.o(5805);
  }

  public final void cpU()
  {
    AppMethodBeat.i(5781);
    if (this.hZY != null)
      this.hZY.cpU();
    AppMethodBeat.o(5781);
  }

  public final void cq(String paramString1, String paramString2)
  {
    AppMethodBeat.i(5806);
    ab.i("MicroMsg.AppBrandVideoWrapper", "%d onVideoEnded", new Object[] { Integer.valueOf(hashCode()) });
    if (this.rcd != null)
      this.rcd.cq(paramString1, paramString2);
    AppMethodBeat.o(5806);
  }

  public final void cr(String paramString1, String paramString2)
  {
    AppMethodBeat.i(5808);
    ab.d("MicroMsg.AppBrandVideoWrapper", "%d onVideoPause", new Object[] { Integer.valueOf(hashCode()) });
    setKeepScreenOn(false);
    this.iaf.cy(false);
    if (this.rcd != null)
      this.rcd.cr(paramString1, paramString2);
    AppMethodBeat.o(5808);
  }

  public final void cs(String paramString1, String paramString2)
  {
    AppMethodBeat.i(5809);
    ab.d("MicroMsg.AppBrandVideoWrapper", "%d onVideoPlay", new Object[] { Integer.valueOf(hashCode()) });
    setKeepScreenOn(true);
    this.iaf.a(this);
    if (this.rcd != null)
      this.rcd.cs(paramString1, paramString2);
    AppMethodBeat.o(5809);
  }

  public final void ct(String paramString1, String paramString2)
  {
    AppMethodBeat.i(5810);
    if (this.rcd != null)
      this.rcd.ct(paramString1, paramString2);
    AppMethodBeat.o(5810);
  }

  public final void cu(String paramString1, String paramString2)
  {
    AppMethodBeat.i(5811);
    if (this.rcd != null)
      this.rcd.cu(paramString1, paramString2);
    AppMethodBeat.o(5811);
  }

  public final void d(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(5807);
    ab.i("MicroMsg.AppBrandVideoWrapper", "%d onGetVideoSize[%d %d]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (this.rcd != null)
      this.rcd.d(paramString1, paramString2, paramInt1, paramInt2);
    AppMethodBeat.o(5807);
  }

  public final boolean e(double paramDouble, boolean paramBoolean)
  {
    AppMethodBeat.i(5784);
    if (this.hZY != null)
    {
      paramBoolean = this.hZY.e(paramDouble, paramBoolean);
      AppMethodBeat.o(5784);
    }
    while (true)
    {
      return paramBoolean;
      paramBoolean = false;
      AppMethodBeat.o(5784);
    }
  }

  public int getCacheTimeSec()
  {
    AppMethodBeat.i(5790);
    int i;
    if (this.hZY != null)
    {
      i = this.hZY.getCacheTimeSec();
      AppMethodBeat.o(5790);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(5790);
    }
  }

  public int getCurrPosMs()
  {
    AppMethodBeat.i(5788);
    int i;
    if (this.hZY != null)
    {
      i = this.hZY.getCurrPosMs();
      AppMethodBeat.o(5788);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(5788);
    }
  }

  public int getCurrPosSec()
  {
    AppMethodBeat.i(5789);
    int i;
    if (this.hZY != null)
    {
      i = this.hZY.getCurrPosSec();
      AppMethodBeat.o(5789);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(5789);
    }
  }

  public int getPlayerType()
  {
    AppMethodBeat.i(5782);
    int i;
    if (this.hZY != null)
    {
      i = this.hZY.getPlayerType();
      AppMethodBeat.o(5782);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(5782);
    }
  }

  public int getVideoDurationSec()
  {
    AppMethodBeat.i(5787);
    int i;
    if (this.hZY != null)
    {
      i = this.hZY.getVideoDurationSec();
      AppMethodBeat.o(5787);
    }
    while (true)
    {
      return i;
      i = this.iad;
      AppMethodBeat.o(5787);
    }
  }

  public final void gp(long paramLong)
  {
    AppMethodBeat.i(5813);
    com.tencent.mm.plugin.report.service.h.pYm.a(600L, paramLong, 1L, false);
    AppMethodBeat.o(5813);
  }

  public final boolean isLive()
  {
    AppMethodBeat.i(5792);
    boolean bool;
    if (this.hZY != null)
    {
      bool = this.hZY.isLive();
      AppMethodBeat.o(5792);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(5792);
    }
  }

  public final boolean isPlaying()
  {
    AppMethodBeat.i(5791);
    boolean bool;
    if (this.hZY != null)
    {
      bool = this.hZY.isPlaying();
      AppMethodBeat.o(5791);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(5791);
    }
  }

  public final boolean pause()
  {
    boolean bool = false;
    AppMethodBeat.i(5796);
    if (this.hZY != null)
    {
      setKeepScreenOn(false);
      this.iaf.cy(false);
      bool = this.hZY.pause();
      AppMethodBeat.o(5796);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(5796);
    }
  }

  public final boolean s(double paramDouble)
  {
    AppMethodBeat.i(5783);
    boolean bool;
    if (this.hZY != null)
    {
      bool = this.hZY.s(paramDouble);
      AppMethodBeat.o(5783);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(5783);
    }
  }

  public void setCover(Bitmap paramBitmap)
  {
    AppMethodBeat.i(5793);
    if (this.hZY != null)
      this.hZY.setCover(paramBitmap);
    AppMethodBeat.o(5793);
  }

  public void setFullDirection(int paramInt)
  {
    AppMethodBeat.i(5786);
    if (this.hZY != null)
      this.hZY.setFullDirection(paramInt);
    AppMethodBeat.o(5786);
  }

  public void setIMMVideoViewCallback(h.b paramb)
  {
    this.rcd = paramb;
  }

  public void setIsShowBasicControls(boolean paramBoolean)
  {
    AppMethodBeat.i(5785);
    if (this.hZY != null)
      this.hZY.setIsShowBasicControls(paramBoolean);
    AppMethodBeat.o(5785);
  }

  public void setKeepScreenOn(boolean paramBoolean)
  {
    AppMethodBeat.i(5812);
    ab.d("MicroMsg.AppBrandVideoWrapper", "set keep screen on[%b] stack[%s]", new Object[] { Boolean.valueOf(paramBoolean), bo.dpG() });
    super.setKeepScreenOn(paramBoolean);
    AppMethodBeat.o(5812);
  }

  public void setMute(boolean paramBoolean)
  {
    AppMethodBeat.i(5797);
    this.fdh = paramBoolean;
    if (this.hZY != null)
      this.hZY.setMute(this.fdh);
    AppMethodBeat.o(5797);
  }

  public void setScaleType(h.d paramd)
  {
    AppMethodBeat.i(5801);
    this.rce = paramd;
    if (this.hZY != null)
      this.hZY.setScaleType(this.rce);
    AppMethodBeat.o(5801);
  }

  public void setVideoFooterView(g paramg)
  {
    AppMethodBeat.i(5780);
    this.iaa = paramg;
    if (this.hZY != null)
      this.hZY.setVideoFooterView(this.iaa);
    AppMethodBeat.o(5780);
  }

  public final void start()
  {
    AppMethodBeat.i(5794);
    if (this.hZY != null)
    {
      this.hZY.start();
      setKeepScreenOn(true);
      this.iaf.a(this);
    }
    AppMethodBeat.o(5794);
  }

  public final void stop()
  {
    AppMethodBeat.i(5795);
    if (this.hZY != null)
    {
      this.hZY.stop();
      this.iaf.cy(false);
      setKeepScreenOn(false);
    }
    AppMethodBeat.o(5795);
  }

  public final void wB(String paramString)
  {
    AppMethodBeat.i(5814);
    com.tencent.mm.plugin.report.service.h.pYm.X(14349, paramString);
    AppMethodBeat.o(5814);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.fts.ui.FtsVideoWrapper
 * JD-Core Version:    0.6.2
 */