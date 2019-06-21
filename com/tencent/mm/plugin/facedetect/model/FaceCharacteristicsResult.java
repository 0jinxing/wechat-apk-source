package com.tencent.mm.plugin.facedetect.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.facedetect.FaceProNative.FaceStatus;

public class FaceCharacteristicsResult
  implements Parcelable
{
  public static final Parcelable.Creator<FaceCharacteristicsResult> CREATOR;
  public String aIm;
  public int errCode;
  public FaceProNative.FaceStatus lTF;

  static
  {
    AppMethodBeat.i(181);
    CREATOR = new FaceCharacteristicsResult.1();
    AppMethodBeat.o(181);
  }

  public FaceCharacteristicsResult()
  {
  }

  protected FaceCharacteristicsResult(Parcel paramParcel)
  {
    AppMethodBeat.i(178);
    this.errCode = paramParcel.readInt();
    this.aIm = paramParcel.readString();
    AppMethodBeat.o(178);
  }

  public static boolean vh(int paramInt)
  {
    if ((paramInt >= 10) && (paramInt < 100));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean vi(int paramInt)
  {
    if ((paramInt > 0) && (paramInt < 10));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean vj(int paramInt)
  {
    if (paramInt <= 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void ay(int paramInt, String paramString)
  {
    this.errCode = paramInt;
    this.aIm = paramString;
  }

  public int describeContents()
  {
    return 0;
  }

  public String toString()
  {
    AppMethodBeat.i(180);
    String str = "FaceCharacteristicsResult{mStatus=" + this.lTF + ", errCode=" + this.errCode + ", errMsg='" + this.aIm + '\'' + '}';
    AppMethodBeat.o(180);
    return str;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(179);
    paramParcel.writeParcelable(this.lTF, paramInt);
    paramParcel.writeInt(this.errCode);
    paramParcel.writeString(this.aIm);
    AppMethodBeat.o(179);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.model.FaceCharacteristicsResult
 * JD-Core Version:    0.6.2
 */