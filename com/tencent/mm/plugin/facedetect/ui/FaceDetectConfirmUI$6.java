package com.tencent.mm.plugin.facedetect.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.facedetect.model.FaceDetectReporter;
import com.tencent.mm.plugin.facedetect.model.l;

final class FaceDetectConfirmUI$6
  implements DialogInterface.OnClickListener
{
  FaceDetectConfirmUI$6(FaceDetectConfirmUI paramFaceDetectConfirmUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(367);
    paramDialogInterface = new Intent();
    paramDialogInterface.putExtra("err_code", l.vm(90022));
    paramDialogInterface.putExtra("err_msg", "get confirm info error");
    FaceDetectReporter.bsJ().c(FaceDetectConfirmUI.h(this.lWx), false, 3, 2, 90022);
    FaceDetectReporter.bsJ().lUB = System.currentTimeMillis();
    FaceDetectReporter.bsJ().ce(FaceDetectConfirmUI.i(this.lWx), FaceDetectConfirmUI.h(this.lWx));
    FaceDetectConfirmUI.a(this.lWx, paramDialogInterface);
    this.lWx.finish();
    AppMethodBeat.o(367);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.ui.FaceDetectConfirmUI.6
 * JD-Core Version:    0.6.2
 */