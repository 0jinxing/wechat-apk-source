package com.tencent.mm.plugin.facedetect.d;

import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

final class d$9
  implements a.b
{
  d$9(d paramd)
  {
  }

  public final void bsU()
  {
    AppMethodBeat.i(319);
    synchronized (this.lVO.lVI)
    {
      ab.i("MicroMsg.NumberFaceMotion", "hy: triggered read symbol");
      if ((!this.lVO.lVC) && (this.lVO.lVD))
      {
        this.lVO.lVC = true;
        d.b(this.lVO);
      }
      AppMethodBeat.o(319);
      return;
    }
  }

  public final void onError(int paramInt)
  {
    AppMethodBeat.i(320);
    synchronized (this.lVO.lVI)
    {
      ab.w("MicroMsg.NumberFaceMotion", "hy: on voice prepare error: %d", new Object[] { Integer.valueOf(paramInt) });
      switch (paramInt)
      {
      default:
        this.lVO.lVJ = true;
        d locald = this.lVO;
        b.a locala = new com/tencent/mm/plugin/facedetect/d/b$a;
        locala.<init>(ah.getResources().getString(2131301928));
        locald.lVK = locala;
        AppMethodBeat.o(320);
        return;
      case 11:
      }
      this.lVO.lVA = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.d.d.9
 * JD-Core Version:    0.6.2
 */