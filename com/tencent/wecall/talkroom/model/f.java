package com.tencent.wecall.talkroom.model;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.multi.talk;
import com.tencent.mm.plugin.multi.talk.a;
import com.tencent.pb.common.b.a.a.aa;
import com.tencent.pb.common.b.a.a.ab;
import com.tencent.pb.common.b.a.a.ac;
import com.tencent.pb.common.b.a.a.af;
import com.tencent.pb.common.b.a.a.ah;
import com.tencent.pb.common.b.a.a.aj;
import com.tencent.pb.common.b.a.a.ak;
import com.tencent.pb.common.b.a.a.as;
import com.tencent.pb.common.b.a.a.at;
import com.tencent.pb.common.b.a.a.au;
import com.tencent.pb.common.b.a.a.av;
import com.tencent.pb.common.b.a.a.aw;
import com.tencent.pb.common.b.a.a.ay;
import com.tencent.pb.common.b.a.a.o;
import com.tencent.pb.common.b.a.a.p;
import com.tencent.pb.common.b.a.a.q;
import com.tencent.pb.common.b.a.a.r;
import com.tencent.pb.common.b.a.a.x;
import com.tencent.pb.common.b.a.a.z;
import com.tencent.pb.talkroom.sdk.MultiTalkGroup;
import com.tencent.wecall.talkroom.a.l;
import com.tencent.wecall.talkroom.a.m;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public final class f
  implements Handler.Callback, com.tencent.g.a.d, com.tencent.pb.common.b.b
{
  public static String[] AJN;
  public static List<Integer> AJj;
  private static int AJq;
  private static com.tencent.pb.talkroom.sdk.e Amd;
  private com.tencent.g.a.a AHP;
  private int AJA;
  int AJB;
  public h AJC;
  b AJD;
  private talk.a AJE;
  private TimerTask AJF;
  private TimerTask AJG;
  private Timer AJH;
  private TimerTask AJI;
  private Timer AJJ;
  g AJK;
  private int AJL;
  private boolean AJM;
  public String AJO;
  HashSet<Long> AJP;
  public boolean AJQ;
  public boolean AJR;
  public boolean AJS;
  private short[] AJT;
  private int[] AJU;
  private short[] AJV;
  private int[] AJW;
  private int AJX;
  public boolean AJY;
  public boolean AJZ;
  f.f AJi;
  private Map<String, f.e> AJk;
  private final int AJl;
  private final int AJm;
  private final int AJn;
  private final int AJo;
  public final int AJp;
  private boolean AJr;
  private boolean AJs;
  private String AJt;
  public String AJu;
  private int AJv;
  private int AJw;
  private int AJx;
  private long AJy;
  private boolean AJz;
  private Runnable AKa;
  private com.tencent.pb.common.b.d AKb;
  private Runnable AKc;
  int AlR;
  Handler mHandler;
  boolean mIsMute;
  public int nCF;
  boolean nME;
  public String neq;
  boolean sRm;
  public long sZg;
  int state;

  static
  {
    AppMethodBeat.i(127947);
    Amd = null;
    AJj = new ArrayList();
    AJq = 30000;
    AJN = new String[] { "GLOBAL_TOPIC_NETWORK_CHANGE", "topic_bind_mobile_other" };
    AppMethodBeat.o(127947);
  }

  public f()
  {
    AppMethodBeat.i(127883);
    this.AJk = new HashMap();
    this.AJl = 1;
    this.AJm = 2;
    this.AJn = 3;
    this.AJo = 4;
    this.AJp = 6;
    this.state = 0;
    this.sRm = false;
    this.AJr = false;
    this.AJs = false;
    this.nME = false;
    this.AJv = 0;
    this.AJw = 0;
    this.AJx = 0;
    this.AJy = 0L;
    this.AJz = true;
    this.AJA = 0;
    this.AJB = -1;
    this.AJC = h.AKQ;
    this.AJH = new Timer("TalkRoomService_HelloTimer");
    this.AJJ = new Timer("TalkRoomService_talkDurationTimer");
    this.AJK = new g();
    this.AJL = 0;
    this.AJM = false;
    this.AJO = null;
    this.AJP = new HashSet();
    this.AJQ = false;
    this.AJR = true;
    this.AJS = true;
    this.AJT = null;
    this.AJU = null;
    this.AJV = null;
    this.AJW = null;
    this.AJX = 0;
    this.mIsMute = false;
    this.AJY = false;
    this.AJZ = true;
    this.AKa = new f.8(this);
    this.AKb = null;
    this.AKc = new f.9(this);
    com.tencent.pb.common.b.e.dPu().a(201, this);
    com.tencent.pb.common.b.e.dPu().a(202, this);
    com.tencent.pb.common.b.e.dPu().a(203, this);
    com.tencent.pb.common.b.e.dPu().a(204, this);
    com.tencent.pb.common.b.e.dPu().a(205, this);
    com.tencent.pb.common.b.e.dPu().a(206, this);
    com.tencent.pb.common.b.e.dPu().a(207, this);
    com.tencent.pb.common.b.e.dPu().a(208, this);
    com.tencent.pb.common.b.e.dPu().a(210, this);
    com.tencent.pb.common.b.e.dPu().a(209, this);
    com.tencent.pb.common.b.e.dPu().a(211, this);
    com.tencent.pb.common.b.e.dPu().a(212, this);
    com.tencent.pb.common.b.e.dPu().a(213, this);
    com.tencent.pb.common.b.e.dPu().a(214, this);
    com.tencent.pb.common.b.e.dPu().a(800, this);
    Object localObject = c.dTg();
    g localg = this.AJK;
    Throwable localThrowable = new Throwable("trace caller");
    try
    {
      localThrowable.getStackTrace();
      ((c)localObject).AJa = localg;
      localObject = new HandlerThread("TalkRoomService");
      ((HandlerThread)localObject).start();
      this.mHandler = new Handler(((HandlerThread)localObject).getLooper(), this);
      if (this.AHP == null)
        this.AHP = ((com.tencent.g.a.a)com.tencent.g.f.aux("EventCenter"));
      com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "syscall", "register", Boolean.TRUE });
      this.AHP.a(this, AJN);
      AppMethodBeat.o(127883);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        com.tencent.pb.common.c.c.d("TalkRoomManager", new Object[] { "setTalkServerCallback caller stack: ", localThrowable });
    }
  }

  private boolean EB()
  {
    AppMethodBeat.i(127899);
    try
    {
      com.tencent.pb.talkroom.sdk.e locale = Amd;
      if (locale != null)
      {
        this.AJC.sUs = locale.bRo();
        this.AJC.sUo = locale.bRp();
        bool = locale.bRm();
        com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "stopRecord ret: ", Boolean.valueOf(bool) });
        AppMethodBeat.o(127899);
        return bool;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "stopRecord: ", localException });
        boolean bool = false;
      }
    }
  }

  public static boolean KU()
  {
    AppMethodBeat.i(127938);
    try
    {
      bool = ((AudioManager)com.tencent.pb.common.c.d.sZj.getSystemService("audio")).isSpeakerphoneOn();
      com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "isSpeakerOn ret: ", Boolean.valueOf(bool) });
      AppMethodBeat.o(127938);
      return bool;
    }
    catch (Exception localException)
    {
      while (true)
      {
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "isSpeakerOn ", localException });
        boolean bool = false;
      }
    }
  }

  private void Km()
  {
    AppMethodBeat.i(127887);
    this.AJk.remove(this.neq);
    this.AJL = 0;
    this.mIsMute = false;
    setState(0);
    this.AJs = false;
    a(this.AJu, 0, 0L, null, null);
    this.AJu = null;
    this.AlR = 0;
    this.AJv = 0;
    this.AJw = 0;
    this.AJx = 0;
    this.AJz = true;
    this.AJR = true;
    this.AJy = 0L;
    this.AJA = 0;
    this.AJr = false;
    this.AJY = false;
    this.AJZ = true;
    dTq();
    this.mHandler.removeMessages(1);
    if (this.AJD != null)
      this.AJD.dTe();
    dTv();
    dTu();
    dTw();
    dTz();
    this.nME = false;
    this.AJQ = false;
    AppMethodBeat.o(127887);
  }

  private static void La()
  {
    AppMethodBeat.i(127937);
    try
    {
      AudioManager localAudioManager = (AudioManager)com.tencent.pb.common.c.d.sZj.getSystemService("audio");
      localAudioManager.setMode(0);
      com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "resumeAudioConfig mode: ", Integer.valueOf(localAudioManager.getMode()), " isSpeaker: ", Boolean.valueOf(localAudioManager.isSpeakerphoneOn()) });
      AppMethodBeat.o(127937);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "resumeAudioConfig ", localThrowable });
        AppMethodBeat.o(127937);
      }
    }
  }

  private static boolean So(int paramInt)
  {
    boolean bool = true;
    if (paramInt != 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  private void a(int paramInt1, int paramInt2, Object paramObject, com.tencent.wecall.talkroom.a.h paramh)
  {
    AppMethodBeat.i(127907);
    com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "handleRedirectResp", Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt2 != 0) || (paramObject == null))
    {
      com.tencent.pb.common.c.c.e("TalkRoomService", new Object[] { "handleRedirectResp err", Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      if (b(paramh.groupId, paramh.nwu, paramh.nwv, false))
        this.AJC.aa(new String[] { "redirect", "resp", "-1", String.valueOf(this.state) });
      AppMethodBeat.o(127907);
    }
    a.aj localaj;
    while (true)
    {
      return;
      localaj = (a.aj)paramObject;
      if (b(localaj.groupId, localaj.sQS, localaj.sQT, false))
        break;
      com.tencent.pb.common.c.c.e("TalkRoomService", new Object[] { "handleRedirectResp roomid error", Integer.valueOf(localaj.sQS), Integer.valueOf(this.nCF) });
      AppMethodBeat.o(127907);
    }
    this.AJC.aa(new String[] { "redirect", "resp", String.valueOf(paramInt2), String.valueOf(this.state) });
    a(localaj.groupId, null, this.AlR, localaj.sQS, localaj.sQT, localaj.AnQ, localaj.AnS, localaj.Amz, false, false);
    paramObject = new byte[localaj.AnU.length];
    for (paramInt1 = 0; paramInt1 < localaj.AnU.length; paramInt1++)
      paramObject[paramInt1] = ((byte)(byte)localaj.AnU[paramInt1]);
    paramh = new int[localaj.Aod.length];
    for (paramInt1 = 0; paramInt1 < localaj.Aod.length; paramInt1++)
      paramh[paramInt1] = localaj.Aod[paramInt1];
    a(localaj.AnR, localaj.AnY, localaj.AnZ);
    this.AJD.Close();
    a.av[] arrayOfav = localaj.AnQ;
    a.as localas = localaj.Ane;
    if ((localaj.AnT & 0x2) != 0);
    for (boolean bool = true; ; bool = false)
    {
      a(0, arrayOfav, localas, paramObject, bool, localaj.groupId, localaj.sQS, localaj.sQT, localaj.Aoa, localaj.Aob, localaj.Aoc, paramh, localaj.Ang);
      AppMethodBeat.o(127907);
      break;
    }
  }

  private void a(int paramInt, a.aa paramaa, com.tencent.wecall.talkroom.a.e parame)
  {
    AppMethodBeat.i(127908);
    com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "handleEnterTalkRoomEnd", parame.neq, Integer.valueOf(parame.nCF), Long.valueOf(parame.sZg), " errCode: ", Integer.valueOf(paramInt), " state: ", Integer.valueOf(this.state) });
    Object localObject = com.tencent.pb.common.c.b.I(new Integer[] { Integer.valueOf(14200), Integer.valueOf(-1101), Integer.valueOf(14201), Integer.valueOf(-1102), Integer.valueOf(14202), Integer.valueOf(-1103), Integer.valueOf(14203), Integer.valueOf(-1104), Integer.valueOf(14204), Integer.valueOf(-1105), Integer.valueOf(14205), Integer.valueOf(-1111) });
    if (((Map)localObject).containsKey(Integer.valueOf(paramInt)))
      h.Sq(((Integer)((Map)localObject).get(Integer.valueOf(paramInt))).intValue());
    if (paramInt == 14255)
    {
      com.tencent.pb.common.c.c.e("TalkRoomService", new Object[] { "handleEnterTalkRoomEnd errCode =%d, groupId=%s,roomid=%d,roomkey=%s", Integer.valueOf(14255), paramaa.groupId, Integer.valueOf(paramaa.sQS), Long.valueOf(paramaa.sQT) });
      this.AJK.k(-14255, paramaa);
      AppMethodBeat.o(127908);
    }
    while (true)
    {
      return;
      if (paramInt == 14256)
      {
        com.tencent.pb.common.c.c.e("TalkRoomService", new Object[] { "handleEnterTalkRoomEnd errCode =%d, groupId=%s,roomid=%d,roomkey=%s", Integer.valueOf(14256), paramaa.groupId, Integer.valueOf(paramaa.sQS), Long.valueOf(paramaa.sQT) });
        this.AJK.k(-14256, paramaa);
        AppMethodBeat.o(127908);
      }
      else if ((paramInt != 0) && (paramInt != 14204))
      {
        if (!b(parame.neq, parame.nCF, parame.sZg, So(parame.ALs)))
        {
          com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handleEnterTalkRoomEnd isCurrentRoom is false errCode:", Integer.valueOf(paramInt), " enterScene.mGroupId: ", parame.neq, " mGroupId: ", this.neq, Integer.valueOf(parame.nCF), Integer.valueOf(this.nCF), Long.valueOf(parame.sZg), Long.valueOf(this.sZg) });
          AppMethodBeat.o(127908);
        }
        else if (3 != this.state)
        {
          com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handleEnterTalkRoomEnd state is error: ", Integer.valueOf(this.state), " errCode: ", Integer.valueOf(paramInt), parame.neq, Integer.valueOf(parame.nCF), Long.valueOf(parame.sZg) });
          AppMethodBeat.o(127908);
        }
        else
        {
          this.AJC.aa(new String[] { "enter", "resp", String.valueOf(paramInt), String.valueOf(this.state) });
          this.AJC.Su(322);
          com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "exitTalkRoom handleEnterTalkRoomEnd fail errCode: ", Integer.valueOf(paramInt), parame.neq, Integer.valueOf(parame.nCF), Long.valueOf(parame.sZg) });
          a(parame.neq, parame.nCF, parame.sZg, true);
          if (paramInt == 14251)
          {
            this.AJK.k(-1000, null);
            AppMethodBeat.o(127908);
          }
          else if (paramInt == 14252)
          {
            this.AJK.k(-1200, null);
            AppMethodBeat.o(127908);
          }
          else if (paramInt == 14253)
          {
            parame = Integer.valueOf(60);
            if (paramaa != null)
              parame = Integer.valueOf(paramaa.AnW);
            this.AJK.k(-1500, parame);
            AppMethodBeat.o(127908);
          }
          else
          {
            this.AJK.k(-200, null);
            AppMethodBeat.o(127908);
          }
        }
      }
      else if ((paramInt == 14204) && (this.state == 4))
      {
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handleEnterTalkRoomEnd errCode == EmRetCode.E_Talk_Enter_AlreadyEnter", paramaa.groupId, Integer.valueOf(paramaa.sQS), Long.valueOf(paramaa.sQT) });
        AppMethodBeat.o(127908);
      }
      else if (!b(paramaa.groupId, paramaa.sQS, paramaa.sQT, So(paramaa.AmJ)))
      {
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handleEnterTalkRoomEnd isCurrentRoom is false,state: ", Integer.valueOf(this.state), " resp.groupId锟斤拷", paramaa.groupId, " mGroupId: ", this.neq, Integer.valueOf(paramaa.sQS), Integer.valueOf(this.nCF), Long.valueOf(paramaa.sQT), Long.valueOf(this.sZg) });
        a(paramaa.groupId, paramaa.sQS, paramaa.sQT, 111, false);
        h.Sq(-1110);
        AppMethodBeat.o(127908);
      }
      else if (this.state != 3)
      {
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handleEnterTalkRoomEnd state is error: ", Integer.valueOf(this.state), paramaa.groupId, Integer.valueOf(paramaa.sQS), Long.valueOf(paramaa.sQT) });
        AppMethodBeat.o(127908);
      }
      else
      {
        this.AJC.aa(new String[] { "enter", "resp", String.valueOf(paramInt), String.valueOf(this.state) });
        if ((paramaa.AnR != null) && (paramaa.AnR.length != 0))
          break;
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handleEnterTalkRoomEnd resp.addrlist is null,errCode: ", Integer.valueOf(paramInt), paramaa.groupId, Integer.valueOf(paramaa.sQS), Long.valueOf(paramaa.sQT) });
        h.Sq(-1605);
        this.AJC.tdf = 329;
        a(paramaa.groupId, paramaa.sQS, paramaa.sQT, 116, true);
        this.AJK.k(-200, null);
        AppMethodBeat.o(127908);
      }
    }
    this.neq = paramaa.groupId;
    this.AJO = paramaa.groupId;
    this.nCF = paramaa.sQS;
    this.sZg = paramaa.sQT;
    setState(4);
    a(paramaa.AnR, paramaa.AnY, paramaa.AnZ);
    a(paramaa.groupId, null, this.AlR, paramaa.sQS, paramaa.sQT, paramaa.AnQ, paramaa.AnS, paramaa.Amz, false, true);
    parame = this.AJK;
    localObject = new g.7(parame, c.dTg().auL(paramaa.groupId));
    if (Looper.myLooper() == Looper.getMainLooper())
      ((Runnable)localObject).run();
    while (true)
    {
      parame = new byte[paramaa.AnU.length];
      for (paramInt = 0; paramInt < paramaa.AnU.length; paramInt++)
        parame[paramInt] = ((byte)(byte)paramaa.AnU[paramInt]);
      parame.handler.post((Runnable)localObject);
    }
    int[] arrayOfInt = new int[paramaa.Aod.length];
    for (paramInt = 0; paramInt < paramaa.Aod.length; paramInt++)
      arrayOfInt[paramInt] = paramaa.Aod[paramInt];
    localObject = paramaa.AnQ;
    a.as localas = paramaa.Ane;
    if ((paramaa.AnT & 0x2) != 0);
    for (boolean bool = true; ; bool = false)
    {
      a(0, (a.av[])localObject, localas, parame, bool, paramaa.groupId, paramaa.sQS, paramaa.sQT, paramaa.Aoa, paramaa.Aob, paramaa.Aoc, arrayOfInt, paramaa.Ang);
      if (paramaa.AnX != 0)
      {
        com.tencent.pb.common.c.c.i("TalkRoomService", new Object[] { "get helloFreqSeconds:" + paramaa.AnX });
        AJq = paramaa.AnX * 1000;
      }
      dTt();
      com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handleVoiceGroupMemberChange handleEnterTalkRoomEnd", this.neq, Integer.valueOf(this.nCF), Long.valueOf(this.sZg) });
      AppMethodBeat.o(127908);
      break;
    }
  }

  private void a(int paramInt, a.ah paramah)
  {
    AppMethodBeat.i(127906);
    com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handleGetGroupInfoBatch errCode: ", Integer.valueOf(paramInt) });
    if (paramInt != 0)
    {
      this.AJK.fF(null);
      AppMethodBeat.o(127906);
    }
    while (true)
    {
      return;
      a.au[] arrayOfau = paramah.Aon;
      if ((arrayOfau == null) || (arrayOfau.length == 0))
      {
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handleGetGroupInfoBatch resp.groupInfoList is null" });
        AppMethodBeat.o(127906);
      }
      else
      {
        paramah = new ArrayList();
        int i = arrayOfau.length;
        for (paramInt = 0; paramInt < i; paramInt++)
        {
          a.au localau = arrayOfau[paramInt];
          if (localau != null)
          {
            a(localau.groupId, null, 0, localau.sQS, localau.sQT, localau.AnQ, null, null, false, false);
            paramah.add(c.dTg().auL(localau.groupId));
          }
        }
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handleGetGroupInfoBatch multiTalkGrouplist size: ", Integer.valueOf(paramah.size()) });
        this.AJK.fF(paramah);
        AppMethodBeat.o(127906);
      }
    }
  }

  // ERROR //
  private void a(int paramInt1, a.av[] paramArrayOfav, a.as paramas, byte[] paramArrayOfByte1, boolean paramBoolean, String paramString, int paramInt2, long paramLong, int paramInt3, int paramInt4, byte[] paramArrayOfByte2, int[] paramArrayOfInt, int paramInt5)
  {
    // Byte code:
    //   0: ldc_w 763
    //   3: invokestatic 116	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: ldc_w 286
    //   9: bipush 6
    //   11: anewarray 4	java/lang/Object
    //   14: dup
    //   15: iconst_0
    //   16: ldc_w 765
    //   19: aastore
    //   20: dup
    //   21: iconst_1
    //   22: iload_1
    //   23: invokestatic 452	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   26: aastore
    //   27: dup
    //   28: iconst_2
    //   29: aload 6
    //   31: aastore
    //   32: dup
    //   33: iconst_3
    //   34: iload 7
    //   36: invokestatic 452	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   39: aastore
    //   40: dup
    //   41: iconst_4
    //   42: lload 8
    //   44: invokestatic 589	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   47: aastore
    //   48: dup
    //   49: iconst_5
    //   50: aload_0
    //   51: getfield 160	com/tencent/wecall/talkroom/model/f:state	I
    //   54: invokestatic 452	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   57: aastore
    //   58: invokestatic 329	com/tencent/pb/common/c/c:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   61: aload_0
    //   62: getfield 420	com/tencent/wecall/talkroom/model/f:AJD	Lcom/tencent/wecall/talkroom/model/b;
    //   65: ifnull +94 -> 159
    //   68: aload_0
    //   69: aload_2
    //   70: aload_3
    //   71: aload 4
    //   73: iload 5
    //   75: iload 7
    //   77: lload 8
    //   79: iload 10
    //   81: iload 11
    //   83: aload 12
    //   85: aload 13
    //   87: iload 14
    //   89: invokespecial 768	com/tencent/wecall/talkroom/model/f:a	([Lcom/tencent/pb/common/b/a/a$av;Lcom/tencent/pb/common/b/a/a$as;[BZIJII[B[II)Z
    //   92: istore 15
    //   94: ldc_w 286
    //   97: iconst_2
    //   98: anewarray 4	java/lang/Object
    //   101: dup
    //   102: iconst_0
    //   103: ldc_w 770
    //   106: aastore
    //   107: dup
    //   108: iconst_1
    //   109: iload 15
    //   111: invokestatic 363	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   114: aastore
    //   115: invokestatic 368	com/tencent/pb/common/c/c:w	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   118: iload 15
    //   120: ifeq +39 -> 159
    //   123: ldc_w 763
    //   126: invokestatic 138	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   129: return
    //   130: astore 16
    //   132: iconst_0
    //   133: istore 15
    //   135: ldc_w 286
    //   138: iconst_2
    //   139: anewarray 4	java/lang/Object
    //   142: dup
    //   143: iconst_0
    //   144: ldc_w 772
    //   147: aastore
    //   148: dup
    //   149: iconst_1
    //   150: aload 16
    //   152: aastore
    //   153: invokestatic 368	com/tencent/pb/common/c/c:w	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   156: goto -38 -> 118
    //   159: iload_1
    //   160: ifgt +63 -> 223
    //   163: aload_0
    //   164: getfield 189	com/tencent/wecall/talkroom/model/f:AJC	Lcom/tencent/wecall/talkroom/model/h;
    //   167: sipush 202
    //   170: invokevirtual 639	com/tencent/wecall/talkroom/model/h:Su	(I)V
    //   173: ldc_w 286
    //   176: iconst_1
    //   177: anewarray 4	java/lang/Object
    //   180: dup
    //   181: iconst_0
    //   182: ldc_w 774
    //   185: aastore
    //   186: invokestatic 368	com/tencent/pb/common/c/c:w	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   189: aload_0
    //   190: aload 6
    //   192: iload 7
    //   194: lload 8
    //   196: bipush 102
    //   198: iconst_1
    //   199: invokevirtual 659	com/tencent/wecall/talkroom/model/f:a	(Ljava/lang/String;IJIZ)Z
    //   202: pop
    //   203: aload_0
    //   204: getfield 207	com/tencent/wecall/talkroom/model/f:AJK	Lcom/tencent/wecall/talkroom/model/g;
    //   207: sipush -400
    //   210: aconst_null
    //   211: invokevirtual 622	com/tencent/wecall/talkroom/model/g:k	(ILjava/lang/Object;)V
    //   214: ldc_w 763
    //   217: invokestatic 138	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   220: goto -91 -> 129
    //   223: aload_0
    //   224: getfield 301	com/tencent/wecall/talkroom/model/f:mHandler	Landroid/os/Handler;
    //   227: new 776	com/tencent/wecall/talkroom/model/f$4
    //   230: dup
    //   231: aload_0
    //   232: iload_1
    //   233: aload_2
    //   234: aload_3
    //   235: aload 4
    //   237: iload 5
    //   239: aload 6
    //   241: iload 7
    //   243: lload 8
    //   245: iload 10
    //   247: iload 11
    //   249: aload 12
    //   251: aload 13
    //   253: iload 14
    //   255: invokespecial 779	com/tencent/wecall/talkroom/model/f$4:<init>	(Lcom/tencent/wecall/talkroom/model/f;I[Lcom/tencent/pb/common/b/a/a$av;Lcom/tencent/pb/common/b/a/a$as;[BZLjava/lang/String;IJII[B[II)V
    //   258: ldc2_w 780
    //   261: invokevirtual 785	android/os/Handler:postDelayed	(Ljava/lang/Runnable;J)Z
    //   264: pop
    //   265: ldc_w 763
    //   268: invokestatic 138	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   271: goto -142 -> 129
    //   274: astore 16
    //   276: goto -141 -> 135
    //
    // Exception table:
    //   from	to	target	type
    //   68	94	130	java/lang/Exception
    //   94	118	274	java/lang/Exception
  }

  public static void a(com.tencent.pb.talkroom.sdk.e parame)
  {
    Amd = parame;
  }

  private void a(String paramString1, int paramInt, long paramLong, String paramString2, String paramString3)
  {
    this.nCF = paramInt;
    this.sZg = paramLong;
    this.neq = paramString2;
    this.AJu = paramString1;
    this.AJt = paramString3;
  }

  private void a(String paramString, int paramInt, long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(127914);
    a(paramString, paramInt, paramLong, paramBoolean, true, true);
    AppMethodBeat.o(127914);
  }

  private static void a(String paramString, int paramInt, long paramLong, a.av[] paramArrayOfav)
  {
    AppMethodBeat.i(127911);
    if (paramArrayOfav == null)
    {
      com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "printMembersLog members is null groupId: ", paramString, "  roomid: ", Integer.valueOf(paramInt), "  roomKey", Long.valueOf(paramLong) });
      AppMethodBeat.o(127911);
    }
    while (true)
    {
      return;
      StringBuffer localStringBuffer = new StringBuffer();
      int i = paramArrayOfav.length;
      for (int j = 0; j < i; j++)
      {
        a.av localav = paramArrayOfav[j];
        if (localav != null)
          localStringBuffer.append(" memberId:" + localav.kyZ + " uuid: " + localav.Aop + " status: " + localav.status + "   mem.inviteTime:" + localav.Api + "  mem.reason: " + localav.boZ + "  mem.inviteuuid: " + localav.Apu + "\n");
      }
      com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "printMembersLog groupId: ", paramString, "  romid: ", Integer.valueOf(paramInt), "  roomKey", Long.valueOf(paramLong), "  members.length: ", Integer.valueOf(paramArrayOfav.length), "  ", localStringBuffer.toString() });
      AppMethodBeat.o(127911);
    }
  }

  private void a(String paramString1, String paramString2, int paramInt1, int paramInt2, long paramLong, a.av[] paramArrayOfav, a.aw[] paramArrayOfaw, a.at paramat, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(127909);
    a(paramString1, paramInt2, paramLong, paramArrayOfav);
    c localc = c.dTg();
    Integer localInteger;
    boolean bool;
    if (paramInt1 == 0)
    {
      localInteger = null;
      if ((this.neq == null) || (!this.neq.equals(paramString1)))
        break label369;
      bool = true;
      label49: paramBoolean1 = localc.a(paramString1, paramString2, localInteger, paramInt2, paramLong, paramat, paramArrayOfav, paramArrayOfaw, paramBoolean1, bool);
      paramString2 = this.neq;
      int i = this.nCF;
      long l = this.sZg;
      bool = b(paramString1, paramInt2, paramLong, false);
      if (paramArrayOfav == null)
        break label375;
      paramInt1 = paramArrayOfav.length;
      label112: com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "engine handleVoiceGroupMemberChange", paramString1, paramString2, Integer.valueOf(paramInt2), Integer.valueOf(i), Long.valueOf(paramLong), Long.valueOf(l), Boolean.valueOf(paramBoolean1), " isCurrentRoom: ", Boolean.valueOf(bool), " members.length: ", Integer.valueOf(paramInt1), " isCallBackEngine: ", Boolean.valueOf(paramBoolean2), " mFirstGetAudioData: ", Boolean.valueOf(this.AJz) });
      if (c.dTg().cp(this.neq, false))
      {
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handleVoiceGroupMemberChange isGroupActive mFirstGetAudioData: ", Boolean.valueOf(this.AJz), " mGroupId: ", this.neq, " roomId: ", Integer.valueOf(paramInt2) });
        if (this.AJz)
        {
          this.AJz = false;
          this.nME = true;
          this.AJM = k.dTJ();
          this.AJx = this.AJv;
          dTy();
        }
      }
      if (paramArrayOfav != null)
        break label380;
      AppMethodBeat.o(127909);
    }
    while (true)
    {
      return;
      localInteger = Integer.valueOf(paramInt1);
      break;
      label369: bool = false;
      break label49;
      label375: paramInt1 = 0;
      break label112;
      label380: if ((paramBoolean2) && (b(paramString1, paramInt2, paramLong, false)) && (paramArrayOfav.length > 0) && (this.AJD != null))
        a(paramArrayOfav);
      AppMethodBeat.o(127909);
    }
  }

  private void a(a.av[] paramArrayOfav)
  {
    AppMethodBeat.i(127910);
    if (paramArrayOfav == null)
    {
      com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "onMebersChangedToEngine members is null" });
      AppMethodBeat.o(127910);
    }
    while (true)
    {
      return;
      int[] arrayOfInt = new int[paramArrayOfav.length];
      StringBuffer localStringBuffer = new StringBuffer();
      for (int i = 0; i < paramArrayOfav.length; i++)
      {
        arrayOfInt[i] = paramArrayOfav[i].kyZ;
        localStringBuffer.append(paramArrayOfav[i].kyZ);
        localStringBuffer.append(",");
      }
      com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "engine handleVoiceGroupMemberChange engine.OnMembersChanged memberid: ", localStringBuffer.toString() });
      if (this.AJD == null)
      {
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "onMebersChangedToEngine engine is null" });
        AppMethodBeat.o(127910);
      }
      else
      {
        this.AJD.OnMembersChanged(arrayOfInt);
        AppMethodBeat.o(127910);
      }
    }
  }

  private void a(a.o[] paramArrayOfo1, a.o[] paramArrayOfo2, int paramInt)
  {
    AppMethodBeat.i(127912);
    int i;
    if (paramArrayOfo1 == null)
    {
      i = 0;
      com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "handleRelayData addrs length: ", Integer.valueOf(i) });
      if ((paramArrayOfo1 != null) && (paramArrayOfo1.length > 0))
        break label60;
      AppMethodBeat.o(127912);
    }
    while (true)
    {
      return;
      i = paramArrayOfo1.length;
      break;
      label60: this.AJU = new int[paramArrayOfo1.length];
      this.AJT = new short[paramArrayOfo1.length];
      this.AJW = new int[paramArrayOfo2.length];
      this.AJV = new short[paramArrayOfo2.length];
      this.AJX = paramInt;
      com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handleRelayData tcpStartTime: ", Integer.valueOf(this.AJX) });
      int j = paramArrayOfo1.length;
      paramInt = 0;
      i = 0;
      while (paramInt < j)
      {
        a.o localo = paramArrayOfo1[paramInt];
        this.AJU[i] = localo.Ana;
        this.AJT[i] = ((short)(short)localo.port);
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handleRelayData ip: ", Integer.valueOf(localo.Ana), " addr.port: ", Integer.valueOf(localo.port) });
        i++;
        paramInt++;
      }
      j = paramArrayOfo2.length;
      i = 0;
      paramInt = 0;
      while (i < j)
      {
        paramArrayOfo1 = paramArrayOfo2[i];
        this.AJW[paramInt] = paramArrayOfo1.Ana;
        this.AJV[paramInt] = ((short)(short)paramArrayOfo1.port);
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handleRelayData tcpIp: ", Integer.valueOf(paramArrayOfo1.Ana), " tcpAddr.port: ", Integer.valueOf(paramArrayOfo1.port) });
        paramInt++;
        i++;
      }
      com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "handleRelayData", Arrays.toString(this.AJU), Arrays.toString(this.AJT), this.neq, this.neq, Integer.valueOf(this.nCF), Long.valueOf(this.sZg), Arrays.toString(this.AJW), Arrays.toString(this.AJV), Integer.valueOf(this.AJX) });
      AppMethodBeat.o(127912);
    }
  }

  private boolean a(a.av[] paramArrayOfav, a.as paramas, byte[] paramArrayOfByte1, boolean paramBoolean, int paramInt1, long paramLong, int paramInt2, int paramInt3, byte[] paramArrayOfByte2, int[] paramArrayOfInt, int paramInt4)
  {
    AppMethodBeat.i(127924);
    if (this.state != 4)
    {
      com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "dealWithInit state is error: ", Integer.valueOf(this.state) });
      paramBoolean = false;
      AppMethodBeat.o(127924);
    }
    while (true)
    {
      return paramBoolean;
      paramBoolean = b(paramArrayOfav, paramas, paramArrayOfByte1, paramBoolean, paramInt1, paramLong, paramInt2, paramInt3, paramArrayOfByte2, paramArrayOfInt, paramInt4);
      AppMethodBeat.o(127924);
    }
  }

  private void aDm()
  {
    AppMethodBeat.i(127927);
    EB();
    int i = b(talk.VOICE_SAMPLERATE, talk.VOICE_FRAME_DURATION, new f.5(this));
    if (i <= 0)
    {
      this.AJC.Su(101);
      h.Sr(-2001);
      this.AJK.k(-500, null);
    }
    h localh;
    if (i > 0)
      localh = this.AJC;
    for (localh.AKR &= -2; ; localh.AKR |= 1)
    {
      com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "audioAdapter startRecord ret: ", Integer.valueOf(i) });
      AppMethodBeat.o(127927);
      return;
      localh = this.AJC;
    }
  }

  private static int b(int paramInt1, int paramInt2, com.tencent.pb.talkroom.sdk.b paramb)
  {
    AppMethodBeat.i(127898);
    int i = -100;
    try
    {
      com.tencent.pb.talkroom.sdk.e locale = Amd;
      j = i;
      if (locale != null)
        j = locale.a(paramInt1, paramInt2, paramb);
      com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "startPlayer samplerate: ", " frameDuration: ", Integer.valueOf(paramInt2), " ret: ", Integer.valueOf(j) });
      AppMethodBeat.o(127898);
      return j;
    }
    catch (Exception paramb)
    {
      while (true)
      {
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "startPlayer: ", Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramb });
        int j = i;
      }
    }
  }

  private static int b(int paramInt1, int paramInt2, com.tencent.pb.talkroom.sdk.c paramc)
  {
    AppMethodBeat.i(127900);
    int i = -100;
    try
    {
      com.tencent.pb.talkroom.sdk.e locale = Amd;
      j = i;
      if (locale != null)
        j = locale.a(paramInt1, paramInt2, paramc);
      com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "startRecord samplerate: ", " frameDuration: ", Integer.valueOf(paramInt2), " ret: ", Integer.valueOf(j) });
      AppMethodBeat.o(127900);
      return j;
    }
    catch (Exception paramc)
    {
      while (true)
      {
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "startRecord: ", paramc });
        int j = i;
      }
    }
  }

  private void b(String paramString1, int paramInt1, long paramLong, int paramInt2, int paramInt3, String paramString2)
  {
    AppMethodBeat.i(127891);
    com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "sendEnterGroupScence groupId: ", paramString1, " roomId: ", Integer.valueOf(paramInt1), " roomKey: ", Long.valueOf(paramLong), " enterType: ", Integer.valueOf(paramInt3), " isSenceCircle: ", Boolean.TRUE, " wXgroupId: ", paramString2 });
    if ((paramInt1 == 0) || (paramLong == 0L))
    {
      com.tencent.pb.common.c.c.e("TalkRoomService", new Object[] { "roomId or roomkey is 0..return." });
      AppMethodBeat.o(127891);
    }
    while (true)
    {
      return;
      if (!So(paramInt3))
        this.AJC.dTF();
      this.AJC.dTE();
      paramString1 = new com.tencent.wecall.talkroom.a.e(paramString1, paramInt1, paramLong, this.AJD.dTd(), paramInt2, paramInt3, paramString2);
      com.tencent.pb.common.b.e.dPu().a(paramString1);
      c(paramString1);
      AppMethodBeat.o(127891);
    }
  }

  private boolean b(String paramString, int paramInt, long paramLong, boolean paramBoolean)
  {
    boolean bool = true;
    AppMethodBeat.i(127931);
    if (paramBoolean)
    {
      paramBoolean = com.tencent.pb.common.c.g.iA(paramString, this.neq);
      AppMethodBeat.o(127931);
    }
    while (true)
    {
      return paramBoolean;
      com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "isCurrentRoom groupId: ", paramString, " mGroupId: ", this.neq, "roomId: ", Integer.valueOf(paramInt), " mRoomId: ", Integer.valueOf(this.nCF), " roomKey: ", Long.valueOf(paramLong), " mRoomKey: ", Long.valueOf(this.sZg) });
      if ((com.tencent.pb.common.c.g.iA(paramString, this.neq)) && (paramInt == this.nCF) && (paramLong == this.sZg))
      {
        AppMethodBeat.o(127931);
        paramBoolean = bool;
      }
      else
      {
        AppMethodBeat.o(127931);
        paramBoolean = false;
      }
    }
  }

  private boolean b(a.av[] paramArrayOfav, a.as paramas, byte[] paramArrayOfByte1, boolean paramBoolean, int paramInt1, long paramLong, int paramInt2, int paramInt3, byte[] paramArrayOfByte2, int[] paramArrayOfInt, int paramInt4)
  {
    AppMethodBeat.i(127930);
    com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "connectToCompenent myRoomMemId roomid:", Integer.valueOf(paramInt1), " roomKey: ", Long.valueOf(paramLong), " groupId: ", this.neq, " ip: ", Arrays.toString(this.AJU), " ports: ", Arrays.toString(this.AJT), " tcpIp: ", Arrays.toString(this.AJW), " tcpPorts: ", Arrays.toString(this.AJV), " tcpStartTime: ", Integer.valueOf(this.AJX), " audio_encrypt_type: ", Integer.valueOf(paramInt2), " video_encrypt_type: ", Integer.valueOf(paramInt4) });
    Object localObject1 = com.tencent.pb.a.a.a.dPM();
    int i = -1;
    Object localObject2;
    if ((paramArrayOfav != null) && (paramArrayOfav.length > 0))
    {
      localObject2 = new int[paramArrayOfav.length];
      for (j = 0; j < paramArrayOfav.length; j++)
      {
        localObject2[j] = paramArrayOfav[j].kyZ;
        if (com.tencent.pb.common.c.g.equals(paramArrayOfav[j].Aop, (String)localObject1))
          i = paramArrayOfav[j].kyZ;
      }
      paramArrayOfav = (a.av[])localObject2;
    }
    for (int j = i; ; j = -1)
    {
      int k = c.dTg().auG(this.neq);
      this.AJC.kyZ = j;
      try
      {
        localObject1 = this.AJD;
        locala = this.AJE;
        localObject3 = c.dTg();
        localObject2 = this.neq;
        localObject3 = ((c)localObject3).auE((String)localObject2);
        if (localObject3 == null)
        {
          com.tencent.pb.common.c.c.w("TalkRoomManager", new Object[] { "getMyUuid TalkRoom is null  groupId: ", localObject2 });
          i = 0;
          arrayOfInt1 = this.AJU;
          arrayOfShort = this.AJT;
          arrayOfInt2 = this.AJW;
          localObject3 = this.AJV;
          m = this.AJX;
          com.tencent.pb.common.c.c.i("simon:TalkRoomContext", new Object[] { "Open" });
          localObject2 = null;
          if (paramas == null)
            break label722;
          localObject2 = new com/tencent/wecall/talkroom/model/i;
          ((i)localObject2).<init>(paramas.AoA, paramas.fAa, paramas.fAb, paramas.AoB, paramas.AoC, paramas.AoD, paramas.AoE, paramas.AoF, paramas.AoG, paramas.AoH, paramas.AoI, paramas.AoJ);
        }
        for (paramas = (a.as)localObject2; ; paramas = (a.as)localObject2)
        {
          n = k.ju(com.tencent.pb.common.c.d.sZj);
          localObject2 = ((b)localObject1).AIV;
          if (localObject2 != null)
            break label773;
          paramInt1 = -1;
          paramArrayOfav = this.AJK;
          paramas = new g.2(paramArrayOfav, paramInt1);
          if (Looper.myLooper() != Looper.getMainLooper())
            break label824;
          paramas.run();
          com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "connectToCompenent ret =", Integer.valueOf(paramInt1), Integer.valueOf(j), Integer.valueOf(k) });
          if (paramInt1 < 0)
            h.St(-3002);
          if (paramInt1 == 0)
            this.AJC.tdi = 1;
          if (paramInt1 != 0)
            break label836;
          paramBoolean = true;
          AppMethodBeat.o(127930);
          return paramBoolean;
          localObject3 = ((TalkRoom)localObject3).auD(com.tencent.pb.a.a.a.dPM());
          if (localObject3 == null)
          {
            com.tencent.pb.common.c.c.w("TalkRoomManager", new Object[] { "getMyUuid talkRoomMember is null  groupId: ", localObject2 });
            i = 0;
            break;
          }
          localObject3 = ((d)localObject3).AJb;
          if (localObject3 == null)
          {
            com.tencent.pb.common.c.c.w("TalkRoomManager", new Object[] { "getMyUuid voiceGroupMem is null  groupId: ", localObject2 });
            i = 0;
            break;
          }
          com.tencent.pb.common.c.c.d("TalkRoomManager", new Object[] { "getMyUuid groupId: ", localObject2, " uuid: ", Integer.valueOf(((a.av)localObject3).vzt) });
          i = ((a.av)localObject3).vzt;
          break;
          label722: com.tencent.pb.common.c.c.w("simon:TalkRoomContext", new Object[] { "voiceConf is null" });
        }
      }
      catch (Throwable paramArrayOfav)
      {
        while (true)
        {
          talk.a locala;
          Object localObject3;
          int[] arrayOfInt1;
          short[] arrayOfShort;
          int[] arrayOfInt2;
          int m;
          int n;
          com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "connectToCompenent", paramArrayOfav });
          paramInt1 = -99999;
          continue;
          label773: paramInt1 = ((b)localObject1).AIV.Open(locala, paramas, i, j, paramInt1, paramLong, arrayOfInt1, arrayOfShort, 0, paramArrayOfav, paramArrayOfByte1, paramBoolean, n, arrayOfInt2, (short[])localObject3, m, paramInt2, paramInt3, paramArrayOfByte2, paramArrayOfInt, paramInt4);
          continue;
          label824: paramArrayOfav.handler.post(paramas);
          continue;
          label836: paramBoolean = false;
          AppMethodBeat.o(127930);
        }
      }
      paramArrayOfav = null;
    }
  }

  private boolean bW(int paramInt, String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(127892);
    if (paramInt == 100)
      AppMethodBeat.o(127892);
    while (true)
    {
      return bool;
      if (So(paramInt))
      {
        if (this.state == 0)
        {
          AppMethodBeat.o(127892);
        }
        else
        {
          AppMethodBeat.o(127892);
          bool = false;
        }
      }
      else if (paramInt == 1)
      {
        bool = auN(paramString);
        AppMethodBeat.o(127892);
      }
      else
      {
        AppMethodBeat.o(127892);
        bool = false;
      }
    }
  }

  private void c(com.tencent.pb.common.b.d paramd)
  {
    AppMethodBeat.i(127935);
    this.mHandler.removeCallbacks(this.AKc);
    this.AKb = paramd;
    this.mHandler.postDelayed(this.AKc, 3000L);
    AppMethodBeat.o(127935);
  }

  private void cEx()
  {
    AppMethodBeat.i(127901);
    com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "releaseConpent" });
    try
    {
      EB();
    }
    catch (Throwable localThrowable1)
    {
      try
      {
        while (true)
        {
          dTs();
          AppMethodBeat.o(127901);
          return;
          localThrowable1 = localThrowable1;
          com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "releaseConpent ", localThrowable1 });
        }
      }
      catch (Throwable localThrowable2)
      {
        while (true)
        {
          com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "releaseConpent ", localThrowable2 });
          AppMethodBeat.o(127901);
        }
      }
    }
  }

  public static com.tencent.pb.talkroom.sdk.e dTA()
  {
    return Amd;
  }

  private int dTr()
  {
    AppMethodBeat.i(127894);
    int i;
    if (this.AJy == 0L)
    {
      i = 0;
      AppMethodBeat.o(127894);
    }
    while (true)
    {
      return i;
      i = (int)((System.currentTimeMillis() - this.AJy) / 1000L);
      AppMethodBeat.o(127894);
    }
  }

  private boolean dTs()
  {
    AppMethodBeat.i(127897);
    try
    {
      com.tencent.pb.talkroom.sdk.e locale = Amd;
      if (locale != null)
      {
        this.AJC.sUz = locale.bRn();
        this.AJC.sUp = locale.bRq();
        bool = locale.bRl();
        com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "stopPlayer ret: ", Boolean.valueOf(bool) });
        AppMethodBeat.o(127897);
        return bool;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "stopPlayer: ", localException });
        boolean bool = false;
      }
    }
  }

  private void dTt()
  {
    AppMethodBeat.i(127919);
    com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "hello timer start~~" });
    if (this.AJF != null)
    {
      com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "dealWithInit enter talkroom not first time" });
      AppMethodBeat.o(127919);
    }
    while (true)
    {
      return;
      try
      {
        TimerTask local2 = new com/tencent/wecall/talkroom/model/f$2;
        local2.<init>(this);
        this.AJF = local2;
        this.AJH.schedule(this.AJF, 0L, AJq);
        AppMethodBeat.o(127919);
      }
      catch (Exception localException)
      {
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "startNooper: ", localException });
        AppMethodBeat.o(127919);
      }
    }
  }

  private void dTu()
  {
    AppMethodBeat.i(127920);
    try
    {
      com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "cancelHelloTimeOutTask" });
      if (this.AJG != null)
        this.AJG.cancel();
      this.AJG = null;
      AppMethodBeat.o(127920);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "cancelHelloTimeOutTask: ", localException });
    }
  }

  private void dTv()
  {
    AppMethodBeat.i(127921);
    try
    {
      com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "cancelHelloTimerTask" });
      if (this.AJF != null)
        this.AJF.cancel();
      this.AJF = null;
      AppMethodBeat.o(127921);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "cancelHelloTimerTask: ", localException });
    }
  }

  private void dTw()
  {
    AppMethodBeat.i(127922);
    try
    {
      com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "cancelTalkDurationTimerTask" });
      if (this.AJI != null)
        this.AJI.cancel();
      this.AJI = null;
      AppMethodBeat.o(127922);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "cancelTalkDurationTimerTask: ", localException });
    }
  }

  private void dTx()
  {
    AppMethodBeat.i(127928);
    dTs();
    AtomicInteger localAtomicInteger = new AtomicInteger();
    Object localObject = new AtomicInteger();
    int i = b(talk.VOICE_SAMPLERATE, talk.VOICE_FRAME_DURATION, new f.6(this, localAtomicInteger, (AtomicInteger)localObject));
    if (i <= 0)
    {
      this.AJC.Su(101);
      h.Sr(-2001);
      localObject = this.AJC;
      ((h)localObject).AKR |= 1;
      this.AJK.k(-500, null);
    }
    com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "audioAdapter startPlayer ret: ", Integer.valueOf(i) });
    AppMethodBeat.o(127928);
  }

  private void dTy()
  {
    AppMethodBeat.i(127929);
    if (this.AJI != null)
    {
      com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "refreashTalkingTime mTalkDurationTimerTask is null" });
      AppMethodBeat.o(127929);
    }
    while (true)
    {
      return;
      com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "refreashTalkingTime mTalkRoomTalkingCallBack: ", this.AJi, " mIsHoldOn: ", Boolean.valueOf(this.AJY) });
      this.AJI = new f.7(this);
      this.AJJ.scheduleAtFixedRate(this.AJI, 1000L, 1000L);
      AppMethodBeat.o(127929);
    }
  }

  private void dTz()
  {
    AppMethodBeat.i(127934);
    this.mHandler.removeCallbacks(this.AKc);
    this.AKb = null;
    AppMethodBeat.o(127934);
  }

  private boolean eT(String paramString, int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(127895);
    com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "cancelCreateTalkRoom clientGroupId: ", paramString });
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(127895);
    while (true)
    {
      return bool;
      com.tencent.wecall.talkroom.a.c localc = new com.tencent.wecall.talkroom.a.c(paramString, paramInt, this.AlR);
      bool = com.tencent.pb.common.b.e.dPu().a(localc);
      this.AJC.aa(new String[] { "cancel", "req", String.valueOf(bool), String.valueOf(this.state) });
      a(paramString, this.nCF, this.sZg, true);
      com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "cancelCreateTalkRoom ret: ", Boolean.valueOf(bool) });
      AppMethodBeat.o(127895);
    }
  }

  static String[] fG(List<String> paramList)
  {
    AppMethodBeat.i(127889);
    if ((paramList != null) && (paramList.size() > 0))
    {
      String[] arrayOfString = new String[paramList.size()];
      paramList = paramList.iterator();
      for (int i = 0; paramList.hasNext(); i++)
        arrayOfString[i] = ((String)paramList.next());
      AppMethodBeat.o(127889);
      paramList = arrayOfString;
    }
    while (true)
    {
      return paramList;
      paramList = new String[0];
      AppMethodBeat.o(127889);
    }
  }

  private void l(String paramString, int paramInt, long paramLong)
  {
    AppMethodBeat.i(127932);
    try
    {
      String str = c.dTg().k(paramString, paramInt, paramLong);
      com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "addCallLog groupId: ", paramString, " mIsOutCall: ", Boolean.valueOf(this.sRm), " mTalkDuration: ", Integer.valueOf(this.AJv), " msgKey: ", str });
      AppMethodBeat.o(127932);
      return;
    }
    catch (Throwable paramString)
    {
      while (true)
      {
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handleRoomExit: ", paramString });
        AppMethodBeat.o(127932);
      }
    }
  }

  public final com.tencent.pb.talkroom.sdk.f D(int[] paramArrayOfInt)
  {
    AppMethodBeat.i(127905);
    com.tencent.pb.talkroom.sdk.f localf = new com.tencent.pb.talkroom.sdk.f();
    Object localObject1 = localf;
    if (this.nME)
    {
      localObject1 = localf;
      if (this.AJD == null);
    }
    try
    {
      com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "receiveVideo" });
      localObject2 = this.AJD;
      localObject1 = new com/tencent/pb/talkroom/sdk/f;
      ((com.tencent.pb.talkroom.sdk.f)localObject1).<init>();
      if ((paramArrayOfInt == null) || (((b)localObject2).AIV == null))
      {
        com.tencent.pb.common.c.c.w("simon:TalkRoomContext", new Object[] { "steve:receiveVideo null, imgBuffer:", paramArrayOfInt, ", engine:", ((b)localObject2).AIV });
        paramArrayOfInt = (int[])localObject1;
        com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "receiveVideo finished, ", Boolean.valueOf(this.nME), " decInfo: ", paramArrayOfInt, " engine: ", this.AJD });
        localObject1 = paramArrayOfInt;
        AppMethodBeat.o(127905);
        return localObject1;
      }
      ((com.tencent.pb.talkroom.sdk.f)localObject1).ret = ((b)localObject2).AIV.videoDecode(paramArrayOfInt);
      ((com.tencent.pb.talkroom.sdk.f)localObject1).Aqj = paramArrayOfInt;
      ((com.tencent.pb.talkroom.sdk.f)localObject1).Aqk = ((b)localObject2).AIV.field_remoteImgLength;
      ((com.tencent.pb.talkroom.sdk.f)localObject1).Aql = ((b)localObject2).AIV.field_remoteImgWidth;
      ((com.tencent.pb.talkroom.sdk.f)localObject1).Aqm = ((b)localObject2).AIV.field_remoteImgHeight;
      ((com.tencent.pb.talkroom.sdk.f)localObject1).Aqn = (((b)localObject2).AIV.field_remoteImgChannel & 0x3FFF);
      localObject3 = c.dTg();
      localObject2 = a.dSR().neq;
      i = ((com.tencent.pb.talkroom.sdk.f)localObject1).Aqn;
      if (TextUtils.isEmpty((CharSequence)localObject2))
        com.tencent.pb.common.c.c.w("TalkRoomManager", new Object[] { "getUsrNameByMemberId groupId is null memberId: ", Integer.valueOf(i) });
      while (true)
      {
        localObject2 = "";
        ((com.tencent.pb.talkroom.sdk.f)localObject1).Aqh = ((String)localObject2);
        if (paramArrayOfInt != null)
          break label543;
        i = 0;
        com.tencent.pb.common.c.c.d("simon:TalkRoomContext", new Object[] { "steve:receiveVideo imgBuffer size:", Integer.valueOf(i), " MultiTalkVideoDecodeInfo: ", localObject1 });
        paramArrayOfInt = (int[])localObject1;
        break;
        localObject3 = ((c)localObject3).auE((String)localObject2);
        if (localObject3 != null)
          break label426;
        com.tencent.pb.common.c.c.w("TalkRoomManager", new Object[] { "getUsrNameByMemberId talkRoom is null groupId: ", localObject2, " memberId: ", Integer.valueOf(i) });
      }
    }
    catch (Exception paramArrayOfInt)
    {
      while (true)
      {
        Object localObject2;
        int i;
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "receiveVideo error: ", paramArrayOfInt });
        paramArrayOfInt = localf;
        continue;
        label426: Object localObject3 = ((TalkRoom)localObject3).dTb().iterator();
        a.av localav;
        do
        {
          if (!((Iterator)localObject3).hasNext())
            break;
          localav = (a.av)((Iterator)localObject3).next();
        }
        while ((localav == null) || (localav.kyZ != i));
        com.tencent.pb.common.c.c.d("TalkRoomManager", new Object[] { "getUsrNameByMemberId wxUserName:", localav.Aop, " groupId: ", localObject2, " memberId: ", Integer.valueOf(i) });
        if (localav.Aop != null)
        {
          localObject2 = localav.Aop;
          continue;
          label543: i = paramArrayOfInt.length;
        }
      }
    }
  }

  public final int a(byte[] paramArrayOfByte, short paramShort, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(127903);
    int i = -1;
    int j = i;
    if (this.nME)
    {
      j = i;
      if (this.AJD == null);
    }
    try
    {
      com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "sendVideo ", Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      b localb = this.AJD;
      if ((paramArrayOfByte == null) || (localb.AIV == null))
        com.tencent.pb.common.c.c.w("simon:TalkRoomContext", new Object[] { "steve:sendVideo null, buffer:", paramArrayOfByte, ", engine:", localb.AIV });
      for (paramInt1 = -1; ; paramInt1 = localb.AIV.SendVideo(paramArrayOfByte, paramShort, paramInt1, paramInt2, paramInt3, paramInt4))
      {
        com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "sendVideo finished, ", Boolean.valueOf(this.nME), " ret: ", Integer.valueOf(paramInt1), " engine: ", this.AJD });
        j = paramInt1;
        AppMethodBeat.o(127903);
        return j;
      }
    }
    catch (Exception paramArrayOfByte)
    {
      while (true)
      {
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "sendVideo error: ", paramArrayOfByte });
        paramInt1 = -1;
      }
    }
  }

  public final com.tencent.pb.talkroom.sdk.g a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(127904);
    com.tencent.pb.talkroom.sdk.g localg = new com.tencent.pb.talkroom.sdk.g();
    if ((this.nME) && (this.AJD != null));
    while (true)
    {
      try
      {
        com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "videoTrans ", Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
        b localb = this.AJD;
        if ((paramArrayOfByte == null) || (localb.AIV == null))
        {
          com.tencent.pb.common.c.c.w("simon:TalkRoomContext", new Object[] { "steve:videoTrans null, recordData:", paramArrayOfByte, ", engine:", localb.AIV });
          paramArrayOfByte = null;
          com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "videoTrans finished, ", Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), Boolean.valueOf(this.nME), " multiTalkVideoRGBinfo: ", paramArrayOfByte, " engine: ", this.AJD });
          AppMethodBeat.o(127904);
          return paramArrayOfByte;
        }
        paramInt1 = localb.AIV.videoTrans(paramArrayOfByte, paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt);
        paramArrayOfByte = new com/tencent/pb/talkroom/sdk/g;
        paramArrayOfByte.<init>();
        paramArrayOfByte.Aqo = paramArrayOfInt;
        paramArrayOfByte.Aqp = localb.AIV.field_localImgWidth;
        paramArrayOfByte.Aqq = localb.AIV.field_localImgHeight;
        paramArrayOfByte.ret = paramInt1;
        continue;
      }
      catch (Exception paramArrayOfByte)
      {
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "videoTrans error: ", paramArrayOfByte });
      }
      paramArrayOfByte = localg;
    }
  }

  public final f.b a(String paramString1, int paramInt1, long paramLong, int paramInt2, int paramInt3, String paramString2)
  {
    AppMethodBeat.i(127890);
    com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "enterTalkRoom", paramString1, paramString2, Integer.valueOf(this.nCF), Integer.valueOf(paramInt1), Long.valueOf(this.sZg), Long.valueOf(paramLong), Integer.valueOf(paramInt3), "needConfirm", Boolean.FALSE });
    if (!com.tencent.pb.a.a.a.dPN())
    {
      com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "enterTalkRoom isAuthed: ", Boolean.valueOf(com.tencent.pb.a.a.a.dPN()), " isBindMobile: ", Boolean.valueOf(com.tencent.pb.a.a.a.dPO()) });
      h.a(paramString1, "", this.nCF, this.sZg, new String[] { "enter", "req", "false", String.valueOf(paramInt3), "noAuth" });
      paramString1 = f.b.AKy;
      AppMethodBeat.o(127890);
    }
    while (true)
    {
      return paramString1;
      com.tencent.pb.common.b.h.isNetworkConnected();
      if ((So(paramInt3)) && (paramInt3 != 100) && (cIJ()))
      {
        h.a(paramString1, "", this.nCF, this.sZg, new String[] { "enter", "req", "false", String.valueOf(paramInt3), "isBusy" });
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "enterTalkRoom isBusy" });
        paramString1 = f.b.AKC;
        AppMethodBeat.o(127890);
      }
      else if (!bW(paramInt3, paramString1))
      {
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "exitTalkRoom enterTalkRoom isValidEnterState is false enterType: ", Integer.valueOf(paramInt3), " state: ", Integer.valueOf(this.state) });
        h.a(paramString1, "", this.nCF, this.sZg, new String[] { "enter", "req", "false", String.valueOf(paramInt3), "isNotValidEnterState" });
        paramString1 = f.b.AKD;
        AppMethodBeat.o(127890);
      }
      else
      {
        if (!TextUtils.isEmpty(paramString1))
          break;
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "exitTalkRoom enterTalkRoom groupId is null" });
        h.a(paramString1, "", this.nCF, this.sZg, new String[] { "enter", "req", "false", String.valueOf(paramInt3), "groupIdnull" });
        paramString1 = f.b.AKE;
        AppMethodBeat.o(127890);
      }
    }
    if (So(paramInt3))
    {
      this.AJC.reset();
      ru(false);
    }
    dTp();
    if (!cEA())
    {
      com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "exitTalkRoom enterTalkRoom initEngine fail" });
      if (So(paramInt3))
      {
        h.a(paramString1, "", this.nCF, this.sZg, new String[] { "enter", "req", "false", "initEnginefail" });
        ru(false);
      }
      while (true)
      {
        paramString1 = f.b.AKG;
        AppMethodBeat.o(127890);
        break;
        this.AJC.aa(new String[] { "enter", "req", "false", "initEnginefail" });
      }
    }
    this.neq = paramString1;
    Object localObject;
    int i;
    label689: long l;
    label703: label709: boolean bool;
    if (!So(paramInt3))
    {
      localObject = auM(paramString1);
      if (localObject == null)
      {
        i = 0;
        this.nCF = i;
        if (localObject != null)
          break label874;
        l = 0L;
        this.sZg = l;
        this.AJO = paramString1;
        this.AlR = paramInt2;
        setState(3);
        if (!So(paramInt3))
          break label897;
        bool = true;
        label736: this.sRm = bool;
        if (this.sRm)
          this.AJC.dTC();
        if ((!this.sRm) || (c.dTg().cp(this.neq, true)))
          break label903;
        localObject = new f.c(this);
        ((f.c)localObject).groupId = paramString1;
        ((f.c)localObject).nwu = paramInt1;
        ((f.c)localObject).nwv = paramLong;
        ((f.c)localObject).AmJ = paramInt3;
        ((f.c)localObject).AmC = paramInt2;
        ((f.c)localObject).AKI = paramString2;
        paramString1 = Message.obtain();
        paramString1.what = 3;
        paramString1.obj = localObject;
        this.mHandler.sendMessageDelayed(paramString1, 0L);
      }
    }
    while (true)
    {
      paramString1 = f.b.AKx;
      AppMethodBeat.o(127890);
      break;
      i = ((f.e)localObject).nwu;
      break label689;
      label874: l = ((f.e)localObject).nwv;
      break label703;
      this.nCF = paramInt1;
      this.sZg = paramLong;
      break label709;
      label897: bool = false;
      break label736;
      label903: b(paramString1, this.nCF, this.sZg, paramInt2, paramInt3, paramString2);
    }
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.pb.common.b.d paramd)
  {
    AppMethodBeat.i(127902);
    int i;
    if (paramd != null)
    {
      paramString = Integer.valueOf(paramd.getType());
      com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "CLTNOT onNetSceneEnd errCode:", Integer.valueOf(paramInt2), " errType: ", Integer.valueOf(paramInt1), " scene.getType(): ", paramString });
      if ((paramInt1 == 1) || (paramInt1 == 2))
      {
        paramString = com.tencent.pb.common.c.b.I(new Integer[] { Integer.valueOf(201), Integer.valueOf(-1004), Integer.valueOf(202), Integer.valueOf(-1107), Integer.valueOf(203), Integer.valueOf(-1205), Integer.valueOf(204), Integer.valueOf(-1304), Integer.valueOf(205), Integer.valueOf(-1403), Integer.valueOf(207), Integer.valueOf(-1502), Integer.valueOf(209), Integer.valueOf(-1512), Integer.valueOf(206), Integer.valueOf(-1522), Integer.valueOf(208), Integer.valueOf(-1532), Integer.valueOf(210), Integer.valueOf(-1542) });
        i = paramd.getType();
        if (paramString.containsKey(Integer.valueOf(i)))
          h.Sq(((Integer)paramString.get(Integer.valueOf(i))).intValue());
      }
      if (paramInt2 != -1)
        break label1135;
    }
    while (true)
    {
      try
      {
        if (paramd.getType() == 201)
        {
          paramString = (com.tencent.wecall.talkroom.a.d)paramd;
          if (com.tencent.pb.common.c.g.iA(this.AJu, paramString.AJu))
          {
            this.AJC.Su(301);
            this.AJC.aa(new String[] { "create", "resp", "-1", String.valueOf(this.state) });
            eT(paramString.AJu, 1001);
            if (!paramString.ALr)
              this.AHP.c("TOPIC_ASYNC_CREATE_ROOM_DONE", 0, null);
            this.AJK.k(-100, null);
          }
          AppMethodBeat.o(127902);
          return;
          paramString = "";
          break;
        }
        if (paramd.getType() == 209)
        {
          paramString = (com.tencent.wecall.talkroom.a.g)paramd;
          this.AJK.eS(paramString.neq, paramInt2);
          AppMethodBeat.o(127902);
          continue;
        }
      }
      catch (Exception paramString)
      {
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "cancelCreateTalkRoom: ", paramString });
        AppMethodBeat.o(127902);
        continue;
        if (paramd.getType() == 206)
        {
          paramString = (com.tencent.wecall.talkroom.a.a)paramd;
          if (!b(paramString.neq, paramString.nCF, paramString.sZg, false))
            h.a(paramString.neq, paramString.nCF, paramString.sZg, new String[] { "ack", "resp", "-1", String.valueOf(this.state) });
          this.AJK.a(paramString.ALq, c.dTg().auL(paramString.neq));
          AppMethodBeat.o(127902);
          continue;
        }
        if (paramd.getType() == 204)
        {
          paramString = (com.tencent.wecall.talkroom.a.b)paramd;
          if (b(paramString.neq, paramString.nCF, paramString.sZg, false))
          {
            this.AJC.aa(new String[] { "add", "resp", "-1", String.valueOf(this.state) });
            this.AJK.k(-300, null);
          }
          AppMethodBeat.o(127902);
          continue;
        }
        if (paramd.getType() == 202)
        {
          paramString = (com.tencent.wecall.talkroom.a.e)paramd;
          if ((b(paramString.neq, paramString.nCF, paramString.sZg, So(paramString.ALs))) && (this.state == 3))
          {
            this.AJC.Su(302);
            this.AJK.k(-200, null);
          }
          AppMethodBeat.o(127902);
          continue;
        }
        if (paramd.getType() == 212)
        {
          this.AJK.fF(null);
          AppMethodBeat.o(127902);
          continue;
        }
        if (paramd.getType() == 213)
        {
          if (com.tencent.pb.common.c.g.equals(((com.tencent.wecall.talkroom.a.j)paramd).neq, this.neq))
          {
            this.AJC.aa(new String[] { "sendmsg", "resp", "-1", String.valueOf(this.state) });
            this.AJK.k(-700, null);
          }
          AppMethodBeat.o(127902);
          continue;
        }
        if (paramd.getType() == 211)
        {
          paramString = (com.tencent.wecall.talkroom.a.h)paramd;
          if (b(paramString.groupId, paramString.nwu, paramString.nwv, false))
            this.AJC.aa(new String[] { "redirect", "resp", "-1", String.valueOf(this.state) });
          AppMethodBeat.o(127902);
          continue;
        }
        if (paramd.getType() == 214)
        {
          paramString = (l)paramd;
          if (b(paramString.neq, paramString.nCF, paramString.sZg, false))
            this.AJK.k(-800, null);
          AppMethodBeat.o(127902);
          continue;
        }
        if (paramd.getType() == 800)
        {
          paramString = (com.tencent.wecall.talkroom.a.k)paramd;
          if (b(paramString.neq, paramString.nCF, paramString.sZg, false))
            this.AJK.k(-1600, null);
        }
        AppMethodBeat.o(127902);
        continue;
      }
      label1135: Object localObject1;
      label1228: Object localObject2;
      if (paramd.getType() == 201)
      {
        localObject1 = (com.tencent.wecall.talkroom.a.d)paramd;
        if ((localObject1 != null) && (((com.tencent.pb.common.b.d)localObject1).AlO != null))
        {
          paramString = (a.z)((com.tencent.pb.common.b.d)localObject1).AlO;
          com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handleCreateVoiceGroupEnd errCode: ", Integer.valueOf(paramInt2), Integer.valueOf(((com.tencent.wecall.talkroom.a.d)localObject1).mType), ((com.tencent.wecall.talkroom.a.d)localObject1).AJu });
          if (((com.tencent.wecall.talkroom.a.d)localObject1).ALr)
            break label3001;
          i = 1;
          localObject2 = com.tencent.pb.common.c.b.I(new Integer[] { Integer.valueOf(14000), Integer.valueOf(-1001), Integer.valueOf(14001), Integer.valueOf(-1002), Integer.valueOf(14002), Integer.valueOf(-1009) });
          if (((Map)localObject2).containsKey(Integer.valueOf(paramInt2)))
            h.Sq(((Integer)((Map)localObject2).get(Integer.valueOf(paramInt2))).intValue());
          if (paramInt2 != 14002)
          {
            AJj = null;
            if (paramInt2 == 0)
              break label3268;
            if (com.tencent.pb.common.c.g.iA(this.AJu, ((com.tencent.wecall.talkroom.a.d)localObject1).AJu))
              break label3007;
            com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handleCreateVoiceGroupEnd mClientGroupId is not same mClientGroupId: ", this.AJu, " createScene.mClientGroupId: ", ((com.tencent.wecall.talkroom.a.d)localObject1).AJu, " errCode: ", Integer.valueOf(paramInt2) });
            if (i != 0)
              this.AHP.c("TOPIC_ASYNC_CREATE_ROOM_DONE", 0, null);
          }
        }
      }
      label1424: if (paramd.getType() == 202)
      {
        paramString = (com.tencent.wecall.talkroom.a.e)paramd;
        if ((paramString != null) && (paramString.AlO != null))
          a(paramInt2, (a.aa)paramString.AlO, paramString);
      }
      if (paramd.getType() == 204)
      {
        paramString = (com.tencent.wecall.talkroom.a.b)paramd;
        if ((paramString != null) && (paramString.AlO != null))
        {
          localObject2 = (a.x)paramString.AlO;
          com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handleAddVoiceGroupMemberEnd", this.neq, Integer.valueOf(this.nCF), Long.valueOf(this.sZg), " errCode: ", Integer.valueOf(paramInt2) });
          localObject1 = com.tencent.pb.common.c.b.I(new Integer[] { Integer.valueOf(14600), Integer.valueOf(-1301), Integer.valueOf(14601), Integer.valueOf(-1302), Integer.valueOf(14602), Integer.valueOf(-1303) });
          if (((Map)localObject1).containsKey(Integer.valueOf(paramInt2)))
            h.Sq(((Integer)((Map)localObject1).get(Integer.valueOf(paramInt2))).intValue());
          if (paramInt2 == 0)
            break label4193;
          if (b(paramString.neq, paramString.nCF, paramString.sZg, false))
          {
            this.AJC.aa(new String[] { "add", "resp", String.valueOf(paramInt2), String.valueOf(this.state) });
            this.AJK.k(-300, null);
          }
        }
      }
      if (paramd.getType() == 203)
      {
        paramString = (com.tencent.wecall.talkroom.a.f)paramd;
        if ((paramString != null) && (paramString.AlO != null))
        {
          com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "handleExitVoiceRoomEnd", ((a.ab)paramString.AlO).groupId, this.neq, Integer.valueOf(this.nCF), Long.valueOf(this.sZg), " errCode: ", Integer.valueOf(paramInt2) });
          paramString = com.tencent.pb.common.c.b.I(new Integer[] { Integer.valueOf(14400), Integer.valueOf(-1201), Integer.valueOf(14401), Integer.valueOf(-1202), Integer.valueOf(14402), Integer.valueOf(-1203), Integer.valueOf(14403), Integer.valueOf(-1204) });
          if (paramString.containsKey(Integer.valueOf(paramInt2)))
            h.Sq(((Integer)paramString.get(Integer.valueOf(paramInt2))).intValue());
          if (paramInt2 != 0)
            com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handleExitVoiceRoomEnd fail errCode is ", Integer.valueOf(paramInt2) });
        }
      }
      if (paramd.getType() == 205)
      {
        paramString = (m)paramd;
        if ((paramString != null) && (paramString.AlO != null))
        {
          com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "handleHelloEnd", ((a.ak)paramString.AlO).groupId, this.neq, Integer.valueOf(this.nCF), Long.valueOf(this.sZg), Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
          dTu();
          i = 0;
          if (paramInt2 != 14800)
            break label4410;
          i = -1401;
          label2092: if (i != 0)
          {
            this.AJC.Su(324);
            h.Sq(i);
          }
        }
      }
      if (paramd.getType() == 206)
      {
        paramString = (com.tencent.wecall.talkroom.a.a)paramd;
        if ((paramString != null) && (paramString.AlO != null))
        {
          com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "CLTNOT handleAckEnd errCode is ", Integer.valueOf(paramInt2), " groupId: ", paramString.neq, " roomid: ", Integer.valueOf(paramString.nCF), " roomKey: ", Long.valueOf(paramString.sZg) });
          if (paramInt2 != 18950)
            break label4425;
          if (!b(paramString.neq, paramString.nCF, paramString.sZg, false))
            h.a(paramString.neq, paramString.nCF, paramString.sZg, new String[] { "ack", "resp", String.valueOf(paramInt2), String.valueOf(this.state) });
          localObject1 = c.dTg().auL(paramString.neq);
          com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "CLTNOT handleAckEnd onMisscMultiTalk mGroupId:", paramString.neq, " multiTalkGroup: ", localObject1 });
          if (localObject1 != null)
            this.AJK.a(paramString.ALq, (MultiTalkGroup)localObject1);
        }
      }
      label2350: if (paramd.getType() == 207)
      {
        paramString = (com.tencent.wecall.talkroom.a.i)paramd;
        if ((paramString != null) && (paramString.AlO != null))
        {
          if (paramInt2 == 18100)
            h.Sq(-1501);
          com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handleRejectEnd  errCode is ", Integer.valueOf(paramInt2) });
        }
      }
      if (paramd.getType() == 208)
      {
        paramString = (com.tencent.wecall.talkroom.a.c)paramd;
        if ((paramString != null) && (paramString.AlO != null))
        {
          if (paramInt2 == 18300)
            h.Sq(-1531);
          com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handleCancelCreateEnd errCode is ", Integer.valueOf(paramInt2) });
        }
      }
      if (paramd.getType() == 209)
      {
        localObject1 = (com.tencent.wecall.talkroom.a.g)paramd;
        if ((localObject1 != null) && (((com.tencent.pb.common.b.d)localObject1).AlO != null))
        {
          paramString = (a.ac)((com.tencent.pb.common.b.d)localObject1).AlO;
          if (paramInt2 == 17900)
            h.Sq(-1511);
          if (paramInt2 == 0)
            break label4831;
          this.AJK.eS(((com.tencent.wecall.talkroom.a.g)localObject1).neq, paramInt2);
          com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handleNetSceneModifyVoiceGroupEnd fail errCode is ", Integer.valueOf(paramInt2) });
        }
      }
      if (paramd.getType() == 210)
      {
        com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "talkHoldonResp", Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        if (paramInt2 == 19100)
          h.Sq(-1541);
      }
      if (paramd.getType() == 211)
      {
        paramString = (com.tencent.wecall.talkroom.a.h)paramd;
        if (paramString != null)
          a(paramInt1, paramInt2, paramd.AlO, paramString);
      }
      if (paramd.getType() == 212)
        a(paramInt2, (a.ah)paramd.AlO);
      if (paramd.getType() == 213)
      {
        paramString = (com.tencent.wecall.talkroom.a.j)paramd;
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handleSendMsg errCode: ", Integer.valueOf(paramInt2) });
        if (paramInt2 == 0)
          break label4930;
        if (com.tencent.pb.common.c.g.equals(paramString.neq, this.neq))
        {
          this.AJC.aa(new String[] { "sendmsg", "resp", String.valueOf(paramInt2), String.valueOf(this.state) });
          this.AJK.k(-700, null);
        }
      }
      label2791: if (paramd.getType() == 214)
      {
        paramString = (a.af)paramd.AlO;
        localObject1 = (l)paramd;
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handleSwitchVideoGroup errCode: ", Integer.valueOf(paramInt2) });
        if (b(((l)localObject1).neq, ((l)localObject1).nCF, ((l)localObject1).sZg, false))
          break label5031;
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handleSwitchVideoGroup isCurrentRoom is not same", ((l)localObject1).neq, Integer.valueOf(((l)localObject1).nCF) });
      }
      while (true)
        if (paramd.getType() == 800)
        {
          paramString = (com.tencent.wecall.talkroom.a.k)paramd;
          com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handleSubscribeLargeVideo errCode: ", Integer.valueOf(paramInt2) });
          if (!b(paramString.neq, paramString.nCF, paramString.sZg, false))
          {
            com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handleSubscribeLargeVideo isCurrentRoom is not same", paramString.neq, Integer.valueOf(paramString.nCF) });
            AppMethodBeat.o(127902);
            break;
            label3001: i = 0;
            break label1228;
            label3007: if (paramInt2 != -1)
            {
              this.AJC.Su(321);
              this.AJC.aa(new String[] { "create", "resp", String.valueOf(paramInt2), String.valueOf(this.state) });
            }
            if (this.state != 1)
            {
              com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handleCreateVoiceGroupEnd state is error: ", Integer.valueOf(this.state), "  errCode: ", Integer.valueOf(paramInt2), ((com.tencent.wecall.talkroom.a.d)localObject1).AJu });
              if (i == 0)
                break label1424;
              this.AHP.c("TOPIC_ASYNC_CREATE_ROOM_DONE", 0, null);
              break label1424;
            }
            a(this.neq, this.nCF, this.sZg, true);
            if (paramInt2 == 14051)
              this.AJK.k(-900, null);
            while (true)
            {
              if (i == 0)
                break label3266;
              this.AHP.c("TOPIC_ASYNC_CREATE_ROOM_DONE", 0, null);
              break;
              if (paramInt2 == 14052)
                this.AJK.k(-1100, null);
              else if (paramInt2 == 14053)
                this.AJK.k(-1300, paramString);
              else if (paramInt2 == 14504)
                this.AJK.k(-1400, null);
              else
                this.AJK.k(-100, null);
            }
            label3266: break label1424;
            label3268: if (!com.tencent.pb.common.c.g.iA(this.AJu, paramString.Amx))
            {
              com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handleCreateVoiceGroupEnd mClientGroupId is not same mClientGroupId: ", this.AJu, " resp.clientGroupId: ", paramString.Amx, Integer.valueOf(paramString.sQS), Long.valueOf(paramString.sQT) });
              a(paramString.groupId, paramString.sQS, paramString.sQT, 110, false);
              if (i == 0)
                break label1424;
              this.AHP.c("TOPIC_ASYNC_CREATE_ROOM_DONE", 0, null);
              break label1424;
            }
            this.AJC.aa(new String[] { "create", "resp", String.valueOf(paramInt2), String.valueOf(this.state) });
            if (this.state != 1)
            {
              h.Sq(-1003);
              com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handleCreateVoiceGroupEnd state != STATE_CREATING_TAKLROOM: ", Integer.valueOf(this.state), paramString.Amx, Integer.valueOf(paramString.sQS), Long.valueOf(paramString.sQT) });
              if (i == 0)
                break label1424;
              this.AHP.c("TOPIC_ASYNC_CREATE_ROOM_DONE", 0, null);
              break label1424;
            }
            if ((paramString.AnR == null) || (paramString.AnR.length == 0))
            {
              com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handleCreateVoiceGroupEnd resp.addrlist is null,errCode: ", Integer.valueOf(paramInt2), paramString.Amx, Integer.valueOf(paramString.sQS), Long.valueOf(paramString.sQT) });
              h.Sq(-1605);
              this.AJC.tdf = 329;
              a(paramString.groupId, paramString.sQS, paramString.sQT, 116, true);
              if (i != 0)
                this.AHP.c("TOPIC_ASYNC_CREATE_ROOM_DONE", 0, null);
              this.AJK.k(-100, null);
              break label1424;
            }
            a(paramString.Amx, paramString.sQS, paramString.sQT, paramString.groupId, paramString.Amz.AoT);
            this.AJO = paramString.groupId;
            this.AlR = paramString.AmC;
            setState(4);
            a(paramString.AnR, paramString.AnY, paramString.AnZ);
            a(paramString.groupId, paramString.Amx, paramString.AmC, paramString.sQS, paramString.sQT, paramString.And, paramString.AnS, paramString.Amz, false, true);
            if (this.AJK != null)
            {
              localObject1 = this.AJK;
              localObject2 = new g.6((g)localObject1, c.dTg().auL(paramString.groupId));
              if (Looper.myLooper() != Looper.getMainLooper())
                break label3831;
              ((Runnable)localObject2).run();
            }
            byte[] arrayOfByte;
            while (true)
            {
              arrayOfByte = new byte[paramString.AnU.length];
              for (j = 0; j < paramString.AnU.length; j++)
                arrayOfByte[j] = ((byte)(byte)paramString.AnU[j]);
              label3831: ((g)localObject1).handler.post((Runnable)localObject2);
            }
            localObject1 = new int[paramString.Aod.length];
            for (int j = 0; j < paramString.Aod.length; j++)
              localObject1[j] = paramString.Aod[j];
            localObject2 = paramString.And;
            a.as localas = paramString.Ane;
            if ((paramString.AnT & 0x2) != 0);
            for (boolean bool = true; ; bool = false)
            {
              a(0, (a.av[])localObject2, localas, arrayOfByte, bool, paramString.groupId, paramString.sQS, paramString.sQT, paramString.Aoa, paramString.Aob, paramString.Aoc, (int[])localObject1, paramString.Ang);
              if (paramString.AnX != 0)
              {
                com.tencent.pb.common.c.c.i("TalkRoomService", new Object[] { "get helloFreqSeconds:" + paramString.AnX });
                AJq = paramString.AnX * 1000;
              }
              dTt();
              l(paramString.groupId, paramString.sQS, paramString.sQT);
              if (i != 0)
              {
                localObject1 = new HashMap();
                ((Map)localObject1).put("result", Boolean.TRUE);
                ((Map)localObject1).put("shareUrl", new String(paramString.Amz.AoN, Charset.forName("utf-8")));
                ((Map)localObject1).put("smsShortUrl", new String(paramString.Amz.AoO, Charset.forName("utf-8")));
                ((Map)localObject1).put("groupId", paramString.groupId);
                this.AHP.c("TOPIC_ASYNC_CREATE_ROOM_DONE", 0, localObject1);
              }
              com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handleCreateVoiceGroupEnd", this.neq, Integer.valueOf(this.nCF), Long.valueOf(this.sZg) });
              break;
            }
            label4193: if (((a.x)localObject2).AnQ == null)
            {
              i = 0;
              label4204: com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handleAddVoiceGroupMemberEnd  resp.members length: ", Integer.valueOf(i) });
              if (b(((a.x)localObject2).groupId, ((a.x)localObject2).sQS, ((a.x)localObject2).sQT, false))
                break label4367;
              com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handleAddVoiceGroupMemberEnd isCurrentRoom false resp.groupId: ", ((a.x)localObject2).groupId, this.neq, " resp.roomid: ", Integer.valueOf(((a.x)localObject2).sQS), Integer.valueOf(this.nCF) });
              h.Sq(-1308);
            }
            while (true)
            {
              a(((a.x)localObject2).groupId, null, this.AlR, ((a.x)localObject2).sQS, ((a.x)localObject2).sQT, ((a.x)localObject2).AnQ, null, ((a.x)localObject2).Amz, true, true);
              break;
              i = ((a.x)localObject2).AnQ.length;
              break label4204;
              label4367: this.AJC.aa(new String[] { "add", "resp", String.valueOf(paramInt2), String.valueOf(this.state) });
            }
            label4410: if (paramInt2 != 14801)
              break label2092;
            i = -1402;
            break label2092;
            label4425: if (paramInt2 == 0)
              this.AJr = true;
            if (!cIJ())
            {
              com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "CLTNOT handleAckEnd is working groupId: ", paramString.neq });
              this.AJC.reset();
              ru(false);
              this.AJC.aa(new String[] { "ack", "resp", String.valueOf(paramInt2), String.valueOf(this.state) });
              this.sRm = false;
              this.neq = paramString.neq;
              this.AJO = this.neq;
              this.nCF = paramString.nCF;
              this.sZg = paramString.sZg;
              this.AlR = paramString.AlR;
              setState(2);
              this.AJy = System.currentTimeMillis();
              localObject1 = this.AJC;
              com.tencent.pb.common.c.c.d(h.TAG, new Object[] { "beginNotifyTime" });
              ((h)localObject1).ALg = System.currentTimeMillis();
              if (paramInt2 == 18900)
                h.Sq(-1521);
            }
            while (!com.tencent.pb.common.c.g.equals(paramString.neq, this.neq))
            {
              localObject1 = new f.e(this);
              ((f.e)localObject1).groupId = paramString.neq;
              ((f.e)localObject1).nwu = paramString.nCF;
              ((f.e)localObject1).nwv = paramString.sZg;
              this.AJk.put(paramString.neq, localObject1);
              localObject1 = c.dTg().auL(paramString.neq);
              com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "CLTNOT handleAckEnd onInviteMultiTalk mGroupId:", paramString.neq, " multiTalkGroup: ", localObject1 });
              if (localObject1 == null)
                break label4809;
              paramString = this.AJK;
              localObject1 = new g.20(paramString, (MultiTalkGroup)localObject1);
              if (Looper.myLooper() != Looper.getMainLooper())
                break label4796;
              ((Runnable)localObject1).run();
              break;
            }
            com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "CLTNOT handleAckEnd groupid same return ", this.neq });
            break label2350;
            label4796: paramString.handler.post((Runnable)localObject1);
            break label2350;
            label4809: a(paramString.neq, paramString.nCF, paramString.sZg, false, false, false);
            break label2350;
            label4831: localObject1 = c.dTg().auE(paramString.groupId);
            if (localObject1 != null)
            {
              com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handleVoiceGroupMemberChange handleModifyVoiceGroupEnd" });
              a(paramString.groupId, null, ((TalkRoom)localObject1).dSU(), TalkRoom.dSV(), TalkRoom.cKa(), null, null, paramString.Amz, true, false);
            }
            while (true)
            {
              this.AJK.eS(paramString.groupId, 0);
              break;
              a(paramString.groupId, null, 0, 0, 0L, null, null, paramString.Amz, true, false);
            }
            label4930: if (!com.tencent.pb.common.c.g.equals(paramString.neq, this.neq))
              break label2791;
            this.AJC.aa(new String[] { "sendmsg", "resp", String.valueOf(paramInt2), String.valueOf(this.state) });
            localObject1 = this.AJK;
            paramString = new g.18((g)localObject1);
            if (Looper.myLooper() == Looper.getMainLooper())
            {
              paramString.run();
              break label2791;
            }
            ((g)localObject1).handler.post(paramString);
            break label2791;
            label5031: if (this.AJD != null)
            {
              localObject2 = new int[6];
              localObject2[0] = paramString.Aof;
              localObject2[1] = paramString.Aog;
              localObject2[2] = paramString.Aoh;
              localObject2[3] = paramString.Aoi;
              localObject2[4] = paramString.Aoj;
              localObject2[5] = paramString.Aok;
              com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "setMVSvrCfg:small:br:,WH:,FPS:,big:br:,WH:,Fps:", Integer.valueOf(localObject2[0]), Integer.valueOf(localObject2[1]), Integer.valueOf(localObject2[2]), Integer.valueOf(localObject2[3]), Integer.valueOf(localObject2[4]), Integer.valueOf(localObject2[5]) });
              localObject1 = this.AJD;
              if (((b)localObject1).AIV != null)
                break label5261;
              com.tencent.pb.common.c.c.w("simon:TalkRoomContext", new Object[] { "steve:setMVSvrCfg null, pMVSvrCfg:", localObject2, ", engine:", ((b)localObject1).AIV });
            }
            while (true)
              if (paramInt2 == 0)
              {
                localObject1 = this.AJK;
                paramString = new g.15((g)localObject1, paramString.Aof);
                if (Looper.myLooper() == Looper.getMainLooper())
                {
                  paramString.run();
                  break;
                  label5261: ((b)localObject1).AIV.setMVSvrCfg((int[])localObject2, 6);
                  continue;
                }
                ((g)localObject1).handler.post(paramString);
                break;
              }
            if (paramInt2 == 24301)
            {
              this.AJK.k(-1700, Integer.valueOf(paramString.Aom));
              continue;
            }
            this.AJK.k(-800, null);
            continue;
          }
          if (paramInt2 == 0)
          {
            paramString = this.AJK;
            paramd = new g.16(paramString);
            if (Looper.myLooper() == Looper.getMainLooper())
            {
              paramd.run();
              AppMethodBeat.o(127902);
              break;
            }
            paramString.handler.post(paramd);
            AppMethodBeat.o(127902);
            break;
          }
          this.AJK.k(-1600, null);
        }
      AppMethodBeat.o(127902);
    }
  }

  public final void a(String paramString, int paramInt, long paramLong, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    AppMethodBeat.i(127915);
    com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "closeVoiceGroup groupId: ", paramString, " mGroupId: ", this.neq, " roomId: ", Integer.valueOf(paramInt), " mRoomId: ", Integer.valueOf(this.nCF), " roomKey: ", Long.valueOf(paramLong), " mRoomKey: ", Long.valueOf(this.sZg) });
    c.dTg().auF(paramString);
    if (paramBoolean1)
      l(paramString, paramInt, paramLong);
    this.AJk.remove(paramString);
    if (b(paramString, paramInt, paramLong, false))
    {
      com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "closeVoiceGroup isCurrentRoom groupId: ", paramString, " roomId: ", Integer.valueOf(paramInt), " roomKey: ", Long.valueOf(paramLong) });
      ru(true);
      this.AJK.cq(paramString, paramBoolean2);
    }
    if (paramBoolean3)
    {
      paramString = c.dTg().auL(paramString);
      if (paramString != null)
        this.AJK.g(paramString);
    }
    AppMethodBeat.o(127915);
  }

  public final boolean a(String paramString, int paramInt1, long paramLong, int paramInt2)
  {
    AppMethodBeat.i(127893);
    com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "rejectTalkRoom groupId: ", paramString, " mGroupId: ", this.neq, " roomId: ", Integer.valueOf(paramInt1), " roomKey: ", Long.valueOf(paramLong), " reason: ", Integer.valueOf(paramInt2) });
    boolean bool;
    if (TextUtils.isEmpty(paramString))
    {
      bool = false;
      AppMethodBeat.o(127893);
      return bool;
    }
    int i;
    if (1 == paramInt2)
    {
      i = 1;
      label112: if ((3 == i) && (paramInt2 != 7))
        dTr();
      com.tencent.wecall.talkroom.a.i locali = new com.tencent.wecall.talkroom.a.i(paramString, paramInt1, paramLong, paramInt2);
      bool = com.tencent.pb.common.b.e.dPu().a(locali);
      if (!b(paramString, paramInt1, paramLong, false))
        break label253;
      this.AJC.aa(new String[] { "reject", "req", String.valueOf(bool), String.valueOf(this.state) });
    }
    while (true)
    {
      a(paramString, paramInt1, paramLong, false);
      com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "rejectTalkRoom ret: ", Boolean.valueOf(bool) });
      AppMethodBeat.o(127893);
      break;
      i = 3;
      break label112;
      label253: h.a(paramString, paramInt1, paramLong, new String[] { "reject", "req", String.valueOf(bool), String.valueOf(this.state) });
    }
  }

  public final boolean a(String paramString, int paramInt1, long paramLong, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(127896);
    com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "exitTalkRoom", paramString, Integer.valueOf(paramInt1), Long.valueOf(paramLong), Integer.valueOf(paramInt2) });
    if (TextUtils.isEmpty(paramString))
    {
      com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "exitTalkRoom: has exited" });
      paramBoolean = false;
      AppMethodBeat.o(127896);
    }
    while (true)
    {
      return paramBoolean;
      com.tencent.wecall.talkroom.a.f localf = new com.tencent.wecall.talkroom.a.f(paramString, paramInt1, paramLong, paramInt2);
      boolean bool = com.tencent.pb.common.b.e.dPu().a(localf);
      this.AJC.aa(new String[] { "exit", "req", String.valueOf(bool), String.valueOf(this.state) });
      a(paramString, paramInt1, paramLong, paramBoolean);
      com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "exitTalkRoom ret: ", Boolean.valueOf(bool) });
      AppMethodBeat.o(127896);
      paramBoolean = bool;
    }
  }

  public final f.e auM(String paramString)
  {
    AppMethodBeat.i(127917);
    paramString = (f.e)this.AJk.get(paramString);
    AppMethodBeat.o(127917);
    return paramString;
  }

  public final boolean auN(String paramString)
  {
    AppMethodBeat.i(127918);
    boolean bool;
    if ((f.e)this.AJk.get(paramString) != null)
    {
      bool = true;
      AppMethodBeat.o(127918);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(127918);
    }
  }

  public final boolean az(String paramString, int paramInt1, int paramInt2)
  {
    boolean bool = false;
    AppMethodBeat.i(127933);
    com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "finishCurrentTalk groupId: ", paramString, " rejectReason: ", Integer.valueOf(paramInt1), " exitReason: ", Integer.valueOf(paramInt2) });
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(127933);
    while (true)
    {
      return bool;
      if ((paramInt1 == 1) || (paramInt2 == 100))
        this.AJC.dTD();
      int i = this.nCF;
      long l = this.sZg;
      int j = a.dSR().state;
      if (j.auS(paramString))
      {
        this.AJC.Su(327);
        bool = a.dSR().eT(paramString, 1000);
        AppMethodBeat.o(127933);
      }
      else if (j == 2)
      {
        bool = a.dSR().a(paramString, i, l, paramInt1);
        AppMethodBeat.o(127933);
      }
      else
      {
        com.tencent.pb.common.c.b.H(new Integer[] { Integer.valueOf(102), Integer.valueOf(103), Integer.valueOf(104), Integer.valueOf(105), Integer.valueOf(106), Integer.valueOf(107), Integer.valueOf(108) }).contains(Integer.valueOf(paramInt2));
        bool = a.dSR().a(paramString, i, l, paramInt2, true);
        AppMethodBeat.o(127933);
      }
    }
  }

  final boolean cEA()
  {
    boolean bool1 = false;
    AppMethodBeat.i(127925);
    com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "initEngine", this.neq, Integer.valueOf(this.nCF), Long.valueOf(this.sZg), Integer.valueOf(this.state) });
    try
    {
      b localb = this.AJD;
      boolean bool2 = com.tencent.pb.common.a.a.Alr;
      if (!bool2)
        i = 0;
      while (true)
      {
        if (i >= 0)
          break label383;
        h.St(-3001);
        this.AJC.Su(201);
        this.AJD = null;
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "initEngine engine.protocalInit error", Integer.valueOf(i) });
        AppMethodBeat.o(127925);
        return bool1;
        String str = com.tencent.pb.common.c.d.sZj.getDir("lib", 0).getAbsolutePath();
        Object localObject = Amd;
        if (localObject == null)
          break label394;
        i = ((com.tencent.pb.talkroom.sdk.e)localObject).Lw();
        int j = k.ju(com.tencent.pb.common.c.d.sZj);
        com.tencent.pb.common.c.c.i("simon:TalkRoomContext", new Object[] { "protocalInit netType:", Integer.valueOf(j), " cpuFlag:", Integer.valueOf(i), "libPath:", str });
        if (localb.AIV == null)
        {
          i = -1;
        }
        else
        {
          localObject = localb.AIV;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          j = ((talk)localObject).init(j, i, str + "/");
          if (localb.AIV.field_capInfo != null)
            break;
          i = 0;
          com.tencent.pb.common.c.c.i("simon:TalkRoomContext", new Object[] { "protocalInit", Integer.valueOf(j), "field_capInfo length: ", Integer.valueOf(i) });
          i = j;
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "initEngine", localException });
        int i = -99999;
        continue;
        i = localException.AIV.field_capInfo.length;
        continue;
        label383: AppMethodBeat.o(127925);
        bool1 = true;
        continue;
        label394: i = 0;
      }
    }
  }

  public final boolean cIJ()
  {
    boolean bool = true;
    AppMethodBeat.i(127916);
    com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "state: ", Integer.valueOf(this.state) });
    if (this.state != 0)
      AppMethodBeat.o(127916);
    while (true)
    {
      return bool;
      AppMethodBeat.o(127916);
      bool = false;
    }
  }

  public final int ct(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(127913);
    Object localObject1;
    int i;
    long l;
    try
    {
      localObject1 = new com/tencent/pb/common/b/a/a$p;
      ((a.p)localObject1).<init>();
      paramArrayOfByte = (a.p)com.google.a.a.e.a((com.google.a.a.e)localObject1, paramArrayOfByte, paramArrayOfByte.length);
      if (paramArrayOfByte == null)
        if ((!TextUtils.isEmpty(this.neq)) || (!TextUtils.isEmpty(this.AJu)))
        {
          this.AJC.aa(new String[] { "notify", "pasrefail" });
          com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "CLTNOT onVoiceGroupChange groupChg null" });
          i = -2;
          AppMethodBeat.o(127913);
          return i;
        }
    }
    catch (Exception paramArrayOfByte)
    {
      while (true)
      {
        h.Sq(-1601);
        paramArrayOfByte = null;
        continue;
        h.a(this.nCF, this.sZg, new String[] { "notify", "pasrefail" });
      }
      com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "CLTNOT onVoiceGroupChange", this.neq, Integer.valueOf(this.nCF), Long.valueOf(this.sZg), Long.valueOf(paramArrayOfByte.cvx), Integer.valueOf(paramArrayOfByte.Anb) });
      l = paramArrayOfByte.cvx;
      if (this.AJP.contains(Long.valueOf(l)))
      {
        i = 1;
        label228: if (i == 0)
          break label375;
        com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "CLTNOT onVoiceGroupChange isMsgDouble error" });
        if (!b(paramArrayOfByte.groupId, paramArrayOfByte.sQS, paramArrayOfByte.sQT, false))
          break label331;
        this.AJC.aa(new String[] { "notify", "repeat", String.valueOf(paramArrayOfByte.Anb) });
      }
      while (true)
      {
        i = -3;
        AppMethodBeat.o(127913);
        break;
        this.AJP.add(Long.valueOf(l));
        i = 0;
        break label228;
        label331: h.a(paramArrayOfByte.groupId, paramArrayOfByte.sQS, paramArrayOfByte.sQT, new String[] { "notify", "repeat", String.valueOf(paramArrayOfByte.Anb) });
      }
      label375: if (b(paramArrayOfByte.groupId, paramArrayOfByte.sQS, paramArrayOfByte.sQT, false))
        this.AJC.aa(new String[] { "notify", "succ", String.valueOf(paramArrayOfByte.Anb) });
      if (paramArrayOfByte.Anb != 2)
        break label482;
    }
    a(paramArrayOfByte.groupId, null, paramArrayOfByte.AmC, paramArrayOfByte.sQS, paramArrayOfByte.sQT, paramArrayOfByte.And, paramArrayOfByte.Anc, paramArrayOfByte.Amz, true, true);
    while (true)
    {
      i = 0;
      AppMethodBeat.o(127913);
      break;
      label482: int j;
      if (paramArrayOfByte.Anb == 4)
      {
        a(paramArrayOfByte.groupId, null, paramArrayOfByte.AmC, paramArrayOfByte.sQS, paramArrayOfByte.sQT, paramArrayOfByte.And, paramArrayOfByte.Anc, paramArrayOfByte.Amz, true, true);
        if ((paramArrayOfByte.Anf != 0) || (paramArrayOfByte.Ang != 0))
        {
          localObject1 = this.AJD;
          j = paramArrayOfByte.Anf;
          i = paramArrayOfByte.Ang;
          if ((com.tencent.pb.common.a.a.Alr) && (((b)localObject1).AIV != null))
            ((b)localObject1).AIV.SetAVEncryptType(j, i);
        }
      }
      else if (paramArrayOfByte.Anb == 16)
      {
        a(paramArrayOfByte.groupId, null, paramArrayOfByte.AmC, paramArrayOfByte.sQS, paramArrayOfByte.sQT, paramArrayOfByte.And, paramArrayOfByte.Anc, paramArrayOfByte.Amz, true, false);
      }
      else if (paramArrayOfByte.Anb == 1)
      {
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handlerCreateGroupChange groupChg.groupId: ", paramArrayOfByte.groupId, " roomId: ", Integer.valueOf(paramArrayOfByte.sQS), " roomkey: ", Long.valueOf(paramArrayOfByte.sQT) });
        if (com.tencent.pb.a.a.a.dPN())
        {
          com.tencent.pb.a.a.a.dPO();
          if ((cIJ()) && (com.tencent.pb.common.c.g.equals(paramArrayOfByte.groupId, this.neq)))
            com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "CLTNOT handlerCreateGroupChange return is same groupId: ", this.neq });
        }
        else
        {
          com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "CLTNOT handlerCreateGroupChange isAuthed is false" });
          continue;
          a(paramArrayOfByte.groupId, null, paramArrayOfByte.AmC, paramArrayOfByte.sQS, paramArrayOfByte.sQT, paramArrayOfByte.And, paramArrayOfByte.Anc, paramArrayOfByte.Amz, false, true);
          localObject1 = paramArrayOfByte.groupId;
          j = paramArrayOfByte.sQS;
          l = paramArrayOfByte.sQT;
          int k = paramArrayOfByte.AmC;
          i = paramArrayOfByte.Anh;
          if (TextUtils.isEmpty((CharSequence)localObject1))
            com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "CLTNOT ackTalkRoom groupId is null" });
          while (true)
          {
            com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handlerCreateGroupChange start ui" });
            break;
            paramArrayOfByte = new com.tencent.wecall.talkroom.a.a((String)localObject1, j, l, k, i);
            com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "CLTNOT ackTalkRoom groupId: ", localObject1, Integer.valueOf(j), Long.valueOf(l), Integer.valueOf(i), Boolean.valueOf(com.tencent.pb.common.b.e.dPu().a(paramArrayOfByte)) });
          }
        }
      }
      else if (paramArrayOfByte.Anb == 8)
      {
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handleCancelCreateVoiceGroupChange groupChg.groupId: ", paramArrayOfByte.groupId, " mGroupId: ", this.neq });
        if (b(paramArrayOfByte.groupId, paramArrayOfByte.sQS, paramArrayOfByte.sQT, false))
        {
          a(paramArrayOfByte.groupId, null, paramArrayOfByte.AmC, paramArrayOfByte.sQS, paramArrayOfByte.sQT, paramArrayOfByte.And, paramArrayOfByte.Anc, paramArrayOfByte.Amz, true, false);
          a(paramArrayOfByte.groupId, paramArrayOfByte.sQS, paramArrayOfByte.sQT, false, false, true);
        }
        else
        {
          a(paramArrayOfByte.groupId, null, paramArrayOfByte.AmC, paramArrayOfByte.sQS, paramArrayOfByte.sQT, paramArrayOfByte.And, paramArrayOfByte.Anc, paramArrayOfByte.Amz, true, false);
        }
      }
      else
      {
        Object localObject3;
        if (paramArrayOfByte.Anb == 128)
        {
          localObject1 = paramArrayOfByte.groupId;
          localObject3 = this.neq;
          if (paramArrayOfByte.Ani == null);
          for (i = 0; ; i = paramArrayOfByte.Ani.length)
          {
            com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "handleMemberWhisper groupChg.groupChg.groupId: ", localObject1, " mGroupId: ", localObject3, " groupChg.whisperBuf size: ", Integer.valueOf(i) });
            localObject1 = this.AJK;
            paramArrayOfByte = new g.17((g)localObject1, paramArrayOfByte.groupId, paramArrayOfByte.Ani);
            if (Looper.myLooper() != Looper.getMainLooper())
              break label1233;
            paramArrayOfByte.run();
            break;
          }
          label1233: ((g)localObject1).handler.post(paramArrayOfByte);
        }
        else
        {
          Object localObject2;
          if (paramArrayOfByte.Anb == 256)
          {
            if (!b(paramArrayOfByte.groupId, paramArrayOfByte.sQS, paramArrayOfByte.sQT, false))
              com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handleVideoMember is not same room ", paramArrayOfByte.groupId, Integer.valueOf(paramArrayOfByte.sQS) });
            else if (paramArrayOfByte.Ani == null)
              com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handleVideoMember whisperBuf is null", paramArrayOfByte.groupId, Integer.valueOf(paramArrayOfByte.sQS) });
            else
              try
              {
                localObject3 = paramArrayOfByte.Ani;
                localObject1 = new com/tencent/pb/common/b/a/a$r;
                ((a.r)localObject1).<init>();
                localObject1 = (a.r)com.google.a.a.e.a((com.google.a.a.e)localObject1, (byte[])localObject3, localObject3.length);
                if ((localObject1 == null) || (((a.r)localObject1).Anm == null))
                  com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handleVideoMember notify is null", paramArrayOfByte.groupId, Integer.valueOf(paramArrayOfByte.sQS) });
              }
              catch (com.google.a.a.d locald1)
              {
                while (true)
                {
                  com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handleVideoMember ", locald1 });
                  localObject2 = null;
                }
                paramArrayOfByte = new ArrayList();
                for (localObject3 : ((a.r)localObject2).Anm)
                  if (localObject3 != null)
                    paramArrayOfByte.add(localObject3);
                com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "handleVideoMember groupid: ", this.neq, " roomId: ", Integer.valueOf(this.nCF), " videoUserNames: ", paramArrayOfByte });
                localObject2 = this.AJK;
                paramArrayOfByte = new g.11((g)localObject2, paramArrayOfByte);
                if (Looper.myLooper() == Looper.getMainLooper())
                {
                  paramArrayOfByte.run();
                  continue;
                }
                ((g)localObject2).handler.post(paramArrayOfByte);
              }
          }
          else if (paramArrayOfByte.Anb == 1024)
          {
            if (!b(paramArrayOfByte.groupId, paramArrayOfByte.sQS, paramArrayOfByte.sQT, false))
            {
              com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handleOtherDevice is not same room ", paramArrayOfByte.groupId, Integer.valueOf(paramArrayOfByte.sQS) });
            }
            else if ((this.state != 3) && (this.state != 4))
            {
              a(paramArrayOfByte.groupId, paramArrayOfByte.sQS, paramArrayOfByte.sQT, 1);
              this.AJK.k(-1400, null);
            }
          }
          else if (paramArrayOfByte.Anb == 512)
            if (!b(paramArrayOfByte.groupId, paramArrayOfByte.sQS, paramArrayOfByte.sQT, false))
              com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handleVideoSubscribes is not same room ", paramArrayOfByte.groupId, Integer.valueOf(paramArrayOfByte.sQS) });
            else if (paramArrayOfByte.Ani == null)
              com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handleVideoSubscribes whisperBuf is null", paramArrayOfByte.groupId, Integer.valueOf(paramArrayOfByte.sQS) });
            else
              try
              {
                localObject2 = paramArrayOfByte.Ani;
                localObject3 = new com/tencent/pb/common/b/a/a$q;
                ((a.q)localObject3).<init>();
                localObject2 = (a.q)com.google.a.a.e.a((com.google.a.a.e)localObject3, (byte[])localObject2, localObject2.length);
                if (localObject2 == null)
                  com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handleVideoMember notify is null", paramArrayOfByte.groupId, Integer.valueOf(paramArrayOfByte.sQS) });
              }
              catch (com.google.a.a.d locald2)
              {
                while (true)
                {
                  com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handleVideoSubscribes ", locald2 });
                  local1 = null;
                }
                paramArrayOfByte = this.AJK;
                g.1 local1 = new g.1(paramArrayOfByte, local1.Anl);
                if (Looper.myLooper() == Looper.getMainLooper())
                  local1.run();
                else
                  paramArrayOfByte.handler.post(local1);
              }
        }
      }
    }
  }

  final boolean dTp()
  {
    AppMethodBeat.i(127884);
    com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "initService" });
    com.tencent.pb.talkroom.sdk.e locale = Amd;
    if (locale != null)
      locale.bRj();
    this.AJD = new b();
    this.AJO = this.neq;
    this.AJE = new f.1(this);
    AppMethodBeat.o(127884);
    return true;
  }

  public final void dTq()
  {
    AppMethodBeat.i(127886);
    try
    {
      com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "stopHoldeOnPusher " });
      if (this.AKa != null)
        this.mHandler.removeCallbacks(this.AKa);
      AppMethodBeat.o(127886);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { " stopTimer: ", localThrowable });
        AppMethodBeat.o(127886);
      }
    }
  }

  public final void eR(String paramString, int paramInt)
  {
    AppMethodBeat.i(127936);
    if ((com.tencent.pb.common.c.g.equals("GLOBAL_TOPIC_NETWORK_CHANGE", paramString)) && (cIJ()) && ((this.nME) || (this.AJs)))
      switch (paramInt)
      {
      default:
      case 21:
      case 33:
      }
    while (true)
    {
      AppMethodBeat.o(127936);
      while (true)
      {
        return;
        switch (k.ju(com.tencent.pb.common.c.d.sZj))
        {
        default:
        case 4:
        }
        for (this.AJM = false; ; this.AJM = true)
        {
          if ((this.nCF != 0) && (this.sZg != 0L))
            break label150;
          com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "sendRedirect mRoomId valid(session ended)" });
          AppMethodBeat.o(127936);
          break;
        }
        label150: com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "sendRedirect", this.neq, Integer.valueOf(this.nCF) });
        this.AJC.dTE();
        paramString = new com.tencent.wecall.talkroom.a.h(this.neq, this.nCF, this.sZg, c.dTg().auG(this.neq));
        boolean bool = com.tencent.pb.common.b.e.dPu().a(paramString);
        this.AJC.aa(new String[] { "redirect", "req", String.valueOf(bool), String.valueOf(this.state) });
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "sendRedirect ret: ", Boolean.valueOf(bool) });
        AppMethodBeat.o(127936);
        continue;
        paramString = this.AJD;
        paramInt = k.ju(com.tencent.pb.common.c.d.sZj);
        if ((com.tencent.pb.common.a.a.Alr) && (paramString.AIV != null))
          break;
        AppMethodBeat.o(127936);
      }
      paramString.AIV.onNetworkChange(paramInt);
    }
  }

  public final boolean handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(127882);
    switch (paramMessage.what)
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      AppMethodBeat.o(127882);
      return true;
      paramMessage = paramMessage.obj;
      if (this.state == 4)
      {
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handlerInviteTimeOut state: ", Integer.valueOf(this.state) });
      }
      else if (!(paramMessage instanceof f.d))
      {
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handlerInviteTimeOut obj is not GroupRoomInfo" });
      }
      else
      {
        paramMessage = (f.d)paramMessage;
        if (paramMessage.neq == null)
        {
          com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handlerInviteTimeOut groupRoomInfo.mGroupId is null" });
        }
        else
        {
          com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "handlerInviteTimeOut" });
          if ((paramMessage.neq.equals(this.neq)) && (paramMessage.nCF == this.nCF) && (paramMessage.sZg == this.sZg))
          {
            h.dTG();
            this.AJC.Su(501);
            a(paramMessage.neq, paramMessage.nCF, paramMessage.sZg, 7);
            com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handlerInviteTimeOut groupRoomInfo.mGroupId: ", paramMessage.neq });
            continue;
            paramMessage = paramMessage.obj;
            if (this.state != 1)
            {
              com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handlerCreateGroup state: ", Integer.valueOf(this.state) });
            }
            else if (!(paramMessage instanceof f.a))
            {
              com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handlerCreateGroup obj is not CreateGroupObj" });
            }
            else
            {
              paramMessage = (f.a)paramMessage;
              if (com.tencent.pb.common.c.g.iA(paramMessage.groupId, this.neq))
              {
                String str1 = paramMessage.groupId;
                Object localObject1 = paramMessage.AKr;
                a.ay localay = paramMessage.AKs;
                int i = paramMessage.AmC;
                int j = paramMessage.type;
                long l = paramMessage.AKt;
                String str2 = paramMessage.AKu;
                boolean bool = paramMessage.AKv;
                String str3 = paramMessage.AKw;
                this.AJC.dTE();
                Object localObject2 = c.dTg();
                paramMessage = "";
                localObject2 = ((c)localObject2).auE(str1);
                if (localObject2 != null)
                  if (((TalkRoom)localObject2).AIT != null)
                    break label616;
                label616: for (paramMessage = ""; ; paramMessage = ((TalkRoom)localObject2).AIT.name)
                {
                  localObject1 = new com.tencent.wecall.talkroom.a.d(str1, (String[])localObject1, this.AJD.dTd(), paramMessage, localay, i, j, l, str2, bool, str3);
                  bool = com.tencent.pb.common.b.e.dPu().a((com.tencent.pb.common.b.d)localObject1);
                  this.AJC.aa(new String[] { "create", "req", String.valueOf(bool), String.valueOf(this.state) });
                  com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "sendCreateSence groupId: ", str1, " routeId:", Integer.valueOf(i), " type: ", Integer.valueOf(j), " playId: ", Long.valueOf(l), " name: ", paramMessage, " ret: ", Boolean.valueOf(bool) });
                  break;
                }
                paramMessage = paramMessage.obj;
                if (this.state != 3)
                {
                  com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handlerEnterGroup state: ", Integer.valueOf(this.state) });
                }
                else if (!(paramMessage instanceof f.c))
                {
                  com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "handlerCreateGroup obj is not CreateGroupObj" });
                }
                else
                {
                  paramMessage = (f.c)paramMessage;
                  if (b(paramMessage.groupId, paramMessage.nwu, paramMessage.nwv, false))
                  {
                    b(paramMessage.groupId, paramMessage.nwu, paramMessage.nwv, paramMessage.AmC, paramMessage.AmJ, paramMessage.AKI);
                    continue;
                    com.tencent.pb.common.c.f.dPL();
                  }
                }
              }
            }
          }
        }
      }
    }
  }

  public final void ru(boolean paramBoolean)
  {
    AppMethodBeat.i(127885);
    this.AJC.groupId = this.neq;
    this.AJC.Amx = this.AJu;
    if (com.tencent.pb.common.c.g.isEmpty(this.AJC.groupId))
      this.AJC.groupId = "";
    if (com.tencent.pb.common.c.g.isEmpty(this.AJC.Amx))
      this.AJC.Amx = "";
    this.AJC.sUl = 1;
    this.AJC.nwu = this.nCF;
    this.AJC.nwv = this.sZg;
    com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "uninitService isUpload: ", Boolean.valueOf(paramBoolean) });
    cEx();
    Km();
    int i = -99999;
    int j = i;
    if (this.AJD != null);
    try
    {
      this.AJL = this.AJD.dTf();
      j = this.AJD.Close();
      com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "uninitService mid", Integer.valueOf(j) });
      i = j;
      if (this.AJD == null);
    }
    catch (Throwable localThrowable)
    {
      try
      {
        i = this.AJD.uninitLive();
        this.AJD = null;
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "steve:uninitService set engine null!" });
        if (paramBoolean)
        {
          String str = this.AJC.dTB();
          if ((!TextUtils.isEmpty(this.AJC.groupId)) || (!TextUtils.isEmpty(this.AJC.Amx)))
          {
            h.auO(str);
            this.mHandler.removeMessages(4);
            this.mHandler.sendEmptyMessageDelayed(4, 0L);
          }
          this.AJC.reset();
          La();
        }
        com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "uninitService end error", Integer.valueOf(i) });
        AppMethodBeat.o(127885);
        return;
        localThrowable = localThrowable;
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "uninitService", localThrowable });
        j = i;
      }
      catch (Exception localException)
      {
        while (true)
        {
          com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "uninitService 2", localException });
          i = j;
        }
      }
    }
  }

  public final void rv(boolean paramBoolean)
  {
    AppMethodBeat.i(127926);
    try
    {
      EB();
      dTs();
      if (paramBoolean)
      {
        dTx();
        aDm();
      }
      com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "setRecordDevActive active: ", Boolean.valueOf(paramBoolean) });
      AppMethodBeat.o(127926);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "setRecordDevActive active: ", Boolean.valueOf(paramBoolean), localThrowable });
        AppMethodBeat.o(127926);
      }
    }
  }

  final void setState(int paramInt)
  {
    AppMethodBeat.i(127888);
    com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "setState newState: ", Integer.valueOf(paramInt) });
    if (this.state == paramInt)
      AppMethodBeat.o(127888);
    while (true)
    {
      return;
      this.state = paramInt;
      this.AJK.onStateChanged(paramInt);
      AppMethodBeat.o(127888);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.wecall.talkroom.model.f
 * JD-Core Version:    0.6.2
 */