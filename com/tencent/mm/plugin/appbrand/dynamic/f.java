package com.tencent.mm.plugin.appbrand.dynamic;

import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.wx_extension.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class f
{
  private static f hlA;
  Map<String, f.b> hlB;
  b.a hlC;

  static
  {
    AppMethodBeat.i(10691);
    hlA = new f();
    AppMethodBeat.o(10691);
  }

  public f()
  {
    AppMethodBeat.i(10685);
    this.hlB = new ConcurrentHashMap();
    this.hlC = new f.1(this);
    AppMethodBeat.o(10685);
  }

  public static f azA()
  {
    return hlA;
  }

  public static void n(int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(10688);
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("isOpenWeappFial", true);
    localBundle.putInt("widgetState", paramInt);
    localBundle.putString("appid", paramString1);
    localBundle.putString("sceneNote", paramString2);
    com.tencent.mm.ipcinvoker.f.a(i.azC().zV(zU(paramString2)), localBundle, f.a.class, null);
    AppMethodBeat.o(10688);
  }

  public static void zT(String paramString)
  {
    AppMethodBeat.i(10687);
    Bundle localBundle = new Bundle();
    paramString = zU(paramString);
    localBundle.putString("id", paramString);
    localBundle.putInt("widgetState", 2109);
    com.tencent.mm.ipcinvoker.f.a(i.azC().zV(paramString), localBundle, f.a.class, null);
    AppMethodBeat.o(10687);
  }

  private static String zU(String paramString)
  {
    AppMethodBeat.i(10689);
    if (TextUtils.isEmpty(paramString))
    {
      paramString = "";
      AppMethodBeat.o(10689);
    }
    while (true)
    {
      return paramString;
      paramString = Pattern.compile(":widgetId=.*:").matcher(paramString);
      if (paramString.matches())
      {
        paramString = paramString.group();
        if (!TextUtils.isEmpty(paramString))
        {
          paramString = paramString.substring(paramString.indexOf("=") + 1, paramString.lastIndexOf(":"));
          AppMethodBeat.o(10689);
        }
      }
      else
      {
        paramString = "";
        AppMethodBeat.o(10689);
      }
    }
  }

  public final boolean aZ(String paramString, int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(10686);
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(10686);
    while (true)
    {
      return bool;
      if (this.hlB.containsKey(paramString))
        break;
      ab.w("MicroMsg.DynamicPageViewStateMonitor", "no keyList exists, widgetId[%s]", new Object[] { paramString });
      AppMethodBeat.o(10686);
    }
    switch (paramInt)
    {
    default:
    case 2103:
    }
    while (true)
    {
      bool = ((f.b)this.hlB.get(paramString)).hlF.add(Integer.valueOf(paramInt));
      AppMethodBeat.o(10686);
      break;
      j.azE().E(paramString, 628, 9);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.f
 * JD-Core Version:    0.6.2
 */