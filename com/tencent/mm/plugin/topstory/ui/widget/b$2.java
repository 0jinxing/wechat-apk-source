package com.tencent.mm.plugin.topstory.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.abz;
import java.util.Set;

final class b$2
  implements View.OnClickListener
{
  b$2(b paramb, abz paramabz, TextView paramTextView, Context paramContext)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(2228);
    if (b.a(this.sHX).contains(this.sHY))
    {
      b.a(this.sHX).remove(this.sHY);
      this.sHZ.setTextColor(this.val$context.getResources().getColor(2131690589));
      this.sHZ.setBackgroundResource(2130840482);
      if (!b.a(this.sHX).isEmpty())
        break label160;
      b.c(this.sHX).setText(b.b(this.sHX).cEh);
      AppMethodBeat.o(2228);
    }
    while (true)
    {
      return;
      b.a(this.sHX).add(this.sHY);
      this.sHZ.setTextColor(this.val$context.getResources().getColor(2131690588));
      this.sHZ.setBackgroundResource(2130840481);
      break;
      label160: b.c(this.sHX).setText(this.val$context.getString(2131304096));
      AppMethodBeat.o(2228);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.widget.b.2
 * JD-Core Version:    0.6.2
 */