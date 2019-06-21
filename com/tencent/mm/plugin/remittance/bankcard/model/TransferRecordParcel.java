package com.tencent.mm.plugin.remittance.bankcard.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.cio;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TransferRecordParcel
  implements Parcelable
{
  public static final Parcelable.Creator<TransferRecordParcel> CREATOR;
  public String nuL;
  public String pLH;
  public String pMd;
  public String pMe;
  public String pMf;
  public String pMg;
  public String pbn;

  static
  {
    AppMethodBeat.i(44512);
    CREATOR = new TransferRecordParcel.1();
    AppMethodBeat.o(44512);
  }

  public TransferRecordParcel()
  {
  }

  protected TransferRecordParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(44509);
    this.pMd = paramParcel.readString();
    this.pMe = paramParcel.readString();
    this.pLH = paramParcel.readString();
    this.nuL = paramParcel.readString();
    this.pbn = paramParcel.readString();
    this.pMf = paramParcel.readString();
    this.pMg = paramParcel.readString();
    AppMethodBeat.o(44509);
  }

  private TransferRecordParcel(cio paramcio)
  {
    this.pMd = paramcio.pMd;
    this.pMe = paramcio.pMe;
    this.pLH = paramcio.pLH;
    this.nuL = paramcio.nuL;
    this.pbn = paramcio.pbn;
    this.pMf = paramcio.pMf;
    this.pMg = paramcio.pMg;
  }

  public static ArrayList<TransferRecordParcel> cO(List<cio> paramList)
  {
    AppMethodBeat.i(44511);
    if (paramList == null)
    {
      paramList = null;
      AppMethodBeat.o(44511);
    }
    while (true)
    {
      return paramList;
      ArrayList localArrayList = new ArrayList();
      paramList = paramList.iterator();
      while (paramList.hasNext())
        localArrayList.add(new TransferRecordParcel((cio)paramList.next()));
      AppMethodBeat.o(44511);
      paramList = localArrayList;
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(44510);
    paramParcel.writeString(this.pMd);
    paramParcel.writeString(this.pMe);
    paramParcel.writeString(this.pLH);
    paramParcel.writeString(this.nuL);
    paramParcel.writeString(this.pbn);
    paramParcel.writeString(this.pMf);
    paramParcel.writeString(this.pMg);
    AppMethodBeat.o(44510);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel
 * JD-Core Version:    0.6.2
 */