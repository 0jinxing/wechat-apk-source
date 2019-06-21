package com.tencent.mm.plugin.emojicapture.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bo;

public class EmojiCaptureReporter
  implements Parcelable
{
  public static final Parcelable.Creator<EmojiCaptureReporter> CREATOR;
  public long ckF;
  public boolean eAb;
  public long euE;
  public String eyJ;
  public long ezZ;
  public boolean fas;
  public long lgL;
  public long lgM;
  public long lgN;
  public long lgO;
  public long lgP;
  public long lgQ;
  public long lgR;
  public boolean lgS;
  public boolean lgT;
  public int lgU;
  public int lgV;
  public String lgW;
  public String lgX;
  public String lgY;
  public int scene;
  public int textColor;

  static
  {
    AppMethodBeat.i(57463);
    CREATOR = new EmojiCaptureReporter.1();
    AppMethodBeat.o(57463);
  }

  public EmojiCaptureReporter()
  {
  }

  public EmojiCaptureReporter(Parcel paramParcel)
  {
    AppMethodBeat.i(57462);
    this.ezZ = paramParcel.readLong();
    this.lgL = paramParcel.readLong();
    this.lgM = paramParcel.readLong();
    this.lgN = paramParcel.readLong();
    this.lgO = paramParcel.readLong();
    this.lgP = paramParcel.readLong();
    this.lgQ = paramParcel.readLong();
    this.euE = paramParcel.readLong();
    this.lgR = paramParcel.readLong();
    this.ckF = paramParcel.readLong();
    this.textColor = paramParcel.readInt();
    if (paramParcel.readByte() != 0)
    {
      bool2 = true;
      this.lgS = bool2;
      if (paramParcel.readByte() == 0)
        break label184;
      bool2 = true;
      label122: this.lgT = bool2;
      this.lgU = paramParcel.readInt();
      if (paramParcel.readByte() == 0)
        break label189;
    }
    label184: label189: for (boolean bool2 = bool1; ; bool2 = false)
    {
      this.eAb = bool2;
      this.lgV = paramParcel.readInt();
      this.eyJ = paramParcel.readString();
      this.lgW = paramParcel.readString();
      AppMethodBeat.o(57462);
      return;
      bool2 = false;
      break;
      bool2 = false;
      break label122;
    }
  }

  public static void a(int paramInt1, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(57452);
    h.pYm.e(15982, new Object[] { Integer.valueOf(paramInt1), Long.valueOf(paramLong1), Long.valueOf(paramLong2), Long.valueOf(paramLong3), Long.valueOf(paramLong4), Long.valueOf(paramLong5), Long.valueOf(paramLong6), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    AppMethodBeat.o(57452);
  }

  public static void a(long paramLong, String paramString, int paramInt)
  {
    AppMethodBeat.i(57454);
    h.pYm.e(15982, new Object[] { Integer.valueOf(23), Long.valueOf(paramLong), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), paramString, Integer.valueOf(paramInt), Integer.valueOf(0) });
    AppMethodBeat.o(57454);
  }

  public static void bmw()
  {
    AppMethodBeat.i(57453);
    h.pYm.e(15982, new Object[] { Integer.valueOf(24), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), "", Integer.valueOf(0), Integer.valueOf(0) });
    AppMethodBeat.o(57453);
  }

  public static void d(long paramLong1, long paramLong2, int paramInt)
  {
    AppMethodBeat.i(57455);
    a(20, paramLong1, 0L, 0L, 0L, 0L, paramLong2, 0, 0, paramInt);
    AppMethodBeat.o(57455);
  }

  public static void dU(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(57459);
    h.pYm.k(852L, paramInt1, paramInt2);
    AppMethodBeat.o(57459);
  }

  public static void e(long paramLong1, long paramLong2, int paramInt)
  {
    AppMethodBeat.i(57457);
    a(19, paramLong1, 0L, 0L, 0L, paramLong2, 0L, 0, 0, paramInt);
    dU(1, 1);
    AppMethodBeat.o(57457);
  }

  public static void g(long paramLong, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(57456);
    a(22, paramLong, 0L, 0L, 0L, 0L, 0L, 0, paramInt1, paramInt2);
    switch (paramInt1)
    {
    default:
    case 1:
    case 2:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    case 10:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(57456);
      while (true)
      {
        return;
        dU(7, 1);
        AppMethodBeat.o(57456);
        continue;
        dU(6, 1);
        AppMethodBeat.o(57456);
        continue;
        dU(28, 1);
        AppMethodBeat.o(57456);
        continue;
        dU(22, 1);
        AppMethodBeat.o(57456);
        continue;
        dU(24, 1);
        AppMethodBeat.o(57456);
        continue;
        dU(25, 1);
        AppMethodBeat.o(57456);
        continue;
        dU(26, 1);
        AppMethodBeat.o(57456);
        continue;
        dU(27, 1);
        AppMethodBeat.o(57456);
        continue;
        AppMethodBeat.o(57456);
      }
      dU(8, 1);
    }
  }

  public static void h(long paramLong, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(57458);
    a(21, paramLong, 0L, 0L, 0L, 0L, 0L, paramInt1, 0, paramInt2);
    switch (paramInt1)
    {
    case 2:
    default:
    case 3:
    case 4:
    case 5:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(57458);
      while (true)
      {
        return;
        dU(21, 1);
        AppMethodBeat.o(57458);
        continue;
        dU(29, 1);
        AppMethodBeat.o(57458);
        continue;
        dU(30, 1);
        AppMethodBeat.o(57458);
      }
      dU(5, 1);
    }
  }

  public static void up(int paramInt)
  {
    AppMethodBeat.i(138350);
    dU(paramInt, 1);
    AppMethodBeat.o(138350);
  }

  public final void bmv()
  {
    int i = 1;
    int j = 0;
    AppMethodBeat.i(57451);
    if (!bo.isNullOrNil(this.eyJ))
      this.eyJ = this.eyJ.replace(",", " ");
    h localh = h.pYm;
    long l1 = this.ezZ;
    long l2 = this.ckF;
    long l3 = this.euE;
    long l4 = this.lgR;
    String str1 = this.eyJ;
    String str2 = Integer.toHexString(this.textColor & 0xFFFFFF);
    int k;
    if (this.lgS)
    {
      k = 1;
      if (!this.lgT)
        break label304;
    }
    label304: for (int m = 1; ; m = 0)
    {
      int n = this.lgU;
      if (this.eAb)
        j = 1;
      int i1 = this.lgV;
      String str3 = this.lgW;
      if (this.fas)
        i = 2;
      localh.e(15989, new Object[] { Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l3), Long.valueOf(l4), Integer.valueOf(0), Integer.valueOf(0), str1, str2, Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(j), Integer.valueOf(i1), str3, "", "", Integer.valueOf(i), this.lgX, this.lgY });
      AppMethodBeat.o(57451);
      return;
      k = 0;
      break;
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = 1;
    AppMethodBeat.i(57461);
    paramParcel.writeLong(this.ezZ);
    paramParcel.writeLong(this.lgL);
    paramParcel.writeLong(this.lgM);
    paramParcel.writeLong(this.lgN);
    paramParcel.writeLong(this.lgO);
    paramParcel.writeLong(this.lgP);
    paramParcel.writeLong(this.lgQ);
    paramParcel.writeLong(this.euE);
    paramParcel.writeLong(this.lgR);
    paramParcel.writeLong(this.ckF);
    paramParcel.writeInt(this.textColor);
    int i;
    if (this.lgS)
    {
      i = 1;
      byte b = i;
      paramParcel.writeByte(b);
      if (!this.lgT)
        break label193;
      i = 1;
      b = i;
      label125: paramParcel.writeByte(b);
      paramParcel.writeInt(this.lgU);
      if (!this.eAb)
        break label201;
    }
    label193: label201: int k;
    for (int j = paramInt; ; k = paramInt)
    {
      paramParcel.writeByte(j);
      paramParcel.writeInt(this.lgV);
      paramParcel.writeString(this.eyJ);
      paramParcel.writeString(this.lgW);
      AppMethodBeat.o(57461);
      return;
      i = 0;
      j = i;
      break;
      i = 0;
      j = i;
      break label125;
      paramInt = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter
 * JD-Core Version:    0.6.2
 */