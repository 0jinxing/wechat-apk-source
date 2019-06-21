package com.tencent.mm.plugin.multitalk.model;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.concurrent.LinkedBlockingQueue;

public final class l
  implements Runnable
{
  protected volatile b oGq;
  protected LinkedBlockingQueue<l.c> oHd;
  protected ak[] oHe;
  volatile com.tencent.mm.pluginsdk.f.d oHf;
  private int oHg;
  private int oHh;
  private int oHi;
  private int oHj;
  boolean running;

  public l(b paramb)
  {
    AppMethodBeat.i(54067);
    this.oHf = new com.tencent.mm.pluginsdk.f.d("multitalk_network");
    this.oHh = 5;
    this.oHd = new LinkedBlockingQueue();
    this.oGq = paramb;
    AppMethodBeat.o(54067);
  }

  // ERROR //
  private boolean a(l.c paramc)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: aload_0
    //   3: monitorenter
    //   4: ldc 67
    //   6: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_1
    //   10: ifnull +434 -> 444
    //   13: aload_1
    //   14: getfield 71	com/tencent/mm/plugin/multitalk/model/l$c:oHm	[I
    //   17: ifnonnull +11 -> 28
    //   20: aload_1
    //   21: ldc 72
    //   23: newarray int
    //   25: putfield 71	com/tencent/mm/plugin/multitalk/model/l$c:oHm	[I
    //   28: aload_1
    //   29: getfield 71	com/tencent/mm/plugin/multitalk/model/l$c:oHm	[I
    //   32: iconst_0
    //   33: iconst_0
    //   34: iastore
    //   35: invokestatic 78	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   38: invokevirtual 82	java/lang/Thread:getName	()Ljava/lang/String;
    //   41: ldc 84
    //   43: invokevirtual 90	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   46: ifeq +10 -> 56
    //   49: aload_1
    //   50: getfield 71	com/tencent/mm/plugin/multitalk/model/l$c:oHm	[I
    //   53: iconst_0
    //   54: iconst_1
    //   55: iastore
    //   56: invokestatic 96	com/tencent/mm/plugin/multitalk/model/p:bSe	()Lcom/tencent/mm/plugin/multitalk/model/d;
    //   59: getfield 102	com/tencent/mm/plugin/multitalk/model/d:oFP	Lcom/tencent/pb/talkroom/sdk/d;
    //   62: aload_1
    //   63: getfield 71	com/tencent/mm/plugin/multitalk/model/l$c:oHm	[I
    //   66: invokeinterface 108 2 0
    //   71: astore_3
    //   72: aload_0
    //   73: getfield 58	com/tencent/mm/plugin/multitalk/model/l:oGq	Lcom/tencent/mm/plugin/multitalk/model/b;
    //   76: ifnull +233 -> 309
    //   79: aload_3
    //   80: getfield 113	com/tencent/pb/talkroom/sdk/f:ret	I
    //   83: ifle +226 -> 309
    //   86: aload_3
    //   87: getfield 117	com/tencent/pb/talkroom/sdk/f:Aqh	Ljava/lang/String;
    //   90: invokestatic 123	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   93: ifne +216 -> 309
    //   96: aload_0
    //   97: getfield 58	com/tencent/mm/plugin/multitalk/model/l:oGq	Lcom/tencent/mm/plugin/multitalk/model/b;
    //   100: aload_3
    //   101: getfield 117	com/tencent/pb/talkroom/sdk/f:Aqh	Ljava/lang/String;
    //   104: invokeinterface 129 2 0
    //   109: istore 4
    //   111: aload_1
    //   112: aload_3
    //   113: getfield 117	com/tencent/pb/talkroom/sdk/f:Aqh	Ljava/lang/String;
    //   116: putfield 132	com/tencent/mm/plugin/multitalk/model/l$c:username	Ljava/lang/String;
    //   119: aload_1
    //   120: aload_3
    //   121: getfield 135	com/tencent/pb/talkroom/sdk/f:Aql	I
    //   124: putfield 138	com/tencent/mm/plugin/multitalk/model/l$c:oHo	I
    //   127: aload_1
    //   128: aload_3
    //   129: getfield 141	com/tencent/pb/talkroom/sdk/f:Aqm	I
    //   132: putfield 144	com/tencent/mm/plugin/multitalk/model/l$c:oHp	I
    //   135: aload_1
    //   136: aload_3
    //   137: getfield 147	com/tencent/pb/talkroom/sdk/f:Aqk	I
    //   140: putfield 150	com/tencent/mm/plugin/multitalk/model/l$c:oHn	I
    //   143: ldc 152
    //   145: ldc 154
    //   147: iconst_2
    //   148: anewarray 4	java/lang/Object
    //   151: dup
    //   152: iconst_0
    //   153: aload_1
    //   154: getfield 132	com/tencent/mm/plugin/multitalk/model/l$c:username	Ljava/lang/String;
    //   157: aastore
    //   158: dup
    //   159: iconst_1
    //   160: iload 4
    //   162: invokestatic 160	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   165: aastore
    //   166: invokestatic 166	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   169: iload 4
    //   171: iflt +44 -> 215
    //   174: aload_0
    //   175: getfield 168	com/tencent/mm/plugin/multitalk/model/l:oHe	[Lcom/tencent/mm/sdk/platformtools/ak;
    //   178: iload 4
    //   180: iconst_2
    //   181: irem
    //   182: aaload
    //   183: ifnull +32 -> 215
    //   186: aload_0
    //   187: getfield 168	com/tencent/mm/plugin/multitalk/model/l:oHe	[Lcom/tencent/mm/sdk/platformtools/ak;
    //   190: iload 4
    //   192: iconst_2
    //   193: irem
    //   194: aaload
    //   195: astore_3
    //   196: new 10	com/tencent/mm/plugin/multitalk/model/l$b
    //   199: astore 5
    //   201: aload 5
    //   203: aload_0
    //   204: aload_1
    //   205: invokespecial 171	com/tencent/mm/plugin/multitalk/model/l$b:<init>	(Lcom/tencent/mm/plugin/multitalk/model/l;Lcom/tencent/mm/plugin/multitalk/model/l$c;)V
    //   208: aload_3
    //   209: aload 5
    //   211: invokevirtual 177	com/tencent/mm/sdk/platformtools/ak:post	(Ljava/lang/Runnable;)Z
    //   214: pop
    //   215: aload_0
    //   216: getfield 49	com/tencent/mm/plugin/multitalk/model/l:oHf	Lcom/tencent/mm/pluginsdk/f/d;
    //   219: ldc 179
    //   221: invokevirtual 182	com/tencent/mm/pluginsdk/f/d:aiV	(Ljava/lang/String;)V
    //   224: aload_0
    //   225: aload_0
    //   226: getfield 184	com/tencent/mm/plugin/multitalk/model/l:oHj	I
    //   229: iconst_1
    //   230: iadd
    //   231: putfield 184	com/tencent/mm/plugin/multitalk/model/l:oHj	I
    //   234: aload_0
    //   235: getfield 186	com/tencent/mm/plugin/multitalk/model/l:oHi	I
    //   238: aload_0
    //   239: getfield 184	com/tencent/mm/plugin/multitalk/model/l:oHj	I
    //   242: iadd
    //   243: bipush 100
    //   245: irem
    //   246: ifne +54 -> 300
    //   249: ldc 152
    //   251: ldc 188
    //   253: iconst_2
    //   254: anewarray 4	java/lang/Object
    //   257: dup
    //   258: iconst_0
    //   259: aload_0
    //   260: getfield 186	com/tencent/mm/plugin/multitalk/model/l:oHi	I
    //   263: aload_0
    //   264: getfield 186	com/tencent/mm/plugin/multitalk/model/l:oHi	I
    //   267: aload_0
    //   268: getfield 184	com/tencent/mm/plugin/multitalk/model/l:oHj	I
    //   271: iadd
    //   272: idiv
    //   273: invokestatic 160	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   276: aastore
    //   277: dup
    //   278: iconst_1
    //   279: aload_0
    //   280: getfield 184	com/tencent/mm/plugin/multitalk/model/l:oHj	I
    //   283: aload_0
    //   284: getfield 186	com/tencent/mm/plugin/multitalk/model/l:oHi	I
    //   287: aload_0
    //   288: getfield 184	com/tencent/mm/plugin/multitalk/model/l:oHj	I
    //   291: iadd
    //   292: idiv
    //   293: invokestatic 160	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   296: aastore
    //   297: invokestatic 191	com/tencent/mm/sdk/platformtools/ab:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   300: ldc 67
    //   302: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   305: aload_0
    //   306: monitorexit
    //   307: iload_2
    //   308: ireturn
    //   309: aload_3
    //   310: getfield 113	com/tencent/pb/talkroom/sdk/f:ret	I
    //   313: ifne +13 -> 326
    //   316: aload_0
    //   317: aload_0
    //   318: getfield 186	com/tencent/mm/plugin/multitalk/model/l:oHi	I
    //   321: iconst_1
    //   322: iadd
    //   323: putfield 186	com/tencent/mm/plugin/multitalk/model/l:oHi	I
    //   326: aload_0
    //   327: getfield 49	com/tencent/mm/plugin/multitalk/model/l:oHf	Lcom/tencent/mm/pluginsdk/f/d;
    //   330: ldc 193
    //   332: invokevirtual 182	com/tencent/mm/pluginsdk/f/d:aiV	(Ljava/lang/String;)V
    //   335: ldc 152
    //   337: ldc 195
    //   339: iconst_1
    //   340: anewarray 4	java/lang/Object
    //   343: dup
    //   344: iconst_0
    //   345: aload_3
    //   346: getfield 113	com/tencent/pb/talkroom/sdk/f:ret	I
    //   349: invokestatic 160	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   352: aastore
    //   353: invokestatic 191	com/tencent/mm/sdk/platformtools/ab:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   356: aload_0
    //   357: getfield 186	com/tencent/mm/plugin/multitalk/model/l:oHi	I
    //   360: aload_0
    //   361: getfield 184	com/tencent/mm/plugin/multitalk/model/l:oHj	I
    //   364: iadd
    //   365: bipush 100
    //   367: irem
    //   368: ifne +58 -> 426
    //   371: ldc 152
    //   373: ldc 197
    //   375: iconst_2
    //   376: anewarray 4	java/lang/Object
    //   379: dup
    //   380: iconst_0
    //   381: aload_0
    //   382: getfield 186	com/tencent/mm/plugin/multitalk/model/l:oHi	I
    //   385: i2f
    //   386: aload_0
    //   387: getfield 186	com/tencent/mm/plugin/multitalk/model/l:oHi	I
    //   390: aload_0
    //   391: getfield 184	com/tencent/mm/plugin/multitalk/model/l:oHj	I
    //   394: iadd
    //   395: i2f
    //   396: fdiv
    //   397: invokestatic 202	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   400: aastore
    //   401: dup
    //   402: iconst_1
    //   403: aload_0
    //   404: getfield 184	com/tencent/mm/plugin/multitalk/model/l:oHj	I
    //   407: i2f
    //   408: aload_0
    //   409: getfield 186	com/tencent/mm/plugin/multitalk/model/l:oHi	I
    //   412: aload_0
    //   413: getfield 184	com/tencent/mm/plugin/multitalk/model/l:oHj	I
    //   416: iadd
    //   417: i2f
    //   418: fdiv
    //   419: invokestatic 202	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   422: aastore
    //   423: invokestatic 191	com/tencent/mm/sdk/platformtools/ab:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   426: aload_0
    //   427: getfield 56	com/tencent/mm/plugin/multitalk/model/l:oHd	Ljava/util/concurrent/LinkedBlockingQueue;
    //   430: aload_1
    //   431: invokevirtual 206	java/util/concurrent/LinkedBlockingQueue:put	(Ljava/lang/Object;)V
    //   434: ldc 67
    //   436: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   439: iconst_0
    //   440: istore_2
    //   441: goto -136 -> 305
    //   444: ldc 67
    //   446: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   449: iconst_0
    //   450: istore_2
    //   451: goto -146 -> 305
    //   454: astore_1
    //   455: aload_0
    //   456: monitorexit
    //   457: aload_1
    //   458: athrow
    //   459: astore_1
    //   460: goto -26 -> 434
    //
    // Exception table:
    //   from	to	target	type
    //   4	9	454	finally
    //   13	28	454	finally
    //   28	56	454	finally
    //   56	169	454	finally
    //   174	215	454	finally
    //   215	300	454	finally
    //   300	305	454	finally
    //   309	326	454	finally
    //   326	426	454	finally
    //   426	434	454	finally
    //   434	439	454	finally
    //   444	449	454	finally
    //   426	434	459	java/lang/InterruptedException
  }

  public final void run()
  {
    AppMethodBeat.i(54070);
    ab.i("MicroMsg.MT.MultiTalkVideoNetworkReceiver", "start run receiver sleepTime: " + this.oHh);
    while (true)
    {
      Object localObject;
      if (this.running)
      {
        this.oHf.aiV("_total");
        localObject = null;
      }
      try
      {
        l.c localc = (l.c)this.oHd.take();
        localObject = localc;
        label60: boolean bool = false;
        if (localObject != null)
        {
          if (!localObject.foa)
            bool = a(localObject);
        }
        else
        {
          if (bool)
            continue;
          try
          {
            Thread.sleep(this.oHh);
          }
          catch (InterruptedException localInterruptedException1)
          {
          }
          continue;
        }
        ab.i("MicroMsg.MT.MultiTalkVideoNetworkReceiver", "stop run receiver");
        AppMethodBeat.o(54070);
        return;
      }
      catch (InterruptedException localInterruptedException2)
      {
        break label60;
      }
    }
  }

  public final void start()
  {
    AppMethodBeat.i(54068);
    ab.i("MicroMsg.MT.MultiTalkVideoNetworkReceiver", "current member size %d", new Object[] { Integer.valueOf(this.oHg) });
    this.running = true;
    com.tencent.mm.sdk.g.d.a(this, "MultiTalk_videoReceiver1", 1).start();
    com.tencent.mm.sdk.g.d.a(this, "MultiTalk_videoReceiver2", 1).start();
    this.oHe = new ak[2];
    for (int i = 0; i < this.oHe.length; i++)
      com.tencent.mm.sdk.g.d.a(new l.a(this, i), "MultiTalkVideoTaskManager_drawer_handler", 1).start();
    for (i = 0; i < 36; i++)
      this.oHd.add(new l.c(this, false));
    AppMethodBeat.o(54068);
  }

  public final void stop()
  {
    int i = 0;
    AppMethodBeat.i(54069);
    this.oGq = null;
    this.running = false;
    this.oHg = 0;
    if (this.oHe != null)
      while (i < this.oHe.length)
      {
        if (this.oHe[i] != null)
        {
          this.oHe[i].removeCallbacksAndMessages(null);
          this.oHe[i].getLooper().quit();
          this.oHe[i] = null;
        }
        i++;
      }
    this.oHd.clear();
    this.oHd.add(new l.c(this, true));
    this.oHd.add(new l.c(this, true));
    AppMethodBeat.o(54069);
  }

  public final void zi(int paramInt)
  {
    AppMethodBeat.i(54071);
    this.oHg = paramInt;
    ab.i("MicroMsg.MT.MultiTalkVideoNetworkReceiver", "memberSize ".concat(String.valueOf(paramInt)));
    AppMethodBeat.o(54071);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.model.l
 * JD-Core Version:    0.6.2
 */