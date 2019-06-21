package com.tencent.mm.ui.chatting.viewitems;

import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.b.a.cs;
import com.tencent.mm.g.b.a.cs.a;
import com.tencent.mm.g.b.a.cs.b;
import com.tencent.mm.g.b.a.cs.c;
import com.tencent.mm.g.b.a.cs.d;
import com.tencent.mm.g.b.a.cs.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelappbrand.k;

final class s$1 extends com.tencent.mm.plugin.messenger.a.a
{
  s$1(j.b paramb, s.d paramd, String paramString, com.tencent.mm.ui.chatting.d.a parama, com.tencent.mm.af.a parama1)
  {
  }

  public final void onClickImp(View paramView)
  {
    AppMethodBeat.i(33043);
    ((k)g.K(k.class)).T(this.hWW.fiV, 2);
    this.zeo.zeu.setText(this.zep);
    cs localcs = new cs().hE(this.hWW.fiQ).hF(this.hWW.fiO).hG(this.hWW.fiV).hH(this.zbG.getTalkerUserName());
    if (this.zbG.dFx());
    for (paramView = cs.c.dhV; ; paramView = cs.c.dhW)
    {
      localcs.dhB = paramView;
      localcs.dhC = cs.b.dhR;
      localcs.cVR = 0L;
      paramView = localcs.hI("").Hk();
      paramView.dhE = cs.d.dhY;
      paramView.dhG = cs.a.hp(this.zeq.ffa + 1000);
      paramView.dhF = cs.e.dic;
      paramView.ajK();
      AppMethodBeat.o(33043);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.s.1
 * JD-Core Version:    0.6.2
 */