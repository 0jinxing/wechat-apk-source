package com.tencent.mm.plugin.scanner.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.plugin.scanner.util.o;
import com.tencent.mm.plugin.scanner.util.o.a;
import com.tencent.mm.sdk.platformtools.bo;

public final class j
{
  public static String BT(int paramInt)
  {
    String str;
    if (paramInt == 4)
      str = "wxfbc915ff7c30e335";
    while (true)
    {
      return str;
      if (paramInt == 3)
        str = "wx482a4001c37e2b74";
      else
        str = "wxfbc915ff7c30e335";
    }
  }

  public static String a(Context paramContext, o.a parama)
  {
    AppMethodBeat.i(80853);
    j.b localb = new j.b();
    localb.appId = BT(parama.field_functionType);
    localb.title = parama.field_title;
    localb.description = parama.field_source;
    localb.type = 10;
    localb.url = parama.field_shareurl;
    localb.action = "";
    localb.appName = o.T(paramContext, parama.field_type);
    localb.thumburl = parama.field_thumburl;
    localb.fgP = parama.field_type;
    localb.fgQ = o.c(parama);
    paramContext = j.b.a(localb, null, null);
    AppMethodBeat.o(80853);
    return paramContext;
  }

  public static o.a cV(String paramString, int paramInt)
  {
    Object localObject = null;
    AppMethodBeat.i(80854);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(80854);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      int i = o.Wn(paramString);
      if (i == 3)
      {
        paramString = o.cW(paramString, paramInt);
        AppMethodBeat.o(80854);
      }
      else if (i == 4)
      {
        paramString = o.Wq(paramString);
        AppMethodBeat.o(80854);
      }
      else
      {
        AppMethodBeat.o(80854);
        paramString = localObject;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.a.j
 * JD-Core Version:    0.6.2
 */