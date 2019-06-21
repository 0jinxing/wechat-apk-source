package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.l;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.protocal.protobuf.aao;
import com.tencent.mm.protocal.protobuf.acs;
import com.tencent.mm.protocal.protobuf.cgy;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.LinkedList;

public final class c
{
  private static long U(long paramLong1, long paramLong2)
  {
    if (((paramLong1 > 0L) && (paramLong2 > 0L)) || ((paramLong1 < 0L) && (paramLong2 < 0L)))
      paramLong1 -= paramLong2;
    while (true)
    {
      return paramLong1;
      if (paramLong1 < 0L)
        paramLong1 = 1L;
      else
        paramLong1 = -1L;
    }
  }

  public static int a(long paramLong1, long paramLong2, String paramString)
  {
    AppMethodBeat.i(36134);
    paramString = af.cnJ().YV(paramString);
    Object localObject = paramString.wkv;
    ab.i("MicroMsg.FaultLogic", "getLastReqTimeByMinId fault.count %s", new Object[] { Integer.valueOf(paramString.wkv.size()) });
    int i;
    if (((LinkedList)localObject).isEmpty())
    {
      i = 0;
      AppMethodBeat.o(36134);
    }
    while (true)
    {
      return i;
      paramString = (aao)((LinkedList)localObject).getFirst();
      if ((paramLong1 == 0L) || (U(paramString.wfM, paramLong1) > 0L))
      {
        ab.e("MicroMsg.FaultLogic", "has a fault  minId:" + paramLong2 + " fault.min:" + paramString.wfM);
        i = 0;
        AppMethodBeat.o(36134);
      }
      else if ((paramLong2 != 0L) && (U(paramString.wfL, paramLong2) < 0L))
      {
        ab.e("MicroMsg.FaultLogic", ":" + paramLong2 + " fault.max:" + paramString.wfL);
        i = 0;
        AppMethodBeat.o(36134);
      }
      else
      {
        paramString = paramString.wfN;
        if (paramString.isEmpty())
        {
          i = 0;
          AppMethodBeat.o(36134);
        }
        else
        {
          paramString = paramString.iterator();
          int j = 2147483647;
          while (true)
            if (paramString.hasNext())
            {
              localObject = (cgy)paramString.next();
              if ((paramLong2 == 0L) || (U(paramLong2, ((cgy)localObject).xfR) >= 0L))
              {
                i = j;
                if (((cgy)localObject).xfS < j)
                  i = ((cgy)localObject).xfS;
                j = i;
                if (U(paramLong1, ((cgy)localObject).xfR) >= 0L)
                {
                  if (i == 2147483647)
                  {
                    i = 0;
                    AppMethodBeat.o(36134);
                    break;
                  }
                  AppMethodBeat.o(36134);
                  break;
                }
              }
            }
          ab.i("MicroMsg.FaultLogic", "should not to hear  minId:".concat(String.valueOf(paramLong1)));
          i = 0;
          AppMethodBeat.o(36134);
        }
      }
    }
  }

  private static aao a(aao paramaao1, aao paramaao2)
  {
    AppMethodBeat.i(36133);
    aao localaao = new aao();
    if (U(paramaao1.wfL, paramaao2.wfL) > 0L)
    {
      localaao.wfL = paramaao1.wfL;
      if (U(paramaao1.wfM, paramaao2.wfM) >= 0L)
        break label126;
      localaao.wfM = paramaao1.wfM;
      label61: paramaao1 = paramaao1.wfN;
      paramaao2 = paramaao2.wfN.iterator();
    }
    while (true)
    {
      if (!paramaao2.hasNext())
        break label639;
      cgy localcgy1 = (cgy)paramaao2.next();
      if (paramaao1.isEmpty())
      {
        ab.e("MicroMsg.FaultLogic", "fault's segments should not empty!!");
        paramaao1.addFirst(localcgy1);
        continue;
        localaao.wfL = paramaao2.wfL;
        break;
        label126: localaao.wfM = paramaao2.wfM;
        break label61;
      }
      long l1 = localcgy1.xfR;
      int i = paramaao1.size() - 1;
      label151: label178: int j;
      if (i >= 0)
        if (U(l1, ((cgy)paramaao1.get(i)).xfQ) <= 0L)
        {
          l1 = localcgy1.xfQ;
          j = 0;
          label187: if (j >= paramaao1.size())
            break label250;
          if (U(l1, ((cgy)paramaao1.get(j)).xfR) < 0L)
            break label244;
        }
      while (true)
      {
        if (i != -1)
          break label259;
        paramaao1.addFirst(localcgy1);
        break;
        i--;
        break label151;
        i = -1;
        break label178;
        label244: j++;
        break label187;
        label250: j = paramaao1.size();
      }
      label259: if (j == paramaao1.size())
      {
        paramaao1.addLast(localcgy1);
      }
      else
      {
        cgy localcgy2 = (cgy)paramaao1.get(j);
        int k = i;
        int m = j;
        cgy localcgy3;
        if (U(localcgy1.xfQ, localcgy2.xfQ) < 0L)
        {
          localcgy3 = new cgy();
          localcgy3.xfQ = localcgy2.xfQ;
          l1 = localcgy1.xfQ;
          if (l1 != 9223372036854775807L)
            break label495;
        }
        label495: for (l1 = -9223372036854775808L; ; l1 += 1L)
        {
          localcgy3.xfR = l1;
          localcgy3.xfS = localcgy2.xfS;
          paramaao1.add(j, localcgy3);
          k = i + 1;
          m = j + 1;
          localcgy3 = (cgy)paramaao1.get(k);
          i = k;
          if (U(localcgy1.xfR, localcgy3.xfR) > 0L)
          {
            localcgy2 = new cgy();
            localcgy2.xfR = localcgy3.xfR;
            localcgy2.xfQ = ka(localcgy1.xfR);
            localcgy2.xfS = localcgy3.xfS;
            paramaao1.add(k + 1, localcgy2);
          }
          for (i = k; i >= m; i--)
            paramaao1.remove(i);
        }
        paramaao1.add(m, localcgy1);
        if (paramaao1.size() > 100)
        {
          long l2 = ((cgy)paramaao1.getLast()).xfR;
          l1 = ((cgy)paramaao1.getLast()).xfQ;
          for (j = ((cgy)paramaao1.getLast()).xfS; paramaao1.size() >= 100; j = i)
          {
            localcgy1 = (cgy)paramaao1.removeLast();
            l1 = localcgy1.xfQ;
            i = j;
            if (localcgy1.xfS < j)
              i = localcgy1.xfS;
          }
          localcgy1 = new cgy();
          localcgy1.xfQ = l1;
          localcgy1.xfR = l2;
          localcgy1.xfS = j;
          paramaao1.addLast(localcgy1);
        }
      }
    }
    label639: localaao.wfN = paramaao1;
    AppMethodBeat.o(36133);
    return localaao;
  }

