package com.tencent.mm.plugin.performance.elf;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;

final class AbstractProcessChecker$2
  implements Runnable
{
  AbstractProcessChecker$2(AbstractProcessChecker paramAbstractProcessChecker)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(111041);
    ah.doB().edit().putLong("MicroMsg.AbstractProcessChecker", System.currentTimeMillis() - AbstractProcessChecker.b(this.pfk)).commit();
    AbstractProcessChecker.c(this.pfk).postDelayed(this, 600000L);
    AppMethodBeat.o(111041);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.performance.elf.AbstractProcessChecker.2
 * JD-Core Version:    0.6.2
 */