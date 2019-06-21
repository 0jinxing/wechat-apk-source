package com.tencent.mm.plugin.appbrand.dynamic;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.d.a;

public final class j$b
  implements a
{
  String appId = "";
  int css;
  String czZ;
  int fmr;
  String hlE = "";

  public j$b()
  {
  }

  public j$b(String paramString1, String paramString2, int paramInt1, String paramString3, int paramInt2)
  {
    this.hlE = paramString1;
    this.appId = paramString2;
    this.css = paramInt1;
    this.czZ = paramString3;
    this.fmr = paramInt2;
  }

  public final void fromBundle(Bundle paramBundle)
  {
    AppMethodBeat.i(10705);
    this.hlE = paramBundle.getString("widgetId");
    this.appId = paramBundle.getString("appid");
    this.css = paramBundle.getInt("appState");
    this.czZ = paramBundle.getString("reqKey");
    this.fmr = paramBundle.getInt("serviceType");
    AppMethodBeat.o(10705);
  }

  public final Bundle toBundle()
  {
    AppMethodBeat.i(10704);
    Bundle localBundle = new Bundle();
    localBundle.putString("widgetId", this.hlE);
    localBundle.putString("appid", this.appId);
    localBundle.putInt("appState", this.css);
    localBundle.putString("reqKey", this.czZ);
    localBundle.putInt("serviceType", this.fmr);
    AppMethodBeat.o(10704);
    return localBundle;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.j.b
 * JD-Core Version:    0.6.2
 */