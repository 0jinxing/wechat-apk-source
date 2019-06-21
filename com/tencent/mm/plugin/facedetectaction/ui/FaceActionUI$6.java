package com.tencent.mm.plugin.facedetectaction.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class FaceActionUI$6
  implements View.OnClickListener
{
  FaceActionUI$6(FaceActionUI paramFaceActionUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(723);
    ab.i("MicroMsg.FaceActionUI", "click mUploadFailedConfig");
    FaceActionUI.n(this.mde);
    this.mde.s("fail", FaceActionUI.o(this.mde), "");
    AppMethodBeat.o(723);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI.6
 * JD-Core Version:    0.6.2
 */