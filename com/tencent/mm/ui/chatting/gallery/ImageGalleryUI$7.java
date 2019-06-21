package com.tencent.mm.ui.chatting.gallery;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;
import java.util.List;

final class ImageGalleryUI$7
  implements n.c
{
  ImageGalleryUI$7(ImageGalleryUI paramImageGalleryUI, List paramList1, List paramList2)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(32203);
    paraml.clear();
    for (int i = 0; i < this.lcO.size(); i++)
      paraml.e(((Integer)this.lcO.get(i)).intValue(), (CharSequence)this.lcP.get(i));
    AppMethodBeat.o(32203);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.7
 * JD-Core Version:    0.6.2
 */