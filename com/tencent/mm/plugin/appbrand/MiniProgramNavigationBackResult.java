package com.tencent.mm.plugin.appbrand;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONException;
import org.json.JSONObject;

public class MiniProgramNavigationBackResult
  implements Parcelable
{
  public static final Parcelable.Creator<MiniProgramNavigationBackResult> CREATOR;
  public JSONObject gQt;
  public JSONObject gQu;

  static
  {
    AppMethodBeat.i(86795);
    CREATOR = new MiniProgramNavigationBackResult.1();
    AppMethodBeat.o(86795);
  }

  public MiniProgramNavigationBackResult()
  {
  }

  private MiniProgramNavigationBackResult(Parcel paramParcel)
  {
    AppMethodBeat.i(86794);
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(bo.bc(paramParcel.readString(), "{}"));
      this.gQt = localJSONObject;
      localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(bo.bc(paramParcel.readString(), "{}"));
      this.gQu = localJSONObject;
      AppMethodBeat.o(86794);
      return;
    }
    catch (JSONException paramParcel)
    {
      while (true)
      {
        ab.e("MicroMsg.AppBrand.MiniProgramNavigationBackResult", "readFromParcel, ex = %s", new Object[] { paramParcel });
        AppMethodBeat.o(86794);
      }
    }
  }

  public static MiniProgramNavigationBackResult a(JSONObject paramJSONObject1, JSONObject paramJSONObject2)
  {
    AppMethodBeat.i(86792);
    if ((paramJSONObject1 == null) && (paramJSONObject2 == null))
    {
      paramJSONObject1 = null;
      AppMethodBeat.o(86792);
      return paramJSONObject1;
    }
    MiniProgramNavigationBackResult localMiniProgramNavigationBackResult = new MiniProgramNavigationBackResult();
    JSONObject localJSONObject = new JSONObject();
    if (paramJSONObject1 == null)
    {
      paramJSONObject1 = localJSONObject;
      label44: localMiniProgramNavigationBackResult.gQt = ((JSONObject)paramJSONObject1);
      paramJSONObject1 = new JSONObject();
      if (paramJSONObject2 != null)
        break label85;
    }
    while (true)
    {
      localMiniProgramNavigationBackResult.gQu = ((JSONObject)paramJSONObject1);
      AppMethodBeat.o(86792);
      paramJSONObject1 = localMiniProgramNavigationBackResult;
      break;
      break label44;
      label85: paramJSONObject1 = paramJSONObject2;
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject1 = null;
    AppMethodBeat.i(86793);
    if (this.gQt == null)
    {
      localObject2 = null;
      paramParcel.writeString((String)localObject2);
      if (this.gQu != null)
        break label57;
    }
    label57: for (Object localObject2 = localObject1; ; localObject2 = this.gQu.toString())
    {
      paramParcel.writeString((String)localObject2);
      AppMethodBeat.o(86793);
      return;
      localObject2 = this.gQt.toString();
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.MiniProgramNavigationBackResult
 * JD-Core Version:    0.6.2
 */