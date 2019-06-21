package com.bumptech.glide.c.c;

import android.support.v4.f.k.a;
import com.bumptech.glide.c.a;
import com.bumptech.glide.c.a.d;
import com.bumptech.glide.c.a.d.a;
import com.bumptech.glide.c.b.p;
import com.bumptech.glide.g;
import com.bumptech.glide.h.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class q$a<Data>
  implements d<Data>, d.a<Data>
{
  private g aAk;
  private final List<d<Data>> aEw;
  private d.a<? super Data> aEx;
  private List<Throwable> aEy;
  private final k.a<List<Throwable>> awV;
  private int currentIndex;

  q$a(List<d<Data>> paramList, k.a<List<Throwable>> parama)
  {
    AppMethodBeat.i(92106);
    this.awV = parama;
    i.c(paramList);
    this.aEw = paramList;
    this.currentIndex = 0;
    AppMethodBeat.o(92106);
  }

  private void nj()
  {
    AppMethodBeat.i(92114);
    if (this.currentIndex < this.aEw.size() - 1)
    {
      this.currentIndex += 1;
      a(this.aAk, this.aEx);
      AppMethodBeat.o(92114);
    }
    while (true)
    {
      return;
      i.d(this.aEy, "Argument must not be null");
      this.aEx.b(new p("Fetch failed", new ArrayList(this.aEy)));
      AppMethodBeat.o(92114);
    }
  }

  public final void S(Data paramData)
  {
    AppMethodBeat.i(92112);
    if (paramData != null)
    {
      this.aEx.S(paramData);
      AppMethodBeat.o(92112);
    }
    while (true)
    {
      return;
      nj();
      AppMethodBeat.o(92112);
    }
  }

  public final void a(g paramg, d.a<? super Data> parama)
  {
    AppMethodBeat.i(92107);
    this.aAk = paramg;
    this.aEx = parama;
    this.aEy = ((List)this.awV.aA());
    ((d)this.aEw.get(this.currentIndex)).a(paramg, this);
    AppMethodBeat.o(92107);
  }

  public final void b(Exception paramException)
  {
    AppMethodBeat.i(92113);
    ((List)i.d(this.aEy, "Argument must not be null")).add(paramException);
    nj();
    AppMethodBeat.o(92113);
  }

  public final void cancel()
  {
    AppMethodBeat.i(92109);
    Iterator localIterator = this.aEw.iterator();
    while (localIterator.hasNext())
      ((d)localIterator.next()).cancel();
    AppMethodBeat.o(92109);
  }

  public final void cleanup()
  {
    AppMethodBeat.i(92108);
    if (this.aEy != null)
      this.awV.release(this.aEy);
    this.aEy = null;
    Iterator localIterator = this.aEw.iterator();
    while (localIterator.hasNext())
      ((d)localIterator.next()).cleanup();
    AppMethodBeat.o(92108);
  }

  public final Class<Data> mg()
  {
    AppMethodBeat.i(92110);
    Class localClass = ((d)this.aEw.get(0)).mg();
    AppMethodBeat.o(92110);
    return localClass;
  }

  public final a mh()
  {
    AppMethodBeat.i(92111);
    a locala = ((d)this.aEw.get(0)).mh();
    AppMethodBeat.o(92111);
    return locala;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.c.q.a
 * JD-Core Version:    0.6.2
 */