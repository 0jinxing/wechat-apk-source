package com.tencent.mm.model;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.at;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.c;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.bi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class m
{
  public static List<Boolean> S(List<String> paramList)
  {
    AppMethodBeat.i(5508);
    if (paramList == null)
    {
      paramList = null;
      AppMethodBeat.o(5508);
      return paramList;
    }
    ArrayList localArrayList = new ArrayList(paramList.size());
    paramList = paramList.iterator();
    String str;
    boolean bool1;
    label69: long l2;
    long l3;
    while (paramList.hasNext())
    {
      str = (String)paramList.next();
      if (!t.kH(str))
      {
        bool1 = false;
        localArrayList.add(Boolean.valueOf(bool1));
      }
      else
      {
        bool1 = false;
        boolean bool2 = false;
        long l1 = 0L;
        Object localObject = ((j)g.K(j.class)).XR().aoZ(str);
        l2 = l1;
        if (localObject != null)
        {
          l3 = l1;
          boolean bool3 = bool2;
          if (((at)localObject).field_lastSeq != 0L)
          {
            l3 = l1;
            bool3 = bool2;
            if (((j)g.K(j.class)).bOr().R(str, ((at)localObject).field_lastSeq).field_msgId == 0L)
            {
              l3 = ((at)localObject).field_lastSeq;
              bool3 = true;
            }
          }
          l2 = l3;
          bool1 = bool3;
          if (((at)localObject).field_firstUnDeliverSeq != 0L)
          {
            ((ak)localObject).eG(0L);
            ((ak)localObject).eF(0L);
            ((j)g.K(j.class)).XR().a((ak)localObject, str);
            ab.i("MicroMsg.ChatroomLogic", "summerbadcr deleteConv chatroomId update conv");
            bool1 = bool3;
            l2 = l3;
          }
        }
        if (bool1)
          break label399;
        localObject = ((j)g.K(j.class)).bOr().Rv(str);
        if ((localObject == null) || (((cy)localObject).field_msgId == 0L))
          break label399;
        bool1 = true;
      }
    }
    label399: 
    while (true)
    {
      l3 = l2;
      if (l2 == 0L)
        l3 = ((j)g.K(j.class)).bOr().Ru(str);
      if (l3 != 0L)
        ((j)g.K(j.class)).Yo().N(str, l3);
      ab.i("MicroMsg.ChatroomLogic", "summerbadcr deleteConv chatroomId[%s], needClear[%b], lastMsgSeq[%d]", new Object[] { str, Boolean.valueOf(bool1), Long.valueOf(l3) });
      break label69;
      AppMethodBeat.o(5508);
      paramList = localArrayList;
      break;
    }
  }

  public static void a(String paramString1, List<String> paramList, String paramString2, boolean paramBoolean, String paramString3)
  {
    AppMethodBeat.i(5509);
    a(paramString1, paramList, paramString2, paramBoolean, paramString3, 2);
    AppMethodBeat.o(5509);
  }

  public static void a(String paramString1, List<String> paramList, String paramString2, boolean paramBoolean, String paramString3, int paramInt)
  {
    AppMethodBeat.i(5510);
    bi localbi = new bi();
    localbi.ju(paramString1);
    localbi.setType(10000);
    localbi.eJ(System.currentTimeMillis());
    localbi.setStatus(4);
    localbi.hO(paramInt);
    StringBuffer localStringBuffer = new StringBuffer();
    if (paramList != null)
    {
      paramString1 = r.Yz();
      String str1 = ah.getContext().getString(2131298068);
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        String str2 = (String)paramList.next();
        if (!str2.equals(paramString1))
        {
          ad localad = ((j)g.K(j.class)).XM().aoO(str2);
          if ((localad != null) && ((int)localad.ewQ != 0))
          {
            if (paramBoolean)
              localStringBuffer.append("<a href=\"" + paramString3 + str2 + "\">" + d(localad) + "</a>" + str1);
            else
              localStringBuffer.append(d(localad) + str1);
          }
          else if (paramBoolean)
            localStringBuffer.append("<a href=\"" + paramString3 + str2 + "\">" + str2 + "</a>" + str1);
          else
            localStringBuffer.append(str2 + str1);
        }
      }
      if (localStringBuffer.length() > 0)
        localStringBuffer.deleteCharAt(localStringBuffer.lastIndexOf(str1));
    }
    localbi.setContent(paramString2.replace("%s", localStringBuffer));
    ((j)g.K(j.class)).bOr().Z(localbi);
    AppMethodBeat.o(5510);
  }

  private static String d(ad paramad)
  {
    AppMethodBeat.i(5511);
    if (com.tencent.mm.openim.room.a.a.z(paramad))
    {
      String str = com.tencent.mm.openim.room.a.a.A(paramad);
      if (str != null)
      {
        paramad = paramad.Oj() + str;
        AppMethodBeat.o(5511);
      }
    }
    while (true)
    {
      return paramad;
      paramad = paramad.Oj();
      AppMethodBeat.o(5511);
      continue;
      paramad = paramad.Oj();
      AppMethodBeat.o(5511);
    }
  }

  public static boolean mo(String paramString)
  {
    AppMethodBeat.i(5512);
    boolean bool;
    if ((t.mM(paramString)) || (ad.aox(paramString)))
    {
      bool = true;
      AppMethodBeat.o(5512);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(5512);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.m
 * JD-Core Version:    0.6.2
 */