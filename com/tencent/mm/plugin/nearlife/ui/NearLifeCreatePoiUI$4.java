package com.tencent.mm.plugin.nearlife.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.nearlife.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.LinkedList;

final class NearLifeCreatePoiUI$4
  implements MenuItem.OnMenuItemClickListener
{
  NearLifeCreatePoiUI$4(NearLifeCreatePoiUI paramNearLifeCreatePoiUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(22975);
    com.tencent.mm.plugin.report.service.h.pYm.e(11138, new Object[] { "2", "0", NearLifeCreatePoiUI.b(this.oSJ) });
    paramMenuItem = this.oSJ;
    Object localObject = this.oSJ.mController.ylL;
    this.oSJ.getString(2131301711);
    NearLifeCreatePoiUI.a(paramMenuItem, com.tencent.mm.ui.base.h.b((Context)localObject, this.oSJ.getString(2131301712), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        AppMethodBeat.i(22974);
        aw.Rg().c(NearLifeCreatePoiUI.c(NearLifeCreatePoiUI.4.this.oSJ));
        AppMethodBeat.o(22974);
      }
    }));
    NearLifeCreatePoiUI.a(this.oSJ, NearLifeCreatePoiUI.d(this.oSJ).getText().toString());
    NearLifeCreatePoiUI.b(this.oSJ, NearLifeCreatePoiUI.e(this.oSJ).getText().toString());
    NearLifeCreatePoiUI.c(this.oSJ, NearLifeCreatePoiUI.f(this.oSJ).getText().toString());
    paramMenuItem = ((EditText)this.oSJ.findViewById(2131826286)).getText().toString();
    localObject = NearLifeCreatePoiUI.g(this.oSJ);
    NearLifeCreatePoiUI.a(this.oSJ, new b(NearLifeCreatePoiUI.h(this.oSJ), NearLifeCreatePoiUI.i(this.oSJ), NearLifeCreatePoiUI.j(this.oSJ), NearLifeCreatePoiUI.k(this.oSJ), ((LinkedList)localObject).size(), (LinkedList)localObject, paramMenuItem));
    aw.Rg().a(NearLifeCreatePoiUI.c(this.oSJ), 0);
    ab.d("MicroMsg.NearLifeCreatePoiUI", "do scene start");
    AppMethodBeat.o(22975);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearlife.ui.NearLifeCreatePoiUI.4
 * JD-Core Version:    0.6.2
 */