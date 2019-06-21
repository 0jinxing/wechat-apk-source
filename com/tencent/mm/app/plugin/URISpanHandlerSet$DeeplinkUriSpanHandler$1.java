package com.tencent.mm.app.plugin;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.d;
import com.tencent.mm.aj.f;
import com.tencent.mm.sdk.platformtools.ab;

final class URISpanHandlerSet$DeeplinkUriSpanHandler$1
  implements DialogInterface.OnClickListener
{
  URISpanHandlerSet$DeeplinkUriSpanHandler$1(URISpanHandlerSet.DeeplinkUriSpanHandler paramDeeplinkUriSpanHandler, d paramd, String paramString1, String paramString2)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(15645);
    paramInt = this.cgD.field_brandFlag;
    this.cgD.field_brandFlag |= 1;
    ab.i("MicroMsg.URISpanHandlerSet", "shield biz msg %s, %s, old = %d, new = %d", new Object[] { this.cgE, this.cgF, Integer.valueOf(paramInt), Integer.valueOf(this.cgD.field_brandFlag) });
    f.f(this.cgD);
    AppMethodBeat.o(15645);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.plugin.URISpanHandlerSet.DeeplinkUriSpanHandler.1
 * JD-Core Version:    0.6.2
 */