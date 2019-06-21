package com.tencent.mm.storage;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.protocal.protobuf.go;
import com.tencent.mm.protocal.protobuf.gp;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public final class j extends com.tencent.mm.sdk.e.j<i>
{
  public static final String[] fnj;
  public e bSd;

  static
  {
    AppMethodBeat.i(29009);
    fnj = new String[] { com.tencent.mm.sdk.e.j.a(i.ccO, "BackupMoveTime") };
    AppMethodBeat.o(29009);
  }

  public j(h paramh)
  {
    super(paramh, i.ccO, "BackupMoveTime", null);
    AppMethodBeat.i(29003);
    this.bSd = paramh;
    long l1 = System.currentTimeMillis();
    long l2 = paramh.iV(Thread.currentThread().getId());
    long l3 = System.currentTimeMillis();
    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(Arrays.asList(new String[] { "CREATE INDEX IF NOT EXISTS DeviceIdSessionIndex ON BackupMoveTime ( deviceId,sessionName )" }));
    for (int i = 0; i < localArrayList.size(); i++)
      paramh.hY("BackupMoveTime", (String)localArrayList.get(i));
    ab.d("MicroMsg.BackupMoveTimeStorage", "build new index last time[%d]", new Object[] { Long.valueOf(System.currentTimeMillis() - l3) });
    paramh.mB(l2);
    ab.i("MicroMsg.BackupMoveTimeStorage", "executeInitSQL last time[%d]", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
    AppMethodBeat.o(29003);
  }

  private static void a(LinkedList<go> paramLinkedList, m paramm)
  {
    AppMethodBeat.i(29006);
    if (paramm.field_startTime > paramm.field_endTime)
    {
      AppMethodBeat.o(29006);
      return;
    }
    Object localObject = paramLinkedList.iterator();
    go localgo1;
    int i;
    while (true)
      if (((Iterator)localObject).hasNext())
      {
        localgo1 = (go)((Iterator)localObject).next();
        if (paramm.field_startTime < localgo1.endTime)
          if (paramm.field_endTime < localgo1.startTime)
          {
            localObject = new go();
            ((go)localObject).startTime = paramm.field_startTime;
            ((go)localObject).endTime = paramm.field_endTime;
            paramLinkedList.add(localObject);
            i = 1;
          }
      }
    while (true)
    {
      if (i == 0)
      {
        localObject = new go();
        ((go)localObject).startTime = paramm.field_startTime;
        ((go)localObject).endTime = paramm.field_endTime;
        paramLinkedList.add(localObject);
      }
      AppMethodBeat.o(29006);
      break;
      if (paramm.field_startTime < localgo1.startTime)
        localgo1.startTime = paramm.field_startTime;
      if (paramm.field_endTime > localgo1.endTime)
      {
        localgo1.endTime = paramm.field_endTime;
        while (true)
        {
          if (!((Iterator)localObject).hasNext())
            break label266;
          go localgo2 = (go)((Iterator)localObject).next();
          if (paramm.field_endTime <= localgo2.startTime)
            break label266;
          if (paramm.field_endTime <= localgo2.endTime)
          {
            localgo1.endTime = localgo2.endTime;
            ((Iterator)localObject).remove();
            i = 1;
            break;
          }
          ((Iterator)localObject).remove();
        }
      }
      label266: i = 1;
      continue;
      i = 0;
    }
  }

  public final void a(String paramString, LinkedList<String> paramLinkedList1, LinkedList<Long> paramLinkedList2, LinkedList<String> paramLinkedList3, LinkedList<Long> paramLinkedList4)
  {
    AppMethodBeat.i(29004);
    paramLinkedList2 = paramLinkedList2.iterator();
    Iterator localIterator = paramLinkedList1.iterator();
    String str;
    int i;
    long l1;
    long l2;
    long l3;
    label323: int j;
    label332: int k;
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
            paramLinkedList1 = "SELECT * FROM BackupMoveTime WHERE deviceId = \"" + paramString + "\" AND sessionName = \"" + str + "\" ";
            ab.d("MicroMsg.BackupMoveTimeStorage", "getMoveTimeByDeviceIdSession:".concat(String.valueOf(paramLinkedList1)));
            paramLinkedList1 = this.bSd.rawQuery(paramLinkedList1, null);
            if (paramLinkedList1 == null)
            {
              ab.e("MicroMsg.BackupMoveTimeStorage", "getMoveTimeByDeviceIdSession failed, deviceid:%s, sessionName:%s ", new Object[] { paramString, str });
              paramLinkedList1 = null;
            }
            while (true)
            {
              if ((paramLinkedList1 != null) && (paramLinkedList1.vIM.size() > 0) && (l3 >= ((go)paramLinkedList1.vIM.getFirst()).startTime) && (l1 <= ((go)paramLinkedList1.vIM.getLast()).endTime))
                break label323;
              paramLinkedList3.add(str);
              paramLinkedList4.add(Long.valueOf(l1));
              paramLinkedList4.add(Long.valueOf(l3));
              break;
              if (paramLinkedList1.moveToFirst())
              {
                localObject = new i();
                ((i)localObject).d(paramLinkedList1);
                paramLinkedList1.close();
                paramLinkedList1 = ((i)localObject).field_moveTime;
              }
              else
              {
                paramLinkedList1.close();
                paramLinkedList1 = null;
              }
            }
            Object localObject = paramLinkedList1.vIM;
            j = 0;
            if ((j >= ((LinkedList)localObject).size()) || (l1 > l3))
              break label564;
            paramLinkedList1 = (go)((LinkedList)localObject).get(j);
            k = i;
            l2 = l1;
            if (l1 <= paramLinkedList1.endTime)
              if (l1 < paramLinkedList1.startTime)
              {
                i = 1;
                paramLinkedList3.add(str);
                paramLinkedList4.add(Long.valueOf(l1));
                if (l3 < paramLinkedList1.startTime)
                {
                  paramLinkedList4.add(Long.valueOf(l3));
                  l1 = paramLinkedList1.startTime;
                  i = 1;
                }
              }
          }
        }
      }
    label564: 
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
        break;
      paramLinkedList3.add(str);
      paramLinkedList4.add(Long.valueOf(l1));
      paramLinkedList4.add(Long.valueOf(l3));
      break;
      paramLinkedList4.add(Long.valueOf(paramLinkedList1.startTime));
      l2 = paramLinkedList1.endTime;
      k = i;
      j++;
      i = k;
      l1 = l2;
      break label332;
      AppMethodBeat.o(29004);
      return;
    }
  }

  public final boolean drx()
  {
    AppMethodBeat.i(29007);
    boolean bool = this.bSd.hY("BackupMoveTime", "delete from BackupMoveTime");
    ab.i("MicroMsg.BackupMoveTimeStorage", "deleteAllData, result:%b", new Object[] { Boolean.valueOf(bool) });
    AppMethodBeat.o(29007);
    return bool;
  }

  public final void f(String paramString, LinkedList<m> paramLinkedList)
  {
    AppMethodBeat.i(29005);
    ab.i("MicroMsg.BackupMoveTimeStorage", "start mergeDataByDeviceIdSession.");
    HashMap localHashMap = new HashMap();
    Object localObject1 = "SELECT * FROM BackupMoveTime WHERE deviceId = \"" + paramString + "\" ";
    ab.d("MicroMsg.BackupMoveTimeStorage", "getAllDataByDevice:".concat(String.valueOf(localObject1)));
    Object localObject2 = this.bSd.rawQuery((String)localObject1, null);
    if (localObject2 == null)
    {
      ab.e("MicroMsg.BackupMoveTimeStorage", "getAllDataByDevice failed, deviceid:%s", new Object[] { paramString });
      if (this.bSd.delete("BackupMoveTime", "deviceId= ? ", new String[] { String.valueOf(paramString) }) >= 0)
        break label198;
      ab.e("MicroMsg.BackupMoveTimeStorage", "mergeDataByDeviceId delete db failed, deviceid:%s", new Object[] { paramString });
      AppMethodBeat.o(29005);
    }
    while (true)
    {
      return;
      while (((Cursor)localObject2).moveToNext())
      {
        localObject1 = new i();
        ((i)localObject1).d((Cursor)localObject2);
        localHashMap.put(((i)localObject1).field_sessionName, localObject1);
      }
      ((Cursor)localObject2).close();
      break;
      label198: localObject1 = paramLinkedList.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        paramLinkedList = (m)((Iterator)localObject1).next();
        localObject2 = (i)localHashMap.get(paramLinkedList.field_sessionName);
        if (localObject2 == null)
        {
          localObject2 = new go();
          ((go)localObject2).startTime = paramLinkedList.field_startTime;
          ((go)localObject2).endTime = paramLinkedList.field_endTime;
          i locali = new i();
          locali.field_deviceId = paramString;
          locali.field_sessionName = paramLinkedList.field_sessionName;
          locali.field_moveTime = new gp();
          locali.field_moveTime.vIM = new LinkedList();
          locali.field_moveTime.vIM.add(localObject2);
          localHashMap.put(paramLinkedList.field_sessionName, locali);
        }
        else
        {
          a(((i)localObject2).field_moveTime.vIM, paramLinkedList);
        }
      }
      paramString = localHashMap.keySet().iterator();
      while (paramString.hasNext())
      {
        paramLinkedList = (String)paramString.next();
        ab.i("MicroMsg.BackupMoveTimeStorage", "mergeDataByDeviceId insert BackupMoveTimeStorage ret[%b], sessionName:%s", new Object[] { Boolean.valueOf(b((c)localHashMap.get(paramLinkedList))), paramLinkedList });
      }
      AppMethodBeat.o(29005);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.j
 * JD-Core Version:    0.6.2
 */