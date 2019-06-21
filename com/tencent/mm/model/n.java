package com.tencent.mm.model;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import com.tencent.mm.ah.o;
import com.tencent.mm.g.a.as;
import com.tencent.mm.g.a.at;
import com.tencent.mm.g.a.at.a;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.chatroom.a.c;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.baz;
import com.tencent.mm.protocal.protobuf.bbs;
import com.tencent.mm.protocal.protobuf.cb;
import com.tencent.mm.protocal.protobuf.qe;
import com.tencent.mm.protocal.protobuf.qf;
import com.tencent.mm.protocal.protobuf.vk;
import com.tencent.mm.protocal.protobuf.vu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.u;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import junit.framework.Assert;

public final class n
{
  public static f<String, String> fkH;

  static
  {
    AppMethodBeat.i(5546);
    fkH = new com.tencent.mm.a.h(100);
    AppMethodBeat.o(5546);
  }

  public static boolean N(String paramString, int paramInt)
  {
    AppMethodBeat.i(5541);
    paramString = ((c)g.K(c.class)).XV().oa(paramString);
    boolean bool;
    if (paramString == null)
    {
      AppMethodBeat.o(5541);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (paramString.field_chatroomVersion < paramInt)
      {
        bool = true;
        AppMethodBeat.o(5541);
      }
      else
      {
        AppMethodBeat.o(5541);
        bool = false;
      }
    }
  }

  public static void O(String paramString, int paramInt)
  {
    AppMethodBeat.i(5545);
    ag localag = ((c)g.K(c.class)).XV();
    u localu = localag.oa(paramString);
    if (localu == null)
      AppMethodBeat.o(5545);
    while (true)
    {
      return;
      com.tencent.mm.j.a.a.a locala = localu.drY();
      locala.type = paramInt;
      localu.a(paramString, locala, false);
      localag.a(localu);
      AppMethodBeat.o(5545);
    }
  }

  public static String T(List<String> paramList)
  {
    AppMethodBeat.i(5518);
    paramList = f(paramList, -1);
    AppMethodBeat.o(5518);
    return paramList;
  }

  public static String Z(String paramString1, String paramString2)
  {
    AppMethodBeat.i(5525);
    paramString1 = paramString2 + "#" + paramString1;
    if (fkH.ak(paramString1))
    {
      paramString1 = (String)fkH.get(paramString1);
      AppMethodBeat.o(5525);
    }
    while (true)
    {
      return paramString1;
      paramString1 = "";
      AppMethodBeat.o(5525);
    }
  }

  public static ad a(ad paramad, baz parambaz)
  {
    AppMethodBeat.i(5538);
    paramad.setUsername(aa.a(parambaz.wcG));
    paramad.iB(aa.a(parambaz.wcG));
    paramad.iC(aa.a(parambaz.wcG));
    paramad.iD(aa.a(parambaz.wcf));
    paramad.hA(parambaz.guN);
    paramad.iz(aa.a(parambaz.wFK));
    paramad.iG(aa.a(parambaz.wFL));
    paramad.iF(aa.a(parambaz.wcf));
    paramad.hD(parambaz.wbA);
    paramad.hF(parambaz.guR);
    paramad.iW(RegionCodeDecoder.aC(parambaz.guW, parambaz.guO, parambaz.guP));
    paramad.iQ(parambaz.guQ);
    AppMethodBeat.o(5538);
    return paramad;
  }

  public static void a(String paramString, u paramu, boolean paramBoolean)
  {
    AppMethodBeat.i(5517);
    paramu.pq(paramBoolean);
    ((c)g.K(c.class)).XV().c(paramu, new String[0]);
    paramu = r.Yz();
    com.tencent.mm.roomsdk.a.b.alY(paramString).c(paramString, paramu, paramBoolean).dmX();
    bbs localbbs = new bbs();
    localbbs.vEf = paramString;
    localbbs.jBB = paramu;
    localbbs.wGd = 1;
    if (paramBoolean);
    for (int i = 1; ; i = 2)
    {
      localbbs.pXD = i;
      ((j)g.K(j.class)).XL().c(new j.a(49, localbbs));
      AppMethodBeat.o(5517);
      return;
    }
  }

