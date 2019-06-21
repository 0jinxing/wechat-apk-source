package com.tencent.mm.ui.chatting.c;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.af;
import com.tencent.mm.ui.chatting.c.b.z;
import com.tencent.mm.ui.chatting.d.a;

final class r$3 extends Handler
{
  r$3(r paramr, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(31443);
    super.handleMessage(paramMessage);
    boolean bool;
    if (paramMessage.what == 1)
    {
      paramMessage = (z)this.yQd.cgL.aF(z.class);
      if ((paramMessage.dEU()) || (paramMessage.dET()))
      {
        bool = true;
        this.yQd.cgL.yTz.setIsBottomShowAll(false);
        this.yQd.cgL.yTz.setBottomViewVisible(true);
        if (!bool)
          break label150;
        this.yQd.cgL.yTz.qd(true);
        label107: ab.i("MicroMsg.GetChatroomComponent", "[CheckGetChatroomTask$handleMessage] load bottom! isFromSearch:%s talker:%s", new Object[] { Boolean.valueOf(bool), this.yQd.cgL.getTalkerUserName() });
        AppMethodBeat.o(31443);
      }
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label150: paramMessage = new Bundle();
      paramMessage.putBoolean("load_bottom", true);
      this.yQd.cgL.yTz.aw(paramMessage);
      break label107;
      if (paramMessage.what == 2)
      {
        this.yQd.cgL.yTz.setIsBottomShowAll(true);
        this.yQd.cgL.yTz.setBottomViewVisible(true);
        r.b(this.yQd).postDelayed(new r.3.1(this), 300L);
        ab.i("MicroMsg.GetChatroomComponent", "[CheckGetChatroomTask$handleMessage] unLoad bottom! talker:%s", new Object[] { this.yQd.cgL.getTalkerUserName() });
        AppMethodBeat.o(31443);
      }
      else if (paramMessage.what == 4)
      {
        this.yQd.cgL.yTz.setIsBottomShowAll(false);
        this.yQd.cgL.yTz.setBottomViewVisible(true);
        paramMessage = new Bundle();
        paramMessage.putBoolean("load_bottom", true);
        this.yQd.cgL.yTz.aw(paramMessage);
        ab.i("MicroMsg.GetChatroomComponent", "[CheckGetChatroomTask$handleMessage] unLoad bottom and reset! talker:%s", new Object[] { this.yQd.cgL.getTalkerUserName() });
        AppMethodBeat.o(31443);
      }
      else
      {
        if (paramMessage.what == 8)
        {
          ab.i("MicroMsg.GetChatroomComponent", "[CheckGetChatroomTask$handleMessage] reset presenter");
          this.yQd.cgL.yTx.dBR();
        }
        AppMethodBeat.o(31443);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.r.3
 * JD-Core Version:    0.6.2
 */