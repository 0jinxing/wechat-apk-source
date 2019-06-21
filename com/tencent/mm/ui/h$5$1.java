package com.tencent.mm.ui;

import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.ui.base.t;

final class h$5$1
  implements Runnable
{
  h$5$1(h.5 param5, DialogInterface paramDialogInterface)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(29311);
    aw.ZK();
    if (c.isSDCardAvailable())
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("had_detected_no_sdcard_space", true);
      d.b(this.yik.yih.yhZ, "clean", ".ui.CleanUI", localIntent);
    }
    while (true)
    {
      this.yij.dismiss();
      com.tencent.mm.plugin.report.service.h.pYm.a(282L, 1L, 1L, false);
      AppMethodBeat.o(29311);
      return;
      t.hO(this.yik.yih.yhZ);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.h.5.1
 * JD-Core Version:    0.6.2
 */