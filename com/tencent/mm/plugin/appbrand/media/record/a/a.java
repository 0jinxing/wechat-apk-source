package com.tencent.mm.plugin.appbrand.media.record.a;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.media.encode.M4aAudioFormatJni;
import com.tencent.mm.plugin.appbrand.media.record.j;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class a extends b
{
  private final int TIMEOUT_USEC = 100;
  int ilV = 2;
  private MediaCodec ilW;
  MediaCodec.BufferInfo mBufferInfo;
  private String mFilePath = "";

  public final boolean a(boolean paramBoolean, byte[] paramArrayOfByte, int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(105646);
    if (paramArrayOfByte == null)
    {
      ab.e("MicroMsg.Record.AACAudioEncoder", "pcm is null");
      AppMethodBeat.o(105646);
      paramBoolean = bool;
    }
    while (true)
    {
      return paramBoolean;
      if (this.ilW != null)
      {
        ab.i("MicroMsg.Record.AACAudioEncoder", "encodePCMToAAC endOfStream:%b", new Object[] { Boolean.valueOf(paramBoolean) });
        Object localObject1 = this.ilW.getInputBuffers();
        Object localObject2 = this.ilW.getOutputBuffers();
        paramInt = this.ilW.dequeueInputBuffer(100L);
        if (paramInt >= 0)
        {
          localObject1 = localObject1[paramInt];
          ((ByteBuffer)localObject1).clear();
          ((ByteBuffer)localObject1).put(paramArrayOfByte);
          ((ByteBuffer)localObject1).position(0);
          ((ByteBuffer)localObject1).limit(paramArrayOfByte.length);
          ab.i("MicroMsg.Record.AACAudioEncoder", "inputBufferIndex:%d, data length:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfByte.length) });
          if (paramBoolean)
          {
            this.ilW.queueInputBuffer(paramInt, 0, paramArrayOfByte.length, System.nanoTime(), 4);
            paramArrayOfByte = (byte[])localObject2;
            label169: paramInt = this.ilW.dequeueOutputBuffer(this.mBufferInfo, 100L);
            if (paramInt != -1)
              break label251;
            ab.d("MicroMsg.Record.AACAudioEncoder", "no output available, break");
          }
        }
        while (true)
        {
          label196: AppMethodBeat.o(105646);
          paramBoolean = true;
          break;
          this.ilW.queueInputBuffer(paramInt, 0, paramArrayOfByte.length, System.nanoTime(), 0);
          paramArrayOfByte = (byte[])localObject2;
          break label169;
          ab.e("MicroMsg.Record.AACAudioEncoder", "inputBufferIndex %d", new Object[] { Integer.valueOf(paramInt) });
          paramArrayOfByte = (byte[])localObject2;
          break label169;
          label251: if (paramInt == -3)
          {
            ab.e("MicroMsg.Record.AACAudioEncoder", "output buff change");
            paramArrayOfByte = this.ilW.getOutputBuffers();
            break label169;
          }
          if (paramInt == -2)
          {
            ab.e("MicroMsg.Record.AACAudioEncoder", "encoder output format changed: ".concat(String.valueOf(this.ilW.getOutputFormat())));
            break label169;
          }
          if (paramInt < 0)
          {
            ab.e("MicroMsg.Record.AACAudioEncoder", "unexpected result from encoder.dequeueOutputBuffer: %s", new Object[] { Integer.valueOf(paramInt) });
            break label169;
          }
          ab.i("MicroMsg.Record.AACAudioEncoder", "outputBufferIndex %d", new Object[] { Integer.valueOf(paramInt) });
          localObject1 = paramArrayOfByte[paramInt];
          if (localObject1 == null)
          {
            paramArrayOfByte = new RuntimeException("outputBuffer " + paramInt + " was null");
            AppMethodBeat.o(105646);
            throw paramArrayOfByte;
          }
          if ((this.mBufferInfo.flags & 0x2) != 0)
            ab.e("MicroMsg.Record.AACAudioEncoder", "flags is BUFFER_FLAG_CODEC_CONFIG, don't writ data into file");
          while (true)
          {
            this.ilW.releaseOutputBuffer(paramInt, false);
            if ((this.mBufferInfo.flags & 0x4) == 0)
              break;
            if (paramBoolean)
              break label516;
            ab.w("MicroMsg.Record.AACAudioEncoder", "reached end of stream unexpectedly");
            break label196;
            int i = this.mBufferInfo.size;
            localObject2 = new byte[i];
            ((ByteBuffer)localObject1).get((byte[])localObject2, 0, i);
            int j = M4aAudioFormatJni.writeAudioBuff((byte[])localObject2, i);
            e((byte[])localObject2, i, false);
            if (j == 0)
              ab.i("MicroMsg.Record.AACAudioEncoder", "writeAudioBuff buff ok,");
            else
              ab.i("MicroMsg.Record.AACAudioEncoder", "writeAudioBuff buff fail,");
          }
          label516: ab.e("MicroMsg.Record.AACAudioEncoder", "reach the end, and end to encode the data");
        }
      }
      ab.e("MicroMsg.Record.AACAudioEncoder", "mEncoder is null");
      AppMethodBeat.o(105646);
      paramBoolean = bool;
    }
  }

  public final void close()
  {
    AppMethodBeat.i(105648);
    ab.i("MicroMsg.Record.AACAudioEncoder", "close");
    if (this.ilW != null)
    {
      this.ilW.stop();
      this.ilW.release();
      this.ilW = null;
    }
    M4aAudioFormatJni.closeM4aFile();
    AppMethodBeat.o(105648);
  }

  public final void flush()
  {
    AppMethodBeat.i(105647);
    ab.i("MicroMsg.Record.AACAudioEncoder", "flush");
    e(new byte[0], 0, true);
    AppMethodBeat.o(105647);
  }

  public final boolean h(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool = false;
    AppMethodBeat.i(105645);
    ab.i("MicroMsg.Record.AACAudioEncoder", "init, filePath:%s, sampleRate:%d, channelCount:%d, bitRate:%d", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.mFilePath = paramString;
    try
    {
      ab.i("MicroMsg.Record.AACAudioEncoder", "initCodec");
      Object localObject = new android/media/MediaCodec$BufferInfo;
      ((MediaCodec.BufferInfo)localObject).<init>();
      this.mBufferInfo = ((MediaCodec.BufferInfo)localObject);
      localObject = MediaFormat.createAudioFormat(this.ilX, paramInt1, paramInt2);
      ((MediaFormat)localObject).setInteger("bitrate", paramInt3);
      ((MediaFormat)localObject).setInteger("aac-profile", this.ilV);
      this.ilW = MediaCodec.createEncoderByType(this.ilX);
      this.ilW.configure((MediaFormat)localObject, null, null, 1);
      this.ilW.start();
      ab.i("MicroMsg.Record.AACAudioEncoder", "encoder start to work");
      paramInt3 = 0;
      if (paramInt3 == -1)
      {
        ab.i("MicroMsg.Record.AACAudioEncoder", "initCodec  fail,");
        j.pk(21);
        AppMethodBeat.o(105645);
        return bool;
      }
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Record.AACAudioEncoder", localIOException, "initCodec", new Object[0]);
        paramInt3 = -1;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Record.AACAudioEncoder", localException, "initCodec", new Object[0]);
        paramInt3 = -1;
        continue;
        ab.i("MicroMsg.Record.AACAudioEncoder", "initCodec ok");
        if (M4aAudioFormatJni.createM4aFile(paramString, paramInt2, paramInt1, this.ilV) == 0)
        {
          ab.i("MicroMsg.Record.AACAudioEncoder", "createM4aFile m4a jni api ok,");
          AppMethodBeat.o(105645);
          bool = true;
        }
        else
        {
          ab.i("MicroMsg.Record.AACAudioEncoder", "createM4aFile m4a jni api fail,");
          j.pk(22);
          AppMethodBeat.o(105645);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.media.record.a.a
 * JD-Core Version:    0.6.2
 */