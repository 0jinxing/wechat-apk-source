package com.tencent.mm.plugin.hp.b;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.tinker.loader.shareutil.ShareIntentUtil;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;

public final class b
{
  private static long ntt = 0L;

  public static void a(int paramInt, Throwable paramThrowable)
  {
    AppMethodBeat.i(90576);
    switch (paramInt)
    {
    default:
    case 1:
    case 2:
    case 0:
    }
    while (true)
    {
      AppMethodBeat.o(90576);
      while (true)
      {
        return;
        h.pYm.a(338L, 191L, 1L, false);
        h.pYm.g("Tinker", "Tinker Exception:interpret occur instruction exception " + ao.m(paramThrowable), null);
        AppMethodBeat.o(90576);
        continue;
        h.pYm.a(338L, 192L, 1L, false);
        h.pYm.g("Tinker", "Tinker Exception:interpret occur command exception " + ao.m(paramThrowable), null);
        AppMethodBeat.o(90576);
      }
      h.pYm.a(338L, 193L, 1L, false);
    }
  }

  public static void a(Throwable paramThrowable, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(90570);
    switch (paramInt)
    {
    default:
    case -2:
    case -3:
    case -4:
    case -1:
    }
    while (true)
    {
      if (i == 0)
      {
        String str1 = ao.m(paramThrowable);
        paramThrowable = str1;
        if (paramInt == -4)
        {
          Context localContext = ah.getContext();
          String str2 = SharePatchFileUtil.jk(localContext);
          paramThrowable = str1;
          if (!ShareTinkerInternals.isNullOrNil(str2))
          {
            paramThrowable = "tinker checkSafeModeCount fail:\n".concat(String.valueOf(str2));
            SharePatchFileUtil.as(SharePatchFileUtil.jj(localContext));
          }
        }
        h.pYm.g("Tinker", "Tinker Exception:load tinker occur exception ".concat(String.valueOf(paramThrowable)), null);
      }
      AppMethodBeat.o(90570);
      return;
      if (paramThrowable.getMessage().contains("checkDexInstall failed"))
      {
        h.pYm.a(338L, 189L, 1L, false);
        ab.i("Tinker.HotPatchReportHelper", "tinker dex check fail:" + paramThrowable.getMessage());
        i = 1;
      }
      else
      {
        h.pYm.a(338L, 161L, 1L, false);
        ab.e("Tinker.HotPatchReportHelper", "tinker dex reflect fail:" + paramThrowable.getMessage());
        continue;
        if (paramThrowable.getMessage().contains("checkResInstall failed"))
        {
          h.pYm.a(338L, 190L, 1L, false);
          i = 1;
        }
        else
        {
          h.pYm.a(338L, 184L, 1L, false);
          continue;
          h.pYm.a(338L, 188L, 1L, false);
          continue;
          h.pYm.a(338L, 160L, 1L, false);
        }
      }
    }
  }

  public static void ac(Intent paramIntent)
  {
    AppMethodBeat.i(90561);
    KVCommCrossProcessReceiver.cgj();
    ab.i("Tinker.HotPatchReportHelper", "hp_report try to apply patch service start");
    if (paramIntent == null)
    {
      h.pYm.ag(338, 6, 127);
      AppMethodBeat.o(90561);
    }
    while (true)
    {
      return;
      if (ShareIntentUtil.n(paramIntent, "patch_path_extra") == null)
      {
        h.pYm.ag(338, 6, 128);
        AppMethodBeat.o(90561);
      }
      else
      {
        h.pYm.a(338L, 6L, 1L, true);
        AppMethodBeat.o(90561);
      }
    }
  }

  public static void bGf()
  {
    AppMethodBeat.i(90555);
    h.pYm.a(338L, 9L, 1L, false);
    AppMethodBeat.o(90555);
  }

  public static void bGg()
  {
    AppMethodBeat.i(90566);
    h.pYm.a(338L, 106L, 1L, false);
    AppMethodBeat.o(90566);
  }

