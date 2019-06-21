package com.tencent.mm.wallet_core.e.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.c.w;
import java.util.HashMap;
import org.json.JSONObject;

public final class b extends a
{
  public b()
  {
    AppMethodBeat.i(49160);
    M(new HashMap());
    AppMethodBeat.o(49160);
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(49161);
    ab.d("Micromsg.NetScenePayUTimeSeed", " errCode: " + paramInt + " errMsg :" + paramString);
    paramString = paramJSONObject.optString("time_stamp");
    if (!bo.isNullOrNil(paramString))
      w.setTimeStamp(paramString);
    AppMethodBeat.o(49161);
  }

  public final int cOX()
  {
    return 28;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.e.a.b
 * JD-Core Version:    0.6.2
 */