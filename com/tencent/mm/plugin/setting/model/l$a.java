package com.tencent.mm.plugin.setting.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.a.ic;
import com.tencent.mm.g.a.tx;
import com.tencent.mm.g.a.tx.b;
import com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI.h;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;

final class l$a
  implements f, Runnable
{
  CountDownLatch countDownLatch;
  UnfamiliarContactDetailUI.h qke;
  m qkf;
  long start;

  l$a(l paraml, UnfamiliarContactDetailUI.h paramh, CountDownLatch paramCountDownLatch)
  {
    this.qke = paramh;
    this.countDownLatch = paramCountDownLatch;
  }

  static void cis()
  {
    AppMethodBeat.i(126876);
    ic localic = new ic();
    localic.cDb.cAd = 3;
    a.xxA.m(localic);
    AppMethodBeat.o(126876);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(126874);
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      ab.e("MicroMsg.UnfamiliarContactEngine", "[onSceneEnd] errType:%s errCode:%s errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      this.countDownLatch.countDown();
      AppMethodBeat.o(126874);
    }
    while (true)
    {
      return;
      if (paramm.getType() == 292)
      {
        this.qkf = paramm;
        d.post(this, "load_unfamiliar_contact");
      }
      AppMethodBeat.o(126874);
    }
  }

  public final void run()
  {
    AppMethodBeat.i(126875);
    Object localObject = new tx();
    ((tx)localObject).cPY.cQa = this.qkf;
    a.xxA.m((b)localObject);
    int i = ((tx)localObject).cPZ.state;
    localObject = ((tx)localObject).cPZ.cQb;
    boolean bool;
    int j;
    if (localObject == null)
    {
      bool = true;
      if (localObject != null)
        break label158;
      j = 0;
      label61: ab.i("MicroMsg.UnfamiliarContactEngine", "[callback] state:%s,tagList is null?%s,tagList size:%s", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool), Integer.valueOf(j) });
      if (i == 1)
        break label169;
      if (localObject != null)
        this.qjY.qjU.addAll((Collection)localObject);
      ab.i("MicroMsg.UnfamiliarContactEngine", "[AsyncGetSnsTagInfo] %sms", new Object[] { Long.valueOf(System.currentTimeMillis() - this.start) });
      this.countDownLatch.countDown();
      AppMethodBeat.o(126875);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label158: j = ((List)localObject).size();
      break label61;
      label169: if (this.qke != null)
        al.d(new l.a.1(this));
      this.qjY.eKj.m(new l.a.2(this), 30000L);
      AppMethodBeat.o(126875);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.model.l.a
 * JD-Core Version:    0.6.2
 */