  public static void a(String paramString1, String paramString2, String paramString3, long paramLong, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(5544);
    ag localag = ((c)g.K(c.class)).XV();
    paramString1 = localag.oa(paramString1);
    if (paramString1 == null)
      AppMethodBeat.o(5544);
    while (true)
    {
      return;
      paramString1.field_chatroomVersion = paramInt1;
      paramString1.field_chatroomnoticePublishTime = paramLong;
      paramString1.field_chatroomnoticeEditor = paramString3;
      paramString1.field_chatroomnotice = paramString2;
      paramString1.field_chatroomStatus = paramInt2;
      localag.a(paramString1);
      AppMethodBeat.o(5544);
    }
  }

  public static boolean a(u paramu)
  {
    AppMethodBeat.i(5526);
    boolean bool;
    if (paramu == null)
    {
      ab.e("MicroMsg.ChatroomMembersLogic", "updateChatroomMember error! member is null");
      bool = false;
      AppMethodBeat.o(5526);
    }
    while (true)
    {
      return bool;
      bool = ((c)g.K(c.class)).XV().a(paramu);
      if (bool)
        aa(paramu.field_chatroomname, paramu.field_roomowner);
      AppMethodBeat.o(5526);
    }
  }

  public static boolean a(String paramString, cb paramcb)
  {
    boolean bool = false;
    AppMethodBeat.i(5529);
    if ((!mp(paramString)) || (paramcb.ehB == 0))
    {
      ab.e("MicroMsg.ChatroomMembersLogic", "AddChatroomMember: room:[" + paramString + "] listCnt:" + paramcb.ehB);
      AppMethodBeat.o(5529);
    }
    while (true)
    {
      return bool;
      ArrayList localArrayList = new ArrayList();
      bd localbd = ((j)g.K(j.class)).XM();
      int i = 0;
      while (i < paramcb.ehB)
      {
        Object localObject = aa.a(((baz)paramcb.vEh.get(i)).wcG);
        if (((baz)paramcb.vEh.get(i)).wFJ == 0)
        {
          if (bo.isNullOrNil((String)localObject))
            ab.e("MicroMsg.ChatroomMembersLogic", "this member name is null! chatRoomName : %s", new Object[] { paramString });
        }
        else
        {
          i++;
          continue;
        }
        localObject = localbd.aoO((String)localObject);
        if ((int)((com.tencent.mm.n.a)localObject).ewQ != 0)
        {
          ((ad)localObject).NA();
          localbd.b(((ap)localObject).field_username, (ad)localObject);
        }
        while (true)
        {
          localArrayList.add(((ap)localObject).field_username);
          break;
          localObject = a((ad)localObject, (baz)paramcb.vEh.get(i));
          localbd.Z((ad)localObject);
        }
      }
      if (!localArrayList.isEmpty())
      {
        bool = a(paramString, localArrayList, null);
        AppMethodBeat.o(5529);
      }
      else
      {
        AppMethodBeat.o(5529);
      }
    }
  }

