package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.s;
import android.support.v7.a.a.a;
import android.util.AttributeSet;
import android.view.View;

final class g
{
  private final i afj;
  private int afk = -1;
  private ba afl;
  private ba afm;
  private ba afn;
  private final View mView;

  g(View paramView)
  {
    this.mView = paramView;
    this.afj = i.hE();
  }

  private void d(ColorStateList paramColorStateList)
  {
    if (paramColorStateList != null)
    {
      if (this.afl == null)
        this.afl = new ba();
      this.afl.atC = paramColorStateList;
      this.afl.atE = true;
    }
    while (true)
    {
      hA();
      return;
      this.afl = null;
    }
  }

  private boolean hB()
  {
    boolean bool = true;
    int i = Build.VERSION.SDK_INT;
    if (i > 21)
      if (this.afl == null);
    while (true)
    {
      return bool;
      bool = false;
      continue;
      if (i != 21)
        bool = false;
    }
  }

  private boolean j(Drawable paramDrawable)
  {
    boolean bool = true;
    if (this.afn == null)
      this.afn = new ba();
    ba localba = this.afn;
    localba.clear();
    Object localObject = s.ao(this.mView);
    if (localObject != null)
    {
      localba.atE = true;
      localba.atC = ((ColorStateList)localObject);
    }
    localObject = s.ap(this.mView);
    if (localObject != null)
    {
      localba.atD = true;
      localba.vI = ((PorterDuff.Mode)localObject);
    }
    if ((localba.atE) || (localba.atD))
      i.a(paramDrawable, localba, this.mView.getDrawableState());
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  final void a(AttributeSet paramAttributeSet, int paramInt)
  {
    paramAttributeSet = bc.a(this.mView.getContext(), paramAttributeSet, a.a.ViewBackgroundHelper, paramInt, 0);
    try
    {
      if (paramAttributeSet.hasValue(0))
      {
        this.afk = paramAttributeSet.getResourceId(0, -1);
        ColorStateList localColorStateList = this.afj.o(this.mView.getContext(), this.afk);
        if (localColorStateList != null)
          d(localColorStateList);
      }
      if (paramAttributeSet.hasValue(1))
        s.a(this.mView, paramAttributeSet.getColorStateList(1));
      if (paramAttributeSet.hasValue(2))
        s.a(this.mView, aa.d(paramAttributeSet.getInt(2, -1), null));
      return;
    }
    finally
    {
      paramAttributeSet.atG.recycle();
    }
  }

  final void bD(int paramInt)
  {
    this.afk = paramInt;
    if (this.afj != null);
    for (ColorStateList localColorStateList = this.afj.o(this.mView.getContext(), paramInt); ; localColorStateList = null)
    {
      d(localColorStateList);
      hA();
      return;
    }
  }

  final ColorStateList getSupportBackgroundTintList()
  {
    if (this.afm != null);
    for (ColorStateList localColorStateList = this.afm.atC; ; localColorStateList = null)
      return localColorStateList;
  }

  final PorterDuff.Mode getSupportBackgroundTintMode()
  {
    if (this.afm != null);
    for (PorterDuff.Mode localMode = this.afm.vI; ; localMode = null)
      return localMode;
  }

  final void hA()
  {
    Drawable localDrawable = this.mView.getBackground();
    if ((localDrawable == null) || ((hB()) && (j(localDrawable))));
    while (true)
    {
      return;
      if (this.afm != null)
        i.a(localDrawable, this.afm, this.mView.getDrawableState());
      else if (this.afl != null)
        i.a(localDrawable, this.afl, this.mView.getDrawableState());
    }
  }

  final void hz()
  {
    this.afk = -1;
    d(null);
    hA();
  }

  final void setSupportBackgroundTintList(ColorStateList paramColorStateList)
  {
    if (this.afm == null)
      this.afm = new ba();
    this.afm.atC = paramColorStateList;
    this.afm.atE = true;
    hA();
  }

  final void setSupportBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    if (this.afm == null)
      this.afm = new ba();
    this.afm.vI = paramMode;
    this.afm.atD = true;
    hA();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.g
 * JD-Core Version:    0.6.2
 */