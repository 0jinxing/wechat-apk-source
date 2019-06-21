package com.tencent.mm.plugin.appbrand.wxawidget.console;

import android.os.Bundle;
import android.os.Parcelable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.d.a;
import com.tencent.mm.ipcinvoker.d.b;
import com.tencent.mm.ipcinvoker.d.e;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.plugin.appbrand.wxawidget.a;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class d
{
  private static final Map<String, List<a>> eGg;
  private static List<a> jpI;
  private static final e jpJ;

  static
  {
    AppMethodBeat.i(11138);
    eGg = new ConcurrentHashMap();
    jpI = new LinkedList();
    jpJ = new e()
    {
    };
    AppMethodBeat.o(11138);
  }

  public static boolean a(a parama)
  {
    AppMethodBeat.i(11135);
    boolean bool;
    if (jpI.contains(parama))
    {
      bool = false;
      AppMethodBeat.o(11135);
      return bool;
    }
    Object localObject;
    e locale;
    com.tencent.mm.ipcinvoker.d locald;
    String str;
    if ((eGg.isEmpty()) && (jpI.isEmpty()))
    {
      localObject = c.jpH;
      locale = jpJ;
      locald = ((com.tencent.mm.ipcinvoker.d.d)localObject).eGv;
      str = ((com.tencent.mm.ipcinvoker.d.d)localObject).ctq;
      if ((str != null) && (str.length() != 0) && (locale != null))
        break label106;
    }
    while (true)
    {
      bool = jpI.add(parama);
      AppMethodBeat.o(11135);
      break;
      label106: localObject = new Bundle();
      ((Bundle)localObject).putString("Token", com.tencent.mm.ipcinvoker.d.ap(locale));
      ((Bundle)localObject).putString("Event", str);
      f.a(locald.eFV, (Parcelable)localObject, d.a.class, locale);
    }
  }

  public static boolean b(a parama)
  {
    AppMethodBeat.i(11136);
    boolean bool = jpI.remove(parama);
    Object localObject;
    e locale;
    String str;
    if ((eGg.isEmpty()) && (jpI.isEmpty()))
    {
      localObject = c.jpH;
      locale = jpJ;
      parama = ((com.tencent.mm.ipcinvoker.d.d)localObject).eGv;
      str = ((com.tencent.mm.ipcinvoker.d.d)localObject).ctq;
      if ((str != null) && (str.length() != 0) && (locale != null))
        break label82;
    }
    while (true)
    {
      AppMethodBeat.o(11136);
      return bool;
      label82: localObject = new Bundle();
      ((Bundle)localObject).putString("Token", com.tencent.mm.ipcinvoker.d.ap(locale));
      ((Bundle)localObject).putString("Event", str);
      f.a(parama.eFV, (Parcelable)localObject, d.b.class, null);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.wxawidget.console.d
 * JD-Core Version:    0.6.2
 */