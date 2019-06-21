package com.tencent.mm.network;

import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bj;
import com.tencent.mm.sdk.platformtools.bo;

final class t$1 extends bj<Object>
{
  t$1(t paramt, int paramInt)
  {
    super(1000L, null, (byte)0);
  }

  public final Object run()
  {
    AppMethodBeat.i(58551);
    try
    {
      t.mA(this.fuc);
      AppMethodBeat.o(58551);
      return null;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
        ab.e("MicroMsg.MMAutoAuth", "exception:%s", new Object[] { bo.l(localRemoteException) });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.t.1
 * JD-Core Version:    0.6.2
 */