package com.tencent.mm.chatroom.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.n;
import com.tencent.mm.plugin.chatroom.a.c;
import com.tencent.mm.pluginsdk.ui.applet.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.u;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class ChatroomInfoUI$33
  implements Runnable
{
  ChatroomInfoUI$33(ChatroomInfoUI paramChatroomInfoUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(104000);
    if (ChatroomInfoUI.c(this.eiz) == null)
    {
      ab.w("MicroMsg.ChatroomInfoUI", "[updateRoomPref] member == null");
      AppMethodBeat.o(104000);
    }
    while (true)
    {
      return;
      ChatroomInfoUI.b(this.eiz, ((c)g.K(c.class)).XV().od(ChatroomInfoUI.b(this.eiz)));
      Object localObject1 = n.my(ChatroomInfoUI.b(this.eiz));
      if (localObject1 != null)
        ChatroomInfoUI.a(this.eiz, ((List)localObject1).size());
      Object localObject2;
      while (true)
      {
        localObject2 = new LinkedList();
        Iterator localIterator = ((List)localObject1).iterator();
        while (localIterator.hasNext())
        {
          localObject3 = (String)localIterator.next();
          if ((ChatroomInfoUI.c(this.eiz).aoo((String)localObject3)) || (ChatroomInfoUI.c(this.eiz).aos((String)localObject3)))
            ((LinkedList)localObject2).add(localObject3);
        }
        localObject1 = new LinkedList();
        ChatroomInfoUI.a(this.eiz, 0);
      }
      Object localObject3 = localObject1;
      if (ChatroomInfoUI.e(this.eiz) > j.MAX_COUNT + 1)
      {
        localObject3 = localObject1;
        if (localObject1 != null)
        {
          localObject1 = ((List)localObject1).subList(0, j.MAX_COUNT + 1);
          localObject2 = ((LinkedList)localObject2).iterator();
          while (true)
          {
            localObject3 = localObject1;
            if (!((Iterator)localObject2).hasNext())
              break;
            localObject3 = (String)((Iterator)localObject2).next();
            if (!((List)localObject1).contains(localObject3))
              ((List)localObject1).add(0, localObject3);
          }
        }
      }
      al.d(new ChatroomInfoUI.33.1(this, (List)localObject3));
      AppMethodBeat.o(104000);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.ChatroomInfoUI.33
 * JD-Core Version:    0.6.2
 */