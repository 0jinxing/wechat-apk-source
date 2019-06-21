package com.tencent.mm.plugin.gallery.ui;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.ImageButton;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.gallery.model.GalleryItem.MediaItem;
import com.tencent.mm.plugin.gallery.model.e;
import com.tencent.mm.plugin.gallery.model.g;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.ArrayList;

final class ImagePreviewUI$27
  implements MenuItem.OnMenuItemClickListener
{
  ImagePreviewUI$27(ImagePreviewUI paramImagePreviewUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    int i = 0;
    AppMethodBeat.i(21528);
    if (ImagePreviewUI.k(this.mRu) == 6)
    {
      this.mRu.setResult(1);
      this.mRu.finish();
    }
    paramMenuItem = new Intent();
    paramMenuItem.putExtra("isPreviewPhoto", this.mRu.getIntent().getBooleanExtra("isPreviewPhoto", false));
    Object localObject = ImagePreviewUI.l(this.mRu);
    int j;
    if ((localObject != null) && (((ArrayList)localObject).size() == 0))
    {
      localObject = ImagePreviewUI.h(this.mRu).wz(ImagePreviewUI.g(this.mRu).intValue());
      if ((ImagePreviewUI.m(this.mRu)) && (ImagePreviewUI.h(this.mRu) != null) && (localObject != null) && (((GalleryItem.MediaItem)localObject).getType() == 2))
      {
        ImagePreviewUI.a(this.mRu, ((GalleryItem.MediaItem)localObject).fPT);
        j = 0;
      }
    }
    while (true)
    {
      if (!ImagePreviewUI.b(this.mRu));
      boolean bool2;
      for (boolean bool1 = true; ; bool1 = false)
      {
        bool2 = ImagePreviewUI.m(this.mRu);
        if (j != 0)
          break label221;
        ImagePreviewUI.a(this.mRu, paramMenuItem, bool2, bool1);
        AppMethodBeat.o(21528);
        return true;
        ImagePreviewUI.e(this.mRu).performClick();
        j = 300;
        break;
      }
      label221: localObject = e.bCa();
      paramMenuItem = new ImagePreviewUI.27.1(this, paramMenuItem, bool2, bool1);
      if (j < 0)
        j = i;
      while (true)
      {
        ((g)localObject).bCo().postDelayed(paramMenuItem, j);
        AppMethodBeat.o(21528);
        break;
      }
      j = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.27
 * JD-Core Version:    0.6.2
 */