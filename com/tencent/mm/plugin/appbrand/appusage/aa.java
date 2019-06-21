package com.tencent.mm.plugin.appbrand.appusage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.protocal.protobuf.ckm;
import com.tencent.mm.protocal.protobuf.ckn;

final class aa extends a<ckn>
{
  private final String bQd;
  private final ckm haE;
  private final b haF;
  private volatile w.a haG;

  aa(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, String paramString1, int paramInt4, String paramString2)
  {
    AppMethodBeat.i(129707);
    this.bQd = paramString2;
    b.a locala = new b.a();
    ckm localckm = new ckm();
    int i = paramInt1;
    if (paramInt1 == 0)
      i = 1000;
    localckm.scene = i;
    if (paramBoolean);
    for (paramInt1 = 1; ; paramInt1 = 0)
    {
      localckm.xiq = paramInt1;
      localckm.vOO = paramInt2;
      localckm.xir = 2;
      localckm.xis = paramInt3;
      localckm.username = paramString1;
      localckm.boZ = paramInt4;
      localckm.session_id = paramString2;
      this.haE = localckm;
      locala.fsJ = localckm;
      locala.fsK = new ckn();
      locala.uri = "/cgi-bin/mmbiz-bin/wxaapp/updatewxausagerecord";
      locala.fsI = 1149;
      paramString1 = locala.acD();
      this.haF = paramString1;
      this.ehh = paramString1;
      AppMethodBeat.o(129707);
      return;
    }
  }

  static aa aN(String paramString, int paramInt)
  {
    AppMethodBeat.i(129708);
    paramString = new aa(1001, false, paramInt, 2, paramString, 1, null);
    AppMethodBeat.o(129708);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.aa
 * JD-Core Version:    0.6.2
 */