  public static void bGh()
  {
    AppMethodBeat.i(90567);
    h.pYm.a(338L, 116L, 1L, false);
    AppMethodBeat.o(90567);
  }

  public static void bGi()
  {
    AppMethodBeat.i(90574);
    h.pYm.a(338L, 168L, 1L, false);
    AppMethodBeat.o(90574);
  }

  public static void bGj()
  {
    AppMethodBeat.i(90575);
    h.pYm.a(338L, 5L, 1L, false);
    AppMethodBeat.o(90575);
  }

  public static void e(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(90577);
    h.pYm.e(15974, new Object[] { paramString1, paramString2, paramString3, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.FALSE });
    ab.i("Tinker.HotPatchReportHelper", "CodeVersion:%s PatchVersion:%s TinkerId:%s Scene:%d Result:%d", new Object[] { paramString1, paramString2, paramString3, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    AppMethodBeat.o(90577);
  }

  public static void h(Throwable paramThrowable)
  {
    AppMethodBeat.i(90564);
    h.pYm.a(338L, 104L, 1L, false);
    h.pYm.g("Tinker", "Tinker Exception:apply tinker occur unknown exception " + ao.m(paramThrowable), null);
    AppMethodBeat.o(90564);
  }

  public static void i(Throwable paramThrowable)
  {
    AppMethodBeat.i(90565);
    if (paramThrowable.getMessage().contains("checkDexOptExist failed"))
    {
      h.pYm.a(338L, 134L, 1L, false);
      AppMethodBeat.o(90565);
    }
    while (true)
    {
      return;
      if (paramThrowable.getMessage().contains("checkDexOptFormat failed"))
      {
        h.pYm.a(338L, 135L, 1L, false);
        h.pYm.g("Tinker", "Tinker Exception:apply tinker occur dexOpt format exception " + ao.m(paramThrowable), null);
        AppMethodBeat.o(90565);
      }
      else
      {
        h.pYm.a(338L, 105L, 1L, false);
        h.pYm.g("Tinker", "Tinker Exception:apply tinker occur dexOpt exception " + ao.m(paramThrowable), null);
        AppMethodBeat.o(90565);
      }
    }
  }

  public static void ie(boolean paramBoolean)
  {
    AppMethodBeat.i(90559);
    ab.i("Tinker.HotPatchReportHelper", "hp_report try to apply hotpatch");
    h.pYm.ag(338, 2, 71);
    if (paramBoolean)
      h.pYm.a(338L, 7L, 1L, true);
    AppMethodBeat.o(90559);
  }

  public static void r(long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(90562);
    if (paramBoolean)
      h.pYm.a(338L, 3L, 1L, true);
    if (paramBoolean)
    {
      h.pYm.a(338L, 101L, 1L, false);
      ab.i("Tinker.HotPatchReportHelper", "hp_report report apply cost = %d", new Object[] { Long.valueOf(paramLong) });
      if (paramLong >= 0L)
        break label97;
      ab.e("Tinker.HotPatchReportHelper", "hp_report report apply cost failed, invalid cost");
      AppMethodBeat.o(90562);
    }
    while (true)
    {
      return;
      h.pYm.a(338L, 103L, 1L, false);
      break;
      label97: if (paramLong <= 5000L)
      {
        if (paramBoolean)
        {
          h.pYm.a(338L, 117L, 1L, false);
          AppMethodBeat.o(90562);
        }
        else
        {
          h.pYm.a(338L, 122L, 1L, false);
          AppMethodBeat.o(90562);
        }
      }
      else if (paramLong <= 10000L)
      {
        if (paramBoolean)
        {
          h.pYm.a(338L, 118L, 1L, false);
          AppMethodBeat.o(90562);
        }
        else
        {
          h.pYm.a(338L, 123L, 1L, false);
          AppMethodBeat.o(90562);
        }
      }
      else if (paramLong <= 30000L)
      {
        if (paramBoolean)
        {
          h.pYm.a(338L, 119L, 1L, false);
          AppMethodBeat.o(90562);
        }
        else
        {
          h.pYm.a(338L, 124L, 1L, false);
          AppMethodBeat.o(90562);
        }
      }
      else if (paramLong <= 60000L)
      {
        if (paramBoolean)
        {
          h.pYm.a(338L, 120L, 1L, false);
          AppMethodBeat.o(90562);
        }
        else
        {
          h.pYm.a(338L, 125L, 1L, false);
          AppMethodBeat.o(90562);
        }
      }
      else
      {
        if (paramLong >= 3600000L)
          h.pYm.a(338L, 133L, 1L, false);
        if (paramBoolean)
        {
          h.pYm.a(338L, 121L, 1L, false);
          AppMethodBeat.o(90562);
        }
        else
        {
          h.pYm.a(338L, 126L, 1L, false);
          AppMethodBeat.o(90562);
        }
      }
    }
  }

  public static void s(long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(90569);
    h.pYm.a(338L, 4L, 1L, false);
    if (!paramBoolean)
    {
      h.pYm.a(338L, 159L, 1L, false);
      AppMethodBeat.o(90569);
    }
    while (true)
    {
      return;
      ab.i("Tinker.HotPatchReportHelper", "hp_report report load cost = %d", new Object[] { Long.valueOf(paramLong) });
      if (paramLong < 0L)
      {
        ab.e("Tinker.HotPatchReportHelper", "hp_report report load cost failed, invalid cost");
        AppMethodBeat.o(90569);
      }
      else if (paramLong <= 500L)
      {
        h.pYm.a(338L, 177L, 1L, false);
        AppMethodBeat.o(90569);
      }
      else if (paramLong <= 1000L)
      {
        h.pYm.a(338L, 178L, 1L, false);
        AppMethodBeat.o(90569);
      }
      else if (paramLong <= 3000L)
      {
        h.pYm.a(338L, 179L, 1L, false);
        AppMethodBeat.o(90569);
      }
      else if (paramLong <= 5000L)
      {
        h.pYm.a(338L, 180L, 1L, false);
        AppMethodBeat.o(90569);
      }
      else
      {
        h.pYm.a(338L, 181L, 1L, false);
        AppMethodBeat.o(90569);
      }
    }
  }

  public static void t(boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(90571);
    ab.i("Tinker.HotPatchReportHelper", "hp_report package check failed, error = %d", new Object[] { Integer.valueOf(paramInt) });
    if (paramBoolean)
      h.pYm.a(338L, 170L, 1L, false);
    switch (paramInt)
    {
    default:
    case -1:
    case -3:
    case -4:
    case -6:
    case -5:
    case -7:
    case -2:
    case -8:
    }
    while (true)
    {
      AppMethodBeat.o(90571);
      while (true)
      {
        return;
        h.pYm.ag(338, 169, 171);
        AppMethodBeat.o(90571);
        continue;
        h.pYm.ag(338, 169, 172);
        AppMethodBeat.o(90571);
        continue;
        h.pYm.ag(338, 169, 173);
        AppMethodBeat.o(90571);
        continue;
        h.pYm.ag(338, 169, 175);
        AppMethodBeat.o(90571);
        continue;
        h.pYm.ag(338, 169, 174);
        AppMethodBeat.o(90571);
        continue;
        h.pYm.ag(338, 169, 176);
        AppMethodBeat.o(90571);
        continue;
        h.pYm.ag(338, 107, 182);
        AppMethodBeat.o(90571);
      }
      h.pYm.ag(338, 169, 186);
    }
  }

  public static void wW(int paramInt)
  {
    AppMethodBeat.i(90556);
    ab.i("Tinker.HotPatchReportHelper", "hp_report new hotpatch requested");
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      ntt = bo.yz();
      AppMethodBeat.o(90556);
      return;
      h.pYm.a(338L, 0L, 1L, false);
      continue;
      h.pYm.a(338L, 20L, 1L, false);
      continue;
      h.pYm.a(614L, 0L, 1L, false);
    }
  }

  public static void wX(int paramInt)
  {
    AppMethodBeat.i(90557);
    long l = bo.az(ntt);
    ab.i("Tinker.HotPatchReportHelper", "hp_report report download cost = %d", new Object[] { Long.valueOf(l) });
    switch (paramInt)
    {
    default:
      if (l < 0L)
      {
        ab.e("Tinker.HotPatchReportHelper", "hp_report report download cost failed, invalid cost");
        AppMethodBeat.o(90557);
      }
      break;
    case 1:
    }
    while (true)
    {
      return;
      h.pYm.a(338L, 40L, 1L, false);
      break;
      if (l <= 5000L)
      {
        h.pYm.ag(338, 1, 43);
        AppMethodBeat.o(90557);
      }
      else if (l <= 60000L)
      {
        h.pYm.ag(338, 1, 44);
        AppMethodBeat.o(90557);
      }
      else if (l <= 180000L)
      {
        h.pYm.ag(338, 1, 45);
        AppMethodBeat.o(90557);
      }
      else
      {
        h.pYm.ag(338, 1, 46);
        AppMethodBeat.o(90557);
      }
    }
  }

  public static void wY(int paramInt)
  {
    AppMethodBeat.i(90558);
    ab.i("Tinker.HotPatchReportHelper", "hp_report download failed");
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(90558);
      while (true)
      {
        return;
        h.pYm.a(338L, 41L, 1L, false);
        AppMethodBeat.o(90558);
        continue;
        h.pYm.a(338L, 42L, 1L, false);
        AppMethodBeat.o(90558);
      }
      h.pYm.a(614L, 3L, 1L, false);
    }
  }

