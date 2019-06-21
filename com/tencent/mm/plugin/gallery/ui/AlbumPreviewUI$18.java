package com.tencent.mm.plugin.gallery.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class AlbumPreviewUI$18
  implements View.OnClickListener
{
  AlbumPreviewUI$18(AlbumPreviewUI paramAlbumPreviewUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(21413);
    AlbumPreviewUI.x(this.mPO);
    AlbumPreviewUI.y(this.mPO).bCE();
    ab.d("MicroMsg.AlbumPreviewUI", "click folder times[%d]", new Object[] { Integer.valueOf(AlbumPreviewUI.z(this.mPO)) });
    AppMethodBeat.o(21413);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.18
 * JD-Core Version:    0.6.2
 */