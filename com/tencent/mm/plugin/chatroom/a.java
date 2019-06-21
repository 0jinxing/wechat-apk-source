package com.tencent.mm.plugin.chatroom;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ag;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.u;
import com.tencent.mm.storage.v;
import java.util.HashMap;
import java.util.List;

public final class a
  implements com.tencent.mm.kernel.api.bucket.a, com.tencent.mm.kernel.api.c, com.tencent.mm.kernel.c.a, com.tencent.mm.plugin.chatroom.a.c
{
  private v ktJ;
  private boolean ktK;
  private HashMap<String, Boolean> ktL;

  public a()
  {
    AppMethodBeat.i(1011);
    this.ktL = new HashMap();
    AppMethodBeat.o(1011);
  }

  public final boolean HH(String paramString)
  {
    AppMethodBeat.i(1013);
    boolean bool;
    if (this.ktK)
    {
      AppMethodBeat.o(1013);
      bool = false;
    }
    while (true)
    {
      return bool;
      try
      {
        if (this.ktL.containsKey(paramString))
        {
          bool = ((Boolean)this.ktL.get(paramString)).booleanValue();
          AppMethodBeat.o(1013);
        }
        else
        {
          u localu = this.ktJ.oa(paramString);
          if ((localu.field_chatroomStatus & 0x4000) != 0L)
          {
            bool = true;
            label83: int i = ((com.tencent.mm.plugin.zero.b.a)g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getInt("ChatRoomAdminSwitch", -1);
            int j = ((com.tencent.mm.plugin.zero.b.a)g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getInt("ChatRoomAdminMinMemberCount", -1);
            ab.i("MicroMsg.ChatroomService", "[isEnableRoomManager] chatroomName:%s isStatusEnable:%s switchFlag:%s minCount:%d memberCount:%d", new Object[] { paramString, Boolean.valueOf(bool), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(localu.afg().size()) });
            if ((i <= 0) || ((!bool) && (j > localu.afg().size())))
              break label230;
          }
          label230: for (bool = true; ; bool = false)
          {
            this.ktL.put(paramString, Boolean.valueOf(bool));
            AppMethodBeat.o(1013);
            break;
            bool = false;
            break label83;
          }
        }
      }
      catch (Exception paramString)
      {
        ab.printErrStackTrace("MicroMsg.ChatroomService", paramString, "[isEnableRoomManager]", new Object[0]);
        AppMethodBeat.o(1013);
        bool = false;
      }
    }
  }

  public final ag c(h paramh)
  {
    AppMethodBeat.i(1012);
    paramh = new v(paramh);
    AppMethodBeat.o(1012);
    return paramh;
  }

  public final HashMap<Integer, h.d> collectDatabaseFactory()
  {
    AppMethodBeat.i(1014);
    HashMap localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf("CHATROOM_MEMBERS_TABLE".hashCode()), new a.1(this));
    AppMethodBeat.o(1014);
    return localHashMap;
  }

  public final void fN(boolean paramBoolean)
  {
    this.ktK = paramBoolean;
  }

  public final void onAccountInitialized(e.c paramc)
  {
    AppMethodBeat.i(1015);
    this.ktJ = new v(g.RP().eJN);
    AppMethodBeat.o(1015);
  }

  public final void onAccountRelease()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.chatroom.a
 * JD-Core Version:    0.6.2
 */