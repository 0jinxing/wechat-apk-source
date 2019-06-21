package com.tencent.mm.plugin.d.a.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.d.a.c.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashSet;
import junit.framework.Assert;

final class b$a extends a.a
{
  b$a(b paramb)
  {
  }

  public final void aVx()
  {
    AppMethodBeat.i(18499);
    ab.i("MicroMsg.exdevice.BluetoothSDKManager", "***BC onDiscoverFinished***");
    this.jIZ.jIY.clear();
    Assert.assertTrue(b.a(this.jIZ, 2, 1, null));
    AppMethodBeat.o(18499);
  }

  public final void b(long paramLong, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(18502);
    ab.i("MicroMsg.exdevice.BluetoothSDKManager", "***BC onRecv*** sessionId = ".concat(String.valueOf(paramLong)));
    paramArrayOfByte = new b.h(paramLong, paramArrayOfByte);
    Assert.assertTrue(b.a(this.jIZ, 1, 1, paramArrayOfByte));
    AppMethodBeat.o(18502);
  }

  public final void c(long paramLong, int paramInt, String paramString)
  {
    AppMethodBeat.i(18504);
    ab.i("MicroMsg.exdevice.BluetoothSDKManager", "***BC onError*** SessionId = " + paramLong + " errorCode = " + paramInt + " errorInfo = " + paramString);
    paramString = new b.g(paramLong, paramInt, paramString);
    Assert.assertTrue(b.a(this.jIZ, 5, 1, paramString));
    AppMethodBeat.o(18504);
  }

  public final void dd(String paramString1, String paramString2)
  {
    AppMethodBeat.i(18500);
    b localb = this.jIZ;
    int i;
    if (paramString1 == null)
    {
      ab.e("MicroMsg.exdevice.BluetoothSDKManager", "null == aDeviceMac");
      i = 0;
      if (i != 0)
        break label69;
      AppMethodBeat.o(18500);
    }
    while (true)
    {
      return;
      if (localb.jIY.contains(paramString1))
      {
        i = 0;
        break;
      }
      localb.jIY.add(paramString1);
      i = 1;
      break;
      label69: ab.i("MicroMsg.exdevice.BluetoothSDKManager", "***BC onDiscover*** deviceMac = " + paramString1 + "deviceName = " + paramString2);
      paramString1 = new b.i(paramString1, paramString2, 0, null);
      Assert.assertTrue(b.a(this.jIZ, 3, 1, paramString1));
      AppMethodBeat.o(18500);
    }
  }

  public final void g(long paramLong1, long paramLong2, long paramLong3)
  {
    AppMethodBeat.i(18498);
    ab.i("MicroMsg.exdevice.BluetoothSDKManager", "***BC onSessionCreate*** sessionID = " + paramLong1 + " deviceID = " + paramLong2);
    b.d locald = new b.d(paramLong1, paramLong2, paramLong3);
    Assert.assertTrue(b.a(this.jIZ, 6, 1, locald));
    AppMethodBeat.o(18498);
  }

  public final void l(long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(18501);
    ab.i("MicroMsg.exdevice.BluetoothSDKManager", "***BC onConnected*** SessionId = " + paramLong + " Connected = " + paramBoolean);
    b.f localf = new b.f(paramLong, paramBoolean);
    Assert.assertTrue(b.a(this.jIZ, 4, 1, localf));
    AppMethodBeat.o(18501);
  }

  public final void m(long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(18503);
    ab.i("MicroMsg.exdevice.BluetoothSDKManager", "***BC onSend*** SessionId = " + paramLong + " success = " + paramBoolean);
    b.j localj = new b.j(paramLong, paramBoolean);
    Assert.assertTrue(b.a(this.jIZ, 0, 1, localj));
    AppMethodBeat.o(18503);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.d.b.a
 * JD-Core Version:    0.6.2
 */