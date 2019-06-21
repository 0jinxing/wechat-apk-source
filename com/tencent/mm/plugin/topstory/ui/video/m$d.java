package com.tencent.mm.plugin.topstory.ui.video;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.i.c;
import com.tencent.mm.i.d;
import com.tencent.mm.i.g.a;
import com.tencent.mm.protocal.protobuf.chx;
import java.io.ByteArrayOutputStream;
import java.util.Map;

final class m$d
  implements g.a
{
  private m$d(m paramm)
  {
  }

  public final int a(String paramString, int paramInt, c paramc, d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(1750);
    if ((paramc != null) && (paramc.field_toltalLength > 0) && (this.sEW.sET.containsKey(paramString)))
    {
      paramd = (chx)this.sEW.sET.get(paramString);
      paramd.xhj = paramc.field_finishedLength;
      paramd.xhk = m.aa(paramc.field_finishedLength, paramc.field_toltalLength);
      paramd.xha = paramc.field_toltalLength;
      this.sEW.sET.put(paramString, paramd);
    }
    AppMethodBeat.o(1750);
    return 0;
  }

  public final void a(String paramString, ByteArrayOutputStream paramByteArrayOutputStream)
  {
  }

  public final byte[] l(String paramString, byte[] paramArrayOfByte)
  {
    return new byte[0];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.m.d
 * JD-Core Version:    0.6.2
 */