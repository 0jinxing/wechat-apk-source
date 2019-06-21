package com.tencent.mm.plugin.d.a.e;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.pm.PackageManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.j.b;
import com.tencent.mm.sdk.platformtools.ab;

public final class a
{
  public static boolean aVF()
  {
    AppMethodBeat.i(18518);
    if (BluetoothAdapter.getDefaultAdapter() != null);
    for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.exdevice.BluetoothSDKUtil", "isSupportBC: %b", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(18518);
      return bool;
    }
  }

  public static boolean aVH()
  {
    boolean bool = false;
    AppMethodBeat.i(18519);
    BluetoothAdapter localBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
    if (localBluetoothAdapter == null)
      AppMethodBeat.o(18519);
    while (true)
    {
      return bool;
      bool = localBluetoothAdapter.isEnabled();
      ab.i("MicroMsg.exdevice.BluetoothSDKUtil", "isBluetoothOpen: %b", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(18519);
    }
  }

  public static boolean dv(Context paramContext)
  {
    AppMethodBeat.i(18517);
    boolean bool = paramContext.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
    ab.i("MicroMsg.exdevice.BluetoothSDKUtil", "isBLESupported, ret = %b", new Object[] { Boolean.valueOf(bool) });
    AppMethodBeat.o(18517);
    return bool;
  }

  @Deprecated
  public static String gC(long paramLong)
  {
    AppMethodBeat.i(138605);
    String str = b.ie(paramLong);
    AppMethodBeat.o(138605);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.e.a
 * JD-Core Version:    0.6.2
 */