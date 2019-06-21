package com.tencent.mm.plugin.mmsight.model.a;

import android.annotation.TargetApi;
import android.media.MediaCodec.BufferInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import java.nio.ByteBuffer;

@TargetApi(16)
public final class g extends h
{
  private int eTa = -1;

  public g(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
  }

  protected final boolean WF()
  {
    return true;
  }

  protected final void g(ByteBuffer paramByteBuffer, MediaCodec.BufferInfo paramBufferInfo)
  {
    AppMethodBeat.i(76572);
    if ((this.eTa >= 0) && (paramByteBuffer != null) && (paramBufferInfo != null) && (!this.ovY))
      SightVideoJNI.writeAACDataLock(this.eTa, paramByteBuffer, paramBufferInfo.size);
    AppMethodBeat.o(76572);
  }

  public final int q(int paramInt, String paramString)
  {
    AppMethodBeat.i(76571);
    this.eTa = paramInt;
    paramInt = super.q(paramInt, paramString);
    AppMethodBeat.o(76571);
    return paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.a.g
 * JD-Core Version:    0.6.2
 */