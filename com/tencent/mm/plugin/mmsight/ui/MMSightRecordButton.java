package com.tencent.mm.plugin.mmsight.ui;

import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.v;

public class MMSightRecordButton extends FrameLayout
{
  private static final int LO;
  private static final float oAQ;
  private boolean enable;
  private ak fbD;
  private boolean isAnimating;
  private float neH;
  private long oAR;
  private View oAS;
  private View oAT;
  private MMSightCircularProgressBar oAU;
  private boolean oAV;
  private boolean oAW;
  private ViewPropertyAnimator oAX;
  private ViewPropertyAnimator oAY;
  private ValueAnimator oAZ;
  private ViewPropertyAnimator oBa;
  private ViewPropertyAnimator oBb;
  private boolean oBc;
  private int oBd;
  private int oBe;
  private MMSightRecordButton.d oBf;
  private MMSightRecordButton.b oBg;
  private MMSightRecordButton.c oBh;
  private MMSightRecordButton.a oBi;
  private Drawable oBj;
  private Drawable oBk;
  private boolean oBl;
  private boolean oBm;
  private Runnable oBn;
  private Runnable oBo;
  private View progressBar;

  static
  {
    AppMethodBeat.i(55116);
    LO = ViewConfiguration.getTapTimeout();
    oAQ = ah.getContext().getResources().getDimensionPixelSize(2131428554) / ah.getContext().getResources().getDimensionPixelSize(2131428553);
    AppMethodBeat.o(55116);
  }

