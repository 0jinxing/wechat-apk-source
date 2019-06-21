package com.tencent.mm.pluginsdk.cmd;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

public final class b
{
  private static final HashMap<String, a> vaE;
  private static final HashMap<String, b.a> vaF;
  private static final Pattern vaG;

  static
  {
    AppMethodBeat.i(79203);
    vaE = new HashMap();
    vaF = new HashMap();
    vaG = Pattern.compile(" +");
    AppMethodBeat.o(79203);
  }

  public static boolean B(Context paramContext, String arg1, String paramString2)
  {
    AppMethodBeat.i(79201);
    String[] arrayOfString = vaG.split(???);
    while (true)
    {
      synchronized (vaE)
      {
        a locala = (a)vaE.get(arrayOfString[0]);
        if (locala != null)
        {
          ab.i("MicroMsg.UnifiedCommandProcessor", "Command: %s", new Object[] { arrayOfString[0] });
          bool = locala.a(paramContext, arrayOfString, paramString2);
          AppMethodBeat.o(79201);
          return bool;
        }
      }
      AppMethodBeat.o(79201);
      boolean bool = false;
    }
  }

  public static void N(String[] paramArrayOfString)
  {
    int i = 0;
    AppMethodBeat.i(79200);
    synchronized (vaE)
    {
      int j = paramArrayOfString.length;
      while (i < j)
      {
        String str = paramArrayOfString[i];
        vaE.remove(str);
        ab.i("MicroMsg.UnifiedCommandProcessor", "Unregistered command: %s", new Object[] { str });
        i++;
      }
      AppMethodBeat.o(79200);
      return;
    }
  }

  public static void a(a parama, String[] paramArrayOfString)
  {
    int i = 0;
    AppMethodBeat.i(79199);
    synchronized (vaE)
    {
      int j = paramArrayOfString.length;
      while (i < j)
      {
        String str = paramArrayOfString[i];
        vaE.put(str, parama);
        ab.i("MicroMsg.UnifiedCommandProcessor", "Registered command: %s", new Object[] { str });
        i++;
      }
      AppMethodBeat.o(79199);
      return;
    }
  }

  static List<b.a> dgV()
  {
    AppMethodBeat.i(79202);
    synchronized (vaF)
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>(vaF.values());
      AppMethodBeat.o(79202);
      return localArrayList;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.cmd.b
 * JD-Core Version:    0.6.2
 */