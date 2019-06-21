package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.r;
import android.support.v7.c.a.b;
import android.util.AttributeSet;
import android.widget.CheckBox;

public class AppCompatCheckBox extends CheckBox
  implements r
{
  private final h afo = new h(this);

  public AppCompatCheckBox(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 2130772222);
  }

  public AppCompatCheckBox(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(az.ad(paramContext), paramAttributeSet, paramInt);
    this.afo.a(paramAttributeSet, paramInt);
  }

  public int getCompoundPaddingLeft()
  {
    int i = super.getCompoundPaddingLeft();
    int j = i;
    if (this.afo != null)
      j = this.afo.bE(i);
    return j;
  }

  public ColorStateList getSupportButtonTintList()
  {
    if (this.afo != null);
    for (ColorStateList localColorStateList = this.afo.afq; ; localColorStateList = null)
      return localColorStateList;
  }

  public PorterDuff.Mode getSupportButtonTintMode()
  {
    if (this.afo != null);
    for (PorterDuff.Mode localMode = this.afo.afr; ; localMode = null)
      return localMode;
  }

  public void setButtonDrawable(int paramInt)
  {
    setButtonDrawable(b.g(getContext(), paramInt));
  }

  public void setButtonDrawable(Drawable paramDrawable)
  {
    super.setButtonDrawable(paramDrawable);
    if (this.afo != null)
      this.afo.hC();
  }

  public void setSupportButtonTintList(ColorStateList paramColorStateList)
  {
    if (this.afo != null)
      this.afo.setSupportButtonTintList(paramColorStateList);
  }

  public void setSupportButtonTintMode(PorterDuff.Mode paramMode)
  {
    if (this.afo != null)
      this.afo.setSupportButtonTintMode(paramMode);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.AppCompatCheckBox
 * JD-Core Version:    0.6.2
 */