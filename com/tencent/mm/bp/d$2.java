package com.tencent.mm.bp;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;

final class d$2
  implements a
{
  d$2(Intent paramIntent, String paramString1, String paramString2, d.b paramb, int paramInt, d.a parama)
  {
  }

  public final void onDone()
  {
    AppMethodBeat.i(114686);
    Intent localIntent;
    if (this.val$intent == null)
    {
      localIntent = new Intent();
      str = ah.doz() + ".plugin." + this.vwC;
      if (!this.vwH.startsWith("."))
        break label144;
    }
    label144: for (String str = str + this.vwH; ; str = this.vwH)
    {
      localIntent.setClassName(ah.getPackageName(), str);
      this.vwI.a(localIntent, this.val$requestCode, this.vwJ);
      d.g(this.vwI.getContext(), this.vwH, this.val$intent);
      AppMethodBeat.o(114686);
      return;
      localIntent = this.val$intent;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bp.d.2
 * JD-Core Version:    0.6.2
 */