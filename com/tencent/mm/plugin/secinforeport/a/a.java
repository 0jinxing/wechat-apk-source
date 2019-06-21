package com.tencent.mm.plugin.secinforeport.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bbi;
import com.tencent.mm.protocal.protobuf.cvl;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.IOException;

public enum a
{
  private static b qjn;

  static
  {
    AppMethodBeat.i(126177);
    qjm = new a("INSTANCE");
    qjo = new a[] { qjm };
    qjn = new a.1();
    AppMethodBeat.o(126177);
  }

  public static void D(int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(126176);
    ab.v("MicroMsg.ClipBordReport", "report reportMiniProgram %d, %d, %s, %s", new Object[] { Integer.valueOf(5), Integer.valueOf(paramInt), paramString1, paramString2 });
    bbi localbbi = new bbi();
    localbbi.csB = paramString1;
    localbbi.pQw = paramString2;
    paramString1 = null;
    try
    {
      paramString2 = localbbi.toByteArray();
      paramString1 = paramString2;
      qjn.a(5, "", paramInt, paramString1);
      AppMethodBeat.o(126176);
      return;
    }
    catch (IOException paramString2)
    {
      while (true)
        ab.w("MicroMsg.ClipBordReport", "getExtInfo exp %s", new Object[] { paramString2.getMessage() });
    }
  }

  public static void a(b paramb)
  {
    if (paramb != null)
      qjn = paramb;
  }

  public static void h(int paramInt1, String paramString, int paramInt2)
  {
    AppMethodBeat.i(126174);
    ab.v("MicroMsg.ClipBordReport", "report ClipboardOperation %d, %s, %d", new Object[] { Integer.valueOf(paramInt1), paramString, Integer.valueOf(paramInt2) });
    qjn.a(paramInt1, paramString, paramInt2, null);
    AppMethodBeat.o(126174);
  }

  public static void i(String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    AppMethodBeat.i(126175);
    ab.v("MicroMsg.ClipBordReport", "report ClipboardOperation %d, %s, %d, %d, %s", new Object[] { Integer.valueOf(3), paramString1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString2 });
    Object localObject = new cvl();
    ((cvl)localObject).wDR = paramInt2;
    ((cvl)localObject).xrw = paramString2;
    paramString2 = null;
    try
    {
      localObject = ((cvl)localObject).toByteArray();
      paramString2 = (String)localObject;
      qjn.a(3, paramString1, paramInt1, paramString2);
      AppMethodBeat.o(126175);
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
        ab.w("MicroMsg.ClipBordReport", "getExtInfo exp %s", new Object[] { localIOException.getMessage() });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.secinforeport.a.a
 * JD-Core Version:    0.6.2
 */