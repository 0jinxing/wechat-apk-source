package com.tencent.soter.a.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.soter.a.b.c;
import com.tencent.soter.a.f.e;
import com.tencent.soter.a.f.e.a;
import com.tencent.soter.core.c.d;
import com.tencent.soter.core.c.i;

final class l$2
  implements com.tencent.soter.a.e.a
{
  l$2(l paraml)
  {
  }

  public final void onError(int paramInt, String paramString)
  {
    AppMethodBeat.i(10566);
    d.w("Soter.TaskPrepareAuthKey", "soter: auth key %s generate failed. errcode: %d, errmsg: %s", new Object[] { this.Axh.AvS, Integer.valueOf(paramInt), paramString });
    l.eQ(this.Axh.AvS, 0);
    this.Axh.b(new c(paramInt, paramString));
    AppMethodBeat.o(10566);
  }

  public final void onSuccess()
  {
    AppMethodBeat.i(10567);
    d.i("Soter.TaskPrepareAuthKey", "soter: auth key generate successfully. start upload", new Object[0]);
    l locall;
    i locali;
    if (this.Axh.rOc != null)
    {
      l.eQ(this.Axh.AvS, 2);
      locall = this.Axh;
      locali = com.tencent.soter.core.a.auc(locall.AvS);
      if (locali != null)
        break label111;
      d.e("Soter.TaskPrepareAuthKey", "soter: auth key model is null even after generation. fatal error", new Object[0]);
      com.tencent.soter.core.a.cn(locall.AvS, false);
      locall.b(new c(12, "auth key model is null even after generation."));
      AppMethodBeat.o(10567);
    }
    while (true)
    {
      return;
      l.eQ(this.Axh.AvS, 0);
      break;
      label111: if (locall.rOc != null)
      {
        locall.rOc.bR(new e.a(locali.signature, locali.Avn));
        locall.rOc.a(new l.3(locall, locali));
        locall.rOc.execute();
        AppMethodBeat.o(10567);
      }
      else
      {
        d.d("Soter.TaskPrepareAuthKey", "soter: not provide network wrapper instance. please check if it is what you want. we treat it as normal", new Object[0]);
        locall.b(new c("treat as normal because you do not provide the net wrapper", locali));
        AppMethodBeat.o(10567);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.soter.a.g.l.2
 * JD-Core Version:    0.6.2
 */