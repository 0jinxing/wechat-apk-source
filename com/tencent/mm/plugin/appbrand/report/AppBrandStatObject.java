package com.tencent.mm.plugin.appbrand.report;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class AppBrandStatObject
  implements Parcelable
{
  public static final Parcelable.Creator<AppBrandStatObject> CREATOR;
  public int cOo;
  public int cOq;
  public String cOr;
  public String cst;
  public String hQF;
  public int iAo;
  public AppBrandRecommendStatObj iAp;
  public int scene;

  static
  {
    AppMethodBeat.i(96188);
    CREATOR = new AppBrandStatObject.1();
    AppMethodBeat.o(96188);
  }

  public AppBrandStatObject()
  {
  }

  protected AppBrandStatObject(Parcel paramParcel)
  {
    AppMethodBeat.i(96187);
    this.cOq = paramParcel.readInt();
    this.cOr = paramParcel.readString();
    this.scene = paramParcel.readInt();
    this.cst = paramParcel.readString();
    this.iAo = paramParcel.readInt();
    this.cOo = paramParcel.readInt();
    this.hQF = paramParcel.readString();
    this.iAp = ((AppBrandRecommendStatObj)paramParcel.readParcelable(AppBrandRecommendStatObj.class.getClassLoader()));
    AppMethodBeat.o(96187);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final String toString()
  {
    AppMethodBeat.i(96185);
    String str = "AppBrandStatObject{preScene=" + this.cOq + ", preSceneNote='" + this.cOr + '\'' + ", scene=" + this.scene + ", sceneNote='" + this.cst + '\'' + ", usedState=" + this.iAo + '}';
    AppMethodBeat.o(96185);
    return str;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(96186);
    paramParcel.writeInt(this.cOq);
    paramParcel.writeString(this.cOr);
    paramParcel.writeInt(this.scene);
    paramParcel.writeString(this.cst);
    paramParcel.writeInt(this.iAo);
    paramParcel.writeInt(this.cOo);
    paramParcel.writeString(this.hQF);
    paramParcel.writeParcelable(this.iAp, paramInt);
    AppMethodBeat.o(96186);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.AppBrandStatObject
 * JD-Core Version:    0.6.2
 */