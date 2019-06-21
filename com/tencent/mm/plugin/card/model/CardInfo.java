package com.tencent.mm.plugin.card.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ew;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.protocal.protobuf.bzi;
import com.tencent.mm.protocal.protobuf.no;
import com.tencent.mm.protocal.protobuf.nz;
import com.tencent.mm.protocal.protobuf.od;
import com.tencent.mm.protocal.protobuf.oi;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.reflect.Field;
import java.util.Map;

public class CardInfo extends ew
  implements Parcelable, b
{
  public static final Parcelable.Creator<CardInfo> CREATOR;
  protected static c.a ccO;
  public String kbY;
  public oi kcY;
  public no kcZ;
  public bzi kda;
  public od kdb;
  public boolean kdc;

  static
  {
    AppMethodBeat.i(87823);
    c.a locala = new c.a();
    locala.xDb = new Field[22];
    locala.columns = new String[23];
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
    locala.columns[3] = "status";
    locala.xDd.put("status", "INTEGER");
    localStringBuilder.append(" status INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "delete_state_flag";
    locala.xDd.put("delete_state_flag", "INTEGER");
    localStringBuilder.append(" delete_state_flag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[5] = "local_updateTime";
    locala.xDd.put("local_updateTime", "LONG");
    localStringBuilder.append(" local_updateTime LONG");
    localStringBuilder.append(", ");
    locala.columns[6] = "updateTime";
    locala.xDd.put("updateTime", "LONG");
    localStringBuilder.append(" updateTime LONG");
    localStringBuilder.append(", ");
    locala.columns[7] = "updateSeq";
    locala.xDd.put("updateSeq", "LONG");
    localStringBuilder.append(" updateSeq LONG");
    localStringBuilder.append(", ");
    locala.columns[8] = "create_time";
    locala.xDd.put("create_time", "LONG");
    localStringBuilder.append(" create_time LONG");
    localStringBuilder.append(", ");
    locala.columns[9] = "begin_time";
    locala.xDd.put("begin_time", "LONG");
    localStringBuilder.append(" begin_time LONG");
    localStringBuilder.append(", ");
    locala.columns[10] = "end_time";
    locala.xDd.put("end_time", "LONG");
    localStringBuilder.append(" end_time LONG");
    localStringBuilder.append(", ");
    locala.columns[11] = "block_mask";
    locala.xDd.put("block_mask", "TEXT");
    localStringBuilder.append(" block_mask TEXT");
    localStringBuilder.append(", ");
    locala.columns[12] = "dataInfoData";
    locala.xDd.put("dataInfoData", "BLOB");
    localStringBuilder.append(" dataInfoData BLOB");
    localStringBuilder.append(", ");
    locala.columns[13] = "cardTpInfoData";
    locala.xDd.put("cardTpInfoData", "BLOB");
    localStringBuilder.append(" cardTpInfoData BLOB");
    localStringBuilder.append(", ");
    locala.columns[14] = "shareInfoData";
    locala.xDd.put("shareInfoData", "BLOB");
    localStringBuilder.append(" shareInfoData BLOB");
    localStringBuilder.append(", ");
    locala.columns[15] = "shopInfoData";
    locala.xDd.put("shopInfoData", "BLOB");
    localStringBuilder.append(" shopInfoData BLOB");
    localStringBuilder.append(", ");
    locala.columns[16] = "stickyIndex";
    locala.xDd.put("stickyIndex", "INTEGER");
    localStringBuilder.append(" stickyIndex INTEGER");
    localStringBuilder.append(", ");
    locala.columns[17] = "stickyEndTime";
    locala.xDd.put("stickyEndTime", "INTEGER");
    localStringBuilder.append(" stickyEndTime INTEGER");
    localStringBuilder.append(", ");
    locala.columns[18] = "stickyAnnouncement";
    locala.xDd.put("stickyAnnouncement", "TEXT");
    localStringBuilder.append(" stickyAnnouncement TEXT");
    localStringBuilder.append(", ");
    locala.columns[19] = "card_type";
    locala.xDd.put("card_type", "INTEGER default '-1' ");
    localStringBuilder.append(" card_type INTEGER default '-1' ");
    localStringBuilder.append(", ");
    locala.columns[20] = "label_wording";
    locala.xDd.put("label_wording", "TEXT");
    localStringBuilder.append(" label_wording TEXT");
    localStringBuilder.append(", ");
    locala.columns[21] = "is_dynamic";
    locala.xDd.put("is_dynamic", "INTEGER");
    localStringBuilder.append(" is_dynamic INTEGER");
    locala.columns[22] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(87823);
  }

  public CardInfo()
  {
    this.kdc = true;
    this.kbY = "";
    this.field_card_type = -1;
  }

  public CardInfo(Parcel paramParcel)
  {
    AppMethodBeat.i(87817);
    this.kdc = true;
    this.kbY = "";
    this.field_card_id = paramParcel.readString();
    this.field_card_tp_id = paramParcel.readString();
    this.field_from_username = paramParcel.readString();
    this.field_status = paramParcel.readInt();
    this.field_delete_state_flag = paramParcel.readInt();
    this.field_local_updateTime = paramParcel.readLong();
    this.field_updateTime = paramParcel.readLong();
    this.field_updateSeq = paramParcel.readLong();
    this.field_create_time = paramParcel.readLong();
    this.field_begin_time = paramParcel.readLong();
    this.field_end_time = paramParcel.readLong();
    this.field_block_mask = paramParcel.readString();
    this.field_stickyIndex = paramParcel.readInt();
    this.field_stickyEndTime = paramParcel.readInt();
    this.field_stickyAnnouncement = paramParcel.readString();
    this.field_card_type = paramParcel.readInt();
    this.field_label_wording = paramParcel.readString();
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
    AppMethodBeat.o(87817);
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
    AppMethodBeat.i(87814);
    this.kda = parambzi;
    if (parambzi != null);
    try
    {
      this.field_shareInfoData = parambzi.toByteArray();
      AppMethodBeat.o(87814);
      return;
    }
    catch (Exception parambzi)
    {
      while (true)
      {
        ab.e("MicroMsg.CardInfo", "setShareInfo fail, ex = %s", new Object[] { parambzi.getMessage() });
        ab.printErrStackTrace("MicroMsg.CardInfo", parambzi, "", new Object[0]);
        AppMethodBeat.o(87814);
      }
    }
  }

  public final void a(no paramno)
  {
    AppMethodBeat.i(87812);
    this.kcZ = paramno;
    if (this.kcZ != null)
    {
      this.field_status = this.kcZ.status;
      if (paramno == null);
    }
    while (true)
    {
      try
      {
        this.field_dataInfoData = paramno.toByteArray();
        AppMethodBeat.o(87812);
        return;
      }
      catch (Exception paramno)
      {
        ab.e("MicroMsg.CardInfo", "setDataInfo fail, ex = %s", new Object[] { paramno.getMessage() });
        ab.printErrStackTrace("MicroMsg.CardInfo", paramno, "", new Object[0]);
      }
      AppMethodBeat.o(87812);
    }
  }

  public final void a(od paramod)
  {
    AppMethodBeat.i(87816);
    this.kdb = paramod;
    if (paramod != null);
    try
    {
      this.field_shopInfoData = paramod.toByteArray();
      AppMethodBeat.o(87816);
      return;
    }
    catch (Exception paramod)
    {
      while (true)
      {
        ab.e("MicroMsg.CardInfo", "setShopInfo fail, ex = %s", new Object[] { paramod.getMessage() });
        ab.printErrStackTrace("MicroMsg.CardInfo", paramod, "", new Object[0]);
        AppMethodBeat.o(87816);
      }
    }
  }

  public final void a(oi paramoi)
  {
    AppMethodBeat.i(87810);
    this.kcY = paramoi;
    if (paramoi != null);
    try
    {
      this.field_cardTpInfoData = paramoi.toByteArray();
      AppMethodBeat.o(87810);
      return;
    }
    catch (Exception paramoi)
    {
      while (true)
      {
        ab.e("MicroMsg.CardInfo", "setCardTpInfo fail, ex = %s", new Object[] { paramoi.getMessage() });
        AppMethodBeat.o(87810);
      }
    }
  }

  public final boolean aZB()
  {
    AppMethodBeat.i(87819);
    boolean bool;
    if ((aZV() != null) && (aZV().vUn == 0))
    {
      bool = true;
      AppMethodBeat.o(87819);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(87819);
    }
  }

  public final boolean aZC()
  {
    boolean bool = true;
    AppMethodBeat.i(87820);
    if ((aZV() != null) && (aZV().vUn == 1))
      AppMethodBeat.o(87820);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(87820);
    }
  }

  public final boolean aZD()
  {
    AppMethodBeat.i(87792);
    boolean bool;
    if ((aZV() != null) && (aZV().iAd == 10))
    {
      bool = true;
      AppMethodBeat.o(87792);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(87792);
    }
  }

  public final boolean aZE()
  {
    AppMethodBeat.i(87793);
    boolean bool;
    if ((aZV() != null) && (aZV().iAd == 0))
    {
      bool = true;
      AppMethodBeat.o(87793);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(87793);
    }
  }

  public final boolean aZF()
  {
    AppMethodBeat.i(87794);
    boolean bool;
    if ((aZV() != null) && (aZV().iAd == 20))
    {
      bool = true;
      AppMethodBeat.o(87794);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(87794);
    }
  }

  public final boolean aZG()
  {
    AppMethodBeat.i(87795);
    boolean bool;
    if ((aZV() != null) && (aZV().iAd == 11))
    {
      bool = true;
      AppMethodBeat.o(87795);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(87795);
    }
  }

  public final boolean aZH()
  {
    AppMethodBeat.i(87796);
    boolean bool;
    if ((aZV() != null) && (aZV().iAd == 30))
    {
      bool = true;
      AppMethodBeat.o(87796);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(87796);
    }
  }

  public final boolean aZI()
  {
    AppMethodBeat.i(87797);
    boolean bool = l.sP(aZV().iAd);
    AppMethodBeat.o(87797);
    return bool;
  }

  public final boolean aZJ()
  {
    AppMethodBeat.i(87798);
    boolean bool;
    if ((aZV().vUd & 0x2) == 0)
    {
      bool = true;
      AppMethodBeat.o(87798);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(87798);
    }
  }

  public final boolean aZK()
  {
    AppMethodBeat.i(87799);
    boolean bool;
    if ((aZV().vUd & 0x1) == 0)
    {
      bool = true;
      AppMethodBeat.o(87799);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(87799);
    }
  }

  public final boolean aZL()
  {
    AppMethodBeat.i(87800);
    boolean bool;
    if ((aZV().vUg & 1L) == 0L)
    {
      bool = true;
      AppMethodBeat.o(87800);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(87800);
    }
  }

  public final boolean aZM()
  {
    AppMethodBeat.i(87801);
    boolean bool;
    if ((aZV().vUg & 0x10) == 0L)
    {
      bool = true;
      AppMethodBeat.o(87801);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(87801);
    }
  }

  public final boolean aZN()
  {
    AppMethodBeat.i(87802);
    boolean bool;
    if ((aZV().vUg & 0x2) > 0L)
    {
      bool = true;
      AppMethodBeat.o(87802);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(87802);
    }
  }

  public final boolean aZO()
  {
    AppMethodBeat.i(87803);
    boolean bool;
    if ((aZV().vUg & 0x20) > 0L)
    {
      bool = true;
      AppMethodBeat.o(87803);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(87803);
    }
  }

  public final boolean aZP()
  {
    AppMethodBeat.i(87804);
    boolean bool;
    if ((aZV().vUg & 0x4) > 0L)
    {
      bool = true;
      AppMethodBeat.o(87804);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(87804);
    }
  }

  public final boolean aZQ()
  {
    AppMethodBeat.i(87805);
    boolean bool;
    if ((aZV().vUg & 0x8) > 0L)
    {
      bool = true;
      AppMethodBeat.o(87805);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(87805);
    }
  }

  public final boolean aZR()
  {
    boolean bool = true;
    AppMethodBeat.i(87822);
    if ((aZV() != null) && (aZV().vUs == 1))
      AppMethodBeat.o(87822);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(87822);
    }
  }

  public final boolean aZS()
  {
    boolean bool = false;
    AppMethodBeat.i(87807);
    if (!isNormal())
      AppMethodBeat.o(87807);
    while (true)
    {
      return bool;
      if (this.kcY != null)
        ab.i("MicroMsg.CardInfo", "is_acceptable:" + this.kcY.vUt);
      ab.i("MicroMsg.CardInfo", "avail_num:" + this.kcZ.vSa);
      if ((this.kcY != null) && (this.kcY.vUt == 1))
      {
        AppMethodBeat.o(87807);
        bool = true;
      }
      else if (this.kcZ.vSa > 0)
      {
        AppMethodBeat.o(87807);
        bool = true;
      }
      else if ((this.kcY != null) && (this.kcY.vUt == 0))
      {
        AppMethodBeat.o(87807);
      }
      else if (this.kcZ.vSa == 0)
      {
        AppMethodBeat.o(87807);
      }
      else
      {
        AppMethodBeat.o(87807);
      }
    }
  }

  public final boolean aZT()
  {
    boolean bool = false;
    AppMethodBeat.i(87808);
    if ((this.kcY == null) || (this.kcY.vUk == null) || (TextUtils.isEmpty(this.kcY.vUk.text)))
      AppMethodBeat.o(87808);
    while (true)
    {
      return bool;
      nz localnz = this.kcY.vUk;
      int i = (int)(System.currentTimeMillis() / 1000L);
      int j = localnz.qsz;
      if ((localnz.qsz > 0) && (j - i > 0))
      {
        bool = true;
        AppMethodBeat.o(87808);
      }
      else
      {
        AppMethodBeat.o(87808);
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
    AppMethodBeat.i(87809);
    oi localoi1;
    if (this.kcY != null)
    {
      localoi1 = this.kcY;
      AppMethodBeat.o(87809);
    }
    while (true)
    {
      return localoi1;
      try
      {
        if (this.field_cardTpInfoData != null)
        {
          localoi1 = new com/tencent/mm/protocal/protobuf/oi;
          localoi1.<init>();
          this.kcY = ((oi)localoi1.parseFrom(this.field_cardTpInfoData));
          localoi1 = this.kcY;
          AppMethodBeat.o(87809);
        }
        else
        {
          localoi1 = new oi();
          AppMethodBeat.o(87809);
        }
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.CardInfo", "getCardTpInfo fail, ex = %s", new Object[] { localException.getMessage() });
        ab.printErrStackTrace("MicroMsg.CardInfo", localException, "", new Object[0]);
        oi localoi2 = new oi();
        AppMethodBeat.o(87809);
      }
    }
  }

  public final no aZW()
  {
    AppMethodBeat.i(87811);
    no localno1;
    if (this.kcZ != null)
    {
      localno1 = this.kcZ;
      AppMethodBeat.o(87811);
    }
    while (true)
    {
      return localno1;
      try
      {
        if (this.field_dataInfoData != null)
        {
          localno1 = new com/tencent/mm/protocal/protobuf/no;
          localno1.<init>();
          this.kcZ = ((no)localno1.parseFrom(this.field_dataInfoData));
          localno1 = this.kcZ;
          AppMethodBeat.o(87811);
        }
        else
        {
          localno1 = new no();
          AppMethodBeat.o(87811);
        }
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.CardInfo", "getDataInfo fail, ex = %s", new Object[] { localException.getMessage() });
        ab.printErrStackTrace("MicroMsg.CardInfo", localException, "", new Object[0]);
        no localno2 = new no();
        AppMethodBeat.o(87811);
      }
    }
  }

  public final bzi aZX()
  {
    AppMethodBeat.i(87813);
    bzi localbzi1;
    if (this.kda != null)
    {
      localbzi1 = this.kda;
      AppMethodBeat.o(87813);
    }
    while (true)
    {
      return localbzi1;
      try
      {
        if (this.field_shareInfoData != null)
        {
          localbzi1 = new com/tencent/mm/protocal/protobuf/bzi;
          localbzi1.<init>();
          this.kda = ((bzi)localbzi1.parseFrom(this.field_shareInfoData));
          localbzi1 = this.kda;
          AppMethodBeat.o(87813);
        }
        else
        {
          localbzi1 = new bzi();
          AppMethodBeat.o(87813);
        }
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.CardInfo", "getShareInfo fail, ex = %s", new Object[] { localException.getMessage() });
        ab.printErrStackTrace("MicroMsg.CardInfo", localException, "", new Object[0]);
        bzi localbzi2 = new bzi();
        AppMethodBeat.o(87813);
      }
    }
  }

  public final od aZY()
  {
    AppMethodBeat.i(87815);
    od localod;
    if (this.kdb != null)
    {
      localod = this.kdb;
      AppMethodBeat.o(87815);
    }
    while (true)
    {
      return localod;
      try
      {
        if (this.field_shopInfoData != null)
        {
          localod = new com/tencent/mm/protocal/protobuf/od;
          localod.<init>();
          this.kdb = ((od)localod.parseFrom(this.field_shopInfoData));
          localod = this.kdb;
          AppMethodBeat.o(87815);
        }
        else
        {
          AppMethodBeat.o(87815);
          localod = null;
        }
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.CardInfo", "getShopInfo fail ex = %s", new Object[] { localException.getMessage() });
        ab.printErrStackTrace("MicroMsg.CardInfo", localException, "", new Object[0]);
        AppMethodBeat.o(87815);
        Object localObject = null;
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
    return null;
  }

  public final int bae()
  {
    return 0;
  }

  public final String baf()
  {
    AppMethodBeat.i(87821);
    ab.d("MicroMsg.CardInfo", "encrypt_code:" + this.kbY);
    String str = this.kbY;
    AppMethodBeat.o(87821);
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
    AppMethodBeat.i(87806);
    if (!isNormal())
      AppMethodBeat.o(87806);
    while (true)
    {
      return bool;
      if (this.kcY != null)
        ab.i("MicroMsg.CardInfo", "is_acceptable:" + this.kcY.vUt);
      ab.i("MicroMsg.CardInfo", "stock_num:" + this.kcZ.vSd + " limit_num:" + this.kcZ.vSe);
      if ((this.kcY != null) && (this.kcY.vUt == 1))
      {
        AppMethodBeat.o(87806);
        bool = true;
      }
      else if ((this.kcY != null) && (this.kcY.vUt == 0))
      {
        AppMethodBeat.o(87806);
      }
      else if ((this.kcZ.vSd == 0L) || (this.kcZ.vSe == 0))
      {
        AppMethodBeat.o(87806);
      }
      else
      {
        AppMethodBeat.o(87806);
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
    return null;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(87818);
    paramParcel.writeString(this.field_card_id);
    paramParcel.writeString(this.field_card_tp_id);
    paramParcel.writeString(this.field_from_username);
    paramParcel.writeInt(this.field_status);
    paramParcel.writeInt(this.field_delete_state_flag);
    paramParcel.writeLong(this.field_local_updateTime);
    paramParcel.writeLong(this.field_updateTime);
    paramParcel.writeLong(this.field_updateSeq);
    paramParcel.writeLong(this.field_create_time);
    paramParcel.writeLong(this.field_begin_time);
    paramParcel.writeLong(this.field_end_time);
    paramParcel.writeString(this.field_block_mask);
    paramParcel.writeInt(this.field_stickyIndex);
    paramParcel.writeInt(this.field_stickyEndTime);
    paramParcel.writeString(this.field_stickyAnnouncement);
    paramParcel.writeInt(this.field_card_type);
    paramParcel.writeString(this.field_label_wording);
    if (this.field_dataInfoData != null)
    {
      paramParcel.writeInt(this.field_dataInfoData.length);
      for (paramInt = 0; paramInt < this.field_dataInfoData.length; paramInt++)
        paramParcel.writeByte(this.field_dataInfoData[paramInt]);
    }
    paramParcel.writeInt(0);
    if (this.field_cardTpInfoData != null)
    {
      paramParcel.writeInt(this.field_cardTpInfoData.length);
      for (paramInt = 0; paramInt < this.field_cardTpInfoData.length; paramInt++)
        paramParcel.writeByte(this.field_cardTpInfoData[paramInt]);
    }
    paramParcel.writeInt(0);
    if (this.field_shareInfoData != null)
    {
      paramParcel.writeInt(this.field_shareInfoData.length);
      for (paramInt = 0; paramInt < this.field_shareInfoData.length; paramInt++)
        paramParcel.writeByte(this.field_shareInfoData[paramInt]);
    }
    paramParcel.writeInt(0);
    if (this.field_shopInfoData != null)
    {
      paramParcel.writeInt(this.field_shopInfoData.length);
      for (paramInt = i; paramInt < this.field_shopInfoData.length; paramInt++)
        paramParcel.writeByte(this.field_shopInfoData[paramInt]);
      AppMethodBeat.o(87818);
    }
    while (true)
    {
      return;
      paramParcel.writeInt(0);
      AppMethodBeat.o(87818);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.CardInfo
 * JD-Core Version:    0.6.2
 */