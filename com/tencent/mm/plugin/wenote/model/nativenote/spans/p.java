package com.tencent.mm.plugin.wenote.model.nativenote.spans;

import android.text.Spannable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.e;
import java.util.ArrayList;
import java.util.Iterator;

public final class p
{
  final ArrayList<a> uSf;

  public p()
  {
    AppMethodBeat.i(26961);
    this.uSf = new ArrayList();
    AppMethodBeat.o(26961);
  }

  private void a(Object paramObject, n paramn)
  {
    AppMethodBeat.i(26963);
    if ((paramObject instanceof f))
      this.uSf.add(new a(paramObject, paramn, true));
    AppMethodBeat.o(26963);
  }

  public final void a(ArrayList<Object> paramArrayList, n paramn)
  {
    AppMethodBeat.i(26962);
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
      a(paramArrayList.next(), paramn);
    AppMethodBeat.o(26962);
  }

  public final void b(Object paramObject, n paramn)
  {
    AppMethodBeat.i(26964);
    this.uSf.add(new a(paramObject, paramn, false));
    AppMethodBeat.o(26964);
  }

  public final void c(Spannable paramSpannable)
  {
    AppMethodBeat.i(26965);
    Iterator localIterator = this.uSf.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      f localf = locala.uSg;
      int i = locala.uSh.aqm;
      int j;
      if (locala.uSi)
      {
        j = paramSpannable.getSpanStart(localf);
        if ((j >= 0) && (j < i))
          paramSpannable.setSpan(localf.dfC(), j, i, 34);
        paramSpannable.removeSpan(localf);
      }
      else
      {
        n localn = locala.uSh;
        int k = locala.uSh.Ls;
        if ((localn.uRZ) && (localn.isEmpty()))
          j = 34;
        while (true)
        {
          int m = k;
          if (k > paramSpannable.length())
            m = paramSpannable.length();
          paramSpannable.setSpan(localf, i, m, j);
          break;
          if ((localn.uRZ) && (localn.uRY))
            j = 18;
          else if (localn.uRZ)
            j = 34;
          else
            j = 33;
        }
      }
    }
    AppMethodBeat.o(26965);
  }

  static final class a
  {
    final f uSg;
    final n uSh;
    final boolean uSi;

    a(Object paramObject, n paramn, boolean paramBoolean)
    {
      AppMethodBeat.i(26960);
      this.uSg = ((f)paramObject);
      this.uSh = paramn;
      this.uSi = paramBoolean;
      AppMethodBeat.o(26960);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.nativenote.spans.p
 * JD-Core Version:    0.6.2
 */