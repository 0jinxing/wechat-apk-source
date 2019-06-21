package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.List;

final class BankRemitSelectPayeeUI$b extends BaseAdapter
{
  private BankRemitSelectPayeeUI$b(BankRemitSelectPayeeUI paramBankRemitSelectPayeeUI)
  {
  }

  private boolean cfn()
  {
    AppMethodBeat.i(44687);
    boolean bool;
    if (BankRemitSelectPayeeUI.d(this.pOo) >= 0)
    {
      bool = true;
      AppMethodBeat.o(44687);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(44687);
    }
  }

  private boolean cfo()
  {
    AppMethodBeat.i(44688);
    boolean bool;
    if (BankRemitSelectPayeeUI.e(this.pOo) >= 0)
    {
      bool = true;
      AppMethodBeat.o(44688);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(44688);
    }
  }

  public final int getCount()
  {
    AppMethodBeat.i(44682);
    int i = BankRemitSelectPayeeUI.c(this.pOo).size();
    int j = i;
    if (cfn())
      j = i + 1;
    i = j;
    if (cfo())
      i = j + 1;
    AppMethodBeat.o(44682);
    return i;
  }

  public final Object getItem(int paramInt)
  {
    Object localObject = null;
    AppMethodBeat.i(44683);
    if ((paramInt == BankRemitSelectPayeeUI.d(this.pOo)) || (paramInt == BankRemitSelectPayeeUI.e(this.pOo)))
      AppMethodBeat.o(44683);
    while (true)
    {
      return localObject;
      if (paramInt < BankRemitSelectPayeeUI.e(this.pOo))
      {
        localObject = BankRemitSelectPayeeUI.c(this.pOo).get(paramInt - 1);
        AppMethodBeat.o(44683);
      }
      else if ((cfo()) && (paramInt > BankRemitSelectPayeeUI.e(this.pOo)))
      {
        if (cfn())
        {
          localObject = BankRemitSelectPayeeUI.c(this.pOo).get(paramInt - 2);
          AppMethodBeat.o(44683);
        }
        else
        {
          localObject = BankRemitSelectPayeeUI.c(this.pOo).get(paramInt - 1);
          AppMethodBeat.o(44683);
        }
      }
      else if (cfn())
      {
        localObject = BankRemitSelectPayeeUI.c(this.pOo).get(paramInt - 1);
        AppMethodBeat.o(44683);
      }
      else
      {
        ab.i("MicroMsg.BankRemitSelectPayeeUI", "maybe wrong pos: [%s,%s,%s]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(BankRemitSelectPayeeUI.d(this.pOo)), Integer.valueOf(BankRemitSelectPayeeUI.e(this.pOo)) });
        AppMethodBeat.o(44683);
      }
    }
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final int getItemViewType(int paramInt)
  {
    AppMethodBeat.i(44685);
    if ((paramInt == BankRemitSelectPayeeUI.d(this.pOo)) || (paramInt == BankRemitSelectPayeeUI.e(this.pOo)))
    {
      paramInt = 0;
      AppMethodBeat.o(44685);
    }
    while (true)
    {
      return paramInt;
      paramInt = 1;
      AppMethodBeat.o(44685);
    }
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(44686);
    int i = getItemViewType(paramInt);
    View localView = paramView;
    if (paramView == null)
    {
      if (i == 0)
        localView = LayoutInflater.from(this.pOo.mController.ylL).inflate(2130968826, paramViewGroup, false);
    }
    else
      switch (i)
      {
      default:
        ab.w("MicroMsg.BankRemitSelectPayeeUI", "unknown type: %d", new Object[] { Integer.valueOf(i) });
      case 0:
      case 1:
      }
    while (true)
    {
      AppMethodBeat.o(44686);
      return localView;
      localView = LayoutInflater.from(this.pOo.mController.ylL).inflate(2130968827, paramViewGroup, false);
      paramView = new BankRemitSelectPayeeUI.a(this.pOo, (byte)0);
      paramView.pOt = ((CdnImageView)localView.findViewById(2131821690));
      paramView.pMb = ((TextView)localView.findViewById(2131821691));
      paramView.pOu = ((TextView)localView.findViewById(2131821692));
      localView.setTag(paramView);
      break;
      paramView = (TextView)localView.findViewById(2131821688);
      if (BankRemitSelectPayeeUI.d(this.pOo) == paramInt);
      for (i = 1; ; i = 0)
      {
        if (i == 0)
          break label230;
        paramView.setText(2131297484);
        break;
      }
      label230: if (BankRemitSelectPayeeUI.e(this.pOo) == paramInt);
      for (i = 1; ; i = 0)
      {
        if (i == 0)
          break label264;
        paramView.setText(2131297482);
        break;
      }
      label264: paramView.setText("");
      ab.w("MicroMsg.BankRemitSelectPayeeUI", "wrong header pos: %s", new Object[] { Integer.valueOf(paramInt) });
      continue;
      paramViewGroup = (BankRemitSelectPayeeUI.a)localView.getTag();
      paramView = (TransferRecordParcel)getItem(paramInt);
      if (paramView != null)
      {
        paramViewGroup.pOt.eb(paramView.pLH, 2131690597);
        if (!bo.isNullOrNil(paramView.pMg))
        {
          SpannableString localSpannableString = j.b(paramViewGroup.pOo.mController.ylL, paramViewGroup.pOo.mController.ylL.getString(2131297481, new Object[] { paramView.pMf, paramView.pMg }));
          paramViewGroup.pMb.setText(localSpannableString);
        }
        while (true)
        {
          paramViewGroup.pOu.setText(paramViewGroup.pOo.getString(2131297481, new Object[] { paramView.nuL, paramView.pMe }));
          break;
          paramViewGroup.pMb.setText(paramView.pMf);
        }
      }
      paramViewGroup.pOt.setImageResource(2131690597);
      paramViewGroup.pMb.setText("");
      paramViewGroup.pOu.setText("");
      ab.w("MicroMsg.BankRemitSelectPayeeUI", "empty record");
    }
  }

  public final int getViewTypeCount()
  {
    return 2;
  }

  public final boolean isEnabled(int paramInt)
  {
    AppMethodBeat.i(44684);
    boolean bool;
    if ((paramInt == BankRemitSelectPayeeUI.d(this.pOo)) || (paramInt == BankRemitSelectPayeeUI.e(this.pOo)))
    {
      bool = false;
      AppMethodBeat.o(44684);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(44684);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI.b
 * JD-Core Version:    0.6.2
 */