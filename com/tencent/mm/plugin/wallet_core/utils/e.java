package com.tencent.mm.plugin.wallet_core.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.StrikethroughSpan;
import android.text.style.UnderlineSpan;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.wallet_core.ui.o;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.protocal.protobuf.auj;
import com.tencent.mm.protocal.protobuf.az;
import com.tencent.mm.protocal.protobuf.ba;
import com.tencent.mm.protocal.protobuf.bam;
import com.tencent.mm.protocal.protobuf.bif;
import com.tencent.mm.protocal.protobuf.btr;
import com.tencent.mm.protocal.protobuf.cgt;
import com.tencent.mm.protocal.protobuf.cgv;
import com.tencent.mm.protocal.protobuf.chf;
import com.tencent.mm.protocal.protobuf.cnx;
import com.tencent.mm.protocal.protobuf.ms;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;
import com.tencent.mm.ui.base.n.d;
import java.util.Iterator;
import java.util.LinkedList;
import junit.framework.Assert;

public final class e
{
  private static CharSequence a(Context paramContext, cgt paramcgt, a parama)
  {
    AppMethodBeat.i(48031);
    SpannableString localSpannableString = new SpannableString(paramcgt.text);
    int i = (int)paramcgt.xfA;
    if ((paramcgt.xfA & 0xFF000000) == 0L)
      i = (int)(paramcgt.xfA | 0xFF000000);
    Object localObject = new WcPayTextApppearanceSpan(com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), (int)paramcgt.size), ColorStateList.valueOf(i));
    localSpannableString.setSpan(localObject, 0, localSpannableString.length(), 17);
    if (!bo.isNullOrNil(paramcgt.xfB))
      ((WcPayTextApppearanceSpan)localObject).tPl = com.tencent.mm.wallet_core.ui.e.bT(paramContext, paramcgt.xfB);
    localObject = null;
    if (paramcgt.xfC == 1)
      localObject = new StrikethroughSpan();
    while (true)
    {
      if (localObject != null)
        localSpannableString.setSpan(localObject, 0, localSpannableString.length(), 17);
      if ((paramcgt.vCP != null) && (paramcgt.vCP.type != 0))
      {
        paramcgt = paramcgt.vCP;
        ab.i("MicroMsg.WcPayViewEngineRender", "route type: %s", new Object[] { Integer.valueOf(paramcgt.type) });
        localSpannableString.setSpan(new o(new e.1(parama, paramcgt, paramContext)), 0, localSpannableString.length(), 17);
      }
      AppMethodBeat.o(48031);
      return localSpannableString;
      if (paramcgt.xfC == 2)
        localObject = new UnderlineSpan();
    }
  }

  public static CharSequence a(Context paramContext, cgv paramcgv, a parama)
  {
    AppMethodBeat.i(48030);
    if ((paramcgv == null) || (paramcgv.xfD == null) || (paramcgv.xfD.isEmpty()))
    {
      paramContext = "";
      AppMethodBeat.o(48030);
    }
    while (true)
    {
      return paramContext;
      int i = paramcgv.xfD.size();
      SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
      for (int j = 0; j < i; j++)
        localSpannableStringBuilder.append(a(paramContext, (cgt)paramcgv.xfD.get(j), parama));
      AppMethodBeat.o(48030);
      paramContext = localSpannableStringBuilder;
    }
  }

  public static String a(Context paramContext, cgv paramcgv)
  {
    AppMethodBeat.i(48036);
    paramContext = a(paramContext, paramcgv, null).toString();
    AppMethodBeat.o(48036);
    return paramContext;
  }

  public static void a(Context paramContext, btr parambtr)
  {
    AppMethodBeat.i(48032);
    if (parambtr == null)
      AppMethodBeat.o(48032);
    while (true)
    {
      return;
      ab.i("MicroMsg.WcPayViewEngineRender", "route info type: %s, uri: %s", new Object[] { Integer.valueOf(parambtr.type), parambtr.url });
      if (parambtr.type == 1)
      {
        com.tencent.mm.wallet_core.ui.e.n(paramContext, parambtr.url, true);
        AppMethodBeat.o(48032);
      }
      else if (parambtr.type == 2)
      {
        if (parambtr.wVC == null)
        {
          ab.e("MicroMsg.WcPayViewEngineRender", "tiny app uri is null");
          AppMethodBeat.o(48032);
        }
        else
        {
          com.tencent.mm.wallet_core.ui.e.p(parambtr.wVC.username, parambtr.wVC.path, parambtr.wVC.version, 1000);
          AppMethodBeat.o(48032);
        }
      }
      else if (parambtr.type != 3)
      {
        if (parambtr.type == 4)
        {
          if (parambtr.url.equals("balance"))
          {
            d.c(paramContext, "wallet", ".balance.ui.WalletBalanceManagerUI", 65281);
            AppMethodBeat.o(48032);
          }
          else if (parambtr.url.equals("bankCard"))
          {
            parambtr = new Intent();
            parambtr.putExtra("intent_finish_self", true);
            d.b(paramContext, "wallet", ".bind.ui.WalletBankcardManageUI", parambtr, 65281);
            AppMethodBeat.o(48032);
          }
          else if (parambtr.url.equals("qmfCard"))
          {
            d.b(paramContext, "honey_pay", ".ui.HoneyPayMainUI", new Intent(), 65283);
            AppMethodBeat.o(48032);
          }
          else if (parambtr.url.equals("paySecurity"))
          {
            parambtr = new Intent();
            parambtr.putExtra("wallet_lock_jsapi_scene", 1);
            d.b(paramContext, "wallet", ".pwd.ui.WalletSecuritySettingUI", parambtr, 65282);
            AppMethodBeat.o(48032);
          }
          else if (parambtr.url.equals("lqt"))
          {
            parambtr = new Intent();
            parambtr.putExtra("key_account_type", 1);
            d.b(paramContext, "wallet", ".balance.ui.lqt.WalletLqtDetailUI", parambtr, 65286);
            AppMethodBeat.o(48032);
          }
          else if (parambtr.url.equals("realname"))
          {
            parambtr = new Bundle();
            parambtr.putInt("real_name_verify_mode", 0);
            parambtr.putInt("entry_scene", 0);
            Assert.assertTrue("context must be activity", paramContext instanceof Activity);
            com.tencent.mm.wallet_core.a.a((Activity)paramContext, com.tencent.mm.plugin.wallet_core.id_verify.a.class, parambtr);
            AppMethodBeat.o(48032);
          }
        }
        else if (parambtr.type == 5)
        {
          if (parambtr.url.equals("balanceQuotaState"))
          {
            d.b(paramContext, "wallet_ecard", ".ui.WalletECardLogoutUI", new Intent());
            AppMethodBeat.o(48032);
          }
        }
        else if (parambtr.type == 13)
        {
          if (parambtr.wVG != null)
            AppMethodBeat.o(48032);
        }
        else
          ab.w("MicroMsg.WcPayViewEngineRender", "can't handle type: %s, uri: %s", new Object[] { Integer.valueOf(parambtr.type), parambtr.url });
      }
      else
      {
        AppMethodBeat.o(48032);
      }
    }
  }

  public static void a(View paramView, ViewGroup.MarginLayoutParams paramMarginLayoutParams, cnx paramcnx)
  {
    AppMethodBeat.i(48033);
    if (paramcnx == null)
      AppMethodBeat.o(48033);
    while (true)
    {
      return;
      a(paramMarginLayoutParams, paramcnx.xlt);
      a(paramView, paramcnx.wVz);
      AppMethodBeat.o(48033);
    }
  }

  public static void a(View paramView, bif parambif)
  {
    AppMethodBeat.i(48034);
    if (parambif == null)
      AppMethodBeat.o(48034);
    while (true)
    {
      return;
      int i = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), (int)parambif.top);
      int j = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), (int)parambif.bottom);
      paramView.setPadding(com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), (int)parambif.left), i, com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), (int)parambif.right), j);
      AppMethodBeat.o(48034);
    }
  }

  private static void a(ViewGroup.MarginLayoutParams paramMarginLayoutParams, bam parambam)
  {
    AppMethodBeat.i(48035);
    if (parambam == null)
      AppMethodBeat.o(48035);
    while (true)
    {
      return;
      paramMarginLayoutParams.topMargin = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), (int)parambam.top);
      paramMarginLayoutParams.bottomMargin = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), (int)parambam.bottom);
      paramMarginLayoutParams.leftMargin = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), (int)parambam.left);
      paramMarginLayoutParams.rightMargin = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), (int)parambam.right);
      AppMethodBeat.o(48035);
    }
  }

  public static void a(TextView paramTextView, cgv paramcgv, a parama)
  {
    AppMethodBeat.i(48025);
    if (a(paramcgv))
    {
      paramTextView.setClickable(true);
      paramTextView.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.e.m(paramTextView.getContext()));
    }
    paramTextView.setText(a(paramTextView.getContext(), paramcgv, parama));
    AppMethodBeat.o(48025);
  }

  public static void a(CdnImageView paramCdnImageView, auj paramauj)
  {
    AppMethodBeat.i(48027);
    a(paramCdnImageView, paramauj, -1, 0, 0, true);
    AppMethodBeat.o(48027);
  }

  public static void a(CdnImageView paramCdnImageView, auj paramauj, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    AppMethodBeat.i(48029);
    paramCdnImageView.setUseSdcardCache(paramBoolean);
    int i = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), (int)paramauj.width);
    int j = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), (int)paramauj.height);
    if (paramInt2 > 0);
    while (true)
    {
      if (paramInt3 > 0);
      while (true)
      {
        paramCdnImageView.n(paramauj.url, paramInt2, paramInt3, paramInt1);
        AppMethodBeat.o(48029);
        return;
        paramInt3 = j;
      }
      paramInt2 = i;
    }
  }

  public static void a(CdnImageView paramCdnImageView, auj paramauj, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(48028);
    a(paramCdnImageView, paramauj, paramInt, 0, 0, paramBoolean);
    AppMethodBeat.o(48028);
  }

  private static boolean a(cgv paramcgv)
  {
    AppMethodBeat.i(48026);
    boolean bool;
    if ((paramcgv.xfD == null) || (paramcgv.xfD.isEmpty()))
    {
      AppMethodBeat.o(48026);
      bool = false;
    }
    while (true)
    {
      return bool;
      paramcgv = paramcgv.xfD.iterator();
      while (true)
        if (paramcgv.hasNext())
          if (((cgt)paramcgv.next()).vCP != null)
          {
            bool = true;
            AppMethodBeat.o(48026);
            break;
          }
      AppMethodBeat.o(48026);
      bool = false;
    }
  }

  public static abstract interface a
  {
    public abstract void a(btr parambtr);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.utils.e
 * JD-Core Version:    0.6.2
 */