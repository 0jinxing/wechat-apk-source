package com.tencent.mm.plugin.appbrand.j;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.appbrand.s;

public final class b
{
  public static final class a extends a.c
  {
    private final o gOq;

    private a(o paramo)
    {
      this.gOq = paramo;
    }

    public final void a(String paramString, boolean paramBoolean, a.b paramb, a.a parama)
    {
      AppMethodBeat.i(132306);
      this.gOq.atK().xd("__APP__");
      super.a(paramString, paramBoolean, paramb, parama);
      AppMethodBeat.o(132306);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.j.b
 * JD-Core Version:    0.6.2
 */