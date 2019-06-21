package android.support.v4.widget;

import android.database.DataSetObserver;

final class f$b extends DataSetObserver
{
  f$b(f paramf)
  {
  }

  public final void onChanged()
  {
    this.PO.PG = true;
    this.PO.notifyDataSetChanged();
  }

  public final void onInvalidated()
  {
    this.PO.PG = false;
    this.PO.notifyDataSetInvalidated();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.f.b
 * JD-Core Version:    0.6.2
 */