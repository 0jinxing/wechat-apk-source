package com.tencent.mm.plugin.account.a.b;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;

public final class a
{
  public static boolean O(Context paramContext, String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(73684);
    if (paramString.length() > 16)
    {
      a(paramContext, a.a.gzd);
      AppMethodBeat.o(73684);
    }
    while (true)
    {
      return bool;
      if (bo.amT(paramString))
      {
        h.g(paramContext, 2131302256, 2131302287);
        AppMethodBeat.o(73684);
      }
      else
      {
        if (!bo.amY(paramString))
        {
          if ((paramString.length() >= 8) && (paramString.length() < 16))
            a(paramContext, a.a.gzf);
          while (true)
          {
            AppMethodBeat.o(73684);
            break;
            a(paramContext, a.a.gze);
          }
        }
        bool = true;
        AppMethodBeat.o(73684);
      }
    }
  }

  private static void a(Context paramContext, a.a parama)
  {
    AppMethodBeat.i(73685);
    switch (a.1.gzb[parama.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      AppMethodBeat.o(73685);
      while (true)
      {
        return;
        h.g(paramContext, 2131302285, 2131302287);
        AppMethodBeat.o(73685);
        continue;
        h.g(paramContext, 2131302286, 2131302287);
        AppMethodBeat.o(73685);
        continue;
        h.g(paramContext, 2131304234, 2131296904);
        AppMethodBeat.o(73685);
      }
      h.g(paramContext, 2131304236, 2131296904);
    }
  }

  public static void b(Context paramContext, String paramString, int paramInt, boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(73683);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString);
    localIntent.putExtra("showShare", false);
    localIntent.putExtra("show_bottom", false);
    localIntent.putExtra("needRedirect", false);
    if (!paramBoolean)
      bool = true;
    localIntent.putExtra("neverGetA8Key", bool);
    localIntent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.vxI);
    localIntent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.vxE);
    if (paramInt > 0)
    {
      d.b(paramContext, "webview", ".ui.tools.WebViewUI", localIntent, paramInt);
      AppMethodBeat.o(73683);
    }
    while (true)
    {
      return;
      d.b(paramContext, "webview", ".ui.tools.WebViewUI", localIntent);
      AppMethodBeat.o(73683);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.a.b.a
 * JD-Core Version:    0.6.2
 */