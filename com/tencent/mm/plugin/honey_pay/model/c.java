package com.tencent.mm.plugin.honey_pay.model;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.su;
import com.tencent.mm.g.a.uq;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bf;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.protocal.protobuf.ask;
import com.tencent.mm.protocal.protobuf.bab;
import com.tencent.mm.protocal.protobuf.btn;
import com.tencent.mm.protocal.protobuf.chl;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.MMActivity;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

public final class c
{
  private static String nqM;

  static
  {
    AppMethodBeat.i(41769);
    nqM = com.tencent.mm.compatible.util.e.eSn + "wallet";
    AppMethodBeat.o(41769);
  }

  public static void OC(String paramString)
  {
    AppMethodBeat.i(41767);
    Object localObject = new uq();
    ((uq)localObject).cQP.scene = 8;
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    ab.i("MicroMsg.HoneyPayUtil", "trigger offline event");
    localObject = new su();
    ((su)localObject).cOT.cOU = false;
    ((su)localObject).cOT.scene = 1;
    ((su)localObject).cOT.cOV = true;
    ((su)localObject).cOT.cOW = 65281;
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    if (!bo.isNullOrNil(paramString))
      com.tencent.mm.plugin.offline.c.a.Ue(paramString);
    AppMethodBeat.o(41767);
  }

  public static void U(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(41764);
    o(paramString1, paramString2, paramString3, null);
    AppMethodBeat.o(41764);
  }

  public static void V(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(41766);
    ab.i("MicroMsg.HoneyPayUtil", "insert sys msg: %s, %s", new Object[] { paramString1, Boolean.valueOf(bo.isNullOrNil(paramString2)) });
    if ((!bo.isNullOrNil(paramString2)) && (!bo.isNullOrNil(paramString1)))
    {
      paramString2 = z(z(paramString2, paramString1, -1), paramString3, -1);
      paramString3 = new bi();
      paramString3.hO(0);
      paramString3.ju(paramString1);
      paramString3.setStatus(3);
      paramString3.setContent(paramString2);
      paramString3.eJ(bf.q(paramString1, System.currentTimeMillis() / 1000L));
      paramString3.setType(10000);
      paramString3.hY(paramString3.field_flag | 0x8);
      long l = ((j)g.K(j.class)).bOr().Z(paramString3);
      ab.i("MicroMsg.HoneyPayUtil", "insert msgId: %s", new Object[] { Long.valueOf(l) });
      if (l <= 0L)
        ab.w("MicroMsg.HoneyPayUtil", "insert sys msg fail!");
    }
    AppMethodBeat.o(41766);
  }

  public static int Y(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(41763);
    int i;
    if (paramBoolean)
    {
      i = -1;
      if (paramInt == 1)
      {
        i = 2131231374;
        AppMethodBeat.o(41763);
      }
    }
    while (true)
    {
      return i;
      if (paramInt == 2)
      {
        i = 2131231375;
        break;
      }
      if (paramInt != 3)
        break;
      i = 2131231373;
      break;
      i = wS(paramInt);
      AppMethodBeat.o(41763);
    }
  }

  public static void a(Context paramContext, bab parambab, DialogInterface.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(41760);
    com.tencent.mm.ui.base.h.a(paramContext, parambab.cEh, "", parambab.nZc, parambab.nZb, false, paramOnClickListener, null);
    AppMethodBeat.o(41760);
  }

