package com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;
import java.lang.reflect.Method;
import java.util.UUID;

public final class b
{
  public static boolean AW(String paramString)
  {
    AppMethodBeat.i(94347);
    boolean bool;
    if (android.support.v4.content.b.checkSelfPermission(ah.getContext(), paramString) == 0)
    {
      bool = true;
      AppMethodBeat.o(94347);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(94347);
    }
  }

  public static boolean AX(String paramString)
  {
    AppMethodBeat.i(94349);
    try
    {
      UUID.fromString(paramString);
      bool = true;
      AppMethodBeat.o(94349);
      return bool;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        boolean bool = false;
        AppMethodBeat.o(94349);
      }
    }
  }

  @TargetApi(18)
  public static boolean a(BluetoothGatt paramBluetoothGatt)
  {
    boolean bool1 = false;
    AppMethodBeat.i(94350);
    if (paramBluetoothGatt != null);
    while (true)
    {
      try
      {
        Method localMethod = BluetoothGatt.class.getMethod("refresh", new Class[0]);
        if (localMethod != null)
        {
          localMethod.setAccessible(true);
          bool2 = ((Boolean)localMethod.invoke(paramBluetoothGatt, new Object[0])).booleanValue();
          AppMethodBeat.o(94350);
          return bool2;
        }
      }
      catch (Exception paramBluetoothGatt)
      {
        bool2 = bool1;
        continue;
      }
      boolean bool2 = false;
    }
  }

  private static BluetoothManager aCX()
  {
    try
    {
      AppMethodBeat.i(94345);
      BluetoothManager localBluetoothManager = (BluetoothManager)ah.getContext().getSystemService("bluetooth");
      AppMethodBeat.o(94345);
      return localBluetoothManager;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  @SuppressLint({"MissingPermission", "NewApi"})
  public static BluetoothAdapter aCY()
  {
    try
    {
      AppMethodBeat.i(94346);
      Object localObject1 = aCX();
      if (localObject1 != null)
      {
        localObject1 = ((BluetoothManager)localObject1).getAdapter();
        AppMethodBeat.o(94346);
      }
      while (true)
      {
        return localObject1;
        a.e("MicroMsg.Ble.BleHelper", "BluetoothManager is null err", new Object[0]);
        localObject1 = null;
        AppMethodBeat.o(94346);
      }
    }
    finally
    {
    }
  }

  public static boolean aCZ()
  {
    AppMethodBeat.i(94348);
    boolean bool;
    if (aCY() == null)
    {
      bool = false;
      AppMethodBeat.o(94348);
    }
    while (true)
    {
      return bool;
      bool = aCY().isEnabled();
      AppMethodBeat.o(94348);
    }
  }

  public static boolean og(int paramInt)
  {
    if ((paramInt & 0x2) > 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean oh(int paramInt)
  {
    if ((paramInt & 0x8) > 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean oi(int paramInt)
  {
    if ((paramInt & 0x4) > 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean oj(int paramInt)
  {
    if ((paramInt & 0x10) > 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean ok(int paramInt)
  {
    if ((paramInt & 0x20) > 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.b
 * JD-Core Version:    0.6.2
 */