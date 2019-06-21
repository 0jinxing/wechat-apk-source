package com.tencent.wecall.talkroom.model;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.pb.a.a.a;
import com.tencent.pb.common.b.a.a.at;
import com.tencent.pb.common.b.a.a.av;
import com.tencent.pb.common.b.a.a.aw;
import com.tencent.pb.common.c.e;
import com.tencent.pb.talkroom.sdk.MultiTalkGroup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class c
{
  public static boolean AIW;
  private static final e<c> AIX;
  private static boolean DEBUG;
  private Map<String, TalkRoom> AIY;
  private Map<String, String> AIZ;
  g AJa;

  static
  {
    AppMethodBeat.i(127810);
    AIW = false;
    DEBUG = false;
    AIX = new c.1();
    AppMethodBeat.o(127810);
  }

  private c()
  {
    AppMethodBeat.i(127796);
    this.AIY = new HashMap();
    this.AIZ = new HashMap();
    com.tencent.pb.common.c.c.d("TalkRoomManager", new Object[] { "asyncLoadCache" });
    AppMethodBeat.o(127796);
  }

  public static boolean auJ(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(127807);
    paramString = dTg().auE(paramString);
    if (paramString == null)
    {
      com.tencent.pb.common.c.c.w("TalkRoomManager", new Object[] { "isMySelfExit talkRoom is null" });
      AppMethodBeat.o(127807);
    }
    while (true)
    {
      return bool;
      paramString = paramString.dSZ();
      if ((paramString == null) || (20 == paramString.getState()))
      {
        AppMethodBeat.o(127807);
      }
      else
      {
        AppMethodBeat.o(127807);
        bool = false;
      }
    }
  }

  public static int auK(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(127808);
    Object localObject = dTg().auE(paramString);
    if (localObject == null)
    {
      com.tencent.pb.common.c.c.w("TalkRoomManager", new Object[] { "getMySelfReason talkRoom is null groupId: ", paramString });
      AppMethodBeat.o(127808);
      return i;
    }
    localObject = ((TalkRoom)localObject).dSZ();
    if ((localObject != null) && (((d)localObject).AJb != null));
    for (i = ((d)localObject).AJb.boZ; ; i = 0)
    {
      com.tencent.pb.common.c.c.w("TalkRoomManager", new Object[] { "getMySelfReason groupId: ", paramString, " reason: ", Integer.valueOf(i) });
      AppMethodBeat.o(127808);
      break;
    }
  }

  public static c dTg()
  {
    AppMethodBeat.i(127795);
    c localc = (c)AIX.get();
    AppMethodBeat.o(127795);
    return localc;
  }

  private static void dTh()
  {
    AppMethodBeat.i(127804);
    com.tencent.pb.common.c.c.d("TalkRoomManager", new Object[] { "asyncWriteBackCache" });
    AppMethodBeat.o(127804);
  }

  public final boolean a(String paramString1, String paramString2, Integer paramInteger, int paramInt, long paramLong, a.at paramat, a.av[] paramArrayOfav, a.aw[] paramArrayOfaw, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(127803);
    com.tencent.pb.common.c.c.d("TalkRoomManager", new Object[] { "newOrUpdateGroup groupId: ", paramString1, " isActive: ", Boolean.valueOf(paramBoolean2) });
    if (TextUtils.isEmpty(paramString1));
    for (String str1 = paramString2; ; str1 = paramString1)
    {
      if (TextUtils.isEmpty(str1))
      {
        com.tencent.pb.common.c.c.w("TalkRoomManager", new Object[] { "newOrUpdateGroup invalid groupId" });
        paramBoolean1 = false;
        AppMethodBeat.o(127803);
      }
      String str2;
      while (true)
      {
        return paramBoolean1;
        if (j.auS(paramString2))
          this.AIZ.put(paramString2, str1);
        paramString1 = (TalkRoom)this.AIY.get(str1);
        if ((!TextUtils.isEmpty(paramString2)) && (paramString1 != null) && (paramat != null) && (paramat.cAO != 100))
        {
          com.tencent.pb.common.c.c.w("TalkRoomManager", new Object[] { "newOrUpdateGroup clientGroupId is not empty , room is not null" });
          paramBoolean1 = false;
          AppMethodBeat.o(127803);
        }
        else
        {
          str2 = paramString1;
          if (paramString1 == null)
          {
            if (j.auS(paramString2))
              paramString1 = (TalkRoom)this.AIY.get(paramString2);
            str2 = paramString1;
            if (paramString1 != null)
            {
              this.AIY.put(str1, paramString1);
              str2 = paramString1;
            }
          }
          if ((str2 == null) || (!paramBoolean2))
            break;
          int i = j.dTH();
          long l = j.dTI();
          com.tencent.pb.common.c.c.d("TalkRoomManager", new Object[] { "check current active group roomId: ", Integer.valueOf(i), " and roomKey: ", Long.valueOf(paramLong) });
          if ((i != 0) && (i != paramInt))
          {
            com.tencent.pb.common.c.c.w("TalkRoomManager", new Object[] { "diff roomId: ", Integer.valueOf(i), " -> ", Integer.valueOf(paramInt) });
            paramBoolean1 = false;
            AppMethodBeat.o(127803);
          }
          else
          {
            if ((0L == l) || (l == paramLong))
              break;
            com.tencent.pb.common.c.c.w("TalkRoomManager", new Object[] { "diff roomKey: ", Long.valueOf(l), " -> ", Long.valueOf(paramLong) });
            paramBoolean1 = false;
            AppMethodBeat.o(127803);
          }
        }
      }
      if (str2 == null)
      {
        com.tencent.pb.common.c.c.d("TalkRoomManager", new Object[] { "newOrUpdateGroup create groupId: ", str1 });
        paramString1 = TalkRoom.a(str1, paramString2, paramInteger, paramInt, paramLong, paramat, paramArrayOfav, paramArrayOfaw);
        this.AIY.put(str1, paramString1);
      }
      while (true)
      {
        if ((this.AJa != null) && (paramBoolean1))
          this.AJa.g(auL(str1));
        dTh();
        paramBoolean1 = true;
        AppMethodBeat.o(127803);
        break;
        com.tencent.pb.common.c.c.d("TalkRoomManager", new Object[] { "newOrUpdateGroup update groupId: ", str1 });
        TalkRoom.a(str2, str1, paramString2, paramInteger, paramInt, paramLong, paramat, paramArrayOfav, paramArrayOfaw);
      }
    }
  }

  public final TalkRoom auE(String paramString)
  {
    AppMethodBeat.i(127798);
    TalkRoom localTalkRoom1 = (TalkRoom)this.AIY.get(paramString);
    TalkRoom localTalkRoom2 = localTalkRoom1;
    if (localTalkRoom1 == null)
    {
      localTalkRoom2 = localTalkRoom1;
      if (j.auS(paramString))
      {
        paramString = (String)this.AIZ.get(paramString);
        localTalkRoom2 = (TalkRoom)this.AIY.get(paramString);
      }
    }
    AppMethodBeat.o(127798);
    return localTalkRoom2;
  }

  public final void auF(String paramString)
  {
    AppMethodBeat.i(127799);
    try
    {
      TalkRoom localTalkRoom = auE(paramString);
      if (localTalkRoom == null)
      {
        com.tencent.pb.common.c.c.w("TalkRoomManager", new Object[] { "handleRoomExit assert failed: current TalkRoom MUST exists" });
        AppMethodBeat.o(127799);
        return;
      }
      paramString = localTalkRoom.auD(a.dPM());
      if (paramString != null)
      {
        paramString.AJb.status = 20;
        paramString.AJb.kyZ = -1;
      }
      if (localTalkRoom.Aqc == null);
      for (paramString = ""; ; paramString = localTalkRoom.Aqc)
      {
        com.tencent.pb.common.c.c.d("tagorewang:TalkRoom", new Object[] { "resetRoomTempInfo groupId: ", paramString });
        dTh();
        AppMethodBeat.o(127799);
        break;
      }
    }
    catch (Throwable paramString)
    {
      while (true)
      {
        com.tencent.pb.common.c.c.w("TalkRoomManager", new Object[] { "handleRoomExit: ", paramString });
        AppMethodBeat.o(127799);
      }
    }
  }

  public final int auG(String paramString)
  {
    int i = -1;
    AppMethodBeat.i(127800);
    if (TextUtils.isEmpty(paramString))
    {
      com.tencent.pb.common.c.c.w("TalkRoomManager", new Object[] { "getSelfMemberId invalid groupId" });
      AppMethodBeat.o(127800);
    }
    while (true)
    {
      return i;
      Object localObject = auE(paramString);
      if (localObject == null)
      {
        com.tencent.pb.common.c.c.w("TalkRoomManager", new Object[] { "getSelfMemberId TalkRoom is null  groupId: ", paramString });
        AppMethodBeat.o(127800);
      }
      else
      {
        localObject = ((TalkRoom)localObject).auD(a.dPM());
        if (localObject != null)
        {
          com.tencent.pb.common.c.c.w("TalkRoomManager", new Object[] { "getSelfMemberId TalkRoomMember is not null groupId: ", paramString, " uuid: ", a.dPM(), " memberId: ", Integer.valueOf(((d)localObject).dTj()) });
          i = ((d)localObject).dTj();
          AppMethodBeat.o(127800);
        }
        else
        {
          com.tencent.pb.common.c.c.w("TalkRoomManager", new Object[] { "getSelfMemberId TalkRoomMember is null" });
          AppMethodBeat.o(127800);
        }
      }
    }
  }

  public final int auH(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(127801);
    if (TextUtils.isEmpty(paramString))
    {
      com.tencent.pb.common.c.c.w("TalkRoomManager", new Object[] { "getRountIdByGrouId invalid groupId" });
      AppMethodBeat.o(127801);
    }
    while (true)
    {
      return i;
      TalkRoom localTalkRoom = auE(paramString);
      if (localTalkRoom == null)
      {
        com.tencent.pb.common.c.c.w("TalkRoomManager", new Object[] { "getRountIdByGrouId TalkRoom is null  groupId: ", paramString });
        AppMethodBeat.o(127801);
      }
      else
      {
        i = localTalkRoom.dSU();
        AppMethodBeat.o(127801);
      }
    }
  }

  public final int auI(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(127805);
    TalkRoom localTalkRoom = auE(paramString);
    if (localTalkRoom == null)
      AppMethodBeat.o(127805);
    while (true)
    {
      return i;
      i = localTalkRoom.AIU.size();
      com.tencent.pb.common.c.c.d("TalkRoomManager", new Object[] { "getGroupMemberSize groupid: ", paramString, " size: ", Integer.valueOf(i) });
      AppMethodBeat.o(127805);
    }
  }

  public final MultiTalkGroup auL(String paramString)
  {
    AppMethodBeat.i(127809);
    paramString = auE(paramString);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(127809);
    }
    while (true)
    {
      return paramString;
      paramString = paramString.dTc();
      AppMethodBeat.o(127809);
    }
  }

  public final boolean cp(String paramString, boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(127797);
    if (TextUtils.isEmpty(paramString))
    {
      com.tencent.pb.common.c.c.w("TalkRoomManager", new Object[] { "isGroupActiveExceptMySelf groupid is null" });
      AppMethodBeat.o(127797);
      paramBoolean = bool;
    }
    while (true)
    {
      return paramBoolean;
      paramString = auE(paramString);
      if (paramString == null)
      {
        com.tencent.pb.common.c.c.w("TalkRoomManager", new Object[] { "isGroupActiveExceptMySelf talkRoom is null" });
        AppMethodBeat.o(127797);
        paramBoolean = bool;
      }
      else
      {
        paramString = paramString.dSX();
        if (paramString != null)
          break;
        com.tencent.pb.common.c.c.w("TalkRoomManager", new Object[] { "isGroupActiveExceptMySelf TalkRoomMember list is null" });
        AppMethodBeat.o(127797);
        paramBoolean = bool;
      }
    }
    Iterator localIterator = paramString.iterator();
    int i = 0;
    int j = 0;
    while (true)
      label125: if (localIterator.hasNext())
      {
        paramString = (d)localIterator.next();
        if (paramString != null)
        {
          paramString.dTi();
          TalkRoom.dST();
          if (paramString.getState() != 10)
            break label254;
          if (paramString.dTk())
            i = 1;
        }
      }
    label254: 
    while (true)
    {
      if ((paramBoolean) && (j != 0))
      {
        AppMethodBeat.o(127797);
        paramBoolean = true;
        break;
        j = 1;
        continue;
      }
      if ((i != 0) && (j != 0))
      {
        com.tencent.pb.common.c.c.w("TalkRoomManager", new Object[] { "isGroupActiveExceptMySelf is true" });
        AppMethodBeat.o(127797);
        paramBoolean = true;
        break;
      }
      break label125;
      AppMethodBeat.o(127797);
      paramBoolean = bool;
      break;
    }
  }

  public final boolean d(String paramString1, String paramString2, String[] paramArrayOfString)
  {
    AppMethodBeat.i(127802);
    com.tencent.pb.common.c.c.d("TalkRoomManager", new Object[] { "newTmpGroup groupId: ", paramString1 });
    boolean bool;
    if (!j.auS(paramString1))
    {
      com.tencent.pb.common.c.c.w("TalkRoomManager", new Object[] { "newTmpGroup invalid clientGroupId" });
      bool = false;
      AppMethodBeat.o(127802);
    }
    while (true)
    {
      return bool;
      if ((paramArrayOfString == null) || (paramArrayOfString.length == 0))
      {
        com.tencent.pb.common.c.c.w("TalkRoomManager", new Object[] { "newTmpGroup empty uuid array" });
        bool = false;
        AppMethodBeat.o(127802);
      }
      else
      {
        try
        {
          Object localObject1 = new com/tencent/pb/common/b/a/a$at;
          ((a.at)localObject1).<init>();
          ((a.at)localObject1).cAO = 0;
          ((a.at)localObject1).AoT = paramString2;
          ((a.at)localObject1).AoS = a.dPM();
          paramString2 = new com/tencent/wecall/talkroom/model/TalkRoom;
          paramString2.<init>(paramString1, null, (a.at)localObject1);
          int i = paramArrayOfString.length;
          for (int j = 0; j != i; j++)
          {
            Object localObject2 = paramArrayOfString[j];
            localObject1 = new com/tencent/pb/common/b/a/a$av;
            ((a.av)localObject1).<init>();
            ((a.av)localObject1).Aop = ((String)localObject2);
            ((a.av)localObject1).Apu = a.dPM();
            ((a.av)localObject1).status = 20;
            ((a.av)localObject1).kyZ = -1;
            ((a.av)localObject1).Api = ((int)(System.currentTimeMillis() / 1000L));
            localObject2 = new com/tencent/pb/common/b/a/a$aw;
            ((a.aw)localObject2).<init>();
            d locald = new com/tencent/wecall/talkroom/model/d;
            locald.<init>((a.av)localObject1, (a.aw)localObject2);
            paramString2.a(locald);
          }
          this.AIY.put(paramString1, paramString2);
          dTh();
          bool = true;
          AppMethodBeat.o(127802);
        }
        catch (Exception paramString1)
        {
          com.tencent.pb.common.c.c.w("TalkRoomManager", new Object[] { "newTmpGroup err: ", paramString1 });
          bool = false;
          AppMethodBeat.o(127802);
        }
      }
    }
  }

  public final String k(String paramString, int paramInt, long paramLong)
  {
    StringBuffer localStringBuffer = null;
    AppMethodBeat.i(127806);
    if ((paramInt == 0) && (paramLong == 0L))
    {
      com.tencent.pb.common.c.c.w("TalkRoomManager", new Object[] { "getMsgKeyByGroupId roomId and roomKey is 0,groupId: ", paramString });
      AppMethodBeat.o(127806);
      paramString = localStringBuffer;
    }
    while (true)
    {
      return paramString;
      Object localObject = auE(paramString);
      if (localObject == null)
      {
        com.tencent.pb.common.c.c.w("TalkRoomManager", new Object[] { "getMsgKeyByGroupId talkRoom is null,groupId: ", paramString });
        AppMethodBeat.o(127806);
        paramString = localStringBuffer;
      }
      else
      {
        localObject = ((TalkRoom)localObject).auD(a.dPM());
        if (localObject == null)
        {
          com.tencent.pb.common.c.c.w("TalkRoomManager", new Object[] { "getMsgKeyByGroupId talkRoomMember is null,groupId: ", paramString });
          AppMethodBeat.o(127806);
          paramString = localStringBuffer;
        }
        else
        {
          localObject = ((d)localObject).AJb;
          if (localObject == null)
          {
            com.tencent.pb.common.c.c.w("TalkRoomManager", new Object[] { "getMsgKeyByGroupId voiceGroupMem is null,groupId: ", paramString });
            AppMethodBeat.o(127806);
            paramString = localStringBuffer;
          }
          else
          {
            localStringBuffer = new StringBuffer();
            localStringBuffer.append(paramString);
            localStringBuffer.append(",");
            localStringBuffer.append(paramInt);
            localStringBuffer.append(",");
            localStringBuffer.append(paramLong);
            localStringBuffer.append(",");
            localStringBuffer.append(((a.av)localObject).Apk);
            com.tencent.pb.common.c.c.w("TalkRoomManager", new Object[] { "getMsgKeyByGroupId msgKey is", localStringBuffer.toString() });
            paramString = localStringBuffer.toString();
            AppMethodBeat.o(127806);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.wecall.talkroom.model.c
 * JD-Core Version:    0.6.2
 */