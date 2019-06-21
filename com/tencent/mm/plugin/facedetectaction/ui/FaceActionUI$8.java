package com.tencent.mm.plugin.facedetectaction.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class FaceActionUI$8
  implements View.OnClickListener
{
  FaceActionUI$8(FaceActionUI paramFaceActionUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(726);
    ab.i("MicroMsg.FaceActionUI", "click finish");
    this.mde.s("fail", 90010, "");
    AppMethodBeat.o(726);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI.8
 * JD-Core Version:    0.6.2
 */