package com.tencent.mm.ui.chatting.viewitems;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.by.a.b;
import com.tencent.mm.g.a.cz;
import com.tencent.mm.g.a.cz.b;
import com.tencent.mm.g.a.ny;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emoji.b.d;
import com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.protocal.protobuf.cab;
import com.tencent.mm.protocal.protobuf.cac;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.p;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.chatting.ae;
import com.tencent.mm.ui.chatting.c.b.o;
import java.util.Iterator;
import java.util.LinkedList;

public final class y$c
  implements View.OnClickListener
{
  private com.tencent.mm.ui.chatting.d.a yJI;

  public y$c(com.tencent.mm.ui.chatting.d.a parama)
  {
    this.yJI = parama;
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(33200);
    ab.i("MicroMsg.EmojiCaptureTipsClickListener", "onClick: ");
    g.RP().Ry().set(ac.a.xVB, Long.valueOf(System.currentTimeMillis()));
    EmojiCaptureReporter.bmw();
    paramView = new cz();
    paramView.cwc.type = 2;
    com.tencent.mm.sdk.b.a.xxA.m(paramView);
    com.tencent.mm.sdk.b.a.xxA.m(new ny());
    if (!paramView.cwd.cwe)
    {
      cab localcab = ((d)g.M(d.class)).getEmojiStorageMgr().xYq.bjU();
      if (localcab != null)
      {
        Iterator localIterator = localcab.wZl.iterator();
        while (localIterator.hasNext())
        {
          paramView = (cac)localIterator.next();
          if (paramView.ProductID.equals(String.valueOf("capture")))
            paramView.vKj = 0;
        }
      }
      ((d)g.M(d.class)).getEmojiStorageMgr().xYq.b(localcab);
      com.tencent.mm.by.a.dmE();
      paramView = com.tencent.mm.by.a.xum;
      a.b.alW("capture");
    }
    ((o)this.yJI.aF(o.class)).dDX().dkh();
    paramView = this.yJI;
    ab.i("MicroMsg.ChattingContext", "[scrollToLast]");
    paramView.yTy.dCx();
    AppMethodBeat.o(33200);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.y.c
 * JD-Core Version:    0.6.2
 */