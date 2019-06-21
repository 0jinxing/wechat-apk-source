package com.tencent.mm.network;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.al;

public final class x extends o.a
{
  public final void reportKV(long paramLong, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(72652);
    g.RS().aa(new x.1(this, paramBoolean1, paramLong, paramString, paramBoolean2));
    AppMethodBeat.o(72652);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.x
 * JD-Core Version:    0.6.2
 */