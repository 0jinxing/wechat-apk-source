package com.tencent.mm.storage;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.za;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public final class b extends j<a>
{
  public static final String[] fnj;
  private e bSd;

  static
  {
    AppMethodBeat.i(118208);
    fnj = new String[] { j.a(a.ccO, "ABTestInfo") };
    AppMethodBeat.o(118208);
  }

  public b(e parame)
  {
    super(parame, a.ccO, "ABTestInfo", null);
    this.bSd = parame;
  }

  public final a aoe(String paramString)
  {
    AppMethodBeat.i(118204);
    a locala = new a();
    locala.field_abtestkey = paramString;
    boolean bool = super.b(locala, new String[0]);
    if ((bool) && (locala.field_endTime == 0L))
      locala.field_endTime = 9223372036854775807L;
    ab.i("MicroMsg.ABTestInfoStorage", "getByLayerId, id: %s, return: %b", new Object[] { paramString, Boolean.valueOf(bool) });
    AppMethodBeat.o(118204);
    return locala;
  }

  public final LinkedList<za> drs()
  {
    AppMethodBeat.i(118203);
    LinkedList localLinkedList = new LinkedList();
    Cursor localCursor = baR();
    if (localCursor == null)
      AppMethodBeat.o(118203);
    while (true)
    {
      return localLinkedList;
      if (!localCursor.moveToFirst())
      {
        localCursor.close();
        AppMethodBeat.o(118203);
        continue;
      }
      a locala = new a();
      label60: locala.d(localCursor);
      za localza = new za();
      try
      {
        localza.wcM = bo.getInt(locala.field_expId, 0);
        localza.priority = locala.field_prioritylevel;
        localLinkedList.add(localza);
        if (localCursor.moveToNext())
          break label60;
        localCursor.close();
        AppMethodBeat.o(118203);
      }
      catch (Exception localException)
      {
        while (true)
          ab.e("MicroMsg.ABTestInfoStorage", "expId parse failed, %s", new Object[] { locala.field_expId });
      }
    }
  }

  public final String drt()
  {
    AppMethodBeat.i(118207);
    Object localObject = baR();
    if (localObject == null)
    {
      localObject = "null cursor!!";
      AppMethodBeat.o(118207);
    }
    while (true)
    {
      return localObject;
      if (!((Cursor)localObject).moveToFirst())
      {
        ((Cursor)localObject).close();
        localObject = "cursor empty!!";
        AppMethodBeat.o(118207);
      }
      else
      {
        StringBuilder localStringBuilder = new StringBuilder();
        a locala = new a();
        do
        {
          localStringBuilder.append("============\n");
          locala.d((Cursor)localObject);
          localStringBuilder.append("abtestkey = ").append(locala.field_abtestkey).append("\n");
          localStringBuilder.append("sequence = ").append(locala.field_sequence).append("\n");
          localStringBuilder.append("priorityLV = ").append(locala.field_prioritylevel).append("\n");
          localStringBuilder.append("expId = ").append(locala.field_expId).append("\n");
        }
        while (((Cursor)localObject).moveToNext());
        ((Cursor)localObject).close();
        localObject = localStringBuilder.toString();
        AppMethodBeat.o(118207);
      }
    }
  }

  public final int en(String paramString, int paramInt)
  {
    AppMethodBeat.i(118205);
    paramString = aoe(paramString);
    if (paramString.isValid())
    {
      paramInt = bo.getInt(paramString.field_value, paramInt);
      AppMethodBeat.o(118205);
    }
    while (true)
    {
      return paramInt;
      AppMethodBeat.o(118205);
    }
  }

  public final String getExpIdByKey(String paramString)
  {
    AppMethodBeat.i(118206);
    paramString = aoe(paramString);
    if (paramString.isValid())
      if (paramString.field_expId == null)
      {
        paramString = "";
        AppMethodBeat.o(118206);
      }
    while (true)
    {
      return paramString;
      paramString = paramString.field_expId;
      AppMethodBeat.o(118206);
      continue;
      paramString = "";
      AppMethodBeat.o(118206);
    }
  }

  public final void s(List<a> paramList, int paramInt)
  {
    AppMethodBeat.i(118202);
    int i = 0;
    long l = bo.anT();
    this.bSd.delete("ABTestInfo", String.format(Locale.US, "%s<>0 and %s<%d", new Object[] { "endTime", "endTime", Long.valueOf(l) }), null);
    if (1 == paramInt)
    {
      localObject = new a();
      ((a)localObject).field_prioritylevel = 1;
      a((c)localObject, false, new String[] { "prioritylevel" });
    }
    Object localObject = paramList.iterator();
    paramInt = i;
    a locala;
    boolean bool;
    if (((Iterator)localObject).hasNext())
    {
      locala = (a)((Iterator)localObject).next();
      if ((locala == null) || (bo.isNullOrNil(locala.field_abtestkey)))
      {
        ab.e("MicroMsg.ABTestInfoStorage", "saveIfNecessary, Invalid item");
        bool = false;
        label150: if (!bool)
          break label438;
        paramInt = 1;
      }
    }
    label438: 
    while (true)
    {
      break;
      paramList = new a();
      paramList.field_abtestkey = locala.field_abtestkey;
      if (!super.b(paramList, new String[0]))
      {
        bool = super.a(locala, false);
        ab.i("MicroMsg.ABTestInfoStorage", "Inserted: %s, Result: %b", new Object[] { locala.field_abtestkey, Boolean.valueOf(bool) });
        break label150;
      }
      if (((locala.field_sequence > paramList.field_sequence) && (locala.field_prioritylevel == paramList.field_prioritylevel)) || (locala.field_prioritylevel > paramList.field_prioritylevel))
      {
        bool = super.b(locala, false, new String[0]);
        ab.i("MicroMsg.ABTestInfoStorage", "Updated: %s, Result: %b, Seq: %d, %d, PriorityLV: %d, %d", new Object[] { locala.field_abtestkey, Boolean.valueOf(bool), Long.valueOf(paramList.field_sequence), Long.valueOf(locala.field_sequence), Integer.valueOf(paramList.field_prioritylevel), Integer.valueOf(locala.field_prioritylevel) });
        break label150;
      }
      ab.i("MicroMsg.ABTestInfoStorage", "Ignored: %s, Seq: %d, %d, PriorityLV: %d, %d", new Object[] { locala.field_abtestkey, Long.valueOf(paramList.field_sequence), Long.valueOf(locala.field_sequence), Integer.valueOf(paramList.field_prioritylevel), Integer.valueOf(locala.field_prioritylevel) });
      bool = false;
      break label150;
      if (paramInt != 0)
        anF("event_updated");
      AppMethodBeat.o(118202);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.b
 * JD-Core Version:    0.6.2
 */