package com.tencent.mm.plugin.voip_cs.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ug;
import com.tencent.mm.g.a.ug.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.voip_cs.b.e;
import com.tencent.mm.protocal.protobuf.cov;
import com.tencent.mm.protocal.protobuf.cpc;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.IOException;

public final class a extends com.tencent.mm.sdk.b.c<ug>
{
  public a()
  {
    AppMethodBeat.i(135282);
    this.xxI = ug.class.getName().hashCode();
    AppMethodBeat.o(135282);
  }

  private static boolean a(ug paramug)
  {
    AppMethodBeat.i(135283);
    if ((paramug instanceof ug))
      if (!g.RK())
        AppMethodBeat.o(135283);
    while (true)
    {
      return false;
      e locale = com.tencent.mm.plugin.voip_cs.b.c.cMf();
      paramug = paramug.cQq.cQr;
      Object localObject;
      if ((paramug != null) && (paramug.length != 0))
      {
        localObject = new byte[paramug.length - 1];
        System.arraycopy(paramug, 1, localObject, 0, localObject.length);
        paramug = new cov();
      }
      try
      {
        paramug.parseFrom((byte[])localObject);
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>("notify status = ");
        ab.i("MicroMsg.voipcs.VoipCSService", paramug.xmF + ",notifySeq = " + locale.tdG);
        localObject = new com/tencent/mm/protocal/protobuf/cpc;
        ((cpc)localObject).<init>();
        ((cpc)localObject).xeF = paramug.xeF;
        ((cpc)localObject).wen = paramug.wen;
        ((cpc)localObject).xmD = paramug.xmD;
        ((cpc)localObject).xmF = paramug.xmF;
        ((cpc)localObject).xmG = paramug.xmG;
        ((cpc)localObject).xmH = paramug.xmH;
        ((cpc)localObject).xmE = paramug.xmE;
        locale.a((cpc)localObject);
        AppMethodBeat.o(135283);
      }
      catch (IOException paramug)
      {
        while (true)
          ab.e("MicroMsg.voipcs.VoipCSService", "csNotify.parseFrom content error!", new Object[] { paramug });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip_cs.a.a
 * JD-Core Version:    0.6.2
 */