package com.tencent.mm.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashSet;
import java.util.Set;

public final class cc
{
  public Set<a> fnN;
  public boolean isRunning;

  public cc()
  {
    AppMethodBeat.i(58142);
    this.isRunning = false;
    this.fnN = new HashSet();
    AppMethodBeat.o(58142);
  }

  public final boolean a(a parama)
  {
    AppMethodBeat.i(58143);
    boolean bool;
    if (this.isRunning)
    {
      ab.e("MicroMsg.UninitForUEH", "add , is running , forbid add");
      bool = false;
      AppMethodBeat.o(58143);
    }
    while (true)
    {
      return bool;
      bool = this.fnN.add(parama);
      AppMethodBeat.o(58143);
    }
  }

  public final boolean b(a parama)
  {
    AppMethodBeat.i(58144);
    boolean bool;
    if (this.isRunning)
    {
      ab.e("MicroMsg.UninitForUEH", "remove , is running , forbid remove");
      bool = false;
      AppMethodBeat.o(58144);
    }
    while (true)
    {
      return bool;
      bool = this.fnN.remove(parama);
      AppMethodBeat.o(58144);
    }
  }

  public static abstract interface a
  {
    public abstract boolean aaG();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.cc
 * JD-Core Version:    0.6.2
 */