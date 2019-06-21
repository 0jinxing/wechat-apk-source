package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet.a.j;
import com.tencent.mm.plugin.wallet.a.t;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.p;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.MaxListView;
import java.util.LinkedList;
import java.util.List;

public final class l extends com.tencent.mm.ui.base.i
{
  private View jcl;
  private LayoutInflater mInflater;
  private MaxListView tHB;
  private TextView tHC;
  private l.a tHD;
  private l.b tHE;
  private b tpu;

  private l(Context paramContext)
  {
    super(paramContext, 2131493867);
    AppMethodBeat.i(47384);
    this.mInflater = LayoutInflater.from(paramContext);
    this.jcl = LayoutInflater.from(paramContext).inflate(2130971093, null);
    this.tHB = ((MaxListView)this.jcl.findViewById(2131828792));
    this.tHC = ((TextView)this.jcl.findViewById(2131828791));
    this.tHD = new l.a(this);
    this.tHB.setAdapter(this.tHD);
    this.jcl.findViewById(2131828793).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(47377);
        l.a(l.this);
        l.this.dismiss();
        AppMethodBeat.o(47377);
      }
    });
    AppMethodBeat.o(47384);
  }

  public static l a(Context paramContext, Orders paramOrders, String paramString, l.b paramb, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    AppMethodBeat.i(47387);
    l locall = new l(paramContext);
    locall.setOnCancelListener(paramOnCancelListener);
    locall.setCancelable(true);
    locall.setCanceledOnTouchOutside(false);
    locall.tpu = c.tDU.a(paramOrders);
    if (locall.tpu == null)
    {
      ab.w("MicroMsg.WalletFavorDialog", "mFavorLogicHelper null & dismiss");
      locall.dismiss();
    }
    Object localObject1;
    int i;
    while (true)
    {
      locall.tHE = paramb;
      locall.show();
      com.tencent.mm.ui.base.h.a(paramContext, locall);
      AppMethodBeat.o(47387);
      return locall;
      paramOrders = locall.tHD;
      localObject1 = paramOrders.tHF.tpu.tDO;
      paramOnCancelListener = paramOrders.tHF.tpu.acY(paramString);
      paramOrders.tHH = paramOrders.tHF.tpu.cRl();
      paramOrders.tHI = paramOrders.tHF.tpu.acU(paramOnCancelListener);
      paramOrders.tHG = -1;
      for (i = 0; ; i++)
      {
        if (i < paramOrders.tHH.size())
          if (((t)paramOrders.tHH.get(i)).tnR == 0)
            break label270;
        label270: for (j = 1; j != 0; j = 0)
        {
          paramOrders.tHG = i;
          paramString = new LinkedList();
          if (paramOrders.tHH == null)
            break label282;
          for (i = 0; i < paramOrders.tHH.size(); i++)
            paramString.add(((t)paramOrders.tHH.get(i)).tmO);
        }
      }
      label282: ab.w("MicroMsg.WalletFavorDialog", "func[setCouponInfo] mFavorList null");
      i = 0;
      label292: if (i != 0)
        break label651;
      ab.w("MicroMsg.WalletFavorDialog", "initFavorInfo failed & dismiss");
      locall.dismiss();
    }
    LinkedList localLinkedList = new LinkedList();
    if ((localObject1 != null) && (((com.tencent.mm.plugin.wallet.a.h)localObject1).tmV != null))
      for (i = 0; i < ((com.tencent.mm.plugin.wallet.a.h)localObject1).tmV.size(); i++)
      {
        localObject2 = ((t)((com.tencent.mm.plugin.wallet.a.h)localObject1).tmV.get(i)).tmO;
        if (!paramString.contains(localObject2))
          localLinkedList.add(localObject2);
      }
    Object localObject2 = new LinkedList();
    label441: String str;
    if ((localObject1 != null) && (((com.tencent.mm.plugin.wallet.a.h)localObject1).tmW != null) && (((com.tencent.mm.plugin.wallet.a.h)localObject1).tmW.tni != null))
    {
      localObject1 = ((com.tencent.mm.plugin.wallet.a.h)localObject1).tmW.tni;
      i = 0;
      if (i >= ((List)localObject1).size())
        break label548;
      str = ((j)((List)localObject1).get(i)).tnk;
      j = 0;
      label473: if (j >= localLinkedList.size())
        break label682;
      if (!str.contains((CharSequence)localLinkedList.get(j)));
    }
    label548: label682: for (int j = 1; ; j = 0)
    {
      if (j == 0)
        ((List)localObject2).add(str);
      i++;
      break label441;
      j++;
      break label473;
      ab.w("MicroMsg.WalletFavorDialog", "func[setCouponInfo] favorInfo.favorComposeList or favorInfo.favorComposeList.favorComposeInfo null");
      i = 0;
      break label292;
      localLinkedList = new LinkedList();
      if ((!bo.isNullOrNil(paramOnCancelListener)) && (!paramOnCancelListener.equals("0")))
      {
        paramOnCancelListener = paramOnCancelListener.split("-");
        if (paramOnCancelListener != null)
          for (i = 0; i < paramOnCancelListener.length; i++)
            localLinkedList.add(paramOnCancelListener[i]);
        ab.w("MicroMsg.WalletFavorDialog", "func[setCouponInfo] preKeyArr null");
        i = 0;
        break label292;
      }
      paramOrders.tHJ.d(paramString, localLinkedList, (List)localObject2);
      i = 1;
      break label292;
      locall.tHC.setText(2131304795);
      locall.tHB.setOnItemClickListener(new l.2(locall));
      break;
    }
  }

  private void cRC()
  {
    AppMethodBeat.i(47389);
    ab.d("MicroMsg.WalletFavorDialog", "On selection done");
    if (this.tHD != null)
    {
      Object localObject = this.tHD.tHJ;
      localObject = ((p)localObject).a(((p)localObject).tzD, -1);
      localObject = this.tpu.acX((String)localObject);
      this.tHE.a((FavorPayInfo)localObject);
    }
    AppMethodBeat.o(47389);
  }

  public final void dismiss()
  {
    AppMethodBeat.i(47386);
    try
    {
      super.dismiss();
      AppMethodBeat.o(47386);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.WalletFavorDialog", "dismiss exception, e = " + localException.getMessage());
        AppMethodBeat.o(47386);
      }
    }
  }

  protected final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(47385);
    super.onCreate(paramBundle);
    setContentView(this.jcl);
    AppMethodBeat.o(47385);
  }

  public final boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(47390);
    if (paramInt == 4)
      cRC();
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    AppMethodBeat.o(47390);
    return bool;
  }

  public final void setCancelable(boolean paramBoolean)
  {
    AppMethodBeat.i(47388);
    super.setCancelable(paramBoolean);
    setCanceledOnTouchOutside(paramBoolean);
    AppMethodBeat.o(47388);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.l
 * JD-Core Version:    0.6.2
 */