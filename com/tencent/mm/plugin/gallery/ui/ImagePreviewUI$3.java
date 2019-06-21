package com.tencent.mm.plugin.gallery.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ImagePreviewUI$3
  implements View.OnClickListener
{
  ImagePreviewUI$3(ImagePreviewUI paramImagePreviewUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(21500);
    ImagePreviewUI.e(this.mRu).performClick();
    AppMethodBeat.o(21500);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.3
 * JD-Core Version:    0.6.2
 */