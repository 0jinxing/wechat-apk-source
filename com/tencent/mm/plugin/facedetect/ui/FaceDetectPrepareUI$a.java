package com.tencent.mm.plugin.facedetect.ui;

import android.os.Handler;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;

final class FaceDetectPrepareUI$a extends Handler
{
  private WeakReference<FaceDetectPrepareUI> lWJ;

  private FaceDetectPrepareUI$a(FaceDetectPrepareUI paramFaceDetectPrepareUI)
  {
    AppMethodBeat.i(424);
    this.lWJ = null;
    this.lWJ = new WeakReference(paramFaceDetectPrepareUI);
    AppMethodBeat.o(424);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(425);
    ab.i("MicroMsg.FaceDetectPrepareUI", "alvinluo client msg.what: %d", new Object[] { Integer.valueOf(paramMessage.what) });
    if ((this.lWJ != null) && (this.lWJ.get() != null))
      switch (paramMessage.what)
      {
      default:
      case 0:
      case 1:
      case 6:
      }
    while (true)
    {
      AppMethodBeat.o(425);
      while (true)
      {
        return;
        FaceDetectPrepareUI.a((FaceDetectPrepareUI)this.lWJ.get(), paramMessage);
        AppMethodBeat.o(425);
        continue;
        FaceDetectPrepareUI.b((FaceDetectPrepareUI)this.lWJ.get(), paramMessage);
        AppMethodBeat.o(425);
      }
      FaceDetectPrepareUI.c((FaceDetectPrepareUI)this.lWJ.get(), paramMessage);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.ui.FaceDetectPrepareUI.a
 * JD-Core Version:    0.6.2
 */