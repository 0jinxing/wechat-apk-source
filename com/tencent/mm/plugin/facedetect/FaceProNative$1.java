package com.tencent.mm.plugin.facedetect;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.facedetect.model.p;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vfs.e;

final class FaceProNative$1
  implements Runnable
{
  public final void run()
  {
    AppMethodBeat.i(29);
    int i;
    if (!FaceProNative.hasDetectInit)
    {
      i = FaceProNative.nativeFacedetectInitBin(e.e(p.bsP(), 0, -1));
      if (i == -1)
      {
        ab.w("MicroMsg.FaceProNative", "detectFaceCnt init failed: %s", new Object[] { p.bsP() });
        AppMethodBeat.o(29);
      }
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.FaceProNative", "detectFaceCnt init:%d, %s", new Object[] { Integer.valueOf(i), p.bsP() });
      FaceProNative.hasDetectInit = true;
      AppMethodBeat.o(29);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.FaceProNative.1
 * JD-Core Version:    0.6.2
 */