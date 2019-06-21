package com.tencent.mm.plugin.appbrand.widget.recentview;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

public final class b$2
  implements Runnable
{
  public b$2(b paramb)
  {
  }

  public final void run()
  {
    int i = 1;
    AppMethodBeat.i(114932);
    if (this.jno.jmK <= 0L)
    {
      ab.d("MicroMsg.AppBrandRecentViewReporter", "[report] mOpenTime <= 0");
      AppMethodBeat.o(114932);
      return;
    }
    ab.i("MicroMsg.AppBrandRecentViewReporter", "mOpenTime: %d, mRecentCountAtOpen: %d, mRecentCountAtClose: %d, mCloseType: %d, mOpenRecentAppBrandList: %s, mDeleteRecentCount: %d, mDeleteRecentAppBrandList: %s,\nmStarCountAtOpen: %d, mStarCountAtClose: %d, mOpenStarAppBrandList: %s, mDeleteStarCount: %d, mDeleteStarAppBrandList: %s,\nmClickRecentAppBrandList: %s, mClickStarAppBrandList: %s, mAddCollectionCount: %d, mAddCollectionAppBrandList: %s, fullScreen: %b,\nmMoveStarAppBrandForwardCount: %d, mMoveStarAppBrandBackwardCount: %d, mScrollUpDown: %d, mShowSearchViewCount: %d, mClickSearchViewCount: %d,\nmMoveStarAppBrandForwardList: %s, mMoveStarAppBrandBackwardList: %s, mEnableNativeDynamicBackground: %b", new Object[] { Long.valueOf(this.jno.jmK), Integer.valueOf(this.jno.jmN), Integer.valueOf(this.jno.jmO), Integer.valueOf(this.jno.jmL), this.jno.jmS.toString(), Integer.valueOf(this.jno.jmQ), this.jno.jmT.toString(), Integer.valueOf(this.jno.jmW), Integer.valueOf(this.jno.jmX), this.jno.jnd.toString(), Integer.valueOf(this.jno.jmZ), this.jno.jne.toString(), this.jno.jmU.toString(), this.jno.jng.toString(), Integer.valueOf(this.jno.jmR), this.jno.jmV.toString(), Boolean.TRUE, Integer.valueOf(this.jno.jnb), Integer.valueOf(this.jno.jnc), Integer.valueOf(this.jno.jnk), Integer.valueOf(this.jno.jnl), Integer.valueOf(this.jno.jnm), this.jno.jnh.toString(), this.jno.jnj.toString(), Boolean.valueOf(this.jno.jnn) });
    h localh = h.pYm;
    long l = this.jno.jmK;
    int j = this.jno.jmN;
    int k = this.jno.jmO;
    int m = this.jno.jmL;
    String str1 = this.jno.jmS.toString();
    int n = this.jno.jmQ;
    String str2 = this.jno.jmT.toString();
    int i1 = this.jno.jmW;
    int i2 = this.jno.jmX;
    String str3 = this.jno.jnd.toString();
    int i3 = this.jno.jmZ;
    String str4 = this.jno.jne.toString();
    String str5 = this.jno.jmU.toString();
    String str6 = this.jno.jng.toString();
    int i4 = this.jno.jmR;
    String str7 = this.jno.jmV.toString();
    int i5 = this.jno.jnb;
    int i6 = this.jno.jnc;
    int i7 = this.jno.jnk;
    int i8 = this.jno.jnl;
    int i9 = this.jno.jnm;
    String str8 = this.jno.jnh.toString();
    String str9 = this.jno.jnj.toString();
    if (this.jno.jnn);
    while (true)
    {
      localh.e(15081, new Object[] { Long.valueOf(l), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(0), str1, Integer.valueOf(n), str2, Integer.valueOf(0), Integer.valueOf(i1), Integer.valueOf(i2), Integer.valueOf(0), str3, Integer.valueOf(i3), str4, Integer.valueOf(0), str5, str6, "", Integer.valueOf(i4), str7, Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), str8, str9, Integer.valueOf(i) });
      b.a(this.jno);
      AppMethodBeat.o(114932);
      break;
      i = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.recentview.b.2
 * JD-Core Version:    0.6.2
 */