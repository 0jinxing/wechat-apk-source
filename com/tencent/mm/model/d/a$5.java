package com.tencent.mm.model.d;

import android.content.pm.IPackageStatsObserver.Stub;
import android.content.pm.PackageStats;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class a$5 extends IPackageStatsObserver.Stub
{
  a$5(a parama)
  {
  }

  public final void onGetStatsCompleted(PackageStats paramPackageStats, boolean paramBoolean)
  {
    AppMethodBeat.i(16378);
    a.n(this.fph)[0] = paramPackageStats.cacheSize;
    a.n(this.fph)[1] = paramPackageStats.dataSize;
    a.n(this.fph)[2] = paramPackageStats.codeSize;
    ab.i("MicroMsg.HandlerTraceManager", "package cacheSize :%d ,dataSize :%d ,codeSize :%d ", new Object[] { Long.valueOf(paramPackageStats.cacheSize), Long.valueOf(paramPackageStats.dataSize), Long.valueOf(paramPackageStats.codeSize) });
    AppMethodBeat.o(16378);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.d.a.5
 * JD-Core Version:    0.6.2
 */