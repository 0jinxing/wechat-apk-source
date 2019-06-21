package com.tencent.mm.plugin.facedetect.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;

class FaceDetectReportInfo
  implements Parcelable
{
  public static final Parcelable.Creator<FaceDetectReportInfo> CREATOR;
  protected int cpf;
  protected long hbj;
  protected int lSp;
  protected int lUa;
  protected int lUb;
  protected int lUc;
  protected int lUd;
  protected int lUe;
  protected int lUf;
  protected int lUg;
  protected int lUh;
  protected int lUi;
  protected int lUj;
  protected int lUk;
  protected int lUl;
  protected int lUm;
  protected int lUn;
  protected int lUo;
  protected int lUp;
  protected int lUq;
  protected HashMap<Integer, Long> lUr;
  protected HashMap<Integer, Long> lUs;

  static
  {
    AppMethodBeat.i(226);
    CREATOR = new FaceDetectReportInfo.1();
    AppMethodBeat.o(226);
  }

  public FaceDetectReportInfo()
  {
    AppMethodBeat.i(221);
    this.hbj = 0L;
    this.lUa = 0;
    this.lUb = 0;
    this.lUc = 0;
    this.lUd = 0;
    this.lUe = 0;
    this.lUf = 0;
    this.lUg = 0;
    this.lUh = 0;
    this.lUi = 0;
    this.lUj = 0;
    this.lUk = 0;
    this.lUl = 0;
    this.lUm = 0;
    this.lUn = 0;
    this.lUo = 0;
    this.cpf = 0;
    this.lSp = 0;
    this.lUp = 0;
    this.lUq = 0;
    this.lUr = new HashMap();
    this.lUs = new HashMap();
    AppMethodBeat.o(221);
  }

  protected FaceDetectReportInfo(Parcel paramParcel)
  {
    AppMethodBeat.i(222);
    this.hbj = 0L;
    this.lUa = 0;
    this.lUb = 0;
    this.lUc = 0;
    this.lUd = 0;
    this.lUe = 0;
    this.lUf = 0;
    this.lUg = 0;
    this.lUh = 0;
    this.lUi = 0;
    this.lUj = 0;
    this.lUk = 0;
    this.lUl = 0;
    this.lUm = 0;
    this.lUn = 0;
    this.lUo = 0;
    this.cpf = 0;
    this.lSp = 0;
    this.lUp = 0;
    this.lUq = 0;
    this.lUr = new HashMap();
    this.lUs = new HashMap();
    this.hbj = paramParcel.readLong();
    this.lUa = paramParcel.readInt();
    this.lUb = paramParcel.readInt();
    this.lUc = paramParcel.readInt();
    this.lUd = paramParcel.readInt();
    this.lUe = paramParcel.readInt();
    this.lUf = paramParcel.readInt();
    this.lUg = paramParcel.readInt();
    this.lUh = paramParcel.readInt();
    this.lUi = paramParcel.readInt();
    this.lUj = paramParcel.readInt();
    this.lUk = paramParcel.readInt();
    this.lUl = paramParcel.readInt();
    this.lUm = paramParcel.readInt();
    this.lUn = paramParcel.readInt();
    this.lUo = paramParcel.readInt();
    this.cpf = paramParcel.readInt();
    this.lSp = paramParcel.readInt();
    this.lUp = paramParcel.readInt();
    this.lUq = paramParcel.readInt();
    try
    {
      this.lUr = paramParcel.readHashMap(HashMap.class.getClassLoader());
      this.lUs = paramParcel.readHashMap(HashMap.class.getClassLoader());
      AppMethodBeat.o(222);
      return;
    }
    catch (Exception paramParcel)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.FaceDetectReportInfo", paramParcel, "", new Object[0]);
        AppMethodBeat.o(222);
      }
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public final void reset()
  {
    AppMethodBeat.i(224);
    this.hbj = 0L;
    this.lUb = 0;
    this.lUc = 0;
    this.lUd = 0;
    this.lUa = 0;
    this.lUe = 0;
    this.lUf = 0;
    this.lUg = 0;
    this.lUh = 0;
    this.lUi = 0;
    this.lUj = 0;
    this.lUk = 0;
    this.lUl = 0;
    this.lUm = 0;
    this.cpf = 0;
    this.lSp = 0;
    this.lUp = 0;
    this.lUq = 0;
    this.lUr.clear();
    this.lUs.clear();
    AppMethodBeat.o(224);
  }

  public String toString()
  {
    AppMethodBeat.i(225);
    String str = "detectOk: " + this.lUb + ", motionOk: " + this.lUc + ", noFace: " + this.lUd + ", systemErr: " + this.lUa + ", noLiveFace: " + this.lUe + ", tooDark: " + this.lUf + ", tooLight: " + this.lUg + ", backLight: " + this.lUh + ", tooSmall: " + this.lUi + ", tooBig: " + this.lUj + ", tooActive: " + this.lUk + ", poseNotValid: " + this.lUl + ", timeOut: " + this.lUm + ", totalFrame: " + this.cpf + ", verifyTime: " + this.lSp + ", processTimePerFrame: " + this.lUq;
    AppMethodBeat.o(225);
    return str;
  }

  public final void vk(int paramInt)
  {
    if (paramInt > 0)
      if (paramInt == 1)
        this.lUb += 1;
    while (true)
    {
      return;
      if (paramInt == 2)
      {
        this.lUc += 1;
      }
      else
      {
        this.lUb += 1;
        continue;
        if (paramInt == 0)
          this.lUd += 1;
        else if (paramInt == -11)
          this.lUf += 1;
        else if (paramInt == -12)
          this.lUg += 1;
        else if (paramInt == -13)
          this.lUh += 1;
        else if (paramInt == -101)
          this.lUl += 1;
        else if (paramInt == -102)
          this.lUi += 1;
        else if (paramInt == -103)
          this.lUj += 1;
        else if (paramInt == -105)
          this.lUk += 1;
        else if (paramInt == -106)
          this.lUe += 1;
        else if (paramInt == -107)
          this.lUm += 1;
        else if (paramInt == -108)
          this.lUn += 1;
        else if (paramInt == -109)
          this.lUo += 1;
        else
          this.lUa += 1;
      }
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(223);
    paramParcel.writeLong(this.hbj);
    paramParcel.writeInt(this.lUa);
    paramParcel.writeInt(this.lUb);
    paramParcel.writeInt(this.lUc);
    paramParcel.writeInt(this.lUd);
    paramParcel.writeInt(this.lUe);
    paramParcel.writeInt(this.lUf);
    paramParcel.writeInt(this.lUg);
    paramParcel.writeInt(this.lUh);
    paramParcel.writeInt(this.lUi);
    paramParcel.writeInt(this.lUj);
    paramParcel.writeInt(this.lUk);
    paramParcel.writeInt(this.lUl);
    paramParcel.writeInt(this.lUm);
    paramParcel.writeInt(this.lUn);
    paramParcel.writeInt(this.lUo);
    paramParcel.writeInt(this.cpf);
    paramParcel.writeInt(this.lSp);
    paramParcel.writeInt(this.lUp);
    paramParcel.writeInt(this.lUq);
    paramParcel.writeMap(this.lUr);
    paramParcel.writeMap(this.lUs);
    AppMethodBeat.o(223);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.model.FaceDetectReportInfo
 * JD-Core Version:    0.6.2
 */