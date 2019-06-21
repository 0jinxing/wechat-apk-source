package com.tencent.mm.plugin.facedetect;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.facedetect.model.i;
import com.tencent.mm.plugin.facedetect.model.j;
import com.tencent.mm.plugin.facedetect.model.k;
import com.tencent.mm.plugin.facedetect.model.m;
import com.tencent.mm.plugin.facedetect.model.o;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vending.g.b;

public final class a
  implements com.tencent.mm.vending.c.a<Void, Void>
{
  private static j lRY;
  private static o lRZ;
  private static i lSa;
  private static m lSb;
  private static com.tencent.mm.plugin.facedetectaction.b.c lSc;
  private static k lSd;
  private b glt = null;

  static
  {
    AppMethodBeat.i(56);
    lRY = new j();
    lRZ = new o();
    lSa = new i();
    lSb = new m();
    lSc = new com.tencent.mm.plugin.facedetectaction.b.c();
    lSd = new k();
    AppMethodBeat.o(56);
  }

  private static void safeAddListener(com.tencent.mm.sdk.b.c paramc)
  {
    AppMethodBeat.i(53);
    if (paramc == null)
    {
      ab.w("MicroMsg.TaskInitFace", "hy: listener is null or id is invalid");
      AppMethodBeat.o(53);
    }
    while (true)
    {
      return;
      if (com.tencent.mm.sdk.b.a.xxA.e(paramc))
      {
        ab.w("MicroMsg.TaskInitFace", "hy: already has listener");
        AppMethodBeat.o(53);
      }
      else
      {
        com.tencent.mm.sdk.b.a.xxA.c(paramc);
        AppMethodBeat.o(53);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.a
 * JD-Core Version:    0.6.2
 */