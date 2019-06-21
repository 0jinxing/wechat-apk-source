package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bqr;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.ui.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WalletLqtArriveTimeLayout extends LinearLayout
{
  private View.OnClickListener nij;
  List<bqr> thU;
  List<WeakReference<WalletLqtArriveTimeLayout.b>> thV;
  bqr thW;
  private WalletLqtArriveTimeLayout.a thX;
  boolean thY;

  public WalletLqtArriveTimeLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(45505);
    this.thU = new ArrayList();
    this.thV = new ArrayList();
    this.thY = false;
    this.nij = new WalletLqtArriveTimeLayout.1(this);
    AppMethodBeat.o(45505);
  }

  public WalletLqtArriveTimeLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(45506);
    this.thU = new ArrayList();
    this.thV = new ArrayList();
    this.thY = false;
    this.nij = new WalletLqtArriveTimeLayout.1(this);
    AppMethodBeat.o(45506);
  }

  private static void a(WalletLqtArriveTimeLayout.b paramb, boolean paramBoolean)
  {
    AppMethodBeat.i(45509);
    paramb.aaX.setEnabled(paramBoolean);
    paramb.iDT.setEnabled(paramBoolean);
    paramb.kEq.setEnabled(paramBoolean);
    paramb.jcl.setEnabled(paramBoolean);
    AppMethodBeat.o(45509);
  }

  private void cNe()
  {
    AppMethodBeat.i(45507);
    if (this.thX != null)
      this.thX.cNf();
    AppMethodBeat.o(45507);
  }

  public final void acj(String paramString)
  {
    AppMethodBeat.i(45510);
    ab.i("MicroMsg.WalletLqtArriveTimeLayout", "input money: %s", new Object[] { paramString });
    if ((this.thU == null) || (this.thU.isEmpty()))
      AppMethodBeat.o(45510);
    while (true)
    {
      return;
      this.thW = null;
      Object localObject1 = this.thV.iterator();
      Object localObject2;
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (WeakReference)((Iterator)localObject1).next();
        if (((WeakReference)localObject2).get() != null)
        {
          ((WalletLqtArriveTimeLayout.b)((WeakReference)localObject2).get()).aaX.setEnabled(true);
          ((WalletLqtArriveTimeLayout.b)((WeakReference)localObject2).get()).aaX.setChecked(false);
        }
      }
      int i = e.iy(paramString, "100");
      paramString = this.thU.iterator();
      int j = 0;
      if (paramString.hasNext())
      {
        localObject1 = (bqr)paramString.next();
        if ((((bqr)localObject1).wTd >= 0) && (i > ((bqr)localObject1).wTd))
        {
          ab.i("MicroMsg.WalletLqtArriveTimeLayout", "disable item: %s, %s", new Object[] { Integer.valueOf(j), Integer.valueOf(((bqr)localObject1).wTd) });
          localObject2 = (WalletLqtArriveTimeLayout.b)((WeakReference)this.thV.get(j)).get();
          if (localObject2 != null)
          {
            ((WalletLqtArriveTimeLayout.b)localObject2).aaX.setChecked(false);
            a((WalletLqtArriveTimeLayout.b)localObject2, false);
            this.thW = null;
            cNe();
          }
        }
        while (true)
        {
          j++;
          break;
          localObject2 = (WalletLqtArriveTimeLayout.b)((WeakReference)this.thV.get(j)).get();
          if (localObject2 != null)
          {
            a((WalletLqtArriveTimeLayout.b)localObject2, true);
            if (this.thW == null)
            {
              ab.i("MicroMsg.WalletLqtArriveTimeLayout", "auto select type: %s", new Object[] { Integer.valueOf(((bqr)localObject1).wOl) });
              ((WalletLqtArriveTimeLayout.b)localObject2).aaX.setChecked(true);
              this.thW = ((bqr)localObject1);
              cNe();
              if (j > 0)
                ((WalletLqtArriveTimeLayout.b)localObject2).iDT.setTextColor(ah.getContext().getResources().getColor(2131690135));
              else
                ((WalletLqtArriveTimeLayout.b)localObject2).cNg();
            }
            else
            {
              ((WalletLqtArriveTimeLayout.b)localObject2).cNg();
            }
          }
        }
      }
      AppMethodBeat.o(45510);
    }
  }

  public List<bqr> getRedeemTypeList()
  {
    return this.thU;
  }

  public bqr getSelectRedeemType()
  {
    return this.thW;
  }

  public void setCallback(WalletLqtArriveTimeLayout.a parama)
  {
    this.thX = parama;
  }

  public void setRedeemTypeList(List<bqr> paramList)
  {
    AppMethodBeat.i(45508);
    this.thY = true;
    this.thU.addAll(paramList);
    this.thV.clear();
    removeAllViews();
    setVisibility(0);
    if ((this.thU != null) && (!this.thU.isEmpty()))
    {
      paramList = this.thU.iterator();
      int i = 0;
      if (paramList.hasNext())
      {
        bqr localbqr = (bqr)paramList.next();
        LinearLayout localLinearLayout = (LinearLayout)LayoutInflater.from(getContext()).inflate(2130971119, this, false);
        WalletLqtArriveTimeLayout.b localb = new WalletLqtArriveTimeLayout.b((byte)0);
        localb.jcl = localLinearLayout;
        localb.iDT = ((TextView)localLinearLayout.findViewById(2131828855));
        localb.kEq = ((TextView)localLinearLayout.findViewById(2131828856));
        localb.aaX = ((RadioButton)localLinearLayout.findViewById(2131828857));
        ab.d("MicroMsg.WalletLqtArriveTimeLayout", "arrive wording: %s", new Object[] { localbqr.wTb });
        localb.iDT.setText(localbqr.wTb);
        if (!bo.isNullOrNil(localbqr.wTc))
          localb.kEq.setText(localbqr.wTc);
        while (true)
        {
          if (i == 0)
          {
            localb.aaX.setChecked(true);
            this.thW = localbqr;
          }
          localb.index = i;
          localLinearLayout.setTag(localb);
          localLinearLayout.setOnClickListener(this.nij);
          this.thV.add(new WeakReference(localb));
          addView(localLinearLayout);
          i++;
          break;
          localb.kEq.setVisibility(8);
        }
      }
    }
    AppMethodBeat.o(45508);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtArriveTimeLayout
 * JD-Core Version:    0.6.2
 */