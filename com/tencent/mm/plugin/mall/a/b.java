package com.tencent.mm.plugin.mall.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.protocal.protobuf.amc;
import com.tencent.mm.protocal.protobuf.amd;
import com.tencent.mm.sdk.platformtools.ab;

public final class b extends a<amd>
{
  public b(int paramInt)
  {
    AppMethodBeat.i(43093);
    amc localamc = new amc();
    localamc.vKn = paramInt;
    localamc.vKo = 0;
    localamc.wrg = 1;
    b.a locala = new b.a();
    locala.fsJ = localamc;
    locala.fsK = new amd();
    locala.fsI = 2680;
    locala.uri = "/cgi-bin/micromsg-bin/getpayfunctionswitchlist";
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ab.i("MicroMsg.CgiGetPayFunctionSwitchList", "TpaCountry: %s", new Object[] { Integer.valueOf(paramInt) });
    AppMethodBeat.o(43093);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.a.b
 * JD-Core Version:    0.6.2
 */