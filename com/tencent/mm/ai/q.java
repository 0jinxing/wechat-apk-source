package com.tencent.mm.ai;

import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.network.c;
import com.tencent.mm.network.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class q
  implements c
{
  private final d ftQ;

  public q(d paramd)
  {
    this.ftQ = paramd;
  }

  private String getUsername()
  {
    AppMethodBeat.i(58214);
    try
    {
      String str = this.ftQ.getUsername();
      AppMethodBeat.o(58214);
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
      {
        ab.e("MicroMsg.RAccInfo", "exception:%s", new Object[] { bo.l(localRemoteException) });
        Object localObject = null;
        AppMethodBeat.o(58214);
      }
    }
  }

  public final int QF()
  {
    int i = 0;
    AppMethodBeat.i(58213);
    try
    {
      int j = this.ftQ.QF();
      i = j;
      AppMethodBeat.o(58213);
      return i;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
      {
        ab.e("MicroMsg.RAccInfo", "exception:%s", new Object[] { bo.l(localRemoteException) });
        AppMethodBeat.o(58213);
      }
    }
  }

  public final int S(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(58226);
    try
    {
      i = this.ftQ.S(paramArrayOfByte);
      AppMethodBeat.o(58226);
      return i;
    }
    catch (Exception paramArrayOfByte)
    {
      while (true)
      {
        ab.e("MicroMsg.RAccInfo", "AccInfoCacheInWorker parseBuf exception:%s", new Object[] { bo.l(paramArrayOfByte) });
        int i = -6;
        AppMethodBeat.o(58226);
      }
    }
  }

  public final void a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, int paramInt)
  {
    AppMethodBeat.i(58217);
    try
    {
      this.ftQ.a(paramArrayOfByte1, paramArrayOfByte2, paramArrayOfByte3, paramInt);
      AppMethodBeat.o(58217);
      return;
    }
    catch (RemoteException paramArrayOfByte1)
    {
      while (true)
      {
        ab.e("MicroMsg.RAccInfo", "exception:%s", new Object[] { bo.l(paramArrayOfByte1) });
        AppMethodBeat.o(58217);
      }
    }
  }

  public final byte[] ada()
  {
    AppMethodBeat.i(58211);
    try
    {
      byte[] arrayOfByte = this.ftQ.ada();
      AppMethodBeat.o(58211);
      return arrayOfByte;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
      {
        ab.e("MicroMsg.RAccInfo", "exception:%s", new Object[] { bo.l(localRemoteException) });
        Object localObject = null;
        AppMethodBeat.o(58211);
      }
    }
  }

  public final boolean adb()
  {
    boolean bool1 = false;
    AppMethodBeat.i(58215);
    try
    {
      boolean bool2 = this.ftQ.adb();
      bool1 = bool2;
      AppMethodBeat.o(58215);
      return bool1;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.RAccInfo", "exception:%s", new Object[] { bo.l(localException) });
        AppMethodBeat.o(58215);
      }
    }
  }

  public final byte[] adc()
  {
    AppMethodBeat.i(58222);
    try
    {
      byte[] arrayOfByte = this.ftQ.adc();
      AppMethodBeat.o(58222);
      return arrayOfByte;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
      {
        ab.e("MicroMsg.RAccInfo", "exception:%s", new Object[] { bo.l(localRemoteException) });
        Object localObject = null;
        AppMethodBeat.o(58222);
      }
    }
  }

  public final boolean ade()
  {
    boolean bool1 = true;
    AppMethodBeat.i(58224);
    try
    {
      boolean bool2 = this.ftQ.ade();
      bool1 = bool2;
      AppMethodBeat.o(58224);
      return bool1;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
      {
        ab.e("MicroMsg.RAccInfo", "exception:%s", new Object[] { bo.l(localRemoteException) });
        AppMethodBeat.o(58224);
      }
    }
  }

  public final byte[] adf()
  {
    AppMethodBeat.i(58225);
    try
    {
      byte[] arrayOfByte = this.ftQ.adf();
      AppMethodBeat.o(58225);
      return arrayOfByte;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.RAccInfo", "AccInfoCacheInWorker getCacheBuffer exception:%s", new Object[] { bo.l(localException) });
        Object localObject = null;
        AppMethodBeat.o(58225);
      }
    }
  }

  public final void cE(boolean paramBoolean)
  {
    AppMethodBeat.i(58223);
    try
    {
      this.ftQ.cE(paramBoolean);
      AppMethodBeat.o(58223);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
      {
        ab.e("MicroMsg.RAccInfo", "exception:%s", new Object[] { bo.l(localRemoteException) });
        AppMethodBeat.o(58223);
      }
    }
  }

  public final void hB(int paramInt)
  {
    AppMethodBeat.i(58227);
    try
    {
      this.ftQ.hB(paramInt);
      AppMethodBeat.o(58227);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.RAccInfo", "exception:%s", new Object[] { bo.l(localException) });
        AppMethodBeat.o(58227);
      }
    }
  }

  public final byte[] jQ(int paramInt)
  {
    AppMethodBeat.i(58212);
    try
    {
      byte[] arrayOfByte = this.ftQ.jQ(paramInt);
      AppMethodBeat.o(58212);
      return arrayOfByte;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
      {
        ab.e("MicroMsg.RAccInfo", "exception:%s", new Object[] { bo.l(localRemoteException) });
        Object localObject = null;
        AppMethodBeat.o(58212);
      }
    }
  }

  public final void o(String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(58220);
    try
    {
      this.ftQ.o(paramString, paramArrayOfByte);
      AppMethodBeat.o(58220);
      return;
    }
    catch (RemoteException paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.RAccInfo", "exception:%s", new Object[] { bo.l(paramString) });
        AppMethodBeat.o(58220);
      }
    }
  }

  public final byte[] qr(String paramString)
  {
    AppMethodBeat.i(58221);
    try
    {
      paramString = this.ftQ.qr(paramString);
      AppMethodBeat.o(58221);
      return paramString;
    }
    catch (RemoteException paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.RAccInfo", "exception:%s", new Object[] { bo.l(paramString) });
        paramString = null;
        AppMethodBeat.o(58221);
      }
    }
  }

  public final void reset()
  {
    AppMethodBeat.i(58218);
    try
    {
      this.ftQ.reset();
      AppMethodBeat.o(58218);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
      {
        ab.e("MicroMsg.RAccInfo", "exception:%s", new Object[] { bo.l(localRemoteException) });
        AppMethodBeat.o(58218);
      }
    }
  }

  public final void setUsername(String paramString)
  {
    AppMethodBeat.i(58216);
    try
    {
      this.ftQ.setUsername(paramString);
      AppMethodBeat.o(58216);
      return;
    }
    catch (RemoteException paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.RAccInfo", "exception:%s", new Object[] { bo.l(paramString) });
        AppMethodBeat.o(58216);
      }
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(58219);
    String str = "RAccInfo:\n" + "|-uin     =" + QF() + "\n";
    str = str + "|-user    =" + getUsername() + "\n";
    str = str + "|-singlesession =" + bo.ca(jQ(1)) + "\n";
    str = str + "|-clientsession =" + bo.ca(jQ(2)) + "\n";
    str = str + "|-serversession =" + bo.ca(jQ(3)) + "\n";
    str = str + "|-ecdhkey =" + bo.ca(adc()) + "\n";
    str = str + "`-cookie  =" + bo.ca(ada());
    AppMethodBeat.o(58219);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ai.q
 * JD-Core Version:    0.6.2
 */