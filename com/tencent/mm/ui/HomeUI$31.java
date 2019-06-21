package com.tencent.mm.ui;

import android.os.Bundle;
import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.plugin.messenger.foundation.a.o;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.Map;

final class HomeUI$31
  implements o
{
  HomeUI$31(HomeUI paramHomeUI)
  {
  }

  public final void onNewXmlReceived(String paramString, Map<String, String> paramMap, e.a parama)
  {
    AppMethodBeat.i(29378);
    int i;
    if ((ah.nullAsNil(paramString).equals("showprivacypolicy")) && (paramMap != null))
    {
      paramString = (String)paramMap.get(".sysmsg.showprivacypolicy.device_id");
      HomeUI.a(this.yjm, (String)paramMap.get(".sysmsg.showprivacypolicy.doublecheck_content"));
      HomeUI.b(this.yjm, (String)paramMap.get(".sysmsg.showprivacypolicy.doublecheck_ok"));
      HomeUI.c(this.yjm, (String)paramMap.get(".sysmsg.showprivacypolicy.doublecheck_cancel"));
      boolean bool1 = "yes".equals(paramMap.get(".sysmsg.showprivacypolicy.needbirthday"));
      boolean bool2 = "yes".equals(paramMap.get(".sysmsg.showprivacypolicy.needopenplatform"));
      boolean bool3 = "yes".equals(paramMap.get(".sysmsg.showprivacypolicy.needconfirm"));
      g.RP().Ry().set(ac.a.xVe, Boolean.valueOf(bool1));
      g.RP().Ry().set(ac.a.xVf, Boolean.valueOf(bool2));
      g.RP().Ry().set(ac.a.xVg, Boolean.valueOf(bool3));
      paramMap = com.tencent.mm.bt.b.bI(q.LM().getBytes());
      paramMap.Lv(16);
      paramMap = Base64.encodeToString(paramMap.toByteArray(), 2);
      ab.i("MicroMsg.LauncherUI.HomeUI", "deviceId:%s, localDeviceId:%s, doubleCheckContent:%s, doubleCheckOk:%s, doubleCheckCancel:%s, needBirthday:%s, needOpenPlatform:%s, needConfirm:%s", new Object[] { paramString, paramMap, HomeUI.y(this.yjm), HomeUI.A(this.yjm), HomeUI.z(this.yjm), Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3) });
      if ((ah.isNullOrNil(paramString)) || (paramString.equals(paramMap)))
      {
        paramMap = g.RP().Ry().get(274436, "").toString();
        paramString = HomeUI.b(this.yjm);
        parama = aa.dor();
        if (bool2)
        {
          i = 1;
          paramString = paramString.getString(2131305909, new Object[] { parama, paramMap, "login", Integer.valueOf(1), Integer.valueOf(i) });
          if (!com.tencent.mm.au.b.sO(paramMap))
            break label536;
          ab.i("MicroMsg.LauncherUI.HomeUI", "eu true, needconfirm: %s", new Object[] { Boolean.valueOf(bool3) });
          if (bool3)
            break label500;
          paramMap = new Bundle();
          paramMap.putString("close_dialog_msg", HomeUI.y(this.yjm));
          paramMap.putString("close_dialog_cancel", HomeUI.z(this.yjm));
          paramMap.putString("close_dialog_ok", HomeUI.A(this.yjm));
          paramMap.putBoolean("close_dialog_ok_close", false);
          HomeUI.a(this.yjm, paramString, 22722, paramMap);
          label477: com.tencent.mm.ui.base.b.hN(HomeUI.b(this.yjm));
          AppMethodBeat.o(29378);
        }
      }
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label500: HomeUI.a(this.yjm, paramString, 22722, HomeUI.b(this.yjm).getString(2131305903, new Object[] { aa.dor() }));
      break label477;
      label536: ab.i("MicroMsg.LauncherUI.HomeUI", "eu false");
      paramMap = new Bundle();
      paramMap.putString("close_dialog_msg", HomeUI.b(this.yjm).getString(2131300944));
      paramMap.putString("close_dialog_cancel", HomeUI.b(this.yjm).getString(2131301053));
      paramMap.putString("close_dialog_ok", HomeUI.b(this.yjm).getString(2131300946));
      paramMap.putBoolean("close_dialog_ok_close", false);
      HomeUI.a(this.yjm, paramString, 22722, paramMap);
      break label477;
      ab.i("MicroMsg.LauncherUI.HomeUI", "device id not match");
      AppMethodBeat.o(29378);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.HomeUI.31
 * JD-Core Version:    0.6.2
 */