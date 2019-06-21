package com.tencent.mm.plugin.gallery.ui;

import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.LinkedList;

final class SelectAlbumPreviewFolderUI$2
  implements Runnable
{
  SelectAlbumPreviewFolderUI$2(SelectAlbumPreviewFolderUI paramSelectAlbumPreviewFolderUI, LinkedList paramLinkedList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(21591);
    SelectAlbumPreviewFolderUI.a(this.mRY).addAll(this.mRZ);
    SelectAlbumPreviewFolderUI.b(this.mRY).aop.notifyChanged();
    AppMethodBeat.o(21591);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.SelectAlbumPreviewFolderUI.2
 * JD-Core Version:    0.6.2
 */