package com.tencent.mm.plugin.facedetect.model;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class p$1
  implements Runnable
{
  p$1(Bitmap paramBitmap, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(262);
    long l = bo.yz();
    p.b(this.lUP, this.lUQ);
    ab.i("MicroMsg.FaceUtils", "hy: saving blur bm using: %d ms", new Object[] { Long.valueOf(bo.az(l)) });
    AppMethodBeat.o(262);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.model.p.1
 * JD-Core Version:    0.6.2
 */