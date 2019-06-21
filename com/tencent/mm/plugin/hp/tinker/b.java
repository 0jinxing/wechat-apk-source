package com.tencent.mm.plugin.hp.tinker;

import android.app.ActivityManager;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.app.u;
import com.tencent.mm.plugin.hp.b.b.a;
import com.tencent.mm.plugin.hp.b.b.b;
import com.tencent.mm.plugin.hp.d.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import java.io.File;
import java.util.Properties;

public final class b extends com.tencent.tinker.lib.b.a
{
  private final int nuc;

  public b(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(90628);
    this.nuc = ((ActivityManager)paramContext.getSystemService("activity")).getMemoryClass();
    com.tencent.tinker.lib.util.a.i("Tinker.TinkerPatchListener", "application maxMemory:" + this.nuc, new Object[0]);
    AppMethodBeat.o(90628);
  }

  public final int eI(String paramString1, String paramString2)
  {
    boolean bool = false;
    AppMethodBeat.i(90629);
    Object localObject = new File(paramString1);
    com.tencent.tinker.lib.util.a.i("Tinker.TinkerPatchListener", "receive a patch file: %s, file size:%d", new Object[] { paramString1, Long.valueOf(SharePatchFileUtil.ar((File)localObject)) });
    int i = super.eI(paramString1, paramString2);
    int j = i;
    if (i == 0)
    {
      if (this.nuc < 45)
        j = -23;
    }
    else
    {
      i = j;
      if (j == 0)
      {
        com.tencent.tinker.lib.e.a.iX(this.context);
        i = j;
        if (j == 0)
        {
          paramString1 = ShareTinkerInternals.S((File)localObject);
          if (paramString1 != null)
            break label259;
          i = -24;
        }
      }
      label113: j = i;
      if (i == 0)
      {
        j = i;
        if (ShareTinkerInternals.dSp())
        {
          j = i;
          if (u.b(new Throwable().getStackTrace()))
            j = -26;
        }
      }
      localObject = c.S((File)localObject);
      if (localObject == null)
        break label320;
      paramString1 = f.CLIENT_VERSION;
      paramString2 = ((Properties)localObject).getProperty("patch.client.ver");
      localObject = ((Properties)localObject).getProperty("NEW_TINKER_ID");
      int k = b.b.ntz.value;
      if (j != 0)
        break label309;
      i = b.a.ntv.value;
      label210: com.tencent.mm.plugin.hp.b.b.e(paramString1, paramString2, (String)localObject, k, i);
    }
    while (true)
    {
      if (j == 0)
        bool = true;
      com.tencent.mm.plugin.hp.b.b.ie(bool);
      AppMethodBeat.o(90629);
      return j;
      if (!c.bGz())
      {
        j = -21;
        break;
      }
      j = 0;
      break;
      label259: paramString1 = paramString1.getProperty("patch.basepack.client.ver");
      com.tencent.tinker.lib.util.a.i("Tinker.TinkerPatchListener", "get BASE_CLIENT_VERSION:".concat(String.valueOf(paramString1)), new Object[0]);
      if (paramString1 != null)
      {
        i = j;
        if (paramString1.equalsIgnoreCase(com.tencent.mm.loader.j.a.CLIENT_VERSION))
          break label113;
      }
      i = -25;
      break label113;
      label309: i = b.a.ntu.value;
      break label210;
      label320: ab.i("Tinker.TinkerPatchListener", "patchCheck properties is null.");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.hp.tinker.b
 * JD-Core Version:    0.6.2
 */