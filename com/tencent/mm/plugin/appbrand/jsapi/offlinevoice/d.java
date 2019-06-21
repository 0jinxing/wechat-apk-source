package com.tencent.mm.plugin.appbrand.jsapi.offlinevoice;

import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ne;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.HashSet;
import java.util.Set;

public final class d
{
  public static final String hSQ;
  private static d hSS;
  private Set<String> hSR;
  private Object lock;

  static
  {
    AppMethodBeat.i(131382);
    hSQ = com.tencent.mm.compatible.util.e.eSi + "files/wxofflinevoice/";
    AppMethodBeat.o(131382);
  }

  public d()
  {
    AppMethodBeat.i(131375);
    this.lock = new Object();
    AppMethodBeat.o(131375);
  }

  public static void BG(String paramString)
  {
    AppMethodBeat.i(131378);
    g.RP().Ry().set(ac.a.xXa, paramString);
    a.xxA.m(new ne());
    AppMethodBeat.o(131378);
  }

  public static String BH(String paramString)
  {
    AppMethodBeat.i(131379);
    paramString = as.amF("voice_offline_res").getString(paramString, "");
    AppMethodBeat.o(131379);
    return paramString;
  }

  public static String aED()
  {
    AppMethodBeat.i(131377);
    String str = (String)g.RP().Ry().get(ac.a.xWZ, "");
    AppMethodBeat.o(131377);
    return str;
  }

  public static String aEE()
  {
    AppMethodBeat.i(131380);
    String str = (String)g.RP().Ry().get(ac.a.xXa, "0");
    AppMethodBeat.o(131380);
    return str;
  }

  public static d aEF()
  {
    AppMethodBeat.i(131381);
    if (hSS == null)
      hSS = new d();
    d locald = hSS;
    AppMethodBeat.o(131381);
    return locald;
  }

  public final boolean cn(String paramString1, String paramString2)
  {
    AppMethodBeat.i(131376);
    while (true)
    {
      synchronized (this.lock)
      {
        if (this.hSR == null)
        {
          Object localObject2 = new java/util/HashSet;
          ((HashSet)localObject2).<init>();
          this.hSR = ((Set)localObject2);
          localObject2 = (String)g.RP().Ry().get(ac.a.xWZ, "");
          if (!bo.isNullOrNil((String)localObject2))
          {
            String[] arrayOfString = ((String)localObject2).split(",");
            int i = arrayOfString.length;
            int j = 0;
            if (j < i)
            {
              localObject2 = arrayOfString[j];
              this.hSR.add(localObject2);
              j++;
              continue;
            }
          }
        }
        as.amF("voice_offline_res").edit().putString(paramString1, paramString2);
        if (!this.hSR.contains(paramString1))
        {
          paramString2 = new java/lang/StringBuilder;
          paramString2.<init>((String)g.RP().Ry().get(ac.a.xWZ, ""));
          if (this.hSR.size() <= 0)
          {
            paramString2.append(paramString1);
            g.RP().Ry().set(ac.a.xWZ, paramString2.toString());
            bool = this.hSR.add(paramString1);
            AppMethodBeat.o(131376);
            return bool;
          }
          paramString2.append(",").append(paramString1);
        }
      }
      boolean bool = true;
      AppMethodBeat.o(131376);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.offlinevoice.d
 * JD-Core Version:    0.6.2
 */