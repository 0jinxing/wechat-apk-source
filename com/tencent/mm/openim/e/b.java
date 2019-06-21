package com.tencent.mm.openim.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.bo;

public final class b extends j<a>
{
  public static final String[] fnj;
  public h fni;

  static
  {
    AppMethodBeat.i(78984);
    fnj = new String[] { j.a(a.ccO, "OpenIMAccTypeInfo") };
    AppMethodBeat.o(78984);
  }

  public b(h paramh)
  {
    super(paramh, a.ccO, "OpenIMAccTypeInfo", null);
    this.fni = paramh;
  }

  public final boolean a(a parama)
  {
    AppMethodBeat.i(78982);
    parama.field_updateTime = bo.anT();
    boolean bool = super.a(parama);
    AppMethodBeat.o(78982);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.openim.e.b
 * JD-Core Version:    0.6.2
 */