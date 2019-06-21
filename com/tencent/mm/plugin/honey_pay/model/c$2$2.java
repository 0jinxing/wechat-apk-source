package com.tencent.mm.plugin.honey_pay.model;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.honey_pay.ui.HoneyPayCheckPwdUI;
import com.tencent.mm.protocal.protobuf.bbd;
import com.tencent.mm.protocal.protobuf.btn;
import com.tencent.mm.protocal.protobuf.chl;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.wallet_core.ui.e;
import java.io.IOException;
import java.util.LinkedList;

final class c$2$2
  implements n.d
{
  c$2$2(c.2 param2)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(41754);
    paramMenuItem = (bbd)this.nqS.nqO.wVw.get(paramInt);
    Intent localIntent;
    if (!bo.isNullOrNil(paramMenuItem.url))
      if ((paramMenuItem.url.equals("weixin://wcpay/honeypay/unbind")) && (!bo.isNullOrNil(this.nqS.nqP)) && (this.nqS.nqQ != null))
      {
        ab.i("MicroMsg.HoneyPayUtil", "go to unbind");
        localIntent = new Intent(this.nqS.icV, HoneyPayCheckPwdUI.class);
        localIntent.putExtra("key_scene", 3);
        localIntent.putExtra("key_card_no", this.nqS.nqP);
      }
    while (true)
    {
      try
      {
        localIntent.putExtra("key_toke_mess", this.nqS.nqQ.toByteArray());
        this.nqS.icV.startActivityForResult(localIntent, this.nqS.nqR);
        AppMethodBeat.o(41754);
        return;
      }
      catch (IOException paramMenuItem)
      {
        ab.printErrStackTrace("MicroMsg.HoneyPayUtil", paramMenuItem, "", new Object[0]);
        continue;
      }
      e.n(this.nqS.icV, paramMenuItem.url, false);
      AppMethodBeat.o(41754);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.model.c.2.2
 * JD-Core Version:    0.6.2
 */