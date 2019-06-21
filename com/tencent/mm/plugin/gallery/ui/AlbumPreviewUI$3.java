package com.tencent.mm.plugin.gallery.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.gallery.model.GalleryItem.MediaItem;
import com.tencent.mm.sdk.platformtools.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

final class AlbumPreviewUI$3
  implements a.b
{
  AlbumPreviewUI$3(AlbumPreviewUI paramAlbumPreviewUI)
  {
  }

  public final void W(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(21390);
    Object localObject = AlbumPreviewUI.a(this.mPO).ws(AlbumPreviewUI.a(this.mPO).mOM.size() + paramInt2);
    if (paramInt3 == 0)
      if ((localObject != null) && (((GalleryItem.MediaItem)localObject).getType() == 1))
      {
        AlbumPreviewUI.a(this.mPO, (GalleryItem.MediaItem)localObject);
        AlbumPreviewUI.b(this.mPO, paramInt1);
        this.mPO.V(paramInt2, true);
        localObject = AlbumPreviewUI.a(this.mPO).bCw().iterator();
        while (((Iterator)localObject).hasNext())
          if (!r.amo((String)((Iterator)localObject).next()))
            AppMethodBeat.o(21390);
      }
    while (true)
    {
      return;
      if ((localObject != null) && (((GalleryItem.MediaItem)localObject).getType() == 2))
      {
        if (!AlbumPreviewUI.b(this.mPO, (GalleryItem.MediaItem)localObject))
        {
          AlbumPreviewUI.a(this.mPO).mOI.remove(localObject);
          AlbumPreviewUI.a(this.mPO).notifyDataSetChanged();
          break;
        }
        AlbumPreviewUI.b(this.mPO, paramInt1);
        this.mPO.V(paramInt2, true);
        break;
      }
      AlbumPreviewUI.b(this.mPO, paramInt1);
      this.mPO.V(paramInt2, true);
      break;
      AlbumPreviewUI.b(this.mPO, paramInt1);
      this.mPO.V(paramInt2, false);
      break;
      AlbumPreviewUI.a(this.mPO, true);
      AppMethodBeat.o(21390);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.3
 * JD-Core Version:    0.6.2
 */