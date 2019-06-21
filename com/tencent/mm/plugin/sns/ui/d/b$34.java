package com.tencent.mm.plugin.sns.ui.d;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.model.c.c;
import com.tencent.mm.modelsns.SnsAdClick;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.plugin.sns.a.b.j;
import com.tencent.mm.plugin.sns.a.b.j.a;
import com.tencent.mm.plugin.sns.a.b.j.b;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.e;
import com.tencent.mm.plugin.sns.storage.f;
import com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.List;
import java.util.Map;

final class b$34
  implements View.OnClickListener
{
  b$34(b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    int i = 2;
    boolean bool1 = false;
    AppMethodBeat.i(40296);
    if ((paramView.getTag() == null) || (!(paramView.getTag() instanceof Long)))
    {
      AppMethodBeat.o(40296);
      return;
    }
    long l = ((Long)paramView.getTag()).longValue();
    e locale = af.cnI().ku(l);
    com.tencent.mm.plugin.sns.storage.n localn = locale.cqB();
    j.a(j.b.qET, j.a.qER, locale.cqB(), this.rKt.cvd);
    locale.getSource();
    paramView = localn.crb();
    if (bo.isNullOrNil(paramView))
      paramView = localn.getAdLink();
    while (true)
    {
      Object localObject1;
      int j;
      Object localObject2;
      if (localn.DI(32))
      {
        localObject1 = b.a(this.rKt, localn);
        j = -1;
        localObject2 = c.abj().aoe("Sns_CanvasAd_DetailLink_JumpWay");
        if (((com.tencent.mm.storage.a)localObject2).isValid())
          j = bo.getInt(((com.tencent.mm.storage.a)localObject2).field_value, -1);
        if ((localObject1 != null) && (((com.tencent.mm.plugin.sns.storage.a)localObject1).qTw == 1))
        {
          paramView = new Intent();
          paramView.putExtra("key_card_id", ((com.tencent.mm.plugin.sns.storage.a)localObject1).qTy);
          paramView.putExtra("key_card_ext", ((com.tencent.mm.plugin.sns.storage.a)localObject1).qTz);
          paramView.putExtra("key_from_scene", 21);
          paramView.putExtra("key_stastic_scene", 15);
          d.b(this.rKt.activity, "card", ".ui.CardDetailUI", paramView);
          j = this.rKt.cvd;
          if (this.rKt.cvd == 0)
            i = 1;
          com.tencent.mm.plugin.sns.data.i.a(new SnsAdClick(j, i, localn.field_snsId, 3, 11));
          AppMethodBeat.o(40296);
          break;
        }
        if ((localObject1 != null) && (j == 1))
        {
          if ((localn.cqo().coK()) && (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.i.YO(localn.crd().field_adxml)))
          {
            paramView = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.i.y(localn);
            if (!bo.isNullOrNil(paramView))
              locale.field_adxml = paramView;
            paramView = new Intent();
            paramView.putExtra("sns_landing_pages_share_sns_id", localn.cqA());
            paramView.putExtra("sns_landing_pages_rawSnsId", localn.cqu().Id);
            paramView.putExtra("sns_landing_pages_ux_info", localn.crc());
            paramView.putExtra("sns_landing_pages_aid", localn.cqZ());
            paramView.putExtra("sns_landing_pages_traceid", localn.cra());
            localObject1 = localn.cqu();
            if (localObject1 != null)
            {
              localObject1 = ((TimeLineObject)localObject1).xfI.wbK;
              if (((List)localObject1).size() > 0)
                paramView.putExtra("sns_landing_pages_share_thumb_url", ((bau)((List)localObject1).get(0)).wEH);
            }
            paramView.setClass(this.rKt.activity, SnsAdNativeLandingPagesUI.class);
            j = 9;
            if (this.rKt.cvd == 2)
              j = 16;
            while (true)
            {
              paramView.putExtra("sns_landig_pages_from_source", j);
              paramView.putExtra("sns_landing_pages_xml", localn.crd().field_adxml);
              paramView.putExtra("sns_landing_pages_xml_prefix", "adxml");
              paramView.putExtra("sns_landing_pages_rec_src", localn.cre());
              paramView.putExtra("sns_landing_pages_need_enter_and_exit_animation", false);
              this.rKt.activity.startActivity(paramView);
              this.rKt.activity.overridePendingTransition(0, 0);
              j = this.rKt.cvd;
              if (this.rKt.cvd == 0)
                i = 1;
              com.tencent.mm.plugin.sns.data.i.a(new SnsAdClick(j, i, localn.field_snsId, 3, 21));
              AppMethodBeat.o(40296);
              break;
              if (this.rKt.cvd == 1)
                j = 10;
            }
          }
        }
        else if ((localObject1 != null) && (j == 0))
        {
          if ((!localn.cqo().coK()) || (!com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.i.YO(localn.crd().field_adxml)))
            break label1635;
          localObject1 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.i.y(localn);
          if (!bo.isNullOrNil((String)localObject1))
            locale.field_adxml = ((String)localObject1);
          localObject1 = br.z(localn.crd().field_adxml, "adxml");
          if (localObject1 != null)
          {
            localObject1 = bo.bc((String)((Map)localObject1).get(".adxml.adCanvasInfo.shareWebUrl"), "");
            if (!bo.isNullOrNil((String)localObject1))
              paramView = (View)localObject1;
          }
        }
      }
      label1632: label1635: 
      while (true)
      {
        label763: j = this.rKt.cvd;
        if (this.rKt.cvd == 0)
          i = 1;
        localObject2 = new SnsAdClick(j, i, localn.field_snsId, 3, 0);
        com.tencent.mm.plugin.sns.data.i.a((SnsAdClick)localObject2);
        ab.i("MicroMsg.TimelineClickListener", "adlink url " + paramView + " " + localn.cqo().qUg);
        localObject1 = new Intent();
        boolean bool2;
        if (localn.cqo().qUg == 0)
        {
          bool2 = true;
          label871: if (!ae.giI)
            break label1632;
          bool2 = bool1;
        }
        while (true)
        {
          if (localn.DI(32))
          {
            localObject3 = b.a(this.rKt, localn);
            if (localObject3 != null)
              ((Intent)localObject1).putExtra("KsnsViewId", ((com.tencent.mm.plugin.sns.storage.a)localObject3).hnw);
          }
          ((Intent)localObject1).putExtra("KRightBtn", bool2);
          Object localObject3 = new Bundle();
          ((Bundle)localObject3).putParcelable("KSnsAdTag", (Parcelable)localObject2);
          ((Bundle)localObject3).putString("key_snsad_statextstr", locale.cqu().rjC);
          ((Intent)localObject1).putExtra("jsapiargs", (Bundle)localObject3);
          ((Intent)localObject1).putExtra("rawUrl", paramView);
          ((Intent)localObject1).putExtra("useJs", true);
          ((Intent)localObject1).putExtra("srcUsername", localn.field_userName);
          ((Intent)localObject1).putExtra("sns_local_id", localn.cqU());
          ((Intent)localObject1).putExtra("stastic_scene", 15);
          ((Intent)localObject1).putExtra("KPublisherId", "sns_" + com.tencent.mm.plugin.sns.data.i.jV(localn.field_snsId));
          ((Intent)localObject1).putExtra("pre_username", localn.field_userName);
          ((Intent)localObject1).putExtra("prePublishId", "sns_" + com.tencent.mm.plugin.sns.data.i.jV(localn.field_snsId));
          ((Intent)localObject1).putExtra("preUsername", localn.field_userName);
          com.tencent.mm.plugin.sns.c.a.gkE.i((Intent)localObject1, this.rKt.activity);
          AppMethodBeat.o(40296);
          break;
          ab.e("MicroMsg.TimelineClickListener", "parse landingpagexml is error,landingpagexml is " + localn.crd().field_adxml);
          break label763;
          if ((localObject1 != null) && (j == -1) && (((com.tencent.mm.plugin.sns.storage.a)localObject1).qTw == 3))
          {
            if ((!localn.cqo().coK()) || (!com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.i.YO(localn.crd().field_adxml)))
              break label1635;
            paramView = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.i.y(localn);
            if (!bo.isNullOrNil(paramView))
              locale.field_adxml = paramView;
            paramView = new Intent();
            paramView.putExtra("sns_landing_pages_share_sns_id", localn.cqA());
            paramView.putExtra("sns_landing_pages_rawSnsId", localn.cqu().Id);
            paramView.putExtra("sns_landing_pages_ux_info", localn.crc());
            paramView.putExtra("sns_landing_pages_aid", localn.cqZ());
            paramView.putExtra("sns_landing_pages_traceid", localn.cra());
            localObject1 = localn.cqu();
            if (localObject1 != null)
            {
              localObject1 = ((TimeLineObject)localObject1).xfI.wbK;
              if (((List)localObject1).size() > 0)
                paramView.putExtra("sns_landing_pages_share_thumb_url", ((bau)((List)localObject1).get(0)).wEH);
            }
            paramView.setClass(this.rKt.activity, SnsAdNativeLandingPagesUI.class);
            j = 9;
            if (this.rKt.cvd == 2)
              j = 16;
            while (true)
            {
              paramView.putExtra("sns_landig_pages_from_source", j);
              paramView.putExtra("sns_landing_pages_xml", localn.crd().field_adxml);
              paramView.putExtra("sns_landing_pages_rec_src", localn.cre());
              paramView.putExtra("sns_landing_pages_xml_prefix", "adxml");
              paramView.putExtra("sns_landing_pages_need_enter_and_exit_animation", false);
              this.rKt.activity.startActivity(paramView);
              this.rKt.activity.overridePendingTransition(0, 0);
              j = this.rKt.cvd;
              if (this.rKt.cvd == 0)
                i = 1;
              com.tencent.mm.plugin.sns.data.i.a(new SnsAdClick(j, i, localn.field_snsId, 3, 21));
              AppMethodBeat.o(40296);
              break;
              if (this.rKt.cvd == 1)
                j = 10;
            }
          }
          if (!b.a(this.rKt, (com.tencent.mm.plugin.sns.storage.a)localObject1, localn, false))
            break label1635;
          j = this.rKt.cvd;
          if (this.rKt.cvd == 0)
            i = 1;
          com.tencent.mm.plugin.sns.data.i.a(new SnsAdClick(j, i, localn.field_snsId, 3, 31));
          AppMethodBeat.o(40296);
          break;
          bool2 = false;
          break label871;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.d.b.34
 * JD-Core Version:    0.6.2
 */