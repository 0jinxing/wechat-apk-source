package com.tencent.mm.storage;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.protocal.protobuf.go;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.LinkedList;

public final class n extends j<m>
{
  public static final String[] fnj;
  public e bSd;

  static
  {
    AppMethodBeat.i(29022);
    fnj = new String[] { j.a(m.ccO, "BackupTempMoveTime") };
    AppMethodBeat.o(29022);
  }

  public n(h paramh)
  {
    super(paramh, m.ccO, "BackupTempMoveTime", null);
    this.bSd = paramh;
  }

  public final void a(LinkedList<String> paramLinkedList1, LinkedList<Long> paramLinkedList2, LinkedList<String> paramLinkedList3, LinkedList<Long> paramLinkedList4)
  {
    AppMethodBeat.i(29019);
    if (getCount() <= 0)
    {
      paramLinkedList3.addAll(paramLinkedList1);
      paramLinkedList4.addAll(paramLinkedList2);
      AppMethodBeat.o(29019);
      return;
    }
    paramLinkedList2 = paramLinkedList2.iterator();
    Iterator localIterator = paramLinkedList1.iterator();
    label44: String str;
    int i;
    long l1;
    long l2;
    long l3;
    Object localObject;
    label365: int j;
    label368: int k;
    while (true)
      if (localIterator.hasNext())
      {
        str = (String)localIterator.next();
        i = 0;
        if (paramLinkedList2.hasNext())
        {
          l1 = ((Long)paramLinkedList2.next()).longValue();
          if (paramLinkedList2.hasNext())
          {
            l2 = ((Long)paramLinkedList2.next()).longValue();
            l3 = l2;
            if (l2 == 0L)
              l3 = 9223372036854775807L;
            paramLinkedList1 = new LinkedList();
            localObject = "SELECT * FROM BackupTempMoveTime WHERE sessionName = \"" + str + "\" ";
            ab.d("MicroMsg.BackupTempMoveTimeStorage", "getTempMoveTimeBySession:".concat(String.valueOf(localObject)));
            Cursor localCursor = this.bSd.rawQuery((String)localObject, null);
            if (localCursor == null)
            {
              ab.e("MicroMsg.BackupTempMoveTimeStorage", "getTempMoveTimeBySession failed, sessionName:%s ", new Object[] { str });
              paramLinkedList1 = null;
            }
            while (true)
            {
              if ((paramLinkedList1 != null) && (paramLinkedList1.size() > 0) && (l3 >= ((go)paramLinkedList1.getFirst()).startTime) && (l1 <= ((go)paramLinkedList1.getLast()).endTime))
                break label365;
              paramLinkedList3.add(str);
              paramLinkedList4.add(Long.valueOf(l1));
              paramLinkedList4.add(Long.valueOf(l3));
              break;
              while (localCursor.moveToNext())
              {
                localObject = new m();
                ((m)localObject).d(localCursor);
                go localgo = new go();
                localgo.startTime = ((m)localObject).field_startTime;
                localgo.endTime = ((m)localObject).field_endTime;
                paramLinkedList1.add(localgo);
              }
              localCursor.close();
            }
            j = 0;
            if ((j >= paramLinkedList1.size()) || (l1 > l3))
              break label604;
            localObject = (go)paramLinkedList1.get(j);
            k = i;
            l2 = l1;
            if (l1 <= ((go)localObject).endTime)
              if (l1 < ((go)localObject).startTime)
              {
                i = 1;
                paramLinkedList3.add(str);
                paramLinkedList4.add(Long.valueOf(l1));
                if (l3 < ((go)localObject).startTime)
                {
                  paramLinkedList4.add(Long.valueOf(l3));
                  l1 = ((go)localObject).startTime;
                  i = 1;
                }
              }
          }
        }
      }
    label604: 
    while (true)
    {
      if (l1 <= l3)
      {
        paramLinkedList3.add(str);
        paramLinkedList4.add(Long.valueOf(l1));
        paramLinkedList4.add(Long.valueOf(l3));
        i = 1;
      }
      if (i != 0)
        break label44;
      paramLinkedList3.add(str);
      paramLinkedList4.add(Long.valueOf(l1));
      paramLinkedList4.add(Long.valueOf(l3));
      break label44;
      paramLinkedList4.add(Long.valueOf(((go)localObject).startTime));
      l2 = ((go)localObject).endTime;
      k = i;
      j++;
      i = k;
      l1 = l2;
      break label368;
      AppMethodBeat.o(29019);
      break;
    }
  }

  public final boolean drx()
  {
    AppMethodBeat.i(29020);
    boolean bool = this.bSd.hY("BackupTempMoveTime", "delete from BackupTempMoveTime");
    ab.i("MicroMsg.BackupTempMoveTimeStorage", "deleteAllData, result:%b", new Object[] { Boolean.valueOf(bool) });
    AppMethodBeat.o(29020);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.n
 * JD-Core Version:    0.6.2
 */