package android.support.v4.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class ContentLoadingProgressBar extends ProgressBar
{
  boolean PB = false;
  boolean PC = false;
  private final Runnable PD = new ContentLoadingProgressBar.1(this);
  private final Runnable PE = new ContentLoadingProgressBar.2(this);
  boolean mDismissed = false;
  long mStartTime = -1L;

  public ContentLoadingProgressBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 0);
  }

  private void eD()
  {
    removeCallbacks(this.PD);
    removeCallbacks(this.PE);
  }

  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    eD();
  }

  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    eD();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.ContentLoadingProgressBar
 * JD-Core Version:    0.6.2
 */