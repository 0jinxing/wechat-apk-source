package com.tencent.mm.plugin.messenger.foundation;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.messenger.foundation.a.c;
import com.tencent.mm.plugin.messenger.foundation.a.d;
import com.tencent.mm.protocal.protobuf.bbv;
import com.tencent.mm.vending.b.b;

final class PluginMessengerFoundation$10
  implements d
{
  PluginMessengerFoundation$10(PluginMessengerFoundation paramPluginMessengerFoundation)
  {
  }

  public final b a(c paramc)
  {
    AppMethodBeat.i(1048);
    paramc = a.a(paramc);
    AppMethodBeat.o(1048);
    return paramc;
  }

  public final void a(bbv parambbv, String paramString)
  {
    AppMethodBeat.i(1047);
    a.a(parambbv, paramString, null, true, false);
    AppMethodBeat.o(1047);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation.10
 * JD-Core Version:    0.6.2
 */