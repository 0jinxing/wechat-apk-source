package com.tencent.mm.plugin.setting.ui.qrcode;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.v;
import com.tencent.mm.plugin.account.model.i;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.f.a.c;
import com.tencent.mm.ui.q;

final class ShareToQQUI$2
  implements MenuItem.OnMenuItemClickListener
{
  ShareToQQUI$2(ShareToQQUI paramShareToQQUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(126920);
    ShareToQQUI.a(this.qkA);
    boolean bool1;
    boolean bool2;
    label75: label86: Object localObject;
    if ((ShareToQQUI.b(this.qkA) == 2) || (ShareToQQUI.b(this.qkA) == 1))
    {
      paramMenuItem = ShareToQQUI.c(this.qkA).getText().toString();
      if (ShareToQQUI.b(this.qkA) == 1)
      {
        bool1 = true;
        if (ShareToQQUI.b(this.qkA) != 2)
          break label165;
        bool2 = true;
        paramMenuItem = new v(paramMenuItem, bool1, bool2);
        g.Rg().a(paramMenuItem, 0);
        localObject = this.qkA;
        AppCompatActivity localAppCompatActivity = this.qkA.mController.ylL;
        this.qkA.getString(2131297061);
        ShareToQQUI.a((ShareToQQUI)localObject, com.tencent.mm.ui.base.h.b(localAppCompatActivity, this.qkA.getString(2131297043), true, new ShareToQQUI.2.2(this, paramMenuItem)));
        AppMethodBeat.o(126920);
      }
    }
    while (true)
    {
      return true;
      bool1 = false;
      break;
      label165: bool2 = false;
      break label75;
      if (ShareToQQUI.b(this.qkA) == 4)
      {
        long l = bo.c((Long)g.RP().Ry().get(65831, null));
        localObject = bo.nullAsNil((String)g.RP().Ry().get(65830, null));
        if ((bo.gb(l) > 86400000L) && (((String)localObject).length() > 0))
        {
          paramMenuItem = new c(this.qkA.getString(2131305891));
          paramMenuItem.arX((String)localObject);
          new com.tencent.mm.plugin.account.model.h(paramMenuItem, new i()
          {
            public final void onError(int paramAnonymousInt, String paramAnonymousString)
            {
              AppMethodBeat.i(126918);
              super.onError(paramAnonymousInt, paramAnonymousString);
              AppMethodBeat.o(126918);
            }

            public final void p(Bundle paramAnonymousBundle)
            {
              AppMethodBeat.i(126917);
              super.p(paramAnonymousBundle);
              AppMethodBeat.o(126917);
            }
          }).apm();
        }
        paramMenuItem = new v(ShareToQQUI.c(this.qkA).getText().toString());
        break label86;
      }
      com.tencent.mm.ui.base.h.g(this.qkA.mController.ylL, 2131303490, 2131297061);
      AppMethodBeat.o(126920);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.qrcode.ShareToQQUI.2
 * JD-Core Version:    0.6.2
 */