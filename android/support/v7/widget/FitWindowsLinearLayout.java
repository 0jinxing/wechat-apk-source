package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class FitWindowsLinearLayout extends LinearLayout
  implements ad
{
  private ad.a aiK;

  public FitWindowsLinearLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  protected boolean fitSystemWindows(Rect paramRect)
  {
    if (this.aiK != null)
      this.aiK.f(paramRect);
    return super.fitSystemWindows(paramRect);
  }

  public void setOnFitSystemWindowsListener(ad.a parama)
  {
    this.aiK = parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.FitWindowsLinearLayout
 * JD-Core Version:    0.6.2
 */