package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.widget.a.c.a;

public final class ay
{
  public static void b(Context paramContext, DialogInterface.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(39834);
    c.a locala = new c.a(paramContext);
    locala.PV(2131303854);
    locala.asE(paramContext.getString(2131303855) + "\n\n" + paramContext.getString(2131303856));
    locala.Qc(2131305646).a(paramOnClickListener);
    locala.a(new ay.1());
    locala.aMb().show();
    AppMethodBeat.o(39834);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.ay
 * JD-Core Version:    0.6.2
 */