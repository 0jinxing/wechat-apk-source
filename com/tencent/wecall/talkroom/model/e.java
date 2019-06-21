package com.tencent.wecall.talkroom.model;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.g.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.multi.talk;
import com.tencent.pb.common.system.ConnectReceiver;
import com.tencent.wecall.talkroom.a.k;
import com.tencent.wecall.talkroom.a.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class e
  implements com.tencent.pb.talkroom.sdk.d
{
  private static e AJe = null;
  private com.tencent.pb.talkroom.sdk.a AJd;
  private ConnectReceiver AJf;
  private g.a AJg;
  private final String TAG;

  private e()
  {
    AppMethodBeat.i(127841);
    this.TAG = "TalkRoomSdkApi";
    this.AJd = null;
    this.AJf = new ConnectReceiver();
    this.AJg = new e.1(this);
    AppMethodBeat.o(127841);
  }

  public static e dTl()
  {
    AppMethodBeat.i(127840);
    if (AJe == null);
    try
    {
      if (AJe == null)
      {
        locale = new com/tencent/wecall/talkroom/model/e;
        locale.<init>();
        AJe = locale;
      }
      e locale = AJe;
      AppMethodBeat.o(127840);
      return locale;
    }
    finally
    {
      AppMethodBeat.o(127840);
    }
  }

  public static void jt(Context paramContext)
  {
    AppMethodBeat.i(127842);
    com.tencent.pb.common.c.d.sZj = paramContext;
    i.dM(paramContext);
    AppMethodBeat.o(127842);
  }

  public final boolean A(String paramString1, int paramInt, String paramString2)
  {
    boolean bool = true;
    AppMethodBeat.i(127848);
    f localf = a.dSR();
    paramString2 = localf.a(paramString1, localf.nCF, localf.sZg, paramInt, 1, paramString2);
    com.tencent.pb.common.c.c.w("TalkRoomSdkApi", new Object[] { "enterMultiTalk multiTalkGroupid:", paramString1, " isAccept: ", Boolean.TRUE, " routId: ", Integer.valueOf(paramInt), " ret: ", paramString2 });
    if (paramString2 == f.b.AKx)
      AppMethodBeat.o(127848);
    while (true)
    {
      return bool;
      AppMethodBeat.o(127848);
      bool = false;
    }
  }

  public final boolean B(String paramString, List<String> paramList)
  {
    boolean bool = false;
    AppMethodBeat.i(127850);
    if (!com.tencent.pb.common.c.g.iA(paramString, a.dSR().neq))
    {
      com.tencent.pb.common.c.c.w("TalkRoomSdkApi", new Object[] { "addMultiTalkMember groupid is not same; multiTalkGroupid: ", paramString, a.dSR().neq });
      AppMethodBeat.o(127850);
      return bool;
    }
    f localf = a.dSR();
    int i = localf.nCF;
    long l = localf.sZg;
    int j;
    if (paramList == null)
    {
      j = 0;
      label80: com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "addrTalkRoomMember", paramString, Integer.valueOf(i), Long.valueOf(l), " users length: ", Integer.valueOf(j) });
      localf.AJQ = false;
      if ((!TextUtils.isEmpty(paramString)) && (paramList != null))
        break label187;
      bool = false;
    }
    while (true)
    {
      com.tencent.pb.common.c.c.w("TalkRoomSdkApi", new Object[] { "addMultiTalkMember ret: ", Boolean.valueOf(bool) });
      AppMethodBeat.o(127850);
      break;
      j = paramList.size();
      break label80;
      label187: if (!com.tencent.pb.common.b.h.isNetworkConnected())
      {
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "addTalkRoomMember isNetworkConnected is false" });
        bool = false;
      }
      else
      {
        paramList = f.fG(paramList);
        if (paramList.length <= 0)
        {
          com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "addTalkRoomMember users is null" });
          bool = false;
        }
        else
        {
          paramString = new com.tencent.wecall.talkroom.a.b(paramString, localf.nCF, localf.sZg, paramList);
          bool = com.tencent.pb.common.b.e.dPu().a(paramString);
          localf.AJC.aa(new String[] { "add", "req", String.valueOf(bool), String.valueOf(localf.state) });
        }
      }
    }
  }

  public final com.tencent.pb.talkroom.sdk.f D(int[] paramArrayOfInt)
  {
    int i = 0;
    AppMethodBeat.i(127861);
    com.tencent.pb.talkroom.sdk.f localf = a.dSR().D(paramArrayOfInt);
    if (paramArrayOfInt == null);
    while (true)
    {
      com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "receiveVideo imgBuffer size: ", Integer.valueOf(i), " MultiTalkVideoDecodeInfo: ", localf });
      AppMethodBeat.o(127861);
      return localf;
      i = paramArrayOfInt.length;
    }
  }

  public final boolean Sa(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(127851);
    f.e locale;
    int i;
    long l;
    if (!com.tencent.pb.common.c.g.iA(paramString, a.dSR().neq))
    {
      com.tencent.pb.common.c.c.w("TalkRoomSdkApi", new Object[] { "exitMultiTalk groupid is not same; multiTalkGroupid: ", paramString, a.dSR().neq });
      if (a.dSR().auN(paramString))
      {
        locale = a.dSR().auM(paramString);
        f localf = a.dSR();
        if (locale == null)
        {
          i = 0;
          if (locale != null)
            break label112;
          l = 0L;
          label84: localf.a(paramString, i, l, 1);
        }
      }
      else
      {
        AppMethodBeat.o(127851);
      }
    }
    while (true)
    {
      return bool;
      i = locale.nwu;
      break;
      label112: l = locale.nwv;
      break label84;
      i = a.dSR().nCF;
      l = a.dSR().sZg;
      bool = a.dSR().az(paramString, 1, 100);
      com.tencent.pb.common.c.c.w("TalkRoomSdkApi", new Object[] { "exitMultiTalk groupId: ", paramString, " roomId: ", Integer.valueOf(i), " roomKey: ", Long.valueOf(l) });
      AppMethodBeat.o(127851);
    }
  }

  public final boolean Sj(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(127859);
    if (!a.dSR().cIJ())
    {
      com.tencent.pb.common.c.c.w("TalkRoomSdkApi", new Object[] { "subscribeLargeVideo isWorking is false" });
      AppMethodBeat.o(127859);
    }
    while (true)
    {
      return bool;
      com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "subscribeLargeVideo ownerUserName: ", paramString });
      f localf = a.dSR();
      if (TextUtils.isEmpty(localf.neq))
      {
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "subscribeLargeVideo mGroupId null " });
        AppMethodBeat.o(127859);
      }
      else
      {
        paramString = new k(localf.neq, localf.nCF, localf.sZg, paramString);
        bool = com.tencent.pb.common.b.e.dPu().a(paramString);
        com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "subscribeLargeVideo ret: ", Boolean.valueOf(bool) });
        AppMethodBeat.o(127859);
      }
    }
  }

  public final int a(byte[] paramArrayOfByte, short paramShort, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(127860);
    int i = a.dSR().a(paramArrayOfByte, paramShort, paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramArrayOfByte == null);
    for (int j = 0; ; j = paramArrayOfByte.length)
    {
      com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "sendVideo buffer size: ", Integer.valueOf(j), " len: ", Short.valueOf(paramShort), " w: ", Integer.valueOf(paramInt1), " h: ", Integer.valueOf(paramInt2), " format: ", Integer.valueOf(paramInt3), " mode: ", Integer.valueOf(paramInt4) });
      AppMethodBeat.o(127860);
      return i;
    }
  }

  public final com.tencent.pb.talkroom.sdk.g a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    int i = 0;
    AppMethodBeat.i(127862);
    com.tencent.pb.talkroom.sdk.g localg = a.dSR().a(paramArrayOfByte, paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt);
    int j;
    if (paramArrayOfByte == null)
    {
      j = 0;
      if (paramArrayOfInt != null)
        break label144;
    }
    while (true)
    {
      com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "videoTrans recordData size: ", Integer.valueOf(j), " len: ", Integer.valueOf(paramInt1), " localImg size: ", Integer.valueOf(i), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), " multiTalkVideoRGBinfo: ", localg });
      AppMethodBeat.o(127862);
      return localg;
      j = paramArrayOfByte.length;
      break;
      label144: i = paramArrayOfInt.length;
    }
  }

  public final boolean a(com.tencent.pb.talkroom.sdk.a parama, com.tencent.pb.talkroom.sdk.e parame)
  {
    boolean bool = false;
    AppMethodBeat.i(127843);
    if (com.tencent.pb.common.c.d.sZj == null)
    {
      com.tencent.pb.common.c.c.w("TalkRoomSdkApi", new Object[] { "init fail context: ", com.tencent.pb.common.c.d.sZj });
      AppMethodBeat.o(127843);
    }
    while (true)
    {
      return bool;
      try
      {
        this.AJd = parama;
        f.a(parame);
        parama = a.dSR();
        g.a locala = this.AJg;
        parama.AJK.a(locala);
        com.tencent.pb.common.b.f.dPx().Amd = parame;
        a.dSQ();
        a.dSS();
        parama = new android/content/IntentFilter;
        parama.<init>();
        parama.setPriority(2147483647);
        parama.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        com.tencent.pb.common.c.d.sZj.registerReceiver(this.AJf, parama);
        com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "init" });
        AppMethodBeat.o(127843);
        bool = true;
      }
      catch (Exception parama)
      {
        com.tencent.pb.common.c.c.w("TalkRoomSdkApi", new Object[] { "init ", parama });
        AppMethodBeat.o(127843);
      }
    }
  }

  public final boolean a(String paramString1, int paramInt1, long paramLong, int paramInt2, String paramString2)
  {
    AppMethodBeat.i(127849);
    f.b localb = a.dSR().a(paramString1, paramInt1, paramLong, paramInt2, 100, paramString2);
    com.tencent.pb.common.c.c.w("TalkRoomSdkApi", new Object[] { "enterMultiTalk multiTalkGroupid:", paramString1, " roomId: ", Integer.valueOf(paramInt1), " roomKey: ", Long.valueOf(paramLong), " routId: ", Integer.valueOf(paramInt2), " wxGroupId: ", paramString2, " ret: ", localb });
    boolean bool;
    if (localb == f.b.AKx)
    {
      bool = true;
      AppMethodBeat.o(127849);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(127849);
    }
  }

  public final List<String> atK(String paramString)
  {
    Object localObject1 = null;
    AppMethodBeat.i(127852);
    if (!com.tencent.pb.common.c.g.iA(paramString, a.dSR().neq))
    {
      com.tencent.pb.common.c.c.w("TalkRoomSdkApi", new Object[] { "getTalkingMember groupid is not same; multiTalkGroupid: ", paramString, a.dSR().neq });
      AppMethodBeat.o(127852);
    }
    for (paramString = (String)localObject1; ; paramString = (String)localObject1)
    {
      return paramString;
      localObject2 = c.dTg().auE(paramString);
      if (localObject2 != null)
        break;
      com.tencent.pb.common.c.c.w("TalkRoomManager", new Object[] { "getTalkingMember talkroom is null: groupId: ", paramString });
      AppMethodBeat.o(127852);
    }
    localObject1 = ((TalkRoom)localObject2).dSY();
    paramString = new ArrayList();
    Object localObject2 = ((List)localObject1).iterator();
    label246: 
    while (true)
    {
      label122: Object localObject3;
      int i;
      if (((Iterator)localObject2).hasNext())
      {
        localObject1 = (d)((Iterator)localObject2).next();
        if (localObject1 != null)
        {
          localObject3 = a.dSR();
          i = ((d)localObject1).dTj();
          if (((f)localObject3).AJD != null)
          {
            localObject3 = ((f)localObject3).AJD;
            if ((!com.tencent.pb.common.a.a.Alr) || (((b)localObject3).AIV == null))
              i = 0;
          }
        }
      }
      else
      {
        while (true)
        {
          if (i == 0)
            break label246;
          paramString.add(((d)localObject1).dTi());
          break label122;
          if (((b)localObject3).AIV.GetVoiceActivity(i) == 1)
          {
            i = 1;
          }
          else
          {
            i = 0;
            continue;
            AppMethodBeat.o(127852);
            break;
            i = 0;
          }
        }
      }
    }
  }

  public final void bR(int paramInt, String paramString)
  {
    AppMethodBeat.i(127857);
    com.tencent.pb.a.a.a.QX(paramInt);
    com.tencent.pb.a.a.a.atJ(paramString);
    com.tencent.pb.common.c.c.w("TalkRoomSdkApi", new Object[] { "setWxUinAndUsrName uin: ", Integer.valueOf(paramInt), " usrname: ", paramString });
    AppMethodBeat.o(127857);
  }

  public final boolean ck(byte[] paramArrayOfByte)
  {
    boolean bool = true;
    AppMethodBeat.i(127854);
    com.tencent.pb.common.b.f.dPx();
    int i = com.tencent.pb.common.b.f.cj(paramArrayOfByte);
    com.tencent.pb.common.c.c.w("TalkRoomSdkApi", new Object[] { "handleMultiTalkNotify ret: ", Integer.valueOf(i) });
    if (i == 0)
      AppMethodBeat.o(127854);
    while (true)
    {
      return bool;
      AppMethodBeat.o(127854);
      bool = false;
    }
  }

  public final boolean dPP()
  {
    boolean bool = true;
    AppMethodBeat.i(127846);
    try
    {
      com.tencent.pb.common.c.c.dPK();
      com.tencent.pb.common.c.c.w("TalkRoomSdkApi", new Object[] { "setOpenLog: isOpenSdkLog", Boolean.TRUE, " level: ", Integer.valueOf(0) });
      AppMethodBeat.o(127846);
      return bool;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        com.tencent.pb.common.c.c.w("TalkRoomSdkApi", new Object[] { "setOpenLog: ", localThrowable });
        AppMethodBeat.o(127846);
        bool = false;
      }
    }
  }

  public final String dPQ()
  {
    AppMethodBeat.i(127856);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("client_");
    ((StringBuilder)localObject).append(com.tencent.pb.a.a.a.dPM());
    ((StringBuilder)localObject).append("_");
    ((StringBuilder)localObject).append(System.currentTimeMillis());
    localObject = ((StringBuilder)localObject).toString();
    com.tencent.pb.common.c.c.w("TalkRoomSdkApi", new Object[] { "genMultiTalkClientId clientId: ", localObject });
    AppMethodBeat.o(127856);
    return localObject;
  }

  public final boolean e(int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(127853);
    int i;
    if (paramArrayOfByte == null)
    {
      i = 0;
      com.tencent.pb.common.c.c.w("TalkRoomSdkApi", new Object[] { "handleMultiTalkResp retCode: ", Integer.valueOf(paramInt1), " seq: ", Integer.valueOf(paramInt2), " cmdId: ", Integer.valueOf(paramInt3), " data length: ", Integer.valueOf(i) });
      if (paramInt1 != 0)
        break label109;
      com.tencent.pb.common.b.f.dPx().s(paramInt2, paramArrayOfByte);
    }
    while (true)
    {
      AppMethodBeat.o(127853);
      return true;
      i = paramArrayOfByte.length;
      break;
      label109: com.tencent.pb.common.b.f localf = com.tencent.pb.common.b.f.dPx();
      paramArrayOfByte = localf.QW(paramInt2);
      if (paramArrayOfByte != null)
      {
        com.tencent.pb.common.c.c.w("NETCMD", new Object[] { "CLTRCV FAIL", Integer.valueOf(paramInt2), paramArrayOfByte.Amg, Integer.valueOf(1), Integer.valueOf(paramInt1) });
        localf.a(paramArrayOfByte, -1, null);
      }
    }
  }

  public final boolean f(String paramString1, String paramString2, List<String> paramList)
  {
    AppMethodBeat.i(127847);
    f localf = a.dSR();
    Object localObject1 = f.fG(paramList);
    int i;
    label234: boolean bool;
    if (localObject1.length > 0)
    {
      if (!TextUtils.isEmpty(null))
      {
        throw new NullPointerException();
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "createTalkRoom cliendId: ", paramString1, " voiceSingle2MultiInfo: ", null, " memeberUuids size: ", Integer.valueOf(localObject1.length), "routeId", Integer.valueOf(i), " context: ", null, " type: ", Integer.valueOf(0), " playId: ", Long.valueOf(0L), " sdkKey: ", null });
        if (com.tencent.pb.a.a.a.dPN())
          break label335;
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "createTalkRoom isAuthed: ", Boolean.valueOf(com.tencent.pb.a.a.a.dPN()), " isBindMobile: ", Boolean.valueOf(com.tencent.pb.a.a.a.dPO()) });
        h.a("", paramString1, 0, 0L, new String[] { "create", "req", "false", "noAuth" });
      }
    }
    else
    {
      paramString1 = null;
      com.tencent.pb.common.c.c.w("TalkRoomSdkApi", new Object[] { "createTalkRoom clientId is: ", paramString1, "wXgroupId: ", paramString2, " creatorUsrName: ", com.tencent.pb.a.a.a.dPM(), " usrnameList: ", paramList });
      if (paramString1 == null)
        break label1003;
      bool = true;
      AppMethodBeat.o(127847);
    }
    while (true)
    {
      return bool;
      i = new Random().nextInt() << 16 | com.tencent.pb.a.a.a.dPM().hashCode() & 0xFFFF;
      break;
      label335: if (!com.tencent.pb.common.b.h.isNetworkConnected())
      {
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "createTalkRoom isNetworkConnected is false" });
        h.Ss(-4003);
        h.a("", paramString1, 0, 0L, new String[] { "create", "req", "false", "noNetwork" });
        break label234;
      }
      if (localf.cIJ())
      {
        if (localf.cIJ())
          h.Ss(-4002);
        h.a("", paramString1, 0, 0L, new String[] { "create", "req", "false", "isBusy" });
        break label234;
      }
      if (TextUtils.isEmpty(paramString1))
      {
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "createTalkRoom cliendId is null" });
        h.a("", paramString1, 0, 0L, new String[] { "create", "req", "false", "cliendIdnull" });
        break label234;
      }
      if (!j.auS(paramString1))
      {
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "createTalkRoom groupId is not cliend id: ", paramString1 });
        h.a("", paramString1, 0, 0L, new String[] { "create", "req", "false", "isnotcliendId" });
        break label234;
      }
      if (c.dTg().auE(paramString1) == null)
        c.dTg().d(paramString1, paramString2, (String[])localObject1);
      localf.AJC.reset();
      localf.ru(false);
      localf.dTp();
      if (!localf.cEA())
      {
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "createTalkRoom initEngine fail" });
        h.a("", paramString1, 0, 0L, new String[] { "create", "req", "false", "initEnginefail" });
        localf.ru(false);
        break label234;
      }
      localf.AJC.dTC();
      localf.neq = paramString1;
      localf.AJO = paramString1;
      localf.AlR = i;
      localf.AJu = paramString1;
      localf.setState(1);
      localf.sRm = true;
      Object localObject2 = new f.a(localf);
      ((f.a)localObject2).groupId = localf.neq;
      ((f.a)localObject2).AKr = ((String[])localObject1);
      ((f.a)localObject2).AKs = null;
      ((f.a)localObject2).AmC = i;
      ((f.a)localObject2).type = 0;
      ((f.a)localObject2).AKt = 0L;
      ((f.a)localObject2).AKu = null;
      ((f.a)localObject2).AKv = false;
      ((f.a)localObject2).AKw = paramString2;
      localObject1 = Message.obtain();
      ((Message)localObject1).what = 2;
      ((Message)localObject1).obj = localObject2;
      localf.mHandler.removeMessages(2);
      localObject2 = c.dTg().auE(localf.neq);
      if (localObject2 == null)
        com.tencent.pb.common.c.c.w("TalkRoomManager", new Object[] { "isOnlyMySelfInGroup talkroom is null" });
      while (true)
      {
        localf.mHandler.sendMessage((Message)localObject1);
        localf.AJQ = true;
        break;
        localObject2 = ((TalkRoom)localObject2).dSX();
        if ((localObject2 == null) || (((List)localObject2).size() != 1))
        {
          com.tencent.pb.common.c.c.w("TalkRoomManager", new Object[] { "isOnlyMySelfInGroup TalkRoomMember list is not match" });
        }
        else
        {
          localObject2 = (d)((List)localObject2).get(0);
          if (localObject2 == null)
            com.tencent.pb.common.c.c.w("TalkRoomManager", new Object[] { "isOnlyMySelfInGroup talkRoomMember is null" });
          else
            com.tencent.pb.common.c.c.w("TalkRoomManager", new Object[] { "isOnlyMySelfInGroup ret: ", Boolean.valueOf(((d)localObject2).dTk()) });
        }
      }
      label1003: bool = false;
      AppMethodBeat.o(127847);
    }
  }

  public final void jo(boolean paramBoolean)
  {
    AppMethodBeat.i(127845);
    a.dSR();
    com.tencent.pb.talkroom.sdk.e locale = f.dTA();
    if (locale != null);
    for (boolean bool = locale.jk(paramBoolean); ; bool = false)
    {
      com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "switchSpeakerPhone", Boolean.valueOf(paramBoolean), " ret: ", Boolean.valueOf(bool), " realret: ", Boolean.valueOf(f.KU()), " wxCallBack: ", locale });
      AppMethodBeat.o(127845);
      return;
    }
  }

  public final void rm(boolean paramBoolean)
  {
    AppMethodBeat.i(127844);
    f localf = a.dSR();
    com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "setMute isMute: ", Boolean.valueOf(paramBoolean) });
    localf.mIsMute = paramBoolean;
    com.tencent.pb.common.c.h.aB(new g.14(localf.AJK, paramBoolean));
    AppMethodBeat.o(127844);
  }

  public final boolean rn(boolean paramBoolean)
  {
    AppMethodBeat.i(127855);
    com.tencent.pb.common.c.c.w("TalkRoomSdkApi", new Object[] { "holadMultiTalk isHold", Boolean.valueOf(paramBoolean) });
    f localf;
    if (paramBoolean)
    {
      localf = a.dSR();
      com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "syscall", "startHoldOn" });
      localf.AJY = true;
      localf.rv(false);
      com.tencent.pb.common.c.h.aB(new g.10(localf.AJK));
    }
    while (true)
    {
      AppMethodBeat.o(127855);
      return true;
      localf = a.dSR();
      com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "syscall", "endHoldOn" });
      localf.AJY = false;
      localf.dTq();
      if ((localf.cIJ()) && (localf.nME))
      {
        localf.rv(true);
        com.tencent.pb.common.c.h.aB(new g.12(localf.AJK));
      }
    }
  }

  public final int setAppCmd(int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    int i = -1;
    AppMethodBeat.i(127863);
    Object localObject = a.dSR();
    if (((f)localObject).AJD == null)
      com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "setAppCmd type: ", Integer.valueOf(paramInt1), " engine is null" });
    while (true)
    {
      com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "setAppCmd type: ", Integer.valueOf(paramInt1), " paramLen: ", Integer.valueOf(paramInt2), " ret: ", Integer.valueOf(i) });
      AppMethodBeat.o(127863);
      return i;
      localObject = ((f)localObject).AJD;
      if ((paramArrayOfByte == null) || (((b)localObject).AIV == null))
        com.tencent.pb.common.c.c.w("simon:TalkRoomContext", new Object[] { "steve:setAppCmd null, params:", paramArrayOfByte, ", engine:", ((b)localObject).AIV });
      else
        i = ((b)localObject).AIV.setAppCmd(paramInt1, paramArrayOfByte, paramInt2);
    }
  }

  public final boolean zf(int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(127858);
    if (!a.dSR().cIJ())
    {
      com.tencent.pb.common.c.c.w("TalkRoomSdkApi", new Object[] { "switchMultiTalkVideo isWorking is false" });
      AppMethodBeat.o(127858);
    }
    while (true)
    {
      return bool;
      com.tencent.pb.common.c.c.d("TalkRoomSdkApi", new Object[] { "switchMultiTalkVideo action: ", Integer.valueOf(paramInt) });
      Object localObject = a.dSR();
      if (TextUtils.isEmpty(((f)localObject).neq))
      {
        com.tencent.pb.common.c.c.w("TalkRoomService", new Object[] { "switchMultiTalkVideo mGroupId is null" });
        AppMethodBeat.o(127858);
      }
      else
      {
        ((f)localObject).AJB = paramInt;
        localObject = new l(((f)localObject).neq, ((f)localObject).nCF, ((f)localObject).sZg, paramInt);
        bool = com.tencent.pb.common.b.e.dPu().a((com.tencent.pb.common.b.d)localObject);
        com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "switchMultiTalkVideo ret: ", Boolean.valueOf(bool) });
        AppMethodBeat.o(127858);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.wecall.talkroom.model.e
 * JD-Core Version:    0.6.2
 */