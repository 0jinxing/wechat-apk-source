package com.a.a;

import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Looper;
import android.os.RemoteException;
import android.os.ServiceManager;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
{
  private c bBV;
  private b bBW;
  a.a bBX;
  private int bBY;
  a.b bBZ;
  int bCa;
  private IBinder.DeathRecipient bCb;

  private a(c paramc, Looper paramLooper)
  {
    AppMethodBeat.i(118219);
    this.bCa = -1;
    this.bCb = new a.1(this);
    this.bBV = paramc;
    paramLooper = new a.a(this, paramLooper);
    this.bBY = 1;
    this.bBW = new a.2(this);
    if (!this.bBV.a(this.bBW, 1))
    {
      paramc = new RuntimeException();
      AppMethodBeat.o(118219);
      throw paramc;
    }
    this.bBX = paramLooper;
    paramc.asBinder().linkToDeath(this.bCb, 0);
    AppMethodBeat.o(118219);
  }

  public static a vN()
  {
    Object localObject = null;
    AppMethodBeat.i(118218);
    c localc = vQ();
    if (localc == null)
      AppMethodBeat.o(118218);
    while (true)
    {
      return localObject;
      Looper localLooper = Looper.getMainLooper();
      try
      {
        a locala = new com/a/a/a;
        locala.<init>(localc, localLooper);
        AppMethodBeat.o(118218);
        localObject = locala;
      }
      catch (Exception localException)
      {
        AppMethodBeat.o(118218);
      }
    }
  }

  public static int[] vP()
  {
    AppMethodBeat.i(118224);
    Object localObject = vQ();
    if (localObject == null)
    {
      localObject = new int[0];
      AppMethodBeat.o(118224);
    }
    while (true)
    {
      return localObject;
      try
      {
        localObject = ((c)localObject).vS();
        AppMethodBeat.o(118224);
      }
      catch (RemoteException localRemoteException)
      {
        int[] arrayOfInt = new int[0];
        AppMethodBeat.o(118224);
      }
    }
  }

  private static c vQ()
  {
    AppMethodBeat.i(118225);
    c localc = c.a.i(ServiceManager.getService("authentication_service"));
    AppMethodBeat.o(118225);
    return localc;
  }

  public final int a(a.b paramb, int[] paramArrayOfInt)
  {
    int i = -1;
    AppMethodBeat.i(118222);
    int j;
    if ((paramArrayOfInt == null) || (paramb == null))
    {
      AppMethodBeat.o(118222);
      j = i;
    }
    while (true)
    {
      return j;
      this.bBZ = paramb;
      this.bCa = 0;
      try
      {
        j = this.bBV.a(this.bBW, paramArrayOfInt, null);
        AppMethodBeat.o(118222);
      }
      catch (RemoteException paramb)
      {
        AppMethodBeat.o(118222);
        j = i;
      }
    }
  }

  public final void abort()
  {
    AppMethodBeat.i(118223);
    if (this.bBX != null)
      this.bBX.removeMessages(8);
    try
    {
      this.bBV.a(this.bBW);
      AppMethodBeat.o(118223);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
        AppMethodBeat.o(118223);
    }
  }

  public final void release()
  {
    AppMethodBeat.i(118220);
    if (this.bBX != null)
      this.bBX.removeMessages(8);
    try
    {
      this.bBV.b(this.bBW);
      this.bBV.asBinder().unlinkToDeath(this.bCb, 0);
      AppMethodBeat.o(118220);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
        AppMethodBeat.o(118220);
    }
  }

  public final int[] vO()
  {
    AppMethodBeat.i(118221);
    try
    {
      int[] arrayOfInt1 = this.bBV.c(this.bBW);
      AppMethodBeat.o(118221);
      return arrayOfInt1;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
      {
        int[] arrayOfInt2 = new int[0];
        AppMethodBeat.o(118221);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.a.a.a
 * JD-Core Version:    0.6.2
 */