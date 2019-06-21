package com.tencent.mm.plugin.appbrand.media.record;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.i;
import com.tencent.mm.ipcinvoker.type.IPCString;
import com.tencent.mm.ipcinvoker.type.IPCVoid;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class c
{
  private static Map<String, com.tencent.mm.sdk.b.c> ilh;
  private static ArrayList<String> ili;
  private static boolean ilj;

  static
  {
    AppMethodBeat.i(105595);
    ilh = new HashMap();
    ili = new ArrayList();
    ilj = false;
    AppMethodBeat.o(105595);
  }

  public static void Cx(String paramString)
  {
    AppMethodBeat.i(105592);
    if (!ilh.containsKey(paramString))
    {
      ab.e("MicroMsg.Record.AppBrandRecordClientService", "appId:%s not exist the appId for listener", new Object[] { paramString });
      AppMethodBeat.o(105592);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.Record.AppBrandRecordClientService", "removeRecordListener,appId:%s", new Object[] { paramString });
      ili.remove(paramString);
      paramString = (com.tencent.mm.sdk.b.c)ilh.remove(paramString);
      if (paramString != null)
        a.xxA.d(paramString);
      AppMethodBeat.o(105592);
    }
  }

  public static void aIe()
  {
    AppMethodBeat.i(105593);
    if (ilj)
    {
      ab.i("MicroMsg.Record.AppBrandRecordClientService", "update device info done!");
      AppMethodBeat.o(105593);
    }
    while (true)
    {
      return;
      d.post(new c.1(), "record_update_device_info");
      AppMethodBeat.o(105593);
    }
  }

  public static void b(String paramString, com.tencent.mm.sdk.b.c paramc)
  {
    AppMethodBeat.i(105591);
    if (ilh.containsKey(paramString))
    {
      ab.e("MicroMsg.Record.AppBrandRecordClientService", "appId:%s has add listener", new Object[] { paramString });
      AppMethodBeat.o(105591);
    }
    while (true)
    {
      return;
      if (paramc == null)
      {
        ab.e("MicroMsg.Record.AppBrandRecordClientService", "listener is null");
        AppMethodBeat.o(105591);
      }
      else
      {
        ab.i("MicroMsg.Record.AppBrandRecordClientService", "addRecordListener,appId:%s", new Object[] { paramString });
        ilh.put(paramString, paramc);
        if (!ili.contains(paramString))
          ili.add(paramString);
        a.xxA.b(paramc);
        AppMethodBeat.o(105591);
      }
    }
  }

  public static void onCreate()
  {
  }

  public static void onDestroy()
  {
    AppMethodBeat.i(105590);
    ab.i("MicroMsg.Record.AppBrandRecordClientService", "onDestroy");
    Object localObject1 = ili.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject2 = (String)((Iterator)localObject1).next();
      localObject2 = (com.tencent.mm.sdk.b.c)ilh.remove(localObject2);
      if (localObject2 != null)
        a.xxA.d((com.tencent.mm.sdk.b.c)localObject2);
    }
    ilh.clear();
    ili.clear();
    localObject1 = g.aIm();
    ab.i("MicroMsg.Record.AudioRecordMgr", "destroy");
    if ((((g)localObject1).ilp == g.a.ilF) || (((g)localObject1).ilp == g.a.ilG) || (((g)localObject1).ilp == g.a.ilJ))
      ((g)localObject1).EB();
    if (((g)localObject1).ilw)
    {
      if ((((g)localObject1).ilo != null) && (((g)localObject1).ilo.imo != null))
      {
        ((g)localObject1).ilo.imo.a(null);
        ((g)localObject1).ilo.imo.aIl();
      }
      ((g)localObject1).ilw = false;
    }
    AppMethodBeat.o(105590);
  }

  static final class a
    implements i<IPCVoid, IPCString>
  {
    private static IPCString aIf()
    {
      AppMethodBeat.i(105588);
      try
      {
        ab.i("MicroMsg.Record.AppBrandRecordClientService", "ipc updateDeviceInfo");
        String str = com.tencent.mm.kernel.g.RP().Rz().dur();
        IPCString localIPCString1 = new com/tencent/mm/ipcinvoker/type/IPCString;
        localIPCString1.<init>(str);
        AppMethodBeat.o(105588);
        return localIPCString1;
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.Record.AppBrandRecordClientService", localException, "ipc updateDeviceInfo task", new Object[0]);
          IPCString localIPCString2 = new IPCString("");
          AppMethodBeat.o(105588);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.media.record.c
 * JD-Core Version:    0.6.2
 */