package com.tencent.mm.plugin.gallery.ui;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.j;

final class ImagePreviewUI$21
  implements Runnable
{
  ImagePreviewUI$21(ImagePreviewUI paramImagePreviewUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(21520);
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)ImagePreviewUI.a(this.mRu).getLayoutParams();
    localMarginLayoutParams.topMargin = ((int)(j.al(this.mRu) + this.mRu.getResources().getDimension(2131427563)));
    ImagePreviewUI.a(this.mRu).setLayoutParams(localMarginLayoutParams);
    AppMethodBeat.o(21520);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.21
 * JD-Core Version:    0.6.2
 */