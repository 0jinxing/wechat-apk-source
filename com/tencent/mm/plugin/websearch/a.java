package com.tencent.mm.plugin.websearch;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelappbrand.b;
import com.tencent.mm.plugin.websearch.api.j;
import com.tencent.mm.plugin.websearch.api.m;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.Map;

public final class a
  implements j
{
  private void a(Context paramContext, int paramInt, String paramString1, String paramString2, Map<String, String> paramMap, String paramString3)
  {
    AppMethodBeat.i(91335);
    a(paramContext, paramInt, paramString1, paramString2, true, paramMap, false, 2147483647, paramString3);
    AppMethodBeat.o(91335);
  }

  private void a(Context paramContext, int paramInt1, String paramString1, String paramString2, boolean paramBoolean1, Map<String, String> paramMap, boolean paramBoolean2, int paramInt2, String paramString3)
  {
    AppMethodBeat.i(91338);
    a(paramContext, paramInt1, paramString1, paramString2, true, paramMap, paramBoolean2, paramInt2, paramString3, 0, false);
    AppMethodBeat.o(91338);
  }

  private void a(Context paramContext, int paramInt1, String paramString1, String paramString2, boolean paramBoolean1, Map<String, String> paramMap, boolean paramBoolean2, int paramInt2, String paramString3, int paramInt3, boolean paramBoolean3)
  {
    AppMethodBeat.i(91340);
    ((m)g.K(m.class)).a(paramContext, new a.1(this, paramMap, paramString1, paramInt1, paramString2, paramBoolean1, paramInt3, paramString3, paramBoolean3, paramBoolean2, paramInt2, paramContext));
    AppMethodBeat.o(91340);
  }

  public final void a(Context paramContext, int paramInt, String paramString1, String paramString2, Map<String, String> paramMap)
  {
    AppMethodBeat.i(91332);
    b(paramContext, paramInt, paramString1, paramString2, paramMap, "");
    AppMethodBeat.o(91332);
  }

  public final void a(Context paramContext, int paramInt1, String paramString1, String paramString2, Map<String, String> paramMap, int paramInt2)
  {
    AppMethodBeat.i(91334);
    a(paramContext, paramInt1, paramString1, paramString2, true, paramMap, false, 2147483647, "", paramInt2, true);
    AppMethodBeat.o(91334);
  }

  public final void a(Context paramContext, int paramInt1, String paramString1, String paramString2, Map<String, String> paramMap, String paramString3, int paramInt2)
  {
    AppMethodBeat.i(91333);
    a(paramContext, paramInt1, paramString1, paramString2, true, paramMap, false, paramInt2, paramString3, 0, true);
    AppMethodBeat.o(91333);
  }

  public final void a(Context paramContext, String paramString1, String paramString2, Map<String, String> paramMap)
  {
    AppMethodBeat.i(91337);
    a(paramContext, 3, paramString1, paramString2, true, paramMap, true, -1, "");
    AppMethodBeat.o(91337);
  }

  public final void aa(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(91339);
    Intent localIntent = new Intent();
    localIntent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.vxI);
    localIntent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.vxE);
    localIntent.putExtra("neverGetA8Key", true);
    localIntent.putExtra("key_trust_url", true);
    localIntent.putExtra("KRightBtn", true);
    localIntent.putExtra("ftsneedkeyboard", true);
    localIntent.putExtra("ftsType", 64);
    localIntent.putExtra("ftsbizscene", paramInt);
    Map localMap = com.tencent.mm.plugin.websearch.a.a.bA(paramInt, "");
    Object localObject = b.abv();
    localMap.put("WASessionId", localObject);
    localMap.put("sessionId", localObject);
    localMap.put("subSessionId", localObject);
    localIntent.putExtra("rawUrl", com.tencent.mm.plugin.websearch.a.a.E(localMap));
    localIntent.putExtra("key_load_js_without_delay", true);
    localIntent.addFlags(67108864);
    localIntent.putExtra("key_session_id", (String)localObject);
    localIntent.putExtra("sessionId", (String)localObject);
    localIntent.putExtra("subSessionId", (String)localObject);
    localObject = g.RP().Ry().get(ac.a.xQg, null);
    if ((localObject != null) && ((localObject instanceof String)))
      localIntent.putExtra("key_search_input_hint", (String)localObject);
    d.b(paramContext, "appbrand", ".ui.AppBrandSearchUI", localIntent);
    AppMethodBeat.o(91339);
  }

  public final void b(Context paramContext, int paramInt, String paramString1, String paramString2, Map<String, String> paramMap, String paramString3)
  {
    AppMethodBeat.i(91336);
    a(paramContext, paramInt, paramString1, paramString2, paramMap, paramString3);
    AppMethodBeat.o(91336);
  }

  public final void z(Context paramContext, String paramString1, String paramString2)
  {
    AppMethodBeat.i(91331);
    a(paramContext, 16, paramString1, paramString2, null);
    AppMethodBeat.o(91331);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.a
 * JD-Core Version:    0.6.2
 */