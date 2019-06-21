package com.tencent.mm.plugin.mmsight;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.modelcontrol.d;
import com.tencent.mm.storage.z;

public class SightParams
  implements Parcelable
{
  public static final Parcelable.Creator<SightParams> CREATOR;
  public VideoTransPara fcY;
  public int mode;
  public int osJ;
  public String osK;
  public String osL;
  public String osM;
  public String osN;
  public String osO;
  public boolean osP;
  public boolean osQ;
  public String osR;
  public int osS;
  public int scene;

  static
  {
    AppMethodBeat.i(60281);
    CREATOR = new SightParams.1();
    AppMethodBeat.o(60281);
  }

  public SightParams(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(60278);
    this.mode = 0;
    this.osJ = 2;
    this.osK = "";
    this.osL = "";
    this.osM = "";
    this.osN = "";
    this.osO = "";
    this.osP = true;
    this.scene = -1;
    this.osQ = true;
    this.osR = "";
    if (paramInt1 == 1)
      this.fcY = d.afF().afG();
    while (true)
    {
      this.scene = paramInt1;
      this.mode = paramInt2;
      g.RQ();
      this.osS = ((Integer)g.RP().Ry().get(344066, Integer.valueOf(0))).intValue();
      AppMethodBeat.o(60278);
      return;
      if ((paramInt1 == 2) || (paramInt1 == 3) || (paramInt1 == 4))
        this.fcY = d.afF().afH();
      else if (paramInt1 == 7)
        this.fcY = d.afF().afK();
      else
        this.fcY = d.afF().afH();
    }
  }

  protected SightParams(Parcel paramParcel)
  {
    AppMethodBeat.i(60279);
    this.mode = 0;
    this.osJ = 2;
    this.osK = "";
    this.osL = "";
    this.osM = "";
    this.osN = "";
    this.osO = "";
    this.osP = true;
    this.scene = -1;
    this.osQ = true;
    this.osR = "";
    this.mode = paramParcel.readInt();
    this.fcY = ((VideoTransPara)paramParcel.readParcelable(VideoTransPara.class.getClassLoader()));
    this.osK = paramParcel.readString();
    this.osL = paramParcel.readString();
    this.osM = paramParcel.readString();
    this.osN = paramParcel.readString();
    this.osS = paramParcel.readInt();
    this.osJ = paramParcel.readInt();
    if (paramParcel.readInt() > 0)
    {
      bool2 = true;
      this.osP = bool2;
      this.scene = paramParcel.readInt();
      if (paramParcel.readByte() == 0)
        break label199;
    }
    label199: for (boolean bool2 = bool1; ; bool2 = false)
    {
      this.osQ = bool2;
      this.osR = paramParcel.readString();
      AppMethodBeat.o(60279);
      return;
      bool2 = false;
      break;
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public final SightParams q(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.osM = paramString1;
    this.osK = paramString2;
    this.osL = paramString3;
    this.osN = paramString4;
    return this;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    byte b1 = 1;
    AppMethodBeat.i(60280);
    paramParcel.writeInt(this.mode);
    paramParcel.writeParcelable(this.fcY, paramInt);
    paramParcel.writeString(this.osK);
    paramParcel.writeString(this.osL);
    paramParcel.writeString(this.osM);
    paramParcel.writeString(this.osN);
    paramParcel.writeInt(this.osS);
    paramParcel.writeInt(this.osJ);
    if (this.osP)
    {
      paramInt = 1;
      paramParcel.writeInt(paramInt);
      paramParcel.writeInt(this.scene);
      if (!this.osQ)
        break label129;
    }
    label129: int i;
    for (byte b2 = b1; ; i = paramInt)
    {
      paramParcel.writeByte(b2);
      paramParcel.writeString(this.osR);
      AppMethodBeat.o(60280);
      return;
      paramInt = 0;
      break;
      paramInt = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.SightParams
 * JD-Core Version:    0.6.2
 */