  public static boolean a(String paramString, qe paramqe)
  {
    AppMethodBeat.i(5524);
    boolean bool;
    if (paramqe == null)
    {
      ab.e("MicroMsg.ChatroomMembersLogic", "[updateChatroomInviteer] memberData is null!");
      AppMethodBeat.o(5524);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (bo.isNullOrNil(paramString))
      {
        ab.e("MicroMsg.ChatroomMembersLogic", "[updateChatroomInviteer] username is null!");
        AppMethodBeat.o(5524);
        bool = false;
      }
      else if (t.kH(paramString))
      {
        ab.e("MicroMsg.ChatroomMembersLogic", "[updateChatroomInviteer] username is not personal! :%s", new Object[] { paramString });
        AppMethodBeat.o(5524);
        bool = false;
      }
      else
      {
        Object localObject = aa.a(paramqe.vXk);
        if (bo.isNullOrNil((String)localObject))
        {
          ab.e("MicroMsg.ChatroomMembersLogic", "[updateChatroomInviteer] chatroomId is null!");
          AppMethodBeat.o(5524);
          bool = false;
        }
        else
        {
          ab.i("MicroMsg.ChatroomMembersLogic", "[updateChatroomInviteer] chatroomId:%s size:%s", new Object[] { localObject, Integer.valueOf(paramqe.vXi.size()) });
          paramString = ((c)g.K(c.class)).XV().oa((String)localObject);
          if ((paramString != null) && (paramqe.vXi.size() > 0) && (paramString.afg().contains(((qf)paramqe.vXi.get(0)).jBB)))
          {
            String str = ((qf)paramqe.vXi.get(0)).jBB;
            localObject = paramString.aon(str);
            if (localObject != null)
            {
              ab.i("MicroMsg.ChatroomMembersLogic", "oldMember contains:%s displayName:%s", new Object[] { str, ((com.tencent.mm.j.a.a.b)localObject).eoz });
              ((com.tencent.mm.j.a.a.b)localObject).eoB = ((qf)paramqe.vXi.get(0)).vXp;
              a(paramString);
            }
            while (true)
            {
              AppMethodBeat.o(5524);
              bool = true;
              break;
              ab.e("MicroMsg.ChatroomMembersLogic", "talker:%s oldMemberData is null!", new Object[] { str });
            }
          }
          if ((paramString != null) && (paramqe.vXi.size() > 0))
          {
            paramString = new at();
            paramString.ctP.username = ((qf)paramqe.vXi.get(0)).jBB;
            paramString.ctP.ctQ = ((qf)paramqe.vXi.get(0)).vXp;
            fkH.put((String)localObject + "#" + paramString.ctP.username, paramString.ctP.ctQ);
            com.tencent.mm.sdk.b.a.xxA.m(paramString);
            AppMethodBeat.o(5524);
            bool = false;
          }
          else
          {
            if (paramqe.vXi.size() <= 0)
              ab.e("MicroMsg.ChatroomMembersLogic", "[updateChatroomInviteer] memberData.ChatRoomMember.size() <= 0");
            if (paramString != null)
              ab.e("MicroMsg.ChatroomMembersLogic", "[updateChatroomInviteer] oldMember is null!");
            AppMethodBeat.o(5524);
            bool = false;
          }
        }
      }
    }
  }

  public static boolean a(String paramString, vk paramvk)
  {
    AppMethodBeat.i(5528);
    boolean bool;
    if ((!mp(paramString)) || (paramvk.ehB == 0))
    {
      ab.e("MicroMsg.ChatroomMembersLogic", "DelChatroomMember: room:[" + paramString + "] listCnt:" + paramvk.ehB);
      bool = false;
      AppMethodBeat.o(5528);
    }
    while (true)
    {
      return bool;
      ag localag = ((c)g.K(c.class)).XV();
      u localu = localag.oa(paramString);
      paramString = u.aor(localu.field_memberlist);
      ab.d("MicroMsg.ChatroomMembersLogic", "DelChatroomMember before " + paramString.size());
      paramvk = paramvk.vEh.iterator();
      while (paramvk.hasNext())
        paramString.remove(aa.a(((vu)paramvk.next()).wcG));
      ab.d("MicroMsg.ChatroomMembersLogic", "DelChatroomMember after " + paramString.size());
      paramvk = localu.ep(paramString);
      paramvk.field_displayname = T(paramString);
      paramvk.field_memberCount = paramString.size();
      bool = localag.a(localu);
      ab.d("MicroMsg.ChatroomMembersLogic", "delChatroomMember ".concat(String.valueOf(bool)));
      AppMethodBeat.o(5528);
    }
  }

