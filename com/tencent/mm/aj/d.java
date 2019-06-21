package com.tencent.mm.aj;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ae;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.reflect.Field;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d extends ae
{
  protected static c.a ccO;
  public static int fuU;
  public static int fuV;
  public static int fuW;
  private static int fuZ;
  private static d.b fva;
  private List<d.a> fuX;
  public d.b fuY;

  static
  {
    AppMethodBeat.i(11321);
    fuU = 1;
    fuV = 0;
    fuW = 1;
    c.a locala = new c.a();
    locala.xDb = new Field[20];
    locala.columns = new String[21];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "username";
    locala.xDd.put("username", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" username TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "username";
    locala.columns[1] = "appId";
    locala.xDd.put("appId", "TEXT");
    localStringBuilder.append(" appId TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "brandList";
    locala.xDd.put("brandList", "TEXT default '' ");
    localStringBuilder.append(" brandList TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[3] = "brandListVersion";
    locala.xDd.put("brandListVersion", "TEXT");
    localStringBuilder.append(" brandListVersion TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "brandListContent";
    locala.xDd.put("brandListContent", "TEXT");
    localStringBuilder.append(" brandListContent TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "brandFlag";
    locala.xDd.put("brandFlag", "INTEGER");
    localStringBuilder.append(" brandFlag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[6] = "extInfo";
    locala.xDd.put("extInfo", "TEXT");
    localStringBuilder.append(" extInfo TEXT");
    localStringBuilder.append(", ");
    locala.columns[7] = "brandInfo";
    locala.xDd.put("brandInfo", "TEXT");
    localStringBuilder.append(" brandInfo TEXT");
    localStringBuilder.append(", ");
    locala.columns[8] = "brandIconURL";
    locala.xDd.put("brandIconURL", "TEXT");
    localStringBuilder.append(" brandIconURL TEXT");
    localStringBuilder.append(", ");
    locala.columns[9] = "updateTime";
    locala.xDd.put("updateTime", "LONG");
    localStringBuilder.append(" updateTime LONG");
    localStringBuilder.append(", ");
    locala.columns[10] = "hadAlert";
    locala.xDd.put("hadAlert", "INTEGER");
    localStringBuilder.append(" hadAlert INTEGER");
    localStringBuilder.append(", ");
    locala.columns[11] = "acceptType";
    locala.xDd.put("acceptType", "INTEGER default '0' ");
    localStringBuilder.append(" acceptType INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[12] = "type";
    locala.xDd.put("type", "INTEGER default '0' ");
    localStringBuilder.append(" type INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[13] = "status";
    locala.xDd.put("status", "INTEGER default '0' ");
    localStringBuilder.append(" status INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[14] = "enterpriseFather";
    locala.xDd.put("enterpriseFather", "TEXT");
    localStringBuilder.append(" enterpriseFather TEXT");
    localStringBuilder.append(", ");
    locala.columns[15] = "kfWorkerId";
    locala.xDd.put("kfWorkerId", "TEXT");
    localStringBuilder.append(" kfWorkerId TEXT");
    localStringBuilder.append(", ");
    locala.columns[16] = "specialType";
    locala.xDd.put("specialType", "INTEGER");
    localStringBuilder.append(" specialType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[17] = "attrSyncVersion";
    locala.xDd.put("attrSyncVersion", "TEXT");
    localStringBuilder.append(" attrSyncVersion TEXT");
    localStringBuilder.append(", ");
    locala.columns[18] = "incrementUpdateTime";
    locala.xDd.put("incrementUpdateTime", "LONG");
    localStringBuilder.append(" incrementUpdateTime LONG");
    localStringBuilder.append(", ");
    locala.columns[19] = "bitFlag";
    locala.xDd.put("bitFlag", "INTEGER default '0' ");
    localStringBuilder.append(" bitFlag INTEGER default '0' ");
    locala.columns[20] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    fuZ = 0;
    fva = null;
    AppMethodBeat.o(11321);
  }

  private boolean lc(int paramInt)
  {
    if ((this.field_bitFlag & paramInt) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void ld(int paramInt)
  {
    this.field_bitFlag |= paramInt;
  }

  public final c.a Ag()
  {
    return ccO;
  }

  public final ContentValues Hl()
  {
    AppMethodBeat.i(11319);
    ContentValues localContentValues = super.Hl();
    AppMethodBeat.o(11319);
    return localContentValues;
  }

  public final boolean adH()
  {
    if ((this.field_brandFlag & 0x1) == 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean adI()
  {
    if ((this.field_brandFlag & 0x4) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean adJ()
  {
    boolean bool = true;
    AppMethodBeat.i(11303);
    if (System.currentTimeMillis() - this.field_updateTime > 86400000L)
      AppMethodBeat.o(11303);
    while (true)
    {
      return bool;
      Calendar localCalendar = Calendar.getInstance();
      localCalendar.set(11, 0);
      localCalendar.set(12, 0);
      localCalendar.set(13, 0);
      if (this.field_updateTime < localCalendar.getTimeInMillis())
      {
        AppMethodBeat.o(11303);
      }
      else
      {
        AppMethodBeat.o(11303);
        bool = false;
      }
    }
  }

  public final void adK()
  {
    AppMethodBeat.i(11304);
    cJ(false);
    d.b localb = this.fuY;
    if (localb.fvc != null)
      localb.fvq = localb.fvc.optInt("ConnectorMsgType");
    this.field_acceptType = localb.fvq;
    this.field_type = cJ(false).getServiceType();
    if (adR())
    {
      ld(1);
      AppMethodBeat.o(11304);
    }
    while (true)
    {
      return;
      this.field_bitFlag &= -2;
      AppMethodBeat.o(11304);
    }
  }

  public final boolean adL()
  {
    AppMethodBeat.i(11305);
    cJ(false);
    ab.i("MicroMsg.BizInfo", "is report location, user %s %B", new Object[] { this.field_username, Boolean.valueOf(this.fuY.adL()) });
    boolean bool = this.fuY.adL();
    AppMethodBeat.o(11305);
    return bool;
  }

  public final boolean adM()
  {
    boolean bool = true;
    AppMethodBeat.i(11306);
    cJ(false);
    if (this.field_type == 1)
      AppMethodBeat.o(11306);
    while (true)
    {
      return bool;
      AppMethodBeat.o(11306);
      bool = false;
    }
  }

  public final boolean adN()
  {
    boolean bool = false;
    AppMethodBeat.i(11307);
    cJ(false);
    if (this.field_type == 0)
    {
      bool = true;
      AppMethodBeat.o(11307);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(11307);
    }
  }

  public final boolean adO()
  {
    boolean bool = false;
    AppMethodBeat.i(11308);
    cJ(false);
    if ((this.field_type == 2) || (this.field_type == 3))
    {
      bool = true;
      AppMethodBeat.o(11308);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(11308);
    }
  }

  public final boolean adP()
  {
    boolean bool = false;
    AppMethodBeat.i(11309);
    cJ(false);
    if (this.field_type == 2)
    {
      bool = true;
      AppMethodBeat.o(11309);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(11309);
    }
  }

  public final boolean adQ()
  {
    boolean bool = false;
    AppMethodBeat.i(11310);
    cJ(false);
    if (this.field_type == 3)
    {
      bool = true;
      AppMethodBeat.o(11310);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(11310);
    }
  }

  public final boolean adR()
  {
    AppMethodBeat.i(11311);
    cJ(false);
    boolean bool1;
    if ((this.fuY != null) && (this.fuY.aer() != null))
      if (this.fuY.fvn.fvO == 1)
      {
        bool1 = true;
        if ((bool1) && (!lc(1)))
        {
          ld(1);
          z.aeR().e(this);
        }
        bool2 = bool1;
        if (bool1)
          ab.d("MicroMsg.BizInfo", "EnterpriseChat,userName : %s", new Object[] { this.field_username });
      }
    for (boolean bool2 = bool1; ; bool2 = false)
    {
      AppMethodBeat.o(11311);
      return bool2;
      bool1 = false;
      break;
    }
  }

  public final boolean adS()
  {
    AppMethodBeat.i(11312);
    cJ(false);
    boolean bool1;
    if ((this.fuY != null) && (this.fuY.aer() != null))
      if (this.fuY.fvn.fvO == 2)
      {
        bool1 = true;
        if ((bool1) && (!lc(2)))
        {
          ld(2);
          z.aeR().e(this);
        }
        bool2 = bool1;
        if (bool1)
          ab.d("MicroMsg.BizInfo", "EnterpriseWeb,userName : %s", new Object[] { this.field_username });
      }
    for (boolean bool2 = bool1; ; bool2 = false)
    {
      AppMethodBeat.o(11312);
      return bool2;
      bool1 = false;
      break;
    }
  }

  public final String adT()
  {
    AppMethodBeat.i(11313);
    cJ(false);
    Object localObject;
    if (this.fuY != null)
    {
      localObject = this.fuY.aer();
      if ((localObject != null) && (((d.b.c.a)localObject).fvP != null) && (!((d.b.c.a)localObject).fvP.isEmpty()))
      {
        localObject = ((d.b.c.a)localObject).fvP;
        AppMethodBeat.o(11313);
      }
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(11313);
    }
  }

  public final long adU()
  {
    long l = 0L;
    AppMethodBeat.i(11314);
    cJ(false);
    if (this.fuY != null)
    {
      d.b.c.a locala = this.fuY.aer();
      if ((locala != null) && (locala.appid != 0L))
      {
        l = locala.appid;
        AppMethodBeat.o(11314);
      }
    }
    while (true)
    {
      return l;
      AppMethodBeat.o(11314);
    }
  }

  public final boolean adV()
  {
    boolean bool = true;
    AppMethodBeat.i(11315);
    cJ(false);
    if (this.fuY == null)
    {
      ab.i("MicroMsg.BizInfo", "isShowUserName bizInfo.getExtInfo() null");
      AppMethodBeat.o(11315);
    }
    while (true)
    {
      return bool;
      if (this.fuY.ael() == null)
      {
        ab.i("MicroMsg.BizInfo", "isShowUserName bizInfo.getExtInfo().getRegisterSource() null");
        AppMethodBeat.o(11315);
      }
      else if (!this.fuY.ael().fwd)
      {
        AppMethodBeat.o(11315);
      }
      else
      {
        AppMethodBeat.o(11315);
        bool = false;
      }
    }
  }

  public final String adW()
  {
    AppMethodBeat.i(11316);
    cJ(false);
    Object localObject;
    if (this.fuY != null)
    {
      localObject = this.fuY.aer();
      if (localObject != null)
      {
        localObject = ((d.b.c.a)localObject).fvQ;
        AppMethodBeat.o(11316);
      }
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(11316);
    }
  }

  public final String adX()
  {
    AppMethodBeat.i(11317);
    String str = cJ(false).aer().fvM;
    if (bo.isNullOrNil(str))
      ab.e("MicroMsg.BizInfo", "check father: %s, %s", new Object[] { this.field_username, str });
    AppMethodBeat.o(11317);
    return str;
  }

  public final List<d.a> adY()
  {
    AppMethodBeat.i(11320);
    Object localObject;
    if (this.fuX != null)
    {
      localObject = this.fuX;
      AppMethodBeat.o(11320);
    }
    while (true)
    {
      return localObject;
      this.fuX = new LinkedList();
      if ((this.field_brandInfo == null) || (this.field_brandInfo.length() == 0))
      {
        localObject = this.fuX;
        AppMethodBeat.o(11320);
      }
      else
      {
        try
        {
          localObject = new org/json/JSONObject;
          ((JSONObject)localObject).<init>(this.field_brandInfo);
          localObject = ((JSONObject)localObject).optJSONArray("urls");
          for (int i = 0; i < ((JSONArray)localObject).length(); i++)
          {
            d.a locala = new com/tencent/mm/aj/d$a;
            locala.<init>();
            JSONObject localJSONObject = ((JSONArray)localObject).optJSONObject(i);
            locala.title = localJSONObject.optString("title");
            locala.url = localJSONObject.optString("url");
            locala.fvb = localJSONObject.optString("title_key");
            locala.description = localJSONObject.optString("description");
            this.fuX.add(locala);
          }
        }
        catch (Exception localException)
        {
          ab.e("MicroMsg.BizInfo", "exception:%s", new Object[] { bo.l(localException) });
          List localList = this.fuX;
          AppMethodBeat.o(11320);
        }
      }
    }
  }

  public final d.b cJ(boolean paramBoolean)
  {
    AppMethodBeat.i(11302);
    if ((this.fuY == null) || (paramBoolean))
    {
      if ((bo.isNullOrNil(this.field_extInfo)) || (fuZ != this.field_extInfo.hashCode()))
        break label60;
      this.fuY = fva;
    }
    while (true)
    {
      d.b localb = this.fuY;
      AppMethodBeat.o(11302);
      return localb;
      label60: localb = d.b.qH(this.field_extInfo);
      this.fuY = localb;
      fva = localb;
      fuZ = bo.nullAsNil(this.field_extInfo).hashCode();
    }
  }

  public final void d(Cursor paramCursor)
  {
    AppMethodBeat.i(11318);
    super.d(paramCursor);
    AppMethodBeat.o(11318);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.d
 * JD-Core Version:    0.6.2
 */