package com.tencent.mm.plugin.cloudvoip.cloudvoice.c;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

 enum h
{
  static
  {
    AppMethodBeat.i(135508);
    kzJ = new h("INSTANCE");
    kzK = new h[] { kzJ };
    AppMethodBeat.o(135508);
  }

  static void bgr()
  {
    AppMethodBeat.i(135505);
    ab.i("MicroMsg.OpenVoice.OpenVoiceNetworkMgr", "hy: stop listen to network change");
    tD(1);
    AppMethodBeat.o(135505);
  }

  static void tD(int paramInt)
  {
    AppMethodBeat.i(135506);
    ab.i("MicroMsg.OpenVoice.OpenVoiceNetworkMgr", "hy: operate network change: %d", new Object[] { Integer.valueOf(paramInt) });
    String str = ah.getProcessName();
    ab.i("MicroMsg.OpenVoice.OpenVoiceNetworkMgr", "hy: current process name is %s", new Object[] { str });
    Bundle localBundle = new Bundle();
    localBundle.putString("from_process", str);
    localBundle.putInt("opcode", paramInt);
    f.a("com.tencent.mm", localBundle, h.a.class);
    AppMethodBeat.o(135506);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cloudvoip.cloudvoice.c.h
 * JD-Core Version:    0.6.2
 */