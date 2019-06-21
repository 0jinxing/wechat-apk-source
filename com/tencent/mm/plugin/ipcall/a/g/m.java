package com.tencent.mm.plugin.ipcall.a.g;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.plugin.ipcall.b.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

public final class m
{
  public static Cursor OW(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(21950);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(21950);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      paramString = i.bHw().OQ(paramString);
      if ((paramString != null) && (paramString.xDa != -1L))
      {
        long l = paramString.xDa;
        paramString = i.bHx().bSd.query("IPCallRecord", l.nzF, "addressId=?", new String[] { String.valueOf(l) }, null, null, "calltime desc limit 4");
        AppMethodBeat.o(21950);
      }
      else
      {
        AppMethodBeat.o(21950);
        paramString = localObject;
      }
    }
  }

  public static k a(k paramk, long paramLong)
  {
    AppMethodBeat.i(21949);
    if (paramk == null)
    {
      paramk = null;
      AppMethodBeat.o(21949);
    }
    while (true)
    {
      return paramk;
      ab.d("MicroMsg.IPCallRecordStorageLogic", "recordSelfShutdownCall, localId: %d, talkTime: %d", new Object[] { Long.valueOf(paramk.xDa), Long.valueOf(paramLong) });
      if (paramk.xDa != -1L)
      {
        paramk.field_status = 4;
        paramk.field_duration = paramLong;
        i.bHx().a(paramk);
      }
      AppMethodBeat.o(21949);
    }
  }

  public static k b(k paramk)
  {
    AppMethodBeat.i(21948);
    if (paramk == null)
    {
      paramk = null;
      AppMethodBeat.o(21948);
    }
    while (true)
    {
      return paramk;
      ab.d("MicroMsg.IPCallRecordStorageLogic", "recordCancelCall, localId: %d", new Object[] { Long.valueOf(paramk.xDa) });
      if (paramk.xDa != -1L)
      {
        paramk.field_status = 7;
        i.bHx().a(paramk);
      }
      AppMethodBeat.o(21948);
    }
  }

  public static ArrayList<k> bIb()
  {
    AppMethodBeat.i(21951);
    long l1 = System.currentTimeMillis();
    Object localObject1 = i.bHx();
    Object localObject2 = Calendar.getInstance();
    ((Calendar)localObject2).add(6, -30);
    long l2 = ((Calendar)localObject2).getTimeInMillis();
    localObject1 = ((l)localObject1).bSd.query("IPCallRecord", l.nzF, "calltime>=?", new String[] { String.valueOf(l2) }, "addressId, phonenumber", null, "calltime desc");
    if (((Cursor)localObject1).getCount() < 30)
    {
      ((Cursor)localObject1).close();
      localObject1 = i.bHx().bSd.query("IPCallRecord", l.nzF, null, null, "addressId, phonenumber", null, "calltime desc");
    }
    while (true)
    {
      ab.d("MicroMsg.IPCallRecordStorageLogic", "finish query used %dms", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
      HashMap localHashMap = new HashMap();
      localObject2 = new ArrayList();
      while (true)
      {
        try
        {
          if (!((Cursor)localObject1).moveToFirst())
            break label646;
          if ((((Cursor)localObject1).isAfterLast()) || (((ArrayList)localObject2).size() > 30))
            break label646;
          k localk1 = new com/tencent/mm/plugin/ipcall/a/g/k;
          localk1.<init>();
          localk1.d((Cursor)localObject1);
          if (localk1.field_addressId != -1L)
          {
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            if (!localHashMap.containsKey(localk1.field_addressId))
            {
              localObject4 = new java/lang/StringBuilder;
              ((StringBuilder)localObject4).<init>();
              localHashMap.put(localk1.field_addressId, localk1);
              ((ArrayList)localObject2).add(localk1);
            }
            ((Cursor)localObject1).moveToNext();
            continue;
          }
        }
        catch (Exception localException)
        {
          ab.e("MicroMsg.IPCallRecordStorageLogic", "getRecentRecordGroupByUser error: %s", new Object[] { localException.getMessage() });
          ((Cursor)localObject1).close();
          ab.d("MicroMsg.IPCallRecordStorageLogic", "getRecentRecordGroupByUser, used: %dms", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
          AppMethodBeat.o(21951);
          return localObject2;
          localObject4 = a.aF(ah.getContext(), localException.field_phonenumber);
          localObject4 = i.bHw().OR((String)localObject4);
          if (localObject4 == null)
            break label610;
          Object localObject5 = i.bHx();
          if ((((l)localObject5).bSd instanceof h))
          {
            l2 = ((h)((l)localObject5).bSd).iV(-1L);
            localObject5 = i.bHx().OV(localException.field_phonenumber);
            if (!((Cursor)localObject5).moveToFirst())
              break label499;
            if (((Cursor)localObject5).isAfterLast())
              break label499;
            k localk2 = new com/tencent/mm/plugin/ipcall/a/g/k;
            localk2.<init>();
            localk2.d((Cursor)localObject5);
            localk2.field_addressId = ((c)localObject4).xDa;
            i.bHx().a(localk2);
            ((Cursor)localObject5).moveToNext();
            continue;
          }
        }
        finally
        {
          ((Cursor)localObject1).close();
          AppMethodBeat.o(21951);
        }
        l2 = -1L;
        continue;
        label499: Object localObject4 = i.bHx();
        if (((((l)localObject4).bSd instanceof h)) && (l2 != -1L))
          ((h)((l)localObject4).bSd).mB(l2);
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        label646: if (!localHashMap.containsKey(localException.field_addressId))
        {
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          localHashMap.put(localException.field_addressId, localException);
          localObject3.add(localException);
          continue;
          label610: if (!localHashMap.containsKey(localException.field_phonenumber))
          {
            localHashMap.put(localException.field_phonenumber, localException);
            localObject3.add(localException);
            continue;
            ((Cursor)localObject1).close();
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.g.m
 * JD-Core Version:    0.6.2
 */