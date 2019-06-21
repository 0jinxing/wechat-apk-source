package com.tencent.mm.plugin.account.ui;

import android.widget.Filter;
import android.widget.Filter.FilterResults;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

final class c$a extends Filter
{
  private c$a(c paramc)
  {
  }

  protected final Filter.FilterResults performFiltering(CharSequence arg1)
  {
    int i = 0;
    AppMethodBeat.i(124717);
    Filter.FilterResults localFilterResults = new Filter.FilterResults();
    if (c.a(this.gAq) == null);
    Object localObject3;
    Object localObject4;
    synchronized (c.b(this.gAq))
    {
      localObject3 = this.gAq;
      localObject4 = new java/util/ArrayList;
      ((ArrayList)localObject4).<init>(c.c(this.gAq));
      c.a((c)localObject3, (ArrayList)localObject4);
      if (??? != null)
        if (???.length() != 0)
          break label158;
    }
    synchronized (c.b(this.gAq))
    {
      ??? = new java/util/ArrayList;
      ((ArrayList)???).<init>(c.a(this.gAq));
      localFilterResults.values = ???;
      localFilterResults.count = ((ArrayList)???).size();
      AppMethodBeat.o(124717);
      return localFilterResults;
      ??? = finally;
      AppMethodBeat.o(124717);
      throw ???;
    }
    label158: String str = ???.toString().toLowerCase();
    ??? = "";
    if ((c.d(this.gAq) != null) && (c.d(this.gAq).length() > 0))
    {
      localObject3 = str.split(c.d(this.gAq));
      if ((localObject3 != null) && (localObject3.length > 1))
      {
        ??? = localObject3[0] + c.d(this.gAq);
        str = localObject3[1];
      }
    }
    while (true)
    {
      ArrayList localArrayList = c.a(this.gAq);
      int j = localArrayList.size();
      localObject3 = new ArrayList(j);
      while (i < j)
      {
        localObject4 = (String)localArrayList.get(i);
        if (((String)localObject4).toString().toLowerCase().startsWith(str))
          ((ArrayList)localObject3).add(??? + (String)localObject4);
        i++;
      }
      localFilterResults.values = localObject3;
      localFilterResults.count = ((ArrayList)localObject3).size();
      break;
    }
  }

  protected final void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults)
  {
    AppMethodBeat.i(124718);
    c.a(this.gAq, (List)paramFilterResults.values);
    if (paramFilterResults.count > 0)
    {
      this.gAq.notifyDataSetChanged();
      AppMethodBeat.o(124718);
    }
    while (true)
    {
      return;
      this.gAq.notifyDataSetInvalidated();
      AppMethodBeat.o(124718);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.c.a
 * JD-Core Version:    0.6.2
 */