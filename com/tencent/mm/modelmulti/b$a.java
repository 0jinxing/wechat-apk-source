package com.tencent.mm.modelmulti;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.d;
import com.tencent.mm.protocal.l.d;
import com.tencent.mm.protocal.l.e;
import com.tencent.mm.protocal.t.a;
import com.tencent.mm.protocal.t.b;

public final class b$a
  implements com.tencent.mm.network.q
{
  private final t.a fHQ;
  private final t.b fHR;
  private final boolean fHS;
  int uin;

  public b$a()
  {
    AppMethodBeat.i(58349);
    this.fHQ = new t.a();
    this.fHR = new t.b();
    this.fHS = false;
    AppMethodBeat.o(58349);
  }

  public b$a(t.b paramb)
  {
    AppMethodBeat.i(58350);
    this.fHQ = new t.a();
    this.fHR = paramb;
    this.fHS = true;
    AppMethodBeat.o(58350);
  }

  public final l.e ZS()
  {
    return this.fHR;
  }

  public final int acB()
  {
    return 0;
  }

  public final int acC()
  {
    return 0;
  }

  public final l.d acF()
  {
    AppMethodBeat.i(58351);
    this.fHQ.vye = com.tencent.mm.compatible.e.q.LM();
    this.fHQ.vyd = d.eSg;
    this.fHQ.vyc = d.vxo;
    this.fHQ.hB(this.uin);
    t.a locala = this.fHQ;
    AppMethodBeat.o(58351);
    return locala;
  }

  public final boolean acG()
  {
    return false;
  }

  public final boolean acH()
  {
    return true;
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
 * Qualified Name:     com.tencent.mm.modelmulti.b.a
 * JD-Core Version:    0.6.2
 */