package com.tencent.mm.plugin.zero;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.zero.a.f;
import com.tencent.mm.protocal.protobuf.tb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class c
{
  public static volatile com.tencent.mm.ci.c<f> vaf;
  private final f vag;

  public c()
  {
    AppMethodBeat.i(58772);
    if (vaf != null)
    {
      this.vag = ((f)vaf.get());
      AppMethodBeat.o(58772);
    }
    while (true)
    {
      return;
      this.vag = null;
      AppMethodBeat.o(58772);
    }
  }

  public final boolean a(tb paramtb, boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(58774);
    if (!g.RK())
    {
      ab.e("MicroMsg.SyncDoCmdDelegate", "account storage disabled, discard all commands");
      AppMethodBeat.o(58774);
      paramBoolean = bool;
    }
    while (true)
    {
      return paramBoolean;
      long l = bo.anU();
      byte[] arrayOfByte = aa.a(paramtb.wau);
      ab.i("MicroMsg.SyncDoCmdDelegate", "doCmd %d cmdid:%d buf:%d thr:[%d]", new Object[] { Long.valueOf(l), Integer.valueOf(paramtb.wat), Integer.valueOf(bo.cc(arrayOfByte)), Long.valueOf(Thread.currentThread().getId()) });
      if (bo.cb(arrayOfByte))
      {
        ab.e("MicroMsg.SyncDoCmdDelegate", "docmd: no protobuf found.");
        AppMethodBeat.o(58774);
        paramBoolean = bool;
      }
      else
      {
        try
        {
          if (this.vag != null)
            this.vag.a(paramtb, arrayOfByte, paramBoolean);
          ab.i("MicroMsg.SyncDoCmdDelegate", "doCmd FIN %d cmdid:%d Time:%d", new Object[] { Long.valueOf(l), Integer.valueOf(paramtb.wat), Long.valueOf(bo.gb(l)) });
          AppMethodBeat.o(58774);
          paramBoolean = true;
        }
        catch (Exception paramtb)
        {
          ab.printErrStackTrace("MicroMsg.SyncDoCmdDelegate", paramtb, "", new Object[0]);
          AppMethodBeat.o(58774);
          paramBoolean = bool;
        }
      }
    }
  }

  public final void ca(Object paramObject)
  {
    AppMethodBeat.i(58773);
    if (this.vag != null)
      this.vag.ca(paramObject);
    AppMethodBeat.o(58773);
  }

  public final void cc(Object paramObject)
  {
    AppMethodBeat.i(58775);
    if (this.vag != null)
      this.vag.cc(paramObject);
    AppMethodBeat.o(58775);
  }

  public final void cd(Object paramObject)
  {
    AppMethodBeat.i(58776);
    if (this.vag != null)
      this.vag.cd(paramObject);
    AppMethodBeat.o(58776);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.zero.c
 * JD-Core Version:    0.6.2
 */