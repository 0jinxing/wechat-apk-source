package com.tencent.mm.plugin.appbrand.appusage;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.config.q;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.service.e;
import com.tencent.mm.plugin.appbrand.service.i.a;
import com.tencent.mm.plugin.appbrand.service.i.b;
import com.tencent.mm.plugin.appbrand.service.i.c;
import com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI;
import com.tencent.mm.protocal.protobuf.anx;
import com.tencent.mm.sdk.g.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class am
  implements com.tencent.mm.plugin.appbrand.service.i
{
  public final void a(Context paramContext, i.c paramc, String paramString)
  {
    AppMethodBeat.i(129732);
    AppBrandStatObject localAppBrandStatObject = new AppBrandStatObject();
    localAppBrandStatObject.scene = 1054;
    localAppBrandStatObject.cst = paramString;
    ((e)g.K(e.class)).a(paramContext, paramc.username, null, paramc.har, paramc.axy, null, localAppBrandStatObject);
    AppMethodBeat.o(129732);
  }

  public final void a(Context paramContext, String paramString, i.a parama)
  {
    AppMethodBeat.i(129731);
    Intent localIntent = new Intent(paramContext, AppBrandLauncherUI.class);
    localIntent.putExtra("extra_enter_scene", 10);
    localIntent.putExtra("extra_enter_scene_note", paramString + ":" + parama.tag);
    paramContext.startActivity(localIntent);
    AppMethodBeat.o(129731);
  }

  public final i.b axP()
  {
    int i = 4;
    AppMethodBeat.i(129730);
    Object localObject1 = new i.b();
    ((i.b)localObject1).items = new ArrayList(0);
    ((i.b)localObject1).iDI = -1;
    ((i.b)localObject1).cEh = "";
    if (!g.RN().eJb)
      AppMethodBeat.o(129730);
    while (true)
    {
      return localObject1;
      if (!i.axb())
      {
        AppMethodBeat.o(129730);
      }
      else
      {
        Object localObject2 = x.axM();
        i.b localb = new i.b();
        int j;
        if (localObject2 == null)
        {
          localObject1 = null;
          localb.cEh = ((String)localObject1);
          if (localObject2 != null)
            break label303;
          j = 0;
          label100: localb.iDI = j;
          if (localObject2 != null)
            break label312;
          localObject1 = new am.1(this, f.auT().a(new String[] { "brandId", "versionType" }, 4, 0));
          j = i;
        }
        while (true)
        {
          localb.items = new ArrayList(j);
          while (((Iterator)localObject1).hasNext())
          {
            localObject2 = (Object[])((Iterator)localObject1).next();
            WxaAttributes localWxaAttributes = f.auO().d((String)localObject2[0], new String[] { "nickname", "brandIconURL" });
            if (localWxaAttributes != null)
            {
              i.c localc = new i.c();
              localc.username = ((String)localObject2[0]);
              localc.har = ((Integer)localObject2[1]).intValue();
              localc.axy = ((Integer)localObject2[2]).intValue();
              localc.nickname = localWxaAttributes.field_nickname;
              localc.haO = localWxaAttributes.field_brandIconURL;
              localb.items.add(localc);
            }
          }
          localObject1 = ((anx)localObject2).nzz;
          break;
          label303: j = ((anx)localObject2).wst;
          break label100;
          label312: localObject1 = new am.2(this, (anx)localObject2);
          j = ((anx)localObject2).wss.size();
          d.post(new am.3(this, (anx)localObject2), "BatchSyncWxaAttrBySearchShowOut");
        }
        localObject1 = x.a.hau;
        x.axL();
        AppMethodBeat.o(129730);
        localObject1 = localb;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.am
 * JD-Core Version:    0.6.2
 */