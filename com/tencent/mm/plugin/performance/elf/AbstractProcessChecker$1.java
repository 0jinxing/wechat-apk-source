package com.tencent.mm.plugin.performance.elf;

import android.content.Intent;
import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class AbstractProcessChecker$1
  implements Runnable
{
  AbstractProcessChecker$1(AbstractProcessChecker paramAbstractProcessChecker, Intent paramIntent)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(111040);
    ElfCheckRequest localElfCheckRequest;
    if ("ACTION_ELF_CHECK".equals(this.val$intent.getAction()))
    {
      localElfCheckRequest = (ElfCheckRequest)this.val$intent.getParcelableExtra("MicroMsg.ElfCheckRequest");
      if (localElfCheckRequest == null)
      {
        ab.w("MicroMsg.AbstractProcessChecker", "pass this check,because request is null! ????");
        AppMethodBeat.o(111040);
      }
    }
    while (true)
    {
      return;
      boolean bool = this.pfk.Q(Process.myPid(), localElfCheckRequest.oJs);
      ab.i("MicroMsg.AbstractProcessChecker", "[onReceive] begin to check process[%s] isCanKill:%s isNeedReCall:%s", new Object[] { AbstractProcessChecker.getProcessName(), Boolean.valueOf(bool), Boolean.valueOf(this.pfk.bZj()) });
      if (bool)
      {
        this.pfk.bZk();
        AppMethodBeat.o(111040);
      }
      else
      {
        AbstractProcessChecker.a(this.pfk);
        AppMethodBeat.o(111040);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.performance.elf.AbstractProcessChecker.1
 * JD-Core Version:    0.6.2
 */