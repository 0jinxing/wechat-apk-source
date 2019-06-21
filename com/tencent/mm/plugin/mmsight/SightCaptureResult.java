package com.tencent.mm.plugin.mmsight;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.baa;
import com.tencent.mm.sdk.platformtools.ab;

public class SightCaptureResult
  implements Parcelable
{
  public static final Parcelable.Creator<SightCaptureResult> CREATOR;
  public boolean mog;
  public boolean osA;
  public boolean osB;
  public String osC;
  public String osD;
  public String osE;
  public String osF;
  public int osG;
  public baa osH;
  public String osI;

  static
  {
    AppMethodBeat.i(60276);
    CREATOR = new SightCaptureResult.1();
    AppMethodBeat.o(60276);
  }

  protected SightCaptureResult(Parcel paramParcel)
  {
    AppMethodBeat.i(60274);
    this.mog = false;
    this.osA = false;
    this.osB = true;
    this.osC = "";
    this.osD = "";
    this.osE = "";
    this.osF = "";
    this.osG = 0;
    this.osH = new baa();
    this.osI = "";
    boolean bool;
    if (paramParcel.readByte() != 0)
      bool = true;
    while (true)
    {
      this.mog = bool;
      if (paramParcel.readByte() != 0)
      {
        bool = true;
        label93: this.osA = bool;
        if (paramParcel.readByte() == 0)
          break label210;
        bool = true;
        this.osB = bool;
        this.osC = paramParcel.readString();
        this.osD = paramParcel.readString();
        this.osE = paramParcel.readString();
        this.osF = paramParcel.readString();
        this.osG = paramParcel.readInt();
        this.osI = paramParcel.readString();
      }
      try
      {
        byte[] arrayOfByte = new byte[paramParcel.readInt()];
        paramParcel.readByteArray(arrayOfByte);
        paramParcel = new com/tencent/mm/protocal/protobuf/baa;
        paramParcel.<init>();
        this.osH = paramParcel;
        this.osH.parseFrom(arrayOfByte);
        AppMethodBeat.o(60274);
        return;
        bool = false;
        continue;
        bool = false;
        break label93;
        label210: bool = false;
      }
      catch (Exception paramParcel)
      {
        while (true)
        {
          ab.e("MicroMsg.SightCaptureResult", "read ext info error: %s", new Object[] { paramParcel.getMessage() });
          AppMethodBeat.o(60274);
        }
      }
    }
  }

  public SightCaptureResult(boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(60273);
    this.mog = false;
    this.osA = false;
    this.osB = true;
    this.osC = "";
    this.osD = "";
    this.osE = "";
    this.osF = "";
    this.osG = 0;
    this.osH = new baa();
    this.osI = "";
    this.osB = paramBoolean;
    this.osI = paramString;
    this.mog = false;
    this.osA = true;
    AppMethodBeat.o(60273);
  }

  public SightCaptureResult(boolean paramBoolean, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt, baa parambaa)
  {
    AppMethodBeat.i(60272);
    this.mog = false;
    this.osA = false;
    this.osB = true;
    this.osC = "";
    this.osD = "";
    this.osE = "";
    this.osF = "";
    this.osG = 0;
    this.osH = new baa();
    this.osI = "";
    this.osB = paramBoolean;
    this.osC = paramString1;
    this.osD = paramString2;
    this.osE = paramString3;
    this.osG = paramInt;
    this.osH = parambaa;
    this.osF = paramString4;
    this.mog = true;
    this.osA = false;
    AppMethodBeat.o(60272);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(60275);
    if (this.mog)
      paramInt = 1;
    while (true)
    {
      paramParcel.writeByte((byte)paramInt);
      if (this.osA)
      {
        paramInt = 1;
        label31: paramParcel.writeByte((byte)paramInt);
        if (!this.osB)
          break label138;
        paramInt = i;
        paramParcel.writeByte((byte)paramInt);
        paramParcel.writeString(this.osC);
        paramParcel.writeString(this.osD);
        paramParcel.writeString(this.osE);
        paramParcel.writeString(this.osF);
        paramParcel.writeInt(this.osG);
        paramParcel.writeString(this.osI);
      }
      try
      {
        byte[] arrayOfByte = this.osH.toByteArray();
        paramParcel.writeInt(arrayOfByte.length);
        paramParcel.writeByteArray(arrayOfByte);
        AppMethodBeat.o(60275);
        return;
        paramInt = 0;
        continue;
        paramInt = 0;
        break label31;
        label138: paramInt = 0;
      }
      catch (Exception paramParcel)
      {
        while (true)
        {
          ab.e("MicroMsg.SightCaptureResult", "write ext info error");
          AppMethodBeat.o(60275);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.SightCaptureResult
 * JD-Core Version:    0.6.2
 */