  public static void f(String paramString, long paramLong1, long paramLong2, int paramInt)
  {
    AppMethodBeat.i(36132);
    if (paramLong2 == 0L)
    {
      AppMethodBeat.o(36132);
      return;
    }
    Object localObject1 = af.cnJ().YV(paramString);
    if (localObject1 == null)
      localObject1 = new acs();
    while (true)
      while (true)
      {
        if ((paramLong1 == 0L) && (((acs)localObject1).wkv.isEmpty()))
        {
          AppMethodBeat.o(36132);
          break;
        }
        long l = paramLong1;
        if (paramLong1 == 0L)
          l = ((aao)((acs)localObject1).wkv.getFirst()).wfL;
        Object localObject2 = new aao();
        ((aao)localObject2).wfL = l;
        ((aao)localObject2).wfM = paramLong2;
        Object localObject3 = new cgy();
        ((cgy)localObject3).xfQ = l;
        ((cgy)localObject3).xfR = paramLong2;
        ((cgy)localObject3).xfS = paramInt;
        ((aao)localObject2).wfN.add(localObject3);
        while (true)
        {
          if (!((acs)localObject1).wkv.isEmpty())
          {
            localObject3 = (aao)((acs)localObject1).wkv.getFirst();
            if (U(((aao)localObject2).wfM, ((aao)localObject3).wfL) > 0L)
              ab.e("MicroMsg.FaultLogic", "has a fault: newerMin:" + ((aao)localObject2).wfM + " fault.Max" + ((aao)localObject3).wfL);
          }
          else
          {
            ((acs)localObject1).wkv.addFirst(localObject2);
            while (((acs)localObject1).wkv.size() > 100)
              ((acs)localObject1).wkv.removeLast();
          }
          ((acs)localObject1).wkv.removeFirst();
          localObject2 = a((aao)localObject3, (aao)localObject2);
        }
        if (((acs)localObject1).wkv.size() > 0)
          ab.d("MicroMsg.FaultLogic", "min " + ((aao)((acs)localObject1).wkv.get(0)).wfM + " max " + ((aao)((acs)localObject1).wkv.get(0)).wfL);
        localObject2 = af.cnJ().YX(paramString);
        try
        {
          ((l)localObject2).field_userName = paramString;
          ((l)localObject2).field_faultS = ((acs)localObject1).toByteArray();
          af.cnJ().c((l)localObject2);
          label391: if (((acs)localObject1).wkv.size() > 1)
          {
            ab.d("MicroMsg.FaultLogic", "fault size : " + ((acs)localObject1).wkv.size());
            paramString = ((acs)localObject1).wkv.iterator();
            while (paramString.hasNext())
            {
              localObject1 = (aao)paramString.next();
              ab.d("MicroMsg.FaultLogic", "min - max " + ((aao)localObject1).wfM + " " + ((aao)localObject1).wfL);
            }
          }
          AppMethodBeat.o(36132);
        }
        catch (Exception paramString)
        {
          break label391;
        }
      }
  }

  public static long ka(long paramLong)
  {
    if (paramLong == -9223372036854775808L);
    for (paramLong = 9223372036854775807L; ; paramLong -= 1L)
      return paramLong;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.c
 * JD-Core Version:    0.6.2
 */