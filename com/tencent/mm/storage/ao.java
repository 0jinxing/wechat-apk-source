package com.tencent.mm.storage;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import com.tencent.mm.cd.h;
import com.tencent.mm.sdk.e.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.List;

public final class ao extends k
  implements com.tencent.mm.plugin.messenger.foundation.a.a.c
{
  public static final String[] fnj = { "CREATE TABLE IF NOT EXISTS DeletedConversationInfo ( userName TEXT  PRIMARY KEY , lastSeq LONG  , reserved1 INT  , reserved2 LONG  , reserved3 TEXT  ) ", "CREATE INDEX IF NOT EXISTS createTimeIndex  ON DeletedConversationInfo ( reserved2 )" };
  private final f<String, Long> emX;
  private h fni;

  public ao(h paramh)
  {
    AppMethodBeat.i(1273);
    this.emX = new com.tencent.mm.memory.a.c(50);
    this.fni = paramh;
    AppMethodBeat.o(1273);
  }

  public final boolean N(String paramString, long paramLong)
  {
    boolean bool = false;
    AppMethodBeat.i(1274);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(1274);
    while (true)
    {
      return bool;
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("userName", paramString);
      localContentValues.put("lastSeq", Long.valueOf(paramLong));
      localContentValues.put("reserved2", Long.valueOf(QQ(paramString)));
      if ((int)this.fni.replace("DeletedConversationInfo", "userName", localContentValues) != -1)
      {
        anF(paramString);
        bool = true;
        AppMethodBeat.o(1274);
      }
      else
      {
        AppMethodBeat.o(1274);
      }
    }
  }

  public final boolean O(String paramString, long paramLong)
  {
    boolean bool = false;
    AppMethodBeat.i(1276);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(1276);
    while (true)
    {
      return bool;
      this.emX.k(paramString, Long.valueOf(paramLong));
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("userName", paramString);
      localContentValues.put("lastSeq", Long.valueOf(QP(paramString)));
      localContentValues.put("reserved2", Long.valueOf(paramLong));
      if ((int)this.fni.replace("DeletedConversationInfo", "userName", localContentValues) != -1)
      {
        anF(paramString);
        bool = true;
        AppMethodBeat.o(1276);
      }
      else
      {
        AppMethodBeat.o(1276);
      }
    }
  }

  public final long QP(String paramString)
  {
    long l = 0L;
    AppMethodBeat.i(1275);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(1275);
    while (true)
    {
      return l;
      Object localObject = "select lastSeq from DeletedConversationInfo where userName = \"" + bo.vA(String.valueOf(paramString)) + "\"";
      localObject = this.fni.a((String)localObject, null, 2);
      if (localObject == null)
      {
        ab.i("MicroMsg.DeletedConversationInfoStorage", "getLastPushSeq failed ".concat(String.valueOf(paramString)));
        AppMethodBeat.o(1275);
      }
      else if (((Cursor)localObject).moveToFirst())
      {
        l = ((Cursor)localObject).getLong(0);
        ((Cursor)localObject).close();
        AppMethodBeat.o(1275);
      }
      else
      {
        ((Cursor)localObject).close();
        AppMethodBeat.o(1275);
      }
    }
  }

  public final long QQ(String paramString)
  {
    AppMethodBeat.i(1278);
    long l;
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(1278);
      l = 0L;
    }
    while (true)
    {
      return l;
      Object localObject = (Long)this.emX.get(paramString);
      if (localObject != null)
      {
        l = ((Long)localObject).longValue();
        AppMethodBeat.o(1278);
      }
      else
      {
        localObject = "select reserved2 from DeletedConversationInfo where userName = \"" + bo.vA(String.valueOf(paramString)) + "\"";
        localObject = this.fni.a((String)localObject, null, 2);
        if (localObject == null)
        {
          ab.i("MicroMsg.DeletedConversationInfoStorage", "getCreateTime failed ".concat(String.valueOf(paramString)));
          this.emX.k(paramString, Long.valueOf(0L));
          AppMethodBeat.o(1278);
          l = 0L;
        }
        else if (((Cursor)localObject).moveToFirst())
        {
          l = ((Cursor)localObject).getLong(0);
          this.emX.k(paramString, Long.valueOf(l));
          ((Cursor)localObject).close();
          AppMethodBeat.o(1278);
        }
        else
        {
          ((Cursor)localObject).close();
          AppMethodBeat.o(1278);
          l = 0L;
        }
      }
    }
  }

  public final List<String> bOv()
  {
    AppMethodBeat.i(1277);
    ArrayList localArrayList = new ArrayList();
    Cursor localCursor = this.fni.a("select userName,reserved2 from DeletedConversationInfo where reserved2 > 0", null, 2);
    if (localCursor == null)
      AppMethodBeat.o(1277);
    while (true)
    {
      return localArrayList;
      if (localCursor.moveToFirst())
        do
        {
          String str = localCursor.getString(0);
          long l = localCursor.getLong(1);
          this.emX.k(str, Long.valueOf(l));
          localArrayList.add(str);
        }
        while (localCursor.moveToNext());
      localCursor.close();
      AppMethodBeat.o(1277);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.ao
 * JD-Core Version:    0.6.2
 */