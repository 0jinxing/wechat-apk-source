package com.tencent.mm.ui.tools;

import android.content.Intent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class CropImageNewUI$23
  implements Runnable
{
  CropImageNewUI$23(CropImageNewUI paramCropImageNewUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(34837);
    if (this.zBc.getIntent().getBooleanExtra("CropImage_DirectlyIntoFilter", false))
    {
      this.zBc.finish();
      AppMethodBeat.o(34837);
    }
    while (true)
    {
      return;
      CropImageNewUI.e(this.zBc).setVisibility(8);
      CropImageNewUI.p(this.zBc).setVisibility(0);
      CropImageNewUI.q(this.zBc).setVisibility(((Integer)CropImageNewUI.q(this.zBc).getTag()).intValue());
      CropImageNewUI.j(this.zBc).setVisibility(0);
      AppMethodBeat.o(34837);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.CropImageNewUI.23
 * JD-Core Version:    0.6.2
 */