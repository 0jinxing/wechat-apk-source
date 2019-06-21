package com.tencent.mm.plugin.game.commlib.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.LinkedList;

public final class a
{
  private static LinkedList<b> ilQ;

  static
  {
    AppMethodBeat.i(59423);
    ilQ = new LinkedList();
    AppMethodBeat.o(59423);
  }

  public static void a(b paramb)
  {
    AppMethodBeat.i(59421);
    ilQ.add(paramb);
    AppMethodBeat.o(59421);
  }

  public static void bny()
  {
    AppMethodBeat.i(59422);
    Iterator localIterator = ilQ.iterator();
    while (localIterator.hasNext())
      ((b)localIterator.next()).Pi();
    AppMethodBeat.o(59422);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.commlib.c.a
 * JD-Core Version:    0.6.2
 */