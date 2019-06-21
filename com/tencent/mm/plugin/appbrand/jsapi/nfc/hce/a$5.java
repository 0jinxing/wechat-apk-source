package com.tencent.mm.plugin.appbrand.jsapi.nfc.hce;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$5
  implements Runnable
{
  a$5(a parama, ComponentName paramComponentName)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(137889);
    a.g(this.hSu);
    Intent localIntent = new Intent("android.nfc.cardemulation.action.ACTION_CHANGE_DEFAULT");
    localIntent.putExtra("category", "payment");
    localIntent.putExtra("component", this.hSw);
    a.h(this.hSu).startActivityForResult(localIntent, 2);
    AppMethodBeat.o(137889);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.a.5
 * JD-Core Version:    0.6.2
 */