package com.tencent.mm.plugin.appbrand.luggage.b;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.r.b;
import com.tencent.mm.plugin.appbrand.r.q.a;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.sdk.platformtools.g;

public final class h
  implements q.a
{
  private String version;

  public h(Context paramContext)
  {
    AppMethodBeat.i(80436);
    this.version = "";
    paramContext = b.getPackageInfo(paramContext, ah.getPackageName());
    StringBuilder localStringBuilder;
    String str;
    if (paramContext != null)
    {
      this.version += g.ar(null, d.vxo);
      this.version = (this.version + "." + paramContext.versionCode);
      this.version = (this.version + "(" + f.CLIENT_VERSION + ")");
      localStringBuilder = new StringBuilder().append(this.version).append(" Process/");
      str = ah.getPackageName().trim().toLowerCase();
      paramContext = ah.getProcessName().trim().toLowerCase();
      if (!paramContext.equals(str))
        break label197;
      paramContext = "mm";
    }
    while (true)
    {
      this.version = paramContext;
      AppMethodBeat.o(80436);
      return;
      label197: if (paramContext.startsWith(str))
        paramContext = paramContext.substring(str.length() + 1);
      else
        paramContext = "unknown";
    }
  }

  public final String xJ()
  {
    return " MicroMessenger/";
  }

  public final String xK()
  {
    return this.version;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.luggage.b.h
 * JD-Core Version:    0.6.2
 */