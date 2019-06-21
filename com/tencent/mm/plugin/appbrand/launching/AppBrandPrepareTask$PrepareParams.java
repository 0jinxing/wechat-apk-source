package com.tencent.mm.plugin.appbrand.launching;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.report.quality.QualitySession;
import java.util.Locale;

final class AppBrandPrepareTask$PrepareParams
  implements Parcelable
{
  public static final Parcelable.Creator<PrepareParams> CREATOR;
  private int gqq;
  private boolean hrs;
  private int igg;
  private String igh;
  private String igi;
  private int igj;
  private AppBrandLaunchReferrer igk;
  private String igl;
  private int igm;
  private boolean ign;
  private QualitySession igo;
  private String mAppId;

  static
  {
    AppMethodBeat.i(131753);
    CREATOR = new AppBrandPrepareTask.PrepareParams.1();
    AppMethodBeat.o(131753);
  }

  AppBrandPrepareTask$PrepareParams()
  {
  }

  AppBrandPrepareTask$PrepareParams(Parcel paramParcel)
  {
    AppMethodBeat.i(131752);
    this.igg = paramParcel.readInt();
    this.gqq = paramParcel.readInt();
    this.igh = paramParcel.readString();
    this.mAppId = paramParcel.readString();
    this.igi = paramParcel.readString();
    this.igj = paramParcel.readInt();
    this.igk = ((AppBrandLaunchReferrer)paramParcel.readParcelable(AppBrandLaunchReferrer.class.getClassLoader()));
    this.igl = paramParcel.readString();
    this.igm = paramParcel.readInt();
    if (paramParcel.readInt() == 1)
    {
      bool2 = true;
      this.hrs = bool2;
      if (paramParcel.readInt() <= 0)
        break label147;
    }
    label147: for (boolean bool2 = bool1; ; bool2 = false)
    {
      this.ign = bool2;
      this.igo = ((QualitySession)paramParcel.readParcelable(QualitySession.class.getClassLoader()));
      AppMethodBeat.o(131752);
      return;
      bool2 = false;
      break;
    }
  }

  public final int describeContents()
  {
    return 0;
  }

  public final String toShortString()
  {
    AppMethodBeat.i(131750);
    String str = String.format(Locale.US, "[%s|%d]", new Object[] { this.mAppId, Integer.valueOf(this.igj) });
    AppMethodBeat.o(131750);
    return str;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(131751);
    paramParcel.writeInt(this.igg);
    paramParcel.writeInt(this.gqq);
    paramParcel.writeString(this.igh);
    paramParcel.writeString(this.mAppId);
    paramParcel.writeString(this.igi);
    paramParcel.writeInt(this.igj);
    paramParcel.writeParcelable(this.igk, paramInt);
    paramParcel.writeString(this.igl);
    paramParcel.writeInt(this.igm);
    if (this.hrs)
    {
      j = 1;
      paramParcel.writeInt(j);
      if (!this.ign)
        break label133;
    }
    label133: for (int j = i; ; j = 0)
    {
      paramParcel.writeInt(j);
      paramParcel.writeParcelable(this.igo, paramInt);
      AppMethodBeat.o(131751);
      return;
      j = 0;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask.PrepareParams
 * JD-Core Version:    0.6.2
 */