package com.tencent.mm.plugin.performance.elf;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;

final class b$a
  implements Runnable
{
  public final void run()
  {
    AppMethodBeat.i(111069);
    ab.i("MicroMsg.ProcessElf", "send check broadcast!");
    ElfCheckRequest localElfCheckRequest = new ElfCheckRequest();
    localElfCheckRequest.oJs = b.bZm();
    Intent localIntent = new Intent("ACTION_ELF_CHECK");
    localIntent.putExtra("MicroMsg.ElfCheckRequest", localElfCheckRequest);
    ah.getContext().sendBroadcast(localIntent);
    b.bZr().postDelayed(this, b.bZm());
    AppMethodBeat.o(111069);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.performance.elf.b.a
 * JD-Core Version:    0.6.2
 */