  public static boolean a(String paramString1, String paramString2, qe paramqe, int paramInt, String paramString3, com.tencent.mm.j.a.a.a parama, com.tencent.mm.sdk.b.b paramb)
  {
    AppMethodBeat.i(5523);
    boolean bool1;
    if ((!paramString1.toLowerCase().endsWith("@chatroom")) && (!paramString1.toLowerCase().endsWith("@im.chatroom")) && (!paramString1.toLowerCase().endsWith("@groupcard")) && (!paramString1.toLowerCase().endsWith("@talkroom")))
    {
      ab.e("MicroMsg.ChatroomMembersLogic", "SyncAddChatroomMember: room:[" + paramString1 + "] listCnt:" + paramqe.ehB);
      bool1 = false;
      AppMethodBeat.o(5523);
      return bool1;
    }
    bd localbd = ((j)g.K(j.class)).XM();
    u localu = ((c)g.K(c.class)).XV().oa(paramString1);
    if (localu != null);
    ArrayList localArrayList;
    long l1;
    qf localqf;
    ad localad;
    for (parama.cGj = localu.drT(); ; parama.cGj = 0)
    {
      localArrayList = new ArrayList();
      bool1 = false;
      ab.i("MicroMsg.ChatroomMembersLogic", "SyncAddChatroomMember: room:[" + paramString1 + "] memCnt:" + paramqe.ehB);
      l1 = System.currentTimeMillis();
      for (i = 0; ; i++)
      {
        if (i >= paramqe.ehB)
          break label596;
        localqf = (qf)paramqe.vXi.get(i);
        localad = localbd.aoO(localqf.jBB);
        if (localad != null)
          break;
        ab.e("MicroMsg.ChatroomMembersLogic", "SyncAddChatroomMember memberlist username is null");
      }
    }
    com.tencent.mm.j.a.a.b localb = new com.tencent.mm.j.a.a.b();
    localb.userName = localqf.jBB;
    localb.eoB = localqf.vXp;
    localb.eoA = localqf.vXo;
    boolean bool2;
    if (paramqe.vXj == 0)
    {
      localb.eoz = localqf.vXl;
      if (!bo.isNullOrNil(localqf.vXn))
      {
        com.tencent.mm.ah.h localh = o.act().qo(localqf.jBB);
        localObject = localh;
        if (localh == null)
        {
          localObject = new com.tencent.mm.ah.h();
          ((com.tencent.mm.ah.h)localObject).username = localqf.jBB;
        }
        ((com.tencent.mm.ah.h)localObject).frW = localqf.vXm;
        ((com.tencent.mm.ah.h)localObject).frV = localqf.vXn;
        ((com.tencent.mm.ah.h)localObject).dtR = 3;
        if (bo.isNullOrNil(localqf.vXm))
          break label580;
        bool2 = true;
        label427: ((com.tencent.mm.ah.h)localObject).cB(bool2);
        o.act().b((com.tencent.mm.ah.h)localObject);
      }
    }
    if (localu != null)
    {
      localObject = localu.aon(localqf.jBB);
      if (localObject != null)
      {
        localb.eoz = ((com.tencent.mm.j.a.a.b)localObject).eoz;
        if (!bo.isNullOrNil(localb.eoB))
          break label586;
      }
    }
    label580: label586: for (Object localObject = ((com.tencent.mm.j.a.a.b)localObject).eoB; ; localObject = localb.eoB)
    {
      localb.eoB = ((String)localObject);
      parama.eow.add(localb);
      if ((int)localad.ewQ == 0)
      {
        localad.setUsername(localqf.jBB);
        if (localqf.jCH != null)
          localad.iB(localqf.jCH);
        localad.NA();
        localbd.Z(localad);
        bool1 = true;
      }
      localArrayList.add(localad.field_username);
      break;
      bool2 = false;
      break label427;
    }
    label596: ab.i("MicroMsg.ChatroomMembersLogic", "summertt SyncAddChatroomMember listUsernames size: " + localArrayList.size() + " event: " + paramb + " publish: " + bool1 + " take[" + (System.currentTimeMillis() - l1) + "]ms");
    label689: long l2;
    if (bool1)
    {
      com.tencent.mm.roomsdk.a.b.alY(paramString1).D(paramString1, parama.cGj).dmX();
      localObject = ((c)g.K(c.class)).XV().oa(paramString1);
      paramb = (com.tencent.mm.sdk.b.b)localObject;
      if (localObject == null)
        paramb = new u();
      l2 = System.currentTimeMillis();
      paramb.field_chatroomname = paramString1;
      paramb.field_roomowner = paramString2;
      paramString2 = paramb.ep(localArrayList);
      paramString2.field_chatroomStatus = paramInt;
      paramString2.field_displayname = T(localArrayList);
      if (paramqe.vXj == 0)
        break label977;
      bool1 = true;
      label777: paramString2.a(paramString3, parama, bool1).field_memberCount = localArrayList.size();
      bool1 = a(paramb);
      l1 = System.currentTimeMillis();
      bool2 = paramb.drU();
      if (paramb.drR() != null)
        break label983;
      paramInt = 0;
      label824: if (paramb.drR() != null)
        break label995;
    }
    label977: label983: label995: for (int i = 0; ; i = paramb.drR().eoy)
    {
      ab.i("MicroMsg.ChatroomMembersLogic", "syncAddChatroomMember replaceChatroomMember ret : %s , during : %s %s oldVer:%s newVer:%s", new Object[] { Boolean.valueOf(bool1), Long.valueOf(l1 - l2), Boolean.valueOf(bool2), Integer.valueOf(paramInt), Integer.valueOf(i) });
      if (paramb.drU())
      {
        ab.i("MicroMsg.ChatroomMembersLogic", "syncAddChatroomMember OldVer:%d", new Object[] { Integer.valueOf(paramb.drT()) });
        paramString2 = new as();
        paramString2.ctO.username = paramString1;
        com.tencent.mm.sdk.b.a.xxA.m(paramString2);
      }
      AppMethodBeat.o(5523);
      break;
      if (localu != null)
        break label689;
      com.tencent.mm.roomsdk.a.b.alY(paramString1).D(paramString1, 0).dmX();
      break label689;
      bool1 = false;
      break label777;
      paramInt = paramb.drR().cGj;
      break label824;
    }
  }

