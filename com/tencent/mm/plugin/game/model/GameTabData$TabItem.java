package com.tencent.mm.plugin.game.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class GameTabData$TabItem
  implements Parcelable
{
  public static final Parcelable.Creator<TabItem> CREATOR;
  public int cKG;
  public String jumpUrl;
  public String mVB;
  public String mYp;
  public boolean mYq;
  public boolean mYr;
  public int mYs;
  public int mYt;
  public String mYu;
  public String mYv;
  public String mYw;
  public boolean mYx;
  public int mYy;
  public String title;

  static
  {
    AppMethodBeat.i(111398);
    CREATOR = new GameTabData.TabItem.1();
    AppMethodBeat.o(111398);
  }

  public GameTabData$TabItem()
  {
  }

  public GameTabData$TabItem(Parcel paramParcel)
  {
    AppMethodBeat.i(111396);
    this.mYp = paramParcel.readString();
    this.title = paramParcel.readString();
    this.jumpUrl = paramParcel.readString();
    if (paramParcel.readByte() != 0)
    {
      bool2 = true;
      this.mYq = bool2;
      if (paramParcel.readByte() == 0)
        break label152;
      bool2 = true;
      label58: this.mYr = bool2;
      this.mYs = paramParcel.readInt();
      this.mYt = paramParcel.readInt();
      this.mYu = paramParcel.readString();
      this.mYv = paramParcel.readString();
      this.mYw = paramParcel.readString();
      if (paramParcel.readByte() == 0)
        break label157;
    }
    label152: label157: for (boolean bool2 = bool1; ; bool2 = false)
    {
      this.mYx = bool2;
      this.cKG = paramParcel.readInt();
      this.mYy = paramParcel.readInt();
      this.mVB = paramParcel.readString();
      AppMethodBeat.o(111396);
      return;
      bool2 = false;
      break;
      bool2 = false;
      break label58;
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(111397);
    paramParcel.writeString(this.mYp);
    paramParcel.writeString(this.title);
    paramParcel.writeString(this.jumpUrl);
    if (this.mYq)
    {
      paramInt = 1;
      paramParcel.writeByte((byte)paramInt);
      if (!this.mYr)
        break label151;
      paramInt = 1;
      label55: paramParcel.writeByte((byte)paramInt);
      paramParcel.writeInt(this.mYs);
      paramParcel.writeInt(this.mYt);
      paramParcel.writeString(this.mYu);
      paramParcel.writeString(this.mYv);
      paramParcel.writeString(this.mYw);
      if (!this.mYx)
        break label156;
    }
    label151: label156: for (paramInt = i; ; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      paramParcel.writeInt(this.cKG);
      paramParcel.writeInt(this.mYy);
      paramParcel.writeString(this.mVB);
      AppMethodBeat.o(111397);
      return;
      paramInt = 0;
      break;
      paramInt = 0;
      break label55;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.GameTabData.TabItem
 * JD-Core Version:    0.6.2
 */