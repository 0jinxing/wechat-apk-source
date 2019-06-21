package com.tencent.mm.plugin.facedetectaction.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

final class d$2$1
  implements e.a
{
  d$2$1(d.2 param2)
  {
  }

  public final void Q(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(690);
    ab.i("MicroMsg.FaceCheckActionMgr", "onUploadFinish, fileName: %s, fileId: %s, aesKey: %s", new Object[] { paramString1, paramString1, paramString2, paramString3 });
    h.pYm.a(917L, 50L, 1L, false);
    d.a(this.mcD.mcB, paramString1, paramString2, paramString3);
    AppMethodBeat.o(690);
  }

  public final void onError()
  {
    AppMethodBeat.i(691);
    ab.i("MicroMsg.FaceCheckActionMgr", "on record error");
    if (d.f(this.mcD.mcB) != null)
    {
      d.f(this.mcD.mcB).a(2, -1, "", 1);
      h.pYm.a(917L, 47L, 1L, false);
    }
    AppMethodBeat.o(691);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetectaction.b.d.2.1
 * JD-Core Version:    0.6.2
 */