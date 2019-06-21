package com.tencent.mm.plugin.luckymoney.appbrand.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bqa;
import com.tencent.mm.protocal.protobuf.bqb;

public final class d extends a<bqa, bqb>
{
  public d(String paramString1, String paramString2)
  {
    AppMethodBeat.i(41989);
    bqa localbqa = new bqa();
    localbqa.csB = paramString1;
    localbqa.wKw = paramString2;
    this.nRK = localbqa;
    AppMethodBeat.o(41989);
  }

  public final int ZU()
  {
    return 1828;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmbiz-bin/wxahb/receivewxaapphb";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.appbrand.a.d
 * JD-Core Version:    0.6.2
 */