package com.tencent.mm.plugin.sns.ui;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.b;
import com.tencent.mm.plugin.sns.model.g;
import com.tencent.mm.sdk.platformtools.ak;

final class ArtistUI$6
  implements AbsListView.OnScrollListener
{
  ArtistUI$6(ArtistUI paramArtistUI)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    AppMethodBeat.i(38120);
    if (paramInt == 2)
    {
      if ((!this.rgS.rgO.qHJ) && (!this.rgS.rgP.qHJ))
        break label182;
      this.rgS.lda.removeCallbacks(ArtistUI.g(this.rgS));
      this.rgS.lda.removeCallbacks(ArtistUI.h(this.rgS));
      this.rgS.lda.postDelayed(ArtistUI.g(this.rgS), 0L);
      AppMethodBeat.o(38120);
    }
    while (true)
    {
      return;
      if ((this.rgS.rgO.qHJ) && (this.rgS.rgP.qHJ))
      {
        AppMethodBeat.o(38120);
      }
      else
      {
        this.rgS.lda.removeCallbacks(ArtistUI.g(this.rgS));
        this.rgS.lda.removeCallbacks(ArtistUI.h(this.rgS));
        this.rgS.lda.postDelayed(ArtistUI.h(this.rgS), 0L);
        label182: AppMethodBeat.o(38120);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.ArtistUI.6
 * JD-Core Version:    0.6.2
 */