  public static boolean a(String paramString1, ArrayList<String> paramArrayList, String paramString2)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(5532);
    ag localag = ((c)g.K(c.class)).XV();
    u localu = localag.ob(paramString1);
    if ((paramString1.endsWith("@chatroom")) || (paramString1.endsWith("@im.chatroom")));
    LinkedList localLinkedList;
    for (paramString1 = my(paramString1); ; paramString1 = new LinkedList())
    {
      localLinkedList = new LinkedList();
      if (paramString1 == null)
        break label226;
      for (int k = 0; ; k++)
      {
        i = j;
        if (k >= paramString1.size())
          break;
        localLinkedList.add(paramString1.get(k));
      }
    }
    while (i < paramArrayList.size())
    {
      if (!paramString1.contains(paramArrayList.get(i)))
        localLinkedList.add(paramArrayList.get(i));
      i++;
    }
    if (!bo.isNullOrNil(paramString2))
      localu.field_roomowner = paramString2;
    paramString1 = localu.ep(localLinkedList);
    paramString1.field_displayname = T(localLinkedList);
    paramString1.field_memberCount = localLinkedList.size();
    boolean bool = localag.a(localu);
    AppMethodBeat.o(5532);
    while (true)
    {
      return bool;
      label226: 
      while (i < paramArrayList.size())
      {
        localLinkedList.add(paramArrayList.get(i));
        i++;
      }
      if (!bo.isNullOrNil(paramString2))
        localu.field_roomowner = paramString2;
      paramString1 = localu.ep(localLinkedList);
      paramString1.field_displayname = T(localLinkedList);
      paramString1.field_memberCount = localLinkedList.size();
      localu.field_roomowner = paramString2;
      bool = localag.a(localu);
      ab.d("MicroMsg.ChatroomMembersLogic", "insertMembersByChatRoomName ".concat(String.valueOf(bool)));
      AppMethodBeat.o(5532);
    }
  }

  private static void aa(String paramString1, String paramString2)
  {
    AppMethodBeat.i(5527);
    ab.d("MicroMsg.ChatroomMembersLogic", "update contact chatroom type to %d", new Object[] { Integer.valueOf(1) });
    bd localbd = ((j)g.K(j.class)).XM();
    ad localad = localbd.aoO(paramString1);
    if (((int)localad.ewQ != 0) && (!bo.isNullOrNil(paramString2)) && (!bo.isNullOrNil(r.Yz())))
    {
      if (!paramString2.equals(r.Yz()))
        break label103;
      localad.ji(1);
    }
    while (true)
    {
      localbd.b(paramString1, localad);
      AppMethodBeat.o(5527);
      return;
      label103: localad.ji(0);
    }
  }

  public static String ab(String paramString1, String paramString2)
  {
    AppMethodBeat.i(5539);
    ag localag = ((c)g.K(c.class)).XV();
    if (localag == null)
    {
      ab.e("MicroMsg.ChatroomMembersLogic", "[getDisplayNameInRoom] null == mStg");
      AppMethodBeat.o(5539);
      paramString1 = null;
    }
    while (true)
    {
      return paramString1;
      paramString2 = localag.oa(paramString2);
      if (paramString2 == null)
      {
        AppMethodBeat.o(5539);
        paramString1 = null;
      }
      else
      {
        paramString1 = paramString2.mJ(paramString1);
        AppMethodBeat.o(5539);
      }
    }
  }

  public static String f(List<String> paramList, int paramInt)
  {
    AppMethodBeat.i(5519);
    Object localObject1;
    if ((paramList == null) || (paramList.size() == 0))
    {
      localObject1 = "";
      AppMethodBeat.o(5519);
    }
    int i;
    while (true)
    {
      return localObject1;
      localObject2 = "";
      i = 0;
      localObject1 = localObject2;
      if (i < paramList.size())
      {
        localObject1 = (String)paramList.get(i);
        if (((String)localObject1).length() <= 0)
          break label207;
        localObject1 = ((j)g.K(j.class)).XM().aoO((String)localObject1);
        localObject1 = (String)localObject2 + ((ad)localObject1).Oj();
        if ((i != paramInt - 1) || (i >= paramList.size()))
          break;
        localObject1 = (String)localObject1 + "...";
      }
      AppMethodBeat.o(5519);
    }
    Object localObject2 = localObject1;
    if (i < paramList.size() - 1)
      localObject2 = (String)localObject1 + ah.getContext().getString(2131298068);
    label207: 
    while (true)
    {
      i++;
      break;
    }
  }

  public static boolean f(String paramString, Map<String, String> paramMap)
  {
    AppMethodBeat.i(5515);
    u localu = ((c)g.K(c.class)).XV().oa(paramString);
    boolean bool;
    if (localu == null)
    {
      bool = false;
      AppMethodBeat.o(5515);
    }
    while (true)
    {
      return bool;
      paramString = localu.afg().iterator();
      while (paramString.hasNext())
      {
        String str = (String)paramString.next();
        paramMap.put(str, localu.mJ(str));
      }
      bool = true;
      AppMethodBeat.o(5515);
    }
  }

  public static int mA(String paramString)
  {
    AppMethodBeat.i(5536);
    long l = System.currentTimeMillis();
    try
    {
      ag localag = ((c)g.K(c.class)).XV();
      if (localag != null);
      for (int i = localag.oh(paramString); ; i = 0)
      {
        return i;
        ab.i("MicroMsg.ChatroomMembersLogic", "[getMembersCountByChatRoomName] cost:%s ", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        AppMethodBeat.o(5536);
      }
    }
    finally
    {
      ab.i("MicroMsg.ChatroomMembersLogic", "[getMembersCountByChatRoomName] cost:%s ", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      AppMethodBeat.o(5536);
    }
    throw paramString;
  }

  public static List<String> mB(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(5537);
    if (!mp(paramString))
    {
      ab.e("MicroMsg.ChatroomMembersLogic", "getOtherMembersByChatRoomName: room:[" + paramString + "]");
      AppMethodBeat.o(5537);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      paramString = my(paramString);
      if ((paramString == null) || (paramString.size() <= 0))
      {
        AppMethodBeat.o(5537);
        paramString = null;
      }
      else
      {
        String str = (String)g.RP().Ry().get(2, null);
        boolean bool;
        if ((str != null) && (str.length() > 0))
        {
          bool = true;
          label111: Assert.assertTrue(bool);
        }
        while (true)
        {
          if (i < paramString.size())
          {
            if (((String)paramString.get(i)).equals(str))
              paramString.remove(i);
          }
          else
          {
            if (paramString.size() > 0)
              break label181;
            AppMethodBeat.o(5537);
            paramString = null;
            break;
            bool = false;
            break label111;
          }
          i++;
        }
        label181: AppMethodBeat.o(5537);
      }
    }
  }

  public static String mC(String paramString)
  {
    AppMethodBeat.i(5540);
    paramString = ((c)g.K(c.class)).XV().oa(paramString);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(5540);
    }
    while (true)
    {
      return paramString;
      paramString = paramString.field_chatroomnotice;
      AppMethodBeat.o(5540);
    }
  }

  public static String mD(String paramString)
  {
    AppMethodBeat.i(5542);
    paramString = ((c)g.K(c.class)).XV().oa(paramString);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(5542);
    }
    while (true)
    {
      return paramString;
      paramString = paramString.field_chatroomnoticeEditor;
      AppMethodBeat.o(5542);
    }
  }

  public static long mE(String paramString)
  {
    AppMethodBeat.i(5543);
    paramString = ((c)g.K(c.class)).XV().oa(paramString);
    long l;
    if (paramString == null)
    {
      l = -1L;
      AppMethodBeat.o(5543);
    }
    while (true)
    {
      return l;
      l = paramString.field_chatroomnoticePublishTime;
      AppMethodBeat.o(5543);
    }
  }

  private static boolean mp(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(5513);
    if (paramString.toLowerCase().endsWith("@chatroom"))
      AppMethodBeat.o(5513);
    while (true)
    {
      return bool;
      if (paramString.toLowerCase().endsWith("@im.chatroom"))
      {
        AppMethodBeat.o(5513);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(5513);
      }
    }
  }

  public static boolean mq(String paramString)
  {
    AppMethodBeat.i(5514);
    paramString = ((c)g.K(c.class)).XV().oa(paramString);
    boolean bool;
    if (paramString == null)
    {
      bool = false;
      AppMethodBeat.o(5514);
    }
    while (true)
    {
      return bool;
      bool = paramString.drX();
      AppMethodBeat.o(5514);
    }
  }

  public static boolean mr(String paramString)
  {
    AppMethodBeat.i(5516);
    String str = ((c)g.K(c.class)).XV().oc(paramString);
    paramString = r.Yz();
    boolean bool;
    if ((!bo.isNullOrNil(str)) && (!bo.isNullOrNil(paramString)) && (str.equals(paramString)))
    {
      bool = true;
      AppMethodBeat.o(5516);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(5516);
    }
  }

  public static boolean ms(String paramString)
  {
    AppMethodBeat.i(5520);
    String str = (String)g.RP().Ry().get(2, null);
    paramString = my(paramString);
    boolean bool;
    if (paramString == null)
    {
      ab.d("MicroMsg.ChatroomMembersLogic", "getmembsersbychatroomname is null ");
      AppMethodBeat.o(5520);
      bool = false;
    }
    while (true)
    {
      return bool;
      if ((paramString.size() == 0) || (!paramString.contains(str)))
      {
        ab.d("MicroMsg.ChatroomMembersLogic", "getmembsersbychatroomname is list is zero or no contains user  " + paramString.size() + " ");
        AppMethodBeat.o(5520);
        bool = false;
      }
      else
      {
        bool = true;
        AppMethodBeat.o(5520);
      }
    }
  }

  public static boolean mt(String paramString)
  {
    AppMethodBeat.i(5521);
    boolean bool;
    if (!t.mN(paramString))
    {
      AppMethodBeat.o(5521);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (!((c)g.K(c.class)).XV().of(paramString))
      {
        ab.d("MicroMsg.ChatroomMembersLogic", "state is die");
        AppMethodBeat.o(5521);
        bool = true;
      }
      else
      {
        paramString = ((c)g.K(c.class)).XV().oe(paramString);
        if ((paramString == null) || (paramString.size() == 0))
        {
          AppMethodBeat.o(5521);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(5521);
          bool = false;
        }
      }
    }
  }

  public static boolean mu(String paramString)
  {
    AppMethodBeat.i(5522);
    boolean bool;
    if (!t.mN(paramString))
    {
      AppMethodBeat.o(5522);
      bool = false;
    }
    while (true)
    {
      return bool;
      ab.d("MicroMsg.ChatroomMembersLogic", "updateFailState chatRoomName %s", new Object[] { paramString });
      ag localag = ((c)g.K(c.class)).XV();
      paramString = localag.oa(paramString);
      if (paramString == null)
      {
        AppMethodBeat.o(5522);
        bool = false;
      }
      else
      {
        paramString.field_roomflag = 1;
        bool = localag.a(paramString);
        AppMethodBeat.o(5522);
      }
    }
  }

  public static boolean mv(String paramString)
  {
    AppMethodBeat.i(5530);
    boolean bool;
    if (!paramString.toLowerCase().endsWith("@groupcard"))
    {
      ab.e("MicroMsg.ChatroomMembersLogic", "deleteWholeGroupcard: room:[" + paramString + "]");
      bool = false;
      AppMethodBeat.o(5530);
      return bool;
    }
    bd localbd = ((j)g.K(j.class)).XM();
    if (localbd.aoQ(paramString))
      localbd.aoU(paramString);
    while (true)
    {
      bool = mx(paramString);
      AppMethodBeat.o(5530);
      break;
      ab.e("MicroMsg.ChatroomMembersLogic", "deleteWholeGroupcard RoomName not exist:[" + paramString + "]");
    }
  }

  public static boolean mw(String paramString)
  {
    AppMethodBeat.i(5531);
    boolean bool;
    if (!mp(paramString))
    {
      ab.e("MicroMsg.ChatroomMembersLogic", "deleteWholeChatroom: room:[" + paramString + "]");
      bool = false;
      AppMethodBeat.o(5531);
      return bool;
    }
    bd localbd = ((j)g.K(j.class)).XM();
    if (localbd.aoQ(paramString))
      localbd.aoU(paramString);
    while (true)
    {
      bool = mx(paramString);
      AppMethodBeat.o(5531);
      break;
      ab.e("MicroMsg.ChatroomMembersLogic", "deleteWholeChatroom RoomName not exist:[" + paramString + "]");
    }
  }

  private static boolean mx(String paramString)
  {
    AppMethodBeat.i(5533);
    boolean bool = ((c)g.K(c.class)).XV().og(paramString);
    AppMethodBeat.o(5533);
    return bool;
  }

  public static List<String> my(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(5534);
    if (paramString == null)
    {
      ab.e("MicroMsg.ChatroomMembersLogic", "chatroomName is null");
      AppMethodBeat.o(5534);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      if (!mp(paramString))
      {
        ab.e("MicroMsg.ChatroomMembersLogic", "getMembersByChatRoomName: this is not room:[" + paramString + "]");
        AppMethodBeat.o(5534);
        paramString = localObject;
      }
      else
      {
        paramString = ((c)g.K(c.class)).XV().oe(paramString);
        AppMethodBeat.o(5534);
      }
    }
  }

  public static List<String> mz(String paramString)
  {
    AppMethodBeat.i(5535);
    if (!paramString.toLowerCase().endsWith("@chatroom"))
    {
      ab.e("MicroMsg.ChatroomMembersLogic", "getMembersByChatRoomName: room:[" + paramString + "]");
      paramString = null;
      AppMethodBeat.o(5535);
    }
    while (true)
    {
      return paramString;
      paramString = ((c)g.K(c.class)).XV().oe(paramString);
      AppMethodBeat.o(5535);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.n
 * JD-Core Version:    0.6.2
 */