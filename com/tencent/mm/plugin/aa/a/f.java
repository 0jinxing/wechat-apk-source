package com.tencent.mm.plugin.aa.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.aa.a.a.i;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.a;
import com.tencent.mm.protocal.protobuf.o;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vending.g.b;

public final class f
  implements com.tencent.mm.ai.f
{
  boolean glH = false;
  b glt;

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(40605);
    ab.i("MicroMsg.AAPayLogic", "AAPayLogic, onSceneEnd, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    this.glH = false;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = ((i)paramm).gmo;
      ab.i("MicroMsg.AAPayLogic", "AAPayLogic, onSceneEnd, retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(paramString.kCl), paramString.kCm });
      if (paramString.kCl == 0)
      {
        com.tencent.mm.vending.g.f.a(this.glt, new Object[] { paramString });
        h.pYm.a(407L, 9L, 1L, false);
        AppMethodBeat.o(40605);
      }
    }
    while (true)
    {
      return;
      if (this.glt != null)
      {
        if ((paramString.vAf == null) || (paramString.vAf.bJt != 1) || (bo.isNullOrNil(paramString.vAf.kCs)) || (bo.isNullOrNil(paramString.vAf.nZb)) || (bo.isNullOrNil(paramString.vAf.nZc)) || (bo.isNullOrNil(paramString.vAf.cEh)))
          break label234;
        this.glt.cR(paramString.vAf);
      }
      while (true)
      {
        h.pYm.a(407L, 11L, 1L, false);
        AppMethodBeat.o(40605);
        break;
        label234: if ((paramString.kCl > 0) && (!bo.isNullOrNil(paramString.kCm)))
          this.glt.cR(paramString.kCm);
        else
          this.glt.cR(Boolean.FALSE);
      }
      if (this.glt != null)
        this.glt.cR(Boolean.FALSE);
      h.pYm.a(407L, 10L, 1L, false);
      AppMethodBeat.o(40605);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.a.f
 * JD-Core Version:    0.6.2
 */