package com.bumptech.glide.manager;

import com.bumptech.glide.h.j;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

final class a
  implements h
{
  private boolean aFV;
  private final Set<i> aGw;
  private boolean aGx;

  a()
  {
    AppMethodBeat.i(92371);
    this.aGw = Collections.newSetFromMap(new WeakHashMap());
    AppMethodBeat.o(92371);
  }

  public final void a(i parami)
  {
    AppMethodBeat.i(92372);
    this.aGw.add(parami);
    if (this.aGx)
    {
      parami.onDestroy();
      AppMethodBeat.o(92372);
    }
    while (true)
    {
      return;
      if (this.aFV)
      {
        parami.onStart();
        AppMethodBeat.o(92372);
      }
      else
      {
        parami.onStop();
        AppMethodBeat.o(92372);
      }
    }
  }

  public final void b(i parami)
  {
    AppMethodBeat.i(92373);
    this.aGw.remove(parami);
    AppMethodBeat.o(92373);
  }

  final void onDestroy()
  {
    AppMethodBeat.i(92376);
    this.aGx = true;
    Iterator localIterator = j.d(this.aGw).iterator();
    while (localIterator.hasNext())
      ((i)localIterator.next()).onDestroy();
    AppMethodBeat.o(92376);
  }

  final void onStart()
  {
    AppMethodBeat.i(92374);
    this.aFV = true;
    Iterator localIterator = j.d(this.aGw).iterator();
    while (localIterator.hasNext())
      ((i)localIterator.next()).onStart();
    AppMethodBeat.o(92374);
  }

  final void onStop()
  {
    AppMethodBeat.i(92375);
    this.aFV = false;
    Iterator localIterator = j.d(this.aGw).iterator();
    while (localIterator.hasNext())
      ((i)localIterator.next()).onStop();
    AppMethodBeat.o(92375);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.manager.a
 * JD-Core Version:    0.6.2
 */