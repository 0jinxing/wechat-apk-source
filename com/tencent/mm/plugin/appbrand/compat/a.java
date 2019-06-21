package com.tencent.mm.plugin.appbrand.compat;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.w;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelappbrand.b;
import com.tencent.mm.plugin.appbrand.compat.a.a.a;
import com.tencent.mm.plugin.appbrand.r.r;
import com.tencent.mm.plugin.appbrand.ui.AppBrandNearbyWebViewUI;
import com.tencent.mm.plugin.appbrand.ui.AppBrandSearchUI;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.protocal.protobuf.aqt;
import com.tencent.mm.protocal.protobuf.aqu;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.Map;

final class a
  implements com.tencent.mm.plugin.appbrand.compat.a.a
{
  public final Intent D(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(17018);
    Intent localIntent = new Intent();
    localIntent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.vxI);
    localIntent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.vxE);
    localIntent.putExtra("neverGetA8Key", true);
    localIntent.setClass(paramContext, AppBrandSearchUI.class);
    localIntent.putExtra("key_trust_url", true);
    localIntent.putExtra("title", paramContext.getString(2131296635));
    localIntent.putExtra("searchbar_tips", paramContext.getString(2131296635));
    localIntent.putExtra("KRightBtn", true);
    localIntent.putExtra("ftsneedkeyboard", true);
    localIntent.putExtra("ftsType", 64);
    localIntent.putExtra("ftsbizscene", paramInt);
    Map localMap = r.d(paramInt, true, 64);
    Object localObject = b.abv();
    localMap.put("WASessionId", localObject);
    localMap.put("sessionId", localObject);
    localMap.put("subSessionId", localObject);
    localIntent.putExtra("rawUrl", r.E(localMap));
    localIntent.putExtra("key_load_js_without_delay", true);
    localIntent.addFlags(67108864);
    localIntent.putExtra("key_session_id", (String)localObject);
    localIntent.putExtra("sessionId", (String)localObject);
    localIntent.putExtra("subSessionId", (String)localObject);
    localObject = g.RP().Ry().get(ac.a.xQg, null);
    if ((localObject != null) && ((localObject instanceof String)))
    {
      localObject = (String)localObject;
      localIntent.putExtra("key_search_input_hint", (String)localObject);
      if ((paramContext instanceof Activity))
        break label307;
    }
    label307: for (boolean bool = true; ; bool = false)
    {
      localIntent.putExtra("key_alpha_in", bool);
      localIntent.putExtra("key_preload_biz", 5);
      AppMethodBeat.o(17018);
      return localIntent;
      localObject = "";
      break;
    }
  }

  public final void T(Context paramContext, String paramString)
  {
    AppMethodBeat.i(17016);
    paramString = new Intent(paramContext, AppBrandNearbyWebViewUI.class).putExtra("rawUrl", paramString);
    paramString.putExtra("title", paramContext.getString(2131296727));
    if (!(paramContext instanceof Activity))
      paramString.addFlags(268435456);
    if ((paramContext instanceof Activity))
    {
      ((Activity)paramContext).startActivityForResult(paramString, 3);
      AppMethodBeat.o(17016);
    }
    while (true)
    {
      return;
      paramContext.startActivity(paramString);
      AppMethodBeat.o(17016);
    }
  }

  public final void U(Context paramContext, String paramString)
  {
    AppMethodBeat.i(17017);
    paramString = new Intent(paramContext, AppBrandNearbyWebViewUI.class).putExtra("rawUrl", paramString);
    paramString.putExtra("title", paramContext.getString(2131296697));
    if (!(paramContext instanceof Activity))
      paramString.addFlags(268435456);
    if ((paramContext instanceof Activity))
    {
      ((Activity)paramContext).startActivityForResult(paramString, 4);
      AppMethodBeat.o(17017);
    }
    while (true)
    {
      return;
      paramContext.startActivity(paramString);
      AppMethodBeat.o(17017);
    }
  }

  public final void a(j.b paramb, String paramString1, String paramString2, String paramString3, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(17019);
    l.a(paramb, paramString1, paramString2, paramString3, null, paramArrayOfByte);
    AppMethodBeat.o(17019);
  }

  public final void a(a.a parama)
  {
    AppMethodBeat.i(17020);
    b.a locala = new b.a();
    locala.fsJ = new aqt();
    locala.fsK = new aqu();
    locala.uri = "/cgi-bin/mmoc-bin/hardware/getwerunuserstate";
    locala.fsI = 1926;
    locala.fsL = 0;
    locala.fsM = 0;
    w.a(locala.acD(), new a.1(this, parama), true);
    AppMethodBeat.o(17020);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.compat.a
 * JD-Core Version:    0.6.2
 */