package com.tinkerboots.sdk.tinker.b;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tinkerboots.sdk.b.d;
import java.io.File;

public final class b extends com.tencent.tinker.lib.b.a
{
  public b(Context paramContext)
  {
    super(paramContext);
  }

  public final int eI(String paramString1, String paramString2)
  {
    int i = 0;
    AppMethodBeat.i(65540);
    com.tencent.tinker.lib.util.a.i("Tinker.TinkerServerPatchListener", "receive a patch file: %s, file size:%d", new Object[] { paramString1, Long.valueOf(SharePatchFileUtil.ar(new File(paramString1))) });
    int j = super.eI(paramString1, paramString2);
    if (j == 0)
      if (!d.dWn());
    for (i = -20; ; i = j)
    {
      AppMethodBeat.o(65540);
      return i;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tinkerboots.sdk.tinker.b.b
 * JD-Core Version:    0.6.2
 */