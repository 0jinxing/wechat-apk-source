package com.tencent.mm.plugin.multitalk.a;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bg.f;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.pb.common.c.g;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public final class a extends j<f>
{
  public static final String[] fnj;
  public static LinkedHashMap<String, Class> mxM;

  static
  {
    AppMethodBeat.i(54109);
    fnj = new String[] { j.a(f.ccO, "MultiTalkInfo"), "CREATE INDEX IF NOT EXISTS idx_MultiTalkInfo_key  on MultiTalkInfo  (  wxGroupId )" };
    mxM = new a.1();
    AppMethodBeat.o(54109);
  }

  public a(e parame)
  {
    super(parame, f.ccO, "MultiTalkInfo", null);
  }

  public final f RW(String paramString)
  {
    AppMethodBeat.i(54107);
    ab.i("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "getMultiTaklInfo for wxGroupId = %s", new Object[] { paramString });
    Cursor localCursor = rawQuery("select wxGroupId, groupId, roomId, roomKey, routeId, inviteUserName,memberCount,createTime,state from MultiTalkInfo where wxGroupId = '" + paramString + "'", new String[0]);
    if (localCursor != null);
    try
    {
      if (localCursor.moveToNext())
      {
        paramString = new com/tencent/mm/bg/f;
        paramString.<init>();
        paramString.field_wxGroupId = localCursor.getString(0);
        paramString.field_groupId = localCursor.getString(1);
        paramString.field_roomId = localCursor.getInt(2);
        paramString.field_roomKey = localCursor.getLong(3);
        paramString.field_routeId = localCursor.getInt(4);
        paramString.field_inviteUserName = localCursor.getString(5);
        paramString.field_memberCount = localCursor.getInt(6);
        paramString.field_createTime = localCursor.getLong(7);
        paramString.field_state = localCursor.getInt(8);
        ab.i("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "getMultiTalkInfo got value for wxGroupId = %s, groupId=%s, roomId = %d, roomKey = %d, routeId = %d,inviteUser=%s,memberCount=%d, createTime=%d,field_state=%d", new Object[] { paramString.field_wxGroupId, paramString.field_groupId, Integer.valueOf(paramString.field_roomId), Long.valueOf(paramString.field_roomKey), Integer.valueOf(paramString.field_routeId), paramString.field_inviteUserName, Integer.valueOf(paramString.field_memberCount), Long.valueOf(paramString.field_createTime), Integer.valueOf(paramString.field_state) });
      }
      while (true)
      {
        return paramString;
        if (localCursor != null)
          localCursor.close();
        paramString = null;
        AppMethodBeat.o(54107);
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("getMultiTalkInfo error! ");
        ab.e("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", paramString.toString());
        if (localCursor != null)
          localCursor.close();
        paramString = null;
        AppMethodBeat.o(54107);
      }
    }
    finally
    {
      if (localCursor != null)
        localCursor.close();
      AppMethodBeat.o(54107);
    }
    throw paramString;
  }

  public final boolean a(f paramf)
  {
    boolean bool1 = false;
    AppMethodBeat.i(54105);
    String str = paramf.field_wxGroupId;
    if (g.isEmpty(str))
    {
      ab.e("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "save. multiTalkInfo wxGroupId is empty!");
      AppMethodBeat.o(54105);
    }
    while (true)
    {
      return bool1;
      ab.i("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "save. wxGroupId=%s, groupId=%s, roomId =%d, roomKey =%d, routeId =%d, inviteUser=%s,memberCount=%d,createTime=%d", new Object[] { str, paramf.field_groupId, Integer.valueOf(paramf.field_roomId), Long.valueOf(paramf.field_roomKey), Integer.valueOf(paramf.field_routeId), paramf.field_inviteUserName, Integer.valueOf(paramf.field_memberCount), Long.valueOf(paramf.field_createTime) });
      try
      {
        boolean bool2 = b(paramf);
        paramf = new java/lang/StringBuilder;
        paramf.<init>("insert ret ");
        ab.i("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", bool2 + " for id=%s" + str);
        AppMethodBeat.o(54105);
        bool1 = bool2;
      }
      catch (Exception paramf)
      {
        ab.e("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "save mulitalTalk failure!" + paramf.toString());
        AppMethodBeat.o(54105);
      }
    }
  }

  public final boolean b(f paramf)
  {
    boolean bool1 = false;
    AppMethodBeat.i(54106);
    String str = paramf.field_wxGroupId;
    if (g.isEmpty(str))
    {
      ab.e("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "update. multiTalkInfo wxGroupId is empty!");
      AppMethodBeat.o(54106);
    }
    while (true)
    {
      return bool1;
      ab.i("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "update. wxGroupId=%s, groupId=%s, roomId =%d, roomKey =%d, routeId =%d, inviteUser=%s,memberCount=%d,createTime=%d,state=%d", new Object[] { str, paramf.field_groupId, Integer.valueOf(paramf.field_roomId), Long.valueOf(paramf.field_roomKey), Integer.valueOf(paramf.field_routeId), paramf.field_inviteUserName, Integer.valueOf(paramf.field_memberCount), Long.valueOf(paramf.field_createTime), Integer.valueOf(paramf.field_state) });
      try
      {
        boolean bool2 = c(paramf, new String[] { "wxGroupId" });
        paramf = new java/lang/StringBuilder;
        paramf.<init>("update ret ");
        ab.i("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", bool2 + " for id=%s" + str);
        AppMethodBeat.o(54106);
        bool1 = bool2;
      }
      catch (Exception paramf)
      {
        ab.e("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "save mulitalTalk failure!" + paramf.toString());
        AppMethodBeat.o(54106);
      }
    }
  }

  public final LinkedList<f> bSj()
  {
    AppMethodBeat.i(54104);
    Cursor localCursor = rawQuery("select wxGroupId, groupId, roomId, roomKey, routeId, createTime from MultiTalkInfo", new String[0]);
    LinkedList localLinkedList = new LinkedList();
    while (true)
    {
      if (localCursor != null);
      try
      {
        if (localCursor.moveToNext())
        {
          f localf = new com/tencent/mm/bg/f;
          localf.<init>();
          localf.field_wxGroupId = localCursor.getString(0);
          localf.field_groupId = localCursor.getString(1);
          localf.field_roomId = localCursor.getInt(2);
          localf.field_roomKey = localCursor.getLong(3);
          localf.field_routeId = localCursor.getInt(4);
          localf.field_createTime = localCursor.getLong(5);
          ab.i("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "getMultiTalkInfoList got value for wxGroupId = %s, groupId=%s, roomId = %d, roomKey = %d, routeId = %d, createTime=%d", new Object[] { localf.field_wxGroupId, localf.field_groupId, Integer.valueOf(localf.field_roomId), Long.valueOf(localf.field_roomKey), Integer.valueOf(localf.field_routeId), Long.valueOf(localf.field_createTime) });
          localLinkedList.add(localf);
          continue;
        }
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "getMultiTalkInfoList error!");
        while (true)
        {
          return localLinkedList;
          if (localCursor != null)
            localCursor.close();
        }
      }
      finally
      {
        if (localCursor != null)
          localCursor.close();
        AppMethodBeat.o(54104);
      }
    }
  }

  public final boolean pI(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(54108);
    ab.i("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "delete id = %s", new Object[] { paramString });
    try
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("delete from MultiTalkInfo where wxGroupId = \"");
      super.hY("MultiTalkInfo", paramString + "\"");
      AppMethodBeat.o(54108);
      return bool;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "delete fail for wxGroupId = ".concat(String.valueOf(paramString)));
        AppMethodBeat.o(54108);
        bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.a.a
 * JD-Core Version:    0.6.2
 */