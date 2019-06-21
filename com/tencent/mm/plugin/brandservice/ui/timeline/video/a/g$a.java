package com.tencent.mm.plugin.brandservice.ui.timeline.video.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.brandservice.ui.timeline.video.BizVideoDetailUI;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.jz;
import com.tencent.mm.ui.base.n.c;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "menu", "Lcom/tencent/mm/ui/base/MMMenu;", "kotlin.jvm.PlatformType", "onCreateMMMenu"})
public final class g$a
  implements n.c
{
  public g$a(g paramg)
  {
  }

  public final void a(com.tencent.mm.ui.base.l paraml)
  {
    AppMethodBeat.i(15337);
    h.pYm.a(480L, 0L, 1L, false);
    paraml.clear();
    int i = this.jYV.jYN;
    Object localObject = this.jYV.aYo();
    if (localObject != null)
    {
      localObject = ((BizVideoDetailUI)localObject).getString(2131302133);
      paraml.a(i, (CharSequence)localObject, 2131231019, g.a(this.jYV, this.jYV.jYN));
      i = this.jYV.jYO;
      localObject = this.jYV.aYo();
      if (localObject == null)
        break label444;
      localObject = ((BizVideoDetailUI)localObject).getString(2131302134);
      label102: paraml.a(i, (CharSequence)localObject, 2131231005, g.a(this.jYV, this.jYV.jYO));
      localObject = this.jYV.jXv;
      if ((localObject != null) && (((jz)localObject).vMQ == 1))
      {
        localObject = this.jYV.jXv;
        if ((localObject == null) || (((jz)localObject).vMP != 0))
          break label454;
        i = this.jYV.jYQ;
        localObject = this.jYV.aYo();
        if (localObject == null)
          break label449;
        localObject = ((BizVideoDetailUI)localObject).getString(2131302143);
        label194: paraml.a(i, (CharSequence)localObject, 2131230999, g.a(this.jYV, this.jYV.jYQ));
      }
      i = this.jYV.jYP;
      localObject = this.jYV.aYo();
      if (localObject == null)
        break label515;
      localObject = ((BizVideoDetailUI)localObject).getString(2131301955);
      label247: paraml.a(i, (CharSequence)localObject, 2131230996, g.a(this.jYV, this.jYV.jYP));
      i = this.jYV.jYS;
      localObject = this.jYV.aYo();
      if (localObject == null)
        break label520;
      localObject = ((BizVideoDetailUI)localObject).getString(2131305698);
      label300: paraml.a(i, (CharSequence)localObject, 2131230984, g.a(this.jYV, this.jYV.jYS));
      i = this.jYV.jYU;
      localObject = this.jYV.aYo();
      if (localObject == null)
        break label525;
      localObject = ((BizVideoDetailUI)localObject).getString(2131297652);
      label353: paraml.a(i, (CharSequence)localObject, 2131230987, g.a(this.jYV, this.jYV.jYU));
      i = this.jYV.jYT;
      localObject = this.jYV.aYo();
      if (localObject == null)
        break label530;
    }
    label515: label520: label525: label530: for (localObject = ((BizVideoDetailUI)localObject).getString(2131305687); ; localObject = null)
    {
      paraml.a(i, (CharSequence)localObject, 2131230988, g.a(this.jYV, this.jYV.jYT));
      AppMethodBeat.o(15337);
      return;
      localObject = null;
      break;
      label444: localObject = null;
      break label102;
      label449: localObject = null;
      break label194;
      label454: i = this.jYV.jYR;
      localObject = this.jYV.aYo();
      if (localObject != null);
      for (localObject = ((BizVideoDetailUI)localObject).getString(2131302135); ; localObject = null)
      {
        paraml.a(i, (CharSequence)localObject, 2131230986, g.a(this.jYV, this.jYV.jYR));
        break;
      }
      localObject = null;
      break label247;
      localObject = null;
      break label300;
      localObject = null;
      break label353;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.video.a.g.a
 * JD-Core Version:    0.6.2
 */