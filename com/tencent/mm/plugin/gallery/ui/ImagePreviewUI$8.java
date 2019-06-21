package com.tencent.mm.plugin.gallery.ui;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;

final class ImagePreviewUI$8
  implements Runnable
{
  ImagePreviewUI$8(ImagePreviewUI paramImagePreviewUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(21503);
    int i = (int)ah.getContext().getResources().getDimension(2131427776);
    int j = this.mRu.getResources().getDisplayMetrics().widthPixels / 7;
    ImagePreviewUI.p(this.mRu).getLayoutParams().height = (i * 2 + j);
    ImagePreviewUI.p(this.mRu).smoothScrollToPosition(ImagePreviewUI.g(this.mRu).intValue());
    AppMethodBeat.o(21503);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.8
 * JD-Core Version:    0.6.2
 */