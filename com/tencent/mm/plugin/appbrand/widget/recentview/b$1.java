package com.tencent.mm.plugin.appbrand.widget.recentview;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

final class b$1
  implements Runnable
{
  b$1(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(114931);
    if (this.jno.jmK <= 0L)
    {
      ab.d("MicroMsg.AppBrandRecentViewReporter", "[report] mOpenTime <= 0");
      AppMethodBeat.o(114931);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.AppBrandRecentViewReporter", "[report] mOpenTime: %s, mRecentCountAtOpen: %s, mRecentCountAtClose: %s, mCloseType: %s, mScrollRecentCount: %s, mOpenRecentAppBrandList: %s, mDeleteRecentCount: %s, mDeleteRecentAppBrandList: %s, \ndragCountWhenClose: %d, mStarCountAtOpen: %d, mStarCountAtClose: %d, mScrollStarCount: %d, mOpenStarAppBrandList: %s, mDeleteStarCount: %d, mDeleteStarAppBrandList: %s, \nmMoveToFirstCount: %d, mClickRecentAppBrandList: %s, mClickStarAppBrandList: %s, mMoveStarAppBrandToFirstList: %s, mAddCollectionCount: %d, mAddCollectionAppBrandList: %s", new Object[] { Long.valueOf(this.jno.jmK), Integer.valueOf(this.jno.jmN), Integer.valueOf(this.jno.jmO), Integer.valueOf(this.jno.jmL), Integer.valueOf(this.jno.jmP), this.jno.jmS.toString(), Integer.valueOf(this.jno.jmQ), this.jno.jmT.toString(), Integer.valueOf(this.jno.jmM), Integer.valueOf(this.jno.jmW), Integer.valueOf(this.jno.jmX), Integer.valueOf(this.jno.jmY), this.jno.jnd.toString(), Integer.valueOf(this.jno.jmZ), this.jno.jne.toString(), Integer.valueOf(this.jno.jna), this.jno.jmU.toString(), this.jno.jng.toString(), this.jno.jnf.toString(), Integer.valueOf(this.jno.jmR), this.jno.jmV.toString() });
      h.pYm.e(15081, new Object[] { Long.valueOf(this.jno.jmK), Integer.valueOf(this.jno.jmN), Integer.valueOf(this.jno.jmO), Integer.valueOf(this.jno.jmL), Integer.valueOf(this.jno.jmP), this.jno.jmS.toString(), Integer.valueOf(this.jno.jmQ), this.jno.jmT.toString(), Integer.valueOf(this.jno.jmM), Integer.valueOf(this.jno.jmW), Integer.valueOf(this.jno.jmX), Integer.valueOf(this.jno.jmY), this.jno.jnd.toString(), Integer.valueOf(this.jno.jmZ), this.jno.jne.toString(), Integer.valueOf(this.jno.jna), this.jno.jmU.toString(), this.jno.jng.toString(), this.jno.jnf.toString(), Integer.valueOf(this.jno.jmR), this.jno.jmV.toString() });
      b.a(this.jno);
      AppMethodBeat.o(114931);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.recentview.b.1
 * JD-Core Version:    0.6.2
 */