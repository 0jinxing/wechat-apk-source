package com.tencent.mm.plugin.profile.ui.newbizinfo;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.profile.ui.ContactInfoUI;

final class b$3
  implements Runnable
{
  b$3(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(23806);
    this.ppO.Bj(4);
    if (this.ppO.ppM.getIntent().getIntExtra("Kdel_from", -1) == 1)
    {
      Intent localIntent = new Intent();
      localIntent.addFlags(67108864);
      d.b(this.ppO.ppM, "shake", ".ui.ShakeReportUI", localIntent);
    }
    AppMethodBeat.o(23806);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.newbizinfo.b.3
 * JD-Core Version:    0.6.2
 */