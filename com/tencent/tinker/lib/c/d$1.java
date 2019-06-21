package com.tencent.tinker.lib.c;

import com.tencent.tinker.lib.util.a;
import com.tencent.tinker.loader.TinkerDexOptimizer.ResultCallback;
import java.io.File;
import java.util.List;

final class d$1
  implements TinkerDexOptimizer.ResultCallback
{
  long startTime;

  d$1(List paramList, Throwable[] paramArrayOfThrowable)
  {
  }

  public final void ai(File paramFile)
  {
    this.startTime = System.currentTimeMillis();
    a.i("Tinker.DexDiffPatchInternal", "start to parallel optimize dex %s, size: %d", new Object[] { paramFile.getPath(), Long.valueOf(paramFile.length()) });
  }

  public final void b(File paramFile, Throwable paramThrowable)
  {
    a.i("Tinker.DexDiffPatchInternal", "fail to parallel optimize dex %s use time %d", new Object[] { paramFile.getPath(), Long.valueOf(System.currentTimeMillis() - this.startTime) });
    this.ABs.add(paramFile);
    this.ABt[0] = paramThrowable;
  }

  public final void i(File paramFile1, File paramFile2)
  {
    a.i("Tinker.DexDiffPatchInternal", "success to parallel optimize dex %s, opt file:%s, opt file size: %d, use time %d", new Object[] { paramFile1.getPath(), paramFile2.getPath(), Long.valueOf(paramFile2.length()), Long.valueOf(System.currentTimeMillis() - this.startTime) });
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.lib.c.d.1
 * JD-Core Version:    0.6.2
 */