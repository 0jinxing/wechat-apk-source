package com.tencent.mm.plugin.voip.widget;

import android.content.Context;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.plugin.voip.model.r;
import com.tencent.mm.plugin.voip.video.CaptureView;
import com.tencent.mm.plugin.voip.video.OpenGlRender;
import com.tencent.mm.plugin.voip.video.OpenGlView;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.base.MMTextureView;

public final class a extends BaseSmallView
{
  private boolean UO;
  private ak iGP;
  private c sWj;
  private int sXS;
  private OpenGlRender tcd;
  private OpenGlView tce;
  private OpenGlRender tcf;
  private OpenGlView tcg;
  private int[] tch;
  private int tci;
  private float tcj;
  private int tck;
  private Runnable tcl;
  private Runnable tcm;

  public a(Context paramContext, float paramFloat)
  {
    super(paramContext, null);
    AppMethodBeat.i(5145);
    this.tch = null;
    this.tci = 0;
    this.iGP = new ak(Looper.getMainLooper());
    this.tck = 0;
    this.tcl = new a.1(this);
    this.tcm = new a.2(this);
    this.sWj = new a.3(this);
    LayoutInflater.from(paramContext).inflate(2130971037, this);
    this.tcj = paramFloat;
    this.tce = ((OpenGlView)findViewById(2131828573));
    this.tcd = new OpenGlRender(this.tce, OpenGlRender.RenderRemote);
    this.tce.setRenderer(this.tcd);
    this.tce.setRenderMode(0);
    this.tcg = ((OpenGlView)findViewById(2131828575));
    this.tcf = new OpenGlRender(this.tcg, OpenGlRender.RenderLocal);
    if (d.iW(21))
    {
      paramContext = this.tcg;
      paramContext.tbe = true;
      if (paramContext.tbe)
      {
        paramContext.setEGLConfigChooser(new com.tencent.mm.plugin.voip.video.b(8, 8, 8, 8));
        this.tcg.setZOrderOnTop(true);
        this.tcg.getHolder().setFormat(1);
        paramContext = this.tcf;
        ab.i(OpenGlRender.TAG, "setRenderWithNativeGL: %s", new Object[] { Boolean.TRUE });
        paramContext.taV = true;
      }
    }
    while (true)
    {
      this.tcg.setRenderer(this.tcf);
      this.tcg.setRenderMode(0);
      this.UO = false;
      com.tencent.mm.sdk.b.a.xxA.c(this.sWj);
      this.sXQ = ((MMTextureView)findViewById(2131828574));
      if (this.sXQ != null)
        ab.i("MicroMsg.Voip.TalkingSmallView", "hwViewSmall creat ok!");
      this.lda.postDelayed(new a.4(this), 3000L);
      this.lda.postDelayed(this.tcm, 2000L);
      this.lda.postDelayed(this.tcl, 5000L);
      AppMethodBeat.o(5145);
      return;
      paramContext.setEGLConfigChooser(new com.tencent.mm.plugin.voip.video.b(5, 6, 5, 0));
      break;
      this.tcg.setVisibility(4);
      this.tcg.setZOrderMediaOverlay(true);
    }
  }

  private void cLT()
  {
    AppMethodBeat.i(5147);
    if (!this.UO)
    {
      ab.i("MicroMsg.Voip.TalkingSmallView", "startRenderForVideoDisplay, voipBeauty: %s", new Object[] { Integer.valueOf(this.tck) });
      this.UO = true;
      this.tcd.taA = true;
      this.tcf.taA = true;
      this.tcf.setVoipBeauty(this.tck);
      this.tcd.setVoipBeauty(this.tck);
    }
    AppMethodBeat.o(5147);
  }

  public final void a(byte[] paramArrayOfByte, long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    AppMethodBeat.i(5152);
    if (this.tcg.getVisibility() != 0)
      AppMethodBeat.o(5152);
    while (true)
    {
      return;
      cLT();
      if (OpenGlRender.taQ == 1)
      {
        if (this.tci < paramInt1 * paramInt2)
          this.tch = null;
        if (this.tch == null)
        {
          this.tci = (paramInt1 * paramInt2);
          this.tch = new int[this.tci];
        }
        if ((com.tencent.mm.plugin.voip.b.cIj().a(paramArrayOfByte, (int)paramLong, paramInt3 & 0x1F, paramInt1, paramInt2, this.tch, false) < 0) || (this.tch == null))
        {
          AppMethodBeat.o(5152);
        }
        else
        {
          this.tcf.a(this.tch, paramInt1, paramInt2, OpenGlRender.FLAG_RGBAClip + paramInt4 + paramInt5, true);
          AppMethodBeat.o(5152);
        }
      }
      else
      {
        if (OpenGlRender.taQ == 2)
          this.tcf.c(paramArrayOfByte, paramInt1, paramInt2, OpenGlRender.FLAG_NV21 + paramInt4 + paramInt5, true);
        AppMethodBeat.o(5152);
      }
    }
  }

