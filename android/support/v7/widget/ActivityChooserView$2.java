package android.support.v7.widget;

import android.support.v4.view.b;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

final class ActivityChooserView$2
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  ActivityChooserView$2(ActivityChooserView paramActivityChooserView)
  {
  }

  public final void onGlobalLayout()
  {
    if (this.aeQ.hs())
    {
      if (this.aeQ.isShown())
        break label31;
      this.aeQ.getListPopupWindow().dismiss();
    }
    while (true)
    {
      return;
      label31: this.aeQ.getListPopupWindow().show();
      if (this.aeQ.aeJ != null)
        this.aeQ.aeJ.E(true);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.ActivityChooserView.2
 * JD-Core Version:    0.6.2
 */