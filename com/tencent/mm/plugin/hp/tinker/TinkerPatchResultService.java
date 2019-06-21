package com.tencent.mm.plugin.hp.tinker;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelmulti.l;
import com.tencent.mm.plugin.hp.b.b.a;
import com.tencent.mm.plugin.hp.b.b.b;
import com.tencent.mm.plugin.hp.d.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.tinker.entry.ApplicationLike;
import com.tencent.tinker.lib.service.DefaultTinkerResultService;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import java.io.File;
import java.util.Properties;

public class TinkerPatchResultService extends DefaultTinkerResultService
{
  public final void a(com.tencent.tinker.lib.service.a parama)
  {
    AppMethodBeat.i(90663);
    if (parama == null)
    {
      com.tencent.tinker.lib.util.a.e("Tinker.TinkerPatchResultService", "TinkerPatchResultService received null result!!!!", new Object[0]);
      AppMethodBeat.o(90663);
    }
    while (true)
    {
      return;
      com.tencent.tinker.lib.util.a.i("Tinker.TinkerPatchResultService", "TinkerPatchResultService receive result: %s", new Object[] { parama.toString() });
      ab.i("Tinker.TinkerPatchResultService", "onPatchResult on service");
      Object localObject1 = c.S(new File(parama.ABv));
      if (localObject1 != null)
      {
        String str = f.CLIENT_VERSION;
        Object localObject2 = ((Properties)localObject1).getProperty("patch.client.ver");
        localObject1 = ((Properties)localObject1).getProperty("NEW_TINKER_ID");
        int i = b.b.ntx.value;
        if (parama.cxT)
        {
          j = b.a.ntv.value;
          label112: com.tencent.mm.plugin.hp.b.b.e(str, (String)localObject2, (String)localObject1, i, j);
          label123: new ak(Looper.getMainLooper()).postDelayed(new TinkerPatchResultService.1(this), 10000L);
          if (!parama.cxT)
            break label277;
          localObject2 = com.tencent.mm.app.b.cdV;
          if (!com.tencent.tinker.lib.e.b.c((ApplicationLike)localObject2))
            break label259;
          localObject2 = com.tencent.tinker.lib.e.b.d((ApplicationLike)localObject2);
          if ((ShareTinkerInternals.isNullOrNil((String)localObject2)) || (parama.ABw == null) || (!parama.ABw.equals(localObject2)))
            break label259;
        }
      }
      label259: for (int j = 0; ; j = 1)
      {
        if (j == 0)
          break label265;
        new l(ah.getContext(), new TinkerPatchResultService.2(this));
        AppMethodBeat.o(90663);
        break;
        j = b.a.ntu.value;
        break label112;
        ab.i("Tinker.TinkerPatchResultService", "onPatchResult properties is null.");
        break label123;
      }
      label265: com.tencent.tinker.lib.util.a.i("Tinker.TinkerPatchResultService", "I have already install the newly patch version!", new Object[0]);
      label277: AppMethodBeat.o(90663);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.hp.tinker.TinkerPatchResultService
 * JD-Core Version:    0.6.2
 */