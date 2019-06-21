package com.tencent.mm.plugin.fav.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;
import java.util.List;

final class FavImgGalleryUI$5
  implements n.c
{
  FavImgGalleryUI$5(FavImgGalleryUI paramFavImgGalleryUI, List paramList1, List paramList2)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(74006);
    paraml.setHeaderTitle("");
    for (int i = 0; i < this.lcO.size(); i++)
      paraml.e(((Integer)this.lcO.get(i)).intValue(), (CharSequence)this.lcP.get(i));
    AppMethodBeat.o(74006);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavImgGalleryUI.5
 * JD-Core Version:    0.6.2
 */