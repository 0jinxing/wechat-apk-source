package com.tencent.mm.plugin.card.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.agk;
import com.tencent.mm.protocal.protobuf.ao;
import com.tencent.mm.protocal.protobuf.ap;
import com.tencent.mm.protocal.protobuf.aq;
import java.util.Iterator;
import java.util.LinkedList;

public class CardGiftInfo
  implements Parcelable
{
  public static final Parcelable.Creator<CardGiftInfo> CREATOR;
  public String cKE;
  public String color;
  public int kcA;
  public int kcB;
  public String kcC;
  public String kcD;
  public int kcE;
  public String kcF;
  public String kcG;
  public String kcH;
  public String kcI;
  public String kcJ;
  public String kcK;
  public String kcL;
  public String kcM;
  public String kcN;
  public LinkedList<CardGiftInfo.AcceptedCardItem> kcO;
  public LinkedList<CardGiftInfo.AccepterItem> kcP;
  public String kcQ;
  public int kcR;
  public String kcS;
  public String kcT;
  public String kcl;
  public String kcm;
  public String kcn;
  public String kco;
  public String kcp;
  public String kcq;
  public String kcr;
  public String kcs;
  public String kct;
  public String kcu;
  public String kcv;
  public String kcw;
  public String kcx;
  public boolean kcy;
  public int kcz;
  public String toUserName;

  static
  {
    AppMethodBeat.i(87790);
    CREATOR = new CardGiftInfo.1();
    AppMethodBeat.o(87790);
  }

  public CardGiftInfo()
  {
    AppMethodBeat.i(87784);
    this.kcO = new LinkedList();
    this.kcP = new LinkedList();
    AppMethodBeat.o(87784);
  }

  protected CardGiftInfo(Parcel paramParcel)
  {
    AppMethodBeat.i(87785);
    this.kcO = new LinkedList();
    this.kcP = new LinkedList();
    this.toUserName = paramParcel.readString();
    this.cKE = paramParcel.readString();
    this.kcl = paramParcel.readString();
    this.kcm = paramParcel.readString();
    this.kcn = paramParcel.readString();
    this.kco = paramParcel.readString();
    this.kcp = paramParcel.readString();
    this.kcq = paramParcel.readString();
    this.kcr = paramParcel.readString();
    this.kcs = paramParcel.readString();
    this.kct = paramParcel.readString();
    this.kcu = paramParcel.readString();
    this.kcv = paramParcel.readString();
    this.kcw = paramParcel.readString();
    this.kcx = paramParcel.readString();
    this.color = paramParcel.readString();
    if (paramParcel.readByte() != 0);
    for (boolean bool = true; ; bool = false)
    {
      this.kcy = bool;
      this.kcz = paramParcel.readInt();
      this.kcA = paramParcel.readInt();
      this.kcB = paramParcel.readInt();
      this.kcC = paramParcel.readString();
      this.kcD = paramParcel.readString();
      this.kcE = paramParcel.readInt();
      this.kcF = paramParcel.readString();
      this.kcG = paramParcel.readString();
      this.kcH = paramParcel.readString();
      this.kcI = paramParcel.readString();
      this.kcJ = paramParcel.readString();
      this.kcK = paramParcel.readString();
      this.kcL = paramParcel.readString();
      this.kcM = paramParcel.readString();
      this.kcN = paramParcel.readString();
      paramParcel.readTypedList(this.kcO, CardGiftInfo.AcceptedCardItem.CREATOR);
      paramParcel.readTypedList(this.kcP, CardGiftInfo.AccepterItem.CREATOR);
      this.kcQ = paramParcel.readString();
      this.kcR = paramParcel.readInt();
      this.kcS = paramParcel.readString();
      this.kcT = paramParcel.readString();
      AppMethodBeat.o(87785);
      return;
    }
  }

  public static CardGiftInfo a(agk paramagk)
  {
    AppMethodBeat.i(87789);
    CardGiftInfo localCardGiftInfo = new CardGiftInfo();
    localCardGiftInfo.toUserName = paramagk.vBE;
    localCardGiftInfo.cKE = paramagk.vBF;
    localCardGiftInfo.kcl = paramagk.vBG;
    localCardGiftInfo.kcm = paramagk.content;
    localCardGiftInfo.kcn = paramagk.vBH;
    localCardGiftInfo.kco = paramagk.vBI;
    localCardGiftInfo.kcp = paramagk.vBJ;
    localCardGiftInfo.kcq = paramagk.vBK;
    localCardGiftInfo.kcs = paramagk.vBM;
    localCardGiftInfo.kcr = paramagk.vBL;
    localCardGiftInfo.kct = paramagk.vBN;
    localCardGiftInfo.kcu = paramagk.vBO;
    localCardGiftInfo.kcv = paramagk.kcU;
    localCardGiftInfo.kcw = paramagk.kcV;
    localCardGiftInfo.kcx = paramagk.vBP;
    localCardGiftInfo.color = paramagk.color;
    localCardGiftInfo.kcy = paramagk.vBQ;
    localCardGiftInfo.kcz = paramagk.vBR;
    localCardGiftInfo.kcA = paramagk.vBS;
    localCardGiftInfo.kcB = paramagk.vBT;
    localCardGiftInfo.kcC = paramagk.vBU;
    localCardGiftInfo.kcD = paramagk.vBV;
    localCardGiftInfo.kcE = paramagk.vBW;
    localCardGiftInfo.kcF = paramagk.vBX;
    localCardGiftInfo.kcG = paramagk.vBY;
    localCardGiftInfo.kcH = paramagk.vBZ;
    localCardGiftInfo.kcI = paramagk.vCa;
    localCardGiftInfo.kcJ = paramagk.vCb;
    localCardGiftInfo.kcK = paramagk.vCc;
    localCardGiftInfo.kcL = paramagk.vCd;
    localCardGiftInfo.kcM = paramagk.kbU;
    localCardGiftInfo.kcN = paramagk.vCe;
    AppMethodBeat.o(87789);
    return localCardGiftInfo;
  }

  public static CardGiftInfo a(ao paramao)
  {
    AppMethodBeat.i(87788);
    CardGiftInfo localCardGiftInfo = new CardGiftInfo();
    localCardGiftInfo.toUserName = paramao.vBE;
    localCardGiftInfo.cKE = paramao.vBF;
    localCardGiftInfo.kcl = paramao.vBG;
    localCardGiftInfo.kcm = paramao.content;
    localCardGiftInfo.kcn = paramao.vBH;
    localCardGiftInfo.kco = paramao.vBI;
    localCardGiftInfo.kcp = paramao.vBJ;
    localCardGiftInfo.kcq = paramao.vBK;
    localCardGiftInfo.kcs = paramao.vBM;
    localCardGiftInfo.kcr = paramao.vBL;
    localCardGiftInfo.kct = paramao.vBN;
    localCardGiftInfo.kcu = paramao.vBO;
    localCardGiftInfo.kcv = paramao.kcU;
    localCardGiftInfo.kcw = paramao.kcV;
    localCardGiftInfo.kcx = paramao.vBP;
    localCardGiftInfo.color = paramao.color;
    localCardGiftInfo.kcy = paramao.vBQ;
    localCardGiftInfo.kcz = paramao.vBR;
    localCardGiftInfo.kcA = paramao.vBS;
    localCardGiftInfo.kcB = paramao.vBT;
    localCardGiftInfo.kcC = paramao.vBU;
    localCardGiftInfo.kcD = paramao.vBV;
    localCardGiftInfo.kcE = paramao.vBW;
    localCardGiftInfo.kcF = paramao.vBX;
    localCardGiftInfo.kcG = paramao.vBY;
    localCardGiftInfo.kcH = paramao.vBZ;
    localCardGiftInfo.kcI = paramao.vCa;
    localCardGiftInfo.kcJ = paramao.vCb;
    localCardGiftInfo.kcK = paramao.vCc;
    localCardGiftInfo.kcL = paramao.vCd;
    localCardGiftInfo.kcM = paramao.kbU;
    localCardGiftInfo.kcN = paramao.vCe;
    Object localObject1 = paramao.kcO.iterator();
    Object localObject2;
    Object localObject3;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (ap)((Iterator)localObject1).next();
      localObject3 = localCardGiftInfo.kcO;
      localObject4 = new CardGiftInfo.AcceptedCardItem();
      ((CardGiftInfo.AcceptedCardItem)localObject4).kcV = ((ap)localObject2).kcV;
      ((CardGiftInfo.AcceptedCardItem)localObject4).kcU = ((ap)localObject2).kcU;
      ((LinkedList)localObject3).add(localObject4);
    }
    Object localObject4 = paramao.kcP.iterator();
    while (((Iterator)localObject4).hasNext())
    {
      localObject3 = (aq)((Iterator)localObject4).next();
      localObject1 = localCardGiftInfo.kcP;
      localObject2 = new CardGiftInfo.AccepterItem();
      ((CardGiftInfo.AccepterItem)localObject2).kcV = ((aq)localObject3).kcV;
      ((CardGiftInfo.AccepterItem)localObject2).kcU = ((aq)localObject3).kcU;
      ((CardGiftInfo.AccepterItem)localObject2).kcX = ((aq)localObject3).kcX;
      ((CardGiftInfo.AccepterItem)localObject2).kcW = ((aq)localObject3).kcW;
      ((LinkedList)localObject1).add(localObject2);
    }
    localCardGiftInfo.kcQ = paramao.kcQ;
    localCardGiftInfo.kcR = paramao.kcR;
    localCardGiftInfo.kcS = paramao.kcS;
    localCardGiftInfo.kcT = paramao.kcT;
    AppMethodBeat.o(87788);
    return localCardGiftInfo;
  }

  public int describeContents()
  {
    return 0;
  }

  public String toString()
  {
    AppMethodBeat.i(87787);
    String str = "CardGiftInfo{toUserName='" + this.toUserName + '\'' + ", fromUserName='" + this.cKE + '\'' + ", fromUserImgUrl='" + this.kcl + '\'' + ", fromUserContent='" + this.kcm + '\'' + ", fromUserContentPicUrl='" + this.kcn + '\'' + ", fromUserContentVideoUrl='" + this.kco + '\'' + ", fromUserContentThumbPicUrl='" + this.kcp + '\'' + ", picAESKey='" + this.kcq + '\'' + ", videoAESKey='" + this.kcr + '\'' + ", thumbVideoAESKey='" + this.kcs + '\'' + ", cardBackgroundPicUrl='" + this.kct + '\'' + ", cardLogoLUrl='" + this.kcu + '\'' + ", cardTitle='" + this.kcv + '\'' + ", cardPrice='" + this.kcw + '\'' + ", footerWording='" + this.kcx + '\'' + ", color='" + this.color + '\'' + ", needJump=" + this.kcy + ", picDataLength=" + this.kcz + ", videoDataLength=" + this.kcA + ", thumbDataLength=" + this.kcB + ", descTitle='" + this.kcC + '\'' + ", descIconUrl='" + this.kcD + '\'' + ", descLayoutMode=" + this.kcE + ", giftingMediaTitle='" + this.kcF + '\'' + ", descriptionTitleColor='" + this.kcG + '\'' + ", cardTitleColor='" + this.kcH + '\'' + ", cardPriceTitleColor='" + this.kcI + '\'' + ", userCardId='" + this.kcJ + '\'' + ", operationTitle='" + this.kcK + '\'' + ", operationUrl='" + this.kcL + '\'' + ", cardTpId='" + this.kcM + '\'' + ", cardCode='" + this.kcN + '\'' + ", accepted_card_list_size='" + this.kcO.size() + '\'' + ", accepter_list_size='" + this.kcP.size() + '\'' + ", accepter_list_title='" + this.kcQ + '\'' + ", out_of_card='" + this.kcR + '\'' + ", operation_wxa_username='" + this.kcS + '\'' + ", operation_wxa_path='" + this.kcT + '\'' + '}';
    AppMethodBeat.o(87787);
    return str;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(87786);
    paramParcel.writeString(this.toUserName);
    paramParcel.writeString(this.cKE);
    paramParcel.writeString(this.kcl);
    paramParcel.writeString(this.kcm);
    paramParcel.writeString(this.kcn);
    paramParcel.writeString(this.kco);
    paramParcel.writeString(this.kcp);
    paramParcel.writeString(this.kcq);
    paramParcel.writeString(this.kcr);
    paramParcel.writeString(this.kcs);
    paramParcel.writeString(this.kct);
    paramParcel.writeString(this.kcu);
    paramParcel.writeString(this.kcv);
    paramParcel.writeString(this.kcw);
    paramParcel.writeString(this.kcx);
    paramParcel.writeString(this.color);
    if (this.kcy)
      paramInt = 1;
    int j;
    for (int i = paramInt; ; j = paramInt)
    {
      paramParcel.writeByte(i);
      paramParcel.writeInt(this.kcz);
      paramParcel.writeInt(this.kcA);
      paramParcel.writeInt(this.kcB);
      paramParcel.writeString(this.kcC);
      paramParcel.writeString(this.kcD);
      paramParcel.writeInt(this.kcE);
      paramParcel.writeString(this.kcF);
      paramParcel.writeString(this.kcG);
      paramParcel.writeString(this.kcH);
      paramParcel.writeString(this.kcI);
      paramParcel.writeString(this.kcJ);
      paramParcel.writeString(this.kcK);
      paramParcel.writeString(this.kcL);
      paramParcel.writeString(this.kcM);
      paramParcel.writeString(this.kcN);
      paramParcel.writeTypedList(this.kcO);
      paramParcel.writeTypedList(this.kcP);
      paramParcel.writeString(this.kcQ);
      paramParcel.writeInt(this.kcR);
      paramParcel.writeString(this.kcS);
      paramParcel.writeString(this.kcT);
      AppMethodBeat.o(87786);
      return;
      paramInt = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.CardGiftInfo
 * JD-Core Version:    0.6.2
 */