package com.tencent.mm.plugin.subapp.ui.gallery;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.np;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;
import java.util.HashSet;

final class GestureGalleryUI$13
  implements n.c
{
  GestureGalleryUI$13(GestureGalleryUI paramGestureGalleryUI)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(25394);
    paraml.clear();
    paraml.hi(1, 2131302133);
    paraml.hi(2, 2131302709);
    paraml.hi(3, 2131301955);
    if (GestureGalleryUI.i(this.sum))
    {
      if (!com.tencent.mm.plugin.scanner.a.BR(GestureGalleryUI.j(this.sum)))
        break label177;
      paraml.e(4, this.sum.getString(2131302187));
    }
    while (true)
    {
      if ((GestureGalleryUI.l(this.sum)) && (bo.isNullOrNil(GestureGalleryUI.k(this.sum))) && (aw.Rg().acS() != 0))
      {
        paraml = new np();
        paraml.cJU.filePath = GestureGalleryUI.c(this.sum);
        paraml.cJU.cJV = new HashSet(GestureGalleryUI.m(this.sum));
        GestureGalleryUI.b(this.sum, GestureGalleryUI.c(this.sum));
        com.tencent.mm.sdk.b.a.xxA.m(paraml);
      }
      AppMethodBeat.o(25394);
      return;
      label177: if (com.tencent.mm.plugin.scanner.a.ba(GestureGalleryUI.j(this.sum), GestureGalleryUI.k(this.sum)))
        paraml.e(4, this.sum.getString(2131302188));
      else if (com.tencent.mm.plugin.scanner.a.BQ(GestureGalleryUI.j(this.sum)))
        paraml.e(4, this.sum.getString(2131302186));
      else
        paraml.e(4, this.sum.getString(2131302187));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI.13
 * JD-Core Version:    0.6.2
 */