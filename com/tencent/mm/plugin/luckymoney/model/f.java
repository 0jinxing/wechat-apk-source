package com.tencent.mm.plugin.luckymoney.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.protobuf.aoj;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.io.IOException;

public final class f extends com.tencent.mm.wallet_core.c.a<aoj, c>
{
  private static f nWA;

  public static f bLp()
  {
    AppMethodBeat.i(42274);
    if (nWA == null)
      nWA = new f();
    f localf = nWA;
    AppMethodBeat.o(42274);
    return localf;
  }

  private static aoj bLq()
  {
    AppMethodBeat.i(42276);
    Object localObject1 = (String)g.RP().Ry().get(ac.a.xUq, "");
    if (bo.isNullOrNil((String)localObject1))
    {
      AppMethodBeat.o(42276);
      localObject1 = null;
    }
    while (true)
    {
      return localObject1;
      localObject1 = ((String)localObject1).getBytes(org.apache.commons.a.a.ISO_8859_1);
      try
      {
        aoj localaoj = new com/tencent/mm/protocal/protobuf/aoj;
        localaoj.<init>();
        localObject1 = (aoj)localaoj.parseFrom((byte[])localObject1);
        AppMethodBeat.o(42276);
      }
      catch (IOException localIOException)
      {
        ab.printErrStackTrace("MicroMsg.GetShowSourceAsyncLoader", localIOException, "", new Object[0]);
        AppMethodBeat.o(42276);
        Object localObject2 = null;
      }
    }
  }

  public final void e(a.a<aoj> parama)
  {
    AppMethodBeat.i(42275);
    ab.i("MicroMsg.GetShowSourceAsyncLoader", "errType: %s, errCode: %s", new Object[] { Integer.valueOf(parama.errCode), Integer.valueOf(parama.errType) });
    if ((parama.errType == 0) && (parama.errCode == 0) && (((aoj)parama.fsy).kCl == 0));
    while (true)
    {
      try
      {
        byte[] arrayOfByte = ((aoj)parama.fsy).toByteArray();
        parama = new java/lang/String;
        parama.<init>(arrayOfByte, org.apache.commons.a.a.ISO_8859_1);
        g.RP().Ry().set(ac.a.xUq, parama);
        AppMethodBeat.o(42275);
        return;
      }
      catch (IOException parama)
      {
        ab.printErrStackTrace("MicroMsg.GetShowSourceAsyncLoader", parama, "", new Object[0]);
      }
      AppMethodBeat.o(42275);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.f
 * JD-Core Version:    0.6.2
 */