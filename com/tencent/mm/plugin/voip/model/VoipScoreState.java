package com.tencent.mm.plugin.voip.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

public class VoipScoreState
  implements Parcelable
{
  public static final Parcelable.Creator<VoipScoreState> CREATOR;
  public int nwu;
  public long nwv;
  public long nxT;
  public String sSM;
  public int sSN;
  public long sSO;

  static
  {
    AppMethodBeat.i(4600);
    CREATOR = new VoipScoreState.1();
    AppMethodBeat.o(4600);
  }

  public VoipScoreState()
  {
    AppMethodBeat.i(4594);
    this.sSM = "";
    this.sSN = -1;
    this.nwu = -1;
    this.nwv = -1L;
    this.nxT = -1L;
    this.sSO = 0L;
    ab.c("MicroMsg.VoipScoreState", "create VoipScoreState", new Object[0]);
    AppMethodBeat.o(4594);
  }

  protected VoipScoreState(Parcel paramParcel)
  {
    AppMethodBeat.i(4595);
    this.sSM = "";
    this.sSN = -1;
    this.nwu = -1;
    this.nwv = -1L;
    this.nxT = -1L;
    this.sSO = 0L;
    this.sSM = paramParcel.readString();
    this.sSN = paramParcel.readInt();
    this.nwu = paramParcel.readInt();
    this.nwv = paramParcel.readLong();
    this.nxT = paramParcel.readLong();
    this.sSO = paramParcel.readLong();
    AppMethodBeat.o(4595);
  }

  public static void cJX()
  {
    AppMethodBeat.i(4597);
    long l = bf.aaa();
    g.RQ();
    g.RP().Ry().set(ac.a.xVG, Long.valueOf(l));
    ab.i("MicroMsg.VoipScoreState", "markShowScoreDialog %s", new Object[] { Long.valueOf(l) });
    AppMethodBeat.o(4597);
  }

  public final void a(String paramString, int paramInt1, int paramInt2, long paramLong)
  {
    AppMethodBeat.i(4596);
    ab.i("MicroMsg.VoipScoreState", "setScoreState, roomId:%s, roomKey:%s, title:%s, interval:%s", new Object[] { Integer.valueOf(paramInt2), Long.valueOf(paramLong), paramString, Integer.valueOf(paramInt1) });
    this.nwu = paramInt2;
    this.nwv = paramLong;
    if (!bo.isNullOrNil(paramString));
    while (true)
    {
      try
      {
        String str = new java/lang/String;
        str.<init>(Base64.decode(paramString.getBytes(), 0));
        ab.c("MicroMsg.VoipScoreState", "setScoreState, title:%s, interval:%s", new Object[] { str, Integer.valueOf(paramInt1) });
        this.sSN = paramInt1;
        this.sSM = str;
        AppMethodBeat.o(4596);
        return;
      }
      catch (Exception paramString)
      {
        ab.printErrStackTrace("MicroMsg.VoipScoreState", paramString, "setScoreState error: %s", new Object[] { paramString.getMessage() });
      }
      AppMethodBeat.o(4596);
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public String toString()
  {
    AppMethodBeat.i(4599);
    String str = "VoipScoreState{scoreTitle='" + this.sSM + '\'' + ", scoreIntervalDay=" + this.sSN + ", roomId=" + this.nwu + ", roomKey=" + this.nwv + ", startTalkTime=" + this.nxT + ", lastShowScoreTime=" + this.sSO + '}';
    AppMethodBeat.o(4599);
    return str;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(4598);
    paramParcel.writeString(this.sSM);
    paramParcel.writeInt(this.sSN);
    paramParcel.writeInt(this.nwu);
    paramParcel.writeLong(this.nwv);
    paramParcel.writeLong(this.nxT);
    paramParcel.writeLong(this.sSO);
    AppMethodBeat.o(4598);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.VoipScoreState
 * JD-Core Version:    0.6.2
 */