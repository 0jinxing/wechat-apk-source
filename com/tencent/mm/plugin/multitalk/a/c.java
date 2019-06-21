package com.tencent.mm.plugin.multitalk.a;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class c extends j<b>
{
  public static final String[] fnj;

  static
  {
    AppMethodBeat.i(54116);
    fnj = new String[] { j.a(b.ccO, "MultiTalkMember"), "CREATE INDEX IF NOT EXISTS idx_MultiTalkMember  on MultiTalkMember  (  wxGroupId )" };
    AppMethodBeat.o(54116);
  }

  public c(e parame)
  {
    super(parame, b.ccO, "MultiTalkMember", null);
  }

  public final LinkedList<b> So(String paramString)
  {
    AppMethodBeat.i(54112);
    paramString = rawQuery("select memberUuid, wxGroupId, userName, inviteUserName, memberId, status,createTime  from MultiTalkMember  where wxGroupId = '" + paramString + "'", new String[0]);
    LinkedList localLinkedList = new LinkedList();
    while (true)
    {
      if (paramString != null);
      try
      {
        if (paramString.moveToNext())
        {
          b localb = new com/tencent/mm/plugin/multitalk/a/b;
          localb.<init>();
          localb.field_memberUuid = paramString.getInt(0);
          localb.field_wxGroupId = paramString.getString(1);
          localb.field_userName = paramString.getString(2);
          localb.field_inviteUserName = paramString.getString(3);
          localb.field_memberId = paramString.getLong(4);
          localb.field_status = paramString.getInt(5);
          localb.field_createTime = paramString.getLong(6);
          ab.i("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", "getMultiTalkMemberList get value for memberUuid = %s, wxGroupId = %s, userName = %s, inviteUserName = %s, memberId = %d, status = %d,createTime = %d", new Object[] { Long.valueOf(localb.field_memberUuid), localb.field_wxGroupId, localb.field_userName, localb.field_inviteUserName, Long.valueOf(localb.field_memberId), Integer.valueOf(localb.field_status), Long.valueOf(localb.field_createTime) });
          localLinkedList.add(localb);
          continue;
        }
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", localException.toString());
        while (true)
        {
          return localLinkedList;
          if (paramString != null)
            paramString.close();
        }
      }
      finally
      {
        if (paramString != null)
          paramString.close();
        AppMethodBeat.o(54112);
      }
    }
  }

  public final boolean a(b paramb)
  {
    AppMethodBeat.i(54113);
    long l = paramb.field_memberUuid;
    Cursor localCursor = rawQuery("select * from MultiTalkMember where memberUuid = '" + l + "' and wxGroupId = '" + paramb.field_wxGroupId + "'", new String[0]);
    try
    {
      if (localCursor.getCount() == 0)
      {
        bool = b(paramb);
        paramb = new java/lang/StringBuilder;
        paramb.<init>("insert ret ");
        ab.i("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", bool + " for memberUuid = " + l);
      }
      while (true)
      {
        return bool;
        bool = c(paramb, new String[0]);
        paramb = new java/lang/StringBuilder;
        paramb.<init>("update ret ");
        ab.i("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", bool + " for memberUuid = " + l);
        localCursor.close();
        AppMethodBeat.o(54113);
      }
    }
    catch (Exception paramb)
    {
      while (true)
      {
        ab.e("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", paramb.toString());
        localCursor.close();
        AppMethodBeat.o(54113);
        boolean bool = false;
      }
    }
    finally
    {
      localCursor.close();
      AppMethodBeat.o(54113);
    }
    throw paramb;
  }

  public final boolean dm(String paramString1, String paramString2)
  {
    AppMethodBeat.i(54114);
    ab.i("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", "delete where wxGroupId = " + paramString1 + ",member = " + paramString2);
    try
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("delete from MultiTalkMember where wxGroupId = \"");
      super.hY("MultiTalkMember", paramString1 + "\" and userName = \"" + paramString2 + "\"");
      bool = true;
      AppMethodBeat.o(54114);
      return bool;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", "delete fail for wxGroupId = " + paramString1 + ",member = " + paramString2);
        boolean bool = false;
        AppMethodBeat.o(54114);
      }
    }
  }

  public final b fi(String paramString1, String paramString2)
  {
    AppMethodBeat.i(54111);
    paramString2 = rawQuery("select memberUuid, wxGroupId, userName, inviteUserName, memberId, status,createTime  from MultiTalkMember  where wxGroupId = '" + paramString1 + "' and userName ='" + paramString2 + "'", new String[0]);
    if (paramString2 != null);
    try
    {
      if (paramString2.moveToNext())
      {
        paramString1 = new com/tencent/mm/plugin/multitalk/a/b;
        paramString1.<init>();
        paramString1.field_memberUuid = paramString2.getInt(0);
        paramString1.field_wxGroupId = paramString2.getString(1);
        paramString1.field_userName = paramString2.getString(2);
        paramString1.field_inviteUserName = paramString2.getString(3);
        paramString1.field_memberId = paramString2.getLong(4);
        paramString1.field_status = paramString2.getInt(5);
        paramString1.field_createTime = paramString2.getLong(6);
        ab.i("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", "getMultiTalkMember get value for memberUuid = %s, wxGroupId = %s, userName = %s, inviteUserName = %s, memberId = %d, status = %d,createTime = %d", new Object[] { Long.valueOf(paramString1.field_memberUuid), paramString1.field_wxGroupId, paramString1.field_userName, paramString1.field_inviteUserName, Long.valueOf(paramString1.field_memberId), Integer.valueOf(paramString1.field_status), Long.valueOf(paramString1.field_createTime) });
      }
      while (true)
      {
        return paramString1;
        if (paramString2 != null)
          paramString2.close();
        paramString1 = null;
        AppMethodBeat.o(54111);
      }
    }
    catch (Exception paramString1)
    {
      while (true)
      {
        ab.e("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", paramString1.toString());
        if (paramString2 != null)
          paramString2.close();
      }
    }
    finally
    {
      if (paramString2 != null)
        paramString2.close();
      AppMethodBeat.o(54111);
    }
    throw paramString1;
  }

  public final boolean pI(String paramString)
  {
    AppMethodBeat.i(54115);
    ab.i("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", "delete where wxGroupId = ".concat(String.valueOf(paramString)));
    try
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("delete from MultiTalkMember where wxGroupId = \"");
      super.hY("MultiTalkMember", paramString + "\"");
      bool = true;
      AppMethodBeat.o(54115);
      return bool;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", "delete fail for wxGroupId = ".concat(String.valueOf(paramString)));
        boolean bool = false;
        AppMethodBeat.o(54115);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.a.c
 * JD-Core Version:    0.6.2
 */