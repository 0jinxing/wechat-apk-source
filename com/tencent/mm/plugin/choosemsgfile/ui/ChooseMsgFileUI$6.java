package com.tencent.mm.plugin.choosemsgfile.ui;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.choosemsgfile.b.d.a;

final class ChooseMsgFileUI$6
  implements View.OnClickListener
{
  ChooseMsgFileUI$6(ChooseMsgFileUI paramChooseMsgFileUI)
  {
  }

  @SuppressLint({"ResourceType"})
  public final void onClick(View paramView)
  {
    AppMethodBeat.i(54449);
    paramView = ChooseMsgFileUI.a(this.kvQ);
    boolean bool;
    if (!paramView.kvs)
    {
      bool = true;
      paramView.kvs = bool;
      if (!ChooseMsgFileUI.a(this.kvQ).kvs)
        break label63;
      ChooseMsgFileUI.b(this.kvQ).setImageResource(2131231853);
      AppMethodBeat.o(54449);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label63: ChooseMsgFileUI.b(this.kvQ).setImageResource(2131231852);
      AppMethodBeat.o(54449);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileUI.6
 * JD-Core Version:    0.6.2
 */