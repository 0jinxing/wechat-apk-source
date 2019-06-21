package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.plugin.sns.storage.x;
import com.tencent.mm.plugin.sns.storage.y;
import com.tencent.mm.protocal.protobuf.ala;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Map;

final class m$3
  implements w.a
{
  m$3(m paramm, String paramString, int paramInt, x paramx)
  {
  }

  public final int a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.b paramb, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(37790);
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      ab.e("OpenCanvasMgr", "cgi fail pageid %s,preLoad %d, errType %d,errCode %d", new Object[] { this.reU, Integer.valueOf(this.reS), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      AppMethodBeat.o(37790);
    }
    while (true)
    {
      return 0;
      paramString = ((ala)paramb.fsH.fsP).wqz.dlY();
      ab.i("OpenCanvasMgr", "getCanvasInfo pageid %s ,xml %s", new Object[] { this.reU, paramString });
      if (!TextUtils.isEmpty(paramString))
      {
        m.d(this.reQ).put(this.reU, paramString);
        this.reV.field_canvasXml = paramString;
        m.e(this.reQ).a(this.reV);
      }
      AppMethodBeat.o(37790);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.m.3
 * JD-Core Version:    0.6.2
 */