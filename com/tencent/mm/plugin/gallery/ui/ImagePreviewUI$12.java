package com.tencent.mm.plugin.gallery.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.gallery.model.e;
import com.tencent.mm.plugin.gallery.model.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class ImagePreviewUI$12
  implements Runnable
{
  ImagePreviewUI$12(ImagePreviewUI paramImagePreviewUI, long paramLong)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(21510);
    ImagePreviewUI.a(this.mRu, true);
    e.bCa().wp(-8);
    ab.v("MicroMsg.ImagePreviewUI", "test oncreate post: %d", new Object[] { Long.valueOf(bo.az(this.mRw)) });
    AppMethodBeat.o(21510);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.12
 * JD-Core Version:    0.6.2
 */