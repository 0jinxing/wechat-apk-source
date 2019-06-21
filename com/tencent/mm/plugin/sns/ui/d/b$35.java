package com.tencent.mm.plugin.sns.ui.d;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.modelsns.SnsAdClick;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.ayt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class b$35
  implements View.OnClickListener
{
  b$35(b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(40297);
    if (!(paramView.getTag() instanceof String))
      AppMethodBeat.o(40297);
    com.tencent.mm.plugin.sns.storage.n localn;
    while (true)
    {
      return;
      paramView = (String)paramView.getTag();
      localn = af.cnF().YT(paramView);
      if (localn == null)
      {
        AppMethodBeat.o(40297);
      }
      else
      {
        if (!localn.DI(32))
          break label494;
        ab.i("MicroMsg.TimelineClickListener", "click the ad poi button");
        localObject1 = b.a(this.rKt, localn);
        if (localObject1 != null)
          break;
        ab.e("MicroMsg.TimelineClickListener", "the adInfo is null");
        AppMethodBeat.o(40297);
      }
    }
    int i = this.rKt.cvd;
    if (this.rKt.cvd == 0);
    for (int j = 1; ; j = 2)
    {
      localObject2 = new SnsAdClick(i, j, localn.field_snsId, 19, 0);
      i.a((SnsAdClick)localObject2);
      if (!bo.isNullOrNil(((com.tencent.mm.plugin.sns.storage.a)localObject1).qTE))
        break label171;
      ab.e("MicroMsg.TimelineClickListener", "the adActionPOILink is null");
      AppMethodBeat.o(40297);
      break;
    }
    label171: if (this.rKt.cvd == 0);
    for (paramView = com.tencent.mm.modelsns.b.lY(724); ; paramView = com.tencent.mm.modelsns.b.lZ(724))
    {
      paramView.tx(i.j(localn)).mb(localn.field_type).cS(localn.DI(32)).tx(localn.crc()).tx("").tx("").tx("").tx("").tx(((com.tencent.mm.plugin.sns.storage.a)localObject1).qTD).tx("").tx("");
      paramView.ajK();
      ab.i("MicroMsg.TimelineClickListener", "open webview url : " + ((com.tencent.mm.plugin.sns.storage.a)localObject1).qTE);
      paramView = new Intent();
      if ((localn != null) && (localn.DI(32)))
      {
        localObject3 = b.a(this.rKt, localn);
        if (localObject3 != null)
          paramView.putExtra("KsnsViewId", ((com.tencent.mm.plugin.sns.storage.a)localObject3).hnw);
      }
      localObject3 = new Bundle();
      ((Bundle)localObject3).putParcelable("KSnsAdTag", (Parcelable)localObject2);
      paramView.putExtra("jsapiargs", (Bundle)localObject3);
      paramView.putExtra("useJs", true);
      paramView.putExtra("KPublisherId", "sns_" + i.jV(localn.field_snsId));
      paramView.putExtra("pre_username", localn.field_userName);
      paramView.putExtra("prePublishId", "sns_" + i.jV(localn.field_snsId));
      paramView.putExtra("preUsername", localn.field_userName);
      paramView.putExtra("rawUrl", ((com.tencent.mm.plugin.sns.storage.a)localObject1).qTE);
      com.tencent.mm.plugin.sns.c.a.gkE.i(paramView, this.rKt.activity);
      AppMethodBeat.o(40297);
      break;
    }
    label494: Object localObject1 = localn.cqu();
    Object localObject3 = ((TimeLineObject)localObject1).xfG;
    Object localObject2 = new Intent();
    if (this.rKt.cvd == 0);
    for (paramView = com.tencent.mm.modelsns.b.lY(724); ; paramView = com.tencent.mm.modelsns.b.lZ(724))
    {
      paramView.tx(i.j(localn)).mb(localn.field_type).cS(localn.DI(32)).tx(localn.crc()).tx(((ayt)localObject3).wCC).mb(((ayt)localObject3).rki).tx(((ayt)localObject3).vRq).tx(((ayt)localObject3).vRp).tx(((ayt)localObject3).eUu).tx(((ayt)localObject3).rkg).tx(((ayt)localObject3).guP);
      paramView.ajK();
      if (!bo.isNullOrNil(((ayt)localObject3).wCC))
        break label766;
      ((Intent)localObject2).putExtra("map_view_type", 7);
      ((Intent)localObject2).putExtra("kwebmap_slat", ((ayt)localObject3).vRq);
      ((Intent)localObject2).putExtra("kwebmap_lng", ((ayt)localObject3).vRp);
      ((Intent)localObject2).putExtra("kPoiName", ((ayt)localObject3).eUu);
      ((Intent)localObject2).putExtra("Kwebmap_locaion", ((ayt)localObject3).rkg);
      d.b(this.rKt.activity, "location", ".ui.RedirectUI", (Intent)localObject2);
      AppMethodBeat.o(40297);
      break;
    }
    label766: if (this.rKt.rKp == 0);
    for (paramView = String.format("http://mp.weixin.qq.com/mp/lifedetail?bid=%s&action=list#wechat_redirect", new Object[] { ((ayt)localObject3).wCC }); ; paramView = String.format("http://mp.weixin.qq.com/mp/lifedetail?bid=%s&tid=%s&action=list#wechat_redirect", new Object[] { ((ayt)localObject3).wCC, ((TimeLineObject)localObject1).Id }))
    {
      ((Intent)localObject2).putExtra("rawUrl", paramView);
      com.tencent.mm.plugin.sns.c.a.gkE.i((Intent)localObject2, this.rKt.activity);
      AppMethodBeat.o(40297);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.d.b.35
 * JD-Core Version:    0.6.2
 */