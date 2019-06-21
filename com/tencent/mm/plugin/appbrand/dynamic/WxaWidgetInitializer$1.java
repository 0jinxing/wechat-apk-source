package com.tencent.mm.plugin.appbrand.dynamic;

import android.os.Bundle;
import android.os.Parcelable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.ad;
import com.tencent.mm.g.b.a.cr;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.modelappbrand.u;
import com.tencent.mm.modelappbrand.v;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.dynamic.j.a;
import com.tencent.mm.plugin.appbrand.dynamic.j.a.2;
import com.tencent.mm.plugin.appbrand.dynamic.j.a.d;
import com.tencent.mm.plugin.appbrand.dynamic.j.a.e;
import com.tencent.mm.plugin.appbrand.dynamic.j.d;
import com.tencent.mm.protocal.protobuf.cvy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;

final class WxaWidgetInitializer$1
  implements Runnable
{
  WxaWidgetInitializer$1(String paramString1, int paramInt1, int paramInt2, String paramString2, int paramInt3, int paramInt4, String paramString3, int paramInt5, WxaWidgetInitializer.a parama, String paramString4, String paramString5)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(10718);
    ab.d("MicroMsg.WxaWidgetInitializer", "initialize(id : %s, pkgType : %s, version : %s)", new Object[] { this.val$id, Integer.valueOf(this.gQG), Integer.valueOf(this.hlL) });
    u.i("MicroMsg.WxaWidgetInitializer", "initialize(id : %s, pkgType : %s, version : %s)", new Object[] { this.val$id, Integer.valueOf(this.gQG), Integer.valueOf(this.hlL) });
    long l = System.currentTimeMillis();
    v.kT(1);
    Object localObject1 = a.a(this.val$appId, this.gQG, this.hlL, this.hlM, this.fwD, this.hlN);
    Object localObject2;
    if (localObject1 == null)
    {
      ab.e("MicroMsg.WxaWidgetInitializer", "getLaunchWxaWidgetInfo(id : %s, pkgType : %s, version : %s) return null.", new Object[] { this.val$id, Integer.valueOf(this.gQG), Integer.valueOf(this.hlL) });
      v.kT(3);
      localObject2 = new ad().eY(this.val$id).eZ(u.pr(this.val$id));
      ((ad)localObject2).cYw = this.hlO;
      ((ad)localObject2).cYs = 2L;
      ((ad)localObject2).cYt = System.currentTimeMillis();
      ((ad)localObject2).cYu = 2L;
      ((ad)localObject2).fa(at.gB(ah.getContext())).ajK();
      u.i("MicroMsg.WxaWidgetInitializer", "getLaunchWxaWidgetInfo(id : %s, pkgType : %s, version : %s) return null.", new Object[] { this.val$id, Integer.valueOf(this.gQG), Integer.valueOf(this.hlL) });
      if (this.hlP != null)
        this.hlP.a(this.val$id, this.val$appId, false, null);
      AppMethodBeat.o(10718);
    }
    while (true)
    {
      return;
      u.i("MicroMsg.WxaWidgetInitializer", "get lauch info , replace version %d with %d", new Object[] { Integer.valueOf(this.hlL), Integer.valueOf(((d)localObject1).hoY.vMG) });
      localObject2 = new ad().eY(this.val$id).eZ(u.pr(this.val$id));
      ((ad)localObject2).cYw = this.hlO;
      ((ad)localObject2).cYs = 2L;
      ((ad)localObject2).cYt = System.currentTimeMillis();
      ((ad)localObject2).cYu = 1L;
      ((ad)localObject2).fa(at.gB(ah.getContext())).ajK();
      v.kT(2);
      localObject2 = a.a(this.val$id, this.val$appId, this.hlQ, this.gQG, ((d)localObject1).hoY.vMG, this.hlR);
      if (localObject2 != null)
      {
        u.i("MicroMsg.WxaWidgetInitializer", "get WxaPkgWrapping info", new Object[0]);
        localObject1 = WxaWidgetInitializer.a(this.val$id, this.val$appId, (WxaPkgWrappingInfo)localObject2, (d)localObject1);
        if (this.hlP != null)
        {
          localObject3 = this.hlP;
          str = this.val$id;
          localObject2 = this.val$appId;
          if (localObject1 == null)
            break label581;
        }
        label581: for (boolean bool = true; ; bool = false)
        {
          ((WxaWidgetInitializer.a)localObject3).a(str, (String)localObject2, bool, (WxaWidgetContext)localObject1);
          localObject2 = new cr();
          ((cr)localObject2).cTl = 1L;
          localObject2 = ((cr)localObject2).hD(this.val$appId);
          ((cr)localObject2).dhm = (System.currentTimeMillis() - l);
          ((cr)localObject2).ajK();
          AppMethodBeat.o(10718);
          break;
        }
      }
      u.i("MicroMsg.WxaWidgetInitializer", "get widget PkgWrappingInfo(id : %s, pkgType : %s, version : %s) return null.", new Object[] { this.val$id, Integer.valueOf(this.gQG), Integer.valueOf(((d)localObject1).hoY.vMG) });
      if (this.hlP != null)
        this.hlP.bI(this.val$id, this.val$appId);
      localObject2 = this.val$id;
      String str = this.val$appId;
      Object localObject3 = this.hlQ;
      int i = this.gQG;
      localObject1 = new WxaWidgetInitializer.1.1(this, (d)localObject1);
      if ((i != -2147483648) && (a.b((String)localObject2, str, (String)localObject3, i) == null))
      {
        localObject3 = new Bundle();
        ((Bundle)localObject3).putString("id", (String)localObject2);
        ((Bundle)localObject3).putString("appId", str);
        ((Bundle)localObject3).putInt("debugType", i);
        f.a("com.tencent.mm", (Parcelable)localObject3, a.d.class, new a.2((a.e)localObject1));
      }
      AppMethodBeat.o(10718);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.WxaWidgetInitializer.1
 * JD-Core Version:    0.6.2
 */