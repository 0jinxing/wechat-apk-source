package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.view.r;
import android.support.v7.c.a.b;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

public class AppCompatMultiAutoCompleteTextView extends MultiAutoCompleteTextView
  implements r
{
  private static final int[] aaV = { 16843126 };
  private final g afh;
  private final n afi;

  public AppCompatMultiAutoCompleteTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 2130772219);
  }

  public AppCompatMultiAutoCompleteTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(az.ad(paramContext), paramAttributeSet, paramInt);
    paramContext = bc.a(getContext(), paramAttributeSet, aaV, paramInt, 0);
    if (paramContext.hasValue(0))
      setDropDownBackgroundDrawable(paramContext.getDrawable(0));
    paramContext.atG.recycle();
    this.afh = new g(this);
    this.afh.a(paramAttributeSet, paramInt);
    this.afi = n.e(this);
    this.afi.a(paramAttributeSet, paramInt);
    this.afi.hI();
  }

  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    if (this.afh != null)
      this.afh.hA();
    if (this.afi != null)
      this.afi.hI();
  }

  public ColorStateList getSupportBackgroundTintList()
  {
    if (this.afh != null);
    for (ColorStateList localColorStateList = this.afh.getSupportBackgroundTintList(); ; localColorStateList = null)
      return localColorStateList;
  }

  public PorterDuff.Mode getSupportBackgroundTintMode()
  {
    if (this.afh != null);
    for (PorterDuff.Mode localMode = this.afh.getSupportBackgroundTintMode(); ; localMode = null)
      return localMode;
  }

  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    return j.a(super.onCreateInputConnection(paramEditorInfo), paramEditorInfo, this);
  }

  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    if (this.afh != null)
      this.afh.hz();
  }

  public void setBackgroundResource(int paramInt)
  {
    super.setBackgroundResource(paramInt);
    if (this.afh != null)
      this.afh.bD(paramInt);
  }

  public void setDropDownBackgroundResource(int paramInt)
  {
    setDropDownBackgroundDrawable(b.g(getContext(), paramInt));
  }

  public void setSupportBackgroundTintList(ColorStateList paramColorStateList)
  {
    if (this.afh != null)
      this.afh.setSupportBackgroundTintList(paramColorStateList);
  }

  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    if (this.afh != null)
      this.afh.setSupportBackgroundTintMode(paramMode);
  }

  public void setTextAppearance(Context paramContext, int paramInt)
  {
    super.setTextAppearance(paramContext, paramInt);
    if (this.afi != null)
      this.afi.r(paramContext, paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.AppCompatMultiAutoCompleteTextView
 * JD-Core Version:    0.6.2
 */