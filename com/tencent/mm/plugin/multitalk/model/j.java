package com.tencent.mm.plugin.multitalk.model;

import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.pb.talkroom.sdk.MultiTalkGroup;
import com.tencent.pb.talkroom.sdk.MultiTalkGroupMember;
import java.util.Iterator;
import java.util.List;

public final class j
{
  public static final float[][] oGR;

  static
  {
    float[][] arrayOfFloat = new float[6][];
    oGR = arrayOfFloat;
    arrayOfFloat[0] = null;
    oGR[1] = { 0.5F, 0.5F };
    oGR[2] = { 0.0F, 0.5F, 1.0F, 0.5F };
    oGR[3] = { 0.0F, 0.0F, 1.0F, 0.0F, 0.5F, 1.0F };
    oGR[4] = { 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F };
    oGR[5] = { 0.0F, 0.0F, 1.0F, 0.0F, 2.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 2.0F, 1.0F, 2.0F, 2.0F, 2.0F };
  }

  public static boolean a(MultiTalkGroup paramMultiTalkGroup1, MultiTalkGroup paramMultiTalkGroup2)
  {
    boolean bool = true;
    AppMethodBeat.i(54049);
    if ((paramMultiTalkGroup1 == null) || (paramMultiTalkGroup2 == null))
    {
      AppMethodBeat.o(54049);
      bool = false;
    }
    while (true)
    {
      return bool;
      if ((!bo.isNullOrNil(paramMultiTalkGroup1.Aqc)) && (!bo.isNullOrNil(paramMultiTalkGroup2.Aqc)) && (paramMultiTalkGroup1.Aqc.equals(paramMultiTalkGroup2.Aqc)))
      {
        AppMethodBeat.o(54049);
      }
      else if ((!bo.isNullOrNil(paramMultiTalkGroup1.Aqd)) && (!bo.isNullOrNil(paramMultiTalkGroup2.Aqd)) && (paramMultiTalkGroup1.Aqd.equals(paramMultiTalkGroup2.Aqd)))
      {
        AppMethodBeat.o(54049);
      }
      else
      {
        AppMethodBeat.o(54049);
        bool = false;
      }
    }
  }

  public static String bRU()
  {
    AppMethodBeat.i(54054);
    String str = l(p.bSf().oGh);
    AppMethodBeat.o(54054);
    return str;
  }

  public static String bRV()
  {
    AppMethodBeat.i(54056);
    String str = m(p.bSf().oGh);
    AppMethodBeat.o(54056);
    return str;
  }

  public static boolean bRW()
  {
    return false;
  }

  public static a bRX()
  {
    AppMethodBeat.i(54058);
    a locala;
    if (at.isWifi(ah.getContext()))
    {
      locala = a.oGS;
      AppMethodBeat.o(54058);
    }
    while (true)
    {
      return locala;
      if (at.is4G(ah.getContext()))
      {
        locala = a.oGT;
        AppMethodBeat.o(54058);
      }
      else if ((at.is3G(ah.getContext())) || (at.is2G(ah.getContext())))
      {
        locala = a.oGU;
        AppMethodBeat.o(54058);
      }
      else
      {
        locala = a.oGV;
        AppMethodBeat.o(54058);
      }
    }
  }

  public static boolean bRY()
  {
    AppMethodBeat.i(54059);
    int i = ((Integer)g.RP().Ry().get(ac.a.xUV, Integer.valueOf(-1))).intValue();
    long l = ((Long)g.RP().Ry().get(ac.a.xUW, Long.valueOf(-1L))).longValue();
    boolean bool;
    if ((i > 0) && (l > 0L))
    {
      ab.i("MicroMsg.MultiTalkUtil", "checkMultiTalkAvailable, disableTime: %s, disableTimestamp: %s", new Object[] { Integer.valueOf(i), Long.valueOf(l) });
      if (bo.az(l) <= i * 1000)
      {
        AppMethodBeat.o(54059);
        bool = false;
      }
    }
    while (true)
    {
      return bool;
      g.RP().Ry().set(ac.a.xUV, Integer.valueOf(-1));
      g.RP().Ry().set(ac.a.xUW, Long.valueOf(-1L));
      AppMethodBeat.o(54059);
      bool = true;
      continue;
      g.RP().Ry().set(ac.a.xUV, Integer.valueOf(-1));
      g.RP().Ry().set(ac.a.xUW, Long.valueOf(-1L));
      AppMethodBeat.o(54059);
      bool = true;
    }
  }

