package com.tencent.mm.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.ai.e.b;
import com.tencent.mm.ai.e.c;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.z;
import java.util.Map;
import junit.framework.Assert;

public final class bs
  implements e
{
  public final void a(e.c paramc)
  {
  }

  public final e.b b(e.a parama)
  {
    boolean bool1 = true;
    AppMethodBeat.i(16347);
    parama = parama.eAB;
    if (parama != null)
    {
      bool2 = true;
      Assert.assertTrue(bool2);
      if (parama.vED == null)
        break label100;
    }
    label100: for (boolean bool2 = bool1; ; bool2 = false)
    {
      Assert.assertTrue(bool2);
      parama = (String)br.z(aa.a(parama.vED), "tips").get(".tips.tip.url");
      ab.v("MicroMsg.SoftwareMsgExtension", "url:".concat(String.valueOf(parama)));
      aw.ZK();
      c.Ry().set(12308, parama);
      AppMethodBeat.o(16347);
      return null;
      bool2 = false;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.bs
 * JD-Core Version:    0.6.2
 */