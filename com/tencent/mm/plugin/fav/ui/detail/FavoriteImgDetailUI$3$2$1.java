package com.tencent.mm.plugin.fav.ui.detail;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.g;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

final class FavoriteImgDetailUI$3$2$1
  implements DialogInterface.OnClickListener
{
  FavoriteImgDetailUI$3$2$1(FavoriteImgDetailUI.3.2 param2)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(74379);
    paramDialogInterface = h.b(this.mmq.mmp.mmn.mController.ylL, this.mmq.mmp.mmn.getString(2131296882), false, null);
    b.a(FavoriteImgDetailUI.b(this.mmq.mmp.mmn).field_localId, new FavoriteImgDetailUI.3.2.1.1(this, paramDialogInterface));
    AppMethodBeat.o(74379);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI.3.2.1
 * JD-Core Version:    0.6.2
 */