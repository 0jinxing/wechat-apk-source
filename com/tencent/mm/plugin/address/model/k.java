package com.tencent.mm.plugin.address.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.aj.d;
import com.tencent.mm.g.a.nd;
import com.tencent.mm.g.a.nd.a;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.address.d.b;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class k extends c<nd>
  implements com.tencent.mm.ai.f
{
  private nd gIM;
  private d gIN;

  public k()
  {
    AppMethodBeat.i(16751);
    this.xxI = nd.class.getName().hashCode();
    AppMethodBeat.o(16751);
  }

  private void F(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(16754);
    ab.d("MicroMsg.RcptGetAddrEventListener", "setResult errCode[%s], isAccept[%s]", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) });
    this.gIM.cJm.errCode = paramInt;
    if (paramInt != 0)
      this.gIM.cJm.cJn = false;
    while (true)
    {
      if (this.gIM.callback != null)
        this.gIM.callback.run();
      aw.Rg().b(417, this);
      AppMethodBeat.o(16754);
      return;
      if (!paramBoolean)
      {
        com.tencent.mm.aj.f.i(this.gIN);
        this.gIM.cJm.cJn = false;
      }
      else
      {
        com.tencent.mm.aj.f.h(this.gIN);
        this.gIM.cJm.cJn = true;
        com.tencent.mm.plugin.address.a.a.arQ();
        Object localObject = com.tencent.mm.plugin.address.a.a.arS().gIQ;
        if (((com.tencent.mm.plugin.address.d.a)localObject).gIY.size() > 0)
        {
          localObject = (b)((com.tencent.mm.plugin.address.d.a)localObject).gIY.getFirst();
          this.gIM.cJm.cJo = ((b)localObject).gJh;
          this.gIM.cJm.userName = ((b)localObject).gJf;
          this.gIM.cJm.cJp = ((b)localObject).gJg;
          this.gIM.cJm.cJq = ((b)localObject).gJd;
          this.gIM.cJm.cJr = ((b)localObject).gJa;
          this.gIM.cJm.cJs = ((b)localObject).gJb;
          this.gIM.cJm.cJt = ((b)localObject).gJc;
          this.gIM.cJm.cJu = ((b)localObject).gJe;
        }
      }
    }
  }

  private boolean a(nd paramnd)
  {
    AppMethodBeat.i(16752);
    if ((paramnd instanceof nd))
    {
      this.gIM = paramnd;
      aw.Rg().a(417, this);
      paramnd = new e(this.gIM.cJl.url, this.gIM.cJl.appId, 1);
      aw.Rg().a(paramnd, 0);
    }
    AppMethodBeat.o(16752);
    return true;
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(16753);
    ab.d("MicroMsg.RcptGetAddrEventListener", "onSceneEnd errType[%s], errCode[%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramm instanceof e))
      if (paramInt2 == 0)
      {
        F(paramInt2, true);
        AppMethodBeat.o(16753);
      }
    while (true)
    {
      return;
      F(paramInt2, false);
      AppMethodBeat.o(16753);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.model.k
 * JD-Core Version:    0.6.2
 */