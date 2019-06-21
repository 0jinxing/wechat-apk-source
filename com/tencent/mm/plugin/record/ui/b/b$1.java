package com.tencent.mm.plugin.record.ui.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.record.b.n;
import com.tencent.mm.plugin.record.ui.RecordMsgDetailUI;
import com.tencent.mm.plugin.record.ui.RecordMsgFileUI;
import com.tencent.mm.protocal.protobuf.aap;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.aas;
import com.tencent.mm.protocal.protobuf.aat;
import com.tencent.mm.protocal.protobuf.aay;
import com.tencent.mm.protocal.protobuf.abe;
import com.tencent.mm.protocal.protobuf.abo;
import com.tencent.mm.protocal.protobuf.abu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi.a;

final class b$1
  implements View.OnClickListener
{
  b$1(b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(24350);
    Object localObject1 = (com.tencent.mm.plugin.record.ui.a.b)paramView.getTag();
    Object localObject2;
    Object localObject3;
    label322: Object localObject4;
    Context localContext;
    switch (((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.dataType)
    {
    case 9:
    case 12:
    case 13:
    case 18:
    default:
      AppMethodBeat.o(24350);
    case 5:
    case 4:
    case 15:
      while (true)
      {
        return;
        localObject2 = paramView.getContext();
        if (((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.wgT == null)
        {
          ab.w("MicroMsg.OtherViewWrapper", "go to web page error, get data proto item null, dataid[%s]", new Object[] { ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.mnd });
          com.tencent.mm.ui.base.h.bQ((Context)localObject2, ((Context)localObject2).getString(2131299711));
          AppMethodBeat.o(24350);
        }
        else
        {
          paramView = ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv;
          if (paramView != null)
            if (paramView.whe)
              paramView = paramView.canvasPageXml;
          while (true)
          {
            if (bo.isNullOrNil(paramView))
              break label322;
            localObject3 = new Intent();
            ((Intent)localObject3).putExtra("sns_landing_pages_xml", paramView);
            ((Intent)localObject3).putExtra("sns_landig_pages_from_source", 5);
            ((Intent)localObject3).putExtra("sns_landing_pages_share_thumb_url", ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.fgE);
            ((Intent)localObject3).addFlags(268435456);
            ((Intent)localObject3).putExtra("msg_id", ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cvx);
            com.tencent.mm.bp.d.b((Context)localObject2, "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", (Intent)localObject3, 1);
            AppMethodBeat.o(24350);
            break;
            if ((paramView.wgT != null) && (paramView.wgT.whA != null) && (paramView.wgT.whA.whe))
              paramView = paramView.wgT.whA.canvasPageXml;
            else
              paramView = null;
          }
          localObject4 = ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.wgT.whw;
          localObject3 = "";
          if (((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.wgT.whA != null)
            localObject3 = ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.wgT.whA.wiY;
          paramView = (View)localObject3;
          if (localObject4 != null)
          {
            paramView = (View)localObject3;
            if (bo.isNullOrNil((String)localObject3))
              paramView = ((aat)localObject4).link;
          }
          localObject3 = paramView;
          if (bo.isNullOrNil(paramView))
            localObject3 = ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.wgg;
          if (bo.isNullOrNil((String)localObject3))
          {
            ab.w("MicroMsg.OtherViewWrapper", "go to web page error, url null, dataid[%s]", new Object[] { ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.mnd });
            com.tencent.mm.ui.base.h.bQ((Context)localObject2, ((Context)localObject2).getString(2131299711));
            AppMethodBeat.o(24350);
          }
          else
          {
            paramView = new Intent();
            paramView.putExtra("rawUrl", (String)localObject3);
            if ((localObject4 != null) && (!bo.isNullOrNil(((aat)localObject4).csl)))
              paramView.putExtra("srcDisplayname", s.mJ(((aat)localObject4).csl));
            paramView.putExtra("mode", 1);
            b.A((Context)localObject2, paramView);
            if (((com.tencent.mm.plugin.record.ui.a.b)localObject1).dataType == 1)
            {
              paramView.putExtra("is_favorite_item", true);
              paramView.putExtra("fav_local_id", ((com.tencent.mm.plugin.record.ui.a.b)localObject1).mnW.field_localId);
              paramView.putExtra("key_detail_can_delete", false);
              paramView.putExtra("geta8key_scene", 14);
              paramView.putExtra("from_scence", 4);
              localObject3 = com.tencent.mm.modelstat.a.c.tL(com.tencent.mm.pluginsdk.model.d.class.getName());
              ((Bundle)localObject3).putInt("mm_rpt_fav_id", ((com.tencent.mm.plugin.record.ui.a.b)localObject1).mnW.field_id);
              paramView.putExtra("mm_report_bundle", (Bundle)localObject3);
            }
            localObject3 = new Bundle();
            ((Bundle)localObject3).putString("key_snsad_statextstr", ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.cMn);
            paramView.putExtra("jsapiargs", (Bundle)localObject3);
            com.tencent.mm.bp.d.b((Context)localObject2, "webview", ".ui.tools.WebViewUI", paramView, 1);
            AppMethodBeat.o(24350);
            continue;
            localContext = paramView.getContext();
            if (((bo.isNullOrNil(((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.wfZ)) && (bo.isNullOrNil(((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.whr))) || (((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.wgu <= 0L))
            {
              ab.w("MicroMsg.OtherViewWrapper", "full md5[%s], fullsize[%d], start use url", new Object[] { ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.wgq, Long.valueOf(((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.wgu) });
              localObject3 = ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.wgg;
              paramView = (View)localObject3;
              if (bo.isNullOrNil((String)localObject3))
                paramView = ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.wgk;
              if (bo.isNullOrNil(paramView))
              {
                ab.w("MicroMsg.OtherViewWrapper", "go to video[webpage] error, url null, dataid[%s]", new Object[] { ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.mnd });
                if ((((com.tencent.mm.plugin.record.ui.a.b)localObject1).dataType == 1) && (((com.tencent.mm.plugin.record.ui.a.b)localObject1).mnW.field_itemStatus != 10) && (((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.whh == 0))
                {
                  paramView = new Intent();
                  paramView.putExtra("key_detail_info_id", ((com.tencent.mm.plugin.record.ui.a.b)localObject1).mnW.field_localId);
                  paramView.putExtra("key_detail_data_id", ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.mnd);
                  if (com.tencent.mm.plugin.record.b.g.c((com.tencent.mm.plugin.record.ui.a.b)localObject1))
                  {
                    b.a(paramView, (com.tencent.mm.plugin.record.ui.a.b)localObject1, localContext, com.tencent.mm.plugin.record.b.g.a((com.tencent.mm.plugin.record.ui.a.b)localObject1), com.tencent.mm.plugin.record.b.g.b((com.tencent.mm.plugin.record.ui.a.b)localObject1));
                    AppMethodBeat.o(24350);
                  }
                  else
                  {
                    com.tencent.mm.plugin.fav.a.b.a(localContext, ".ui.detail.FavoriteFileDetailUI", paramView, 1);
                    AppMethodBeat.o(24350);
                  }
                }
                else
                {
                  Intent localIntent = new Intent();
                  localObject3 = "";
                  paramView = "";
                  if (((com.tencent.mm.plugin.record.ui.a.b)localObject1).dataType == 0)
                  {
                    localObject2 = n.f(((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv, ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cvx);
                    if ((bo.isNullOrNil((String)localObject2)) || (!com.tencent.mm.a.e.ct((String)localObject2)))
                    {
                      com.tencent.mm.ui.base.h.bQ(localContext, localContext.getString(2131299712));
                      AppMethodBeat.o(24350);
                    }
                    else
                    {
                      localObject4 = n.c(((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv, ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cvx);
                      if (!bo.isNullOrNil((String)localObject4))
                      {
                        paramView = (View)localObject2;
                        localObject3 = localObject4;
                        if (com.tencent.mm.a.e.ct((String)localObject4));
                      }
                      else
                      {
                        localIntent.putExtra("key_detail_data_valid", false);
                        localObject3 = localObject4;
                        paramView = (View)localObject2;
                      }
                    }
                  }
                  else
                  {
                    while (true)
                    {
                      b.a(localIntent, (com.tencent.mm.plugin.record.ui.a.b)localObject1, localContext, (String)localObject3, paramView);
                      AppMethodBeat.o(24350);
                      break;
                      if (((com.tencent.mm.plugin.record.ui.a.b)localObject1).dataType == 1)
                      {
                        localObject4 = com.tencent.mm.plugin.record.b.g.b((com.tencent.mm.plugin.record.ui.a.b)localObject1);
                        if ((bo.isNullOrNil((String)localObject4)) || (!com.tencent.mm.a.e.ct((String)localObject4)))
                        {
                          com.tencent.mm.ui.base.h.bQ(localContext, localContext.getString(2131299712));
                          AppMethodBeat.o(24350);
                          break;
                        }
                        localObject2 = com.tencent.mm.plugin.record.b.g.a((com.tencent.mm.plugin.record.ui.a.b)localObject1);
                        if (!bo.isNullOrNil((String)localObject2))
                        {
                          paramView = (View)localObject4;
                          localObject3 = localObject2;
                          if (com.tencent.mm.a.e.ct((String)localObject2));
                        }
                        else
                        {
                          localIntent.putExtra("key_detail_data_valid", false);
                          paramView = (View)localObject4;
                          localObject3 = localObject2;
                        }
                      }
                    }
                  }
                }
              }
              else
              {
                localObject3 = new Intent();
                ((Intent)localObject3).putExtra("rawUrl", paramView);
                if (((com.tencent.mm.plugin.record.ui.a.b)localObject1).dataType == 1)
                {
                  ((Intent)localObject3).putExtra("is_favorite_item", true);
                  ((Intent)localObject3).putExtra("fav_local_id", ((com.tencent.mm.plugin.record.ui.a.b)localObject1).mnW.field_localId);
                  ((Intent)localObject3).putExtra("key_detail_can_delete", false);
                  ((Intent)localObject3).putExtra("geta8key_scene", 14);
                  paramView = com.tencent.mm.modelstat.a.c.tL(com.tencent.mm.pluginsdk.model.d.class.getName());
                  paramView.putInt("mm_rpt_fav_id", ((com.tencent.mm.plugin.record.ui.a.b)localObject1).mnW.field_id);
                  ((Intent)localObject3).putExtra("mm_report_bundle", paramView);
                  ab.d("MicroMsg.OtherViewWrapper", "go to video, fav id %d, fav local id %d, data id %s", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.record.ui.a.b)localObject1).mnW.field_id), Long.valueOf(((com.tencent.mm.plugin.record.ui.a.b)localObject1).mnW.field_localId), ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.mnd });
                }
                com.tencent.mm.bp.d.b(localContext, "webview", ".ui.tools.WebViewUI", (Intent)localObject3, 1);
                AppMethodBeat.o(24350);
              }
            }
            else if (((com.tencent.mm.plugin.record.ui.a.b)localObject1).dataType == 0)
            {
              paramView = new Intent();
              paramView.putExtra("message_id", ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cvx);
              paramView.putExtra("record_xml", ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cKa);
              paramView.putExtra("record_data_id", ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.mnd);
              paramView.putExtra("key_detail_fav_video_scene_from", 1);
              if (n.d(((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv, ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cvx))
              {
                b.a(paramView, (com.tencent.mm.plugin.record.ui.a.b)localObject1, localContext, n.c(((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv, ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cvx), n.f(((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv, ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cvx));
                AppMethodBeat.o(24350);
              }
              else
              {
                com.tencent.mm.bp.d.b(localContext, "record", ".ui.RecordMsgFileUI", paramView, 1);
                AppMethodBeat.o(24350);
              }
            }
            else if (((com.tencent.mm.plugin.record.ui.a.b)localObject1).dataType == 1)
            {
              paramView = new Intent();
              paramView.putExtra("key_detail_info_id", ((com.tencent.mm.plugin.record.ui.a.b)localObject1).mnW.field_localId);
              paramView.putExtra("key_detail_data_id", ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.mnd);
              if (com.tencent.mm.plugin.record.b.g.c((com.tencent.mm.plugin.record.ui.a.b)localObject1))
              {
                b.a(paramView, (com.tencent.mm.plugin.record.ui.a.b)localObject1, localContext, com.tencent.mm.plugin.record.b.g.a((com.tencent.mm.plugin.record.ui.a.b)localObject1), com.tencent.mm.plugin.record.b.g.b((com.tencent.mm.plugin.record.ui.a.b)localObject1));
                AppMethodBeat.o(24350);
              }
              else
              {
                com.tencent.mm.plugin.fav.a.b.a(localContext, ".ui.detail.FavoriteFileDetailUI", paramView, 1);
              }
            }
            else
            {
              AppMethodBeat.o(24350);
            }
          }
        }
      }
    case 6:
      localContext = paramView.getContext();
      if (localContext != null)
      {
        if (((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.wgT == null)
          break label3766;
        localObject3 = ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.wgT.why;
        localObject2 = ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.wgT.whw;
      }
      break;
    case 7:
    case 8:
    case 10:
    case 11:
    case 14:
    case 16:
    case 17:
    case 19:
    }
    while (true)
    {
      if (localObject2 != null)
        if (!bo.isNullOrNil(((aat)localObject2).whU))
          paramView = s.mJ(((aat)localObject2).whU);
      while (true)
      {
        localObject4 = paramView;
        if (localObject2 == null)
        {
          localObject4 = paramView;
          if (((com.tencent.mm.plugin.record.ui.a.b)localObject1).dataType == 1)
            localObject4 = s.mJ(((com.tencent.mm.plugin.record.ui.a.b)localObject1).mnW.field_fromUser);
        }
        if (localObject3 == null)
        {
          ab.w("MicroMsg.OtherViewWrapper", "go to location error, locItem null, dataid[%s]", new Object[] { ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.mnd });
          com.tencent.mm.ui.base.h.bQ(localContext, localContext.getString(2131299703));
          AppMethodBeat.o(24350);
          break;
          paramView = s.mJ(((aat)localObject2).cEV);
          continue;
        }
        paramView = new Intent();
        paramView.putExtra("kwebmap_slat", ((aay)localObject3).lat);
        paramView.putExtra("kwebmap_lng", ((aay)localObject3).lng);
        paramView.putExtra("kPoiName", ((aay)localObject3).cIK);
        paramView.putExtra("Kwebmap_locaion", ((aay)localObject3).label);
        if (((aay)localObject3).cED >= 0)
          paramView.putExtra("kwebmap_scale", ((aay)localObject3).cED);
        paramView.putExtra("kisUsername", (String)localObject4);
        paramView.putExtra("kwebmap_from_to", true);
        if (((com.tencent.mm.plugin.record.ui.a.b)localObject1).dataType == 1)
        {
          paramView.putExtra("KFavLocSigleView", true);
          paramView.putExtra("map_view_type", 2);
          paramView.putExtra("kFavInfoLocalId", ((com.tencent.mm.plugin.record.ui.a.b)localObject1).mnW.field_localId);
          paramView.putExtra("kFavCanDel", false);
          paramView.putExtra("kFavCanRemark", false);
          com.tencent.mm.bp.d.b(localContext, "location", ".ui.RedirectUI", paramView, 1);
          AppMethodBeat.o(24350);
          break;
        }
        if (((com.tencent.mm.plugin.record.ui.a.b)localObject1).dataType == 0)
        {
          paramView.putExtra("map_view_type", 1);
          com.tencent.mm.bp.d.b(localContext, "location", ".ui.RedirectUI", paramView, 1002);
        }
        AppMethodBeat.o(24350);
        break;
        localObject3 = paramView.getContext();
        paramView = new Intent();
        if (bo.isNullOrNil(((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.wgg))
        {
          ab.w("MicroMsg.OtherViewWrapper", "go to music[webpage], web url is null, use data url instead, dataid[%s]", new Object[] { ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.mnd });
          paramView.putExtra("rawUrl", ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.wgi);
        }
        while (true)
        {
          if (((com.tencent.mm.plugin.record.ui.a.b)localObject1).dataType == 1)
          {
            paramView.putExtra("is_favorite_item", true);
            paramView.putExtra("fav_local_id", ((com.tencent.mm.plugin.record.ui.a.b)localObject1).mnW.field_localId);
            paramView.putExtra("key_detail_can_delete", false);
            localObject2 = com.tencent.mm.modelstat.a.c.tL(com.tencent.mm.pluginsdk.model.d.class.getName());
            ((Bundle)localObject2).putInt("mm_rpt_fav_id", ((com.tencent.mm.plugin.record.ui.a.b)localObject1).mnW.field_id);
            paramView.putExtra("mm_report_bundle", (Bundle)localObject2);
            ab.d("MicroMsg.OtherViewWrapper", "start music webview, fav id %d, fav local id %d, data id %s", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.record.ui.a.b)localObject1).mnW.field_id), Long.valueOf(((com.tencent.mm.plugin.record.ui.a.b)localObject1).mnW.field_localId), ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.mnd });
          }
          com.tencent.mm.bp.d.b((Context)localObject3, "webview", ".ui.tools.WebViewUI", paramView, 1);
          AppMethodBeat.o(24350);
          break;
          paramView.putExtra("rawUrl", ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.wgg);
        }
        paramView = paramView.getContext();
        int i;
        if (((com.tencent.mm.plugin.record.ui.a.b)localObject1).dataType == 0)
        {
          if ((!n.d(((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv, ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cvx)) || (com.tencent.mm.pluginsdk.ui.tools.a.M(n.c(((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv, ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cvx), ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.wgo, 2)))
            break label2324;
          i = 0;
        }
        while (true)
          if (i != 0)
          {
            if (((com.tencent.mm.plugin.record.ui.a.b)localObject1).dataType == 0)
            {
              localObject3 = new Intent(paramView, RecordMsgFileUI.class);
              ((Intent)localObject3).putExtra("message_id", ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cvx);
              ((Intent)localObject3).putExtra("record_xml", ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cKa);
              ((Intent)localObject3).putExtra("record_data_id", ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.mnd);
              paramView.startActivity((Intent)localObject3);
              AppMethodBeat.o(24350);
              break;
              if ((((com.tencent.mm.plugin.record.ui.a.b)localObject1).dataType == 1) && (com.tencent.mm.plugin.record.b.g.c((com.tencent.mm.plugin.record.ui.a.b)localObject1)) && (!com.tencent.mm.pluginsdk.ui.tools.a.M(com.tencent.mm.plugin.record.b.g.a((com.tencent.mm.plugin.record.ui.a.b)localObject1), ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.wgo, 2)))
              {
                i = 0;
                continue;
              }
              label2324: i = 1;
              continue;
            }
            if (((com.tencent.mm.plugin.record.ui.a.b)localObject1).dataType == 1)
            {
              if (n.h(((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv, ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cvx))
              {
                localObject3 = new Intent();
                ((Intent)localObject3).putExtra("key_detail_info_id", ((com.tencent.mm.plugin.record.ui.a.b)localObject1).mnW.field_localId);
                com.tencent.mm.plugin.fav.a.b.a(paramView, ".ui.detail.FavoriteImgDetailUI", (Intent)localObject3, 1);
                AppMethodBeat.o(24350);
                break;
              }
              localObject3 = new Intent();
              ((Intent)localObject3).putExtra("key_detail_info_id", ((com.tencent.mm.plugin.record.ui.a.b)localObject1).mnW.field_localId);
              ((Intent)localObject3).putExtra("key_detail_data_id", ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.mnd);
              ((Intent)localObject3).putExtra("key_detail_can_delete", false);
              com.tencent.mm.plugin.fav.a.b.a(paramView, ".ui.detail.FavoriteFileDetailUI", (Intent)localObject3, 1);
            }
          }
        AppMethodBeat.o(24350);
        break;
        localObject3 = paramView.getContext();
        if ((((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.wgT == null) || (((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.wgT.whC == null))
        {
          ab.w("MicroMsg.OtherViewWrapper", "go to product error, get data proto item null, dataid[%s]", new Object[] { ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.mnd });
          com.tencent.mm.ui.base.h.bQ((Context)localObject3, ((Context)localObject3).getString(2131299702));
          AppMethodBeat.o(24350);
          break;
        }
        paramView = new Intent();
        paramView.putExtra("key_Product_xml", ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.wgT.whC.info);
        if (((com.tencent.mm.plugin.record.ui.a.b)localObject1).dataType == 1)
        {
          paramView.putExtra("key_is_favorite_item", true);
          paramView.putExtra("key_favorite_local_id", ((com.tencent.mm.plugin.record.ui.a.b)localObject1).mnW.field_localId);
          paramView.putExtra("key_can_delete_favorite_item", false);
          paramView.putExtra("key_ProductUI_getProductInfoScene", 3);
        }
        com.tencent.mm.bp.d.b((Context)localObject3, "scanner", ".ui.ProductUI", paramView, 1);
        AppMethodBeat.o(24350);
        break;
        paramView = paramView.getContext();
        if ((((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.wgT == null) || (((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.wgT.whC == null))
        {
          ab.w("MicroMsg.OtherViewWrapper", "go to mall product error, get data proto item null, dataid[%s]", new Object[] { ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.mnd });
          com.tencent.mm.ui.base.h.bQ(paramView, paramView.getString(2131299702));
          AppMethodBeat.o(24350);
          break;
        }
        localObject3 = new Intent();
        ((Intent)localObject3).putExtra("key_product_info", ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.wgT.whC.info);
        if (((com.tencent.mm.plugin.record.ui.a.b)localObject1).dataType == 1)
          ((Intent)localObject3).putExtra("key_product_scene", 4);
        com.tencent.mm.bp.d.b(paramView, "product", ".ui.MallProductUI", (Intent)localObject3, 1);
        AppMethodBeat.o(24350);
        break;
        localObject3 = paramView.getContext();
        if ((((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.wgT == null) || (((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.wgT.whE == null))
        {
          ab.w("MicroMsg.OtherViewWrapper", "go to tv error, get data proto item null, dataid[%s]", new Object[] { ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.mnd });
          com.tencent.mm.ui.base.h.bQ((Context)localObject3, ((Context)localObject3).getString(2131299702));
          AppMethodBeat.o(24350);
          break;
        }
        paramView = new Intent();
        paramView.putExtra("key_TV_getProductInfoScene", 3);
        paramView.putExtra("key_TV_xml", ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.wgT.whE.info);
        if (((com.tencent.mm.plugin.record.ui.a.b)localObject1).dataType == 1)
        {
          paramView.putExtra("key_is_favorite_item", true);
          paramView.putExtra("key_favorite_local_id", ((com.tencent.mm.plugin.record.ui.a.b)localObject1).mnW.field_localId);
          paramView.putExtra("key_can_delete_favorite_item", false);
        }
        com.tencent.mm.bp.d.b((Context)localObject3, "shake", ".ui.TVInfoUI", paramView, 1);
        AppMethodBeat.o(24350);
        break;
        paramView = paramView.getContext();
        if (((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.wgT == null)
        {
          ab.w("MicroMsg.OtherViewWrapper", "go to friend card error, get data proto item null, dataid[%s]", new Object[] { ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.mnd });
          com.tencent.mm.ui.base.h.bQ(paramView, paramView.getString(2131299702));
          AppMethodBeat.o(24350);
          break;
        }
        localObject2 = ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.desc;
        aw.ZK();
        localObject3 = com.tencent.mm.model.c.XO().Rn((String)localObject2);
        if (localObject3 == null)
        {
          ab.w("MicroMsg.OtherViewWrapper", "go to friend card error, parse content fail,[%s], dataid[%s]", new Object[] { localObject2, ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.mnd });
          com.tencent.mm.ui.base.h.bQ(paramView, paramView.getString(2131299702));
          AppMethodBeat.o(24350);
          break;
        }
        localObject2 = new Intent();
        ((Intent)localObject2).putExtra("Contact_User", ((bi.a)localObject3).svN);
        ((Intent)localObject2).putExtra("Contact_Alias", ((bi.a)localObject3).dFl);
        ((Intent)localObject2).putExtra("Contact_Nick", ((bi.a)localObject3).nickname);
        ((Intent)localObject2).putExtra("Contact_QuanPin", ((bi.a)localObject3).gwG);
        ((Intent)localObject2).putExtra("Contact_PyInitial", ((bi.a)localObject3).gwF);
        ((Intent)localObject2).putExtra("Contact_Uin", ((bi.a)localObject3).pnz);
        ((Intent)localObject2).putExtra("Contact_Mobile_MD5", ((bi.a)localObject3).xZi);
        ((Intent)localObject2).putExtra("Contact_full_Mobile_MD5", ((bi.a)localObject3).xZj);
        ((Intent)localObject2).putExtra("Contact_QQNick", ((bi.a)localObject3).dtZ());
        ((Intent)localObject2).putExtra("User_From_Fmessage", false);
        ((Intent)localObject2).putExtra("Contact_Scene", ((bi.a)localObject3).scene);
        ((Intent)localObject2).putExtra("Contact_FMessageCard", true);
        ((Intent)localObject2).putExtra("Contact_RemarkName", ((bi.a)localObject3).gwK);
        ((Intent)localObject2).putExtra("Contact_VUser_Info_Flag", ((bi.a)localObject3).ufB);
        ((Intent)localObject2).putExtra("Contact_VUser_Info", ((bi.a)localObject3).duh);
        ((Intent)localObject2).putExtra("Contact_BrandIconURL", ((bi.a)localObject3).pln);
        ((Intent)localObject2).putExtra("Contact_Province", ((bi.a)localObject3).getProvince());
        ((Intent)localObject2).putExtra("Contact_City", ((bi.a)localObject3).getCity());
        ((Intent)localObject2).putExtra("Contact_Sex", ((bi.a)localObject3).dtS);
        ((Intent)localObject2).putExtra("Contact_Signature", ((bi.a)localObject3).signature);
        ((Intent)localObject2).putExtra("Contact_ShowUserName", false);
        ((Intent)localObject2).putExtra("Contact_KSnsIFlag", 0);
        b.A(paramView, (Intent)localObject2);
        com.tencent.mm.bp.d.b(paramView, "profile", ".ui.ContactInfoUI", (Intent)localObject2, 1);
        com.tencent.mm.bq.a.Lu(((bi.a)localObject3).scene);
        AppMethodBeat.o(24350);
        break;
        localObject3 = paramView.getContext();
        if (localObject3 != null)
        {
          if ((((com.tencent.mm.plugin.record.ui.a.b)localObject1).dataType == 0) && (((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.whj != null))
          {
            paramView = new Intent((Context)localObject3, RecordMsgDetailUI.class);
            paramView.putExtra("message_id", ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cvx);
            paramView.putExtra("record_xml", ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.whj);
            b.A((Context)localObject3, paramView);
            ((Context)localObject3).startActivity(paramView);
          }
          AppMethodBeat.o(24350);
          break;
          localObject2 = paramView.getContext();
          if (localObject2 != null)
          {
            paramView = ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.wgT;
            if (paramView != null)
            {
              localObject4 = paramView.whN;
              if (localObject4 != null)
              {
                localObject1 = new AppBrandStatObject();
                ((AppBrandStatObject)localObject1).scene = 1096;
                if (paramView.whw != null)
                  ((AppBrandStatObject)localObject1).cst = paramView.whw.cEV;
                i = -1;
                if (!(localObject2 instanceof Activity))
                  break label3753;
                localObject3 = ((Activity)localObject2).getIntent();
                if (localObject3 == null)
                  break label3753;
                i = ((Intent)localObject3).getIntExtra("preChatTYPE", 2);
                paramView = ((Intent)localObject3).getStringExtra("preUsername");
                localObject3 = ((Intent)localObject3).getStringExtra("preChatName");
              }
            }
          }
        }
        while (true)
        {
          switch (i)
          {
          default:
            i = 0;
          case 2:
          case 1:
          case 15:
          }
          while (true)
          {
            ((AppBrandStatObject)localObject1).cOq = i;
            ((AppBrandStatObject)localObject1).cOr = String.format("%s:%s", new Object[] { paramView, localObject3 });
            ((com.tencent.mm.plugin.appbrand.service.e)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.service.e.class)).a((Context)localObject2, ((aap)localObject4).username, ((aap)localObject4).appId, ((aap)localObject4).cBc, -1, ((aap)localObject4).csu, (AppBrandStatObject)localObject1);
            AppMethodBeat.o(24350);
            break;
            i = 2;
            continue;
            i = 1;
            continue;
            i = 5;
          }
          AppMethodBeat.o(24350);
          break;
          label3753: localObject3 = null;
          paramView = null;
        }
        paramView = null;
      }
      label3766: localObject2 = null;
      localObject3 = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.b.b.1
 * JD-Core Version:    0.6.2
 */