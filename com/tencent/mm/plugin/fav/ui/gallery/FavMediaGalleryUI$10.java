package com.tencent.mm.plugin.fav.ui.gallery;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.c;
import com.tencent.mm.ui.tools.MMGestureGallery;

final class FavMediaGalleryUI$10
  implements Runnable
{
  FavMediaGalleryUI$10(FavMediaGalleryUI paramFavMediaGalleryUI, c paramc)
  {
  }

  public final void run()
  {
    int i = 0;
    AppMethodBeat.i(74517);
    Object localObject = FavMediaGalleryUI.g(this.mnH).getSelectedView();
    if (localObject == null)
      AppMethodBeat.o(74517);
    while (true)
    {
      return;
      if ((((View)localObject).getTag() != null) && ((((View)localObject).getTag() instanceof FavMediaGalleryUI.b)))
        break;
      AppMethodBeat.o(74517);
    }
    localObject = (FavMediaGalleryUI.b)((View)localObject).getTag();
    int j;
    if (this.mis.field_totalLen > 0)
    {
      j = this.mis.field_offset * 100 / this.mis.field_totalLen - 1;
      label92: if (j >= 0)
        break label171;
      j = i;
    }
    label171: 
    while (true)
    {
      ((FavMediaGalleryUI.b)localObject).progressBar.setProgress(j);
      ((FavMediaGalleryUI.b)localObject).mix.setText(j + "%");
      if ((j >= 100) || (this.mis.isFinished()))
        FavMediaGalleryUI.d(this.mnH).notifyDataSetChanged();
      AppMethodBeat.o(74517);
      break;
      j = 0;
      break label92;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI.10
 * JD-Core Version:    0.6.2
 */