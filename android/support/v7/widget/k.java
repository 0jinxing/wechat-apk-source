package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.support.v4.widget.l;
import android.support.v7.a.a.a;
import android.support.v7.c.a.b;
import android.util.AttributeSet;
import android.widget.ImageView;

public final class k
{
  private final ImageView afL;
  private ba afM;
  private ba afN;
  private ba afn;

  public k(ImageView paramImageView)
  {
    this.afL = paramImageView;
  }

  private boolean hB()
  {
    boolean bool = true;
    int i = Build.VERSION.SDK_INT;
    if (i > 21)
      if (this.afM == null);
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
    Object localObject = l.b(this.afL);
    if (localObject != null)
    {
      localba.atE = true;
      localba.atC = ((ColorStateList)localObject);
    }
    localObject = l.c(this.afL);
    if (localObject != null)
    {
      localba.atD = true;
      localba.vI = ((PorterDuff.Mode)localObject);
    }
    if ((localba.atE) || (localba.atD))
      i.a(paramDrawable, localba, this.afL.getDrawableState());
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final void a(AttributeSet paramAttributeSet, int paramInt)
  {
    bc localbc = bc.a(this.afL.getContext(), paramAttributeSet, a.a.AppCompatImageView, paramInt, 0);
    try
    {
      Drawable localDrawable = this.afL.getDrawable();
      paramAttributeSet = localDrawable;
      if (localDrawable == null)
      {
        paramInt = localbc.getResourceId(1, -1);
        paramAttributeSet = localDrawable;
        if (paramInt != -1)
        {
          localDrawable = b.g(this.afL.getContext(), paramInt);
          paramAttributeSet = localDrawable;
          if (localDrawable != null)
          {
            this.afL.setImageDrawable(localDrawable);
            paramAttributeSet = localDrawable;
          }
        }
      }
      if (paramAttributeSet != null)
        aa.n(paramAttributeSet);
      if (localbc.hasValue(2))
        l.a(this.afL, localbc.getColorStateList(2));
      if (localbc.hasValue(3))
        l.a(this.afL, aa.d(localbc.getInt(3, -1), null));
      return;
    }
    finally
    {
      localbc.atG.recycle();
    }
    throw paramAttributeSet;
  }

  final ColorStateList getSupportImageTintList()
  {
    if (this.afN != null);
    for (ColorStateList localColorStateList = this.afN.atC; ; localColorStateList = null)
      return localColorStateList;
  }

  final PorterDuff.Mode getSupportImageTintMode()
  {
    if (this.afN != null);
    for (PorterDuff.Mode localMode = this.afN.vI; ; localMode = null)
      return localMode;
  }

  final void hF()
  {
    Drawable localDrawable = this.afL.getDrawable();
    if (localDrawable != null)
      aa.n(localDrawable);
    if ((localDrawable == null) || ((hB()) && (j(localDrawable))));
    while (true)
    {
      return;
      if (this.afN != null)
        i.a(localDrawable, this.afN, this.afL.getDrawableState());
      else if (this.afM != null)
        i.a(localDrawable, this.afM, this.afL.getDrawableState());
    }
  }

  final boolean hasOverlappingRendering()
  {
    Drawable localDrawable = this.afL.getBackground();
    if ((Build.VERSION.SDK_INT >= 21) && ((localDrawable instanceof RippleDrawable)));
    for (boolean bool = false; ; bool = true)
      return bool;
  }

  public final void setImageResource(int paramInt)
  {
    if (paramInt != 0)
    {
      Drawable localDrawable = b.g(this.afL.getContext(), paramInt);
      if (localDrawable != null)
        aa.n(localDrawable);
      this.afL.setImageDrawable(localDrawable);
    }
    while (true)
    {
      hF();
      return;
      this.afL.setImageDrawable(null);
    }
  }

  final void setSupportImageTintList(ColorStateList paramColorStateList)
  {
    if (this.afN == null)
      this.afN = new ba();
    this.afN.atC = paramColorStateList;
    this.afN.atE = true;
    hF();
  }

  final void setSupportImageTintMode(PorterDuff.Mode paramMode)
  {
    if (this.afN == null)
      this.afN = new ba();
    this.afN.vI = paramMode;
    this.afN.atD = true;
    hF();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.k
 * JD-Core Version:    0.6.2
 */