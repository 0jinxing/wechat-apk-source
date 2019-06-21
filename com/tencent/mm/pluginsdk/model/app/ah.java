package com.tencent.mm.pluginsdk.model.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.s.a.a;
import com.tencent.mm.plugin.s.a.a.a;
import com.tencent.mm.protocal.protobuf.bxn;
import com.tencent.mm.protocal.protobuf.bxo;
import com.tencent.mm.sdk.platformtools.ab;

public final class ah extends x
{
  private int cmdId;
  private String vcC;

  public ah(String paramString1, String paramString2)
  {
    AppMethodBeat.i(27366);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bxn();
    ((b.a)localObject).fsK = new bxo();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/setappsetting";
    ((b.a)localObject).fsI = 396;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.lty = ((b.a)localObject).acD();
    localObject = (bxn)this.lty.fsG.fsP;
    ((bxn)localObject).mZr = paramString1;
    ((bxn)localObject).wXy = 0;
    ((bxn)localObject).wXz = paramString2;
    this.cmdId = 0;
    this.vcC = paramString2;
    AppMethodBeat.o(27366);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(27367);
    ab.i("MicroMsg.NetSceneSetAppSetting", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    if ((paramInt2 == 0) && (paramInt2 == 0))
    {
      paramq = (bxo)this.lty.fsH.fsP;
      if (paramq != null)
      {
        paramArrayOfByte = a.a.bYQ().bYO();
        paramString = g.bT(paramq.mZr, false);
        if (paramString != null)
        {
          paramString.field_authFlag = paramq.vGY;
          boolean bool = paramArrayOfByte.a(paramString, new String[0]);
          ab.d("MicroMsg.NetSceneSetAppSetting", "onGYNetEnd, update ret = " + bool + ", appId = " + paramq.mZr);
        }
      }
    }
    AppMethodBeat.o(27367);
  }

  public final void bG(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(27369);
    if (paramArrayOfByte == null)
    {
      ab.e("MicroMsg.NetSceneSetAppSetting", "buf is null");
      AppMethodBeat.o(27369);
    }
    while (true)
    {
      return;
      try
      {
        this.lty.fsH.P(paramArrayOfByte);
        AppMethodBeat.o(27369);
      }
      catch (Exception paramArrayOfByte)
      {
        ab.e("MicroMsg.NetSceneSetAppSetting", "parse error: " + paramArrayOfByte.getMessage());
        ab.printErrStackTrace("MicroMsg.NetSceneSetAppSetting", paramArrayOfByte, "", new Object[0]);
        AppMethodBeat.o(27369);
      }
    }
  }

  public final byte[] dhj()
  {
    AppMethodBeat.i(27368);
    try
    {
      byte[] arrayOfByte = ((b.b)this.lty.acF()).ZT();
      AppMethodBeat.o(27368);
      return arrayOfByte;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.NetSceneSetAppSetting", "toProtBuf failed: " + localException.getMessage());
        Object localObject = null;
        AppMethodBeat.o(27368);
      }
    }
  }

  public final int getType()
  {
    return 2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.ah
 * JD-Core Version:    0.6.2
 */