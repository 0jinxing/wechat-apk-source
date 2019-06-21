package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.i;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.sdk.platformtools.ab;

final class SnsTimeLineUI$55$1
  implements View.OnClickListener
{
  SnsTimeLineUI$55$1(SnsTimeLineUI.55 param55, String paramString)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(39529);
    ab.d("MicroMsg.SnsTimeLineUI", "collapse tips click");
    paramView = new Intent(this.rzL.rzs, SnsCommentDetailUI.class);
    paramView.putExtra("INTENT_TALKER", this.rzL.rhJ.field_userName);
    paramView.putExtra("INTENT_SNS_LOCAL_ID", this.rzL.rhJ.reX);
    paramView.putExtra("INTENT_FROMGALLERY", false);
    paramView.putExtra("intent_show_collapse_info", true);
    paramView.putExtra("intent_content_collapse_hint", this.rzK);
    this.rzL.rzs.startActivity(paramView);
    i.kx(this.rzL.rsc);
    AppMethodBeat.o(39529);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsTimeLineUI.55.1
 * JD-Core Version:    0.6.2
 */