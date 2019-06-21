package com.tencent.mm.plugin.appbrand.jsapi.profile;

import a.l;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessResult;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onCancel"})
final class d$b
  implements DialogInterface.OnCancelListener
{
  d$b(d paramd, String paramString, ProfileResult paramProfileResult)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(134707);
    ao.a.Zu().or(this.hBP);
    this.hUQ.bFZ = 2;
    d.a(this.hUP, (AppBrandProxyUIProcessTask.ProcessResult)this.hUQ);
    AppMethodBeat.o(134707);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.profile.d.b
 * JD-Core Version:    0.6.2
 */