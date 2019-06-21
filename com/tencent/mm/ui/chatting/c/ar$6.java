package com.tencent.mm.ui.chatting.c;

import android.app.Activity;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelvideo.c.a;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.d.a;

final class ar$6
  implements c.a
{
  ar$6(ar paramar)
  {
  }

  public final void b(int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    AppMethodBeat.i(31850);
    if (paramInt1 == -50002)
      Toast.makeText(this.yTd.cgL.yTx.getContext(), this.yTd.cgL.yTx.getContext().getString(2131304249), 0).show();
    while (true)
    {
      this.yTd.cgL.dismissDialog();
      AppMethodBeat.o(31850);
      return;
      if (paramInt1 < 0)
      {
        Toast.makeText(this.yTd.cgL.yTx.getContext(), this.yTd.cgL.yTx.getContext().getString(2131304248), 0).show();
      }
      else
      {
        u.c(paramString1, paramInt2, this.yTd.cgL.getTalkerUserName(), paramString2);
        u.uo(paramString1);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.ar.6
 * JD-Core Version:    0.6.2
 */