  public static void wZ(int paramInt)
  {
    AppMethodBeat.i(90560);
    ab.i("Tinker.HotPatchReportHelper", "hp_report try to apply hotpatch fail");
    switch (paramInt)
    {
    case -19:
    case -18:
    case -17:
    case -16:
    case -15:
    case -14:
    case -13:
    case -12:
    case -11:
    case -10:
    case -9:
    case -8:
    default:
    case -2:
    case -1:
    case -4:
    case -3:
    case -5:
    case -21:
    case -20:
    case -6:
    case -22:
    case -23:
    case -24:
    case -25:
    case -26:
    case -7:
    }
    while (true)
    {
      AppMethodBeat.o(90560);
      while (true)
      {
        return;
        h.pYm.a(338L, 75L, 1L, false);
        AppMethodBeat.o(90560);
        continue;
        h.pYm.a(338L, 72L, 1L, false);
        AppMethodBeat.o(90560);
        continue;
        h.pYm.a(338L, 74L, 1L, false);
        AppMethodBeat.o(90560);
        continue;
        h.pYm.a(338L, 73L, 1L, false);
        AppMethodBeat.o(90560);
        continue;
        h.pYm.a(338L, 85L, 1L, false);
        AppMethodBeat.o(90560);
        continue;
        h.pYm.a(338L, 77L, 1L, false);
        AppMethodBeat.o(90560);
        continue;
        h.pYm.a(338L, 76L, 1L, false);
        AppMethodBeat.o(90560);
        continue;
        h.pYm.a(338L, 78L, 1L, false);
        AppMethodBeat.o(90560);
        continue;
        h.pYm.a(338L, 80L, 1L, false);
        AppMethodBeat.o(90560);
        continue;
        h.pYm.a(338L, 79L, 1L, false);
        AppMethodBeat.o(90560);
        continue;
        h.pYm.a(338L, 81L, 1L, false);
        AppMethodBeat.o(90560);
        continue;
        h.pYm.a(338L, 82L, 1L, false);
        AppMethodBeat.o(90560);
        continue;
        h.pYm.a(338L, 83L, 1L, false);
        AppMethodBeat.o(90560);
      }
      h.pYm.a(338L, 84L, 1L, false);
    }
  }

