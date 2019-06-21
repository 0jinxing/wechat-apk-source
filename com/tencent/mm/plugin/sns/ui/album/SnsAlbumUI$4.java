package com.tencent.mm.plugin.sns.ui.album;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.SnsUserUI;

final class SnsAlbumUI$4
  implements View.OnClickListener
{
  SnsAlbumUI$4(SnsAlbumUI paramSnsAlbumUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(39989);
    paramView = new Intent(this.rFN.getActivity(), SnsUserUI.class);
    paramView.putExtra("sns_userName", SnsAlbumUI.b(this.rFN));
    this.rFN.getActivity().startActivity(paramView);
    AppMethodBeat.o(39989);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI.4
 * JD-Core Version:    0.6.2
 */