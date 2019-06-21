package com.tencent.mm.ui.transmit;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.encode.ui.b;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.chatting.ChattingUI;
import com.tencent.mm.ui.q;

final class SightForwardUI$1
  implements b
{
  SightForwardUI$1(SightForwardUI paramSightForwardUI)
  {
  }

  public final void clG()
  {
    AppMethodBeat.i(35275);
    Intent localIntent = new Intent();
    localIntent.setClass(this.zKQ.mController.ylL, LauncherUI.class).addFlags(67108864);
    this.zKQ.startActivity(localIntent);
    this.zKQ.finish();
    AppMethodBeat.o(35275);
  }

  public final void startChattingUI(String paramString)
  {
    AppMethodBeat.i(35274);
    Intent localIntent = new Intent(this.zKQ.mController.ylL, ChattingUI.class);
    localIntent.addFlags(67108864);
    localIntent.putExtra("Chat_User", paramString);
    this.zKQ.startActivity(localIntent);
    this.zKQ.finish();
    AppMethodBeat.o(35274);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.SightForwardUI.1
 * JD-Core Version:    0.6.2
 */