package com.tencent.mm.plugin.gallery.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.gallery.model.GalleryItem.MediaItem;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;

final class e
{
  int aaF = -1;
  private c mQS;

  public e(c paramc)
  {
    this.mQS = paramc;
  }

  final void wB(int paramInt)
  {
    AppMethodBeat.i(21496);
    c localc = this.mQS;
    if ((localc.mOH == null) || (localc.mOH.size() <= paramInt) || (paramInt < 0))
      AppMethodBeat.o(21496);
    while (true)
    {
      return;
      long l = ((GalleryItem.MediaItem)localc.mOH.get(paramInt)).mOk;
      String str1 = ((GalleryItem.MediaItem)localc.mOH.get(paramInt)).lZg;
      String str2 = ((GalleryItem.MediaItem)localc.mOH.get(paramInt)).fPT;
      String str3 = str1;
      if (bo.isNullOrNil(str1))
        str3 = str2;
      com.tencent.mm.plugin.gallery.model.e.bBY().b(str3, ((GalleryItem.MediaItem)localc.mOH.get(paramInt)).getType(), str2, l);
      AppMethodBeat.o(21496);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.e
 * JD-Core Version:    0.6.2
 */