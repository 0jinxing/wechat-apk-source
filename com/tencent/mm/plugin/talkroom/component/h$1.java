package com.tencent.mm.plugin.talkroom.component;

import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.ab;

final class h$1
  implements Runnable
{
  h$1(h paramh, PInt paramPInt1, PInt paramPInt2, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(25736);
    h.a(this.sxF, true);
    try
    {
      h.a(this.sxF).p(this.sxC.value, this.sxD.value, this.sxE);
      h.a(this.sxF, false);
      AppMethodBeat.o(25736);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.TalkRoomPlayer", localRemoteException, "", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.component.h.1
 * JD-Core Version:    0.6.2
 */