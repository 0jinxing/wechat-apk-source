package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.rt;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.sns.h.i;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.io.IOException;
import java.nio.charset.Charset;

final class af$25 extends c<rt>
{
  af$25(af paramaf)
  {
    AppMethodBeat.i(36459);
    this.xxI = rt.class.getName().hashCode();
    AppMethodBeat.o(36459);
  }

  private static boolean cnT()
  {
    AppMethodBeat.i(36460);
    com.tencent.mm.plugin.sns.lucky.a.g.cmv();
    ac.a locala = ac.a.xMT;
    i locali = new i();
    try
    {
      com.tencent.mm.kernel.g.RQ();
      z localz = com.tencent.mm.kernel.g.RP().Ry();
      String str = new java/lang/String;
      str.<init>(locali.toByteArray(), Charset.forName("ISO-8859-1"));
      localz.set(locala, str);
      AppMethodBeat.o(36460);
      return false;
    }
    catch (IOException localIOException)
    {
      while (true)
        ab.w("MicroMsg.RedDotUtil", "mardRedotList save exception:" + localIOException.getLocalizedMessage());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.af.25
 * JD-Core Version:    0.6.2
 */