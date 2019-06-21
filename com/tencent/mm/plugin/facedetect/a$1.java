package com.tencent.mm.plugin.facedetect;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.facedetect.model.p;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.io.File;

final class a$1
  implements Runnable
{
  a$1(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(52);
    String str1 = p.bsP();
    String str2 = p.bsQ();
    String str3 = p.bsR();
    boolean bool1 = com.tencent.mm.pluginsdk.g.a.d.a.ct(str1);
    boolean bool2 = com.tencent.mm.pluginsdk.g.a.d.a.ct(str2);
    boolean bool3 = com.tencent.mm.pluginsdk.g.a.d.a.ct(str3);
    ab.i("MicroMsg.TaskInitFace", "alvinluo detectmodel: %s, exist: %b, alignModel: %s, exist: %b, postDetectModel: %s, exist: %s", new Object[] { str1, Boolean.valueOf(bool1), str2, Boolean.valueOf(bool2), str3, Boolean.valueOf(bool3) });
    if (!bool1)
    {
      ab.i("MicroMsg.TaskInitFace", "alvinluo copy detect model file");
      p.p(ah.getContext(), "face_detect" + File.separator + "ufdmtcc.bin", str1);
      if (bool2)
        break label245;
      ab.i("MicroMsg.TaskInitFace", "alvinluo copy alignment model file");
      p.p(ah.getContext(), "face_detect" + File.separator + "ufat.bin", str2);
      label167: if (bool3)
        break label275;
      ab.i("MicroMsg.TaskInitFace", "copy post detect model file");
      p.p(ah.getContext(), "face_detect" + File.separator + "PE.dat", str3);
      AppMethodBeat.o(52);
    }
    while (true)
    {
      return;
      a.ei(str1, "face_detect" + File.separator + "ufdmtcc.bin");
      break;
      label245: a.ei(str2, "face_detect" + File.separator + "ufat.bin");
      break label167;
      label275: a.ei(str3, "face_detect" + File.separator + "PE.dat");
      AppMethodBeat.o(52);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.a.1
 * JD-Core Version:    0.6.2
 */