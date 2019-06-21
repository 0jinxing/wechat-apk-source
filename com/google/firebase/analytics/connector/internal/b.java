package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.measurement.AppMeasurement.UserProperty;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class b
{
  private static final List<String> buO;
  private static final List<String> buP;
  private static final List<String> buQ;
  private static final List<String> buR;
  private static final List<String> buS;

  static
  {
    AppMethodBeat.i(67882);
    buO = Arrays.asList(new String[] { "_e", "_f", "_iap", "_s", "_au", "_ui", "_cd", "app_open" });
    buP = Arrays.asList(new String[] { "auto", "app", "am" });
    buQ = Arrays.asList(new String[] { "_r", "_dbg" });
    buR = Arrays.asList((String[])ArrayUtils.concat(new String[][] { AppMeasurement.UserProperty.zzadb, AppMeasurement.UserProperty.zzadc }));
    buS = Arrays.asList(new String[] { "^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$" });
    AppMethodBeat.o(67882);
  }

  public static boolean a(String paramString1, String paramString2, Bundle paramBundle)
  {
    AppMethodBeat.i(67881);
    boolean bool;
    if (!"_cmp".equals(paramString2))
    {
      AppMethodBeat.o(67881);
      bool = true;
    }
    while (true)
    {
      label21: return bool;
      if (!aV(paramString1))
      {
        AppMethodBeat.o(67881);
        bool = false;
      }
      else if (paramBundle == null)
      {
        AppMethodBeat.o(67881);
        bool = false;
      }
      else
      {
        paramString2 = buQ.iterator();
        while (true)
          if (paramString2.hasNext())
            if (paramBundle.containsKey((String)paramString2.next()))
            {
              AppMethodBeat.o(67881);
              bool = false;
              break;
            }
        int i = -1;
        switch (paramString1.hashCode())
        {
        default:
        case 101200:
        case 101230:
        }
        while (true)
          switch (i)
          {
          default:
            AppMethodBeat.o(67881);
            bool = false;
            break label21;
            if (paramString1.equals("fcm"))
            {
              i = 0;
              continue;
              if (paramString1.equals("fdl"))
                i = 1;
            }
            break;
          case 0:
          case 1:
          }
        paramBundle.putString("_cis", "fcm_integration");
        AppMethodBeat.o(67881);
        bool = true;
        continue;
        paramBundle.putString("_cis", "fdl_integration");
        AppMethodBeat.o(67881);
        bool = true;
      }
    }
  }

  public static boolean aV(String paramString)
  {
    AppMethodBeat.i(67878);
    boolean bool;
    if (!buP.contains(paramString))
    {
      bool = true;
      AppMethodBeat.o(67878);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(67878);
    }
  }

  public static boolean aW(String paramString)
  {
    AppMethodBeat.i(67880);
    boolean bool;
    if (buR.contains(paramString))
    {
      AppMethodBeat.o(67880);
      bool = false;
    }
    while (true)
    {
      return bool;
      Iterator localIterator = buS.iterator();
      while (true)
        if (localIterator.hasNext())
          if (paramString.matches((String)localIterator.next()))
          {
            AppMethodBeat.o(67880);
            bool = false;
            break;
          }
      bool = true;
      AppMethodBeat.o(67880);
    }
  }

  public static boolean e(String paramString, Bundle paramBundle)
  {
    AppMethodBeat.i(67879);
    boolean bool;
    if (buO.contains(paramString))
    {
      AppMethodBeat.o(67879);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (paramBundle != null)
      {
        paramString = buQ.iterator();
        while (true)
          if (paramString.hasNext())
            if (paramBundle.containsKey((String)paramString.next()))
            {
              AppMethodBeat.o(67879);
              bool = false;
              break;
            }
      }
      bool = true;
      AppMethodBeat.o(67879);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.firebase.analytics.connector.internal.b
 * JD-Core Version:    0.6.2
 */