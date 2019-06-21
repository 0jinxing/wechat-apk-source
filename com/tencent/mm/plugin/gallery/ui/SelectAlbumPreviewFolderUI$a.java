package com.tencent.mm.plugin.gallery.ui;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView.a;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.gallery.model.GalleryItem.AlbumItem;
import java.util.ArrayList;

final class SelectAlbumPreviewFolderUI$a extends RecyclerView.a<SelectAlbumPreviewFolderUI.b>
  implements View.OnClickListener
{
  Context mContext;

  public SelectAlbumPreviewFolderUI$a(SelectAlbumPreviewFolderUI paramSelectAlbumPreviewFolderUI, Context paramContext)
  {
    this.mContext = paramContext;
  }

  public final int getItemCount()
  {
    AppMethodBeat.i(21592);
    int i = SelectAlbumPreviewFolderUI.a(this.mRY).size();
    AppMethodBeat.o(21592);
    return i + 1;
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(21593);
    Intent localIntent = new Intent(this.mRY, AlbumPreviewUI.class);
    localIntent.putExtra("select_folder_name", (GalleryItem.AlbumItem)paramView.getTag());
    localIntent.setFlags(67108864);
    this.mRY.setResult(-1, localIntent);
    this.mRY.finish();
    AppMethodBeat.o(21593);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.SelectAlbumPreviewFolderUI.a
 * JD-Core Version:    0.6.2
 */