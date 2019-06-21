package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Comparator;

final class ke$2
  implements Comparator<kv>
{
  ke$2(ky paramky)
  {
  }

  public final int a(kv paramkv1, kv paramkv2)
  {
    AppMethodBeat.i(100209);
    int i = Float.valueOf(paramkv1.b().a().b(this.a).g()).compareTo(Float.valueOf(paramkv2.b().a().b(this.a).g()));
    AppMethodBeat.o(100209);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ke.2
 * JD-Core Version:    0.6.2
 */