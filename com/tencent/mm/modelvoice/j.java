package com.tencent.mm.modelvoice;

import android.content.Context;
import android.media.AudioTrack;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.util.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.qqpinyin.voicerecoapi.TRSpeexNative;
import com.tencent.qqpinyin.voicerecoapi.a;
import java.io.InputStream;

public final class j
  implements d
{
  AudioTrack aQf;
  private int cIb;
  com.tencent.mm.compatible.util.b cop;
  boolean fZC;
  MediaPlayer.OnCompletionListener fZE;
  MediaPlayer.OnErrorListener fZF;
  d.a fZI;
  d.b fZJ;
  private int fZK;
  private int fZL;
  private Runnable fZM;
  a fZN;
  private int fZO;
  int fZP;
  boolean fZQ;
  byte[] fZR;
  int fZS;
  InputStream fZT;
  int fZU;
  String fZt;
  String fZu;
  String fileName;
  private int nSamplerate;
  volatile int status;

  public j()
  {
    AppMethodBeat.i(55819);
    this.fileName = "";
    this.fZI = null;
    this.fZJ = null;
    this.status = 0;
    this.fZK = 2;
    this.nSamplerate = 16000;
    this.cIb = 1;
    this.fZL = 20;
    this.fZN = null;
    this.fZP = 0;
    this.fZQ = false;
    this.fZt = "";
    this.fZu = "";
    this.fZC = true;
    this.fZR = new byte[a.MAX_FRAME_SIZE];
    this.fZS = 0;
    this.fZT = null;
    this.fZU = 314;
    this.fZE = new MediaPlayer.OnCompletionListener()
    {
      public final void onCompletion(MediaPlayer paramAnonymousMediaPlayer)
      {
        AppMethodBeat.i(55816);
        if ((j.this.cop != null) && (j.this.fZC))
          j.this.cop.Mm();
        try
        {
          j.this.status = 0;
          j.this.alX();
          try
          {
            j.a(j.this);
            AppMethodBeat.o(55816);
            return;
          }
          catch (InterruptedException paramAnonymousMediaPlayer)
          {
            while (true)
            {
              ab.e("MicroMsg.SpeexPlayer", "exception:%s", new Object[] { bo.l(paramAnonymousMediaPlayer) });
              AppMethodBeat.o(55816);
            }
          }
        }
        catch (Exception paramAnonymousMediaPlayer)
        {
          while (true)
          {
            ab.e("MicroMsg.SpeexPlayer", "exception:%s", new Object[] { bo.l(paramAnonymousMediaPlayer) });
            ab.e("MicroMsg.SpeexPlayer", "setCompletion File[" + j.this.fileName + "] ErrMsg[" + paramAnonymousMediaPlayer.getStackTrace() + "]");
            AppMethodBeat.o(55816);
          }
        }
      }
    };
    this.fZF = new j.2(this);
    this.fZN = new a();
    a locala = this.fZN;
    if (locala.AqB != 0);
    for (int j = -103; ; j = i)
    {
      do
      {
        if (j != 0)
          ab.e("speex", "res: ".concat(String.valueOf(j)));
        AppMethodBeat.o(55819);
        return;
        j = locala.AqC.nativeTRSpeexDecodeInit();
      }
      while ((j != -1) && (j != -100) && (j != -101) && (j == -102));
      locala.AqB = j;
      locala.Aqz = new byte[a.MAX_FRAME_SIZE * 15];
    }
  }

  public j(Context paramContext)
  {
    this();
    AppMethodBeat.i(55820);
    this.cop = new com.tencent.mm.compatible.util.b(paramContext);
    AppMethodBeat.o(55820);
  }

  private boolean T(String paramString, boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(55825);
    if (this.status != 0)
    {
      ab.e("MicroMsg.SpeexPlayer", "startPlay error status:" + this.status);
      AppMethodBeat.o(55825);
      paramBoolean = bool;
    }
    while (true)
    {
      return paramBoolean;
      ab.i("MicroMsg.SpeexPlayer", "startPlay");
      this.status = 1;
      this.fileName = paramString;
      try
      {
        db(paramBoolean);
        AppMethodBeat.o(55825);
        paramBoolean = true;
      }
      catch (Exception localException)
      {
        try
        {
          db(true);
        }
        catch (Exception paramString)
        {
          ab.e("MicroMsg.SpeexPlayer", "startPlay File[" + this.fileName + "] failed");
          ab.e("MicroMsg.SpeexPlayer", "exception:%s", new Object[] { bo.l(localException) });
          this.status = -1;
          AppMethodBeat.o(55825);
          paramBoolean = bool;
        }
      }
    }
  }

  private void alY()
  {
    AppMethodBeat.i(55827);
    if (this.aQf != null);
    try
    {
      this.aQf.play();
      this.fZM = new j.3(this);
      com.tencent.mm.sdk.g.d.post(this.fZM, "SpeexPlayer_play");
      AppMethodBeat.o(55827);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.SpeexPlayer", "audioTrack error:%s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(55827);
      }
    }
  }

  private void db(boolean paramBoolean)
  {
    int i = 3;
    AppMethodBeat.i(55826);
    if (!com.tencent.mm.vfs.e.ct(this.fileName))
    {
      AppMethodBeat.o(55826);
      return;
    }
    int j;
    if (paramBoolean)
      j = 3;
    label252: 
    while (true)
    {
      try
      {
        if (!q.etd.epG)
          break label252;
        q.etd.dump();
        if (q.etd.epN != 1)
          break label252;
        j = i;
        this.fZO = AudioTrack.getMinBufferSize(this.nSamplerate, this.fZK, 2);
        alX();
        com.tencent.mm.compatible.b.e locale = new com/tencent/mm/compatible/b/e;
        locale.<init>(j, this.nSamplerate, this.fZK, this.fZO * 8);
        this.aQf = locale;
        this.fZU = (this.nSamplerate / 1000 * this.cIb * this.fZL * 2);
        if ((this.cop != null) && (this.fZC))
          this.cop.requestFocus();
        alY();
        AppMethodBeat.o(55826);
        break;
        j = 0;
        continue;
      }
      catch (Exception localException)
      {
        if ((this.cop != null) && (this.fZC))
          this.cop.Mm();
        alX();
        ab.e("MicroMsg.SpeexPlayer", "playImp : fail, exception = " + localException.getMessage());
        ab.e("MicroMsg.SpeexPlayer", "exception:%s", new Object[] { bo.l(localException) });
        AppMethodBeat.o(55826);
      }
      break;
    }
  }

  // ERROR //
  public final boolean EH()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: ldc_w 302
    //   5: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: ldc 166
    //   10: new 168	java/lang/StringBuilder
    //   13: dup
    //   14: ldc_w 304
    //   17: invokespecial 173	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   20: aload_0
    //   21: getfield 66	com/tencent/mm/modelvoice/j:status	I
    //   24: invokevirtual 177	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   27: invokevirtual 181	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   30: invokestatic 133	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   33: aload_0
    //   34: getfield 66	com/tencent/mm/modelvoice/j:status	I
    //   37: iconst_1
    //   38: if_icmpeq +107 -> 145
    //   41: aload_0
    //   42: getfield 66	com/tencent/mm/modelvoice/j:status	I
    //   45: iconst_2
    //   46: if_icmpeq +99 -> 145
    //   49: ldc 166
    //   51: new 168	java/lang/StringBuilder
    //   54: dup
    //   55: ldc_w 306
    //   58: invokespecial 173	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   61: aload_0
    //   62: getfield 66	com/tencent/mm/modelvoice/j:status	I
    //   65: invokevirtual 177	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   68: invokevirtual 181	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   71: invokestatic 133	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   74: aload_0
    //   75: getfield 82	com/tencent/mm/modelvoice/j:fZt	Ljava/lang/String;
    //   78: astore_2
    //   79: aload_2
    //   80: monitorenter
    //   81: aload_0
    //   82: getfield 82	com/tencent/mm/modelvoice/j:fZt	Ljava/lang/String;
    //   85: invokevirtual 309	java/lang/Object:notify	()V
    //   88: aload_2
    //   89: monitorexit
    //   90: aload_0
    //   91: getfield 84	com/tencent/mm/modelvoice/j:fZu	Ljava/lang/String;
    //   94: astore_2
    //   95: aload_2
    //   96: monitorenter
    //   97: aload_0
    //   98: getfield 84	com/tencent/mm/modelvoice/j:fZu	Ljava/lang/String;
    //   101: invokevirtual 309	java/lang/Object:notify	()V
    //   104: aload_2
    //   105: monitorexit
    //   106: aload_0
    //   107: iconst_3
    //   108: putfield 66	com/tencent/mm/modelvoice/j:status	I
    //   111: ldc_w 302
    //   114: invokestatic 136	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   117: iload_1
    //   118: ireturn
    //   119: astore_3
    //   120: aload_2
    //   121: monitorexit
    //   122: ldc_w 302
    //   125: invokestatic 136	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   128: aload_3
    //   129: athrow
    //   130: astore_3
    //   131: goto -25 -> 106
    //   134: astore_3
    //   135: aload_2
    //   136: monitorexit
    //   137: ldc_w 302
    //   140: invokestatic 136	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   143: aload_3
    //   144: athrow
    //   145: aload_0
    //   146: iconst_3
    //   147: putfield 66	com/tencent/mm/modelvoice/j:status	I
    //   150: aload_0
    //   151: getfield 82	com/tencent/mm/modelvoice/j:fZt	Ljava/lang/String;
    //   154: astore_3
    //   155: aload_3
    //   156: monitorenter
    //   157: aload_0
    //   158: getfield 82	com/tencent/mm/modelvoice/j:fZt	Ljava/lang/String;
    //   161: invokevirtual 309	java/lang/Object:notify	()V
    //   164: aload_0
    //   165: getfield 159	com/tencent/mm/modelvoice/j:cop	Lcom/tencent/mm/compatible/util/b;
    //   168: ifnull +18 -> 186
    //   171: aload_0
    //   172: getfield 86	com/tencent/mm/modelvoice/j:fZC	Z
    //   175: ifeq +11 -> 186
    //   178: aload_0
    //   179: getfield 159	com/tencent/mm/modelvoice/j:cop	Lcom/tencent/mm/compatible/util/b;
    //   182: invokevirtual 298	com/tencent/mm/compatible/util/b:Mm	()Z
    //   185: pop
    //   186: aload_3
    //   187: monitorexit
    //   188: ldc_w 302
    //   191: invokestatic 136	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   194: iconst_1
    //   195: istore_1
    //   196: goto -79 -> 117
    //   199: astore_2
    //   200: ldc 166
    //   202: ldc 198
    //   204: iconst_1
    //   205: anewarray 4	java/lang/Object
    //   208: dup
    //   209: iconst_0
    //   210: aload_2
    //   211: invokestatic 204	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   214: aastore
    //   215: invokestatic 207	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   218: aload_0
    //   219: invokevirtual 284	com/tencent/mm/modelvoice/j:alX	()V
    //   222: aload_0
    //   223: getfield 159	com/tencent/mm/modelvoice/j:cop	Lcom/tencent/mm/compatible/util/b;
    //   226: ifnull +18 -> 244
    //   229: aload_0
    //   230: getfield 86	com/tencent/mm/modelvoice/j:fZC	Z
    //   233: ifeq +11 -> 244
    //   236: aload_0
    //   237: getfield 159	com/tencent/mm/modelvoice/j:cop	Lcom/tencent/mm/compatible/util/b;
    //   240: invokevirtual 298	com/tencent/mm/compatible/util/b:Mm	()Z
    //   243: pop
    //   244: aload_3
    //   245: monitorexit
    //   246: ldc_w 302
    //   249: invokestatic 136	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   252: goto -135 -> 117
    //   255: astore_2
    //   256: aload_0
    //   257: getfield 159	com/tencent/mm/modelvoice/j:cop	Lcom/tencent/mm/compatible/util/b;
    //   260: ifnull +18 -> 278
    //   263: aload_0
    //   264: getfield 86	com/tencent/mm/modelvoice/j:fZC	Z
    //   267: ifeq +11 -> 278
    //   270: aload_0
    //   271: getfield 159	com/tencent/mm/modelvoice/j:cop	Lcom/tencent/mm/compatible/util/b;
    //   274: invokevirtual 298	com/tencent/mm/compatible/util/b:Mm	()Z
    //   277: pop
    //   278: ldc_w 302
    //   281: invokestatic 136	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   284: aload_2
    //   285: athrow
    //   286: astore_2
    //   287: aload_3
    //   288: monitorexit
    //   289: ldc_w 302
    //   292: invokestatic 136	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   295: aload_2
    //   296: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   81	90	119	finally
    //   120	122	119	finally
    //   74	81	130	java/lang/Exception
    //   90	97	130	java/lang/Exception
    //   122	130	130	java/lang/Exception
    //   137	145	130	java/lang/Exception
    //   97	106	134	finally
    //   135	137	134	finally
    //   157	164	199	java/lang/Exception
    //   157	164	255	finally
    //   200	222	255	finally
    //   164	186	286	finally
    //   186	188	286	finally
    //   222	244	286	finally
    //   244	246	286	finally
    //   256	278	286	finally
    //   278	286	286	finally
    //   287	289	286	finally
  }

  // ERROR //
  public final boolean Ew()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: ldc_w 311
    //   5: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: getfield 66	com/tencent/mm/modelvoice/j:status	I
    //   12: iconst_2
    //   13: if_icmpeq +11 -> 24
    //   16: ldc_w 311
    //   19: invokestatic 136	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   22: iload_1
    //   23: ireturn
    //   24: aload_0
    //   25: iconst_1
    //   26: putfield 66	com/tencent/mm/modelvoice/j:status	I
    //   29: aload_0
    //   30: getfield 82	com/tencent/mm/modelvoice/j:fZt	Ljava/lang/String;
    //   33: astore_2
    //   34: aload_2
    //   35: monitorenter
    //   36: ldc 166
    //   38: ldc_w 313
    //   41: invokestatic 316	com/tencent/mm/sdk/platformtools/ab:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   44: aload_0
    //   45: getfield 82	com/tencent/mm/modelvoice/j:fZt	Ljava/lang/String;
    //   48: invokevirtual 309	java/lang/Object:notify	()V
    //   51: ldc 166
    //   53: ldc_w 318
    //   56: invokestatic 316	com/tencent/mm/sdk/platformtools/ab:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   59: aload_0
    //   60: getfield 159	com/tencent/mm/modelvoice/j:cop	Lcom/tencent/mm/compatible/util/b;
    //   63: ifnull +18 -> 81
    //   66: aload_0
    //   67: getfield 86	com/tencent/mm/modelvoice/j:fZC	Z
    //   70: ifeq +11 -> 81
    //   73: aload_0
    //   74: getfield 159	com/tencent/mm/modelvoice/j:cop	Lcom/tencent/mm/compatible/util/b;
    //   77: invokevirtual 293	com/tencent/mm/compatible/util/b:requestFocus	()Z
    //   80: pop
    //   81: aload_2
    //   82: monitorexit
    //   83: ldc_w 311
    //   86: invokestatic 136	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   89: iconst_1
    //   90: istore_1
    //   91: goto -69 -> 22
    //   94: astore_3
    //   95: ldc 166
    //   97: ldc 198
    //   99: iconst_1
    //   100: anewarray 4	java/lang/Object
    //   103: dup
    //   104: iconst_0
    //   105: aload_3
    //   106: invokestatic 204	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   109: aastore
    //   110: invokestatic 207	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   113: aload_0
    //   114: getfield 159	com/tencent/mm/modelvoice/j:cop	Lcom/tencent/mm/compatible/util/b;
    //   117: ifnull +18 -> 135
    //   120: aload_0
    //   121: getfield 86	com/tencent/mm/modelvoice/j:fZC	Z
    //   124: ifeq +11 -> 135
    //   127: aload_0
    //   128: getfield 159	com/tencent/mm/modelvoice/j:cop	Lcom/tencent/mm/compatible/util/b;
    //   131: invokevirtual 293	com/tencent/mm/compatible/util/b:requestFocus	()Z
    //   134: pop
    //   135: aload_2
    //   136: monitorexit
    //   137: ldc_w 311
    //   140: invokestatic 136	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   143: goto -121 -> 22
    //   146: astore_3
    //   147: aload_0
    //   148: getfield 159	com/tencent/mm/modelvoice/j:cop	Lcom/tencent/mm/compatible/util/b;
    //   151: ifnull +18 -> 169
    //   154: aload_0
    //   155: getfield 86	com/tencent/mm/modelvoice/j:fZC	Z
    //   158: ifeq +11 -> 169
    //   161: aload_0
    //   162: getfield 159	com/tencent/mm/modelvoice/j:cop	Lcom/tencent/mm/compatible/util/b;
    //   165: invokevirtual 293	com/tencent/mm/compatible/util/b:requestFocus	()Z
    //   168: pop
    //   169: ldc_w 311
    //   172: invokestatic 136	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   175: aload_3
    //   176: athrow
    //   177: astore_3
    //   178: aload_2
    //   179: monitorexit
    //   180: ldc_w 311
    //   183: invokestatic 136	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   186: aload_3
    //   187: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   36	59	94	java/lang/Exception
    //   36	59	146	finally
    //   95	113	146	finally
    //   59	81	177	finally
    //   81	83	177	finally
    //   113	135	177	finally
    //   135	137	177	finally
    //   147	169	177	finally
    //   169	177	177	finally
    //   178	180	177	finally
  }

  public final double Ez()
  {
    return 0.0D;
  }

  public final boolean S(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(55823);
    paramBoolean = T(paramString, paramBoolean);
    AppMethodBeat.o(55823);
    return paramBoolean;
  }

  public final void a(d.a parama)
  {
    this.fZI = parama;
  }

  public final void a(d.b paramb)
  {
    this.fZJ = paramb;
  }

  public final void alP()
  {
    this.fZC = false;
  }

  final void alX()
  {
    AppMethodBeat.i(55821);
    if (this.aQf != null)
    {
      this.aQf.stop();
      this.aQf.release();
      this.aQf = null;
    }
    AppMethodBeat.o(55821);
  }

  public final void b(b.a parama)
  {
    AppMethodBeat.i(55831);
    if ((parama != null) && (this.cop != null))
      this.cop.a(parama);
    AppMethodBeat.o(55831);
  }

  // ERROR //
  public final boolean bn(boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: ldc_w 342
    //   5: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: getfield 66	com/tencent/mm/modelvoice/j:status	I
    //   12: iconst_1
    //   13: if_icmpeq +13 -> 26
    //   16: ldc_w 342
    //   19: invokestatic 136	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   22: iload_2
    //   23: istore_1
    //   24: iload_1
    //   25: ireturn
    //   26: aload_0
    //   27: iconst_2
    //   28: putfield 66	com/tencent/mm/modelvoice/j:status	I
    //   31: aload_0
    //   32: getfield 84	com/tencent/mm/modelvoice/j:fZu	Ljava/lang/String;
    //   35: astore_3
    //   36: aload_3
    //   37: monitorenter
    //   38: ldc 166
    //   40: ldc_w 344
    //   43: invokestatic 316	com/tencent/mm/sdk/platformtools/ab:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   46: invokestatic 350	java/lang/System:currentTimeMillis	()J
    //   49: lstore 4
    //   51: aload_0
    //   52: getfield 84	com/tencent/mm/modelvoice/j:fZu	Ljava/lang/String;
    //   55: invokevirtual 353	java/lang/Object:wait	()V
    //   58: new 168	java/lang/StringBuilder
    //   61: astore 6
    //   63: aload 6
    //   65: ldc_w 355
    //   68: invokespecial 173	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   71: ldc 166
    //   73: aload 6
    //   75: invokestatic 350	java/lang/System:currentTimeMillis	()J
    //   78: lload 4
    //   80: lsub
    //   81: invokevirtual 358	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   84: invokevirtual 181	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   87: invokestatic 316	com/tencent/mm/sdk/platformtools/ab:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   90: aload_0
    //   91: getfield 159	com/tencent/mm/modelvoice/j:cop	Lcom/tencent/mm/compatible/util/b;
    //   94: ifnull +22 -> 116
    //   97: iload_1
    //   98: ifeq +18 -> 116
    //   101: aload_0
    //   102: getfield 86	com/tencent/mm/modelvoice/j:fZC	Z
    //   105: ifeq +11 -> 116
    //   108: aload_0
    //   109: getfield 159	com/tencent/mm/modelvoice/j:cop	Lcom/tencent/mm/compatible/util/b;
    //   112: invokevirtual 298	com/tencent/mm/compatible/util/b:Mm	()Z
    //   115: pop
    //   116: aload_3
    //   117: monitorexit
    //   118: ldc_w 342
    //   121: invokestatic 136	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   124: iconst_1
    //   125: istore_1
    //   126: goto -102 -> 24
    //   129: astore 6
    //   131: ldc 166
    //   133: ldc 198
    //   135: iconst_1
    //   136: anewarray 4	java/lang/Object
    //   139: dup
    //   140: iconst_0
    //   141: aload 6
    //   143: invokestatic 204	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   146: aastore
    //   147: invokestatic 207	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   150: aload_0
    //   151: getfield 159	com/tencent/mm/modelvoice/j:cop	Lcom/tencent/mm/compatible/util/b;
    //   154: ifnull +22 -> 176
    //   157: iload_1
    //   158: ifeq +18 -> 176
    //   161: aload_0
    //   162: getfield 86	com/tencent/mm/modelvoice/j:fZC	Z
    //   165: ifeq +11 -> 176
    //   168: aload_0
    //   169: getfield 159	com/tencent/mm/modelvoice/j:cop	Lcom/tencent/mm/compatible/util/b;
    //   172: invokevirtual 298	com/tencent/mm/compatible/util/b:Mm	()Z
    //   175: pop
    //   176: aload_3
    //   177: monitorexit
    //   178: ldc_w 342
    //   181: invokestatic 136	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   184: iload_2
    //   185: istore_1
    //   186: goto -162 -> 24
    //   189: astore 6
    //   191: aload_0
    //   192: getfield 159	com/tencent/mm/modelvoice/j:cop	Lcom/tencent/mm/compatible/util/b;
    //   195: ifnull +22 -> 217
    //   198: iload_1
    //   199: ifeq +18 -> 217
    //   202: aload_0
    //   203: getfield 86	com/tencent/mm/modelvoice/j:fZC	Z
    //   206: ifeq +11 -> 217
    //   209: aload_0
    //   210: getfield 159	com/tencent/mm/modelvoice/j:cop	Lcom/tencent/mm/compatible/util/b;
    //   213: invokevirtual 298	com/tencent/mm/compatible/util/b:Mm	()Z
    //   216: pop
    //   217: ldc_w 342
    //   220: invokestatic 136	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   223: aload 6
    //   225: athrow
    //   226: astore 6
    //   228: aload_3
    //   229: monitorexit
    //   230: ldc_w 342
    //   233: invokestatic 136	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   236: aload 6
    //   238: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   38	90	129	java/lang/Exception
    //   38	90	189	finally
    //   131	150	189	finally
    //   90	97	226	finally
    //   101	116	226	finally
    //   116	118	226	finally
    //   150	157	226	finally
    //   161	176	226	finally
    //   176	178	226	finally
    //   191	198	226	finally
    //   202	217	226	finally
    //   217	226	226	finally
    //   228	230	226	finally
  }

  // ERROR //
  public final void bo(boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc_w 360
    //   3: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: iconst_1
    //   8: putfield 80	com/tencent/mm/modelvoice/j:fZQ	Z
    //   11: aload_0
    //   12: getfield 72	com/tencent/mm/modelvoice/j:cIb	I
    //   15: iconst_2
    //   16: if_icmpne +133 -> 149
    //   19: aload_0
    //   20: iconst_3
    //   21: putfield 68	com/tencent/mm/modelvoice/j:fZK	I
    //   24: aload_0
    //   25: aload_0
    //   26: getfield 70	com/tencent/mm/modelvoice/j:nSamplerate	I
    //   29: aload_0
    //   30: getfield 68	com/tencent/mm/modelvoice/j:fZK	I
    //   33: iconst_2
    //   34: invokestatic 279	android/media/AudioTrack:getMinBufferSize	(III)I
    //   37: putfield 281	com/tencent/mm/modelvoice/j:fZO	I
    //   40: aload_0
    //   41: getfield 232	com/tencent/mm/modelvoice/j:aQf	Landroid/media/AudioTrack;
    //   44: ifnull +22 -> 66
    //   47: aload_0
    //   48: getfield 232	com/tencent/mm/modelvoice/j:aQf	Landroid/media/AudioTrack;
    //   51: invokevirtual 331	android/media/AudioTrack:stop	()V
    //   54: aload_0
    //   55: getfield 232	com/tencent/mm/modelvoice/j:aQf	Landroid/media/AudioTrack;
    //   58: invokevirtual 334	android/media/AudioTrack:release	()V
    //   61: aload_0
    //   62: aconst_null
    //   63: putfield 232	com/tencent/mm/modelvoice/j:aQf	Landroid/media/AudioTrack;
    //   66: iload_1
    //   67: ifeq +126 -> 193
    //   70: iconst_3
    //   71: istore_2
    //   72: iload_2
    //   73: istore_3
    //   74: getstatic 264	com/tencent/mm/compatible/e/q:etd	Lcom/tencent/mm/compatible/e/b;
    //   77: getfield 269	com/tencent/mm/compatible/e/b:epG	Z
    //   80: ifeq +23 -> 103
    //   83: getstatic 264	com/tencent/mm/compatible/e/q:etd	Lcom/tencent/mm/compatible/e/b;
    //   86: invokevirtual 272	com/tencent/mm/compatible/e/b:dump	()V
    //   89: iload_2
    //   90: istore_3
    //   91: getstatic 264	com/tencent/mm/compatible/e/q:etd	Lcom/tencent/mm/compatible/e/b;
    //   94: getfield 275	com/tencent/mm/compatible/e/b:epN	I
    //   97: iconst_1
    //   98: if_icmpne +5 -> 103
    //   101: iconst_3
    //   102: istore_3
    //   103: aload_0
    //   104: new 286	com/tencent/mm/compatible/b/e
    //   107: dup
    //   108: iload_3
    //   109: aload_0
    //   110: getfield 70	com/tencent/mm/modelvoice/j:nSamplerate	I
    //   113: aload_0
    //   114: getfield 68	com/tencent/mm/modelvoice/j:fZK	I
    //   117: aload_0
    //   118: getfield 281	com/tencent/mm/modelvoice/j:fZO	I
    //   121: bipush 8
    //   123: imul
    //   124: invokespecial 289	com/tencent/mm/compatible/b/e:<init>	(IIII)V
    //   127: putfield 232	com/tencent/mm/modelvoice/j:aQf	Landroid/media/AudioTrack;
    //   130: aload_0
    //   131: getfield 232	com/tencent/mm/modelvoice/j:aQf	Landroid/media/AudioTrack;
    //   134: invokevirtual 237	android/media/AudioTrack:play	()V
    //   137: aload_0
    //   138: iconst_0
    //   139: putfield 80	com/tencent/mm/modelvoice/j:fZQ	Z
    //   142: ldc_w 360
    //   145: invokestatic 136	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   148: return
    //   149: aload_0
    //   150: iconst_2
    //   151: putfield 68	com/tencent/mm/modelvoice/j:fZK	I
    //   154: goto -130 -> 24
    //   157: astore 4
    //   159: ldc 166
    //   161: aload 4
    //   163: invokevirtual 251	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   166: invokestatic 133	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   169: aload_0
    //   170: aconst_null
    //   171: putfield 232	com/tencent/mm/modelvoice/j:aQf	Landroid/media/AudioTrack;
    //   174: goto -108 -> 66
    //   177: astore 4
    //   179: aload_0
    //   180: aconst_null
    //   181: putfield 232	com/tencent/mm/modelvoice/j:aQf	Landroid/media/AudioTrack;
    //   184: ldc_w 360
    //   187: invokestatic 136	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   190: aload 4
    //   192: athrow
    //   193: iconst_0
    //   194: istore_2
    //   195: goto -123 -> 72
    //   198: astore 4
    //   200: ldc 166
    //   202: ldc 248
    //   204: iconst_1
    //   205: anewarray 4	java/lang/Object
    //   208: dup
    //   209: iconst_0
    //   210: aload 4
    //   212: invokevirtual 251	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   215: aastore
    //   216: invokestatic 207	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   219: goto -82 -> 137
    //
    // Exception table:
    //   from	to	target	type
    //   47	61	157	java/lang/Exception
    //   47	61	177	finally
    //   159	169	177	finally
    //   130	137	198	java/lang/Exception
  }

  public final boolean c(String paramString, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(55824);
    paramBoolean = T(paramString, paramBoolean);
    AppMethodBeat.o(55824);
    return paramBoolean;
  }

  public final int getStatus()
  {
    return this.status;
  }

  public final boolean isPlaying()
  {
    boolean bool = true;
    if (this.status == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.j
 * JD-Core Version:    0.6.2
 */