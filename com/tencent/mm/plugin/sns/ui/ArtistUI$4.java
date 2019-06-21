package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ArtistUI$4 extends f.b
{
  ArtistUI$4(ArtistUI paramArtistUI)
  {
  }

  public final void DM(int paramInt)
  {
    AppMethodBeat.i(38116);
    Intent localIntent = new Intent();
    localIntent.putExtra("sns_gallery_is_artist", true);
    localIntent.putExtra("sns_gallery_position", paramInt);
    localIntent.putExtra("sns_gallery_artist_lan", ArtistUI.b(this.rgS));
    localIntent.putExtra("sns_gallery_showtype", 2);
    localIntent.setClass(this.rgS, ArtistBrowseUI.class);
    this.rgS.startActivity(localIntent);
    AppMethodBeat.o(38116);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.ArtistUI.4
 * JD-Core Version:    0.6.2
 */