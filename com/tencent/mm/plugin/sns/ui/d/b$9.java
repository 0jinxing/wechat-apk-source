package com.tencent.mm.plugin.sns.ui.d;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.modelsns.SnsAdClick;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.av;
import com.tencent.mm.plugin.sns.storage.e;
import com.tencent.mm.plugin.sns.storage.h;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI;
import com.tencent.mm.plugin.sns.ui.ao;
import com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.ds;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;

final class b$9
  implements View.OnClickListener
{
  b$9(b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(40255);
    Object localObject1 = null;
    Object localObject2;
    if ((paramView.getTag() instanceof ao))
    {
      localObject1 = ((ao)paramView.getTag()).czD;
      localObject2 = h.YT((String)localObject1);
      if (localObject2 != null)
        break label108;
      ab.e("MicroMsg.TimelineClickListener", "photo click without snsinfo ,localId ".concat(String.valueOf(localObject1)));
      AppMethodBeat.o(40255);
    }
    while (true)
    {
      return;
      if ((paramView.getTag() instanceof BaseTimeLineItem.BaseViewHolder))
      {
        localObject1 = ((BaseTimeLineItem.BaseViewHolder)paramView.getTag()).cwT;
        break;
      }
      if (!(paramView.getTag() instanceof com.tencent.mm.plugin.sns.ui.c.a.a))
        break;
      localObject1 = ((com.tencent.mm.plugin.sns.ui.c.a.a)paramView.getTag()).ros.cqU();
      break;
      label108: if ((!((n)localObject2).DI(32)) || (((n)localObject2).cqo() == null) || ((!((n)localObject2).cqo().coP()) && (!((n)localObject2).cqo().coQ())))
        break label165;
      this.rKt.rKn.onClick(paramView);
      AppMethodBeat.o(40255);
    }
    label165: if (((n)localObject2).cqu().xfI.wbJ == 21)
    {
      if (r.Yz().equals(((n)localObject2).field_userName))
      {
        ((n)localObject2).cqu();
        com.tencent.mm.plugin.sns.lucky.a.m.m((n)localObject2);
        com.tencent.mm.plugin.sns.lucky.a.m.l((n)localObject2);
        System.currentTimeMillis();
        com.tencent.mm.plugin.sns.lucky.a.b.kT(25);
      }
      if (!r.Yz().equals(((n)localObject2).field_userName))
      {
        com.tencent.mm.plugin.sns.lucky.b.a.a(2, (n)localObject2);
        com.tencent.mm.plugin.sns.lucky.a.b.kT(30);
      }
    }
    int j;
    if (((n)localObject2).DI(32))
    {
      b.a(this.rKt, (n)localObject2);
      if ((((n)localObject2).cqo().coK()) && (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.i.YO(((n)localObject2).crd().field_adxml)))
      {
        localObject1 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.i.y((n)localObject2);
        if (!bo.isNullOrNil((String)localObject1))
          ((n)localObject2).crd().field_adxml = ((String)localObject1);
        int i = this.rKt.cvd;
        if (this.rKt.cvd == 0)
        {
          j = 1;
          label323: com.tencent.mm.plugin.sns.data.i.a(new SnsAdClick(i, j, ((n)localObject2).field_snsId, 21, 21));
          Object localObject3 = new int[2];
          if (paramView != null)
            paramView.getLocationInWindow((int[])localObject3);
          j = paramView.getWidth();
          i = paramView.getHeight();
          localObject1 = new Intent();
          ((Intent)localObject1).putExtra("img_gallery_left", localObject3[0]);
          ((Intent)localObject1).putExtra("img_gallery_top", localObject3[1]);
          ((Intent)localObject1).putExtra("img_gallery_width", j);
          ((Intent)localObject1).putExtra("img_gallery_height", i);
          ((Intent)localObject1).putExtra("sns_landing_pages_share_sns_id", ((n)localObject2).cqA());
          ((Intent)localObject1).putExtra("sns_landing_pages_rawSnsId", ((n)localObject2).cqu().Id);
          ((Intent)localObject1).putExtra("sns_landing_pages_ux_info", ((n)localObject2).crc());
          ((Intent)localObject1).putExtra("sns_landing_pages_aid", ((n)localObject2).cqZ());
          ((Intent)localObject1).putExtra("sns_landing_pages_traceid", ((n)localObject2).cra());
          localObject3 = ((n)localObject2).cqu();
          if (localObject3 != null)
          {
            localObject3 = ((TimeLineObject)localObject3).xfI.wbK;
            if (((List)localObject3).size() > 0)
            {
              ((Intent)localObject1).putExtra("sns_landing_pages_share_thumb_url", ((bau)((List)localObject3).get(0)).wEH);
              ((Intent)localObject1).putExtra("sns_landing_pages_from_outer_index", ((ao)paramView.getTag()).index);
            }
          }
          ((Intent)localObject1).setClass(this.rKt.activity, SnsAdNativeLandingPagesUI.class);
          if (this.rKt.cvd != 2)
            break label808;
          j = 16;
        }
      }
    }
    while (true)
    {
      label581: ((Intent)localObject1).putExtra("sns_landig_pages_from_source", j);
      ((Intent)localObject1).putExtra("sns_landing_pages_xml", ((n)localObject2).crd().field_adxml);
      ((Intent)localObject1).putExtra("sns_landing_pages_rec_src", ((n)localObject2).cre());
      ((Intent)localObject1).putExtra("sns_landing_pages_xml_prefix", "adxml");
      ((Intent)localObject1).putExtra("sns_landing_pages_need_enter_and_exit_animation", true);
      this.rKt.activity.startActivity((Intent)localObject1);
      this.rKt.activity.overridePendingTransition(0, 0);
      if (this.rKt.rhQ != null)
        this.rKt.rhQ.cnj().x((n)localObject2);
      label687: paramView = (ao)paramView.getTag();
      if ((paramView.rps) && (localObject2 != null))
      {
        com.tencent.mm.plugin.sns.ui.a.a.b((n)localObject2, paramView.index);
        com.tencent.mm.plugin.sns.ui.a.a.c((n)localObject2, paramView.index);
        av.Yk(((n)localObject2).cqU());
      }
      if (localObject2 != null)
      {
        localObject1 = ((n)localObject2).cqu();
        if (localObject1 != null)
          if (((TimeLineObject)localObject1).xfH != null)
            break label847;
      }
      label808: label847: for (paramView = null; ; paramView = ((TimeLineObject)localObject1).xfH.Id)
      {
        if (!bo.isNullOrNil(paramView))
        {
          localObject2 = com.tencent.mm.plugin.sns.c.a.gkF.df(paramView);
          com.tencent.mm.plugin.sns.c.a.gkF.a(null, paramView, (String)localObject2, ((TimeLineObject)localObject1).jBB, 2, 4, 4, ((TimeLineObject)localObject1).xfM, ((TimeLineObject)localObject1).Id);
        }
        AppMethodBeat.o(40255);
        break;
        j = 2;
        break label323;
        if (this.rKt.cvd != 1)
          break label858;
        j = 2;
        break label581;
        this.rKt.cp(paramView);
        break label687;
        this.rKt.cp(paramView);
        break label687;
      }
      label858: j = 1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.d.b.9
 * JD-Core Version:    0.6.2
 */