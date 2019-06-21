package com.tencent.mm.plugin.account.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.bind.ui.BindMContactUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.h;

final class RegByMobileSetPwdUI$1
  implements View.OnClickListener
{
  RegByMobileSetPwdUI$1(RegByMobileSetPwdUI paramRegByMobileSetPwdUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(125438);
    paramView = (String)g.RP().Ry().get(6, null);
    if (bo.isNullOrNil(paramView))
    {
      ab.i("MicorMsg.RegByMobileSetPwdUI", "has not bind mobile");
      paramView = new Intent(this.gGK, BindMContactUI.class);
      paramView.putExtra("bind_scene", 4);
      h.a(this.gGK, this.gGK.getString(2131302295), "", this.gGK.getString(2131297625), this.gGK.getString(2131296868), true, new RegByMobileSetPwdUI.1.1(this, paramView), null);
      AppMethodBeat.o(125438);
    }
    while (true)
    {
      return;
      ab.i("MicorMsg.RegByMobileSetPwdUI", "has bind mobile");
      h.a(this.gGK, this.gGK.getString(2131302293, new Object[] { paramView }), "", this.gGK.getString(2131297041), this.gGK.getString(2131296868), true, new RegByMobileSetPwdUI.1.2(this, paramView), null);
      AppMethodBeat.o(125438);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI.1
 * JD-Core Version:    0.6.2
 */