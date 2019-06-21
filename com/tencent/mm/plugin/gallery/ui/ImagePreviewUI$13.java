package com.tencent.mm.plugin.gallery.ui;

import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.gallery.model.GalleryItem.MediaItem;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;

final class ImagePreviewUI$13
  implements ViewPager.OnPageChangeListener
{
  ImagePreviewUI$13(ImagePreviewUI paramImagePreviewUI)
  {
  }

  public final void onPageScrollStateChanged(int paramInt)
  {
    AppMethodBeat.i(21512);
    if (ImagePreviewUI.h(this.mRu) != null)
      ImagePreviewUI.h(this.mRu).mQt.onPageScrollStateChanged(paramInt);
    AppMethodBeat.o(21512);
  }

  public final void onPageScrolled(int paramInt1, float paramFloat, int paramInt2)
  {
  }

  public final void onPageSelected(int paramInt)
  {
    AppMethodBeat.i(21511);
    com.tencent.mm.plugin.gallery.model.e.wk(paramInt);
    String str = ImagePreviewUI.h(this.mRu).getItem(paramInt);
    ImagePreviewUI.a(this.mRu, paramInt, str);
    boolean bool = ImagePreviewUI.d(this.mRu).contains(str);
    ImagePreviewUI.a(this.mRu, Integer.valueOf(paramInt));
    Object localObject = ImagePreviewUI.e(this.mRu);
    int i;
    if (bool)
    {
      i = 2131231117;
      ((ImageButton)localObject).setImageResource(i);
      if (!ImagePreviewUI.b(this.mRu))
        break label190;
      ImagePreviewUI.c(this.mRu).setImageResource(2131231853);
      label101: this.mRu.setMMTitle(String.format("%d/%d", new Object[] { Integer.valueOf(paramInt + 1), Integer.valueOf(ImagePreviewUI.h(this.mRu).getCount()) }));
      localObject = ImagePreviewUI.h(this.mRu).mQs;
      if (((e)localObject).aaF != -1)
        break label274;
      i = 0;
      label166: if (i != 0)
        break label205;
      ((e)localObject).wB(paramInt);
    }
    while (true)
    {
      i++;
      break label166;
      i = 2131231120;
      break;
      label190: ImagePreviewUI.c(this.mRu).setImageResource(2131231852);
      break label101;
      label205: if ((paramInt + i > paramInt + 3) && (paramInt - i < Math.max(paramInt - 3, 0)))
        break label295;
      if (paramInt + i <= paramInt + 3)
        ((e)localObject).wB(paramInt + i);
      if (paramInt - i >= Math.max(paramInt - 3, 0))
        ((e)localObject).wB(paramInt - i);
    }
    label274: if (((e)localObject).aaF > paramInt)
      ((e)localObject).wB(Math.max(paramInt - 3, 0));
    while (true)
    {
      label295: ((e)localObject).aaF = paramInt;
      ab.d("MicroMsg.ImagePreviewUI", "onItemSelected, pos = ".concat(String.valueOf(paramInt)));
      localObject = com.tencent.mm.plugin.gallery.model.e.NB(str);
      if ((ImagePreviewUI.u(this.mRu).getVisibility() == 0) || (ImagePreviewUI.v(this.mRu).getVisibility() == 0))
      {
        ImagePreviewUI.a(this.mRu, str, (GalleryItem.MediaItem)localObject);
        ImagePreviewUI.a(this.mRu, (GalleryItem.MediaItem)localObject);
      }
      AppMethodBeat.o(21511);
      return;
      if (((e)localObject).aaF < paramInt)
        ((e)localObject).wB(paramInt + 3);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.13
 * JD-Core Version:    0.6.2
 */