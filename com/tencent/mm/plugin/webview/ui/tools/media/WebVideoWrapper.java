package com.tencent.mm.plugin.webview.ui.tools.media;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.d;
import com.tencent.mm.model.d.a;
import com.tencent.mm.pluginsdk.ui.CommonVideoView;
import com.tencent.mm.pluginsdk.ui.g;
import com.tencent.mm.pluginsdk.ui.h.b;
import com.tencent.mm.pluginsdk.ui.h.c;
import com.tencent.mm.pluginsdk.ui.h.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public class WebVideoWrapper extends RelativeLayout
  implements d.a, com.tencent.mm.pluginsdk.ui.h, h.b, h.c
{
  private boolean bkJ;
  private com.tencent.mm.pluginsdk.ui.h hZY;
  private int iad;
  private d iaf;
  private Context mContext;
  private h.b rcd;
  private String url;

  public WebVideoWrapper(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public WebVideoWrapper(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(9860);
    this.mContext = paramContext;
    this.iaf = new d();
    if (this.hZY == null)
    {
      paramContext = new CommonVideoView(this.mContext);
      paramContext.setReporter(this);
      paramContext.setIMMVideoViewCallback(this);
      gp(200L);
      this.hZY = paramContext;
    }
    paramContext = new RelativeLayout.LayoutParams(-1, -2);
    paramContext.addRule(13);
    addView((View)this.hZY, paramContext);
    AppMethodBeat.o(9860);
  }

  public final void aEX()
  {
    AppMethodBeat.i(9882);
    if (this.hZY != null)
      this.hZY.aEX();
    this.iaf.cy(false);
    setKeepScreenOn(false);
    AppMethodBeat.o(9882);
  }

  public final void akV()
  {
    AppMethodBeat.i(9881);
    if (this.hZY != null)
      this.hZY.akV();
    this.iaf.cy(false);
    setKeepScreenOn(false);
    AppMethodBeat.o(9881);
  }

  public final void akW()
  {
    AppMethodBeat.i(9880);
    if (this.hZY != null)
      this.hZY.akW();
    AppMethodBeat.o(9880);
  }

  public final boolean as(float paramFloat)
  {
    boolean bool = false;
    AppMethodBeat.i(9884);
    if (paramFloat <= 0.0F)
      AppMethodBeat.o(9884);
    while (true)
    {
      return bool;
      if (this.hZY != null)
      {
        bool = this.hZY.as(paramFloat);
        AppMethodBeat.o(9884);
      }
      else
      {
        AppMethodBeat.o(9884);
      }
    }
  }

  public final void c(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(9885);
    ab.w("MicroMsg.WebVideoWrapper", "%d onError[%s %d, %d]", new Object[] { Integer.valueOf(hashCode()), paramString3, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (this.rcd != null)
      this.rcd.c(paramString1, paramString2, paramString3, paramInt1, paramInt2);
    AppMethodBeat.o(9885);
  }

  public final void c(boolean paramBoolean, String paramString, int paramInt)
  {
    AppMethodBeat.i(9861);
    this.iad = paramInt;
    this.bkJ = paramBoolean;
    this.url = paramString;
    if (this.hZY != null)
      this.hZY.c(this.bkJ, this.url, this.iad);
    AppMethodBeat.o(9861);
  }

  public final void cp(String paramString1, String paramString2)
  {
    AppMethodBeat.i(9886);
    ab.i("MicroMsg.WebVideoWrapper", "%d onPrepared", new Object[] { Integer.valueOf(hashCode()) });
    if (this.rcd != null)
      this.rcd.cp(paramString1, paramString2);
    AppMethodBeat.o(9886);
  }

  public final void cpU()
  {
    AppMethodBeat.i(9863);
    if (this.hZY != null)
      this.hZY.cpU();
    AppMethodBeat.o(9863);
  }

  public final void cq(String paramString1, String paramString2)
  {
    AppMethodBeat.i(9887);
    ab.i("MicroMsg.WebVideoWrapper", "%d onVideoEnded", new Object[] { Integer.valueOf(hashCode()) });
    if (this.rcd != null)
      this.rcd.cq(paramString1, paramString2);
    AppMethodBeat.o(9887);
  }

  public final void cr(String paramString1, String paramString2)
  {
    AppMethodBeat.i(9889);
    ab.d("MicroMsg.WebVideoWrapper", "%d onVideoPause", new Object[] { Integer.valueOf(hashCode()) });
    setKeepScreenOn(false);
    this.iaf.cy(false);
    if (this.rcd != null)
      this.rcd.cr(paramString1, paramString2);
    AppMethodBeat.o(9889);
  }

  public final void cs(String paramString1, String paramString2)
  {
    AppMethodBeat.i(9890);
    ab.d("MicroMsg.WebVideoWrapper", "%d onVideoPlay", new Object[] { Integer.valueOf(hashCode()) });
    setKeepScreenOn(true);
    this.iaf.a(this);
    if (this.rcd != null)
      this.rcd.cs(paramString1, paramString2);
    AppMethodBeat.o(9890);
  }

  public final void ct(String paramString1, String paramString2)
  {
    AppMethodBeat.i(9891);
    if (this.rcd != null)
      this.rcd.ct(paramString1, paramString2);
    AppMethodBeat.o(9891);
  }

  public final void cu(String paramString1, String paramString2)
  {
    AppMethodBeat.i(9892);
    if (this.rcd != null)
      this.rcd.cu(paramString1, paramString2);
    AppMethodBeat.o(9892);
  }

  public final void d(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(9888);
    ab.i("MicroMsg.WebVideoWrapper", "%d onGetVideoSize[%d %d]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (this.rcd != null)
      this.rcd.d(paramString1, paramString2, paramInt1, paramInt2);
    AppMethodBeat.o(9888);
  }

  public final boolean e(double paramDouble, boolean paramBoolean)
  {
    AppMethodBeat.i(9866);
    if (this.hZY != null)
    {
      paramBoolean = this.hZY.e(paramDouble, paramBoolean);
      AppMethodBeat.o(9866);
    }
    while (true)
    {
      return paramBoolean;
      paramBoolean = false;
      AppMethodBeat.o(9866);
    }
  }

  public int getCacheTimeSec()
  {
    AppMethodBeat.i(9872);
    int i;
    if (this.hZY != null)
    {
      i = this.hZY.getCacheTimeSec();
      AppMethodBeat.o(9872);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(9872);
    }
  }

  public int getCurrPosMs()
  {
    AppMethodBeat.i(9870);
    int i;
    if (this.hZY != null)
    {
      i = this.hZY.getCurrPosMs();
      AppMethodBeat.o(9870);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(9870);
    }
  }

  public int getCurrPosSec()
  {
    AppMethodBeat.i(9871);
    int i;
    if (this.hZY != null)
    {
      i = this.hZY.getCurrPosSec();
      AppMethodBeat.o(9871);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(9871);
    }
  }

  public int getPlayerType()
  {
    AppMethodBeat.i(9864);
    int i;
    if (this.hZY != null)
    {
      i = this.hZY.getPlayerType();
      AppMethodBeat.o(9864);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(9864);
    }
  }

  public int getVideoDurationSec()
  {
    AppMethodBeat.i(9869);
    int i;
    if (this.hZY != null)
    {
      i = this.hZY.getVideoDurationSec();
      AppMethodBeat.o(9869);
    }
    while (true)
    {
      return i;
      i = this.iad;
      AppMethodBeat.o(9869);
    }
  }

  public final void gp(long paramLong)
  {
    AppMethodBeat.i(9894);
    com.tencent.mm.plugin.report.service.h.pYm.a(600L, paramLong, 1L, false);
    AppMethodBeat.o(9894);
  }

  public final boolean isLive()
  {
    AppMethodBeat.i(9874);
    boolean bool;
    if (this.hZY != null)
    {
      bool = this.hZY.isLive();
      AppMethodBeat.o(9874);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(9874);
    }
  }

  public final boolean isPlaying()
  {
    AppMethodBeat.i(9873);
    boolean bool;
    if (this.hZY != null)
    {
      bool = this.hZY.isPlaying();
      AppMethodBeat.o(9873);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(9873);
    }
  }

  public final boolean pause()
  {
    boolean bool = false;
    AppMethodBeat.i(9878);
    if (this.hZY != null)
    {
      setKeepScreenOn(false);
      this.iaf.cy(false);
      bool = this.hZY.pause();
      AppMethodBeat.o(9878);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(9878);
    }
  }

  public final boolean s(double paramDouble)
  {
    AppMethodBeat.i(9865);
    boolean bool;
    if (this.hZY != null)
    {
      bool = this.hZY.s(paramDouble);
      AppMethodBeat.o(9865);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(9865);
    }
  }

  public void setCover(Bitmap paramBitmap)
  {
    AppMethodBeat.i(9875);
    if (this.hZY != null)
      this.hZY.setCover(paramBitmap);
    AppMethodBeat.o(9875);
  }

  public void setFullDirection(int paramInt)
  {
    AppMethodBeat.i(9868);
    if (this.hZY != null)
      this.hZY.setFullDirection(paramInt);
    AppMethodBeat.o(9868);
  }

  public void setIMMVideoViewCallback(h.b paramb)
  {
    this.rcd = paramb;
  }

  public void setIsShowBasicControls(boolean paramBoolean)
  {
    AppMethodBeat.i(9867);
    if (this.hZY != null)
      this.hZY.setIsShowBasicControls(paramBoolean);
    AppMethodBeat.o(9867);
  }

  public void setKeepScreenOn(boolean paramBoolean)
  {
    AppMethodBeat.i(9893);
    ab.d("MicroMsg.WebVideoWrapper", "set keep screen on[%b] stack[%s]", new Object[] { Boolean.valueOf(paramBoolean), bo.dpG() });
    super.setKeepScreenOn(paramBoolean);
    AppMethodBeat.o(9893);
  }

  public void setMute(boolean paramBoolean)
  {
    AppMethodBeat.i(9879);
    if (this.hZY != null)
      this.hZY.setMute(paramBoolean);
    AppMethodBeat.o(9879);
  }

  public void setScaleType(h.d paramd)
  {
    AppMethodBeat.i(9883);
    if (this.hZY != null)
      this.hZY.setScaleType(paramd);
    AppMethodBeat.o(9883);
  }

  public void setVideoFooterView(g paramg)
  {
    AppMethodBeat.i(9862);
    if (this.hZY != null)
      this.hZY.setVideoFooterView(paramg);
    AppMethodBeat.o(9862);
  }

  public final void start()
  {
    AppMethodBeat.i(9876);
    if (this.hZY != null)
    {
      this.hZY.start();
      setKeepScreenOn(true);
      this.iaf.a(this);
    }
    AppMethodBeat.o(9876);
  }

  public final void stop()
  {
    AppMethodBeat.i(9877);
    if (this.hZY != null)
    {
      this.hZY.stop();
      this.iaf.cy(false);
      setKeepScreenOn(false);
    }
    AppMethodBeat.o(9877);
  }

  public final void wB(String paramString)
  {
    AppMethodBeat.i(9895);
    com.tencent.mm.plugin.report.service.h.pYm.X(14349, paramString);
    AppMethodBeat.o(9895);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.media.WebVideoWrapper
 * JD-Core Version:    0.6.2
 */