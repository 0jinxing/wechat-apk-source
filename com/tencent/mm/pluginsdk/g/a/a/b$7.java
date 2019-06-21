package com.tencent.mm.pluginsdk.g.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.g.a.c.q;
import com.tencent.mm.pluginsdk.g.a.c.q.a;
import com.tencent.mm.pluginsdk.g.a.c.s;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;

final class b$7
  implements Runnable
{
  b$7(b paramb, int paramInt1, int paramInt2, String paramString, int paramInt3)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(79475);
    b localb = this.vdR;
    int i = this.nWD;
    int j = this.nWE;
    String str = this.val$filePath;
    int k = this.veb;
    Object localObject = i.gN(i, j);
    localObject = q.a.diy().ajg((String)localObject);
    if (localObject == null)
      AppMethodBeat.o(79475);
    while (true)
    {
      return;
      boolean bool = ((s)localObject).field_fileUpdated;
      ((s)localObject).field_fileUpdated = false;
      q.a.diy().h((s)localObject);
      if (k == bo.getInt(((s)localObject).field_fileVersion, 0))
      {
        if (q.a.diy().handler == null)
        {
          ab.f("MicroMsg.ResDownloader.CheckResUpdateHelper", "sendEventFileCached: get null eventThread ");
          AppMethodBeat.o(79475);
        }
        else
        {
          q.a.diy().handler.post(new b.8(localb, i, j, str, k, bool));
        }
      }
      else
        AppMethodBeat.o(79475);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.g.a.a.b.7
 * JD-Core Version:    0.6.2
 */