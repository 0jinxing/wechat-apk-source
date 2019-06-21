package com.tencent.mm.pluginsdk.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Random;

public final class k extends Drawable
{
  private Paint aFY;
  private Context context;
  private int currentState;
  private float hcR;
  private float hcS;
  private ValueAnimator jcQ;
  private int mMA;
  private int mMB;
  private boolean mMC;
  private int mMD;
  private int mMv;
  private int mMw;
  private int mMx;
  private int mMy;
  private int mMz;
  private float mYY;
  private Random random;
  private Drawable viJ;
  private Interpolator viK;
  private Interpolator viL;
  private int viM;
  private int viN;
  private int viO;
  private int viP;
  private int viQ;
  private int viR;
  private float viS;
  private float viT;
  private int viU;
  private int viV;
  private RectF viW;

  public k(Context paramContext)
  {
    AppMethodBeat.i(27543);
    this.viJ = null;
    this.mMv = 0;
    this.mMw = 0;
    this.aFY = new Paint(1);
    this.viK = new LinearInterpolator();
    this.viL = new AccelerateDecelerateInterpolator();
    this.random = new Random(System.currentTimeMillis());
    this.mMB = 0;
    this.mYY = 0.0F;
    this.hcR = -90.0F;
    this.viS = 0.0F;
    this.hcS = 0.0F;
    this.viT = 5.0F;
    this.mMC = false;
    this.currentState = 2;
    this.jcQ = ValueAnimator.ofFloat(new float[] { 0.0F, 100.0F });
    this.jcQ.setInterpolator(this.viK);
    this.jcQ.addUpdateListener(new k.1(this));
    this.viW = new RectF();
    this.context = paramContext;
    this.mMv = a.i(paramContext, 2131690683);
    this.mMw = a.i(paramContext, 2131690312);
    this.viJ = paramContext.getResources().getDrawable(2131232105);
    this.viO = a.am(paramContext, 2131428748);
    this.viP = a.am(paramContext, 2131428747);
    this.viQ = a.am(paramContext, 2131428737);
    this.mMB = a.am(paramContext, 2131428742);
    this.mMx = a.i(paramContext, 2131690610);
    this.viN = a.am(paramContext, 2131428739);
    this.viR = a.am(paramContext, 2131428738);
    this.mMA = a.i(paramContext, 2131690611);
    this.viU = this.viR;
    this.viV = this.viU;
    this.mMD = a.am(paramContext, 2131428741);
    this.mMy = a.am(paramContext, 2131428741);
    this.mMz = a.am(paramContext, 2131428740);
    this.viM = a.am(paramContext, 2131428749);
    AppMethodBeat.o(27543);
  }

  private static boolean j(Canvas paramCanvas)
  {
    AppMethodBeat.i(27553);
    boolean bool;
    if ((paramCanvas == null) || (paramCanvas.getWidth() == 0) || (paramCanvas.getHeight() == 0))
    {
      bool = true;
      AppMethodBeat.o(27553);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(27553);
    }
  }

  public final void KO(int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(27548);
    ab.d("MicroMsg.VoiceInputDrawable", "recordingState() called with: maxAmplitudeRate = [%s]", new Object[] { Integer.valueOf(paramInt) });
    if (paramInt < 28);
    while (true)
    {
      this.mMC = bool;
      invalidateSelf();
      AppMethodBeat.o(27548);
      return;
      bool = false;
    }
  }

  public final void bBx()
  {
    AppMethodBeat.i(27545);
    ab.d("MicroMsg.VoiceInputDrawable", "readyState %s", new Object[] { Integer.valueOf(this.currentState) });
    this.currentState = 2;
    this.jcQ.cancel();
    this.mYY = 0.0F;
    this.hcR = -90.0F;
    this.viS = 0.0F;
    this.hcS = 0.0F;
    this.viT = 5.0F;
    invalidateSelf();
    AppMethodBeat.o(27545);
  }

  public final void djl()
  {
    AppMethodBeat.i(27544);
    ab.d("MicroMsg.VoiceInputDrawable", "longClickState %s", new Object[] { Integer.valueOf(this.currentState) });
    this.currentState = 7;
    this.jcQ.cancel();
    this.mYY = 0.0F;
    invalidateSelf();
    AppMethodBeat.o(27544);
  }

  public final void djm()
  {
    AppMethodBeat.i(27546);
    ab.d("MicroMsg.VoiceInputDrawable", "readyPressState %s", new Object[] { Integer.valueOf(this.currentState) });
    this.currentState = 6;
    this.jcQ.cancel();
    this.mYY = 0.0F;
    invalidateSelf();
    AppMethodBeat.o(27546);
  }

  public final void djn()
  {
    AppMethodBeat.i(27549);
    ab.d("MicroMsg.VoiceInputDrawable", "recognizingState %s", new Object[] { Integer.valueOf(this.currentState) });
    this.currentState = 4;
    this.jcQ.cancel();
    this.mYY = 0.0F;
    this.jcQ.setInterpolator(new AccelerateDecelerateInterpolator());
    this.jcQ.setDuration(1000L);
    this.jcQ.setRepeatCount(-1);
    this.jcQ.start();
    AppMethodBeat.o(27549);
  }

