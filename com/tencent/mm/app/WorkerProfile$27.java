package com.tencent.mm.app;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.n.a.a;
import java.util.HashMap;
import java.util.Map;

final class WorkerProfile$27
  implements a.a
{
  final Map<String, Integer> cgf;
  final Map<String, Integer> map;

  WorkerProfile$27(Context paramContext)
  {
    AppMethodBeat.i(138597);
    this.map = new HashMap();
    this.cgf = new HashMap();
    AppMethodBeat.o(138597);
  }

  public final String jdMethod_do(String paramString)
  {
    AppMethodBeat.i(138598);
    if (this.map.containsKey(paramString))
    {
      paramString = this.val$context.getString(((Integer)this.map.get(paramString)).intValue());
      AppMethodBeat.o(138598);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(138598);
    }
  }

  public final String dp(String paramString)
  {
    AppMethodBeat.i(138599);
    if (this.cgf.containsKey(paramString))
    {
      paramString = this.val$context.getString(((Integer)this.cgf.get(paramString)).intValue());
      AppMethodBeat.o(138599);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(138599);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.WorkerProfile.27
 * JD-Core Version:    0.6.2
 */