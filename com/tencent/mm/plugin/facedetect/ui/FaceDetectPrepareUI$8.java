package com.tencent.mm.plugin.facedetect.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.facedetect.c.a;
import com.tencent.mm.sdk.platformtools.ab;

final class FaceDetectPrepareUI$8
  implements Runnable
{
  FaceDetectPrepareUI$8(FaceDetectPrepareUI paramFaceDetectPrepareUI, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(411);
    try
    {
      ab.i("MicroMsg.FaceDetectPrepareUI", "call controller start upload biobuffer: %s", new Object[] { this.val$filePath });
      FaceDetectPrepareUI.b(this.lXp).Lq(this.val$filePath);
      AppMethodBeat.o(411);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.FaceDetectPrepareUI", localException, "", new Object[0]);
        AppMethodBeat.o(411);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.ui.FaceDetectPrepareUI.8
 * JD-Core Version:    0.6.2
 */