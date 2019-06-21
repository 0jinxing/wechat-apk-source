package com.tencent.mm.plugin.account.friend.ui;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bx;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.account.friend.a.x;
import com.tencent.mm.protocal.protobuf.jp;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.h;
import java.util.Iterator;
import java.util.Set;
import junit.framework.Assert;

public final class i
  implements f
{
  public String cFl;
  public boolean eVT = false;
  private final i.a gyp;
  public x gyq;
  private x gyr;
  public boolean gys = true;
  public i.b gyt;
  public Context mContext;
  public com.tencent.mm.ui.base.p tipDialog = null;

  public i(i.b paramb, Context paramContext, i.a parama)
  {
    this.gyt = paramb;
    this.mContext = paramContext;
    this.gyp = parama;
  }

  private boolean C(int paramInt, String paramString)
  {
    AppMethodBeat.i(108663);
    boolean bool;
    switch (paramInt)
    {
    default:
      bool = false;
    case -57:
    case -1:
    case -34:
    case -43:
    case -214:
    case -41:
    case -35:
    case -36:
    case -59:
    case -4:
    case -74:
    }
    while (true)
    {
      AppMethodBeat.o(108663);
      return bool;
      Toast.makeText(this.mContext, 2131296906, 0).show();
      bool = true;
      continue;
      Toast.makeText(this.mContext, 2131297538, 0).show();
      bool = true;
      continue;
      ab.e("MicroMsg.SmsBindMobileObserver", "dealErrCodeBindMobile");
      if ((i.b.gyv == this.gyt) || (this.gyt == i.b.gyw))
      {
        g.RP().Ry().set(4097, "");
        paramString = (String)g.RP().Ry().get(6, "");
        g.RP().Ry().set(6, this.cFl);
        if (!bo.isNullOrNil(paramString))
        {
          if (g.RP().Ry().get(ac.a.xVa, "").equals(paramString))
            g.RP().Ry().set(ac.a.xVa, r.Yz());
          Iterator localIterator = bx.fnB.aat().iterator();
          while (localIterator.hasNext())
          {
            String str = (String)localIterator.next();
            if (paramString.equals(bx.fnB.getString(str, "login_user_name")))
              bx.fnB.n(str, "login_user_name", str);
          }
        }
        ((com.tencent.mm.plugin.account.a.a.a)g.M(com.tencent.mm.plugin.account.a.a.a.class)).syncAddrBookAndUpload();
      }
      e(2, new Bundle());
      Toast.makeText(this.mContext, 2131297535, 0).show();
      bool = true;
      continue;
      paramString = com.tencent.mm.h.a.jY(paramString);
      if (paramString != null)
        paramString.a(this.mContext, null, null);
      bool = true;
      continue;
      Toast.makeText(this.mContext, 2131297537, 0).show();
      bool = true;
      continue;
      h.a(this.mContext, 2131297536, 2131297589, new i.3(this));
      bool = true;
      continue;
      Toast.makeText(this.mContext, 2131297540, 0).show();
      bool = true;
      continue;
      h.a(this.mContext, 2131297539, 2131297061, null);
      bool = true;
      continue;
      bool = false;
      continue;
      h.a(this.mContext, 2131297534, 2131297061, null);
      bool = true;
    }
  }

  private void aqA()
  {
    AppMethodBeat.i(108666);
    if ((this.gyt == i.b.gyv) || (this.gyt == i.b.gyw))
    {
      int i = 1;
      if (this.gyt == i.b.gyw)
        i = 18;
      this.gyr = new x(this.cFl, i, "", 0, "");
      g.Rg().a(this.gyr, 0);
    }
    AppMethodBeat.o(108666);
  }

  private void e(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(108664);
    if ((this.gyt == i.b.gyv) || (this.gyt == i.b.gyw))
      g.Rg().b(132, this);
    if (this.gyp != null)
      this.gyp.e(paramInt, paramBundle);
    AppMethodBeat.o(108664);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(108665);
    ab.i("MicroMsg.SmsBindMobileObserver", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.tipDialog != null)
      this.tipDialog.dismiss();
    if ((paramm != this.gyq) && (paramm != this.gyr))
    {
      ab.i("MicroMsg.SmsBindMobileObserver", "onSceneEnd, doScene is not called by this class");
      AppMethodBeat.o(108665);
    }
    while (true)
    {
      return;
      if (this.eVT)
      {
        AppMethodBeat.o(108665);
      }
      else
      {
        if (((i.b.gyv == this.gyt) || (i.b.gyw == this.gyt)) && (paramm.getType() == 132));
        switch (((x)paramm).Ah())
        {
        default:
          AppMethodBeat.o(108665);
          break;
        case 1:
        case 2:
        case 18:
        case 19:
          if ((paramInt1 == 0) && (paramInt2 == 0))
          {
            if ((((x)paramm).Ah() == 2) || (((x)paramm).Ah() == 19))
            {
              if (this.gys)
                ((com.tencent.mm.plugin.account.a.a.a)g.M(com.tencent.mm.plugin.account.a.a.a.class)).syncAddrBookAndUpload();
              paramString = new Bundle();
              if (((x)paramm).Ah() == 2)
              {
                ab.i("MicroMsg.SmsBindMobileObserver", "bind mobile check, ticket %s", new Object[] { ((x)paramm).agg() });
                paramString.putString("setpwd_ticket", ((x)paramm).agg());
              }
              if (((jp)((x)paramm).ehh.fsH.fsP).vLU != 0);
              for (paramInt1 = 1; ; paramInt1 = 0)
              {
                if (paramInt1 != 0)
                  paramString.putBoolean("restart_wechat", true);
                e(2, paramString);
                AppMethodBeat.o(108665);
                break;
              }
            }
            e(1, new Bundle());
            AppMethodBeat.o(108665);
          }
          else if (!C(paramInt2, paramString))
          {
            paramString = com.tencent.mm.h.a.jY(paramString);
            if (paramString != null)
            {
              paramString.a(this.mContext, null, null);
              AppMethodBeat.o(108665);
            }
            else
            {
              Toast.makeText(this.mContext, this.mContext.getString(2131297582, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
            }
          }
          else
          {
            AppMethodBeat.o(108665);
            continue;
            Assert.assertTrue("code path should not be here!", false);
            AppMethodBeat.o(108665);
          }
          break;
        }
      }
    }
  }

  public final void recycle()
  {
    AppMethodBeat.i(108662);
    g.Rg().b(132, this);
    this.mContext = null;
    this.eVT = true;
    if (this.tipDialog != null)
      this.tipDialog.dismiss();
    AppMethodBeat.o(108662);
  }

  public final void wn(String paramString)
  {
    AppMethodBeat.i(108661);
    if ((this.gyt == i.b.gyv) || (this.gyt == i.b.gyw))
      g.Rg().a(132, this);
    this.cFl = paramString;
    this.eVT = false;
    aqA();
    if (this.tipDialog != null)
      this.tipDialog.dismiss();
    this.tipDialog = h.b(this.mContext, this.mContext.getString(2131297043), true, new i.1(this));
    AppMethodBeat.o(108661);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.ui.i
 * JD-Core Version:    0.6.2
 */