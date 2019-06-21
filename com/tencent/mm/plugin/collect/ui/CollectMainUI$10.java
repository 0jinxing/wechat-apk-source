package com.tencent.mm.plugin.collect.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.collect.model.f.a;
import com.tencent.mm.plugin.wallet_core.id_verify.util.a;
import com.tencent.mm.protocal.protobuf.oy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

final class CollectMainUI$10
  implements f.a
{
  CollectMainUI$10(CollectMainUI paramCollectMainUI)
  {
  }

  public final void a(boolean paramBoolean, oy paramoy)
  {
    AppMethodBeat.i(41262);
    Object localObject;
    if (paramoy == null)
    {
      localObject = "null";
      ab.i("MicroMsg.CollectMainUI", "get from cgi: %s resp.retcode: %s", new Object[] { Boolean.valueOf(paramBoolean), localObject });
      if (!paramBoolean)
        break label409;
      if ((paramoy == null) || (paramoy.kCl != 416))
        break label186;
      if (paramoy.vWf != null)
        break label181;
      paramBoolean = true;
      label61: ab.d("MicroMsg.CollectMainUI", "realNameInfo:%s", new Object[] { Boolean.valueOf(paramBoolean) });
      CollectMainUI.t(this.kHl).setVisibility(4);
      CollectMainUI.a(this.kHl, true);
      Bundle localBundle = new Bundle();
      localBundle.putString("realname_verify_process_jump_activity", ".ui.CollectMainUI");
      localBundle.putString("realname_verify_process_jump_plugin", "collect");
      localObject = this.kHl;
      int i = paramoy.kCl;
      paramoy = paramoy.vWf;
      new CollectMainUI.10.1(this);
      a.a((Activity)localObject, i, paramoy, localBundle, 1010);
      AppMethodBeat.o(41262);
    }
    while (true)
    {
      return;
      localObject = Integer.valueOf(paramoy.kCl);
      break;
      label181: paramBoolean = false;
      break label61;
      label186: CollectMainUI.v(this.kHl);
      CollectMainUI.t(this.kHl).setVisibility(0);
      CollectMainUI.a(this.kHl, false);
      this.kHl.kGD = paramoy.url;
      this.kHl.kGE = paramoy.twd;
      CollectMainUI.a(this.kHl, paramoy.pPV);
      CollectMainUI.b(this.kHl, paramoy.pPW);
      CollectMainUI.a(this.kHl, paramoy.pPX);
      CollectMainUI.c(this.kHl, paramoy.vWc);
      CollectMainUI.a(this.kHl, paramoy.vVZ);
      this.kHl.bq(paramoy.vVY);
      CollectMainUI.b(this.kHl, paramoy.vWd);
      CollectMainUI.a(this.kHl, paramoy.vWe);
      ab.d("MicroMsg.CollectMainUI", "flag: %s", new Object[] { Integer.valueOf(CollectMainUI.b(this.kHl)) });
      g.RQ();
      g.RP().Ry().set(ac.a.xTG, Integer.valueOf(CollectMainUI.w(this.kHl)));
      g.RQ();
      g.RP().Ry().set(ac.a.xTH, CollectMainUI.a(this.kHl));
      this.kHl.refreshView();
      label409: AppMethodBeat.o(41262);
    }
  }

  public final void dz(String paramString1, String paramString2)
  {
    AppMethodBeat.i(41261);
    ab.i("MicroMsg.CollectMainUI", "get cache: %s, %s", new Object[] { paramString1, paramString2 });
    CollectMainUI.t(this.kHl).setVisibility(0);
    this.kHl.kGD = paramString1;
    this.kHl.kGE = paramString2;
    paramString2 = CollectMainUI.bhD();
    paramString1 = CollectMainUI.bhE();
    CollectMainUI.a(this.kHl, paramString2);
    this.kHl.bq(paramString1);
    if (CollectMainUI.u(this.kHl) == 1)
    {
      paramString1 = this.kHl;
      g.RQ();
      CollectMainUI.a(paramString1, ((Integer)g.RP().Ry().get(ac.a.xTG, Integer.valueOf(-1))).intValue());
      paramString1 = this.kHl;
      g.RQ();
      CollectMainUI.a(paramString1, (String)g.RP().Ry().get(ac.a.xTH, ""));
    }
    AppMethodBeat.o(41261);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.CollectMainUI.10
 * JD-Core Version:    0.6.2
 */