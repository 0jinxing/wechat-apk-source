package com.tencent.mm.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.an;
import com.tencent.mm.j.a.a.c;
import com.tencent.mm.j.a.a.d;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class w extends an
{
  protected static c.a ccO;

  static
  {
    AppMethodBeat.i(60106);
    c.a locala = new c.a();
    locala.xDb = new Field[6];
    locala.columns = new String[7];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "username";
    locala.xDd.put("username", "TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(" username TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "username";
    locala.columns[1] = "lastPushSeq";
    locala.xDd.put("lastPushSeq", "LONG");
    localStringBuilder.append(" lastPushSeq LONG");
    localStringBuilder.append(", ");
    locala.columns[2] = "lastLocalSeq";
    locala.xDd.put("lastLocalSeq", "LONG");
    localStringBuilder.append(" lastLocalSeq LONG");
    localStringBuilder.append(", ");
    locala.columns[3] = "lastPushCreateTime";
    locala.xDd.put("lastPushCreateTime", "LONG");
    localStringBuilder.append(" lastPushCreateTime LONG");
    localStringBuilder.append(", ");
    locala.columns[4] = "lastLocalCreateTime";
    locala.xDd.put("lastLocalCreateTime", "LONG");
    localStringBuilder.append(" lastLocalCreateTime LONG");
    localStringBuilder.append(", ");
    locala.columns[5] = "seqBlockInfo";
    locala.xDd.put("seqBlockInfo", "BLOB");
    localStringBuilder.append(" seqBlockInfo BLOB");
    locala.columns[6] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(60106);
  }

  public final c.a Ag()
  {
    return ccO;
  }

  public final List<c> mO(long paramLong)
  {
    AppMethodBeat.i(60103);
    LinkedList localLinkedList = new LinkedList();
    if (this.field_seqBlockInfo == null)
      AppMethodBeat.o(60103);
    while (true)
    {
      return localLinkedList;
      Iterator localIterator = this.field_seqBlockInfo.eoG.iterator();
      while (localIterator.hasNext())
      {
        c localc = (c)localIterator.next();
        if (localc.eoF <= paramLong)
          localLinkedList.add(localc);
      }
      AppMethodBeat.o(60103);
    }
  }

  public final List<c> mP(long paramLong)
  {
    AppMethodBeat.i(60104);
    LinkedList localLinkedList = new LinkedList();
    if (this.field_seqBlockInfo == null)
      AppMethodBeat.o(60104);
    while (true)
    {
      return localLinkedList;
      Iterator localIterator = this.field_seqBlockInfo.eoG.iterator();
      while (localIterator.hasNext())
      {
        c localc = (c)localIterator.next();
        if (localc.eoC > paramLong)
          localLinkedList.add(localc);
      }
      AppMethodBeat.o(60104);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(60105);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("username:").append(this.field_username).append(" ");
    ((StringBuilder)localObject).append("lastLocalSeq:").append(this.field_lastLocalSeq).append(" ");
    ((StringBuilder)localObject).append("lastPushSeq:").append(this.field_lastPushSeq).append(" ");
    if (this.field_seqBlockInfo != null)
    {
      ((StringBuilder)localObject).append("block:");
      Iterator localIterator = this.field_seqBlockInfo.eoG.iterator();
      while (localIterator.hasNext())
      {
        c localc = (c)localIterator.next();
        ((StringBuilder)localObject).append("[").append(localc.eoC).append(":").append(localc.eoD).append("][").append(localc.eoE).append(":").append(localc.eoF).append("] | ");
      }
    }
    localObject = ((StringBuilder)localObject).toString();
    AppMethodBeat.o(60105);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.w
 * JD-Core Version:    0.6.2
 */