package com.tencent.mm.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.List;

public final class af
{
  public static List<String> dzi()
  {
    AppMethodBeat.i(29925);
    int i = r.YD();
    ArrayList localArrayList = new ArrayList();
    if ((i & 0x8000) == 0)
    {
      localArrayList.add("floatbottle");
      ab.d("MicroMsg.LauncherUI", "add bottle into show unread count blacklist.");
    }
    aw.ZK();
    if (!c.Ry().getBoolean(ac.a.xON, true))
    {
      localArrayList.add("notifymessage");
      ab.d("MicroMsg.UnreadCountHelper", "add service notify message into show unread count blacklist.");
    }
    aw.ZK();
    if (!c.Ry().getBoolean(ac.a.xOO, true))
    {
      localArrayList.add("appbrandcustomerservicemsg");
      ab.d("MicroMsg.UnreadCountHelper", "add wxa custom session notify message into show unread count blacklist.");
    }
    ab.d("MicroMsg.LauncherUI", "getShowUnreadCountBlacklist unread count blacklist(size : %s).", new Object[] { Integer.valueOf(localArrayList.size()) });
    AppMethodBeat.o(29925);
    return localArrayList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.af
 * JD-Core Version:    0.6.2
 */