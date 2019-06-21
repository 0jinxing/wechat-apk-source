package com.tencent.mm.plugin.gallery.ui;

import android.support.v7.widget.RecyclerView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ImagePreviewUI$20
  implements Runnable
{
  ImagePreviewUI$20(ImagePreviewUI paramImagePreviewUI, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(21519);
    ImagePreviewUI.p(this.mRu).smoothScrollToPosition(this.mRy);
    AppMethodBeat.o(21519);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.20
 * JD-Core Version:    0.6.2
 */