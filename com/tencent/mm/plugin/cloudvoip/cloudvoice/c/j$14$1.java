package com.tencent.mm.plugin.cloudvoip.cloudvoice.c;

import android.annotation.SuppressLint;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.protocal.protobuf.awk;
import com.tencent.mm.sdk.platformtools.ab;

final class j$14$1
  implements Runnable
{
  j$14$1(j.14 param14, int paramInt1, int paramInt2, b paramb, String paramString)
  {
  }

  @SuppressLint({"DefaultLocale"})
  public final void run()
  {
    AppMethodBeat.i(135535);
    if ((this.crc != 0) || (this.crd != 0) || (this.fuz.fsH.fsP == null))
    {
      ab.e("MicroMsg.OpenVoice.OpenVoiceService", "hy: getroomId fail, errType:" + this.crc + ",errCode:" + this.crd);
      j.a(this.kAZ.kAJ, this.kAZ.kAR, -10088, -10, String.format("join room failed. errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(this.crc), Integer.valueOf(this.crd), this.ftO }));
      AppMethodBeat.o(135535);
    }
    while (true)
    {
      return;
      awk localawk = (awk)this.fuz.fsH.fsP;
      j.a(this.kAZ.kAJ, localawk.wbj);
      j.a(this.kAZ.kAJ, j.g(this.kAZ.kAJ), this.kAZ.kAR);
      AppMethodBeat.o(135535);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cloudvoip.cloudvoice.c.j.14.1
 * JD-Core Version:    0.6.2
 */