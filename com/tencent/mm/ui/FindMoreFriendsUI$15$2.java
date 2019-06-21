package com.tencent.mm.ui;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.ui.base.preference.IconPreference;

final class FindMoreFriendsUI$15$2
  implements Runnable
{
  FindMoreFriendsUI$15$2(FindMoreFriendsUI.15 param15, Bitmap paramBitmap, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(29228);
    FindMoreFriendsUI.a(this.yhL.yhB, true);
    this.yhL.yhJ.ap(this.krR);
    if (this.yhL.yhK == 3)
      FindMoreFriendsUI.b(this.yhL.yhJ, 8, 8, false, 0, 0, 0);
    while (true)
    {
      FindMoreFriendsUI.c(this.yhL.val$appId, this.yhL.tCw, this.yhL.sCm, this.yhL.fkA, this.yhL.yhK);
      if (this.jbl == 2)
        h.pYm.a(858L, 13L, 1L, false);
      AppMethodBeat.o(29228);
      return;
      if (this.yhL.yhK == 4)
        FindMoreFriendsUI.b(this.yhL.yhJ, 8, 0, false, 0, 0, 0);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.FindMoreFriendsUI.15.2
 * JD-Core Version:    0.6.2
 */