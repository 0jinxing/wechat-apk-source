package com.tencent.mm.plugin.order.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class MallTransactionObject
  implements Parcelable
{
  public static final Parcelable.Creator<MallTransactionObject> CREATOR;
  public String cAa;
  public int cQO;
  public int coq;
  public int cuu;
  public String desc;
  public int fDG;
  public String hgW;
  public double kCJ;
  public List<MallOrderDetailObject.HelpCenter> pbM;
  public int pbN;
  public String pbP;
  public String pbX;
  public String pbY;
  public String pbZ;
  public String pcA;
  public int pcB;
  public String pcC;
  public int pcD;
  public int pcE;
  public int pcF;
  public String pcG;
  public String pcH;
  public String pcI;
  public String pcJ;
  public String pcK;
  public String pcL;
  public double pcM;
  public String pcN;
  public String pca;
  public String pcb;
  public String pcc;
  public String pcd;
  public String pce;
  public String pcf;
  public String pcg;
  public int pch;
  public String pci;
  public String pcj;
  public String pck;
  public String pcl;
  public String pcm;
  public String pcn;
  public String pco;
  public String pcp;
  public String pcq;
  public double pcr;
  public String pcs;
  public String pct;
  public String pcu;
  public String pcv;
  public String pcw;
  public int pcx;
  public int pcy;
  public double pcz;
  public int type;

  static
  {
    AppMethodBeat.i(43772);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(43772);
  }

  public MallTransactionObject()
  {
    AppMethodBeat.i(43767);
    this.kCJ = 0.0D;
    this.pbM = new LinkedList();
    this.pbN = -1;
    AppMethodBeat.o(43767);
  }

  public MallTransactionObject(Parcel paramParcel)
  {
    AppMethodBeat.i(43768);
    this.kCJ = 0.0D;
    this.pbM = new LinkedList();
    this.pbN = -1;
    this.cuu = paramParcel.readInt();
    this.cQO = paramParcel.readInt();
    this.coq = paramParcel.readInt();
    this.pbX = paramParcel.readString();
    this.pbY = paramParcel.readString();
    this.pbZ = paramParcel.readString();
    this.pca = paramParcel.readString();
    this.desc = paramParcel.readString();
    this.pcb = paramParcel.readString();
    this.pcc = paramParcel.readString();
    this.kCJ = paramParcel.readDouble();
    this.pcd = paramParcel.readString();
    this.pce = paramParcel.readString();
    this.pcf = paramParcel.readString();
    this.pcg = paramParcel.readString();
    this.fDG = paramParcel.readInt();
    this.pch = paramParcel.readInt();
    this.cAa = paramParcel.readString();
    this.pci = paramParcel.readString();
    this.pcj = paramParcel.readString();
    this.pcl = paramParcel.readString();
    this.pcm = paramParcel.readString();
    this.pbP = paramParcel.readString();
    this.pcn = paramParcel.readString();
    this.hgW = paramParcel.readString();
    this.pco = paramParcel.readString();
    this.pcp = paramParcel.readString();
    this.pcq = paramParcel.readString();
    this.pcr = paramParcel.readDouble();
    this.pcs = paramParcel.readString();
    this.pct = paramParcel.readString();
    this.pcu = paramParcel.readString();
    this.pcv = paramParcel.readString();
    this.pcx = paramParcel.readInt();
    this.pcD = paramParcel.readInt();
    this.pcz = paramParcel.readDouble();
    this.pcA = paramParcel.readString();
    this.pcB = paramParcel.readInt();
    this.pcC = paramParcel.readString();
    this.pcD = paramParcel.readInt();
    this.pcE = paramParcel.readInt();
    this.pcF = paramParcel.readInt();
    this.pcG = paramParcel.readString();
    this.pcH = paramParcel.readString();
    this.pcI = paramParcel.readString();
    this.pcJ = paramParcel.readString();
    this.pcK = paramParcel.readString();
    this.pcL = paramParcel.readString();
    this.pcM = paramParcel.readDouble();
    this.pcN = paramParcel.readString();
    this.pcw = paramParcel.readString();
    this.pbN = paramParcel.readInt();
    int i = paramParcel.readInt();
    this.pbM = new LinkedList();
    for (int j = 0; j < i; j++)
    {
      MallOrderDetailObject.HelpCenter localHelpCenter = (MallOrderDetailObject.HelpCenter)paramParcel.readParcelable(MallOrderDetailObject.HelpCenter.class.getClassLoader());
      this.pbM.add(localHelpCenter);
    }
    AppMethodBeat.o(43768);
  }

  public static MallTransactionObject ae(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(43770);
    if (paramJSONObject != null)
    {
      MallTransactionObject localMallTransactionObject = new MallTransactionObject();
      localMallTransactionObject.type = paramJSONObject.optInt("rec_type", 1);
      localMallTransactionObject.cuu = paramJSONObject.optInt("sub_pay_type", 0);
      localMallTransactionObject.cQO = paramJSONObject.optInt("pay_scene");
      localMallTransactionObject.coq = paramJSONObject.optInt("user_type");
      localMallTransactionObject.pbX = paramJSONObject.optString("buy_uin");
      localMallTransactionObject.pbY = paramJSONObject.optString("buy_name");
      localMallTransactionObject.pbZ = paramJSONObject.optString("sale_uin");
      localMallTransactionObject.pca = paramJSONObject.optString("sale_name");
      localMallTransactionObject.cAa = paramJSONObject.optString("trans_id");
      localMallTransactionObject.pci = paramJSONObject.optString("sp_billno");
      localMallTransactionObject.desc = paramJSONObject.optString("goods_name");
      localMallTransactionObject.pcb = paramJSONObject.optString("goods_detail");
      localMallTransactionObject.kCJ = (paramJSONObject.optDouble("fee") / 100.0D);
      localMallTransactionObject.pcd = paramJSONObject.optString("fee_color");
      localMallTransactionObject.pce = paramJSONObject.optString("trade_state");
      localMallTransactionObject.pcf = paramJSONObject.optString("trade_state_name");
      localMallTransactionObject.pcg = paramJSONObject.optString("trade_state_color");
      localMallTransactionObject.pcj = paramJSONObject.optString("buy_bank_name");
      localMallTransactionObject.pck = paramJSONObject.optString("card_tail");
      localMallTransactionObject.fDG = paramJSONObject.optInt("create_timestamp");
      localMallTransactionObject.pch = paramJSONObject.optInt("modify_timestamp");
      localMallTransactionObject.pcl = paramJSONObject.optString("fee_type");
      JSONObject localJSONObject = paramJSONObject.optJSONObject("appinfo");
      if (localJSONObject != null)
      {
        localMallTransactionObject.pcm = localJSONObject.optString("app_username");
        localMallTransactionObject.pbP = localJSONObject.optString("app_telephone");
        localMallTransactionObject.pcn = localJSONObject.optString("app_nickname");
        localMallTransactionObject.hgW = localJSONObject.optString("app_icon_url");
        localMallTransactionObject.pcv = localJSONObject.optString("safeguard_url");
        localMallTransactionObject.pcw = localJSONObject.optString("display_name");
      }
      localMallTransactionObject.pco = paramJSONObject.optString("deliver_price");
      localMallTransactionObject.pcp = paramJSONObject.optString("preferential_price");
      localMallTransactionObject.pcq = paramJSONObject.optString("discount");
      localMallTransactionObject.pcr = (paramJSONObject.optDouble("original_total_fee") / 100.0D);
      localMallTransactionObject.pcs = paramJSONObject.optString("total_price");
      localMallTransactionObject.pct = paramJSONObject.optString("receipt_company");
      localMallTransactionObject.pcu = paramJSONObject.optString("biz_pledge");
      localMallTransactionObject.pcx = paramJSONObject.optInt("pre_fetch_timestamp");
      localMallTransactionObject.pcy = paramJSONObject.optInt("arrived_timestamp");
      localMallTransactionObject.pcz = (paramJSONObject.optDouble("transfer_fee") / 100.0D);
      localMallTransactionObject.pcA = paramJSONObject.optString("receiver_name");
      localMallTransactionObject.pcB = paramJSONObject.optInt("allow_resend_msg");
      localMallTransactionObject.pcC = paramJSONObject.optString("charge_fee");
      localMallTransactionObject.pcD = paramJSONObject.optInt("receive_timestamp");
      localMallTransactionObject.pcE = paramJSONObject.optInt("refund_timestamp");
      localMallTransactionObject.pcF = paramJSONObject.optInt("create_timestamp");
      localMallTransactionObject.pcG = paramJSONObject.optString("buy_bank_type");
      localMallTransactionObject.pcH = paramJSONObject.optString("payer_name");
      localMallTransactionObject.pcI = paramJSONObject.optString("true_name");
      localMallTransactionObject.pcJ = paramJSONObject.optString("refund_bank_type");
      localMallTransactionObject.pcK = paramJSONObject.optString("rateinfo");
      localMallTransactionObject.pcL = paramJSONObject.optString("original_feeinfo");
      localMallTransactionObject.pcM = (paramJSONObject.optDouble("fetch_total_fee") / 100.0D);
      localMallTransactionObject.pcN = paramJSONObject.optString("fetch_total_fee_color");
      localMallTransactionObject.pbN = paramJSONObject.optInt("userroll_type");
      localMallTransactionObject.pbM = af(paramJSONObject);
      AppMethodBeat.o(43770);
      paramJSONObject = localMallTransactionObject;
    }
    while (true)
    {
      return paramJSONObject;
      paramJSONObject = null;
      AppMethodBeat.o(43770);
    }
  }

  private static List<MallOrderDetailObject.HelpCenter> af(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(43771);
    LinkedList localLinkedList = new LinkedList();
    try
    {
      JSONArray localJSONArray = paramJSONObject.getJSONArray("help_center");
      for (int i = 0; i < localJSONArray.length(); i++)
      {
        paramJSONObject = new com/tencent/mm/plugin/order/model/MallOrderDetailObject$HelpCenter;
        paramJSONObject.<init>();
        JSONObject localJSONObject = localJSONArray.getJSONObject(i);
        paramJSONObject.cui = localJSONObject.optBoolean("is_show_button");
        paramJSONObject.name = localJSONObject.optString("name");
        paramJSONObject.url = localJSONObject.optString("url");
        localLinkedList.add(paramJSONObject);
      }
    }
    catch (Exception paramJSONObject)
    {
      ab.printErrStackTrace("MicroMsg.MallTransactionObject", paramJSONObject, "", new Object[0]);
      ab.e("MicroMsg.MallTransactionObject", "parseHelpCenter error %s", new Object[] { paramJSONObject.getMessage() });
      AppMethodBeat.o(43771);
    }
    return localLinkedList;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(43769);
    paramParcel.writeInt(this.cuu);
    paramParcel.writeInt(this.cQO);
    paramParcel.writeInt(this.coq);
    paramParcel.writeString(this.pbX);
    paramParcel.writeString(this.pbY);
    paramParcel.writeString(this.pbZ);
    paramParcel.writeString(this.pca);
    paramParcel.writeString(this.desc);
    paramParcel.writeString(this.pcb);
    paramParcel.writeString(this.pcc);
    paramParcel.writeDouble(this.kCJ);
    paramParcel.writeString(this.pcd);
    paramParcel.writeString(this.pce);
    paramParcel.writeString(this.pcf);
    paramParcel.writeString(this.pcg);
    paramParcel.writeInt(this.fDG);
    paramParcel.writeInt(this.pch);
    paramParcel.writeString(this.cAa);
    paramParcel.writeString(this.pci);
    paramParcel.writeString(this.pcj);
    paramParcel.writeString(this.pcl);
    paramParcel.writeString(this.pcm);
    paramParcel.writeString(this.pbP);
    paramParcel.writeString(this.pcn);
    paramParcel.writeString(this.hgW);
    paramParcel.writeString(this.pco);
    paramParcel.writeString(this.pcp);
    paramParcel.writeString(this.pcq);
    paramParcel.writeDouble(this.pcr);
    paramParcel.writeString(this.pcs);
    paramParcel.writeString(this.pct);
    paramParcel.writeString(this.pcu);
    paramParcel.writeString(this.pcv);
    paramParcel.writeInt(this.pcx);
    paramParcel.writeInt(this.pcD);
    paramParcel.writeDouble(this.pcz);
    paramParcel.writeString(this.pcA);
    paramParcel.writeInt(this.pcB);
    paramParcel.writeString(this.pcC);
    paramParcel.writeInt(this.pcD);
    paramParcel.writeInt(this.pcE);
    paramParcel.writeInt(this.pcF);
    paramParcel.writeString(this.pcG);
    paramParcel.writeString(this.pcH);
    paramParcel.writeString(this.pcI);
    paramParcel.writeString(this.pcJ);
    paramParcel.writeString(this.pcK);
    paramParcel.writeString(this.pcL);
    paramParcel.writeDouble(this.pcM);
    paramParcel.writeString(this.pcN);
    paramParcel.writeString(this.pcw);
    paramParcel.writeInt(this.pbN);
    paramParcel.writeInt(this.pbM.size());
    Iterator localIterator = this.pbM.iterator();
    while (localIterator.hasNext())
      paramParcel.writeParcelable((MallOrderDetailObject.HelpCenter)localIterator.next(), paramInt);
    AppMethodBeat.o(43769);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.model.MallTransactionObject
 * JD-Core Version:    0.6.2
 */