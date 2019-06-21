package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.qx;
import com.tencent.mm.modelsns.SnsAdClick;
import com.tencent.mm.plugin.sns.a.b.j;
import com.tencent.mm.plugin.sns.a.b.j.a;
import com.tencent.mm.plugin.sns.a.b.j.b;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.an;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.sdk.platformtools.bo;

final class SnsSightPlayerUI$8
  implements View.OnClickListener
{
  SnsSightPlayerUI$8(SnsSightPlayerUI paramSnsSightPlayerUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(39257);
    if (SnsSightPlayerUI.c(this.rwT).DI(32))
      j.a(j.b.qET, j.a.qEM, SnsSightPlayerUI.c(this.rwT), SnsSightPlayerUI.b(this.rwT));
    Intent localIntent = new Intent();
    paramView = an.fZ(af.getAccSnsPath(), SnsSightPlayerUI.d(this.rwT).Id);
    Object localObject = i.k(SnsSightPlayerUI.d(this.rwT));
    localIntent.setClass(this.rwT, VideoAdPlayerUI.class);
    localIntent.putExtra("KFullVideoPath", paramView + (String)localObject);
    localIntent.putExtra("KThumbPath", SnsSightPlayerUI.e(this.rwT));
    localIntent.putExtra("IsAd", true);
    localIntent.putExtra("KStremVideoUrl", SnsSightPlayerUI.d(this.rwT).wEO);
    if (bo.isNullOrNil(SnsSightPlayerUI.d(this.rwT).wER))
    {
      paramView = SnsSightPlayerUI.d(this.rwT).wEH;
      localIntent.putExtra("KThumUrl", paramView);
      localIntent.putExtra("KMediaId", SnsSightPlayerUI.d(this.rwT).Id);
      localIntent.putExtra("KUrl", SnsSightPlayerUI.d(this.rwT).Url);
      localIntent.putExtra("KViewId", SnsSightPlayerUI.a(this.rwT).hnw);
      localObject = SnsSightPlayerUI.c(this.rwT).cqu();
      if (SnsSightPlayerUI.a(this.rwT) != null)
        break label655;
      paramView = "";
      label264: localIntent.putExtra("KSta_StremVideoAduxInfo", paramView);
      localIntent.putExtra("KSta_StremVideoPublishId", ((TimeLineObject)localObject).Id);
      localIntent.putExtra("KSta_SourceType", 1);
      localIntent.putExtra("KSta_Scene", j.b.qET.value);
      localIntent.putExtra("KSta_FromUserName", ((TimeLineObject)localObject).jBB);
      localIntent.putExtra("KSta_SnSId", ((TimeLineObject)localObject).Id);
      localIntent.putExtra("KSta_SnsStatExtStr", ((TimeLineObject)localObject).rjC);
      localIntent.putExtra("KMediaVideoTime", SnsSightPlayerUI.d(this.rwT).rEd);
      if (!bo.isNullOrNil(SnsSightPlayerUI.d(this.rwT).wES))
        break label669;
      paramView = ((TimeLineObject)localObject).xfF;
      label375: localIntent.putExtra("KMediaTitle", paramView);
      paramView = SnsSightPlayerUI.c(this.rwT).cqo();
      if ((paramView != null) && (paramView.qUn == 0))
      {
        localIntent.putExtra("StreamWording", paramView.qUo);
        localIntent.putExtra("StremWebUrl", paramView.qUp);
      }
      localObject = af.cnF().YT(SnsSightPlayerUI.f(this.rwT));
      if (SnsSightPlayerUI.b(this.rwT) != 0)
        break label683;
      paramView = com.tencent.mm.modelsns.b.lY(747);
      label458: paramView.tx(i.j((n)localObject)).mb(((n)localObject).field_type).cS(true).tx(((n)localObject).crc()).mb(SnsSightPlayerUI.d(this.rwT).rEd);
      paramView.ajK();
      if (SnsSightPlayerUI.b(this.rwT) != 0)
        break label693;
    }
    label655: label669: label683: label693: for (paramView = com.tencent.mm.modelsns.b.lY(748); ; paramView = com.tencent.mm.modelsns.b.lZ(748))
    {
      paramView.tx(i.j((n)localObject)).mb(((n)localObject).field_type).cS(true).tx(((n)localObject).crc()).mb(SnsSightPlayerUI.d(this.rwT).rEd);
      paramView.b(localIntent, "intent_key_StatisticsOplog");
      this.rwT.startActivity(localIntent);
      i.a(new SnsAdClick(SnsSightPlayerUI.b(this.rwT), 5, ((n)localObject).field_snsId, 14, 0));
      if (SnsSightPlayerUI.b(this.rwT) == 0)
      {
        paramView = new qx();
        paramView.cNd.cFy = true;
        com.tencent.mm.sdk.b.a.xxA.m(paramView);
      }
      AppMethodBeat.o(39257);
      return;
      paramView = SnsSightPlayerUI.d(this.rwT).wER;
      break;
      paramView = SnsSightPlayerUI.a(this.rwT).qPj;
      break label264;
      paramView = SnsSightPlayerUI.d(this.rwT).wES;
      break label375;
      paramView = com.tencent.mm.modelsns.b.lZ(747);
      break label458;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.8
 * JD-Core Version:    0.6.2
 */