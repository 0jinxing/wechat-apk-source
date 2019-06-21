package com.tencent.mm.plugin.luckymoney.particles.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.VelocityTracker;
import android.view.animation.Interpolator;

public abstract class b
{
  private final Matrix aKk = new Matrix();
  public int alpha;
  public Interpolator nZO;
  public Rect nZP;
  public float nZU;
  public float nZW;
  public Float nZY;
  public float oaA;
  public float oaB;
  public float oaC;
  public float oaD;
  public Long oaE;
  public Long oaF;
  public float oaG;
  public float oaH;
  public Long oaI;
  public float oaJ;
  public float oaK;
  public float oaL;
  public float oaM;
  public float oaN;
  public boolean oaO;
  public boolean oaP;
  public VelocityTracker oaQ;
  public float oaR;
  public float oaS;
  public float oaT;
  public float oaU;
  public Float oaa;
  public float oag;
  public Float oai;
  public long oak;
  private final Paint oay = new Paint(1);
  public long oaz;
  public boolean terminated;

  public static float a(long paramLong, float paramFloat1, float paramFloat2, float paramFloat3, Long paramLong1, Float paramFloat)
  {
    if ((paramLong1 == null) || (paramLong < paramLong1.longValue()));
    for (paramFloat1 = (float)paramLong * paramFloat2 + paramFloat1 + 0.5F * paramFloat3 * (float)paramLong * (float)paramLong; ; paramFloat1 = (float)paramLong1.longValue() * paramFloat2 + paramFloat1 + 0.5F * paramFloat3 * (float)paramLong1.longValue() * (float)paramLong1.longValue() + (float)(paramLong - paramLong1.longValue()) * paramFloat.floatValue())
      return paramFloat1;
  }

  private static long a(float paramFloat1, float paramFloat2, float paramFloat3, Long paramLong, Float paramFloat, int paramInt1, int paramInt2)
  {
    double d1;
    double d2;
    long l;
    if (paramFloat3 != 0.0F)
      if (paramFloat3 > 0.0F)
      {
        if ((paramLong != null) && (paramLong.longValue() >= 0L))
          break label114;
        d1 = Math.sqrt(2.0F * paramFloat3 * paramInt2 - 2.0F * paramFloat3 * paramFloat1 + paramFloat2 * paramFloat2);
        d2 = (-d1 - paramFloat2) / paramFloat3;
        if (d2 <= 0.0D)
          break label81;
        l = ()d2;
      }
    while (true)
    {
      return l;
      paramInt2 = paramInt1;
      break;
      label81: d2 = (d1 - paramFloat2) / paramFloat3;
      if (d2 > 0.0D)
      {
        l = ()d2;
      }
      else
      {
        l = 9223372036854775807L;
        continue;
        label114: d2 = (paramInt2 - paramFloat1 - (float)paramLong.longValue() * paramFloat2 - 0.5D * paramFloat3 * paramLong.longValue() * paramLong.longValue() + paramFloat.floatValue() * (float)paramLong.longValue()) / paramFloat.floatValue();
        if (d2 > 0.0D)
        {
          l = ()d2;
        }
        else
        {
          l = 9223372036854775807L;
          continue;
          if (paramLong == null)
            label196: if (paramFloat2 <= 0.0F)
              break label242;
          while (true)
            if (paramFloat2 != 0.0F)
            {
              d2 = (paramInt2 - paramFloat1) / paramFloat2;
              if (d2 > 0.0D)
              {
                l = ()d2;
                break;
                paramFloat2 = paramFloat.floatValue();
                break label196;
                label242: paramInt2 = paramInt1;
                continue;
              }
              l = 9223372036854775807L;
              break;
            }
          l = 9223372036854775807L;
        }
      }
    }
  }

  private static Long a(Float paramFloat, float paramFloat1, float paramFloat2)
  {
    Object localObject1 = null;
    Object localObject2 = localObject1;
    long l;
    if (paramFloat != null)
    {
      if (paramFloat2 == 0.0F)
        break label49;
      l = ()((paramFloat.floatValue() - paramFloat1) / paramFloat2);
      if (l <= 0L)
        break label43;
      localObject2 = Long.valueOf(l);
    }
    while (true)
    {
      return localObject2;
      label43: l = 0L;
      break;
      label49: localObject2 = localObject1;
      if (paramFloat.floatValue() < paramFloat1)
        localObject2 = Long.valueOf(0L);
    }
  }

  public final void a(Canvas paramCanvas, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    paramCanvas.save();
    paramCanvas.clipRect(this.nZP);
    this.aKk.reset();
    this.oay.setAlpha(this.alpha);
    a(paramCanvas, this.aKk, this.oay, paramFloat1, paramFloat2, paramFloat3, paramFloat4);
    paramCanvas.restore();
  }

  protected abstract void a(Canvas paramCanvas, Matrix paramMatrix, Paint paramPaint, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4);

  public abstract int getHeight();

  public abstract int getWidth();

  public final void i(Rect paramRect)
  {
    this.nZP = paramRect;
    this.oaE = a(this.nZY, this.oaC, this.nZU);
    this.oaF = a(this.oaa, this.oaD, this.nZW);
    this.oaI = a(this.oai, this.oaH, this.oag);
    if (this.oaJ == 0.0F)
      if (this.oak < 0L)
        break label199;
    label199: for (float f = (float)this.oak; ; f = 9.223372E+018F)
    {
      this.oaJ = f;
      this.oaJ = Math.min((float)a(this.oaA, this.oaC, this.nZU, this.oaE, this.nZY, paramRect.left - getWidth(), paramRect.right), this.oaJ);
      this.oaJ = Math.min((float)a(this.oaB, this.oaD, this.nZW, this.oaF, this.oaa, paramRect.top - getHeight(), paramRect.bottom), this.oaJ);
      this.oay.setAlpha(this.alpha);
      return;
    }
  }

  public void reset()
  {
    this.oaz = 0L;
    this.oaB = 0.0F;
    this.oaA = 0.0F;
    this.oaD = 0.0F;
    this.oaC = 0.0F;
    this.nZW = 0.0F;
    this.nZU = 0.0F;
    this.oaa = null;
    this.nZY = null;
    this.oaF = null;
    this.oaE = null;
    this.oaG = 0.0F;
    this.oaH = 0.0F;
    this.oag = 0.0F;
    this.oai = null;
    this.oaI = null;
    this.oak = 0L;
    this.oaJ = 0.0F;
    this.oaK = 0.0F;
    this.nZO = null;
    this.oaM = 0.0F;
    this.oaL = 0.0F;
    this.oaN = 0.0F;
    this.alpha = 255;
    this.oaO = false;
    this.terminated = false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.particles.a.b
 * JD-Core Version:    0.6.2
 */