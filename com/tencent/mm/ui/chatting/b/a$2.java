package com.tencent.mm.ui.chatting.b;

import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.choosemsgfile.compat.b.a;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.record.b.e;
import com.tencent.mm.pluginsdk.model.app.b;
import com.tencent.mm.pluginsdk.model.app.l;

final class a$2
  implements f
{
  a$2(a parama, String paramString, b.a parama1, long paramLong)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(31161);
    d.i("MicroMsg.ChooseMsgFileCompat", "downloadAppAttachDirect errType:%d errCode:%d, errMsg:%s type:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, Integer.valueOf(paramm.getType()) });
    if (paramm.getType() != 221)
      AppMethodBeat.o(31161);
    while (true)
    {
      return;
      paramm = (e)paramm;
      if (!this.IN.equals(paramm.getMediaId()))
      {
        d.w("MicroMsg.ChooseMsgFileCompat", "media:%s is not equal targetMedia:%s", new Object[] { this.IN, paramm.getMediaId() });
        AppMethodBeat.o(31161);
      }
      else
      {
        aw.Rg().b(221, this);
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          paramInt1 = paramm.retCode;
          d.i("MicroMsg.ChooseMsgFileCompat", "downloadAppAttachDirect retCode:%d", new Object[] { Integer.valueOf(paramInt1) });
          if ((paramInt1 < 0) && (this.yNQ != null))
            this.yNQ.m(paramInt1, "");
          AppMethodBeat.o(31161);
        }
        else
        {
          paramm = l.i(this.IN, this.cgB);
          if ((paramm != null) && (paramm.field_status == 102L))
          {
            if (this.yNQ != null)
              this.yNQ.m(1, paramString);
            AppMethodBeat.o(31161);
          }
          else
          {
            if (this.yNQ != null)
              this.yNQ.m(-1, paramString);
            AppMethodBeat.o(31161);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.b.a.2
 * JD-Core Version:    0.6.2
 */