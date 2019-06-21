package com.tencent.mm.plugin.backup.bakoldlogic.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.at;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.ag;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.t;
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

public final class d
{
  public static s Fm(String paramString)
  {
    AppMethodBeat.i(18042);
    if (bo.isNullOrNil(paramString))
    {
      paramString = null;
      AppMethodBeat.o(18042);
    }
    while (true)
    {
      return paramString;
      paramString = b.aUY().aUZ().all().uf(paramString);
      AppMethodBeat.o(18042);
    }
  }

  public static String Fn(String paramString)
  {
    AppMethodBeat.i(18043);
    String str = j.b(b.aUY().aUZ().XY(), "msg_", paramString, ".amr", 2);
    if (bo.isNullOrNil(str))
    {
      paramString = null;
      AppMethodBeat.o(18043);
    }
    while (true)
    {
      return paramString;
      if (!new com.tencent.mm.vfs.b(str).exists())
        break;
      AppMethodBeat.o(18043);
      paramString = str;
    }
    paramString = b.aUY().aUZ().amg() + paramString;
    if (new com.tencent.mm.vfs.b(paramString + ".amr").exists())
      e.aQ(paramString + ".amr", str);
    while (true)
    {
      AppMethodBeat.o(18043);
      paramString = str;
      break;
      if (new com.tencent.mm.vfs.b(paramString).exists())
        e.aQ(paramString, str);
    }
  }

  public static void k(HashMap<String, Integer> paramHashMap)
  {
    AppMethodBeat.i(18038);
    Iterator localIterator = paramHashMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (String)localIterator.next();
      bi localbi = b.aUY().aUZ().XO().fa((String)localObject, " and not ( type = 10000 and isSend != 2 ) ");
      if (localbi != null)
      {
        int i = ((Integer)paramHashMap.get(localObject)).intValue();
        String str = localbi.field_talker;
        ab.i("MicroMsg.BakOldTempStorageLogic", "talker:%s, addUnreadCount:%d", new Object[] { str, Integer.valueOf(i) });
        int j = 0;
        ak localak = b.aUY().aUZ().XR().aoZ(str);
        if ((localak != null) && (localak.field_conversationTime > localbi.field_createTime) && (localak.field_conversationTime != 9223372036854775807L))
        {
          ab.i("MicroMsg.BakOldTempStorageLogic", "updateConvFromLastMsg ignore(maybe the system time is bigger than normal)");
        }
        else
        {
          localObject = localak;
          if (localak == null)
          {
            ab.i("MicroMsg.BakOldTempStorageLogic", "updateConvFromLastMsg conversation is null.");
            ab.d("MicroMsg.BakOldTempStorageLogic", "updateConvFromLastMsg cvs:%s", new Object[] { str });
            localObject = new ak(str);
            j = 1;
          }
          ((ak)localObject).hO(localbi.field_isSend);
          ((ak)localObject).hM(i + ((at)localObject).field_unReadCount);
          ((ak)localObject).ap(localbi);
          ((ak)localObject).jg(Integer.toString(localbi.getType()));
          ((ak)localObject).eE(((at)localObject).field_flag & 0x0 | localbi.field_createTime & 0xFFFFFFFF);
          ((ak)localObject).hL(0);
          if (j != 0)
          {
            ab.d("MicroMsg.BakOldTempStorageLogic", "updateConvFromLastMsg cvs:%s, cvs.flag:%d", new Object[] { str, Long.valueOf(((at)localObject).field_flag) });
            b.aUY().aUZ().XR().d((ak)localObject);
          }
          else
          {
            b.aUY().aUZ().XR().a((ak)localObject, str);
          }
        }
      }
    }
    b.aUY().aUZ().XR().dsL();
    AppMethodBeat.o(18038);
  }

  public static boolean kH(String paramString)
  {
    AppMethodBeat.i(18039);
    boolean bool;
    if ((paramString == null) || (paramString.length() <= 0))
    {
      bool = false;
      AppMethodBeat.o(18039);
    }
    while (true)
    {
      return bool;
      bool = paramString.endsWith("@chatroom");
      AppMethodBeat.o(18039);
    }
  }

  public static long l(bi parambi)
  {
    AppMethodBeat.i(18040);
    ad localad = b.aUY().aUZ().XM().aoO(parambi.field_talker);
    if ((localad == null) || ((int)localad.ewQ == 0))
    {
      if (bo.isNullOrNil(parambi.field_talker))
        break label147;
      b.aUY().aVa().g(2, parambi.field_talker);
      b.aUY().aUZ().XM().Z(new ad(parambi.field_talker));
    }
    while (true)
    {
      long l = b.aUY().aUZ().XO().Z(parambi);
      if (l < 0L)
        ab.e("MicroMsg.BakOldTempStorageLogic", "insertMsgWithContact faile: type:%d, talker:%s", new Object[] { Integer.valueOf(parambi.getType()), parambi.field_talker });
      AppMethodBeat.o(18040);
      return l;
      label147: if ((parambi.field_talker.endsWith("@chatroom")) && (b.aUY().aUZ().XV().oe(parambi.field_talker) == null))
        b.aUY().aVa().g(2, parambi.field_talker);
    }
  }

  public static int ox(String paramString)
  {
    int i = -1;
    AppMethodBeat.i(18041);
    int j;
    if (paramString == null)
    {
      AppMethodBeat.o(18041);
      j = i;
    }
    while (true)
    {
      return j;
      if (paramString.length() <= 0)
      {
        AppMethodBeat.o(18041);
        j = i;
      }
      else
      {
        j = paramString.indexOf(':');
        if ((j != -1) && (paramString.substring(0, j).contains("<")))
        {
          AppMethodBeat.o(18041);
          j = i;
        }
        else
        {
          AppMethodBeat.o(18041);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.d.d
 * JD-Core Version:    0.6.2
 */