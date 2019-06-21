package com.tencent.luggage.bridge;

import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.LinkedList;

public final class f
{
  private s bOo;
  LinkedList<e> bOp;
  boolean bOq;

  f(s params)
  {
    AppMethodBeat.i(90719);
    this.bOo = params;
    this.bOp = new LinkedList();
    this.bOq = false;
    AppMethodBeat.o(90719);
  }

  private void b(e parame)
  {
    AppMethodBeat.i(90721);
    this.bOo.by(String.format("luggageBridge._processMessageFromJava(%s);", new Object[] { parame.toString() }));
    AppMethodBeat.o(90721);
  }

  public final void a(e parame)
  {
    try
    {
      AppMethodBeat.i(90720);
      if (this.bOq)
      {
        b(parame);
        AppMethodBeat.o(90720);
      }
      while (true)
      {
        return;
        this.bOp.add(parame);
        AppMethodBeat.o(90720);
      }
    }
    finally
    {
    }
    throw parame;
  }

  final void wL()
  {
    try
    {
      AppMethodBeat.i(90722);
      d.i("Java2JsMessageQueue", "ready");
      this.bOq = true;
      Iterator localIterator = this.bOp.iterator();
      while (localIterator.hasNext())
        b((e)localIterator.next());
    }
    finally
    {
    }
    this.bOp.clear();
    AppMethodBeat.o(90722);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.bridge.f
 * JD-Core Version:    0.6.2
 */