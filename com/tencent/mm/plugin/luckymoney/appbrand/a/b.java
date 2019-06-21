package com.tencent.mm.plugin.luckymoney.appbrand.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bhj;
import com.tencent.mm.protocal.protobuf.bhk;
import com.tencent.mm.sdk.platformtools.ab;

public final class b extends a<bhj, bhk>
{
  public b(String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(41983);
    bhj localbhj = new bhj();
    localbhj.csB = paramString1;
    localbhj.wKw = paramString2;
    localbhj.wKx = com.tencent.mm.bt.b.bI(paramArrayOfByte);
    this.nRK = localbhj;
    AppMethodBeat.o(41983);
  }

  public final int ZU()
  {
    return 2701;
  }

  protected final void bKS()
  {
    AppMethodBeat.i(41984);
    ab.i("MicroMsg.CgiOpenWxaHB", "CgiOpenWxaHB.onCgiStart ");
    AppMethodBeat.o(41984);
  }

  protected final void bKT()
  {
    AppMethodBeat.i(41985);
    ab.i("MicroMsg.CgiOpenWxaHB", "CgiOpenWxaHB.onCgiEnd ");
    AppMethodBeat.o(41985);
  }

  public final String getUri()
  {
    return "/cgi-bin/mmbiz-bin/wxahb/openwxaapphb";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.appbrand.a.b
 * JD-Core Version:    0.6.2
 */