package com.tencent.mm.plugin.backup.h;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.at;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.ag;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.j;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.bi;
import com.tencent.mm.vfs.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public final class c
{
  public static s Fm(String paramString)
  {
    AppMethodBeat.i(17704);
    if (bo.isNullOrNil(paramString))
    {
      paramString = null;
      AppMethodBeat.o(17704);
    }
    while (true)
    {
      return paramString;
      paramString = d.aUr().aUs().all().uf(paramString);
      AppMethodBeat.o(17704);
    }
  }

  public static String Fn(String paramString)
  {
    AppMethodBeat.i(17705);
    String str = j.b(d.aUr().aUs().XY(), "msg_", paramString, ".amr", 2);
    if (bo.isNullOrNil(str))
    {
      paramString = null;
      AppMethodBeat.o(17705);
    }
    while (true)
    {
      return paramString;
      if (!new com.tencent.mm.vfs.b(str).exists())
        break;
      AppMethodBeat.o(17705);
      paramString = str;
    }
    paramString = d.aUr().aUs().amg() + paramString;
    if (new com.tencent.mm.vfs.b(paramString + ".amr").exists())
      e.aQ(paramString + ".amr", str);
    while (true)
    {
      AppMethodBeat.o(17705);
      paramString = str;
      break;
      if (new com.tencent.mm.vfs.b(paramString).exists())
        e.aQ(paramString, str);
    }
  }

  public static void k(HashMap<String, Integer> paramHashMap)
  {
    AppMethodBeat.i(17700);
    ab.i("MicroMsg.BackupStorageLogic", "buildConversation, unReadSum size[%d]", new Object[] { Integer.valueOf(paramHashMap.size()) });
    Iterator localIterator = paramHashMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str1 = (String)localIterator.next();
      bi localbi = d.aUr().aUs().XO().fa(str1, " and not ( type = 10000 and isSend != 2 ) ");
      int i;
      String str2;
      ak localak;
      if (localbi != null)
      {
        i = ((Integer)paramHashMap.get(str1)).intValue();
        str2 = localbi.field_talker;
        ab.i("MicroMsg.BackupStorageLogic", "updateConvFromLastMsg, talker:%s, addUnreadCount:%d", new Object[] { str2, Integer.valueOf(i) });
        localak = d.aUr().aUs().XR().aoZ(str2);
        if ((localak == null) || (localak.field_conversationTime <= localbi.field_createTime) || (localak.field_conversationTime == 9223372036854775807L))
          break label208;
        ab.e("MicroMsg.BackupStorageLogic", "updateConvFromLastMsg ignore(maybe the system time is bigger than normal)");
      }
      Object localObject;
      while (true)
      {
        localObject = d.aUr().aUs();
        if (((b)localObject).uin != 0)
          break;
        paramHashMap = new com.tencent.mm.model.b();
        AppMethodBeat.o(17700);
        throw paramHashMap;
        label208: boolean bool = false;
        localObject = localak;
        if (localak == null)
        {
          localObject = new ak(str2);
          bool = true;
        }
        ((ak)localObject).hO(localbi.field_isSend);
        ((ak)localObject).hM(i + ((at)localObject).field_unReadCount);
        ((ak)localObject).ap(localbi);
        ((ak)localObject).jg(Integer.toString(localbi.getType()));
        long l = ((at)localObject).field_flag;
        ((ak)localObject).eE(localbi.field_createTime & 0xFFFFFFFF | l & 0x0);
        ((ak)localObject).hL(0);
        ab.i("MicroMsg.BackupStorageLogic", "updateConvFromLastMsg, isNewConv[%b], talker[%s], flag[%d]", new Object[] { Boolean.valueOf(bool), str2, Long.valueOf(((at)localObject).field_flag) });
        if (bool)
          d.aUr().aUs().XR().d((ak)localObject);
        else
          d.aUr().aUs().XR().a((ak)localObject, str2);
      }
      ((b)localObject).jyy.O(str1, 0L);
    }
    d.aUr().aUs().XR().dsL();
    AppMethodBeat.o(17700);
  }

  public static boolean kH(String paramString)
  {
    AppMethodBeat.i(17701);
    boolean bool;
    if ((paramString == null) || (paramString.length() <= 0))
    {
      bool = false;
      AppMethodBeat.o(17701);
    }
    while (true)
    {
      return bool;
      bool = com.tencent.mm.model.t.mN(paramString);
      AppMethodBeat.o(17701);
    }
  }

  public static long l(bi parambi)
  {
    AppMethodBeat.i(17702);
    ad localad = d.aUr().aUs().XM().aoO(parambi.field_talker);
    if ((localad == null) || ((int)localad.ewQ == 0))
    {
      if (bo.isNullOrNil(parambi.field_talker))
        break label147;
      d.aUr().aUt().g(2, parambi.field_talker);
      d.aUr().aUs().XM().Z(new ad(parambi.field_talker));
    }
    while (true)
    {
      long l = d.aUr().aUs().XO().Z(parambi);
      if (l < 0L)
        ab.e("MicroMsg.BackupStorageLogic", "insertMsgWithContact faile: type:%d, talker:%s", new Object[] { Integer.valueOf(parambi.getType()), parambi.field_talker });
      AppMethodBeat.o(17702);
      return l;
      label147: if ((parambi.field_talker.endsWith("@chatroom")) && (d.aUr().aUs().XV().oe(parambi.field_talker) == null))
        d.aUr().aUt().g(2, parambi.field_talker);
    }
  }

  public static int ox(String paramString)
  {
    int i = -1;
    AppMethodBeat.i(17703);
    if (paramString == null)
      AppMethodBeat.o(17703);
    while (true)
    {
      return i;
      if (paramString.length() <= 0)
      {
        AppMethodBeat.o(17703);
      }
      else
      {
        int j = paramString.indexOf(':');
        if ((j != -1) && (paramString.substring(0, j).contains("<")))
        {
          AppMethodBeat.o(17703);
        }
        else
        {
          AppMethodBeat.o(17703);
          i = j;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.h.c
 * JD-Core Version:    0.6.2
 */