package android.support.design.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

class VisibilityAwareImageButton extends ImageButton
{
  private int uf = getVisibility();

  public VisibilityAwareImageButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public VisibilityAwareImageButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  final int getUserSetVisibility()
  {
    return this.uf;
  }

  final void j(int paramInt, boolean paramBoolean)
  {
    super.setVisibility(paramInt);
    if (paramBoolean)
      this.uf = paramInt;
  }

  public void setVisibility(int paramInt)
  {
    j(paramInt, true);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.design.widget.VisibilityAwareImageButton
 * JD-Core Version:    0.6.2
 */