package com.tencent.luggage.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class f$a<E> extends LinkedList<E>
{
  private f$a(f paramf)
  {
  }

  public final void add(int paramInt, E paramE)
  {
    AppMethodBeat.i(90788);
    super.add(paramInt, paramE);
    this.bPt.xf();
    AppMethodBeat.o(90788);
  }

  public final boolean add(E paramE)
  {
    AppMethodBeat.i(90787);
    boolean bool = super.add(paramE);
    if (bool)
      this.bPt.xf();
    AppMethodBeat.o(90787);
    return bool;
  }

  public final E pop()
  {
    AppMethodBeat.i(90785);
    Object localObject = super.pop();
    this.bPt.xg();
    AppMethodBeat.o(90785);
    return localObject;
  }

  public final void push(E paramE)
  {
    AppMethodBeat.i(90786);
    super.push(paramE);
    this.bPt.xf();
    AppMethodBeat.o(90786);
  }

  public final E remove(int paramInt)
  {
    AppMethodBeat.i(90784);
    Object localObject = super.remove(paramInt);
    this.bPt.xg();
    AppMethodBeat.o(90784);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.d.f.a
 * JD-Core Version:    0.6.2
 */