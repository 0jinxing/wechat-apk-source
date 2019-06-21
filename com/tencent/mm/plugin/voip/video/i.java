package com.tencent.mm.plugin.voip.video;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.net.Uri;
import android.os.Looper;
import android.os.Vibrator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.b.g;
import com.tencent.mm.compatible.b.k;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;

public final class i
{
  public boolean aFV;
  private AudioManager euK;
  ak fbD;
  private com.tencent.mm.compatible.util.b gar;
  private Vibrator iVt;
  public Context mContext;
  public MediaPlayer tbg;
  public int tbh;
  public long tbi;
  public long tbj;
  i.a tbk;

  public i(Context paramContext)
  {
    AppMethodBeat.i(5101);
    this.aFV = false;
    this.tbh = 65536;
    this.fbD = new ak(Looper.getMainLooper());
    this.mContext = paramContext;
    if (this.mContext != null)
    {
      this.euK = g.KK().eoY;
      if (this.euK == null)
        this.euK = ((AudioManager)this.mContext.getSystemService("audio"));
      this.iVt = ((Vibrator)this.mContext.getSystemService("vibrator"));
    }
    this.gar = new com.tencent.mm.compatible.util.b(ah.getContext());
    AppMethodBeat.o(5101);
  }

  private void cLL()
  {
    AppMethodBeat.i(5106);
    SharedPreferences localSharedPreferences = this.mContext.getSharedPreferences(ah.doA(), 0);
    boolean bool;
    if (d.iW(26))
    {
      bool = localSharedPreferences.getBoolean("settings_voip_scene_shake", true);
      if (!bool)
        break label170;
      int i = this.euK.getRingerMode();
      ab.i("MicroMsg.RingPlayer", "system ringer mode: %s", new Object[] { Integer.valueOf(i) });
      if ((i != 1) && (i != 2))
        break label163;
      this.iVt = ((Vibrator)this.mContext.getSystemService("vibrator"));
      if (this.iVt != null)
        break label119;
      AppMethodBeat.o(5106);
    }
    while (true)
    {
      return;
      bool = localSharedPreferences.getBoolean("settings_shake", true);
      break;
      label119: this.iVt.vibrate(new long[] { 1000L, 1000L, 1000L, 1000L }, 0);
      AppMethodBeat.o(5106);
      continue;
      label163: ab.i("MicroMsg.RingPlayer", "system not open vibrate");
      label170: AppMethodBeat.o(5106);
    }
  }

  private void cLM()
  {
    AppMethodBeat.i(5107);
    if (this.iVt != null)
    {
      this.iVt.cancel();
      this.iVt = null;
    }
    AppMethodBeat.o(5107);
  }

