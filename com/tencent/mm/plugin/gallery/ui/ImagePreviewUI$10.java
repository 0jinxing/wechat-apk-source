package com.tencent.mm.plugin.gallery.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.gallery.stub.a;

final class ImagePreviewUI$10
  implements Runnable
{
  ImagePreviewUI$10(ImagePreviewUI paramImagePreviewUI, String paramString)
  {
  }

  public final void run()
  {
    boolean bool1 = true;
    AppMethodBeat.i(21507);
    try
    {
      a locala = ImagePreviewUI.t(this.mRu);
      String str1 = this.bSt;
      String str2 = this.mRu.getIntent().getStringExtra("GalleryUI_ToUser");
      if (ImagePreviewUI.m(this.mRu));
      while (true)
      {
        locala.a(str1, str2, bool1, 0, true);
        AppMethodBeat.o(21507);
        return;
        boolean bool2 = ImagePreviewUI.b(this.mRu);
        if (bool2)
          bool1 = false;
      }
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(21507);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.10
 * JD-Core Version:    0.6.2
 */