package com.tencent.mm.plugin.appbrand.jsapi.lab;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.mm.ipcinvoker.type.IPCString;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONObject;

public final class JsApiGetLabInfo extends a
{
  public static final int CTRL_INDEX = 557;
  public static final String NAME = "getLabInfo";

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(131100);
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.JsApiGetLabInfo", "fail:data is null");
      paramc.M(paramInt, j("fail:invalid data", null));
      AppMethodBeat.o(131100);
    }
    while (true)
    {
      return;
      paramJSONObject = paramJSONObject.optString("labId");
      if (bo.isNullOrNil(paramJSONObject))
      {
        ab.e("MicroMsg.JsApiGetLabInfo", "fail:labId is null");
        paramc.M(paramInt, j("fail:invalid data", null));
        AppMethodBeat.o(131100);
      }
      else
      {
        XIPCInvoker.a("com.tencent.mm", new IPCString(paramJSONObject), JsApiGetLabInfo.a.class, new JsApiGetLabInfo.1(this, paramc, paramInt));
        AppMethodBeat.o(131100);
      }
    }
  }

  static final class GetLabInfoResult
    implements Parcelable
  {
    public static final Parcelable.Creator<GetLabInfoResult> CREATOR;
    private boolean cPt;
    private boolean enabled;

    static
    {
      AppMethodBeat.i(131098);
      CREATOR = new JsApiGetLabInfo.GetLabInfoResult.1();
      AppMethodBeat.o(131098);
    }

    public GetLabInfoResult()
    {
      this.cPt = false;
      this.enabled = false;
    }

    protected GetLabInfoResult(Parcel paramParcel)
    {
      AppMethodBeat.i(131097);
      this.cPt = false;
      this.enabled = false;
      if (paramParcel.readByte() != 0)
      {
        bool2 = true;
        this.cPt = bool2;
        if (paramParcel.readByte() == 0)
          break label60;
      }
      label60: for (boolean bool2 = bool1; ; bool2 = false)
      {
        this.enabled = bool2;
        AppMethodBeat.o(131097);
        return;
        bool2 = false;
        break;
      }
    }

    public final int describeContents()
    {
      return 0;
    }

    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramInt = 1;
      AppMethodBeat.i(131096);
      int i;
      if (this.cPt)
      {
        i = 1;
        byte b = i;
        paramParcel.writeByte(b);
        if (!this.enabled)
          break label55;
      }
      label55: int k;
      for (int j = paramInt; ; k = paramInt)
      {
        paramParcel.writeByte(j);
        AppMethodBeat.o(131096);
        return;
        i = 0;
        j = i;
        break;
        paramInt = 0;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.lab.JsApiGetLabInfo
 * JD-Core Version:    0.6.2
 */