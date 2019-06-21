package com.tencent.mm.plugin.sns.ui.item;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PointF;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelsns.SnsAdClick;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sns.storage.b.c.a;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI;
import com.tencent.mm.plugin.sns.ui.aj;
import com.tencent.mm.plugin.sns.ui.au;
import com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView;
import com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView.a;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Collections;
import java.util.List;

final class c$4$1
  implements SnsDrawGestureView.a
{
  c$4$1(c.4 param4)
  {
  }

  public final void cuU()
  {
    AppMethodBeat.i(40138);
    com.tencent.mm.plugin.sns.data.i.kI(false);
    c.a.b(this.rIS.rIQ).setBackgroundColor(this.rIS.rIP.mActivity.getResources().getColor(2131690468));
    AppMethodBeat.o(40138);
  }

  public final void dv(List<PointF> paramList)
  {
    int i = 2;
    AppMethodBeat.i(40139);
    com.tencent.mm.plugin.sns.data.i.kI(true);
    Object localObject1 = com.tencent.mm.plugin.sns.data.i.Xs(this.rIS.rHd.qVp);
    c.a.b(this.rIS.rIQ).setBackgroundColor(0);
    if ((((List)localObject1).size() > 0) && (paramList.size() > 0));
    while (true)
    {
      try
      {
        float f1 = com.tencent.mm.ui.tools.a.a.r((List)localObject1, paramList);
        String str = com.tencent.mm.plugin.sns.data.i.dd((List)localObject1);
        Collections.reverse((List)localObject1);
        float f2 = com.tencent.mm.ui.tools.a.a.r((List)localObject1, paramList);
        float f3 = (float)Math.acos(Math.max(f1, f2));
        ab.i("MicroMsg.FullCardAdTimeLineItem", "similarity: %f,%f, distance:%f", new Object[] { Float.valueOf(f1), Float.valueOf(f2), Float.valueOf(f3) });
        if (f3 > this.rIS.rHd.qVo)
          break label682;
        this.rIS.rIP.qPr.rxP.rhA.h(this.rIS.rIQ);
        com.tencent.mm.plugin.sns.data.i.e(new long[] { 20L, 100L });
        Object localObject2 = new int[2];
        this.rIS.rIQ.roq.getLocationInWindow((int[])localObject2);
        localObject1 = new android/content/Intent;
        ((Intent)localObject1).<init>();
        ((Intent)localObject1).putExtra("img_gallery_left", localObject2[0]);
        ((Intent)localObject1).putExtra("img_gallery_top", localObject2[1]);
        ((Intent)localObject1).putExtra("img_gallery_width", this.rIS.rIQ.roq.getWidth());
        ((Intent)localObject1).putExtra("img_gallery_height", this.rIS.rIQ.roq.getHeight());
        ((Intent)localObject1).putExtra("sns_landing_pages_share_sns_id", this.rIS.rhJ.cqA());
        ((Intent)localObject1).putExtra("sns_landing_pages_rawSnsId", this.rIS.rhJ.cqu().Id);
        ((Intent)localObject1).putExtra("sns_landing_pages_ux_info", this.rIS.rhJ.crc());
        localObject2 = this.rIS.rhJ.cqo().coW();
        if (!com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.i.go(this.rIS.rhJ.cqo().cHz, "adFullCardGestureCanvasInfo"))
          ((String)localObject2).replaceAll("(?s)<adFullCardGestureCanvasInfo[^>]*>.*?</adFullCardGestureCanvasInfo>", "");
        ((Intent)localObject1).putExtra("sns_landing_pages_xml", (String)localObject2);
        ((Intent)localObject1).setClass(this.rIS.rIP.mActivity, SnsAdNativeLandingPagesUI.class);
        ((Intent)localObject1).putExtra("sns_landig_pages_from_source", 1);
        ((Intent)localObject1).putExtra("sns_landing_pages_xml_prefix", "adxml");
        ((Intent)localObject1).putExtra("sns_landing_pages_need_enter_and_exit_animation", true);
        ((Intent)localObject1).putExtra("sns_landing_is_native_sight_ad", true);
        this.rIS.rIP.mActivity.startActivity((Intent)localObject1);
        localObject1 = new com/tencent/mm/modelsns/SnsAdClick;
        ((SnsAdClick)localObject1).<init>(1, 1, com.tencent.mm.plugin.sns.data.i.Xq(this.rIS.rhJ.cqu().Id), 25, 21);
        com.tencent.mm.plugin.sns.data.i.a((SnsAdClick)localObject1);
        h.pYm.e(16552, new Object[] { this.rIS.rhJ.cqu().Id, str, com.tencent.mm.plugin.sns.data.i.dd(com.tencent.mm.ui.tools.a.a.v(paramList, 20)), Integer.valueOf((int)(100.0F * f3)), Integer.valueOf(i), Long.valueOf(bo.anl(this.rIS.rhJ.cqZ())), this.rIS.rhJ.cqq().qPj });
        return;
      }
      catch (Exception paramList)
      {
        ab.printErrStackTrace("MicroMsg.FullCardAdTimeLineItem", paramList, "recog gesture error!", new Object[0]);
        c.a.b(this.rIS.rIQ).cvA();
        AppMethodBeat.o(40139);
        continue;
      }
      finally
      {
        c.a.b(this.rIS.rIQ).cvA();
        AppMethodBeat.o(40139);
      }
      AppMethodBeat.o(40139);
      continue;
      label682: i = 1;
    }
  }

  public final void onClick()
  {
    AppMethodBeat.i(40140);
    com.tencent.mm.plugin.sns.data.i.kI(true);
    c.a.b(this.rIS.rIQ).setBackgroundColor(0);
    this.rIS.rIQ.rGD.rns.performClick();
    AppMethodBeat.o(40140);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.item.c.4.1
 * JD-Core Version:    0.6.2
 */