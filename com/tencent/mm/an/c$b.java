package com.tencent.mm.an;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

final class c$b
  implements Serializable
{
  final List<c.d> fAB;
  final List<c.a> fAC;
  final List<c.a> fAD;
  final List<c.c> fAE;

  c$b()
  {
    AppMethodBeat.i(58339);
    this.fAB = new CopyOnWriteArrayList();
    this.fAC = new CopyOnWriteArrayList();
    this.fAD = new CopyOnWriteArrayList();
    this.fAE = new CopyOnWriteArrayList();
    AppMethodBeat.o(58339);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.an.c.b
 * JD-Core Version:    0.6.2
 */