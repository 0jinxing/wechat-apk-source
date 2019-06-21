package com.tencent.mm.plugin.appbrand.widget.recentview;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class BaseAppBrandRecentView$d
  implements Runnable
{
  List<a> iKa;
  List<a> jnP;
  boolean jnQ;

  public BaseAppBrandRecentView$d(BaseAppBrandRecentView paramBaseAppBrandRecentView)
  {
    AppMethodBeat.i(134354);
    this.jnQ = true;
    this.jnQ = true;
    this.iKa = new ArrayList();
    this.jnP = new ArrayList();
    AppMethodBeat.o(134354);
  }

  public final void run()
  {
    AppMethodBeat.i(134355);
    while (true)
    {
      synchronized (BaseAppBrandRecentView.f(this.jnL))
      {
        BaseAppBrandRecentView.a(this.jnL, true);
        Object localObject2 = null;
        if (BaseAppBrandRecentView.g(this.jnL) != null)
          localObject2 = BaseAppBrandRecentView.g(this.jnL).qr(this.jnL.getLoadCount());
        this.iKa.clear();
        this.jnP.clear();
        if (localObject2 == null)
          break;
        if (this.jnL.getSceneFactory() != null)
        {
          ??? = this.jnL.getSceneFactory().aJZ();
          Iterator localIterator = ((List)localObject2).iterator();
          if (!localIterator.hasNext())
            break;
          localObject2 = (LocalUsageInfo)localIterator.next();
          if ((??? != null) && (((LocalUsageInfo)localObject2).username.equals(((LocalUsageInfo)???).username)) && (((LocalUsageInfo)localObject2).har == ((LocalUsageInfo)???).har))
            continue;
          if (this.iKa.size() < this.jnL.getShowCount())
            this.iKa.add(new a((LocalUsageInfo)localObject2));
          if (BaseAppBrandRecentView.h(this.jnL))
            this.jnP.add(new a((LocalUsageInfo)localObject2));
          ab.d("MicroMsg.BaseAppBrandRecentView", "alvinluo info %s, %s, %s, %s, %s, %d, mType: %s", new Object[] { ((LocalUsageInfo)localObject2).username, ((LocalUsageInfo)localObject2).nickname, ((LocalUsageInfo)localObject2).bQo, ((LocalUsageInfo)localObject2).haO, ((LocalUsageInfo)localObject2).appId, Integer.valueOf(((LocalUsageInfo)localObject2).har), this.jnL.jax });
        }
      }
      ??? = null;
    }
    this.jnL.aR(this.iKa);
    ab.i("MicroMsg.BaseAppBrandRecentView", "[UpdateAppBrandRecentDataTask] type:%s preview size:%s, data size: %d, mType: %s", new Object[] { this.jnL.getType(), Integer.valueOf(BaseAppBrandRecentView.b(this.jnL).size()), Integer.valueOf(BaseAppBrandRecentView.i(this.jnL).size()), this.jnL.jax });
    al.d(new BaseAppBrandRecentView.d.1(this));
    AppMethodBeat.o(134355);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.recentview.BaseAppBrandRecentView.d
 * JD-Core Version:    0.6.2
 */