package com.tencent.mm.plugin.facedetect.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.facedetect.FaceProNative;
import com.tencent.mm.plugin.facedetect.FaceProNative.FaceResult;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class g
{
  public FaceProNative lTP = null;

  public final FaceProNative.FaceResult bsG()
  {
    Object localObject = null;
    AppMethodBeat.i(214);
    if (this.lTP == null)
    {
      ab.e("MicroMsg.FaceDetectNativeManager", "hy: release out not init");
      AppMethodBeat.o(214);
    }
    while (true)
    {
      return localObject;
      try
      {
        long l = bo.yz();
        FaceProNative.FaceResult localFaceResult = this.lTP.engineReleaseOut();
        ab.i("MicroMsg.FaceDetectNativeManager", "hy: uninitialize result : %d, using: %d ms", new Object[] { Integer.valueOf(localFaceResult.result), Long.valueOf(bo.yz() - l) });
        this.lTP = null;
        AppMethodBeat.o(214);
        localObject = localFaceResult;
      }
      catch (Throwable localThrowable)
      {
        ab.printErrStackTrace("MicroMsg.FaceDetectNativeManager", localThrowable, "hy: face lib release crash!!!", new Object[0]);
        this.lTP.engineRelease();
        this.lTP = null;
        AppMethodBeat.o(214);
      }
    }
  }

  public final int bsH()
  {
    AppMethodBeat.i(215);
    boolean bool;
    int i;
    if (this.lTP == null)
    {
      bool = true;
      ab.v("MicroMsg.FaceDetectNativeManager", "alvinluo cutDown sFaceProNative == null: %b", new Object[] { Boolean.valueOf(bool) });
      if (this.lTP != null)
        break label63;
      ab.e("MicroMsg.FaceDetectNativeManager", "hy: reelase not init");
      i = -101;
      AppMethodBeat.o(215);
    }
    while (true)
    {
      return i;
      bool = false;
      break;
      label63: i = this.lTP.engineRelease();
      ab.i("MicroMsg.FaceDetectNativeManager", "hy: cut down result: %d", new Object[] { Integer.valueOf(i) });
      this.lTP = null;
      AppMethodBeat.o(215);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.model.g
 * JD-Core Version:    0.6.2
 */