package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity.a;
import java.io.File;

final class f$1
  implements MMActivity.a
{
  f$1(f paramf, String[] paramArrayOfString)
  {
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(131297);
    paramIntent = this.hQj;
    paramInt1 = 0;
    while (true)
    {
      if (paramInt1 < paramIntent.length);
      try
      {
        File localFile = new java/io/File;
        localFile.<init>(paramIntent[paramInt1]);
        localFile.delete();
        label37: paramInt1++;
        continue;
        AppMethodBeat.o(131297);
        return;
      }
      catch (Exception localException)
      {
        break label37;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.f.1
 * JD-Core Version:    0.6.2
 */