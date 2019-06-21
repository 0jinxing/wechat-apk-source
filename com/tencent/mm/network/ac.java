package com.tencent.mm.network;

import android.os.Build.VERSION;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.bo;

public final class ac extends i.a
{
  private ap frk;
  private int gei;
  private long gej;
  private int gek;
  private final RemoteCallbackList<n> gel;

  public ac()
  {
    AppMethodBeat.i(58684);
    this.gei = 4;
    this.gek = 0;
    this.gel = new RemoteCallbackList();
    this.frk = new ap(new ap.a()
    {
      public final boolean BI()
      {
        AppMethodBeat.i(58683);
        int i = ac.b(ac.this).beginBroadcast();
        ab.i("MicroMsg.NetworkEvent", "listeners ct : %d", new Object[] { Integer.valueOf(i) });
        i--;
        while (true)
          if (i >= 0)
          {
            n localn = (n)ac.b(ac.this).getBroadcastItem(i);
            try
            {
              localn.gl(ac.c(ac.this));
              i--;
            }
            catch (RemoteException localRemoteException)
            {
              while (true)
                ab.e("MicroMsg.NetworkEvent", "exception:%s", new Object[] { bo.l(localRemoteException) });
            }
          }
        ac.b(ac.this).finishBroadcast();
        AppMethodBeat.o(58683);
        return false;
      }
    }
    , false);
    AppMethodBeat.o(58684);
  }

  private boolean mE(int paramInt)
  {
    boolean bool1 = false;
    boolean bool2;
    if (paramInt == this.gei)
      bool2 = bool1;
    while (true)
    {
      return bool2;
      if (3 == paramInt)
      {
        bool2 = bool1;
        if (this.gei == 2)
        {
          this.gei = paramInt;
          bool2 = true;
        }
      }
      else if (2 == paramInt)
      {
        bool2 = bool1;
        if (this.gei != 0)
        {
          bool2 = bool1;
          if (this.gei != 1)
          {
            this.gek += 1;
            if (this.gek > 0)
            {
              this.gei = 2;
              bool2 = true;
            }
          }
        }
      }
      else if (4 == paramInt)
      {
        this.gek = 0;
        this.gei = 4;
        bool2 = true;
      }
      else if ((Build.VERSION.SDK_INT >= 26) && (paramInt == -1))
      {
        this.gei = 0;
        bool2 = true;
      }
      else
      {
        this.gei = paramInt;
        bool2 = true;
      }
    }
  }

  public final int amP()
  {
    AppMethodBeat.i(58685);
    if (0L > bo.fp(this.gej));
    for (int i = 5; ; i = this.gei)
    {
      ab.i("MicroMsg.NetworkEvent", "getNowStatus = %d", new Object[] { Integer.valueOf(i) });
      AppMethodBeat.o(58685);
      return i;
    }
  }

  public final void amQ()
  {
    AppMethodBeat.i(58688);
    this.gel.kill();
    AppMethodBeat.o(58688);
  }

  public final long amR()
  {
    return this.gej;
  }

  public final boolean c(n paramn)
  {
    AppMethodBeat.i(58686);
    try
    {
      this.gel.register(paramn);
      AppMethodBeat.o(58686);
      return true;
    }
    catch (Exception paramn)
    {
      while (true)
      {
        ab.e("MicroMsg.NetworkEvent", "addListener %s", new Object[] { paramn });
        ab.e("MicroMsg.NetworkEvent", "exception:%s", new Object[] { bo.l(paramn) });
      }
    }
  }

  public final boolean d(n paramn)
  {
    boolean bool1 = false;
    AppMethodBeat.i(58687);
    try
    {
      boolean bool2 = this.gel.unregister(paramn);
      bool1 = bool2;
      AppMethodBeat.o(58687);
      return bool1;
    }
    catch (Exception paramn)
    {
      while (true)
      {
        ab.e("MicroMsg.NetworkEvent", "removeListener %s", new Object[] { paramn });
        ab.e("MicroMsg.NetworkEvent", "exception:%s", new Object[] { bo.l(paramn) });
      }
    }
  }

  public final void mF(int paramInt)
  {
    AppMethodBeat.i(58689);
    ab.i("MicroMsg.NetworkEvent", "networkChange : %d", new Object[] { Integer.valueOf(paramInt) });
    if (!mE(paramInt))
      AppMethodBeat.o(58689);
    while (true)
    {
      return;
      if ((this.gei != 0) && (this.gei != 4) && (this.gei != 6))
      {
        AppMethodBeat.o(58689);
      }
      else
      {
        this.frk.ae(1000L, 1000L);
        AppMethodBeat.o(58689);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.ac
 * JD-Core Version:    0.6.2
 */