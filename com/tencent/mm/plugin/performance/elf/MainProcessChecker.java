package com.tencent.mm.plugin.performance.elf;

import android.os.Debug;
import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.expt.a.a;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bn;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mmkv.MMKV;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class MainProcessChecker extends AbstractProcessChecker
{
  private static final long[] pfE = { 0L, 86400000L };
  private static String pfO = "";
  private boolean nDl;
  private int pfA;
  private float pfB;
  private boolean pfC;
  private boolean pfD;
  private long pfF;
  private long pfG;
  private long pfH;
  private long pfI;
  private long pfJ;
  private int pfK;
  private long pfL;
  private StringBuilder pfM;
  private long pfN;
  private long pfu;
  private long pfv;
  private long pfw;
  private long pfx;
  private int pfy;
  private float pfz;

  public MainProcessChecker()
  {
    AppMethodBeat.i(111058);
    this.pfu = 1048576L;
    this.pfv = 6000L;
    this.pfw = 734003200L;
    this.pfx = this.pfw;
    this.pfy = 95;
    this.pfz = (this.pfy * 0.01F);
    this.pfA = 85;
    this.pfB = (this.pfA * 0.01F);
    this.nDl = false;
    this.pfC = true;
    this.pfD = false;
    this.pfK = 1;
    this.pfM = new StringBuilder();
    this.pfN = 0L;
    AppMethodBeat.o(111058);
  }

  public static void UD(String paramString)
  {
    pfO = paramString;
  }

  private void bZq()
  {
    AppMethodBeat.i(111066);
    this.pfF = bn.mu(0L);
    this.pfG = bn.mv(0L);
    this.pfH = bn.mt(0L);
    this.pfI = bn.dpy();
    this.pfJ = bZo();
    AppMethodBeat.o(111066);
  }

  private static boolean eV(int paramInt1, int paramInt2)
  {
    if ((paramInt1 & paramInt2) > 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void jK(boolean paramBoolean)
  {
    AppMethodBeat.i(111065);
    if ((!ah.bqo()) || (!this.nDl))
      AppMethodBeat.o(111065);
    while (true)
    {
      return;
      if (paramBoolean)
      {
        e.pXa.a(959L, 0L, 1L, true);
        e.pXa.a(959L, 2L, 1L, true);
        if (eV(this.pfK, 64))
          e.pXa.a(959L, 3L, 1L, true);
        if (eV(this.pfK, 256))
          e.pXa.a(959L, 4L, 1L, true);
        if (eV(this.pfK, 128))
          e.pXa.a(959L, 5L, 1L, true);
      }
      while (true)
      {
        if (!eV(this.pfK, 4))
          break label369;
        e.pXa.a(959L, 106L, 1L, false);
        AppMethodBeat.o(111065);
        break;
        if (eV(this.pfK, 8))
          e.pXa.a(959L, 100L, 1L, true);
        else if (eV(this.pfK, 16))
          e.pXa.a(959L, 101L, 1L, true);
        else if (eV(this.pfK, 32))
          e.pXa.a(959L, 102L, 1L, true);
        else if (eV(this.pfK, 512))
          e.pXa.a(959L, 103L, 1L, true);
        else if (eV(this.pfK, 1024))
          e.pXa.a(959L, 104L, 1L, true);
        else if ((eV(this.pfK, 64)) || (eV(this.pfK, 128)) || (eV(this.pfK, 256)))
          e.pXa.a(959L, 105L, 1L, true);
      }
      label369: e.pXa.a(959L, 107L, 1L, false);
      AppMethodBeat.o(111065);
    }
  }

  public final boolean Q(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(111062);
    ab.i(getTag(), "[onCheck] processId:%s loopCheckTime:%sms isEnable:%s isForeground:%s", new Object[] { Long.valueOf(paramLong1), Long.valueOf(paramLong2), Boolean.valueOf(this.nDl), Boolean.valueOf(this.caA) });
    try
    {
      if (!this.nDl)
      {
        this.pfK |= 0;
        bZq();
        jK(false);
        this.pfK = 1;
        bool = false;
        AppMethodBeat.o(111062);
      }
      while (true)
      {
        return bool;
        if (bo.isNullOrNil(this.pfi.pfl))
        {
          ab.w("MicroMsg.MainProcessChecker", "it's never start activity! just return.");
          this.pfK |= 2;
          bZq();
          jK(false);
          this.pfK = 1;
          bool = false;
          AppMethodBeat.o(111062);
        }
        else if (this.caA)
        {
          ab.w("MicroMsg.MainProcessChecker", "isForeground true! just return.");
          this.pfK |= 4;
          bZq();
          jK(false);
          this.pfK = 1;
          bool = false;
          AppMethodBeat.o(111062);
        }
        else
        {
          if (SystemClock.uptimeMillis() - this.pfN >= paramLong2);
          for (i = 1; ; i = 0)
          {
            if (i != 0)
              break label278;
            ab.w("MicroMsg.MainProcessChecker", "it's not enough loopCheckTime[%s], just return.", new Object[] { Long.valueOf(paramLong2) });
            this.pfK |= 4;
            bZq();
            jK(false);
            this.pfK = 1;
            bool = false;
            AppMethodBeat.o(111062);
            break;
          }
          label278: paramLong1 = System.currentTimeMillis();
          Calendar localCalendar = Calendar.getInstance();
          localCalendar.set(11, 0);
          localCalendar.set(13, 0);
          localCalendar.set(12, 0);
          localCalendar.set(14, 0);
          paramLong1 -= localCalendar.getTimeInMillis();
          if ((b.DEBUG) || ((pfE[0] <= paramLong1) && (paramLong1 <= pfE[1])));
          for (i = 1; ; i = 0)
          {
            if (i != 0)
              break label437;
            ab.w("MicroMsg.MainProcessChecker", "it's not at workTime[%s-%s], just return.", new Object[] { Long.valueOf(pfE[0]), Long.valueOf(pfE[1]) });
            this.pfK |= 8;
            bZq();
            jK(false);
            this.pfK = 1;
            bool = false;
            AppMethodBeat.o(111062);
            break;
          }
          label437: if (this.pfD)
          {
            if ((!this.caA) && (pfO.equalsIgnoreCase(this.pfi.pfl)));
            for (i = 1; ; i = 0)
            {
              if (i != 0)
                break label525;
              ab.w("MicroMsg.MainProcessChecker", "it cares if it whether LauncherUI to back but it's not, just return.");
              this.pfK |= 16;
              bZq();
              jK(false);
              this.pfK = 1;
              bool = false;
              AppMethodBeat.o(111062);
              break;
            }
          }
          label525: if (!bZp())
            break;
          this.pfK |= 32;
          bZq();
          jK(false);
          this.pfK = 1;
          bool = false;
          AppMethodBeat.o(111062);
        }
      }
      if (this.pfC)
      {
        paramLong1 = bn.mu(this.pfF) + bn.mv(this.pfG) + bn.mt(this.pfH) + bn.mv(this.pfI);
        ab.i(getTag(), "[isTraffic] diff:%s byte", new Object[] { Long.valueOf(paramLong1) });
        if ((float)paramLong1 > 1.0F * (float)paramLong2 / 60000.0F * (float)this.pfu);
        for (i = 1; ; i = 0)
        {
          if (i == 0)
            break label709;
          this.pfK |= 512;
          ab.i(getTag(), "is over Traffic, just return");
          bZq();
          jK(false);
          this.pfK = 1;
          bool = false;
          AppMethodBeat.o(111062);
          break;
        }
      }
      label709: if (this.pfC)
      {
        paramLong1 = bZo() - this.pfJ;
        ab.i(getTag(), "[isCpuBusy] diff:%s Jiffies", new Object[] { Long.valueOf(paramLong1) });
        if ((float)paramLong1 >= 1.0F * (float)paramLong2 / 60000.0F * (float)this.pfv);
        for (i = 1; ; i = 0)
        {
          if (i == 0)
            break label827;
          this.pfK |= 1024;
          ab.i(getTag(), "is cpu busy, just return");
          bZq();
          jK(false);
          this.pfK = 1;
          bool = false;
          AppMethodBeat.o(111062);
          break;
        }
      }
      label827: paramLong2 = Runtime.getRuntime().maxMemory();
      paramLong1 = Runtime.getRuntime().totalMemory();
      boolean bool = false;
      ab.i(getTag(), "[isOverMemory] java[%s:%s]", new Object[] { Float.valueOf(1.0F * (float)paramLong1 / (float)paramLong2), Float.valueOf(this.pfB) });
      if (1.0F * (float)paramLong1 / (float)paramLong2 >= this.pfB)
      {
        this.pfK |= 64;
        bool = true;
      }
      paramLong1 = zJ();
      ab.i(getTag(), "[isOverMemory] vm[%s:%s]", new Object[] { Float.valueOf(1.0F * (float)paramLong1 / 4.294967E+009F), Float.valueOf(this.pfz) });
      if (1.0F * (float)paramLong1 / 4.294967E+009F >= this.pfz)
      {
        this.pfK |= 256;
        bool = true;
      }
      paramLong1 = Debug.getNativeHeapSize();
      ab.w(getTag(), "[isOverMemory] native[%s:%s]", new Object[] { Long.valueOf(paramLong1), Long.valueOf(this.pfx) });
      if (paramLong1 > this.pfx);
      for (int i = 1; ; i = 0)
      {
        if (i != 0)
        {
          this.pfK |= 256;
          bool = true;
        }
        bZq();
        jK(bool);
        this.pfK = 1;
        AppMethodBeat.o(111062);
        break;
      }
    }
    finally
    {
      bZq();
      jK(false);
      this.pfK = 1;
      AppMethodBeat.o(111062);
    }
  }

  protected final void awE()
  {
    AppMethodBeat.i(111061);
    ab.i(getTag(), "onScreenOff enable:%s", new Object[] { Boolean.valueOf(this.nDl) });
    if (!this.nDl)
      AppMethodBeat.o(111061);
    while (true)
    {
      return;
      if ((b.DEBUG) || (zJ() >= 4209067950.0799999D) || (Debug.getNativeHeapSize() > this.pfw * 1.4D) || (1.0F * (float)Runtime.getRuntime().totalMemory() / (float)Runtime.getRuntime().maxMemory() >= 0.98D))
        bZk();
      AppMethodBeat.o(111061);
    }
  }

  protected final String bZl()
  {
    AppMethodBeat.i(111060);
    StringBuilder localStringBuilder = new StringBuilder(this.pfM);
    localStringBuilder.append(super.bZl());
    Object localObject = new HashMap();
    int i = U((Map)localObject);
    if (i >= 300)
    {
      localStringBuilder.append("threadCount:").append(i).append("\n");
      localStringBuilder.append(((HashMap)localObject).toString()).append("\n");
      e.pXa.a(959L, 8L, 1L, true);
    }
    localObject = localStringBuilder.toString();
    AppMethodBeat.o(111060);
    return localObject;
  }

  protected final long bZm()
  {
    return this.pfL;
  }

  protected final void eU(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(111064);
    super.eU(paramInt1, paramInt2);
    ab.w(getTag(), "[onCallUp] %s -> %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
    if (ah.bqo())
    {
      e.pXa.a(959L, 1L, 1L, true);
      this.pfh.postDelayed(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(111057);
          if (MainProcessChecker.this.pfi.pfm)
          {
            ab.w(MainProcessChecker.this.getTag(), "[onCallUp] My God, you saw me!");
            e.pXa.a(959L, 7L, 1L, true);
            AppMethodBeat.o(111057);
          }
          while (true)
          {
            return;
            ab.w(MainProcessChecker.this.getTag(), "[onCallUp] you can't see me, perry!");
            AppMethodBeat.o(111057);
          }
        }
      }
      , 30000L);
    }
    AppMethodBeat.o(111064);
  }

  protected String getTag()
  {
    return "MicroMsg.MainProcessChecker";
  }

  protected final boolean isEnable()
  {
    return this.nDl;
  }

  public final void jJ(boolean paramBoolean)
  {
    AppMethodBeat.i(111063);
    super.jJ(paramBoolean);
    ab.i("MicroMsg.MainProcessChecker", "[onAppForeground] isForeground:%s", new Object[] { Boolean.valueOf(paramBoolean) });
    if (!paramBoolean)
      this.pfN = SystemClock.uptimeMillis();
    AppMethodBeat.o(111063);
  }

  public final void start()
  {
    AppMethodBeat.i(111059);
    super.start();
    try
    {
      if (g.K(a.class) == null)
      {
        ab.w("MicroMsg.MainProcessChecker", "IExptService is null!");
        AppMethodBeat.o(111059);
      }
      while (true)
      {
        return;
        this.pfx = ((a)g.K(a.class)).a(a.a.lHt, this.pfw);
        this.pfz = (((a)g.K(a.class)).a(a.a.lHu, this.pfy) * 0.01F);
        this.pfB = (((a)g.K(a.class)).a(a.a.lHv, this.pfA) * 0.01F);
        pfE[0] = ((a)g.K(a.class)).a(a.a.lHw, 0);
        pfE[1] = ((a)g.K(a.class)).a(a.a.lHx, 86400000L);
        this.pfu = ((a)g.K(a.class)).a(a.a.lHD, 1048576L);
        this.pfv = ((a)g.K(a.class)).a(a.a.lHC, 6000L);
        try
        {
          this.nDl = MMKV.defaultMMKV().getBoolean("MicroMsg.ProcessElf", false);
          this.pfC = ((a)g.K(a.class)).a(a.a.lHz, true);
          this.pfD = ((a)g.K(a.class)).a(a.a.lHA, false);
          this.pfL = ((a)g.K(a.class)).a(a.a.lHB, 1200000L);
          this.pfM.append(" \n***************ProcessElf Config****************\n| isEnable:").append(this.nDl).append("\n| isHardMode:").append(this.pfC).append("\n| workTime:").append(pfE[0]).append("-").append(pfE[1]).append("ms\n| NATIVE_SIZE:").append(this.pfx).append("B\n| MEMORY_VM_TOP:").append(this.pfz).append("%\n| MEMORY_JAVA_TOP:").append(this.pfB).append("%\n| TRAFFIC_PER_MIN:").append(this.pfu).append("B\n| JIFFIES_PER_MIN:").append(this.pfv).append("jiffy\n| CHECK_TIME:").append(this.pfL).append("ms\n************************************************\n");
          ab.i("MicroMsg.MainProcessChecker", this.pfM.toString());
          AppMethodBeat.o(111059);
        }
        catch (Exception localException1)
        {
          while (true)
          {
            ab.printErrStackTrace("MicroMsg.MainProcessChecker", localException1, "", new Object[0]);
            this.nDl = false;
          }
        }
      }
    }
    catch (Exception localException2)
    {
      while (true)
      {
        ab.e("MicroMsg.MainProcessChecker", "[resetConfig] ERROR!!! %s", new Object[] { localException2 });
        AppMethodBeat.o(111059);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.performance.elf.MainProcessChecker
 * JD-Core Version:    0.6.2
 */