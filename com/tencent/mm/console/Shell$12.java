package com.tencent.mm.console;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ip;
import com.tencent.mm.g.a.ip.a;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;

final class Shell$12
  implements Shell.a
{
  public final void s(Intent paramIntent)
  {
    AppMethodBeat.i(16120);
    ip localip = new ip();
    localip.cDI.cDN = paramIntent.getExtras().getString("path", "/data/local/tmp/test.apk");
    ab.w("MicroMsg.Shell", "hotpatch test [%s]", new Object[] { localip.cDI.cDN });
    a.xxA.m(localip);
    AppMethodBeat.o(16120);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.Shell.12
 * JD-Core Version:    0.6.2
 */