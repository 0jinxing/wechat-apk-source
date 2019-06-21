package com.tencent.mm.plugin.appbrand.media.record.record_imp;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.media.record.b;
import com.tencent.mm.plugin.appbrand.media.record.f;

public class RecordParam
  implements Parcelable
{
  public static final Parcelable.Creator<RecordParam> CREATOR;
  public String appId;
  public int duration;
  public String euD;
  public String hAQ;
  public int imk;
  public int iml;
  public double imm;
  public b imn;
  public f imo;
  public String processName;
  public int sampleRate;
  public int scene;

  static
  {
    AppMethodBeat.i(105663);
    CREATOR = new RecordParam.1();
    AppMethodBeat.o(105663);
  }

  public RecordParam()
  {
    this.duration = 0;
    this.sampleRate = 0;
    this.imk = 0;
    this.iml = 0;
    this.scene = 0;
    this.imm = 0.0D;
    this.processName = "";
    this.appId = "";
    this.imn = b.ila;
  }

  public RecordParam(Parcel paramParcel)
  {
    AppMethodBeat.i(105661);
    this.duration = 0;
    this.sampleRate = 0;
    this.imk = 0;
    this.iml = 0;
    this.scene = 0;
    this.imm = 0.0D;
    this.processName = "";
    this.appId = "";
    this.imn = b.ila;
    this.duration = paramParcel.readInt();
    this.sampleRate = paramParcel.readInt();
    this.imk = paramParcel.readInt();
    this.iml = paramParcel.readInt();
    this.hAQ = paramParcel.readString();
    this.euD = paramParcel.readString();
    this.scene = paramParcel.readInt();
    this.imm = paramParcel.readDouble();
    this.processName = paramParcel.readString();
    this.appId = paramParcel.readString();
    this.imn = b.values()[paramParcel.readInt()];
    AppMethodBeat.o(105661);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(105662);
    paramParcel.writeInt(this.duration);
    paramParcel.writeInt(this.sampleRate);
    paramParcel.writeInt(this.imk);
    paramParcel.writeInt(this.iml);
    paramParcel.writeString(this.hAQ);
    paramParcel.writeString(this.euD);
    paramParcel.writeInt(this.scene);
    paramParcel.writeDouble(this.imm);
    paramParcel.writeString(this.processName);
    paramParcel.writeString(this.appId);
    paramParcel.writeInt(this.imn.ordinal());
    AppMethodBeat.o(105662);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam
 * JD-Core Version:    0.6.2
 */