package com.tencent.mm.plugin.facedetect.service;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.facedetect.model.g;
import com.tencent.mm.plugin.facedetect.model.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class FaceDetectProcessService$2
  implements Runnable
{
  FaceDetectProcessService$2(FaceDetectProcessService paramFaceDetectProcessService, q paramq)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(339);
    ab.i("MicroMsg.FaceDetectProcessService", "alvinluo service do release out");
    al.d(new FaceDetectProcessService.2.1(this, this.lVU.lVR.bsG()));
    AppMethodBeat.o(339);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.service.FaceDetectProcessService.2
 * JD-Core Version:    0.6.2
 */