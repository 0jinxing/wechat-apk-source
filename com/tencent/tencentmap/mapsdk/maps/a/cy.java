package com.tencent.tencentmap.mapsdk.maps.a;

import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;

public final class cy extends de
{
  public final boolean a(byte[] paramArrayOfByte, int paramInt1, boolean paramBoolean, Object paramObject, de.a parama, int paramInt2)
  {
    AppMethodBeat.i(98685);
    long l = SystemClock.elapsedRealtime();
    this.b = parama;
    this.a = paramObject;
    parama = new HashMap();
    parama.put("B-Length", String.valueOf(paramInt1));
    if (paramInt2 == 1)
      paramObject = "devlog";
    while (true)
    {
      parama.put("HLReportCmd", paramObject);
      paramArrayOfByte = cs.a("https://up-hl.3g.qq.com/upreport", false, parama, paramArrayOfByte, 20000, eu.d(), false, null);
      paramArrayOfByte.p = false;
      paramArrayOfByte.a("event");
      paramArrayOfByte = new cz(this, paramArrayOfByte, l);
      try
      {
        ch.a().b().execute(paramArrayOfByte);
        paramBoolean = true;
        AppMethodBeat.o(98685);
        return paramBoolean;
        if (paramBoolean)
        {
          paramObject = "realtime_speed";
          continue;
        }
        paramObject = "hllog";
      }
      catch (Throwable paramArrayOfByte)
      {
        while (true)
        {
          this.b.a(false, this.a);
          paramBoolean = false;
          AppMethodBeat.o(98685);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.cy
 * JD-Core Version:    0.6.2
 */