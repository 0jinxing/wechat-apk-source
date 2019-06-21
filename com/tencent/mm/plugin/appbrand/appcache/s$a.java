package com.tencent.mm.plugin.appbrand.appcache;

import android.os.SystemClock;
import com.tencent.mars.smc.IDKey;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.a.a;
import com.tencent.mm.plugin.appbrand.launching.h;
import com.tencent.mm.plugin.appbrand.report.c;
import com.tencent.mm.plugin.appbrand.report.model.kv_14609;
import com.tencent.mm.pluginsdk.g.a.c.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.regex.Pattern;

final class s$a
  implements z.a
{
  private final a gSV;
  private final int gSW;
  private final boolean gSX;
  private a gSY;
  private ArrayList<IDKey> gSZ;
  private long gTa;
  private long gTb;
  private long gTc;
  private kv_14609 gTd;

  private s$a(a parama)
  {
    AppMethodBeat.i(129372);
    this.gTa = 0L;
    this.gTb = 0L;
    this.gTc = 0L;
    this.gSV = parama;
    int i;
    if (s.xq(parama.appId))
    {
      i = 776;
      this.gSW = i;
      parama = parama.appId.split(Pattern.quote("$"));
      if (parama != null)
        break label92;
      i = -1;
      label67: if (i != 2)
        break label98;
    }
    label92: label98: for (boolean bool = true; ; bool = false)
    {
      this.gSX = bool;
      AppMethodBeat.o(129372);
      return;
      i = 368;
      break;
      i = parama.length;
      break label67;
    }
  }

  private void avI()
  {
    AppMethodBeat.i(129375);
    try
    {
      com.tencent.mm.plugin.report.e.pXa.b(this.gSZ, false);
      this.gSZ.clear();
      AppMethodBeat.o(129375);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(129375);
    }
  }

  private void cN(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(129374);
    if (this.gSZ == null)
      this.gSZ = new ArrayList();
    this.gSZ.add(new IDKey(paramInt1, paramInt2, 1));
    AppMethodBeat.o(129374);
  }

  private void nr(int paramInt)
  {
    AppMethodBeat.i(129373);
    cN(this.gSW, paramInt);
    AppMethodBeat.o(129373);
  }

  public final void a(m paramm)
  {
    AppMethodBeat.i(129379);
    long l = SystemClock.elapsedRealtime() - this.gTa;
    int i;
    if ((paramm != null) && (paramm.status == 2))
      i = 1;
    while (true)
    {
      if (this.gSY != null);
      int j;
      switch (s.1.gSU[this.gSY.ordinal()])
      {
      default:
        if ((i == 0) && (!"@LibraryAppId".equals(this.gSV.appId)) && (999 != this.gSV.cBc))
        {
          if ((paramm != null) && ((paramm.httpStatusCode == 404) || (paramm.httpStatusCode == 403)))
          {
            j = 23;
            label141: c.K(this.gSV.appId, j, this.gSV.cBc + 1);
          }
        }
        else
          if (paramm == null)
            break label460;
        break;
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      }
      try
      {
        if (paramm.status == 2)
        {
          j = 1;
          label177: if ((a.gTg != this.gSY) && (a.gTi != this.gSY))
            break label484;
        }
        label460: label484: for (String str = ""; ; str = this.gSV.appId)
        {
          c.a(str, this.gSY.value, j, l, this.gSX);
          avI();
          if (this.gTd != null)
          {
            if (i != 0)
              break label588;
            this.gTd.aLx();
            if (!(this.gSV instanceof al))
              break label577;
            if (paramm != null)
              break label524;
            this.gTd.pL(3);
            if ((this.gSV instanceof bc))
              this.gTd.iCq = l;
            this.gTd.IF();
            if ((!(this.gSV instanceof bc)) && (!(this.gSV instanceof al)))
              this.gTd.iCp = l;
          }
          AppMethodBeat.o(129379);
          return;
          i = 0;
          break;
          if (i != 0);
          for (j = 2; ; j = 3)
          {
            nr(j);
            break;
          }
          if (i != 0);
          for (j = 11; ; j = 12)
          {
            nr(j);
            break;
          }
          if (i != 0);
          for (j = 21; ; j = 22)
          {
            nr(j);
            break;
          }
          if (i != 0);
          for (j = 36; ; j = 37)
          {
            nr(j);
            break;
          }
          if (i != 0);
          for (j = 47; ; j = 48)
          {
            nr(j);
            break;
          }
          j = 19;
          break label141;
          if ((paramm != null) && (paramm.status == 4))
          {
            j = 3;
            break label177;
          }
          j = 2;
          break label177;
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.AppBrand.PkgDownloadReporterImpl", localException, "report onEnd, appId %s", new Object[] { this.gSV.appId });
          continue;
          label524: if (paramm.httpStatusCode == 410)
          {
            this.gTd.pL(1);
          }
          else if (paramm.httpStatusCode == 404)
          {
            this.gTd.pL(2);
          }
          else
          {
            this.gTd.pL(3);
            continue;
            label577: this.gTd.pL(0);
            continue;
            label588: if ((this.gSV instanceof al))
              this.gTd.iCm = com.tencent.mm.a.e.cs(this.gSV.getFilePath());
            else
              this.gTd.iCl = com.tencent.mm.a.e.cs(this.gSV.getFilePath());
          }
        }
      }
    }
  }

  public final void avp()
  {
    int i = 0;
    AppMethodBeat.i(129376);
    Object localObject;
    label89: int j;
    if ((this.gSV instanceof al))
      if ("@LibraryAppId".equals(this.gSV.appId))
      {
        localObject = a.gTi;
        this.gSY = ((a)localObject);
        this.gTd = new kv_14609(this.gSV.appId, ((al)this.gSV).gTP, ((al)this.gSV).gTQ);
        this.gTd.iCn = bo.anU();
        switch (s.1.gSU[this.gSY.ordinal()])
        {
        default:
          j = i;
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        }
      }
    while (true)
    {
      nr(j);
      this.gTa = SystemClock.elapsedRealtime();
      AppMethodBeat.o(129376);
      return;
      localObject = a.gTh;
      break;
      if ("@LibraryAppId".equals(this.gSV.appId))
      {
        this.gSY = a.gTg;
        break label89;
      }
      if (j.a.np(this.gSV.cBc))
      {
        WxaPkgWrappingInfo localWxaPkgWrappingInfo = h.bm(this.gSV.appId, 1);
        if (localWxaPkgWrappingInfo != null)
        {
          localObject = a.gTf;
          label223: this.gSY = ((a)localObject);
          localObject = this.gSV.appId;
          if (localWxaPkgWrappingInfo != null)
            break label283;
        }
        label283: for (j = 0; ; j = localWxaPkgWrappingInfo.gVu)
        {
          this.gTd = new kv_14609((String)localObject, j, this.gSV.version);
          this.gTd.iCn = bo.anU();
          break;
          localObject = a.gTe;
          break label223;
        }
      }
      this.gSY = a.gTe;
      break label89;
      j = 1;
      continue;
      j = 10;
      continue;
      j = 20;
      continue;
      j = 35;
      continue;
      j = 46;
    }
  }

  public final void avq()
  {
    AppMethodBeat.i(129377);
    nr(32);
    AppMethodBeat.o(129377);
  }

  public final void avr()
  {
    AppMethodBeat.i(129378);
    switch (s.1.gSU[this.gSY.ordinal()])
    {
    case 4:
    default:
    case 3:
    case 5:
    }
    for (int i = 31; ; i = 30)
    {
      nr(i);
      AppMethodBeat.o(129378);
      return;
    }
  }

  public final void avs()
  {
    AppMethodBeat.i(129380);
    this.gTc = SystemClock.elapsedRealtime();
    cN(697, 1);
    AppMethodBeat.o(129380);
  }

  public final void avt()
  {
    AppMethodBeat.i(129382);
    if ((a.gTg != this.gSY) && (a.gTi != this.gSY))
      c.K(this.gSV.appId, 20, this.gSV.cBc + 1);
    AppMethodBeat.o(129382);
  }

  public final void avu()
  {
    AppMethodBeat.i(129383);
    this.gTb = SystemClock.elapsedRealtime();
    switch (s.1.gSU[this.gSY.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      AppMethodBeat.o(129383);
      while (true)
      {
        return;
        nr(5);
        AppMethodBeat.o(129383);
        continue;
        nr(14);
        AppMethodBeat.o(129383);
        continue;
        nr(24);
        AppMethodBeat.o(129383);
        continue;
        nr(41);
        AppMethodBeat.o(129383);
      }
      nr(49);
    }
  }

  public final void avv()
  {
    AppMethodBeat.i(129385);
    nr(56);
    AppMethodBeat.o(129385);
  }

  public final void dA(boolean paramBoolean)
  {
    AppMethodBeat.i(129386);
    if (!paramBoolean)
      nr(57);
    while (true)
    {
      if (this.gTd != null)
      {
        long l1 = SystemClock.elapsedRealtime();
        long l2 = this.gTa;
        this.gTd.iCq = (l1 - l2);
      }
      AppMethodBeat.o(129386);
      return;
      if ((this.gTd != null) && ((this.gSV instanceof bc)))
        this.gTd.iCl = com.tencent.mm.a.e.cs(((bc)this.gSV).aws());
    }
  }

  public final void dz(boolean paramBoolean)
  {
    AppMethodBeat.i(129384);
    long l1 = SystemClock.elapsedRealtime();
    long l2 = this.gTb;
    int i;
    String str;
    switch (s.1.gSU[this.gSY.ordinal()])
    {
    default:
      i = 0;
      nr(i);
      avI();
      if ((a.gTg == this.gSY) || (a.gTi == this.gSY))
      {
        str = "";
        label97: int j = this.gSY.value;
        if (!paramBoolean)
          break label327;
        i = 1;
        label113: c.a(str, j + 1, i, l1 - l2, this.gSX);
        if (!paramBoolean)
          c.K(this.gSV.appId, 22, this.gSV.cBc + 1);
        if (this.gTd != null)
        {
          this.gTd.aLx();
          if ((this.gSY != a.gTh) && (this.gSY != a.gTi))
            break label345;
          if (!paramBoolean)
            break label333;
          this.gTd.iCj = true;
          this.gTd.iCk = true;
        }
      }
      break;
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      this.gTd.IF();
      AppMethodBeat.o(129384);
      return;
      if (paramBoolean)
      {
        i = 6;
        break;
      }
      i = 7;
      break;
      if (paramBoolean)
      {
        i = 15;
        break;
      }
      i = 16;
      break;
      if (paramBoolean)
      {
        i = 25;
        break;
      }
      i = 26;
      break;
      if (paramBoolean)
      {
        i = 42;
        break;
      }
      i = 43;
      break;
      if (paramBoolean)
      {
        i = 50;
        break;
      }
      i = 51;
      break;
      str = this.gSV.appId;
      break label97;
      label327: i = 2;
      break label113;
      label333: this.gTd.pL(6);
      continue;
      label345: this.gTd.iCj = paramBoolean;
    }
  }

  public final void nq(int paramInt)
  {
    AppMethodBeat.i(129381);
    SystemClock.elapsedRealtime();
    if (paramInt == 0)
    {
      cN(697, 2);
      avI();
      if (this.gTd == null)
        break label136;
      if (paramInt == 0)
        break label116;
      if (paramInt != -4)
        break label105;
      this.gTd.pL(4);
      label51: this.gTd.aLx();
      this.gTd.IF();
      AppMethodBeat.o(129381);
    }
    while (true)
    {
      return;
      if (paramInt < 0)
      {
        cN(697, -paramInt);
        break;
      }
      if (paramInt != 1)
        break;
      cN(697, 10);
      break;
      label105: this.gTd.pL(5);
      break label51;
      label116: this.gTd.iCl = com.tencent.mm.a.e.cs(((al)this.gSV).avR());
      label136: AppMethodBeat.o(129381);
    }
  }

  static enum a
  {
    final int value;

    static
    {
      AppMethodBeat.i(129371);
      gTe = new a("DOWNLOAD", 0, 1);
      gTf = new a("UPDATE", 1, 4);
      gTg = new a("LIB_UPDATE", 2, 7);
      gTh = new a("INCREMENTAL_UPDATE", 3, 10);
      gTi = new a("LIB_INCREMENTAL_UPDATE", 4, 13);
      gTj = new a[] { gTe, gTf, gTg, gTh, gTi };
      AppMethodBeat.o(129371);
    }

    private a(int paramInt)
    {
      this.value = paramInt;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.s.a
 * JD-Core Version:    0.6.2
 */