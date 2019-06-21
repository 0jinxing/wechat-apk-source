package com.tencent.mm.modelvideo;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.i.d;
import com.tencent.mm.i.g.b;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class f$2
  implements g.b
{
  f$2(f paramf)
  {
  }

  public final void a(String paramString, d paramd)
  {
    AppMethodBeat.i(50683);
    if (paramd == null)
    {
      ab.w("MicroMsg.NetScenePreloadVideoFake", "%s onPreload completed but sceneResult is null", new Object[] { Integer.valueOf(this.fVD.hashCode()) });
      if (this.fVD.fVC != null)
        this.fVD.fVC.a(this.fVD, false, 0, 0);
      AppMethodBeat.o(50683);
    }
    while (true)
    {
      return;
      int i = paramd.field_recvedBytes;
      int j = paramd.field_fileLength;
      ab.i("MicroMsg.NetScenePreloadVideoFake", "%d onPreload Completed [%s] videoInfoName[%s] [%d, %d] videoFormat[%d]", new Object[] { Integer.valueOf(this.fVD.hashCode()), paramString, this.fVD.fVw, Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(paramd.field_videoFormat) });
      if ((i > 0) && (j > 0))
        this.fVD.fVz = f.e(this.fVD.fVw, i, true);
      boolean bool;
      if (this.fVD.fVC != null)
      {
        f.a locala = this.fVD.fVC;
        paramString = this.fVD;
        if ((i > 0) && (j > 0))
        {
          bool = true;
          label208: locala.a(paramString, bool, i, j);
        }
      }
      else
      {
        this.fVD.fVy = bo.anT();
        this.fVD.tV(paramd.Jn());
        if (!this.fVD.fVv)
          break label342;
        h.pYm.a(354L, 142L, 1L, false);
        if (this.fVD.fVA != 1)
          break label325;
        h.pYm.a(354L, 123L, 1L, false);
      }
      while (true)
      {
        h.pYm.a(354L, paramd.field_videoFormat + 240, 1L, false);
        AppMethodBeat.o(50683);
        break;
        bool = false;
        break label208;
        label325: h.pYm.a(354L, 124L, 1L, false);
      }
      label342: h.pYm.a(354L, 143L, 1L, false);
      AppMethodBeat.o(50683);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvideo.f.2
 * JD-Core Version:    0.6.2
 */