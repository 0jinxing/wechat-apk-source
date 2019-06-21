package android.support.v7.widget;

import android.database.Cursor;
import android.support.v4.widget.f;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

final class SearchView$10
  implements AdapterView.OnItemSelectedListener
{
  SearchView$10(SearchView paramSearchView)
  {
  }

  public final void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = this.ary;
    if ((paramAdapterView.ara == null) || (!paramAdapterView.ara.kO()))
    {
      paramView = paramAdapterView.aqC.getText();
      Object localObject = paramAdapterView.are.getCursor();
      if (localObject != null)
      {
        if (!((Cursor)localObject).moveToPosition(paramInt))
          break label88;
        localObject = paramAdapterView.are.convertToString((Cursor)localObject);
        if (localObject == null)
          break label80;
        paramAdapterView.setQuery((CharSequence)localObject);
      }
    }
    while (true)
    {
      return;
      label80: paramAdapterView.setQuery(paramView);
      continue;
      label88: paramAdapterView.setQuery(paramView);
    }
  }

  public final void onNothingSelected(AdapterView<?> paramAdapterView)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.SearchView.10
 * JD-Core Version:    0.6.2
 */