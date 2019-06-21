package com.tencent.mm.plugin.exdevice.service;

import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class x
  implements m
{
  private h lwT;

  public x(h paramh)
  {
    this.lwT = paramh;
  }

  public final long a(p paramp)
  {
    AppMethodBeat.i(19638);
    try
    {
      l = this.lwT.a(paramp);
      AppMethodBeat.o(19638);
      return l;
    }
    catch (RemoteException paramp)
    {
      while (true)
      {
        ab.e("MicroMsg.exdevice.RDeviceTaskDispatcher", "startTask failed!!! %s", new Object[] { paramp.getMessage() });
        ab.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", paramp, "", new Object[0]);
        long l = -1L;
        AppMethodBeat.o(19638);
      }
    }
  }

  public final boolean a(long paramLong, int paramInt, k paramk)
  {
    boolean bool1 = false;
    AppMethodBeat.i(19636);
    u.bpx().hW(paramLong);
    try
    {
      boolean bool2 = this.lwT.a(paramLong, paramInt, paramk);
      bool1 = bool2;
      AppMethodBeat.o(19636);
      return bool1;
    }
    catch (RemoteException paramk)
    {
      while (true)
      {
        ab.e("MicroMsg.exdevice.RDeviceTaskDispatcher", "startChannel failed!!! %s", new Object[] { paramk.getMessage() });
        ab.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", paramk, "", new Object[0]);
        AppMethodBeat.o(19636);
      }
    }
  }

  public final boolean a(long paramLong, k paramk)
  {
    boolean bool1 = false;
    AppMethodBeat.i(19645);
    try
    {
      bool2 = this.lwT.b(paramLong, 0, paramk);
      AppMethodBeat.o(19645);
      return bool2;
    }
    catch (RemoteException paramk)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", paramk, "", new Object[0]);
        AppMethodBeat.o(19645);
        boolean bool2 = bool1;
      }
    }
  }

  public final boolean a(i parami)
  {
    boolean bool1 = false;
    AppMethodBeat.i(19639);
    try
    {
      bool2 = this.lwT.a(parami);
      AppMethodBeat.o(19639);
      return bool2;
    }
    catch (RemoteException parami)
    {
      while (true)
      {
        ab.e("MicroMsg.exdevice.RDeviceTaskDispatcher", "registOnDeviceRequest failed!!! %s", new Object[] { parami.getMessage() });
        ab.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", parami, "", new Object[0]);
        AppMethodBeat.o(19639);
        boolean bool2 = bool1;
      }
    }
  }

  public final boolean a(j paramj)
  {
    boolean bool1 = false;
    AppMethodBeat.i(19643);
    try
    {
      bool2 = this.lwT.d(0, paramj);
      AppMethodBeat.o(19643);
      return bool2;
    }
    catch (RemoteException paramj)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", paramj, "", new Object[0]);
        AppMethodBeat.o(19643);
        boolean bool2 = bool1;
      }
    }
  }

  public final boolean a(s params)
  {
    boolean bool1 = false;
    AppMethodBeat.i(19647);
    try
    {
      bool2 = this.lwT.a(params);
      AppMethodBeat.o(19647);
      return bool2;
    }
    catch (RemoteException params)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", params, "", new Object[0]);
        AppMethodBeat.o(19647);
        boolean bool2 = bool1;
      }
    }
  }

  public final boolean a(String paramString, boolean paramBoolean, q paramq)
  {
    boolean bool = false;
    AppMethodBeat.i(19641);
    ab.i("MicroMsg.exdevice.RDeviceTaskDispatcher", "ranging, uuid = %s, op = %s", new Object[] { paramString, String.valueOf(paramBoolean) });
    try
    {
      paramBoolean = this.lwT.a(paramString, paramBoolean, paramq);
      AppMethodBeat.o(19641);
      return paramBoolean;
    }
    catch (RemoteException paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.exdevice.RDeviceTaskDispatcher", "mDispatcher.ranging failed!!!(%s)", new Object[] { paramString.getMessage() });
        ab.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", paramString, "", new Object[0]);
        AppMethodBeat.o(19641);
        paramBoolean = bool;
      }
    }
  }

  public final boolean b(int paramInt, j paramj)
  {
    boolean bool1 = false;
    AppMethodBeat.i(19633);
    try
    {
      boolean bool2 = this.lwT.b(paramInt, paramj);
      bool1 = bool2;
      AppMethodBeat.o(19633);
      return bool1;
    }
    catch (RemoteException paramj)
    {
      while (true)
      {
        ab.e("MicroMsg.exdevice.RDeviceTaskDispatcher", "scan failed!!! %s", new Object[] { paramj.getMessage() });
        ab.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", paramj, "", new Object[0]);
        AppMethodBeat.o(19633);
      }
    }
  }

  public final boolean b(long paramLong, byte[] paramArrayOfByte, t paramt)
  {
    boolean bool1 = false;
    AppMethodBeat.i(19648);
    try
    {
      boolean bool2 = this.lwT.b(paramLong, paramArrayOfByte, paramt);
      bool1 = bool2;
      AppMethodBeat.o(19648);
      return bool1;
    }
    catch (RemoteException paramArrayOfByte)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", paramArrayOfByte, "", new Object[0]);
        AppMethodBeat.o(19648);
      }
    }
  }

  public final boolean b(j paramj)
  {
    boolean bool1 = false;
    AppMethodBeat.i(19644);
    try
    {
      boolean bool2 = this.lwT.e(0, paramj);
      bool1 = bool2;
      AppMethodBeat.o(19644);
      return bool1;
    }
    catch (RemoteException paramj)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", paramj, "", new Object[0]);
        AppMethodBeat.o(19644);
      }
    }
  }

  public final boolean b(n paramn)
  {
    boolean bool = true;
    AppMethodBeat.i(19642);
    try
    {
      this.lwT.a(paramn);
      AppMethodBeat.o(19642);
      return bool;
    }
    catch (RemoteException paramn)
    {
      while (true)
      {
        ab.e("MicroMsg.exdevice.RDeviceTaskDispatcher", "mDispatcher.registExDeviceInvokerHandler failed!!, %s", new Object[] { paramn.getMessage() });
        ab.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", paramn, "", new Object[0]);
        AppMethodBeat.o(19642);
        bool = false;
      }
    }
  }

  public final long[] bpl()
  {
    AppMethodBeat.i(19635);
    try
    {
      long[] arrayOfLong = this.lwT.bpl();
      AppMethodBeat.o(19635);
      return arrayOfLong;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
      {
        ab.e("MicroMsg.exdevice.RDeviceTaskDispatcher", "getDeviceList failed!!! %s", new Object[] { localRemoteException.getMessage() });
        ab.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", localRemoteException, "", new Object[0]);
        Object localObject = null;
        AppMethodBeat.o(19635);
      }
    }
  }

  public final boolean c(int paramInt, j paramj)
  {
    boolean bool1 = false;
    AppMethodBeat.i(19634);
    try
    {
      boolean bool2 = this.lwT.c(paramInt, paramj);
      bool1 = bool2;
      AppMethodBeat.o(19634);
      return bool1;
    }
    catch (RemoteException paramj)
    {
      while (true)
      {
        ab.e("MicroMsg.exdevice.RDeviceTaskDispatcher", "stopScan failed!!! %s", new Object[] { paramj.getMessage() });
        ab.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", paramj, "", new Object[0]);
        AppMethodBeat.o(19634);
      }
    }
  }

  public final boolean hZ(long paramLong)
  {
    boolean bool1 = false;
    AppMethodBeat.i(19637);
    u.bpx().hW(paramLong);
    try
    {
      bool2 = this.lwT.hZ(paramLong);
      AppMethodBeat.o(19637);
      return bool2;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
      {
        ab.e("MicroMsg.exdevice.RDeviceTaskDispatcher", "stopChannel failed!!! %s", new Object[] { localRemoteException.getMessage() });
        ab.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", localRemoteException, "", new Object[0]);
        AppMethodBeat.o(19637);
        boolean bool2 = bool1;
      }
    }
  }

  public final boolean ic(long paramLong)
  {
    boolean bool1 = false;
    AppMethodBeat.i(19646);
    try
    {
      bool2 = this.lwT.ic(paramLong);
      AppMethodBeat.o(19646);
      return bool2;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", localRemoteException, "", new Object[0]);
        AppMethodBeat.o(19646);
        boolean bool2 = bool1;
      }
    }
  }

  public final void setChannelSessionKey(long paramLong, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(19640);
    ab.i("MicroMsg.exdevice.RDeviceTaskDispatcher", "------setChannelSessionKey------ deviceId = %d", new Object[] { Long.valueOf(paramLong) });
    try
    {
      this.lwT.setChannelSessionKey(paramLong, paramArrayOfByte);
      AppMethodBeat.o(19640);
      return;
    }
    catch (RemoteException paramArrayOfByte)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", paramArrayOfByte, "", new Object[0]);
        AppMethodBeat.o(19640);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.x
 * JD-Core Version:    0.6.2
 */