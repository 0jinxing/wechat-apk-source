package com.tencent.mm.modelvoice;

import android.content.Context;
import android.media.AudioTrack;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.c.a;
import com.tencent.mm.compatible.util.b.a;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

public final class i
  implements d
{
  private static int fZD;
  private static Object fZv;
  private static int fZw;
  private static int fZx;
  public int cpQ;
  private com.tencent.mm.audio.d.b fZA;
  private int fZB;
  private boolean fZC;
  private MediaPlayer.OnCompletionListener fZE;
  private MediaPlayer.OnErrorListener fZF;
  private i.a fZn;
  private com.tencent.mm.compatible.util.b fZo;
  private d.a fZp;
  private d.b fZq;
  private int fZr;
  private volatile boolean fZs;
  private String fZt;
  private String fZu;
  private int fZy;
  private int fZz;
  private AudioTrack mAudioTrack;
  private String mFileName;
  public int mSampleRate;
  private volatile int mStatus;

  static
  {
    AppMethodBeat.i(55815);
    fZv = new Object();
    fZw = -1;
    fZD = 100;
    AppMethodBeat.o(55815);
  }

  public i()
  {
    AppMethodBeat.i(55797);
    this.fZp = null;
    this.fZq = null;
    this.cpQ = 2;
    this.mSampleRate = 16000;
    this.mFileName = "";
    this.mStatus = 0;
    this.fZr = 0;
    this.fZs = false;
    this.fZt = "";
    this.fZu = "";
    this.fZz = 0;
    this.fZA = null;
    this.fZB = 8;
    this.fZC = true;
    this.fZE = new i.1(this);
    this.fZF = new i.2(this);
    fZw += 1;
    this.fZy = fZw;
    ab.i("MicroMsg.SilkPlayer", "[%d] new Instance", new Object[] { Integer.valueOf(this.fZy) });
    AppMethodBeat.o(55797);
  }

  public i(Context paramContext)
  {
    this();
    AppMethodBeat.i(55798);
    this.fZo = new com.tencent.mm.compatible.util.b(paramContext);
    AppMethodBeat.o(55798);
  }

  private boolean T(String paramString, boolean paramBoolean)
  {
    int i = 2;
    AppMethodBeat.i(55803);
    if (this.mStatus != 0)
    {
      ab.e("MicroMsg.SilkPlayer", "startPlay error status:" + this.mStatus);
      AppMethodBeat.o(55803);
      paramBoolean = false;
    }
    while (true)
    {
      return paramBoolean;
      if (ae.gjd)
        aX(paramString, com.tencent.mm.audio.b.g.cqr);
      ab.i("MicroMsg.SilkPlayer", "startPlay");
      this.mStatus = 1;
      this.mFileName = paramString;
      int j;
      synchronized (fZv)
      {
        uH(paramString);
        if (ae.gjd)
        {
          paramString = com.tencent.mm.audio.b.g.cqq;
          if (this.cpQ == 2)
          {
            j = 1;
            this.fZA = new com.tencent.mm.audio.d.b(paramString, j, this.mSampleRate);
          }
        }
        else
        {
          int k = this.mSampleRate;
          j = i;
          if (this.cpQ == 2)
            j = 1;
          ab.d("MicroMsg.SilkPlayer", "startPlay, sampleRate: %d, channelCnt: %d ", new Object[] { Integer.valueOf(k), Integer.valueOf(j) });
        }
      }
      try
      {
        paramBoolean = da(paramBoolean);
        AppMethodBeat.o(55803);
        continue;
        paramString = finally;
        AppMethodBeat.o(55803);
        throw paramString;
        j = 2;
      }
      catch (Exception localException)
      {
        try
        {
          paramBoolean = da(true);
        }
        catch (Exception paramString)
        {
          ab.e("MicroMsg.SilkPlayer", "startPlay File[" + this.mFileName + "] failed");
          ab.e("MicroMsg.SilkPlayer", "exception:%s", new Object[] { bo.l(localException) });
          this.mStatus = -1;
          AppMethodBeat.o(55803);
          paramBoolean = false;
        }
      }
    }
  }

  private boolean alT()
  {
    boolean bool = false;
    AppMethodBeat.i(55806);
    if (this.mAudioTrack != null);
    while (true)
    {
      try
      {
        ab.i("MicroMsg.SilkPlayer", "play");
        this.mAudioTrack.play();
        this.fZn = new i.a(this, (byte)0);
        com.tencent.mm.sdk.g.d.f(this.fZn, "SilkPlayer_play_" + this.fZy);
        AppMethodBeat.o(55806);
        bool = true;
        return bool;
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.SilkPlayer", "audioTrack error:%s", new Object[] { localException.getMessage() });
        h.pYm.a(161L, 0L, 1L, false);
        h.pYm.a(161L, 3L, 1L, false);
        AppMethodBeat.o(55806);
        continue;
      }
      AppMethodBeat.o(55806);
    }
  }

  private void cZ(boolean paramBoolean)
  {
    AppMethodBeat.i(55800);
    if (this.mAudioTrack != null)
      ab.i("MicroMsg.SilkPlayer", "mAudioTrack.stop()");
    try
    {
      this.mAudioTrack.stop();
      this.mAudioTrack.release();
      this.mAudioTrack = null;
      this.mAudioTrack = a.a(paramBoolean, this.mSampleRate, this.cpQ, this.fZB);
      if ((this.mAudioTrack == null) || (this.mAudioTrack.getState() == 0))
      {
        h.pYm.a(161L, 0L, 1L, false);
        h.pYm.a(161L, 2L, 1L, false);
      }
    }
    catch (Exception localException1)
    {
      while (true)
      {
        try
        {
          if (this.mAudioTrack != null)
          {
            this.mAudioTrack.release();
            this.mAudioTrack = null;
          }
          AppMethodBeat.o(55800);
          return;
          localException1 = localException1;
          ab.e("MicroMsg.SilkPlayer", "mAudioTrack.stop() error: %s", new Object[] { localException1.getMessage() });
        }
        catch (Exception localException2)
        {
        }
        AppMethodBeat.o(55800);
      }
    }
  }

  private boolean da(boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(55805);
    if (!e.ct(this.mFileName))
    {
      AppMethodBeat.o(55805);
      paramBoolean = bool;
    }
    while (true)
    {
      return paramBoolean;
      try
      {
        cZ(paramBoolean);
        if (this.mAudioTrack != null)
        {
          if ((this.fZo != null) && (this.fZC))
            this.fZo.requestFocus();
          paramBoolean = alT();
          AppMethodBeat.o(55805);
        }
      }
      catch (Exception localException)
      {
        if ((this.fZo != null) && (this.fZC))
          this.fZo.Mm();
        ab.e("MicroMsg.SilkPlayer", "playImp : fail, exception = " + localException.getMessage());
        ab.e("MicroMsg.SilkPlayer", "exception:%s", new Object[] { bo.l(localException) });
        AppMethodBeat.o(55805);
        paramBoolean = bool;
      }
    }
  }

  private void uH(String paramString)
  {
    AppMethodBeat.i(55804);
    fZx = this.fZy;
    ab.i("MicroMsg.SilkPlayer", "[%d] SilkDecInit", new Object[] { Integer.valueOf(this.fZy) });
    try
    {
      paramString = e.openRead(paramString);
      int i = paramString.available();
      ab.d("MicroMsg.SilkPlayer", "SilkDecInit streamlen:%d", new Object[] { Integer.valueOf(i) });
      j = AudioTrack.getMinBufferSize(this.mSampleRate, 2, 2);
      if ((com.tencent.mm.compatible.b.g.KK().KP()) && (i < j * 2));
      for (this.fZB = 1; ; this.fZB = 8)
      {
        Object localObject = new byte[i];
        paramString.read((byte[])localObject, 0, i);
        this.mSampleRate = MediaRecorder.SilkGetEncSampleRate(new byte[] { localObject[0] });
        ab.i("MicroMsg.SilkPlayer", "silkdec uninit success: %d".concat(String.valueOf(MediaRecorder.SilkDecUnInit())));
        MediaRecorder.SilkDecInit(this.mSampleRate, (byte[])localObject, i);
        j = -1;
        localObject = com.tencent.mm.model.c.c.abi().ll("100268");
        if (((com.tencent.mm.storage.c)localObject).isValid())
          j = bo.getInt((String)((com.tencent.mm.storage.c)localObject).dru().get("SilkAudioPlayerAgcOn"), 0);
        if ((1 == j) || (j == 0))
        {
          int k = (byte)j;
          MediaRecorder.SetVoiceSilkDecControl(fZD, new byte[] { k }, 1);
        }
        paramString.close();
        ab.d("MicroMsg.SilkPlayer", "[%d] skip %d frames", new Object[] { Integer.valueOf(this.fZy), Integer.valueOf(this.fZz) });
        paramString = new byte[AudioTrack.getMinBufferSize(this.mSampleRate, 2, 2) * 2];
        short s = (short)(this.mSampleRate * 20 / 1000);
        j = 0;
        if (j >= this.fZz)
          break label407;
        i = MediaRecorder.SilkDoDec(paramString, s);
        if (i > 0)
          break;
        ab.e("MicroMsg.SilkPlayer", "[%d], skip frame failed: %d", new Object[] { Integer.valueOf(this.fZy), Integer.valueOf(i) });
        AppMethodBeat.o(55804);
        return;
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        int j;
        h.pYm.a(161L, 0L, 1L, false);
        h.pYm.a(161L, 1L, 1L, false);
        ab.e("MicroMsg.SilkPlayer", "exception:%s", new Object[] { bo.l(paramString) });
        continue;
        j++;
        continue;
        label407: AppMethodBeat.o(55804);
      }
    }
  }

  private String uI(String paramString)
  {
    AppMethodBeat.i(55812);
    ab.d("MicroMsg.SilkPlayer", "hakon silkToPcmImpl()");
    if (!e.ct(this.mFileName))
    {
      ab.e("MicroMsg.SilkPlayer", "hakon silkToPcmImpl(), file not exist, fileName = %s", new Object[] { this.mFileName });
      AppMethodBeat.o(55812);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      try
      {
        ab.d("MicroMsg.SilkPlayer", "hakon silkToPcmImpl thread start");
        Process.setThreadPriority(-16);
        Object localObject = new byte[AudioTrack.getMinBufferSize(this.mSampleRate, 2, 2) << 1];
        short s = (short)(this.mSampleRate * 20 / 1000);
        uJ(paramString);
        localOutputStream = e.L(paramString, false);
        label105: int i;
        try
        {
          while (true)
          {
            if ((this.mStatus != 1) && (this.mStatus != 2))
              break label257;
            i = MediaRecorder.SilkDoDec((byte[])localObject, s);
            if (i >= 0)
              break;
            this.mStatus = 0;
          }
        }
        catch (Exception paramString)
        {
        }
        try
        {
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>("hakon silkToPcmImpl thread exception: ");
          ab.e("MicroMsg.SilkPlayer", paramString.getMessage());
          ab.e("MicroMsg.SilkPlayer", "exception:%s", new Object[] { bo.l(paramString) });
          this.mStatus = 0;
          if (localOutputStream != null);
          try
          {
            localOutputStream.close();
            AppMethodBeat.o(55812);
            paramString = null;
            continue;
            while (this.fZs)
              Thread.sleep(20L);
            localOutputStream.write((byte[])localObject, 0, s * 2);
            localOutputStream.flush();
            if (i != 0)
              break label105;
            this.mStatus = 0;
            break label105;
            label257: ab.d("MicroMsg.SilkPlayer", "hakon silkToPcmImpl thread end");
            localOutputStream.close();
            i = MediaRecorder.SilkDecUnInit();
            ab.i("MicroMsg.SilkPlayer", "[%d] SilkDecUnInit in silkToPcmImpl", new Object[] { Integer.valueOf(this.fZy) });
            if (i != 0)
              ab.e("MicroMsg.SilkPlayer", "hakon silkToPcmImpl res: ".concat(String.valueOf(i)));
            AppMethodBeat.o(55812);
          }
          catch (IOException paramString)
          {
            while (true)
              ab.printErrStackTrace("MicroMsg.SilkPlayer", paramString, "", new Object[0]);
          }
        }
        catch (Exception paramString)
        {
          ab.e("MicroMsg.SilkPlayer", "hakon silkToPcmImpl exception: " + paramString.getMessage());
          ab.e("MicroMsg.SilkPlayer", "exception:%s", new Object[] { bo.l(paramString) });
          AppMethodBeat.o(55812);
          paramString = null;
        }
      }
      catch (Exception paramString)
      {
        while (true)
          OutputStream localOutputStream = null;
      }
    }
  }

  private static boolean uJ(String paramString)
  {
    boolean bool1 = false;
    AppMethodBeat.i(55813);
    boolean bool2;
    if (paramString == null)
    {
      AppMethodBeat.o(55813);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      try
      {
        int i = paramString.lastIndexOf("/");
        if (i == -1)
        {
          ab.w("MicroMsg.SilkPlayer", "ensureFileFloder end == -1");
          AppMethodBeat.o(55813);
          bool2 = bool1;
        }
        else
        {
          String str = paramString.substring(0, i + 1);
          paramString = new com/tencent/mm/vfs/b;
          paramString.<init>(str);
          if (!paramString.exists())
            if ((!paramString.mkdirs()) && (!paramString.isDirectory()))
              break label132;
          label132: for (bool2 = true; ; bool2 = false)
          {
            ab.i("MicroMsg.SilkPlayer", "ensureFileFloder mkdir:%s,sucess:%s", new Object[] { str, Boolean.valueOf(bool2) });
            AppMethodBeat.o(55813);
            bool2 = true;
            break;
          }
        }
      }
      catch (Exception paramString)
      {
        ab.w("MicroMsg.SilkPlayer", "ensureFileFloder Exception:", new Object[] { paramString.getMessage() });
        AppMethodBeat.o(55813);
        bool2 = bool1;
      }
    }
  }

  // ERROR //
  public final boolean EH()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: ldc_w 533
    //   5: invokestatic 53	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: ldc 113
    //   10: new 142	java/lang/StringBuilder
    //   13: dup
    //   14: ldc_w 535
    //   17: invokespecial 147	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   20: aload_0
    //   21: getfield 81	com/tencent/mm/modelvoice/i:mStatus	I
    //   24: invokevirtual 151	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   27: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   30: invokestatic 177	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   33: aload_0
    //   34: getfield 81	com/tencent/mm/modelvoice/i:mStatus	I
    //   37: iconst_1
    //   38: if_icmpeq +44 -> 82
    //   41: aload_0
    //   42: getfield 81	com/tencent/mm/modelvoice/i:mStatus	I
    //   45: iconst_2
    //   46: if_icmpeq +36 -> 82
    //   49: ldc 113
    //   51: new 142	java/lang/StringBuilder
    //   54: dup
    //   55: ldc_w 537
    //   58: invokespecial 147	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   61: aload_0
    //   62: getfield 81	com/tencent/mm/modelvoice/i:mStatus	I
    //   65: invokevirtual 151	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   68: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   71: invokestatic 159	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   74: ldc_w 533
    //   77: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   80: iload_1
    //   81: ireturn
    //   82: aload_0
    //   83: iconst_3
    //   84: putfield 81	com/tencent/mm/modelvoice/i:mStatus	I
    //   87: aload_0
    //   88: getfield 87	com/tencent/mm/modelvoice/i:fZt	Ljava/lang/String;
    //   91: astore_2
    //   92: aload_2
    //   93: monitorenter
    //   94: aload_0
    //   95: getfield 87	com/tencent/mm/modelvoice/i:fZt	Ljava/lang/String;
    //   98: invokevirtual 540	java/lang/Object:notify	()V
    //   101: aload_0
    //   102: getfield 135	com/tencent/mm/modelvoice/i:fZo	Lcom/tencent/mm/compatible/util/b;
    //   105: ifnull +18 -> 123
    //   108: aload_0
    //   109: getfield 97	com/tencent/mm/modelvoice/i:fZC	Z
    //   112: ifeq +11 -> 123
    //   115: aload_0
    //   116: getfield 135	com/tencent/mm/modelvoice/i:fZo	Lcom/tencent/mm/compatible/util/b;
    //   119: invokevirtual 312	com/tencent/mm/compatible/util/b:Mm	()Z
    //   122: pop
    //   123: aload_2
    //   124: monitorexit
    //   125: ldc_w 533
    //   128: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   131: iconst_1
    //   132: istore_1
    //   133: goto -53 -> 80
    //   136: astore_3
    //   137: ldc 113
    //   139: ldc 206
    //   141: iconst_1
    //   142: anewarray 4	java/lang/Object
    //   145: dup
    //   146: iconst_0
    //   147: aload_3
    //   148: invokestatic 212	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   151: aastore
    //   152: invokestatic 214	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   155: aload_0
    //   156: getfield 135	com/tencent/mm/modelvoice/i:fZo	Lcom/tencent/mm/compatible/util/b;
    //   159: ifnull +18 -> 177
    //   162: aload_0
    //   163: getfield 97	com/tencent/mm/modelvoice/i:fZC	Z
    //   166: ifeq +11 -> 177
    //   169: aload_0
    //   170: getfield 135	com/tencent/mm/modelvoice/i:fZo	Lcom/tencent/mm/compatible/util/b;
    //   173: invokevirtual 312	com/tencent/mm/compatible/util/b:Mm	()Z
    //   176: pop
    //   177: aload_2
    //   178: monitorexit
    //   179: ldc_w 533
    //   182: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   185: goto -105 -> 80
    //   188: astore_3
    //   189: aload_0
    //   190: getfield 135	com/tencent/mm/modelvoice/i:fZo	Lcom/tencent/mm/compatible/util/b;
    //   193: ifnull +18 -> 211
    //   196: aload_0
    //   197: getfield 97	com/tencent/mm/modelvoice/i:fZC	Z
    //   200: ifeq +11 -> 211
    //   203: aload_0
    //   204: getfield 135	com/tencent/mm/modelvoice/i:fZo	Lcom/tencent/mm/compatible/util/b;
    //   207: invokevirtual 312	com/tencent/mm/compatible/util/b:Mm	()Z
    //   210: pop
    //   211: ldc_w 533
    //   214: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   217: aload_3
    //   218: athrow
    //   219: astore_3
    //   220: aload_2
    //   221: monitorexit
    //   222: ldc_w 533
    //   225: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   228: aload_3
    //   229: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   94	101	136	java/lang/Exception
    //   94	101	188	finally
    //   137	155	188	finally
    //   101	123	219	finally
    //   123	125	219	finally
    //   155	177	219	finally
    //   177	179	219	finally
    //   189	211	219	finally
    //   211	219	219	finally
    //   220	222	219	finally
  }

  public final boolean Ew()
  {
    boolean bool = false;
    AppMethodBeat.i(55808);
    if (this.mStatus != 2)
      AppMethodBeat.o(55808);
    while (true)
    {
      return bool;
      this.mStatus = 1;
      synchronized (this.fZt)
      {
        try
        {
          ab.v("MicroMsg.SilkPlayer", "before mpause.notify");
          this.fZt.notify();
          ab.v("MicroMsg.SilkPlayer", "after mpause.notify");
          if ((this.fZo != null) && (this.fZC))
            this.fZo.requestFocus();
          AppMethodBeat.o(55808);
          bool = true;
        }
        catch (Exception localException)
        {
          ab.e("MicroMsg.SilkPlayer", "exception:%s", new Object[] { bo.l(localException) });
          AppMethodBeat.o(55808);
        }
      }
    }
  }

  public final double Ez()
  {
    return 0.0D;
  }

  public final boolean S(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(55801);
    paramBoolean = T(paramString, paramBoolean);
    AppMethodBeat.o(55801);
    return paramBoolean;
  }

  public final void a(d.a parama)
  {
    this.fZp = parama;
  }

  public final void a(d.b paramb)
  {
    this.fZq = paramb;
  }

  // ERROR //
  public final String aX(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: ldc_w 558
    //   5: invokestatic 53	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: getfield 81	com/tencent/mm/modelvoice/i:mStatus	I
    //   12: ifeq +37 -> 49
    //   15: ldc 113
    //   17: new 142	java/lang/StringBuilder
    //   20: dup
    //   21: ldc 144
    //   23: invokespecial 147	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   26: aload_0
    //   27: getfield 81	com/tencent/mm/modelvoice/i:mStatus	I
    //   30: invokevirtual 151	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   33: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   36: invokestatic 159	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   39: ldc_w 558
    //   42: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   45: aload_3
    //   46: astore_1
    //   47: aload_1
    //   48: areturn
    //   49: aload_0
    //   50: iconst_1
    //   51: putfield 81	com/tencent/mm/modelvoice/i:mStatus	I
    //   54: aload_0
    //   55: aload_1
    //   56: putfield 79	com/tencent/mm/modelvoice/i:mFileName	Ljava/lang/String;
    //   59: aload_1
    //   60: invokestatic 339	com/tencent/mm/vfs/e:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   63: astore_1
    //   64: aload_1
    //   65: invokevirtual 344	java/io/InputStream:available	()I
    //   68: istore 4
    //   70: iload 4
    //   72: newarray byte
    //   74: astore 5
    //   76: aload_1
    //   77: aload 5
    //   79: iconst_0
    //   80: iload 4
    //   82: invokevirtual 363	java/io/InputStream:read	([BII)I
    //   85: pop
    //   86: aload_0
    //   87: iconst_1
    //   88: newarray byte
    //   90: dup
    //   91: iconst_0
    //   92: aload 5
    //   94: iconst_0
    //   95: baload
    //   96: bastore
    //   97: invokestatic 369	com/tencent/mm/modelvoice/MediaRecorder:SilkGetEncSampleRate	([B)I
    //   100: putfield 75	com/tencent/mm/modelvoice/i:mSampleRate	I
    //   103: aload_0
    //   104: getfield 75	com/tencent/mm/modelvoice/i:mSampleRate	I
    //   107: aload 5
    //   109: iload 4
    //   111: invokestatic 387	com/tencent/mm/modelvoice/MediaRecorder:SilkDecInit	(I[BI)I
    //   114: pop
    //   115: ldc 113
    //   117: ldc_w 560
    //   120: iconst_1
    //   121: anewarray 4	java/lang/Object
    //   124: dup
    //   125: iconst_0
    //   126: aload_0
    //   127: getfield 111	com/tencent/mm/modelvoice/i:fZy	I
    //   130: invokestatic 121	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   133: aastore
    //   134: invokestatic 126	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   137: aload_1
    //   138: invokevirtual 428	java/io/InputStream:close	()V
    //   141: aload_0
    //   142: aload_2
    //   143: invokespecial 562	com/tencent/mm/modelvoice/i:uI	(Ljava/lang/String;)Ljava/lang/String;
    //   146: astore_2
    //   147: aload_2
    //   148: astore_1
    //   149: ldc_w 558
    //   152: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   155: goto -108 -> 47
    //   158: astore_2
    //   159: aconst_null
    //   160: astore_1
    //   161: ldc 113
    //   163: ldc_w 564
    //   166: iconst_2
    //   167: anewarray 4	java/lang/Object
    //   170: dup
    //   171: iconst_0
    //   172: aload_0
    //   173: getfield 79	com/tencent/mm/modelvoice/i:mFileName	Ljava/lang/String;
    //   176: aastore
    //   177: dup
    //   178: iconst_1
    //   179: aload_2
    //   180: invokevirtual 248	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   183: aastore
    //   184: invokestatic 214	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   187: ldc 113
    //   189: ldc 206
    //   191: iconst_1
    //   192: anewarray 4	java/lang/Object
    //   195: dup
    //   196: iconst_0
    //   197: aload_2
    //   198: invokestatic 212	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   201: aastore
    //   202: invokestatic 214	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   205: aload_0
    //   206: iconst_m1
    //   207: putfield 81	com/tencent/mm/modelvoice/i:mStatus	I
    //   210: aload_1
    //   211: ifnull +7 -> 218
    //   214: aload_1
    //   215: invokevirtual 428	java/io/InputStream:close	()V
    //   218: ldc_w 558
    //   221: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   224: aload_3
    //   225: astore_1
    //   226: goto -179 -> 47
    //   229: astore_1
    //   230: ldc 113
    //   232: aload_1
    //   233: ldc 77
    //   235: iconst_0
    //   236: anewarray 4	java/lang/Object
    //   239: invokestatic 490	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   242: goto -24 -> 218
    //   245: astore_2
    //   246: goto -85 -> 161
    //
    // Exception table:
    //   from	to	target	type
    //   59	64	158	java/lang/Exception
    //   214	218	229	java/io/IOException
    //   64	147	245	java/lang/Exception
  }

  public final void alP()
  {
    this.fZC = false;
  }

  public final void b(b.a parama)
  {
    AppMethodBeat.i(55810);
    if ((parama != null) && (this.fZo != null))
      this.fZo.a(parama);
    AppMethodBeat.o(55810);
  }

  public final boolean bn(boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(55807);
    if (this.mStatus != 1)
    {
      AppMethodBeat.o(55807);
      paramBoolean = bool;
    }
    while (true)
    {
      return paramBoolean;
      this.mStatus = 2;
      synchronized (this.fZu)
      {
        try
        {
          ab.v("MicroMsg.SilkPlayer", "before mOk.wait");
          long l = System.currentTimeMillis();
          this.fZu.wait();
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("after mOk.wait time:");
          ab.v("MicroMsg.SilkPlayer", System.currentTimeMillis() - l);
          if ((this.fZo != null) && (paramBoolean))
            this.fZo.Mm();
          AppMethodBeat.o(55807);
          paramBoolean = true;
        }
        catch (Exception localException)
        {
          ab.e("MicroMsg.SilkPlayer", "exception:%s", new Object[] { bo.l(localException) });
          AppMethodBeat.o(55807);
          paramBoolean = bool;
        }
      }
    }
  }

  public final void bo(boolean paramBoolean)
  {
    AppMethodBeat.i(55799);
    ab.d("MicroMsg.SilkPlayer", "setSpeakerOn: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.fZs = true;
    this.cpQ = 2;
    cZ(paramBoolean);
    try
    {
      this.mAudioTrack.play();
      this.fZs = false;
      AppMethodBeat.o(55799);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        h.pYm.a(161L, 0L, 1L, false);
        h.pYm.a(161L, 3L, 1L, false);
        ab.e("MicroMsg.SilkPlayer", "audioTrack error:%s", new Object[] { localException.getMessage() });
      }
    }
  }

  public final boolean c(String paramString, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(55802);
    paramBoolean = T(paramString, paramBoolean);
    AppMethodBeat.o(55802);
    return paramBoolean;
  }

  public final int getStatus()
  {
    return this.mStatus;
  }

  public final boolean isPlaying()
  {
    boolean bool = true;
    if (this.mStatus == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.i
 * JD-Core Version:    0.6.2
 */