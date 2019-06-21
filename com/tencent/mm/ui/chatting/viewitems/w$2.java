package com.tencent.mm.ui.chatting.viewitems;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.tz;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;

final class w$2
  implements f
{
  w$2(w paramw, bi parambi, bd parambd, boolean paramBoolean, String paramString)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(33128);
    aw.Rg().b(1176, this);
    ab.d("MicroMsg.ChattingItemDyeingTemplate", "onSceneEnd(errType : %d, errCode : %d, errMsg : %s, toBan : %s)", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, Boolean.TRUE });
    if (this.fku != this.zfc.zjt.getTag(2131822501))
    {
      ab.w("MicroMsg.ChattingItemDyeingTemplate", "item msg(%s) has changed.", new Object[] { Long.valueOf(this.fku.field_msgId) });
      AppMethodBeat.o(33128);
    }
    while (true)
    {
      return;
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        paramString = this.zfc.ziP;
        if (this.zfd)
        {
          paramInt1 = 8;
          label125: paramString.setVisibility(paramInt1);
          t.makeText(w.b(this.zeW).yTx.getContext(), 2131301848, 0).show();
          paramm = new tz();
          paramm.cQf.csl = this.uHr;
          paramString = paramm.cQf;
          if (!this.zfd)
            break label244;
        }
        label244: for (paramInt1 = 2; ; paramInt1 = 1)
        {
          paramString.action = paramInt1;
          paramm.cQf.cQh = 1;
          com.tencent.mm.sdk.b.a.xxA.m(paramm);
          if (w.b(this.zeW) != null)
            w.b(this.zeW).aWv();
          AppMethodBeat.o(33128);
          break;
          paramInt1 = 0;
          break label125;
        }
      }
      AppMethodBeat.o(33128);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.w.2
 * JD-Core Version:    0.6.2
 */