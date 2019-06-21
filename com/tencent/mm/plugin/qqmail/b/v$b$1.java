package com.tencent.mm.plugin.qqmail.b;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class v$b$1
  implements Runnable
{
  v$b$1(v.b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(67993);
    if (v.b.a(this.puN) != null)
      v.b.a(this.puN).cancel();
    AppMethodBeat.o(67993);
  }

  public final String toString()
  {
    AppMethodBeat.i(67994);
    String str = super.toString() + "|onCancelled";
    AppMethodBeat.o(67994);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.b.v.b.1
 * JD-Core Version:    0.6.2
 */