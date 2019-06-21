package com.tencent.mm.plugin.performance.b;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$a
{
  int count;
  String name;

  public b$a(String paramString, int paramInt)
  {
    this.name = paramString;
    this.count = paramInt;
  }

  public final String toString()
  {
    AppMethodBeat.i(138543);
    String str = this.name + "=" + this.count;
    AppMethodBeat.o(138543);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.performance.b.b.a
 * JD-Core Version:    0.6.2
 */