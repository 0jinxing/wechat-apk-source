package com.tencent.mm.plugin.luckymoney.appbrand.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bsu;
import com.tencent.mm.protocal.protobuf.bsv;
import com.tencent.mm.sdk.platformtools.ab;

public final class e extends a<bsu, bsv>
{
  public e(bsu parambsu)
  {
    this.nRK = parambsu;
  }

  public final int ZU()
  {
    return 2857;
  }

  protected final void bKS()
  {
    AppMethodBeat.i(41991);
    ab.i("MicroMsg.CgiRequestWxaHB", "CgiRequestWxaHB.onCgiStart ");
    AppMethodBeat.o(41991);
  }

  protected final void bKT()
  {
    AppMethodBeat.i(41992);
    ab.i("MicroMsg.CgiRequestWxaHB", "CgiRequestWxaHB.onCgiEnd ");
    AppMethodBeat.o(41992);
  }

  public final String getUri()
  {
    return "/cgi-bin/mmbiz-bin/wxahb/requestwxaapphb";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.appbrand.a.e
 * JD-Core Version:    0.6.2
 */