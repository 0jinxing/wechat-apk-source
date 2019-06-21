package com.tencent.mm.plugin.appbrand.dynamic.c;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.f;

final class a$1
  implements Runnable
{
  a$1(a parama, String[] paramArrayOfString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(10793);
    String str1 = "com.tencent.mm";
    String str2 = str1;
    if (this.ewE.length > 2)
    {
      str2 = str1;
      if (!TextUtils.isEmpty(this.ewE[2]))
        str2 = "com.tencent.mm" + ":" + this.ewE[2];
    }
    f.a(str2, null, a.a.class, null);
    AppMethodBeat.o(10793);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.c.a.1
 * JD-Core Version:    0.6.2
 */