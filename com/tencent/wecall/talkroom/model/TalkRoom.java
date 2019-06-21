package com.tencent.wecall.talkroom.model;

import android.text.TextUtils;
import com.google.a.a.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.pb.a.a.a;
import com.tencent.pb.common.b.a.a.at;
import com.tencent.pb.common.b.a.a.av;
import com.tencent.pb.common.b.a.a.aw;
import com.tencent.pb.common.b.a.a.t;
import com.tencent.pb.common.c.c;
import com.tencent.pb.talkroom.sdk.MultiTalkGroup;
import com.tencent.pb.talkroom.sdk.MultiTalkGroupMember;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class TalkRoom extends MultiTalkGroup
{
  a.at AIT;
  Map<String, d> AIU;

  public TalkRoom(String paramString, Integer paramInteger, a.at paramat)
  {
    AppMethodBeat.i(127769);
    this.AIU = new ConcurrentHashMap();
    b(paramString, paramInteger);
    b(paramat);
    AppMethodBeat.o(127769);
  }

  private static void Sl(int paramInt)
  {
    AppMethodBeat.i(127773);
    c.d("tagorewang:TalkRoom", new Object[] { "setRoomId: ", Integer.valueOf(paramInt) });
    AppMethodBeat.o(127773);
  }

  private static a.t a(a.at paramat)
  {
    AppMethodBeat.i(127776);
    if (paramat != null);
    try
    {
      byte[] arrayOfByte = paramat.AoM;
      if (arrayOfByte == null)
      {
        AppMethodBeat.o(127776);
        paramat = null;
      }
      while (true)
      {
        return paramat;
        arrayOfByte = paramat.AoM;
        paramat = new com/tencent/pb/common/b/a/a$t;
        paramat.<init>();
        paramat = (a.t)e.a(paramat, arrayOfByte, arrayOfByte.length);
        AppMethodBeat.o(127776);
      }
    }
    catch (Exception paramat)
    {
      while (true)
      {
        c.w("tagorewang:TalkRoom", new Object[] { "toPlayItemInfo err: ", paramat });
        AppMethodBeat.o(127776);
        paramat = null;
      }
    }
  }

  public static TalkRoom a(TalkRoom paramTalkRoom, String paramString1, String paramString2, Integer paramInteger, int paramInt, long paramLong, a.at paramat, a.av[] paramArrayOfav, a.aw[] paramArrayOfaw)
  {
    AppMethodBeat.i(127768);
    if (paramTalkRoom == null)
    {
      c.w("tagorewang:TalkRoom:update", new Object[] { "updateAll null" });
      paramTalkRoom = null;
      AppMethodBeat.o(127768);
    }
    while (true)
    {
      return paramTalkRoom;
      c.d("tagorewang:TalkRoom:update", new Object[] { "updateAll groupId: ", paramString1, " tmpId: ", paramString2 });
      paramTalkRoom.b(paramString1, paramInteger);
      paramTalkRoom.auC(paramString2);
      Sl(paramInt);
      nG(paramLong);
      paramTalkRoom.b(paramat);
      if (paramArrayOfav == null)
      {
        paramInt = 0;
        label94: if (paramArrayOfaw != null)
          break label142;
      }
      label142: for (int i = 0; ; i = paramArrayOfaw.length)
      {
        if ((paramInt != 0) || (i != 0))
          break label150;
        c.w("tagorewang:TalkRoom:update", new Object[] { "updateAll null VoiceGroupMem or VoiceGroupUsrProfile array." });
        AppMethodBeat.o(127768);
        break;
        paramInt = paramArrayOfav.length;
        break label94;
      }
      label150: paramString2 = new HashSet(paramTalkRoom.AIU.keySet());
      paramString2.remove(a.dPM());
      i = 0;
      while (i != paramInt)
      {
        paramInteger = paramArrayOfav[i];
        if (paramInteger == null)
        {
          c.w("tagorewang:TalkRoom:update", new Object[] { "null member info, index: ", Integer.valueOf(i) });
          i++;
        }
        else
        {
          paramString1 = paramTalkRoom.auD(paramInteger.Aop);
          if (paramString1 == null)
          {
            c.d("tagorewang:TalkRoom:update", new Object[] { "add new member" });
            paramString1 = new d(paramInteger);
            paramTalkRoom.a(paramString1);
          }
          while (true)
          {
            paramString2.remove(paramString1.dTi());
            break;
            paramString1.a(paramInteger);
          }
        }
      }
      paramInteger = paramString2.iterator();
      while (paramInteger.hasNext())
      {
        paramString1 = (String)paramInteger.next();
        c.d("tagorewang:TalkRoom:update", new Object[] { "keyset", paramString1 });
        c.d("tagorewang:TalkRoom", new Object[] { "remove", paramTalkRoom.AIU.remove(paramString1) });
      }
      if (paramString2.size() > 0)
        c.w("tagorewang:TalkRoom:update", new Object[] { "updateAll not update uuid keyset.size(): ", Integer.valueOf(paramString2.size()) });
      c.d("tagorewang:TalkRoom:update", new Object[] { "did updateAll" });
      AppMethodBeat.o(127768);
    }
  }

  public static TalkRoom a(String paramString1, String paramString2, Integer paramInteger, int paramInt, long paramLong, a.at paramat, a.av[] paramArrayOfav, a.aw[] paramArrayOfaw)
  {
    AppMethodBeat.i(127767);
    c.d("tagorewang:TalkRoom:create", new Object[] { "create groupId: ", paramString1, " tmpId: ", paramString2 });
    paramInteger = new TalkRoom(paramString1, paramInteger, paramat);
    paramInteger.auC(paramString2);
    Sl(paramInt);
    nG(paramLong);
    if (paramArrayOfav == null)
    {
      paramInt = 0;
      if (paramArrayOfaw != null)
        break label127;
    }
    label127: for (int i = 0; ; i = paramArrayOfaw.length)
    {
      for (int j = 0; ; j++)
      {
        if (j == paramInt)
          break label217;
        paramString2 = paramArrayOfav[j];
        if (paramString2 != null)
          break;
        c.w("tagorewang:TalkRoom:create", new Object[] { "null member info, index: ", Integer.valueOf(j) });
      }
      paramInt = paramArrayOfav.length;
      break;
    }
    for (int k = 0; ; k++)
    {
      paramString1 = null;
      if (k != i)
      {
        paramString1 = paramArrayOfaw[k];
        if ((paramString1 != null) && (paramString1.vzt == paramString2.vzt))
          c.d("tagorewang:TalkRoom:create", new Object[] { "member info: ", paramString2, " profile: ", paramString1 });
      }
      else
      {
        paramInteger.a(new d(paramString2, paramString1));
        break;
      }
    }
    label217: c.d("tagorewang:TalkRoom:create", new Object[] { "did create" });
    AppMethodBeat.o(127767);
    return paramInteger;
  }

  private void auC(String paramString)
  {
    AppMethodBeat.i(127770);
    if (j.auS(paramString))
      this.Aqd = paramString;
    AppMethodBeat.o(127770);
  }

  private void b(a.at paramat)
  {
    AppMethodBeat.i(127778);
    if (paramat == null)
      AppMethodBeat.o(127778);
    while (true)
    {
      return;
      try
      {
        this.Aqe = paramat.AoT;
        this.Aqf = paramat.AoS;
        a.t localt1;
        a.t localt2;
        if ((this.AIT != null) && (paramat.cAO != 0))
        {
          localt1 = a(paramat);
          localt2 = a(this.AIT);
          if (localt1 != null)
            break label86;
        }
        for (paramat.AoM = this.AIT.AoM; ; paramat.AoM = this.AIT.AoM)
        {
          label86: 
          do
          {
            this.AIT = paramat;
            AppMethodBeat.o(127778);
            break;
          }
          while ((localt1.Anu != 0) && (localt1.Anu == localt2.Anu));
          c.w("tagorewang:TalkRoom", new Object[] { "setRoomInfo bad id: ", Integer.valueOf(localt2.Anu), " -> ", Integer.valueOf(localt1.Anu) });
        }
      }
      catch (Exception localException)
      {
        c.w("tagorewang:TalkRoom", new Object[] { "setRoomInfo assert failed: ", localException });
        this.AIT = paramat;
        AppMethodBeat.o(127778);
      }
    }
  }

  private void b(String paramString, Integer paramInteger)
  {
    AppMethodBeat.i(127771);
    if (TextUtils.isEmpty(paramString))
    {
      AppMethodBeat.o(127771);
      return;
    }
    if (j.auS(paramString))
      this.Aqd = paramString;
    while (true)
    {
      if (paramInteger != null)
        this.AlR = paramInteger.intValue();
      AppMethodBeat.o(127771);
      break;
      this.Aqc = paramString;
    }
  }

  public static long cKa()
  {
    AppMethodBeat.i(127774);
    long l = j.dTI();
    AppMethodBeat.o(127774);
    return l;
  }

  public static boolean dST()
  {
    return false;
  }

  public static int dSV()
  {
    AppMethodBeat.i(127772);
    int i = j.dTH();
    AppMethodBeat.o(127772);
    return i;
  }

  private String dSW()
  {
    AppMethodBeat.i(127777);
    Object localObject2;
    if ((this.AIT == null) || (TextUtils.isEmpty(this.AIT.name)))
    {
      Object localObject1 = new ArrayList(this.AIU.values());
      localObject2 = a.dPM();
      ((List)localObject1).remove(this.AIU.get(localObject2));
      localObject2 = fE((List)localObject1);
      c.i("tagorewang:TalkRoom", new Object[] { "getOtherMembers size: ", Integer.valueOf(((List)localObject2).size()), " all size: ", Integer.valueOf(this.AIU.size()) });
      localObject1 = new StringBuilder();
      if (localObject2 != null)
      {
        int i = ((List)localObject2).size();
        int j = 0;
        while (true)
          if (j != i)
            try
            {
              ((StringBuilder)localObject1).append(((d)((List)localObject2).get(j)).getDisplayName());
              if (j != i - 1)
                ((StringBuilder)localObject1).append('、');
              j++;
            }
            catch (Exception localException)
            {
              while (true)
                c.w("tagorewang:TalkRoom", new Object[] { "updateRoomNameIfEmpty err and continue: ", localException });
            }
      }
      if (((StringBuilder)localObject1).toString().length() > 0)
      {
        localObject2 = ((StringBuilder)localObject1).toString();
        AppMethodBeat.o(127777);
      }
    }
    while (true)
    {
      return localObject2;
      if ((this.AIT != null) && (!TextUtils.isEmpty(this.AIT.name)))
      {
        localObject2 = this.AIT.name;
        AppMethodBeat.o(127777);
      }
      else
      {
        c.w("tagorewang:TalkRoom", new Object[] { "updateRoomNameIfEmpty still empty, groupId: ", this.Aqc, " tmpId: ", this.Aqd });
        localObject2 = null;
        AppMethodBeat.o(127777);
      }
    }
  }

  private static List<d> fE(List<d> paramList)
  {
    AppMethodBeat.i(127782);
    if (paramList.isEmpty())
      AppMethodBeat.o(127782);
    while (true)
    {
      return paramList;
      Collections.sort(paramList, new TalkRoom.a());
      AppMethodBeat.o(127782);
    }
  }

  private static void nG(long paramLong)
  {
    AppMethodBeat.i(127775);
    c.d("tagorewang:TalkRoom", new Object[] { "setRoomKey: ", Long.valueOf(paramLong) });
    AppMethodBeat.o(127775);
  }

  public final void a(d paramd)
  {
    AppMethodBeat.i(127779);
    this.AIU.put(paramd.dTi(), paramd);
    AppMethodBeat.o(127779);
  }

  public final d auD(String paramString)
  {
    AppMethodBeat.i(127783);
    paramString = (d)this.AIU.get(paramString);
    AppMethodBeat.o(127783);
    return paramString;
  }

  public final int dSU()
  {
    if (this.AlR == 0);
    for (int i = 0; ; i = this.AlR)
      return i;
  }

  public final List<d> dSX()
  {
    AppMethodBeat.i(127780);
    List localList = fE(new ArrayList(this.AIU.values()));
    d locald = dSZ();
    localList.remove(locald);
    localList.add(0, locald);
    locald = (d)this.AIU.get(Integer.valueOf(90100));
    if (locald != null)
    {
      localList.remove(locald);
      localList.add(locald);
    }
    AppMethodBeat.o(127780);
    return localList;
  }

  public final List<d> dSY()
  {
    AppMethodBeat.i(127781);
    ArrayList localArrayList = new ArrayList(this.AIU.values());
    AppMethodBeat.o(127781);
    return localArrayList;
  }

  public final d dSZ()
  {
    AppMethodBeat.i(127784);
    d locald = (d)this.AIU.get(a.dPM());
    AppMethodBeat.o(127784);
    return locald;
  }

  public final List<a.av> dTa()
  {
    AppMethodBeat.i(127785);
    List localList = dTb();
    AppMethodBeat.o(127785);
    return localList;
  }

  public final List<a.av> dTb()
  {
    AppMethodBeat.i(127786);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.AIU.entrySet().iterator();
    while (localIterator.hasNext())
      localArrayList.add(((d)((Map.Entry)localIterator.next()).getValue()).AJb);
    AppMethodBeat.o(127786);
    return localArrayList;
  }

  public final MultiTalkGroup dTc()
  {
    AppMethodBeat.i(127788);
    MultiTalkGroup localMultiTalkGroup = new MultiTalkGroup();
    localMultiTalkGroup.Aqc = this.Aqc;
    localMultiTalkGroup.Aqd = this.Aqd;
    localMultiTalkGroup.AlR = this.AlR;
    localMultiTalkGroup.Aqe = this.Aqe;
    localMultiTalkGroup.Aqf = this.Aqf;
    ArrayList localArrayList = new ArrayList();
    Object localObject = dSY();
    if (((List)localObject).size() > 0)
    {
      Iterator localIterator = ((List)localObject).iterator();
      while (localIterator.hasNext())
      {
        d locald = (d)localIterator.next();
        if (locald != null)
        {
          MultiTalkGroupMember localMultiTalkGroupMember = new MultiTalkGroupMember();
          localMultiTalkGroupMember.Aqh = locald.dTi();
          if (locald.AJb != null)
          {
            localObject = locald.AJb.Apu;
            label147: localMultiTalkGroupMember.Aqi = ((String)localObject);
            if (locald.AJb == null)
              break label243;
            i = locald.AJb.boZ;
            label171: localMultiTalkGroupMember.boZ = i;
            localMultiTalkGroupMember.status = locald.getState();
            if ((locald.AJb == null) || (locald.AJb.Api == 0))
              break label249;
          }
          label243: label249: for (int i = locald.AJb.Api; ; i = 0)
          {
            localMultiTalkGroupMember.Api = i;
            localArrayList.add(localMultiTalkGroupMember);
            break;
            localObject = "";
            break label147;
            i = 0;
            break label171;
          }
        }
      }
    }
    localMultiTalkGroup.Aqg = localArrayList;
    AppMethodBeat.o(127788);
    return localMultiTalkGroup;
  }

  public String toString()
  {
    AppMethodBeat.i(127787);
    StringBuilder localStringBuilder1 = new StringBuilder();
    try
    {
      localStringBuilder1.append("groupId: ").append(this.Aqc);
      localStringBuilder1.append(" tmpId: ").append(this.Aqd);
      localStringBuilder1.append(" routeId: ").append(this.AlR);
      StringBuilder localStringBuilder2 = localStringBuilder1.append(" room name: ");
      if ((this.AIT == null) || (TextUtils.isEmpty(this.AIT.name)));
      for (String str = dSW(); ; str = this.AIT.name)
      {
        localStringBuilder2.append(str);
        str = localStringBuilder1.toString();
        AppMethodBeat.o(127787);
        return str;
      }
    }
    catch (Exception localException)
    {
      while (true)
        localStringBuilder1.append(" broken by " + localException.getMessage());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.wecall.talkroom.model.TalkRoom
 * JD-Core Version:    0.6.2
 */