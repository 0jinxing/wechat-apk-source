package com.tencent.mm.network;

import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bj;
import com.tencent.mm.sdk.platformtools.bo;

final class t$b$1 extends bj<Object>
{
  t$b$1(t.b paramb, r paramr, int paramInt1, int paramInt2)
  {
    super(1000L, null, (byte)0);
  }

  public final Object run()
  {
    AppMethodBeat.i(58568);
    try
    {
      t.a(t.b.a(this.gdE), this.gdD);
      AppMethodBeat.o(58568);
      return null;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
        ab.e("MicroMsg.MMAutoAuth", "exception:%s", new Object[] { bo.l(localRemoteException) });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.t.b.1
 * JD-Core Version:    0.6.2
 */