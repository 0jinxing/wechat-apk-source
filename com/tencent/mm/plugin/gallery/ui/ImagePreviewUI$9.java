package com.tencent.mm.plugin.gallery.ui;

import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.gallery.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MMViewPager;
import com.tencent.mm.ui.base.u;
import java.util.HashMap;
import java.util.Queue;

final class ImagePreviewUI$9
  implements f.b
{
  ImagePreviewUI$9(ImagePreviewUI paramImagePreviewUI)
  {
  }

  public final void X(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(21506);
    ab.i("MicroMsg.ImagePreviewUIChangelcai", "[onItemMoved] fromPos:%s, toPos:%s,visiblePos:%s, mPosition:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), ImagePreviewUI.g(this.mRu) });
    if (!ImagePreviewUI.q(this.mRu))
    {
      a.swap(ImagePreviewUI.s(this.mRu), paramInt1, paramInt2);
      c localc = ImagePreviewUI.h(this.mRu);
      int i = ImagePreviewUI.g(this.mRu).intValue();
      ab.i("MicroMsg.ImageAdapter", "[swapPosition]from:%s to:%s curPos:%s visiblePos:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(i), Integer.valueOf(paramInt3) });
      if (!localc.mQm)
      {
        a.swap(localc.mQl, paramInt1, paramInt2);
        localc.mQo = paramInt3;
        localc.mQp = ((View)localc.yyL.get(i));
        localc.yyJ.remove(localc.mQp);
        localc.yyK.clear();
        localc.yyL.clear();
        localc.mQq = true;
        localc.notifyDataSetChanged();
      }
      ImagePreviewUI.r(this.mRu).setCurrentItem(paramInt3, false);
      ((f)ImagePreviewUI.p(this.mRu).getAdapter()).el(paramInt3, paramInt3);
      com.tencent.mm.plugin.gallery.model.e.mNR = true;
      AppMethodBeat.o(21506);
    }
    while (true)
    {
      return;
      a.swap(ImagePreviewUI.d(this.mRu), paramInt1, paramInt2);
      com.tencent.mm.plugin.gallery.model.e.mNP = true;
      AppMethodBeat.o(21506);
    }
  }

  public final void ek(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(21505);
    ab.i("MicroMsg.ImagePreviewUIChangelcai", "[onItemMove]fromPos:%s, toPos:%s, mPosition:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), ImagePreviewUI.g(this.mRu) });
    AppMethodBeat.o(21505);
  }

  public final void wC(int paramInt)
  {
    AppMethodBeat.i(21504);
    ab.i("MicroMsg.ImagePreviewUI", "[onItemClick] position:%s %s", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(ImagePreviewUI.q(this.mRu)) });
    ((f)ImagePreviewUI.p(this.mRu).getAdapter()).el(paramInt, paramInt);
    ImagePreviewUI.r(this.mRu).setCurrentItem(paramInt, false);
    if (!ImagePreviewUI.q(this.mRu))
    {
      com.tencent.mm.plugin.gallery.model.e.mNS = true;
      AppMethodBeat.o(21504);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.gallery.model.e.mNQ = true;
      AppMethodBeat.o(21504);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.9
 * JD-Core Version:    0.6.2
 */