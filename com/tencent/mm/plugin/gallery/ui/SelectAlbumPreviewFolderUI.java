package com.tencent.mm.plugin.gallery.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.gallery.model.GalleryItem.AlbumItem;
import com.tencent.mm.plugin.gallery.model.GalleryItem.ImageMediaItem;
import com.tencent.mm.plugin.gallery.model.e;
import com.tencent.mm.plugin.gallery.model.i.a;
import com.tencent.mm.plugin.gallery.model.l;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import java.util.ArrayList;
import java.util.LinkedList;

@a(19)
public class SelectAlbumPreviewFolderUI extends MMActivity
  implements i.a
{
  ArrayList<GalleryItem.AlbumItem> mRT;
  private SelectAlbumPreviewFolderUI.a mRU;
  private RecyclerView mRV;
  GalleryItem.AlbumItem mRW;
  private String mRX;

  public SelectAlbumPreviewFolderUI()
  {
    AppMethodBeat.i(21597);
    this.mRT = new ArrayList(10);
    AppMethodBeat.o(21597);
  }

  public final void V(LinkedList<GalleryItem.AlbumItem> paramLinkedList)
  {
    AppMethodBeat.i(21601);
    new ak(Looper.getMainLooper()).post(new SelectAlbumPreviewFolderUI.2(this, paramLinkedList));
    AppMethodBeat.o(21601);
  }

  public final int getLayoutId()
  {
    return 2130970593;
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(21600);
    super.onBackPressed();
    finish();
    AppMethodBeat.o(21600);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(21598);
    super.onCreate(paramBundle);
    e.bBZ().b(this);
    e.bBZ().a(this);
    e.bBZ().bCu();
    this.mRV = ((RecyclerView)findViewById(2131827312));
    this.mRU = new SelectAlbumPreviewFolderUI.a(this, this);
    this.mRV.setLayoutManager(new LinearLayoutManager());
    this.mRV.setAdapter(this.mRU);
    this.mRX = getIntent().getStringExtra("select_folder_name");
    this.mRW = new GalleryItem.AlbumItem("", 0);
    this.mRW.mOh = new GalleryItem.ImageMediaItem();
    setMMTitle(bo.nullAsNil(getString(2131296921)));
    setBackBtn(new SelectAlbumPreviewFolderUI.1(this));
    AppMethodBeat.o(21598);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(21599);
    super.onDestroy();
    e.bBZ().b(this);
    AppMethodBeat.o(21599);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.SelectAlbumPreviewFolderUI
 * JD-Core Version:    0.6.2
 */