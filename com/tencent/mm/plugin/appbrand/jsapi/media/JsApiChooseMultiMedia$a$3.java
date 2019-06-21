package com.tencent.mm.plugin.appbrand.jsapi.media;

import com.tencent.map.geolocation.TencentLocationUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelgeo.a;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalVideoObject;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper.LatLongData;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.util.Calendar;

final class JsApiChooseMultiMedia$a$3
  implements Runnable
{
  JsApiChooseMultiMedia$a$3(JsApiChooseMultiMedia.a parama, String paramString, double paramDouble1, double paramDouble2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(131232);
    AppBrandLocalVideoObject localAppBrandLocalVideoObject;
    if (new File(this.hPO).exists())
    {
      ab.i("MicroMsg.JsApiChooseMultiMedia", "take media camera, the mVideoFilePath file exist, success");
      this.hPN.hPK.bFZ = -1;
      localAppBrandLocalVideoObject = JsApiChooseMultiMedia.a.a(this.hPN, this.hPO, false);
      if (localAppBrandLocalVideoObject == null)
      {
        ab.e("MicroMsg.JsApiChooseMultiMedia", "addVideoItem fail ,mVideoFilePath is %s", new Object[] { this.hPO });
        this.hPN.hPK.bFZ = -2;
        JsApiChooseMultiMedia.a.e(this.hPN, this.hPN.hPK);
        AppMethodBeat.o(131232);
        return;
      }
      str = JsApiChooseMultiMedia.a.By(this.hPO);
      if (bo.isNullOrNil(str))
        break label363;
    }
    label363: for (String str = JsApiChooseMultiMedia.a.a(this.hPN, str); ; str = "")
    {
      long l = Calendar.getInstance().getTimeInMillis() / 1000L;
      double d = -1.0D;
      Object localObject;
      if ((a.r(this.fBX)) && (a.q(this.fBY)))
      {
        localObject = JsApiChooseMultiMedia.a.aEl();
        if (localObject != null)
          d = TencentLocationUtils.distanceBetween(((BackwardSupportUtil.ExifHelper.LatLongData)localObject).cEB, ((BackwardSupportUtil.ExifHelper.LatLongData)localObject).fFz, this.fBX, this.fBY);
      }
      while (true)
      {
        localObject = JsApiChooseMultiMedia.a.a(l, d);
        this.hPN.hPK.hPI = JsApiChooseMultiMedia.a.b(localAppBrandLocalVideoObject.czD, localAppBrandLocalVideoObject.size, localAppBrandLocalVideoObject.width, localAppBrandLocalVideoObject.height, localAppBrandLocalVideoObject.duration, str, (String)localObject);
        JsApiChooseMultiMedia.a.f(this.hPN, this.hPN.hPK);
        AppMethodBeat.o(131232);
        break;
        ab.w("MicroMsg.JsApiChooseMultiMedia", "calculate X fail, locData is null. video_Path: %s.", new Object[] { this.hPO });
        continue;
        ab.w("MicroMsg.JsApiChooseMultiMedia", "calculate X fail, lat/long is invalid. video_Path: %s.", new Object[] { this.hPO });
      }
      ab.e("MicroMsg.JsApiChooseMultiMedia", "take media camera, mVideoFilePath is %s, the file not exist, fail", new Object[] { this.hPO });
      this.hPN.hPK.bFZ = -2;
      JsApiChooseMultiMedia.a.g(this.hPN, this.hPN.hPK);
      AppMethodBeat.o(131232);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia.a.3
 * JD-Core Version:    0.6.2
 */