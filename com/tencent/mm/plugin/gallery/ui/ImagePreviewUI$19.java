package com.tencent.mm.plugin.gallery.ui;

import android.support.v7.widget.RecyclerView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ImagePreviewUI$19
  implements Runnable
{
  ImagePreviewUI$19(ImagePreviewUI paramImagePreviewUI, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(21518);
    ImagePreviewUI.p(this.mRu).smoothScrollToPosition(this.mRx);
    AppMethodBeat.o(21518);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.19
 * JD-Core Version:    0.6.2
 */