package com.tencent.mm.plugin.order.ui.a;

import android.content.Context;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.order.model.MallTransactionObject;
import com.tencent.mm.plugin.order.model.a;
import com.tencent.mm.plugin.order.model.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceSmallCategory;
import com.tencent.mm.wallet_core.ui.e;
import java.util.ArrayList;
import java.util.List;

public final class b
  implements a.a
{
  public final List<Preference> a(Context paramContext, final com.tencent.mm.ui.base.preference.f paramf, final MallTransactionObject paramMallTransactionObject)
  {
    AppMethodBeat.i(43897);
    ArrayList localArrayList = new ArrayList();
    if (paramMallTransactionObject.coq == 2);
    Object localObject1;
    for (int i = 1; ; i = 0)
    {
      if ((!bo.isNullOrNil(paramMallTransactionObject.pcn)) && (!bo.isNullOrNil(paramMallTransactionObject.hgW)))
      {
        localObject1 = new d(paramContext);
        ((d)localObject1).kWC = paramMallTransactionObject.hgW;
        ((d)localObject1).mName = paramMallTransactionObject.pcn;
        ((d)localObject1).mOnClickListener = new b.1(this, paramMallTransactionObject, paramContext);
        localArrayList.add(localObject1);
        localArrayList.add(new PreferenceSmallCategory(paramContext));
      }
      ab.i("MicroMsg.FetchOrderPrefFactory", "getOrderPrefList() chargeFee is " + paramMallTransactionObject.pcC + " and fetchTotalFee is " + paramMallTransactionObject.pcM);
      if (TextUtils.isEmpty(paramMallTransactionObject.pcC))
        break;
      localObject1 = new i(paramContext);
      ((i)localObject1).peQ = e.e(paramMallTransactionObject.pcM, paramMallTransactionObject.pcl);
      ((i)localObject1).setTitle(paramContext.getString(2131305035));
      if (!bo.isNullOrNil(paramMallTransactionObject.pcN))
        ((i)localObject1).UA(paramMallTransactionObject.pcN);
      localArrayList.add(localObject1);
      localObject1 = new h(paramContext);
      ((h)localObject1).peN = false;
      ((h)localObject1).peO = true;
      localArrayList.add(localObject1);
      localObject1 = new f(paramContext);
      ((f)localObject1).setTitle(2131305052);
      ((f)localObject1).setContent(e.e(paramMallTransactionObject.kCJ, paramMallTransactionObject.pcl));
      localArrayList.add(localObject1);
      localObject1 = new f(paramContext);
      ((f)localObject1).setTitle(2131305036);
      ((f)localObject1).setContent(paramMallTransactionObject.pcC);
      localArrayList.add(localObject1);
      if (!bo.isNullOrNil(paramMallTransactionObject.desc))
      {
        if (i == 0)
          break label1136;
        paramf = new f(paramContext);
        paramf.setTitle(2131305058);
        paramf.setContent(paramMallTransactionObject.desc);
        localArrayList.add(paramf);
      }
      if (!bo.isNullOrNil(paramMallTransactionObject.pca))
      {
        paramf = new f(paramContext);
        paramf.setTitle(2131305059);
        paramf.setContent(paramMallTransactionObject.pca);
        localArrayList.add(paramf);
      }
      if (!bo.isNullOrNil(paramMallTransactionObject.pcf))
      {
        paramf = new f(paramContext);
        paramf.setTitle(2131305075);
        paramf.setContent(paramMallTransactionObject.pcf);
        if (!bo.isNullOrNil(paramMallTransactionObject.pcg))
          paramf.Uz(paramMallTransactionObject.pcg);
        localArrayList.add(paramf);
      }
      paramf = new f(paramContext);
      paramf.setTitle(2131305055);
      paramf.setContent(e.kC(paramMallTransactionObject.fDG));
      localArrayList.add(paramf);
      if (paramMallTransactionObject.pcy <= 0)
        break label1279;
      paramf = new f(paramContext);
      paramf.setTitle(2131305053);
      paramf.setContent(e.kC(paramMallTransactionObject.pcy));
      localArrayList.add(paramf);
      label563: if (!bo.isNullOrNil(paramMallTransactionObject.pcj))
      {
        localObject2 = new f(paramContext);
        ((f)localObject2).setTitle(2131305054);
        localObject1 = paramMallTransactionObject.pcj;
        paramf = (com.tencent.mm.ui.base.preference.f)localObject1;
        if (!bo.isNullOrNil(paramMallTransactionObject.pck))
          paramf = (String)localObject1 + "(" + paramMallTransactionObject.pck + ")";
        ((f)localObject2).setContent(paramf);
        localArrayList.add(localObject2);
      }
      if (!bo.isNullOrNil(paramMallTransactionObject.pci))
      {
        paramf = new f(paramContext);
        paramf.setTitle(2131305057);
        paramf.setContent(paramMallTransactionObject.pci);
        localArrayList.add(paramf);
      }
      if ((bo.isNullOrNil(paramMallTransactionObject.pcv)) && (bo.isNullOrNil(paramMallTransactionObject.pcm)) && (bo.isNullOrNil(paramMallTransactionObject.pbP)))
        break label1336;
      paramf = new h(paramContext);
      paramf.peN = true;
      localArrayList.add(paramf);
      localArrayList.add(a.a(paramContext, paramMallTransactionObject));
      label766: AppMethodBeat.o(43897);
      return localArrayList;
    }
    Object localObject2 = new i(paramContext);
    ((i)localObject2).peQ = e.e(paramMallTransactionObject.kCJ, paramMallTransactionObject.pcl);
    label819: boolean bool1;
    if (i != 0)
    {
      localObject1 = paramContext.getString(2131305034);
      ((i)localObject2).setTitle((CharSequence)localObject1);
      if (!bo.isNullOrNil(paramMallTransactionObject.pcd))
        ((i)localObject2).UA(paramMallTransactionObject.pcd);
      localArrayList.add(localObject2);
      if ((paramMallTransactionObject.kCJ == paramMallTransactionObject.pcr) || (paramMallTransactionObject.pcr <= 0.0D))
        break label1367;
      localObject1 = new h(paramContext);
      ((h)localObject1).peN = false;
      ((h)localObject1).peO = true;
      localArrayList.add(localObject1);
      localObject1 = new f(paramContext);
      ((f)localObject1).setContent(e.e(paramMallTransactionObject.pcr, paramMallTransactionObject.pcl));
      ((f)localObject1).setTitle(2131305060);
      localArrayList.add(localObject1);
      bool1 = true;
      bool2 = bool1;
      if (!bo.isNullOrNil(paramMallTransactionObject.pcq))
      {
        localObject2 = new g(paramContext);
        ((g)localObject2).setTitle(2131305046);
        ((g)localObject2).iFE = paramf;
        localObject1 = paramMallTransactionObject.pcq.split("\n");
        if (localObject1.length != 1)
          break label1079;
        ((g)localObject2).peG = localObject1[0];
        label1018: localArrayList.add(localObject2);
      }
    }
    label1079: label1336: label1367: for (boolean bool2 = bool1; ; bool2 = false)
    {
      localObject1 = new h(paramContext);
      ((h)localObject1).peN = bool2;
      ((h)localObject1).peO = true;
      localArrayList.add(localObject1);
      break;
      localObject1 = paramContext.getString(2131305052);
      break label819;
      ((g)localObject2).peG = paramContext.getString(2131305048, new Object[] { Integer.valueOf(localObject1.length), e.e(paramMallTransactionObject.pcr - paramMallTransactionObject.kCJ, paramMallTransactionObject.pcl) });
      ((g)localObject2).a((String[])localObject1, TextUtils.TruncateAt.MIDDLE);
      break label1018;
      label1136: localObject2 = new f(paramContext);
      ((f)localObject2).setTitle(2131305044);
      if (!bo.isNullOrNil(paramMallTransactionObject.pcb))
      {
        String str = paramContext.getString(2131305037);
        localObject1 = paramMallTransactionObject.desc + " " + str;
        int j = paramMallTransactionObject.desc.length();
        i = paramMallTransactionObject.desc.length();
        ((f)localObject2).a((String)localObject1, j + 1, str.length() + (i + 1), new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            AppMethodBeat.i(43896);
            paramAnonymousView = paramMallTransactionObject.desc + "\n" + paramMallTransactionObject.pcb;
            this.pet.setContent(paramAnonymousView);
            paramf.notifyDataSetChanged();
            AppMethodBeat.o(43896);
          }
        });
      }
      while (true)
      {
        localArrayList.add(localObject2);
        break;
        ((f)localObject2).setContent(paramMallTransactionObject.desc);
      }
      label1279: if (paramMallTransactionObject.pcx > 0)
      {
        paramf = new f(paramContext);
        paramf.setTitle(2131305056);
        paramf.setContent(e.kC(paramMallTransactionObject.pcx));
        localArrayList.add(paramf);
        break label563;
      }
      ab.e("MicroMsg.FetchOrderPrefFactory", "hy: is fetch but no arrive time or fetch time");
      break label563;
      paramContext = new h(paramContext);
      paramContext.peN = true;
      paramContext.jlN = false;
      localArrayList.add(paramContext);
      break label766;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.ui.a.b
 * JD-Core Version:    0.6.2
 */