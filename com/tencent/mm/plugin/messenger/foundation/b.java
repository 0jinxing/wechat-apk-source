package com.tencent.mm.plugin.messenger.foundation;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.messenger.foundation.a.r;
import com.tencent.mm.plugin.messenger.foundation.a.t;
import com.tencent.mm.protocal.protobuf.tb;
import com.tencent.mm.protocal.protobuf.vg;
import com.tencent.mm.storage.be;

public final class b
  implements r
{
  public final void a(tb paramtb, byte[] paramArrayOfByte, boolean paramBoolean, t paramt)
  {
    AppMethodBeat.i(1024);
    switch (paramtb.wat)
    {
    default:
    case 7:
    }
    while (true)
    {
      AppMethodBeat.o(1024);
      return;
      paramtb = (vg)new vg().parseFrom(paramArrayOfByte);
      ((j)g.K(j.class)).XR().aoX(aa.a(paramtb.wcB));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.messenger.foundation.b
 * JD-Core Version:    0.6.2
 */