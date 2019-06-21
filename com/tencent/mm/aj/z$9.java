package com.tencent.mm.aj;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ac.a;
import java.util.Map;

final class z$9
  implements bz.a
{
  z$9(z paramz)
  {
  }

  public final void a(e.a parama)
  {
    AppMethodBeat.i(11465);
    parama = parama.eAB;
    if (parama == null)
    {
      ab.e("MicroMsg.SubCoreBiz", "AddMsg is null.");
      AppMethodBeat.o(11465);
    }
    while (true)
    {
      return;
      parama = aa.a(parama.vED);
      if (bo.isNullOrNil(parama))
      {
        ab.e("MicroMsg.SubCoreBiz", "msg content is null");
        AppMethodBeat.o(11465);
      }
      else
      {
        parama = br.z(parama, "sysmsg");
        if ((parama == null) || (parama.size() <= 0))
        {
          ab.e("MicroMsg.SubCoreBiz", "receiveMessage, no sysmsg");
          AppMethodBeat.o(11465);
        }
        else if (!"mmbizattrappsvr_BizAttrSync".equalsIgnoreCase((String)parama.get(".sysmsg.$type")))
        {
          ab.e("MicroMsg.SubCoreBiz", "receiveMessage, type not BizAttrSync.");
          AppMethodBeat.o(11465);
        }
        else
        {
          int i = bo.getInt((String)parama.get(".sysmsg.mmbizattrappsvr_BizAttrSync.openflag"), 0);
          ab.i("MicroMsg.SubCoreBiz", "BizAttrSync openFlag : %d.", new Object[] { Integer.valueOf(i) });
          g.RP().Ry().set(ac.a.xLa, Integer.valueOf(i));
          g.RP().Ry().dsb();
          AppMethodBeat.o(11465);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.z.9
 * JD-Core Version:    0.6.2
 */