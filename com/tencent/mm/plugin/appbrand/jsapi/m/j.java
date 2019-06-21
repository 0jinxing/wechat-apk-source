package com.tencent.mm.plugin.appbrand.jsapi.m;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.picker.f;
import com.tencent.mm.sdk.platformtools.al;
import org.json.JSONObject;

final class j extends d
{
  int hUA = 2147483647;
  int hUB = 2147483647;
  int hUC = -1;
  int hUD = -1;
  int hUy = -1;
  int hUz = -1;

  final void C(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(126368);
    Object localObject1 = paramJSONObject.optJSONObject("range");
    if (localObject1 != null)
    {
      Object localObject2 = ((JSONObject)localObject1).optString("start");
      localObject1 = ((JSONObject)localObject1).optString("end");
      localObject2 = f.EO((String)localObject2);
      if (localObject2 != null)
      {
        this.hUy = localObject2[0];
        this.hUz = localObject2[1];
      }
      localObject1 = f.EO((String)localObject1);
      if (localObject1 != null)
      {
        this.hUA = localObject1[0];
        this.hUB = localObject1[1];
      }
    }
    this.hUy = Math.max(this.hUy, 0);
    this.hUz = Math.max(this.hUz, 0);
    this.hUA = Math.min(this.hUA, 23);
    this.hUB = Math.min(this.hUB, 59);
    paramJSONObject = f.EO(paramJSONObject.optString("current"));
    if (paramJSONObject != null)
    {
      this.hUC = paramJSONObject[0];
      this.hUD = paramJSONObject[1];
    }
    al.d(new j.1(this));
    AppMethodBeat.o(126368);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.m.j
 * JD-Core Version:    0.6.2
 */