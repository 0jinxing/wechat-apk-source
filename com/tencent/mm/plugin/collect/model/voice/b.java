package com.tencent.mm.plugin.collect.model.voice;

import android.annotation.SuppressLint;
import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class b
{
  float JN;
  c kDh;
  private b.a kDi;
  private Thread kDj;
  SynthesizerNative kDk;
  boolean kDl;
  int kDm;
  byte[] kDn;

  @SuppressLint({"HandlerLeak"})
  Handler mHandler;
  private boolean mIsInit;
  String mText;
  float mVolume;

  public b()
  {
    AppMethodBeat.i(41027);
    this.kDi = new b.a(this, (byte)0);
    this.kDj = null;
    this.kDk = new SynthesizerNative();
    this.mIsInit = false;
    this.kDl = false;
    this.kDm = 256000;
    this.kDn = new byte[this.kDm];
    this.mVolume = 1.0F;
    this.JN = 1.0F;
    this.mHandler = new b.1(this);
    AppMethodBeat.o(41027);
  }

  // ERROR //
  public final int I(String paramString1, String paramString2, String paramString3)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 4
    //   3: ldc 84
    //   5: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: getfield 56	com/tencent/mm/plugin/collect/model/voice/b:mIsInit	Z
    //   12: ifeq +11 -> 23
    //   15: ldc 84
    //   17: invokestatic 77	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   20: iload 4
    //   22: ireturn
    //   23: new 86	java/lang/StringBuilder
    //   26: dup
    //   27: invokespecial 87	java/lang/StringBuilder:<init>	()V
    //   30: aload_1
    //   31: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   34: aload_2
    //   35: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   38: ldc 93
    //   40: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   43: invokevirtual 97	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   46: astore 5
    //   48: ldc 99
    //   50: ldc 101
    //   52: iconst_2
    //   53: anewarray 4	java/lang/Object
    //   56: dup
    //   57: iconst_0
    //   58: aload 5
    //   60: aastore
    //   61: dup
    //   62: iconst_1
    //   63: aload_3
    //   64: aastore
    //   65: invokestatic 107	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   68: aload 5
    //   70: invokestatic 113	com/tencent/mm/vfs/e:ct	(Ljava/lang/String;)Z
    //   73: ifne +15 -> 88
    //   76: bipush 155
    //   78: istore 4
    //   80: ldc 84
    //   82: invokestatic 77	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   85: goto -65 -> 20
    //   88: aload_3
    //   89: invokestatic 118	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   92: ifne +77 -> 169
    //   95: aload_3
    //   96: invokestatic 113	com/tencent/mm/vfs/e:ct	(Ljava/lang/String;)Z
    //   99: istore 6
    //   101: iload 6
    //   103: ifne +15 -> 118
    //   106: bipush 153
    //   108: istore 4
    //   110: ldc 84
    //   112: invokestatic 77	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   115: goto -95 -> 20
    //   118: aload_3
    //   119: invokestatic 124	java/lang/System:load	(Ljava/lang/String;)V
    //   122: aload_2
    //   123: astore_3
    //   124: aload_2
    //   125: invokestatic 118	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   128: ifeq +6 -> 134
    //   131: ldc 126
    //   133: astore_3
    //   134: aload_0
    //   135: getfield 54	com/tencent/mm/plugin/collect/model/voice/b:kDk	Lcom/tencent/mm/plugin/collect/model/voice/SynthesizerNative;
    //   138: aload_1
    //   139: invokevirtual 132	java/lang/String:getBytes	()[B
    //   142: aload_3
    //   143: invokevirtual 132	java/lang/String:getBytes	()[B
    //   146: invokevirtual 136	com/tencent/mm/plugin/collect/model/voice/SynthesizerNative:init	([B[B)I
    //   149: istore 7
    //   151: iload 7
    //   153: ifge +80 -> 233
    //   156: ldc 84
    //   158: invokestatic 77	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   161: sipush -201
    //   164: istore 4
    //   166: goto -146 -> 20
    //   169: ldc 138
    //   171: invokestatic 141	java/lang/System:loadLibrary	(Ljava/lang/String;)V
    //   174: goto -52 -> 122
    //   177: astore_1
    //   178: ldc 99
    //   180: ldc 143
    //   182: iconst_2
    //   183: anewarray 4	java/lang/Object
    //   186: dup
    //   187: iconst_0
    //   188: aload_1
    //   189: invokevirtual 147	java/lang/Object:getClass	()Ljava/lang/Class;
    //   192: invokevirtual 152	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   195: aastore
    //   196: dup
    //   197: iconst_1
    //   198: aload_1
    //   199: invokevirtual 155	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   202: aastore
    //   203: invokestatic 157	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   206: sipush -207
    //   209: istore 4
    //   211: ldc 84
    //   213: invokestatic 77	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   216: goto -196 -> 20
    //   219: astore_1
    //   220: ldc 84
    //   222: invokestatic 77	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   225: sipush -201
    //   228: istore 4
    //   230: goto -210 -> 20
    //   233: aload_0
    //   234: iconst_1
    //   235: putfield 56	com/tencent/mm/plugin/collect/model/voice/b:mIsInit	Z
    //   238: ldc 84
    //   240: invokestatic 77	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   243: goto -223 -> 20
    //
    // Exception table:
    //   from	to	target	type
    //   88	101	177	java/lang/Throwable
    //   118	122	177	java/lang/Throwable
    //   169	174	177	java/lang/Throwable
    //   124	131	219	java/lang/Exception
    //   134	151	219	java/lang/Exception
  }

  public final void destroy()
  {
    AppMethodBeat.i(41030);
    this.kDl = true;
    if (this.kDj != null);
    try
    {
      this.kDj.join();
      this.kDk.release();
      this.mIsInit = false;
      AppMethodBeat.o(41030);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      while (true)
        ab.i("MicroMsg.OfflineVoice.InnerSynthesizer", "stop() Exception:%s %s", new Object[] { localInterruptedException.getClass().getSimpleName(), localInterruptedException.getMessage() });
    }
  }

  public final int start(String paramString)
  {
    int i = -202;
    AppMethodBeat.i(41029);
    if (!this.mIsInit)
      AppMethodBeat.o(41029);
    while (true)
    {
      return i;
      if ((this.kDj != null) && (this.kDj.isAlive()))
      {
        AppMethodBeat.o(41029);
      }
      else if ((paramString == null) || (paramString.length() > 1024))
      {
        i = -102;
        AppMethodBeat.o(41029);
      }
      else
      {
        this.mText = paramString;
        this.kDl = false;
        this.kDj = new Thread(this.kDi);
        this.kDj.start();
        AppMethodBeat.o(41029);
        i = 0;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.model.voice.b
 * JD-Core Version:    0.6.2
 */