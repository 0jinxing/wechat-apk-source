package com.tencent.mm.plugin.shake.b;

import android.content.ContentValues;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ec;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.bym;
import com.tencent.mm.protocal.protobuf.ccl;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.RegionCodeDecoder;
import java.lang.reflect.Field;
import java.util.Map;

public final class d extends ec
{
  protected static c.a ccO;
  public int bJt;
  private SKBuiltinBuffer_t qrM;
  public int scene;

  static
  {
    AppMethodBeat.i(24433);
    c.a locala = new c.a();
    locala.xDb = new Field[20];
    locala.columns = new String[21];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "shakeItemID";
    locala.xDd.put("shakeItemID", "INTEGER default '0'  PRIMARY KEY ");
    localStringBuilder.append(" shakeItemID INTEGER default '0'  PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "shakeItemID";
    locala.columns[1] = "username";
    locala.xDd.put("username", "TEXT");
    localStringBuilder.append(" username TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "nickname";
    locala.xDd.put("nickname", "TEXT");
    localStringBuilder.append(" nickname TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "province";
    locala.xDd.put("province", "TEXT");
    localStringBuilder.append(" province TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "city";
    locala.xDd.put("city", "TEXT");
    localStringBuilder.append(" city TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "signature";
    locala.xDd.put("signature", "TEXT");
    localStringBuilder.append(" signature TEXT");
    localStringBuilder.append(", ");
    locala.columns[6] = "distance";
    locala.xDd.put("distance", "TEXT");
    localStringBuilder.append(" distance TEXT");
    localStringBuilder.append(", ");
    locala.columns[7] = "sex";
    locala.xDd.put("sex", "INTEGER");
    localStringBuilder.append(" sex INTEGER");
    localStringBuilder.append(", ");
    locala.columns[8] = "imgstatus";
    locala.xDd.put("imgstatus", "INTEGER");
    localStringBuilder.append(" imgstatus INTEGER");
    localStringBuilder.append(", ");
    locala.columns[9] = "hasHDImg";
    locala.xDd.put("hasHDImg", "INTEGER");
    localStringBuilder.append(" hasHDImg INTEGER");
    localStringBuilder.append(", ");
    locala.columns[10] = "insertBatch";
    locala.xDd.put("insertBatch", "INTEGER");
    localStringBuilder.append(" insertBatch INTEGER");
    localStringBuilder.append(", ");
    locala.columns[11] = "reserved1";
    locala.xDd.put("reserved1", "INTEGER");
    localStringBuilder.append(" reserved1 INTEGER");
    localStringBuilder.append(", ");
    locala.columns[12] = "reserved2";
    locala.xDd.put("reserved2", "INTEGER");
    localStringBuilder.append(" reserved2 INTEGER");
    localStringBuilder.append(", ");
    locala.columns[13] = "reserved3";
    locala.xDd.put("reserved3", "TEXT");
    localStringBuilder.append(" reserved3 TEXT");
    localStringBuilder.append(", ");
    locala.columns[14] = "reserved4";
    locala.xDd.put("reserved4", "TEXT");
    localStringBuilder.append(" reserved4 TEXT");
    localStringBuilder.append(", ");
    locala.columns[15] = "type";
    locala.xDd.put("type", "INTEGER");
    localStringBuilder.append(" type INTEGER");
    localStringBuilder.append(", ");
    locala.columns[16] = "lvbuffer";
    locala.xDd.put("lvbuffer", "BLOB");
    localStringBuilder.append(" lvbuffer BLOB");
    localStringBuilder.append(", ");
    locala.columns[17] = "regionCode";
    locala.xDd.put("regionCode", "TEXT");
    localStringBuilder.append(" regionCode TEXT");
    localStringBuilder.append(", ");
    locala.columns[18] = "snsFlag";
    locala.xDd.put("snsFlag", "INTEGER");
    localStringBuilder.append(" snsFlag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[19] = "sns_bgurl";
    locala.xDd.put("sns_bgurl", "TEXT");
    localStringBuilder.append(" sns_bgurl TEXT");
    locala.columns[20] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(24433);
  }

  public d()
  {
    this.bJt = -1;
    this.field_insertBatch = 2;
  }

  public d(bym parambym)
  {
    AppMethodBeat.i(24428);
    this.bJt = -1;
    this.field_username = parambym.jBB;
    this.field_nickname = parambym.jCH;
    this.field_signature = parambym.guQ;
    this.field_distance = parambym.wBS;
    this.field_reserved4 = String.valueOf(parambym.wXK);
    this.field_sex = parambym.guN;
    this.field_imgstatus = parambym.vEE;
    this.field_hasHDImg = parambym.wXI;
    this.field_reserved1 = parambym.wBT;
    this.field_reserved3 = parambym.wBU;
    this.field_insertBatch = 2;
    if (parambym.wBZ != null)
    {
      this.field_snsFlag = parambym.wBZ.guY;
      this.field_sns_bgurl = parambym.wBZ.guZ;
    }
    this.qrM = parambym.wXJ;
    this.field_province = parambym.guO;
    this.field_city = parambym.guP;
    this.field_regionCode = RegionCodeDecoder.aC(parambym.guW, this.field_province, this.field_city);
    AppMethodBeat.o(24428);
  }

  private int cjx()
  {
    AppMethodBeat.i(24431);
    try
    {
      i = Integer.valueOf(this.field_reserved4).intValue();
      AppMethodBeat.o(24431);
      return i;
    }
    finally
    {
      while (true)
      {
        int i = 0;
        AppMethodBeat.o(24431);
      }
    }
  }

  public final c.a Ag()
  {
    return ccO;
  }

  public final ContentValues Hl()
  {
    AppMethodBeat.i(24432);
    ContentValues localContentValues = new ContentValues();
    if ((this.bJt & 0x2) != 0)
      localContentValues.put("username", this.field_username);
    if ((this.bJt & 0x4) != 0)
      localContentValues.put("nickname", this.field_nickname);
    if ((this.bJt & 0x8) != 0)
      localContentValues.put("province", getProvince());
    if ((this.bJt & 0x10) != 0)
      localContentValues.put("city", getCity());
    if ((this.bJt & 0x20) != 0)
      localContentValues.put("signature", this.field_signature);
    if ((this.bJt & 0x40) != 0)
      localContentValues.put("distance", this.field_distance);
    if ((this.bJt & 0x80) != 0)
      localContentValues.put("sex", Integer.valueOf(this.field_sex));
    if ((this.bJt & 0x100) != 0)
      localContentValues.put("imgstatus", Integer.valueOf(this.field_imgstatus));
    if ((this.bJt & 0x200) != 0)
      localContentValues.put("hasHDImg", Integer.valueOf(this.field_hasHDImg));
    if ((this.bJt & 0x400) != 0)
      localContentValues.put("insertBatch", Integer.valueOf(this.field_insertBatch));
    if ((this.bJt & 0x800) != 0)
      localContentValues.put("reserved1", Integer.valueOf(this.field_reserved1));
    if ((this.bJt & 0x1000) != 0)
      localContentValues.put("reserved2", Integer.valueOf(this.field_reserved2));
    if ((this.bJt & 0x2000) != 0)
      localContentValues.put("reserved3", this.field_reserved3);
    if ((this.bJt & 0x4000) != 0)
      localContentValues.put("reserved4", Integer.valueOf(cjx()));
    if ((this.bJt & 0x8000) != 0)
      localContentValues.put("type", Integer.valueOf(this.field_type));
    if ((this.bJt & 0x10000) != 0)
      localContentValues.put("lvbuffer", this.field_lvbuffer);
    if ((this.bJt & 0x20000) != 0)
      localContentValues.put("regionCode", this.field_regionCode);
    if ((this.bJt & 0x40000) != 0)
      localContentValues.put("snsFlag", Integer.valueOf(this.field_snsFlag));
    if ((this.bJt & 0x80000) != 0)
      localContentValues.put("sns_bgurl", this.field_sns_bgurl);
    AppMethodBeat.o(24432);
    return localContentValues;
  }

  public final String getCity()
  {
    AppMethodBeat.i(24430);
    Object localObject;
    if (!bo.isNullOrNil(this.field_regionCode))
    {
      localObject = this.field_regionCode.split("_");
      if (localObject.length > 0)
      {
        if (localObject.length <= 2)
          break label71;
        RegionCodeDecoder.duj();
        this.field_city = RegionCodeDecoder.aD(localObject[0], localObject[1], localObject[2]);
      }
    }
    while (true)
    {
      localObject = this.field_city;
      AppMethodBeat.o(24430);
      return localObject;
      label71: if (localObject.length == 2)
      {
        RegionCodeDecoder.duj();
        this.field_city = RegionCodeDecoder.id(localObject[0], localObject[1]);
      }
      else
      {
        this.field_city = "";
      }
    }
  }

  public final String getProvince()
  {
    AppMethodBeat.i(24429);
    Object localObject;
    if (!bo.isNullOrNil(this.field_regionCode))
    {
      localObject = this.field_regionCode.split("_");
      if (localObject.length > 0)
      {
        if ((localObject.length <= 2) || (!localObject[0].equalsIgnoreCase("cn")))
          break label80;
        RegionCodeDecoder.duj();
      }
    }
    for (this.field_province = RegionCodeDecoder.id(localObject[0], localObject[1]); ; this.field_province = RegionCodeDecoder.apR(localObject[0]))
    {
      localObject = this.field_province;
      AppMethodBeat.o(24429);
      return localObject;
      label80: RegionCodeDecoder.duj();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.b.d
 * JD-Core Version:    0.6.2
 */