package com.tencent.mm.ui.transmit;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.a.qb;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bv;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.pluginsdk.model.app.b;
import com.tencent.mm.protocal.protobuf.cfh;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.contact.z;
import com.tencent.mm.vfs.e;
import java.util.Iterator;
import java.util.List;

public final class d
  implements com.tencent.mm.plugin.messenger.a.d
{
  public final void F(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(35240);
    if ((paramString1 == null) || (paramString2 == null))
    {
      ab.w("MicroMsg.SendMsgMgr", "send msg args error, toUser[%s] content[%s]", new Object[] { paramString1, paramString2 });
      AppMethodBeat.o(35240);
    }
    while (true)
    {
      return;
      paramString1 = new com.tencent.mm.modelmulti.h(paramString1, paramString2, paramInt);
      aw.Rg().a(paramString1, 0);
      AppMethodBeat.o(35240);
    }
  }

  public final void a(Context paramContext, String paramString1, String paramString2, int paramInt, String paramString3, String paramString4)
  {
    AppMethodBeat.i(35243);
    if ((paramString1 == null) || (paramString2 == null))
    {
      ab.w("MicroMsg.SendMsgMgr", "sendImg: args error, toUser[%s], fileName[%s]", new Object[] { paramString1, paramString2 });
      AppMethodBeat.o(35243);
    }
    while (true)
    {
      return;
      aw.ZK();
      if (!com.tencent.mm.model.c.isSDCardAvailable())
      {
        ab.w("MicroMsg.SendMsgMgr", "sdcard not ready, send video fail");
        Toast.makeText(paramContext, 2131301510, 1).show();
        AppMethodBeat.o(35243);
      }
      else
      {
        paramContext = new com.tencent.mm.at.l(4, r.Yz(), paramString1, paramString2, paramInt, null, 0, paramString3, paramString4, true, 2130838182);
        aw.Rg().a(paramContext, 0);
        bv.aaq().c(bv.fnv, null);
        AppMethodBeat.o(35243);
      }
    }
  }

  public final void a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, cfh paramcfh, String paramString4)
  {
    int i = 1;
    AppMethodBeat.i(35242);
    if (paramContext == null)
    {
      ab.w("MicroMsg.SendMsgMgr", "send vedio context is null");
      AppMethodBeat.o(35242);
    }
    while (true)
    {
      return;
      if ((paramString1 == null) || (paramString2 == null))
      {
        ab.w("MicroMsg.SendMsgMgr", "send vedio args error, toUser[%s] fileName[%s]", new Object[] { paramString1, paramString2 });
        AppMethodBeat.o(35242);
      }
      else
      {
        aw.ZK();
        if (com.tencent.mm.model.c.isSDCardAvailable())
          break;
        ab.w("MicroMsg.SendMsgMgr", "sdcard not ready, send video fail");
        Toast.makeText(paramContext, 2131301510, 1).show();
        AppMethodBeat.o(35242);
      }
    }
    MsgRetransmitUI.a locala = new MsgRetransmitUI.a();
    paramContext.getResources().getString(2131297061);
    com.tencent.mm.ui.base.p localp = com.tencent.mm.ui.base.h.b(paramContext, paramContext.getResources().getString(2131297043), true, new d.1(this, locala));
    locala.context = paramContext;
    locala.fileName = paramString2;
    locala.zJB = paramString3;
    locala.gII = localp;
    locala.userName = paramString1;
    locala.cMn = paramString4;
    locala.zJE = false;
    if (62 == paramInt1)
      locala.fVl = 11;
    if (paramInt1 > 0);
    for (paramInt1 = i; ; paramInt1 = 0)
    {
      locala.zIW = paramInt1;
      locala.fXd = paramInt2;
      locala.zJC = false;
      locala.zJF = paramcfh;
      locala.execute(new Object[0]);
      AppMethodBeat.o(35242);
      break;
    }
  }

  public final void a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, String paramString4)
  {
    AppMethodBeat.i(35241);
    a(paramContext, paramString1, paramString2, paramString3, paramInt1, paramInt2, null, paramString4);
    AppMethodBeat.o(35241);
  }

  public final void a(String paramString1, byte[] paramArrayOfByte, String paramString2, String paramString3)
  {
    AppMethodBeat.i(35244);
    if (paramString1 == null)
    {
      ab.w("MicroMsg.SendMsgMgr", "sendAppMsg: args error, toUser is null");
      AppMethodBeat.o(35244);
    }
    j.b localb;
    while (true)
    {
      return;
      ab.v("MicroMsg.SendMsgMgr", "for track bug sendAppMsg %s", new Object[] { paramString2 });
      localb = j.b.me(bo.anj(paramString2));
      if (localb != null)
        break;
      ab.w("MicroMsg.SendMsgMgr", "send: parse app msg content return null");
      AppMethodBeat.o(35244);
    }
    Object localObject = new b();
    ab.i("MicroMsg.SendMsgMgr", "content.attachid %s", new Object[] { localb.csD });
    paramString2 = (String)localObject;
    if (!bo.isNullOrNil(localb.csD))
    {
      long l = bo.getLong(localb.csD, -1L);
      if (l == -1L)
        break label408;
      am.aUq().b(l, (com.tencent.mm.sdk.e.c)localObject);
      paramString2 = (String)localObject;
      if (((b)localObject).xDa != l)
      {
        localObject = am.aUq().aiE(localb.csD);
        if (localObject != null)
        {
          paramString2 = (String)localObject;
          if (((b)localObject).field_mediaSvrId.equals(localb.csD));
        }
        else
        {
          paramString2 = null;
        }
        if (paramString2 != null)
          break label368;
        ab.i("MicroMsg.SendMsgMgr", "appAttachInfo1  %s", new Object[] { localb.csD });
      }
    }
    while (true)
    {
      String str = "";
      localObject = str;
      if (paramString2 != null)
      {
        localObject = str;
        if (paramString2.field_fileFullPath != null)
        {
          localObject = str;
          if (!paramString2.field_fileFullPath.equals(""))
          {
            aw.ZK();
            localObject = com.tencent.mm.pluginsdk.model.app.l.X(com.tencent.mm.model.c.Ye(), localb.title, localb.fgp);
            e.y(paramString2.field_fileFullPath, (String)localObject);
            ab.i("MicroMsg.SendMsgMgr", "copy from src %s to dest %s size: %s", new Object[] { paramString2.field_fileFullPath, localObject, Long.valueOf(e.asZ(paramString2.field_fileFullPath)) });
          }
        }
      }
      paramString2 = j.b.a(localb);
      paramString2.fgr = 3;
      com.tencent.mm.pluginsdk.model.app.l.a(paramString2, localb.appId, localb.appName, paramString1, (String)localObject, paramArrayOfByte, paramString3);
      AppMethodBeat.o(35244);
      break;
      label368: ab.i("MicroMsg.SendMsgMgr", "appAttachInfo2  %s : %s : %s", new Object[] { localb.csD, Long.valueOf(paramString2.xDa), paramString2.field_fileFullPath });
      continue;
      label408: localObject = am.aUq().aiE(localb.csD);
      if (localObject != null)
      {
        paramString2 = (String)localObject;
        if (((b)localObject).field_mediaSvrId.equals(localb.csD));
      }
      else
      {
        paramString2 = null;
      }
      if (paramString2 == null)
        ab.i("MicroMsg.SendMsgMgr", "appAttachInfo3  %s", new Object[] { localb.csD });
      else
        ab.i("MicroMsg.SendMsgMgr", "appAttachInfo4  %s : %s : %s", new Object[] { localb.csD, Long.valueOf(paramString2.xDa), paramString2.field_fileFullPath });
    }
  }

  public final void eZ(String paramString1, String paramString2)
  {
    AppMethodBeat.i(35246);
    paramString2 = bo.P(bo.bc(paramString2, "").split(","));
    if (!TextUtils.isEmpty(paramString1))
    {
      Iterator localIterator = paramString2.iterator();
      while (localIterator.hasNext())
      {
        paramString2 = (String)localIterator.next();
        qb localqb = new qb();
        localqb.cMq.cMr = paramString2;
        localqb.cMq.content = paramString1;
        localqb.cMq.type = t.nK(paramString2);
        localqb.cMq.flags = 0;
        a.xxA.m(localqb);
      }
    }
    AppMethodBeat.o(35246);
  }

  public final void q(String paramString1, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(35245);
    Object localObject1;
    int i;
    if (paramBoolean)
    {
      localObject1 = bo.bc(paramString2, "");
      paramString2 = z.arT(paramString1);
      if (ad.aox(paramString1))
      {
        i = 66;
        paramString1 = new com.tencent.mm.modelmulti.h((String)localObject1, paramString2, i);
        aw.Rg().a(paramString1, 0);
        AppMethodBeat.o(35245);
      }
    }
    while (true)
    {
      return;
      i = 42;
      break;
      localObject1 = bo.P(bo.bc(paramString2, "").split(","));
      paramString2 = z.arT(paramString1);
      i = 0;
      if (i < ((List)localObject1).size())
      {
        Object localObject2 = (String)((List)localObject1).get(i);
        if (ad.aox(paramString1));
        for (int j = 66; ; j = 42)
        {
          localObject2 = new com.tencent.mm.modelmulti.h((String)localObject2, paramString2, j);
          aw.Rg().a((m)localObject2, 0);
          i++;
          break;
        }
      }
      AppMethodBeat.o(35245);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.d
 * JD-Core Version:    0.6.2
 */