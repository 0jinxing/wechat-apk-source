package com.tencent.mm.app.plugin;

import android.net.Uri;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.f;
import com.tencent.mm.pluginsdk.e;
import com.tencent.mm.pluginsdk.ui.applet.m;
import com.tencent.mm.pluginsdk.ui.e.g;
import com.tencent.mm.pluginsdk.v;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;

@URISpanHandlerSet.a(Cn=URISpanHandlerSet.PRIORITY.LOW)
class URISpanHandlerSet$DeeplinkUriSpanHandler extends URISpanHandlerSet.BaseUriSpanHandler
{
  URISpanHandlerSet$DeeplinkUriSpanHandler(URISpanHandlerSet paramURISpanHandlerSet)
  {
    super(paramURISpanHandlerSet);
  }

  final int[] Cm()
  {
    return new int[] { 30 };
  }

  final boolean a(m paramm, g paramg)
  {
    AppMethodBeat.i(15650);
    ab.i("MicroMsg.URISpanHandlerSet", "DeeplinkUriSpanHandler handleSpanClick %d, %s", new Object[] { Integer.valueOf(paramm.type), paramm.url });
    if (paramg != null);
    for (paramg = (String)paramg.a(paramm); ; paramg = null)
    {
      String str;
      boolean bool;
      if (paramm.type == 30)
      {
        str = bo.nullAsNil(paramm.url);
        if ((str.startsWith("weixin://shieldBrandMsg/")) || (str.startsWith("weixin://receiveBrandMsg/")))
          if (bo.isNullOrNil(paramg))
          {
            ab.e("MicroMsg.URISpanHandlerSet", "DeeplinkUriSpanHandler username is null");
            AppMethodBeat.o(15650);
            bool = true;
          }
      }
      while (true)
      {
        return bool;
        paramm = f.qX(paramg);
        if (paramm == null)
        {
          ab.e("MicroMsg.URISpanHandlerSet", "DeeplinkUriSpanHandler BizInfo is null");
          AppMethodBeat.o(15650);
          bool = true;
        }
        else
        {
          if (str.startsWith("weixin://shieldBrandMsg/"))
            h.a(URISpanHandlerSet.a(this.cgy), 2131304032, 2131297061, 2131304031, 2131297773, new URISpanHandlerSet.DeeplinkUriSpanHandler.1(this, paramm, str, paramg), null);
          while (true)
          {
            AppMethodBeat.o(15650);
            bool = true;
            break;
            if (str.startsWith("weixin://receiveBrandMsg/"))
            {
              h.a(URISpanHandlerSet.a(this.cgy), 2131304030, 2131297061, 2131304029, 2131297773, new URISpanHandlerSet.DeeplinkUriSpanHandler.2(this, paramm, str, paramg), null);
              continue;
              if (e.s(Uri.parse(str)))
              {
                e.A(URISpanHandlerSet.a(this.cgy), paramg, str);
              }
              else
              {
                if (str.startsWith("weixin://receiveWeAppKFMsg"))
                {
                  if (bo.isNullOrNil(paramg))
                  {
                    ab.e("MicroMsg.URISpanHandlerSet", "DeeplinkUriSpanHandler username is null, handle the BUILTIN_RECEIVE_WEAPP_KFMSG ,  the herfUrl is %s", new Object[] { str });
                    AppMethodBeat.o(15650);
                    bool = true;
                    break;
                  }
                  h.a(URISpanHandlerSet.a(this.cgy), 2131296816, 2131297061, 2131296815, 2131297773, new URISpanHandlerSet.DeeplinkUriSpanHandler.3(this, paramg), null);
                  continue;
                }
                e.a(URISpanHandlerSet.a(this.cgy), str, paramg, 1, str, null);
              }
            }
          }
          AppMethodBeat.o(15650);
          bool = false;
        }
      }
    }
  }

  final boolean a(String paramString, boolean paramBoolean, v paramv, Bundle paramBundle)
  {
    boolean bool1 = false;
    AppMethodBeat.i(15651);
    boolean bool2;
    if ((bo.isNullOrNil(paramString)) || (paramBundle == null))
      if (paramString == null)
      {
        paramBoolean = true;
        if (paramBundle != null)
          break label77;
        bool2 = true;
        label35: ab.e("MicroMsg.URISpanHandlerSet", "url is null ? %b, paramsBundle is null ? %b", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(bool2) });
        AppMethodBeat.o(15651);
        paramBoolean = bool1;
      }
    while (true)
    {
      return paramBoolean;
      paramBoolean = false;
      break;
      label77: bool2 = false;
      break label35;
      if (e.s(Uri.parse(paramString)))
      {
        int i = paramBundle.getInt("key_scene", -1);
        ab.d("MicroMsg.URISpanHandlerSet", "DeeplinkUriSpanHandler jump, %d, %s", new Object[] { Integer.valueOf(i), paramString });
        int j = i;
        if (i == -1)
          j = 5;
        paramv = h.b(URISpanHandlerSet.a(this.cgy), "", true, null);
        e.a(URISpanHandlerSet.a(this.cgy), paramString, j, new URISpanHandlerSet.DeeplinkUriSpanHandler.4(this, paramv));
        AppMethodBeat.o(15651);
        paramBoolean = true;
      }
      else
      {
        AppMethodBeat.o(15651);
        paramBoolean = bool1;
      }
    }
  }

  final m dr(String paramString)
  {
    AppMethodBeat.i(15649);
    ab.i("MicroMsg.URISpanHandlerSet", "DeeplinkUriSpanHandler getHrefFromUrl %s", new Object[] { paramString });
    if (paramString.trim().toLowerCase().startsWith("weixin://"))
    {
      paramString = new m(paramString, 30, null);
      AppMethodBeat.o(15649);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(15649);
      paramString = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.plugin.URISpanHandlerSet.DeeplinkUriSpanHandler
 * JD-Core Version:    0.6.2
 */