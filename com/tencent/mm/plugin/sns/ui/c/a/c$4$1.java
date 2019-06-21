package com.tencent.mm.plugin.sns.ui.c.a;

import android.content.Context;
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
    AppMethodBeat.i(40097);
    com.tencent.mm.plugin.sns.data.i.kI(false);
    this.rHe.rHb.rGY.setBackgroundColor(this.rHe.rHb.context.getResources().getColor(2131690468));
    AppMethodBeat.o(40097);
  }

  public final void dv(List<PointF> paramList)
  {
    int i = 2;
    AppMethodBeat.i(40098);
    com.tencent.mm.plugin.sns.data.i.kI(true);
    List localList = com.tencent.mm.plugin.sns.data.i.Xs(this.rHe.rHd.qVp);
    this.rHe.rHb.rGY.setBackgroundColor(0);
    if ((localList.size() > 0) && (paramList.size() > 0));
    while (true)
    {
      try
      {
        float f1 = com.tencent.mm.ui.tools.a.a.r(localList, paramList);
        Collections.reverse(localList);
        float f2 = com.tencent.mm.ui.tools.a.a.r(localList, paramList);
        float f3 = (float)Math.acos(Math.max(f1, f2));
        ab.i("MicroMsg.FullCardAdDetailItem", "similarity: %f,%f, distance:%f", new Object[] { Float.valueOf(f1), Float.valueOf(f2), Float.valueOf(f3) });
        if (f3 > this.rHe.rHd.qVo)
          break label686;
        this.rHe.rHb.rqo.a(this.rHe.rHb);
        com.tencent.mm.plugin.sns.data.i.e(new long[] { 20L, 100L });
        Object localObject1 = new int[2];
        this.rHe.rHb.contentView.getLocationInWindow((int[])localObject1);
        Object localObject2 = new android/content/Intent;
        ((Intent)localObject2).<init>();
        ((Intent)localObject2).putExtra("img_gallery_left", localObject1[0]);
        ((Intent)localObject2).putExtra("img_gallery_top", localObject1[1]);
        ((Intent)localObject2).putExtra("img_gallery_width", this.rHe.rHb.contentView.getWidth());
        ((Intent)localObject2).putExtra("img_gallery_height", this.rHe.rHb.contentView.getHeight());
        ((Intent)localObject2).putExtra("sns_landing_pages_share_sns_id", this.rHe.rhJ.cqA());
        ((Intent)localObject2).putExtra("sns_landing_pages_rawSnsId", this.rHe.rhJ.cqu().Id);
        ((Intent)localObject2).putExtra("sns_landing_pages_ux_info", this.rHe.rhJ.crc());
        localObject1 = this.rHe.rhJ.cqo().coW();
        if (!com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.i.go(this.rHe.rhJ.cqo().cHz, "adFullCardGestureCanvasInfo"))
          ((String)localObject1).replaceAll("(?s)<adFullCardGestureCanvasInfo[^>]*>.*?</adFullCardGestureCanvasInfo>", "");
        ((Intent)localObject2).putExtra("sns_landing_pages_xml", (String)localObject1);
        ((Intent)localObject2).setClass(this.rHe.rHb.context, SnsAdNativeLandingPagesUI.class);
        ((Intent)localObject2).putExtra("sns_landig_pages_from_source", 2);
        ((Intent)localObject2).putExtra("sns_landing_pages_xml_prefix", "adxml");
        ((Intent)localObject2).putExtra("sns_landing_pages_need_enter_and_exit_animation", true);
        ((Intent)localObject2).putExtra("sns_landing_is_native_sight_ad", true);
        this.rHe.rHb.context.startActivity((Intent)localObject2);
        localObject2 = new com/tencent/mm/modelsns/SnsAdClick;
        ((SnsAdClick)localObject2).<init>(1, 2, com.tencent.mm.plugin.sns.data.i.Xq(this.rHe.rhJ.cqu().Id), 25, 21);
        com.tencent.mm.plugin.sns.data.i.a((SnsAdClick)localObject2);
        h.pYm.e(16552, new Object[] { this.rHe.rhJ.cqu().Id, com.tencent.mm.plugin.sns.data.i.dd(localList), com.tencent.mm.plugin.sns.data.i.dd(com.tencent.mm.ui.tools.a.a.v(paramList, 20)), Integer.valueOf((int)(100.0F * f3)), Integer.valueOf(i), Long.valueOf(bo.anl(this.rHe.rhJ.cqZ())), this.rHe.rhJ.cqq().qPj });
        return;
      }
      catch (Exception paramList)
      {
        ab.printErrStackTrace("MicroMsg.FullCardAdDetailItem", paramList, "recog gesture error!", new Object[0]);
        this.rHe.rHb.rGY.cvA();
        AppMethodBeat.o(40098);
        continue;
      }
      finally
      {
        this.rHe.rHb.rGY.cvA();
        AppMethodBeat.o(40098);
      }
      AppMethodBeat.o(40098);
      continue;
      label686: i = 1;
    }
  }

  public final void onClick()
  {
    AppMethodBeat.i(40099);
    com.tencent.mm.plugin.sns.data.i.kI(true);
    this.rHe.rHb.rGY.setBackgroundColor(0);
    this.rHe.rHb.rGD.rns.performClick();
    AppMethodBeat.o(40099);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.c.a.c.4.1
 * JD-Core Version:    0.6.2
 */