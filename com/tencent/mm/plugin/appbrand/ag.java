package com.tencent.mm.plugin.appbrand;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.bw;
import com.tencent.mm.g.a.bw.b;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.service.d;
import com.tencent.mm.plugin.base.model.c;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.w;

public final class ag extends aj
{
  protected final void dx(boolean paramBoolean)
  {
    AppMethodBeat.i(129168);
    if (!paramBoolean)
      h.pYm.a(443L, 3L, 1L, false);
    AppMethodBeat.o(129168);
  }

  public final int getType()
  {
    return 1;
  }

  public final void l(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(129167);
    h.pYm.a(443L, 2L, 1L, false);
    super.l(paramContext, paramIntent);
    AppMethodBeat.o(129167);
  }

  protected final void m(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(129169);
    super.m(paramContext, paramIntent);
    String str = c.decrypt(w.n(paramIntent, "id"));
    int i = w.a(paramIntent, "ext_info_1", 0);
    Object localObject1 = w.n(paramIntent, "digest");
    WxaAttributes localWxaAttributes;
    if (!TextUtils.isEmpty((CharSequence)localObject1))
    {
      localWxaAttributes = ((d)com.tencent.mm.kernel.g.K(d.class)).zb(str);
      if (localWxaAttributes == null)
      {
        ab.e("MiroMsg.WxaLauncherShortcutEntry", "no such WeApp(%s)", new Object[] { str });
        AppMethodBeat.o(129169);
        return;
      }
      localObject2 = localWxaAttributes.field_nickname;
      if (!((String)localObject1).equals(com.tencent.mm.a.g.x(((String)localObject2 + localWxaAttributes.field_roundedSquareIconURL + localWxaAttributes.field_brandIconURL + localWxaAttributes.field_bigHeadURL).getBytes())))
      {
        ab.i("MiroMsg.WxaLauncherShortcutEntry", "update shortcut for wxa(%s)", new Object[] { str });
        if (paramContext != null)
          break label218;
        ab.e("MicroMsg.AppBrandShortcutManager", "remove fail, context or username is null.");
      }
    }
    while (true)
    {
      al.n(new ag.1(this, localWxaAttributes, paramContext, i), 1000L);
      paramIntent.putExtra("type", 0);
      paramIntent.putExtra("id", "");
      AppMethodBeat.o(129169);
      break;
      label218: if (paramIntent == null)
      {
        ab.e("MicroMsg.AppBrandShortcutManager", "remove fail, intent is null");
      }
      else
      {
        localObject2 = new bw();
        ((bw)localObject2).cuV.username = str;
        a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
        if (((bw)localObject2).cuW.bQQ != null)
          break label288;
        ab.e("MicroMsg.AppBrandShortcutManager", "no such WeApp(%s)", new Object[] { str });
      }
    }
    label288: if (TextUtils.isEmpty(((bw)localObject2).cuW.nickname));
    for (Object localObject2 = str; ; localObject2 = ((bw)localObject2).cuW.nickname)
    {
      localObject1 = new Intent("com.android.launcher.action.UNINSTALL_SHORTCUT");
      ((Intent)localObject1).putExtra("android.intent.extra.shortcut.NAME", (String)localObject2);
      ((Intent)localObject1).putExtra("duplicate", false);
      ((Intent)localObject1).putExtra("android.intent.extra.shortcut.INTENT", paramIntent);
      com.tencent.mm.plugin.base.model.b.s(paramContext, (Intent)localObject1);
      ab.i("MicroMsg.AppBrandShortcutManager", "remove shortcut %s", new Object[] { str });
      break;
    }
  }

  protected final int y(Intent paramIntent)
  {
    return 1023;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ag
 * JD-Core Version:    0.6.2
 */