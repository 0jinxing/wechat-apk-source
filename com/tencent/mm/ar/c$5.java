package com.tencent.mm.ar;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.openim.b.s;
import com.tencent.mm.protocal.protobuf.all;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import java.util.Queue;

final class c$5
  implements w.a
{
  c$5(c paramc, String paramString)
  {
  }

  public final int a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.b paramb, m paramm)
  {
    AppMethodBeat.i(16474);
    if (paramm.getType() != 881)
      AppMethodBeat.o(16474);
    while (true)
    {
      return 0;
      this.fCH.frc = false;
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        ab.e("MicroMsg.GetContactService", "tryStartNetscene onSceneEnd openImUser errType: %s  errCode: %s username %s will retry/del ", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), this.fCK });
        if (paramInt1 == 4)
          d.agM().rY(this.fCK);
        this.fCH.fCF.ae(10000L, 10000L);
        this.fCH.H(this.fCK, false);
        AppMethodBeat.o(16474);
      }
      else
      {
        if ((!this.fCH.fCA.isEmpty()) && (this.fCH.fCF.doT()))
          this.fCH.fCF.ae(500L, 500L);
        s.a((all)paramb.fsH.fsP);
        ab.i("MicroMsg.GetContactService", "getopenimcontact onResult %s %s", new Object[] { Boolean.valueOf(d.agM().rY(this.fCK)), this.fCK });
        this.fCH.H(this.fCK, true);
        AppMethodBeat.o(16474);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ar.c.5
 * JD-Core Version:    0.6.2
 */