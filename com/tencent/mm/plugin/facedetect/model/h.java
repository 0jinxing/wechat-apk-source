package com.tencent.mm.plugin.facedetect.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.facedetect.FaceProNative;
import com.tencent.mm.plugin.facedetect.service.FaceDetectProcessService;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Arrays;

public final class h
{
  public static h lTS;
  public int[] lTQ = null;
  public int lTR = -1;
  public int lfO = 0;

  public static h.a bsI()
  {
    AppMethodBeat.i(218);
    int i = f.lTL.bsD();
    Object localObject = f.lTL.lTM.lVR;
    if (((g)localObject).lTP == null)
      ab.e("MicroMsg.FaceDetectNativeManager", "hy: get motion data not init");
    for (localObject = null; ; localObject = ((g)localObject).lTP.engineGetCurrMotionData())
    {
      localObject = new h.a(i, (String)localObject);
      AppMethodBeat.o(218);
      return localObject;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(219);
    String str = "FaceDetectProcessModel{mProcessInSequence=" + Arrays.toString(this.lTQ) + '}';
    AppMethodBeat.o(219);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.model.h
 * JD-Core Version:    0.6.2
 */