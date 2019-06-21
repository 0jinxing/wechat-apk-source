package com.tencent.mm.ui.applet;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

final class b$c
{
  private LinkedList<String> eow;
  private int maxSize;

  public b$c(b paramb)
  {
    AppMethodBeat.i(106224);
    this.eow = null;
    this.maxSize = 40;
    this.eow = new LinkedList();
    AppMethodBeat.o(106224);
  }

  final boolean contains(String paramString)
  {
    AppMethodBeat.i(106226);
    boolean bool = this.eow.contains(paramString);
    AppMethodBeat.o(106226);
    return bool;
  }

  final void wy(String paramString)
  {
    AppMethodBeat.i(106225);
    if (this.eow.contains(paramString))
      AppMethodBeat.o(106225);
    while (true)
    {
      return;
      this.eow.add(paramString);
      if (this.eow.size() >= this.maxSize)
        this.eow.removeFirst();
      AppMethodBeat.o(106225);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.applet.b.c
 * JD-Core Version:    0.6.2
 */