  public static void a(MMActivity paramMMActivity, Bundle paramBundle, ask paramask, boolean paramBoolean)
  {
    AppMethodBeat.i(41757);
    RealnameGuideHelper localRealnameGuideHelper = new RealnameGuideHelper();
    localRealnameGuideHelper.a(paramask.vAF, paramask.nZa, paramask.nZb, paramask.nZc, paramask.nZd, 0);
    paramBundle.putString("realname_verify_process_jump_plugin", "honey_pay");
    localRealnameGuideHelper.a(paramMMActivity, paramBundle, null, new c.1(paramBoolean), false);
    if (paramBoolean)
    {
      com.tencent.mm.plugin.report.service.h.pYm.e(15191, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1) });
      AppMethodBeat.o(41757);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.report.service.h.pYm.e(15191, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1) });
      AppMethodBeat.o(41757);
    }
  }

  public static void a(MMActivity paramMMActivity, btn parambtn, String paramString, int paramInt, chl paramchl)
  {
    AppMethodBeat.i(41758);
    if ((parambtn != null) && (parambtn.wVw != null) && (!parambtn.wVw.isEmpty()))
    {
      paramString = new c.2(paramMMActivity, parambtn, paramString, paramchl, paramInt);
      if (!bo.isNullOrNil(parambtn.title))
      {
        paramMMActivity.a(parambtn.title, 2131690691, paramString);
        AppMethodBeat.o(41758);
      }
    }
    while (true)
    {
      return;
      paramMMActivity.addIconOptionMenu(0, 2131230727, paramString);
      AppMethodBeat.o(41758);
    }
  }

  public static void b(MMActivity paramMMActivity, btn parambtn, String paramString, int paramInt, chl paramchl)
  {
    AppMethodBeat.i(41759);
    a(paramMMActivity, parambtn, paramString, paramInt, paramchl);
    AppMethodBeat.o(41759);
  }

  public static int bFX()
  {
    return 2131231376;
  }

  public static String eG(String paramString1, String paramString2)
  {
    AppMethodBeat.i(41762);
    paramString1 = z(paramString1, paramString2, -1);
    AppMethodBeat.o(41762);
    return paramString1;
  }

  public static String iR(long paramLong)
  {
    AppMethodBeat.i(41756);
    String str = com.tencent.mm.wallet_core.ui.e.a(String.valueOf(paramLong), "100", 2, RoundingMode.HALF_UP).toString();
    AppMethodBeat.o(41756);
    return str;
  }

  public static String iS(long paramLong)
  {
    AppMethodBeat.i(41768);
    String str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(1000L * paramLong));
    AppMethodBeat.o(41768);
    return str;
  }

  public static void o(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(41765);
    ab.i("MicroMsg.HoneyPayUtil", "update msg: %s, %s", new Object[] { paramString1, Boolean.valueOf(bo.isNullOrNil(paramString2)) });
    if ((!bo.isNullOrNil(paramString2)) && (!bo.isNullOrNil(paramString1)))
    {
      paramString2 = z(paramString2, paramString3, 6);
      if (bo.isNullOrNil(paramString4))
        break label226;
      paramString2 = z(paramString2, paramString4, 6);
    }
    label226: 
    while (true)
    {
      paramString3 = new a();
      paramString3.field_payMsgId = paramString1;
      com.tencent.mm.plugin.honey_pay.a.bFV().bFW().b(paramString3, new String[0]);
      if (paramString3.field_msgId > 0L)
      {
        ab.i("MicroMsg.HoneyPayUtil", "find msg: %s", new Object[] { Long.valueOf(paramString3.field_msgId) });
        paramString1 = ((j)g.K(j.class)).bOr().jf(paramString3.field_msgId);
        if (paramString1.field_msgId > 0L)
        {
          paramString1.setContent(paramString2);
          ((j)g.K(j.class)).bOr().a(paramString1.field_msgId, paramString1);
          AppMethodBeat.o(41765);
        }
      }
      while (true)
      {
        return;
        ab.w("MicroMsg.HoneyPayUtil", "can't find msg: %s, may be deleted", new Object[] { Long.valueOf(paramString3.field_msgId) });
        AppMethodBeat.o(41765);
      }
    }
  }

  public static int wS(int paramInt)
  {
    int i = -1;
    if (paramInt == 1)
      i = 2131231371;
    while (true)
    {
      return i;
      if (paramInt == 2)
        i = 2131231378;
      else if (paramInt == 3)
        i = 2131231369;
    }
  }

  public static String z(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(41761);
    if (paramInt >= 0)
    {
      paramString1 = paramString1.replace("$" + paramString2 + "$", com.tencent.mm.wallet_core.ui.e.eK(com.tencent.mm.wallet_core.ui.e.mJ(paramString2), paramInt));
      AppMethodBeat.o(41761);
    }
    while (true)
    {
      return paramString1;
      paramString1 = paramString1.replace("$" + paramString2 + "$", com.tencent.mm.wallet_core.ui.e.mJ(paramString2));
      AppMethodBeat.o(41761);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.model.c
 * JD-Core Version:    0.6.2
 */