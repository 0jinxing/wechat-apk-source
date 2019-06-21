package com.tencent.mm.plugin.fav.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.ui.a.b;
import com.tencent.mm.plugin.report.service.h;
import java.util.List;

final class FavoriteIndexUI$5$2
  implements DialogInterface.OnClickListener
{
  FavoriteIndexUI$5$2(FavoriteIndexUI.5 param5)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(74224);
    paramDialogInterface = FavoriteIndexUI.a(this.mkI.mkH).hk(true);
    FavoriteIndexUI.a(this.mkI.mkH, paramDialogInterface);
    h.pYm.e(11125, new Object[] { Integer.valueOf(paramDialogInterface.size()), Integer.valueOf(3) });
    if (FavoriteIndexUI.a(this.mkI.mkH).mlh)
      FavoriteIndexUI.b(this.mkI.mkH);
    AppMethodBeat.o(74224);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavoriteIndexUI.5.2
 * JD-Core Version:    0.6.2
 */