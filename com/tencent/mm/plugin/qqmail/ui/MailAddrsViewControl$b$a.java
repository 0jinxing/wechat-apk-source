package com.tencent.mm.plugin.qqmail.ui;

import android.widget.Filter;
import android.widget.Filter.FilterResults;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.qqmail.b.o;
import java.util.ArrayList;
import java.util.List;

final class MailAddrsViewControl$b$a extends Filter
{
  private MailAddrsViewControl$b$a(MailAddrsViewControl.b paramb)
  {
  }

  protected final Filter.FilterResults performFiltering(CharSequence arg1)
  {
    AppMethodBeat.i(68349);
    Filter.FilterResults localFilterResults = new Filter.FilterResults();
    if (MailAddrsViewControl.b.a(this.pyL) == null);
    Object localObject3;
    Object localObject4;
    synchronized (MailAddrsViewControl.b.b(this.pyL))
    {
      localObject3 = this.pyL;
      localObject4 = new java/util/ArrayList;
      ((ArrayList)localObject4).<init>(MailAddrsViewControl.b.c(this.pyL));
      MailAddrsViewControl.b.a((MailAddrsViewControl.b)localObject3, (ArrayList)localObject4);
      if (??? != null)
        if (???.length() != 0)
          break label146;
    }
    while (true)
    {
      synchronized (MailAddrsViewControl.b.b(this.pyL))
      {
        ??? = new java/util/ArrayList;
        ((ArrayList)???).<init>(MailAddrsViewControl.b.a(this.pyL));
        localFilterResults.values = ???;
        localFilterResults.count = ((ArrayList)???).size();
        AppMethodBeat.o(68349);
        return localFilterResults;
        ??? = finally;
        AppMethodBeat.o(68349);
        throw ???;
      }
      label146: localObject4 = ???.toString().toLowerCase();
      ??? = MailAddrsViewControl.b.a(this.pyL);
      int i = ???.size();
      localObject3 = new ArrayList(i);
      for (int j = 0; j < i; j++)
      {
        ??? = (o)???.get(j);
        if ((((o)???).name.toLowerCase().contains((CharSequence)localObject4)) || (((o)???).nJq.toLowerCase().contains((CharSequence)localObject4)))
          ((ArrayList)localObject3).add(???);
      }
      localObject1.values = localObject3;
      localObject1.count = ((ArrayList)localObject3).size();
    }
  }

  protected final void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults)
  {
    AppMethodBeat.i(68350);
    MailAddrsViewControl.b.a(this.pyL, (List)paramFilterResults.values);
    if (paramFilterResults.count > 0)
    {
      this.pyL.notifyDataSetChanged();
      AppMethodBeat.o(68350);
    }
    while (true)
    {
      return;
      MailAddrsViewControl.b.a(this.pyL, new ArrayList(MailAddrsViewControl.b.a(this.pyL)));
      this.pyL.notifyDataSetInvalidated();
      AppMethodBeat.o(68350);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.MailAddrsViewControl.b.a
 * JD-Core Version:    0.6.2
 */