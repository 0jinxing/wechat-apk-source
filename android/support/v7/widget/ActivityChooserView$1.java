package android.support.v7.widget;

import android.database.DataSetObserver;

final class ActivityChooserView$1 extends DataSetObserver
{
  ActivityChooserView$1(ActivityChooserView paramActivityChooserView)
  {
  }

  public final void onChanged()
  {
    super.onChanged();
    this.aeQ.aeA.notifyDataSetChanged();
  }

  public final void onInvalidated()
  {
    super.onInvalidated();
    this.aeQ.aeA.notifyDataSetInvalidated();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.ActivityChooserView.1
 * JD-Core Version:    0.6.2
 */