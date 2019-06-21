package com.tencent.mm.plugin.sns.ui.d;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelsns.SnsAdClick;
import com.tencent.mm.modelsns.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sns.a.b.j;
import com.tencent.mm.plugin.sns.a.b.j.a;
import com.tencent.mm.plugin.sns.a.b.j.b;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.an;
import com.tencent.mm.plugin.sns.model.g;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI;
import com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity;
import com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI;
import com.tencent.mm.plugin.sns.ui.aj;
import com.tencent.mm.plugin.sns.ui.c.a.a;
import com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.blk;
import com.tencent.mm.protocal.protobuf.cbf;
import com.tencent.mm.protocal.protobuf.cbn;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.az;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import java.util.LinkedList;
import java.util.List;

final class b$24
  implements View.OnClickListener
{
  b$24(b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(40279);
    ab.i("MicroMsg.TimelineClickListener", "onsight click");
    Object localObject1;
    if ((paramView.getTag() instanceof aj))
      localObject1 = (aj)paramView.getTag();
    while (true)
    {
      n localn = af.cnF().YT(((aj)localObject1).cwT);
      if (localn == null)
        AppMethodBeat.o(40279);
      boolean bool;
      TimeLineObject localTimeLineObject;
      bau localbau;
      while (true)
      {
        return;
        if ((paramView.getTag() instanceof BaseTimeLineItem.BaseViewHolder))
        {
          localObject1 = ((BaseTimeLineItem.BaseViewHolder)paramView.getTag()).rGD;
          break;
        }
        if (!(paramView.getTag() instanceof a))
          break label2387;
        localObject1 = ((a)paramView.getTag()).rGD;
        break;
        if (this.rKt.rhQ != null)
          this.rKt.rhQ.cnj().x(localn);
        bool = localn.DI(32);
        if ((bool) && (localn.cqo() != null) && ((localn.cqo().coP()) || (localn.cqo().coQ())))
        {
          this.rKt.rKn.onClick(paramView);
          AppMethodBeat.o(40279);
        }
        else
        {
          localTimeLineObject = ((aj)localObject1).rnr;
          if ((localTimeLineObject.xfI.wbK == null) || (localTimeLineObject.xfI.wbK.size() == 0))
          {
            ab.e("MicroMsg.TimelineClickListener", "the obj.ContentObj.MediaObjList is null");
            AppMethodBeat.o(40279);
          }
          else
          {
            localbau = (bau)localTimeLineObject.xfI.wbK.get(0);
            if (!bool)
              break label355;
            af.cnC();
            if (g.t(localbau))
              break label355;
            ((aj)localObject1).raP.setVisibility(8);
            ((aj)localObject1).rnu.setVisibility(0);
            ((aj)localObject1).rnu.dKB();
            af.cnC().z(localbau);
            localObject1 = af.cnA();
            paramView = az.dtl();
            paramView.oyB = localTimeLineObject.pcX;
            ((com.tencent.mm.plugin.sns.model.b)localObject1).a(localbau, 4, null, paramView);
            if (bool)
              j.a(j.b.qET, j.a.qEK, localn, this.rKt.cvd);
            AppMethodBeat.o(40279);
          }
        }
      }
      label355: if ((localn.DI(32)) && (localn.cqo().coK()) && (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.i.YO(localn.crd().field_adxml)));
      Object localObject2;
      int j;
      for (int i = 1; ; i = 0)
      {
        if ((i != 0) || (!bool) || (!af.cnC().u(localbau)))
          break label531;
        af.cnC().z(localbau);
        ((aj)localObject1).raP.setVisibility(8);
        ((aj)localObject1).rnu.setVisibility(8);
        localObject2 = af.cnC();
        paramView = ((aj)localObject1).qzM;
        j = this.rKt.activity.hashCode();
        i = ((aj)localObject1).position;
        localObject1 = az.dtl();
        ((az)localObject1).oyB = localTimeLineObject.pcX;
        ((g)localObject2).a(localn, localbau, paramView, j, i, (az)localObject1, bool);
        if (bool)
          j.a(j.b.qET, j.a.qEK, localn, this.rKt.cvd);
        AppMethodBeat.o(40279);
        break;
      }
      label531: label549: com.tencent.mm.modelsns.b localb;
      label614: int k;
      label667: long l;
      if (this.rKt.cvd == 0)
      {
        localObject2 = com.tencent.mm.modelsns.b.lY(717);
        ((com.tencent.mm.modelsns.b)localObject2).tx(com.tencent.mm.plugin.sns.data.i.j(localn)).mb(localn.field_type).cS(localn.DI(32)).tx(localn.crc()).tx(localbau.Id);
        ((com.tencent.mm.modelsns.b)localObject2).ajK();
        if (this.rKt.cvd != 0)
          break label1184;
        localb = com.tencent.mm.modelsns.b.lY(745);
        localb.tx(com.tencent.mm.plugin.sns.data.i.j(localn)).mb(localn.field_type).cS(localn.DI(32));
        if (bool)
        {
          k = this.rKt.cvd;
          if (this.rKt.cvd != 0)
            break label1195;
          i = 1;
          l = localn.field_snsId;
          if (!localn.cqo().coK())
            break label1201;
          j = 21;
          label687: if (!localn.cqo().coK())
            break label1208;
        }
      }
      Object localObject3;
      String str1;
      label1184: label1195: label1201: label1208: for (int m = 0; ; m = 21)
      {
        com.tencent.mm.plugin.sns.data.i.a(new SnsAdClick(k, i, l, j, m));
        if ((!localn.cqo().coK()) || (!com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.i.YO(localn.crd().field_adxml)))
          j.a(j.b.qET, j.a.qEL, localn, this.rKt.cvd);
        localObject2 = "";
        localObject3 = an.fZ(af.getAccSnsPath(), localbau.Id);
        str1 = "";
        String str2 = com.tencent.mm.plugin.sns.data.i.j(localbau);
        if (com.tencent.mm.vfs.e.ct((String)localObject3 + str2))
        {
          localObject2 = (String)localObject3 + str2;
          str1 = (String)localObject3 + com.tencent.mm.plugin.sns.data.i.e(localbau);
        }
        if (com.tencent.mm.vfs.e.ct((String)localObject3 + com.tencent.mm.plugin.sns.data.i.p(localbau)))
        {
          localObject2 = (String)localObject3 + com.tencent.mm.plugin.sns.data.i.p(localbau);
          str1 = (String)localObject3 + com.tencent.mm.plugin.sns.data.i.n(localbau);
        }
        localObject3 = new int[2];
        paramView.getLocationInWindow((int[])localObject3);
        j = paramView.getWidth();
        i = paramView.getHeight();
        h.pYm.e(11444, new Object[] { Integer.valueOf(3) });
        if (bool)
          break label1215;
        ab.i("MicroMsg.TimelineClickListener", "it not ad video, use online video activity to play.");
        paramView = new Intent();
        paramView.setClass(this.rKt.activity, SnsOnlineVideoActivity.class);
        paramView.putExtra("intent_videopath", (String)localObject2);
        paramView.putExtra("intent_thumbpath", str1);
        paramView.putExtra("intent_localid", ((aj)localObject1).cwT);
        paramView.putExtra("intent_isad", bool);
        paramView.putExtra("intent_from_scene", this.rKt.cvd);
        paramView.putExtra("img_gallery_left", localObject3[0]);
        paramView.putExtra("img_gallery_top", localObject3[1]);
        paramView.putExtra("img_gallery_width", j);
        paramView.putExtra("img_gallery_height", i);
        localb.b(paramView, "intent_key_StatisticsOplog");
        this.rKt.activity.startActivity(paramView);
        this.rKt.activity.overridePendingTransition(0, 0);
        b.a(this.rKt, localn.cqu());
        AppMethodBeat.o(40279);
        break;
        localObject2 = com.tencent.mm.modelsns.b.lZ(717);
        break label549;
        localb = com.tencent.mm.modelsns.b.lZ(745);
        break label614;
        i = 2;
        break label667;
        j = 17;
        break label687;
      }
      label1215: if ((localn.DI(32)) && (localn.cqo().coK()) && (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.i.YO(localn.crd().field_adxml)))
      {
        paramView = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.i.y(localn);
        if (!bo.isNullOrNil(paramView))
          localn.crd().field_adxml = paramView;
        paramView = new Intent();
        paramView.putExtra("img_gallery_left", localObject3[0]);
        paramView.putExtra("img_gallery_top", localObject3[1]);
        paramView.putExtra("img_gallery_width", j);
        paramView.putExtra("img_gallery_height", i);
        paramView.putExtra("sns_landing_pages_share_sns_id", localn.cqA());
        paramView.putExtra("sns_landing_pages_rawSnsId", localn.cqu().Id);
        paramView.putExtra("sns_landing_pages_ux_info", localn.crc());
        localObject1 = localn.cqu();
        if (localObject1 != null)
        {
          localObject1 = ((TimeLineObject)localObject1).xfI.wbK;
          if (((List)localObject1).size() > 0)
            paramView.putExtra("sns_landing_pages_share_thumb_url", ((bau)((List)localObject1).get(0)).wEH);
        }
        paramView.setClass(this.rKt.activity, SnsAdNativeLandingPagesUI.class);
        i = 1;
        if (this.rKt.cvd == 2)
          i = 16;
        while (true)
        {
          paramView.putExtra("sns_landig_pages_from_source", i);
          paramView.putExtra("sns_landing_pages_xml", localn.crd().field_adxml);
          paramView.putExtra("sns_landing_pages_rec_src", localn.cre());
          paramView.putExtra("sns_landing_pages_xml_prefix", "adxml");
          paramView.putExtra("sns_landing_pages_need_enter_and_exit_animation", true);
          paramView.putExtra("sns_landing_is_native_sight_ad", true);
          this.rKt.activity.startActivity(paramView);
          this.rKt.activity.overridePendingTransition(0, 0);
          AppMethodBeat.o(40279);
          break;
          if (this.rKt.cvd == 1)
            i = 2;
        }
      }
      paramView = new Intent();
      paramView.setClass(this.rKt.activity, SnsSightPlayerUI.class);
      paramView.putExtra("intent_videopath", (String)localObject2);
      paramView.putExtra("intent_thumbpath", str1);
      paramView.putExtra("intent_localid", ((aj)localObject1).cwT);
      paramView.putExtra("intent_isad", bool);
      paramView.putExtra("intent_from_scene", this.rKt.cvd);
      paramView.putExtra("img_gallery_left", localObject3[0]);
      paramView.putExtra("img_gallery_top", localObject3[1]);
      paramView.putExtra("img_gallery_width", j);
      paramView.putExtra("img_gallery_height", i);
      localb.b(paramView, "intent_key_StatisticsOplog");
      this.rKt.activity.startActivity(paramView);
      this.rKt.activity.overridePendingTransition(0, 0);
      new ak().postDelayed(new b.24.1(this, localbau, (aj)localObject1, localn, localTimeLineObject, bool), 500L);
      paramView = new int[3];
      if ((!bool) && (af.cnC().a(localn, paramView) > 5))
      {
        af.cnC().y(localbau);
        i = 1;
      }
      while (true)
        while (true)
        {
          label1770: int n = paramView[0];
          int i1 = paramView[1];
          label1789: int i2;
          if (i == 2)
          {
            k = 1;
            i2 = paramView[2];
            paramView = localn.cqu();
            localObject1 = new d();
            ((d)localObject1).l("20FeedId", paramView.Id + ",");
            ((d)localObject1).l("21AdUxInfo", localn.crc() + ",");
          }
          try
          {
            paramView = new com/tencent/mm/protocal/protobuf/cbf;
            paramView.<init>();
            localObject2 = (cbf)paramView.parseFrom(localn.field_attrBuf);
            if (((cbf)localObject2).xaD != null)
            {
              paramView = new com/tencent/mm/protocal/protobuf/cbn;
              paramView.<init>();
              paramView = (cbn)paramView.parseFrom(((cbf)localObject2).xaD.getBufferToBytes());
              if (paramView.xaS != null)
                m = paramView.xaS.wcL;
            }
          }
          catch (Exception paramView)
          {
            while (true)
            {
              try
              {
                j = paramView.xaS.wcM;
                ((d)localObject1).l("22LayerId", m + ",");
                ((d)localObject1).l("23ExpId", j + ",");
                ((d)localObject1).l("24ClickState", i + ",");
                ((d)localObject1).l("25ClickTime", bo.anT() + ",");
                i = 0;
                if (at.isWifi(ah.getContext()))
                {
                  i = 1;
                  ((d)localObject1).l("26NetworkType", i + ",");
                  ((d)localObject1).l("27IsFlowControl", n + ",");
                  ((d)localObject1).l("28AutoDownloadSetting", i1 + ",");
                  ((d)localObject1).l("29IsAutoPlay", k + ",");
                  ((d)localObject1).l("30IsFlowControlDatePeriod", i2 + ",");
                  ab.i("MicroMsg.TimelineClickListener", "report SnsSightPreloadExp(sight_autodownload) logbuffer(13323): " + ((d)localObject1).Fk());
                  h.pYm.e(13323, new Object[] { localObject1 });
                  AppMethodBeat.o(40279);
                  break;
                  if ((!bool) || (af.cnC().b(localn, paramView) <= 5))
                    break label2381;
                  af.cnC().y(localbau);
                  i = 1;
                  break label1770;
                  k = 0;
                  break label1789;
                  paramView = paramView;
                  m = 0;
                  ab.printErrStackTrace("MicroMsg.TimelineClickListener", paramView, "", new Object[0]);
                  j = 0;
                  continue;
                }
                if (at.is2G(ah.getContext()))
                {
                  i = 2;
                  continue;
                }
                if (at.is3G(ah.getContext()))
                {
                  i = 3;
                  continue;
                }
                if (!at.is4G(ah.getContext()))
                  continue;
                i = 4;
                continue;
              }
              catch (Exception paramView)
              {
                continue;
              }
              j = 0;
              m = 0;
            }
            label2381: i = 2;
          }
        }
      label2387: localObject1 = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.d.b.24
 * JD-Core Version:    0.6.2
 */