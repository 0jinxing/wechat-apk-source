package com.tencent.mm.media.widget.b;

import a.f.b.j;
import a.l;
import android.annotation.TargetApi;
import android.media.MediaCodec.BufferInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.model.a.h;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import java.nio.ByteBuffer;
import org.xwalk.core.Log;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/widget/recorder/AACMediaCodecBufIdRecorder;", "Lcom/tencent/mm/plugin/mmsight/model/encode/MMSightAACMediaCodecRecorder;", "sampleRate", "", "bitrate", "(II)V", "TAG", "", "bufId", "init", "bufferId", "tempPath", "isIgnoreCodecConfig", "", "processOutputBuffer", "", "outputBuffer", "Ljava/nio/ByteBuffer;", "bufferInfo", "Landroid/media/MediaCodec$BufferInfo;", "plugin-mediaeditor_release"})
@TargetApi(16)
public final class a extends h
{
  private final String TAG = "MicroMsg.MMSightAACMediaCodecBufIdRecorder";
  private int eTa = -1;

  public a(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
  }

  public final boolean WF()
  {
    return true;
  }

  public final void g(ByteBuffer paramByteBuffer, MediaCodec.BufferInfo paramBufferInfo)
  {
    AppMethodBeat.i(13316);
    if ((this.eTa >= 0) && (paramByteBuffer != null) && (paramBufferInfo != null) && (!this.ovY))
    {
      Log.d(this.TAG, "writeAACData  ,bufferInfo.size : " + paramBufferInfo.size);
      SightVideoJNI.writeAACDataLock(this.eTa, paramByteBuffer, paramBufferInfo.size);
    }
    AppMethodBeat.o(13316);
  }

  public final int q(int paramInt, String paramString)
  {
    AppMethodBeat.i(13315);
    j.p(paramString, "tempPath");
    Log.d(this.TAG, "bufferId:" + paramInt + " ,tempPath:" + paramString);
    this.eTa = paramInt;
    paramInt = super.q(paramInt, paramString);
    AppMethodBeat.o(13315);
    return paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.widget.b.a
 * JD-Core Version:    0.6.2
 */