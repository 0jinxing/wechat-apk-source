package com.tencent.mm.ui.chatting.c;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.fq;
import com.tencent.mm.g.a.fq.a;
import com.tencent.mm.g.a.fq.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate.b;

final class ao$1
  implements Runnable
{
  ao$1(ao paramao, fq paramfq, int paramInt, bi parambi)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(31783);
    if (!this.yST.nj(Long.valueOf(this.uIl.czB.czD).longValue()))
      AppMethodBeat.o(31783);
    while (true)
    {
      return;
      if (this.uIl.czC.bcU)
      {
        if (bo.isNullOrNil(this.uIl.czC.content))
        {
          if (this.uIl.czC.state == 2)
          {
            ab.i("MicroMsg.TransformComponent", "go VoiceTransTextAct translateVoice fail msgId:%s", new Object[] { this.uIl.czB.czD });
            ao.a(this.yST, ao.a(this.yST).getString(2131298251));
          }
          ao.a(this.yST, Long.valueOf(this.uIl.czB.czD).longValue());
          ao.b(this.yST, Long.valueOf(this.uIl.czB.czD).longValue());
          this.yST.ySO = false;
          ao.b(this.yST);
        }
        while (true)
        {
          ao.a(this.yST, this.fkD, this.gvp);
          AppMethodBeat.o(31783);
          break;
          ab.i("MicroMsg.TransformComponent", "go VoiceTransTextAct isCompleted msgId:%s", new Object[] { this.uIl.czB.czD });
          bi localbi = ao.c(this.yST, Long.valueOf(this.uIl.czB.czD).longValue());
          if (localbi != null)
          {
            this.yST.a(Long.valueOf(this.uIl.czB.czD).longValue(), this.uIl.czC.content, ChattingItemTranslate.b.zhj);
            localbi.dtU();
            aw.ZK();
            c.XO().a(localbi.field_msgId, localbi);
            ao.b(this.yST, Long.valueOf(this.uIl.czB.czD).longValue());
            ao.b(this.yST);
            ao.a(this.yST, this.gvp);
          }
          this.yST.ySO = false;
        }
      }
      if (!bo.isNullOrNil(this.uIl.czC.content))
      {
        this.yST.a(Long.valueOf(this.uIl.czB.czD).longValue(), this.uIl.czC.content, ChattingItemTranslate.b.zhi);
        ab.i("MicroMsg.TransformComponent", "go VoiceTransTextAct refresh msgId:%s", new Object[] { this.uIl.czB.czD });
      }
      ao.b(this.yST);
      ao.a(this.yST, this.gvp);
      AppMethodBeat.o(31783);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.ao.1
 * JD-Core Version:    0.6.2
 */