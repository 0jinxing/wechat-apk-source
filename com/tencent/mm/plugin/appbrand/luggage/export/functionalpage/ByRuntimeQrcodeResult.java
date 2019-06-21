package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aa.g;
import com.tencent.mm.aa.i;
import com.tencent.mm.sdk.platformtools.ab;

public class ByRuntimeQrcodeResult
  implements Parcelable
{
  public static final Parcelable.Creator<ByRuntimeQrcodeResult> CREATOR;
  public String data;
  public String hgU;

  static
  {
    AppMethodBeat.i(132117);
    CREATOR = new ByRuntimeQrcodeResult.1();
    AppMethodBeat.o(132117);
  }

  protected ByRuntimeQrcodeResult(Parcel paramParcel)
  {
    AppMethodBeat.i(132116);
    this.data = paramParcel.readString();
    this.hgU = paramParcel.readString();
    AppMethodBeat.o(132116);
  }

  public ByRuntimeQrcodeResult(String paramString1, String paramString2)
  {
    this.data = paramString1;
    this.hgU = paramString2;
  }

  public final String aHQ()
  {
    AppMethodBeat.i(132114);
    try
    {
      Object localObject = new com/tencent/mm/aa/i;
      ((i)localObject).<init>();
      localObject = ((i)localObject).g("transitiveData", this.hgU).g("data", this.data).toString();
      AppMethodBeat.o(132114);
      return localObject;
    }
    catch (g localg)
    {
      while (true)
      {
        ab.e("MicroMsg.AppBrand.Functional.ByRuntimeQrcodeResult", "toJsonString e = %s", new Object[] { localg });
        String str = "{}";
        AppMethodBeat.o(132114);
      }
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(132115);
    paramParcel.writeString(this.data);
    paramParcel.writeString(this.hgU);
    AppMethodBeat.o(132115);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.ByRuntimeQrcodeResult
 * JD-Core Version:    0.6.2
 */