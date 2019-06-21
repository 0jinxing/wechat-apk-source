package com.tencent.mm.plugin.account.ui;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.account.model.c.a;
import com.tencent.mm.plugin.s.a;
import com.tencent.mm.pluginsdk.model.app.d;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.pluginsdk.model.app.w;
import com.tencent.mm.pluginsdk.model.app.w.1;
import com.tencent.mm.pluginsdk.model.app.w.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;

final class SimpleLoginUI$11
  implements c.a
{
  SimpleLoginUI$11(SimpleLoginUI paramSimpleLoginUI)
  {
  }

  public final void aqC()
  {
    String str = null;
    AppMethodBeat.i(125606);
    w localw = new w(this.gIp, new SimpleLoginUI.11.1(this));
    Object localObject1 = ah.doB();
    if (localObject1 != null)
    {
      localObject1 = ((SharedPreferences)localObject1).getString("key_app_ids_registion_while_not_login", "");
      if (bo.isNullOrNil((String)localObject1))
        ab.i("MicroMsg.AppUtil", "no saved appids while not login");
    }
    else
    {
      localObject1 = null;
    }
    Object localObject2;
    while (true)
    {
      localObject2 = str;
      if (localObject1 == null)
        break label238;
      localObject2 = str;
      if (((LinkedList)localObject1).isEmpty())
        break label238;
      localObject2 = new LinkedList();
      localObject1 = ((LinkedList)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        str = (String)((Iterator)localObject1).next();
        localObject3 = g.bT(str, false);
        if ((localObject3 == null) || (((f)localObject3).field_status == 0))
          ((LinkedList)localObject2).add(str);
      }
      Object localObject3 = ((String)localObject1).split("\\|");
      if ((localObject3 == null) || (localObject3.length <= 0))
        break;
      localObject1 = new LinkedList();
      int i = localObject3.length;
      int j = 0;
      int m;
      for (int k = 1; j < i; k = m)
      {
        localObject2 = localObject3[j];
        m = k;
        if (!bo.isNullOrNil((String)localObject2))
        {
          ((LinkedList)localObject1).add(localObject2);
          m = k + 1;
        }
        if (m > 5)
          break;
        j++;
      }
    }
    label238: if ((localObject2 == null) || (((LinkedList)localObject2).isEmpty()))
    {
      ab.i("MicroMsg.LoadAppInfoAfterLogin", "no saved appids, just callback");
      p.dhI();
      if (localw.vcm != null)
        localw.vcm.arL();
      AppMethodBeat.o(125606);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.LoadAppInfoAfterLogin", "now do batch get appinfos, appid liSst size is :%d", new Object[] { Integer.valueOf(((LinkedList)localObject2).size()) });
      a.bYM().a(7, localw);
      a.bYI().aC((LinkedList)localObject2);
      if ((localw.mContext != null) && (!((Activity)localw.mContext).isFinishing()))
      {
        localObject1 = localw.mContext;
        localw.mContext.getString(2131297061);
        localw.tipDialog = com.tencent.mm.ui.base.h.b((Context)localObject1, localw.mContext.getString(2131297086), true, new w.1(localw));
        AppMethodBeat.o(125606);
      }
      else
      {
        if (localw.vcm != null)
          localw.vcm.arL();
        ab.e("MicroMsg.LoadAppInfoAfterLogin", "dz[loadAppInfo:catch the null window for progress bar");
        AppMethodBeat.o(125606);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.SimpleLoginUI.11
 * JD-Core Version:    0.6.2
 */