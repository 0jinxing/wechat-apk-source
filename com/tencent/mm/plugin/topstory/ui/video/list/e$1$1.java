package com.tencent.mm.plugin.topstory.ui.video.list;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.topstory.ui.video.b;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.a.e.a;
import com.tencent.mm.ui.widget.a.e.c;

final class e$1$1
  implements Runnable
{
  e$1$1(e.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(2029);
    e.a locala = new e.a(ah.getContext());
    locala.asL(this.sGS.sGR.sDo.bKU().getString(2131304112)).re(true);
    locala.Qg(2131296955).b(new e.c()
    {
      public final void d(boolean paramAnonymousBoolean, String paramAnonymousString)
      {
      }
    }).b(new DialogInterface.OnDismissListener()
    {
      public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
      {
        AppMethodBeat.i(2028);
        g.RP().Ry().set(ac.a.xUO, Integer.valueOf(1));
        g.RP().Ry().dsb();
        AppMethodBeat.o(2028);
      }
    }).show();
    AppMethodBeat.o(2029);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.list.e.1.1
 * JD-Core Version:    0.6.2
 */