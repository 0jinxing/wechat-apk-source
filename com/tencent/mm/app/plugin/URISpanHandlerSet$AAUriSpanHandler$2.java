package com.tencent.mm.app.plugin;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.bs;
import com.tencent.mm.sdk.b.a;

final class URISpanHandlerSet$AAUriSpanHandler$2
  implements DialogInterface.OnClickListener
{
  URISpanHandlerSet$AAUriSpanHandler$2(URISpanHandlerSet.AAUriSpanHandler paramAAUriSpanHandler, String paramString1, String paramString2, long paramLong)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(15629);
    paramDialogInterface = new bs();
    paramDialogInterface.cuR.cuO = this.cgz;
    paramDialogInterface.cuR.cuP = this.cgA;
    paramDialogInterface.cuR.cuQ = this.cgB;
    a.xxA.m(paramDialogInterface);
    AppMethodBeat.o(15629);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.plugin.URISpanHandlerSet.AAUriSpanHandler.2
 * JD-Core Version:    0.6.2
 */