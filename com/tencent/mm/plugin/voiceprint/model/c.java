package com.tencent.mm.plugin.voiceprint.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.k;
import com.tencent.mm.model.bc.a;
import com.tencent.mm.model.bc.b;
import com.tencent.mm.protocal.l.d;
import com.tencent.mm.protocal.l.e;

final class c extends k
{
  bc.a sKU;
  bc.b sKV;

  c()
  {
    AppMethodBeat.i(26077);
    this.sKU = new bc.a();
    this.sKV = new bc.b();
    AppMethodBeat.o(26077);
  }

  public final l.d ZR()
  {
    return this.sKU;
  }

  public final l.e ZS()
  {
    return this.sKV;
  }

  public final int acC()
  {
    return 1;
  }

  public final int getType()
  {
    return 617;
  }

  public final String getUri()
  {
    return "/cgi-bin/micromsg-bin/verifyvoiceprintrsa";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voiceprint.model.c
 * JD-Core Version:    0.6.2
 */