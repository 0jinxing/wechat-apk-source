package com.tencent.mm.plugin.order.c;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.ui.e;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class c
{
  private static HashMap<String, String> UB(String paramString)
  {
    String[] arrayOfString1 = null;
    AppMethodBeat.i(43934);
    if (paramString == null)
    {
      AppMethodBeat.o(43934);
      paramString = arrayOfString1;
    }
    while (true)
    {
      return paramString;
      int i = paramString.indexOf("action");
      if (i <= 0)
      {
        AppMethodBeat.o(43934);
        paramString = arrayOfString1;
      }
      else
      {
        paramString = paramString.substring(i, paramString.length());
        if (TextUtils.isEmpty(paramString))
        {
          AppMethodBeat.o(43934);
          paramString = arrayOfString1;
        }
        else
        {
          String[] arrayOfString2 = paramString.split("&");
          if (arrayOfString2 == null)
          {
            AppMethodBeat.o(43934);
            paramString = arrayOfString1;
          }
          else
          {
            paramString = new HashMap();
            for (i = 0; i < arrayOfString2.length; i++)
            {
              arrayOfString1 = arrayOfString2[i].split("=");
              if ((arrayOfString1 != null) && (arrayOfString1.length == 2))
                paramString.put(arrayOfString1[0], arrayOfString1[1]);
            }
            AppMethodBeat.o(43934);
          }
        }
      }
    }
  }

  public static void a(Boolean paramBoolean, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(43938);
    if (paramBoolean.booleanValue())
    {
      h.pYm.e(11030, new Object[] { paramString1, "", paramString3, paramString4 });
      AppMethodBeat.o(43938);
    }
    while (true)
    {
      return;
      h.pYm.e(11030, new Object[] { paramString1, paramString2, paramString3, paramString4 });
      AppMethodBeat.o(43938);
    }
  }

  public static void aL(Context paramContext, String paramString)
  {
    AppMethodBeat.i(43937);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString);
    localIntent.putExtra("showShare", false);
    localIntent.putExtra("pay_channel", 1);
    d.b(paramContext, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", localIntent);
    AppMethodBeat.o(43937);
  }

  public static boolean aM(Context paramContext, String paramString)
  {
    AppMethodBeat.i(43935);
    ab.v("MicroMsg.MallUtil", "jumpToUrl:".concat(String.valueOf(paramString)));
    Intent localIntent = new Intent();
    HashMap localHashMap = UB(paramString);
    boolean bool;
    if ((localHashMap != null) && (!localHashMap.isEmpty()))
    {
      paramString = (String)localHashMap.get("action");
      if ((TextUtils.isEmpty(paramString)) || (!isNumeric(paramString)))
      {
        ab.e("MicroMsg.MallUtil", "jumpToUrl illegal action:".concat(String.valueOf(paramString)));
        AppMethodBeat.o(43935);
        bool = false;
      }
    }
    while (true)
    {
      return bool;
      switch (Integer.valueOf(paramString).intValue())
      {
      default:
      case 1:
      case 2:
      case 3:
      case 4:
      }
      while (true)
      {
        AppMethodBeat.o(43935);
        bool = true;
        break;
        localIntent.putExtra("rawUrl", (String)localHashMap.get("3rdurl"));
        localIntent.putExtra("showShare", false);
        localIntent.putExtra("pay_channel", 1);
        d.b(paramContext, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", localIntent);
        continue;
        e.ae(paramContext, (String)localHashMap.get("username"));
        continue;
        localIntent.putExtra("key_func_id", (String)localHashMap.get("functionid"));
        localIntent.putExtra("key_scene", 1);
        d.b(paramContext, "mall", ".ui.MallIndexUI", localIntent);
        continue;
        localIntent.putExtra("key_product_id", (String)localHashMap.get("productid"));
        localIntent.putExtra("key_product_scene", 5);
        d.b(paramContext, "product", ".ui.MallProductUI", localIntent);
        continue;
        if (TextUtils.isEmpty(paramString))
          break label286;
        aL(paramContext, paramString);
      }
      label286: ab.e("MicroMsg.MallUtil", "jumpToUrl illegal url:".concat(String.valueOf(paramString)));
      AppMethodBeat.o(43935);
      bool = false;
    }
  }

  public static void aN(Context paramContext, String paramString)
  {
    AppMethodBeat.i(43936);
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(43936);
    while (true)
    {
      return;
      Intent localIntent = new Intent();
      localIntent.putExtra("key_product_id", paramString);
      localIntent.putExtra("key_product_scene", 5);
      d.b(paramContext, "product", ".ui.MallProductUI", localIntent);
      AppMethodBeat.o(43936);
    }
  }

  public static boolean isNumeric(String paramString)
  {
    AppMethodBeat.i(43933);
    boolean bool = Pattern.compile("[0-9]*").matcher(paramString).matches();
    AppMethodBeat.o(43933);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.c.c
 * JD-Core Version:    0.6.2
 */