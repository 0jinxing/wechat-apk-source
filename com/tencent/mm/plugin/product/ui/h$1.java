package com.tencent.mm.plugin.product.ui;

import android.widget.Filter;
import android.widget.Filter.FilterResults;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class h$1 extends Filter
{
  h$1(h paramh)
  {
  }

  protected final Filter.FilterResults performFiltering(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(44084);
    Filter.FilterResults localFilterResults = new Filter.FilterResults();
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = h.a(this.piZ).iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if ((str != null) && (paramCharSequence != null) && (str.contains(paramCharSequence)))
        localArrayList.add(str);
    }
    localFilterResults.values = localArrayList;
    localFilterResults.count = localArrayList.size();
    AppMethodBeat.o(44084);
    return localFilterResults;
  }

  protected final void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults)
  {
    try
    {
      AppMethodBeat.i(44083);
      h.a(this.piZ, (List)paramFilterResults.values);
      this.piZ.notifyDataSetChanged();
      AppMethodBeat.o(44083);
      return;
    }
    finally
    {
      paramCharSequence = finally;
    }
    throw paramCharSequence;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.h.1
 * JD-Core Version:    0.6.2
 */