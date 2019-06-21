package com.tencent.liteav.audio.impl.Record;

import android.content.Context;
import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.liteav.audio.d;
import com.tencent.liteav.audio.impl.TXCTraeJNI;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

public class g extends c
{
  public boolean isRecording()
  {
    AppMethodBeat.i(66639);
    boolean bool = TXCTraeJNI.nativeTraeIsRecording();
    AppMethodBeat.o(66639);
    return bool;
  }

  public void sendCustomPCMData(byte[] paramArrayOfByte)
  {
  }

  public void setChangerType(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(66641);
    super.setChangerType(paramInt1, paramInt2);
    TXCTraeJNI.nativeTraeSetChangerType(paramInt1, paramInt2);
    AppMethodBeat.o(66641);
  }

  public void setMute(boolean paramBoolean)
  {
    AppMethodBeat.i(66643);
    super.setMute(paramBoolean);
    TXCTraeJNI.nativeTraeSetRecordMute(paramBoolean);
    this.mIsMute = paramBoolean;
    AppMethodBeat.o(66643);
  }

  public void setReverbType(int paramInt)
  {
    AppMethodBeat.i(66640);
    super.setReverbType(paramInt);
    TXCTraeJNI.nativeTraeSetRecordReverb(paramInt);
    AppMethodBeat.o(66640);
  }

  public void setVolume(float paramFloat)
  {
    AppMethodBeat.i(66642);
    super.setVolume(paramFloat);
    TXCTraeJNI.nativeTraeSetVolume(paramFloat);
    AppMethodBeat.o(66642);
  }

  public int startRecord(Context paramContext)
  {
    AppMethodBeat.i(66637);
    TXCLog.i("AudioCenter:TXCAudioTraeRecordController", "trae startRecord");
    super.startRecord(paramContext);
    TXCTraeJNI.InitTraeEngineLibrary(this.mContext);
    TXCTraeJNI.setTraeRecordListener(this.mWeakRecordListener);
    TXCTraeJNI.nativeTraeStartRecord(paramContext, this.mSampleRate, this.mChannels, this.mBits);
    TXCTraeJNI.nativeTraeSetChangerType(this.mVoiceKind, this.mVoiceEnvironment);
    if ((this.mWeakRecordListener != null) && (this.mWeakRecordListener.get() != null))
    {
      paramContext = "TRAE-AEC,采样率(" + this.mSampleRate + "|" + this.mSampleRate + "),声道数" + this.mChannels;
      ((d)this.mWeakRecordListener.get()).a(TXEAudioDef.TXE_AUDIO_NOTIFY_AUDIO_INFO, paramContext);
    }
    AppMethodBeat.o(66637);
    return 0;
  }

  public int stopRecord()
  {
    AppMethodBeat.i(66638);
    TXCLog.i("AudioCenter:TXCAudioTraeRecordController", "trae stopRecord");
    TXCTraeJNI.nativeTraeStopRecord(true);
    TXCTraeJNI.setTraeRecordListener(null);
    AppMethodBeat.o(66638);
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.audio.impl.Record.g
 * JD-Core Version:    0.6.2
 */