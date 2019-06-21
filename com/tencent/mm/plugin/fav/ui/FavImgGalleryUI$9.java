package com.tencent.mm.plugin.fav.ui;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.c;
import com.tencent.mm.ui.tools.MMGestureGallery;

final class FavImgGalleryUI$9
  implements Runnable
{
  FavImgGalleryUI$9(FavImgGalleryUI paramFavImgGalleryUI, c paramc)
  {
  }

  public final void run()
  {
    int i = 0;
    AppMethodBeat.i(74010);
    Object localObject = FavImgGalleryUI.a(this.miq).getSelectedView();
    if (localObject == null)
    {
      AppMethodBeat.o(74010);
      return;
    }
    localObject = (FavImgGalleryUI.b)((View)localObject).getTag();
    int j;
    if (this.mis.field_totalLen > 0)
    {
      j = this.mis.field_offset * 100 / this.mis.field_totalLen - 1;
      label67: if (j >= 0)
        break label146;
      j = i;
    }
    label146: 
    while (true)
    {
      ((FavImgGalleryUI.b)localObject).progressBar.setProgress(j);
      ((FavImgGalleryUI.b)localObject).mix.setText(j + "%");
      if ((j >= 100) || (this.mis.isFinished()))
        FavImgGalleryUI.e(this.miq).notifyDataSetChanged();
      AppMethodBeat.o(74010);
      break;
      j = 0;
      break label67;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavImgGalleryUI.9
 * JD-Core Version:    0.6.2
 */