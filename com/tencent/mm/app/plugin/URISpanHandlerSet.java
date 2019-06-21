package com.tencent.mm.app.plugin;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.bp.d;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.u;
import com.tencent.mm.model.v.b;
import com.tencent.mm.model.y;
import com.tencent.mm.model.z;
import com.tencent.mm.plugin.setting.model.j;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
import com.tencent.mm.pluginsdk.ui.applet.m;
import com.tencent.mm.pluginsdk.ui.e.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.appbrand.b;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.a.e.c;

class URISpanHandlerSet
{
  Context mContext;

  public URISpanHandlerSet(Context paramContext)
  {
    AppMethodBeat.i(15722);
    this.mContext = null;
    if (paramContext == null);
    for (paramContext = ah.getContext(); ; paramContext = this.mContext)
    {
      this.mContext = paramContext;
      AppMethodBeat.o(15722);
      return;
    }
  }

  @URISpanHandlerSet.a
  class AAUriSpanHandler extends URISpanHandlerSet.BaseUriSpanHandler
  {
    AAUriSpanHandler()
    {
      super();
    }

    final int[] Cm()
    {
      return new int[] { 35, 36, 37 };
    }

    final boolean a(m paramm, g paramg)
    {
      AppMethodBeat.i(15631);
      String str;
      boolean bool;
      Object localObject1;
      if (paramm.type == 35)
        try
        {
          str = Uri.parse(paramm.url).getQueryParameter("billno");
          if (bo.isNullOrNil(str))
          {
            ab.e("MicroMsg.URISpanHandlerSet", "url error, billno is null");
            bool = true;
            AppMethodBeat.o(15631);
          }
          while (true)
          {
            return bool;
            if ((paramm.data instanceof Bundle));
            for (paramg = ((Bundle)paramm.data).getString("chatroom_name"); ; paramg = paramm.data.toString())
            {
              localObject1 = new android/content/Intent;
              ((Intent)localObject1).<init>();
              ((Intent)localObject1).putExtra("bill_no", str);
              ((Intent)localObject1).putExtra("enter_scene", 3);
              ((Intent)localObject1).putExtra("chatroom", paramg);
              d.b(URISpanHandlerSet.a(URISpanHandlerSet.this), "aa", ".ui.PaylistAAUI", (Intent)localObject1);
              bool = true;
              AppMethodBeat.o(15631);
              break;
              if (!(paramm.data instanceof String))
                break label163;
            }
            label163: ab.e("MicroMsg.URISpanHandlerSet", "illegal data type, %s", new Object[] { paramm });
            bool = true;
            AppMethodBeat.o(15631);
          }
        }
        catch (Exception paramg)
        {
          while (true)
            ab.e("MicroMsg.URISpanHandlerSet", "handle click new aa open detail link error: %s, url: %s", new Object[] { paramg.getMessage(), paramm.url });
        }
      if (paramm.type == 37);
      while (true)
        while (true)
        {
          long l;
          Object localObject2;
          try
          {
            paramg = Uri.parse(paramm.url).getQueryParameter("billno");
            if (bo.isNullOrNil(paramg))
            {
              ab.e("MicroMsg.URISpanHandlerSet", "url error, billno is null");
              bool = true;
              AppMethodBeat.o(15631);
              break;
            }
            if (!(paramm.data instanceof Bundle))
            {
              ab.e("MicroMsg.URISpanHandlerSet", "error data!");
              bool = true;
              AppMethodBeat.o(15631);
              break;
            }
            localObject1 = (Bundle)paramm.data;
            str = ((Bundle)localObject1).getString("chatroom_name");
            if (bo.isNullOrNil(str))
            {
              ab.e("MicroMsg.URISpanHandlerSet", "empty chatroom!");
              bool = true;
              AppMethodBeat.o(15631);
              break;
            }
            l = ((Bundle)localObject1).getLong("msg_id", -1L);
            if (l < 0L)
            {
              ab.e("MicroMsg.URISpanHandlerSet", "msgId is null");
              bool = true;
              AppMethodBeat.o(15631);
              break;
            }
            localObject1 = URISpanHandlerSet.a(URISpanHandlerSet.this);
            localObject2 = new com/tencent/mm/app/plugin/URISpanHandlerSet$AAUriSpanHandler$1;
            ((URISpanHandlerSet.AAUriSpanHandler.1)localObject2).<init>(this, paramg, str, l);
            h.a((Context)localObject1, 2131303885, -1, 2131303888, 2131297773, (DialogInterface.OnClickListener)localObject2, null);
            bool = false;
            AppMethodBeat.o(15631);
          }
          catch (Exception paramg)
          {
            ab.e("MicroMsg.URISpanHandlerSet", "handle click new aa close link error: %s, url: %s", new Object[] { paramg.getMessage(), paramm.url });
            continue;
          }
          if (paramm.type == 36)
            try
            {
              str = Uri.parse(paramm.url).getQueryParameter("billno");
              if (bo.isNullOrNil(str))
              {
                ab.e("MicroMsg.URISpanHandlerSet", "url error, billno is null");
                bool = true;
                AppMethodBeat.o(15631);
                break;
              }
              paramg = null;
              if ((paramm.data instanceof Bundle))
                paramg = (Bundle)paramm.data;
              if ((paramg == null) || (bo.isNullOrNil(paramg.getString("chatroom_name"))))
              {
                ab.e("MicroMsg.URISpanHandlerSet", "empty chatroom!");
                bool = true;
                AppMethodBeat.o(15631);
                break;
              }
              localObject1 = paramg.getString("chatroom_name");
              l = paramg.getLong("msg_id", -1L);
              paramg = URISpanHandlerSet.a(URISpanHandlerSet.this);
              localObject2 = new com/tencent/mm/app/plugin/URISpanHandlerSet$AAUriSpanHandler$2;
              ((URISpanHandlerSet.AAUriSpanHandler.2)localObject2).<init>(this, str, (String)localObject1, l);
              h.a(paramg, 2131303886, -1, 2131303887, 2131297773, (DialogInterface.OnClickListener)localObject2, null);
            }
            catch (Exception paramg)
            {
              ab.e("MicroMsg.URISpanHandlerSet", "handle click new aa urge notify link error: %s, url: %s", new Object[] { paramg.getMessage(), paramm.url });
            }
        }
    }

