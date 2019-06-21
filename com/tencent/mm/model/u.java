package com.tencent.mm.model;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public final class u
{
  private static final List<u.a> fkZ;

  static
  {
    AppMethodBeat.i(59887);
    fkZ = new ArrayList();
    AppMethodBeat.o(59887);
  }

  public static List<String> P(String paramString, int paramInt)
  {
    AppMethodBeat.i(59884);
    ArrayList localArrayList = null;
    Object localObject = null;
    if (!g.RK())
      ab.w("MicroMsg.ConversationLogic", "get Total Unread Talker T, but has not set uin");
    while (true)
    {
      AppMethodBeat.o(59884);
      return localObject;
      localObject = ((j)g.K(j.class)).XR().eo(paramString, paramInt);
      if (((Cursor)localObject).moveToNext())
      {
        localArrayList = new ArrayList();
        do
        {
          ab.d("MicroMsg.ConversationLogic", "jacks need notify talker display name: %s", new Object[] { ((Cursor)localObject).getString(0) });
          localArrayList.add(((Cursor)localObject).getString(0));
        }
        while (((Cursor)localObject).moveToNext());
      }
      ((Cursor)localObject).close();
      localObject = localArrayList;
      if (localArrayList != null)
      {
        paramString = ((j)g.K(j.class)).XR().apj(paramString);
        localObject = localArrayList;
        if (paramString != null)
        {
          paramString.moveToFirst();
          while (!paramString.isAfterLast())
          {
            localObject = ((j)g.K(j.class)).XM().aoO(paramString.getString(0));
            if ((localObject != null) && (((ap)localObject).dua == 0))
            {
              ab.d("MicroMsg.ConversationLogic", "jacks need mute notify:  %s", new Object[] { ((ad)localObject).Oi() });
              localArrayList.remove(((ad)localObject).Oi());
            }
            paramString.moveToNext();
          }
          paramString.close();
          localObject = localArrayList;
        }
      }
    }
  }

  private static int a(String paramString, Cursor paramCursor)
  {
    AppMethodBeat.i(59879);
    if ((paramCursor != null) && (paramCursor.getCount() > 0))
      paramCursor.moveToFirst();
    for (int i = paramCursor.getInt(0); ; i = 0)
    {
      if (paramCursor != null)
        paramCursor.close();
      if (i <= 0)
      {
        AppMethodBeat.o(59879);
        i = 0;
      }
      while (true)
      {
        return i;
        paramString = ((j)g.K(j.class)).XR().apj(paramString);
        if (paramString != null)
          break;
        ab.w("MicroMsg.ConversationLogic", "cursor is null, return");
        AppMethodBeat.o(59879);
      }
      paramString.moveToFirst();
      label102: if (!paramString.isAfterLast())
      {
        paramCursor = ((j)g.K(j.class)).XM().aoO(paramString.getString(0));
        if ((paramCursor == null) || (paramCursor.dua != 0))
          break label213;
        i -= paramString.getInt(1);
        ab.d("MicroMsg.ConversationLogic", "unreadcheck chatroom mute %s, unRead %d,", new Object[] { paramCursor.field_username, Integer.valueOf(i) });
      }
      label213: 
      while (true)
      {
        paramString.moveToNext();
        break label102;
        paramString.close();
        i = Math.max(0, i);
        AppMethodBeat.o(59879);
        break;
      }
    }
  }

  public static void a(u.a parama)
  {
    AppMethodBeat.i(59886);
    Assert.assertNotNull(parama);
    synchronized (fkZ)
    {
      fkZ.add(parama);
      AppMethodBeat.o(59886);
      return;
    }
  }

  public static int ac(String paramString1, String paramString2)
  {
    AppMethodBeat.i(59882);
    if (!g.RK())
    {
      ab.w("MicroMsg.ConversationLogic", "get total unread, but has not set uin");
      AppMethodBeat.o(59882);
      i = 0;
      return i;
    }
    paramString1 = ((j)g.K(j.class)).XR().ic(paramString1, paramString2);
    if ((paramString1 != null) && (paramString1.getCount() > 0))
      paramString1.moveToFirst();
    for (int i = paramString1.getInt(0); ; i = 0)
    {
      if (paramString1 != null)
        paramString1.close();
      AppMethodBeat.o(59882);
      break;
    }
  }

  public static int ad(String paramString1, String paramString2)
  {
    int i = 0;
    AppMethodBeat.i(59885);
    if (bo.isNullOrNil(paramString1))
    {
      AppMethodBeat.o(59885);
      j = 0;
      return j;
    }
    if ("notification_messages".equals(paramString1));
    for (int j = 8; ; j = 2)
    {
      AppMethodBeat.o(59885);
      break;
      if ((paramString2 == null) || (!paramString2.endsWith("@chatroom")))
        break label61;
    }
    label61: PInt localPInt = new PInt();
    List localList = fkZ;
    j = 0;
    boolean bool1 = false;
    while (true)
    {
      try
      {
        if (j >= fkZ.size())
          break label175;
        u.a locala = (u.a)fkZ.get(j);
        if (locala != null)
        {
          bool2 = locala.a(paramString1, paramString2, localPInt);
          bool1 = bool2;
          if (bool2)
          {
            j = localPInt.value;
            if (bool2)
              break label172;
            j = 1;
            break;
          }
        }
        j++;
        continue;
      }
      finally
      {
        AppMethodBeat.o(59885);
      }
      label172: break;
      label175: boolean bool2 = bool1;
      j = i;
    }
  }

  public static int e(String paramString, List<String> paramList)
  {
    AppMethodBeat.i(59881);
    if (!g.RK())
    {
      ab.w("MicroMsg.ConversationLogic", "get total unread with black list, but has not set uin");
      AppMethodBeat.o(59881);
      i = 0;
      return i;
    }
    long l = bo.yz();
    Cursor localCursor = ((j)g.K(j.class)).XR().A(paramString, paramList);
    int j = a(paramString, localCursor);
    localCursor.close();
    l = bo.az(l);
    if (paramList == null);
    for (int i = -1; ; i = paramList.size())
    {
      ab.i("MicroMsg.ConversationLogic", "get count with black list use %d ms, blacklist size:%s", new Object[] { Long.valueOf(l), Integer.valueOf(i) });
      AppMethodBeat.o(59881);
      i = j;
      break;
    }
  }

  public static int nR(String paramString)
  {
    AppMethodBeat.i(59880);
    int i = e(paramString, new LinkedList());
    AppMethodBeat.o(59880);
    return i;
  }

  public static int nS(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(59883);
    if (!g.RK())
    {
      ab.w("MicroMsg.ConversationLogic", "get Total Unread Talker, but has not set uin");
      AppMethodBeat.o(59883);
      j = i;
      return j;
    }
    long l = bo.yz();
    Cursor localCursor = ((j)g.K(j.class)).XR().apk(paramString);
    if (localCursor.getCount() > 0)
      localCursor.moveToFirst();
    for (int j = localCursor.getInt(0); ; j = 0)
    {
      localCursor.close();
      if (j <= 0)
      {
        AppMethodBeat.o(59883);
        j = i;
        break;
      }
      localCursor = ((j)g.K(j.class)).XR().apj(paramString);
      if (localCursor == null)
      {
        ab.i("MicroMsg.ConversationLogic", "[getTotalUnreadTalker] cursor is null!cost %d ms count:%s ", new Object[] { Long.valueOf(bo.az(l)), Integer.valueOf(j) });
        AppMethodBeat.o(59883);
        break;
      }
      localCursor.moveToFirst();
      label173: if (!localCursor.isAfterLast())
      {
        paramString = ((j)g.K(j.class)).XM().aoO(localCursor.getString(0));
        if ((paramString == null) || (paramString.dua != 0))
          break label285;
        j--;
      }
      label285: 
      while (true)
      {
        localCursor.moveToNext();
        break label173;
        localCursor.close();
        ab.i("MicroMsg.ConversationLogic", "[getTotalUnreadTalker] cost %d ms count:%s ", new Object[] { Long.valueOf(bo.az(l)), Integer.valueOf(j) });
        j = Math.max(0, j);
        AppMethodBeat.o(59883);
        break;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.u
 * JD-Core Version:    0.6.2
 */