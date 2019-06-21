package com.tencent.mm.model.d;

import android.content.pm.IPackageStatsObserver.Stub;
import android.content.pm.PackageStats;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class b$2 extends IPackageStatsObserver.Stub
{
  b$2(b paramb)
  {
  }

  public final void onGetStatsCompleted(PackageStats paramPackageStats, boolean paramBoolean)
  {
    AppMethodBeat.i(16392);
    b.d(this.fpv)[0] = paramPackageStats.cacheSize;
    b.d(this.fpv)[1] = paramPackageStats.dataSize;
    b.d(this.fpv)[2] = paramPackageStats.codeSize;
    ab.i("MicroMsg.SQLTraceManager", "package cacheSize :%d ,dataSize :%d ,codeSize :%d ", new Object[] { Long.valueOf(paramPackageStats.cacheSize), Long.valueOf(paramPackageStats.dataSize), Long.valueOf(paramPackageStats.codeSize) });
    AppMethodBeat.o(16392);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.d.b.2
 * JD-Core Version:    0.6.2
 */