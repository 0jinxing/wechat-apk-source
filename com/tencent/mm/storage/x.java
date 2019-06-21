package com.tencent.mm.storage;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.j.a.a.c;
import com.tencent.mm.j.a.a.d;
import com.tencent.mm.plugin.messenger.foundation.a.a.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.b.a;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public final class x extends n
  implements b
{
  public static final String[] fnj;
  private static final String[] xIq;
  private h fni;

  static
  {
    AppMethodBeat.i(1101);
    fnj = new String[] { j.a(w.ccO, "ChatroomMsgSeq") };
    xIq = new String[] { "CREATE INDEX IF NOT EXISTS  ChatroomMsgSeqTalkerIndex ON ChatroomMsgSeq ( username )" };
    AppMethodBeat.o(1101);
  }

  public x(h paramh)
  {
    AppMethodBeat.i(1078);
    this.fni = paramh;
    paramh.hY("ChatroomMsgSeq", xIq[0]);
    AppMethodBeat.o(1078);
  }

  public final boolean I(String paramString, long paramLong)
  {
    AppMethodBeat.i(1088);
    boolean bool;
    if (bo.isNullOrNil(paramString))
    {
      bool = false;
      AppMethodBeat.o(1088);
    }
    while (true)
    {
      return bool;
      Object localObject = "update ChatroomMsgSeq set lastPushSeq =  " + paramLong + " where username = \"" + bo.vA(paramString) + "\"";
      bool = this.fni.hY("ChatroomMsgSeq", (String)localObject);
      if (bool)
      {
        localObject = new b.a();
        ((b.a)localObject).id = 4;
        ((b.a)localObject).username = paramString;
        b(2, this, localObject);
      }
      AppMethodBeat.o(1088);
    }
  }

  public final boolean J(String paramString, long paramLong)
  {
    AppMethodBeat.i(1089);
    boolean bool;
    if (bo.isNullOrNil(paramString))
    {
      bool = false;
      AppMethodBeat.o(1089);
    }
    while (true)
    {
      return bool;
      paramString = "update ChatroomMsgSeq set lastLocalCreateTime =  " + paramLong + " where username = \"" + bo.vA(paramString) + "\"";
      bool = this.fni.hY("ChatroomMsgSeq", paramString);
      AppMethodBeat.o(1089);
    }
  }

  public final boolean K(String paramString, long paramLong)
  {
    AppMethodBeat.i(1090);
    boolean bool;
    if (bo.isNullOrNil(paramString))
    {
      bool = false;
      AppMethodBeat.o(1090);
    }
    while (true)
    {
      return bool;
      paramString = "update ChatroomMsgSeq set lastPushCreateTime =  " + paramLong + " where username = \"" + bo.vA(paramString) + "\"";
      bool = this.fni.hY("ChatroomMsgSeq", paramString);
      AppMethodBeat.o(1090);
    }
  }

  public final boolean L(String paramString, long paramLong)
  {
    AppMethodBeat.i(1091);
    boolean bool;
    if (bo.isNullOrNil(paramString))
    {
      bool = false;
      AppMethodBeat.o(1091);
    }
    while (true)
    {
      return bool;
      paramString = "update ChatroomMsgSeq set lastLocalSeq =  " + paramLong + " where username = \"" + bo.vA(paramString) + "\"";
      bool = this.fni.hY("ChatroomMsgSeq", paramString);
      AppMethodBeat.o(1091);
    }
  }

  public final c M(String paramString, long paramLong)
  {
    AppMethodBeat.i(1097);
    paramString = QK(paramString);
    if (paramString.eoG.size() <= 0)
    {
      AppMethodBeat.o(1097);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      ListIterator localListIterator = paramString.eoG.listIterator(paramString.eoG.size());
      while (true)
        if (localListIterator.hasPrevious())
        {
          paramString = (c)localListIterator.previous();
          if (paramString.eoE < paramLong)
          {
            AppMethodBeat.o(1097);
            break;
          }
        }
      AppMethodBeat.o(1097);
      paramString = null;
    }
  }

  public final long QF(String paramString)
  {
    AppMethodBeat.i(1082);
    long l = this.fni.delete("ChatroomMsgSeq", "username = ?", new String[] { paramString });
    AppMethodBeat.o(1082);
    return l;
  }

  public final long QG(String paramString)
  {
    AppMethodBeat.i(1084);
    long l;
    if (bo.isNullOrNil(paramString))
    {
      l = -1L;
      AppMethodBeat.o(1084);
    }
    while (true)
    {
      return l;
      Object localObject = "select lastPushSeq from ChatroomMsgSeq where username = \"" + bo.vA(String.valueOf(paramString)) + "\"";
      localObject = this.fni.a((String)localObject, null, 2);
      if (localObject == null)
      {
        ab.i("MicroMsg.ChatroomMsgSeqStorage", "getLastPushSeq failed ".concat(String.valueOf(paramString)));
        l = -2L;
        AppMethodBeat.o(1084);
      }
      else if (((Cursor)localObject).moveToFirst())
      {
        l = ((Cursor)localObject).getLong(0);
        ((Cursor)localObject).close();
        AppMethodBeat.o(1084);
      }
      else
      {
        ((Cursor)localObject).close();
        l = -3L;
        AppMethodBeat.o(1084);
      }
    }
  }

  public final long QH(String paramString)
  {
    AppMethodBeat.i(1086);
    long l;
    if (bo.isNullOrNil(paramString))
    {
      l = -1L;
      AppMethodBeat.o(1086);
    }
    while (true)
    {
      return l;
      Object localObject = "select lastLocalSeq from ChatroomMsgSeq where username = \"" + bo.vA(String.valueOf(paramString)) + "\"";
      localObject = this.fni.a((String)localObject, null, 2);
      if (localObject == null)
      {
        ab.i("MicroMsg.ChatroomMsgSeqStorage", "getLastLocalSeq failed ".concat(String.valueOf(paramString)));
        l = -2L;
        AppMethodBeat.o(1086);
      }
      else if (((Cursor)localObject).moveToFirst())
      {
        l = ((Cursor)localObject).getLong(0);
        ((Cursor)localObject).close();
        AppMethodBeat.o(1086);
      }
      else
      {
        ((Cursor)localObject).close();
        l = -3L;
        AppMethodBeat.o(1086);
      }
    }
  }

  public final long QI(String paramString)
  {
    AppMethodBeat.i(1085);
    long l;
    if (bo.isNullOrNil(paramString))
    {
      l = -1L;
      AppMethodBeat.o(1085);
    }
    while (true)
    {
      return l;
      Object localObject = "select lastPushCreateTime from ChatroomMsgSeq where username = \"" + bo.vA(String.valueOf(paramString)) + "\"";
      localObject = this.fni.a((String)localObject, null, 2);
      if (localObject == null)
      {
        ab.i("MicroMsg.ChatroomMsgSeqStorage", "getLastPushSeq failed ".concat(String.valueOf(paramString)));
        l = -2L;
        AppMethodBeat.o(1085);
      }
      else if (((Cursor)localObject).moveToFirst())
      {
        l = ((Cursor)localObject).getLong(0);
        ((Cursor)localObject).close();
        AppMethodBeat.o(1085);
      }
      else
      {
        ((Cursor)localObject).close();
        l = -3L;
        AppMethodBeat.o(1085);
      }
    }
  }

  public final long QJ(String paramString)
  {
    AppMethodBeat.i(1087);
    long l;
    if (bo.isNullOrNil(paramString))
    {
      l = -1L;
      AppMethodBeat.o(1087);
    }
    while (true)
    {
      return l;
      Object localObject = "select lastLocalCreateTime from ChatroomMsgSeq where username = \"" + bo.vA(String.valueOf(paramString)) + "\"";
      localObject = this.fni.a((String)localObject, null, 2);
      if (localObject == null)
      {
        ab.i("MicroMsg.ChatroomMsgSeqStorage", "getLastLocalSeq failed ".concat(String.valueOf(paramString)));
        l = -2L;
        AppMethodBeat.o(1087);
      }
      else if (((Cursor)localObject).moveToFirst())
      {
        l = ((Cursor)localObject).getLong(0);
        ((Cursor)localObject).close();
        AppMethodBeat.o(1087);
      }
      else
      {
        ((Cursor)localObject).close();
        l = -3L;
        AppMethodBeat.o(1087);
      }
    }
  }

  public final d QK(String paramString)
  {
    AppMethodBeat.i(1092);
    if (bo.isNullOrNil(paramString))
    {
      ab.i("MicroMsg.ChatroomMsgSeqStorage", "getSeqBlockInfo failed username is null!");
      paramString = new d();
      AppMethodBeat.o(1092);
    }
    while (true)
    {
      return paramString;
      Object localObject = "select seqBlockInfo from ChatroomMsgSeq where username = \"" + bo.vA(String.valueOf(paramString)) + "\"";
      localObject = this.fni.a((String)localObject, null, 2);
      if (localObject == null)
      {
        ab.e("MicroMsg.ChatroomMsgSeqStorage", "getSeqBlockInfo failed ".concat(String.valueOf(paramString)));
        paramString = new d();
        AppMethodBeat.o(1092);
        continue;
      }
      byte[] arrayOfByte;
      if (((Cursor)localObject).moveToFirst())
      {
        arrayOfByte = ((Cursor)localObject).getBlob(0);
        if (bo.cb(arrayOfByte))
        {
          ((Cursor)localObject).close();
          paramString = new d();
          AppMethodBeat.o(1092);
          continue;
        }
        paramString = new d();
      }
      try
      {
        paramString.parseFrom(arrayOfByte);
        label171: ((Cursor)localObject).close();
        AppMethodBeat.o(1092);
        continue;
        ((Cursor)localObject).close();
        paramString = new d();
        AppMethodBeat.o(1092);
      }
      catch (Exception localException)
      {
        break label171;
      }
    }
  }

  public final boolean QL(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(1094);
    Object localObject = "select count(*) from ChatroomMsgSeq where username = \"" + bo.vA(String.valueOf(paramString)) + "\"";
    localObject = this.fni.a((String)localObject, null, 2);
    if (localObject == null)
    {
      ab.i("MicroMsg.ChatroomMsgSeqStorage", "getLastPushSeq failed ".concat(String.valueOf(paramString)));
      AppMethodBeat.o(1094);
    }
    while (true)
    {
      return bool;
      if (((Cursor)localObject).moveToFirst())
      {
        long l = ((Cursor)localObject).getLong(0);
        ((Cursor)localObject).close();
        if (l > 0L)
        {
          bool = true;
          AppMethodBeat.o(1094);
        }
        else
        {
          AppMethodBeat.o(1094);
        }
      }
      else
      {
        ((Cursor)localObject).close();
        AppMethodBeat.o(1094);
      }
    }
  }

  public final c QM(String paramString)
  {
    AppMethodBeat.i(1095);
    paramString = QK(paramString);
    if (paramString.eoG.size() <= 0)
    {
      paramString = null;
      AppMethodBeat.o(1095);
    }
    while (true)
    {
      return paramString;
      paramString = (c)paramString.eoG.getLast();
      AppMethodBeat.o(1095);
    }
  }

  public final w QN(String paramString)
  {
    AppMethodBeat.i(1098);
    ab.i("MicroMsg.ChatroomMsgSeqStorage", "[getChatroomMsgSeq] username:%s", new Object[] { paramString });
    w localw = new w();
    paramString = "select * from ChatroomMsgSeq where username = \"" + bo.vA(String.valueOf(paramString)) + "\"";
    paramString = this.fni.a(paramString, null, 2);
    if (paramString == null)
      AppMethodBeat.o(1098);
    while (true)
    {
      return localw;
      if (paramString.moveToFirst())
        localw.d(paramString);
      paramString.close();
      AppMethodBeat.o(1098);
    }
  }

  public final StringBuilder QO(String paramString)
  {
    AppMethodBeat.i(1099);
    StringBuilder localStringBuilder = new StringBuilder();
    paramString = QN(paramString).field_seqBlockInfo;
    if (paramString == null)
      AppMethodBeat.o(1099);
    while (true)
    {
      return localStringBuilder;
      paramString = paramString.eoG.iterator();
      while (paramString.hasNext())
      {
        c localc = (c)paramString.next();
        localStringBuilder.append("[").append(localc.eoC).append(":").append(localc.eoD).append("][").append(localc.eoE).append(":").append(localc.eoF).append("] | ");
      }
      AppMethodBeat.o(1099);
    }
  }

  public final long a(w paramw)
  {
    AppMethodBeat.i(1079);
    long l = a(paramw, false);
    AppMethodBeat.o(1079);
    return l;
  }

  public final long a(w paramw, boolean paramBoolean)
  {
    AppMethodBeat.i(1080);
    long l;
    if (paramw == null)
    {
      l = -1L;
      AppMethodBeat.o(1080);
    }
    while (true)
    {
      return l;
      Object localObject = paramw.Hl();
      l = this.fni.a("ChatroomMsgSeq", "username", (ContentValues)localObject, false);
      if (l >= 0L)
      {
        localObject = new b.a();
        ((b.a)localObject).id = 4;
        ((b.a)localObject).username = paramw.field_username;
        ((b.a)localObject).oqE = paramBoolean;
        b(4, this, localObject);
      }
      AppMethodBeat.o(1080);
    }
  }

  public final boolean a(String paramString, d paramd)
  {
    AppMethodBeat.i(1093);
    boolean bool;
    if ((paramString == null) || (paramString.length() <= 0))
    {
      ab.e("MicroMsg.ChatroomMsgSeqStorage", "updateSeqBlockInfo failed");
      AppMethodBeat.o(1093);
      bool = false;
    }
    while (true)
    {
      return bool;
      Object localObject = new byte[0];
      try
      {
        paramd = paramd.toByteArray();
        localObject = new ContentValues();
        ((ContentValues)localObject).put("seqBlockInfo", paramd);
        if (this.fni.update("ChatroomMsgSeq", (ContentValues)localObject, "username = ?", new String[] { bo.vA(paramString) }) > 0)
        {
          AppMethodBeat.o(1093);
          bool = true;
          continue;
        }
        AppMethodBeat.o(1093);
        bool = false;
      }
      catch (Exception paramd)
      {
        while (true)
          paramd = (d)localObject;
      }
    }
  }

  public final boolean apK()
  {
    return true;
  }

  public final long b(w paramw)
  {
    AppMethodBeat.i(1081);
    long l;
    if (paramw == null)
    {
      l = -1L;
      AppMethodBeat.o(1081);
    }
    while (true)
    {
      return l;
      ContentValues localContentValues = paramw.Hl();
      l = this.fni.update("ChatroomMsgSeq", localContentValues, "username = ?", new String[] { paramw.field_username });
      AppMethodBeat.o(1081);
    }
  }

  public final boolean bOu()
  {
    AppMethodBeat.i(1083);
    long l = this.fni.delete("ChatroomMsgSeq", "", null);
    ab.w("MicroMsg.ChatroomMsgSeqStorage", "[deleteTable] result:" + l + " table:ChatroomMsgSeq");
    boolean bool;
    if (l >= 0L)
    {
      bool = true;
      AppMethodBeat.o(1083);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(1083);
    }
  }

  public final c f(String paramString, long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(1096);
    paramString = QK(paramString);
    if (paramString.eoG.size() <= 0)
    {
      AppMethodBeat.o(1096);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      Iterator localIterator = paramString.eoG.iterator();
      while (true)
        if (localIterator.hasNext())
        {
          paramString = (c)localIterator.next();
          if (!paramBoolean)
          {
            if (paramString.eoF <= paramLong)
              continue;
            AppMethodBeat.o(1096);
            break;
          }
          if (paramString.eoE > paramLong)
          {
            AppMethodBeat.o(1096);
            break;
          }
        }
      AppMethodBeat.o(1096);
      paramString = null;
    }
  }

  public final int o(String paramString, long paramLong1, long paramLong2)
  {
    int i = 0;
    AppMethodBeat.i(1100);
    paramString = QN(paramString).field_seqBlockInfo;
    if (paramString == null)
    {
      ab.i("MicroMsg.ChatroomMsgSeqStorage", "[getBlockCount] seqBlockInfo is null!");
      AppMethodBeat.o(1100);
      return i;
    }
    paramString = paramString.eoG.iterator();
    i = 0;
    label52: if (paramString.hasNext())
    {
      c localc = (c)paramString.next();
      if ((paramLong1 > localc.eoE) || (localc.eoF > paramLong2))
        break label108;
      i++;
    }
    label108: 
    while (true)
    {
      break label52;
      AppMethodBeat.o(1100);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.x
 * JD-Core Version:    0.6.2
 */