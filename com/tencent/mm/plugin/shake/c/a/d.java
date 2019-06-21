package com.tencent.mm.plugin.shake.c.a;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Map;

public final class d
{
  public float ecs;
  public float ect;
  Map<String, Object> kaV;
  int qsn;
  long qso;
  String qsp;

  public d()
  {
    AppMethodBeat.i(24517);
    this.kaV = new HashMap();
    this.qsn = 0;
    this.qso = 0L;
    this.ecs = -85.0F;
    this.ect = -1000.0F;
    this.qsp = "";
    this.kaV.clear();
    AppMethodBeat.o(24517);
  }

  public final void putValue(String paramString, Object paramObject)
  {
    AppMethodBeat.i(24518);
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(24518);
    while (true)
    {
      return;
      this.kaV.put(paramString, paramObject);
      AppMethodBeat.o(24518);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.c.a.d
 * JD-Core Version:    0.6.2
 */