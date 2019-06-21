package com.tencent.mm.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.loader.j.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.tinker.entry.ApplicationLike;
import com.tencent.tinker.loader.TinkerRuntimeException;
import com.tencent.tinker.loader.shareutil.ShareIntentUtil;
import java.util.HashMap;

public final class k
{
  static ApplicationLike cdV;
  static String cev = "";
  String cew;
  String cex;
  long cey;
  long cez;

  public k(ApplicationLike paramApplicationLike)
  {
    cdV = paramApplicationLike;
    b.cdV = paramApplicationLike;
  }

  static void a(ApplicationLike paramApplicationLike)
  {
    AppMethodBeat.i(115033);
    if (paramApplicationLike == null)
    {
      AppMethodBeat.o(115033);
      return;
    }
    if ((paramApplicationLike == null) || (paramApplicationLike.getApplication() == null))
    {
      paramApplicationLike = new TinkerRuntimeException("tinkerApplication is null");
      AppMethodBeat.o(115033);
      throw paramApplicationLike;
    }
    paramApplicationLike = paramApplicationLike.getTinkerResultIntent();
    if ((paramApplicationLike != null) && (ShareIntentUtil.be(paramApplicationLike) == 0));
    for (paramApplicationLike = ShareIntentUtil.bk(paramApplicationLike); ; paramApplicationLike = null)
    {
      if (paramApplicationLike != null)
      {
        a.eSh = (String)paramApplicationLike.get("patch.rev");
        ab.w("MicroMsg.MMApplicationLikeImpl", "application set patch rev:%s", new Object[] { a.eSh });
      }
      AppMethodBeat.o(115033);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.k
 * JD-Core Version:    0.6.2
 */