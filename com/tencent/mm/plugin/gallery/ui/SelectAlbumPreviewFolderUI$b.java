package com.tencent.mm.plugin.gallery.ui;

import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SelectAlbumPreviewFolderUI$b extends RecyclerView.v
{
  public TextView gnC;
  public ImageView mOX;
  public TextView mQi;
  public ImageView mQj;
  public View mRR;
  public ImageView moY;

  public SelectAlbumPreviewFolderUI$b(SelectAlbumPreviewFolderUI paramSelectAlbumPreviewFolderUI, View paramView)
  {
    super(paramView);
    AppMethodBeat.i(21596);
    this.mRR = paramView;
    this.mOX = ((ImageView)this.mRR.findViewById(2131827239));
    this.gnC = ((TextView)this.mRR.findViewById(2131827240));
    this.moY = ((ImageView)this.mRR.findViewById(2131825005));
    this.mQi = ((TextView)this.mRR.findViewById(2131827241));
    this.mQj = ((ImageView)this.mRR.findViewById(2131827242));
    AppMethodBeat.o(21596);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.SelectAlbumPreviewFolderUI.b
 * JD-Core Version:    0.6.2
 */