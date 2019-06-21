package com.tencent.mm.plugin.sns.ui.album;

import android.support.v4.app.FragmentActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SnsAlbumUI$2
  implements MenuItem.OnMenuItemClickListener
{
  SnsAlbumUI$2(SnsAlbumUI paramSnsAlbumUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(39987);
    if (this.rFN.getActivity() != null)
      this.rFN.getActivity().finish();
    AppMethodBeat.o(39987);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI.2
 * JD-Core Version:    0.6.2
 */