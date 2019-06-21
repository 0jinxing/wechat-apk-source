package com.tencent.tencentmap.mapsdk.maps.a;

import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

public final class bx
{
  private static Handler a;

  static
  {
    AppMethodBeat.i(98602);
    a = bt.j();
    AppMethodBeat.o(98602);
  }

  public static void a(String paramString1, int paramInt1, int paramInt2, String paramString2, Map<String, String> paramMap1, Map<String, String> paramMap2, boolean paramBoolean)
  {
    AppMethodBeat.i(98600);
    a.post(new bz(paramString1, paramInt1, paramInt2, paramString2, paramMap1, paramMap2, paramBoolean));
    AppMethodBeat.o(98600);
  }

  public static boolean a(String paramString1, int paramInt1, int paramInt2, String paramString2, Map<String, String> paramMap1, Map<String, String> paramMap2, boolean paramBoolean, int paramInt3)
  {
    AppMethodBeat.i(98599);
    boolean bool = ce.a.a(1);
    if (bool)
      a.post(new by(paramString1, paramInt1, paramInt2, paramString2, paramMap1, paramMap2, paramBoolean, 1));
    AppMethodBeat.o(98599);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.bx
 * JD-Core Version:    0.6.2
 */