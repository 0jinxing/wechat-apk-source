package com.tencent.mm.plugin.facedetectaction.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.facedetectaction.b.d;

final class FaceActionUI$5
  implements View.OnClickListener
{
  FaceActionUI$5(FaceActionUI paramFaceActionUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(722);
    d.mcq.onBackPressed();
    this.mde.finish();
    AppMethodBeat.o(722);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI.5
 * JD-Core Version:    0.6.2
 */