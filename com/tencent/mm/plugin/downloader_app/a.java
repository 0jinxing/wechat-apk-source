package com.tencent.mm.plugin.downloader_app;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pointers.PBool;
import com.tencent.mm.ui.widget.a.c.a;

public final class a
  implements com.tencent.mm.plugin.downloader_app.a.c
{
  public final void a(Context paramContext, String paramString, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    AppMethodBeat.i(136011);
    PBool localPBool = new PBool();
    paramContext = new c.a(paramContext);
    paramContext.PV(2131301241);
    paramContext.PZ(2131301239);
    paramContext.Qc(2131301242);
    paramContext.a(new a.1(this, paramOnClickListener1, localPBool, paramString));
    paramContext.Qd(2131301238);
    paramContext.b(new a.2(this, paramOnClickListener2, localPBool, paramString));
    paramContext.rc(true);
    paramContext.f(new a.3(this, paramOnCancelListener, localPBool, paramString));
    paramContext.aMb().show();
    com.tencent.mm.plugin.downloader_app.c.a.a(15, 1501, 1, 1, paramString, "", "");
    AppMethodBeat.o(136011);
  }

  public final void b(Context paramContext, String paramString, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    AppMethodBeat.i(136012);
    PBool localPBool = new PBool();
    paramContext = new c.a(paramContext);
    paramContext.PV(2131301243);
    paramContext.PZ(2131301244);
    paramContext.Qc(2131301242);
    paramContext.a(new a.4(this, localPBool, paramOnClickListener1, paramString));
    paramContext.Qd(2131301240);
    paramContext.b(new a.5(this, paramOnClickListener2, localPBool, paramString));
    paramContext.rc(true);
    paramContext.f(new a.6(this, paramOnCancelListener, localPBool, paramString));
    paramContext.aMb().show();
    com.tencent.mm.plugin.downloader_app.c.a.a(15, 1502, 1, 1, paramString, "", "");
    AppMethodBeat.o(136012);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.a
 * JD-Core Version:    0.6.2
 */