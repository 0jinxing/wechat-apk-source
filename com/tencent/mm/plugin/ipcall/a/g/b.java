package com.tencent.mm.plugin.ipcall.a.g;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.provider.ContactsContract.Data;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.g;
import com.tencent.mm.plugin.ipcall.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class b
{
  public static final String emJ;
  private static HashMap<String, c> nzw;

  static
  {
    AppMethodBeat.i(21920);
    emJ = new String(Character.toChars(91));
    nzw = new HashMap();
    AppMethodBeat.o(21920);
  }

  public static ArrayList<String> OP(String paramString)
  {
    AppMethodBeat.i(21918);
    ArrayList localArrayList = new ArrayList();
    if (!com.tencent.mm.pluginsdk.permission.b.o(ah.getContext(), "android.permission.READ_CONTACTS"))
    {
      ab.e("MicroMsg.IPCallAddressBookInfoExtracter", "no contact permission");
      AppMethodBeat.o(21918);
    }
    while (true)
    {
      return localArrayList;
      paramString = ah.getContext().getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, "contact_id=?", new String[] { paramString }, null);
      if (paramString == null)
      {
        AppMethodBeat.o(21918);
        continue;
      }
      try
      {
        if (paramString.moveToFirst())
          while (!paramString.isAfterLast())
          {
            localArrayList.add(paramString.getString(paramString.getColumnIndex("data1")));
            paramString.moveToNext();
          }
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.IPCallAddressBookInfoExtracter", "extractAddressItemFromCursor, error: %s, class: %s", new Object[] { localException.getMessage(), localException.getClass().getSimpleName() });
        paramString.close();
        while (true)
        {
          AppMethodBeat.o(21918);
          break;
          paramString.close();
        }
      }
      finally
      {
        paramString.close();
        AppMethodBeat.o(21918);
      }
    }
  }

  private static c a(Cursor paramCursor, int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(21919);
    if (!com.tencent.mm.pluginsdk.permission.b.o(ah.getContext(), "android.permission.READ_CONTACTS"))
    {
      ab.e("MicroMsg.IPCallAddressBookInfoExtracter", "no contact permission");
      AppMethodBeat.o(21919);
      paramCursor = (Cursor)localObject2;
      return paramCursor;
    }
    c localc = new c();
    localc.nzx = new ArrayList();
    localObject2 = paramCursor.getString(paramInt1);
    Object localObject3 = paramCursor.getString(paramInt2);
    paramCursor = paramCursor.getString(paramInt3);
    localc.field_contactId = ((String)localObject2);
    localc.field_systemAddressBookUsername = ((String)localObject3);
    if ((!bo.isNullOrNil(paramCursor)) && (!localc.nzx.contains(paramCursor)))
      localc.nzx.add(paramCursor);
    if ((bo.isNullOrNil(localc.field_systemAddressBookUsername)) && (localc.nzx.size() > 0))
      localc.field_systemAddressBookUsername = ((String)localc.nzx.get(0));
    localObject3 = localc.nzx.iterator();
    paramCursor = null;
    if (((Iterator)localObject3).hasNext())
    {
      localObject2 = a.Pn((String)((Iterator)localObject3).next());
      if (!bo.isNullOrNil((String)localObject2))
      {
        paramCursor = (Cursor)localObject2;
        if (((String)localObject2).endsWith("@stranger"));
      }
    }
    while (true)
    {
      if (!bo.isNullOrNil((String)localObject2))
        localc.field_wechatUsername = ((String)localObject2);
      if (!bo.isNullOrNil(localc.field_systemAddressBookUsername));
      while (true)
      {
        try
        {
          paramCursor = g.vo(localc.field_systemAddressBookUsername);
          if (!bo.isNullOrNil(paramCursor))
            if (!Character.isLetter(paramCursor.charAt(0)))
            {
              localc.field_sortKey = (emJ + paramCursor.toUpperCase());
              AppMethodBeat.o(21919);
              paramCursor = localc;
              break;
            }
        }
        catch (Exception paramCursor)
        {
          ab.d("MicroMsg.IPCallAddressBookInfoExtracter", "getFullSpell error: %s, class: %s", new Object[] { paramCursor.getMessage(), paramCursor.getClass().getSimpleName() });
          paramCursor = localObject1;
          continue;
          localc.field_sortKey = paramCursor.toUpperCase();
          continue;
          localc.field_sortKey = "";
          continue;
        }
        localc.field_sortKey = "";
      }
      localObject2 = paramCursor;
    }
  }

  public static ArrayList<c> bHV()
  {
    AppMethodBeat.i(21916);
    long l1 = System.currentTimeMillis();
    ArrayList localArrayList = new ArrayList();
    if (!com.tencent.mm.pluginsdk.permission.b.o(ah.getContext(), "android.permission.READ_CONTACTS"))
    {
      ab.e("MicroMsg.IPCallAddressBookInfoExtracter", "no contact permission");
      AppMethodBeat.o(21916);
    }
    Cursor localCursor;
    HashMap localHashMap;
    while (true)
    {
      return localArrayList;
      localCursor = ah.getContext().getContentResolver().query(ContactsContract.Data.CONTENT_URI, new String[] { "contact_id", "display_name", "data1" }, "mimetype='vnd.android.cursor.item/phone_v2'", null, null);
      localHashMap = new HashMap();
      ab.d("MicroMsg.IPCallAddressBookInfoExtracter", "query FromSystemPhoneBook, time: " + (System.currentTimeMillis() - l1));
      if (localCursor != null)
        break;
      AppMethodBeat.o(21916);
    }
    while (true)
    {
      try
      {
        ab.d("MicroMsg.IPCallAddressBookInfoExtracter", "getAllAddressItemFromSystemPhoneBook, count: %d", new Object[] { Integer.valueOf(localCursor.getCount()) });
        if (localCursor.moveToFirst())
        {
          int i = localCursor.getColumnIndex("contact_id");
          int j = localCursor.getColumnIndex("display_name");
          int k = localCursor.getColumnIndex("data1");
          if (!localCursor.isAfterLast())
          {
            c localc1 = a(localCursor, i, j, k);
            if ((localc1 != null) && (localc1.nzx != null) && (localc1.nzx.size() > 0) && (!bo.isNullOrNil(localc1.field_contactId)))
            {
              if (!localHashMap.containsKey(localc1.field_contactId))
                continue;
              c localc2 = (c)localHashMap.get(localc1.field_contactId);
              if ((localc1.nzx.size() > 0) && (!localc2.nzx.contains(localc1.nzx.get(0))))
                localc2.nzx.add(localc1.nzx.get(0));
            }
            localCursor.moveToNext();
            continue;
          }
        }
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.IPCallAddressBookInfoExtracter", "getAllAddressItemFromSystemPhoneBook error: %s, class: %s", new Object[] { localException.getMessage(), localException.getClass().getSimpleName() });
        localCursor.close();
        localArrayList.addAll(localHashMap.values());
        nzw = localHashMap;
        long l2 = System.currentTimeMillis();
        ab.d("MicroMsg.IPCallAddressBookInfoExtracter", "getAllAddressItemFromSystemPhoneBook, result size: %d, used %dms", new Object[] { Integer.valueOf(localArrayList.size()), Long.valueOf(l2 - l1) });
        AppMethodBeat.o(21916);
        break;
        localHashMap.put(localException.field_contactId, localException);
        continue;
      }
      finally
      {
        localCursor.close();
        AppMethodBeat.o(21916);
      }
      localCursor.close();
    }
  }

  public static HashMap<String, c> bHW()
  {
    return nzw;
  }

  public static HashMap<String, c> bHX()
  {
    AppMethodBeat.i(21917);
    bHV();
    HashMap localHashMap = nzw;
    AppMethodBeat.o(21917);
    return localHashMap;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.g.b
 * JD-Core Version:    0.6.2
 */