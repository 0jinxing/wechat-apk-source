package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.aj;
import com.tencent.mm.plugin.sns.storage.h;
import com.tencent.mm.protocal.protobuf.cat;
import com.tencent.mm.protocal.protobuf.cbf;
import com.tencent.mm.ui.base.h.c;
import java.util.LinkedList;

final class SnsCommentDetailUI$39
  implements h.c
{
  SnsCommentDetailUI$39(SnsCommentDetailUI paramSnsCommentDetailUI, Object[] paramArrayOfObject)
  {
  }

  public final void iE(int paramInt)
  {
    AppMethodBeat.i(38824);
    switch (paramInt)
    {
    default:
    case 0:
    }
    while (true)
    {
      AppMethodBeat.o(38824);
      return;
      SnsCommentDetailUI.c(this.rqN).rrt = 0;
      SnsCommentDetailUI.c(this.rqN).ctg();
      SnsCommentDetailUI.c(this.rqN).setCommentHint(this.rqN.getString(2131303752) + this.rre[3]);
      SnsCommentDetailUI.c(this.rqN).setCommentInfo((cat)this.rre[1]);
      SnsCommentDetailUI.c(this.rqN).lk(false);
      SnsCommentDetailUI.c(this.rqN).lj(true);
      int i = ((Integer)this.rre[0]).intValue();
      paramInt = i;
      if (aj.q(h.YT(SnsCommentDetailUI.k(this.rqN))).xaq.size() > 0)
      {
        i++;
        paramInt = i;
        if (i > SnsCommentDetailUI.l(this.rqN).getCount())
          paramInt = SnsCommentDetailUI.l(this.rqN).getCount() - 1;
      }
      SnsCommentDetailUI.m(this.rqN).Ro = paramInt;
      SnsCommentDetailUI.m(this.rqN).run();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.39
 * JD-Core Version:    0.6.2
 */