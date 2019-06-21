package android.support.v4.widget;

import android.database.Cursor;
import android.widget.Filter;
import android.widget.Filter.FilterResults;

final class g extends Filter
{
  g.a PP;

  g(g.a parama)
  {
    this.PP = parama;
  }

  public final CharSequence convertResultToString(Object paramObject)
  {
    return this.PP.convertToString((Cursor)paramObject);
  }

  protected final Filter.FilterResults performFiltering(CharSequence paramCharSequence)
  {
    paramCharSequence = this.PP.runQueryOnBackgroundThread(paramCharSequence);
    Filter.FilterResults localFilterResults = new Filter.FilterResults();
    if (paramCharSequence != null)
      localFilterResults.count = paramCharSequence.getCount();
    for (localFilterResults.values = paramCharSequence; ; localFilterResults.values = null)
    {
      return localFilterResults;
      localFilterResults.count = 0;
    }
  }

  protected final void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults)
  {
    paramCharSequence = this.PP.getCursor();
    if ((paramFilterResults.values != null) && (paramFilterResults.values != paramCharSequence))
      this.PP.changeCursor((Cursor)paramFilterResults.values);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.g
 * JD-Core Version:    0.6.2
 */