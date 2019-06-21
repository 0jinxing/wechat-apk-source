package com.tencent.mm.plugin.order.ui.a;

import android.content.Context;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.order.model.MallTransactionObject;
import com.tencent.mm.plugin.order.model.a.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceSmallCategory;
import com.tencent.mm.wallet_core.ui.e;
import java.util.ArrayList;
import java.util.List;

public final class a
  implements a.a
{
  public com.tencent.mm.wallet_core.ui.c peq;

  public final List<Preference> a(Context paramContext, com.tencent.mm.ui.base.preference.f paramf, MallTransactionObject paramMallTransactionObject)
  {
    AppMethodBeat.i(43893);
    ArrayList localArrayList = new ArrayList();
    int i;
    Object localObject1;
    Object localObject2;
    label153: label357: int j;
    if (paramMallTransactionObject.coq == 2)
    {
      i = 1;
      if ((!bo.isNullOrNil(paramMallTransactionObject.pcn)) && (!bo.isNullOrNil(paramMallTransactionObject.hgW)))
      {
        localObject1 = new d(paramContext);
        ((d)localObject1).kWC = paramMallTransactionObject.hgW;
        ((d)localObject1).mName = paramMallTransactionObject.pcn;
        ((d)localObject1).mOnClickListener = new a.1(this, paramMallTransactionObject, paramContext);
        localArrayList.add(localObject1);
        localArrayList.add(new PreferenceSmallCategory(paramContext));
      }
      localObject2 = new i(paramContext);
      ((i)localObject2).peQ = e.e(paramMallTransactionObject.kCJ, paramMallTransactionObject.pcl);
      if (i == 0)
        break label1567;
      localObject1 = paramContext.getString(2131305034);
      ((i)localObject2).setTitle((CharSequence)localObject1);
      if (!bo.isNullOrNil(paramMallTransactionObject.pcd))
        ((i)localObject2).UA(paramMallTransactionObject.pcd);
      localArrayList.add(localObject2);
      boolean bool = false;
      if (paramMallTransactionObject.kCJ != paramMallTransactionObject.pcr)
      {
        localObject1 = new h(paramContext);
        ((h)localObject1).peN = false;
        ((h)localObject1).peO = true;
        localArrayList.add(localObject1);
        localObject1 = new f(paramContext);
        ((f)localObject1).setContent(e.e(paramMallTransactionObject.pcr, paramMallTransactionObject.pcl));
        ((f)localObject1).setTitle(2131305060);
        localArrayList.add(localObject1);
        bool = true;
      }
      if ((paramMallTransactionObject.kCJ != paramMallTransactionObject.pcr) && (!bo.isNullOrNil(paramMallTransactionObject.pcq)))
      {
        localObject1 = new g(paramContext);
        ((g)localObject1).setTitle(2131305046);
        ((g)localObject1).iFE = paramf;
        localObject2 = paramMallTransactionObject.pcq.split("\n");
        if (localObject2.length != 1)
          break label1600;
        ((g)localObject1).peG = localObject2[0];
        localArrayList.add(localObject1);
      }
      localObject1 = new h(paramContext);
      ((h)localObject1).peN = bool;
      ((h)localObject1).peO = true;
      localArrayList.add(localObject1);
      if ((i == 0) && (!bo.isNullOrNil(paramMallTransactionObject.pcA)))
      {
        com.tencent.mm.kernel.g.RQ();
        localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(paramMallTransactionObject.pcA);
        if ((localObject1 != null) && ((int)((com.tencent.mm.n.a)localObject1).ewQ > 0))
        {
          localObject1 = ((com.tencent.mm.n.a)localObject1).Oj();
          localObject2 = new f(paramContext);
          ((f)localObject2).setTitle(2131305074);
          ((f)localObject2).setContent((String)localObject1);
          localArrayList.add(localObject2);
        }
      }
      if ((paramMallTransactionObject.cQO == 31) && (i != 0) && (!bo.isNullOrNil(paramMallTransactionObject.pcH)))
      {
        com.tencent.mm.kernel.g.RQ();
        localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(paramMallTransactionObject.pcH);
        if ((localObject1 != null) && ((int)((com.tencent.mm.n.a)localObject1).ewQ > 0))
        {
          localObject1 = ((com.tencent.mm.n.a)localObject1).Oj();
          localObject2 = new f(paramContext);
          ((f)localObject2).setTitle(2131305058);
          ((f)localObject2).setContent((String)localObject1);
          localArrayList.add(localObject2);
        }
      }
      if (!bo.isNullOrNil(paramMallTransactionObject.desc))
      {
        if (i == 0)
          break label1667;
        paramf = new f(paramContext);
        if ((paramMallTransactionObject.cQO != 32) && (paramMallTransactionObject.cQO != 33) && (paramMallTransactionObject.cQO != 31))
          break label1657;
        paramf.setTitle(2131305038);
        label667: paramf.setContent(paramMallTransactionObject.desc);
        localArrayList.add(paramf);
      }
      if (!bo.isNullOrNil(paramMallTransactionObject.pcL))
      {
        paramf = new f(paramContext);
        paramf.setTitle(2131305086);
        paramf.setContent(paramMallTransactionObject.pcL);
        localArrayList.add(paramf);
      }
      if (!bo.isNullOrNil(paramMallTransactionObject.pcK))
      {
        paramf = new f(paramContext);
        paramf.setTitle(2131305087);
        paramf.setContent(paramMallTransactionObject.pcK);
        localArrayList.add(paramf);
      }
      if (!TextUtils.isEmpty(paramMallTransactionObject.pcC))
      {
        paramf = new f(paramContext);
        paramf.setTitle(2131305036);
        paramf.setContent(paramMallTransactionObject.pcC);
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
        localObject1 = new f(paramContext);
        ((f)localObject1).setTitle(2131305075);
        if ((paramMallTransactionObject.cQO != 31) || (r.Yz().equals(paramMallTransactionObject.pcA)) || (paramMallTransactionObject.pcB <= 0) || (bo.isNullOrNil(paramMallTransactionObject.pcA)) || (bo.isNullOrNil(paramMallTransactionObject.cAa)))
          break label1830;
        localObject2 = paramContext.getString(2131302456);
        paramf = paramMallTransactionObject.pcf + " " + (String)localObject2;
        j = paramMallTransactionObject.pcf.length();
        i = paramMallTransactionObject.pcf.length();
        ((f)localObject1).a(paramf, j + 1, ((String)localObject2).length() + i + 1, new a.3(this, paramContext, paramMallTransactionObject));
        label1019: localArrayList.add(localObject1);
      }
      paramf = new f(paramContext);
      paramf.setTitle(2131305041);
      paramf.setContent(e.kC(paramMallTransactionObject.fDG));
      localArrayList.add(paramf);
      if (!bo.isNullOrNil(paramMallTransactionObject.pcj))
      {
        localObject2 = new f(paramContext);
        ((f)localObject2).setTitle(2131305062);
        localObject1 = paramMallTransactionObject.pcj;
        paramf = (com.tencent.mm.ui.base.preference.f)localObject1;
        if (!bo.isNullOrNil(paramMallTransactionObject.pck))
          paramf = (String)localObject1 + "(" + paramMallTransactionObject.pck + ")";
        ((f)localObject2).setContent(paramf);
        localArrayList.add(localObject2);
      }
      if (!bo.isNullOrNil(paramMallTransactionObject.cAa))
      {
        paramf = new f(paramContext);
        paramf.setTitle(2131305082);
        paramf.setContent(paramMallTransactionObject.cAa);
        localArrayList.add(paramf);
      }
      if (!bo.isNullOrNil(paramMallTransactionObject.pci))
      {
        localObject1 = new f(paramContext);
        ((f)localObject1).setTitle(2131305072);
        if (paramMallTransactionObject.cQO != 8)
          break label1861;
        ((f)localObject1).setContent(paramContext.getString(2131305073));
        localObject2 = new c(paramContext);
        paramf = com.tencent.mm.bw.a.a.b(paramContext, paramMallTransactionObject.pci, 5, 0);
        ((c)localObject2).pey = e.atx(paramMallTransactionObject.pci);
        ((c)localObject2).fru = paramf;
        ((c)localObject2).mOnClickListener = new a.4(this, paramf, paramMallTransactionObject);
        localArrayList.add(localObject1);
        localArrayList.add(localObject2);
      }
      label1329: if (paramMallTransactionObject.pbM.size() != 0)
        break label1883;
      i = 0;
      label1344: if ((i != 0) || ((bo.isNullOrNil(paramMallTransactionObject.pcv)) && (bo.isNullOrNil(paramMallTransactionObject.pcm)) && (bo.isNullOrNil(paramMallTransactionObject.pbP))))
        break label1889;
      paramf = new h(paramContext);
      paramf.peN = true;
      localArrayList.add(paramf);
      localArrayList.add(com.tencent.mm.plugin.order.model.a.a(paramContext, paramMallTransactionObject));
      label1415: if (i != 0)
      {
        paramf = new j(paramContext);
        if (paramMallTransactionObject.pbN != 1)
          break label1934;
        if ((!bo.isNullOrNil(paramMallTransactionObject.pcv)) || (!bo.isNullOrNil(paramMallTransactionObject.pcm)) || (!bo.isNullOrNil(paramMallTransactionObject.pbP)))
        {
          if (bo.isNullOrNil(paramMallTransactionObject.pcw))
            break label1920;
          paramf.peR = paramMallTransactionObject.pcw;
          label1485: paramf.peS = new a.5(this, paramMallTransactionObject, paramContext);
        }
      }
    }
    while (true)
    {
      paramf.pbM = paramMallTransactionObject.pbM;
      paramf.mOnClickListener = new a.7(this, paramContext, paramMallTransactionObject);
      paramContext = new h(paramContext);
      paramContext.peN = true;
      localArrayList.add(paramContext);
      localArrayList.add(paramf);
      AppMethodBeat.o(43893);
      return localArrayList;
      i = 0;
      break;
      label1567: if (paramMallTransactionObject.cQO == 11)
      {
        localObject1 = paramContext.getString(2131305071);
        break label153;
      }
      localObject1 = paramContext.getString(2131305033);
      break label153;
      label1600: ((g)localObject1).peG = paramContext.getString(2131305048, new Object[] { Integer.valueOf(localObject2.length), e.e(paramMallTransactionObject.pcr - paramMallTransactionObject.kCJ, paramMallTransactionObject.pcl) });
      ((g)localObject1).a((String[])localObject2, TextUtils.TruncateAt.MIDDLE);
      break label357;
      label1657: paramf.setTitle(2131305058);
      break label667;
      label1667: localObject1 = new f(paramContext);
      if (paramMallTransactionObject.cQO == 31)
      {
        ((f)localObject1).setTitle(2131305067);
        label1694: if (bo.isNullOrNil(paramMallTransactionObject.pcb))
          break label1818;
        String str = paramContext.getString(2131305037);
        localObject2 = paramMallTransactionObject.desc + " " + str;
        i = paramMallTransactionObject.desc.length();
        j = paramMallTransactionObject.desc.length();
        ((f)localObject1).a((String)localObject2, i + 1, str.length() + (j + 1), new a.2(this, paramMallTransactionObject, (f)localObject1, paramf));
      }
      while (true)
      {
        localArrayList.add(localObject1);
        break;
        ((f)localObject1).setTitle(2131305044);
        break label1694;
        label1818: ((f)localObject1).setContent(paramMallTransactionObject.desc);
      }
      label1830: ((f)localObject1).setContent(paramMallTransactionObject.pcf);
      if (bo.isNullOrNil(paramMallTransactionObject.pcg))
        break label1019;
      ((f)localObject1).Uz(paramMallTransactionObject.pcg);
      break label1019;
      label1861: ((f)localObject1).setContent(paramMallTransactionObject.pci);
      localArrayList.add(localObject1);
      break label1329;
      label1883: i = 1;
      break label1344;
      label1889: paramf = new h(paramContext);
      paramf.peN = true;
      paramf.jlN = false;
      localArrayList.add(paramf);
      break label1415;
      label1920: paramf.peR = paramContext.getString(2131305080);
      break label1485;
      label1934: if (!bo.isNullOrNil(paramMallTransactionObject.pcw))
      {
        paramf.peR = paramMallTransactionObject.pcw;
        paramf.peS = new a.6(this, paramContext, paramMallTransactionObject);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.ui.a.a
 * JD-Core Version:    0.6.2
 */