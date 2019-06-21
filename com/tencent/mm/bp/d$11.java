package com.tencent.mm.bp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

final class d$11
  implements a
{
  d$11(Intent paramIntent, String paramString1, String paramString2, Context paramContext, int paramInt)
  {
  }

  public final void onDone()
  {
    AppMethodBeat.i(114695);
    Intent localIntent;
    String str;
    if (this.val$intent == null)
    {
      localIntent = new Intent();
      str = ah.doz() + ".plugin." + this.vwC;
      if (!this.vwH.startsWith("."))
        break label143;
      str = str + this.vwH;
      label83: localIntent.setClassName(ah.getPackageName(), str);
      if (!(this.val$context instanceof Activity))
        break label151;
      ((Activity)this.val$context).startActivityForResult(localIntent, this.val$requestCode);
      d.g(this.val$context, this.vwH, localIntent);
      AppMethodBeat.o(114695);
    }
    while (true)
    {
      return;
      localIntent = this.val$intent;
      break;
      label143: str = this.vwH;
      break label83;
      label151: ab.f("MicroMsg.PluginHelper", "context not activity, skipped");
      AppMethodBeat.o(114695);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bp.d.11
 * JD-Core Version:    0.6.2
 */