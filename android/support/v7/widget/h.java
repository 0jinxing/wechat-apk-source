package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.a.a.a;
import android.support.v4.widget.e;
import android.support.v7.a.a.a;
import android.support.v7.c.a.b;
import android.util.AttributeSet;
import android.widget.CompoundButton;

final class h
{
  private final CompoundButton afp;
  ColorStateList afq = null;
  PorterDuff.Mode afr = null;
  private boolean afs = false;
  private boolean aft = false;
  private boolean afu;

  h(CompoundButton paramCompoundButton)
  {
    this.afp = paramCompoundButton;
  }

  private void hD()
  {
    Drawable localDrawable = e.a(this.afp);
    if ((localDrawable != null) && ((this.afs) || (this.aft)))
    {
      localDrawable = a.f(localDrawable).mutate();
      if (this.afs)
        a.a(localDrawable, this.afq);
      if (this.aft)
        a.a(localDrawable, this.afr);
      if (localDrawable.isStateful())
        localDrawable.setState(this.afp.getDrawableState());
      this.afp.setButtonDrawable(localDrawable);
    }
  }

  final void a(AttributeSet paramAttributeSet, int paramInt)
  {
    TypedArray localTypedArray = this.afp.getContext().obtainStyledAttributes(paramAttributeSet, a.a.CompoundButton, paramInt, 0);
    try
    {
      if (localTypedArray.hasValue(0))
      {
        paramInt = localTypedArray.getResourceId(0, 0);
        if (paramInt != 0)
          this.afp.setButtonDrawable(b.g(this.afp.getContext(), paramInt));
      }
      if (localTypedArray.hasValue(1))
        e.a(this.afp, localTypedArray.getColorStateList(1));
      if (localTypedArray.hasValue(2))
        e.a(this.afp, aa.d(localTypedArray.getInt(2, -1), null));
      return;
    }
    finally
    {
      localTypedArray.recycle();
    }
    throw paramAttributeSet;
  }

  final int bE(int paramInt)
  {
    int i = paramInt;
    if (Build.VERSION.SDK_INT < 17)
    {
      Drawable localDrawable = e.a(this.afp);
      i = paramInt;
      if (localDrawable != null)
        i = paramInt + localDrawable.getIntrinsicWidth();
    }
    return i;
  }

  final void hC()
  {
    if (this.afu)
      this.afu = false;
    while (true)
    {
      return;
      this.afu = true;
      hD();
    }
  }

  final void setSupportButtonTintList(ColorStateList paramColorStateList)
  {
    this.afq = paramColorStateList;
    this.afs = true;
    hD();
  }

  final void setSupportButtonTintMode(PorterDuff.Mode paramMode)
  {
    this.afr = paramMode;
    this.aft = true;
    hD();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.h
 * JD-Core Version:    0.6.2
 */