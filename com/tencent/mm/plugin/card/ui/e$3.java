package com.tencent.mm.plugin.card.ui;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.d.c;
import com.tencent.mm.plugin.card.d.d;
import com.tencent.mm.plugin.card.ui.view.g;
import com.tencent.mm.sdk.platformtools.ak;

final class e$3 extends ak
{
  e$3(e parame)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(88337);
    if ((paramMessage.obj != null) && ((paramMessage.obj instanceof e.c)))
    {
      paramMessage = (e.c)paramMessage.obj;
      if (paramMessage.kjR == e.b.kjP)
      {
        if (this.kjI.kjk == null)
          break label146;
        d.a(this.kjI.kjd, paramMessage.aIm, false);
        this.kjI.kjk.bev();
        AppMethodBeat.o(88337);
      }
    }
    while (true)
    {
      return;
      if (paramMessage.kjR == e.b.kjN)
      {
        if (this.kjI.kjk != null)
        {
          this.kjI.kjk.d(c.krC);
          AppMethodBeat.o(88337);
        }
      }
      else
      {
        if (this.kjI.kjk != null)
          this.kjI.kjk.d(paramMessage.kjS);
        label146: AppMethodBeat.o(88337);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.e.3
 * JD-Core Version:    0.6.2
 */