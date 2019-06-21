package com.tencent.mm.plugin.fav.ui.detail;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.g;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

final class FavoriteVoiceDetailUI$2$2$1
  implements DialogInterface.OnClickListener
{
  FavoriteVoiceDetailUI$2$2$1(FavoriteVoiceDetailUI.2.2 param2)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(74481);
    paramDialogInterface = h.b(this.mnl.mnk.mnj.mController.ylL, this.mnl.mnk.mnj.getString(2131296882), false, null);
    long l1 = FavoriteVoiceDetailUI.a(this.mnl.mnk.mnj).field_localId;
    long l2 = FavoriteVoiceDetailUI.a(this.mnl.mnk.mnj).field_id;
    b.a(FavoriteVoiceDetailUI.a(this.mnl.mnk.mnj).field_localId, new FavoriteVoiceDetailUI.2.2.1.1(this, paramDialogInterface, l1, l2));
    AppMethodBeat.o(74481);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteVoiceDetailUI.2.2.1
 * JD-Core Version:    0.6.2
 */