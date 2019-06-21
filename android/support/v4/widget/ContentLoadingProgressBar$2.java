package android.support.v4.widget;

final class ContentLoadingProgressBar$2
  implements Runnable
{
  ContentLoadingProgressBar$2(ContentLoadingProgressBar paramContentLoadingProgressBar)
  {
  }

  public final void run()
  {
    this.PF.PC = false;
    if (!this.PF.mDismissed)
    {
      this.PF.mStartTime = System.currentTimeMillis();
      this.PF.setVisibility(0);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.ContentLoadingProgressBar.2
 * JD-Core Version:    0.6.2
 */