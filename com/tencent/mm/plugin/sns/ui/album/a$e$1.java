package com.tencent.mm.plugin.sns.ui.album;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.SnsUserUI;

final class a$e$1
  implements View.OnClickListener
{
  a$e$1(a.e parame, a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(39963);
    paramView = this.rFz.rFs;
    Intent localIntent = new Intent(paramView.mContext, SnsUserUI.class);
    localIntent.putExtra("sns_userName", paramView.edV);
    paramView.mContext.startActivity(localIntent);
    AppMethodBeat.o(39963);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.album.a.e.1
 * JD-Core Version:    0.6.2
 */