package com.tencent.mm.plugin.mall.ui;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.protocal.protobuf.biu;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.MMSwitchBtn;
import java.util.List;

final class MallFunctionSettingsUI$a extends BaseAdapter
{
  private MallFunctionSettingsUI$a(MallFunctionSettingsUI paramMallFunctionSettingsUI)
  {
  }

  private MallFunctionSettingsUI.b yp(int paramInt)
  {
    AppMethodBeat.i(43154);
    MallFunctionSettingsUI.b localb = (MallFunctionSettingsUI.b)MallFunctionSettingsUI.b(this.oml).get(paramInt);
    AppMethodBeat.o(43154);
    return localb;
  }

  public final int getCount()
  {
    AppMethodBeat.i(43153);
    int i = MallFunctionSettingsUI.b(this.oml).size();
    AppMethodBeat.o(43153);
    return i;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final int getItemViewType(int paramInt)
  {
    AppMethodBeat.i(43155);
    paramInt = ((MallFunctionSettingsUI.b)MallFunctionSettingsUI.b(this.oml).get(paramInt)).type;
    AppMethodBeat.o(43155);
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(43156);
    Object localObject1 = paramView;
    Object localObject2;
    if (paramView == null)
    {
      int i = getItemViewType(paramInt);
      localObject1 = new MallFunctionSettingsUI.c(this.oml, (byte)0);
      if (i == 1)
      {
        paramView = LayoutInflater.from(this.oml.mController.ylL).inflate(2130970026, paramViewGroup, false);
        ((MallFunctionSettingsUI.c)localObject1).ntk = ((CdnImageView)paramView.findViewById(2131825749));
        ((MallFunctionSettingsUI.c)localObject1).iDT = ((TextView)paramView.findViewById(2131825750));
        ((MallFunctionSettingsUI.c)localObject1).kEq = ((TextView)paramView.findViewById(2131825751));
        ((MallFunctionSettingsUI.c)localObject1).omp = ((MMSwitchBtn)paramView.findViewById(2131825752));
        ((MallFunctionSettingsUI.c)localObject1).lBD = paramView.findViewById(2131825754);
        ((MallFunctionSettingsUI.c)localObject1).omq = paramView.findViewById(2131825753);
        ((MallFunctionSettingsUI.c)localObject1).iMc = ((ViewGroup)paramView);
        ((MallFunctionSettingsUI.c)localObject1).ntk.setUseSdcardCache(true);
        paramView.setTag(localObject1);
        localObject1 = paramView;
      }
    }
    else
    {
      paramView = yp(paramInt);
      paramViewGroup = (MallFunctionSettingsUI.c)((View)localObject1).getTag();
      if (paramView.type != 1)
        break label574;
      localObject2 = paramView.omn;
      if (((biu)localObject2).wMg != null)
        paramViewGroup.ntk.setUrl(((biu)localObject2).wMg.dlY());
      if (((biu)localObject2).wMf != null)
        paramViewGroup.iDT.setText(((biu)localObject2).wMf.dlY());
      if ((((biu)localObject2).wMh == null) || (bo.isNullOrNil(((biu)localObject2).wMh.dlY())))
        break label449;
      paramViewGroup.kEq.setText(((biu)localObject2).wMh.dlY());
      paramViewGroup.kEq.setVisibility(0);
      label285: if (((biu)localObject2).jBT != 0)
        break label461;
      paramViewGroup.omp.setCheck(true);
      paramViewGroup.omp.setEnabled(true);
      paramViewGroup.iDT.setTextColor(paramViewGroup.oml.mController.ylL.getResources().getColor(2131689763));
      paramViewGroup.omq.setVisibility(8);
      label343: paramViewGroup.omp.setSwitchListener(new MallFunctionSettingsUI.c.1(paramViewGroup, (biu)localObject2));
      localObject2 = (LinearLayout.LayoutParams)paramViewGroup.lBD.getLayoutParams();
      if (!paramView.omo)
        break label559;
      ((LinearLayout.LayoutParams)localObject2).leftMargin = 0;
      label385: paramViewGroup.lBD.setLayoutParams((ViewGroup.LayoutParams)localObject2);
    }
    while (true)
    {
      AppMethodBeat.o(43156);
      return localObject1;
      paramView = LayoutInflater.from(this.oml.mController.ylL).inflate(2130970027, paramViewGroup, false);
      ((MallFunctionSettingsUI.c)localObject1).iDT = ((TextView)paramView.findViewById(2131825755));
      ((MallFunctionSettingsUI.c)localObject1).iMc = ((ViewGroup)paramView);
      break;
      label449: paramViewGroup.kEq.setVisibility(8);
      break label285;
      label461: if (((biu)localObject2).jBT == 1)
      {
        paramViewGroup.omp.setCheck(false);
        paramViewGroup.omp.setEnabled(true);
        paramViewGroup.iDT.setTextColor(paramViewGroup.oml.mController.ylL.getResources().getColor(2131689763));
        paramViewGroup.omq.setVisibility(8);
        break label343;
      }
      if (((biu)localObject2).jBT != 2)
        break label343;
      paramViewGroup.omp.setCheck(false);
      paramViewGroup.omp.setEnabled(false);
      paramViewGroup.omq.setVisibility(0);
      break label343;
      label559: ((LinearLayout.LayoutParams)localObject2).leftMargin = MallFunctionSettingsUI.c(paramViewGroup.oml);
      break label385;
      label574: if (paramView.type == 0)
        paramViewGroup.iDT.setText(paramView.title);
    }
  }

  public final int getViewTypeCount()
  {
    return 2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.ui.MallFunctionSettingsUI.a
 * JD-Core Version:    0.6.2
 */