package com.tencent.mm.plugin.fav.ui.detail;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.g;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

final class FavoriteFileDetailUI$16$2$2
  implements DialogInterface.OnClickListener
{
  FavoriteFileDetailUI$16$2$2(FavoriteFileDetailUI.16.2 param2)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(74341);
    paramDialogInterface = h.b(this.mmf.mme.mlX.mController.ylL, this.mmf.mme.mlX.getString(2131296882), false, null);
    b.a(FavoriteFileDetailUI.b(this.mmf.mme.mlX).field_localId, new FavoriteFileDetailUI.16.2.2.1(this, paramDialogInterface));
    AppMethodBeat.o(74341);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI.16.2.2
 * JD-Core Version:    0.6.2
 */