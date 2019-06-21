package com.tencent.mm.booter;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.ae;
import com.tencent.mm.model.af;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ax;
import com.tencent.mm.sdk.platformtools.ax.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class a
  implements ae
{
  private static volatile a ebw;
  private List<af> callbacks;
  private ax ebu;
  private ax.a ebv;
  private c ebx;

  private a()
  {
    AppMethodBeat.i(77621);
    this.callbacks = new ArrayList();
    this.ebu = new ax();
    this.ebv = new a.1(this);
    this.ebu.a(this.ebv);
    this.ebu.gK(ah.getContext());
    if (this.ebx == null)
      this.ebx = new a.2(this);
    com.tencent.mm.sdk.b.a.xxA.c(this.ebx);
    AppMethodBeat.o(77621);
  }

  public static a Ib()
  {
    AppMethodBeat.i(77622);
    if (ebw == null);
    try
    {
      if (ebw == null)
      {
        locala = new com/tencent/mm/booter/a;
        locala.<init>();
        ebw = locala;
      }
      a locala = ebw;
      AppMethodBeat.o(77622);
      return locala;
    }
    finally
    {
      AppMethodBeat.o(77622);
    }
  }

  public final void Ic()
  {
    AppMethodBeat.i(77625);
    if (this.callbacks == null)
      AppMethodBeat.o(77625);
    while (true)
    {
      return;
      Iterator localIterator = this.callbacks.iterator();
      while (localIterator.hasNext())
        ((af)localIterator.next()).Zs();
      AppMethodBeat.o(77625);
    }
  }

  public final void Id()
  {
    AppMethodBeat.i(77626);
    if (this.callbacks == null)
      AppMethodBeat.o(77626);
    while (true)
    {
      return;
      Iterator localIterator = this.callbacks.iterator();
      while (localIterator.hasNext())
        ((af)localIterator.next()).Zt();
      AppMethodBeat.o(77626);
    }
  }

  public final void a(af paramaf)
  {
    AppMethodBeat.i(77623);
    ab.d("MicroMsg.BackgroundPlayer", "add callback : %s", new Object[] { paramaf.toString() });
    this.callbacks.add(paramaf);
    AppMethodBeat.o(77623);
  }

  public final void b(af paramaf)
  {
    AppMethodBeat.i(77624);
    this.callbacks.remove(paramaf);
    AppMethodBeat.o(77624);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.a
 * JD-Core Version:    0.6.2
 */