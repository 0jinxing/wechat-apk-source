package com.tencent.mm.plugin.emojicapture.model.b;

import a.l;
import android.media.MediaCodec;
import android.media.MediaCodec.Callback;
import android.media.MediaCodec.CodecException;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.nio.ByteBuffer;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/emojicapture/model/mix/EmojiMixVideoDecoderAsync$codecCallback$1", "Landroid/media/MediaCodec$Callback;", "onError", "", "codec", "Landroid/media/MediaCodec;", "e", "Landroid/media/MediaCodec$CodecException;", "onInputBufferAvailable", "index", "", "onOutputBufferAvailable", "info", "Landroid/media/MediaCodec$BufferInfo;", "onOutputFormatChanged", "format", "Landroid/media/MediaFormat;", "plugin-emojicapture_release"})
public final class j$a extends MediaCodec.Callback
{
  public final void onError(MediaCodec paramMediaCodec, MediaCodec.CodecException paramCodecException)
  {
    AppMethodBeat.i(2692);
    a.f.b.j.p(paramMediaCodec, "codec");
    a.f.b.j.p(paramCodecException, "e");
    ab.printErrStackTrace(this.liV.TAG, (Throwable)paramCodecException, "onError", new Object[0]);
    AppMethodBeat.o(2692);
  }

  public final void onInputBufferAvailable(MediaCodec paramMediaCodec, int paramInt)
  {
    AppMethodBeat.i(2690);
    a.f.b.j.p(paramMediaCodec, "codec");
    ab.i(this.liV.TAG, "onInputBufferAvailable ".concat(String.valueOf(paramInt)));
    int i;
    long l;
    if ((paramInt >= 0) && (!this.liV.liS))
    {
      paramMediaCodec = this.liV.eTq;
      if (paramMediaCodec != null);
      for (paramMediaCodec = paramMediaCodec.getInputBuffer(paramInt); paramMediaCodec == null; paramMediaCodec = null)
      {
        ab.w(this.liV.TAG, "inputBuffer is null");
        AppMethodBeat.o(2690);
        return;
      }
      paramMediaCodec.clear();
      i = this.liV.clX.readSampleData(paramMediaCodec, 0);
      this.liV.clX.advance();
      paramMediaCodec.position(0);
      l = this.liV.clX.getSampleTime();
      ab.i(this.liV.TAG, "sampleTime: " + l + ", sampleSize: " + i);
      if (l > this.liV.liT)
        this.liV.liT = l;
      if ((i >= 0) && (l >= 0L))
        break label291;
      ab.i(this.liV.TAG, "read sample end");
    }
    label291: for (boolean bool = true; ; bool = false)
    {
      this.liV.liS = bool;
      paramMediaCodec = this.liV.eTq;
      if (paramMediaCodec != null)
      {
        if (this.liV.liS);
        for (int j = 4; ; j = 0)
        {
          paramMediaCodec.queueInputBuffer(paramInt, 0, i, l, j);
          AppMethodBeat.o(2690);
          break;
        }
      }
      AppMethodBeat.o(2690);
      break;
    }
  }

