package com.tencent.mm.aj.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.z;
import com.tencent.mm.api.a;
import com.tencent.mm.api.i;
import com.tencent.mm.g.c.at;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.protocal.protobuf.acr;
import com.tencent.mm.protocal.protobuf.kf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.be;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class e
{
  public static String dqJ;
  public static final Object fxC;

  static
  {
    AppMethodBeat.i(11555);
    dqJ = null;
    fxC = new Object();
    AppMethodBeat.o(11555);
  }

  public static void G(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(11548);
    if (bo.isNullOrNil(paramString))
    {
      ab.d("MicroMsg.BizChatInfoStorageLogic", "delEnterpriseChatConvAndHeadImg, empty brandUserName");
      AppMethodBeat.o(11548);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.BizChatInfoStorageLogic", "deleteMsgByTalkers");
      com.tencent.mm.kernel.g.RS().aa(new e.1(paramString, paramBoolean));
      AppMethodBeat.o(11548);
    }
  }

  public static c a(c paramc, long paramLong)
  {
    AppMethodBeat.i(11539);
    if (paramc == null);
    for (long l = -1L; ; l = paramc.field_bizChatLocalId)
    {
      ab.w("MicroMsg.BizChatInfoStorageLogic", "protectBizChatNotExist bizChatId:%s BizChatInfo:%s ", new Object[] { Long.valueOf(paramLong), Long.valueOf(l) });
      c localc = paramc;
      if (paramc == null)
      {
        paramc = new c();
        paramc.field_bizChatLocalId = paramLong;
        z.aeT().b(paramc);
        localc = z.aeT().aK(paramLong);
      }
      AppMethodBeat.o(11539);
      return localc;
    }
  }

  public static j a(j paramj, String paramString)
  {
    AppMethodBeat.i(11540);
    Object localObject;
    if (paramj == null)
    {
      localObject = Integer.valueOf(-1);
      ab.w("MicroMsg.BizChatInfoStorageLogic", "protectBizChatNotExist userId:%s BizChatUserInfo:%s ", new Object[] { paramString, localObject });
      localObject = paramj;
      if (paramj != null)
        break label98;
      paramj = new j();
      paramj.field_userId = paramString;
      z.aeV().b(paramj);
      paramString = z.aeV().cH(paramString);
      localObject = paramString;
      if (paramString != null)
        break label98;
      ab.e("MicroMsg.BizChatInfoStorageLogic", "protectContactNotExist contact get from db is null!");
      AppMethodBeat.o(11540);
    }
    while (true)
    {
      return paramj;
      localObject = paramj.field_userId;
      break;
      label98: AppMethodBeat.o(11540);
      paramj = (j)localObject;
    }
  }

  public static boolean a(c paramc, String paramString1, String paramString2, acr paramacr)
  {
    boolean bool = true;
    AppMethodBeat.i(11552);
    if ((paramString1 != null) && (!bo.isNullOrNil(paramc.field_brandUserName)));
    while (true)
    {
      try
      {
        JSONArray localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>(paramString1);
        if ((localJSONArray.length() == 1) && (bo.isNullOrNil(paramString2)))
        {
          paramString2 = localJSONArray.getJSONObject(0);
          paramacr = paramString2.getString("id");
          paramString1 = z.aeV().cH(paramacr);
          if (paramString1 != null)
            break label561;
          paramString1 = new com/tencent/mm/aj/a/j;
          paramString1.<init>();
          i = 1;
          paramString1.field_userId = paramacr;
          paramString1.field_userName = paramString2.getString("nick_name");
          paramString1.field_headImageUrl = paramString2.getString("head_img_url");
          paramString1.field_profileUrl = paramString2.getString("profile_url");
          paramString1.field_UserVersion = paramString2.getInt("ver");
          if ((paramString1.field_brandUserName == null) || (paramString1.field_brandUserName.length() == 0))
          {
            paramString1.field_brandUserName = paramc.field_brandUserName;
            i = 1;
          }
          if ((paramString1.field_addMemberUrl == null) || (paramString1.field_addMemberUrl.length() == 0))
          {
            paramString1.field_addMemberUrl = paramc.field_addMemberUrl;
            i = 1;
          }
          if (!z.aeV().b(paramString1))
            z.aeV().a(paramString1);
          if (i != 0)
            z.aeZ().aG(paramString1.field_userId, paramString1.field_brandUserName);
          paramString2 = new com/tencent/mm/aj/a/c;
          paramString2.<init>();
          paramString2.field_bizChatServId = paramString1.field_userId;
          paramString2.field_brandUserName = paramString1.field_brandUserName;
          paramString2.field_chatName = paramString1.field_userName;
          paramString2.field_chatType = 1;
          paramString2 = e(paramString2);
          if (paramString2 != null)
          {
            paramc.field_bizChatLocalId = paramString2.field_bizChatLocalId;
            paramc.field_chatName = paramString1.field_userName;
            AppMethodBeat.o(11552);
            return bool;
          }
          AppMethodBeat.o(11552);
          bool = false;
          continue;
        }
        paramString1 = new java/util/LinkedList;
        paramString1.<init>();
        Object localObject;
        if (!bo.isNullOrNil(paramString2))
        {
          localObject = new com/tencent/mm/protocal/protobuf/kf;
          ((kf)localObject).<init>();
          ((kf)localObject).vNc = paramString2;
          paramString1.add(localObject);
        }
        i = 0;
        if (i < localJSONArray.length())
        {
          paramString2 = new com/tencent/mm/aj/a/j;
          paramString2.<init>();
          localObject = localJSONArray.getJSONObject(i);
          paramString2.field_userId = ((JSONObject)localObject).getString("id");
          paramString2.field_userName = ((JSONObject)localObject).getString("nick_name");
          paramString2.field_brandUserName = paramc.field_brandUserName;
          paramString2.field_headImageUrl = ((JSONObject)localObject).getString("head_img_url");
          paramString2.field_profileUrl = ((JSONObject)localObject).getString("profile_url");
          paramString2.field_UserVersion = ((JSONObject)localObject).getInt("ver");
          paramString2.field_addMemberUrl = paramc.field_addMemberUrl;
          if (!z.aeV().b(paramString2))
            z.aeV().a(paramString2);
          localObject = new com/tencent/mm/protocal/protobuf/kf;
          ((kf)localObject).<init>();
          ((kf)localObject).vNc = paramString2.field_userId;
          paramString1.add(localObject);
          i++;
          continue;
        }
        paramacr.vNd = paramString1;
        paramc.field_bizChatLocalId = -1L;
        AppMethodBeat.o(11552);
        continue;
      }
      catch (JSONException paramc)
      {
        ab.i("MicroMsg.BizChatInfoStorageLogic", "parse memberJson Exception:%s", new Object[] { paramc.getMessage() });
        ab.printErrStackTrace("MicroMsg.BizChatInfoStorageLogic", paramc, "", new Object[0]);
      }
      AppMethodBeat.o(11552);
      bool = false;
      continue;
      label561: int i = 0;
    }
  }

  public static String aae()
  {
    synchronized (fxC)
    {
      String str = dqJ;
      return str;
    }
  }

  public static boolean c(c paramc)
  {
    AppMethodBeat.i(11534);
    boolean bool;
    if (paramc == null)
    {
      AppMethodBeat.o(11534);
      bool = false;
    }
    while (true)
    {
      return bool;
      List localList = paramc.afg();
      paramc = ((i)com.tencent.mm.kernel.g.K(i.class)).cI(paramc.field_brandUserName);
      if (paramc == null)
      {
        ab.w("MicroMsg.BaseBizChatInfo", "bizchat myUserId is null");
        AppMethodBeat.o(11534);
        bool = false;
      }
      else
      {
        Iterator localIterator = localList.iterator();
        while (true)
          if (localIterator.hasNext())
            if (paramc.equals((String)localIterator.next()))
            {
              AppMethodBeat.o(11534);
              bool = true;
              break;
            }
        ab.w("MicroMsg.BaseBizChatInfo", "bizchat not in chatroom myUserId is %s", new Object[] { paramc });
        ab.w("MicroMsg.BaseBizChatInfo", "bizchat not in chatroom memberlist is %s", new Object[] { Arrays.toString(localList.toArray()) });
        AppMethodBeat.o(11534);
        bool = false;
      }
    }
  }

  public static String cC(String paramString)
  {
    AppMethodBeat.i(11550);
    paramString = a.cC(paramString);
    AppMethodBeat.o(11550);
    return paramString;
  }

  public static String d(c paramc)
  {
    ??? = null;
    AppMethodBeat.i(11543);
    if (paramc == null)
    {
      ab.w("MicroMsg.BizChatInfoStorageLogic", "getMsgSource bizChatInfo=%s");
      AppMethodBeat.o(11543);
      paramc = ???;
    }
    while (true)
    {
      return paramc;
      ab.d("MicroMsg.BizChatInfoStorageLogic", "format msgSource");
      if (paramc.field_bizChatServId == null)
      {
        ab.d("MicroMsg.BizChatInfoStorageLogic", "getMsgSource field_bizChatId=%s", new Object[] { paramc.field_bizChatServId });
        AppMethodBeat.o(11543);
        paramc = ???;
        continue;
      }
      j localj = rv(paramc.field_brandUserName);
      if ((localj == null) || (localj.field_userId == null))
      {
        ab.d("MicroMsg.BizChatInfoStorageLogic", " bizChatMyUserInfo.field_userId is null getMsgSource field_bizChatId=%s", new Object[] { paramc.field_bizChatServId });
        AppMethodBeat.o(11543);
        paramc = ???;
        continue;
      }
      synchronized (fxC)
      {
        dqJ = String.format("<msgsource><enterprise_info><qy_msg_type>%d</qy_msg_type><bizchat_id>%s</bizchat_id><bizchat_ver>%d</bizchat_ver><user_id>%s</user_id></enterprise_info></msgsource>", new Object[] { Integer.valueOf(1), paramc.field_bizChatServId, Integer.valueOf(paramc.field_chatVersion), localj.field_userId });
        ab.d("MicroMsg.BizChatInfoStorageLogic", "send msgSource:%s", new Object[] { dqJ });
        paramc = dqJ;
        AppMethodBeat.o(11543);
      }
    }
  }

  public static c e(c paramc)
  {
    AppMethodBeat.i(11544);
    Object localObject;
    if (paramc.field_bizChatServId == null)
    {
      localObject = null;
      AppMethodBeat.o(11544);
      return localObject;
    }
    c localc = z.aeT().rq(paramc.field_bizChatServId);
    if (localc != null)
    {
      if ((paramc.field_chatVersion <= localc.field_chatVersion) && (!bo.isNullOrNil(localc.field_brandUserName)))
        break label162;
      if (!bo.isNullOrNil(paramc.field_chatName))
        localc.field_chatName = paramc.field_chatName;
      localc.field_brandUserName = paramc.field_brandUserName;
      localc.field_needToUpdate = true;
      localc.field_chatType = paramc.field_chatType;
      z.aeT().b(localc);
      localObject = localc;
      label108: if (((c)localObject).afh())
      {
        if (!((c)localObject).isGroup())
          break label167;
        z.aeZ().aD(((c)localObject).field_bizChatServId, ((c)localObject).field_brandUserName);
      }
    }
    while (true)
    {
      AppMethodBeat.o(11544);
      break;
      paramc.field_needToUpdate = true;
      localObject = paramc;
      if (z.aeT().a(paramc))
        break label108;
      label162: localObject = localc;
      break label108;
      label167: z.aeZ().aF(((c)localObject).field_bizChatServId, ((c)localObject).field_brandUserName);
    }
  }

  public static boolean f(c paramc)
  {
    AppMethodBeat.i(11545);
    ab.d("MicroMsg.BizChatInfoStorageLogic", "updateBizChatMember");
    boolean bool;
    if (paramc == null)
    {
      ab.w("MicroMsg.BizChatInfoStorageLogic", "updateBizChatMember: bizChatInfo == null");
      AppMethodBeat.o(11545);
      bool = false;
    }
    while (true)
    {
      return bool;
      Object localObject = paramc.afg();
      if (localObject == null)
      {
        ab.w("MicroMsg.BizChatInfoStorageLogic", "updateBizChatMember: list == null");
        AppMethodBeat.o(11545);
        bool = false;
      }
      else
      {
        LinkedList localLinkedList = new LinkedList();
        Iterator localIterator = ((List)localObject).iterator();
        while (localIterator.hasNext())
        {
          localObject = (String)localIterator.next();
          j localj = z.aeV().cH((String)localObject);
          if ((localj != null) && (localj.afh()))
            localLinkedList.add(localObject);
        }
        if (localLinkedList.size() > 0)
        {
          z.aeZ().b(localLinkedList, paramc.field_brandUserName);
          bool = true;
          AppMethodBeat.o(11545);
        }
        else
        {
          ab.w("MicroMsg.BizChatInfoStorageLogic", "updateBizChatMember: no need to update");
          AppMethodBeat.o(11545);
          bool = false;
        }
      }
    }
  }

  public static int fB(long paramLong)
  {
    AppMethodBeat.i(11535);
    List localList = fC(paramLong);
    int i;
    if (localList != null)
    {
      i = localList.size();
      AppMethodBeat.o(11535);
    }
    while (true)
    {
      return i;
      ab.w("MicroMsg.BizChatInfoStorageLogic", "getMembersCountByBizChatId list == null");
      i = 0;
      AppMethodBeat.o(11535);
    }
  }

  public static List<String> fC(long paramLong)
  {
    AppMethodBeat.i(11536);
    List localList = z.aeT().aK(paramLong).afg();
    AppMethodBeat.o(11536);
    return localList;
  }

  public static String fD(long paramLong)
  {
    AppMethodBeat.i(11546);
    String str = z.aeT().aK(paramLong).field_bizChatServId;
    AppMethodBeat.o(11546);
    return str;
  }

  public static void g(c paramc)
  {
    AppMethodBeat.i(11553);
    if (paramc == null)
    {
      ab.w("MicroMsg.BizChatInfoStorageLogic", "bizChatInfo is null");
      AppMethodBeat.o(11553);
    }
    while (true)
    {
      return;
      boolean bool1 = z.aeU().fy(paramc.field_bizChatLocalId);
      boolean bool2 = paramc.lc(16);
      ab.d("MicroMsg.BizChatInfoStorageLogic", "convPlaceTop: %s ,bizChatPlaceTop: %s, chatName: %s ", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), paramc.field_chatName });
      if ((bool2) && (!bool1))
      {
        z.aeU().fz(paramc.field_bizChatLocalId);
        AppMethodBeat.o(11553);
      }
      else
      {
        if ((!bool2) && (bool1))
          z.aeU().fA(paramc.field_bizChatLocalId);
        AppMethodBeat.o(11553);
      }
    }
  }

  public static void h(c paramc)
  {
    AppMethodBeat.i(11554);
    if (paramc == null)
    {
      ab.w("MicroMsg.BizChatInfoStorageLogic", "updateBrandUserConvName bizChatInfo is null");
      AppMethodBeat.o(11554);
    }
    while (true)
    {
      return;
      ak localak = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XR().aoZ(paramc.field_brandUserName);
      if (localak == null)
      {
        ab.w("MicroMsg.BizChatInfoStorageLogic", "updateBrandUserConvName cvs is null");
        AppMethodBeat.o(11554);
      }
      else
      {
        Object localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().Rb(paramc.field_brandUserName);
        Object localObject2 = ((com.tencent.mm.aj.o)com.tencent.mm.kernel.g.K(com.tencent.mm.aj.o.class)).XP().aM(paramc.field_brandUserName, paramc.field_bizChatLocalId);
        if ((localObject1 != null) && (localObject2 != null) && (((cy)localObject1).field_msgId == ((cy)localObject2).field_msgId))
        {
          localObject2 = localak.field_digest;
          if (localObject2 != null)
          {
            int i = ((String)localObject2).indexOf(":");
            if (i != -1)
            {
              localObject1 = ((String)localObject2).substring(0, i);
              localObject2 = ((String)localObject2).substring(i + 1);
              if ((localObject1 != null) && (!((String)localObject1).equals(paramc.field_chatName)))
              {
                localak.jh(paramc.field_chatName + ":" + (String)localObject2);
                ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XR().a(localak, localak.field_username);
              }
            }
          }
        }
        AppMethodBeat.o(11554);
      }
    }
  }

  public static void p(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(11549);
    ab.i("MicroMsg.BizChatInfoStorageLogic", "qy_chat_update %s, %s, %s", new Object[] { paramString1, paramString2, paramString3 });
    com.tencent.mm.kernel.g.RS().aa(new e.2(paramString2, paramString3, paramString1));
    AppMethodBeat.o(11549);
  }

  public static boolean rr(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(11532);
    if (paramString == null)
      AppMethodBeat.o(11532);
    while (true)
    {
      return bool;
      if ((paramString.endsWith("@qy_u")) || (paramString.endsWith("@qy_g")))
      {
        bool = true;
        AppMethodBeat.o(11532);
      }
      else
      {
        AppMethodBeat.o(11532);
      }
    }
  }

  public static boolean rs(String paramString)
  {
    AppMethodBeat.i(11533);
    boolean bool;
    if (paramString == null)
    {
      ab.i("MicroMsg.BizChatInfoStorageLogic", "isGroupChat chatId == null");
      bool = false;
      AppMethodBeat.o(11533);
    }
    while (true)
    {
      return bool;
      bool = paramString.endsWith("@qy_g");
      AppMethodBeat.o(11533);
    }
  }

  public static String rt(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(11537);
    if (paramString == null)
    {
      ab.w("MicroMsg.BizChatInfoStorageLogic", "getUserName bizChatId == null");
      AppMethodBeat.o(11537);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      paramString = z.aeV().cH(paramString);
      if (paramString != null)
      {
        paramString = paramString.field_userName;
        AppMethodBeat.o(11537);
      }
      else
      {
        ab.i("MicroMsg.BizChatInfoStorageLogic", "getUserName userInfo == null");
        AppMethodBeat.o(11537);
        paramString = localObject;
      }
    }
  }

  public static String ru(String paramString)
  {
    AppMethodBeat.i(11538);
    paramString = z.aeV().cH(paramString);
    if (paramString != null)
    {
      paramString = paramString.field_headImageUrl;
      AppMethodBeat.o(11538);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(11538);
    }
  }

  public static j rv(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(11541);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.BizChatInfoStorageLogic", "getBizChatMyUserInfo brandUserName==null");
      AppMethodBeat.o(11541);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      paramString = z.aeW().rA(paramString);
      if (paramString == null)
      {
        ab.w("MicroMsg.BizChatInfoStorageLogic", "getBizChatMyUserInfo bizChatMyUserInfo==null");
        AppMethodBeat.o(11541);
        paramString = localObject;
      }
      else
      {
        paramString = z.aeV().cH(paramString.field_userId);
        if (paramString == null)
          ab.w("MicroMsg.BizChatInfoStorageLogic", "getBizChatMyUserInfo bizChatUserInfo==null");
        AppMethodBeat.o(11541);
      }
    }
  }

  public static String rw(String paramString)
  {
    String str = null;
    AppMethodBeat.i(11542);
    if (paramString == null)
    {
      ab.w("MicroMsg.BizChatInfoStorageLogic", "getFormatMsgSource msgSource==null");
      AppMethodBeat.o(11542);
      paramString = str;
    }
    while (true)
    {
      return paramString;
      int i = paramString.indexOf("<enterprise_info>") + 17;
      int j = paramString.indexOf("</enterprise_info>");
      if ((i == -1) || (j == -1) || (i >= j))
      {
        ab.w("MicroMsg.BizChatInfoStorageLogic", "getFormatMsgSource error start:%s,end:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
        AppMethodBeat.o(11542);
        paramString = str;
      }
      else
      {
        str = paramString.substring(i, j);
        paramString = paramString.replace(str, str.replace("<", "&lt;").replace(">", "&gt;"));
        AppMethodBeat.o(11542);
      }
    }
  }

  public static void rx(String paramString)
  {
    synchronized (fxC)
    {
      dqJ = paramString;
      return;
    }
  }

  public static long ry(String paramString)
  {
    long l = -1L;
    AppMethodBeat.i(11547);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.BizChatInfoStorageLogic", "chatId == null");
      AppMethodBeat.o(11547);
    }
    while (true)
    {
      return l;
      paramString = z.aeT().rq(paramString);
      if (paramString != null)
      {
        l = paramString.field_bizChatLocalId;
        AppMethodBeat.o(11547);
      }
      else
      {
        ab.w("MicroMsg.BizChatInfoStorageLogic", "bizChatInfo == null");
        AppMethodBeat.o(11547);
      }
    }
  }

  public static String rz(String paramString)
  {
    AppMethodBeat.i(11551);
    String str = paramString;
    if (bo.isNullOrNil(paramString))
      str = "tempUser";
    paramString = new StringBuilder(com.tencent.mm.plugin.i.c.XX());
    paramString.append(com.tencent.mm.a.g.x(str.getBytes())).append("/");
    paramString.append("user/");
    paramString = paramString.toString();
    AppMethodBeat.o(11551);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.a.e
 * JD-Core Version:    0.6.2
 */