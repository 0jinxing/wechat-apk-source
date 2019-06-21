package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.sdk.platformtools.ab;

final class r$2
  implements View.OnClickListener
{
  r$2(r paramr, Context paramContext)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(38236);
    ab.d("MicroMsg.GalleryFooter", "comment cmd");
    if (r.a(this.riS) == null)
    {
      AppMethodBeat.o(38236);
      return;
    }
    int i = r.a(this.riS).reX;
    Intent localIntent = new Intent();
    localIntent.putExtra("sns_comment_localId", i);
    localIntent.putExtra("sns_source", r.b(this.riS));
    localIntent.setClass(this.val$context, SnsCommentUI.class);
    if (r.a(this.riS).field_snsId == 0L);
    for (paramView = ""; ; paramView = i.jV(r.a(this.riS).field_snsId))
    {
      h.pYm.e(11989, new Object[] { Integer.valueOf(2), paramView, Integer.valueOf(0) });
      this.val$context.startActivity(localIntent);
      AppMethodBeat.o(38236);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.r.2
 * JD-Core Version:    0.6.2
 */