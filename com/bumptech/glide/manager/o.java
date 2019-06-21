package com.bumptech.glide.manager;

import com.bumptech.glide.f.a.e;
import com.bumptech.glide.h.j;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

public final class o
  implements i
{
  public final Set<e<?>> aGW;

  public o()
  {
    AppMethodBeat.i(92421);
    this.aGW = Collections.newSetFromMap(new WeakHashMap());
    AppMethodBeat.o(92421);
  }

  public final void f(e<?> parame)
  {
    AppMethodBeat.i(92422);
    this.aGW.remove(parame);
    AppMethodBeat.o(92422);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(92425);
    Iterator localIterator = j.d(this.aGW).iterator();
    while (localIterator.hasNext())
      ((e)localIterator.next()).onDestroy();
    AppMethodBeat.o(92425);
  }

  public final void onStart()
  {
    AppMethodBeat.i(92423);
    Iterator localIterator = j.d(this.aGW).iterator();
    while (localIterator.hasNext())
      ((e)localIterator.next()).onStart();
    AppMethodBeat.o(92423);
  }

  public final void onStop()
  {
    AppMethodBeat.i(92424);
    Iterator localIterator = j.d(this.aGW).iterator();
    while (localIterator.hasNext())
      ((e)localIterator.next()).onStop();
    AppMethodBeat.o(92424);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.manager.o
 * JD-Core Version:    0.6.2
 */