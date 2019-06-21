package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.c.a;
import com.tencent.mm.pluginsdk.n;

final class SnsSightPlayerUI$7$1
  implements Runnable
{
  SnsSightPlayerUI$7$1(SnsSightPlayerUI.7 param7, Intent paramIntent)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(39255);
    a.gkE.i(this.val$intent, this.rwW.rwT);
    this.rwW.rwT.finish();
    AppMethodBeat.o(39255);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.7.1
 * JD-Core Version:    0.6.2
 */