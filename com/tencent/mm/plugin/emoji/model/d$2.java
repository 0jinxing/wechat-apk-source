package com.tencent.mm.plugin.emoji.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.i.g.a;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.io.ByteArrayOutputStream;

final class d$2
  implements g.a
{
  d$2(d paramd, as paramas, EmojiInfo paramEmojiInfo, long paramLong)
  {
  }

  public final int a(String paramString, int paramInt, com.tencent.mm.i.c paramc, com.tencent.mm.i.d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(53032);
    if ((paramInt == 0) && (paramd != null) && (paramd.field_retCode == 0))
      this.kVl.kVd.a(true, new Object[] { this.kVm, this.kTI, Integer.valueOf(103), Long.valueOf(this.cgB) });
    AppMethodBeat.o(53032);
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.model.d.2
 * JD-Core Version:    0.6.2
 */