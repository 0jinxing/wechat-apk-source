package com.tencent.mm.plugin.luckymoney.appbrand.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bom;
import com.tencent.mm.protocal.protobuf.bon;

public final class c extends a<bom, bon>
{
  public c(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(41987);
    bom localbom = new bom();
    localbom.csB = paramString1;
    localbom.wKw = paramString2;
    localbom.offset = paramInt;
    this.nRK = localbom;
    AppMethodBeat.o(41987);
  }

  protected final int ZU()
  {
    return 2949;
  }

  protected final String getUri()
  {
    return "/cgi-bin/mmbiz-bin/wxahb/querywxaapphbdetail";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.appbrand.a.c
 * JD-Core Version:    0.6.2
 */