package com.tencent.mm.plugin.wallet_core.model;

import android.content.Context;
import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.fb;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.Set;

public class Bankcard extends fb
  implements Parcelable
{
  public static final Parcelable.Creator<Bankcard> CREATOR;
  public static c.a ccO;
  public static int twF;
  public static int twG;
  public static int twH;
  public static int twI;
  public static int twJ;
  public static int twK;
  public static int twL;
  public static int twM;
  public String twN;
  public String twO;
  public String twP;
  public String twQ;
  public String twR;
  public double twS;
  public String twT;
  public double twU;
  public String twV;
  public String twW;
  public String twX;
  public String twY;
  public String twZ;
  public int twf;
  public String twh;
  public String txa;
  public boolean txb;
  public e txc;
  public long txd;
  public long txe;
  public long txf;
  public String txg;
  public int txh;
  public int txi;
  public String txj;
  public String txk;
  public int txl;
  public String txm;
  public long txn;

  static
  {
    AppMethodBeat.i(46714);
    twF = 1;
    twG = 2;
    twH = 4;
    twI = 8;
    twJ = 16;
    twK = 32;
    twL = 64;
    twM = 128;
    c.a locala = new c.a();
    locala.xDb = new Field[40];
    locala.columns = new String[41];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "bindSerial";
    locala.xDd.put("bindSerial", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" bindSerial TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "bindSerial";
    locala.columns[1] = "cardType";
    locala.xDd.put("cardType", "INTEGER");
    localStringBuilder.append(" cardType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[2] = "bankcardState";
    locala.xDd.put("bankcardState", "INTEGER");
    localStringBuilder.append(" bankcardState INTEGER");
    localStringBuilder.append(", ");
    locala.columns[3] = "forbidWord";
    locala.xDd.put("forbidWord", "TEXT");
    localStringBuilder.append(" forbidWord TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "bankName";
    locala.xDd.put("bankName", "TEXT");
    localStringBuilder.append(" bankName TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "bankcardType";
    locala.xDd.put("bankcardType", "TEXT");
    localStringBuilder.append(" bankcardType TEXT");
    localStringBuilder.append(", ");
    locala.columns[6] = "bankcardTypeName";
    locala.xDd.put("bankcardTypeName", "TEXT");
    localStringBuilder.append(" bankcardTypeName TEXT");
    localStringBuilder.append(", ");
    locala.columns[7] = "bankcardTag";
    locala.xDd.put("bankcardTag", "INTEGER");
    localStringBuilder.append(" bankcardTag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[8] = "bankcardTail";
    locala.xDd.put("bankcardTail", "TEXT");
    localStringBuilder.append(" bankcardTail TEXT");
    localStringBuilder.append(", ");
    locala.columns[9] = "supportTag";
    locala.xDd.put("supportTag", "INTEGER");
    localStringBuilder.append(" supportTag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[10] = "mobile";
    locala.xDd.put("mobile", "TEXT");
    localStringBuilder.append(" mobile TEXT");
    localStringBuilder.append(", ");
    locala.columns[11] = "trueName";
    locala.xDd.put("trueName", "TEXT");
    localStringBuilder.append(" trueName TEXT");
    localStringBuilder.append(", ");
    locala.columns[12] = "desc";
    locala.xDd.put("desc", "TEXT");
    localStringBuilder.append(" desc TEXT");
    localStringBuilder.append(", ");
    locala.columns[13] = "bankPhone";
    locala.xDd.put("bankPhone", "TEXT");
    localStringBuilder.append(" bankPhone TEXT");
    localStringBuilder.append(", ");
    locala.columns[14] = "bizUsername";
    locala.xDd.put("bizUsername", "TEXT");
    localStringBuilder.append(" bizUsername TEXT");
    localStringBuilder.append(", ");
    locala.columns[15] = "onceQuotaKind";
    locala.xDd.put("onceQuotaKind", "DOUBLE");
    localStringBuilder.append(" onceQuotaKind DOUBLE");
    localStringBuilder.append(", ");
    locala.columns[16] = "onceQuotaVirtual";
    locala.xDd.put("onceQuotaVirtual", "DOUBLE");
    localStringBuilder.append(" onceQuotaVirtual DOUBLE");
    localStringBuilder.append(", ");
    locala.columns[17] = "dayQuotaKind";
    locala.xDd.put("dayQuotaKind", "DOUBLE");
    localStringBuilder.append(" dayQuotaKind DOUBLE");
    localStringBuilder.append(", ");
    locala.columns[18] = "dayQuotaVirtual";
    locala.xDd.put("dayQuotaVirtual", "DOUBLE");
    localStringBuilder.append(" dayQuotaVirtual DOUBLE");
    localStringBuilder.append(", ");
    locala.columns[19] = "fetchArriveTime";
    locala.xDd.put("fetchArriveTime", "LONG");
    localStringBuilder.append(" fetchArriveTime LONG");
    localStringBuilder.append(", ");
    locala.columns[20] = "fetchArriveTimeWording";
    locala.xDd.put("fetchArriveTimeWording", "TEXT");
    localStringBuilder.append(" fetchArriveTimeWording TEXT");
    localStringBuilder.append(", ");
    locala.columns[21] = "repay_url";
    locala.xDd.put("repay_url", "TEXT");
    localStringBuilder.append(" repay_url TEXT");
    localStringBuilder.append(", ");
    locala.columns[22] = "wxcreditState";
    locala.xDd.put("wxcreditState", "INTEGER");
    localStringBuilder.append(" wxcreditState INTEGER");
    localStringBuilder.append(", ");
    locala.columns[23] = "bankcardClientType";
    locala.xDd.put("bankcardClientType", "INTEGER");
    localStringBuilder.append(" bankcardClientType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[24] = "ext_msg";
    locala.xDd.put("ext_msg", "TEXT");
    localStringBuilder.append(" ext_msg TEXT");
    localStringBuilder.append(", ");
    locala.columns[25] = "support_micropay";
    locala.xDd.put("support_micropay", "INTEGER");
    localStringBuilder.append(" support_micropay INTEGER");
    localStringBuilder.append(", ");
    locala.columns[26] = "arrive_type";
    locala.xDd.put("arrive_type", "TEXT");
    localStringBuilder.append(" arrive_type TEXT");
    localStringBuilder.append(", ");
    locala.columns[27] = "avail_save_wording";
    locala.xDd.put("avail_save_wording", "TEXT");
    localStringBuilder.append(" avail_save_wording TEXT");
    localStringBuilder.append(", ");
    locala.columns[28] = "fetch_charge_rate";
    locala.xDd.put("fetch_charge_rate", "DOUBLE");
    localStringBuilder.append(" fetch_charge_rate DOUBLE");
    localStringBuilder.append(", ");
    locala.columns[29] = "full_fetch_charge_fee";
    locala.xDd.put("full_fetch_charge_fee", "DOUBLE");
    localStringBuilder.append(" full_fetch_charge_fee DOUBLE");
    localStringBuilder.append(", ");
    locala.columns[30] = "fetch_charge_info";
    locala.xDd.put("fetch_charge_info", "TEXT");
    localStringBuilder.append(" fetch_charge_info TEXT");
    localStringBuilder.append(", ");
    locala.columns[31] = "tips";
    locala.xDd.put("tips", "TEXT");
    localStringBuilder.append(" tips TEXT");
    localStringBuilder.append(", ");
    locala.columns[32] = "forbid_title";
    locala.xDd.put("forbid_title", "TEXT");
    localStringBuilder.append(" forbid_title TEXT");
    localStringBuilder.append(", ");
    locala.columns[33] = "forbid_url";
    locala.xDd.put("forbid_url", "TEXT");
    localStringBuilder.append(" forbid_url TEXT");
    localStringBuilder.append(", ");
    locala.columns[34] = "no_micro_word";
    locala.xDd.put("no_micro_word", "TEXT");
    localStringBuilder.append(" no_micro_word TEXT");
    localStringBuilder.append(", ");
    locala.columns[35] = "card_bottom_wording";
    locala.xDd.put("card_bottom_wording", "TEXT");
    localStringBuilder.append(" card_bottom_wording TEXT");
    localStringBuilder.append(", ");
    locala.columns[36] = "support_lqt_turn_in";
    locala.xDd.put("support_lqt_turn_in", "INTEGER");
    localStringBuilder.append(" support_lqt_turn_in INTEGER");
    localStringBuilder.append(", ");
    locala.columns[37] = "support_lqt_turn_out";
    locala.xDd.put("support_lqt_turn_out", "INTEGER");
    localStringBuilder.append(" support_lqt_turn_out INTEGER");
    localStringBuilder.append(", ");
    locala.columns[38] = "is_hightlight_pre_arrive_time_wording";
    locala.xDd.put("is_hightlight_pre_arrive_time_wording", "INTEGER");
    localStringBuilder.append(" is_hightlight_pre_arrive_time_wording INTEGER");
    localStringBuilder.append(", ");
    locala.columns[39] = "card_state_name";
    locala.xDd.put("card_state_name", "TEXT");
    localStringBuilder.append(" card_state_name TEXT");
    locala.columns[40] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    CREATOR = new Bankcard.1();
    AppMethodBeat.o(46714);
  }

  public Bankcard()
  {
    this.twR = null;
    this.txa = null;
    this.txb = false;
  }

  public Bankcard(byte paramByte)
  {
    this.twR = null;
    this.txa = null;
    this.txb = false;
    this.field_bankcardTag = 1;
  }

  public Bankcard(Parcel paramParcel)
  {
    AppMethodBeat.i(46711);
    this.twR = null;
    this.txa = null;
    this.txb = false;
    this.field_bankName = paramParcel.readString();
    this.field_desc = paramParcel.readString();
    this.field_bankcardType = paramParcel.readString();
    this.field_bindSerial = paramParcel.readString();
    this.field_cardType = paramParcel.readInt();
    if (paramParcel.readInt() == 1)
    {
      bool2 = true;
      this.txb = bool2;
      this.field_mobile = paramParcel.readString();
      this.field_onceQuotaKind = paramParcel.readDouble();
      this.field_onceQuotaVirtual = paramParcel.readDouble();
      this.field_dayQuotaKind = paramParcel.readDouble();
      this.field_dayQuotaVirtual = paramParcel.readDouble();
      this.field_bankcardTail = paramParcel.readString();
      this.field_bankPhone = paramParcel.readString();
      this.field_bankcardTag = paramParcel.readInt();
      this.field_bankcardState = paramParcel.readInt();
      this.twR = paramParcel.readString();
      this.twf = paramParcel.readInt();
      this.txa = paramParcel.readString();
      this.field_bankcardClientType = paramParcel.readInt();
      this.field_ext_msg = paramParcel.readString();
      if (paramParcel.readInt() != 1)
        break label349;
    }
    label349: for (boolean bool2 = bool1; ; bool2 = false)
    {
      this.field_support_micropay = bool2;
      this.field_arrive_type = paramParcel.readString();
      this.field_fetch_charge_rate = paramParcel.readDouble();
      this.field_full_fetch_charge_fee = paramParcel.readDouble();
      this.field_no_micro_word = paramParcel.readString();
      this.field_card_bottom_wording = paramParcel.readString();
      this.txg = paramParcel.readString();
      this.txd = paramParcel.readLong();
      this.txf = paramParcel.readLong();
      this.txe = paramParcel.readLong();
      this.txh = paramParcel.readInt();
      this.txl = paramParcel.readInt();
      this.txi = paramParcel.readInt();
      this.txj = paramParcel.readString();
      this.txk = paramParcel.readString();
      this.txm = paramParcel.readString();
      this.txn = paramParcel.readLong();
      AppMethodBeat.o(46711);
      return;
      bool2 = false;
      break;
    }
  }

  public static boolean Ho(int paramInt)
  {
    if ((paramInt & 0x2) > 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static String Y(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(46705);
    switch (paramInt)
    {
    default:
      paramContext = paramContext.getString(2131305171);
      AppMethodBeat.o(46705);
    case 1:
    case 4:
    case 2:
    case 5:
    case 6:
    case 3:
    case 7:
    }
    while (true)
    {
      return paramContext;
      paramContext = paramContext.getString(2131305164);
      AppMethodBeat.o(46705);
      continue;
      paramContext = paramContext.getString(2131305166);
      AppMethodBeat.o(46705);
      continue;
      paramContext = paramContext.getString(2131305170);
      AppMethodBeat.o(46705);
      continue;
      paramContext = paramContext.getString(2131305162);
      AppMethodBeat.o(46705);
      continue;
      paramContext = paramContext.getString(2131305168);
      AppMethodBeat.o(46705);
      continue;
      paramContext = paramContext.getString(2131305175);
      AppMethodBeat.o(46705);
      continue;
      paramContext = paramContext.getString(2131305173);
      AppMethodBeat.o(46705);
    }
  }

  public static boolean gh(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(46703);
    ab.d("MicroMsg.Bankcard", "supportBankcardTag : " + paramInt1 + ", bankcardTag : " + paramInt2);
    boolean bool;
    if ((paramInt1 & paramInt2) > 0)
    {
      bool = true;
      AppMethodBeat.o(46703);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(46703);
    }
  }

  private boolean isSupport(int paramInt)
  {
    if ((this.field_bankcardTag & paramInt) > 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final c.a Ag()
  {
    return ccO;
  }

  public final int a(int paramInt, Orders paramOrders)
  {
    AppMethodBeat.i(46704);
    if (this.field_bankcardState != 0)
    {
      ab.d("MicroMsg.Bankcard", " bankcardState : " + this.field_bankcardState);
      paramInt = this.field_bankcardState;
      AppMethodBeat.o(46704);
    }
    while (true)
    {
      return paramInt;
      if ((paramOrders != null) && (paramOrders.czZ.equals(this.twR)))
      {
        paramInt = 4;
        AppMethodBeat.o(46704);
      }
      else if (!isSupport(paramInt))
      {
        if (cPf())
        {
          paramInt = 5;
          AppMethodBeat.o(46704);
        }
        else
        {
          paramInt = 6;
          AppMethodBeat.o(46704);
        }
      }
      else if ((paramOrders != null) && (!paramOrders.tAn.isEmpty()) && (!paramOrders.tAn.contains(this.field_bankcardType)))
      {
        paramInt = 7;
        AppMethodBeat.o(46704);
      }
      else
      {
        paramInt = 0;
        AppMethodBeat.o(46704);
      }
    }
  }

  public final boolean cPb()
  {
    AppMethodBeat.i(46706);
    if ((this.field_cardType & twH) > 0);
    for (boolean bool = true; ; bool = false)
    {
      ab.d("MicroMsg.Bankcard", "isWXCredit, ret = ".concat(String.valueOf(bool)));
      AppMethodBeat.o(46706);
      return bool;
    }
  }

  public final boolean cPc()
  {
    AppMethodBeat.i(46707);
    if ((this.field_cardType & twI) > 0);
    for (boolean bool = true; ; bool = false)
    {
      ab.d("MicroMsg.Bankcard", "isWXCredit, ret = ".concat(String.valueOf(bool)));
      AppMethodBeat.o(46707);
      return bool;
    }
  }

  public final boolean cPd()
  {
    AppMethodBeat.i(46708);
    if ((this.field_cardType & twL) > 0);
    for (boolean bool = true; ; bool = false)
    {
      ab.d("MicroMsg.Bankcard", "isLqtCard, ret = ".concat(String.valueOf(bool)));
      AppMethodBeat.o(46708);
      return bool;
    }
  }

  public final boolean cPe()
  {
    AppMethodBeat.i(46709);
    if ((this.field_cardType & twG) > 0);
    for (boolean bool = true; ; bool = false)
    {
      ab.d("MicroMsg.Bankcard", "isCredit, ret = ".concat(String.valueOf(bool)));
      AppMethodBeat.o(46709);
      return bool;
    }
  }

  public final boolean cPf()
  {
    AppMethodBeat.i(46710);
    if ((this.field_cardType & twF) <= 0);
    for (boolean bool = true; ; bool = false)
    {
      ab.d("MicroMsg.Bankcard", "isDomestic, ret = ".concat(String.valueOf(bool)));
      AppMethodBeat.o(46710);
      return bool;
    }
  }

  public final boolean cPg()
  {
    if ((this.field_cardType & twM) > 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void d(Cursor paramCursor)
  {
    AppMethodBeat.i(46713);
    super.d(paramCursor);
    AppMethodBeat.o(46713);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(46712);
    paramParcel.writeString(this.field_bankName);
    paramParcel.writeString(this.field_desc);
    paramParcel.writeString(this.field_bankcardType);
    paramParcel.writeString(this.field_bindSerial);
    paramParcel.writeInt(this.field_cardType);
    if (this.txb)
    {
      paramInt = 1;
      paramParcel.writeInt(paramInt);
      paramParcel.writeString(this.field_mobile);
      paramParcel.writeDouble(this.field_onceQuotaKind);
      paramParcel.writeDouble(this.field_onceQuotaVirtual);
      paramParcel.writeDouble(this.field_dayQuotaKind);
      paramParcel.writeDouble(this.field_dayQuotaVirtual);
      paramParcel.writeString(this.field_bankcardTail);
      paramParcel.writeString(this.field_bankPhone);
      paramParcel.writeInt(this.field_bankcardTag);
      paramParcel.writeInt(this.field_bankcardState);
      paramParcel.writeString(this.twR);
      paramParcel.writeInt(this.twf);
      paramParcel.writeString(this.txa);
      paramParcel.writeInt(this.field_bankcardClientType);
      paramParcel.writeString(this.field_ext_msg);
      if (!this.field_support_micropay)
        break label328;
    }
    label328: for (paramInt = i; ; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeString(this.field_arrive_type);
      paramParcel.writeDouble(this.field_fetch_charge_rate);
      paramParcel.writeDouble(this.field_full_fetch_charge_fee);
      paramParcel.writeString(this.field_no_micro_word);
      paramParcel.writeString(this.field_card_bottom_wording);
      paramParcel.writeString(this.txg);
      paramParcel.writeLong(this.txd);
      paramParcel.writeLong(this.txf);
      paramParcel.writeLong(this.txe);
      paramParcel.writeInt(this.txh);
      paramParcel.writeInt(this.txl);
      paramParcel.writeInt(this.txi);
      paramParcel.writeString(this.txj);
      paramParcel.writeString(this.txk);
      paramParcel.writeString(this.txm);
      paramParcel.writeLong(this.txn);
      AppMethodBeat.o(46712);
      return;
      paramInt = 0;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.Bankcard
 * JD-Core Version:    0.6.2
 */