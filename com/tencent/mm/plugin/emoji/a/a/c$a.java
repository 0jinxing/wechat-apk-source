package com.tencent.mm.plugin.emoji.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;

final class c$a
  implements Iterator<f>
{
  private int mIndex = 0;

  private c$a(c paramc)
  {
  }

  public final boolean hasNext()
  {
    AppMethodBeat.i(52776);
    boolean bool;
    if (this.mIndex < this.kSZ.size())
    {
      bool = true;
      AppMethodBeat.o(52776);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(52776);
    }
  }

  public final void remove()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.a.a.c.a
 * JD-Core Version:    0.6.2
 */