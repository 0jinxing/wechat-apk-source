package com.tencent.mm.plugin.record.ui.b;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.record.ui.a.b;
import com.tencent.mm.plugin.record.ui.h.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.protocal.protobuf.aar;

public final class d
  implements h.b
{
  Context context;
  int jLX;
  int jLY;

  public d(Context paramContext)
  {
    this.context = paramContext;
  }

  public final void a(View paramView, int paramInt, b paramb)
  {
    AppMethodBeat.i(24373);
    TextView localTextView = (TextView)paramView.findViewById(2131826907);
    localTextView.setText(paramb.cAv.desc);
    j.h(localTextView, 1);
    localTextView.setOnLongClickListener(new d.1(this, paramb));
    paramView.setOnTouchListener(new d.2(this));
    AppMethodBeat.o(24373);
  }

  public final void destroy()
  {
    this.context = null;
  }

  public final View eK(Context paramContext)
  {
    AppMethodBeat.i(24372);
    paramContext = View.inflate(paramContext, 2130970484, null);
    AppMethodBeat.o(24372);
    return paramContext;
  }

  public final void pause()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.b.d
 * JD-Core Version:    0.6.2
 */