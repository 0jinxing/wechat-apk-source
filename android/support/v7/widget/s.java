package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;

class s
  implements u
{
  final RectF agY = new RectF();

  private static void f(t paramt)
  {
    Rect localRect = new Rect();
    k(paramt).getPadding(localRect);
    paramt.S((int)Math.ceil(k(paramt).ky()), (int)Math.ceil(k(paramt).kz()));
    paramt.e(localRect.left, localRect.top, localRect.right, localRect.bottom);
  }

  private static ar k(t paramt)
  {
    return (ar)paramt.hR();
  }

  public final float a(t paramt)
  {
    return k(paramt).ri;
  }

  public final void a(t paramt, float paramFloat)
  {
    ar localar = k(paramt);
    if (paramFloat < 0.0F)
      throw new IllegalArgumentException("Invalid radius " + paramFloat + ". Must be >= 0");
    paramFloat = (int)(0.5F + paramFloat);
    if (localar.rf != paramFloat)
    {
      localar.rf = paramFloat;
      localar.rl = true;
      localar.invalidateSelf();
    }
    f(paramt);
  }

  public final void a(t paramt, Context paramContext, ColorStateList paramColorStateList, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    paramContext = new ar(paramContext.getResources(), paramColorStateList, paramFloat1, paramFloat2, paramFloat3);
    paramContext.ap(paramt.getPreventCornerOverlap());
    paramt.l(paramContext);
    f(paramt);
  }

  public final void a(t paramt, ColorStateList paramColorStateList)
  {
    paramt = k(paramt);
    paramt.e(paramColorStateList);
    paramt.invalidateSelf();
  }

  public final float b(t paramt)
  {
    return k(paramt).ky();
  }

  public final void b(t paramt, float paramFloat)
  {
    ar localar = k(paramt);
    localar.p(localar.rk, paramFloat);
    f(paramt);
  }

  public final float c(t paramt)
  {
    return k(paramt).kz();
  }

  public final void c(t paramt, float paramFloat)
  {
    paramt = k(paramt);
    paramt.p(paramFloat, paramt.ri);
  }

  public final float d(t paramt)
  {
    return k(paramt).rf;
  }

  public final float e(t paramt)
  {
    return k(paramt).rk;
  }

  public final void g(t paramt)
  {
  }

  public final void h(t paramt)
  {
    k(paramt).ap(paramt.getPreventCornerOverlap());
    f(paramt);
  }

  public void hT()
  {
    ar.aqk = new s.1(this);
  }

  public final ColorStateList i(t paramt)
  {
    return k(paramt).aqi;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.s
 * JD-Core Version:    0.6.2
 */