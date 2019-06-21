package com.tencent.mm.plugin.account.bind.ui;

import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.friend.a.l;
import com.tencent.mm.plugin.account.friend.a.l.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;

final class BindMContactIntroUI$18
  implements Runnable
{
  BindMContactIntroUI$18(BindMContactIntroUI paramBindMContactIntroUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(13427);
    if (l.apQ())
    {
      BindMContactIntroUI.apa();
      BindMContactIntroUI.i(this.grt).setText(this.grt.getString(2131297546));
      BindMContactIntroUI.a(this.grt, l.a.gvz);
      boolean bool = bo.a((Boolean)g.RP().Ry().get(12322, Boolean.FALSE), false);
      if ((BindMContactIntroUI.h(this.grt)) && (bool))
        h.pYm.e(11002, new Object[] { Integer.valueOf(3), Integer.valueOf(3) });
    }
    AppMethodBeat.o(13427);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI.18
 * JD-Core Version:    0.6.2
 */