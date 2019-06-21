package com.tencent.mm.plugin.card.sharecard.model;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ee;
import com.tencent.mm.plugin.card.b.e;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.protocal.protobuf.bzi;
import com.tencent.mm.protocal.protobuf.no;
import com.tencent.mm.protocal.protobuf.nz;
import com.tencent.mm.protocal.protobuf.od;
import com.tencent.mm.protocal.protobuf.oi;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.lang.reflect.Field;
import java.util.Map;

public class ShareCardInfo extends ee
  implements Parcelable, com.tencent.mm.plugin.card.base.b
{
  public static final Parcelable.Creator<ShareCardInfo> CREATOR;
  protected static c.a ccO;
  public String kbY;
  public oi kcY;
  public no kcZ;
  public bzi kda;
  public od kdb;
  public boolean kdc;

  static
  {
    AppMethodBeat.i(88072);
    c.a locala = new c.a();
    locala.xDb = new Field[19];
    locala.columns = new String[20];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "card_id";
    locala.xDd.put("card_id", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" card_id TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "card_id";
    locala.columns[1] = "card_tp_id";
    locala.xDd.put("card_tp_id", "TEXT");
    localStringBuilder.append(" card_tp_id TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "from_username";
    locala.xDd.put("from_username", "TEXT");
    localStringBuilder.append(" from_username TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "consumer";
    locala.xDd.put("consumer", "TEXT");
    localStringBuilder.append(" consumer TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "app_id";
    locala.xDd.put("app_id", "TEXT");
    localStringBuilder.append(" app_id TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "status";
    locala.xDd.put("status", "INTEGER");
    localStringBuilder.append(" status INTEGER");
    localStringBuilder.append(", ");
    locala.columns[6] = "share_time";
    locala.xDd.put("share_time", "LONG");
    localStringBuilder.append(" share_time LONG");
    localStringBuilder.append(", ");
    locala.columns[7] = "local_updateTime";
    locala.xDd.put("local_updateTime", "LONG");
    localStringBuilder.append(" local_updateTime LONG");
    localStringBuilder.append(", ");
    locala.columns[8] = "updateTime";
    locala.xDd.put("updateTime", "LONG");
    localStringBuilder.append(" updateTime LONG");
    localStringBuilder.append(", ");
    locala.columns[9] = "begin_time";
    locala.xDd.put("begin_time", "LONG");
    localStringBuilder.append(" begin_time LONG");
    localStringBuilder.append(", ");
    locala.columns[10] = "end_time";
    locala.xDd.put("end_time", "LONG");
    localStringBuilder.append(" end_time LONG");
    localStringBuilder.append(", ");
    locala.columns[11] = "updateSeq";
    locala.xDd.put("updateSeq", "LONG");
    localStringBuilder.append(" updateSeq LONG");
    localStringBuilder.append(", ");
    locala.columns[12] = "block_mask";
    locala.xDd.put("block_mask", "LONG");
    localStringBuilder.append(" block_mask LONG");
    localStringBuilder.append(", ");
    locala.columns[13] = "dataInfoData";
    locala.xDd.put("dataInfoData", "BLOB");
    localStringBuilder.append(" dataInfoData BLOB");
    localStringBuilder.append(", ");
    locala.columns[14] = "cardTpInfoData";
    locala.xDd.put("cardTpInfoData", "BLOB");
    localStringBuilder.append(" cardTpInfoData BLOB");
    localStringBuilder.append(", ");
    locala.columns[15] = "shareInfoData";
    locala.xDd.put("shareInfoData", "BLOB");
    localStringBuilder.append(" shareInfoData BLOB");
    localStringBuilder.append(", ");
    locala.columns[16] = "shopInfoData";
    locala.xDd.put("shopInfoData", "BLOB");
    localStringBuilder.append(" shopInfoData BLOB");
    localStringBuilder.append(", ");
    locala.columns[17] = "categoryType";
    locala.xDd.put("categoryType", "INTEGER default '0' ");
    localStringBuilder.append(" categoryType INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[18] = "itemIndex";
    locala.xDd.put("itemIndex", "INTEGER default '0' ");
    localStringBuilder.append(" itemIndex INTEGER default '0' ");
    locala.columns[19] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    CREATOR = new ShareCardInfo.1();
    AppMethodBeat.o(88072);
  }

  public ShareCardInfo()
  {
    this.kdc = true;
    this.kbY = "";
  }

  public ShareCardInfo(Parcel paramParcel)
  {
    AppMethodBeat.i(88065);
    this.kdc = true;
    this.kbY = "";
    this.field_card_id = paramParcel.readString();
    this.field_card_tp_id = paramParcel.readString();
    this.field_from_username = paramParcel.readString();
    this.field_status = paramParcel.readInt();
    this.field_share_time = paramParcel.readLong();
    this.field_local_updateTime = paramParcel.readLong();
    this.field_updateTime = paramParcel.readLong();
    this.field_updateSeq = paramParcel.readLong();
    this.field_block_mask = paramParcel.readLong();
    this.field_end_time = paramParcel.readLong();
    this.field_categoryType = paramParcel.readInt();
    this.field_itemIndex = paramParcel.readInt();
    int j = paramParcel.readInt();
    int k;
    if (j > 0)
    {
      this.field_dataInfoData = new byte[j];
      for (k = 0; k < j; k++)
        this.field_dataInfoData[k] = paramParcel.readByte();
    }
    j = paramParcel.readInt();
    if (j > 0)
    {
      this.field_cardTpInfoData = new byte[j];
      for (k = 0; k < j; k++)
        this.field_cardTpInfoData[k] = paramParcel.readByte();
    }
    j = paramParcel.readInt();
    if (j > 0)
    {
      this.field_shareInfoData = new byte[j];
      for (k = 0; k < j; k++)
        this.field_shareInfoData[k] = paramParcel.readByte();
    }
    j = paramParcel.readInt();
    if (j > 0)
    {
      this.field_shopInfoData = new byte[j];
      for (k = i; k < j; k++)
        this.field_shopInfoData[k] = paramParcel.readByte();
    }
    AppMethodBeat.o(88065);
  }

  public final c.a Ag()
  {
    return ccO;
  }

  public final void Gi(String paramString)
  {
    this.field_from_username = paramString;
  }

  public final void a(bzi parambzi)
  {
    AppMethodBeat.i(88062);
    this.kda = parambzi;
    try
    {
      this.field_shareInfoData = parambzi.toByteArray();
      AppMethodBeat.o(88062);
      return;
    }
    catch (Exception parambzi)
    {
      while (true)
      {
        ab.e("MicroMsg.ShareCardInfo", "setShareInfo fail, ex = %s", new Object[] { parambzi.getMessage() });
        ab.printErrStackTrace("MicroMsg.ShareCardInfo", parambzi, "", new Object[0]);
        AppMethodBeat.o(88062);
      }
    }
  }

  public final void a(no paramno)
  {
    AppMethodBeat.i(88060);
    this.kcZ = paramno;
    if (this.kcZ != null);
    while (true)
    {
      try
      {
        this.field_dataInfoData = paramno.toByteArray();
        AppMethodBeat.o(88060);
        return;
      }
      catch (Exception paramno)
      {
        ab.e("MicroMsg.ShareCardInfo", "setDataInfo fail, ex = %s", new Object[] { paramno.getMessage() });
        ab.printErrStackTrace("MicroMsg.ShareCardInfo", paramno, "", new Object[0]);
      }
      AppMethodBeat.o(88060);
    }
  }

  public final void a(od paramod)
  {
    AppMethodBeat.i(88064);
    this.kdb = paramod;
    try
    {
      this.field_shopInfoData = paramod.toByteArray();
      AppMethodBeat.o(88064);
      return;
    }
    catch (Exception paramod)
    {
      while (true)
      {
        ab.e("MicroMsg.ShareCardInfo", "setShopInfo fail, ex = %s", new Object[] { paramod.getMessage() });
        ab.printErrStackTrace("MicroMsg.ShareCardInfo", paramod, "", new Object[0]);
        AppMethodBeat.o(88064);
      }
    }
  }

  public final void a(oi paramoi)
  {
    AppMethodBeat.i(88058);
    this.kcY = paramoi;
    try
    {
      this.field_cardTpInfoData = paramoi.toByteArray();
      AppMethodBeat.o(88058);
      return;
    }
    catch (Exception paramoi)
    {
      while (true)
      {
        ab.e("MicroMsg.ShareCardInfo", "setCardTpInfo fail, ex = %s", new Object[] { paramoi.getMessage() });
        AppMethodBeat.o(88058);
      }
    }
  }

  public final boolean aZB()
  {
    AppMethodBeat.i(88067);
    boolean bool;
    if ((aZV() != null) && (aZV().vUn == 0))
    {
      bool = true;
      AppMethodBeat.o(88067);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(88067);
    }
  }

  public final boolean aZC()
  {
    boolean bool = true;
    AppMethodBeat.i(88068);
    if ((aZV() != null) && (aZV().vUn == 1))
      AppMethodBeat.o(88068);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(88068);
    }
  }

  public final boolean aZD()
  {
    AppMethodBeat.i(88041);
    boolean bool;
    if ((aZV() != null) && (aZV().iAd == 10))
    {
      bool = true;
      AppMethodBeat.o(88041);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(88041);
    }
  }

  public final boolean aZE()
  {
    AppMethodBeat.i(88042);
    boolean bool;
    if ((aZV() != null) && (aZV().iAd == 0))
    {
      bool = true;
      AppMethodBeat.o(88042);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(88042);
    }
  }

  public final boolean aZF()
  {
    AppMethodBeat.i(88043);
    boolean bool;
    if ((aZV() != null) && (aZV().iAd == 20))
    {
      bool = true;
      AppMethodBeat.o(88043);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(88043);
    }
  }

  public final boolean aZG()
  {
    AppMethodBeat.i(88044);
    boolean bool;
    if ((aZV() != null) && (aZV().iAd == 11))
    {
      bool = true;
      AppMethodBeat.o(88044);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(88044);
    }
  }

  public final boolean aZH()
  {
    AppMethodBeat.i(88045);
    boolean bool;
    if ((aZV() != null) && (aZV().iAd == 30))
    {
      bool = true;
      AppMethodBeat.o(88045);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(88045);
    }
  }

  public final boolean aZI()
  {
    AppMethodBeat.i(88046);
    boolean bool = l.sP(aZV().iAd);
    AppMethodBeat.o(88046);
    return bool;
  }

  public final boolean aZJ()
  {
    AppMethodBeat.i(88047);
    boolean bool;
    if ((aZV().vUd & 0x2) == 0)
    {
      bool = true;
      AppMethodBeat.o(88047);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(88047);
    }
  }

  public final boolean aZK()
  {
    AppMethodBeat.i(88048);
    boolean bool;
    if ((aZV().vUd & 0x1) == 0)
    {
      bool = true;
      AppMethodBeat.o(88048);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(88048);
    }
  }

  public final boolean aZL()
  {
    AppMethodBeat.i(88049);
    boolean bool;
    if ((aZV().vUg & 1L) == 0L)
    {
      bool = true;
      AppMethodBeat.o(88049);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(88049);
    }
  }

  public final boolean aZM()
  {
    AppMethodBeat.i(88050);
    boolean bool;
    if ((aZV().vUg & 0x10) == 0L)
    {
      bool = true;
      AppMethodBeat.o(88050);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(88050);
    }
  }

  public final boolean aZN()
  {
    AppMethodBeat.i(88051);
    boolean bool;
    if ((aZV().vUg & 0x2) > 0L)
    {
      bool = true;
      AppMethodBeat.o(88051);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(88051);
    }
  }

  public final boolean aZO()
  {
    return false;
  }

  public final boolean aZP()
  {
    AppMethodBeat.i(88052);
    boolean bool;
    if ((aZV().vUg & 0x4) > 0L)
    {
      bool = true;
      AppMethodBeat.o(88052);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(88052);
    }
  }

  public final boolean aZQ()
  {
    AppMethodBeat.i(88053);
    boolean bool;
    if ((aZV().vUg & 0x8) > 0L)
    {
      bool = true;
      AppMethodBeat.o(88053);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(88053);
    }
  }

  public final boolean aZR()
  {
    boolean bool = true;
    AppMethodBeat.i(88071);
    if ((aZV() != null) && (aZV().vUs == 1))
      AppMethodBeat.o(88071);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(88071);
    }
  }

  public final boolean aZS()
  {
    boolean bool = false;
    AppMethodBeat.i(88055);
    if (!isNormal())
      AppMethodBeat.o(88055);
    while (true)
    {
      return bool;
      if (this.kcY != null)
        ab.i("MicroMsg.ShareCardInfo", "is_acceptable:" + this.kcY.vUt);
      ab.i("MicroMsg.ShareCardInfo", "avail_num:" + this.kcZ.vSa);
      if ((this.kcY != null) && (this.kcY.vUt == 1))
      {
        AppMethodBeat.o(88055);
        bool = true;
      }
      else if (this.kcZ.vSa > 0)
      {
        AppMethodBeat.o(88055);
        bool = true;
      }
      else if ((this.kcY != null) && (this.kcY.vUt == 0))
      {
        AppMethodBeat.o(88055);
      }
      else if (this.kcZ.vSa == 0)
      {
        AppMethodBeat.o(88055);
      }
      else
      {
        AppMethodBeat.o(88055);
      }
    }
  }

  public final boolean aZT()
  {
    boolean bool = false;
    AppMethodBeat.i(88056);
    if ((this.kcY == null) || (this.kcY.vUk == null) || (TextUtils.isEmpty(this.kcY.vUk.text)))
      AppMethodBeat.o(88056);
    while (true)
    {
      return bool;
      nz localnz = this.kcY.vUk;
      int i = (int)(System.currentTimeMillis() / 1000L);
      int j = localnz.qsz;
      if ((localnz.qsz > 0) && (j - i > 0))
      {
        bool = true;
        AppMethodBeat.o(88056);
      }
      else
      {
        AppMethodBeat.o(88056);
      }
    }
  }

  public final boolean aZU()
  {
    boolean bool = true;
    if ((this.kcY != null) && (this.kcY.vUx == 1));
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final oi aZV()
  {
    AppMethodBeat.i(88057);
    oi localoi1;
    if (this.kcY != null)
    {
      localoi1 = this.kcY;
      AppMethodBeat.o(88057);
    }
    while (true)
    {
      return localoi1;
      try
      {
        localoi1 = new com/tencent/mm/protocal/protobuf/oi;
        localoi1.<init>();
        this.kcY = ((oi)localoi1.parseFrom(this.field_cardTpInfoData));
        localoi1 = this.kcY;
        AppMethodBeat.o(88057);
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.ShareCardInfo", "getCardTpInfo fail, ex = %s", new Object[] { localException.getMessage() });
        ab.printErrStackTrace("MicroMsg.ShareCardInfo", localException, "", new Object[0]);
        oi localoi2 = new oi();
        AppMethodBeat.o(88057);
      }
    }
  }

  public final no aZW()
  {
    AppMethodBeat.i(88059);
    no localno1;
    if (this.kcZ != null)
    {
      localno1 = this.kcZ;
      AppMethodBeat.o(88059);
    }
    while (true)
    {
      return localno1;
      try
      {
        localno1 = new com/tencent/mm/protocal/protobuf/no;
        localno1.<init>();
        this.kcZ = ((no)localno1.parseFrom(this.field_dataInfoData));
        localno1 = this.kcZ;
        AppMethodBeat.o(88059);
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.ShareCardInfo", "getDataInfo fail, ex = %s", new Object[] { localException.getMessage() });
        ab.printErrStackTrace("MicroMsg.ShareCardInfo", localException, "", new Object[0]);
        no localno2 = new no();
        AppMethodBeat.o(88059);
      }
    }
  }

  public final bzi aZX()
  {
    AppMethodBeat.i(88061);
    bzi localbzi1;
    if (this.kda != null)
    {
      localbzi1 = this.kda;
      AppMethodBeat.o(88061);
    }
    while (true)
    {
      return localbzi1;
      try
      {
        localbzi1 = new com/tencent/mm/protocal/protobuf/bzi;
        localbzi1.<init>();
        this.kda = ((bzi)localbzi1.parseFrom(this.field_shareInfoData));
        localbzi1 = this.kda;
        AppMethodBeat.o(88061);
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.ShareCardInfo", "getShareInfo fail, ex = %s", new Object[] { localException.getMessage() });
        ab.printErrStackTrace("MicroMsg.ShareCardInfo", localException, "", new Object[0]);
        bzi localbzi2 = new bzi();
        AppMethodBeat.o(88061);
      }
    }
  }

  public final od aZY()
  {
    AppMethodBeat.i(88063);
    od localod;
    if (this.kdb != null)
    {
      localod = this.kdb;
      AppMethodBeat.o(88063);
    }
    while (true)
    {
      return localod;
      try
      {
        localod = new com/tencent/mm/protocal/protobuf/od;
        localod.<init>();
        this.kdb = ((od)localod.parseFrom(this.field_shopInfoData));
        localod = this.kdb;
        AppMethodBeat.o(88063);
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.ShareCardInfo", "getShopInfo fail ex = %s", new Object[] { localException.getMessage() });
        ab.printErrStackTrace("MicroMsg.ShareCardInfo", localException, "", new Object[0]);
        Object localObject = null;
        AppMethodBeat.o(88063);
      }
    }
  }

  public final String aZZ()
  {
    return this.field_card_id;
  }

  public final String baa()
  {
    return this.field_card_tp_id;
  }

  public final String bab()
  {
    return this.field_from_username;
  }

  public final long bac()
  {
    return this.field_local_updateTime;
  }

  public final String bad()
  {
    return "";
  }

  public final int bae()
  {
    return this.field_categoryType;
  }

  public final String baf()
  {
    AppMethodBeat.i(88070);
    ab.d("MicroMsg.ShareCardInfo", "encrypt_code:" + this.kbY);
    String str = this.kbY;
    AppMethodBeat.o(88070);
    return str;
  }

  public int describeContents()
  {
    return 0;
  }

  public final long getEndTime()
  {
    return this.field_end_time;
  }

  public final boolean isAcceptable()
  {
    boolean bool = false;
    AppMethodBeat.i(88054);
    if (!isNormal())
      AppMethodBeat.o(88054);
    while (true)
    {
      return bool;
      if (this.kcY != null)
        ab.i("MicroMsg.ShareCardInfo", "is_acceptable:" + this.kcY.vUt);
      ab.i("MicroMsg.ShareCardInfo", "stock_num:" + this.kcZ.vSd + " limit_num:" + this.kcZ.vSe);
      if ((this.kcY != null) && (this.kcY.vUt == 1))
      {
        AppMethodBeat.o(88054);
        bool = true;
      }
      else if ((this.kcY != null) && (this.kcY.vUt == 0))
      {
        AppMethodBeat.o(88054);
      }
      else if ((this.kcZ.vSd == 0L) || (this.kcZ.vSe == 0))
      {
        AppMethodBeat.o(88054);
      }
      else
      {
        AppMethodBeat.o(88054);
      }
    }
  }

  public final boolean isNormal()
  {
    if ((this.kcZ != null) && (this.kcZ.status == 0));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final String sN(int paramInt)
  {
    AppMethodBeat.i(88069);
    String str;
    if (paramInt == 10)
    {
      str = (String)am.bbb().getValue("key_share_card_local_city");
      AppMethodBeat.o(88069);
    }
    while (true)
    {
      return str;
      if (paramInt == 0)
      {
        if (com.tencent.mm.plugin.card.sharecard.a.b.bbv())
        {
          str = ah.getResources().getString(2131297954);
          AppMethodBeat.o(88069);
        }
        else
        {
          str = "";
          AppMethodBeat.o(88069);
        }
      }
      else
      {
        str = "";
        AppMethodBeat.o(88069);
      }
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(88066);
    paramParcel.writeString(this.field_card_id);
    paramParcel.writeString(this.field_card_tp_id);
    paramParcel.writeString(this.field_from_username);
    paramParcel.writeInt(this.field_status);
    paramParcel.writeLong(this.field_share_time);
    paramParcel.writeLong(this.field_local_updateTime);
    paramParcel.writeLong(this.field_updateTime);
    paramParcel.writeLong(this.field_updateSeq);
    paramParcel.writeLong(this.field_block_mask);
    paramParcel.writeLong(this.field_end_time);
    paramParcel.writeInt(this.field_categoryType);
    paramParcel.writeInt(this.field_itemIndex);
    if (this.field_dataInfoData != null)
    {
      paramParcel.writeInt(this.field_dataInfoData.length);
      for (paramInt = 0; paramInt < this.field_dataInfoData.length; paramInt++)
        paramParcel.writeByte(this.field_dataInfoData[paramInt]);
    }
    if (this.field_cardTpInfoData != null)
    {
      paramParcel.writeInt(this.field_cardTpInfoData.length);
      for (paramInt = 0; paramInt < this.field_cardTpInfoData.length; paramInt++)
        paramParcel.writeByte(this.field_cardTpInfoData[paramInt]);
    }
    if (this.field_shareInfoData != null)
    {
      paramParcel.writeInt(this.field_shareInfoData.length);
      for (paramInt = 0; paramInt < this.field_shareInfoData.length; paramInt++)
        paramParcel.writeByte(this.field_shareInfoData[paramInt]);
    }
    if (this.field_shopInfoData != null)
    {
      paramParcel.writeInt(this.field_shopInfoData.length);
      for (paramInt = i; paramInt < this.field_shopInfoData.length; paramInt++)
        paramParcel.writeByte(this.field_shopInfoData[paramInt]);
    }
    AppMethodBeat.o(88066);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo
 * JD-Core Version:    0.6.2
 */