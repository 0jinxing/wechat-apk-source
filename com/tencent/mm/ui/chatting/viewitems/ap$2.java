package com.tencent.mm.ui.chatting.viewitems;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.h;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMFragment;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.chatting.c.b.aj;
import com.tencent.mm.ui.chatting.d;
import com.tencent.mm.ui.chatting.d.a;

final class ap$2
  implements View.OnClickListener
{
  ap$2(ap paramap, bi parambi, int paramInt)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(33395);
    if (bo.isNullOrNil(this.zhK.field_imgPath))
    {
      ab.d("MicroMsg.ChattingItemVoiceRemindRemind", "filename is null");
      AppMethodBeat.o(33395);
    }
    while (true)
    {
      return;
      d locald = ((aj)ap.c(this.zhS).aF(aj.class)).dFm();
      int i = this.zhL;
      paramView = this.zhK;
      if (paramView != null)
      {
        locald.dBw();
        aw.ZK();
        Boolean localBoolean = (Boolean)c.Ry().get(4115, null);
        if ((localBoolean == null) || (!localBoolean.booleanValue()))
        {
          aw.ZK();
          c.Ry().set(4115, Boolean.TRUE);
          locald.dBC();
          locald.yGR = t.a(locald.cgL.yTx.getActivity(), locald.context.getString(2131298186), 4000L);
        }
        if ((locald.mfO.isPlaying()) && (paramView.field_msgId == locald.yGO))
        {
          locald.dBB();
          AppMethodBeat.o(33395);
        }
        else
        {
          locald.au(paramView);
          if ((paramView.field_isSend == 0) && (!q.K(paramView)))
            locald.Od(i + 1);
          locald.qn(true);
        }
      }
      else
      {
        AppMethodBeat.o(33395);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.ap.2
 * JD-Core Version:    0.6.2
 */