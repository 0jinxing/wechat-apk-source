package com.tencent.mm.plugin.gallery.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AlbumPreviewUI$13
  implements View.OnClickListener
{
  AlbumPreviewUI$13(AlbumPreviewUI paramAlbumPreviewUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(21408);
    AlbumPreviewUI.c(this.mPO).performClick();
    AppMethodBeat.o(21408);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.13
 * JD-Core Version:    0.6.2
 */