    final boolean a(String paramString, boolean paramBoolean, com.tencent.mm.pluginsdk.v paramv, Bundle paramBundle)
    {
      return false;
    }

    final m dr(String paramString)
    {
      AppMethodBeat.i(15630);
      if (paramString.trim().toLowerCase().startsWith("weixin://weixinnewaa/opendetail"))
      {
        paramString = new m(paramString, 35, null);
        AppMethodBeat.o(15630);
      }
      while (true)
      {
        return paramString;
        if (paramString.trim().toLowerCase().startsWith("weixin://weixinnewaa/closeurgenotify"))
        {
          paramString = new m(paramString, 36, null);
          AppMethodBeat.o(15630);
        }
        else if (paramString.trim().toLowerCase().startsWith("weixin://weixinnewaa/closeaa"))
        {
          paramString = new m(paramString, 37, null);
          AppMethodBeat.o(15630);
        }
        else
        {
          AppMethodBeat.o(15630);
          paramString = null;
        }
      }
    }
  }

  @URISpanHandlerSet.a
  class FeedbackUriSpanHandler extends URISpanHandlerSet.BaseUriSpanHandler
  {
    FeedbackUriSpanHandler()
    {
      super();
    }

    final int[] Cm()
    {
      return new int[] { 34 };
    }

    final boolean a(m paramm, g paramg)
    {
      boolean bool = true;
      AppMethodBeat.i(15658);
      if (paramm.type == 34)
      {
        paramg = paramm.url.trim().replace("weixin://feedback/next/", "");
        ab.d("MicroMsg.URISpanHandlerSet", "FeedbackUriSpanHandler, url:%s, content:%s", new Object[] { paramm.url, paramg });
        aw.Rg().a(new j(q.Mc(), paramg, 8), 0);
        AppMethodBeat.o(15658);
      }
      while (true)
      {
        return bool;
        AppMethodBeat.o(15658);
        bool = false;
      }
    }

    final boolean a(String paramString, boolean paramBoolean, com.tencent.mm.pluginsdk.v paramv, Bundle paramBundle)
    {
      return false;
    }

    final m dr(String paramString)
    {
      AppMethodBeat.i(15657);
      if (paramString.trim().startsWith("weixin://feedback/next/"))
      {
        paramString = new m(paramString, 34, null);
        AppMethodBeat.o(15657);
      }
      while (true)
      {
        return paramString;
        AppMethodBeat.o(15657);
        paramString = null;
      }
    }
  }

  @URISpanHandlerSet.a
  class HttpUriSpanHandler extends URISpanHandlerSet.BaseUriSpanHandler
  {
    HttpUriSpanHandler()
    {
      super();
    }

    final int[] Cm()
    {
      return new int[] { 1 };
    }

