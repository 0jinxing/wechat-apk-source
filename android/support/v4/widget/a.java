package android.support.v4.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.support.v4.view.s;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

public abstract class a
  implements View.OnTouchListener
{
  private static final int OJ = ViewConfiguration.getTapTimeout();
  private float[] OA = { 0.0F, 0.0F };
  private float[] OB = { 0.0F, 0.0F };
  private float[] OC = { 3.4028235E+38F, 3.4028235E+38F };
  private boolean OD;
  boolean OE;
  boolean OF;
  boolean OG;
  private boolean OH;
  private boolean OI;
  final a Ot = new a();
  private final Interpolator Ou = new AccelerateInterpolator();
  final View Ov;
  private float[] Ow = { 0.0F, 0.0F };
  private float[] Ox = { 3.4028235E+38F, 3.4028235E+38F };
  private int Oy;
  private int Oz;
  private Runnable mRunnable;

  public a(View paramView)
  {
    this.Ov = paramView;
    paramView = Resources.getSystem().getDisplayMetrics();
    int i = (int)(1575.0F * paramView.density + 0.5F);
    int j = (int)(paramView.density * 315.0F + 0.5F);
    float f = i;
    this.OC[0] = (f / 1000.0F);
    this.OC[1] = (f / 1000.0F);
    f = j;
    this.OB[0] = (f / 1000.0F);
    this.OB[1] = (f / 1000.0F);
    this.Oy = 1;
    this.Ox[0] = 3.4028235E+38F;
    this.Ox[1] = 3.4028235E+38F;
    this.Ow[0] = 0.2F;
    this.Ow[1] = 0.2F;
    this.OA[0] = 0.001F;
    this.OA[1] = 0.001F;
    this.Oz = OJ;
    this.Ot.OL = 500;
    this.Ot.OM = 500;
  }

  private float a(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    float f1 = 0.0F;
    paramFloat1 = c(this.Ow[paramInt], paramFloat2, this.Ox[paramInt], paramFloat1);
    if (paramFloat1 == 0.0F)
      paramFloat1 = f1;
    while (true)
    {
      return paramFloat1;
      float f2 = this.OA[paramInt];
      f1 = this.OB[paramInt];
      paramFloat2 = this.OC[paramInt];
      paramFloat3 = f2 * paramFloat3;
      if (paramFloat1 > 0.0F)
        paramFloat1 = d(paramFloat1 * paramFloat3, f1, paramFloat2);
      else
        paramFloat1 = -d(-paramFloat1 * paramFloat3, f1, paramFloat2);
    }
  }

  private float c(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    float f = 0.0F;
    paramFloat3 = d(paramFloat1 * paramFloat2, 0.0F, paramFloat3);
    paramFloat1 = t(paramFloat4, paramFloat3);
    paramFloat2 = t(paramFloat2 - paramFloat4, paramFloat3) - paramFloat1;
    if (paramFloat2 < 0.0F);
    for (paramFloat1 = -this.Ou.getInterpolation(-paramFloat2); ; paramFloat1 = this.Ou.getInterpolation(paramFloat2))
    {
      paramFloat1 = d(paramFloat1, -1.0F, 1.0F);
      do
      {
        return paramFloat1;
        paramFloat1 = f;
      }
      while (paramFloat2 <= 0.0F);
    }
  }

  static float d(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if (paramFloat1 > paramFloat3);
    while (true)
    {
      return paramFloat3;
      if (paramFloat1 < paramFloat2)
        paramFloat3 = paramFloat2;
      else
        paramFloat3 = paramFloat1;
    }
  }

  private void ev()
  {
    if (this.OE)
      this.OG = false;
    while (true)
    {
      return;
      this.Ot.ev();
    }
  }

  private float t(float paramFloat1, float paramFloat2)
  {
    float f1 = 0.0F;
    float f2;
    if (paramFloat2 == 0.0F)
      f2 = f1;
    while (true)
    {
      return f2;
      switch (this.Oy)
      {
      default:
        f2 = f1;
        break;
      case 0:
      case 1:
        f2 = f1;
        if (paramFloat1 < paramFloat2)
          if (paramFloat1 >= 0.0F)
          {
            f2 = 1.0F - paramFloat1 / paramFloat2;
          }
          else
          {
            f2 = f1;
            if (this.OG)
            {
              f2 = f1;
              if (this.Oy == 1)
                f2 = 1.0F;
            }
          }
        break;
      case 2:
        f2 = f1;
        if (paramFloat1 < 0.0F)
          f2 = paramFloat1 / -paramFloat2;
        break;
      }
    }
  }

  static int x(int paramInt1, int paramInt2)
  {
    if (paramInt1 > paramInt2);
    while (true)
    {
      return paramInt2;
      if (paramInt1 < 0)
        paramInt2 = 0;
      else
        paramInt2 = paramInt1;
    }
  }

  public final a G(boolean paramBoolean)
  {
    if ((this.OH) && (!paramBoolean))
      ev();
    this.OH = paramBoolean;
    return this;
  }

  public abstract void aN(int paramInt);

  public abstract boolean aO(int paramInt);

  final boolean bG()
  {
    a locala = this.Ot;
    int i = locala.ex();
    int j = locala.ew();
    if ((i == 0) || (!aO(i)))
      if (j == 0);
    for (boolean bool = false; ; bool = true)
      return bool;
  }

  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool1 = false;
    boolean bool2;
    if (!this.OH)
    {
      bool2 = bool1;
      return bool2;
    }
    switch (paramMotionEvent.getActionMasked())
    {
    default:
    case 0:
    case 2:
    case 1:
    case 3:
    }
    while (true)
    {
      bool2 = bool1;
      if (!this.OI)
        break;
      bool2 = bool1;
      if (!this.OG)
        break;
      bool2 = true;
      break;
      this.OF = true;
      this.OD = false;
      float f1 = a(0, paramMotionEvent.getX(), paramView.getWidth(), this.Ov.getWidth());
      float f2 = a(1, paramMotionEvent.getY(), paramView.getHeight(), this.Ov.getHeight());
      paramView = this.Ot;
      paramView.OO = f1;
      paramView.OP = f2;
      if ((!this.OG) && (bG()))
      {
        if (this.mRunnable == null)
          this.mRunnable = new b();
        this.OG = true;
        this.OE = true;
        if ((!this.OD) && (this.Oz > 0))
          s.a(this.Ov, this.mRunnable, this.Oz);
        while (true)
        {
          this.OD = true;
          break;
          this.mRunnable.run();
        }
        ev();
      }
    }
  }

  static final class a
  {
    int OL;
    int OM;
    float OO;
    float OP;
    long OQ = 0L;
    long OR = -1L;
    float OS;
    int OT;
    long mStartTime = -9223372036854775808L;
    int yH = 0;
    int yI = 0;

    public final void ev()
    {
      long l = AnimationUtils.currentAnimationTimeMillis();
      this.OT = a.x((int)(l - this.mStartTime), this.OM);
      this.OS = n(l);
      this.OR = l;
    }

    public final int ew()
    {
      return (int)(this.OO / Math.abs(this.OO));
    }

    public final int ex()
    {
      return (int)(this.OP / Math.abs(this.OP));
    }

    final float n(long paramLong)
    {
      float f1 = 0.0F;
      if (paramLong < this.mStartTime);
      while (true)
      {
        return f1;
        if ((this.OR < 0L) || (paramLong < this.OR))
        {
          f1 = a.d((float)(paramLong - this.mStartTime) / this.OL, 0.0F, 1.0F) * 0.5F;
        }
        else
        {
          long l = this.OR;
          float f2 = this.OS;
          f1 = this.OS;
          f1 = a.d((float)(paramLong - l) / this.OT, 0.0F, 1.0F) * f1 + (1.0F - f2);
        }
      }
    }
  }

  final class b
    implements Runnable
  {
    b()
    {
    }

    public final void run()
    {
      if (!a.this.OG);
      while (true)
      {
        return;
        if (a.this.OE)
        {
          a.this.OE = false;
          locala = a.this.Ot;
          locala.mStartTime = AnimationUtils.currentAnimationTimeMillis();
          locala.OR = -1L;
          locala.OQ = locala.mStartTime;
          locala.OS = 0.5F;
          locala.yH = 0;
          locala.yI = 0;
        }
        a.a locala = a.this.Ot;
        if ((locala.OR > 0L) && (AnimationUtils.currentAnimationTimeMillis() > locala.OR + locala.OT));
        for (int i = 1; ; i = 0)
        {
          if ((i == 0) && (a.this.bG()))
            break label141;
          a.this.OG = false;
          break;
        }
        label141: if (a.this.OF)
        {
          a.this.OF = false;
          a locala1 = a.this;
          l1 = SystemClock.uptimeMillis();
          MotionEvent localMotionEvent = MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0);
          locala1.Ov.onTouchEvent(localMotionEvent);
          localMotionEvent.recycle();
        }
        if (locala.OQ == 0L)
          throw new RuntimeException("Cannot compute scroll delta before calling start()");
        long l2 = AnimationUtils.currentAnimationTimeMillis();
        float f = locala.n(l2);
        f = f * 4.0F + -4.0F * f * f;
        long l1 = l2 - locala.OQ;
        locala.OQ = l2;
        locala.yH = ((int)((float)l1 * f * locala.OO));
        locala.yI = ((int)((float)l1 * f * locala.OP));
        i = locala.yI;
        a.this.aN(i);
        s.b(a.this.Ov, this);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.a
 * JD-Core Version:    0.6.2
 */