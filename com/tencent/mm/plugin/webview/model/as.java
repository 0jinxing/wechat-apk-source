package com.tencent.mm.plugin.webview.model;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.b;
import com.tencent.mm.ah.h;
import com.tencent.mm.ah.i;
import com.tencent.mm.ah.o;
import com.tencent.mm.aj.z;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.base.model.c;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class as extends com.tencent.mm.plugin.w.a
{
  public static String unx = "";

  public final int getType()
  {
    return 2;
  }

  public final void l(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(6801);
    final String str1 = c.decrypt(w.n(paramIntent, "id"));
    final String str2 = c.decrypt(w.n(paramIntent, "ext_info"));
    Object localObject1 = w.n(paramIntent, "token");
    if ((TextUtils.isEmpty(str1)) || (TextUtils.isEmpty(str2)) || (TextUtils.isEmpty((CharSequence)localObject1)))
    {
      ab.e("MicroMsg.WebViewShortcutEntry", "jump to webview  failed, username or appId or token is null or nil.");
      AppMethodBeat.o(6801);
    }
    while (true)
    {
      return;
      Object localObject2 = new StringBuilder();
      com.tencent.mm.kernel.g.RN();
      Object localObject3;
      if (!((String)localObject1).equals(at.db(str2, com.tencent.mm.kernel.a.QF())))
      {
        localObject2 = ah.getContext().getSharedPreferences("app_brand_global_sp", 0);
        if (localObject2 == null)
        {
          ab.w("MicroMsg.WebViewShortcutEntry", "jump to webview failed, sp is null.");
          AppMethodBeat.o(6801);
        }
        else
        {
          localObject3 = ((SharedPreferences)localObject2).getStringSet("uin_set", new HashSet());
          if ((localObject3 == null) || (((Set)localObject3).isEmpty()))
          {
            ab.w("MicroMsg.WebViewShortcutEntry", "jump to webview failed, uin set is null or nil.");
            AppMethodBeat.o(6801);
          }
          else
          {
            localObject2 = new HashSet();
            localObject3 = ((Set)localObject3).iterator();
            while (((Iterator)localObject3).hasNext())
              ((Set)localObject2).add(c.db(str2, (String)((Iterator)localObject3).next()));
            if (!((Set)localObject2).contains(localObject1))
            {
              ab.e("MicroMsg.WebViewShortcutEntry", "jump to webview failed, illegal token(%s).", new Object[] { localObject1 });
              Toast.makeText(paramContext, paramContext.getString(2131305713), 1).show();
              AppMethodBeat.o(6801);
            }
          }
        }
      }
      else
      {
        paramIntent.putExtra("type", 0);
        paramIntent.putExtra("id", "");
        localObject2 = "https://game.weixin.qq.com/cgi-bin/h5/static/gameloading/index.html?wegame_ssid=25&appid=".concat(String.valueOf(str2));
        localObject1 = localObject2;
        if (!bo.isNullOrNil(unx))
          localObject1 = (String)localObject2 + "&" + unx;
        localObject2 = new Intent();
        ((Intent)localObject2).putExtra("rawUrl", (String)localObject1);
        ((Intent)localObject2).putExtra("from_shortcut", true);
        ((Intent)localObject2).putExtra("game_hv_menu_appid", str2);
        ((Intent)localObject2).addFlags(67108864);
        ((Intent)localObject2).addFlags(268435456);
        d.b(paramContext, "webview", ".ui.tools.game.H5GameWebViewUI", (Intent)localObject2);
        z.afd().qB(str1);
        localObject2 = w.n(paramIntent, "digest");
        if (TextUtils.isEmpty((CharSequence)localObject2))
        {
          ab.i("MicroMsg.WebViewShortcutEntry", "digest is null");
          AppMethodBeat.o(6801);
        }
        else
        {
          localObject1 = ((j)com.tencent.mm.kernel.g.K(j.class)).XM().aoO(str1);
          if ((localObject1 == null) || (bo.isNullOrNil(((ad)localObject1).Oi())))
          {
            ab.i("MicroMsg.WebViewShortcutEntry", "no need update, displayName is null");
            AppMethodBeat.o(6801);
          }
          else
          {
            localObject1 = ((ad)localObject1).Oi();
            localObject3 = o.act().qo(str1);
            if ((localObject3 == null) || (bo.isNullOrNil(((h)localObject3).acl())))
            {
              ab.i("MicroMsg.WebViewShortcutEntry", "no need update, imgFlag is null");
              AppMethodBeat.o(6801);
            }
            else if (((String)localObject2).equals(com.tencent.mm.a.g.x(((String)localObject1 + ((h)localObject3).acl()).getBytes())))
            {
              ab.i("MicroMsg.WebViewShortcutEntry", "no need update, digest is same");
              AppMethodBeat.o(6801);
            }
            else
            {
              localObject2 = b.a(str1, false, -1);
              if ((localObject2 == null) || (((Bitmap)localObject2).isRecycled()))
              {
                ab.i("MicroMsg.WebViewShortcutEntry", "icon is not downloaded, next time update");
                AppMethodBeat.o(6801);
              }
              else
              {
                ab.i("MicroMsg.WebViewShortcutEntry", "update shortcut, displayName = %s", new Object[] { localObject1 });
                at.f(paramContext, str1, str2, c.decrypt(w.n(paramIntent, "ext_info_1")));
                al.n(new Runnable()
                {
                  public final void run()
                  {
                    AppMethodBeat.i(6800);
                    at.a(ah.getContext(), str1, str2, null);
                    AppMethodBeat.o(6800);
                  }
                }
                , 1000L);
                AppMethodBeat.o(6801);
              }
            }
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.as
 * JD-Core Version:    0.6.2
 */