package com.tencent.mm.plugin.fav.ui.gallery;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;
import java.util.List;

final class FavMediaGalleryUI$6
  implements n.c
{
  FavMediaGalleryUI$6(FavMediaGalleryUI paramFavMediaGalleryUI, List paramList1, List paramList2)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(74513);
    paraml.setHeaderTitle("");
    for (int i = 0; i < this.lcO.size(); i++)
      paraml.e(((Integer)this.lcO.get(i)).intValue(), (CharSequence)this.lcP.get(i));
    AppMethodBeat.o(74513);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI.6
 * JD-Core Version:    0.6.2
 */