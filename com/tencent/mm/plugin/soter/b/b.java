package com.tencent.mm.plugin.soter.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.k;
import com.tencent.mm.protocal.l.d;
import com.tencent.mm.protocal.l.e;

final class b extends k
{
  c.a rNC;
  c.b rND;

  b()
  {
    AppMethodBeat.i(59297);
    this.rNC = new c.a();
    this.rND = new c.b();
    AppMethodBeat.o(59297);
  }

  public final l.d ZR()
  {
    return this.rNC;
  }

  public final l.e ZS()
  {
    return this.rND;
  }

  public final int acC()
  {
    return 1;
  }

  public final int getType()
  {
    return 627;
  }

  public final String getUri()
  {
    return "/cgi-bin/micromsg-bin/updatesoteraskrsa";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.soter.b.b
 * JD-Core Version:    0.6.2
 */