  public static void xa(int paramInt)
  {
    AppMethodBeat.i(90563);
    ab.i("Tinker.HotPatchReportHelper", "hp_report package check failed, error = %d", new Object[] { Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    default:
    case -1:
    case -3:
    case -4:
    case -6:
    case -5:
    case -7:
    case -2:
    case -8:
    }
    while (true)
    {
      AppMethodBeat.o(90563);
      while (true)
      {
        return;
        h.pYm.ag(338, 107, 108);
        AppMethodBeat.o(90563);
        continue;
        h.pYm.ag(338, 107, 109);
        AppMethodBeat.o(90563);
        continue;
        h.pYm.ag(338, 107, 110);
        AppMethodBeat.o(90563);
        continue;
        h.pYm.ag(338, 107, 112);
        AppMethodBeat.o(90563);
        continue;
        h.pYm.ag(338, 107, 111);
        AppMethodBeat.o(90563);
        continue;
        h.pYm.ag(338, 107, 113);
        AppMethodBeat.o(90563);
        continue;
        h.pYm.ag(338, 107, 129);
        AppMethodBeat.o(90563);
      }
      h.pYm.ag(338, 107, 131);
    }
  }

  public static void xb(int paramInt)
  {
    AppMethodBeat.i(90568);
    switch (paramInt)
    {
    case 2:
    case 4:
    default:
    case 3:
    case 5:
    case 1:
    case 6:
    case 7:
    }
    while (true)
    {
      AppMethodBeat.o(90568);
      while (true)
      {
        return;
        h.pYm.a(338L, 114L, 1L, false);
        AppMethodBeat.o(90568);
        continue;
        h.pYm.a(338L, 115L, 1L, false);
        AppMethodBeat.o(90568);
        continue;
        h.pYm.a(338L, 130L, 1L, false);
        AppMethodBeat.o(90568);
        continue;
        h.pYm.a(338L, 132L, 1L, false);
        AppMethodBeat.o(90568);
      }
      h.pYm.a(338L, 136L, 1L, false);
    }
  }

  public static void xc(int paramInt)
  {
    AppMethodBeat.i(90572);
    switch (paramInt)
    {
    default:
    case 4:
    case 3:
    case 5:
    case 1:
    case 2:
    case 6:
    }
    while (true)
    {
      AppMethodBeat.o(90572);
      while (true)
      {
        return;
        h.pYm.a(338L, 183L, 1L, false);
        AppMethodBeat.o(90572);
        continue;
        h.pYm.a(338L, 164L, 1L, false);
        AppMethodBeat.o(90572);
        continue;
        h.pYm.a(338L, 165L, 1L, false);
        AppMethodBeat.o(90572);
        continue;
        h.pYm.a(338L, 166L, 1L, false);
        AppMethodBeat.o(90572);
        continue;
        h.pYm.a(338L, 167L, 1L, false);
        AppMethodBeat.o(90572);
      }
      h.pYm.a(338L, 187L, 1L, false);
    }
  }

  public static void xd(int paramInt)
  {
    AppMethodBeat.i(90573);
    switch (paramInt)
    {
    case 4:
    default:
    case 3:
    case 5:
    case 6:
    }
    while (true)
    {
      AppMethodBeat.o(90573);
      while (true)
      {
        return;
        h.pYm.a(338L, 162L, 1L, false);
        AppMethodBeat.o(90573);
        continue;
        h.pYm.a(338L, 163L, 1L, false);
        AppMethodBeat.o(90573);
      }
      h.pYm.a(338L, 185L, 1L, false);
    }
  }

  public static enum a
  {
    public final int value;

    static
    {
      AppMethodBeat.i(90551);
      ntu = new a("FAILED", 0, 0);
      ntv = new a("SUCCESS", 1, 1);
      ntw = new a[] { ntu, ntv };
      AppMethodBeat.o(90551);
    }

    private a(int paramInt)
    {
      this.value = paramInt;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.hp.b.b
 * JD-Core Version:    0.6.2
 */