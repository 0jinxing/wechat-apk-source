package com.tencent.mm.view.a;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emojicapture.api.c;
import com.tencent.mm.view.f.a;

final class i$a extends i.c
{
  View AbC;
  ImageView AbD;
  TextView AbE;
  TextView AbF;

  public i$a(final i parami, View paramView, int paramInt)
  {
    super(parami, paramView, paramInt);
    AppMethodBeat.i(62998);
    this.AbC = paramView.findViewById(2131823493);
    this.AbD = ((ImageView)paramView.findViewById(2131823494));
    this.AbE = ((TextView)paramView.findViewById(2131823495));
    this.AbF = ((TextView)paramView.findViewById(2131823496));
    this.AbD.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(62997);
        if (((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().OT())
          c.h(i.a.this.AbG.mContext, null, a.QK(i.a.this.AbG.Aaj.gOW));
        AppMethodBeat.o(62997);
      }
    });
    AppMethodBeat.o(62998);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.a.i.a
 * JD-Core Version:    0.6.2
 */