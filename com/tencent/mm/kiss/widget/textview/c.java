package com.tencent.mm.kiss.widget.textview;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kiss.widget.textview.a.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public final class c
{
  public static c eNj;
  public ConcurrentHashMap<Integer, b> eNk;

  static
  {
    AppMethodBeat.i(105699);
    eNj = new c();
    AppMethodBeat.o(105699);
  }

  public c()
  {
    AppMethodBeat.i(105694);
    this.eNk = new ConcurrentHashMap();
    AppMethodBeat.o(105694);
  }

  public static int a(a parama)
  {
    AppMethodBeat.i(105698);
    int i = parama.hashCode();
    AppMethodBeat.o(105698);
    return i;
  }

  public final void SN()
  {
    AppMethodBeat.i(105697);
    Iterator localIterator = this.eNk.values().iterator();
    while (localIterator.hasNext())
      ((b)localIterator.next()).eNi.clear();
    this.eNk.clear();
    AppMethodBeat.o(105697);
  }

  public final f a(a parama, CharSequence paramCharSequence)
  {
    AppMethodBeat.i(105696);
    if (parama != null)
    {
      parama = (b)this.eNk.get(Integer.valueOf(parama.hashCode()));
      if (parama != null)
      {
        parama = parama.u(paramCharSequence);
        AppMethodBeat.o(105696);
      }
    }
    while (true)
    {
      return parama;
      parama = null;
      AppMethodBeat.o(105696);
    }
  }

  public final void a(a parama, f paramf)
  {
    AppMethodBeat.i(105695);
    if (parama == null)
      AppMethodBeat.o(105695);
    while (true)
    {
      return;
      b localb = (b)this.eNk.get(Integer.valueOf(parama.hashCode()));
      if (localb != null)
      {
        localb.a(paramf);
        this.eNk.put(Integer.valueOf(parama.hashCode()), localb);
        AppMethodBeat.o(105695);
      }
      else
      {
        localb = new b();
        localb.a(paramf);
        this.eNk.put(Integer.valueOf(parama.hashCode()), localb);
        AppMethodBeat.o(105695);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.kiss.widget.textview.c
 * JD-Core Version:    0.6.2
 */