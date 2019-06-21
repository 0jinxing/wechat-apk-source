package com.tencent.mm.az;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.k;
import com.tencent.mm.protocal.l.d;
import com.tencent.mm.protocal.l.e;

public final class b$a extends k
{
  private final b.b fLt;
  public final b.c fLu;

  public b$a()
  {
    AppMethodBeat.i(59986);
    this.fLt = new b.b();
    this.fLu = new b.c();
    AppMethodBeat.o(59986);
  }

  public final l.d ZR()
  {
    return this.fLt;
  }

  public final l.e ZS()
  {
    return this.fLu;
  }

  public final int getType()
  {
    return 681;
  }

  public final String getUri()
  {
    return "/cgi-bin/micromsg-bin/oplog";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.az.b.a
 * JD-Core Version:    0.6.2
 */