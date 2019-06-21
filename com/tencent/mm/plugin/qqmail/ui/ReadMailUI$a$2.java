package com.tencent.mm.plugin.qqmail.ui;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;

final class ReadMailUI$a$2
  implements Runnable
{
  ReadMailUI$a$2(ReadMailUI.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(68440);
    ReadMailUI.h(this.pAj.pzZ).setEnabled(false);
    ReadMailUI.h(this.pAj.pzZ).setText(2131302172);
    ReadMailUI.h(this.pAj.pzZ).setTextColor(-7829368);
    ReadMailUI.h(this.pAj.pzZ).setCompoundDrawablesWithIntrinsicBounds(a.g(this.pAj.pzZ, 2130840122), null, null, null);
    AppMethodBeat.o(68440);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.ReadMailUI.a.2
 * JD-Core Version:    0.6.2
 */