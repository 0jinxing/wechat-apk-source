package com.tencent.mm.plugin.fav.ui.detail;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;

final class FavoriteTextDetailUI$2$1
  implements n.c
{
  FavoriteTextDetailUI$2$1(FavoriteTextDetailUI.2 param2)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(74438);
    if (this.mmS.mmR.getIntent().getBooleanExtra("key_detail_can_share_to_friend", true))
      paraml.e(2, this.mmS.mmR.getString(2131299734));
    paraml.e(0, this.mmS.mmR.getString(2131299610));
    paraml.e(1, this.mmS.mmR.getString(2131299722));
    paraml.e(3, this.mmS.mmR.getString(2131299612));
    paraml.e(4, this.mmS.mmR.getString(2131296881));
    AppMethodBeat.o(74438);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteTextDetailUI.2.1
 * JD-Core Version:    0.6.2
 */