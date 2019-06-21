package com.tencent.mm.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.chatting.d.a;
import com.tencent.mm.ui.chatting.r;
import com.tencent.mm.ui.chatting.viewitems.d.f;

public final class x
  implements View.OnClickListener
{
  a yod;

  public x(a parama)
  {
    this.yod = parama;
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(29683);
    if ((paramView.getTag() instanceof d.f))
    {
      r.eK(paramView);
      this.yod.aWv();
    }
    AppMethodBeat.o(29683);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.x
 * JD-Core Version:    0.6.2
 */