  public final boolean DB()
  {
    if (!this.aFV);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void Gx(int paramInt)
  {
    AppMethodBeat.i(5110);
    r(2131231812, paramInt, true);
    AppMethodBeat.o(5110);
  }

  public final void a(int paramInt1, long paramLong, boolean paramBoolean, int paramInt2)
  {
    AppMethodBeat.i(5105);
    this.tbi = System.currentTimeMillis();
    this.tbg = new k();
    try
    {
      MediaPlayer localMediaPlayer = this.tbg;
      Object localObject1 = this.mContext;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("android.resource://");
      localMediaPlayer.setDataSource((Context)localObject1, Uri.parse(this.mContext.getPackageName() + "/" + paramInt1));
      localObject2 = this.tbg;
      localObject1 = new com/tencent/mm/plugin/voip/video/i$3;
      ((i.3)localObject1).<init>(this, paramInt1, paramLong, paramBoolean, paramInt2);
      ((MediaPlayer)localObject2).setOnCompletionListener((MediaPlayer.OnCompletionListener)localObject1);
      localObject1 = this.tbg;
      localObject2 = new com/tencent/mm/plugin/voip/video/i$4;
      ((i.4)localObject2).<init>(this);
      ((MediaPlayer)localObject1).setOnErrorListener((MediaPlayer.OnErrorListener)localObject2);
      this.tbg.setAudioStreamType(paramInt2);
      if (paramBoolean)
        this.tbg.setVolume(0.6F, 0.6F);
      while (true)
      {
        this.tbg.setLooping(false);
        this.tbg.prepare();
        this.tbg.start();
        if (System.currentTimeMillis() - this.tbi > 2000L)
          this.tbh = 3;
        AppMethodBeat.o(5105);
        return;
        cLL();
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.RingPlayer", "new MediaPlayer failed, " + localException.toString());
        AppMethodBeat.o(5105);
      }
    }
  }

  public final void ao(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(5108);
    this.tbh = 0;
    q(2131231807, paramInt, paramBoolean);
    AppMethodBeat.o(5108);
  }

  public final int cLN()
  {
    AppMethodBeat.i(5111);
    ab.d("MicroMsg.RingPlayer", "RingPlayer  mRingPlayerErrState:" + this.tbh);
    int i = this.tbh;
    AppMethodBeat.o(5111);
    return i;
  }

  public final void mE(boolean paramBoolean)
  {
    int i = 0;
    AppMethodBeat.i(5102);
    ab.i("MicroMsg.RingPlayer", "setSpeakerStatus, isSpeakerOn: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    int j;
    if (paramBoolean)
    {
      if ((!paramBoolean) || (q.etd.eqp < 0))
        break label114;
      j = q.etd.eqp;
    }
    while (true)
    {
      if (j != this.euK.getMode())
        this.euK.setMode(j);
      if (paramBoolean != this.euK.isSpeakerphoneOn())
        this.euK.setSpeakerphoneOn(paramBoolean);
      AppMethodBeat.o(5102);
      return;
      if (d.iW(21))
      {
        i = 3;
        break;
      }
      i = 2;
      break;
      label114: j = i;
      if (!paramBoolean)
      {
        j = i;
        if (q.etd.eqn >= 0)
          j = q.etd.eqn;
      }
    }
  }

  // ERROR //
  public final void q(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    // Byte code:
    //   0: sipush 5104
    //   3: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: iload_2
    //   7: ifne +115 -> 122
    //   10: invokestatic 319	com/tencent/mm/kernel/g:RP	()Lcom/tencent/mm/kernel/e;
    //   13: invokevirtual 325	com/tencent/mm/kernel/e:Ry	()Lcom/tencent/mm/storage/z;
    //   16: ldc_w 326
    //   19: getstatic 330	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   22: invokevirtual 336	com/tencent/mm/storage/z:get	(ILjava/lang/Object;)Ljava/lang/Object;
    //   25: checkcast 282	java/lang/Boolean
    //   28: invokevirtual 339	java/lang/Boolean:booleanValue	()Z
    //   31: istore 4
    //   33: bipush 26
    //   35: invokestatic 116	com/tencent/mm/compatible/util/d:iW	(I)Z
    //   38: ifeq +120 -> 158
    //   41: invokestatic 344	com/tencent/mm/m/a:MN	()Z
    //   44: istore 5
    //   46: invokestatic 347	com/tencent/mm/m/a:MO	()Z
    //   49: istore 6
    //   51: ldc 130
    //   53: ldc_w 349
    //   56: iconst_4
    //   57: anewarray 4	java/lang/Object
    //   60: dup
    //   61: iconst_0
    //   62: iload 4
    //   64: invokestatic 285	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   67: aastore
    //   68: dup
    //   69: iconst_1
    //   70: iload 5
    //   72: invokestatic 285	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   75: aastore
    //   76: dup
    //   77: iconst_2
    //   78: iload 6
    //   80: invokestatic 285	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   83: aastore
    //   84: dup
    //   85: iconst_3
    //   86: iload_3
    //   87: invokestatic 285	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   90: aastore
    //   91: invokestatic 143	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   94: iload_3
    //   95: ifeq +6 -> 101
    //   98: iconst_1
    //   99: istore 5
    //   101: iload 5
    //   103: istore 4
    //   105: iload 4
    //   107: ifne +101 -> 208
    //   110: iload 6
    //   112: ifne +96 -> 208
    //   115: sipush 5104
    //   118: invokestatic 100	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   121: return
    //   122: iload_2
    //   123: iconst_1
    //   124: if_icmpeq +8 -> 132
    //   127: iload_2
    //   128: iconst_2
    //   129: if_icmpne +782 -> 911
    //   132: invokestatic 319	com/tencent/mm/kernel/g:RP	()Lcom/tencent/mm/kernel/e;
    //   135: invokevirtual 325	com/tencent/mm/kernel/e:Ry	()Lcom/tencent/mm/storage/z;
    //   138: ldc_w 350
    //   141: getstatic 330	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   144: invokevirtual 336	com/tencent/mm/storage/z:get	(ILjava/lang/Object;)Ljava/lang/Object;
    //   147: checkcast 282	java/lang/Boolean
    //   150: invokevirtual 339	java/lang/Boolean:booleanValue	()Z
    //   153: istore 4
    //   155: goto -122 -> 33
    //   158: invokestatic 353	com/tencent/mm/m/a:MG	()Z
    //   161: istore 5
    //   163: invokestatic 356	com/tencent/mm/m/a:MI	()Z
    //   166: istore 6
    //   168: goto -117 -> 51
    //   171: astore 7
    //   173: iconst_1
    //   174: istore 4
    //   176: ldc 130
    //   178: new 187	java/lang/StringBuilder
    //   181: dup
    //   182: ldc_w 358
    //   185: invokespecial 192	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   188: aload 7
    //   190: invokevirtual 361	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   193: invokevirtual 199	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   196: invokevirtual 207	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   199: invokestatic 265	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   202: iconst_1
    //   203: istore 6
    //   205: goto -100 -> 105
    //   208: aload_0
    //   209: getfield 40	com/tencent/mm/plugin/voip/video/i:aFV	Z
    //   212: ifeq +12 -> 224
    //   215: sipush 5104
    //   218: invokestatic 100	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   221: goto -100 -> 121
    //   224: iload 4
    //   226: ifeq +648 -> 874
    //   229: aload_0
    //   230: invokestatic 178	java/lang/System:currentTimeMillis	()J
    //   233: putfield 180	com/tencent/mm/plugin/voip/video/i:tbi	J
    //   236: new 182	com/tencent/mm/compatible/b/k
    //   239: astore 7
    //   241: aload 7
    //   243: invokespecial 183	com/tencent/mm/compatible/b/k:<init>	()V
    //   246: aload_0
    //   247: aload 7
    //   249: putfield 185	com/tencent/mm/plugin/voip/video/i:tbg	Landroid/media/MediaPlayer;
    //   252: aload_0
    //   253: getfield 185	com/tencent/mm/plugin/voip/video/i:tbg	Landroid/media/MediaPlayer;
    //   256: astore 8
    //   258: aload_0
    //   259: getfield 58	com/tencent/mm/plugin/voip/video/i:mContext	Landroid/content/Context;
    //   262: astore 7
    //   264: new 187	java/lang/StringBuilder
    //   267: astore 9
    //   269: aload 9
    //   271: ldc 189
    //   273: invokespecial 192	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   276: aload 8
    //   278: aload 7
    //   280: aload 9
    //   282: aload_0
    //   283: getfield 58	com/tencent/mm/plugin/voip/video/i:mContext	Landroid/content/Context;
    //   286: invokevirtual 195	android/content/Context:getPackageName	()Ljava/lang/String;
    //   289: invokevirtual 199	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   292: ldc 201
    //   294: invokevirtual 199	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   297: iload_1
    //   298: invokevirtual 204	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   301: invokevirtual 207	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   304: invokestatic 213	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   307: invokevirtual 219	android/media/MediaPlayer:setDataSource	(Landroid/content/Context;Landroid/net/Uri;)V
    //   310: aload_0
    //   311: getfield 185	com/tencent/mm/plugin/voip/video/i:tbg	Landroid/media/MediaPlayer;
    //   314: astore 7
    //   316: new 363	com/tencent/mm/plugin/voip/video/i$1
    //   319: astore 8
    //   321: aload 8
    //   323: aload_0
    //   324: invokespecial 364	com/tencent/mm/plugin/voip/video/i$1:<init>	(Lcom/tencent/mm/plugin/voip/video/i;)V
    //   327: aload 7
    //   329: aload 8
    //   331: invokevirtual 228	android/media/MediaPlayer:setOnCompletionListener	(Landroid/media/MediaPlayer$OnCompletionListener;)V
    //   334: aload_0
    //   335: getfield 185	com/tencent/mm/plugin/voip/video/i:tbg	Landroid/media/MediaPlayer;
    //   338: astore 8
    //   340: new 366	com/tencent/mm/plugin/voip/video/i$2
    //   343: astore 7
    //   345: aload 7
    //   347: aload_0
    //   348: invokespecial 367	com/tencent/mm/plugin/voip/video/i$2:<init>	(Lcom/tencent/mm/plugin/voip/video/i;)V
    //   351: aload 8
    //   353: aload 7
    //   355: invokevirtual 237	android/media/MediaPlayer:setOnErrorListener	(Landroid/media/MediaPlayer$OnErrorListener;)V
    //   358: invokestatic 64	com/tencent/mm/compatible/b/g:KK	()Lcom/tencent/mm/compatible/b/g;
    //   361: invokevirtual 370	com/tencent/mm/compatible/b/g:KP	()Z
    //   364: istore 4
    //   366: invokestatic 64	com/tencent/mm/compatible/b/g:KK	()Lcom/tencent/mm/compatible/b/g;
    //   369: invokevirtual 373	com/tencent/mm/compatible/b/g:KV	()Z
    //   372: istore 5
    //   374: ldc 130
    //   376: ldc_w 375
    //   379: iconst_2
    //   380: anewarray 4	java/lang/Object
    //   383: dup
    //   384: iconst_0
    //   385: iload 4
    //   387: invokestatic 285	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   390: aastore
    //   391: dup
    //   392: iconst_1
    //   393: iload 5
    //   395: invokestatic 285	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   398: aastore
    //   399: invokestatic 377	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   402: iload 4
    //   404: ifeq +135 -> 539
    //   407: invokestatic 64	com/tencent/mm/compatible/b/g:KK	()Lcom/tencent/mm/compatible/b/g;
    //   410: invokevirtual 380	com/tencent/mm/compatible/b/g:Lc	()I
    //   413: istore_1
    //   414: aload_0
    //   415: iconst_0
    //   416: invokevirtual 382	com/tencent/mm/plugin/voip/video/i:mE	(Z)V
    //   419: aload_0
    //   420: getfield 185	com/tencent/mm/plugin/voip/video/i:tbg	Landroid/media/MediaPlayer;
    //   423: iload_1
    //   424: invokevirtual 240	android/media/MediaPlayer:setAudioStreamType	(I)V
    //   427: iload 5
    //   429: ifne +8 -> 437
    //   432: iload 4
    //   434: ifeq +207 -> 641
    //   437: aload_0
    //   438: getfield 69	com/tencent/mm/plugin/voip/video/i:euK	Landroid/media/AudioManager;
    //   441: iload_1
    //   442: invokevirtual 386	android/media/AudioManager:getStreamMaxVolume	(I)I
    //   445: istore 10
    //   447: aload_0
    //   448: getfield 69	com/tencent/mm/plugin/voip/video/i:euK	Landroid/media/AudioManager;
    //   451: iload_1
    //   452: invokevirtual 389	android/media/AudioManager:getStreamVolume	(I)I
    //   455: istore 11
    //   457: iload 11
    //   459: istore_2
    //   460: iload 11
    //   462: iload 10
    //   464: iconst_2
    //   465: idiv
    //   466: if_icmple +8 -> 474
    //   469: iload 10
    //   471: iconst_2
    //   472: idiv
    //   473: istore_2
    //   474: aload_0
    //   475: getfield 69	com/tencent/mm/plugin/voip/video/i:euK	Landroid/media/AudioManager;
    //   478: iload_1
    //   479: iload_2
    //   480: invokestatic 395	com/tencent/mm/compatible/b/a:b	(Landroid/media/AudioManager;II)V
    //   483: aload_0
    //   484: getfield 185	com/tencent/mm/plugin/voip/video/i:tbg	Landroid/media/MediaPlayer;
    //   487: iconst_1
    //   488: invokevirtual 249	android/media/MediaPlayer:setLooping	(Z)V
    //   491: aload_0
    //   492: getfield 185	com/tencent/mm/plugin/voip/video/i:tbg	Landroid/media/MediaPlayer;
    //   495: invokevirtual 252	android/media/MediaPlayer:prepare	()V
    //   498: aload_0
    //   499: getfield 185	com/tencent/mm/plugin/voip/video/i:tbg	Landroid/media/MediaPlayer;
    //   502: invokevirtual 255	android/media/MediaPlayer:start	()V
    //   505: invokestatic 178	java/lang/System:currentTimeMillis	()J
    //   508: aload_0
    //   509: getfield 180	com/tencent/mm/plugin/voip/video/i:tbi	J
    //   512: lsub
    //   513: ldc2_w 256
    //   516: lcmp
    //   517: ifle +8 -> 525
    //   520: aload_0
    //   521: iconst_3
    //   522: putfield 43	com/tencent/mm/plugin/voip/video/i:tbh	I
    //   525: aload_0
    //   526: iconst_1
    //   527: putfield 40	com/tencent/mm/plugin/voip/video/i:aFV	Z
    //   530: sipush 5104
    //   533: invokestatic 100	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   536: goto -415 -> 121
    //   539: iload_3
    //   540: ifne +8 -> 548
    //   543: iload 5
    //   545: ifeq +63 -> 608
    //   548: getstatic 291	com/tencent/mm/compatible/e/q:etd	Lcom/tencent/mm/compatible/e/b;
    //   551: getfield 398	com/tencent/mm/compatible/e/b:eqm	I
    //   554: iflt +352 -> 906
    //   557: getstatic 291	com/tencent/mm/compatible/e/q:etd	Lcom/tencent/mm/compatible/e/b;
    //   560: getfield 398	com/tencent/mm/compatible/e/b:eqm	I
    //   563: istore_1
    //   564: iload 5
    //   566: ifne +8 -> 574
    //   569: iload_2
    //   570: iconst_1
    //   571: if_icmpne +11 -> 582
    //   574: aload_0
    //   575: iconst_0
    //   576: invokevirtual 382	com/tencent/mm/plugin/voip/video/i:mE	(Z)V
    //   579: goto -160 -> 419
    //   582: iconst_3
    //   583: istore_1
    //   584: getstatic 291	com/tencent/mm/compatible/e/q:etd	Lcom/tencent/mm/compatible/e/b;
    //   587: getfield 401	com/tencent/mm/compatible/e/b:eqj	I
    //   590: iflt +10 -> 600
    //   593: getstatic 291	com/tencent/mm/compatible/e/q:etd	Lcom/tencent/mm/compatible/e/b;
    //   596: getfield 401	com/tencent/mm/compatible/e/b:eqj	I
    //   599: istore_1
    //   600: aload_0
    //   601: iconst_1
    //   602: invokevirtual 382	com/tencent/mm/plugin/voip/video/i:mE	(Z)V
    //   605: goto -186 -> 419
    //   608: invokestatic 64	com/tencent/mm/compatible/b/g:KK	()Lcom/tencent/mm/compatible/b/g;
    //   611: invokevirtual 370	com/tencent/mm/compatible/b/g:KP	()Z
    //   614: ifne +287 -> 901
    //   617: getstatic 291	com/tencent/mm/compatible/e/q:etd	Lcom/tencent/mm/compatible/e/b;
    //   620: getfield 404	com/tencent/mm/compatible/e/b:eqo	I
    //   623: iflt +278 -> 901
    //   626: getstatic 291	com/tencent/mm/compatible/e/q:etd	Lcom/tencent/mm/compatible/e/b;
    //   629: getfield 404	com/tencent/mm/compatible/e/b:eqo	I
    //   632: istore_1
    //   633: aload_0
    //   634: iconst_1
    //   635: invokevirtual 382	com/tencent/mm/plugin/voip/video/i:mE	(Z)V
    //   638: goto -219 -> 419
    //   641: iload_3
    //   642: ifeq +98 -> 740
    //   645: aload_0
    //   646: getfield 185	com/tencent/mm/plugin/voip/video/i:tbg	Landroid/media/MediaPlayer;
    //   649: ldc 241
    //   651: ldc 241
    //   653: invokevirtual 245	android/media/MediaPlayer:setVolume	(FF)V
    //   656: goto -173 -> 483
    //   659: astore 7
    //   661: new 187	java/lang/StringBuilder
    //   664: astore 8
    //   666: aload 8
    //   668: ldc_w 406
    //   671: invokespecial 192	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   674: ldc 130
    //   676: aload 8
    //   678: aload 7
    //   680: invokevirtual 407	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   683: invokevirtual 199	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   686: invokevirtual 207	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   689: invokestatic 265	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   692: aload_0
    //   693: iconst_2
    //   694: putfield 43	com/tencent/mm/plugin/voip/video/i:tbh	I
    //   697: aload_0
    //   698: getfield 58	com/tencent/mm/plugin/voip/video/i:mContext	Landroid/content/Context;
    //   701: iconst_1
    //   702: invokestatic 413	android/media/RingtoneManager:getActualDefaultRingtoneUri	(Landroid/content/Context;I)Landroid/net/Uri;
    //   705: astore 7
    //   707: aload_0
    //   708: aload_0
    //   709: getfield 58	com/tencent/mm/plugin/voip/video/i:mContext	Landroid/content/Context;
    //   712: aload 7
    //   714: invokestatic 416	com/tencent/mm/compatible/b/k:d	(Landroid/content/Context;Landroid/net/Uri;)Lcom/tencent/mm/compatible/b/k;
    //   717: putfield 185	com/tencent/mm/plugin/voip/video/i:tbg	Landroid/media/MediaPlayer;
    //   720: aload_0
    //   721: getfield 185	com/tencent/mm/plugin/voip/video/i:tbg	Landroid/media/MediaPlayer;
    //   724: astore 7
    //   726: aload 7
    //   728: ifnonnull +61 -> 789
    //   731: sipush 5104
    //   734: invokestatic 100	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   737: goto -616 -> 121
    //   740: iload 6
    //   742: ifeq -259 -> 483
    //   745: aload_0
    //   746: invokespecial 259	com/tencent/mm/plugin/voip/video/i:cLL	()V
    //   749: goto -266 -> 483
    //   752: astore 7
    //   754: ldc 130
    //   756: new 187	java/lang/StringBuilder
    //   759: dup
    //   760: ldc_w 261
    //   763: invokespecial 192	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   766: aload 7
    //   768: invokevirtual 262	java/lang/Exception:toString	()Ljava/lang/String;
    //   771: invokevirtual 199	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   774: invokevirtual 207	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   777: invokestatic 265	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   780: sipush 5104
    //   783: invokestatic 100	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   786: goto -665 -> 121
    //   789: aload_0
    //   790: getfield 185	com/tencent/mm/plugin/voip/video/i:tbg	Landroid/media/MediaPlayer;
    //   793: invokevirtual 419	android/media/MediaPlayer:stop	()V
    //   796: aload_0
    //   797: getfield 185	com/tencent/mm/plugin/voip/video/i:tbg	Landroid/media/MediaPlayer;
    //   800: invokevirtual 252	android/media/MediaPlayer:prepare	()V
    //   803: aload_0
    //   804: getfield 185	com/tencent/mm/plugin/voip/video/i:tbg	Landroid/media/MediaPlayer;
    //   807: iconst_1
    //   808: invokevirtual 249	android/media/MediaPlayer:setLooping	(Z)V
    //   811: iload_3
    //   812: ifeq +50 -> 862
    //   815: aload_0
    //   816: getfield 185	com/tencent/mm/plugin/voip/video/i:tbg	Landroid/media/MediaPlayer;
    //   819: ldc 241
    //   821: ldc 241
    //   823: invokevirtual 245	android/media/MediaPlayer:setVolume	(FF)V
    //   826: aload_0
    //   827: getfield 185	com/tencent/mm/plugin/voip/video/i:tbg	Landroid/media/MediaPlayer;
    //   830: invokevirtual 255	android/media/MediaPlayer:start	()V
    //   833: aload_0
    //   834: iconst_0
    //   835: putfield 43	com/tencent/mm/plugin/voip/video/i:tbh	I
    //   838: goto -313 -> 525
    //   841: astore 7
    //   843: ldc_w 421
    //   846: aload 7
    //   848: invokevirtual 361	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   851: invokestatic 265	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   854: aload_0
    //   855: iconst_2
    //   856: putfield 43	com/tencent/mm/plugin/voip/video/i:tbh	I
    //   859: goto -334 -> 525
    //   862: iload 6
    //   864: ifeq -38 -> 826
    //   867: aload_0
    //   868: invokespecial 259	com/tencent/mm/plugin/voip/video/i:cLL	()V
    //   871: goto -45 -> 826
    //   874: iload 6
    //   876: ifeq +11 -> 887
    //   879: iload_3
    //   880: ifne +7 -> 887
    //   883: aload_0
    //   884: invokespecial 259	com/tencent/mm/plugin/voip/video/i:cLL	()V
    //   887: sipush 5104
    //   890: invokestatic 100	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   893: goto -772 -> 121
    //   896: astore 7
    //   898: goto -722 -> 176
    //   901: iconst_2
    //   902: istore_1
    //   903: goto -270 -> 633
    //   906: iconst_0
    //   907: istore_1
    //   908: goto -344 -> 564
    //   911: iconst_1
    //   912: istore 4
    //   914: goto -881 -> 33
    //
    // Exception table:
    //   from	to	target	type
    //   10	33	171	java/lang/Exception
    //   132	155	171	java/lang/Exception
    //   252	402	659	java/lang/Throwable
    //   407	419	659	java/lang/Throwable
    //   419	427	659	java/lang/Throwable
    //   437	457	659	java/lang/Throwable
    //   460	474	659	java/lang/Throwable
    //   474	483	659	java/lang/Throwable
    //   483	525	659	java/lang/Throwable
    //   548	564	659	java/lang/Throwable
    //   574	579	659	java/lang/Throwable
    //   584	600	659	java/lang/Throwable
    //   600	605	659	java/lang/Throwable
    //   608	633	659	java/lang/Throwable
    //   633	638	659	java/lang/Throwable
    //   645	656	659	java/lang/Throwable
    //   745	749	659	java/lang/Throwable
    //   229	252	752	java/lang/Exception
    //   252	402	752	java/lang/Exception
    //   407	419	752	java/lang/Exception
    //   419	427	752	java/lang/Exception
    //   437	457	752	java/lang/Exception
    //   460	474	752	java/lang/Exception
    //   474	483	752	java/lang/Exception
    //   483	525	752	java/lang/Exception
    //   525	530	752	java/lang/Exception
    //   548	564	752	java/lang/Exception
    //   574	579	752	java/lang/Exception
    //   584	600	752	java/lang/Exception
    //   600	605	752	java/lang/Exception
    //   608	633	752	java/lang/Exception
    //   633	638	752	java/lang/Exception
    //   645	656	752	java/lang/Exception
    //   661	697	752	java/lang/Exception
    //   745	749	752	java/lang/Exception
    //   843	859	752	java/lang/Exception
    //   697	726	841	java/lang/Exception
    //   789	811	841	java/lang/Exception
    //   815	826	841	java/lang/Exception
    //   826	838	841	java/lang/Exception
    //   867	871	841	java/lang/Exception
    //   33	51	896	java/lang/Exception
    //   51	94	896	java/lang/Exception
    //   158	168	896	java/lang/Exception
  }

  public final void r(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(5109);
    if ((paramInt1 == 2131231812) && (!g.KK().KP()) && (!g.KK().KV()) && ((this.euK.getRingerMode() == 0) || (this.euK.getRingerMode() == 1)))
      AppMethodBeat.o(5109);
    while (true)
    {
      return;
      this.mContext.getSharedPreferences(ah.doA(), 0).getBoolean("settings_shake", true);
      ab.i("MicroMsg.RingPlayer", "playSound, type: %s, changeStreamType: %s, shake: %s", new Object[] { Integer.valueOf(paramInt2), Boolean.valueOf(paramBoolean), Boolean.FALSE });
      this.tbj = System.currentTimeMillis();
      k localk = new k();
      try
      {
        Context localContext = this.mContext;
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>("android.resource://");
        localk.setDataSource(localContext, Uri.parse(this.mContext.getPackageName() + "/" + paramInt1));
        localObject = new com/tencent/mm/plugin/voip/video/i$5;
        ((i.5)localObject).<init>(this);
        localk.setOnCompletionListener((MediaPlayer.OnCompletionListener)localObject);
        localObject = new com/tencent/mm/plugin/voip/video/i$6;
        ((i.6)localObject).<init>(this);
        localk.setOnErrorListener((MediaPlayer.OnErrorListener)localObject);
        if (paramBoolean)
          if (!g.KK().KP())
            break label321;
        label321: for (paramInt2 = g.KK().Lc(); ; paramInt2 = 0)
        {
          localk.setAudioStreamType(paramInt2);
          if ((paramInt1 == 2131231812) && ((g.KK().KP()) || (g.KK().KV())))
            localk.setVolume(0.5F, 0.5F);
          localk.prepare();
          localk.setLooping(false);
          localk.start();
          if (System.currentTimeMillis() - this.tbj > 2000L)
            this.tbh = 7;
          AppMethodBeat.o(5109);
          break;
        }
      }
      catch (Throwable localThrowable)
      {
        ab.w("MicroMsg.RingPlayer", "playSound Failed Throwable t = ", new Object[] { localThrowable });
        this.tbh = 6;
        AppMethodBeat.o(5109);
      }
    }
  }

  public final void stop()
  {
    AppMethodBeat.i(5103);
    ab.d("MicroMsg.RingPlayer", "stop, isStarted: %b", new Object[] { Boolean.valueOf(this.aFV) });
    cLM();
    if ((this.tbg == null) || (!this.aFV))
      AppMethodBeat.o(5103);
    while (true)
    {
      return;
      try
      {
        this.tbg.stop();
        this.tbg.release();
        if (this.tbk != null)
          this.fbD.removeCallbacks(this.tbk);
        this.aFV = false;
        g.KK().setMode(0);
        AppMethodBeat.o(5103);
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.RingPlayer", localException.toString());
        AppMethodBeat.o(5103);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.video.i
 * JD-Core Version:    0.6.2
 */