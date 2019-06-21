package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.sdk.d.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import org.json.JSONObject;

final class q$1 extends c
{
  q$1(q paramq)
  {
  }

  public final void enter()
  {
    AppMethodBeat.i(129350);
    super.enter();
    ab.i("MicroMsg.LibIncrementalTestCase[incremental]", "WriteMockLibInfo enter");
    String str = an.avT();
    if (bo.isNullOrNil(str))
    {
      q.a(this.gSK, "!!MockLibInfo Path Error!!");
      AppMethodBeat.o(129350);
    }
    while (true)
    {
      return;
      try
      {
        Object localObject = new org/json/JSONObject;
        ((JSONObject)localObject).<init>();
        ((JSONObject)localObject).put("version", q.a(this.gSK));
        File localFile = new java/io/File;
        localFile.<init>(str);
        localFile.delete();
        localFile.createNewFile();
        localObject = ((JSONObject)localObject).toString().getBytes("UTF-8");
        int i = e.b(localFile.getAbsolutePath(), (byte[])localObject, localObject.length);
        if (i == 0)
          break label170;
        q.a(this.gSK, "MockLibInfo Write Error ".concat(String.valueOf(i)));
        AppMethodBeat.o(129350);
      }
      catch (Exception localException)
      {
        q.a(this.gSK, "MockLibInfo Write Exception " + localException.getMessage());
        AppMethodBeat.o(129350);
      }
      continue;
      label170: q.a(this.gSK, q.b(this.gSK));
      AppMethodBeat.o(129350);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.q.1
 * JD-Core Version:    0.6.2
 */