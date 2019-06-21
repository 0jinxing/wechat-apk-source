package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.protocal.protobuf.atf;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

final class BankRemitHistoryUI$a extends BaseAdapter
{
  private SimpleDateFormat pJi;

  private BankRemitHistoryUI$a(BankRemitHistoryUI paramBankRemitHistoryUI)
  {
    AppMethodBeat.i(44614);
    this.pJi = new SimpleDateFormat(this.pNs.mController.ylL.getString(2131297463));
    AppMethodBeat.o(44614);
  }

  private String fQ(long paramLong)
  {
    AppMethodBeat.i(44618);
    String str = this.pJi.format(new Date(1000L * paramLong));
    AppMethodBeat.o(44618);
    return str;
  }

  public final int getCount()
  {
    AppMethodBeat.i(44615);
    int i = BankRemitHistoryUI.i(this.pNs).size();
    AppMethodBeat.o(44615);
    return i;
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(44616);
    Object localObject = BankRemitHistoryUI.i(this.pNs).get(paramInt);
    AppMethodBeat.o(44616);
    return localObject;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(44617);
    View localView = paramView;
    if (paramView == null)
    {
      localView = LayoutInflater.from(this.pNs.mController.ylL).inflate(2130968818, paramViewGroup, false);
      localView.setTag(new BankRemitHistoryUI.b(this.pNs, localView));
    }
    paramView = (BankRemitHistoryUI.b)localView.getTag();
    paramViewGroup = (atf)getItem(paramInt);
    String str = fQ(paramViewGroup.wxg);
    if (paramInt == 0)
      paramInt = 1;
    while (true)
    {
      if (paramInt != 0)
      {
        paramView.pNv.setText(str);
        paramView.pNv.setVisibility(0);
        label107: paramView.pNy.setUrl(paramViewGroup.pLH);
        paramView.hrg.setText(paramViewGroup.title);
        paramView.pNw.setText(paramViewGroup.wxh);
        paramView.gnf.setText(paramViewGroup.wxf);
        if (bo.isNullOrNil(paramViewGroup.wxi))
          break label254;
        if (!bo.isNullOrNil(paramViewGroup.wxj))
          paramView.pNx.setTextColor(Color.parseColor(paramViewGroup.wxj));
        paramView.pNx.setText(paramViewGroup.wxi);
        paramView.pNx.setVisibility(0);
      }
      while (true)
      {
        AppMethodBeat.o(44617);
        return localView;
        if (str.equals(fQ(((atf)getItem(paramInt - 1)).wxg)))
          break label266;
        paramInt = 1;
        break;
        paramView.pNv.setVisibility(8);
        break label107;
        label254: paramView.pNx.setVisibility(8);
      }
      label266: paramInt = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitHistoryUI.a
 * JD-Core Version:    0.6.2
 */