package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

final class r
  implements u
{
  private static void f(t paramt)
  {
    if (!paramt.getUseCompatPadding())
      paramt.e(0, 0, 0, 0);
    while (true)
    {
      return;
      float f1 = j(paramt).aqf;
      float f2 = j(paramt).aqc;
      int i = (int)Math.ceil(ar.d(f1, f2, paramt.getPreventCornerOverlap()));
      int j = (int)Math.ceil(ar.c(f1, f2, paramt.getPreventCornerOverlap()));
      paramt.e(i, j, i, j);
    }
  }

  private static aq j(t paramt)
  {
    return (aq)paramt.hR();
  }

  public final float a(t paramt)
  {
    return j(paramt).aqf;
  }

  public final void a(t paramt, float paramFloat)
  {
    paramt = j(paramt);
    if (paramFloat != paramt.aqc)
    {
      paramt.aqc = paramFloat;
      paramt.h(null);
      paramt.invalidateSelf();
    }
  }

  public final void a(t paramt, Context paramContext, ColorStateList paramColorStateList, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    paramt.l(new aq(paramColorStateList, paramFloat1));
    paramContext = paramt.hS();
    paramContext.setClipToOutline(true);
    paramContext.setElevation(paramFloat2);
    b(paramt, paramFloat3);
  }

  public final void a(t paramt, ColorStateList paramColorStateList)
  {
    paramt = j(paramt);
    paramt.e(paramColorStateList);
    paramt.invalidateSelf();
  }

  public final float b(t paramt)
  {
    return j(paramt).aqc * 2.0F;
  }

  public final void b(t paramt, float paramFloat)
  {
    j(paramt).a(paramFloat, paramt.getUseCompatPadding(), paramt.getPreventCornerOverlap());
    f(paramt);
  }

  public final float c(t paramt)
  {
    return j(paramt).aqc * 2.0F;
  }

  public final void c(t paramt, float paramFloat)
  {
    paramt.hS().setElevation(paramFloat);
  }

  public final float d(t paramt)
  {
    return j(paramt).aqc;
  }

  public final float e(t paramt)
  {
    return paramt.hS().getElevation();
  }

  public final void g(t paramt)
  {
    b(paramt, j(paramt).aqf);
  }

  public final void h(t paramt)
  {
    b(paramt, j(paramt).aqf);
  }

  public final void hT()
  {
  }

  public final ColorStateList i(t paramt)
  {
    return j(paramt).aqi;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.r
 * JD-Core Version:    0.6.2
 */