package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Map;

public final class z extends ak
  implements Cloneable
{
  private static Map<Integer, byte[]> b;
  public Map<Integer, byte[]> a = null;

  public final void a(ai paramai)
  {
    AppMethodBeat.i(100572);
    if (b == null)
    {
      b = new HashMap();
      byte[] arrayOfByte = (byte[])new byte[1];
      ((byte[])arrayOfByte)[0] = ((byte)0);
      b.put(Integer.valueOf(0), arrayOfByte);
    }
    this.a = ((Map)paramai.a(b, 0, true));
    AppMethodBeat.o(100572);
  }

  public final void a(aj paramaj)
  {
    AppMethodBeat.i(100571);
    paramaj.a(this.a, 0);
    AppMethodBeat.o(100571);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.z
 * JD-Core Version:    0.6.2
 */