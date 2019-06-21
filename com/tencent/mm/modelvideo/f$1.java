package com.tencent.mm.modelvideo;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.i.c;
import com.tencent.mm.i.d;
import com.tencent.mm.i.g.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.ByteArrayOutputStream;

final class f$1
  implements g.a
{
  f$1(f paramf)
  {
  }

  public final int a(String paramString, int paramInt, c paramc, d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(50682);
    if (paramInt != 0)
    {
      ab.w("MicroMsg.NetScenePreloadVideoFake", "%d preload video error startRet[%d]", new Object[] { Integer.valueOf(this.fVD.hashCode()), Integer.valueOf(paramInt) });
      if (this.fVD.fVC != null)
        this.fVD.fVC.a(this.fVD, false, 0, 0);
    }
    if (paramc != null)
      ab.d("MicroMsg.NetScenePreloadVideoFake", "%d preload video[%d %d] mediaId[%s]", new Object[] { Integer.valueOf(this.fVD.hashCode()), Integer.valueOf(paramc.field_finishedLength), Integer.valueOf(paramc.field_toltalLength), paramString });
    if (paramd != null)
    {
      ab.i("MicroMsg.NetScenePreloadVideoFake", "%d preload video error [%d]", new Object[] { Integer.valueOf(this.fVD.hashCode()), Integer.valueOf(paramd.field_retCode) });
      if (paramd.field_retCode == 0)
        break label205;
      if (this.fVD.fVC != null)
        this.fVD.fVC.a(this.fVD, false, 0, 0);
    }
    while (true)
    {
      AppMethodBeat.o(50682);
      return 0;
      label205: ab.i("MicroMsg.NetScenePreloadVideoFake", "%d preload video download all video file", new Object[] { Integer.valueOf(this.fVD.hashCode()) });
      this.fVD.f(this.fVD.fVw, paramd.field_fileLength, this.fVD.egB);
    }
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
 * Qualified Name:     com.tencent.mm.modelvideo.f.1
 * JD-Core Version:    0.6.2
 */