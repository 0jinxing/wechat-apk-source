package com.tencent.mm.bp;

import android.content.Intent;
import android.support.v4.app.Fragment;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;

final class d$4
  implements a
{
  d$4(Intent paramIntent, String paramString1, String paramString2, Fragment paramFragment, int paramInt)
  {
  }

  public final void onDone()
  {
    AppMethodBeat.i(114688);
    Intent localIntent;
    if (this.val$intent == null)
    {
      localIntent = new Intent();
      str = ah.doz() + ".plugin." + this.vwC;
      if (!this.vwH.startsWith("."))
        break label136;
    }
    label136: for (String str = str + this.vwH; ; str = this.vwH)
    {
      localIntent.setClassName(ah.getPackageName(), str);
      this.val$fragment.startActivityForResult(localIntent, this.val$requestCode);
      d.g(this.val$fragment.getActivity(), this.vwH, this.val$intent);
      AppMethodBeat.o(114688);
      return;
      localIntent = this.val$intent;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bp.d.4
 * JD-Core Version:    0.6.2
 */