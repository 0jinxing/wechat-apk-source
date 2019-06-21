package com.tencent.mm.plugin.qqmail.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;

final class z$2
  implements ab.e
{
  z$2(z paramz)
  {
  }

  public final void Vn(String paramString)
  {
    AppMethodBeat.i(68032);
    y localy;
    if (this.pvd.puZ != null)
    {
      localy = this.pvd.puZ;
      if (bo.isNullOrNil(paramString))
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.ShareMailInfoMgr", "notify fail error, subject is null");
    }
    else
    {
      if (this.pvd.puX.size() <= 0)
        break label116;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ShareMailQueue", "continue to send next mail");
      paramString = (aa)this.pvd.puX.remove(0);
      this.pvd.b(paramString);
      this.pvd.puY.a(this.pvd.pvb, this);
      AppMethodBeat.o(68032);
    }
    while (true)
    {
      return;
      y.Vm(paramString);
      localy.Vl(paramString);
      break;
      label116: com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ShareMailQueue", "final job fail");
      this.pvd.pva = false;
      AppMethodBeat.o(68032);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.b.z.2
 * JD-Core Version:    0.6.2
 */