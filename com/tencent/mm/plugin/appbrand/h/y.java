package com.tencent.mm.plugin.appbrand.h;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.wx_extension.a.a;
import com.tencent.mm.ipcinvoker.wx_extension.a.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.c;
import java.util.Map;

public final class y
{
  private static int aGY()
  {
    AppMethodBeat.i(73187);
    Object localObject = a.b.eGM;
    localObject = a.ll("100377");
    int i;
    if (localObject == null)
    {
      ab.i("MicroMsg.AppBrand.JsRuntimeABTests", "getJsRuntimeControlVal item is null");
      AppMethodBeat.o(73187);
      i = 0;
    }
    while (true)
    {
      return i;
      if (!((c)localObject).isValid())
      {
        ab.i("MicroMsg.AppBrand.JsRuntimeABTests", "getJsRuntimeControlVal item not valid");
        AppMethodBeat.o(73187);
        i = 0;
      }
      else
      {
        i = bo.getInt((String)((c)localObject).dru().get("JsRuntime"), 0);
        ab.i("MicroMsg.AppBrand.JsRuntimeABTests", "getJsRuntimeControlVal:%d", new Object[] { Integer.valueOf(i) });
        AppMethodBeat.o(73187);
      }
    }
  }

  private static int aGZ()
  {
    AppMethodBeat.i(73188);
    Object localObject = a.b.eGM;
    localObject = a.ll("100377");
    if ((localObject != null) && (((c)localObject).isValid()));
    for (int i = bo.getInt((String)((c)localObject).dru().get("isolateContextLibVersion"), 2147483647); ; i = 2147483647)
    {
      AppMethodBeat.o(73188);
      return i;
    }
  }

  public static boolean oV(int paramInt)
  {
    AppMethodBeat.i(73186);
    int i = aGZ();
    if ((aGY() == 2) && (paramInt >= i));
    for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.AppBrand.JsRuntimeABTests", "supportLibVer:%d currentLibVer:%d userNodeJS:%b", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt), Boolean.valueOf(bool) });
      AppMethodBeat.o(73186);
      return bool;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.h.y
 * JD-Core Version:    0.6.2
 */