package com.tencent.mm.plugin.appbrand.dynamic;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.ad;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.ipcinvoker.wx_extension.service.ToolsProcessIPCService;
import com.tencent.mm.model.v.b;
import com.tencent.mm.modelappbrand.t;
import com.tencent.mm.modelappbrand.u;
import com.tencent.mm.modelappbrand.v;
import com.tencent.mm.plugin.appbrand.dynamic.f.g;
import com.tencent.mm.plugin.appbrand.h.x;
import com.tencent.mm.protocal.protobuf.xr;
import com.tencent.mm.protocal.protobuf.xs;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.Set;

public final class c
  implements com.tencent.mm.plugin.appbrand.canvas.widget.b
{
  String Kg;
  boolean apg;
  String appId;
  volatile com.tencent.mm.z.c.e eIn;
  String eIq;
  String hcl;
  int hlj;
  boolean hlk;
  com.tencent.mm.plugin.appbrand.widget.e hll;
  String hlm;
  volatile boolean hln;
  volatile boolean hlo;
  private volatile boolean hlp;
  boolean hlq;
  boolean hlr;
  private com.tencent.mm.ipcinvoker.wx_extension.b.a hls;
  Runnable hlt;
  Context mContext;
  String mUrl;

  public c(Context paramContext)
  {
    AppMethodBeat.i(10668);
    this.hlq = false;
    this.hlr = false;
    this.mContext = paramContext;
    this.hls = new c.1(this);
    this.hlt = new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(10661);
        c.this.azx();
        AppMethodBeat.o(10661);
      }
    };
    AppMethodBeat.o(10668);
  }

  final void a(com.tencent.mm.z.c.e parame, com.tencent.mm.plugin.appbrand.widget.e parame1)
  {
    boolean bool1 = false;
    AppMethodBeat.i(10672);
    boolean bool2;
    if ((parame == null) || (parame1 == null) || (bo.isNullOrNil(parame1.field_data)))
      if (parame == null)
      {
        bool2 = true;
        if (parame1 == null)
          bool1 = true;
        ab.i("MicroMsg.DynamicPageViewIPCProxy", "pushData failed, jsBridge(isNull : %s) or cacheData(isNull : %s) or cacheData.field_data is null", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
        AppMethodBeat.o(10672);
      }
    while (true)
    {
      return;
      bool2 = false;
      break;
      u.i("MicroMsg.DynamicPageViewIPCProxy", "pushData %s", new Object[] { parame1.field_id });
      com.tencent.mm.plugin.appbrand.dynamic.f.c localc = new com.tencent.mm.plugin.appbrand.dynamic.f.c();
      localc.data = parame1.field_data;
      parame.a(localc, new c.6(this));
      parame = new Bundle();
      parame.putString("widgetId", parame1.field_id);
      parame.putString("respData", parame1.field_data);
      parame1 = i.azC().zV(parame1.field_id);
      u.i("MicroMsg.DynamicPageViewIPCProxy", "dispatch onDataPush event to view proce %s", new Object[] { parame1 });
      if (parame1 == null)
      {
        ToolsProcessIPCService.b(parame, c.a.class);
        AppMethodBeat.o(10672);
      }
      else
      {
        f.a(parame1, parame, c.a.class, null);
        AppMethodBeat.o(10672);
      }
    }
  }

  final void azx()
  {
    AppMethodBeat.i(10671);
    u.i("MicroMsg.DynamicPageViewIPCProxy", "try to refresh", new Object[0]);
    if (this.hlk)
      AppMethodBeat.o(10671);
    while (true)
    {
      return;
      com.tencent.mm.plugin.appbrand.widget.e locale = this.hll;
      if ((locale == null) || (!this.apg))
      {
        if (locale == null);
        for (boolean bool = true; ; bool = false)
        {
          u.i("MicroMsg.DynamicPageViewIPCProxy", "cacheData %b, mRunning %b", new Object[] { Boolean.valueOf(bool), Boolean.valueOf(this.apg) });
          AppMethodBeat.o(10671);
          break;
        }
      }
      if (this.hlo)
      {
        u.i("MicroMsg.DynamicPageViewIPCProxy", "paused", new Object[0]);
        this.hlp = true;
        AppMethodBeat.o(10671);
      }
      else if (bo.isNullOrNil(locale.field_appId))
      {
        ab.e("MicroMsg.DynamicPageViewIPCProxy", "tryToRefresh(%s) failed, has no appId", new Object[] { this.eIq });
        AppMethodBeat.o(10671);
      }
      else
      {
        this.hlp = false;
        long l = locale.field_updateTime + locale.field_interval * 1000L - System.currentTimeMillis();
        if (l > 0L)
        {
          u.i("MicroMsg.DynamicPageViewIPCProxy", "post delay refresh(%s) data.", new Object[] { Long.valueOf(l) });
          b.j(this.hlt, l);
          AppMethodBeat.o(10671);
        }
        else
        {
          u.i("MicroMsg.DynamicPageViewIPCProxy", "refresh data(%s, %s)", new Object[] { this.hll.field_id, this.hll.field_appId });
          if ((this.hlj == 1) && (!this.hlq))
          {
            v.kT(16);
            localObject = new ad().eZ(u.pr(this.eIq));
            ((ad)localObject).cYw = u.pq(this.eIq);
            ((ad)localObject).cYs = 9L;
            localObject = ((ad)localObject).eY(this.eIq);
            ((ad)localObject).cYt = System.currentTimeMillis();
            ((ad)localObject).fa(at.gB(ah.getContext())).ajK();
          }
          Object localObject = new com.tencent.mm.ai.b.a();
          ((com.tencent.mm.ai.b.a)localObject).fsI = 1193;
          ((com.tencent.mm.ai.b.a)localObject).uri = "/cgi-bin/mmbiz-bin/wxaapp/getdynamicdata";
          xr localxr = new xr();
          localxr.csB = locale.field_appId;
          localxr.key = locale.field_cacheKey;
          localxr.scene = this.hlj;
          localxr.query = this.Kg;
          localxr.url = this.mUrl;
          ((com.tencent.mm.ai.b.a)localObject).fsJ = localxr;
          ((com.tencent.mm.ai.b.a)localObject).fsK = new xs();
          com.tencent.mm.ipcinvoker.wx_extension.b.a(((com.tencent.mm.ai.b.a)localObject).acD(), this.hls);
          AppMethodBeat.o(10671);
        }
      }
    }
  }

  public final boolean bJ(String paramString1, String paramString2)
  {
    AppMethodBeat.i(10669);
    boolean bool;
    if ((this.eIn == null) || (TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2)))
    {
      bool = false;
      AppMethodBeat.o(10669);
    }
    while (true)
    {
      return bool;
      bool = this.eIn.R(paramString1, paramString2);
      AppMethodBeat.o(10669);
    }
  }

  final void cleanup()
  {
    AppMethodBeat.i(10670);
    if (this.hll != null)
      ab.i("MicroMsg.DynamicPageViewIPCProxy", "cleanup(%s, %s)", new Object[] { this.hll.field_id, this.hll.field_appId });
    while (true)
    {
      if (this.eIn != null)
        this.eIn.onStop();
      AppMethodBeat.o(10670);
      return;
      ab.i("MicroMsg.DynamicPageViewIPCProxy", "cleanup");
    }
  }

  public final boolean isPaused()
  {
    return this.hln;
  }

  public final void onResume()
  {
    AppMethodBeat.i(10674);
    ab.i("MicroMsg.DynamicPageViewIPCProxy", "onResume(%s)", new Object[] { this.eIq });
    boolean bool = this.hln;
    if (this.eIn != null)
    {
      com.tencent.mm.z.c.e locale = this.eIn;
      new g();
      locale.QA();
    }
    this.hln = false;
    bool = this.hlo;
    this.hlo = false;
    if ((bool) && (this.hlp))
      azx();
    AppMethodBeat.o(10674);
  }

  public final void q(Bundle paramBundle)
  {
    AppMethodBeat.i(10673);
    if (paramBundle == null)
      AppMethodBeat.o(10673);
    while (true)
    {
      return;
      if (this.eIn != null)
      {
        v.b localb = this.eIn.Qy();
        if (localb == null)
        {
          AppMethodBeat.o(10673);
        }
        else
        {
          Object localObject = paramBundle.keySet();
          if ((localObject == null) || (localb == null))
          {
            AppMethodBeat.o(10673);
          }
          else
          {
            Iterator localIterator = ((Set)localObject).iterator();
            while (localIterator.hasNext())
            {
              localObject = (String)localIterator.next();
              localb.j((String)localObject, paramBundle.get((String)localObject));
            }
          }
        }
      }
      else
      {
        AppMethodBeat.o(10673);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.c
 * JD-Core Version:    0.6.2
 */