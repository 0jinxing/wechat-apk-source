package com.tencent.mm.plugin.hardcoder;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.in;
import com.tencent.mm.hardcoder.HardCoderJNI.SystemEventCallback;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;

final class PluginHardcoder$1$1
  implements HardCoderJNI.SystemEventCallback
{
  PluginHardcoder$1$1(PluginHardcoder.1 param1)
  {
  }

  public final void onEvent(int paramInt)
  {
    AppMethodBeat.i(60248);
    ab.i("MicroMsg.PluginHardcoder", "configure SystemEventCallback onEvent eventCode[%d]", new Object[] { Integer.valueOf(paramInt) });
    in localin = new in();
    localin.cDG.keycode = paramInt;
    a.xxA.m(localin);
    AppMethodBeat.o(60248);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.hardcoder.PluginHardcoder.1.1
 * JD-Core Version:    0.6.2
 */