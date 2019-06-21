package com.tencent.mm.plugin.ext.provider;

import android.database.MatrixCursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.pluginsdk.d.a.b;
import com.tencent.mm.sdk.platformtools.ab;

final class ExtControlProviderMsg$2$1
  implements f
{
  ExtControlProviderMsg$2$1(ExtControlProviderMsg.2 param2, String paramString)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(20349);
    ab.d("MicroMsg.ExtControlProviderMsg", "onSceneEnd errType=%s, errCode=%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramm == null)
    {
      ab.e("MicroMsg.ExtControlProviderMsg", "scene == null");
      aw.Rg().b(522, this);
      this.lQq.lQn.vf(4);
      this.lQq.jDX.countDown();
      AppMethodBeat.o(20349);
      return;
    }
    switch (paramm.getType())
    {
    default:
      label104: this.lQq.lQn.vf(0);
    case 522:
    }
    while (true)
    {
      this.lQq.jDX.countDown();
      aw.Rg().b(522, this);
      AppMethodBeat.o(20349);
      break;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        ab.d("MicroMsg.ExtControlProviderMsg", "rtSENDMSG onSceneEnd ok, ");
        ExtControlProviderMsg.a(this.lQq.lQn).addRow(new Object[] { this.lQp, Integer.valueOf(1) });
        break label104;
      }
      ab.e("MicroMsg.ExtControlProviderMsg", "rtSENDMSG onSceneEnd err, errType = " + paramInt1 + ", errCode = " + paramInt2);
      ExtControlProviderMsg.a(this.lQq.lQn).addRow(new Object[] { this.lQp, Integer.valueOf(2) });
      this.lQq.lQn.vf(4);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.provider.ExtControlProviderMsg.2.1
 * JD-Core Version:    0.6.2
 */