package com.tencent.mm.ui.tools;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class CropImageNewUI$6
  implements View.OnClickListener
{
  CropImageNewUI$6(CropImageNewUI paramCropImageNewUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(34819);
    CropImageNewUI.j(this.zBc).zoomOut();
    AppMethodBeat.o(34819);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.CropImageNewUI.6
 * JD-Core Version:    0.6.2
 */