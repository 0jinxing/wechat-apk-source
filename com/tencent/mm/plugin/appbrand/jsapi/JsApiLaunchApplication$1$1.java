package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.protocal.protobuf.avk;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import java.util.List;

final class JsApiLaunchApplication$1$1
  implements Runnable
{
  JsApiLaunchApplication$1$1(JsApiLaunchApplication.1 param1, int paramInt1, int paramInt2, b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(130438);
    if ((this.crc != 0) || (this.crd != 0))
    {
      this.hxl.hsD.M(this.hxl.eIl, this.hxl.hxk.j("fail:check fail", null));
      AppMethodBeat.o(130438);
    }
    while (true)
    {
      return;
      avk localavk = (avk)this.fuz.fsH.fsP;
      switch (localavk.cyE)
      {
      case 1:
      default:
        this.hxl.hsD.M(this.hxl.eIl, this.hxl.hxk.j("fail:check fail 1", null));
        AppMethodBeat.o(130438);
        break;
      case 2:
        this.hxl.hsD.M(this.hxl.eIl, this.hxl.hxk.j("fail:check fail forbidden scene 2", null));
        AppMethodBeat.o(130438);
        break;
      case 0:
        JsApiLaunchApplication.a locala = new JsApiLaunchApplication.a(new JsApiLaunchApplication.1.1.1(this));
        ab.i("MicroMsg.JsApiLaunchApplication", "launchApplication check result(showType : %d, errCode : %d)", new Object[] { Integer.valueOf(localavk.wzs), Integer.valueOf(localavk.cyE) });
        if (!bo.isNullOrNil(this.hxl.hxf))
        {
          Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse(this.hxl.hxf));
          localIntent.addFlags(268435456);
          localObject = bo.H(this.hxl.hsD.getContext(), localIntent);
          if ((localObject != null) && (!((List)localObject).isEmpty()))
          {
            if ((TextUtils.isEmpty(localIntent.getPackage())) && (((List)localObject).size() == 1));
            for (localObject = g.b((ResolveInfo)((List)localObject).get(0)); ; localObject = localIntent.getPackage())
            {
              if (bo.nullAsNil(ah.getPackageName()).equals(localObject))
                break label376;
              al.d(new JsApiLaunchApplication.1.1.2(this, localIntent, localavk, locala));
              AppMethodBeat.o(130438);
              break;
            }
          }
        }
        label376: Object localObject = new JsApiLaunchApplication.LaunchApplicationTask((MMActivity)this.hxl.hsD.getContext());
        ((JsApiLaunchApplication.LaunchApplicationTask)localObject).appId = this.hxl.hxh;
        ((JsApiLaunchApplication.LaunchApplicationTask)localObject).hxq = this.hxl.hxi;
        ((JsApiLaunchApplication.LaunchApplicationTask)localObject).extInfo = this.hxl.hxj;
        ((JsApiLaunchApplication.LaunchApplicationTask)localObject).cvs = this.hxl.hxg;
        ((JsApiLaunchApplication.LaunchApplicationTask)localObject).showType = localavk.wzs;
        ((JsApiLaunchApplication.LaunchApplicationTask)localObject).hww = new JsApiLaunchApplication.1.1.3(this, (JsApiLaunchApplication.LaunchApplicationTask)localObject);
        ((JsApiLaunchApplication.LaunchApplicationTask)localObject).aBV();
        ((JsApiLaunchApplication.LaunchApplicationTask)localObject).aBU();
        AppMethodBeat.o(130438);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplication.1.1
 * JD-Core Version:    0.6.2
 */