package com.tencent.mm.plugin.facedetectlight.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.youtu.ytagreflectlivecheck.requester.RGBConfigRequester;
import com.tencent.youtu.ytagreflectlivecheck.requester.RGBConfigRequester.RGBConfigRequestCallBack;
import com.tencent.youtu.ytagreflectlivecheck.requester.RGBConfigRequester.YTColorSeqReq;
import org.json.JSONArray;
import org.json.JSONObject;

final class c$4
  implements RGBConfigRequester
{
  c$4(c paramc, String paramString)
  {
  }

  public final RGBConfigRequester.YTColorSeqReq getColorSeqReq()
  {
    AppMethodBeat.i(792);
    RGBConfigRequester.YTColorSeqReq localYTColorSeqReq = new RGBConfigRequester.YTColorSeqReq("", "", "");
    AppMethodBeat.o(792);
    return localYTColorSeqReq;
  }

  public final void request(String paramString, RGBConfigRequester.RGBConfigRequestCallBack paramRGBConfigRequestCallBack)
  {
    AppMethodBeat.i(793);
    ab.i("MicroMsg.FaceReflectLogic", " get config lightList");
    paramString = "";
    String str = paramString;
    Object localObject;
    try
    {
      localObject = new org/json/JSONObject;
      str = paramString;
      ((JSONObject)localObject).<init>(this.mdW);
      str = paramString;
      JSONArray localJSONArray = ((JSONObject)localObject).optJSONArray("face_action_seq");
      localObject = paramString;
      if (localJSONArray != null)
      {
        int i = 0;
        while (true)
        {
          str = paramString;
          localObject = paramString;
          if (i >= localJSONArray.length())
            break;
          str = paramString;
          JSONObject localJSONObject = localJSONArray.optJSONObject(i);
          localObject = paramString;
          if (localJSONObject != null)
          {
            localObject = paramString;
            str = paramString;
            if (localJSONObject.optInt("action_id", 0) == 6)
            {
              str = paramString;
              localObject = localJSONObject.optString("action_data");
            }
          }
          i++;
          paramString = (String)localObject;
        }
      }
    }
    catch (Exception paramString)
    {
      ab.printErrStackTrace("MicroMsg.FaceReflectLogic", paramString, "parse action data error", new Object[0]);
      localObject = str;
      ab.i("MicroMsg.FaceReflectLogic", "get actionData: %s", new Object[] { localObject });
      if (bo.isNullOrNil((String)localObject))
        break label197;
    }
    h.pYm.a(917L, 5L, 1L, false);
    paramRGBConfigRequestCallBack.onSuccess((String)localObject);
    AppMethodBeat.o(793);
    while (true)
    {
      return;
      label197: h.pYm.a(917L, 6L, 1L, false);
      paramRGBConfigRequestCallBack.onFailed(-1);
      AppMethodBeat.o(793);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetectlight.ui.c.4
 * JD-Core Version:    0.6.2
 */