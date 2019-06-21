package com.tencent.mm.plugin.appbrand.dynamic.launching;

import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a.a;
import com.tencent.mm.ai.x;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelappbrand.u;
import com.tencent.mm.plugin.appbrand.a.d;
import com.tencent.mm.plugin.appbrand.appcache.ax;
import com.tencent.mm.plugin.appbrand.dynamic.g.a.1;
import com.tencent.mm.plugin.appbrand.dynamic.k.b;
import com.tencent.mm.plugin.appbrand.widget.i;
import com.tencent.mm.plugin.appbrand.widget.j;
import com.tencent.mm.protocal.protobuf.axt;
import com.tencent.mm.protocal.protobuf.cvx;
import com.tencent.mm.protocal.protobuf.cvy;
import com.tencent.mm.protocal.protobuf.cwv;
import com.tencent.mm.protocal.protobuf.cyc;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.Callable;

public final class a
  implements Callable<j>
{
  final String appId;
  final int axy;
  final int cBc;
  final int hog;
  final String hoh;
  final int scene;

  public a(String paramString1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString2)
  {
    this.appId = paramString1;
    this.cBc = paramInt1;
    this.axy = paramInt2;
    this.scene = paramInt3;
    this.hog = paramInt4;
    this.hoh = paramString2;
  }

  public final j azY()
  {
    AppMethodBeat.i(10917);
    j localj = new j();
    localj.field_appId = this.appId;
    Object localObject2 = ((com.tencent.mm.plugin.appbrand.widget.a.a)g.K(com.tencent.mm.plugin.appbrand.widget.a.a.class)).auQ();
    if (localObject2 == null)
    {
      localj = null;
      AppMethodBeat.o(10917);
    }
    while (true)
    {
      return localj;
      Object localObject3 = new cyc();
      ((cyc)localObject3).wzF = b.nO(this.cBc);
      ((cyc)localObject3).vMG = this.axy;
      ((cyc)localObject3).xtw = this.hog;
      ((cyc)localObject3).Scene = this.scene;
      ((cyc)localObject3).xtx = 0;
      int i;
      if (((i)localObject2).a(localj, new String[] { "appId", "pkgType", "widgetType" }))
      {
        if (localj.field_jsApiInfo != null)
        {
          i = 1;
          label135: if ((i != 0) && (localj.field_launchAction != null) && (1 == localj.field_launchAction.vAS) && (localj.field_versionInfo != null) && (localj.field_versionInfo.vMG >= this.axy))
            break label549;
        }
      }
      else
      {
        if ((this.hoh == null) || (this.hoh.length() <= 0))
          break label490;
        u.i("MicroMsg.AppBrand.PrepareStepCheckWidgetLaunchInfo", "has preloaded launch data", new Object[0]);
      }
      try
      {
        localObject2 = new com/tencent/mm/protocal/protobuf/axt;
        ((axt)localObject2).<init>();
        ((axt)localObject2).parseFrom(Base64.decode(this.hoh, 0));
        boolean bool;
        label238: cwv localcwv;
        if (((axt)localObject2).wBQ == null)
        {
          bool = true;
          u.i("MicroMsg.AppBrand.PrepareStepCheckWidgetLaunchInfo", "preload launch info versioninfo is null %b", new Object[] { Boolean.valueOf(bool) });
          localj = ((com.tencent.mm.plugin.appbrand.widget.a.a)g.K(com.tencent.mm.plugin.appbrand.widget.a.a.class)).auQ().a(this.appId, this.cBc, this.hog, (axt)localObject2);
          if (((axt)localObject2).wBQ != null)
          {
            String str = ((d)g.K(d.class)).xF().at(this.appId, this.cBc);
            localcwv = new com/tencent/mm/protocal/protobuf/cwv;
            localcwv.<init>();
            localcwv.xsy = str;
            localcwv.vMG = ((axt)localObject2).wBQ.vMG;
            if (this.cBc != 10102)
              break label419;
            localcwv.xsx = ((axt)localObject2).wBQ.xrR;
            ((d)g.K(d.class)).xF().a(this.appId, localcwv, this.cBc);
          }
        }
        while (true)
        {
          AppMethodBeat.o(10917);
          break;
          i = 0;
          break label135;
          bool = false;
          break label238;
          label419: if (this.cBc == 10002)
          {
            localcwv.xsx = ((axt)localObject2).wBQ.xrQ;
            ((d)g.K(d.class)).xF().a(this.appId, localcwv, this.cBc);
          }
        }
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.AppBrand.PrepareStepCheckWidgetLaunchInfo", "preload launch data parse fail[%s]", new Object[] { this.hoh });
      }
      label490: localObject3 = new com.tencent.mm.plugin.appbrand.dynamic.g.a(this.appId, true, (cyc)localObject3);
      Object localObject1 = x.c(((com.tencent.mm.plugin.appbrand.dynamic.g.a)localObject3).ehh);
      ((com.tencent.mm.plugin.appbrand.dynamic.g.a)localObject3).a(((a.a)localObject1).errType, ((a.a)localObject1).errCode, ((a.a)localObject1).aIm, (axt)((a.a)localObject1).fsy);
      localObject1 = ((com.tencent.mm.plugin.appbrand.dynamic.g.a)localObject3).hoA;
      AppMethodBeat.o(10917);
      continue;
      label549: com.tencent.mm.ce.a.post(new a.1(new com.tencent.mm.plugin.appbrand.dynamic.g.a(this.appId, false, (cyc)localObject3)));
      AppMethodBeat.o(10917);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.launching.a
 * JD-Core Version:    0.6.2
 */