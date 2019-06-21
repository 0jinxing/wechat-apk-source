package com.tencent.mm.plugin.record.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.record.a.g;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;
import java.util.List;

public final class m extends com.tencent.mm.sdk.e.j<com.tencent.mm.plugin.record.a.j>
  implements g
{
  private e bSd;

  public m(e parame)
  {
    super(parame, com.tencent.mm.plugin.record.a.j.ccO, "RecordMessageInfo", null);
    this.bSd = parame;
  }

  public final void BF(int paramInt)
  {
    AppMethodBeat.i(135695);
    ab.d("MicroMsg.RecordMsgStorage", "delete record msg item, local id %d, result %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.bSd.delete("RecordMessageInfo", "localId=?", new String[] { String.valueOf(paramInt) })) });
    AppMethodBeat.o(135695);
  }

  public final com.tencent.mm.plugin.record.a.j BG(int paramInt)
  {
    Object localObject1 = null;
    AppMethodBeat.i(135696);
    Object localObject2 = "SELECT * FROM RecordMessageInfo WHERE localId=".concat(String.valueOf(paramInt));
    ab.d("MicroMsg.RecordMsgStorage", "get by local id, sql[%s], local[%d]", new Object[] { localObject2, Integer.valueOf(paramInt) });
    Cursor localCursor = this.bSd.a((String)localObject2, null, 2);
    localObject2 = localObject1;
    if (localCursor != null)
    {
      localObject2 = localObject1;
      if (localCursor.moveToFirst())
      {
        localObject2 = new com.tencent.mm.plugin.record.a.j();
        ((com.tencent.mm.plugin.record.a.j)localObject2).d(localCursor);
      }
    }
    if (localCursor != null)
      localCursor.close();
    AppMethodBeat.o(135696);
    return localObject2;
  }

  public final List<com.tencent.mm.plugin.record.a.j> ceB()
  {
    AppMethodBeat.i(135694);
    LinkedList localLinkedList = new LinkedList();
    Cursor localCursor = baR();
    if (localCursor != null)
    {
      localCursor.moveToFirst();
      while (true)
        if (!localCursor.isAfterLast())
        {
          com.tencent.mm.plugin.record.a.j localj = new com.tencent.mm.plugin.record.a.j();
          try
          {
            localj.d(localCursor);
            localLinkedList.add(localj);
            localCursor.moveToNext();
          }
          catch (Exception localException)
          {
            while (true)
              ab.e("MicroMsg.RecordMsgStorage", "convert recordInfo Exception: " + localException.getMessage());
          }
        }
      localCursor.close();
    }
    ab.d("MicroMsg.RecordMsgStorage", "get all finish, result count %d", new Object[] { Integer.valueOf(localLinkedList.size()) });
    AppMethodBeat.o(135694);
    return localLinkedList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.b.m
 * JD-Core Version:    0.6.2
 */