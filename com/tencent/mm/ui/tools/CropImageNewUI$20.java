package com.tencent.mm.ui.tools;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.a.d;

final class CropImageNewUI$20
  implements MenuItem.OnMenuItemClickListener
{
  CropImageNewUI$20(CropImageNewUI paramCropImageNewUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(34834);
    paramMenuItem = new d(this.zBc, 1, false);
    paramMenuItem.rBl = new CropImageNewUI.20.1(this);
    paramMenuItem.rBm = new CropImageNewUI.20.2(this);
    paramMenuItem.cpD();
    AppMethodBeat.o(34834);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.CropImageNewUI.20
 * JD-Core Version:    0.6.2
 */