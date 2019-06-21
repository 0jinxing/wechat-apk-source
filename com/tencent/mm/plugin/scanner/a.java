package com.tencent.mm.plugin.scanner;

import android.os.Bundle;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.b;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.kernel.g;
import com.tencent.mm.m.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class a
{
  public static boolean BQ(int paramInt)
  {
    switch (paramInt)
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    case 10:
    case 11:
    case 12:
    case 13:
    case 14:
    case 15:
    case 16:
    case 17:
    }
    for (boolean bool = false; ; bool = true)
      return bool;
  }

  public static boolean BR(int paramInt)
  {
    switch (paramInt)
    {
    default:
    case 19:
    case 20:
    case 21:
    }
    for (boolean bool = false; ; bool = true)
      return bool;
  }

  public static boolean ba(int paramInt, String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(79165);
    if (paramInt != 22)
      AppMethodBeat.o(79165);
    while (true)
    {
      return bool;
      if (!bo.isNullOrNil(paramString))
        break;
      AppMethodBeat.o(79165);
    }
    Object localObject;
    if ((ah.bqo()) || ((Looper.myLooper() == Looper.getMainLooper()) && (!b.PL().le("com.tencent.mm"))))
      localObject = cgw();
    while (true)
    {
      localObject = ((Set)localObject).iterator();
      while (true)
        if (((Iterator)localObject).hasNext())
          if (paramString.startsWith((String)((Iterator)localObject).next()))
          {
            bool = true;
            AppMethodBeat.o(79165);
            break;
            localObject = new HashSet();
            String[] arrayOfString = cgv().split("|");
            for (paramInt = 0; paramInt < arrayOfString.length; paramInt++)
              if (!bo.isNullOrNil(arrayOfString[paramInt]))
                ((Set)localObject).add(arrayOfString[paramInt]);
          }
      AppMethodBeat.o(79165);
      break;
    }
  }

  private static String cgv()
  {
    AppMethodBeat.i(79166);
    Object localObject = (Bundle)f.a("com.tencent.mm", null, a.a.class);
    if (localObject != null);
    for (localObject = ((Bundle)localObject).getString("wxCodePrefix", ""); ; localObject = "")
    {
      AppMethodBeat.o(79166);
      return localObject;
    }
  }

  private static Set<String> cgw()
  {
    AppMethodBeat.i(79167);
    HashSet localHashSet = new HashSet();
    localHashSet.add("k");
    localHashSet.add("l");
    if (ah.bqo())
    {
      localObject = ((com.tencent.mm.plugin.zero.b.a)g.K(com.tencent.mm.plugin.zero.b.a.class)).Nv();
      if (localObject == null)
        break label133;
    }
    label133: for (Object localObject = ((c)localObject).O("ScanCode", "weAppCodePrefix"); ; localObject = "")
    {
      ab.v("MicroMsg.QRCodeLogic", "getWxCodePrefix(%s)", new Object[] { localObject });
      if (!bo.isNullOrNil((String)localObject))
      {
        localObject = ((String)localObject).split("|");
        for (int i = 0; i < localObject.length; i++)
          if (!bo.isNullOrNil(localObject[i]))
            localHashSet.add(localObject[i]);
      }
      AppMethodBeat.o(79167);
      return localHashSet;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.a
 * JD-Core Version:    0.6.2
 */