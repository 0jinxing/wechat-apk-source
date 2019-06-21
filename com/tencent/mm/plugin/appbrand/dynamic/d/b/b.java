package com.tencent.mm.plugin.appbrand.dynamic.d.b;

import android.os.Bundle;
import android.os.Parcelable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.ad;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.modelappbrand.u;
import com.tencent.mm.modelappbrand.v;
import com.tencent.mm.plugin.appbrand.canvas.widget.DrawCanvasArg;
import com.tencent.mm.plugin.appbrand.canvas.widget.a.a;
import com.tencent.mm.plugin.appbrand.collector.CollectSession;
import com.tencent.mm.plugin.appbrand.collector.c;
import com.tencent.mm.plugin.appbrand.dynamic.h.d;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import org.json.JSONObject;

public final class b
  implements Runnable
{
  public com.tencent.mm.plugin.appbrand.dynamic.d.b.a.e hnA;
  public String hnB;
  public long hnC;
  public String hnw;
  public JSONObject hnx;
  public com.tencent.mm.plugin.appbrand.dynamic.d.b hny;
  public com.tencent.mm.z.b.b.a hnz;
  public String process;

  public final void a(String paramString1, String paramString2, JSONObject paramJSONObject, com.tencent.mm.plugin.appbrand.dynamic.d.b paramb, com.tencent.mm.z.b.b.a parama, com.tencent.mm.plugin.appbrand.dynamic.d.b.a.e parame, String paramString3)
  {
    AppMethodBeat.i(10889);
    this.process = paramString1;
    this.hnw = paramString2;
    this.hnx = paramJSONObject;
    this.hny = paramb;
    this.hnz = parama;
    this.hnA = parame;
    this.hnB = paramString3;
    this.hnC = System.currentTimeMillis();
    AppMethodBeat.o(10889);
  }

  public final void run()
  {
    AppMethodBeat.i(10890);
    Bundle localBundle;
    Object localObject1;
    if (this.hnA.Ai(this.hnB))
    {
      u.v("DrawCanvasRunnable", "running draw", new Object[0]);
      localBundle = new Bundle();
      localBundle.putString("viewId", this.hnw);
      localBundle.putInt("drawStrategy", this.hnA.azV());
      localBundle.putString("remoteProcess", com.tencent.mm.ipcinvoker.e.PN());
      a.bN(this.hnw, this.hnB);
      switch (this.hnA.azV())
      {
      default:
        localObject1 = null;
        Object localObject2 = d.o(this.hnx);
        CollectSession localCollectSession = c.bD((String)localObject2, "after_jsapi_invoke");
        localBundle.putString("__session_id", (String)localObject2);
        localBundle.putParcelable("__cost_time_session", localCollectSession);
        v.kT(19);
        localObject2 = new ad().eZ(u.pr(this.hnw));
        ((ad)localObject2).cYw = u.pq(this.hnw);
        ((ad)localObject2).cYs = 11L;
        localObject2 = ((ad)localObject2).eY(this.hnw);
        ((ad)localObject2).cYt = System.currentTimeMillis();
        ((ad)localObject2).fa(at.gB(ah.getContext())).ajK();
        if (f.a(this.process, localBundle, a.class, new b.1(this, (DrawCanvasArg)localObject1)))
        {
          this.hnA.azU();
          AppMethodBeat.o(10890);
        }
        break;
      case 1:
      case 0:
      case 2:
      }
    }
    while (true)
    {
      return;
      localObject1 = (String)this.hnA.d(this.hnx, this.hnB);
      this.hnA.bs(this.hnB);
      localBundle.putString("jsApiInvokeData", (String)localObject1);
      localObject1 = null;
      break;
      localObject1 = (DrawCanvasArg)this.hnA.d(this.hnx, this.hnB);
      this.hnA.bs(localObject1);
      localBundle.putParcelable("jsApiInvokeDataObj", (Parcelable)localObject1);
      break;
      if (localObject1 != null)
        ((DrawCanvasArg)localObject1).reset();
      AppMethodBeat.o(10890);
      continue;
      if ((this.hnz != null) && (this.hny != null))
        this.hnz.au(this.hny.a(true, "same actions with last draw, drop this", null));
      AppMethodBeat.o(10890);
    }
  }

  static class a
    implements com.tencent.mm.ipcinvoker.a<Bundle, Bundle>
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.d.b.b
 * JD-Core Version:    0.6.2
 */