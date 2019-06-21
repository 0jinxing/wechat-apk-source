package com.tencent.mm.plugin.setting.ui.setting;

import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.HashSet;

final class UnfamiliarContactDetailUI$11
  implements UnfamiliarContactDetailUI.h
{
  long start;

  UnfamiliarContactDetailUI$11(UnfamiliarContactDetailUI paramUnfamiliarContactDetailUI)
  {
    AppMethodBeat.i(127648);
    this.start = System.currentTimeMillis();
    AppMethodBeat.o(127648);
  }

  public final void a(UnfamiliarContactDetailUI.e parame)
  {
    AppMethodBeat.i(127651);
    ab.i("MicroMsg.UnfamiliarContactUI", "[onLoading] type:%s", new Object[] { parame.name() });
    this.qpX.findViewById(2131827455).setVisibility(0);
    this.qpX.findViewById(2131821099).setVisibility(0);
    if (parame == UnfamiliarContactDetailUI.e.qqs)
    {
      UnfamiliarContactDetailUI.k(this.qpX).setText(this.qpX.getString(2131300968));
      AppMethodBeat.o(127651);
    }
    while (true)
    {
      return;
      if (parame == UnfamiliarContactDetailUI.e.qqr)
        UnfamiliarContactDetailUI.k(this.qpX).setText(this.qpX.getString(2131304155));
      AppMethodBeat.o(127651);
    }
  }

  public final void e(HashSet paramHashSet)
  {
    AppMethodBeat.i(127652);
    if (paramHashSet == null);
    for (int i = 0; ; i = paramHashSet.size())
    {
      ab.i("MicroMsg.UnfamiliarContactUI", "[onResult] size:%s", new Object[] { Integer.valueOf(i) });
      if (paramHashSet != null)
        UnfamiliarContactDetailUI.a(this.qpX, paramHashSet);
      AppMethodBeat.o(127652);
      return;
    }
  }

  public final void onError()
  {
    AppMethodBeat.i(127650);
    ab.e("MicroMsg.UnfamiliarContactUI", "[onError]");
    this.qpX.findViewById(2131827455).setVisibility(0);
    this.qpX.findViewById(2131821099).setVisibility(8);
    UnfamiliarContactDetailUI.k(this.qpX).setText(this.qpX.getString(2131304154));
    AppMethodBeat.o(127650);
  }

  public final void onSuccess()
  {
    AppMethodBeat.i(127649);
    ab.i("MicroMsg.UnfamiliarContactUI", "[onSuccess] size:%s cost:%sms", new Object[] { Integer.valueOf(UnfamiliarContactDetailUI.f(this.qpX).size()), Long.valueOf(System.currentTimeMillis() - this.start) });
    UnfamiliarContactDetailUI.g(this.qpX).setText(this.qpX.getString(2131304148) + "(" + UnfamiliarContactDetailUI.f(this.qpX).size() + ")");
    if (UnfamiliarContactDetailUI.f(this.qpX).size() == 0)
    {
      this.qpX.findViewById(2131827455).setVisibility(0);
      this.qpX.findViewById(2131821099).setVisibility(8);
      this.qpX.findViewById(2131821925).setVisibility(8);
      UnfamiliarContactDetailUI.k(this.qpX).setText(this.qpX.getString(2131300964));
      AppMethodBeat.o(127649);
    }
    while (true)
    {
      return;
      this.qpX.findViewById(2131827455).setVisibility(8);
      this.qpX.findViewById(2131821925).setVisibility(0);
      if (UnfamiliarContactDetailUI.e(this.qpX) != null)
        UnfamiliarContactDetailUI.e(this.qpX).aop.notifyChanged();
      AppMethodBeat.o(127649);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI.11
 * JD-Core Version:    0.6.2
 */