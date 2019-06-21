package com.tencent.mm.plugin.gallery.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ImagePreviewUI$27$1
  implements Runnable
{
  ImagePreviewUI$27$1(ImagePreviewUI.27 param27, Intent paramIntent, boolean paramBoolean1, boolean paramBoolean2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(21526);
    ImagePreviewUI.a(this.mRB.mRu, this.val$intent, this.mRz, this.mRA);
    AppMethodBeat.o(21526);
  }

  public final String toString()
  {
    AppMethodBeat.i(21527);
    String str = super.toString() + "|addTextOptionMenu";
    AppMethodBeat.o(21527);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.27.1
 * JD-Core Version:    0.6.2
 */