package com.tencent.mm.plugin.product.ui;

import android.app.Activity;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.g.a.uv;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.product.b.d;
import com.tencent.mm.plugin.product.b.i;
import com.tencent.mm.plugin.product.b.j;
import com.tencent.mm.plugin.product.b.k;
import com.tencent.mm.plugin.product.b.l;
import com.tencent.mm.protocal.protobuf.abe;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abl;
import com.tencent.mm.protocal.protobuf.bpz;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class f
  implements com.tencent.mm.ai.f
{
  static int gOW = 0;
  Activity gNy;
  boolean piI;
  private boolean piJ;
  com.tencent.mm.plugin.product.b.c piK;
  private f.a piL;
  private com.tencent.mm.sdk.b.c piM;

  public f(Activity paramActivity, f.a parama)
  {
    AppMethodBeat.i(44060);
    this.piI = false;
    this.piJ = false;
    this.piM = new f.3(this);
    this.gNy = paramActivity;
    com.tencent.mm.plugin.product.a.a.bZC();
    this.piK = com.tencent.mm.plugin.product.a.a.bZD();
    this.piL = parama;
    AppMethodBeat.o(44060);
  }

  private void cae()
  {
    AppMethodBeat.i(44064);
    Object localObject = com.tencent.mm.plugin.product.a.a.bZC().bZE();
    bpz localbpz = this.piK.bZK();
    if ((localbpz != null) && (!bo.isNullOrNil(localbpz.naq)) && (!localbpz.naq.contains(";")))
    {
      ((d)localObject).phg.remove(localbpz.naq);
      ((d)localObject).phg.add(localbpz.naq);
      ((d)localObject).bZX();
    }
    localObject = new Intent(this.gNy, MallProductUI.class);
    ((Intent)localObject).putExtra("key_go_finish", true);
    ((Intent)localObject).addFlags(67108864);
    this.gNy.startActivity((Intent)localObject);
    AppMethodBeat.o(44064);
  }

  public final void cad()
  {
    AppMethodBeat.i(44063);
    com.tencent.mm.plugin.product.b.m localm = this.piK.pgO;
    cl localcl = new cl();
    abf localabf = new abf();
    abl localabl = new abl();
    abe localabe = new abe();
    localabl.alD(r.Yz());
    localabl.alE(r.Yz());
    localabl.LN(11);
    localabl.ml(bo.anU());
    localabe.alw(localm.phs.name);
    localabe.alx(this.piK.bZW());
    localabe.LK(localm.php);
    localabe.alz(this.piK.a(localm));
    localabe.aly(localm.bZY());
    localcl.cvA.title = localm.phs.name;
    localcl.cvA.desc = this.piK.bZW();
    localcl.cvA.cvC = localabf;
    localcl.cvA.type = 11;
    localabf.a(localabl);
    localabf.b(localabe);
    localcl.cvA.activity = this.gNy;
    localcl.cvA.cvH = 5;
    com.tencent.mm.sdk.b.a.xxA.m(localcl);
    AppMethodBeat.o(44063);
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(44066);
    switch (paramInt1)
    {
    default:
    case 1:
    case 3:
    case 4:
    case 10000:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(44066);
      while (true)
      {
        return;
        if ((paramInt2 != -1) || (paramIntent == null))
          break;
        this.piK.al(paramIntent);
        if (this.piL != null)
          this.piL.t(0, 0, "");
        com.tencent.mm.kernel.g.RQ();
        Object localObject = com.tencent.mm.kernel.g.RO().eJo;
        paramIntent = this.piK;
        if (paramIntent.pgO != null);
        for (paramIntent = paramIntent.pgO.pho; ; paramIntent = "")
        {
          ((p)localObject).a(new com.tencent.mm.plugin.product.b.g(paramIntent, this.piK.pgQ, this.piK.pgU), 0);
          AppMethodBeat.o(44066);
          break;
        }
        localObject = new uv();
        ((uv)localObject).cRF.result = paramInt1;
        ((uv)localObject).cRF.intent = paramIntent;
        this.piM.a((com.tencent.mm.sdk.b.b)localObject);
        AppMethodBeat.o(44066);
        continue;
        if (this.piL == null)
          break;
        this.piL.t(0, 0, "");
        AppMethodBeat.o(44066);
        continue;
        this.gNy.showDialog(-10002);
        com.tencent.mm.kernel.g.RQ();
        com.tencent.mm.kernel.g.RO().eJo.a(new i(this.piK.pgQ, this.piK.pgX), 0);
        AppMethodBeat.o(44066);
      }
      if ((paramInt2 == -1) && (paramIntent != null))
      {
        this.piK.al(paramIntent);
        com.tencent.mm.kernel.g.RQ();
        com.tencent.mm.kernel.g.RO().eJo.a(new j(this.piK.bZS(), gOW), 0);
      }
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(44065);
    ab.d("MicroMsg.MallProductUI", "errCode: " + paramInt2 + ", errMsg: " + paramString);
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if ((paramm instanceof com.tencent.mm.plugin.product.b.h))
      {
        paramm = (com.tencent.mm.plugin.product.b.h)paramm;
        this.piK.a(paramm.phk, paramm.phl);
        if (this.piL != null)
          this.piL.t(paramInt1, paramInt2, paramString);
        if (!bo.isNullOrNil(paramm.phk.pho))
        {
          com.tencent.mm.plugin.report.service.h.pYm.e(11007, new Object[] { this.piK.bZL(), paramm.phk.pho, Integer.valueOf(gOW), Integer.valueOf(1) });
          AppMethodBeat.o(44065);
        }
      }
    while (true)
    {
      return;
      com.tencent.mm.plugin.report.service.h.pYm.e(11007, new Object[] { this.piK.bZL(), paramm.phj, Integer.valueOf(gOW), Integer.valueOf(1) });
      AppMethodBeat.o(44065);
      continue;
      Object localObject1;
      Object localObject2;
      if ((paramm instanceof j))
      {
        localObject1 = (j)paramm;
        paramString = this.piK;
        localObject2 = ((j)localObject1).pgQ;
        paramm = ((j)localObject1).phb;
        localObject1 = ((j)localObject1).phc;
        paramString.pgQ = ((String)localObject2);
        paramString.phc = ((LinkedList)localObject1);
        paramString.phb = paramm;
        paramString.AL(0);
        this.gNy.startActivity(new Intent(this.gNy, MallProductSubmitUI.class));
        com.tencent.mm.plugin.report.service.h.pYm.e(11009, new Object[] { this.piK.bZL(), this.piK.pgO.pho, Integer.valueOf(gOW), Integer.valueOf(1) });
        AppMethodBeat.o(44065);
      }
      else if (!(paramm instanceof com.tencent.mm.plugin.product.b.f))
      {
        if ((paramm instanceof l))
        {
          paramString = ((l)paramm).phn;
          paramInt1 = 6;
          if (gOW == 7)
            paramInt1 = 1001;
          ab.d("MicroMsg.MallProductUI", "payScene:".concat(String.valueOf(paramInt1)));
          com.tencent.mm.pluginsdk.wallet.h.a(this.gNy, paramString, this.piK.getAppId(), paramInt1, 3);
          com.tencent.mm.sdk.b.a.xxA.c(this.piM);
          AppMethodBeat.o(44065);
        }
        else if ((paramm instanceof k))
        {
          com.tencent.mm.ui.base.h.bQ(this.gNy, this.gNy.getString(2131301367));
          cae();
          AppMethodBeat.o(44065);
        }
        else if ((paramm instanceof com.tencent.mm.plugin.product.b.g))
        {
          try
          {
            this.gNy.dismissDialog(-10002);
            paramString = this.piK;
            paramString.phb = ((com.tencent.mm.plugin.product.b.g)paramm).phb;
            paramString.AL(0);
            AppMethodBeat.o(44065);
          }
          catch (Exception paramString)
          {
            while (true)
              ab.e("MicroMsg.MallProductUI", paramString.toString());
          }
        }
        else if ((paramm instanceof i))
        {
          try
          {
            this.gNy.dismissDialog(-10002);
            localObject1 = (i)paramm;
            localObject2 = this.piK;
            paramm = ((i)localObject1).mUrl;
            localObject1 = ((i)localObject1).phm;
            if ((!bo.isNullOrNil(paramm)) && (localObject1 != null) && (((LinkedList)localObject1).size() > 0))
            {
              if (((com.tencent.mm.plugin.product.b.c)localObject2).phf == null)
                ((com.tencent.mm.plugin.product.b.c)localObject2).phf = new HashMap();
              ((com.tencent.mm.plugin.product.b.c)localObject2).phf.put(paramm, localObject1);
            }
            if (this.piL != null)
              this.piL.t(paramInt1, paramInt2, paramString);
            AppMethodBeat.o(44065);
          }
          catch (Exception localException)
          {
            while (true)
              ab.e("MicroMsg.MallProductUI", localException.toString());
          }
          switch (paramInt2)
          {
          default:
            ab.i("MicroMsg.MallProductUI", "unkown errCode ".concat(String.valueOf(paramInt2)));
            paramm = paramString;
            if (bo.isNullOrNil(paramString))
              paramm = paramInt2 + " : " + this.gNy.getString(2131301348);
            if (this.piL != null)
              this.piL.t(paramInt1, paramInt2, paramm);
            break;
          case -10010003:
          }
        }
      }
      else
      {
        do
        {
          AppMethodBeat.o(44065);
          break;
          ab.i("MicroMsg.MallProductUI", "deal with MMBIZPAY_FUNC_ERR_NO_EXISTED_PRODUCT");
        }
        while (!(paramm instanceof com.tencent.mm.plugin.product.b.h));
        paramm = (com.tencent.mm.plugin.product.b.h)paramm;
        this.piK.a(paramm.phk, paramm.phl);
        if (this.piL != null)
          this.piL.t(paramInt1, paramInt2, paramString);
        AppMethodBeat.o(44065);
      }
    }
  }

  public final void onStart()
  {
    AppMethodBeat.i(44061);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(553, this);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(554, this);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(555, this);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(556, this);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(557, this);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(578, this);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(579, this);
    AppMethodBeat.o(44061);
  }

  public final void onStop()
  {
    AppMethodBeat.i(44062);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.b(553, this);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.b(554, this);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.b(555, this);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.b(556, this);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.b(557, this);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.b(578, this);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.b(579, this);
    AppMethodBeat.o(44062);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.f
 * JD-Core Version:    0.6.2
 */