package com.tencent.mm.ar;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.protocal.protobuf.ahu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import java.util.Queue;

final class c$6
  implements w.a
{
  c$6(c paramc)
  {
  }

  public final int a(int paramInt1, int paramInt2, String paramString, b paramb, m paramm)
  {
    AppMethodBeat.i(16475);
    if (paramm.getType() != 182)
      AppMethodBeat.o(16475);
    while (true)
    {
      return 0;
      this.fCH.frc = false;
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        ab.e("MicroMsg.GetContactService", "tryStartNetscene onSceneEnd errType:" + paramInt1 + " errCode:" + paramInt2 + " will retry");
        this.fCH.fCF.ae(10000L, 10000L);
        AppMethodBeat.o(16475);
      }
      else
      {
        if ((!this.fCH.fCA.isEmpty()) && (this.fCH.fCF.doT()))
          this.fCH.fCF.ae(500L, 500L);
        if (paramb != null)
        {
          paramm = new c.a(this.fCH);
          paramm.errType = paramInt1;
          paramm.errCode = paramInt2;
          paramm.aIm = paramString;
          paramm.fCO = ((ahu)paramb.fsH.fsP);
          this.fCH.fCB.add(paramm);
        }
        if ((!this.fCH.fCB.isEmpty()) && (this.fCH.fCG.doT()))
          this.fCH.fCG.ae(50L, 50L);
        AppMethodBeat.o(16475);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ar.c.6
 * JD-Core Version:    0.6.2
 */