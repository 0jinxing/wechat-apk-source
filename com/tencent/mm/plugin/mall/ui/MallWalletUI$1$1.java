package com.tencent.mm.plugin.mall.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.plugin.wallet_core.utils.e;
import com.tencent.mm.plugin.wallet_core.utils.e.2;
import com.tencent.mm.plugin.wallet_core.utils.e.3;
import com.tencent.mm.plugin.wallet_core.utils.e.4;
import com.tencent.mm.plugin.wallet_core.utils.e.5;
import com.tencent.mm.plugin.wallet_core.utils.e.6;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.protocal.protobuf.bam;
import com.tencent.mm.protocal.protobuf.bdq;
import com.tencent.mm.protocal.protobuf.bdr;
import com.tencent.mm.protocal.protobuf.bol;
import com.tencent.mm.protocal.protobuf.btr;
import com.tencent.mm.protocal.protobuf.cfy;
import com.tencent.mm.protocal.protobuf.cnv;
import com.tencent.mm.protocal.protobuf.cnx;
import com.tencent.mm.protocal.protobuf.ms;
import com.tencent.mm.protocal.protobuf.mt;
import com.tencent.mm.protocal.protobuf.tz;
import com.tencent.mm.protocal.protobuf.ux;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.MMSwitchBtn;
import java.util.Iterator;
import java.util.LinkedList;

