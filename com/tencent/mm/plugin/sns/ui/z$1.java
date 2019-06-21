package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.plugin.sns.c.a;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;

final class z$1
  implements View.OnClickListener
{
  z$1(z paramz)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(38275);
    if (!bo.isNullOrNil(this.rjV.rjU))
      AppMethodBeat.o(38275);
    while (true)
    {
      return;
      Object localObject = v.Zp().y(this.rjV.hcl, true);
      if (((v.b)localObject).containsKey("_DATA_CENTER_ITEM_SHOW_TYPE"))
      {
        int i = ((v.b)localObject).getInt("_DATA_CENTER_ITEM_SHOW_TYPE", -1);
        int j = ((v.b)localObject).getInt("_DATA_SHOW_NATIVE_PAGE", -1);
        if ((i == 5) && (j == 1))
        {
          ab.i("MicroMsg.LinkWidget", "goto native video");
          localObject = new Intent();
          ((Intent)localObject).putExtras(this.rjV.crP.getIntent().getBundleExtra("BizVideoDetailUIExtras"));
          View localView = paramView.findViewById(2131825687);
          if (localView != null)
          {
            i = localView.getWidth();
            j = localView.getHeight();
            paramView = new int[2];
            localView.getLocationInWindow(paramView);
            ((Intent)localObject).putExtra("img_gallery_width", i).putExtra("img_gallery_height", j).putExtra("img_gallery_left", paramView[0]).putExtra("img_gallery_top", paramView[1]);
          }
          ((Intent)localObject).addFlags(268435456);
          d.b(ah.getContext(), "brandservice", ".ui.timeline.video.BizVideoDetailUI", (Intent)localObject);
          AppMethodBeat.o(38275);
        }
      }
      else
      {
        ab.i("MicroMsg.LinkWidget", "adlink url " + this.rjV.link);
        paramView = new Intent();
        paramView.putExtra("rawUrl", this.rjV.link);
        a.gkE.i(paramView, this.rjV.crP);
        AppMethodBeat.o(38275);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.z.1
 * JD-Core Version:    0.6.2
 */