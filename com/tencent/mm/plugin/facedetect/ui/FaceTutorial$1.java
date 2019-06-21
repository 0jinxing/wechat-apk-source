package com.tencent.mm.plugin.facedetect.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FaceTutorial$1
  implements View.OnClickListener
{
  FaceTutorial$1(FaceTutorial paramFaceTutorial)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(516);
    if (this.lYr.lYq != null)
      this.lYr.lYq.onCancel();
    this.lYr.dismiss();
    AppMethodBeat.o(516);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.ui.FaceTutorial.1
 * JD-Core Version:    0.6.2
 */