package com.tencent.mm.ui.chatting.c;

import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.c.b.h;
import com.tencent.mm.ui.chatting.d.a;
import java.util.List;

final class ao$2
  implements Runnable
{
  ao$2(ao paramao, int paramInt, bi parambi)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(31784);
    Object localObject = this.yST.dFg();
    if (localObject != null)
    {
      if (ao.c(this.yST))
        ao.b(this.yST, 4);
      this.yST.a((bi)((Pair)localObject).first, false, ((Integer)((Pair)localObject).second).intValue(), 0);
      AppMethodBeat.o(31784);
    }
    while (true)
    {
      return;
      if (this.gvp != -1)
      {
        localObject = ((h)this.yST.cgL.aF(h.class)).Ou(this.gvp + 1);
        if ((localObject != null) && (((bi)localObject).drD()) && (((cy)localObject).field_isSend == 0) && (ao.d(this.yST)))
        {
          ao.e(this.yST);
          ao.b(this.yST, 2);
          AppMethodBeat.o(31784);
        }
        else if ((localObject != null) && (((bi)localObject).drD()) && (((cy)localObject).field_isSend == 0) && (!q.K((bi)localObject)))
        {
          if (!ao.c(this.yST))
            ao.f(this.yST).add(Long.valueOf(this.ySU.field_msgId));
          ao.g(this.yST);
          ao.f(this.yST).add(Long.valueOf(((cy)localObject).field_msgId));
          q.M((bi)localObject);
          this.yST.a((bi)localObject, false, this.gvp + 1, 0);
          AppMethodBeat.o(31784);
        }
        else
        {
          ao.b(this.yST, 0);
        }
      }
      else
      {
        AppMethodBeat.o(31784);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.ao.2
 * JD-Core Version:    0.6.2
 */