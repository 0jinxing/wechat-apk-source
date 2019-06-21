package com.tencent.mm.pluginsdk.ui.applet;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class g$17
  implements DialogInterface.OnClickListener
{
  g$17(q.a parama, View paramView)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(27655);
    if (this.vkj != null)
      this.vkj.a(true, g.et(this.val$view), g.eu(this.val$view));
    AppMethodBeat.o(27655);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.g.17
 * JD-Core Version:    0.6.2
 */