package com.tencent.mm.bp;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.MMWizardActivity;

final class d$7
  implements a
{
  d$7(Intent paramIntent1, String paramString1, String paramString2, Context paramContext, Intent paramIntent2)
  {
  }

  public final void onDone()
  {
    AppMethodBeat.i(114691);
    Intent localIntent;
    if (this.val$intent == null)
    {
      localIntent = new Intent();
      str = ah.doz() + ".plugin." + this.vwC;
      if (!this.vwH.startsWith("."))
        break label118;
    }
    label118: for (String str = str + this.vwH; ; str = this.vwH)
    {
      localIntent.setClassName(ah.getPackageName(), str);
      MMWizardActivity.b(this.val$context, localIntent, this.vwK);
      AppMethodBeat.o(114691);
      return;
      localIntent = this.val$intent;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bp.d.7
 * JD-Core Version:    0.6.2
 */