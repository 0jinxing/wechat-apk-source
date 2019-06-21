package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.view.r;
import android.support.v4.widget.b;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;

public class AppCompatTextView extends TextView
  implements r, b
{
  private final g afh = new g(this);
  private final n afi;

  public AppCompatTextView(Context paramContext)
  {
    this(paramContext, null);
  }

  public AppCompatTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16842884);
  }

  public AppCompatTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(az.ad(paramContext), paramAttributeSet, paramInt);
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

  public int getAutoSizeMaxTextSize()
  {
    int i;
    if (OV)
      i = super.getAutoSizeMaxTextSize();
    while (true)
    {
      return i;
      if (this.afi != null)
        i = Math.round(this.afi.agt.agG);
      else
        i = -1;
    }
  }

  public int getAutoSizeMinTextSize()
  {
    int i;
    if (OV)
      i = super.getAutoSizeMinTextSize();
    while (true)
    {
      return i;
      if (this.afi != null)
        i = Math.round(this.afi.agt.agF);
      else
        i = -1;
    }
  }

  public int getAutoSizeStepGranularity()
  {
    int i;
    if (OV)
      i = super.getAutoSizeStepGranularity();
    while (true)
    {
      return i;
      if (this.afi != null)
        i = Math.round(this.afi.agt.agE);
      else
        i = -1;
    }
  }

  public int[] getAutoSizeTextAvailableSizes()
  {
    int[] arrayOfInt;
    if (OV)
      arrayOfInt = super.getAutoSizeTextAvailableSizes();
    while (true)
    {
      return arrayOfInt;
      if (this.afi != null)
        arrayOfInt = this.afi.agt.agH;
      else
        arrayOfInt = new int[0];
    }
  }

  public int getAutoSizeTextType()
  {
    int i = 1;
    if (OV)
      if (super.getAutoSizeTextType() != 1);
    while (true)
    {
      return i;
      i = 0;
      continue;
      if (this.afi != null)
        i = this.afi.agt.agC;
      else
        i = 0;
    }
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

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.afi != null)
      this.afi.hJ();
  }

  protected void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    super.onTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
    if ((this.afi != null) && (!OV) && (this.afi.agt.hO()))
      this.afi.agt.hM();
  }

  public void setAutoSizeTextTypeUniformWithConfiguration(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (OV)
      super.setAutoSizeTextTypeUniformWithConfiguration(paramInt1, paramInt2, paramInt3, paramInt4);
    while (true)
    {
      return;
      if (this.afi != null)
        this.afi.setAutoSizeTextTypeUniformWithConfiguration(paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }

  public void setAutoSizeTextTypeUniformWithPresetSizes(int[] paramArrayOfInt, int paramInt)
  {
    if (OV)
      super.setAutoSizeTextTypeUniformWithPresetSizes(paramArrayOfInt, paramInt);
    while (true)
    {
      return;
      if (this.afi != null)
        this.afi.setAutoSizeTextTypeUniformWithPresetSizes(paramArrayOfInt, paramInt);
    }
  }

  public void setAutoSizeTextTypeWithDefaults(int paramInt)
  {
    if (OV)
      super.setAutoSizeTextTypeWithDefaults(paramInt);
    while (true)
    {
      return;
      if (this.afi != null)
        this.afi.setAutoSizeTextTypeWithDefaults(paramInt);
    }
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

  public void setTextSize(int paramInt, float paramFloat)
  {
    if (OV)
      super.setTextSize(paramInt, paramFloat);
    while (true)
    {
      return;
      if (this.afi != null)
        this.afi.setTextSize(paramInt, paramFloat);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.AppCompatTextView
 * JD-Core Version:    0.6.2
 */