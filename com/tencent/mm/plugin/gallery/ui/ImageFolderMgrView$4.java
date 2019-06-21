package com.tencent.mm.plugin.gallery.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class ImageFolderMgrView$4
  implements Runnable
{
  ImageFolderMgrView$4(ImageFolderMgrView paramImageFolderMgrView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(21475);
    ImageFolderMgrView.d(this.mQF).notifyDataSetChanged();
    AppMethodBeat.o(21475);
  }

  public final String toString()
  {
    AppMethodBeat.i(21476);
    String str = super.toString() + "|onQueryAlbumFinished";
    AppMethodBeat.o(21476);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView.4
 * JD-Core Version:    0.6.2
 */