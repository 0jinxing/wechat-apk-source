package com.tencent.mm.plugin.fav.ui.detail;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;
import com.tencent.mm.vfs.e;

final class FavoriteVideoPlayUI$2$1
  implements n.c
{
  FavoriteVideoPlayUI$2$1(FavoriteVideoPlayUI.2 param2)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(74458);
    if (FavoriteVideoPlayUI.a(this.mnf.mne))
    {
      if (e.ct(FavoriteVideoPlayUI.b(this.mnf.mne)))
        paraml.add(0, 1, 0, this.mnf.mne.getString(2131299734));
      paraml.add(0, 2, 0, this.mnf.mne.getString(2131302712));
    }
    AppMethodBeat.o(74458);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteVideoPlayUI.2.1
 * JD-Core Version:    0.6.2
 */