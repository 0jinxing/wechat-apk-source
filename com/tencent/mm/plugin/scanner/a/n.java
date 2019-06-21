package com.tencent.mm.plugin.scanner.a;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.oq;
import com.tencent.mm.plugin.facedetect.model.r;
import com.tencent.mm.plugin.scanner.util.b.a;
import com.tencent.mm.plugin.scanner.util.d;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;

public final class n extends c<oq>
  implements b.a
{
  private boolean isDecoding;
  private d qaf;
  private r qag;

  public n()
  {
    AppMethodBeat.i(80873);
    this.qaf = null;
    this.isDecoding = false;
    this.qag = null;
    this.xxI = oq.class.getName().hashCode();
    AppMethodBeat.o(80873);
  }

  public final void K(Bundle paramBundle)
  {
  }

  public final void b(int paramInt1, String paramString, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(80874);
    ab.i("MicroMsg.RecogQBarInYUVListener", "hy: on decode success. result type: %d, result: %s, codeType: %d, codeVersion: %d", new Object[] { Integer.valueOf(paramInt1), paramString, Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.qag != null)
      this.qag.S(paramString, paramInt2, paramInt3);
    this.isDecoding = false;
    AppMethodBeat.o(80874);
  }

  public final void jJ(long paramLong)
  {
    AppMethodBeat.i(80875);
    ab.i("MicroMsg.RecogQBarInYUVListener", "hy: on qrcode decode failed");
    if (this.qag != null)
      this.qag.S("", -2, -1);
    this.isDecoding = false;
    AppMethodBeat.o(80875);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.a.n
 * JD-Core Version:    0.6.2
 */