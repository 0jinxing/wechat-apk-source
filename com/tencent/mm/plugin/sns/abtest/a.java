package com.tencent.mm.plugin.sns.abtest;

import android.content.Context;
import android.content.Intent;
import android.view.ContextMenu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.a.e;
import com.tencent.mm.model.a.f;
import com.tencent.mm.model.a.g;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.ui.SnsNotInterestUI;
import com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class a
{
  private static Context context;
  private static boolean qCh;
  private static String qCi;
  private static View.OnClickListener qCj;
  private static int qCk;
  private static int qCl;
  private static long qCm;
  private static View qCn;
  private static b qCo;
  private static NotInterestMenu.c qCp;
  private static com.tencent.mm.sdk.b.c qCq;
  private static com.tencent.mm.sdk.b.c qCr;

  static
  {
    AppMethodBeat.i(35662);
    qCh = false;
    qCi = "0";
    qCj = null;
    qCk = -1;
    qCl = -1;
    qCm = 0L;
    qCn = null;
    qCo = null;
    qCp = null;
    context = null;
    qCq = new a.1();
    qCr = new a.2();
    AppMethodBeat.o(35662);
  }

  public static void a(Context paramContext, n paramn)
  {
    int i = 2;
    AppMethodBeat.i(35653);
    Intent localIntent;
    if ((qCh) && (paramn != null) && (paramContext != null))
    {
      qCm = paramn.field_snsId;
      a(paramn);
      localIntent = new Intent(paramContext, SnsNotInterestUI.class);
      localIntent.putExtra("sns_info_svr_id", qCm);
      if ((!qCh) || (bo.isNullOrNil(qCi)))
        break label155;
      if ((!qCi.equals("1")) && (!qCi.equals("2")))
        break label111;
      i = 1;
    }
    label155: 
    while (true)
    {
      localIntent.putExtra("sns_info_not_interest_scene", i);
      paramContext.startActivity(localIntent);
      AppMethodBeat.o(35653);
      return;
      label111: if (qCi.equals("3"))
      {
        if (i.i(paramn))
          i = 4;
        else if (paramn.field_type == 1)
          i = 3;
        else if (paramn.field_type == 2);
      }
      else
        i = 0;
    }
  }

  public static void a(ContextMenu paramContextMenu, n paramn)
  {
    AppMethodBeat.i(35654);
    if ((qCh) && (qCi.equals("3")) && (paramn != null) && (!paramn.DI(32)) && (!paramn.field_userName.equals(af.cnk())) && (paramn.field_type != 15))
      paramContextMenu.add(0, 13, 0, 2131303656);
    AppMethodBeat.o(35654);
  }

  public static void a(View paramView, BaseTimeLineItem.BaseViewHolder paramBaseViewHolder)
  {
    AppMethodBeat.i(35655);
    if ((qCh) && (!bo.isNullOrNil(qCi)) && (!qCi.equals("0")))
    {
      paramBaseViewHolder.rIo = ((ImageView)paramView.findViewById(2131827905));
      paramBaseViewHolder.rIo.setVisibility(8);
      paramBaseViewHolder.rIp = false;
      if (!qCi.equals("3"))
        paramBaseViewHolder.rIo.setOnClickListener(qCj);
    }
    AppMethodBeat.o(35655);
  }

  private static void a(n paramn)
  {
    AppMethodBeat.i(35652);
    boolean bool = qCi.equals("3");
    if (paramn.field_type == 1)
      if (bool)
      {
        qCl = 5;
        AppMethodBeat.o(35652);
      }
    while (true)
    {
      return;
      qCl = 0;
      AppMethodBeat.o(35652);
      continue;
      if (paramn.field_type == 2)
      {
        if (bool)
        {
          qCl = 4;
          AppMethodBeat.o(35652);
        }
        else
        {
          qCl = 1;
          AppMethodBeat.o(35652);
        }
      }
      else if (paramn.field_type == 15)
      {
        if (!bool)
        {
          qCl = 2;
          AppMethodBeat.o(35652);
        }
      }
      else if (i.i(paramn))
      {
        if (bool)
        {
          qCl = 6;
          AppMethodBeat.o(35652);
        }
        else
        {
          qCl = 3;
        }
      }
      else
        AppMethodBeat.o(35652);
    }
  }

  public static void b(n paramn)
  {
    AppMethodBeat.i(35656);
    if (qCh)
    {
      qCm = paramn.field_snsId;
      a(paramn);
    }
    AppMethodBeat.o(35656);
  }

  public static void c(Context paramContext, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(35650);
    if (g.aaK().oP("7") != null)
    {
      qCh = true;
      qCi = g.aaK().oP("7").value;
      ab.d("MicroMsg.NotInteresetABTestManager", "start not interest abtest, testStyle:%s", new Object[] { qCi });
      qCn = paramViewGroup;
      qCo = new b(paramViewGroup);
      context = paramContext;
      com.tencent.mm.sdk.b.a.xxA.c(qCq);
      com.tencent.mm.sdk.b.a.xxA.c(qCr);
      qCj = new a.3();
      qCp = new a.4();
      qCo.qCu = qCp;
    }
    AppMethodBeat.o(35650);
  }

  public static void clW()
  {
    AppMethodBeat.i(35651);
    if (qCo != null)
      qCo.cma();
    AppMethodBeat.o(35651);
  }

  public static void clean()
  {
    AppMethodBeat.i(35657);
    qCl = -1;
    qCk = -1;
    qCm = 0L;
    qCj = null;
    qCp = null;
    qCn = null;
    context = null;
    qCh = false;
    qCi = "0";
    f.oU("7");
    com.tencent.mm.sdk.b.a.xxA.d(qCq);
    com.tencent.mm.sdk.b.a.xxA.d(qCr);
    AppMethodBeat.o(35657);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.abtest.a
 * JD-Core Version:    0.6.2
 */