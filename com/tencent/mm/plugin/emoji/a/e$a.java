package com.tencent.mm.plugin.emoji.a;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e$a
{
  TextView gnB;
  ImageView iqT;
  View kSh;
  ImageView kSi;

  public e$a(e parame, View paramView)
  {
    AppMethodBeat.i(52739);
    this.kSi = ((ImageView)paramView.findViewById(2131823504));
    this.iqT = ((ImageView)paramView.findViewById(2131823506));
    this.gnB = ((TextView)paramView.findViewById(2131823507));
    this.kSh = paramView.findViewById(2131823505);
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    if (localLayoutParams != null)
    {
      localLayoutParams.height = e.a(parame);
      paramView.setLayoutParams(localLayoutParams);
    }
    AppMethodBeat.o(52739);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.a.e.a
 * JD-Core Version:    0.6.2
 */