final class MallWalletUI$1$1
  implements Runnable
{
  MallWalletUI$1$1(MallWalletUI.1 param1, bol parambol)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(43263);
    MallWalletUI localMallWalletUI;
    Object localObject1;
    MallWalletUI.1.1.1 local1;
    if (((MallWalletUI.d(this.onU.onS) == null) || (!MallWalletUI.d(this.onU.onS).isShowing())) && (!this.onU.onS.isFinishing()) && (!MallWalletUI.e(this.onU.onS)))
    {
      localMallWalletUI = this.onU.onS;
      localObject1 = this.onU.onS;
      localObject2 = this.onT.vCP.wVG;
      local1 = new MallWalletUI.1.1.1(this);
      if (localObject2 != null)
        break label159;
    }
    label159: Dialog localDialog;
    for (Object localObject2 = null; ; localObject2 = localDialog)
    {
      MallWalletUI.a(localMallWalletUI, (Dialog)localObject2);
      this.onU.onS.addDialog(MallWalletUI.d(this.onU.onS));
      MallWalletUI.d(this.onU.onS).show();
      MallWalletUI.f(this.onU.onS);
      AppMethodBeat.o(43263);
      return;
      localDialog = new Dialog((Context)localObject1, 2131493867);
      ViewGroup localViewGroup = (ViewGroup)LayoutInflater.from((Context)localObject1).inflate(2130971086, null, false);
      Object localObject4;
      int i;
      if ((((ux)localObject2).wcs != null) && (((ux)localObject2).wcs.wHt != null))
      {
        localObject3 = (CdnImageView)localViewGroup.findViewById(2131828768);
        localObject4 = ((ux)localObject2).wcs.wHt;
        if (((bdr)localObject4).type == 1)
        {
          e.a((CdnImageView)localObject3, ((bdr)localObject4).vQK, 2130839088, true);
          i = BackwardSupportUtil.b.b((Context)localObject1, 50.0F);
          bo.n((View)localObject3, i, i, i, i);
          ((CdnImageView)localObject3).setOnClickListener(new e.2(localDialog));
        }
      }
      Object localObject3 = (LinearLayout)localViewGroup.findViewById(2131828769);
      if ((((ux)localObject2).wcu != null) && (!((ux)localObject2).wcu.isEmpty()))
      {
        Iterator localIterator = ((ux)localObject2).wcu.iterator();
        while (localIterator.hasNext())
        {
          localObject2 = (cnv)localIterator.next();
          localObject1 = new LinearLayout.LayoutParams(-2, -2);
          if (((cnv)localObject2).type == 1)
          {
            localObject4 = new TextView(((LinearLayout)localObject3).getContext());
            e.a((TextView)localObject4, ((cnv)localObject2).wbo, null);
            e.a((View)localObject4, (ViewGroup.MarginLayoutParams)localObject1, ((cnv)localObject2).xlr);
            ((LinearLayout)localObject3).addView((View)localObject4, (ViewGroup.LayoutParams)localObject1);
          }
          else if (((cnv)localObject2).type == 11)
          {
            localObject4 = new CdnImageView(((LinearLayout)localObject3).getContext());
            i = a.fromDPToPix(((LinearLayout)localObject3).getContext(), 64);
            e.a((CdnImageView)localObject4, ((cnv)localObject2).vQK, -1, false);
            ((CdnImageView)localObject4).setMinimumWidth(i);
            ((CdnImageView)localObject4).setMinimumHeight(i);
            e.a((View)localObject4, (ViewGroup.MarginLayoutParams)localObject1, ((cnv)localObject2).xlr);
            ((LinearLayout)localObject3).addView((View)localObject4, (ViewGroup.LayoutParams)localObject1);
          }
          else if (((cnv)localObject2).type == 20)
          {
            localObject1 = ((cnv)localObject2).xlq;
            cnx localcnx = ((cnv)localObject2).xlr;
            if (localObject1 != null)
            {
              ((LinearLayout)localObject3).setGravity(1);
              if (((mt)localObject1).vQM != null)
              {
                LinearLayout localLinearLayout = new LinearLayout(((LinearLayout)localObject3).getContext());
                localLinearLayout.setGravity(48);
                localLinearLayout.setOrientation(0);
                localObject2 = ((LinearLayout)localObject3).getContext();
                localObject4 = ((mt)localObject1).vQM.wbn;
                label601: TextView localTextView;
                Context localContext;
                ms localms;
                if (localObject4 != null)
                  if (((cfy)localObject4).xeY == 0)
                  {
                    localObject2 = new MMSwitchBtn((Context)localObject2);
                    if (((cfy)localObject4).wRi == 0)
                    {
                      ((MMSwitchBtn)localObject2).setCheck(false);
                      localTextView = new TextView(((LinearLayout)localObject3).getContext());
                      e.a(localTextView, ((mt)localObject1).vQM.wbo, null);
                      localContext = ((LinearLayout)localObject3).getContext();
                      localms = ((mt)localObject1).vQN;
                      if (localms == null)
                        break label1183;
                      if (localms.vQJ != 1)
                        break label1094;
                      localObject4 = new Button(localContext);
                      ((Button)localObject4).setTextSize(0, a.al(localContext, 2131427773));
                      ((Button)localObject4).setTextColor(localContext.getResources().getColor(2131690780));
                      ((Button)localObject4).setBackgroundResource(2130838000);
                      ((Button)localObject4).setGravity(17);
                      ((Button)localObject4).setAllCaps(true);
                      ((Button)localObject4).setPadding(a.al(localContext, 2131427852), 0, a.al(localContext, 2131427852), 0);
                      ((Button)localObject4).setWidth(a.fromDPToPix(localContext, 184));
                      ((Button)localObject4).setHeight(a.fromDPToPix(localContext, 40));
                      if (localms.state != 1)
                        break label1085;
                      ((Button)localObject4).setEnabled(true);
                      label781: ((Button)localObject4).setText(localms.text);
                      localObject1 = localObject4;
                      if (localms.kdC == 1)
                      {
                        ((Button)localObject4).setOnClickListener(new e.5(localContext, localms, local1));
                        localObject1 = localObject4;
                      }
                      label824: localObject4 = new LinearLayout.LayoutParams(-2, -2);
                      if ((localcnx != null) && (localcnx.xlt != null))
                        ((LinearLayout.LayoutParams)localObject4).topMargin = a.fromDPToPix(ah.getContext(), (int)localcnx.xlt.top);
                      ((LinearLayout.LayoutParams)localObject4).bottomMargin = a.fromDPToPix(ah.getContext(), 32);
                      ((LinearLayout)localObject3).addView(localLinearLayout, (ViewGroup.LayoutParams)localObject4);
                      if (localObject2 != null)
                      {
                        localLinearLayout.addView((View)localObject2);
                        if (!(localObject2 instanceof MMSwitchBtn))
                          break label1188;
                        ((MMSwitchBtn)localObject2).setSwitchListener(new e.3((View)localObject1));
                      }
                    }
                  }
                while (true)
                {
                  localLinearLayout.addView(localTextView);
                  if (localObject1 == null)
                    break;
                  localObject2 = new LinearLayout.LayoutParams(-2, -2);
                  if ((localcnx != null) && (localcnx.xlt != null))
                    ((LinearLayout.LayoutParams)localObject2).bottomMargin = a.fromDPToPix(ah.getContext(), (int)localcnx.xlt.bottom);
                  ((LinearLayout)localObject3).addView((View)localObject1, (ViewGroup.LayoutParams)localObject2);
                  break;
                  if (((cfy)localObject4).wRi == 1)
                  {
                    ((MMSwitchBtn)localObject2).setCheck(true);
                    break label601;
                  }
                  ((MMSwitchBtn)localObject2).setEnabled(false);
                  break label601;
                  if (((cfy)localObject4).xeY == 1)
                  {
                    localObject2 = new CheckBox((Context)localObject2);
                    ((CheckBox)localObject2).setBackgroundResource(2130839523);
                    if (((cfy)localObject4).wRi == 0)
                    {
                      ((CheckBox)localObject2).setChecked(false);
                      break label601;
                    }
                    if (((cfy)localObject4).wRi == 1)
                    {
                      ((CheckBox)localObject2).setChecked(true);
                      break label601;
                    }
                    ((CheckBox)localObject2).setEnabled(false);
                    break label601;
                  }
                  localObject2 = null;
                  break label601;
                  label1085: ((Button)localObject4).setEnabled(false);
                  break label781;
                  label1094: if (localms.vQJ == 0)
                  {
                    localObject4 = new CdnImageView(localContext);
                    e.a((CdnImageView)localObject4, localms.vQK);
                    if (localms.state == 1)
                      ((CdnImageView)localObject4).setEnabled(true);
                    while (true)
                    {
                      localObject1 = localObject4;
                      if (localms.kdC != 1)
                        break;
                      ((CdnImageView)localObject4).setOnClickListener(new e.6(localContext, localms, local1));
                      localObject1 = localObject4;
                      break;
                      ((CdnImageView)localObject4).setEnabled(false);
                    }
                  }
                  label1183: localObject1 = null;
                  break label824;
                  label1188: if ((localObject2 instanceof CheckBox))
                    ((CheckBox)localObject2).setOnCheckedChangeListener(new e.4((View)localObject1));
                }
              }
            }
          }
        }
      }
      localDialog.setContentView(localViewGroup);
      localDialog.setCancelable(true);
      localDialog.setCanceledOnTouchOutside(false);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.ui.MallWalletUI.1.1
 * JD-Core Version:    0.6.2
 */