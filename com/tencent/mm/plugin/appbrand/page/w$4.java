package com.tencent.mm.plugin.appbrand.page;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.a.d;
import com.tencent.mm.plugin.appbrand.config.a.a.b;
import com.tencent.mm.plugin.appbrand.jsapi.t;
import com.tencent.mm.plugin.appbrand.page.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Map;

final class w$4
  implements am
{
  private boolean foreground;
  private int itA;
  private int itB;
  private final a.b[] itC;
  private final t itD;
  private boolean itz;

  w$4(w paramw, Context paramContext)
  {
    AppMethodBeat.i(132379);
    this.itz = false;
    this.foreground = false;
    this.itC = new a.b[] { a.b.hiO, a.b.hiP, a.b.hiN, a.b.hiM };
    this.itD = new t();
    AppMethodBeat.o(132379);
  }

  private <EVENT extends t> void a(EVENT paramEVENT)
  {
    AppMethodBeat.i(132384);
    a.d locald = this.itx.getPageConfig();
    if (locald == null)
      AppMethodBeat.o(132384);
    while (true)
    {
      return;
      int[] arrayOfInt = com.tencent.mm.plugin.appbrand.s.w.d(this.itx.atK());
      Map localMap = w.h(this.itx);
      localMap.put("originalPageOrientation", locald.hfD);
      localMap.put("lastPageOrientation", this.itx.isQ);
      paramEVENT.a(this.itx, this.itx.hashCode(), this.itx.aBk().getWidth(), this.itx.aBk().getHeight(), arrayOfInt[0], arrayOfInt[1], this.val$context.getResources().getConfiguration().orientation, localMap);
      AppMethodBeat.o(132384);
    }
  }

  private void aJX()
  {
    AppMethodBeat.i(132383);
    if (!this.itx.isRunning())
      AppMethodBeat.o(132383);
    while (true)
    {
      return;
      if (w.f(this.itx))
      {
        a(new w.b((byte)0));
        ab.i("MicroMsg.AppBrandPageViewWC", "tryDispatchViewDidResize, appId[%s], url[%s], now_orientation[%s], send onAppRouteResized instead", new Object[] { this.itx.getAppId(), this.itx.getURL(), this.itx.isQ });
        w.g(this.itx);
        AppMethodBeat.o(132383);
      }
      else
      {
        a(this.itD);
        AppMethodBeat.o(132383);
      }
    }
  }

  private boolean di(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(132380);
    a.b localb1 = com.tencent.mm.plugin.appbrand.config.a.a.yV(this.itx.isQ);
    a.b localb2 = localb1;
    if (localb1 == null)
      localb2 = a.b.hiK;
    boolean bool;
    if (org.apache.commons.b.a.contains(this.itC, localb2))
      if (paramInt1 > paramInt2)
      {
        AppMethodBeat.o(132380);
        bool = true;
      }
    while (true)
    {
      return bool;
      AppMethodBeat.o(132380);
      bool = false;
      continue;
      if (a.b.hiK == localb2)
      {
        if (paramInt2 > paramInt1)
        {
          AppMethodBeat.o(132380);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(132380);
          bool = false;
        }
      }
      else
      {
        AppMethodBeat.o(132380);
        bool = true;
      }
    }
  }

  public final void aAS()
  {
    AppMethodBeat.i(132382);
    if (this.itz)
    {
      ab.i("MicroMsg.AppBrandPageViewWC", "onForeground dispatch ViewDidResize appId[%s] url[%s]", new Object[] { this.itx.getAppId(), this.itx.getURL() });
      aJX();
      this.itz = false;
    }
    this.itx.isT.onOrientationChanged(this.val$context.getResources().getConfiguration().orientation);
    this.foreground = true;
    AppMethodBeat.o(132382);
  }

  public final void aAT()
  {
    this.foreground = false;
  }

  public final void aJW()
  {
    AppMethodBeat.i(132381);
    int i = this.itx.aBk().getWidth();
    int j = this.itx.aBk().getHeight();
    if ((i <= 0) || (j <= 0))
    {
      ab.e("MicroMsg.AppBrandPageViewWC", "onPageLayout wtf invalid window size [%d %d], appId[%s], url[%s]", new Object[] { Integer.valueOf(i), Integer.valueOf(j), this.itx.getAppId(), this.itx.getURL() });
      AppMethodBeat.o(132381);
    }
    while (true)
    {
      return;
      boolean bool1;
      label104: boolean bool2;
      label150: boolean bool3;
      if ((i != this.itA) || (j != this.itB))
      {
        bool1 = true;
        this.itA = i;
        this.itB = j;
        int[] arrayOfInt = com.tencent.mm.plugin.appbrand.s.w.d(this.itx);
        if ((!di(i, j)) || (!di(arrayOfInt[0], arrayOfInt[1])))
          break label302;
        bool2 = true;
        if ((this.itA == 0) || (this.itB == 0))
          break label308;
        bool3 = true;
        label167: ab.i("MicroMsg.AppBrandPageViewWC", "onPageLayout appId[%s], url[%s], hadInit[%b], winSizeChanged[%b], winSizeMatched[%b], foreground[%b], needDispatch[%b]", new Object[] { this.itx.getAppId(), this.itx.getURL(), Boolean.valueOf(bool3), Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(this.foreground), Boolean.valueOf(this.itz) });
        if (((!bool3) || (!bool1) || (!bool2)) && ((!w.f(this.itx)) || (!bool2)))
          break label314;
        i = 1;
      }
      while (true)
        if (i != 0)
        {
          if (this.foreground)
          {
            aJX();
            AppMethodBeat.o(132381);
            break;
            bool1 = false;
            break label104;
            label302: bool2 = false;
            break label150;
            label308: bool3 = false;
            break label167;
            label314: i = 0;
            continue;
          }
          this.itz = true;
          AppMethodBeat.o(132381);
          break;
        }
      this.itz = false;
      AppMethodBeat.o(132381);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.w.4
 * JD-Core Version:    0.6.2
 */