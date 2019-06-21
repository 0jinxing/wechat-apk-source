package com.tencent.mm.plugin.appbrand.jsapi.camera.a;

import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class b
{
  AtomicBoolean hHj = new AtomicBoolean(false);
  b.a hHk;
  al hHl = new al("MicroMsg.appbrand.ScanDecoder");

  public b(b.a parama)
  {
    this.hHk = parama;
  }

  protected final void b(String paramString, int paramInt, byte[] paramArrayOfByte)
  {
    ab.d("MicroMsg.appbrand.ScanDecoder", "result:%b, resultText:%s, resultType:%d, codeType:%d, codeVersion:%d", new Object[] { Boolean.TRUE, paramString, Integer.valueOf(paramInt), Integer.valueOf(0), Integer.valueOf(0) });
    al.d(new b.2(this, paramInt, paramString, paramArrayOfByte));
  }

  abstract boolean b(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3);

  abstract void init();

  abstract void release();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.camera.a.b
 * JD-Core Version:    0.6.2
 */