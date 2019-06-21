package com.tencent.mm.plugin.clean.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.clean.c.j;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public final class a
  implements Runnable
{
  private static final Long clo;
  private static final Long kvU;
  private boolean isStop;
  private long kvV;
  private long kvW;
  private long kvX;
  private long kvY;
  private HashMap<String, Long> kvZ;
  private HashSet<String> kwa;
  private c kwb;

  static
  {
    AppMethodBeat.i(18659);
    clo = Long.valueOf(604800000L);
    kvU = Long.valueOf(7776000000L);
    AppMethodBeat.o(18659);
  }

  public a(c paramc)
  {
    AppMethodBeat.i(18652);
    this.isStop = false;
    this.isStop = false;
    this.kwb = paramc;
    this.kvZ = new HashMap();
    this.kwa = new HashSet();
    AppMethodBeat.o(18652);
  }

  private long HO(String paramString)
  {
    AppMethodBeat.i(18655);
    Object localObject = new com.tencent.mm.vfs.b(paramString);
    long l1;
    int j;
    label75: long l2;
    if (((com.tencent.mm.vfs.b)localObject).isDirectory())
    {
      String[] arrayOfString = ((com.tencent.mm.vfs.b)localObject).list();
      if (arrayOfString != null)
      {
        l1 = 0L;
        int i = arrayOfString.length;
        j = 0;
        if (j < i)
        {
          localObject = arrayOfString[j];
          StringBuilder localStringBuilder = new StringBuilder().append(paramString);
          if (paramString.endsWith("/"))
          {
            l2 = HO((String)localObject);
            if (l2 != -1L)
              break label126;
            AppMethodBeat.o(18655);
            l1 = -1L;
          }
        }
      }
    }
    while (true)
    {
      return l1;
      localObject = "/".concat(String.valueOf(localObject));
      break label75;
      label126: l1 += l2;
      j++;
      break;
      AppMethodBeat.o(18655);
      continue;
      l1 = ((com.tencent.mm.vfs.b)localObject).length();
      AppMethodBeat.o(18655);
    }
  }

  private long HP(String paramString)
  {
    long l1 = 0L;
    int i = 0;
    AppMethodBeat.i(18657);
    Object localObject = new com.tencent.mm.vfs.b(paramString);
    if (((com.tencent.mm.vfs.b)localObject).isDirectory())
    {
      localObject = ((com.tencent.mm.vfs.b)localObject).list();
      if (localObject == null)
        break label173;
      int j = localObject.length;
      while (i < j)
      {
        String str = localObject[i];
        l1 += HP(paramString + "/" + str);
        i++;
      }
      AppMethodBeat.o(18657);
    }
    while (true)
    {
      return l1;
      if (System.currentTimeMillis() - ((com.tencent.mm.vfs.b)localObject).lastModified() > clo.longValue())
      {
        ab.i("MicroMsg.CleanCalcLogic", "Clean 7 days file in sns rootPath=%s", new Object[] { paramString });
        long l2 = com.tencent.mm.vfs.e.asZ(paramString);
        if (((com.tencent.mm.vfs.b)localObject).delete())
          this.kvY += l2;
        AppMethodBeat.o(18657);
      }
      else
      {
        label173: l1 = com.tencent.mm.vfs.e.asZ(paramString);
        AppMethodBeat.o(18657);
      }
    }
  }

  private long HQ(String paramString)
  {
    long l1 = 0L;
    int i = 0;
    AppMethodBeat.i(18658);
    com.tencent.mm.vfs.b localb = new com.tencent.mm.vfs.b(paramString);
    if (localb.isDirectory())
    {
      String[] arrayOfString = localb.list();
      if (arrayOfString == null)
        break label173;
      int j = arrayOfString.length;
      while (i < j)
      {
        localb = arrayOfString[i];
        l1 += HQ(paramString + "/" + localb);
        i++;
      }
      AppMethodBeat.o(18658);
    }
    while (true)
    {
      return l1;
      if (System.currentTimeMillis() - localb.lastModified() > kvU.longValue())
      {
        ab.i("MicroMsg.CleanCalcLogic", "Clean 90 days file in music rootPath=%s", new Object[] { paramString });
        long l2 = com.tencent.mm.vfs.e.asZ(paramString);
        if (localb.delete())
          this.kvY += l2;
        AppMethodBeat.o(18658);
      }
      else
      {
        label173: l1 = com.tencent.mm.vfs.e.asZ(paramString);
        AppMethodBeat.o(18658);
      }
    }
  }

  private int a(List<String> paramList, HashSet<String> paramHashSet)
  {
    AppMethodBeat.i(18656);
    String str1 = g.RP().eJL;
    String str2 = g.RP().eJM;
    ab.i("MicroMsg.CleanCalcLogic", "%s get MicroMsg path root[%s] acc[%s]", new Object[] { aZk(), str1, str2 });
    int i = 0;
    int j = 0;
    Object localObject = new com.tencent.mm.vfs.b(str1);
    int k = i;
    if (((com.tencent.mm.vfs.b)localObject).isDirectory())
    {
      String[] arrayOfString = ((com.tencent.mm.vfs.b)localObject).list();
      k = i;
      if (arrayOfString != null)
      {
        int m = arrayOfString.length;
        i = 0;
        k = j;
        if (i < m)
        {
          String str3 = arrayOfString[i];
          localObject = str1 + str3 + "/";
          ab.d("MicroMsg.CleanCalcLogic", "%s sub file path[%s] sub[%s]", new Object[] { aZk(), localObject, str3 });
          if (new com.tencent.mm.vfs.b((String)localObject).isDirectory())
            if (str3.length() >= 32)
              if (!bo.isEqual(str2, (String)localObject))
              {
                paramHashSet.add(localObject);
                paramList.add(localObject);
                j++;
                this.kwa.add(str3);
              }
          while (true)
          {
            i++;
            break;
            if (str2.endsWith("/"));
            for (localObject = str2 + "music"; ; localObject = str2 + "/music")
            {
              paramList.add(localObject);
              aw.ZK();
              paramList.add(com.tencent.mm.model.c.Yb());
              aw.ZK();
              paramList.add(com.tencent.mm.model.c.getAccSnsPath());
              aw.ZK();
              paramList.add(com.tencent.mm.model.c.Yg());
              break;
            }
            paramList.add(localObject);
            j++;
            continue;
            paramList.add(localObject);
            j++;
          }
        }
      }
    }
    AppMethodBeat.o(18656);
    return k;
  }

  private String aZk()
  {
    AppMethodBeat.i(18653);
    String str = hashCode();
    AppMethodBeat.o(18653);
    return str;
  }

  public final void run()
  {
    AppMethodBeat.i(18654);
    long l1 = bo.yz();
    if (this.isStop)
    {
      ab.i("MicroMsg.CleanCalcLogic", "%s start run but stop", new Object[] { aZk() });
      AppMethodBeat.o(18654);
    }
    while (true)
    {
      return;
      ArrayList localArrayList = new ArrayList();
      Object localObject = new HashSet();
      a(localArrayList, (HashSet)localObject);
      int i = localArrayList.size();
      int j = 0;
      while ((!this.isStop) && (j < i))
      {
        String str = (String)localArrayList.get(j);
        if (!bo.isNullOrNil(str))
        {
          if (str.endsWith("/sns/"))
            l2 = HP(str);
          while (true)
          {
            this.kvZ.put(str, Long.valueOf(l2));
            ab.d("MicroMsg.CleanCalcLogic", "%s path[%s] size[%d]", new Object[] { aZk(), str, Long.valueOf(l2) });
            this.kvV += l2;
            if (((HashSet)localObject).contains(str))
              this.kvX = (l2 + this.kvX);
            j++;
            if (this.kwb != null)
              this.kwb.dN(j, i);
            break;
            if (str.endsWith("/music"))
              l2 = HQ(str);
            else
              l2 = HO(str);
          }
        }
      }
      this.kvW = com.tencent.mm.plugin.f.b.aZc().aZd().aZn();
      this.kvV += this.kvW;
      if (this.kvV <= 0L)
      {
        this.kvV = 1L;
        h.pYm.a(714L, 60L, 1L, false);
      }
      ab.i("MicroMsg.CleanCalcLogic", "%s scan finish cost[%d] micromsg[%d] acc[%d] otherAcc[%d]", new Object[] { aZk(), Long.valueOf(bo.az(l1)), Long.valueOf(this.kvV), Long.valueOf(this.kvW), Long.valueOf(this.kvX) });
      localObject = this.kwa;
      if (this.kwb != null)
        this.kwb.a(this.kvV, this.kvW, this.kvX, (HashSet)localObject, this.kvZ);
      j.bgd();
      long l2 = j.bfL();
      j.bgd();
      l1 = j.bfM();
      j = (int)(this.kvV * 100L / l2);
      int k = (int)(this.kvW * 100L / this.kvV);
      i = (int)(this.kvX * 100L / this.kvV);
      long l3 = this.kvV - this.kvW - this.kvX;
      int m = (int)(100L * l3 / this.kvV);
      localObject = new StringBuffer();
      ((StringBuffer)localObject).append(this.kvY).append(",");
      ((StringBuffer)localObject).append(this.kvV).append(",");
      ((StringBuffer)localObject).append(j).append(",");
      ((StringBuffer)localObject).append(l2 - l1).append(",");
      ((StringBuffer)localObject).append(l1).append(",");
      ((StringBuffer)localObject).append(l2).append(",");
      ((StringBuffer)localObject).append(this.kvW).append(",");
      ((StringBuffer)localObject).append(k).append(",");
      ((StringBuffer)localObject).append(this.kvX).append(",");
      ((StringBuffer)localObject).append(i).append(",");
      ((StringBuffer)localObject).append(l3).append(",");
      ((StringBuffer)localObject).append(m);
      localObject = ((StringBuffer)localObject).toString();
      ab.i("MicroMsg.CleanCalcLogic", "rpt content %s", new Object[] { localObject });
      h.pYm.X(14762, (String)localObject);
      stop();
      AppMethodBeat.o(18654);
    }
  }

  public final void stop()
  {
    this.isStop = true;
    this.kwb = null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.b.a
 * JD-Core Version:    0.6.2
 */