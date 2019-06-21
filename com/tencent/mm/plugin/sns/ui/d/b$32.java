package com.tencent.mm.plugin.sns.ui.d;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.modelsns.SnsAdClick;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.plugin.sns.storage.e;
import com.tencent.mm.plugin.sns.storage.h;
import com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI;
import com.tencent.mm.plugin.sns.ui.TagImageView;
import com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMImageView;
import java.util.List;

final class b$32
  implements View.OnClickListener
{
  b$32(b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    int i = 2;
    boolean bool1 = false;
    AppMethodBeat.i(40289);
    Object localObject1 = paramView.getTag();
    com.tencent.mm.plugin.sns.storage.n localn = null;
    Object localObject2;
    if ((localObject1 instanceof BaseTimeLineItem.BaseViewHolder))
    {
      localObject1 = (BaseTimeLineItem.BaseViewHolder)paramView.getTag();
      localn = h.YS(((BaseTimeLineItem.BaseViewHolder)localObject1).cFc);
      localObject2 = ((BaseTimeLineItem.BaseViewHolder)localObject1).rHF;
      localObject1 = null;
    }
    while (true)
    {
      Object localObject3;
      Object localObject4;
      label196: label364: boolean bool2;
      if (localn != null)
      {
        localObject3 = localn.crd();
        int j = ((e)localObject3).getSource();
        if ((localn != null) && (localn.DI(32)))
        {
          localObject4 = b.a(this.rKt, localn);
          int k;
          int m;
          if ((localn.cqo().coK()) && (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.i.YO(localn.crd().field_adxml)))
          {
            localObject4 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.i.y(localn);
            if (!bo.isNullOrNil((String)localObject4))
              ((e)localObject3).field_adxml = ((String)localObject4);
            localObject3 = new int[2];
            paramView.getLocationInWindow((int[])localObject3);
            k = paramView.getWidth();
            m = paramView.getHeight();
            if (localObject2 != null)
            {
              ((TagImageView)localObject2).getLocationInWindow((int[])localObject3);
              k = ((TagImageView)localObject2).getWidth();
              m = ((TagImageView)localObject2).getHeight();
              paramView = new Intent();
              paramView.putExtra("img_gallery_left", localObject3[0]);
              paramView.putExtra("img_gallery_top", localObject3[1]);
              paramView.putExtra("img_gallery_width", k);
              paramView.putExtra("img_gallery_height", m);
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
              k = 9;
              if (j != 2)
                break label544;
              k = 16;
              paramView.putExtra("sns_landig_pages_from_source", k);
              paramView.putExtra("sns_landing_pages_xml", localn.crd().field_adxml);
              paramView.putExtra("sns_landing_pages_rec_src", localn.cre());
              paramView.putExtra("sns_landing_pages_xml_prefix", "adxml");
              paramView.putExtra("sns_landing_pages_need_enter_and_exit_animation", true);
              paramView.putExtra("sns_landing_is_native_sight_ad", true);
              this.rKt.activity.startActivity(paramView);
              this.rKt.activity.overridePendingTransition(0, 0);
              if (j == 0)
                i = 1;
              com.tencent.mm.plugin.sns.data.i.a(new SnsAdClick(j, i, localn.field_snsId, 23, 21));
              AppMethodBeat.o(40289);
            }
          }
          while (true)
          {
            return;
            if (!(localObject1 instanceof com.tencent.mm.plugin.sns.storage.n))
              break label1133;
            localn = (com.tencent.mm.plugin.sns.storage.n)localObject1;
            localObject1 = (MMImageView)paramView.getTag(2131820637);
            localObject2 = null;
            break;
            if (localObject1 == null)
              break label196;
            ((MMImageView)localObject1).getLocationInWindow((int[])localObject3);
            k = ((MMImageView)localObject1).getWidth();
            m = ((MMImageView)localObject1).getHeight();
            break label196;
            label544: if (j != 1)
              break label364;
            k = 10;
            break label364;
            if ((localObject4 != null) && (((com.tencent.mm.plugin.sns.storage.a)localObject4).qTw == 1))
            {
              paramView = new Intent();
              paramView.putExtra("key_card_id", ((com.tencent.mm.plugin.sns.storage.a)localObject4).qTy);
              paramView.putExtra("key_card_ext", ((com.tencent.mm.plugin.sns.storage.a)localObject4).qTz);
              paramView.putExtra("key_from_scene", 21);
              paramView.putExtra("key_stastic_scene", 15);
              d.b(this.rKt.activity, "card", ".ui.CardDetailUI", paramView);
              if (j == 0)
                i = 1;
              com.tencent.mm.plugin.sns.data.i.a(new SnsAdClick(j, i, localn.field_snsId, 23, 11));
              AppMethodBeat.o(40289);
            }
            else
            {
              if (!b.a(this.rKt, (com.tencent.mm.plugin.sns.storage.a)localObject4, localn, false))
                break label730;
              if (j == 0)
                i = 1;
              com.tencent.mm.plugin.sns.data.i.a(new SnsAdClick(j, i, localn.field_snsId, 23, 31));
              AppMethodBeat.o(40289);
            }
          }
        }
        label730: if (j == 0)
          i = 1;
        localObject2 = new SnsAdClick(j, i, localn.field_snsId, 23, 0);
        com.tencent.mm.plugin.sns.data.i.a((SnsAdClick)localObject2);
        localObject1 = localn.crb();
        paramView = (View)localObject1;
        if (bo.isNullOrNil((String)localObject1))
          paramView = localn.getAdLink();
        ab.i("MicroMsg.TimelineClickListener", "adlink url " + paramView + " " + localn.cqo().qUg);
        localObject1 = new Intent();
        if (localn.cqo().qUg != 0)
          break label1124;
        bool2 = true;
        label849: if (!ae.giI)
          break label1130;
        bool2 = bool1;
      }
      label1124: label1130: 
      while (true)
      {
        if ((localn != null) && (localn.DI(32)))
        {
          localObject4 = b.a(this.rKt, localn);
          if (localObject4 != null)
            ((Intent)localObject1).putExtra("KsnsViewId", ((com.tencent.mm.plugin.sns.storage.a)localObject4).hnw);
        }
        ((Intent)localObject1).putExtra("KRightBtn", bool2);
        localObject4 = new Bundle();
        ((Bundle)localObject4).putParcelable("KSnsAdTag", (Parcelable)localObject2);
        ((Bundle)localObject4).putString("key_snsad_statextstr", ((e)localObject3).cqu().rjC);
        ((Intent)localObject1).putExtra("jsapiargs", (Bundle)localObject4);
        ((Intent)localObject1).putExtra("rawUrl", paramView);
        ((Intent)localObject1).putExtra("useJs", true);
        ((Intent)localObject1).putExtra("srcUsername", localn.field_userName);
        ((Intent)localObject1).putExtra("stastic_scene", 15);
        ((Intent)localObject1).putExtra("KPublisherId", "sns_" + com.tencent.mm.plugin.sns.data.i.jV(localn.field_snsId));
        ((Intent)localObject1).putExtra("pre_username", localn.field_userName);
        ((Intent)localObject1).putExtra("prePublishId", "sns_" + com.tencent.mm.plugin.sns.data.i.jV(localn.field_snsId));
        ((Intent)localObject1).putExtra("preUsername", localn.field_userName);
        com.tencent.mm.plugin.sns.c.a.gkE.i((Intent)localObject1, this.rKt.activity);
        AppMethodBeat.o(40289);
        break;
        bool2 = false;
        break label849;
      }
      label1133: localObject1 = null;
      localObject2 = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.d.b.32
 * JD-Core Version:    0.6.2
 */