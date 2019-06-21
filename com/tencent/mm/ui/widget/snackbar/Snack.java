package com.tencent.mm.ui.widget.snackbar;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

class Snack
  implements Parcelable
{
  public static final Parcelable.Creator<Snack> CREATOR;
  final String nqb;
  final String zTI;
  final int zTJ;
  final Parcelable zTK;
  final short zTL;
  final int zTM;

  static
  {
    AppMethodBeat.i(112971);
    CREATOR = new Snack.1();
    AppMethodBeat.o(112971);
  }

  Snack(Parcel paramParcel)
  {
    AppMethodBeat.i(112969);
    this.nqb = paramParcel.readString();
    this.zTI = paramParcel.readString();
    this.zTJ = paramParcel.readInt();
    this.zTK = paramParcel.readParcelable(paramParcel.getClass().getClassLoader());
    this.zTL = ((short)(short)paramParcel.readInt());
    this.zTM = paramParcel.readInt();
    AppMethodBeat.o(112969);
  }

  Snack(String paramString1, String paramString2, int paramInt1, Parcelable paramParcelable, short paramShort, int paramInt2)
  {
    this.nqb = paramString1;
    this.zTI = paramString2;
    this.zTJ = paramInt1;
    this.zTK = paramParcelable;
    this.zTL = ((short)paramShort);
    this.zTM = paramInt2;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(112970);
    paramParcel.writeString(this.nqb);
    paramParcel.writeString(this.zTI);
    paramParcel.writeInt(this.zTJ);
    paramParcel.writeParcelable(this.zTK, 0);
    paramParcel.writeInt(this.zTL);
    paramParcel.writeInt(this.zTM);
    AppMethodBeat.o(112970);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.snackbar.Snack
 * JD-Core Version:    0.6.2
 */