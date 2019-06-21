package com.tencent.mm.plugin.appbrand.launching;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.mm.plugin.appbrand.j.f;
import com.tencent.mm.plugin.appbrand.j.f.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vending.e.a;

public final class ModularizingPkgRetrieverWC
  implements f, a
{
  final LoadParams ihZ;
  volatile f.a iia;

  private ModularizingPkgRetrieverWC(String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    AppMethodBeat.i(131943);
    this.ihZ = new LoadParams(paramString1, paramInt1, paramInt2, paramString2, (byte)0);
    AppMethodBeat.o(131943);
  }

  public final void a(f.a parama)
  {
    this.iia = parama;
  }

  public final void dead()
  {
    this.iia = null;
  }

  public final void start()
  {
    AppMethodBeat.i(131944);
    ab.i("MicroMsg.AppBrand.ModularizingPkgRetrieverWC[modularizing]", "startLoad %s", new Object[] { this.ihZ.toString() });
    XIPCInvoker.a("com.tencent.mm", this.ihZ, ModularizingPkgRetrieverWC.a.class, new ModularizingPkgRetrieverWC.2(this));
    AppMethodBeat.o(131944);
  }

  static final class LoadParams
    implements Parcelable
  {
    public static final Parcelable.Creator<LoadParams> CREATOR;
    public final String appId;
    public final int cBc;
    public final String gTy;
    public final int gVu;

    static
    {
      AppMethodBeat.i(131935);
      CREATOR = new ModularizingPkgRetrieverWC.LoadParams.1();
      AppMethodBeat.o(131935);
    }

    LoadParams(Parcel paramParcel)
    {
      AppMethodBeat.i(131933);
      this.appId = paramParcel.readString();
      this.cBc = paramParcel.readInt();
      this.gVu = paramParcel.readInt();
      this.gTy = paramParcel.readString();
      AppMethodBeat.o(131933);
    }

    private LoadParams(String paramString1, int paramInt1, int paramInt2, String paramString2)
    {
      this.appId = paramString1;
      this.cBc = paramInt1;
      this.gVu = paramInt2;
      this.gTy = paramString2;
    }

    public final int describeContents()
    {
      return 0;
    }

    public final String toString()
    {
      AppMethodBeat.i(131934);
      String str = "LoadParams{appId='" + this.appId + '\'' + ", pkgType=" + this.cBc + ", pkgVersion=" + this.gVu + ", moduleName='" + this.gTy + '\'' + '}';
      AppMethodBeat.o(131934);
      return str;
    }

    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      AppMethodBeat.i(131932);
      paramParcel.writeString(this.appId);
      paramParcel.writeInt(this.cBc);
      paramParcel.writeInt(this.gVu);
      paramParcel.writeString(this.gTy);
      AppMethodBeat.o(131932);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverWC
 * JD-Core Version:    0.6.2
 */