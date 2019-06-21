package com.tencent.mm.plugin.gallery.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.gallery.model.e;

final class AlbumPreviewUI$15
  implements View.OnClickListener
{
  AlbumPreviewUI$15(AlbumPreviewUI paramAlbumPreviewUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(21410);
    AlbumPreviewUI.h(this.mPO);
    paramView = new Intent(this.mPO, ImagePreviewUI.class);
    e.B(AlbumPreviewUI.a(this.mPO).mOH);
    paramView.putStringArrayListExtra("preview_image_list", AlbumPreviewUI.a(this.mPO).bCw());
    paramView.putExtra("max_select_count", AlbumPreviewUI.i(this.mPO));
    paramView.putExtra("send_raw_img", AlbumPreviewUI.d(this.mPO));
    paramView.putExtra("GalleryUI_FromUser", AlbumPreviewUI.j(this.mPO));
    paramView.putExtra("GalleryUI_ToUser", AlbumPreviewUI.k(this.mPO));
    this.mPO.startActivityForResult(paramView, 0);
    AppMethodBeat.o(21410);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.15
 * JD-Core Version:    0.6.2
 */