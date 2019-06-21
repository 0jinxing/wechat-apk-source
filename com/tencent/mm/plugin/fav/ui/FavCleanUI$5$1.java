package com.tencent.mm.plugin.fav.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fav.ui.widget.a;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.List;

final class FavCleanUI$5$1
  implements DialogInterface.OnClickListener
{
  FavCleanUI$5$1(FavCleanUI.5 param5)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(73956);
    long l = FavCleanUI.e(this.mhX.mhW).bwc();
    paramDialogInterface = FavCleanUI.e(this.mhX.mhW).hk(true);
    Object localObject = FavCleanUI.f(this.mhX.mhW);
    ((a)localObject).mpx += l;
    com.tencent.mm.plugin.fav.a.b.in(com.tencent.mm.plugin.fav.a.b.buj() - l);
    if (paramDialogInterface.isEmpty())
      AppMethodBeat.o(73956);
    while (true)
    {
      return;
      com.tencent.mm.plugin.report.service.h.pYm.e(14110, new Object[] { Integer.valueOf(FavCleanUI.g(this.mhX.mhW)), Integer.valueOf(paramDialogInterface.size()), Integer.valueOf((int)(l * 1.0D / 1024.0D)) });
      localObject = com.tencent.mm.ui.base.h.b(this.mhX.mhW.mController.ylL, this.mhX.mhW.getString(2131299595), false, null);
      g.RS().aa(new FavCleanUI.5.1.1(this, paramDialogInterface, (Dialog)localObject));
      com.tencent.mm.plugin.report.service.h.pYm.e(11125, new Object[] { Integer.valueOf(paramDialogInterface.size()), Integer.valueOf(3) });
      AppMethodBeat.o(73956);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavCleanUI.5.1
 * JD-Core Version:    0.6.2
 */