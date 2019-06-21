package com.tencent.mm.plugin.record.ui.b;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.aw.a;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.record.b.n;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.aas;
import com.tencent.mm.protocal.protobuf.aat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.base.t;
import java.io.File;

final class b$2
  implements View.OnClickListener
{
  b$2(b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(24351);
    if (!com.tencent.mm.compatible.util.f.Mn())
    {
      t.hO(paramView.getContext());
      AppMethodBeat.o(24351);
    }
    Object localObject1;
    aat localaat;
    while (true)
    {
      return;
      localObject1 = (com.tencent.mm.plugin.record.ui.a.b)paramView.getTag();
      localaat = ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.wgT.whw;
      if (!b.e(((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv))
        break;
      ab.i("MicroMsg.OtherViewWrapper", "same song, do release");
      a.aic();
      if (this.pLe.pLc)
        break label256;
      this.pLe.handler.sendMessageAtFrontOfQueue(this.pLe.handler.obtainMessage(1));
      AppMethodBeat.o(24351);
    }
    this.pLe.pLc = true;
    paramView = new File(n.f(((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv, ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cvx));
    if (!paramView.exists())
      if (((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.cvq == null)
        paramView = "";
    while (true)
    {
      Object localObject2 = ((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv;
      String str1 = ((aar)localObject2).title;
      String str2 = ((aar)localObject2).desc;
      String str3 = ((aar)localObject2).wgg;
      localObject1 = ((aar)localObject2).wgk;
      String str4 = ((aar)localObject2).wgi;
      String str5 = ((aar)localObject2).mnd;
      localObject2 = new StringBuilder();
      aw.ZK();
      a.b(com.tencent.mm.aw.f.a(6, null, str1, str2, str3, (String)localObject1, str4, str5, c.Yg() + "web/", paramView, "", localaat.appId));
      label256: AppMethodBeat.o(24351);
      break;
      paramView = new StringBuilder();
      aw.ZK();
      paramView = new File(c.Yg() + "web/" + g.x(((com.tencent.mm.plugin.record.ui.a.b)localObject1).cAv.cvq.getBytes()));
      if (paramView.exists());
      for (paramView = paramView.getAbsolutePath(); ; paramView = "")
        break;
      paramView = paramView.getAbsolutePath();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.b.b.2
 * JD-Core Version:    0.6.2
 */