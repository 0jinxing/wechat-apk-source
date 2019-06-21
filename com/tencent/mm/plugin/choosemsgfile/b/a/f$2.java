package com.tencent.mm.plugin.choosemsgfile.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.at.d.a;
import com.tencent.mm.choosemsgfile.compat.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class f$2
  implements d.a
{
  f$2(f paramf)
  {
  }

  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject)
  {
    AppMethodBeat.i(54273);
    this.kug.bfk();
    AppMethodBeat.o(54273);
  }

  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject, int paramInt3, int paramInt4, m paramm)
  {
    AppMethodBeat.i(54271);
    ab.d("MicroMsg.MsgFileWorker_Image", "[onImgTaskProgress] offset:%s totalLen:%s", new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    this.kug.dL(paramInt3, paramInt4);
    AppMethodBeat.o(54271);
  }

  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject, int paramInt3, int paramInt4, String paramString, m paramm)
  {
    AppMethodBeat.i(54272);
    ab.i("MicroMsg.MsgFileWorker_Image", "[onImgTaskEnd] imgLocalId:%s msgLocalId:%s err[%s:%s:%s]", new Object[] { Long.valueOf(paramLong1), Long.valueOf(paramLong2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), paramString });
    paramObject = ((b)g.K(b.class)).d(f.a(this.kug));
    paramObject = ((b)g.K(b.class)).a(f.a(this.kug), paramObject);
    ab.i("MicroMsg.MsgFileWorker_Image", "imgPath:%s", new Object[] { paramObject });
    if (!bo.isNullOrNil(paramObject))
    {
      f.a(this.kug, paramObject);
      AppMethodBeat.o(54272);
    }
    while (true)
    {
      return;
      this.kug.bfk();
      AppMethodBeat.o(54272);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.b.a.f.2
 * JD-Core Version:    0.6.2
 */