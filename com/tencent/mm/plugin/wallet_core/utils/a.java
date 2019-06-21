package com.tencent.mm.plugin.wallet_core.utils;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.ad;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.platformtools.x;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public final class a
{
  public LinkedList<Bankcard> eBA;
  ReentrantLock mLock;
  ArrayList<a.b> tOQ;
  private com.tencent.mm.sdk.b.c tOR;
  public LinkedList<String> tOS;

  public a()
  {
    AppMethodBeat.i(47998);
    this.tOQ = new ArrayList();
    this.mLock = new ReentrantLock();
    this.tOR = new a.1(this);
    com.tencent.mm.sdk.b.a.xxA.c(this.tOR);
    AppMethodBeat.o(47998);
  }

  private void a(Context paramContext, Bankcard paramBankcard)
  {
    AppMethodBeat.i(48004);
    String str;
    if (r.YM())
    {
      str = paramBankcard.field_bankName;
      if ((this.tOS == null) || (!this.tOS.contains(str)))
        break label62;
      ab.i("MicroMsg.BankcardLogoHelper", "waiting resp:".concat(String.valueOf(str)));
      AppMethodBeat.o(48004);
    }
    while (true)
    {
      return;
      str = paramBankcard.field_bankcardType;
      break;
      label62: if (!b(paramContext, paramBankcard))
      {
        if (this.eBA == null)
          this.eBA = new LinkedList();
        this.eBA.add(paramBankcard);
        if (this.tOS == null)
        {
          b(paramContext, this.eBA);
          AppMethodBeat.o(48004);
        }
      }
      else
      {
        paramContext = new ad();
        com.tencent.mm.sdk.b.a.xxA.m(paramContext);
        AppMethodBeat.o(48004);
      }
    }
  }

  private static boolean b(Context paramContext, Bankcard paramBankcard)
  {
    boolean bool = false;
    AppMethodBeat.i(48005);
    if (r.YM())
    {
      paramContext = com.tencent.mm.plugin.wallet_core.d.b.i(paramContext, paramBankcard.field_bankName, false);
      if ((paramContext != null) && (!paramContext.bNM))
        break label57;
      AppMethodBeat.o(48005);
    }
    while (true)
    {
      return bool;
      paramContext = com.tencent.mm.plugin.wallet_core.d.b.i(paramContext, paramBankcard.field_bankcardType, paramBankcard.cPb());
      break;
      label57: bool = true;
      AppMethodBeat.o(48005);
    }
  }

  public static void j(ImageView paramImageView)
  {
    AppMethodBeat.i(48000);
    if (paramImageView != null)
    {
      paramImageView.setTag(2131820688, null);
      paramImageView.setImageResource(2130840657);
    }
    AppMethodBeat.o(48000);
  }

  public final void a(Context paramContext, Bankcard paramBankcard, ImageView paramImageView)
  {
    AppMethodBeat.i(47999);
    a(paramContext, paramBankcard, paramImageView, null, null, null);
    AppMethodBeat.o(47999);
  }

  public final void a(Context paramContext, Bankcard paramBankcard, ImageView paramImageView1, View paramView, ImageView paramImageView2, TextView paramTextView)
  {
    AppMethodBeat.i(48002);
    a.b localb = new a.b();
    localb.tPf = false;
    localb.thJ = paramBankcard;
    if (paramImageView1 != null)
    {
      paramImageView1.setTag(2131820688, paramBankcard.field_bankcardType);
      localb.tPb = new WeakReference(paramImageView1);
    }
    if (paramView != null)
      localb.tPc = new WeakReference(paramView);
    if (paramImageView2 != null)
      localb.tPd = new WeakReference(paramImageView2);
    if (paramTextView != null)
      localb.tPe = new WeakReference(paramTextView);
    this.tOQ.add(localb);
    a(paramContext, paramBankcard);
    AppMethodBeat.o(48002);
  }

  public final void a(Bankcard paramBankcard, ImageView paramImageView)
  {
    AppMethodBeat.i(48001);
    a.b localb = new a.b();
    localb.thJ = paramBankcard;
    if (paramImageView != null)
    {
      paramImageView.setTag(2131820688, paramBankcard.field_bankcardType);
      localb.tPb = new WeakReference(paramImageView);
    }
    paramImageView = paramBankcard.txc;
    if ((paramImageView != null) && (localb.tPb != null) && (localb.tPb.get() != null))
    {
      ab.d("MicroMsg.BankcardLogoHelper", "bankLogoUrl = " + paramImageView.oRi);
      paramBankcard = (ImageView)localb.tPb.get();
      if (!bo.isNullOrNil(paramImageView.oRi))
      {
        localb.tKb = paramImageView.oRi;
        localb.tPf = true;
        paramImageView = x.a(new com.tencent.mm.plugin.wallet_core.ui.view.c(paramImageView.oRi));
        if (paramImageView != null)
          paramBankcard.setImageBitmap(paramImageView);
        x.a(localb);
        AppMethodBeat.o(48001);
      }
    }
    while (true)
    {
      return;
      if (paramImageView.txs > 0)
      {
        paramBankcard.post(new a.6(this, paramBankcard, paramImageView));
        AppMethodBeat.o(48001);
      }
      else
      {
        ab.e("MicroMsg.BankcardLogoHelper", "bankcard logoUrl == null");
        AppMethodBeat.o(48001);
        continue;
        ab.e("MicroMsg.BankcardLogoHelper", "bankUrls == null");
        AppMethodBeat.o(48001);
      }
    }
  }

  public final void b(Context paramContext, List<Bankcard> paramList)
  {
    AppMethodBeat.i(48006);
    if ((paramList != null) && (paramList.size() > 0))
    {
      int i = paramList.size();
      this.tOS = new LinkedList();
      int j = 0;
      if (j < i)
      {
        Bankcard localBankcard = (Bankcard)paramList.get(j);
        if (localBankcard.cPc())
          ab.i("MicroMsg.BankcardLogoHelper", "ignore balance");
        while (true)
        {
          j++;
          break;
          if (!b(paramContext, localBankcard))
          {
            ab.i("MicroMsg.BankcardLogoHelper", localBankcard.field_bankcardType + "'s url is null or need update");
            this.tOS.add(localBankcard.field_bankcardType);
          }
        }
      }
      if (this.tOS.size() > 0)
      {
        ab.i("MicroMsg.BankcardLogoHelper", "doScene to get bankcard logo");
        paramList = new com.tencent.mm.plugin.wallet_core.c.c(this.tOS);
        g.RQ();
        g.RO().eJo.a(1650, new a.7(this, paramContext));
        g.RQ();
        g.RO().eJo.a(paramList, 0);
        AppMethodBeat.o(48006);
      }
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.BankcardLogoHelper", "use cache bankcard logo data");
      paramContext = new ad();
      com.tencent.mm.sdk.b.a.xxA.m(paramContext);
      AppMethodBeat.o(48006);
    }
  }

  public final void destory()
  {
    AppMethodBeat.i(48003);
    com.tencent.mm.sdk.b.a.xxA.d(this.tOR);
    if (this.tOQ != null)
    {
      this.tOQ.clear();
      this.tOQ = null;
    }
    AppMethodBeat.o(48003);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.utils.a
 * JD-Core Version:    0.6.2
 */