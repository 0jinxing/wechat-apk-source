package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.protocal.protobuf.bkl;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.io.IOException;

public final class n extends com.tencent.mm.wallet_core.c.a<bkl, g>
{
  private static bkl cMD()
  {
    AppMethodBeat.i(45241);
    Object localObject1 = (String)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xUz, "");
    if (bo.isNullOrNil((String)localObject1))
    {
      AppMethodBeat.o(45241);
      localObject1 = null;
    }
    while (true)
    {
      return localObject1;
      localObject1 = ((String)localObject1).getBytes(org.apache.commons.a.a.ISO_8859_1);
      try
      {
        bkl localbkl = new com/tencent/mm/protocal/protobuf/bkl;
        localbkl.<init>();
        localObject1 = (bkl)localbkl.parseFrom((byte[])localObject1);
        AppMethodBeat.o(45241);
      }
      catch (IOException localIOException)
      {
        ab.printErrStackTrace("MicroMsg.CgiPlanIndexAsyncLoader", localIOException, "", new Object[0]);
        AppMethodBeat.o(45241);
        Object localObject2 = null;
      }
    }
  }

  public final void e(a.a<bkl> parama)
  {
    AppMethodBeat.i(45240);
    ab.i("MicroMsg.CgiPlanIndexAsyncLoader", "errType: %s, errCode: %s", new Object[] { Integer.valueOf(parama.errCode), Integer.valueOf(parama.errType) });
    if ((parama.errType == 0) && (parama.errCode == 0) && (((bkl)parama.fsy).kdT == 0));
    while (true)
    {
      try
      {
        parama = ((bkl)parama.fsy).toByteArray();
        String str = new java/lang/String;
        str.<init>(parama, org.apache.commons.a.a.ISO_8859_1);
        com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xUz, str);
        AppMethodBeat.o(45240);
        return;
      }
      catch (IOException parama)
      {
        ab.printErrStackTrace("MicroMsg.CgiPlanIndexAsyncLoader", parama, "", new Object[0]);
      }
      AppMethodBeat.o(45240);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.a.a.n
 * JD-Core Version:    0.6.2
 */