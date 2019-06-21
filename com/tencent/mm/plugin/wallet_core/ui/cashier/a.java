package com.tencent.mm.plugin.wallet_core.ui.cashier;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet.a.c;
import com.tencent.mm.plugin.wallet.a.d;
import com.tencent.mm.plugin.wallet.a.h;
import com.tencent.mm.plugin.wallet.a.n;
import com.tencent.mm.plugin.wallet.a.o;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.wallet_core.c.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class a extends i
{
  private ViewGroup ius;
  private Context mContext;
  PayInfo pVL;
  Orders pWy;
  TextView tLA;
  List<WcPayCashierBankcardItemLayout> tLB;
  int tLC;
  boolean tLD;
  int tLE;
  boolean tLF;
  a.a tLG;
  b.b tLH;
  private ImageView tLy;
  ViewGroup tLz;
  com.tencent.mm.plugin.wallet_core.utils.a tln;
  FavorPayInfo toH;
  Bankcard jdField_try;

  public a(Context paramContext)
  {
    super(paramContext, 2131493867);
    AppMethodBeat.i(47743);
    this.tLB = new ArrayList();
    this.pVL = new PayInfo();
    this.pWy = new Orders();
    this.tLF = true;
    this.tLH = new a.1(this);
    this.mContext = paramContext;
    this.ius = ((ViewGroup)View.inflate(getContext(), 2130971192, null));
    this.tLy = ((ImageView)this.ius.findViewById(2131829097));
    this.tLz = ((ViewGroup)this.ius.findViewById(2131829099));
    this.tLA = ((TextView)this.ius.findViewById(2131829098));
    paramContext = this.tLy;
    int i = b.tLO;
    int j = b.tLO;
    bo.n(paramContext, i, i, j, j);
    this.tLy.setOnClickListener(new a.4(this));
    setContentView(this.ius);
    setCanceledOnTouchOutside(false);
    setOnCancelListener(new a.2(this));
    setOnDismissListener(new a.3(this));
    this.tln = new com.tencent.mm.plugin.wallet_core.utils.a();
    AppMethodBeat.o(47743);
  }

  public final void a(b paramb)
  {
    AppMethodBeat.i(47745);
    b.b localb = this.tLH;
    paramb.tMB.remove(localb);
    AppMethodBeat.o(47745);
  }

  final LinkedList<String> cRZ()
  {
    AppMethodBeat.i(47747);
    LinkedList localLinkedList = new LinkedList();
    if ((this.pWy != null) && (this.pWy.tAr != null) && (this.pWy.tAr.tnf != null))
    {
      Object localObject = this.pWy.tAr.tnf.tmB;
      if (localObject != null)
      {
        localObject = ((n)localObject).tns.iterator();
        while (((Iterator)localObject).hasNext())
          localLinkedList.add(((o)((Iterator)localObject).next()).pOz);
        AppMethodBeat.o(47747);
      }
    }
    while (true)
    {
      return localLinkedList;
      AppMethodBeat.o(47747);
    }
  }

  final LinkedList<String> g(Bankcard paramBankcard)
  {
    AppMethodBeat.i(47746);
    LinkedList localLinkedList = new LinkedList();
    if ((this.pWy != null) && (this.pWy.tAr != null) && (this.pWy.tAr.tnf != null))
    {
      Iterator localIterator = this.pWy.tAr.tnf.tmA.iterator();
      while (localIterator.hasNext())
      {
        c localc = (c)localIterator.next();
        if (localc.pbo.equals(paramBankcard.field_bindSerial))
        {
          paramBankcard = localc.tmL.iterator();
          while (paramBankcard.hasNext())
            localLinkedList.add(((d)paramBankcard.next()).pOz);
          AppMethodBeat.o(47746);
        }
      }
    }
    while (true)
    {
      return localLinkedList;
      AppMethodBeat.o(47746);
    }
  }

  protected final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(47744);
    super.onCreate(paramBundle);
    if (this.pVL == null)
    {
      ab.w("MicroMsg.WcPayCashierBankcardDialog", "pay info is null!!");
      dismiss();
    }
    z.hL(7, 0);
    AppMethodBeat.o(47744);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.cashier.a
 * JD-Core Version:    0.6.2
 */