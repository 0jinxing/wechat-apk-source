package com.tencent.mm.plugin.mmsight.model.a;

import android.annotation.TargetApi;
import android.media.MediaCodec.BufferInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.nio.ByteBuffer;

@TargetApi(16)
public final class q extends r
{
  protected int eTa = -1;

  public q(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean)
  {
    super(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramBoolean);
  }

  public final void clear()
  {
    AppMethodBeat.i(76669);
    super.clear();
    SightVideoJNI.releaseBigSightDataBufferLock(this.eTa);
    AppMethodBeat.o(76669);
  }

  public final int ew(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(76667);
    this.eTa = paramInt1;
    paramInt1 = super.ew(paramInt1, paramInt2);
    AppMethodBeat.o(76667);
    return paramInt1;
  }

  protected final void g(ByteBuffer paramByteBuffer, MediaCodec.BufferInfo paramBufferInfo)
  {
    AppMethodBeat.i(76668);
    if ((this.eTa >= 0) && (paramByteBuffer != null) && (paramBufferInfo != null) && (paramBufferInfo.size == paramByteBuffer.limit() - paramByteBuffer.position()))
    {
      long l = bo.yz();
      SightVideoJNI.writeH264DataLock(this.eTa, paramByteBuffer, paramBufferInfo.size);
      ab.i("MicroMsg.MMSightYUVMediaCodecBufIdRecorder", "writeH264Data used %sms, size: %s %s", new Object[] { Long.valueOf(bo.az(l)), Integer.valueOf(paramBufferInfo.size), Integer.valueOf(paramByteBuffer.capacity()) });
    }
    AppMethodBeat.o(76668);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.a.q
 * JD-Core Version:    0.6.2
 */