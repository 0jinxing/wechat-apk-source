package com.tencent.mm.plugin.webview.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.plugin.record.b;
import com.tencent.mm.protocal.protobuf.azw;
import com.tencent.mm.protocal.protobuf.cst;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ah;
import java.io.File;

final class b$g
{
  public String cBF;
  public long interval;
  public int scene;
  public long ufA;
  public int ufH;

  public b$g()
  {
    this.scene = 0;
    this.cBF = "";
    this.interval = 0L;
    this.ufA = 0L;
    this.ufH = 0;
  }

  public b$g(cst paramcst, int paramInt)
  {
    AppMethodBeat.i(5685);
    this.scene = 0;
    this.cBF = "";
    this.interval = 0L;
    this.ufA = 0L;
    this.ufH = 0;
    this.scene = 201;
    this.cBF = paramcst.cBF;
    this.interval = paramcst.eCL;
    this.ufA = (System.currentTimeMillis() / 1000L);
    this.ufH = paramInt;
    AppMethodBeat.o(5685);
  }

  static String Iv(int paramInt)
  {
    AppMethodBeat.i(5687);
    String str = aa.gw(ah.getContext());
    str = "SearchGuide_" + paramInt + "-" + str;
    AppMethodBeat.o(5687);
    return str;
  }

  public static g cWn()
  {
    AppMethodBeat.i(5686);
    Object localObject1 = new File(b.XZ(), Iv(201));
    localObject1 = e.e(((File)localObject1).getAbsolutePath(), 0, (int)((File)localObject1).length());
    try
    {
      localazw = new com/tencent/mm/protocal/protobuf/azw;
      localazw.<init>();
      localazw.parseFrom((byte[])localObject1);
      localObject1 = new com/tencent/mm/plugin/webview/fts/b$g;
      ((g)localObject1).<init>();
    }
    catch (Exception localException1)
    {
      try
      {
        azw localazw;
        ((g)localObject1).scene = localazw.Scene;
        ((g)localObject1).cBF = localazw.vOy;
        ((g)localObject1).interval = localazw.wDF;
        ((g)localObject1).ufA = localazw.wDE;
        ((g)localObject1).ufH = localazw.wDG;
        while (true)
        {
          label99: AppMethodBeat.o(5686);
          return localObject1;
          localException1 = localException1;
          Object localObject2 = null;
        }
      }
      catch (Exception localException2)
      {
        break label99;
      }
    }
  }

  public final boolean isExpired()
  {
    AppMethodBeat.i(5688);
    boolean bool;
    if (this.ufA + this.interval <= System.currentTimeMillis() / 1000L)
    {
      bool = true;
      AppMethodBeat.o(5688);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(5688);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.fts.b.g
 * JD-Core Version:    0.6.2
 */