  public final void djo()
  {
    AppMethodBeat.i(27550);
    ab.d("MicroMsg.VoiceInputDrawable", "disableState %s", new Object[] { Integer.valueOf(this.currentState) });
    this.currentState = 5;
    this.jcQ.cancel();
    this.mYY = 0.0F;
    invalidateSelf();
    AppMethodBeat.o(27550);
  }

  public final void draw(Canvas paramCanvas)
  {
    AppMethodBeat.i(27551);
    int i;
    int j;
    if (((this.currentState == 6) || (this.currentState == 7)) && (!j(paramCanvas)))
    {
      i = paramCanvas.getWidth() >> 1;
      j = paramCanvas.getHeight() >> 1;
      this.aFY.setShader(null);
      this.aFY.setStyle(Paint.Style.FILL);
      this.aFY.setColor(this.mMx);
      if (this.currentState != 7)
        break label457;
      if (this.mMC)
      {
        this.mMD -= 4;
        this.mMD = Math.min(Math.max(this.mMy, this.mMD), this.mMz);
        paramCanvas.drawCircle(i, j, this.mMD, this.aFY);
      }
    }
    else
    {
      label140: if ((this.viJ != null) && (!j(paramCanvas)))
        break label477;
      if ((this.currentState == 4) && (paramCanvas != null))
      {
        this.aFY.setColor(this.mMv);
        this.aFY.setStrokeWidth(this.viM);
        this.aFY.setStyle(Paint.Style.STROKE);
        this.aFY.clearShadowLayer();
        this.aFY.setShader(null);
        this.viW.left = (paramCanvas.getWidth() / 2 - this.viR);
        this.viW.top = (paramCanvas.getHeight() / 2 - this.viR);
        this.viW.right = (paramCanvas.getWidth() / 2 + this.viR);
        this.viW.bottom = (paramCanvas.getHeight() / 2 + this.viR);
        paramCanvas.drawArc(this.viW, this.hcR, this.hcS, false, this.aFY);
        this.hcR += this.viS;
        this.hcS += this.viT;
        if (this.hcS < 360.0F)
          break label572;
        this.viT = (-this.viT);
        this.viS = 5.0F;
      }
    }
    while (true)
    {
      if (((this.currentState == 6) || (this.currentState == 7)) && (!j(paramCanvas)))
      {
        this.aFY.setStyle(Paint.Style.FILL);
        this.aFY.setColor(this.mMA);
        paramCanvas.drawCircle(paramCanvas.getWidth() >> 1, paramCanvas.getHeight() >> 1, this.mMB, this.aFY);
      }
      AppMethodBeat.o(27551);
      return;
      this.mMD += 4;
      break;
      label457: paramCanvas.drawCircle(i, j, this.mMy, this.aFY);
      break label140;
      label477: if (this.currentState == 5)
        this.viJ.setColorFilter(this.mMw, PorterDuff.Mode.SRC_ATOP);
      while (true)
      {
        i = paramCanvas.getWidth() / 2;
        j = paramCanvas.getHeight() / 2;
        this.viJ.setBounds(i - this.mMB, j - this.mMB, i + this.mMB, j + this.mMB);
        this.viJ.draw(paramCanvas);
        break;
        this.viJ.setColorFilter(this.mMv, PorterDuff.Mode.SRC_ATOP);
      }
      label572: if (this.hcS <= 0.0F)
      {
        this.viT = (-this.viT);
        this.viS = 0.0F;
        this.hcR = -90.0F;
        this.hcS = 0.0F;
      }
    }
  }

  public final int getIntrinsicHeight()
  {
    return this.mMB * 2;
  }

  public final int getIntrinsicWidth()
  {
    AppMethodBeat.i(27552);
    int i;
    if (this.context == null)
    {
      i = 0;
      AppMethodBeat.o(27552);
    }
    while (true)
    {
      return i;
      i = a.gd(this.context);
      AppMethodBeat.o(27552);
    }
  }

  public final int getOpacity()
  {
    return -3;
  }

  public final void oy(boolean paramBoolean)
  {
    AppMethodBeat.i(27547);
    ab.d("MicroMsg.VoiceInputDrawable", "recordingStartState() called with: maxAmplitudeRate = [%s] fromLongCkick = %s", new Object[] { Integer.valueOf(0), Boolean.valueOf(paramBoolean) });
    if (!paramBoolean)
      this.currentState = 3;
    this.mMC = true;
    invalidateSelf();
    AppMethodBeat.o(27547);
  }

  public final void setAlpha(int paramInt)
  {
  }

  public final void setColorFilter(ColorFilter paramColorFilter)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.k
 * JD-Core Version:    0.6.2
 */