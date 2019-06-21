package com.tencent.mm.plugin.facedetect.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.facedetect.c.a;
import com.tencent.mm.sdk.platformtools.ab;

final class FaceDetectPrepareUI$9
  implements Runnable
{
  FaceDetectPrepareUI$9(FaceDetectPrepareUI paramFaceDetectPrepareUI, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(412);
    try
    {
      FaceDetectPrepareUI.b(this.lXp).Lq(this.chW);
      AppMethodBeat.o(412);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.FaceDetectPrepareUI", localException, "", new Object[0]);
        AppMethodBeat.o(412);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.ui.FaceDetectPrepareUI.9
 * JD-Core Version:    0.6.2
 */