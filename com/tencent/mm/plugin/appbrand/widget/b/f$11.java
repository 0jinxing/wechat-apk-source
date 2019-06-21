package com.tencent.mm.plugin.appbrand.widget.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ipcinvoker.wx_extension.b.a;
import com.tencent.mm.protocal.protobuf.ckj;
import com.tencent.mm.sdk.platformtools.ab;

final class f$11
  implements b.a
{
  f$11(f paramf)
  {
  }

  public final void a(int paramInt1, int paramInt2, String paramString, b paramb)
  {
    AppMethodBeat.i(134263);
    if ((paramInt1 == 0) && (paramInt2 == 0) && (paramb != null) && (paramb.fsH.fsP != null) && ((paramb.fsH.fsP instanceof ckj)))
    {
      ab.i(f.TAG, "updateEvaluateCgi, request success");
      if (f.a(this.jck))
      {
        f.a(this.jck, 3, 1);
        AppMethodBeat.o(134263);
      }
    }
    while (true)
    {
      return;
      f.a(this.jck, 2, 1);
      AppMethodBeat.o(134263);
      continue;
      ab.e(f.TAG, "updateEvaluateCgi, request fail");
      if (f.a(this.jck))
      {
        f.a(this.jck, 3, 2);
        AppMethodBeat.o(134263);
      }
      else
      {
        f.a(this.jck, 2, 2);
        AppMethodBeat.o(134263);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.b.f.11
 * JD-Core Version:    0.6.2
 */