package com.tencent.mm.plugin.gallery.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.gallery.model.c;
import com.tencent.mm.plugin.gallery.model.d.b;
import com.tencent.mm.plugin.gallery.model.e;
import com.tencent.mm.sdk.platformtools.ak;

final class ImagePreviewUI$11
  implements d.b
{
  ImagePreviewUI$11(ImagePreviewUI paramImagePreviewUI, Intent paramIntent)
  {
  }

  public final void NA(String paramString)
  {
    AppMethodBeat.i(21509);
    new ak(this.mRu.getMainLooper()).post(new ImagePreviewUI.11.1(this, paramString));
    e.bBY().b(this);
    AppMethodBeat.o(21509);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.11
 * JD-Core Version:    0.6.2
 */