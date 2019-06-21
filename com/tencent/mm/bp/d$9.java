package com.tencent.mm.bp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

final class d$9
  implements a
{
  d$9(String paramString1, String paramString2, Intent paramIntent, Context paramContext, Bundle paramBundle)
  {
  }

  public final void onDone()
  {
    AppMethodBeat.i(114693);
    ab.d("MicroMsg.PluginHelper", "[DEBUG] onDone Load %s:%s", new Object[] { this.vwC, this.vwH });
    try
    {
      Intent localIntent;
      Object localObject;
      if (this.val$intent == null)
      {
        localIntent = new android/content/Intent;
        localIntent.<init>();
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        String str = ah.doz() + ".plugin." + this.vwC;
        if (!this.vwH.startsWith("."))
          break label170;
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        localObject = str + this.vwH;
        label112: localIntent.setClassName(ah.getPackageName(), (String)localObject);
        Class.forName((String)localObject, false, this.val$context.getClassLoader());
        if (!(this.val$context instanceof Activity))
          break label178;
        this.val$context.startActivity(localIntent, this.val$options);
        AppMethodBeat.o(114693);
      }
      while (true)
      {
        return;
        localIntent = this.val$intent;
        break;
        label170: localObject = this.vwH;
        break label112;
        label178: localIntent.addFlags(268435456);
        this.val$context.startActivity(localIntent, this.val$options);
        AppMethodBeat.o(114693);
      }
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      while (true)
      {
        ab.e("MicroMsg.PluginHelper", "Class Not Found when startActivity %s", new Object[] { localClassNotFoundException });
        AppMethodBeat.o(114693);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bp.d.9
 * JD-Core Version:    0.6.2
 */