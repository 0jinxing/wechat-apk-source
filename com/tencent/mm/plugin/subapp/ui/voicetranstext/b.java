package com.tencent.mm.plugin.subapp.ui.voicetranstext;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.aqd;
import com.tencent.mm.protocal.protobuf.aqe;
import com.tencent.mm.protocal.protobuf.bod;
import com.tencent.mm.protocal.protobuf.cof;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import junit.framework.Assert;

public final class b extends m
  implements k
{
  private final String TAG;
  private com.tencent.mm.ai.b fsB;
  private f oRe;
  private String svJ;
  public cof svR;
  public int svV;

  public b(String paramString)
  {
    AppMethodBeat.i(25580);
    this.TAG = "MicroMsg.NetSceneGetVoiceTransRes";
    this.svV = -1;
    if (!bo.isNullOrNil(paramString));
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      this.svJ = paramString;
      paramString = new b.a();
      paramString.fsJ = new aqd();
      paramString.fsK = new aqe();
      paramString.uri = "/cgi-bin/micromsg-bin/getvoicetransres";
      paramString.fsI = 548;
      paramString.fsL = 0;
      paramString.fsM = 0;
      this.fsB = paramString.acD();
      AppMethodBeat.o(25580);
      return;
    }
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(25581);
    this.oRe = paramf;
    ((aqd)this.fsB.fsG.fsP).vZx = this.svJ;
    int i = a(parame, this.fsB, this);
    AppMethodBeat.o(25581);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(25582);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (aqe)this.fsB.fsH.fsP;
      if (paramq.vZB != null)
        this.svV = paramq.vZB.wRe;
      this.svR = paramq.vZz;
    }
    while (true)
    {
      this.oRe.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(25582);
      return;
      ab.i("MicroMsg.NetSceneGetVoiceTransRes", "error get: errType:%d, errCode:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    }
  }

  public final boolean cDR()
  {
    AppMethodBeat.i(25583);
    boolean bool;
    if ((this.svR != null) && (!bo.isNullOrNil(this.svR.xlH)))
    {
      bool = true;
      AppMethodBeat.o(25583);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(25583);
    }
  }

  public final int getType()
  {
    return 548;
  }

  public final boolean isComplete()
  {
    boolean bool = true;
    if ((this.svR != null) && (this.svR.fJT == 1));
    while (true)
    {
      return bool;
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.voicetranstext.b
 * JD-Core Version:    0.6.2
 */