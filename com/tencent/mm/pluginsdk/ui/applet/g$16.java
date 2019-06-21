package com.tencent.mm.pluginsdk.ui.applet;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.o;

final class g$16
  implements View.OnClickListener
{
  g$16(q.a parama, View paramView, o paramo)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(27654);
    if (this.vkj != null)
      this.vkj.a(true, g.et(this.val$view), g.eu(this.val$view));
    this.vkl.dismiss();
    this.vkl.setFocusable(false);
    this.vkl.setTouchable(false);
    AppMethodBeat.o(27654);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.g.16
 * JD-Core Version:    0.6.2
 */