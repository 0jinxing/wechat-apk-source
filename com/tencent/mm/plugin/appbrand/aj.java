package com.tencent.mm.plugin.appbrand;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.widget.Toast;
import com.tencent.mm.af.l;
import com.tencent.mm.g.a.se;
import com.tencent.mm.g.a.se.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.base.model.c;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public abstract class aj extends com.tencent.mm.plugin.w.a
{
  protected void dx(boolean paramBoolean)
  {
  }

  public void l(Context paramContext, Intent paramIntent)
  {
    if (!z(paramIntent))
      dx(false);
    while (true)
    {
      return;
      dx(true);
      m(paramContext, paramIntent);
    }
  }

  protected void m(Context paramContext, Intent paramIntent)
  {
    String str1 = c.decrypt(w.n(paramIntent, "id"));
    String str2 = c.decrypt(w.n(paramIntent, "ext_info"));
    int i = w.a(paramIntent, "ext_info_1", 0);
    se localse = new se();
    localse.cOf.appId = str2;
    localse.cOf.userName = str1;
    localse.cOf.cOi = i;
    localse.cOf.scene = y(paramIntent);
    localse.cOf.cOl = true;
    localse.cOf.context = paramContext;
    localse.cOf.cOm = false;
    com.tencent.mm.sdk.b.a.xxA.m(localse);
    if (localse.cOg.cOw)
      ab.i("MiroMsg.WxaShortcutEntry", "open wxa with id : %s", new Object[] { str1 });
    while (true)
    {
      return;
      if (i == 1)
        Toast.makeText(paramContext, 2131296588, 0).show();
      else if (i == 2)
        Toast.makeText(paramContext, 2131296729, 0).show();
    }
  }

  protected abstract int y(Intent paramIntent);

  protected boolean z(Intent paramIntent)
  {
    boolean bool = false;
    Object localObject = c.decrypt(w.n(paramIntent, "id"));
    String str1 = c.decrypt(w.n(paramIntent, "ext_info"));
    String str2 = w.n(paramIntent, "token");
    int i = w.a(paramIntent, "ext_info_1", 0);
    if ((TextUtils.isEmpty((CharSequence)localObject)) || (TextUtils.isEmpty(str1)) || (TextUtils.isEmpty(str2)))
      ab.e("MiroMsg.WxaShortcutEntry", "jump to Wxa failed, username or appId or token is null or nil.");
    while (true)
    {
      return bool;
      if (!l.mg((String)localObject))
      {
        ab.e("MiroMsg.WxaShortcutEntry", "jump to Wxa failed, username %s invalid ", new Object[] { localObject });
        e.pXa.a(647L, 1L, 1L, false);
      }
      else
      {
        paramIntent = new StringBuilder();
        g.RN();
        if (!str2.equals(c.db(str1, com.tencent.mm.kernel.a.QF())))
        {
          paramIntent = ah.getContext().getSharedPreferences("app_brand_global_sp", 0);
          if (paramIntent == null)
          {
            ab.w("MiroMsg.WxaShortcutEntry", "jump to Wxa failed, sp is null.");
          }
          else
          {
            localObject = paramIntent.getStringSet("uin_set", new HashSet());
            if ((localObject == null) || (((Set)localObject).isEmpty()))
            {
              ab.w("MiroMsg.WxaShortcutEntry", "jump to Wxa failed, uin set is null or nil.");
            }
            else
            {
              paramIntent = new HashSet();
              localObject = ((Set)localObject).iterator();
              while (((Iterator)localObject).hasNext())
                paramIntent.add(c.db(str1, (String)((Iterator)localObject).next()));
              if (!paramIntent.contains(str2))
                ab.e("MiroMsg.WxaShortcutEntry", "jump to Wxa failed, illegal token(%s).", new Object[] { str2 });
            }
          }
        }
        else if ((!b.dnO()) && (i == 1))
        {
          ab.i("MiroMsg.WxaShortcutEntry", "can not open testing WeApp in released WeChat.");
        }
        else
        {
          bool = true;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.aj
 * JD-Core Version:    0.6.2
 */