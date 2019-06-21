package com.tencent.mm.plugin.music.c;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$a
  implements Runnable
{
  int action;

  b$a(b paramb, int paramInt)
  {
    this.action = paramInt;
  }

  public final void run()
  {
    AppMethodBeat.i(137465);
    if (this.oLz.oLy != null)
      this.oLz.oLy.zD(this.action);
    AppMethodBeat.o(137465);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.c.b.a
 * JD-Core Version:    0.6.2
 */