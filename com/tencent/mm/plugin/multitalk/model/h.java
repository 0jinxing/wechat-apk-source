package com.tencent.mm.plugin.multitalk.model;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.nw;
import com.tencent.mm.model.s;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.multitalk.a.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.storage.z;
import com.tencent.pb.common.b.a.a.av;
import com.tencent.pb.common.b.a.a.bb;
import com.tencent.pb.talkroom.sdk.MultiTalkGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class h
  implements a
{
  private List<a.a> bkF;
  private ak handler;
  private LinkedList<String> oGI;
  private LinkedList<String> oGJ;
  private LinkedList<String> oGK;

  public h()
  {
    AppMethodBeat.i(54010);
    this.bkF = new ArrayList();
    this.oGI = null;
    this.oGJ = new LinkedList();
    this.oGK = new LinkedList();
    this.handler = new ak(Looper.getMainLooper());
    AppMethodBeat.o(54010);
  }

  private void Sn(String paramString)
  {
    AppMethodBeat.i(54039);
    ab.i("MicroMsg.MultiTalkRoomListMsg", "addwxGroupIdInMap:".concat(String.valueOf(paramString)));
    if (this.oGI != null)
    {
      if (this.oGI.contains(paramString))
        break label72;
      this.oGI.add(paramString);
      AppMethodBeat.o(54039);
    }
    while (true)
    {
      return;
      bRT();
      if (this.oGI != null)
        this.oGI.add(paramString);
      label72: AppMethodBeat.o(54039);
    }
  }

  private static boolean b(String paramString, a.bb parambb)
  {
    int i = 0;
    boolean bool = false;
    AppMethodBeat.i(54040);
    if (parambb == null)
      AppMethodBeat.o(54040);
    while (true)
    {
      return bool;
      com.tencent.mm.bg.f localf = new com.tencent.mm.bg.f();
      localf.field_wxGroupId = paramString;
      localf.field_groupId = parambb.groupId;
      localf.field_roomId = parambb.sQS;
      localf.field_roomKey = parambb.sQT;
      localf.field_routeId = parambb.AmC;
      localf.field_inviteUserName = parambb.ApP;
      parambb = parambb.AnQ;
      if (parambb.length > 0)
        i = parambb.length;
      localf.field_memberCount = i;
      localf.field_createTime = System.currentTimeMillis();
      if (p.bSb().RW(paramString) == null)
      {
        bool = p.bSb().a(localf);
        AppMethodBeat.o(54040);
      }
      else
      {
        bool = p.bSb().b(localf);
        AppMethodBeat.o(54040);
      }
    }
  }

  private static boolean c(String paramString, a.bb parambb)
  {
    AppMethodBeat.i(54041);
    boolean bool;
    if (parambb == null)
    {
      bool = false;
      AppMethodBeat.o(54041);
    }
    while (true)
    {
      return bool;
      bool = true;
      a.av[] arrayOfav = parambb.AnQ;
      if ((arrayOfav != null) && (arrayOfav.length > 0))
      {
        p.bSc().pI(paramString);
        int i = arrayOfav.length;
        for (int j = 0; j < i; j++)
        {
          a.av localav = arrayOfav[j];
          parambb = new com.tencent.mm.plugin.multitalk.a.b();
          parambb.field_wxGroupId = paramString;
          parambb.field_inviteUserName = localav.Apu;
          parambb.field_memberUuid = localav.vzt;
          parambb.field_userName = localav.Aop;
          parambb.field_status = localav.status;
          if (!p.bSc().a(parambb))
          {
            ab.e("MicroMsg.MultiTalkRoomListMsg", "save multiTalkMember failure! wxGroupId = %s,userName = %s,field_memberUuid = %d,multiTalkMember.field_inviteUserName = %s", new Object[] { paramString, localav.Aop, Long.valueOf(parambb.field_memberUuid), parambb.field_inviteUserName });
            bool = false;
          }
          ab.i("MicroMsg.MultiTalkRoomListMsg", "save multiTalkMember success! wxGroupId = %s,userName = %s,field_memberUuid = %d,multiTalkMember.field_inviteUserName = %s", new Object[] { paramString, localav.Aop, Long.valueOf(parambb.field_memberUuid), parambb.field_inviteUserName });
        }
        AppMethodBeat.o(54041);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(54041);
      }
    }
  }

  static boolean d(String paramString, a.bb parambb)
  {
    AppMethodBeat.i(54042);
    boolean bool1;
    if (parambb == null)
    {
      bool1 = false;
      AppMethodBeat.o(54042);
    }
    a.av[] arrayOfav;
    LinkedList localLinkedList1;
    int i;
    int j;
    String str;
    while (true)
    {
      return bool1;
      arrayOfav = parambb.AnQ;
      localLinkedList1 = new LinkedList();
      i = arrayOfav.length;
      for (j = 0; j < i; j++)
        localLinkedList1.add(arrayOfav[j].Aop);
      str = (String)com.tencent.mm.kernel.g.RP().Ry().get(2, null);
      if (str != null)
        break;
      ab.i("MicroMsg.MultiTalkRoomListMsg", "myUserName is null , go save delete all logic.");
      b(paramString, parambb);
      bool1 = true;
      AppMethodBeat.o(54042);
    }
    Object localObject1 = p.bSc().So(paramString);
    LinkedList localLinkedList2 = new LinkedList();
    parambb = null;
    Object localObject2 = ((List)localObject1).iterator();
    label140: if (((Iterator)localObject2).hasNext())
    {
      localObject1 = (com.tencent.mm.plugin.multitalk.a.b)((Iterator)localObject2).next();
      localLinkedList2.add(((com.tencent.mm.plugin.multitalk.a.b)localObject1).field_userName);
      if (!((com.tencent.mm.plugin.multitalk.a.b)localObject1).field_userName.equals(str))
        break label779;
      parambb = (a.bb)localObject1;
    }
    label779: 
    while (true)
    {
      break label140;
      if ((parambb != null) && (localLinkedList1.contains(str)))
      {
        i = arrayOfav.length;
        j = 0;
        for (bool1 = true; ; bool1 = bool2)
        {
          bool2 = bool1;
          if (j >= i)
            break;
          localObject1 = arrayOfav[j];
          bool2 = bool1;
          if (((a.av)localObject1).Aop != null)
          {
            bool2 = bool1;
            if (((a.av)localObject1).Aop.equals(str))
            {
              bool2 = bool1;
              if (((a.av)localObject1).status != parambb.field_status)
              {
                localObject2 = new com.tencent.mm.plugin.multitalk.a.b();
                ((com.tencent.mm.plugin.multitalk.a.b)localObject2).field_wxGroupId = paramString;
                ((com.tencent.mm.plugin.multitalk.a.b)localObject2).field_inviteUserName = ((a.av)localObject1).Apu;
                ((com.tencent.mm.plugin.multitalk.a.b)localObject2).field_memberUuid = ((a.av)localObject1).vzt;
                ((com.tencent.mm.plugin.multitalk.a.b)localObject2).field_userName = ((a.av)localObject1).Aop;
                ((com.tencent.mm.plugin.multitalk.a.b)localObject2).field_status = ((a.av)localObject1).status;
                if (!p.bSc().a((com.tencent.mm.plugin.multitalk.a.b)localObject2))
                {
                  ab.e("MicroMsg.MultiTalkRoomListMsg", "updateMultiTalkMembers update myself failure! wxGroupId = %s,userName = %s,field_memberUuid = %d,multiTalkMember.field_inviteUserName = %s", new Object[] { paramString, ((a.av)localObject1).Aop, Long.valueOf(((com.tencent.mm.plugin.multitalk.a.b)localObject2).field_memberUuid), ((com.tencent.mm.plugin.multitalk.a.b)localObject2).field_inviteUserName });
                  bool1 = false;
                }
                ab.i("MicroMsg.MultiTalkRoomListMsg", "updateMultiTalkMembers update myself success! wxGroupId = %s,userName = %s,field_memberUuid = %d,multiTalkMember.field_inviteUserName = %s", new Object[] { paramString, ((a.av)localObject1).Aop, Long.valueOf(((com.tencent.mm.plugin.multitalk.a.b)localObject2).field_memberUuid), ((com.tencent.mm.plugin.multitalk.a.b)localObject2).field_inviteUserName });
                bool2 = bool1;
              }
            }
          }
          j++;
        }
      }
      boolean bool2 = true;
      i = arrayOfav.length;
      j = 0;
      for (bool1 = bool2; j < i; bool1 = bool2)
      {
        localObject1 = arrayOfav[j];
        bool2 = bool1;
        if (!localLinkedList2.contains(((a.av)localObject1).Aop))
        {
          parambb = new com.tencent.mm.plugin.multitalk.a.b();
          parambb.field_wxGroupId = paramString;
          parambb.field_inviteUserName = ((a.av)localObject1).Apu;
          parambb.field_memberUuid = ((a.av)localObject1).vzt;
          parambb.field_userName = ((a.av)localObject1).Aop;
          parambb.field_status = ((a.av)localObject1).status;
          if (!p.bSc().a(parambb))
          {
            ab.e("MicroMsg.MultiTalkRoomListMsg", "updateMultiTalkMembers save multiTalkMember failure! wxGroupId = %s,userName = %s,field_memberUuid = %d,multiTalkMember.field_inviteUserName = %s", new Object[] { paramString, ((a.av)localObject1).Aop, Long.valueOf(parambb.field_memberUuid), parambb.field_inviteUserName });
            bool1 = false;
          }
          ab.i("MicroMsg.MultiTalkRoomListMsg", "updateMultiTalkMembers save multiTalkMember success! wxGroupId = %s,userName = %s,field_memberUuid = %d,multiTalkMember.field_inviteUserName = %s", new Object[] { paramString, ((a.av)localObject1).Aop, Long.valueOf(parambb.field_memberUuid), parambb.field_inviteUserName });
          bool2 = bool1;
        }
        j++;
      }
      parambb = localLinkedList2.iterator();
      while (parambb.hasNext())
      {
        localObject1 = (String)parambb.next();
        bool2 = bool1;
        if (!localLinkedList1.contains(localObject1))
        {
          if (p.bSc().dm(paramString, (String)localObject1))
          {
            ab.i("MicroMsg.MultiTalkRoomListMsg", "updateMultiTalkMembers delete success for wxGroupId = " + paramString + ", username = " + (String)localObject1);
          }
          else
          {
            bool2 = false;
            ab.e("MicroMsg.MultiTalkRoomListMsg", "updateMultiTalkMembers delete fail for wxGroupId = " + paramString + ", username = " + (String)localObject1);
          }
        }
        else
          bool1 = bool2;
      }
      AppMethodBeat.o(54042);
      break;
    }
  }

  public final void RU(String paramString)
  {
    AppMethodBeat.i(54013);
    if ((t.kH(paramString)) && (RX(paramString)))
    {
      ab.i("MicroMsg.MultiTalkRoomListMsg", "isKicked! now clean banner and check if i am in multitalk.");
      com.tencent.mm.kernel.g.RP().Ry().get(2, null);
      if ((p.bSf().oGh != null) && (p.bSf().oGh.Aqe.equals(paramString)))
      {
        ab.i("MicroMsg.MultiTalkRoomListMsg", "yes i am now in multitalk so i exit now!");
        p.bSf().h(false, false, false);
      }
      this.handler.postDelayed(new h.1(this, paramString), 2000L);
    }
    AppMethodBeat.o(54013);
  }

  public final boolean RV(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(54014);
    com.tencent.mm.bg.f localf = p.bSb().RW(paramString);
    if ((localf != null) && (localf.field_wxGroupId != null) && (localf.field_wxGroupId.equals(paramString)))
      if (System.currentTimeMillis() - localf.field_createTime > 21600000L)
      {
        ab.i("MicroMsg.MultiTalkRoomListMsg", "wxGroupId:" + paramString + ",is out of time 6 hours..");
        Sc(paramString);
        AppMethodBeat.o(54014);
      }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(54014);
      continue;
      AppMethodBeat.o(54014);
    }
  }

  public final com.tencent.mm.bg.f RW(String paramString)
  {
    AppMethodBeat.i(138402);
    paramString = p.bSb().RW(paramString);
    AppMethodBeat.o(138402);
    return paramString;
  }

  public final boolean RX(String paramString)
  {
    AppMethodBeat.i(54015);
    if (this.oGI == null)
      bRT();
    boolean bool;
    if ((this.oGI != null) && (this.oGI.contains(paramString)))
    {
      bool = true;
      AppMethodBeat.o(54015);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(54015);
    }
  }

  public final List<String> RY(String paramString)
  {
    AppMethodBeat.i(54016);
    Object localObject = p.bSc().So(paramString);
    paramString = new LinkedList();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
      paramString.add(((com.tencent.mm.plugin.multitalk.a.b)((Iterator)localObject).next()).field_userName);
    AppMethodBeat.o(54016);
    return paramString;
  }

  public final boolean RZ(String paramString)
  {
    AppMethodBeat.i(54022);
    Object localObject1 = com.tencent.mm.plugin.voip.b.cIk();
    boolean bool;
    if (localObject1 != null)
    {
      Object localObject2 = ((com.tencent.mm.plugin.voip.ui.d)localObject1).intent;
      if (localObject2 != null)
      {
        localObject2 = ((Intent)localObject2).getStringExtra("enterMainUiWxGroupId");
        localObject1 = ((com.tencent.mm.plugin.voip.ui.d)localObject1).sYX;
        if ((!com.tencent.pb.common.c.g.isEmpty((String)localObject2)) && (paramString.equals(localObject2)) && (localObject1 != null) && (((com.tencent.mm.plugin.voip.ui.e)localObject1).getVisibility() == 0) && (((com.tencent.mm.plugin.voip.ui.e)localObject1).isShown()))
        {
          bool = true;
          AppMethodBeat.o(54022);
        }
      }
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(54022);
    }
  }

  public final boolean Sa(String paramString)
  {
    AppMethodBeat.i(54029);
    paramString = p.bSb().RW(paramString);
    boolean bool;
    if (paramString != null)
    {
      bool = p.bSe().oFP.Sa(paramString.field_groupId);
      AppMethodBeat.o(54029);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(54029);
    }
  }

  public final boolean Sb(String paramString)
  {
    AppMethodBeat.i(54030);
    com.tencent.mm.bg.f localf = p.bSb().RW(paramString);
    boolean bool;
    if (localf != null)
    {
      ab.d("MicroMsg.MultiTalkRoomListMsg", "enterMultiTalk, roomid:" + localf.field_roomId + " wxgroupid:" + paramString);
      bool = p.bSe().oFP.a(localf.field_groupId, localf.field_roomId, localf.field_roomKey, localf.field_routeId, paramString);
      AppMethodBeat.o(54030);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(54030);
    }
  }

  public final void Sc(String paramString)
  {
    AppMethodBeat.i(54032);
    if (com.tencent.pb.common.c.g.isNullOrEmpty(paramString))
    {
      ab.e("MicroMsg.MultiTalkRoomListMsg", "cleanBanner failure ! wxGroupId is null or empty!");
      AppMethodBeat.o(54032);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.MultiTalkRoomListMsg", "cleanBanner  wxGroupId = %s", new Object[] { paramString });
      pI(paramString);
      p.bSc().pI(paramString);
      Sm(paramString);
      AppMethodBeat.o(54032);
    }
  }

  public final boolean Sd(String paramString)
  {
    AppMethodBeat.i(54027);
    paramString = p.bSb().RW(paramString);
    boolean bool;
    if (paramString != null)
    {
      bool = com.tencent.wecall.talkroom.model.a.dSR().a(paramString.field_groupId, paramString.field_roomId, paramString.field_roomKey, 1);
      AppMethodBeat.o(54027);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(54027);
    }
  }

  public final void Se(String paramString)
  {
    AppMethodBeat.i(54028);
    if (this.oGJ == null)
    {
      this.oGJ = new LinkedList();
      if (this.oGJ.contains(paramString))
        break label71;
      this.oGJ.add(paramString);
      AppMethodBeat.o(54028);
    }
    while (true)
    {
      return;
      if (!this.oGJ.contains(paramString))
        this.oGJ.add(paramString);
      label71: AppMethodBeat.o(54028);
    }
  }

  public final void Sk(String paramString)
  {
    AppMethodBeat.i(54034);
    if (this.oGJ == null)
    {
      this.oGJ = new LinkedList();
      AppMethodBeat.o(54034);
    }
    while (true)
    {
      return;
      this.oGJ.remove(paramString);
      AppMethodBeat.o(54034);
    }
  }

  public final boolean Sl(String paramString)
  {
    AppMethodBeat.i(54035);
    boolean bool;
    if (this.oGJ == null)
    {
      bool = false;
      AppMethodBeat.o(54035);
    }
    while (true)
    {
      return bool;
      bool = this.oGJ.contains(paramString);
      AppMethodBeat.o(54035);
    }
  }

  final void Sm(String paramString)
  {
    AppMethodBeat.i(54036);
    Iterator localIterator = this.bkF.iterator();
    while (localIterator.hasNext())
    {
      a.a locala = (a.a)localIterator.next();
      this.handler.post(new h.2(this, locala, paramString));
    }
    AppMethodBeat.o(54036);
  }

  public final void a(a.a parama)
  {
    try
    {
      AppMethodBeat.i(54011);
      this.bkF.add(parama);
      AppMethodBeat.o(54011);
      return;
    }
    finally
    {
      parama = finally;
    }
    throw parama;
  }

  public final void a(String paramString, a.bb parambb)
  {
    AppMethodBeat.i(54033);
    ab.i("MicroMsg.MultiTalkRoomListMsg", "showBanner  wxGroupId = %s", new Object[] { paramString });
    c(paramString, parambb);
    if (b(paramString, parambb))
      Sn(paramString);
    Sm(paramString);
    AppMethodBeat.o(54033);
  }

  public final void b(a.a parama)
  {
    try
    {
      AppMethodBeat.i(54012);
      this.bkF.remove(parama);
      AppMethodBeat.o(54012);
      return;
    }
    finally
    {
      parama = finally;
    }
    throw parama;
  }

  public final boolean bJ(Context paramContext)
  {
    AppMethodBeat.i(54026);
    boolean bool = com.tencent.mm.r.a.bJ(paramContext);
    AppMethodBeat.o(54026);
    return bool;
  }

  public final LinkedList<String> bRS()
  {
    AppMethodBeat.i(54009);
    if (this.oGK == null)
      this.oGK = new LinkedList();
    LinkedList localLinkedList = this.oGK;
    AppMethodBeat.o(54009);
    return localLinkedList;
  }

  public final void bRT()
  {
    AppMethodBeat.i(54038);
    Object localObject = p.bSb().bSj();
    ab.i("MicroMsg.MultiTalkRoomListMsg", "setMultitalkingwxGroupIdMap reset!");
    this.oGI = new LinkedList();
    Iterator localIterator = ((LinkedList)localObject).iterator();
    while (localIterator.hasNext())
    {
      localObject = (com.tencent.mm.bg.f)localIterator.next();
      this.oGI.add(((com.tencent.mm.bg.f)localObject).field_wxGroupId);
    }
    localObject = new nw();
    ((nw)localObject).cKn.type = 1;
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    AppMethodBeat.o(54038);
  }

  public final boolean bRa()
  {
    AppMethodBeat.i(54021);
    boolean bool;
    if ((p.bSf().bRd()) && ((p.bSf().oGg == com.tencent.mm.plugin.multitalk.ui.widget.e.oIF) || (p.bSf().oGg == com.tencent.mm.plugin.multitalk.ui.widget.e.oIE)))
    {
      bool = true;
      AppMethodBeat.o(54021);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(54021);
    }
  }

  public final boolean bRb()
  {
    AppMethodBeat.i(54023);
    boolean bool;
    if ((com.tencent.mm.plugin.voip.a.d.cLx()) || (p.bSf().bRc()) || (p.bSf().bRd()) || (p.bSf().bRH()))
    {
      bool = true;
      AppMethodBeat.o(54023);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(54023);
    }
  }

  public final boolean bRc()
  {
    AppMethodBeat.i(54020);
    boolean bool = p.bSf().bRc();
    AppMethodBeat.o(54020);
    return bool;
  }

  public final boolean bRd()
  {
    AppMethodBeat.i(54019);
    boolean bool = p.bSf().bRd();
    AppMethodBeat.o(54019);
    return bool;
  }

  public final boolean ff(String paramString1, String paramString2)
  {
    AppMethodBeat.i(54017);
    boolean bool;
    if (p.bSc().fi(paramString1, paramString2) != null)
    {
      bool = true;
      AppMethodBeat.o(54017);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(54017);
    }
  }

  public final int fg(String paramString1, String paramString2)
  {
    AppMethodBeat.i(54031);
    paramString1 = p.bSc().fi(paramString1, paramString2);
    int i;
    if (paramString1 != null)
    {
      i = paramString1.field_status;
      AppMethodBeat.o(54031);
    }
    while (true)
    {
      return i;
      i = 30;
      AppMethodBeat.o(54031);
    }
  }

  public final String fh(String paramString1, String paramString2)
  {
    AppMethodBeat.i(54024);
    paramString1 = p.bSc().fi(paramString1, paramString2);
    if (paramString1 != null)
    {
      paramString1 = paramString1.field_inviteUserName;
      AppMethodBeat.o(54024);
    }
    while (true)
    {
      return paramString1;
      paramString1 = null;
      AppMethodBeat.o(54024);
    }
  }

  public final String mJ(String paramString)
  {
    AppMethodBeat.i(54025);
    paramString = s.mJ(paramString);
    AppMethodBeat.o(54025);
    return paramString;
  }

  public final boolean pI(String paramString)
  {
    AppMethodBeat.i(54018);
    if (this.oGI != null)
    {
      ab.i("MicroMsg.MultiTalkRoomListMsg", "removewxGroupIdInMap:".concat(String.valueOf(paramString)));
      this.oGI.remove(paramString);
    }
    while (true)
    {
      boolean bool = p.bSb().pI(paramString);
      AppMethodBeat.o(54018);
      return bool;
      bRT();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.model.h
 * JD-Core Version:    0.6.2
 */