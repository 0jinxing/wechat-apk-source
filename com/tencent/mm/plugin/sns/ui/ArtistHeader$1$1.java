package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.i;

final class ArtistHeader$1$1
  implements View.OnClickListener
{
  ArtistHeader$1$1(ArtistHeader.1 param1)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(38105);
    ArtistHeader.a(this.rgI.rgH).dismiss();
    AppMethodBeat.o(38105);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.ArtistHeader.1.1
 * JD-Core Version:    0.6.2
 */