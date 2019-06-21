package com.tencent.mm.plugin.appbrand.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.p;
import com.tencent.mm.plugin.appbrand.s.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MMToClientEvent extends MainProcessTask
{
  public static final Parcelable.Creator<MMToClientEvent> CREATOR;
  private static final HashMap<String, Set<MMToClientEvent.c>> hvA;
  private static final HashMap<String, MMToClientEvent> hvz;
  public String appId;
  int csm;
  String czy;
  public int hvv;
  private c hvw;
  String hvx;
  Object hvy;
  public int type;

  static
  {
    AppMethodBeat.i(86947);
    hvz = new HashMap();
    hvA = new HashMap();
    CREATOR = new MMToClientEvent.2();
    AppMethodBeat.o(86947);
  }

  private MMToClientEvent()
  {
  }

  private MMToClientEvent(Parcel paramParcel)
  {
    AppMethodBeat.i(86938);
    g(paramParcel);
    AppMethodBeat.o(86938);
  }

  public static void a(String paramString, MMToClientEvent.c paramc)
  {
    AppMethodBeat.i(86942);
    if (paramc != null);
    while (true)
    {
      synchronized (hvA)
      {
        if (!hvA.containsKey(paramString))
        {
          HashMap localHashMap2 = hvA;
          HashSet localHashSet = new java/util/HashSet;
          localHashSet.<init>();
          localHashMap2.put(paramString, localHashSet);
        }
        ((Set)hvA.get(paramString)).add(paramc);
        AppMethodBeat.o(86942);
        return;
      }
      AppMethodBeat.o(86942);
    }
  }

  public static void b(String paramString, MMToClientEvent.c paramc)
  {
    AppMethodBeat.i(86943);
    if (paramc != null);
    while (true)
    {
      synchronized (hvA)
      {
        if (hvA.containsKey(paramString))
          ((Set)hvA.get(paramString)).remove(paramc);
        AppMethodBeat.o(86943);
        return;
      }
      AppMethodBeat.o(86943);
    }
  }

  public static void e(c paramc)
  {
    AppMethodBeat.i(86940);
    if (paramc == null)
      AppMethodBeat.o(86940);
    while (true)
    {
      return;
      MMToClientEvent localMMToClientEvent = new MMToClientEvent();
      hvz.put(paramc.getAppId(), localMMToClientEvent);
      localMMToClientEvent.hvv = 1;
      localMMToClientEvent.appId = paramc.getAppId();
      localMMToClientEvent.hvw = paramc;
      AppBrandMainProcessService.a(localMMToClientEvent);
      AppMethodBeat.o(86940);
    }
  }

  public static void f(c paramc)
  {
    AppMethodBeat.i(86941);
    if (paramc == null)
      AppMethodBeat.o(86941);
    while (true)
    {
      return;
      MMToClientEvent localMMToClientEvent = (MMToClientEvent)hvz.remove(paramc.getAppId());
      if (localMMToClientEvent == null)
      {
        AppMethodBeat.o(86941);
        continue;
      }
      synchronized (hvA)
      {
        hvA.remove(paramc.getAppId());
        localMMToClientEvent.hvv = 2;
        localMMToClientEvent.appId = paramc.getAppId();
        localMMToClientEvent.hvw = null;
        AppBrandMainProcessService.b(localMMToClientEvent);
        AppMethodBeat.o(86941);
      }
    }
  }

  public final void asP()
  {
    AppMethodBeat.i(86939);
    switch (this.hvv)
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(86939);
      while (true)
      {
        return;
        d.b(this);
        AppMethodBeat.o(86939);
      }
      d.c(this);
    }
  }

  public final void asQ()
  {
    AppMethodBeat.i(86944);
    switch (this.hvv)
    {
    default:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      AppMethodBeat.o(86944);
      while (true)
      {
        return;
        ??? = new MMToClientEvent.a();
        localObject2 = new HashMap();
        ((HashMap)localObject2).put("type", Integer.valueOf(this.type));
        ((HashMap)localObject2).put("data", this.czy);
        ((MMToClientEvent.a)???).i(this.hvw).s((Map)localObject2).aCj();
        AppMethodBeat.o(86944);
        continue;
        localObject2 = new MMToClientEvent.b();
        ??? = new HashMap();
        ((HashMap)???).put("count", Integer.valueOf(this.csm));
        ((HashMap)???).put("data", this.czy);
        ((MMToClientEvent.b)localObject2).i(this.hvw).s((Map)???).aCj();
        AppMethodBeat.o(86944);
        continue;
        if ((this.appId != null) && (this.hvy != null))
          break;
        AppMethodBeat.o(86944);
      }
      if (hvA.get(this.appId) == null)
        continue;
      Object localObject2 = new LinkedList();
      synchronized (hvA)
      {
        ((List)localObject2).addAll((Collection)hvA.get(this.appId));
        e.aNS().aa(new MMToClientEvent.1(this, (List)localObject2));
      }
    }
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(86945);
    this.hvv = paramParcel.readInt();
    this.appId = paramParcel.readString();
    this.type = paramParcel.readInt();
    this.czy = paramParcel.readString();
    this.csm = paramParcel.readInt();
    try
    {
      this.hvx = paramParcel.readString();
      if (!bo.isNullOrNil(this.hvx))
      {
        Class localClass = Class.forName(this.hvx);
        if (localClass != null)
          this.hvy = paramParcel.readParcelable(localClass.getClassLoader());
      }
      AppMethodBeat.o(86945);
      return;
    }
    catch (Exception paramParcel)
    {
      while (true)
      {
        ab.v("MicroMsg.MMToClientEvent", "unparcel custom data e %s", new Object[] { paramParcel });
        AppMethodBeat.o(86945);
      }
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(86946);
    paramParcel.writeInt(this.hvv);
    paramParcel.writeString(this.appId);
    paramParcel.writeInt(this.type);
    paramParcel.writeString(this.czy);
    paramParcel.writeInt(this.csm);
    if ((!bo.isNullOrNil(this.hvx)) && (this.hvy != null))
    {
      paramParcel.writeString(this.hvx);
      paramParcel.writeParcelable((Parcelable)this.hvy, paramInt);
    }
    AppMethodBeat.o(86946);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent
 * JD-Core Version:    0.6.2
 */