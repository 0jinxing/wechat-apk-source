package com.tencent.mm.plugin.zero;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.booter.NotifyReceiver.NotifyService;
import com.tencent.mm.ci.a;
import com.tencent.mm.plugin.zero.a.c;

public final class PluginZero$b extends a<c>
  implements c
{
  public final void a(NotifyReceiver.NotifyService paramNotifyService, int paramInt, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, long paramLong)
  {
    AppMethodBeat.i(58761);
    a(new PluginZero.b.1(this, paramNotifyService, paramInt, paramArrayOfByte1, paramArrayOfByte2, paramLong));
    AppMethodBeat.o(58761);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.zero.PluginZero.b
 * JD-Core Version:    0.6.2
 */