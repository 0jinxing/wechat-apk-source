package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sns.a.b.j;
import com.tencent.mm.plugin.sns.a.b.j.a;
import com.tencent.mm.plugin.sns.a.b.j.b;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.plugin.websearch.api.aa;
import com.tencent.mm.plugin.websearch.api.ac;
import com.tencent.mm.plugin.websearch.api.w;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.at;
import com.tencent.mm.protocal.protobuf.av;
import com.tencent.mm.protocal.protobuf.azu;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.bsj;
import com.tencent.mm.protocal.protobuf.cfg;
import com.tencent.mm.protocal.protobuf.chv;
import com.tencent.mm.protocal.protobuf.cvi;
import com.tencent.mm.protocal.protobuf.ds;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.e.m;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

final class bc$1
  implements View.OnClickListener
{
  bc$1(bc parambc)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(39862);
    long l = System.currentTimeMillis();
    if (l - this.rDG.iYa < 500L)
      AppMethodBeat.o(39862);
    Object localObject1;
    Object localObject2;
    com.tencent.mm.plugin.sns.storage.n localn;
    Object localObject4;
    label311: label836: String str;
    while (true)
    {
      return;
      this.rDG.iYa = l;
      if (!(paramView.getTag() instanceof q))
        break label2940;
      localObject1 = (q)paramView.getTag();
      localObject2 = ((q)localObject1).rin;
      localn = af.cnF().YT(((q)localObject1).cwT);
      if (this.rDG.rhQ != null)
        this.rDG.rhQ.cnj().x(localn);
      if (((TimeLineObject)localObject2).xfI.wbJ == 18)
      {
        paramView = this.rDG;
        localObject3 = this.rDG.context;
        localObject4 = ((q)localObject1).rin;
        localObject1 = ((q)localObject1).cwT;
        localObject1 = af.cnF().YT((String)localObject1);
        j.a(j.b.qEU, j.a.qEM, (com.tencent.mm.plugin.sns.storage.n)localObject1, paramView.cvd);
        localObject1 = new Intent();
        paramView = null;
        if (((TimeLineObject)localObject4).xfI.wbK.size() > 0)
          paramView = (bau)((TimeLineObject)localObject4).xfI.wbK.get(0);
        ((Intent)localObject1).putExtra("IsAd", false);
        ((Intent)localObject1).putExtra("KStremVideoUrl", ((TimeLineObject)localObject4).xfI.Url);
        ((Intent)localObject1).putExtra("KSta_SourceType", 2);
        ((Intent)localObject1).putExtra("KSta_Scene", j.b.qEU.value);
        ((Intent)localObject1).putExtra("KSta_FromUserName", ((TimeLineObject)localObject4).jBB);
        ((Intent)localObject1).putExtra("KSta_SnSId", ((TimeLineObject)localObject4).Id);
        if (paramView == null)
        {
          localObject2 = new StringBuilder("fakeid_");
          if (paramView == null)
          {
            paramView = ((TimeLineObject)localObject4).Id;
            ((Intent)localObject1).putExtra("KMediaId", paramView);
          }
        }
        while (true)
        {
          paramView = ((TimeLineObject)localObject4).xfN;
          if (paramView != null)
          {
            ((Intent)localObject1).putExtra("KMediaVideoTime", paramView.fiH);
            ((Intent)localObject1).putExtra("StreamWording", paramView.fiJ);
            ((Intent)localObject1).putExtra("StremWebUrl", paramView.fiK);
            ((Intent)localObject1).putExtra("KMediaTitle", paramView.fiI);
            ((Intent)localObject1).putExtra("KStremVideoUrl", paramView.fiG);
            ((Intent)localObject1).putExtra("KThumUrl", paramView.fiL);
            ((Intent)localObject1).putExtra("KSta_StremVideoAduxInfo", paramView.fiM);
            ((Intent)localObject1).putExtra("KSta_StremVideoPublishId", paramView.fiN);
          }
          ((Intent)localObject1).putExtra("KSta_SnsStatExtStr", ((TimeLineObject)localObject4).rjC);
          d.b((Context)localObject3, "sns", ".ui.VideoAdPlayerUI", (Intent)localObject1);
          AppMethodBeat.o(39862);
          break;
          paramView = paramView.Id;
          break label311;
          ((Intent)localObject1).putExtra("KMediaId", paramView.Id);
        }
      }
      if ((((TimeLineObject)localObject2).qNQ != null) && (!bo.isNullOrNil(((TimeLineObject)localObject2).qNQ.uaa)))
      {
        localObject3 = this.rDG;
        paramView = ((TimeLineObject)localObject2).qNQ;
        if ((paramView != null) && (!bo.isNullOrNil(paramView.uaa)))
        {
          localObject4 = com.tencent.mm.plugin.topstory.a.g.a(paramView, 31, ac.adL("discoverRecommendEntry").optString("wording"));
          aa.a(((bc)localObject3).context, (chv)localObject4);
          localObject3 = ((TimeLineObject)localObject2).jBB;
          localObject1 = ((TimeLineObject)localObject2).Id;
          localObject4 = new StringBuffer();
          ((StringBuffer)localObject4).append("isShareClick=1");
          ((StringBuffer)localObject4).append("&relevant_vid=");
          ((StringBuffer)localObject4).append(paramView.uaa);
          ((StringBuffer)localObject4).append("&relevant_pre_searchid=");
          ((StringBuffer)localObject4).append(paramView.uac);
          ((StringBuffer)localObject4).append("&relevant_shared_openid=");
          ((StringBuffer)localObject4).append(paramView.uad);
          ((StringBuffer)localObject4).append("&rec_category=");
          if (paramView.uam <= 0L)
            break label836;
          ((StringBuffer)localObject4).append(paramView.uam);
        }
        while (true)
        {
          ((StringBuffer)localObject4).append("&source=");
          ((StringBuffer)localObject4).append(paramView.source);
          ((StringBuffer)localObject4).append("&fromUser=");
          ((StringBuffer)localObject4).append((String)localObject3);
          ((StringBuffer)localObject4).append("&fromScene=");
          ((StringBuffer)localObject4).append(3);
          ((StringBuffer)localObject4).append("&targetInfo=");
          ((StringBuffer)localObject4).append((String)localObject1);
          ((StringBuffer)localObject4).append("&expand=");
          ((StringBuffer)localObject4).append(paramView.uab);
          ab.i("MicroMsg.TopStory.TopStoryReportApiLogic", "reportTopStoryClickShareItem 15371 %s", new Object[] { ((StringBuffer)localObject4).toString() });
          paramView = new bsj();
          paramView.wUu = ((StringBuffer)localObject4).toString();
          paramView = new w(paramView);
          com.tencent.mm.kernel.g.Rg().a(paramView, 0);
          AppMethodBeat.o(39862);
          break;
          ((StringBuffer)localObject4).append(paramView.uae);
        }
      }
      localObject3 = ((TimeLineObject)localObject2).xfI.Url;
      ab.d("MicroMsg.TimeLineClickEvent", "url:".concat(String.valueOf(localObject3)));
      str = com.tencent.mm.plugin.sns.c.a.gkF.B((String)localObject3, "timeline");
      if ((str != null) && (str.length() != 0))
        break;
      AppMethodBeat.o(39862);
    }
    Intent localIntent = new Intent();
    Object localObject3 = null;
    if (localObject2 != null)
    {
      localObject3 = new Bundle();
      ((Bundle)localObject3).putString("KSnsStrId", ((TimeLineObject)localObject2).Id);
      ((Bundle)localObject3).putString("KSnsLocalId", ((q)localObject1).cwT);
      ((Bundle)localObject3).putBoolean("KFromTimeline", true);
      if ((((TimeLineObject)localObject2).xfI != null) && (((TimeLineObject)localObject2).xfI.wbK.size() > 0))
      {
        ((Bundle)localObject3).putString("K_sns_thumb_url", ((bau)((TimeLineObject)localObject2).xfI.wbK.get(0)).wEH);
        ((Bundle)localObject3).putString("K_sns_raw_url", ((TimeLineObject)localObject2).xfI.Url);
        ab.i("MicroMsg.TimeLineClickEvent", "put the thumb url %s redirectUrl %s", new Object[] { ((bau)((TimeLineObject)localObject2).xfI.wbK.get(0)).wEH, ((TimeLineObject)localObject2).xfI.Url });
      }
    }
    ((Bundle)localObject3).putString("key_snsad_statextstr", ((TimeLineObject)localObject2).rjC);
    localIntent.putExtra("rawUrl", str);
    localIntent.putExtra("shortUrl", str);
    localIntent.putExtra("useJs", true);
    localIntent.putExtra("type", -255);
    if (((TimeLineObject)localObject2).xfJ != null)
    {
      localIntent.putExtra("srcUsername", ((TimeLineObject)localObject2).xfJ);
      localIntent.putExtra("srcDisplayname", ((TimeLineObject)localObject2).vjM);
      ab.i("MicroMsg.TimeLineClickEvent", "urlRedirectListener tlObj.sourceNickName: " + ((TimeLineObject)localObject2).vjM + " tlObj.publicUserName: " + ((TimeLineObject)localObject2).xfJ);
    }
    localIntent.putExtra("sns_local_id", ((q)localObject1).cwT);
    if (localn != null)
    {
      localIntent.putExtra("KPublisherId", "sns_" + com.tencent.mm.plugin.sns.data.i.jV(localn.field_snsId));
      localIntent.putExtra("pre_username", localn.field_userName);
      localIntent.putExtra("prePublishId", "sns_" + com.tencent.mm.plugin.sns.data.i.jV(localn.field_snsId));
      localIntent.putExtra("preUsername", localn.field_userName);
      localIntent.putExtra("share_report_pre_msg_url", str);
      localIntent.putExtra("share_report_pre_msg_title", ((TimeLineObject)localObject2).xfI.Title);
      localIntent.putExtra("share_report_pre_msg_desc", ((TimeLineObject)localObject2).xfI.Desc);
      if ((((TimeLineObject)localObject2).xfI.wbK != null) && (((TimeLineObject)localObject2).xfI.wbK.size() > 0))
        localIntent.putExtra("share_report_pre_msg_icon_url", ((bau)((TimeLineObject)localObject2).xfI.wbK.get(0)).wEH);
      localIntent.putExtra("share_report_pre_msg_appid", "");
      localIntent.putExtra("share_report_from_scene", 1);
    }
    if ((localObject2 != null) && (((TimeLineObject)localObject2).xfH != null))
      localIntent.putExtra("KAppId", ((TimeLineObject)localObject2).xfH.Id);
    if ((localn != null) && (localn.DI(32)))
    {
      if (this.rDG.cvd != 2)
        break label2163;
      localObject4 = localn.cqr();
      label1511: if (localObject4 != null)
        localIntent.putExtra("KsnsViewId", ((com.tencent.mm.plugin.sns.storage.a)localObject4).hnw);
    }
    if ((localn != null) && (localObject2 != null))
    {
      if (this.rDG.cvd != 0)
        break label2173;
      localObject4 = com.tencent.mm.modelsns.b.lY(718);
      label1558: com.tencent.mm.modelsns.b localb = ((com.tencent.mm.modelsns.b)localObject4).tx(com.tencent.mm.plugin.sns.data.i.j(localn)).mb(localn.field_type).cS(localn.DI(32)).tx(localn.crc()).tx(((TimeLineObject)localObject2).xfJ);
      if (((TimeLineObject)localObject2).xfH != null)
        break label2184;
      localObject1 = "";
      label1617: localb.tx((String)localObject1).tx(((TimeLineObject)localObject2).xfI.Url);
      ((com.tencent.mm.modelsns.b)localObject4).ajK();
      if (this.rDG.cvd != 0)
        break label2197;
      localObject4 = com.tencent.mm.modelsns.b.lY(743);
      label1660: localb = ((com.tencent.mm.modelsns.b)localObject4).tx(com.tencent.mm.plugin.sns.data.i.j(localn)).mb(localn.field_type).cS(localn.DI(32)).tx(localn.crc()).tx(((TimeLineObject)localObject2).xfJ);
      if (((TimeLineObject)localObject2).xfH != null)
        break label2208;
      localObject1 = "";
      label1719: localb.tx((String)localObject1).tx(((TimeLineObject)localObject2).xfI.Url);
      if (localObject3 != null)
      {
        localObject4 = ((com.tencent.mm.modelsns.b)localObject4).adk();
        if (localObject4 != null)
          ((Bundle)localObject3).putByteArray("intent_key_StatisticsOplog", (byte[])localObject4);
      }
    }
    if (localObject3 != null)
      localIntent.putExtra("jsapiargs", (Bundle)localObject3);
    localIntent.putExtra("geta8key_scene", 2);
    localIntent.putExtra("from_scence", 3);
    if ((((TimeLineObject)localObject2).xfI.wbN != null) && (((TimeLineObject)localObject2).xfI.wbN.vGc != -1))
      localIntent.putExtra(e.m.ygo, ((TimeLineObject)localObject2).xfI.wbN.vGc);
    int i;
    int j;
    if ((!bo.isNullOrNil(((TimeLineObject)localObject2).rCK)) && (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.i.YO(((TimeLineObject)localObject2).rCK)) && (localn != null))
    {
      localObject3 = new int[2];
      if (paramView != null)
        paramView.getLocationInWindow((int[])localObject3);
      i = paramView.getWidth();
      j = paramView.getHeight();
      paramView = new Intent();
      paramView.putExtra("img_gallery_left", localObject3[0]);
      paramView.putExtra("img_gallery_top", localObject3[1]);
      paramView.putExtra("img_gallery_width", i);
      paramView.putExtra("img_gallery_height", j);
      if (localObject2 != null)
      {
        localObject3 = ((TimeLineObject)localObject2).xfI.wbK;
        if (((List)localObject3).size() > 0)
          paramView.putExtra("sns_landing_pages_share_thumb_url", ((bau)((List)localObject3).get(0)).wEH);
      }
      paramView.putExtra("sns_landing_pages_share_sns_id", localn.cqA());
      paramView.putExtra("sns_landing_pages_rawSnsId", localn.cqu().Id);
      paramView.putExtra("sns_landing_pages_aid", localn.cqZ());
      paramView.putExtra("sns_landing_pages_traceid", localn.cra());
      paramView.putExtra("sns_landing_pages_ux_info", localn.crc());
      if (this.rDG.cvd == 0);
      for (i = 3; ; i = 4)
      {
        paramView.putExtra("sns_landig_pages_from_source", i);
        paramView.setClass(this.rDG.context, SnsAdNativeLandingPagesUI.class);
        paramView.putExtra("sns_landing_pages_xml", ((TimeLineObject)localObject2).rCK);
        paramView.putExtra("sns_landing_pages_rec_src", localn.cre());
        paramView.putExtra("sns_landing_pages_xml_prefix", "adxml");
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.i.y(paramView, this.rDG.context);
        AppMethodBeat.o(39862);
        break;
        label2163: localObject4 = localn.cqq();
        break label1511;
        label2173: localObject4 = com.tencent.mm.modelsns.b.lZ(718);
        break label1558;
        label2184: localObject1 = ((TimeLineObject)localObject2).xfH.Id;
        break label1617;
        label2197: localObject4 = com.tencent.mm.modelsns.b.lZ(743);
        break label1660;
        label2208: localObject1 = ((TimeLineObject)localObject2).xfH.Id;
        break label1719;
      }
    }
    localIntent.addFlags(536870912);
    if (((TimeLineObject)localObject2).xfI.wbN != null)
    {
      i = ((TimeLineObject)localObject2).xfI.wbN.vGc;
      label2260: j = this.rDG.rhQ.bFf();
      if ((((TimeLineObject)localObject2).xfI.wbN == null) || (i != 5) || (((TimeLineObject)localObject2).xfI.wbN.fgb != 1) || (!((com.tencent.mm.plugin.brandservice.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.brandservice.a.b.class)).aVP()))
        break label2974;
      localIntent.putExtra("biz_video_title", ((TimeLineObject)localObject2).xfI.Title);
      localIntent.putExtra("biz_video_vid", ((TimeLineObject)localObject2).xfI.wbN.fgd);
      localIntent.putExtra("biz_video_func_flag", ((TimeLineObject)localObject2).xfI.wbN.fgc);
      localIntent.putExtra("biz_video_desc", ((TimeLineObject)localObject2).xfI.wbN.desc);
      if (bo.isNullOrNil(((TimeLineObject)localObject2).xfI.wbN.lvx))
        break label2954;
      localIntent.putExtra("biz_video_icon_url", ((TimeLineObject)localObject2).xfI.wbN.lvx);
      label2437: localIntent.putExtra("biz_video_item_show_type", ((TimeLineObject)localObject2).xfI.wbN.vGc);
      localIntent.putExtra("biz_video_pub_time", ((TimeLineObject)localObject2).xfI.wbN.fga);
      localIntent.putExtra("biz_video_duration", ((TimeLineObject)localObject2).xfI.wbN.duration);
      localIntent.putExtra("biz_video_width", ((TimeLineObject)localObject2).xfI.wbN.videoWidth);
      localIntent.putExtra("biz_video_height", ((TimeLineObject)localObject2).xfI.wbN.videoHeight);
      localIntent.putExtra("biz_video_scene", 2);
      localIntent.putExtra("biz_video_subscene", j);
      localObject3 = new int[2];
      paramView = paramView.findViewById(2131825687);
      if (paramView != null)
      {
        j = paramView.getWidth();
        i = paramView.getHeight();
        paramView.getLocationInWindow((int[])localObject3);
        localIntent.putExtra("img_gallery_width", j).putExtra("img_gallery_height", i).putExtra("img_gallery_left", localObject3[0]).putExtra("img_gallery_top", localObject3[1]);
      }
      d.b(this.rDG.context, "brandservice", ".ui.timeline.video.BizVideoDetailUI", localIntent);
      label2651: localObject3 = null;
      j = 0;
      i = j;
      paramView = (View)localObject3;
      if (localObject2 != null)
      {
        i = j;
        paramView = (View)localObject3;
        if (((TimeLineObject)localObject2).xfH != null)
        {
          paramView = ((TimeLineObject)localObject2).xfH.Id;
          i = bo.getInt(((TimeLineObject)localObject2).xfH.jCh, 0);
        }
      }
      localObject1 = com.tencent.mm.plugin.sns.c.a.gkF.t(paramView, i);
      if (!bo.isNullOrNil((String)localObject1))
      {
        localObject4 = null;
        localObject3 = localObject4;
        if (localObject2 != null)
        {
          localObject3 = localObject4;
          if (((TimeLineObject)localObject2).qNO != null)
          {
            localObject3 = localObject4;
            if (((TimeLineObject)localObject2).qNO.vCy != null)
              localObject3 = ((TimeLineObject)localObject2).qNO.vCy.vCs;
          }
        }
        if (localObject2 != null)
          break label3057;
        localObject4 = null;
        label2788: com.tencent.mm.plugin.sns.c.a.gkF.a(this.rDG.context, paramView, (String)localObject1, (String)localObject4, 5, 4, 1, (String)localObject3, ((TimeLineObject)localObject2).Id);
      }
      h.pYm.e(11105, new Object[] { ((TimeLineObject)localObject2).jBB, ((TimeLineObject)localObject2).xfI.Url });
      if ((localn != null) && (localn.field_type == 4))
      {
        paramView = (bau)((TimeLineObject)localObject2).xfI.wbK.get(0);
        localObject3 = h.pYm;
        if (paramView != null)
          break label3067;
      }
    }
    label2954: label2974: label3057: label3067: for (paramView = ""; ; paramView = paramView.Desc)
    {
      ((h)localObject3).e(13043, new Object[] { Integer.valueOf(1), paramView, ((TimeLineObject)localObject2).xfH.Id });
      label2940: AppMethodBeat.o(39862);
      break;
      i = -1;
      break label2260;
      localIntent.putExtra("biz_video_icon_url", localIntent.getStringExtra("share_report_pre_msg_icon_url"));
      break label2437;
      if ((((com.tencent.mm.plugin.brandservice.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.brandservice.a.b.class)).rW(4)) && (((com.tencent.mm.plugin.brandservice.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.brandservice.a.b.class)).a(this.rDG.context, str, i, 2, j, localIntent)))
      {
        ab.i("MicroMsg.TimeLineClickEvent", "jump to TmplWebview");
        break label2651;
      }
      com.tencent.mm.plugin.sns.c.a.gkE.i(localIntent, this.rDG.context);
      break label2651;
      localObject4 = ((TimeLineObject)localObject2).jBB;
      break label2788;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.bc.1
 * JD-Core Version:    0.6.2
 */