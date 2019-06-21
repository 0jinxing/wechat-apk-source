package com.tencent.mm.app.plugin;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.br;
import com.tencent.mm.sdk.b.a;

final class URISpanHandlerSet$AAUriSpanHandler$1
  implements DialogInterface.OnClickListener
{
  URISpanHandlerSet$AAUriSpanHandler$1(URISpanHandlerSet.AAUriSpanHandler paramAAUriSpanHandler, String paramString1, String paramString2, long paramLong)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(15628);
    paramDialogInterface = new br();
    paramDialogInterface.cuN.cuO = this.cgz;
    paramDialogInterface.cuN.cuP = this.cgA;
    paramDialogInterface.cuN.cuQ = this.cgB;
    a.xxA.m(paramDialogInterface);
    AppMethodBeat.o(15628);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.plugin.URISpanHandlerSet.AAUriSpanHandler.1
 * JD-Core Version:    0.6.2
 */