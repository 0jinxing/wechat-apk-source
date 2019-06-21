package com.tencent.mm.chatroom.plugin;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.b.g;
import org.xwalk.core.Log;

public class PluginChatroomUI extends f
{
  public void execute(g paramg)
  {
    AppMethodBeat.i(103961);
    Log.i("MicroMsg.PluginChatroomUI", "[execute]");
    pin(a.JA());
    AppMethodBeat.o(103961);
  }

  public String name()
  {
    return "ui-chatroom";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.plugin.PluginChatroomUI
 * JD-Core Version:    0.6.2
 */