package com.tencent.mm.plugin.appbrand.jsapi.media;

import com.tencent.map.geolocation.TencentLocationUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelgeo.a;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper.LatLongData;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Calendar;

final class JsApiChooseMultiMedia$a$2
  implements Runnable
{
  JsApiChooseMultiMedia$a$2(JsApiChooseMultiMedia.a parama, boolean paramBoolean, String paramString, double paramDouble1, double paramDouble2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(131231);
    Object localObject1;
    if (this.hPe)
    {
      localObject1 = JsApiChooseMultiMedia.a.Bw(this.val$filePath);
      JsApiChooseMultiMedia.b localb = JsApiChooseMultiMedia.Bt((String)localObject1);
      localObject1 = AppBrandLocalMediaObjectManager.j(this.hPN.hPJ.appId, (String)localObject1, this.hPe | true);
      if (localObject1 == null)
        break label252;
      long l = Calendar.getInstance().getTimeInMillis() / 1000L;
      double d = -1.0D;
      if ((!a.r(this.fBX)) || (!a.q(this.fBY)))
        break label231;
      Object localObject2 = JsApiChooseMultiMedia.a.aEl();
      if (localObject2 == null)
        break label210;
      d = TencentLocationUtils.distanceBetween(((BackwardSupportUtil.ExifHelper.LatLongData)localObject2).cEB, ((BackwardSupportUtil.ExifHelper.LatLongData)localObject2).fFz, this.fBX, this.fBY);
      label121: localObject2 = JsApiChooseMultiMedia.a.a(l, d);
      ab.i("MicroMsg.JsApiChooseMultiMedia", "handle image from mm-sight is done.");
      this.hPN.hPK.bFZ = -1;
      this.hPN.hPK.hPI = JsApiChooseMultiMedia.a.b(((AppBrandLocalMediaObject)localObject1).czD, ((AppBrandLocalMediaObject)localObject1).gjQ, localb.width, localb.height, localb.hfh, (String)localObject2);
      JsApiChooseMultiMedia.a.c(this.hPN, this.hPN.hPK);
      AppMethodBeat.o(131231);
    }
    while (true)
    {
      return;
      localObject1 = this.val$filePath;
      break;
      label210: ab.w("MicroMsg.JsApiChooseMultiMedia", "calculate X fail, locData is null. pic_Path: %s.", new Object[] { this.val$filePath });
      break label121;
      label231: ab.w("MicroMsg.JsApiChooseMultiMedia", "calculate X fail, lat/long is invalid. pic_Path: %s.", new Object[] { this.val$filePath });
      break label121;
      label252: ab.e("MicroMsg.JsApiChooseMultiMedia", "handle image from mm-sight camera, get null obj from path: %s", new Object[] { this.val$filePath });
      this.hPN.hPK.bFZ = -2;
      JsApiChooseMultiMedia.a.d(this.hPN, this.hPN.hPK);
      AppMethodBeat.o(131231);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia.a.2
 * JD-Core Version:    0.6.2
 */