package com.tencent.mm.plugin.voiceprint.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.k;
import com.tencent.mm.model.ba.a;
import com.tencent.mm.model.ba.b;
import com.tencent.mm.protocal.l.d;
import com.tencent.mm.protocal.l.e;

final class a extends k
{
  ba.a sKQ;
  ba.b sKR;

  a()
  {
    AppMethodBeat.i(26075);
    this.sKQ = new ba.a();
    this.sKR = new ba.b();
    AppMethodBeat.o(26075);
  }

  public final l.d ZR()
  {
    return this.sKQ;
  }

  public final l.e ZS()
  {
    return this.sKR;
  }

  public final int acC()
  {
    return 1;
  }

  public final int getType()
  {
    return 616;
  }

  public final String getUri()
  {
    return "/cgi-bin/micromsg-bin/getvoiceprintresourcersa";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voiceprint.model.a
 * JD-Core Version:    0.6.2
 */