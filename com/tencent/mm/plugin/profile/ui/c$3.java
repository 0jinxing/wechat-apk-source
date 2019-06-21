package com.tencent.mm.plugin.profile.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.ui.MMActivity;

final class c$3
  implements Runnable
{
  c$3(c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(23459);
    this.pmK.aV(4, null);
    if (this.pmK.crP.getIntent().getIntExtra("Kdel_from", -1) == 1)
    {
      Intent localIntent = new Intent();
      localIntent.addFlags(67108864);
      d.b(this.pmK.crP, "shake", ".ui.ShakeReportUI", localIntent);
    }
    AppMethodBeat.o(23459);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.c.3
 * JD-Core Version:    0.6.2
 */