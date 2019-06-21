package com.tencent.mm.plugin.appbrand.appusage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.protocal.protobuf.arj;
import com.tencent.mm.protocal.protobuf.ark;

class y extends a<ark>
{
  y(int paramInt1, int paramInt2, int paramInt3)
  {
    this(4, 0, paramInt1, paramInt2, paramInt3);
  }

  y(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    AppMethodBeat.i(129706);
    b.a locala = new b.a();
    arj localarj = new arj();
    localarj.boZ = paramInt1;
    localarj.wvu = paramInt2;
    localarj.condition = paramInt3;
    localarj.wvs = paramInt4;
    localarj.wvt = paramInt5;
    locala.fsJ = localarj;
    locala.fsK = new ark();
    locala.uri = "/cgi-bin/mmbiz-bin/wxaapp/getwxausagerecord";
    locala.fsI = 1148;
    this.ehh = locala.acD();
    AppMethodBeat.o(129706);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.y
 * JD-Core Version:    0.6.2
 */