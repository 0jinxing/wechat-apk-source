package com.tencent.mm.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.ai.e.b;
import com.tencent.mm.ai.e.c;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.z;
import java.util.Map;

public final class ca
  implements e
{
  public final void a(e.c paramc)
  {
  }

  public final e.b b(e.a parama)
  {
    AppMethodBeat.i(16351);
    cm localcm = parama.eAB;
    if (localcm == null)
    {
      ab.e("MicroMsg.SysNoticeMsgExtension", "onPreAddMessage cmdAM is null");
      AppMethodBeat.o(16351);
    }
    while (true)
    {
      return null;
      try
      {
        parama = new java/lang/StringBuilder;
        parama.<init>("<root>");
        parama = br.z(localcm.vED + "</root>", "root");
        int i = Integer.valueOf((String)parama.get(".root.newcount")).intValue();
        int j = Integer.valueOf((String)parama.get(".root.version")).intValue();
        aw.ZK();
        parama = c.Ry();
        if (j == bo.h((Integer)parama.get(12305, null)))
        {
          ab.i("MicroMsg.SysNoticeMsgExtension", "ignore new sys notice count, same version");
          AppMethodBeat.o(16351);
          continue;
        }
        parama.set(12304, Integer.valueOf(i));
        parama.set(12305, Integer.valueOf(j));
        AppMethodBeat.o(16351);
      }
      catch (Exception parama)
      {
        while (true)
          ab.e("MicroMsg.SysNoticeMsgExtension", "exception:%s", new Object[] { bo.l(parama) });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.ca
 * JD-Core Version:    0.6.2
 */