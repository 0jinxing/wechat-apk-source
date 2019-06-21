package com.tencent.mm.plugin.appbrand.ipc;

import android.os.Parcelable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;

public final class d
{
  private static final HashMap<String, MMToClientEvent> hvD;

  static
  {
    AppMethodBeat.i(86953);
    hvD = new HashMap();
    AppMethodBeat.o(86953);
  }

  public static <T extends Parcelable> void a(String paramString, T paramT)
  {
    AppMethodBeat.i(86952);
    synchronized (hvD)
    {
      paramString = (MMToClientEvent)hvD.get(paramString);
      if ((paramString == null) || (paramT == null) || (paramT == null));
    }
    while (true)
    {
      try
      {
        paramString.hvv = 5;
        paramString.hvx = paramT.getClass().getName();
        paramString.hvy = paramT;
        paramString.aCb();
        return;
        paramString = finally;
        throw paramString;
      }
      finally
      {
        AppMethodBeat.o(86952);
      }
      AppMethodBeat.o(86952);
    }
  }

  public static void b(MMToClientEvent paramMMToClientEvent)
  {
    AppMethodBeat.i(86948);
    ab.i("MicroMsg.MMToClientEventCenter", "register MMToClientEvent.appId:%s, MMToClientEvent.hash:%d", new Object[] { paramMMToClientEvent.appId, Integer.valueOf(paramMMToClientEvent.hashCode()) });
    if (paramMMToClientEvent.appId == null)
    {
      ab.e("MicroMsg.MMToClientEventCenter", "register MMToClientEvent.appId is null!!!");
      AppMethodBeat.o(86948);
    }
    while (true)
    {
      return;
      synchronized (hvD)
      {
        if (hvD.get(paramMMToClientEvent.appId) == null)
        {
          hvD.put(paramMMToClientEvent.appId, paramMMToClientEvent);
          AppMethodBeat.o(86948);
          continue;
        }
        ab.d("MicroMsg.MMToClientEventCenter", "The CommonConfig is already exist!~ so replace it");
        hvD.remove(paramMMToClientEvent.appId);
        hvD.put(paramMMToClientEvent.appId, paramMMToClientEvent);
      }
    }
  }

  public static void bf(String paramString, int paramInt)
  {
    AppMethodBeat.i(86951);
    ab.i("MicroMsg.MMToClientEventCenter", "notify unread:%d", new Object[] { Integer.valueOf(paramInt) });
    synchronized (hvD)
    {
      paramString = (MMToClientEvent)hvD.get(paramString);
      if (paramString == null);
    }
    while (true)
    {
      try
      {
        paramString.hvv = 4;
        paramString.csm = paramInt;
        paramString.aCb();
        return;
        paramString = finally;
        throw paramString;
      }
      finally
      {
        AppMethodBeat.o(86951);
      }
      ab.e("MicroMsg.MMToClientEventCenter", "notify fail!!! The MMToClientEvent isn't exist!!!");
      AppMethodBeat.o(86951);
    }
  }

  public static void c(MMToClientEvent paramMMToClientEvent)
  {
    AppMethodBeat.i(86949);
    ab.i("MicroMsg.MMToClientEventCenter", "unregister MMToClientEvent.appId:%s", new Object[] { paramMMToClientEvent.appId });
    synchronized (hvD)
    {
      hvD.remove(paramMMToClientEvent.appId);
      AppMethodBeat.o(86949);
      return;
    }
  }

  public static void j(String paramString1, int paramInt, String paramString2)
  {
    AppMethodBeat.i(86950);
    ab.i("MicroMsg.MMToClientEventCenter", "notify appId:%s, type:%d, config:%s", new Object[] { paramString1, Integer.valueOf(paramInt), paramString2 });
    MMToClientEvent localMMToClientEvent;
    synchronized (hvD)
    {
      localMMToClientEvent = (MMToClientEvent)hvD.get(paramString1);
      if (localMMToClientEvent == null);
    }
    while (true)
    {
      try
      {
        localMMToClientEvent.hvv = 3;
        localMMToClientEvent.appId = paramString1;
        localMMToClientEvent.type = paramInt;
        localMMToClientEvent.czy = paramString2;
        localMMToClientEvent.aCb();
        return;
        paramString1 = finally;
        throw paramString1;
      }
      finally
      {
        AppMethodBeat.o(86950);
      }
      ab.e("MicroMsg.MMToClientEventCenter", "notify fail!!! The MMToClientEvent isn't exist!!!");
      AppMethodBeat.o(86950);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ipc.d
 * JD-Core Version:    0.6.2
 */