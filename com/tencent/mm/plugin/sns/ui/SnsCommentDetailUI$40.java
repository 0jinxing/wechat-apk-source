package com.tencent.mm.plugin.sns.ui;

import android.support.v7.app.AppCompatActivity;
import android.text.ClipboardManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.secinforeport.a.a;
import com.tencent.mm.plugin.sns.model.r;
import com.tencent.mm.plugin.sns.storage.v;
import com.tencent.mm.protocal.protobuf.cat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.q;

final class SnsCommentDetailUI$40
  implements h.c
{
  SnsCommentDetailUI$40(SnsCommentDetailUI paramSnsCommentDetailUI, CharSequence paramCharSequence, cat paramcat)
  {
  }

  public final void iE(int paramInt)
  {
    AppMethodBeat.i(38826);
    Object localObject1;
    switch (paramInt)
    {
    default:
      AppMethodBeat.o(38826);
    case 0:
      while (true)
      {
        return;
        SnsCommentDetailUI.n(this.rqN).setText(this.rrf);
        h.bQ(this.rqN.mController.ylL, this.rqN.mController.ylL.getString(2131296876));
        localObject1 = bo.mz(v.Zm(SnsCommentDetailUI.o(this.rqN)));
        if ((this.rrg == null) || (this.rrf == null) || (localObject1 == null))
          break;
        localObject2 = a.qjm;
        a.h(4, (String)localObject1 + ":" + this.rrg.wZG, bo.ana(this.rrf.toString()));
        AppMethodBeat.o(38826);
      }
    case 1:
    }
    Object localObject2 = new StringBuilder("del snsId:").append(SnsCommentDetailUI.o(this.rqN)).append(" commentId:");
    label206: long l;
    if (this.rrg != null)
    {
      paramInt = this.rrg.wZG;
      ab.e("MicroMsg.SnsCommentDetailUI", paramInt);
      l = v.Zm(SnsCommentDetailUI.o(this.rqN));
      if (!v.WT(SnsCommentDetailUI.o(this.rqN)))
        break label335;
    }
    label335: for (paramInt = 4; ; paramInt = 6)
    {
      localObject1 = new r(l, paramInt, this.rrg);
      g.RQ();
      g.RO().eJo.a((m)localObject1, 0);
      localObject2 = this.rqN;
      SnsCommentDetailUI localSnsCommentDetailUI = this.rqN;
      this.rqN.getString(2131297061);
      SnsCommentDetailUI.a((SnsCommentDetailUI)localObject2, h.b(localSnsCommentDetailUI, this.rqN.getString(2131303615), true, new SnsCommentDetailUI.40.1(this, (r)localObject1)));
      break;
      paramInt = 0;
      break label206;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.40
 * JD-Core Version:    0.6.2
 */