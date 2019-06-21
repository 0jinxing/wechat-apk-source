package com.tencent.mm.modelvoice;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;

final class RemoteController$RemoteControlReceiver$1
  implements ap.a
{
  RemoteController$RemoteControlReceiver$1(RemoteController.RemoteControlReceiver paramRemoteControlReceiver)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(116584);
    ab.d("MicroMsg.RemoteControlReceiver", "got remote key event up");
    if (RemoteController.RemoteControlReceiver.alR() != null)
      RemoteController.RemoteControlReceiver.alR();
    RemoteController.RemoteControlReceiver.alS();
    AppMethodBeat.o(116584);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.RemoteController.RemoteControlReceiver.1
 * JD-Core Version:    0.6.2
 */