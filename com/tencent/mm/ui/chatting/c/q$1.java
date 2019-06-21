package com.tencent.mm.ui.chatting.c;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMFragment;
import com.tencent.mm.ui.chatting.ChatFooterCustom;
import com.tencent.mm.ui.chatting.d.a;

final class q$1
  implements ChatFooter.e
{
  private Animation yPU;
  private Animation yPV;

  q$1(q paramq)
  {
  }

  public final boolean oS(boolean paramBoolean)
  {
    AppMethodBeat.i(31407);
    if (this.yPU == null)
    {
      this.yPU = AnimationUtils.loadAnimation(this.yPW.cgL.yTx.getContext(), 2131034229);
      this.yPV = AnimationUtils.loadAnimation(this.yPW.cgL.yTx.getContext(), 2131034227);
    }
    if (paramBoolean)
    {
      ab.i("MicroMsg.ChattingUI.FootComponent", "switchFooterToInput customFooter is %s", new Object[] { this.yPW.yPH });
      if (this.yPW.yPH != null)
        this.yPW.yPH.startAnimation(this.yPV);
      this.yPW.dEd();
      this.yPW.oor.startAnimation(this.yPU);
      this.yPW.oor.postInvalidateDelayed(this.yPU.getDuration());
    }
    while (true)
    {
      AppMethodBeat.o(31407);
      return false;
      this.yPW.oor.startAnimation(this.yPV);
      this.yPW.dEc();
      if (this.yPW.yPH != null)
      {
        this.yPW.yPH.startAnimation(this.yPU);
        this.yPW.yPH.postInvalidateDelayed(this.yPU.getDuration());
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.q.1
 * JD-Core Version:    0.6.2
 */