  public MMSightRecordButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(55100);
    this.oAR = -1L;
    this.oAV = false;
    this.oAW = false;
    this.isAnimating = false;
    this.oBc = false;
    this.neH = -1.0F;
    this.enable = true;
    this.oBl = false;
    this.oBm = false;
    this.fbD = new ak(Looper.getMainLooper());
    this.oBn = new MMSightRecordButton.5(this);
    this.oBo = new MMSightRecordButton.6(this);
    init();
    AppMethodBeat.o(55100);
  }

  public MMSightRecordButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(55101);
    this.oAR = -1L;
    this.oAV = false;
    this.oAW = false;
    this.isAnimating = false;
    this.oBc = false;
    this.neH = -1.0F;
    this.enable = true;
    this.oBl = false;
    this.oBm = false;
    this.fbD = new ak(Looper.getMainLooper());
    this.oBn = new MMSightRecordButton.5(this);
    this.oBo = new MMSightRecordButton.6(this);
    init();
    AppMethodBeat.o(55101);
  }

  private void a(AnimatorListenerAdapter paramAnimatorListenerAdapter)
  {
    AppMethodBeat.i(55109);
    this.isAnimating = true;
    if (this.oBa != null)
    {
      this.oBa.cancel();
      this.oBa = null;
    }
    this.oBa = this.oAS.animate().scaleX(1.0F).scaleY(1.0F);
    this.oBa.setListener(new MMSightRecordButton.3(this, paramAnimatorListenerAdapter)).setDuration(150L).start();
    if (this.oBb != null)
    {
      this.oBb.cancel();
      this.oBb = null;
    }
    this.oBb = this.oAT.animate().scaleX(1.0F).scaleY(1.0F);
    this.oBb.setDuration(150L).start();
    if (this.oBe != this.oBd)
    {
      if (this.oAZ != null)
        this.oAZ.cancel();
      this.oAZ = ObjectAnimator.ofInt(this.oBk, "color", new int[] { this.oBd, this.oBe });
      this.oAZ.setDuration(150L);
      this.oAZ.setEvaluator(a.bQq());
      this.oAZ.start();
    }
    AppMethodBeat.o(55109);
  }

  private void init()
  {
    AppMethodBeat.i(55102);
    ab.i("MicroMsg.MMSightRecordButton", "init, longPressTimeout: %s, tapTimeout: %s", new Object[] { Integer.valueOf(500), Integer.valueOf(LO) });
    this.oBj = getContext().getResources().getDrawable(2130839575);
    this.oBk = getContext().getResources().getDrawable(2130839576);
    this.oBd = -2236963;
    this.oBe = this.oBd;
    if ((this.oBk instanceof GradientDrawable))
      ((GradientDrawable)this.oBk).setColor(this.oBd);
    v.hu(getContext()).inflate(2130970233, this, true);
    this.oAS = findViewById(2131826113);
    this.oAT = findViewById(2131826112);
    this.progressBar = findViewById(2131821099);
    this.oAU = ((MMSightCircularProgressBar)findViewById(2131826114));
    this.oAS.setBackgroundDrawable(this.oBj);
    this.oAT.setBackgroundDrawable(this.oBk);
    this.enable = true;
    AppMethodBeat.o(55102);
  }

  public final void a(int paramInt1, int paramInt2, MMSightCircularProgressBar.a parama)
  {
    AppMethodBeat.i(55107);
    ab.c("MicroMsg.MMSightRecordButton", "startProgress, initProgress: %s, maxProgress: %s, duration: %s, callback: %s", new Object[] { Integer.valueOf(0), Integer.valueOf(100), Integer.valueOf(paramInt1), parama });
    this.oAU.setInitProgress(0);
    this.oAU.setMaxProgress(100);
    this.oAU.setDuration(paramInt1);
    this.oAU.setVisibility(0);
    this.oAU.setCircularColor(paramInt2);
    parama = new MMSightRecordButton.1(this, parama);
    this.oAU.setProgressCallback(parama);
    MMSightCircularProgressBar localMMSightCircularProgressBar = this.oAU;
    ab.i("MicroMsg.MMSightCircularProgressBar", "start, initProgress: %s, maxProgress: %s, duration: %s", new Object[] { Integer.valueOf(localMMSightCircularProgressBar.oAI), Integer.valueOf(localMMSightCircularProgressBar.oAJ), Integer.valueOf(localMMSightCircularProgressBar.duration) });
    localMMSightCircularProgressBar.oAH = 0.0F;
    localMMSightCircularProgressBar.oAL = new c(localMMSightCircularProgressBar.oAI, localMMSightCircularProgressBar.oAJ, localMMSightCircularProgressBar.duration);
    parama = localMMSightCircularProgressBar.oAL;
    MMSightCircularProgressBar.1 local1 = new MMSightCircularProgressBar.1(localMMSightCircularProgressBar);
    ab.i("MicroMsg.ProgressHandlerAnimator", "setAnimationCallback: %s", new Object[] { local1 });
    parama.oCg = local1;
    parama = localMMSightCircularProgressBar.oAL;
    ab.i("MicroMsg.ProgressHandlerAnimator", "Start");
    parama.cFy = true;
    parama.eyR = bo.yz();
    parama.fJs.ae(20L, 20L);
    AppMethodBeat.o(55107);
  }

  public final void bQs()
  {
    AppMethodBeat.i(55105);
    ab.i("MicroMsg.MMSightRecordButton", "showProgressBar");
    this.progressBar.setVisibility(0);
    AppMethodBeat.o(55105);
  }

  public final void bQt()
  {
    AppMethodBeat.i(55106);
    ab.i("MicroMsg.MMSightRecordButton", "hideProgressBar");
    this.progressBar.setVisibility(8);
    AppMethodBeat.o(55106);
  }

  public final void bgk()
  {
    AppMethodBeat.i(55108);
    MMSightCircularProgressBar localMMSightCircularProgressBar = this.oAU;
    localMMSightCircularProgressBar.oAM = null;
    localMMSightCircularProgressBar.oAI = 0;
    localMMSightCircularProgressBar.oAJ = 0;
    localMMSightCircularProgressBar.duration = 0;
    localMMSightCircularProgressBar.cFy = false;
    if (localMMSightCircularProgressBar.oAL != null)
    {
      c localc = localMMSightCircularProgressBar.oAL;
      localc.cFy = false;
      localc.eyR = 0L;
      localMMSightCircularProgressBar.oAL = null;
    }
    this.oAU.setVisibility(8);
    AppMethodBeat.o(55108);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(55112);
    if (!this.enable)
    {
      ab.i("MicroMsg.MMSightRecordButton", "onTouchEvent, not enable, ignore");
      AppMethodBeat.o(55112);
      return true;
    }
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    case 2:
    case 1:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(55112);
      break;
      this.oBc = true;
      this.oAR = System.currentTimeMillis();
      this.oAV = false;
      this.oAW = false;
      this.neH = paramMotionEvent.getRawY();
      if (this.oBg != null)
        this.oBg.bnV();
      this.fbD.postDelayed(this.oBn, 550L);
      this.fbD.postDelayed(this.oBo, 250L);
      this.oBm = true;
      this.oBl = true;
      continue;
      float f1 = paramMotionEvent.getRawY();
      if ((f1 < getTop()) && (this.oAW))
        if (this.neH <= 0.0F)
        {
          this.neH = paramMotionEvent.getRawY();
        }
        else
        {
          float f2 = Math.abs(f1 - this.neH);
          int i;
          if ((f1 < this.neH) && (f2 >= 10.0F))
          {
            i = (int)(f2 / 10.0F);
            ab.d("MicroMsg.MMSightRecordButton", "onScroll Up, factor: %s, isFirstScrollUp: %s", new Object[] { Integer.valueOf(i), Boolean.valueOf(this.oBl) });
            i = Math.min(i, 3);
            if (this.oBh != null)
            {
              paramMotionEvent = this.oBh;
              if (this.oBl)
                i = 1;
              paramMotionEvent.uF(i);
            }
            this.neH = f1;
            this.oBl = false;
          }
          else if ((f1 > this.neH) && (f2 >= 10.0F))
          {
            i = (int)(f2 / 10.0F);
            ab.d("MicroMsg.MMSightRecordButton", "onScroll Down, factor: %s, isFirstScrollDown: %s", new Object[] { Integer.valueOf(i), Boolean.valueOf(this.oBm) });
            i = Math.min(i, 3);
            if (this.oBh != null)
            {
              paramMotionEvent = this.oBh;
              if (this.oBm)
                i = 1;
              paramMotionEvent.uG(i);
            }
            this.oBm = false;
            this.neH = f1;
            continue;
            this.oBc = false;
            this.fbD.removeCallbacks(this.oBo, Integer.valueOf(LO));
            this.fbD.removeCallbacks(this.oBn);
            if ((this.oAX != null) && (this.oAY != null))
            {
              this.oAX.cancel();
              this.oAY.cancel();
            }
            long l = System.currentTimeMillis() - this.oAR;
            ab.i("MicroMsg.MMSightRecordButton", "onAction Up/Cancel, isDispatchLongPress: %s, isDispatchSimpleTap: %s, pressDownTime: %s, upTimeDiff: %s", new Object[] { Boolean.valueOf(this.oAW), Boolean.valueOf(this.oAV), Long.valueOf(this.oAR), Long.valueOf(l) });
            bgk();
            a(new MMSightRecordButton.7(this, l));
          }
        }
    }
  }

  public final void reset()
  {
    AppMethodBeat.i(55111);
    setClipChildren(false);
    this.enable = true;
    this.oAS.setScaleX(1.0F);
    this.oAS.setScaleY(1.0F);
    this.oAT.setScaleX(1.0F);
    this.oAT.setScaleY(1.0F);
    this.progressBar.setVisibility(8);
    bgk();
    AppMethodBeat.o(55111);
  }

  public void setErrorPressCallback(MMSightRecordButton.a parama)
  {
    this.oBi = parama;
  }

  public void setHighLightOuter(int paramInt)
  {
    AppMethodBeat.i(55103);
    this.oBe = paramInt;
    if ((this.oBk instanceof GradientDrawable))
      ((GradientDrawable)this.oBk).setColor(paramInt);
    AppMethodBeat.o(55103);
  }

  public void setLongPressCallback(MMSightRecordButton.b paramb)
  {
    this.oBg = paramb;
  }

  public void setLongPressScrollCallback(MMSightRecordButton.c paramc)
  {
    this.oBh = paramc;
  }

  public void setSimpleTapCallback(MMSightRecordButton.d paramd)
  {
    this.oBf = paramd;
  }

  public void setTouchEnable(boolean paramBoolean)
  {
    AppMethodBeat.i(55104);
    ab.i("MicroMsg.MMSightRecordButton", "setTouchEnable: %s", new Object[] { Boolean.valueOf(paramBoolean) });
    this.enable = paramBoolean;
    AppMethodBeat.o(55104);
  }

  public void setVisibility(int paramInt)
  {
    AppMethodBeat.i(55110);
    ab.i("MicroMsg.MMSightRecordButton", "setVisibility, isAnimating: %s", new Object[] { Boolean.valueOf(this.isAnimating) });
    if (this.isAnimating)
    {
      postDelayed(new MMSightRecordButton.4(this, paramInt), 150L);
      AppMethodBeat.o(55110);
    }
    while (true)
    {
      return;
      super.setVisibility(paramInt);
      AppMethodBeat.o(55110);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton
 * JD-Core Version:    0.6.2
 */