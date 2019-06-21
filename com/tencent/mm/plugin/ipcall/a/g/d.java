package com.tencent.mm.plugin.ipcall.a.g;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.plugin.ipcall.b.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;

public final class d extends j<c>
{
  public static final String[] fnj;
  private static final String[] nzy;
  public e bSd;

  static
  {
    AppMethodBeat.i(21932);
    fnj = new String[] { j.a(c.ccO, "IPCallAddressItem") };
    nzy = new String[] { "*", "rowid" };
    AppMethodBeat.o(21932);
  }

  public d(e parame)
  {
    super(parame, c.ccO, "IPCallAddressItem", null);
    this.bSd = parame;
  }

  private Cursor OT(String paramString)
  {
    AppMethodBeat.i(21929);
    paramString = this.bSd.query("IPCallAddressItem", nzy, "systemAddressBookUsername LIKE ? or sortKey LIKE ?", new String[] { "%" + paramString + "%", "%" + paramString + "%" }, null, null, "upper(sortKey) asc");
    AppMethodBeat.o(21929);
    return paramString;
  }

  public final c OQ(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(21923);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(21923);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      Cursor localCursor = this.bSd.a("IPCallAddressItem", nzy, "contactId=?", new String[] { paramString }, null, null, null, 2);
      try
      {
        if (localCursor.moveToFirst())
        {
          paramString = new com/tencent/mm/plugin/ipcall/a/g/c;
          paramString.<init>();
          paramString.d(localCursor);
          if (localCursor != null)
            localCursor.close();
          AppMethodBeat.o(21923);
        }
        else
        {
          if (localCursor != null)
            localCursor.close();
          AppMethodBeat.o(21923);
          paramString = localObject;
        }
      }
      catch (Exception paramString)
      {
        while (true)
        {
          ab.e("MicroMsg.IPCallAddressStorage", "getByContactId error: %s", new Object[] { paramString.getMessage() });
          if (localCursor != null)
            localCursor.close();
        }
      }
      finally
      {
        if (localCursor != null)
          localCursor.close();
        AppMethodBeat.o(21923);
      }
    }
    throw paramString;
  }

  public final c OR(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(21924);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(21924);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      Cursor localCursor = this.bSd.a("IPCallAddressItem", nzy, "systemAddressBookUsername=?", new String[] { paramString }, null, null, null, 2);
      try
      {
        if (localCursor.moveToFirst())
        {
          paramString = new com/tencent/mm/plugin/ipcall/a/g/c;
          paramString.<init>();
          paramString.d(localCursor);
          if (localCursor != null)
            localCursor.close();
          AppMethodBeat.o(21924);
        }
        else
        {
          if (localCursor != null)
            localCursor.close();
          AppMethodBeat.o(21924);
          paramString = localObject;
        }
      }
      catch (Exception paramString)
      {
        while (true)
        {
          ab.d("MicroMsg.IPCallAddressStorage", "getByContactName error: %s", new Object[] { paramString.getMessage() });
          if (localCursor != null)
            localCursor.close();
        }
      }
      finally
      {
        if (localCursor != null)
          localCursor.close();
        AppMethodBeat.o(21924);
      }
    }
    throw paramString;
  }

  public final Cursor OS(String paramString)
  {
    AppMethodBeat.i(21928);
    System.currentTimeMillis();
    int i = 0;
    if (i < paramString.length())
      if (!Character.isDigit(paramString.charAt(i)))
      {
        i = 0;
        label33: if (i != 0)
          break label66;
      }
    for (paramString = OT(paramString); ; paramString = this.bSd.query("IPCallAddressItem", nzy, "contactId IN ".concat(String.valueOf(paramString)), null, null, null, "upper(sortKey) asc"))
    {
      System.currentTimeMillis();
      AppMethodBeat.o(21928);
      return paramString;
      i++;
      break;
      i = 1;
      break label33;
      label66: Object localObject1 = a.Py(paramString);
      paramString = OT(paramString);
      try
      {
        if (paramString.moveToFirst())
          while (!paramString.isAfterLast())
          {
            ((ArrayList)localObject1).add(paramString.getString(paramString.getColumnIndex("contactId")));
            paramString.moveToNext();
          }
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.IPCallAddressStorage", "getContactIdList error: %s", new Object[] { localException.getMessage() });
        if (paramString != null)
          paramString.close();
        while (true)
        {
          localObject1 = ((ArrayList)localObject1).iterator();
          String str2;
          for (paramString = ""; ((Iterator)localObject1).hasNext(); paramString = paramString + str2 + ",")
            str2 = (String)((Iterator)localObject1).next();
          if (paramString != null)
            paramString.close();
        }
      }
      finally
      {
        if (paramString != null)
          paramString.close();
        AppMethodBeat.o(21928);
      }
      String str1 = paramString;
      if (paramString.lastIndexOf(",") >= 0)
        str1 = paramString.substring(0, paramString.lastIndexOf(","));
      paramString = "(" + str1 + ")";
    }
  }

  public final ArrayList<c> bHY()
  {
    Object localObject1 = null;
    AppMethodBeat.i(21926);
    Cursor localCursor = this.bSd.a("IPCallAddressItem", nzy, null, null, null, null, null, 2);
    if (localCursor != null);
    try
    {
      if (localCursor.moveToFirst())
      {
        ArrayList localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        boolean bool;
        do
        {
          c localc = new com/tencent/mm/plugin/ipcall/a/g/c;
          localc.<init>();
          localc.d(localCursor);
          localArrayList.add(localc);
          bool = localCursor.moveToNext();
        }
        while (bool);
        if (localCursor != null)
          localCursor.close();
        AppMethodBeat.o(21926);
        localObject1 = localArrayList;
      }
      while (true)
      {
        return localObject1;
        if (localCursor != null)
          localCursor.close();
        AppMethodBeat.o(21926);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.IPCallAddressStorage", "getAllAddress, error: %s", new Object[] { localException.getMessage() });
        if (localCursor != null)
          localCursor.close();
        AppMethodBeat.o(21926);
      }
    }
    finally
    {
      if (localCursor != null)
        localCursor.close();
      AppMethodBeat.o(21926);
    }
  }

  public final Cursor bHZ()
  {
    AppMethodBeat.i(21927);
    Cursor localCursor = this.bSd.query("IPCallAddressItem", nzy, null, null, null, null, "upper(sortKey) asc");
    AppMethodBeat.o(21927);
    return localCursor;
  }

  public final c iU(long paramLong)
  {
    Object localObject1 = null;
    AppMethodBeat.i(21925);
    Cursor localCursor = this.bSd.a("IPCallAddressItem", nzy, "rowid=?", new String[] { String.valueOf(paramLong) }, null, null, null, 2);
    try
    {
      if (localCursor.moveToFirst())
      {
        c localc = new com/tencent/mm/plugin/ipcall/a/g/c;
        localc.<init>();
        localc.d(localCursor);
        if (localCursor != null)
          localCursor.close();
        AppMethodBeat.o(21925);
        localObject1 = localc;
      }
      while (true)
      {
        return localObject1;
        if (localCursor != null)
          localCursor.close();
        AppMethodBeat.o(21925);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.d("MicroMsg.IPCallAddressStorage", "getByLocalId error: %s", new Object[] { localException.getMessage() });
        if (localCursor != null)
          localCursor.close();
      }
    }
    finally
    {
      if (localCursor != null)
        localCursor.close();
      AppMethodBeat.o(21925);
    }
  }

  public final long iV(long paramLong)
  {
    AppMethodBeat.i(21930);
    if ((this.bSd instanceof h))
    {
      paramLong = ((h)this.bSd).iV(paramLong);
      AppMethodBeat.o(21930);
    }
    while (true)
    {
      return paramLong;
      paramLong = -1L;
      AppMethodBeat.o(21930);
    }
  }

  public final void iW(long paramLong)
  {
    AppMethodBeat.i(21931);
    if (((this.bSd instanceof h)) && (paramLong != -1L))
      ((h)this.bSd).mB(paramLong);
    AppMethodBeat.o(21931);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.g.d
 * JD-Core Version:    0.6.2
 */