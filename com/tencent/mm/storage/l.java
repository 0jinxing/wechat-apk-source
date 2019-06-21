package com.tencent.mm.storage;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;

public final class l extends j<k>
{
  public static final String[] fnj;
  public h fni;

  static
  {
    AppMethodBeat.i(29017);
    fnj = new String[] { j.a(k.ccO, "BackupRecoverMsgListDataId") };
    AppMethodBeat.o(29017);
  }

  public l(h paramh)
  {
    super(paramh, k.ccO, "BackupRecoverMsgListDataId", null);
    this.fni = paramh;
  }

  public final String aoi(String paramString)
  {
    Object localObject1 = null;
    AppMethodBeat.i(29011);
    Object localObject2 = "SELECT * FROM BackupRecoverMsgListDataId WHERE msgListDataId = \"" + paramString + "\" ";
    ab.d("MicroMsg.BackupRecoverMsgListDataIdStorage", "getSessionNameByMsgListDataId:".concat(String.valueOf(localObject2)));
    localObject2 = this.fni.a((String)localObject2, null, 0);
    if (localObject2 == null)
    {
      ab.e("MicroMsg.BackupRecoverMsgListDataIdStorage", "getSessionNameByMsgListDataId failed, msgListDataId:%s", new Object[] { paramString });
      AppMethodBeat.o(29011);
      paramString = localObject1;
    }
    while (true)
    {
      return paramString;
      if (((Cursor)localObject2).moveToFirst())
      {
        paramString = new k();
        paramString.d((Cursor)localObject2);
        ((Cursor)localObject2).close();
        paramString = paramString.field_sessionName;
        AppMethodBeat.o(29011);
      }
      else
      {
        ((Cursor)localObject2).close();
        AppMethodBeat.o(29011);
        paramString = localObject1;
      }
    }
  }

  public final int drA()
  {
    int i = 0;
    AppMethodBeat.i(29014);
    ab.d("MicroMsg.BackupRecoverMsgListDataIdStorage", "getSessionCount:".concat(String.valueOf("SELECT COUNT(DISTINCT sessionName) FROM BackupRecoverMsgListDataId ")));
    Cursor localCursor = this.fni.a("SELECT COUNT(DISTINCT sessionName) FROM BackupRecoverMsgListDataId ", null, 0);
    if (localCursor.moveToLast())
      i = localCursor.getInt(0);
    localCursor.close();
    AppMethodBeat.o(29014);
    return i;
  }

  public final boolean drx()
  {
    AppMethodBeat.i(29015);
    boolean bool = this.fni.hY("BackupRecoverMsgListDataId", "delete from BackupRecoverMsgListDataId");
    ab.i("MicroMsg.BackupRecoverMsgListDataIdStorage", "deleteAllData, result:%b", new Object[] { Boolean.valueOf(bool) });
    AppMethodBeat.o(29015);
    return bool;
  }

  public final HashMap<String, String> dry()
  {
    AppMethodBeat.i(29012);
    HashMap localHashMap = new HashMap();
    Cursor localCursor = baR();
    if (localCursor == null)
    {
      ab.e("MicroMsg.BackupRecoverMsgListDataIdStorage", "getAllData failed.");
      AppMethodBeat.o(29012);
    }
    while (true)
    {
      return localHashMap;
      while (localCursor.moveToNext())
      {
        k localk = new k();
        localk.d(localCursor);
        localHashMap.put(localk.field_msgListDataId, localk.field_sessionName);
      }
      localCursor.close();
      AppMethodBeat.o(29012);
    }
  }

  public final boolean drz()
  {
    boolean bool = false;
    AppMethodBeat.i(29013);
    ab.d("MicroMsg.BackupRecoverMsgListDataIdStorage", "isMsgListDataIdExist:".concat(String.valueOf("SELECT * FROM BackupRecoverMsgListDataId")));
    Cursor localCursor = this.fni.a("SELECT * FROM BackupRecoverMsgListDataId", null, 0);
    if (localCursor == null)
    {
      ab.e("MicroMsg.BackupRecoverMsgListDataIdStorage", "isMsgListDataIdExist failed.");
      AppMethodBeat.o(29013);
    }
    while (true)
    {
      return bool;
      if (localCursor.getCount() <= 0)
      {
        ab.e("MicroMsg.BackupRecoverMsgListDataIdStorage", "No data in BackupRecoverMsgListDataIdStorage.");
        localCursor.close();
        AppMethodBeat.o(29013);
      }
      else
      {
        localCursor.close();
        bool = true;
        AppMethodBeat.o(29013);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.l
 * JD-Core Version:    0.6.2
 */