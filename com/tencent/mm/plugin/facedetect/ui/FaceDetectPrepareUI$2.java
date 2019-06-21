package com.tencent.mm.plugin.facedetect.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.facedetect.c.a;

final class FaceDetectPrepareUI$2
  implements View.OnClickListener
{
  FaceDetectPrepareUI$2(FaceDetectPrepareUI paramFaceDetectPrepareUI, boolean paramBoolean, FaceDetectPrepareUI.c paramc, int paramInt1, int paramInt2, String paramString)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(401);
    if (this.lXq)
    {
      if (FaceDetectPrepareUI.b(this.lXp) == null)
        break label88;
      FaceDetectPrepareUI.b(this.lXp).bsk();
      AppMethodBeat.o(401);
    }
    while (true)
    {
      return;
      if (this.lXr != null)
        this.lXr.p(this.crc, this.crd, this.ftO);
      this.lXp.a(this.crc, this.crd, this.ftO, null);
      label88: AppMethodBeat.o(401);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.ui.FaceDetectPrepareUI.2
 * JD-Core Version:    0.6.2
 */