package com.tencent.mm.plugin.honey_pay.ui;

import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.protocal.protobuf.bkc;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.n.d;
import java.util.List;

final class HoneyPayCardManagerUI$6
  implements n.d
{
  HoneyPayCardManagerUI$6(HoneyPayCardManagerUI paramHoneyPayCardManagerUI, List paramList)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(41798);
    HoneyPayCardManagerUI.a(this.nrS, (Bankcard)this.nrU.get(paramInt));
    ab.i(this.nrS.TAG, "select bankcard: %s, %s", new Object[] { HoneyPayCardManagerUI.h(this.nrS).field_bindSerial, HoneyPayCardManagerUI.h(this.nrS).field_bankcardTypeName });
    HoneyPayCardManagerUI.b(this.nrS, HoneyPayCardManagerUI.c(this.nrS));
    paramMenuItem = new bkc();
    paramMenuItem.wNi = HoneyPayCardManagerUI.h(this.nrS).field_desc;
    paramMenuItem.pbn = HoneyPayCardManagerUI.h(this.nrS).field_bankcardType;
    paramMenuItem.wNk = HoneyPayCardManagerUI.h(this.nrS).field_bindSerial;
    paramMenuItem.wNl = HoneyPayCardManagerUI.h(this.nrS).field_bankcardTail;
    HoneyPayCardManagerUI.a(this.nrS, paramMenuItem);
    HoneyPayCardManagerUI.d(this.nrS);
    HoneyPayCardManagerUI.i(this.nrS);
    AppMethodBeat.o(41798);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardManagerUI.6
 * JD-Core Version:    0.6.2
 */