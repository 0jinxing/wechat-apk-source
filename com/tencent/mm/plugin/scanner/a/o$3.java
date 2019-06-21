package com.tencent.mm.plugin.scanner.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.nq;
import com.tencent.mm.g.a.nr;
import com.tencent.mm.plugin.u.a.b.a;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;

final class o$3
  implements b.a
{
  o$3(o paramo)
  {
  }

  public final void Vv(String paramString)
  {
    AppMethodBeat.i(80882);
    ab.i("MicroMsg.RecogQBarOfImageFileListener", "result(failed): %s", new Object[] { paramString });
    nq localnq = new nq();
    localnq.cJW.filePath = paramString;
    a.xxA.m(localnq);
    AppMethodBeat.o(80882);
  }

  public final void a(String paramString1, String paramString2, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(80881);
    ab.i("MicroMsg.RecogQBarOfImageFileListener", "result: %s, codeType: %s, codeVersion: %s, filePath:%s", new Object[] { paramString2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString1 });
    m.pZK.bHT();
    paramArrayOfByte = new nr();
    paramArrayOfByte.cJX.filePath = paramString1;
    paramArrayOfByte.cJX.result = paramString2;
    paramArrayOfByte.cJX.cvn = paramInt1;
    paramArrayOfByte.cJX.cvo = paramInt2;
    a.xxA.m(paramArrayOfByte);
    AppMethodBeat.o(80881);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.a.o.3
 * JD-Core Version:    0.6.2
 */