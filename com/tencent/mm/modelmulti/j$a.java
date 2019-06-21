package com.tencent.mm.modelmulti;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.k;
import com.tencent.mm.protocal.l.d;
import com.tencent.mm.protocal.l.e;
import com.tencent.mm.protocal.t.a;
import com.tencent.mm.protocal.t.b;

public final class j$a extends k
{
  private final t.a fHQ;
  private final t.b fHR;
  private final boolean fHS;

  public j$a()
  {
    AppMethodBeat.i(58382);
    this.fHQ = new t.a();
    this.fHR = new t.b();
    this.fHS = false;
    AppMethodBeat.o(58382);
  }

  public j$a(t.b paramb)
  {
    AppMethodBeat.i(58383);
    this.fHQ = new t.a();
    this.fHR = paramb;
    this.fHS = true;
    AppMethodBeat.o(58383);
  }

  public final l.d ZR()
  {
    return this.fHQ;
  }

  public final l.e ZS()
  {
    return this.fHR;
  }

  public final int getType()
  {
    return 138;
  }

  public final String getUri()
  {
    return "/cgi-bin/micromsg-bin/newsync";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelmulti.j.a
 * JD-Core Version:    0.6.2
 */