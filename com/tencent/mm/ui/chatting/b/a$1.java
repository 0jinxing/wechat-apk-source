package com.tencent.mm.ui.chatting.b;

import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.choosemsgfile.compat.b.b;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.record.b.c;

final class a$1
  implements f
{
  a$1(a parama, String paramString, b.b paramb)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(31160);
    d.i("MicroMsg.ChooseMsgFileCompat", "tryInitAttachInfo errType:%d errCode:%d, errMsg:%s type:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, Integer.valueOf(paramm.getType()) });
    if (paramm.getType() != 728)
      AppMethodBeat.o(31160);
    while (true)
    {
      return;
      paramm = (c)paramm;
      if (!this.IN.equals(paramm.getMediaId()))
      {
        d.w("MicroMsg.ChooseMsgFileCompat", "media:%s is not equal targetMedia:%s", new Object[] { this.IN, paramm.getMediaId() });
        AppMethodBeat.o(31160);
      }
      else
      {
        aw.Rg().b(728, this);
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          if (this.yNO != null)
          {
            this.yNO.n(0, "");
            AppMethodBeat.o(31160);
          }
        }
        else
        {
          if (this.yNO != null)
            this.yNO.n(paramInt2, paramString);
          AppMethodBeat.o(31160);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.b.a.1
 * JD-Core Version:    0.6.2
 */