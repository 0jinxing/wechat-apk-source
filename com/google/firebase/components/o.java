package com.google.firebase.components;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashSet;
import java.util.Set;

final class o
{
  final a<?> bve;
  final Set<o> bvf;
  final Set<o> bvg;

  o(a<?> parama)
  {
    AppMethodBeat.i(10623);
    this.bvf = new HashSet();
    this.bvg = new HashSet();
    this.bve = parama;
    AppMethodBeat.o(10623);
  }

  final boolean uC()
  {
    AppMethodBeat.i(10624);
    boolean bool = this.bvg.isEmpty();
    AppMethodBeat.o(10624);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.firebase.components.o
 * JD-Core Version:    0.6.2
 */