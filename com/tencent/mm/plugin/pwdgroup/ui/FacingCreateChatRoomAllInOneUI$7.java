package com.tencent.mm.plugin.pwdgroup.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.aan;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;

final class FacingCreateChatRoomAllInOneUI$7
  implements Runnable
{
  FacingCreateChatRoomAllInOneUI$7(FacingCreateChatRoomAllInOneUI paramFacingCreateChatRoomAllInOneUI, LinkedList paramLinkedList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(23989);
    if (FacingCreateChatRoomAllInOneUI.s(this.prD) != null)
      FacingCreateChatRoomAllInOneUI.s(this.prD).clear();
    if (FacingCreateChatRoomAllInOneUI.t(this.prD) != null)
      FacingCreateChatRoomAllInOneUI.t(this.prD).clear();
    aan localaan;
    if ((this.prE != null) && (this.prE.size() > 0))
    {
      i = this.prE.size();
      for (j = 0; j < i; j++)
      {
        localaan = (aan)this.prE.get(j);
        if (!bo.isNullOrNil(localaan.wfK))
          FacingCreateChatRoomAllInOneUI.t(this.prD).put(localaan.wfK, localaan);
      }
    }
    int i = FacingCreateChatRoomAllInOneUI.c(this.prD).size();
    int j = 0;
    if (j < i)
    {
      localaan = (aan)FacingCreateChatRoomAllInOneUI.c(this.prD).get(j);
      if (!FacingCreateChatRoomAllInOneUI.t(this.prD).containsKey(localaan.wfK))
        ab.d("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "cpan[updateMember] delete member name:%s", new Object[] { localaan.wfK });
      while (true)
      {
        j++;
        break;
        FacingCreateChatRoomAllInOneUI.t(this.prD).remove(localaan.wfK);
      }
    }
    if ((FacingCreateChatRoomAllInOneUI.t(this.prD) != null) && (FacingCreateChatRoomAllInOneUI.t(this.prD).size() > 0))
    {
      Iterator localIterator = FacingCreateChatRoomAllInOneUI.t(this.prD).entrySet().iterator();
      while (localIterator.hasNext())
      {
        localaan = (aan)((Map.Entry)localIterator.next()).getValue();
        FacingCreateChatRoomAllInOneUI.s(this.prD).add(localaan);
        ab.d("MicroMsg.Facing.FacingCreateChatRoomAllInONeUI", "cpan[updateMember] add member name:%s", new Object[] { localaan.wfK });
      }
    }
    FacingCreateChatRoomAllInOneUI.c(this.prD).addAll(FacingCreateChatRoomAllInOneUI.s(this.prD));
    FacingCreateChatRoomAllInOneUI.u(this.prD).sendEmptyMessage(10001);
    AppMethodBeat.o(23989);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI.7
 * JD-Core Version:    0.6.2
 */