package com.tencent.mm.plugin.d.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.j.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;

final class e$2 extends f.a
{
  e$2(e parame)
  {
  }

  public final void a(long paramLong1, boolean paramBoolean, long paramLong2)
  {
    AppMethodBeat.i(18406);
    String str1 = b.ie(paramLong1);
    if (paramBoolean);
    for (String str2 = "true"; ; str2 = "false")
    {
      ab.d("MicroMsg.exdevice.BluetoothLESimpleManager", "onConnected. mac = %s, connected = %s", new Object[] { str1, str2 });
      this.jGm.Q(new e.2.1(this, paramLong1, paramBoolean, paramLong2));
      ab.d("MicroMsg.exdevice.BluetoothLESimpleManager", "session size = %d", new Object[] { Integer.valueOf(this.jGm.jFA.size()) });
      AppMethodBeat.o(18406);
      return;
    }
  }

  public final void b(long paramLong, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(18407);
    ab.d("MicroMsg.exdevice.BluetoothLESimpleManager", "onRecv. mac = %s", new Object[] { b.ie(paramLong) });
    if (this.jGm.jGi != null)
    {
      this.jGm.jGi.b(paramLong, paramArrayOfByte);
      AppMethodBeat.o(18407);
    }
    while (true)
    {
      return;
      ab.w("MicroMsg.exdevice.BluetoothLESimpleManager", "no BLEManagerCallback");
      AppMethodBeat.o(18407);
    }
  }

  public final void m(long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(18408);
    String str1 = b.ie(paramLong);
    if (paramBoolean);
    for (String str2 = "true"; ; str2 = "false")
    {
      ab.d("MicroMsg.exdevice.BluetoothLESimpleManager", "onSend. mac = %s, success = %s", new Object[] { str1, str2 });
      if (this.jGm.jGi != null)
        this.jGm.jGi.m(paramLong, paramBoolean);
      AppMethodBeat.o(18408);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.b.e.2
 * JD-Core Version:    0.6.2
 */