package com.tencent.mm.plugin.ext.voicecontrol;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.fd;
import com.tencent.mm.sdk.platformtools.ab;

final class ExtControlProviderVoiceControl$2
  implements Runnable
{
  ExtControlProviderVoiceControl$2(ExtControlProviderVoiceControl paramExtControlProviderVoiceControl, a parama, fd paramfd)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(20441);
    ab.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] getResultMode getVoiceControlResult");
    a locala = this.lRv;
    int i = this.lRw.vHf;
    ab.i("MicroMsg.ext.NetSceneAppVoiceControl", "[voiceControl] setGetResultTimeOut %s", new Object[] { Integer.valueOf(i) });
    locala.lRC = i;
    this.lRu.a(this.lRv.lRx, this.lRv.appId, this.lRv.lRy);
    AppMethodBeat.o(20441);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.voicecontrol.ExtControlProviderVoiceControl.2
 * JD-Core Version:    0.6.2
 */