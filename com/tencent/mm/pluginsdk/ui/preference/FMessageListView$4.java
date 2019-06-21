package com.tencent.mm.pluginsdk.ui.preference;

import android.content.Context;
import android.view.View;
import android.view.View.OnLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;

final class FMessageListView$4
  implements View.OnLongClickListener
{
  FMessageListView$4(FMessageListView paramFMessageListView, b paramb)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(28041);
    ab.d("MicroMsg.FMessageListView", "jacks long click digest");
    paramView = this.vqz.getContext();
    String str = this.vqz.getContext().getString(2131298085);
    FMessageListView.4.1 local1 = new FMessageListView.4.1(this);
    h.a(paramView, null, new String[] { str }, local1);
    AppMethodBeat.o(28041);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.preference.FMessageListView.4
 * JD-Core Version:    0.6.2
 */