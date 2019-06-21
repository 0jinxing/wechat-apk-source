package com.tencent.mm.plugin.remittance.bankcard.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.hd;
import com.tencent.mm.protocal.protobuf.yq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class BankcardElemParcel
  implements Parcelable
{
  public static final Parcelable.Creator<BankcardElemParcel> CREATOR;
  public String nuL;
  public String pLH;
  public int pLI;
  public int pLJ;
  public String pLK;
  public String pLL;
  public String pLM;
  public ArrayList<EnterTimeParcel> pLN;
  public String pLO;
  public long pLP;
  public String pbn;

  static
  {
    AppMethodBeat.i(44495);
    CREATOR = new BankcardElemParcel.1();
    AppMethodBeat.o(44495);
  }

  public BankcardElemParcel()
  {
  }

  public BankcardElemParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(44493);
    this.pbn = paramParcel.readString();
    this.nuL = paramParcel.readString();
    this.pLH = paramParcel.readString();
    this.pLI = paramParcel.readInt();
    this.pLJ = paramParcel.readInt();
    this.pLN = new ArrayList();
    paramParcel.readTypedList(this.pLN, EnterTimeParcel.CREATOR);
    this.pLK = paramParcel.readString();
    this.pLL = paramParcel.readString();
    this.pLM = paramParcel.readString();
    this.pLO = paramParcel.readString();
    this.pLP = paramParcel.readLong();
    AppMethodBeat.o(44493);
  }

  public BankcardElemParcel(hd paramhd)
  {
    AppMethodBeat.i(44492);
    this.pbn = paramhd.pbn;
    this.nuL = paramhd.nuL;
    this.pLH = paramhd.pLH;
    this.pLI = paramhd.pLI;
    this.pLJ = paramhd.pLJ;
    this.pLK = paramhd.pLK;
    this.pLL = paramhd.pLL;
    this.pLM = paramhd.pLM;
    this.pLN = new ArrayList();
    Iterator localIterator = paramhd.vJM.iterator();
    while (localIterator.hasNext())
    {
      EnterTimeParcel localEnterTimeParcel = new EnterTimeParcel((yq)localIterator.next());
      this.pLN.add(localEnterTimeParcel);
    }
    this.pLO = paramhd.vJO;
    this.pLP = paramhd.pLP;
    AppMethodBeat.o(44492);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(44494);
    paramParcel.writeString(this.pbn);
    paramParcel.writeString(this.nuL);
    paramParcel.writeString(this.pLH);
    paramParcel.writeInt(this.pLI);
    paramParcel.writeInt(this.pLJ);
    paramParcel.writeTypedList(this.pLN);
    paramParcel.writeString(this.pLK);
    paramParcel.writeString(this.pLL);
    paramParcel.writeString(this.pLM);
    paramParcel.writeString(this.pLO);
    paramParcel.writeLong(this.pLP);
    AppMethodBeat.o(44494);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.model.BankcardElemParcel
 * JD-Core Version:    0.6.2
 */