  public static boolean c(com.tencent.mm.plugin.multitalk.ui.widget.e parame)
  {
    if ((parame == com.tencent.mm.plugin.multitalk.ui.widget.e.oIF) || (parame == com.tencent.mm.plugin.multitalk.ui.widget.e.oIG) || (parame == com.tencent.mm.plugin.multitalk.ui.widget.e.oID));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static String h(MultiTalkGroup paramMultiTalkGroup)
  {
    AppMethodBeat.i(54048);
    if (paramMultiTalkGroup == null)
    {
      paramMultiTalkGroup = "";
      AppMethodBeat.o(54048);
    }
    while (true)
    {
      return paramMultiTalkGroup;
      StringBuffer localStringBuffer = new StringBuffer();
      Object localObject = paramMultiTalkGroup.Aqg;
      localStringBuffer.append("->[usernamelist]");
      if (localObject != null)
      {
        Iterator localIterator = ((List)localObject).iterator();
        while (localIterator.hasNext())
        {
          localObject = (MultiTalkGroupMember)localIterator.next();
          localStringBuffer.append(((MultiTalkGroupMember)localObject).Aqh + "|");
          localStringBuffer.append(((MultiTalkGroupMember)localObject).status + ", ");
        }
      }
      localStringBuffer.append(" ->createname:" + paramMultiTalkGroup.Aqf);
      localStringBuffer.append(" ->talkgroupId:" + paramMultiTalkGroup.Aqc);
      localStringBuffer.append(" ->wxGroupId:" + paramMultiTalkGroup.Aqe);
      paramMultiTalkGroup = localStringBuffer.toString();
      AppMethodBeat.o(54048);
    }
  }

  public static boolean i(MultiTalkGroup paramMultiTalkGroup)
  {
    boolean bool = false;
    AppMethodBeat.i(54050);
    if (paramMultiTalkGroup == null)
      AppMethodBeat.o(54050);
    while (true)
    {
      return bool;
      paramMultiTalkGroup = paramMultiTalkGroup.Aqg.iterator();
      i = 0;
      label34: MultiTalkGroupMember localMultiTalkGroupMember;
      for (int j = 0; ; j = 1)
      {
        if (!paramMultiTalkGroup.hasNext())
          break label128;
        localMultiTalkGroupMember = (MultiTalkGroupMember)paramMultiTalkGroup.next();
        if (!localMultiTalkGroupMember.Aqh.equals(r.Yz()))
          break label98;
        if (localMultiTalkGroupMember.status != 10)
          break label137;
        if (i != 0)
        {
          AppMethodBeat.o(54050);
          bool = true;
          break;
        }
      }
      label98: if (localMultiTalkGroupMember.status != 10)
        break label137;
      if (j == 0)
        break;
      AppMethodBeat.o(54050);
      bool = true;
    }
    int i = 1;
    label128: label137: 
    while (true)
    {
      break label34;
      AppMethodBeat.o(54050);
      break;
    }
  }

  public static boolean j(MultiTalkGroup paramMultiTalkGroup)
  {
    boolean bool = false;
    AppMethodBeat.i(54051);
    paramMultiTalkGroup = paramMultiTalkGroup.Aqg.iterator();
    int i = 0;
    if (paramMultiTalkGroup.hasNext())
    {
      MultiTalkGroupMember localMultiTalkGroupMember = (MultiTalkGroupMember)paramMultiTalkGroup.next();
      if ((localMultiTalkGroupMember.status != 10) && (localMultiTalkGroupMember.status != 1))
        break label86;
      i++;
    }
    label86: 
    while (true)
    {
      break;
      if (i > 1)
      {
        AppMethodBeat.o(54051);
        bool = true;
      }
      while (true)
      {
        return bool;
        AppMethodBeat.o(54051);
      }
    }
  }

  public static boolean k(MultiTalkGroup paramMultiTalkGroup)
  {
    AppMethodBeat.i(54052);
    boolean bool = paramMultiTalkGroup.Aqf.equals(r.Yz());
    AppMethodBeat.o(54052);
    return bool;
  }

  public static String l(MultiTalkGroup paramMultiTalkGroup)
  {
    AppMethodBeat.i(54053);
    if (paramMultiTalkGroup == null)
    {
      paramMultiTalkGroup = "";
      AppMethodBeat.o(54053);
    }
    while (true)
    {
      return paramMultiTalkGroup;
      String str1 = paramMultiTalkGroup.Aqc;
      String str2 = str1;
      if (bo.isNullOrNil(str1))
        str2 = paramMultiTalkGroup.Aqd;
      paramMultiTalkGroup = bo.bc(str2, "");
      AppMethodBeat.o(54053);
    }
  }

  public static String m(MultiTalkGroup paramMultiTalkGroup)
  {
    AppMethodBeat.i(54055);
    String str = null;
    int i = 0;
    if (i < paramMultiTalkGroup.Aqg.size())
    {
      if (!((MultiTalkGroupMember)paramMultiTalkGroup.Aqg.get(i)).Aqh.equals(r.Yz()))
        break label79;
      str = ((MultiTalkGroupMember)paramMultiTalkGroup.Aqg.get(i)).Aqi;
    }
    label79: 
    while (true)
    {
      i++;
      break;
      AppMethodBeat.o(54055);
      return str;
    }
  }

  public static int z(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(54057);
    int i;
    if (paramIntent != null)
    {
      paramIntent = paramIntent.getStringExtra("state");
      if (paramIntent != null)
        if (paramIntent.equals("IDLE"))
        {
          i = 0;
          AppMethodBeat.o(54057);
        }
    }
    while (true)
    {
      return i;
      if (paramIntent.equals("RINGING"))
      {
        i = 1;
        AppMethodBeat.o(54057);
      }
      else if (paramIntent.equals("OFFHOOK"))
      {
        i = 2;
        AppMethodBeat.o(54057);
      }
      else
      {
        i = ((TelephonyManager)paramContext.getSystemService("phone")).getCallState();
        AppMethodBeat.o(54057);
      }
    }
  }

  public static boolean zg(int paramInt)
  {
    if ((paramInt == 2) || (paramInt == 3));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean zh(int paramInt)
  {
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (paramInt != 1)
      if (paramInt != 3)
        break label18;
    label18: for (bool2 = bool1; ; bool2 = false)
      return bool2;
  }

  public static enum a
  {
    static
    {
      AppMethodBeat.i(54047);
      oGS = new a("WIFI", 0);
      oGT = new a("_4G", 1);
      oGU = new a("_3GOr_2G", 2);
      oGV = new a("None", 3);
      oGW = new a[] { oGS, oGT, oGU, oGV };
      AppMethodBeat.o(54047);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.model.j
 * JD-Core Version:    0.6.2
 */