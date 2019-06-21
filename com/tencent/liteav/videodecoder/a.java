package com.tencent.liteav.videodecoder;

import android.view.Surface;
import com.tencent.liteav.basic.g.b;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;

public abstract interface a
{
  public abstract int config(Surface paramSurface);

  public abstract void decode(b paramb);

  public abstract boolean isHevc();

  public abstract void setListener(d paramd);

  public abstract void setNotifyListener(WeakReference<com.tencent.liteav.basic.d.a> paramWeakReference);

  public abstract int start(ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2, boolean paramBoolean1, boolean paramBoolean2);

  public abstract void stop();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.videodecoder.a
 * JD-Core Version:    0.6.2
 */