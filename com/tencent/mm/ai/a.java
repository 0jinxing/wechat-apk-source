package com.tencent.mm.ai;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ci.f;
import com.tencent.mm.ci.g;
import com.tencent.mm.protocal.protobuf.btd;
import com.tencent.mm.vending.g.c.a;
import com.tencent.mm.vending.g.e;
import junit.framework.Assert;

public class a<_Resp extends btd>
{
  public b ehh;
  a.b<_Resp> fsv;
  private f<a.a<_Resp>> fsw;

  public a()
  {
    AppMethodBeat.i(58154);
    this.fsv = new a.b(this);
    AppMethodBeat.o(58154);
  }

  protected void a(int paramInt1, int paramInt2, String paramString, _Resp param_Resp, m paramm)
  {
  }

  public final void a(b paramb)
  {
    this.ehh = paramb;
  }

  public f<a.a<_Resp>> acy()
  {
    try
    {
      AppMethodBeat.i(58155);
      Assert.assertNotNull("You should set a CommReqResp!", this.ehh);
      Assert.assertTrue("RunCgi NetSceneQueue not ready!", w.adF());
      if (this.fsw == null)
      {
        localObject1 = new com/tencent/mm/ai/a$1;
        ((a.1)localObject1).<init>(this);
        this.fsw = g.c((c.a)localObject1);
      }
      Object localObject1 = this.fsw;
      AppMethodBeat.o(58155);
      return localObject1;
    }
    finally
    {
    }
  }

  public final void cancel()
  {
    AppMethodBeat.i(58153);
    if (this.fsv != null)
      w.c(this.fsv);
    if (this.fsw != null)
      this.fsw.a(true);
    AppMethodBeat.o(58153);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ai.a
 * JD-Core Version:    0.6.2
 */