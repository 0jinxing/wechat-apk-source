package com.tencent.mm.plugin.appbrand.appusage;

import android.os.Looper;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.mm.ipcinvoker.i;
import com.tencent.mm.ipcinvoker.type.IPCBoolean;
import com.tencent.mm.ipcinvoker.type.IPCInteger;
import com.tencent.mm.ipcinvoker.type.IPCVoid;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.e.k;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class o extends k
  implements ag
{
  private final Set<k.a> gZx;

  public o()
  {
    AppMethodBeat.i(129592);
    this.gZx = new HashSet();
    AppMethodBeat.o(129592);
  }

  public final void a(k.a parama, Looper arg2)
  {
    int i = 1;
    AppMethodBeat.i(129596);
    if ((parama == null) || (??? == null))
      AppMethodBeat.o(129596);
    while (true)
    {
      return;
      super.a(parama, ???);
      synchronized (this.gZx)
      {
        this.gZx.add(parama);
        if (this.gZx.size() == 1)
        {
          if (i != 0)
            XIPCInvoker.a("com.tencent.mm", IPCVoid.eGH, o.b.class, new o.1(this));
          AppMethodBeat.o(129596);
          continue;
        }
        i = 0;
      }
    }
  }

  public final boolean aE(String paramString, int paramInt)
  {
    AppMethodBeat.i(129593);
    paramString = (IPCBoolean)XIPCInvoker.a("com.tencent.mm", new AppIdentity(paramString, paramInt), c.class);
    boolean bool;
    if (paramString == null)
    {
      bool = false;
      AppMethodBeat.o(129593);
    }
    while (true)
    {
      return bool;
      bool = paramString.value;
      AppMethodBeat.o(129593);
    }
  }

  public final void c(k.a parama)
  {
    AppMethodBeat.i(129595);
    a(parama, Looper.getMainLooper());
    AppMethodBeat.o(129595);
  }

  public final void d(k.a parama)
  {
    AppMethodBeat.i(129597);
    if (parama == null)
      AppMethodBeat.o(129597);
    while (true)
    {
      return;
      super.d(parama);
      synchronized (this.gZx)
      {
        this.gZx.remove(parama);
        AppMethodBeat.o(129597);
      }
    }
  }

  public final List<LocalUsageInfo> nA(int paramInt)
  {
    AppMethodBeat.i(129594);
    Parcel localParcel = (Parcel)XIPCInvoker.a("com.tencent.mm", new IPCInteger(paramInt), a.class);
    Object localObject;
    if (localParcel == null)
    {
      localObject = null;
      AppMethodBeat.o(129594);
    }
    while (true)
    {
      return localObject;
      localObject = new ArrayList(paramInt);
      localParcel.readTypedList((List)localObject, LocalUsageInfo.CREATOR);
      AppMethodBeat.o(129594);
    }
  }

  static final class a
    implements i<IPCInteger, Parcel>
  {
    private static Parcel a(IPCInteger paramIPCInteger)
    {
      AppMethodBeat.i(129584);
      Parcel localParcel = Parcel.obtain();
      try
      {
        localParcel.writeTypedList(((ag)g.K(ag.class)).nA(paramIPCInteger.value));
        AppMethodBeat.o(129584);
        return localParcel;
      }
      catch (Exception paramIPCInteger)
      {
        while (true)
        {
          localParcel.setDataPosition(0);
          localParcel.writeTypedList(null);
          AppMethodBeat.o(129584);
        }
      }
    }
  }

  static final class c
    implements i<AppIdentity, IPCBoolean>
  {
    private static IPCBoolean c(AppIdentity paramAppIdentity)
    {
      AppMethodBeat.i(129590);
      try
      {
        boolean bool = ((ag)g.K(ag.class)).aE(paramAppIdentity.username, paramAppIdentity.har);
        paramAppIdentity = new com/tencent/mm/ipcinvoker/type/IPCBoolean;
        paramAppIdentity.<init>(bool);
        AppMethodBeat.o(129590);
        return paramAppIdentity;
      }
      catch (Exception paramAppIdentity)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.AppBrandLocalUsageStorageIPCImpl", paramAppIdentity, "ipc removeUsage", new Object[0]);
          paramAppIdentity = new IPCBoolean(false);
          AppMethodBeat.o(129590);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.o
 * JD-Core Version:    0.6.2
 */