package com.tencent.mm.plugin.appbrand.config;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.protocal.protobuf.cww;
import com.tencent.mm.protocal.protobuf.cwy;
import com.tencent.mm.sdk.platformtools.bo;

public final class k extends a<cwy>
{
  final com.tencent.mm.ai.b ehh;

  public k(String paramString1, String paramString2)
  {
    AppMethodBeat.i(129851);
    b.a locala = new b.a();
    cww localcww = new cww();
    localcww.xfb = paramString1;
    if (bo.isNullOrNil(paramString1))
    {
      paramString1 = f.auO().e(paramString2, new String[] { "syncVersion" });
      if (paramString1 == null)
        paramString1 = "";
    }
    for (paramString1 = new com.tencent.mm.bt.b(paramString1.getBytes()); ; paramString1 = f.auO().zf(paramString1))
    {
      localcww.vMS = paramString1;
      localcww.xsB = paramString2;
      locala.fsJ = localcww;
      locala.fsK = new cwy();
      locala.fsI = 1151;
      locala.uri = "/cgi-bin/mmbiz-bin/wxaattr/wxaattrsync";
      paramString1 = locala.acD();
      this.ehh = paramString1;
      this.ehh = paramString1;
      AppMethodBeat.o(129851);
      return;
      paramString1 = bo.nullAsNil(paramString1.field_syncVersion);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.config.k
 * JD-Core Version:    0.6.2
 */