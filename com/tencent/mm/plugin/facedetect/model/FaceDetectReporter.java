package com.tencent.mm.plugin.facedetect.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;

public class FaceDetectReporter
  implements Parcelable
{
  public static final Parcelable.Creator<FaceDetectReporter> CREATOR;
  public static FaceDetectReporter lUy;
  public String appId;
  public long hbj;
  public long lUA;
  public long lUB;
  public int lUC;
  public boolean lUD;
  public boolean lUt;
  private FaceDetectReportInfo lUu;
  public int lUv;
  public int lUw;
  public int lUx;
  private long lUz;

  static
  {
    AppMethodBeat.i(242);
    lUy = new FaceDetectReporter();
    CREATOR = new FaceDetectReporter.1();
    AppMethodBeat.o(242);
  }

  private FaceDetectReporter()
  {
    this.hbj = 0L;
    this.lUt = false;
    this.lUu = null;
    this.appId = "";
    this.lUv = -1;
    this.lUw = 0;
    this.lUx = 0;
    this.lUz = 0L;
    this.lUA = -1L;
    this.lUB = -1L;
    this.lUC = 0;
    this.lUD = false;
  }

  protected FaceDetectReporter(Parcel paramParcel)
  {
    AppMethodBeat.i(228);
    this.hbj = 0L;
    this.lUt = false;
    this.lUu = null;
    this.appId = "";
    this.lUv = -1;
    this.lUw = 0;
    this.lUx = 0;
    this.lUz = 0L;
    this.lUA = -1L;
    this.lUB = -1L;
    this.lUC = 0;
    this.lUD = false;
    this.hbj = paramParcel.readLong();
    if (paramParcel.readByte() != 0)
    {
      bool2 = true;
      this.lUt = bool2;
      this.lUu = ((FaceDetectReportInfo)paramParcel.readParcelable(FaceDetectReportInfo.class.getClassLoader()));
      this.appId = paramParcel.readString();
      this.lUv = paramParcel.readInt();
      this.lUw = paramParcel.readInt();
      this.lUx = paramParcel.readInt();
      this.lUz = paramParcel.readLong();
      this.lUA = paramParcel.readLong();
      this.lUB = paramParcel.readLong();
      this.lUC = paramParcel.readInt();
      if (paramParcel.readByte() == 0)
        break label205;
    }
    label205: for (boolean bool2 = bool1; ; bool2 = false)
    {
      this.lUD = bool2;
      AppMethodBeat.o(228);
      return;
      bool2 = false;
      break;
    }
  }

  public static FaceDetectReporter bsJ()
  {
    AppMethodBeat.i(230);
    if (lUy == null);
    while (true)
    {
      try
      {
        if (lUy == null)
        {
          localFaceDetectReporter1 = new com/tencent/mm/plugin/facedetect/model/FaceDetectReporter;
          localFaceDetectReporter1.<init>();
          lUy = localFaceDetectReporter1;
        }
        FaceDetectReporter localFaceDetectReporter1 = lUy;
        return localFaceDetectReporter1;
      }
      finally
      {
        AppMethodBeat.o(230);
      }
      FaceDetectReporter localFaceDetectReporter2 = lUy;
      AppMethodBeat.o(230);
    }
  }

  public static void i(long paramLong, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(231);
    ab.i("MicroMsg.FaceDetectReporter", "hy: report video: bioId: %d, errType: %d, errCode: %d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    h.pYm.e(14121, new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    AppMethodBeat.o(231);
  }

  public static int vl(int paramInt)
  {
    switch (paramInt)
    {
    default:
      paramInt = -1;
    case 0:
    case 3:
    case 1:
    case 4:
    case 5:
    case 2:
    }
    while (true)
    {
      return paramInt;
      paramInt = 2;
      continue;
      paramInt = 3;
      continue;
      paramInt = 4;
      continue;
      paramInt = 1;
    }
  }

  public final void G(int paramInt, long paramLong)
  {
    AppMethodBeat.i(239);
    if (this.lUu != null)
    {
      FaceDetectReportInfo localFaceDetectReportInfo = this.lUu;
      localFaceDetectReportInfo.cpf += 1;
      localFaceDetectReportInfo = this.lUu;
      localFaceDetectReportInfo.lUp = ((int)(localFaceDetectReportInfo.lUp + paramLong));
      this.lUu.vk(paramInt);
    }
    AppMethodBeat.o(239);
  }

  public final void H(int paramInt, long paramLong)
  {
    AppMethodBeat.i(240);
    if (this.lUu != null)
    {
      ab.i("MicroMsg.FaceDetectReporter", "hashCode :" + hashCode() + " startTime" + paramLong);
      this.lUu.lUr.put(Integer.valueOf(paramInt), Long.valueOf(paramLong));
    }
    AppMethodBeat.o(240);
  }

  public final void I(int paramInt, long paramLong)
  {
    AppMethodBeat.i(241);
    if (this.lUu != null)
    {
      ab.i("MicroMsg.FaceDetectReporter", "hashCode :" + hashCode() + " endTime:" + paramLong);
      this.lUu.lUs.put(Integer.valueOf(paramInt), Long.valueOf(paramLong));
    }
    AppMethodBeat.o(241);
  }

  public final void R(int paramInt, boolean paramBoolean)
  {
    int i = 1;
    AppMethodBeat.i(235);
    ab.v("MicroMsg.FaceDetectReporter", "reportStartFaceDetect businessType: %d, isRetry: %b", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) });
    h localh = h.pYm;
    long l = this.hbj;
    if (paramBoolean);
    while (true)
    {
      localh.e(14005, new Object[] { Integer.valueOf(paramInt), Long.valueOf(l), Integer.valueOf(i) });
      AppMethodBeat.o(235);
      return;
      i = 0;
    }
  }

  public final void a(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    AppMethodBeat.i(237);
    ab.v("MicroMsg.FaceDetectReporter", "reportFaceDetectVerifyResult sessionId: %d, hasReported: %b, businessType: %d, isRetry: %b, result: %d, errType: %d, errCode: %d", new Object[] { Long.valueOf(this.hbj), Boolean.valueOf(this.lUt), Integer.valueOf(paramInt1), Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    int i;
    if ((this.lUu != null) && (!this.lUt))
    {
      ab.v("MicroMsg.FaceDetectReporter", "info: %s", new Object[] { this.lUu.toString() });
      this.lUt = true;
      this.lUu.lSp = paramInt5;
      if (this.lUu.cpf != 0)
        this.lUu.lUq = (this.lUu.lUp / this.lUu.cpf);
      paramInt5 = 0;
      i = paramInt5;
      if (this.lUu.lUr.containsKey(Integer.valueOf(0)))
      {
        i = paramInt5;
        if (this.lUu.lUs.containsKey(Integer.valueOf(0)))
        {
          i = (int)(((Long)this.lUu.lUs.get(Integer.valueOf(0))).longValue() - ((Long)this.lUu.lUr.get(Integer.valueOf(0))).longValue());
          ab.i("MicroMsg.FaceDetectReporter", "normalMotionTime : " + i + "  hashCode :" + hashCode());
        }
      }
      if ((!this.lUu.lUr.containsKey(Integer.valueOf(4))) || (!this.lUu.lUs.containsKey(Integer.valueOf(4))))
        break label940;
      paramInt5 = (int)(((Long)this.lUu.lUs.get(Integer.valueOf(4))).longValue() - ((Long)this.lUu.lUr.get(Integer.valueOf(4))).longValue());
      ab.i("MicroMsg.FaceDetectReporter", "readNumberMotionTime : " + paramInt5 + "  hashCode :" + hashCode());
    }
    while (true)
    {
      int j = paramInt5;
      if (this.lUu.lUr.containsKey(Integer.valueOf(6)))
      {
        j = paramInt5;
        if (this.lUu.lUs.containsKey(Integer.valueOf(6)))
        {
          j = (int)(((Long)this.lUu.lUs.get(Integer.valueOf(6))).longValue() - ((Long)this.lUu.lUr.get(Integer.valueOf(6))).longValue());
          ab.i("MicroMsg.FaceDetectReporter", "MOTION_REFLECTION : " + j + "  hashCode :" + hashCode());
        }
      }
      ab.v("MicroMsg.FaceDetectReporter", "alvinluo normal motion time: %d ms, read number motion time: %d ms ,hashcode %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(hashCode()) });
      h localh = h.pYm;
      long l = this.hbj;
      if (paramBoolean);
      for (paramInt5 = 1; ; paramInt5 = 0)
      {
        localh.e(14006, new Object[] { Long.valueOf(l), Integer.valueOf(paramInt1), Integer.valueOf(paramInt5), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), Integer.valueOf(this.lUu.lUb), Integer.valueOf(this.lUu.lUc), Integer.valueOf(this.lUu.lUd), Integer.valueOf(this.lUu.lUa), Integer.valueOf(this.lUu.lUe), Integer.valueOf(this.lUu.lUf), Integer.valueOf(this.lUu.lUg), Integer.valueOf(this.lUu.lUh), Integer.valueOf(this.lUu.lUi), Integer.valueOf(this.lUu.lUj), Integer.valueOf(this.lUu.lUk), Integer.valueOf(this.lUu.lUl), Integer.valueOf(this.lUu.lUm), Integer.valueOf(this.lUu.lSp), Integer.valueOf(this.lUu.lUn), Integer.valueOf(this.lUu.lUo), Integer.valueOf(this.lUu.lUq), Integer.valueOf(i), Integer.valueOf(j), this.appId, Integer.valueOf(this.lUv), Integer.valueOf(this.lUw), Integer.valueOf(this.lUx) });
        AppMethodBeat.o(237);
        return;
      }
      label940: paramInt5 = 0;
    }
  }

  public final void a(FaceDetectReporter paramFaceDetectReporter)
  {
    AppMethodBeat.i(234);
    ab.v("MicroMsg.FaceDetectReporter", "alvinluo setReporter, stack: %s", new Object[] { bo.dpG().toString() });
    this.lUu = paramFaceDetectReporter.lUu;
    this.lUt = paramFaceDetectReporter.lUt;
    this.hbj = paramFaceDetectReporter.hbj;
    this.lUw = paramFaceDetectReporter.lUw;
    this.lUx = paramFaceDetectReporter.lUx;
    long l = this.hbj;
    if (this.lUu != null);
    for (paramFaceDetectReporter = this.lUu.toString(); ; paramFaceDetectReporter = "null")
    {
      ab.v("MicroMsg.FaceDetectReporter", "alvinluo sessionId: %d, info: %s", new Object[] { Long.valueOf(l), paramFaceDetectReporter });
      AppMethodBeat.o(234);
      return;
    }
  }

  public final long bsK()
  {
    AppMethodBeat.i(232);
    ab.v("MicroMsg.FaceDetectReporter", "create report session");
    if (this.lUu == null)
      this.lUu = new FaceDetectReportInfo();
    this.lUu.reset();
    this.lUt = false;
    this.hbj = System.currentTimeMillis();
    this.lUu.hbj = this.hbj;
    long l = this.hbj;
    AppMethodBeat.o(232);
    return l;
  }

  public final long bsL()
  {
    AppMethodBeat.i(233);
    ab.v("MicroMsg.FaceDetectReporter", "create interface called session");
    this.lUz = System.currentTimeMillis();
    this.lUC = 0;
    this.lUD = false;
    this.lUA = -1L;
    this.lUB = -1L;
    long l = this.lUz;
    AppMethodBeat.o(233);
    return l;
  }

  public final void c(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(236);
    a(paramInt1, paramBoolean, paramInt2, paramInt3, paramInt4, 0);
    AppMethodBeat.o(236);
  }

  public final void ce(String paramString, int paramInt)
  {
    long l1 = -1L;
    int i = 1;
    AppMethodBeat.i(238);
    h localh;
    long l2;
    String str;
    if ((this.lUA == -1L) || (this.lUB == -1L) || (this.lUB < this.lUA))
    {
      ab.e("MicroMsg.FaceDetectReporter", "alvinluo not set calledStartTime:%d or calledEndTime: %d, total time is not valid", new Object[] { Long.valueOf(this.lUA), Long.valueOf(this.lUB) });
      ab.i("MicroMsg.FaceDetectReporter", "alvinluo report face detect interface called result, sessionId: %d, functionName: %s, interfaceType: %d, businessType: %d, totalTime: %d, isSuccess: %b, appId: %s, faceDetectCount: %d", new Object[] { Long.valueOf(this.lUz), paramString, Integer.valueOf(-1), Integer.valueOf(paramInt), Long.valueOf(l1), Boolean.valueOf(this.lUD), this.appId, Integer.valueOf(this.lUC) });
      localh = h.pYm;
      l2 = this.lUz;
      str = this.appId;
      if (!this.lUD)
        break label271;
    }
    while (true)
    {
      localh.e(14560, new Object[] { Long.valueOf(l2), paramString, Integer.valueOf(-1), Integer.valueOf(paramInt), str, Integer.valueOf(i), Long.valueOf(l1), Integer.valueOf(this.lUC) });
      AppMethodBeat.o(238);
      return;
      l1 = this.lUB - this.lUA;
      break;
      label271: i = 0;
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(229);
    paramParcel.writeLong(this.hbj);
    int j;
    if (this.lUt)
    {
      j = 1;
      paramParcel.writeByte((byte)j);
      paramParcel.writeParcelable(this.lUu, paramInt);
      paramParcel.writeString(this.appId);
      paramParcel.writeInt(this.lUv);
      paramParcel.writeInt(this.lUw);
      paramParcel.writeInt(this.lUx);
      paramParcel.writeLong(this.lUz);
      paramParcel.writeLong(this.lUA);
      paramParcel.writeLong(this.lUB);
      paramParcel.writeInt(this.lUC);
      if (!this.lUD)
        break label134;
    }
    label134: for (paramInt = i; ; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      AppMethodBeat.o(229);
      return;
      j = 0;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.model.FaceDetectReporter
 * JD-Core Version:    0.6.2
 */