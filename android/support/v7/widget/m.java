package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.a.a.a;
import android.support.v4.view.s;
import android.support.v7.a.a.a;
import android.util.AttributeSet;
import android.widget.SeekBar;

final class m extends l
{
  final SeekBar afU;
  Drawable afV;
  private ColorStateList afW = null;
  private PorterDuff.Mode afX = null;
  private boolean afY = false;
  private boolean afZ = false;

  m(SeekBar paramSeekBar)
  {
    super(paramSeekBar);
    this.afU = paramSeekBar;
  }

  private void hG()
  {
    if ((this.afV != null) && ((this.afY) || (this.afZ)))
    {
      this.afV = a.f(this.afV.mutate());
      if (this.afY)
        a.a(this.afV, this.afW);
      if (this.afZ)
        a.a(this.afV, this.afX);
      if (this.afV.isStateful())
        this.afV.setState(this.afU.getDrawableState());
    }
  }

  final void a(AttributeSet paramAttributeSet, int paramInt)
  {
    super.a(paramAttributeSet, paramInt);
    paramAttributeSet = bc.a(this.afU.getContext(), paramAttributeSet, a.a.AppCompatSeekBar, paramInt, 0);
    Drawable localDrawable = paramAttributeSet.cW(0);
    if (localDrawable != null)
      this.afU.setThumb(localDrawable);
    localDrawable = paramAttributeSet.getDrawable(1);
    if (this.afV != null)
      this.afV.setCallback(null);
    this.afV = localDrawable;
    if (localDrawable != null)
    {
      localDrawable.setCallback(this.afU);
      a.b(localDrawable, s.T(this.afU));
      if (localDrawable.isStateful())
        localDrawable.setState(this.afU.getDrawableState());
      hG();
    }
    this.afU.invalidate();
    if (paramAttributeSet.hasValue(3))
    {
      this.afX = aa.d(paramAttributeSet.getInt(3, -1), this.afX);
      this.afZ = true;
    }
    if (paramAttributeSet.hasValue(2))
    {
      this.afW = paramAttributeSet.getColorStateList(2);
      this.afY = true;
    }
    paramAttributeSet.atG.recycle();
    hG();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.m
 * JD-Core Version:    0.6.2
 */