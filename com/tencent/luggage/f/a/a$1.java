package com.tencent.luggage.f.a;

import com.tencent.map.geolocation.internal.LocationLogCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class a$1
  implements LocationLogCallback
{
  a$1(a parama)
  {
  }

  public final void onLog(int paramInt, String paramString1, String paramString2, Throwable paramThrowable)
  {
    AppMethodBeat.i(51134);
    switch (paramInt)
    {
    default:
      AppMethodBeat.o(51134);
    case 2:
    case 3:
    case 4:
    case 5:
      while (true)
      {
        return;
        ab.v("MicroMsg.DefaultTencentLocationManager", "tag:%s msg:%s", new Object[] { paramString1, paramString2 });
        AppMethodBeat.o(51134);
        continue;
        ab.d("MicroMsg.DefaultTencentLocationManager", "tag:%s msg:%s", new Object[] { paramString1, paramString2 });
        AppMethodBeat.o(51134);
        continue;
        ab.i("MicroMsg.DefaultTencentLocationManager", "tag:%s msg:%s", new Object[] { paramString1, paramString2 });
        AppMethodBeat.o(51134);
        continue;
        ab.w("MicroMsg.DefaultTencentLocationManager", "tag:%s msg:%s", new Object[] { paramString1, paramString2 });
        AppMethodBeat.o(51134);
      }
    case 6:
    }
    if (paramThrowable != null);
    for (paramThrowable = paramThrowable.getMessage(); ; paramThrowable = "")
    {
      ab.e("MicroMsg.DefaultTencentLocationManager", "tag:%s msg:%s th:%s", new Object[] { paramString1, paramString2, paramThrowable });
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.f.a.a.1
 * JD-Core Version:    0.6.2
 */