  public final void c(int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(5148);
    cLT();
    if (OpenGlRender.taQ == 1)
    {
      this.tcd.a(paramArrayOfInt, paramInt1, paramInt2, OpenGlRender.FLAG_RGBA + OpenGlRender.FLAG_Angle90, false);
      AppMethodBeat.o(5148);
    }
    while (true)
    {
      return;
      this.tcd.a(paramArrayOfInt, paramInt1, paramInt2, OpenGlRender.FLAG_YV12Edge + OpenGlRender.FLAG_Angle90, false);
      AppMethodBeat.o(5148);
    }
  }

  public final void cJD()
  {
    AppMethodBeat.i(5149);
    if ((this.UO) && (this.tcf != null) && (this.tcd != null))
    {
      this.tcf.cLJ();
      this.tcd.cLJ();
    }
    AppMethodBeat.o(5149);
  }

  protected final void cLq()
  {
    AppMethodBeat.i(5155);
    ab.i("MicroMsg.Voip.TalkingSmallView", "onMoveStop");
    this.tcg.setVisibility(0);
    if (this.tcg.tbe)
      this.tcf.mD(false);
    this.lda.removeCallbacks(this.tcl);
    this.lda.postDelayed(this.tcl, 3000L);
    AppMethodBeat.o(5155);
  }

  protected final void cLr()
  {
    AppMethodBeat.i(5156);
    this.tcd.cLI();
    this.tcf.cLI();
    AppMethodBeat.o(5156);
  }

  public final void dY(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(5146);
    Object localObject = (RelativeLayout.LayoutParams)this.tcg.getLayoutParams();
    ((RelativeLayout.LayoutParams)localObject).height = (paramInt2 / 4);
    ((RelativeLayout.LayoutParams)localObject).width = ((int)(this.tcj * ((RelativeLayout.LayoutParams)localObject).height));
    this.tcg.setLayoutParams((ViewGroup.LayoutParams)localObject);
    WindowManager.LayoutParams localLayoutParams = (WindowManager.LayoutParams)getLayoutParams();
    localObject = localLayoutParams;
    if (localLayoutParams == null)
      localObject = new WindowManager.LayoutParams();
    ((WindowManager.LayoutParams)localObject).width = paramInt1;
    ((WindowManager.LayoutParams)localObject).height = paramInt2;
    setLayoutParams((ViewGroup.LayoutParams)localObject);
    AppMethodBeat.o(5146);
  }

  public final OpenGlRender getFilterData()
  {
    return this.tcf;
  }

  protected final void onAnimationEnd()
  {
    this.tcd.taA = true;
    this.tcf.taA = true;
  }

  public final void setCaptureView(CaptureView paramCaptureView)
  {
    AppMethodBeat.i(5154);
    ab.b("MicroMsg.Voip.BaseSmallView", "addCaptureView", new Object[0]);
    if (this.sRg != null)
    {
      removeView(this.sRg);
      this.sRg = null;
    }
    if (paramCaptureView != null)
    {
      this.sRg = paramCaptureView;
      FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(1, 1);
      localLayoutParams.leftMargin = 20;
      localLayoutParams.topMargin = 20;
      addView(paramCaptureView, localLayoutParams);
      paramCaptureView.setVisibility(0);
      ab.d("MicroMsg.Voip.BaseSmallView", "CaptureView added");
    }
    AppMethodBeat.o(5154);
  }

  public final void setHWDecMode(int paramInt)
  {
    AppMethodBeat.i(5151);
    int i;
    if (this.iGP != null)
    {
      if ((paramInt & 0x1) == 0)
        break label61;
      i = 1;
      if (i != 0)
        break label66;
      ab.i("MicroMsg.Voip.TalkingSmallView", "setHWDecMode, not hwdec");
      this.iGP.post(new a.5(this));
    }
    while (true)
    {
      this.sXS = paramInt;
      AppMethodBeat.o(5151);
      return;
      label61: i = 0;
      break;
      label66: ab.i("MicroMsg.Voip.TalkingSmallView", "setHWDecMode, is hwdec");
      this.iGP.post(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(5144);
          a.this.sXQ.setVisibility(0);
          if (d.iW(21))
            a.a(a.this).setVisibility(0);
          a.c(a.this).setVisibility(4);
          AppMethodBeat.o(5144);
        }
      });
    }
  }

  public final void setVoipBeauty(int paramInt)
  {
    AppMethodBeat.i(5150);
    ab.i("MicroMsg.Voip.TalkingSmallView", "setVoipBeauty, mIsStarted:%b, isON:%d", new Object[] { Boolean.valueOf(this.UO), Integer.valueOf(paramInt) });
    this.tck = paramInt;
    if ((this.UO) && (this.tcf != null) && (this.tcd != null))
    {
      this.tcf.setVoipBeauty(paramInt);
      this.tcd.setVoipBeauty(paramInt);
    }
    AppMethodBeat.o(5150);
  }

  public final void uninit()
  {
    AppMethodBeat.i(5153);
    super.uninit();
    com.tencent.mm.sdk.b.a.xxA.d(this.sWj);
    setVisibility(4);
    if (this.UO)
    {
      this.tcd.cLI();
      this.tcf.cLI();
    }
    this.lda.removeCallbacks(this.tcl);
    AppMethodBeat.o(5153);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.widget.a
 * JD-Core Version:    0.6.2
 */