    final boolean a(m paramm, g paramg)
    {
      boolean bool = true;
      AppMethodBeat.i(15674);
      int i;
      if (paramm.type == 1)
        if ((URISpanHandlerSet.a(URISpanHandlerSet.this) != null) && ((URISpanHandlerSet.a(URISpanHandlerSet.this) instanceof WebViewUI)))
        {
          i = 1;
          paramm.au(y.class);
          if ((i != 0) && (!ah.bqo()))
            break label465;
        }
      label392: label437: label465: for (Object localObject1 = z.ag("@" + paramm.url, URISpanHandlerSet.a(URISpanHandlerSet.this).getString(2131300424)); ; localObject1 = null)
      {
        if (paramg != null);
        for (String str1 = (String)paramg.a(paramm); ; str1 = null)
        {
          Object localObject2;
          if ((localObject1 == null) || (!((y)localObject1).enable))
          {
            localObject2 = paramm.url;
            localObject1 = localObject2;
            if (!((String)localObject2).toLowerCase().startsWith("http"))
              localObject1 = "http://".concat(String.valueOf(localObject2));
            localObject2 = new Intent();
            ((Intent)localObject2).putExtra("rawUrl", (String)localObject1);
            if ((paramm.data != null) && ((paramm.data instanceof Integer)))
              ((Intent)localObject2).putExtra("geta8key_scene", ((Integer)paramm.data).intValue());
            String str2 = paramm.hcl;
            if (!bo.isNullOrNil(str2))
            {
              Object localObject3 = com.tencent.mm.model.v.Zp().nV(str2);
              if (localObject3 != null)
              {
                String str3 = ((v.b)localObject3).getString("prePublishId", null);
                localObject1 = ((v.b)localObject3).getString("preUsername", null);
                localObject3 = ((v.b)localObject3).getString("preChatName", null);
                ((Intent)localObject2).putExtra("reportSessionId", str2);
                ((Intent)localObject2).putExtra("KPublisherId", str3);
                ((Intent)localObject2).putExtra("geta8key_username", (String)localObject3);
                ((Intent)localObject2).putExtra("pre_username", (String)localObject1);
                ((Intent)localObject2).putExtra("prePublishId", str3);
                ((Intent)localObject2).putExtra("preUsername", (String)localObject1);
                ((Intent)localObject2).putExtra("preChatName", (String)localObject3);
                ((Intent)localObject2).putExtra("preChatTYPE", u.ad((String)localObject1, (String)localObject3));
              }
            }
            if (bo.isNullOrNil(str1))
            {
              str1 = null;
              label369: ((Intent)localObject2).putExtra("geta8key_username", str1);
              if (i == 0)
                break label437;
              ((Intent)localObject2).addFlags(268435456);
              d.b(URISpanHandlerSet.a(URISpanHandlerSet.this), "webview", ".ui.tools.WebViewUI", (Intent)localObject2);
            }
          }
          else
          {
            if (paramg != null)
              paramg.b(paramm);
            AppMethodBeat.o(15674);
          }
          while (true)
          {
            return bool;
            i = 0;
            break;
            break label369;
            ((Intent)localObject2).addFlags(536870912);
            break label392;
            AppMethodBeat.o(15674);
            bool = false;
          }
        }
      }
    }

    final boolean a(String paramString, boolean paramBoolean, com.tencent.mm.pluginsdk.v paramv, Bundle paramBundle)
    {
      return false;
    }

    final m dr(String paramString)
    {
      AppMethodBeat.i(15673);
      if (paramString.trim().toLowerCase().startsWith("http"));
      for (paramString = new m(paramString, 1, null); ; paramString = null)
      {
        AppMethodBeat.o(15673);
        return paramString;
      }
    }
  }

  @URISpanHandlerSet.a
  class SettingPluginQQMsgUriSpanHandler extends URISpanHandlerSet.BaseUriSpanHandler
  {
    SettingPluginQQMsgUriSpanHandler()
    {
      super();
    }

    final int[] Cm()
    {
      return new int[] { 13 };
    }

    final boolean a(m paramm, g paramg)
    {
      return false;
    }

    final boolean a(String paramString, boolean paramBoolean, com.tencent.mm.pluginsdk.v paramv, Bundle paramBundle)
    {
      return false;
    }

    final m dr(String paramString)
    {
      AppMethodBeat.i(15708);
      if (paramString.trim().startsWith("weixin://setting/plugin/qqmsg"))
      {
        paramString = new m(paramString, 13, null);
        AppMethodBeat.o(15708);
      }
      while (true)
      {
        return paramString;
        AppMethodBeat.o(15708);
        paramString = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.plugin.URISpanHandlerSet
 * JD-Core Version:    0.6.2
 */