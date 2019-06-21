package com.tencent.mm.ui.tools;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class CropImageNewUI$5
  implements View.OnClickListener
{
  CropImageNewUI$5(CropImageNewUI paramCropImageNewUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(34818);
    CropImageNewUI.j(this.zBc).zoomIn();
    AppMethodBeat.o(34818);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.CropImageNewUI.5
 * JD-Core Version:    0.6.2
 */