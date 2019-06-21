package com.tencent.mm.plugin.appbrand.m.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.permission.e.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;

final class b$1
  implements e.c
{
  b$1(b paramb)
  {
  }

  public final void f(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    AppMethodBeat.i(102207);
    ab.i("MicroMsg.ProxyOnPermissionUpdateListener", "onUpdate");
    HashMap localHashMap = new HashMap();
    localHashMap.put("fg", paramArrayOfByte1);
    localHashMap.put("bg", paramArrayOfByte2);
    this.iqm.D(localHashMap);
    AppMethodBeat.o(102207);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.m.d.b.1
 * JD-Core Version:    0.6.2
 */