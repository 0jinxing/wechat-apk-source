package com.tencent.mm.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.i;
import android.support.v4.app.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AlbumUI$a extends l
{
  public AlbumUI$a(AlbumUI paramAlbumUI, i parami)
  {
    super(parami);
  }

  public final int getCount()
  {
    return 2;
  }

  public final Fragment getItem(int paramInt)
  {
    AppMethodBeat.i(29108);
    MMFragment localMMFragment = AlbumUI.a(this.yer, paramInt);
    AppMethodBeat.o(29108);
    return localMMFragment;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.AlbumUI.a
 * JD-Core Version:    0.6.2
 */