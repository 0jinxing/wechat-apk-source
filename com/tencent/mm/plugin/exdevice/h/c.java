package com.tencent.mm.plugin.exdevice.h;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ce;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import java.util.List;

public final class c extends j<b>
{
  public static final String[] fnj;
  private e bSd;

  static
  {
    AppMethodBeat.i(19726);
    fnj = new String[] { j.a(b.ccO, "HardDeviceInfo") };
    AppMethodBeat.o(19726);
  }

  public c(e parame)
  {
    super(parame, b.ccO, "HardDeviceInfo", null);
    AppMethodBeat.i(19712);
    this.bSd = parame;
    parame.hY("HardDeviceInfo", "CREATE INDEX IF NOT EXISTS hardDeviceUsernameIndex ON HardDeviceInfo ( brandName )");
    parame.hY("HardDeviceInfo", "CREATE INDEX IF NOT EXISTS hardDeviceMacIndex ON HardDeviceInfo ( mac )");
    AppMethodBeat.o(19712);
  }

  public static boolean Kw(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(19717);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.exdevice.HardDeviceInfoStorage", "Ability is null or nil.");
      AppMethodBeat.o(19717);
    }
    while (true)
    {
      return bool;
      if ((paramString.contains("wxmsg_music")) || (paramString.contains("wxmsg_poi")) || (paramString.contains("wxmsg_image")) || (paramString.contains("wxmsg_file")) || (paramString.contains("wxmsg_video")) || (paramString.contains("wxmsg_url")))
      {
        bool = true;
        AppMethodBeat.o(19717);
      }
      else
      {
        AppMethodBeat.o(19717);
      }
    }
  }

  public final b Ku(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(19713);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(19713);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      Cursor localCursor = this.bSd.a("HardDeviceInfo", null, "mac=?", new String[] { paramString }, null, null, null, 2);
      if (localCursor == null)
      {
        AppMethodBeat.o(19713);
        paramString = localObject;
      }
      else if (!localCursor.moveToFirst())
      {
        ab.w("MicroMsg.exdevice.HardDeviceInfoStorage", "get null with mac:".concat(String.valueOf(paramString)));
        localCursor.close();
        AppMethodBeat.o(19713);
        paramString = localObject;
      }
      else
      {
        paramString = new b();
        paramString.d(localCursor);
        localCursor.close();
        AppMethodBeat.o(19713);
      }
    }
  }

  public final b Kv(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(19715);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(19715);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      Cursor localCursor = this.bSd.a("HardDeviceInfo", null, "deviceID=?", new String[] { paramString }, null, null, null, 2);
      if (localCursor == null)
      {
        AppMethodBeat.o(19715);
        paramString = localObject;
      }
      else if (!localCursor.moveToFirst())
      {
        ab.w("MicroMsg.exdevice.HardDeviceInfoStorage", "get null with deviceId:".concat(String.valueOf(paramString)));
        localCursor.close();
        AppMethodBeat.o(19715);
        paramString = localObject;
      }
      else
      {
        paramString = new b();
        paramString.d(localCursor);
        localCursor.close();
        AppMethodBeat.o(19715);
      }
    }
  }

  public final LinkedList<b> Kx(String paramString)
  {
    LinkedList localLinkedList = null;
    AppMethodBeat.i(19721);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.exdevice.HardDeviceInfoStorage", "The given brandName is null or nil.");
      AppMethodBeat.o(19721);
      paramString = localLinkedList;
    }
    while (true)
    {
      return paramString;
      localLinkedList = new LinkedList();
      Cursor localCursor = this.bSd.a("HardDeviceInfo", null, "brandName=?", new String[] { paramString }, null, null, null, 2);
      if (localCursor == null)
      {
        AppMethodBeat.o(19721);
        paramString = localLinkedList;
      }
      else
      {
        if (localCursor.moveToFirst())
          do
          {
            paramString = new b();
            paramString.d(localCursor);
            localLinkedList.add(paramString);
          }
          while (localCursor.moveToNext());
        localCursor.close();
        AppMethodBeat.o(19721);
        paramString = localLinkedList;
      }
    }
  }

  public final List<b> bpA()
  {
    AppMethodBeat.i(19718);
    LinkedList localLinkedList = new LinkedList();
    Cursor localCursor = baR();
    if ((localCursor != null) && (localCursor.moveToFirst()))
      do
      {
        b localb = new b();
        localb.d(localCursor);
        String str = localb.dFr;
        if ((str != null) && (Kw(str)))
          localLinkedList.add(localb);
      }
      while (localCursor.moveToNext());
    if (localCursor != null)
      localCursor.close();
    AppMethodBeat.o(19718);
    return localLinkedList;
  }

  public final List<b> bpB()
  {
    AppMethodBeat.i(19719);
    LinkedList localLinkedList = new LinkedList();
    Cursor localCursor = baR();
    if ((localCursor != null) && (localCursor.moveToFirst()))
      do
      {
        b localb = new b();
        localb.d(localCursor);
        String str1 = localb.dFn;
        String str2 = localb.iconUrl;
        String str3 = localb.category;
        String str4 = localb.field_brandName;
        if ((!bo.isNullOrNil(str3)) && (!str3.equals("1")) && (!str3.equals("0")) && (!bo.isNullOrNil(str4)) && (!bo.isNullOrNil(str1)) && (!bo.isNullOrNil(str2)))
          localLinkedList.add(localb);
      }
      while (localCursor.moveToNext());
    if (localCursor != null)
      localCursor.close();
    AppMethodBeat.o(19719);
    return localLinkedList;
  }

  public final LinkedList<b> bpC()
  {
    AppMethodBeat.i(19722);
    LinkedList localLinkedList = new LinkedList();
    Cursor localCursor = rawQuery("select * from HardDeviceInfo where mac > 0 and connProto like '3'", new String[0]);
    if (localCursor == null)
    {
      ab.e("MicroMsg.exdevice.HardDeviceInfoStorage", "get cursor is null");
      AppMethodBeat.o(19722);
    }
    while (true)
    {
      return localLinkedList;
      if (localCursor.moveToFirst())
        do
        {
          b localb = new b();
          localb.d(localCursor);
          localLinkedList.add(localb);
        }
        while (localCursor.moveToNext());
      localCursor.close();
      AppMethodBeat.o(19722);
    }
  }

  public final b dS(String paramString1, String paramString2)
  {
    Object localObject = null;
    AppMethodBeat.i(19716);
    if ((bo.isNullOrNil(paramString2)) || (bo.isNullOrNil(paramString1)))
    {
      ab.e("MicroMsg.exdevice.HardDeviceInfoStorage", "deviceType(%s) or deviceId(%s) is null or nil.", new Object[] { paramString2, paramString1 });
      AppMethodBeat.o(19716);
      paramString1 = localObject;
    }
    while (true)
    {
      return paramString1;
      Cursor localCursor = this.bSd.a("HardDeviceInfo", null, "deviceType=? and deviceID=?", new String[] { paramString2, paramString1 }, null, null, null, 2);
      if (localCursor == null)
      {
        AppMethodBeat.o(19716);
        paramString1 = localObject;
      }
      else if (!localCursor.moveToFirst())
      {
        ab.w("MicroMsg.exdevice.HardDeviceInfoStorage", "get null with deviceType:%s and deviceId:%s", new Object[] { paramString2, paramString1 });
        localCursor.close();
        AppMethodBeat.o(19716);
        paramString1 = localObject;
      }
      else
      {
        paramString1 = new b();
        paramString1.d(localCursor);
        localCursor.close();
        AppMethodBeat.o(19716);
      }
    }
  }

  public final b dT(String paramString1, String paramString2)
  {
    Object localObject = null;
    AppMethodBeat.i(19720);
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)))
    {
      ab.e("MicroMsg.exdevice.HardDeviceInfoStorage", "brandName(%s) or deviceId(%s) is null or nil.", new Object[] { paramString1, paramString2 });
      AppMethodBeat.o(19720);
      paramString1 = localObject;
    }
    while (true)
    {
      return paramString1;
      paramString2 = this.bSd.a("HardDeviceInfo", null, "brandName=? and deviceID=?", new String[] { paramString1, paramString2 }, null, null, null, 2);
      if (paramString2 == null)
      {
        AppMethodBeat.o(19720);
        paramString1 = localObject;
      }
      else if (!paramString2.moveToFirst())
      {
        ab.w("MicroMsg.exdevice.HardDeviceInfoStorage", "get null with brandName:".concat(String.valueOf(paramString1)));
        paramString2.close();
        AppMethodBeat.o(19720);
        paramString1 = localObject;
      }
      else
      {
        paramString1 = new b();
        paramString1.d(paramString2);
        paramString2.close();
        AppMethodBeat.o(19720);
      }
    }
  }

  public final boolean dU(String paramString1, String paramString2)
  {
    boolean bool = false;
    AppMethodBeat.i(19723);
    if (bo.isNullOrNil(paramString1))
      AppMethodBeat.o(19723);
    while (true)
    {
      return bool;
      if (this.bSd.delete("HardDeviceInfo", "deviceID=? and deviceType=? ", new String[] { paramString1, paramString2 }) <= 0)
      {
        ab.i("MicroMsg.exdevice.HardDeviceInfoStorage", "delete hardDeviceInfo fail, deviceId = %s", new Object[] { paramString1 });
        AppMethodBeat.o(19723);
      }
      else
      {
        ab.i("MicroMsg.exdevice.HardDeviceInfoStorage", "delete hardDeviceInfo ok, deviceId = %s", new Object[] { paramString1 });
        AppMethodBeat.o(19723);
        bool = true;
      }
    }
  }

  public final int e(b paramb)
  {
    AppMethodBeat.i(19724);
    ContentValues localContentValues = paramb.Hl();
    if (localContentValues.size() > 0);
    for (int i = this.bSd.update("HardDeviceInfo", localContentValues, "deviceID = ? and deviceType = ? ", new String[] { paramb.field_deviceID, paramb.field_deviceType }); ; i = 0)
    {
      ab.i("MicroMsg.exdevice.HardDeviceInfoStorage", "update: deviceId = %s, deviceType = %s, ret = %s ", new Object[] { paramb.field_deviceID, paramb.field_deviceType, Integer.valueOf(i) });
      AppMethodBeat.o(19724);
      return i;
    }
  }

  public final b id(long paramLong)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(19714);
    Cursor localCursor = this.bSd.query("HardDeviceInfo", null, "mac=?", new String[] { String.valueOf(paramLong) }, null, null, null);
    if (localCursor == null)
    {
      AppMethodBeat.o(19714);
      return localObject2;
    }
    if (localCursor.moveToFirst())
    {
      localObject2 = new b();
      ((b)localObject2).d(localCursor);
    }
    while (true)
    {
      localCursor.close();
      AppMethodBeat.o(19714);
      break;
      ab.w("MicroMsg.exdevice.HardDeviceInfoStorage", "get null with mac:".concat(String.valueOf(paramLong)));
      localObject2 = localObject1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.h.c
 * JD-Core Version:    0.6.2
 */