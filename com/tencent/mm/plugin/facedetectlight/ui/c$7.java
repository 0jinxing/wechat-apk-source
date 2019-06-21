package com.tencent.mm.plugin.facedetectlight.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.facedetect.e.a.b;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class c$7
  implements a.b
{
  c$7(c paramc)
  {
  }

  public final void Lu(String paramString)
  {
    AppMethodBeat.i(798);
    ab.i("MicroMsg.FaceReflectLogic", "video release done. using: %d ms. file path: %s", new Object[] { Long.valueOf(bo.az(bo.yz())), paramString });
    if (bo.isNullOrNil(paramString))
    {
      ab.i("MicroMsg.FaceReflectLogic", " video is null");
      h.pYm.a(917L, 20L, 1L, false);
      AppMethodBeat.o(798);
    }
    while (true)
    {
      return;
      h.pYm.a(917L, 19L, 1L, false);
      ab.i("MicroMsg.FaceReflectLogic", " begin upload video ");
      ab.i("MicroMsg.FaceReflectLogic", "filePath is : ".concat(String.valueOf(paramString)));
      ab.i("MicroMsg.FaceReflectLogic", "BioID is : " + this.mdV.mdC);
      ab.i("MicroMsg.FaceReflectLogic", "AppId is : " + this.mdV.mAppId);
      AppMethodBeat.o(798);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetectlight.ui.c.7
 * JD-Core Version:    0.6.2
 */