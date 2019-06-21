package com.tencent.mm.plugin.wear.model.f;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.wear.model.e.r;
import com.tencent.mm.plugin.wear.model.f;
import com.tencent.mm.plugin.wear.model.g;
import com.tencent.mm.protocal.protobuf.cug;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bq;
import com.tencent.mm.storage.bi;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class j extends b
{
  private boolean cGH;
  private int csm;
  private String talker;

  public j(String paramString, int paramInt, boolean paramBoolean)
  {
    this.talker = paramString;
    this.csm = paramInt;
    this.cGH = paramBoolean;
  }

  private static String Y(ArrayList<bi> paramArrayList)
  {
    AppMethodBeat.i(26449);
    StringBuffer localStringBuffer = new StringBuffer();
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      bi localbi = (bi)paramArrayList.next();
      localStringBuffer.append(localbi.field_msgId);
      localStringBuffer.append(localbi.field_talker);
      localStringBuffer.append(localbi.field_content);
      localStringBuffer.append(localbi.getType());
      localStringBuffer.append(localbi.field_createTime);
    }
    paramArrayList = ag.ck(localStringBuffer.toString());
    AppMethodBeat.o(26449);
    return paramArrayList;
  }

  private static String k(String paramString, ArrayList<bi> paramArrayList)
  {
    AppMethodBeat.i(26448);
    ab.d("MicroMsg.WearNotificationCreateTask", "Talker: %s, MsgSize: %d", new Object[] { paramString, Integer.valueOf(paramArrayList.size()) });
    StringBuffer localStringBuffer = new StringBuffer();
    for (int i = paramArrayList.size() - 1; i >= 0; i--)
    {
      localStringBuffer.append(b(paramString, (bi)paramArrayList.get(i)));
      localStringBuffer.append("​​");
    }
    paramString = localStringBuffer.toString().trim();
    AppMethodBeat.o(26448);
    return paramString;
  }

  public final String getName()
  {
    return "WearNotificationCreateTask";
  }

  protected final void send()
  {
    AppMethodBeat.i(26450);
    ab.d("MicroMsg.WearNotificationCreateTask", "start to execute notification create task");
    f localf = com.tencent.mm.plugin.wear.model.a.cUn().tXv.adr(this.talker);
    Object localObject1 = new ArrayList();
    int i = this.csm - localf.tYc;
    int j = i;
    if (i < 0)
      j = 0;
    ab.d("MicroMsg.WearNotificationCreateTask", "limit=%d", new Object[] { Integer.valueOf(j) });
    aw.ZK();
    Iterator localIterator = c.XO().cs(this.talker, j).iterator();
    Object localObject2;
    label151: 
    while (localIterator.hasNext())
    {
      localObject2 = (bi)localIterator.next();
      if (((bi)localObject2).isSystem());
      for (j = 0; ; j = 1)
      {
        if (j == 0)
          break label151;
        ((ArrayList)localObject1).add(localObject2);
        break;
      }
    }
    ab.i("MicroMsg.WearNotificationCreateTask", "receiveUnreadMsgList.size=%d", new Object[] { Integer.valueOf(((ArrayList)localObject1).size()) });
    if (((ArrayList)localObject1).size() == 0)
      AppMethodBeat.o(26450);
    while (true)
    {
      return;
      localObject2 = Y((ArrayList)localObject1);
      if (localf.cvZ.equals(localObject2))
      {
        ab.i("MicroMsg.WearNotificationCreateTask", "same md5, not to update");
        AppMethodBeat.o(26450);
        continue;
      }
      localf.cvZ = ((String)localObject2);
      localObject2 = new cug();
      ((cug)localObject2).ndE = localf.id;
      ((cug)localObject2).wyw = localf.talker;
      ((cug)localObject2).Title = com.tencent.mm.plugin.wear.model.h.adw(localf.talker);
      ((cug)localObject2).ncM = k(localf.talker, (ArrayList)localObject1);
      ((cug)localObject2).wXt = this.csm;
      ((cug)localObject2).xqJ = this.cGH;
      boolean bool;
      if (!bq.dpN())
      {
        bool = true;
        ((cug)localObject2).xqI = bool;
        localObject1 = com.tencent.mm.plugin.wear.model.h.adv(localf.talker);
        if (localObject1 != null)
          ((cug)localObject2).xqr = new com.tencent.mm.bt.b(com.tencent.mm.plugin.wear.model.h.ad((Bitmap)localObject1));
        ab.d("MicroMsg.WearNotificationCreateTask", "generate notification content and ready to send");
      }
      try
      {
        com.tencent.mm.plugin.wear.model.a.cUn();
        r.b(20003, ((cug)localObject2).toByteArray(), true);
        label366: ab.d("MicroMsg.WearNotificationCreateTask", "start to update notification status");
        com.tencent.mm.plugin.wear.model.a.cUn().tXv.a(localf);
        com.tencent.mm.plugin.wear.model.a.cUn().tXv.adu(this.talker);
        com.tencent.mm.plugin.wear.model.c.a.gn(6, 0);
        com.tencent.mm.plugin.wear.model.c.a.HH(1);
        AppMethodBeat.o(26450);
        continue;
        bool = false;
      }
      catch (IOException localIOException)
      {
        break label366;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.f.j
 * JD-Core Version:    0.6.2
 */