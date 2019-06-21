package com.tencent.mm.plugin.story.model.a;

import a.l;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.protocal.protobuf.tb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.LinkedList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/story/model/cgi/NetSceneStorySync$RespHandler$h$1", "Lcom/tencent/mm/sdk/platformtools/MMHandler;", "handleMessage", "", "msg", "Landroid/os/Message;", "plugin-story_release"})
public final class i$b$a extends ak
{
  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(109243);
    a.f.b.j.p(paramMessage, "msg");
    if (!g.RN().QY())
      AppMethodBeat.o(109243);
    while (true)
    {
      return;
      if (this.rUZ.mgm != null)
      {
        paramMessage = this.rUZ.mgm;
        if (paramMessage == null)
          a.f.b.j.dWJ();
        if (!paramMessage.isEmpty());
      }
      else
      {
        this.rUZ.rUY.cyY();
        AppMethodBeat.o(109243);
        continue;
      }
      paramMessage = this.rUZ.mgm;
      if (paramMessage == null)
        a.f.b.j.dWJ();
      paramMessage = (tb)paramMessage.getFirst();
      ab.d(i.access$getTAG$cp(), "cmdId = " + paramMessage.wat);
      Object localObject = this.rUZ.mgm;
      if (localObject == null)
        a.f.b.j.dWJ();
      ((LinkedList)localObject).removeFirst();
      switch (paramMessage.wat)
      {
      default:
        sendEmptyMessage(0);
        AppMethodBeat.o(109243);
        break;
      case 1:
        localObject = com.tencent.mm.plugin.story.model.j.rST;
        j.a.cno().post((Runnable)new i.b.a.a(this, paramMessage));
        AppMethodBeat.o(109243);
        break;
      case 2:
        localObject = com.tencent.mm.plugin.story.model.j.rST;
        j.a.cno().post((Runnable)new i.b.a.b(this, paramMessage));
        AppMethodBeat.o(109243);
        break;
      case 3:
        localObject = com.tencent.mm.plugin.story.model.j.rST;
        j.a.cno().post((Runnable)new i.b.a.c(this, paramMessage));
        AppMethodBeat.o(109243);
        break;
      case 4:
        localObject = com.tencent.mm.plugin.story.model.j.rST;
        j.a.cno().post((Runnable)new i.b.a.d(this, paramMessage));
        AppMethodBeat.o(109243);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.a.i.b.a
 * JD-Core Version:    0.6.2
 */