package com.tencent.mm.plugin.facedetectaction.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class FaceActionUI$2$4$1
  implements View.OnClickListener
{
  FaceActionUI$2$4$1(FaceActionUI.2.4 param4)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(713);
    ab.i("MicroMsg.FaceActionUI", "click retry");
    FaceActionUI.j(this.mdm.mdh.mde);
    AppMethodBeat.o(713);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI.2.4.1
 * JD-Core Version:    0.6.2
 */