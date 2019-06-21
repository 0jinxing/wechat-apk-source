package android.support.v4.view;

import android.database.DataSetObserver;

final class ViewPager$e extends DataSetObserver
{
  ViewPager$e(ViewPager paramViewPager)
  {
  }

  public final void onChanged()
  {
    this.Np.dataSetChanged();
  }

  public final void onInvalidated()
  {
    this.Np.dataSetChanged();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.view.ViewPager.e
 * JD-Core Version:    0.6.2
 */