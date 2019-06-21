package com.tencent.mm.pluginsdk.ui.applet;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class i$1
  implements View.OnClickListener
{
  i$1(i parami)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(79731);
    ab.d("MicroMsg.ContactListArchor", "OnClickListener = onClick ");
    AppMethodBeat.o(79731);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.i.1
 * JD-Core Version:    0.6.2
 */