package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v4.view.r;
import android.support.v4.widget.s;
import android.util.AttributeSet;
import android.widget.ImageButton;

public class AppCompatImageButton extends ImageButton
  implements r, s
{
  private final g afh = new g(this);
  private final k qk;

  public AppCompatImageButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 2130772182);
  }

  public AppCompatImageButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(az.ad(paramContext), paramAttributeSet, paramInt);
    this.afh.a(paramAttributeSet, paramInt);
    this.qk = new k(this);
    this.qk.a(paramAttributeSet, paramInt);
  }

  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    if (this.afh != null)
      this.afh.hA();
    if (this.qk != null)
      this.qk.hF();
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

  public ColorStateList getSupportImageTintList()
  {
    if (this.qk != null);
    for (ColorStateList localColorStateList = this.qk.getSupportImageTintList(); ; localColorStateList = null)
      return localColorStateList;
  }

  public PorterDuff.Mode getSupportImageTintMode()
  {
    if (this.qk != null);
    for (PorterDuff.Mode localMode = this.qk.getSupportImageTintMode(); ; localMode = null)
      return localMode;
  }

  public boolean hasOverlappingRendering()
  {
    if ((this.qk.hasOverlappingRendering()) && (super.hasOverlappingRendering()));
    for (boolean bool = true; ; bool = false)
      return bool;
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

  public void setImageBitmap(Bitmap paramBitmap)
  {
    super.setImageBitmap(paramBitmap);
    if (this.qk != null)
      this.qk.hF();
  }

  public void setImageDrawable(Drawable paramDrawable)
  {
    super.setImageDrawable(paramDrawable);
    if (this.qk != null)
      this.qk.hF();
  }

  public void setImageResource(int paramInt)
  {
    this.qk.setImageResource(paramInt);
  }

  public void setImageURI(Uri paramUri)
  {
    super.setImageURI(paramUri);
    if (this.qk != null)
      this.qk.hF();
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

  public void setSupportImageTintList(ColorStateList paramColorStateList)
  {
    if (this.qk != null)
      this.qk.setSupportImageTintList(paramColorStateList);
  }

  public void setSupportImageTintMode(PorterDuff.Mode paramMode)
  {
    if (this.qk != null)
      this.qk.setSupportImageTintMode(paramMode);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.AppCompatImageButton
 * JD-Core Version:    0.6.2
 */