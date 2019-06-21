package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v4.content.a.b.a;
import android.util.AttributeSet;
import android.util.TypedValue;

public final class bc
{
  private TypedValue afJ;
  public final TypedArray atG;
  private final Context mContext;

  private bc(Context paramContext, TypedArray paramTypedArray)
  {
    this.mContext = paramContext;
    this.atG = paramTypedArray;
  }

  public static bc a(Context paramContext, int paramInt, int[] paramArrayOfInt)
  {
    return new bc(paramContext, paramContext.obtainStyledAttributes(paramInt, paramArrayOfInt));
  }

  public static bc a(Context paramContext, AttributeSet paramAttributeSet, int[] paramArrayOfInt)
  {
    return new bc(paramContext, paramContext.obtainStyledAttributes(paramAttributeSet, paramArrayOfInt));
  }

  public static bc a(Context paramContext, AttributeSet paramAttributeSet, int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    return new bc(paramContext, paramContext.obtainStyledAttributes(paramAttributeSet, paramArrayOfInt, paramInt1, paramInt2));
  }

  public final Typeface a(int paramInt1, int paramInt2, b.a parama)
  {
    paramInt1 = this.atG.getResourceId(paramInt1, 0);
    if (paramInt1 == 0);
    for (parama = null; ; parama = android.support.v4.content.a.b.a(this.mContext, paramInt1, this.afJ, paramInt2, parama))
    {
      return parama;
      if (this.afJ == null)
        this.afJ = new TypedValue();
    }
  }

  public final Drawable cW(int paramInt)
  {
    if (this.atG.hasValue(paramInt))
    {
      paramInt = this.atG.getResourceId(paramInt, 0);
      if (paramInt == 0);
    }
    for (Drawable localDrawable = i.hE().a(this.mContext, paramInt, true); ; localDrawable = null)
      return localDrawable;
  }

  public final boolean getBoolean(int paramInt, boolean paramBoolean)
  {
    return this.atG.getBoolean(paramInt, paramBoolean);
  }

  public final int getColor(int paramInt1, int paramInt2)
  {
    return this.atG.getColor(paramInt1, paramInt2);
  }

  public final ColorStateList getColorStateList(int paramInt)
  {
    ColorStateList localColorStateList;
    if (this.atG.hasValue(paramInt))
    {
      int i = this.atG.getResourceId(paramInt, 0);
      if (i != 0)
      {
        localColorStateList = android.support.v7.c.a.b.h(this.mContext, i);
        if (localColorStateList == null);
      }
    }
    while (true)
    {
      return localColorStateList;
      localColorStateList = this.atG.getColorStateList(paramInt);
    }
  }

  public final int getDimensionPixelOffset(int paramInt1, int paramInt2)
  {
    return this.atG.getDimensionPixelOffset(paramInt1, paramInt2);
  }

  public final int getDimensionPixelSize(int paramInt1, int paramInt2)
  {
    return this.atG.getDimensionPixelSize(paramInt1, paramInt2);
  }

  public final Drawable getDrawable(int paramInt)
  {
    int i;
    if (this.atG.hasValue(paramInt))
    {
      i = this.atG.getResourceId(paramInt, 0);
      if (i == 0);
    }
    for (Drawable localDrawable = android.support.v7.c.a.b.g(this.mContext, i); ; localDrawable = this.atG.getDrawable(paramInt))
      return localDrawable;
  }

  public final float getFloat(int paramInt, float paramFloat)
  {
    return this.atG.getFloat(paramInt, paramFloat);
  }

  public final int getInt(int paramInt1, int paramInt2)
  {
    return this.atG.getInt(paramInt1, paramInt2);
  }

  public final int getInteger(int paramInt1, int paramInt2)
  {
    return this.atG.getInteger(paramInt1, paramInt2);
  }

  public final int getLayoutDimension(int paramInt1, int paramInt2)
  {
    return this.atG.getLayoutDimension(paramInt1, paramInt2);
  }

  public final int getResourceId(int paramInt1, int paramInt2)
  {
    return this.atG.getResourceId(paramInt1, paramInt2);
  }

  public final String getString(int paramInt)
  {
    return this.atG.getString(paramInt);
  }

  public final CharSequence getText(int paramInt)
  {
    return this.atG.getText(paramInt);
  }

  public final boolean hasValue(int paramInt)
  {
    return this.atG.hasValue(paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.bc
 * JD-Core Version:    0.6.2
 */