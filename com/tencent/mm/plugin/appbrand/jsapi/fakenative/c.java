package com.tencent.mm.plugin.appbrand.jsapi.fakenative;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.kh;
import com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.a;
import com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.c.a;
import com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.c.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.p;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class c extends a
{
  public static final int CTRL_INDEX = 592;
  public static final String NAME = "openBusinessView";
  private p eir;
  boolean hJm = false;
  private com.tencent.mm.sdk.b.c<kh> hJn;

  private void a(com.tencent.mm.plugin.appbrand.d paramd, int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(131036);
    HashMap localHashMap = new HashMap();
    localHashMap.put("errCode", Integer.valueOf(paramInt2));
    paramd.M(paramInt1, j(paramString, localHashMap));
    AppMethodBeat.o(131036);
  }

  public final com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.c aDv()
  {
    return e.hJB;
  }

  final void aDw()
  {
    AppMethodBeat.i(131037);
    if (this.eir != null)
    {
      this.eir.dismiss();
      this.eir = null;
    }
    AppMethodBeat.o(131037);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.fakenative.c
 * JD-Core Version:    0.6.2
 */