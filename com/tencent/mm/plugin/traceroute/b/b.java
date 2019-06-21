package com.tencent.mm.plugin.traceroute.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.g.a.e;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public final class b
{
  public static List<Object> J(String[] paramArrayOfString)
  {
    AppMethodBeat.i(25988);
    String str = " ";
    for (int i = 0; i < 4; i++)
    {
      localObject = paramArrayOfString[i];
      str = str + (String)localObject + " ";
    }
    ab.i("MicroMsg.MMTraceRoute", str);
    Object localObject = new ArrayList();
    paramArrayOfString = new b.a(paramArrayOfString, (List)localObject);
    d.g(paramArrayOfString, "MMTraceRouteCMDExecutor_watcher");
    try
    {
      d.xDG.am(paramArrayOfString);
      ab.i("MicroMsg.MMTraceRoute", "watcher thread stopped".concat(String.valueOf(str)));
      label103: AppMethodBeat.o(25988);
      return localObject;
    }
    catch (TimeoutException paramArrayOfString)
    {
      break label103;
    }
    catch (ExecutionException paramArrayOfString)
    {
      break label103;
    }
    catch (InterruptedException paramArrayOfString)
    {
      break label103;
    }
  }

  public static String abO(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(25986);
    ab.i("MicroMsg.MMTraceRoute", "output string: ".concat(String.valueOf(paramString)));
    if ((paramString == null) || (paramString.length() == 0))
    {
      AppMethodBeat.o(25986);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      int i = paramString.indexOf("time=");
      if (i < 0)
      {
        AppMethodBeat.o(25986);
        paramString = localObject;
      }
      else
      {
        int j = i + 5;
        i = paramString.indexOf(" ", j);
        if (i < 0)
        {
          AppMethodBeat.o(25986);
          paramString = localObject;
        }
        else
        {
          paramString = paramString.substring(j, i);
          AppMethodBeat.o(25986);
        }
      }
    }
  }

  public static int abP(String paramString)
  {
    int i = -1;
    AppMethodBeat.i(25987);
    int j = paramString.indexOf("ttl=");
    if (j < 0)
      AppMethodBeat.o(25987);
    while (true)
    {
      return i;
      j += 4;
      int k = paramString.indexOf(" ", j);
      if (k < 0)
      {
        AppMethodBeat.o(25987);
      }
      else
      {
        i = bo.getInt(paramString.substring(j, k), 0);
        AppMethodBeat.o(25987);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.traceroute.b.b
 * JD-Core Version:    0.6.2
 */