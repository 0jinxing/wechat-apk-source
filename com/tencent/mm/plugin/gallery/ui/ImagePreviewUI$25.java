package com.tencent.mm.plugin.gallery.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ImagePreviewUI$25
  implements View.OnClickListener
{
  ImagePreviewUI$25(ImagePreviewUI paramImagePreviewUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(21524);
    ImagePreviewUI.c(this.mRu).performClick();
    AppMethodBeat.o(21524);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.25
 * JD-Core Version:    0.6.2
 */