package com.tencent.mm.plugin.brandservice.ui.timeline.a;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.e.f;
import com.tencent.mm.pluginsdk.ui.e.m;
import com.tencent.mm.ui.widget.MMNeat7extView;

public final class h extends a
{
  public TextView jPK;
  public View jPL;
  public MMNeat7extView jPi;

  public final View a(Context paramContext, com.tencent.mm.plugin.brandservice.ui.timeline.a parama)
  {
    AppMethodBeat.i(14267);
    super.b(paramContext, parama);
    if (this.jOR != null)
    {
      paramContext = this.jOR;
      AppMethodBeat.o(14267);
    }
    while (true)
    {
      return paramContext;
      this.jOR = View.inflate(paramContext, 2130968871, null);
      aWH();
      this.jPi = ((MMNeat7extView)this.jOR.findViewById(2131821513));
      this.jPi.setOnTouchListener(new f(this.jPi, new m(this.jPi.getContext())));
      this.jPK = ((TextView)this.jOR.findViewById(2131821851));
      this.jPL = this.jOR.findViewById(2131821850);
      paramContext = this.jOR;
      AppMethodBeat.o(14267);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.a.h
 * JD-Core Version:    0.6.2
 */