package com.tencent.mm.plugin.ipcall;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.net.Uri;
import android.os.Looper;
import android.support.v4.app.v.c;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.an;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.ipcall.a.b.a.1;
import com.tencent.mm.plugin.ipcall.a.b.b.a;
import com.tencent.mm.plugin.ipcall.a.b.c.a;
import com.tencent.mm.plugin.ipcall.a.f;
import com.tencent.mm.plugin.ipcall.a.g.l;
import com.tencent.mm.plugin.ipcall.a.g.m;
import com.tencent.mm.plugin.ipcall.ui.IPCallTalkUI;
import com.tencent.mm.plugin.ipcall.ui.j;
import com.tencent.mm.plugin.voip.HeadsetPlugReceiver;
import com.tencent.mm.plugin.voip.HeadsetPlugReceiver.a;
import com.tencent.mm.plugin.voip.model.p;
import com.tencent.mm.plugin.voip.model.p.a;
import com.tencent.mm.plugin.voip.model.r;
import com.tencent.mm.plugin.voip.model.s;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.plugin.voip.video.i.7;
import com.tencent.mm.plugin.voip.video.i.8;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

public final class c
  implements com.tencent.mm.plugin.ipcall.a.c.a.a, com.tencent.mm.plugin.ipcall.a.g.a, p.a
{
  private static ak fbD;
  private ap che;
  public Object meM;
  public e nuX;
  private com.tencent.mm.plugin.ipcall.a.g.k nuY;
  private boolean nuZ;
  private TelephonyManager nva;
  private PhoneStateListener nvb;
  private com.tencent.mm.sdk.b.c nvc;
  private Runnable nvd;
  private Runnable nve;
  public boolean nvf;
  public com.tencent.mm.plugin.voip.ui.a nvg;
  private long nvh;

  static
  {
    AppMethodBeat.i(21701);
    fbD = new ak(Looper.getMainLooper());
    AppMethodBeat.o(21701);
  }

  public c()
  {
    AppMethodBeat.i(21672);
    this.nuZ = false;
    this.meM = new Object();
    this.nvb = new c.1(this);
    this.nvc = new c.2(this);
    this.nvd = new c.3(this);
    this.nve = new Runnable()
    {
      // ERROR //
      public final void run()
      {
        // Byte code:
        //   0: iconst_0
        //   1: istore_1
        //   2: iconst_1
        //   3: istore_2
        //   4: sipush 21668
        //   7: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
        //   10: invokestatic 33	com/tencent/mm/plugin/ipcall/a/i:bHA	()Lcom/tencent/mm/plugin/voip/video/i;
        //   13: astore_3
        //   14: aload_3
        //   15: iconst_0
        //   16: putfield 39	com/tencent/mm/plugin/voip/video/i:tbh	I
        //   19: ldc2_w 40
        //   22: ldc2_w 42
        //   25: lcmp
        //   26: ifeq +245 -> 271
        //   29: invokestatic 49	com/tencent/mm/kernel/g:RP	()Lcom/tencent/mm/kernel/e;
        //   32: invokevirtual 55	com/tencent/mm/kernel/e:Ry	()Lcom/tencent/mm/storage/z;
        //   35: ldc 56
        //   37: getstatic 62	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
        //   40: invokevirtual 68	com/tencent/mm/storage/z:get	(ILjava/lang/Object;)Ljava/lang/Object;
        //   43: checkcast 58	java/lang/Boolean
        //   46: invokevirtual 72	java/lang/Boolean:booleanValue	()Z
        //   49: istore 4
        //   51: ldc 74
        //   53: ldc 76
        //   55: iconst_3
        //   56: anewarray 4	java/lang/Object
        //   59: dup
        //   60: iconst_0
        //   61: iload 4
        //   63: invokestatic 80	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
        //   66: aastore
        //   67: dup
        //   68: iconst_1
        //   69: invokestatic 85	com/tencent/mm/m/a:MG	()Z
        //   72: invokestatic 80	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
        //   75: aastore
        //   76: dup
        //   77: iconst_2
        //   78: getstatic 62	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
        //   81: aastore
        //   82: invokestatic 90	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   85: iload_2
        //   86: istore 4
        //   88: iload 4
        //   90: ifeq +172 -> 262
        //   93: aload_3
        //   94: getfield 94	com/tencent/mm/plugin/voip/video/i:aFV	Z
        //   97: ifne +165 -> 262
        //   100: aload_3
        //   101: invokestatic 100	java/lang/System:currentTimeMillis	()J
        //   104: putfield 104	com/tencent/mm/plugin/voip/video/i:tbi	J
        //   107: new 106	com/tencent/mm/compatible/b/k
        //   110: astore 5
        //   112: aload 5
        //   114: invokespecial 107	com/tencent/mm/compatible/b/k:<init>	()V
        //   117: aload_3
        //   118: aload 5
        //   120: putfield 111	com/tencent/mm/plugin/voip/video/i:tbg	Landroid/media/MediaPlayer;
        //   123: ldc 74
        //   125: ldc 113
        //   127: iconst_2
        //   128: anewarray 4	java/lang/Object
        //   131: dup
        //   132: iconst_0
        //   133: invokestatic 119	com/tencent/mm/compatible/b/g:KK	()Lcom/tencent/mm/compatible/b/g;
        //   136: invokevirtual 122	com/tencent/mm/compatible/b/g:KP	()Z
        //   139: invokestatic 80	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
        //   142: aastore
        //   143: dup
        //   144: iconst_1
        //   145: invokestatic 119	com/tencent/mm/compatible/b/g:KK	()Lcom/tencent/mm/compatible/b/g;
        //   148: invokevirtual 125	com/tencent/mm/compatible/b/g:KV	()Z
        //   151: invokestatic 80	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
        //   154: aastore
        //   155: invokestatic 128	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   158: getstatic 134	com/tencent/mm/compatible/e/q:etd	Lcom/tencent/mm/compatible/e/b;
        //   161: getfield 139	com/tencent/mm/compatible/e/b:eqm	I
        //   164: iflt +10 -> 174
        //   167: getstatic 134	com/tencent/mm/compatible/e/q:etd	Lcom/tencent/mm/compatible/e/b;
        //   170: getfield 139	com/tencent/mm/compatible/e/b:eqm	I
        //   173: istore_1
        //   174: aload_3
        //   175: iconst_0
        //   176: invokevirtual 143	com/tencent/mm/plugin/voip/video/i:mE	(Z)V
        //   179: aload_3
        //   180: ldc 144
        //   182: ldc2_w 40
        //   185: iconst_1
        //   186: iload_1
        //   187: invokevirtual 148	com/tencent/mm/plugin/voip/video/i:a	(IJZI)V
        //   190: aload_3
        //   191: iconst_1
        //   192: putfield 94	com/tencent/mm/plugin/voip/video/i:aFV	Z
        //   195: sipush 21668
        //   198: invokestatic 151	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
        //   201: return
        //   202: astore 5
        //   204: iconst_1
        //   205: istore 4
        //   207: ldc 74
        //   209: new 153	java/lang/StringBuilder
        //   212: dup
        //   213: ldc 155
        //   215: invokespecial 158	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
        //   218: aload 5
        //   220: invokevirtual 162	java/lang/Exception:getMessage	()Ljava/lang/String;
        //   223: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   226: invokevirtual 169	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   229: invokestatic 173	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
        //   232: goto -144 -> 88
        //   235: astore 5
        //   237: ldc 74
        //   239: new 153	java/lang/StringBuilder
        //   242: dup
        //   243: ldc 175
        //   245: invokespecial 158	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
        //   248: aload 5
        //   250: invokevirtual 176	java/lang/Exception:toString	()Ljava/lang/String;
        //   253: invokevirtual 166	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   256: invokevirtual 169	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   259: invokestatic 173	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
        //   262: sipush 21668
        //   265: invokestatic 151	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
        //   268: goto -67 -> 201
        //   271: aload_3
        //   272: ldc 144
        //   274: iconst_2
        //   275: iconst_1
        //   276: invokevirtual 180	com/tencent/mm/plugin/voip/video/i:q	(IIZ)V
        //   279: sipush 21668
        //   282: invokestatic 151	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
        //   285: goto -84 -> 201
        //   288: astore 5
        //   290: goto -83 -> 207
        //
        // Exception table:
        //   from	to	target	type
        //   29	51	202	java/lang/Exception
        //   100	158	235	java/lang/Exception
        //   158	174	235	java/lang/Exception
        //   174	195	235	java/lang/Exception
        //   51	85	288	java/lang/Exception
      }
    };
    this.nvg = new c.5(this);
    this.nvh = 0L;
    AppMethodBeat.o(21672);
  }

  public static boolean OL(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(21676);
    ab.d("MicroMsg.IPCallManager", "dialWhenTalking, dialButton: %s", new Object[] { paramString });
    if (!com.tencent.mm.plugin.ipcall.a.i.bHu().bHn())
    {
      ab.i("MicroMsg.IPCallManager", "ipcall not connect, cannot call dialWhenTalking now");
      AppMethodBeat.o(21676);
    }
    while (true)
    {
      return bool;
      if ((!bo.isNullOrNil(paramString)) && (paramString.length() == 1))
      {
        int i;
        if ((!bo.isNullOrNil(paramString)) && (paramString.length() == 1))
        {
          i = paramString.charAt(0);
          if ((i >= 48) && (i <= 57))
            i -= 48;
        }
        while (true)
        {
          if (i == -1)
            break label254;
          paramString = com.tencent.mm.plugin.ipcall.a.i.bHr();
          ab.d("MicroMsg.IPCallEngineManager", "sendDTMF: %d", new Object[] { Integer.valueOf(i) });
          com.tencent.mm.plugin.ipcall.a.c.b localb = com.tencent.mm.plugin.ipcall.a.i.bHs();
          localb.nye += 1;
          ab.i("MicroMsg.IPCallReportHelper", "now addCallClickCnt %d", new Object[] { Integer.valueOf(localb.nye) });
          i = paramString.nxx.SendDTMF(i);
          if (i < 0)
            ab.i("MicroMsg.IPCallEngineManager", "sendDTMF failed, ret: %d", new Object[] { Integer.valueOf(i) });
          AppMethodBeat.o(21676);
          bool = true;
          break;
          if (i == 42)
            i = 10;
          else if (i == 35)
            i = 11;
          else if ((i >= 65) && (i <= 68))
            i = i - 65 + 12;
          else
            i = -1;
        }
      }
      label254: AppMethodBeat.o(21676);
    }
  }

  private boolean Y(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(21675);
    ??? = com.tencent.mm.plugin.ipcall.a.i.bHq().nvN;
    boolean bool;
    if (!com.tencent.mm.plugin.ipcall.a.i.bHu().xg(paramInt1))
    {
      ab.i("MicroMsg.IPCallManager", "finishIPCall, cannot finish now, currentState: %s", new Object[] { f.stateToString(com.tencent.mm.plugin.ipcall.a.i.bHu().mCurrentState) });
      if (??? != null)
        ab.i("MicroMsg.IPCallManager", "finishIPCall, cannot finish now inviteId:%d, roomId:%d, state:%d,errStatus:%d, pstnErrCode:%d", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.ipcall.a.a.c)???).nwx), Integer.valueOf(((com.tencent.mm.plugin.ipcall.a.a.c)???).nwu), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      bool = false;
      AppMethodBeat.o(21675);
    }
    label2181: 
    while (true)
    {
      return bool;
      if (??? != null)
        ab.i("MicroMsg.IPCallManager", "finishIPCall inviteId:%d, roomId:%d, state:%d, errStatus:%d, pstnErrCode:%d", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.ipcall.a.a.c)???).nwx), Integer.valueOf(((com.tencent.mm.plugin.ipcall.a.a.c)???).nwu), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      ab.i("MicroMsg.IPCallManager", "closeDeviceEngine");
      p.cJR().cJT();
      p.cJR().a(null);
      ??? = com.tencent.mm.plugin.ipcall.a.i.bHs();
      ??? = com.tencent.mm.plugin.ipcall.a.i.bHt();
      int i;
      label240: Object localObject6;
      label328: Object localObject7;
      if (((com.tencent.mm.plugin.ipcall.a.b.b)???).nxg != null)
      {
        ??? = ((com.tencent.mm.plugin.ipcall.a.b.b)???).nxg;
        if (((com.tencent.mm.plugin.ipcall.a.b.c)???).nxm != null)
        {
          i = ((com.tencent.mm.plugin.ipcall.a.b.c)???).nxm.cpq;
          if (((com.tencent.mm.plugin.ipcall.a.c.b)???).nyb == 0)
            ((com.tencent.mm.plugin.ipcall.a.c.b)???).nyb = i;
          ??? = com.tencent.mm.plugin.ipcall.a.i.bHs();
          ??? = com.tencent.mm.plugin.ipcall.a.i.bHt();
          if (((com.tencent.mm.plugin.ipcall.a.b.b)???).nxf == null)
            break label1701;
          ??? = ((com.tencent.mm.plugin.ipcall.a.b.b)???).nxf;
          if (((com.tencent.mm.plugin.ipcall.a.b.a)???).kzq == null)
            break label1695;
          ab.d("MicroMsg.IPCallAudioPlayer", "AudioPlayer  mAudioPlayErrState:" + ((com.tencent.mm.plugin.ipcall.a.b.a)???).kzq.cIs());
          i = ((com.tencent.mm.plugin.ipcall.a.b.a)???).kzq.cIs();
          if (((com.tencent.mm.plugin.ipcall.a.c.b)???).nyc == 0)
            ((com.tencent.mm.plugin.ipcall.a.c.b)???).nyc = i;
          ??? = com.tencent.mm.plugin.ipcall.a.i.bHt();
          localObject6 = com.tencent.mm.plugin.ipcall.a.i.bHr();
          i = 0;
          if (((com.tencent.mm.plugin.ipcall.a.b.b)???).nxf != null)
          {
            ??? = ((com.tencent.mm.plugin.ipcall.a.b.b)???).nxf;
            if ((((com.tencent.mm.plugin.ipcall.a.b.a)???).kzq == null) || (!((com.tencent.mm.plugin.ipcall.a.b.a)???).cFy))
              break label1707;
            i = ((com.tencent.mm.plugin.ipcall.a.b.a)???).kzq.cIt();
          }
          label397: if (i != -1)
            break label1713;
          i = 0;
          label406: ((com.tencent.mm.plugin.ipcall.a.c.a)localObject6).nxx.sUz = i;
          ((com.tencent.mm.plugin.ipcall.a.b.b)???).gar.Mm();
          localObject7 = ((com.tencent.mm.plugin.ipcall.a.b.b)???).nxf;
          if (((com.tencent.mm.plugin.ipcall.a.b.a)localObject7).cFy)
            ab.i("MicroMsg.IPCallAudioPlayer", "stopPlay");
          synchronized (((com.tencent.mm.plugin.ipcall.a.b.a)localObject7).nxa)
          {
            localObject6 = new com/tencent/mm/plugin/ipcall/a/b/a$a;
            ((com.tencent.mm.plugin.ipcall.a.b.a.a)localObject6).<init>((com.tencent.mm.plugin.ipcall.a.b.a)localObject7, ((com.tencent.mm.plugin.ipcall.a.b.a)localObject7).kzq);
            com.tencent.mm.sdk.g.d.post((Runnable)localObject6, "IPCallAudioPlayer_stop");
            ((com.tencent.mm.plugin.ipcall.a.b.a)localObject7).cFy = false;
            ((com.tencent.mm.plugin.ipcall.a.b.a)localObject7).kzq = null;
            ((com.tencent.mm.plugin.ipcall.a.b.b)???).crP = null;
            ((com.tencent.mm.plugin.ipcall.a.b.b)???).kzs.fa(ah.getContext());
            aw.ZL().KN();
            aw.ZL().b((com.tencent.mm.compatible.b.g.a)???);
            ((com.tencent.mm.plugin.ipcall.a.b.b)???).nxk = null;
            ((com.tencent.mm.plugin.ipcall.a.b.b)???).nxi = null;
            localObject7 = com.tencent.mm.plugin.ipcall.a.i.bHt();
            ??? = ((com.tencent.mm.plugin.ipcall.a.b.b)localObject7).nxg;
            if (((com.tencent.mm.plugin.ipcall.a.b.c)???).cFy)
              ab.i("MicroMsg.IPCallRecorder", "stop record");
            synchronized (((com.tencent.mm.plugin.ipcall.a.b.c)???).nxn)
            {
              if (((com.tencent.mm.plugin.ipcall.a.b.c)???).nxm != null)
              {
                localObject6 = new com/tencent/mm/plugin/ipcall/a/b/c$a;
                ((c.a)localObject6).<init>((com.tencent.mm.plugin.ipcall.a.b.c)???, ((com.tencent.mm.plugin.ipcall.a.b.c)???).nxm);
                com.tencent.mm.sdk.g.d.post((Runnable)localObject6, "IPCallRecorder_stopRecord");
                ((com.tencent.mm.plugin.ipcall.a.b.c)???).nxm = null;
                ((com.tencent.mm.plugin.ipcall.a.b.c)???).cFy = false;
                ((com.tencent.mm.plugin.ipcall.a.b.c)???).eif = false;
              }
              ((com.tencent.mm.plugin.ipcall.a.b.b)localObject7).crP = null;
              ??? = com.tencent.mm.plugin.ipcall.a.i.bHr();
              ab.i("MicroMsg.IPCallEngineManager", "close engine");
              ((com.tencent.mm.plugin.ipcall.a.c.a)???).nxx.mx(true);
              ??? = com.tencent.mm.plugin.ipcall.a.i.bHs();
              if ((bo.isNullOrNil(((com.tencent.mm.plugin.ipcall.a.c.b)???).nxW)) && (bo.isNullOrNil(((com.tencent.mm.plugin.ipcall.a.c.b)???).nxV)))
              {
                localObject7 = com.tencent.mm.plugin.ipcall.a.i.bHq().nvN;
                localObject6 = com.tencent.mm.plugin.ipcall.a.i.bHr().nxx;
                if (((com.tencent.mm.plugin.ipcall.a.c.b)???).nxL == 1)
                {
                  i = 1;
                  label719: int j = ((com.tencent.mm.plugin.ipcall.a.a.c)localObject7).nwQ;
                  localObject7 = ((v2protocal)localObject6).sVD;
                  int k = ((v2protocal)localObject6).sVD.length;
                  if (i == 0)
                    break label1780;
                  i = 1;
                  label749: ((v2protocal)localObject6).getPstnChannelInfo((byte[])localObject7, k, i, j);
                  ab.d("MicroMsg.Voip", "field_pstnChannelInfoLength: %d", new Object[] { Integer.valueOf(((v2protocal)localObject6).field_pstnChannelInfoLength) });
                  ((com.tencent.mm.plugin.ipcall.a.c.b)???).nxW = new String(((v2protocal)localObject6).sVD, 0, ((v2protocal)localObject6).field_pstnChannelInfoLength);
                  localObject6 = com.tencent.mm.plugin.ipcall.a.i.bHr().nxx;
                  ((v2protocal)localObject6).getPstnEngineInfo(((v2protocal)localObject6).sVE, ((v2protocal)localObject6).sVE.length);
                  ab.d("MicroMsg.Voip", "field_pstnEngineInfoLength: %d", new Object[] { Integer.valueOf(((v2protocal)localObject6).field_pstnEngineInfoLength) });
                  ((com.tencent.mm.plugin.ipcall.a.c.b)???).nxV = new String(((v2protocal)localObject6).sVE, 0, ((v2protocal)localObject6).field_pstnEngineInfoLength);
                  ((com.tencent.mm.plugin.ipcall.a.c.b)???).nxX = com.tencent.mm.plugin.ipcall.a.i.bHr().nxx.cKJ();
                  ab.d("MicroMsg.IPCallReportHelper", "nativeChannelReportString: %s", new Object[] { ((com.tencent.mm.plugin.ipcall.a.c.b)???).nxW });
                  ab.d("MicroMsg.IPCallReportHelper", "nativeEngineReportString: %s", new Object[] { ((com.tencent.mm.plugin.ipcall.a.c.b)???).nxV });
                  ab.d("MicroMsg.IPCallReportHelper", "clientReportExString: %s", new Object[] { ((com.tencent.mm.plugin.ipcall.a.c.b)???).nxX });
                }
              }
              else
              {
                ((com.tencent.mm.plugin.ipcall.a.c.a)???).nxx.reset();
                ((com.tencent.mm.plugin.ipcall.a.c.a)???).bHM();
                com.tencent.mm.plugin.ipcall.a.i.bHA().stop();
                ??? = com.tencent.mm.plugin.ipcall.a.i.bHA();
                com.tencent.mm.plugin.ipcall.a.i.bHt();
                bool = aw.ZL().eoY.isSpeakerphoneOn();
                ((com.tencent.mm.plugin.voip.video.i)???).mContext.getSharedPreferences(ah.doA(), 0).getBoolean("settings_shake", true);
                com.tencent.mm.compatible.b.g.KK().setSpeakerphoneOn(bool);
                if (!bool)
                  break label1786;
                com.tencent.mm.compatible.b.g.KK().setMode(0);
                label1037: ab.i("MicroMsg.RingPlayer", "playSound, shake: %s, isSpeakerOn: %s, type: %s", new Object[] { Boolean.FALSE, Boolean.valueOf(bool), Integer.valueOf(2) });
                ((com.tencent.mm.plugin.voip.video.i)???).tbj = System.currentTimeMillis();
                ??? = new com.tencent.mm.compatible.b.k();
              }
            }
          }
        }
      }
      label1695: label1701: label1707: label1713: label1842: label2288: 
      try
      {
        localObject6 = ((com.tencent.mm.plugin.voip.video.i)???).mContext;
        localObject7 = new java/lang/StringBuilder;
        ((StringBuilder)localObject7).<init>("android.resource://");
        ((MediaPlayer)???).setDataSource((Context)localObject6, Uri.parse(((com.tencent.mm.plugin.voip.video.i)???).mContext.getPackageName() + "/2131231812"));
        localObject6 = new com/tencent/mm/plugin/voip/video/i$7;
        ((i.7)localObject6).<init>((com.tencent.mm.plugin.voip.video.i)???);
        ((MediaPlayer)???).setOnCompletionListener((MediaPlayer.OnCompletionListener)localObject6);
        localObject6 = new com/tencent/mm/plugin/voip/video/i$8;
        ((i.8)localObject6).<init>((com.tencent.mm.plugin.voip.video.i)???);
        ((MediaPlayer)???).setOnErrorListener((MediaPlayer.OnErrorListener)localObject6);
        if ((com.tencent.mm.compatible.b.g.KK().KP()) || (!bool));
        for (i = 0; ; i = 2)
        {
          ((MediaPlayer)???).setAudioStreamType(i);
          ((MediaPlayer)???).prepare();
          ((MediaPlayer)???).setLooping(false);
          ((MediaPlayer)???).start();
          if (System.currentTimeMillis() - ((com.tencent.mm.plugin.voip.video.i)???).tbj > 2000L)
            ((com.tencent.mm.plugin.voip.video.i)???).tbh = 7;
          fbD.removeCallbacks(this.nve);
          fbD.removeCallbacks(this.nvd);
          if (this.che != null)
          {
            this.che.stopTimer();
            this.che = null;
          }
          com.tencent.mm.plugin.ipcall.a.i.bHs().nxN = paramInt3;
          ??? = com.tencent.mm.plugin.ipcall.a.i.bHs();
          ab.d("MicroMsg.IPCallReportHelper", "markEndTalk");
          if ((((com.tencent.mm.plugin.ipcall.a.c.b)???).nxU == 0L) && (((com.tencent.mm.plugin.ipcall.a.c.b)???).nxT != 0L))
          {
            ((com.tencent.mm.plugin.ipcall.a.c.b)???).nxU = System.currentTimeMillis();
            ((com.tencent.mm.plugin.ipcall.a.c.b)???).nxM = ((((com.tencent.mm.plugin.ipcall.a.c.b)???).nxU - ((com.tencent.mm.plugin.ipcall.a.c.b)???).nxT) / 1000L);
            ab.d("MicroMsg.IPCallReportHelper", "callTime: %d", new Object[] { Long.valueOf(((com.tencent.mm.plugin.ipcall.a.c.b)???).nxM) });
          }
          if (paramInt1 != 8)
            break label1842;
          com.tencent.mm.plugin.ipcall.a.i.bHq().bHo();
          com.tencent.mm.plugin.ipcall.a.i.bHs().bHO();
          ??? = this.nuY;
          if (??? != null)
          {
            ab.d("MicroMsg.IPCallRecordStorageLogic", "recordCancelCall, localId: %d", new Object[] { Long.valueOf(((com.tencent.mm.plugin.ipcall.a.g.k)???).xDa) });
            if (((com.tencent.mm.plugin.ipcall.a.g.k)???).xDa != -1L)
            {
              ((com.tencent.mm.plugin.ipcall.a.g.k)???).field_status = 2;
              com.tencent.mm.plugin.ipcall.a.i.bHx().a((com.tencent.mm.plugin.ipcall.a.g.k)???);
            }
          }
          if (com.tencent.mm.plugin.ipcall.a.i.bHq().cJn)
          {
            if ((this.nvf) || (com.tencent.mm.plugin.ipcall.a.i.bHq().nvN.nwu == 0) || (com.tencent.mm.plugin.ipcall.a.i.bHq().nvN.nww == 0L))
              break label2288;
            ??? = ah.getContext();
            paramInt3 = com.tencent.mm.plugin.ipcall.a.i.bHq().nvN.nwu;
            l1 = com.tencent.mm.plugin.ipcall.a.i.bHq().nvN.nww;
            ab.i("MicroMsg.IPCallPluginUtil", "tryShowFeedbackDialog");
            if (d.bGW())
            {
              paramInt2 = com.tencent.mm.m.g.Nu().getInt("WCOMaxTimesForShowFeedback", 0);
              aw.ZK();
              paramInt1 = ((Integer)com.tencent.mm.model.c.Ry().get(ac.a.xLQ, Integer.valueOf(0))).intValue();
              aw.ZK();
              l2 = ((Long)com.tencent.mm.model.c.Ry().get(ac.a.xLP, Long.valueOf(0L))).longValue();
              l3 = bo.anT();
              if (l3 - l2 <= 86400L)
                break label2299;
              paramInt1 = 0;
              ab.i("MicroMsg.IPCallPluginUtil", "tryShowFeedbackDialog reset time");
              if (paramInt1 < paramInt2)
                break label2181;
              ab.i("MicroMsg.IPCallPluginUtil", "tryShowFeedbackDialog reach max time".concat(String.valueOf(paramInt2)));
            }
          }
          com.tencent.mm.plugin.ipcall.a.i.bHq().nvE = null;
          com.tencent.mm.plugin.ipcall.a.i.bHr().nxC = null;
          com.tencent.mm.plugin.ipcall.a.i.bHu().mCurrentState = -1;
          bGT();
          removeListener();
          bool = true;
          AppMethodBeat.o(21675);
          break;
          i = 0;
          break label240;
          i = 0;
          break label240;
          i = 0;
          break label328;
          i = 0;
          break label328;
          i = -1;
          break label397;
          float f = aw.ZL().getStreamMaxVolume(i);
          i = (int)(aw.ZL().getStreamVolume(i) / f * 100.0F);
          break label406;
          localObject2 = finally;
          AppMethodBeat.o(21675);
          throw localObject2;
          localObject5 = finally;
          AppMethodBeat.o(21675);
          throw localObject5;
          i = 0;
          break label719;
          label1780: i = 0;
          break label749;
          label1786: com.tencent.mm.compatible.b.g.KK().setMode(2);
          break label1037;
        }
      }
      catch (Throwable localThrowable)
      {
        label2164: label2299: 
        while (true)
        {
          long l1;
          long l2;
          long l3;
          ab.w("MicroMsg.RingPlayer", "playSound Failed Throwable t = ", new Object[] { localThrowable });
          localObject5.tbh = 6;
          localObject2.stop();
          localObject2.release();
          continue;
          Object localObject3;
          if (paramInt1 == 12)
          {
            com.tencent.mm.plugin.ipcall.a.i.bHq().bHo();
            com.tencent.mm.plugin.ipcall.a.i.bHs().bHO();
            if (paramInt2 == 11)
            {
              m.b(this.nuY);
            }
            else
            {
              localObject3 = this.nuY;
              if (localObject3 != null)
              {
                ab.d("MicroMsg.IPCallRecordStorageLogic", "recordCallFailed, localId: %d", new Object[] { Long.valueOf(((com.tencent.mm.plugin.ipcall.a.g.k)localObject3).xDa) });
                if (((com.tencent.mm.plugin.ipcall.a.g.k)localObject3).xDa != -1L)
                {
                  ((com.tencent.mm.plugin.ipcall.a.g.k)localObject3).field_status = 6;
                  com.tencent.mm.plugin.ipcall.a.i.bHx().a((com.tencent.mm.plugin.ipcall.a.g.k)localObject3);
                }
              }
            }
          }
          else if (paramInt1 == 9)
          {
            com.tencent.mm.plugin.ipcall.a.i.bHq().xi(1);
            com.tencent.mm.plugin.ipcall.a.i.bHs().bHN();
            m.a(this.nuY, com.tencent.mm.plugin.ipcall.a.i.bHs().nxM);
          }
          else if (paramInt1 == 10)
          {
            com.tencent.mm.plugin.ipcall.a.i.bHq().xi(1);
            localObject3 = com.tencent.mm.plugin.ipcall.a.i.bHs();
            ab.i("MicroMsg.IPCallReportHelper", "otherSideUserShutdown");
            ((com.tencent.mm.plugin.ipcall.a.c.b)localObject3).nxG = 1;
            localObject3 = this.nuY;
            l2 = com.tencent.mm.plugin.ipcall.a.i.bHs().nxM;
            if (localObject3 != null)
            {
              ab.d("MicroMsg.IPCallRecordStorageLogic", "recordOthersideShutdownCall, localId: %d, talkTime: %d", new Object[] { Long.valueOf(((com.tencent.mm.plugin.ipcall.a.g.k)localObject3).xDa), Long.valueOf(l2) });
              if (((com.tencent.mm.plugin.ipcall.a.g.k)localObject3).xDa != -1L)
              {
                ((com.tencent.mm.plugin.ipcall.a.g.k)localObject3).field_status = 5;
                ((com.tencent.mm.plugin.ipcall.a.g.k)localObject3).field_duration = l2;
                com.tencent.mm.plugin.ipcall.a.i.bHx().a((com.tencent.mm.plugin.ipcall.a.g.k)localObject3);
              }
            }
          }
          else if (paramInt1 == 11)
          {
            if (paramInt2 == 5)
              com.tencent.mm.plugin.ipcall.a.i.bHq().xi(3);
            while (true)
            {
              com.tencent.mm.plugin.ipcall.a.i.bHs().bHN();
              if (paramInt2 != 11)
                break label2164;
              m.b(this.nuY);
              break;
              if (paramInt2 == 11)
                com.tencent.mm.plugin.ipcall.a.i.bHq().xi(1);
              else
                com.tencent.mm.plugin.ipcall.a.i.bHq().xi(2);
            }
            m.a(this.nuY, com.tencent.mm.plugin.ipcall.a.i.bHs().nxM);
            continue;
            if (l3 - l2 < 1800L)
            {
              ab.i("MicroMsg.IPCallPluginUtil", "tryShowFeedbackDialog not reach INTERVAL_TIMES_TRY_SHOW_WCO_FEEDBACK_MAIN");
            }
            else
            {
              aw.ZK();
              com.tencent.mm.model.c.Ry().set(ac.a.xLQ, Integer.valueOf(paramInt1 + 1));
              aw.ZK();
              com.tencent.mm.model.c.Ry().set(ac.a.xLP, Long.valueOf(l3));
              Intent localIntent = new Intent();
              localIntent.putExtra("IPCallFeedbackDialogUI_KRoomId", paramInt3);
              localIntent.putExtra("IPCallFeedbackDialogUI_KCallseq", l1);
              com.tencent.mm.bp.d.b((Context)localObject3, "ipcall", ".ui.IPCallFeedbackDialogUI", localIntent);
              continue;
              ab.e("MicroMsg.IPCallManager", "roomId = 0,ignore feedback");
            }
          }
        }
      }
    }
  }

  private void arh()
  {
    AppMethodBeat.i(21700);
    ab.i("MicroMsg.IPCallManager", "startTimeCount");
    if (this.che != null)
    {
      this.che.stopTimer();
      AppMethodBeat.o(21700);
    }
    while (true)
    {
      return;
      if (this.che == null)
        this.che = new ap(Looper.getMainLooper(), new ap.a()
        {
          public final boolean BI()
          {
            AppMethodBeat.i(21671);
            c.this.bGS();
            if ((com.tencent.mm.plugin.ipcall.a.i.bHu().bHn()) && (c.a(c.this) != null))
              c.a(c.this).bHa();
            AppMethodBeat.o(21671);
            return true;
          }
        }
        , true);
      this.che.ae(1000L, 1000L);
      AppMethodBeat.o(21700);
    }
  }

  private void removeListener()
  {
    AppMethodBeat.i(21673);
    if (this.nva != null)
    {
      this.nva.listen(this.nvb, 0);
      this.nva = null;
    }
    com.tencent.mm.sdk.b.a.xxA.d(this.nvc);
    AppMethodBeat.o(21673);
  }

  public final void A(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(21678);
    ab.i("MicroMsg.IPCallManager", "onInviteFailed, currentState: %s", new Object[] { f.stateToString(com.tencent.mm.plugin.ipcall.a.i.bHu().mCurrentState) });
    if (eo(2, 0))
      d(2, paramString1, paramString2, paramInt);
    AppMethodBeat.o(21678);
  }

  public final void B(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(21687);
    ab.i("MicroMsg.IPCallManager", "onAccountOverdue, currentState: %s", new Object[] { f.stateToString(com.tencent.mm.plugin.ipcall.a.i.bHu().mCurrentState) });
    if (eo(8, 9))
      d(8, paramString1, paramString2, paramInt);
    AppMethodBeat.o(21687);
  }

  public final void C(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(21688);
    ab.i("MicroMsg.IPCallManager", "onCallRestricted, currentState: %s", new Object[] { f.stateToString(com.tencent.mm.plugin.ipcall.a.i.bHu().mCurrentState) });
    if (eo(10, 0))
      d(10, paramString1, paramString2, paramInt);
    AppMethodBeat.o(21688);
  }

  public final void D(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(21689);
    ab.i("MicroMsg.IPCallManager", "onCallPhoneNumberInvalid, currentState: %s", new Object[] { f.stateToString(com.tencent.mm.plugin.ipcall.a.i.bHu().mCurrentState) });
    if (eo(11, 0))
      d(11, paramString1, paramString2, paramInt);
    AppMethodBeat.o(21689);
  }

  public final boolean a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(21674);
    boolean bool;
    if (com.tencent.mm.plugin.ipcall.a.i.bHu().bHk())
    {
      ab.i("MicroMsg.IPCallManager", "startIPCall, already start!");
      bool = false;
      AppMethodBeat.o(21674);
      return bool;
    }
    ab.i("MicroMsg.IPCallManager", "startIPCall");
    com.tencent.mm.plugin.ipcall.a.i.bHq().nvE = this;
    com.tencent.mm.plugin.ipcall.a.i.bHr().nxC = this;
    com.tencent.mm.plugin.ipcall.a.i.bHu().mCurrentState = -1;
    removeListener();
    this.nva = ((TelephonyManager)ah.getContext().getSystemService("phone"));
    this.nva.listen(this.nvb, 32);
    com.tencent.mm.sdk.b.a.xxA.c(this.nvc);
    ab.d("MicroMsg.IPCallRecordStorageLogic", "recordStartCall, phoneNumber: %s, contactId: %s", new Object[] { paramString4, paramString5 });
    Object localObject = new com.tencent.mm.plugin.ipcall.a.g.k();
    ((com.tencent.mm.plugin.ipcall.a.g.k)localObject).field_phonenumber = paramString4;
    if (!bo.isNullOrNil(paramString5))
    {
      com.tencent.mm.plugin.ipcall.a.g.c localc = com.tencent.mm.plugin.ipcall.a.i.bHw().OQ(paramString5);
      if ((localc != null) && (localc.xDa != -1L))
      {
        ((com.tencent.mm.plugin.ipcall.a.g.k)localObject).field_addressId = localc.xDa;
        label192: if (paramInt1 == -1)
          break label806;
        ((com.tencent.mm.plugin.ipcall.a.g.k)localObject).field_phoneType = paramInt1;
        label205: ((com.tencent.mm.plugin.ipcall.a.g.k)localObject).field_calltime = bo.anU();
        ((com.tencent.mm.plugin.ipcall.a.g.k)localObject).field_status = 1;
        if (!com.tencent.mm.plugin.ipcall.a.i.bHx().b((com.tencent.mm.sdk.e.c)localObject))
          break label815;
        label230: this.nuY = ((com.tencent.mm.plugin.ipcall.a.g.k)localObject);
        fbD.postDelayed(this.nve, 1754L);
        this.nuZ = false;
        localObject = com.tencent.mm.plugin.ipcall.a.i.bHs();
        ab.d("MicroMsg.IPCallReportHelper", "reset");
        ((com.tencent.mm.plugin.ipcall.a.c.b)localObject).nxE = 0;
        ((com.tencent.mm.plugin.ipcall.a.c.b)localObject).nxF = 0;
        ((com.tencent.mm.plugin.ipcall.a.c.b)localObject).nxG = 0;
        ((com.tencent.mm.plugin.ipcall.a.c.b)localObject).nxH = 0;
        ((com.tencent.mm.plugin.ipcall.a.c.b)localObject).nxI = 0;
        ((com.tencent.mm.plugin.ipcall.a.c.b)localObject).nxJ = 0L;
        ((com.tencent.mm.plugin.ipcall.a.c.b)localObject).nxK = 0L;
        ((com.tencent.mm.plugin.ipcall.a.c.b)localObject).nxL = 0;
        ((com.tencent.mm.plugin.ipcall.a.c.b)localObject).nxM = 0L;
        ((com.tencent.mm.plugin.ipcall.a.c.b)localObject).nxN = 0;
        ((com.tencent.mm.plugin.ipcall.a.c.b)localObject).nwu = 0;
        ((com.tencent.mm.plugin.ipcall.a.c.b)localObject).nwv = 0L;
        ((com.tencent.mm.plugin.ipcall.a.c.b)localObject).nxO = 0L;
        ((com.tencent.mm.plugin.ipcall.a.c.b)localObject).gyD = "";
        ((com.tencent.mm.plugin.ipcall.a.c.b)localObject).nxP = 0;
        ((com.tencent.mm.plugin.ipcall.a.c.b)localObject).nxQ = "";
        ((com.tencent.mm.plugin.ipcall.a.c.b)localObject).nxS = 0L;
        ((com.tencent.mm.plugin.ipcall.a.c.b)localObject).nxR = 0L;
        ((com.tencent.mm.plugin.ipcall.a.c.b)localObject).nvh = 0L;
        ((com.tencent.mm.plugin.ipcall.a.c.b)localObject).nxT = 0L;
        ((com.tencent.mm.plugin.ipcall.a.c.b)localObject).nxU = 0L;
        ((com.tencent.mm.plugin.ipcall.a.c.b)localObject).nxZ = 0L;
        ((com.tencent.mm.plugin.ipcall.a.c.b)localObject).nxY = 0L;
        ((com.tencent.mm.plugin.ipcall.a.c.b)localObject).nxV = "";
        ((com.tencent.mm.plugin.ipcall.a.c.b)localObject).nxW = "";
        ((com.tencent.mm.plugin.ipcall.a.c.b)localObject).countryCode = "";
        ((com.tencent.mm.plugin.ipcall.a.c.b)localObject).nya = 0L;
        ((com.tencent.mm.plugin.ipcall.a.c.b)localObject).nyb = 0;
        ((com.tencent.mm.plugin.ipcall.a.c.b)localObject).nyc = 0;
        ((com.tencent.mm.plugin.ipcall.a.c.b)localObject).nyd = 0;
        ((com.tencent.mm.plugin.ipcall.a.c.b)localObject).nye = 0;
        com.tencent.mm.plugin.ipcall.a.i.bHu().mCurrentState = -1;
        ab.d("MicroMsg.IPCallManager", "startIPCall, username: %s, phoneNumber: %s", new Object[] { paramString3, paramString4 });
        localObject = com.tencent.mm.plugin.ipcall.a.i.bHq();
        ab.d("MicroMsg.IPCallSvrLogic", "startIPCall, toUsername: %s, toPhoneNumber: %s", new Object[] { paramString3, paramString4 });
        ((com.tencent.mm.plugin.ipcall.a.g)localObject).cJn = false;
        ((com.tencent.mm.plugin.ipcall.a.g)localObject).nvO = false;
        ((com.tencent.mm.plugin.ipcall.a.g)localObject).nvz = 0;
        ((com.tencent.mm.plugin.ipcall.a.g)localObject).nvA = 0;
        ((com.tencent.mm.plugin.ipcall.a.g)localObject).nvB = 0;
        ((com.tencent.mm.plugin.ipcall.a.g)localObject).nvC = false;
        ((com.tencent.mm.plugin.ipcall.a.g)localObject).nvD = false;
        ((com.tencent.mm.plugin.ipcall.a.g)localObject).nvP = false;
        ((com.tencent.mm.plugin.ipcall.a.g)localObject).nvN = new com.tencent.mm.plugin.ipcall.a.a.c();
        ((com.tencent.mm.plugin.ipcall.a.g)localObject).nvN.nickname = paramString1;
        ((com.tencent.mm.plugin.ipcall.a.g)localObject).nvN.nwV = paramString2;
        ((com.tencent.mm.plugin.ipcall.a.g)localObject).nvN.cOz = paramString5;
        ((com.tencent.mm.plugin.ipcall.a.g)localObject).nvN.nwW = paramString4;
        ((com.tencent.mm.plugin.ipcall.a.g)localObject).nvN.cMr = paramString3;
        ((com.tencent.mm.plugin.ipcall.a.g)localObject).nvN.nwx = ((int)System.currentTimeMillis());
        ((com.tencent.mm.plugin.ipcall.a.g)localObject).nvN.nwy = paramInt2;
        ((com.tencent.mm.plugin.ipcall.a.g)localObject).nvN.nwz = paramInt3;
        ((com.tencent.mm.plugin.ipcall.a.g)localObject).nvN.nwY = paramInt1;
        ((com.tencent.mm.plugin.ipcall.a.g)localObject).nvF.a(((com.tencent.mm.plugin.ipcall.a.g)localObject).nvN);
        ((com.tencent.mm.plugin.ipcall.a.g)localObject).nvK.a(((com.tencent.mm.plugin.ipcall.a.g)localObject).nvN);
        ab.i("MicroMsg.IPCallSvrLogic", "startIPCallInternal, inviteId: %d", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.ipcall.a.g)localObject).nvN.nwx) });
        com.tencent.mm.plugin.ipcall.a.i.bHu().xg(1);
        paramString1 = com.tencent.mm.plugin.ipcall.a.i.bHr();
        if (!paramString1.nxB)
          break label821;
        ab.d("MicroMsg.IPCallEngineManager", "already start engine");
      }
    }
    while (true)
    {
      fbD.removeCallbacks(this.nvd);
      fbD.postDelayed(this.nvd, 60000L);
      bool = true;
      AppMethodBeat.o(21674);
      break;
      ((com.tencent.mm.plugin.ipcall.a.g.k)localObject).field_addressId = -1L;
      break label192;
      ((com.tencent.mm.plugin.ipcall.a.g.k)localObject).field_addressId = -1L;
      break label192;
      label806: ((com.tencent.mm.plugin.ipcall.a.g.k)localObject).field_phoneType = -1;
      break label205;
      label815: localObject = null;
      break label230;
      label821: paramString1.bHM();
      ab.i("MicroMsg.IPCallEngineManager", "start engine");
      if (paramString1.nxx.cKK())
      {
        paramString1.nxx.mx(false);
        paramString1.nxx.reset();
      }
      paramString1.nxx.sTY = 1;
      long l = System.currentTimeMillis();
      paramInt1 = paramString1.nxx.cKM();
      ab.d("MicroMsg.IPCallEngineManager", "protocal init finish, ret: %d, used %dms", new Object[] { Integer.valueOf(paramInt1), Long.valueOf(System.currentTimeMillis() - l) });
      if ((paramString1.nxx.field_capInfo != null) && (paramString1.nxx.exchangeCabInfo(paramString1.nxx.field_capInfo, paramString1.nxx.field_capInfo.length) < 0))
      {
        ab.e("MicroMsg.IPCallEngineManager", "exchangeCabInfo failed");
        com.tencent.mm.plugin.ipcall.a.i.bHs().nxN = 24;
      }
      if (paramInt1 < 0)
        ab.e("MicroMsg.IPCallEngineManager", "engine init failed!");
      paramString1.nxx.sTY = 1;
      paramString1.nxB = true;
    }
  }

  public final void bGJ()
  {
    AppMethodBeat.i(21677);
    ab.i("MicroMsg.IPCallManager", "onInviteSuccess");
    if (!com.tencent.mm.plugin.ipcall.a.i.bHu().xg(3))
      AppMethodBeat.o(21677);
    while (true)
    {
      return;
      Object localObject = com.tencent.mm.plugin.ipcall.a.i.bHs();
      ab.d("MicroMsg.IPCallReportHelper", "markStartInvite");
      if (((com.tencent.mm.plugin.ipcall.a.c.b)localObject).nxR == 0L)
        ((com.tencent.mm.plugin.ipcall.a.c.b)localObject).nxR = System.currentTimeMillis();
      com.tencent.mm.plugin.ipcall.a.a.c localc = com.tencent.mm.plugin.ipcall.a.i.bHq().nvN;
      com.tencent.mm.plugin.ipcall.a.c.b localb = com.tencent.mm.plugin.ipcall.a.i.bHs();
      int i = localc.nwx;
      localObject = localc.cMr;
      String str = localc.nwW;
      int j = localc.nwu;
      long l1 = localc.nwv;
      long l2 = localc.nww;
      localb.nwx = i;
      localb.nxQ = ((String)localObject);
      localb.gyD = str;
      localb.nwu = j;
      localb.nwv = l1;
      localb.nxO = l2;
      if (this.nuX != null)
        this.nuX.bGJ();
      AppMethodBeat.o(21677);
    }
  }

  public final void bGK()
  {
    AppMethodBeat.i(21679);
    ab.i("MicroMsg.IPCallManager", "onStartRing, currentState: %s", new Object[] { f.stateToString(com.tencent.mm.plugin.ipcall.a.i.bHu().mCurrentState) });
    if (!com.tencent.mm.plugin.ipcall.a.i.bHu().xg(4))
      AppMethodBeat.o(21679);
    while (true)
    {
      return;
      com.tencent.mm.plugin.ipcall.a.c.b localb = com.tencent.mm.plugin.ipcall.a.i.bHs();
      ab.d("MicroMsg.IPCallReportHelper", "markStartRing");
      if (localb.nxS == 0L)
      {
        localb.nxS = System.currentTimeMillis();
        localb.nxJ = (localb.nxS - localb.nxR);
        ab.d("MicroMsg.IPCallReportHelper", "ringTime: %d", new Object[] { Long.valueOf(localb.nxJ) });
      }
      com.tencent.mm.plugin.ipcall.a.i.bHr().bHL();
      localb = com.tencent.mm.plugin.ipcall.a.i.bHs();
      ab.i("MicroMsg.IPCallReportHelper", "startRing");
      localb.nxE = 1;
      if (this.nuX != null)
        this.nuX.bGK();
      AppMethodBeat.o(21679);
    }
  }

  public final void bGL()
  {
    AppMethodBeat.i(21680);
    ab.i("MicroMsg.IPCallManager", "onAccept, currentState: %s", new Object[] { f.stateToString(com.tencent.mm.plugin.ipcall.a.i.bHu().mCurrentState) });
    if (!com.tencent.mm.plugin.ipcall.a.i.bHu().xg(5))
      AppMethodBeat.o(21680);
    while (true)
    {
      return;
      com.tencent.mm.plugin.ipcall.a.c.b localb = com.tencent.mm.plugin.ipcall.a.i.bHs();
      ab.d("MicroMsg.IPCallReportHelper", "markUserAccept");
      if (localb.nvh == 0L)
      {
        localb.nvh = System.currentTimeMillis();
        localb.nxK = (localb.nvh - localb.nxR);
        ab.d("MicroMsg.IPCallReportHelper", "answerTime: %d", new Object[] { Long.valueOf(localb.nxK) });
      }
      com.tencent.mm.plugin.ipcall.a.i.bHr().bHL();
      localb = com.tencent.mm.plugin.ipcall.a.i.bHs();
      ab.i("MicroMsg.IPCallReportHelper", "userAccept");
      localb.nxF = 1;
      fbD.removeCallbacks(this.nvd);
      com.tencent.mm.plugin.ipcall.a.i.bHA().stop();
      fbD.removeCallbacks(this.nve);
      com.tencent.mm.plugin.ipcall.a.i.bHt().nxg.aDm();
      if ((com.tencent.mm.plugin.ipcall.a.i.bHr().nxA) && (!this.nuZ))
      {
        com.tencent.mm.plugin.ipcall.a.i.bHs().bHP();
        com.tencent.mm.plugin.ipcall.a.i.bHs().bHS();
        this.nuZ = true;
        this.nvh = bo.anT();
        arh();
        com.tencent.mm.plugin.ipcall.a.i.bHr().bHK();
        if (this.nuX != null)
          this.nuX.bGX();
        com.tencent.mm.plugin.ipcall.a.i.bHs().bHR();
        p.cJR().cJS();
        p.cJR().a(this);
      }
      AppMethodBeat.o(21680);
    }
  }

  public final void bGM()
  {
    AppMethodBeat.i(21684);
    ab.i("MicroMsg.IPCallManager", "onShutdownByOtherSide, currentState: %s", new Object[] { f.stateToString(com.tencent.mm.plugin.ipcall.a.i.bHu().mCurrentState) });
    if (Y(10, 0, 32))
      if (this.nuX != null)
      {
        this.nuX.bGY();
        AppMethodBeat.o(21684);
      }
    while (true)
    {
      return;
      Toast.makeText(ah.getContext(), ah.getContext().getString(2131300782), 1).show();
      AppMethodBeat.o(21684);
    }
  }

  public final void bGN()
  {
    AppMethodBeat.i(21686);
    ab.i("MicroMsg.IPCallManager", "onHeartbeatFailed");
    if (eo(7, 29))
      d(7, null, ah.getContext().getString(2131297765), 1);
    AppMethodBeat.o(21686);
  }

  public final void bGO()
  {
    AppMethodBeat.i(21690);
    do
      ab.i("MicroMsg.IPCallManager", "onDisasterHappen, currentState: %s", new Object[] { f.stateToString(com.tencent.mm.plugin.ipcall.a.i.bHu().mCurrentState) });
    while (eo(12, 0));
    AppMethodBeat.o(21690);
  }

  public final void bGP()
  {
    AppMethodBeat.i(21691);
    ab.i("MicroMsg.IPCallManager", "onStartEngineFailed, currentState: %s", new Object[] { f.stateToString(com.tencent.mm.plugin.ipcall.a.i.bHu().mCurrentState) });
    if (eo(6, 0))
      d(6, null, ah.getContext().getString(2131297771), 1);
    AppMethodBeat.o(21691);
  }

  public final void bGQ()
  {
    AppMethodBeat.i(21692);
    ab.i("MicroMsg.IPCallManager", "onChannelConnected, currentState: %s", new Object[] { f.stateToString(com.tencent.mm.plugin.ipcall.a.i.bHu().mCurrentState) });
    com.tencent.mm.plugin.ipcall.a.i.bHA().stop();
    fbD.removeCallbacks(this.nve);
    Object localObject;
    com.tencent.mm.plugin.ipcall.a.b.a locala;
    if (com.tencent.mm.plugin.ipcall.a.i.bHu().bHl())
    {
      localObject = com.tencent.mm.plugin.ipcall.a.i.bHt();
      ((com.tencent.mm.plugin.ipcall.a.b.b)localObject).kzs.a(ah.getContext(), (HeadsetPlugReceiver.a)localObject);
      aw.ZL().a((com.tencent.mm.compatible.b.g.a)localObject);
      aw.ZL().KM();
      ((com.tencent.mm.plugin.ipcall.a.b.b)localObject).kzt = aw.ZL().KV();
      ((com.tencent.mm.plugin.ipcall.a.b.b)localObject).kzu = aw.ZL().KP();
      ab.d("MicroMsg.IPCallDeviceManager", "startPlay, isHeadsetPlugged: %b, isBluetoothConnected: %b", new Object[] { Boolean.valueOf(((com.tencent.mm.plugin.ipcall.a.b.b)localObject).kzt), Boolean.valueOf(((com.tencent.mm.plugin.ipcall.a.b.b)localObject).kzu) });
      ((com.tencent.mm.plugin.ipcall.a.b.b)localObject).gar.requestFocus();
      locala = ((com.tencent.mm.plugin.ipcall.a.b.b)localObject).nxf;
      if (!locala.cFy)
        break label384;
      ab.d("MicroMsg.IPCallAudioPlayer", "startPlay, already start");
    }
    while (true)
    {
      if ((((com.tencent.mm.plugin.ipcall.a.b.b)localObject).kzt) && (!((com.tencent.mm.plugin.ipcall.a.b.b)localObject).kzu) && (((com.tencent.mm.plugin.ipcall.a.b.b)localObject).nxk != null))
        ((com.tencent.mm.plugin.ipcall.a.b.b)localObject).nxk.ir(true);
      if ((((com.tencent.mm.plugin.ipcall.a.b.b)localObject).kzu) && (!((com.tencent.mm.plugin.ipcall.a.b.b)localObject).kzt) && (((com.tencent.mm.plugin.ipcall.a.b.b)localObject).nxk != null))
        ((com.tencent.mm.plugin.ipcall.a.b.b)localObject).nxk.is(true);
      com.tencent.mm.plugin.ipcall.a.i.bHs().bHP();
      com.tencent.mm.plugin.ipcall.a.i.bHt().nxg.aDm();
      if ((com.tencent.mm.plugin.ipcall.a.i.bHu().bHn()) && (!this.nuZ))
      {
        com.tencent.mm.plugin.ipcall.a.i.bHs().bHS();
        com.tencent.mm.plugin.ipcall.a.i.bHr().bHK();
        this.nuZ = true;
        this.nvh = bo.anT();
        arh();
        if (this.nuX != null)
          this.nuX.bGX();
        localObject = this.nuY;
        if (localObject != null)
        {
          ab.d("MicroMsg.IPCallRecordStorageLogic", "recordStartTalk, localId: %d", new Object[] { Long.valueOf(((com.tencent.mm.plugin.ipcall.a.g.k)localObject).xDa) });
          if (((com.tencent.mm.plugin.ipcall.a.g.k)localObject).xDa != -1L)
          {
            ((com.tencent.mm.plugin.ipcall.a.g.k)localObject).field_status = 3;
            com.tencent.mm.plugin.ipcall.a.i.bHx().a((com.tencent.mm.plugin.ipcall.a.g.k)localObject);
          }
        }
        com.tencent.mm.plugin.ipcall.a.i.bHs().bHR();
        p.cJR().cJS();
        p.cJR().a(this);
      }
      AppMethodBeat.o(21692);
      return;
      label384: ab.i("MicroMsg.IPCallAudioPlayer", "startPlay");
      if (locala.kzq == null)
      {
        locala.kzq = new com.tencent.mm.plugin.voip.model.c();
        locala.kzq.G(v2protocal.VOICE_SAMPLERATE, 1, 20, 1);
      }
      locala.nxb = locala.kzq.x(ah.getContext(), false);
      locala.kzq.sNt = new a.1(locala);
      if (locala.kzq.cIp() <= 0)
        com.tencent.mm.plugin.ipcall.a.i.bHs().bHQ();
      locala.io(locala.nxc);
      locala.cFy = true;
    }
  }

  public final void bGR()
  {
    AppMethodBeat.i(21696);
    if (com.tencent.mm.plugin.ipcall.a.i.bHu().mCurrentState != 5)
    {
      ab.i("MicroMsg.IPCallManager", "onResumeGoodNetStatus currentState != accept:%d", new Object[] { Integer.valueOf(com.tencent.mm.plugin.ipcall.a.i.bHu().mCurrentState) });
      AppMethodBeat.o(21696);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.ipcall.a.b.b localb = com.tencent.mm.plugin.ipcall.a.i.bHt();
      ab.i("MicroMsg.IPCallDeviceManager", "onResumeGoodNetStatus");
      if (localb.nxi != null)
        localb.nxi.bIK();
      AppMethodBeat.o(21696);
    }
  }

  public final void bGS()
  {
    AppMethodBeat.i(21697);
    Object localObject1;
    if (com.tencent.mm.plugin.ipcall.a.i.bHu().bHn())
    {
      localObject1 = ah.getContext().getString(2131300741, new Object[] { String.format("%02d:%02d", new Object[] { Long.valueOf(bo.fp(this.nvh) / 60L), Long.valueOf(bo.fp(this.nvh) % 60L) }) });
      Object localObject2 = new Intent(ah.getContext(), IPCallTalkUI.class);
      ((Intent)localObject2).putExtra("IPCallTalkUI_isFromMiniNotification", true);
      localObject2 = PendingIntent.getActivity(ah.getContext(), 42, (Intent)localObject2, 134217728);
      int i = 2130839733;
      if (com.tencent.mm.compatible.util.d.fP(19))
        i = 2130839731;
      localObject1 = com.tencent.mm.bo.a.bt(ah.getContext(), "reminder_channel_id").g(ah.getContext().getString(2131300740)).j(System.currentTimeMillis()).d(ah.getContext().getString(2131300730)).e((CharSequence)localObject1);
      ((v.c)localObject1).EI = ((PendingIntent)localObject2);
      localObject1 = ((v.c)localObject1).build();
      ((Notification)localObject1).icon = i;
      ((Notification)localObject1).flags |= 32;
      aw.getNotification().a(42, (Notification)localObject1, false);
      if (com.tencent.mm.plugin.ipcall.a.i.bHu().bHn())
        break label254;
      com.tencent.mm.plugin.voip.b.cIk().abZ(ah.getContext().getString(2131301582));
      AppMethodBeat.o(21697);
    }
    while (true)
    {
      return;
      localObject1 = ah.getContext().getString(2131300740);
      break;
      label254: com.tencent.mm.plugin.voip.b.cIk().Dq(bGU());
      AppMethodBeat.o(21697);
    }
  }

  public final void bGT()
  {
    AppMethodBeat.i(21698);
    synchronized (this.meM)
    {
      this.nvf = false;
      com.tencent.mm.plugin.voip.b.cIk().dismiss();
      ((NotificationManager)ah.getContext().getSystemService("notification")).cancel(42);
      AppMethodBeat.o(21698);
      return;
    }
  }

  public final int bGU()
  {
    AppMethodBeat.i(21699);
    int i = (int)bo.fp(this.nvh);
    if (i > 0)
      AppMethodBeat.o(21699);
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(21699);
    }
  }

  public final void cn(String paramString, int paramInt)
  {
    AppMethodBeat.i(21682);
    ab.i("MicroMsg.IPCallManager", "onUnAvaliable, currentState: %s", new Object[] { f.stateToString(com.tencent.mm.plugin.ipcall.a.i.bHu().mCurrentState) });
    if (eo(3, 5))
      d(3, null, paramString, paramInt);
    AppMethodBeat.o(21682);
  }

  public final void co(String paramString, int paramInt)
  {
    AppMethodBeat.i(21683);
    ab.i("MicroMsg.IPCallManager", "onBusy, currentState: %s", new Object[] { f.stateToString(com.tencent.mm.plugin.ipcall.a.i.bHu().mCurrentState) });
    if (eo(1, 4))
      d(1, null, paramString, paramInt);
    AppMethodBeat.o(21683);
  }

  public final void cp(String paramString, int paramInt)
  {
    AppMethodBeat.i(21685);
    ab.i("MicroMsg.IPCallManager", "onSyncFailed");
    if (eo(7, 35))
      d(7, null, paramString, paramInt);
    AppMethodBeat.o(21685);
  }

  public final void d(int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    AppMethodBeat.i(21681);
    if (this.nuX != null)
    {
      this.nuX.d(paramInt1, paramString1, paramString2, paramInt2);
      AppMethodBeat.o(21681);
    }
    while (true)
    {
      return;
      Toast.makeText(ah.getContext(), paramString2, 1).show();
      AppMethodBeat.o(21681);
    }
  }

  public final boolean eo(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(21694);
    boolean bool;
    if (com.tencent.mm.plugin.ipcall.a.i.bHu().bHn())
      if (paramInt1 == 0)
      {
        bool = Y(9, paramInt1, paramInt2);
        AppMethodBeat.o(21694);
      }
    while (true)
    {
      return bool;
      bool = Y(11, paramInt1, paramInt2);
      AppMethodBeat.o(21694);
      continue;
      if (paramInt1 == 0)
      {
        bool = Y(8, paramInt1, paramInt2);
        AppMethodBeat.o(21694);
      }
      else
      {
        bool = Y(12, paramInt1, paramInt2);
        AppMethodBeat.o(21694);
      }
    }
  }

  public final void ig(boolean paramBoolean)
  {
    AppMethodBeat.i(21695);
    if (com.tencent.mm.plugin.ipcall.a.i.bHu().mCurrentState != 5)
    {
      ab.i("MicroMsg.IPCallManager", "onBadNetStatus currentState != accept:%d", new Object[] { Integer.valueOf(com.tencent.mm.plugin.ipcall.a.i.bHu().mCurrentState) });
      AppMethodBeat.o(21695);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.ipcall.a.b.b localb = com.tencent.mm.plugin.ipcall.a.i.bHt();
      ab.i("MicroMsg.IPCallDeviceManager", "onBadNetStatus");
      if (localb.nxi != null)
      {
        j localj = localb.nxi;
        if (localj.nGB != null)
          localj.nGB.setVisibility(0);
        if (localj.nGC != null)
          localj.nGC.setVisibility(0);
      }
      if (!aw.ZL().eoY.isSpeakerphoneOn())
      {
        long l = System.currentTimeMillis();
        if (l - localb.nxl > 30000L)
        {
          localb.nxl = l;
          com.tencent.mm.plugin.voip.b.cIj().sSP.cKp();
        }
      }
      AppMethodBeat.o(21695);
    }
  }

  public final void xe(int paramInt)
  {
    AppMethodBeat.i(21693);
    ab.i("MicroMsg.IPCallManager", "onChannelConnectFailed, currentState: %s", new Object[] { f.stateToString(com.tencent.mm.plugin.ipcall.a.i.bHu().mCurrentState) });
    if (com.tencent.mm.plugin.ipcall.a.i.bHr().nxA)
    {
      ab.i("MicroMsg.IPCallManager", "onChannelConnectFailed, channel already connected");
      if (!eo(5, paramInt))
        break label112;
      d(5, null, ah.getContext().getString(2131297765), 1);
      AppMethodBeat.o(21693);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.IPCallManager", "onChannelConnectFailed, channel not connet, may be request connect failed");
      if (eo(4, paramInt))
        d(4, null, ah.getContext().getString(2131297765), 1);
      label112: AppMethodBeat.o(21693);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.c
 * JD-Core Version:    0.6.2
 */