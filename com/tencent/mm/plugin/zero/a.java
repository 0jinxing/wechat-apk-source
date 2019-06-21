package com.tencent.mm.plugin.zero;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.File;

public final class a
  implements com.tencent.mm.kernel.api.bucket.c, com.tencent.mm.plugin.zero.b.a
{
  private com.tencent.mm.m.e uZK;
  private com.tencent.mm.m.c uZL;

  public a()
  {
    AppMethodBeat.i(58738);
    this.uZK = new com.tencent.mm.m.e();
    this.uZL = new com.tencent.mm.m.c();
    AppMethodBeat.o(58738);
  }

  public final com.tencent.mm.m.e Nu()
  {
    AppMethodBeat.i(58739);
    g.RQ();
    g.RN().QU();
    com.tencent.mm.m.e locale = this.uZK;
    AppMethodBeat.o(58739);
    return locale;
  }

  public final com.tencent.mm.m.c Nv()
  {
    AppMethodBeat.i(58740);
    g.RQ();
    g.RN().QU();
    com.tencent.mm.m.c localc = this.uZL;
    AppMethodBeat.o(58740);
    return localc;
  }

  public final void onAccountInitialized(e.c paramc)
  {
    AppMethodBeat.i(58741);
    if (paramc.eKe)
    {
      paramc = this.uZL;
      File localFile1 = new File(com.tencent.mm.compatible.util.e.eSn + "configlist/");
      if (localFile1.exists())
      {
        File localFile2 = new File(com.tencent.mm.m.c.evW);
        if (!localFile2.exists())
        {
          ab.d("MicroMsg.ConfigListDecoder", "bugfix");
          paramc.d(localFile1, localFile2);
        }
      }
    }
    this.uZK.sg();
    this.uZL.init();
    AppMethodBeat.o(58741);
  }

  public final void onAccountRelease()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.zero.a
 * JD-Core Version:    0.6.2
 */