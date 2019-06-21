package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.protocal.protobuf.avk;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import java.util.List;

final class JsApiLaunchApplicationDirectly$1$1
  implements Runnable
{
  JsApiLaunchApplicationDirectly$1$1(JsApiLaunchApplicationDirectly.1 param1, int paramInt1, int paramInt2, com.tencent.mm.ai.b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(130455);
    if ((this.crc != 0) || (this.crd != 0))
    {
      this.hxA.hsD.M(this.hxA.eIl, this.hxA.hxz.j("fail:check fail", null));
      AppMethodBeat.o(130455);
    }
    while (true)
    {
      return;
      Object localObject1 = (avk)this.fuz.fsH.fsP;
      switch (((avk)localObject1).cyE)
      {
      case 1:
      default:
        this.hxA.hsD.M(this.hxA.eIl, this.hxA.hxz.j("fail:check fail 1", null));
        AppMethodBeat.o(130455);
        break;
      case 2:
        this.hxA.hsD.M(this.hxA.eIl, this.hxA.hxz.j("fail:check fail forbidden scene 2", null));
        AppMethodBeat.o(130455);
        break;
      case 0:
        if (((avk)localObject1).wzt == 1)
        {
          this.hxA.hsD.M(this.hxA.eIl, this.hxA.hxz.j("fail:install app denied", null));
          AppMethodBeat.o(130455);
        }
        else
        {
          ab.i("MicroMsg.JsApiLaunchApplicationDirectly", "launchApplication check result(showType:%d, errCode:%d, jumpFlog:%d)", new Object[] { Integer.valueOf(((avk)localObject1).wzs), Integer.valueOf(((avk)localObject1).cyE), Integer.valueOf(((avk)localObject1).wzt) });
          Object localObject2;
          Object localObject3;
          Object localObject4;
          if (com.tencent.mm.plugin.appbrand.r.b.getPackageInfo(ah.getContext(), this.hxA.val$packageName) == null)
          {
            localObject2 = this.hxA.hxz;
            localObject3 = this.hxA.hxw;
            String str1 = this.hxA.hxh;
            String str2 = this.hxA.hxx;
            localObject4 = this.hxA.hxy;
            localObject1 = this.hxA.val$packageName;
            q localq = this.hxA.hsD;
            int i = this.hxA.eIl;
            h.a(localq.getContext(), localq.getContext().getString(2131297121), "", localq.getContext().getString(2131296583), localq.getContext().getString(2131296574), false, new JsApiLaunchApplicationDirectly.3((JsApiLaunchApplicationDirectly)localObject2, localq, str1, (String)localObject3, str2, (String)localObject4, (String)localObject1, i), new JsApiLaunchApplicationDirectly.4((JsApiLaunchApplicationDirectly)localObject2, localq, i));
            AppMethodBeat.o(130455);
          }
          else
          {
            localObject2 = new JsApiLaunchApplicationDirectly.a(new JsApiLaunchApplicationDirectly.1.1.1(this));
            if (!bo.isNullOrNil(this.hxA.hxf))
            {
              localObject3 = new Intent("android.intent.action.VIEW", Uri.parse(this.hxA.hxf));
              ((Intent)localObject3).addFlags(268435456);
              localObject4 = bo.H(this.hxA.hsD.getContext(), (Intent)localObject3);
              if ((localObject4 != null) && (!((List)localObject4).isEmpty()))
              {
                if ((TextUtils.isEmpty(((Intent)localObject3).getPackage())) && (((List)localObject4).size() == 1));
                for (localObject4 = g.b((ResolveInfo)((List)localObject4).get(0)); ; localObject4 = ((Intent)localObject3).getPackage())
                {
                  if (bo.nullAsNil(ah.getPackageName()).equals(localObject4))
                    break label599;
                  al.d(new JsApiLaunchApplicationDirectly.1.1.2(this, (Intent)localObject3, (avk)localObject1, (JsApiLaunchApplicationDirectly.a)localObject2));
                  AppMethodBeat.o(130455);
                  break;
                }
              }
            }
            label599: localObject4 = new JsApiLaunchApplicationDirectly.LaunchApplicationTask((MMActivity)this.hxA.hsD.getContext());
            ((JsApiLaunchApplicationDirectly.LaunchApplicationTask)localObject4).appId = this.hxA.hxh;
            ((JsApiLaunchApplicationDirectly.LaunchApplicationTask)localObject4).hxq = this.hxA.hxi;
            ((JsApiLaunchApplicationDirectly.LaunchApplicationTask)localObject4).extInfo = this.hxA.hxj;
            ((JsApiLaunchApplicationDirectly.LaunchApplicationTask)localObject4).cvs = this.hxA.hxg;
            ((JsApiLaunchApplicationDirectly.LaunchApplicationTask)localObject4).showType = ((avk)localObject1).wzs;
            ((JsApiLaunchApplicationDirectly.LaunchApplicationTask)localObject4).hww = new JsApiLaunchApplicationDirectly.1.1.3(this, (JsApiLaunchApplicationDirectly.LaunchApplicationTask)localObject4);
            ((JsApiLaunchApplicationDirectly.LaunchApplicationTask)localObject4).aBV();
            ((JsApiLaunchApplicationDirectly.LaunchApplicationTask)localObject4).aBU();
            AppMethodBeat.o(130455);
          }
        }
        break;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplicationDirectly.1.1
 * JD-Core Version:    0.6.2
 */