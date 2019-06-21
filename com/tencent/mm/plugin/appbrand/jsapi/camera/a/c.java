package com.tencent.mm.plugin.appbrand.jsapi.camera.a;

import android.graphics.Rect;
import com.tencent.mm.sdk.platformtools.al;

public abstract class c
{
  private boolean cAY = false;
  public c.a hHx;

  public final void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, Rect paramRect, int paramInt3)
  {
    if (this.cAY);
    while (true)
    {
      return;
      b localb = aDs();
      if (paramArrayOfByte != null)
        localb.hHl.aa(new b.1(localb, paramArrayOfByte, paramInt3, paramInt1, paramInt2, paramRect));
    }
  }

  protected abstract b aDs();

  public final void init()
  {
    aDs().init();
  }

  public final void release()
  {
    aDs().release();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.camera.a.c
 * JD-Core Version:    0.6.2
 */