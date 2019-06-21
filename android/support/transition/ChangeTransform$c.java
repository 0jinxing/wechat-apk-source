package android.support.transition;

import android.support.v4.view.s;
import android.view.View;

final class ChangeTransform$c
{
  final float mScaleX;
  final float mScaleY;
  final float yi;
  final float yj;
  final float yk;
  final float yl;
  final float ym;
  final float yn;

  ChangeTransform$c(View paramView)
  {
    this.yi = paramView.getTranslationX();
    this.yj = paramView.getTranslationY();
    this.yk = s.ah(paramView);
    this.mScaleX = paramView.getScaleX();
    this.mScaleY = paramView.getScaleY();
    this.yl = paramView.getRotationX();
    this.ym = paramView.getRotationY();
    this.yn = paramView.getRotation();
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2;
    if (!(paramObject instanceof c))
      bool2 = bool1;
    while (true)
    {
      return bool2;
      paramObject = (c)paramObject;
      bool2 = bool1;
      if (paramObject.yi == this.yi)
      {
        bool2 = bool1;
        if (paramObject.yj == this.yj)
        {
          bool2 = bool1;
          if (paramObject.yk == this.yk)
          {
            bool2 = bool1;
            if (paramObject.mScaleX == this.mScaleX)
            {
              bool2 = bool1;
              if (paramObject.mScaleY == this.mScaleY)
              {
                bool2 = bool1;
                if (paramObject.yl == this.yl)
                {
                  bool2 = bool1;
                  if (paramObject.ym == this.ym)
                  {
                    bool2 = bool1;
                    if (paramObject.yn == this.yn)
                      bool2 = true;
                  }
                }
              }
            }
          }
        }
      }
    }
  }

  public final int hashCode()
  {
    int i = 0;
    int j;
    int k;
    label36: int m;
    label54: int n;
    label72: int i1;
    label90: int i2;
    if (this.yi != 0.0F)
    {
      j = Float.floatToIntBits(this.yi);
      if (this.yj == 0.0F)
        break label190;
      k = Float.floatToIntBits(this.yj);
      if (this.yk == 0.0F)
        break label195;
      m = Float.floatToIntBits(this.yk);
      if (this.mScaleX == 0.0F)
        break label201;
      n = Float.floatToIntBits(this.mScaleX);
      if (this.mScaleY == 0.0F)
        break label207;
      i1 = Float.floatToIntBits(this.mScaleY);
      if (this.yl == 0.0F)
        break label213;
      i2 = Float.floatToIntBits(this.yl);
      label108: if (this.ym == 0.0F)
        break label219;
    }
    label190: label195: label201: label207: label213: label219: for (int i3 = Float.floatToIntBits(this.ym); ; i3 = 0)
    {
      if (this.yn != 0.0F)
        i = Float.floatToIntBits(this.yn);
      return (i3 + (i2 + (i1 + (n + (m + (k + j * 31) * 31) * 31) * 31) * 31) * 31) * 31 + i;
      j = 0;
      break;
      k = 0;
      break label36;
      m = 0;
      break label54;
      n = 0;
      break label72;
      i1 = 0;
      break label90;
      i2 = 0;
      break label108;
    }
  }

  public final void y(View paramView)
  {
    ChangeTransform.b(paramView, this.yi, this.yj, this.yk, this.mScaleX, this.mScaleY, this.yl, this.ym, this.yn);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.transition.ChangeTransform.c
 * JD-Core Version:    0.6.2
 */