package com.tencent.mm.plugin.voiceprint.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.k;
import com.tencent.mm.model.bb.a;
import com.tencent.mm.model.bb.b;
import com.tencent.mm.protocal.l.d;
import com.tencent.mm.protocal.l.e;

final class b extends k
{
  bb.a sKS;
  bb.b sKT;

  b()
  {
    AppMethodBeat.i(26076);
    this.sKS = new bb.a();
    this.sKT = new bb.b();
    AppMethodBeat.o(26076);
  }

  public final l.d ZR()
  {
    return this.sKS;
  }

  public final l.e ZS()
  {
    return this.sKT;
  }

  public final int acC()
  {
    return 1;
  }

  public final int getType()
  {
    return 618;
  }

  public final String getUri()
  {
    return "/cgi-bin/micromsg-bin/getvoiceprintticketrsa";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voiceprint.model.b
 * JD-Core Version:    0.6.2
 */