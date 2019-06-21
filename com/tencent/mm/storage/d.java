package com.tencent.mm.storage;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.za;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class d extends j<c>
{
  public static final String[] fnj;
  private final e bSd;

  static
  {
    AppMethodBeat.i(118217);
    fnj = new String[] { j.a(c.ccO, "ABTestItem") };
    AppMethodBeat.o(118217);
  }

  public d(e parame)
  {
    super(parame, c.ccO, "ABTestItem", null);
    this.bSd = parame;
  }

  public final Map<String, c> aof(String paramString)
  {
    AppMethodBeat.i(118213);
    if (bo.isNullOrNil(paramString))
    {
      paramString = null;
      if ((paramString != null) && (paramString.moveToFirst()))
        break label88;
      if (paramString != null)
        paramString.close();
      paramString = new HashMap(0);
      AppMethodBeat.o(118213);
    }
    while (true)
    {
      return paramString;
      paramString = rawQuery(String.format("select * from %s where %s = %s", new Object[] { "ABTestItem", "business", paramString }), new String[0]);
      break;
      label88: HashMap localHashMap = new HashMap();
      do
      {
        c localc = new c();
        localc.d(paramString);
        localHashMap.put(localc.field_layerId, localc);
      }
      while (paramString.moveToNext());
      paramString.close();
      AppMethodBeat.o(118213);
      paramString = localHashMap;
    }
  }

  public final LinkedList<za> drs()
  {
    AppMethodBeat.i(118216);
    LinkedList localLinkedList = new LinkedList();
    Cursor localCursor = baR();
    if ((localCursor == null) || (!localCursor.moveToFirst()))
      AppMethodBeat.o(118216);
    while (true)
    {
      return localLinkedList;
      c localc = new c();
      label46: localc.d(localCursor);
      za localza = new za();
      try
      {
        localza.wcM = bo.getInt(localc.field_expId, 0);
        localza.priority = localc.field_prioritylevel;
        localLinkedList.add(localza);
        if (localCursor.moveToNext())
          break label46;
        localCursor.close();
        AppMethodBeat.o(118216);
      }
      catch (Exception localException)
      {
        while (true)
          ab.e("MicroMsg.ABTestStorage", "expId parse failed, %s", new Object[] { localc.field_expId });
      }
    }
  }

  public final String drt()
  {
    AppMethodBeat.i(118215);
    Cursor localCursor = baR();
    Object localObject;
    if (localCursor == null)
    {
      localObject = "null cursor!!";
      AppMethodBeat.o(118215);
    }
    while (true)
    {
      return localObject;
      if (!localCursor.moveToFirst())
      {
        localCursor.close();
        localObject = "cursor empty!!";
        AppMethodBeat.o(118215);
      }
      else
      {
        localObject = new StringBuilder();
        c localc = new c();
        do
        {
          ((StringBuilder)localObject).append("============\n");
          localc.d(localCursor);
          ((StringBuilder)localObject).append("layerId = ").append(localc.field_layerId).append("\n");
          ((StringBuilder)localObject).append("sequence = ").append(localc.field_sequence).append("\n");
          ((StringBuilder)localObject).append("priorityLV = ").append(localc.field_prioritylevel).append("\n");
          ((StringBuilder)localObject).append("expId = ").append(localc.field_expId).append("\n");
        }
        while (localCursor.moveToNext());
        localCursor.close();
        localObject = ((StringBuilder)localObject).toString();
        AppMethodBeat.o(118215);
      }
    }
  }

  public final c ll(String paramString)
  {
    AppMethodBeat.i(118212);
    c localc = new c();
    localc.field_layerId = paramString;
    boolean bool = super.b(localc, new String[0]);
    if ((bool) && (localc.field_endTime == 0L))
      localc.field_endTime = 9223372036854775807L;
    ab.i("MicroMsg.ABTestStorage", "getByLayerId, id: %s, return: %b", new Object[] { paramString, Boolean.valueOf(bool) });
    AppMethodBeat.o(118212);
    return localc;
  }

  public final void s(List<c> paramList, int paramInt)
  {
    AppMethodBeat.i(118214);
    int i = 0;
    long l = bo.anT();
    this.bSd.delete("ABTestItem", String.format(Locale.US, "%s<>0 and %s<%d", new Object[] { "endTime", "endTime", Long.valueOf(l) }), null);
    c localc1;
    if (paramInt == 0)
    {
      localc1 = new c();
      localc1.field_prioritylevel = 1;
      a(localc1, false, new String[] { "prioritylevel" });
    }
    paramList = paramList.iterator();
    paramInt = i;
    boolean bool;
    if (paramList.hasNext())
    {
      localc1 = (c)paramList.next();
      if ((localc1 == null) || (bo.isNullOrNil(localc1.field_layerId)))
      {
        ab.e("MicroMsg.ABTestStorage", "saveIfNecessary, Invalid item");
        bool = false;
        label147: if (!bool)
          break label445;
        paramInt = 1;
      }
    }
    label445: 
    while (true)
    {
      break;
      c localc2 = new c();
      localc2.field_layerId = localc1.field_layerId;
      if (!super.b(localc2, new String[0]))
      {
        bool = super.a(localc1, false);
        ab.i("MicroMsg.ABTestStorage", "Inserted: %s, Result: %b", new Object[] { localc1.field_layerId, Boolean.valueOf(bool) });
        break label147;
      }
      if (((localc1.field_sequence > localc2.field_sequence) && (localc1.field_prioritylevel == localc2.field_prioritylevel)) || (localc1.field_prioritylevel > localc2.field_prioritylevel))
      {
        bool = super.b(localc1, false, new String[0]);
        ab.i("MicroMsg.ABTestStorage", "Updated: %s, Result: %b, Seq: %d, %d, PriorityLV: %d, %d", new Object[] { localc1.field_layerId, Boolean.valueOf(bool), Long.valueOf(localc2.field_sequence), Long.valueOf(localc1.field_sequence), Integer.valueOf(localc2.field_prioritylevel), Integer.valueOf(localc1.field_prioritylevel) });
        break label147;
      }
      ab.i("MicroMsg.ABTestStorage", "Ignored: %s, Seq: %d, %d, PriorityLV: %d, %d", new Object[] { localc1.field_layerId, Long.valueOf(localc2.field_sequence), Long.valueOf(localc1.field_sequence), Integer.valueOf(localc2.field_prioritylevel), Integer.valueOf(localc1.field_prioritylevel) });
      bool = false;
      break label147;
      if (paramInt != 0)
        anF("event_updated");
      AppMethodBeat.o(118214);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.d
 * JD-Core Version:    0.6.2
 */