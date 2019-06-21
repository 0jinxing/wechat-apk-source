package com.tencent.mm.plugin.appbrand.jsapi.m;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.al;
import java.util.Calendar;
import java.util.Date;
import org.json.JSONObject;

final class a extends d
{
  volatile a.a hTW;
  volatile Long hTX = null;
  volatile Long hTY = null;
  volatile int hTZ = -1;
  volatile int hUa = -1;
  volatile int hUb = -1;

  final void C(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(126343);
    this.hTW = a.a.BJ(paramJSONObject.optString("fields"));
    Object localObject1 = paramJSONObject.optJSONObject("range");
    if (localObject1 != null)
    {
      localObject2 = ((JSONObject)localObject1).optString("start", "");
      localObject2 = this.hTW.parse((String)localObject2);
      localObject1 = ((JSONObject)localObject1).optString("end", "");
      localObject1 = this.hTW.parse((String)localObject1);
      if (localObject2 != null)
        this.hTX = Long.valueOf(((Date)localObject2).getTime());
      if (localObject1 != null)
        this.hTY = Long.valueOf(((Date)localObject1).getTime());
    }
    if (this.hTX == null)
    {
      localObject2 = Calendar.getInstance(aa.xyO);
      ((Calendar)localObject2).set(1900, 0, 1);
      this.hTX = Long.valueOf(((Calendar)localObject2).getTimeInMillis());
    }
    if (this.hTY == null)
    {
      localObject2 = Calendar.getInstance(aa.xyO);
      ((Calendar)localObject2).set(2100, 11, 31);
      this.hTY = Long.valueOf(((Calendar)localObject2).getTimeInMillis());
    }
    paramJSONObject = paramJSONObject.optString("current", "");
    Object localObject2 = this.hTW.parse(paramJSONObject);
    paramJSONObject = (JSONObject)localObject2;
    if (localObject2 == null)
    {
      localObject2 = new Date(System.currentTimeMillis());
      localObject1 = new Date(this.hTY.longValue());
      paramJSONObject = new Date(this.hTX.longValue());
      if (!((Date)localObject2).after((Date)localObject1))
        break label287;
      paramJSONObject = (JSONObject)localObject1;
    }
    while (true)
    {
      this.hTZ = (paramJSONObject.getYear() + 1900);
      this.hUa = (paramJSONObject.getMonth() + 1);
      this.hUb = paramJSONObject.getDate();
      al.d(new a.1(this));
      AppMethodBeat.o(126343);
      return;
      label287: if (!((Date)localObject2).before(paramJSONObject))
        paramJSONObject = (JSONObject)localObject2;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.m.a
 * JD-Core Version:    0.6.2
 */