package com.tencent.mm.ui.tools;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class CropImageNewUI$17
  implements MenuItem.OnMenuItemClickListener
{
  CropImageNewUI$17(CropImageNewUI paramCropImageNewUI, boolean paramBoolean1, boolean paramBoolean2)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(34829);
    if ((this.zBf) && (this.zBg))
    {
      CropImageNewUI.a(this.zBc, true);
      AppMethodBeat.o(34829);
      return true;
    }
    switch (CropImageNewUI.f(this.zBc))
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      AppMethodBeat.o(34829);
      break;
      if (CropImageNewUI.e(this.zBc) != null)
      {
        CropImageNewUI.a(this.zBc, CropImageNewUI.e(this.zBc).getCropImageIV(), CropImageNewUI.i(this.zBc));
      }
      else
      {
        CropImageNewUI.a(this.zBc, CropImageNewUI.j(this.zBc), CropImageNewUI.i(this.zBc));
        continue;
        CropImageNewUI.k(this.zBc);
        continue;
        CropImageNewUI.l(this.zBc);
        continue;
        CropImageNewUI.m(this.zBc);
        continue;
        CropImageNewUI.n(this.zBc);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.CropImageNewUI.17
 * JD-Core Version:    0.6.2
 */