  // ERROR //
  public final void onOutputBufferAvailable(MediaCodec paramMediaCodec, int paramInt, android.media.MediaCodec.BufferInfo paramBufferInfo)
  {
    // Byte code:
    //   0: sipush 2689
    //   3: invokestatic 50	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_1
    //   7: ldc 51
    //   9: invokestatic 57	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
    //   12: aload_3
    //   13: ldc 175
    //   15: invokestatic 57	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
    //   18: aload_0
    //   19: getfield 38	com/tencent/mm/plugin/emojicapture/model/b/j$a:liV	Lcom/tencent/mm/plugin/emojicapture/model/b/j;
    //   22: getfield 62	com/tencent/mm/plugin/emojicapture/model/b/j:TAG	Ljava/lang/String;
    //   25: new 140	java/lang/StringBuilder
    //   28: dup
    //   29: ldc 177
    //   31: invokespecial 145	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   34: iload_2
    //   35: invokevirtual 157	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   38: ldc 179
    //   40: invokevirtual 154	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   43: aload_3
    //   44: getfield 185	android/media/MediaCodec$BufferInfo:flags	I
    //   47: invokevirtual 157	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   50: invokevirtual 161	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   53: invokestatic 92	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   56: iload_2
    //   57: iflt +370 -> 427
    //   60: aload_3
    //   61: getfield 188	android/media/MediaCodec$BufferInfo:size	I
    //   64: ifeq +363 -> 427
    //   67: aload_3
    //   68: getfield 191	android/media/MediaCodec$BufferInfo:presentationTimeUs	J
    //   71: lstore 4
    //   73: aload_0
    //   74: getfield 38	com/tencent/mm/plugin/emojicapture/model/b/j$a:liV	Lcom/tencent/mm/plugin/emojicapture/model/b/j;
    //   77: getfield 62	com/tencent/mm/plugin/emojicapture/model/b/j:TAG	Ljava/lang/String;
    //   80: new 140	java/lang/StringBuilder
    //   83: dup
    //   84: ldc 193
    //   86: invokespecial 145	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   89: lload 4
    //   91: invokevirtual 149	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   94: ldc 195
    //   96: invokevirtual 154	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   99: aload_0
    //   100: getfield 38	com/tencent/mm/plugin/emojicapture/model/b/j$a:liV	Lcom/tencent/mm/plugin/emojicapture/model/b/j;
    //   103: getfield 165	com/tencent/mm/plugin/emojicapture/model/b/j:liT	J
    //   106: invokevirtual 149	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   109: invokevirtual 161	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   112: invokestatic 92	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   115: aload_0
    //   116: getfield 38	com/tencent/mm/plugin/emojicapture/model/b/j$a:liV	Lcom/tencent/mm/plugin/emojicapture/model/b/j;
    //   119: getfield 99	com/tencent/mm/plugin/emojicapture/model/b/j:eTq	Landroid/media/MediaCodec;
    //   122: astore_1
    //   123: aload_1
    //   124: ifnull +9 -> 133
    //   127: aload_1
    //   128: iload_2
    //   129: iconst_1
    //   130: invokevirtual 199	android/media/MediaCodec:releaseOutputBuffer	(IZ)V
    //   133: aload_0
    //   134: getfield 38	com/tencent/mm/plugin/emojicapture/model/b/j$a:liV	Lcom/tencent/mm/plugin/emojicapture/model/b/j;
    //   137: astore 6
    //   139: aload 6
    //   141: getfield 62	com/tencent/mm/plugin/emojicapture/model/b/j:TAG	Ljava/lang/String;
    //   144: new 140	java/lang/StringBuilder
    //   147: dup
    //   148: ldc 201
    //   150: invokespecial 145	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   153: aload_3
    //   154: getfield 191	android/media/MediaCodec$BufferInfo:presentationTimeUs	J
    //   157: invokevirtual 149	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   160: ldc 203
    //   162: invokevirtual 154	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   165: aload_3
    //   166: getfield 188	android/media/MediaCodec$BufferInfo:size	I
    //   169: invokevirtual 157	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   172: invokevirtual 161	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   175: invokestatic 92	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   178: aload 6
    //   180: getfield 209	com/tencent/mm/plugin/emojicapture/model/b/l:ljl	La/f/a/b;
    //   183: astore_1
    //   184: aload_1
    //   185: ifnull +21 -> 206
    //   188: aload_1
    //   189: aload_3
    //   190: getfield 191	android/media/MediaCodec$BufferInfo:presentationTimeUs	J
    //   193: ldc2_w 210
    //   196: lmul
    //   197: invokestatic 216	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   200: invokeinterface 222 2 0
    //   205: pop
    //   206: aload 6
    //   208: getfield 226	com/tencent/mm/plugin/emojicapture/model/b/j:liQ	Ljava/lang/Object;
    //   211: astore_1
    //   212: aload_1
    //   213: monitorenter
    //   214: aload 6
    //   216: getfield 226	com/tencent/mm/plugin/emojicapture/model/b/j:liQ	Ljava/lang/Object;
    //   219: ldc2_w 227
    //   222: invokevirtual 232	java/lang/Object:wait	(J)V
    //   225: getstatic 238	a/y:AUy	La/y;
    //   228: astore 6
    //   230: aload_1
    //   231: monitorexit
    //   232: aload_0
    //   233: getfield 38	com/tencent/mm/plugin/emojicapture/model/b/j$a:liV	Lcom/tencent/mm/plugin/emojicapture/model/b/j;
    //   236: getfield 96	com/tencent/mm/plugin/emojicapture/model/b/j:liS	Z
    //   239: ifeq +161 -> 400
    //   242: aload_0
    //   243: getfield 38	com/tencent/mm/plugin/emojicapture/model/b/j$a:liV	Lcom/tencent/mm/plugin/emojicapture/model/b/j;
    //   246: getfield 165	com/tencent/mm/plugin/emojicapture/model/b/j:liT	J
    //   249: lstore 7
    //   251: lconst_0
    //   252: lload 4
    //   254: lcmp
    //   255: ifle +137 -> 392
    //   258: aload_0
    //   259: getfield 38	com/tencent/mm/plugin/emojicapture/model/b/j$a:liV	Lcom/tencent/mm/plugin/emojicapture/model/b/j;
    //   262: getfield 62	com/tencent/mm/plugin/emojicapture/model/b/j:TAG	Ljava/lang/String;
    //   265: ldc 240
    //   267: invokestatic 92	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   270: aload_0
    //   271: getfield 38	com/tencent/mm/plugin/emojicapture/model/b/j$a:liV	Lcom/tencent/mm/plugin/emojicapture/model/b/j;
    //   274: getfield 62	com/tencent/mm/plugin/emojicapture/model/b/j:TAG	Ljava/lang/String;
    //   277: ldc 242
    //   279: invokestatic 92	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   282: aload_0
    //   283: getfield 38	com/tencent/mm/plugin/emojicapture/model/b/j$a:liV	Lcom/tencent/mm/plugin/emojicapture/model/b/j;
    //   286: astore_3
    //   287: aload_3
    //   288: getfield 62	com/tencent/mm/plugin/emojicapture/model/b/j:TAG	Ljava/lang/String;
    //   291: ldc 244
    //   293: invokestatic 92	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   296: aload_3
    //   297: getfield 248	com/tencent/mm/plugin/emojicapture/model/b/j:eUd	Landroid/os/HandlerThread;
    //   300: invokevirtual 253	android/os/HandlerThread:quit	()Z
    //   303: pop
    //   304: aload_3
    //   305: getfield 99	com/tencent/mm/plugin/emojicapture/model/b/j:eTq	Landroid/media/MediaCodec;
    //   308: astore_1
    //   309: aload_1
    //   310: ifnull +7 -> 317
    //   313: aload_1
    //   314: invokevirtual 256	android/media/MediaCodec:stop	()V
    //   317: aload_3
    //   318: getfield 99	com/tencent/mm/plugin/emojicapture/model/b/j:eTq	Landroid/media/MediaCodec;
    //   321: astore_1
    //   322: aload_1
    //   323: ifnull +7 -> 330
    //   326: aload_1
    //   327: invokevirtual 258	android/media/MediaCodec:release	()V
    //   330: aload_0
    //   331: getfield 38	com/tencent/mm/plugin/emojicapture/model/b/j$a:liV	Lcom/tencent/mm/plugin/emojicapture/model/b/j;
    //   334: getfield 262	com/tencent/mm/plugin/emojicapture/model/b/l:ljm	La/f/a/a;
    //   337: astore_1
    //   338: aload_1
    //   339: ifnull +79 -> 418
    //   342: aload_1
    //   343: invokeinterface 268 1 0
    //   348: pop
    //   349: sipush 2689
    //   352: invokestatic 76	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   355: return
    //   356: astore 9
    //   358: aload 6
    //   360: getfield 62	com/tencent/mm/plugin/emojicapture/model/b/j:TAG	Ljava/lang/String;
    //   363: aload 9
    //   365: checkcast 64	java/lang/Throwable
    //   368: ldc_w 269
    //   371: iconst_0
    //   372: anewarray 67	java/lang/Object
    //   375: invokestatic 73	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   378: goto -153 -> 225
    //   381: astore_3
    //   382: aload_1
    //   383: monitorexit
    //   384: sipush 2689
    //   387: invokestatic 76	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   390: aload_3
    //   391: athrow
    //   392: lload 7
    //   394: lload 4
    //   396: lcmp
    //   397: ifle -139 -> 258
    //   400: aload_3
    //   401: getfield 185	android/media/MediaCodec$BufferInfo:flags	I
    //   404: iconst_4
    //   405: iand
    //   406: ifne -148 -> 258
    //   409: sipush 2689
    //   412: invokestatic 76	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   415: goto -60 -> 355
    //   418: sipush 2689
    //   421: invokestatic 76	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   424: goto -69 -> 355
    //   427: aload_0
    //   428: getfield 38	com/tencent/mm/plugin/emojicapture/model/b/j$a:liV	Lcom/tencent/mm/plugin/emojicapture/model/b/j;
    //   431: getfield 99	com/tencent/mm/plugin/emojicapture/model/b/j:eTq	Landroid/media/MediaCodec;
    //   434: astore_1
    //   435: aload_1
    //   436: ifnull -27 -> 409
    //   439: aload_1
    //   440: iload_2
    //   441: iconst_0
    //   442: invokevirtual 199	android/media/MediaCodec:releaseOutputBuffer	(IZ)V
    //   445: sipush 2689
    //   448: invokestatic 76	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   451: goto -96 -> 355
    //   454: astore_1
    //   455: goto -125 -> 330
    //
    // Exception table:
    //   from	to	target	type
    //   214	225	356	java/lang/Exception
    //   214	225	381	finally
    //   225	230	381	finally
    //   358	378	381	finally
    //   296	309	454	java/lang/Exception
    //   313	317	454	java/lang/Exception
    //   317	322	454	java/lang/Exception
    //   326	330	454	java/lang/Exception
  }

  public final void onOutputFormatChanged(MediaCodec paramMediaCodec, MediaFormat paramMediaFormat)
  {
    AppMethodBeat.i(2691);
    a.f.b.j.p(paramMediaCodec, "codec");
    a.f.b.j.p(paramMediaFormat, "format");
    ab.i(this.liV.TAG, "onOutputFormatChanged ".concat(String.valueOf(paramMediaFormat)));
    this.liV.mediaFormat = paramMediaFormat;
    AppMethodBeat.o(2691);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.model.b.j.a
 * JD-Core Version:    0.6.2
 */