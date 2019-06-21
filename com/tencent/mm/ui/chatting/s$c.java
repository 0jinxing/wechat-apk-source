package com.tencent.mm.ui.chatting;

import android.view.View;
import com.tencent.magicbrush.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.api.i.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.chatting.c.x;
import com.tencent.mm.ui.chatting.d.a;
import com.tencent.mm.ui.chatting.viewitems.ay;

public final class s$c
  implements i.a
{
  private a yJI;

  public s$c(a parama)
  {
    this.yJI = parama;
  }

  public final boolean ed(View paramView)
  {
    AppMethodBeat.i(30719);
    paramView = ((ay)paramView.getTag()).userName;
    ab.i("MicroMsg.AvatarDoubleClickListener", "onDoubleClick: %s", new Object[] { paramView });
    boolean bool;
    if (!c.isNullOrNil(paramView))
    {
      bool = ((x)this.yJI.aF(x.class)).arn(paramView);
      AppMethodBeat.o(30719);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(30719);
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.s.c
 * JD-Core Version:    0.6.2
 */