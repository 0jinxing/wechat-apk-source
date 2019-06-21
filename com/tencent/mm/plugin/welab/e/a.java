package com.tencent.mm.plugin.welab.e;

import android.app.Activity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.se;
import com.tencent.mm.g.c.cq;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.welab.a.a.b;
import com.tencent.mm.plugin.welab.a.a.d;
import com.tencent.mm.storage.z;

public final class a
  implements b
{
  public final String ddq()
  {
    return null;
  }

  public final String ddr()
  {
    return null;
  }

  public final void f(Activity paramActivity, String paramString)
  {
    AppMethodBeat.i(26582);
    paramString = ((d)g.K(d.class)).agJ(paramString);
    paramActivity = new se();
    paramActivity.cOf.userName = paramString.field_WeAppUser;
    paramActivity.cOf.cOh = paramString.field_WeAppPath;
    paramActivity.cOf.scene = 1051;
    paramActivity.cOf.cOi = paramString.field_WeAppDebugMode;
    paramActivity.cOf.cst = String.format("%s:%s:%s:%s", new Object[] { (String)g.RP().Ry().get(2, null), paramString.field_expId, paramString.field_LabsAppId, Long.valueOf(System.currentTimeMillis() / 1000L) });
    com.tencent.mm.sdk.b.a.xxA.m(paramActivity);
    AppMethodBeat.o(26582);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.welab.e.a
 * JD-Core Version:    0.6.2
 */