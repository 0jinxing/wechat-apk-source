package com.tencent.mm.plugin.scanner.util;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.o;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.aj.d.b;
import com.tencent.mm.aj.z;
import com.tencent.mm.g.a.mf;
import com.tencent.mm.g.a.pr;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.u;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.u.a.c.a;
import com.tencent.mm.protocal.protobuf.awq;
import com.tencent.mm.protocal.protobuf.buv;
import com.tencent.mm.protocal.protobuf.bvk;
import com.tencent.mm.protocal.protobuf.uy;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class e
  implements com.tencent.mm.ai.f, c.a
{
  public String appId;
  public int cvp;
  public String cvr;
  public String imagePath;
  private ProgressDialog jMB;
  public int jSW;
  private Activity mActivity;
  e.a qhA;
  private Map<m, Integer> qhB;
  private int qhx;
  private String qhy;
  private Bundle qhz;
  public String source;

  public e()
  {
    AppMethodBeat.i(81404);
    this.jMB = null;
    this.qhA = null;
    this.qhB = new HashMap();
    onResume();
    AppMethodBeat.o(81404);
  }

  private static int Bx(int paramInt)
  {
    if ((paramInt == 30) || (paramInt == 37) || (paramInt == 38) || (paramInt == 40))
      paramInt = 13;
    while (true)
    {
      return paramInt;
      if ((paramInt == 4) || (paramInt == 47))
        paramInt = 12;
      else if (paramInt == 34)
        paramInt = 24;
      else
        paramInt = 0;
    }
  }

  private static int Cb(int paramInt)
  {
    if (paramInt == 1)
      paramInt = 34;
    while (true)
    {
      return paramInt;
      if (paramInt == 0)
        paramInt = 4;
      else if (paramInt == 3)
        paramInt = 42;
      else
        paramInt = 30;
    }
  }

  private void Cc(int paramInt)
  {
    AppMethodBeat.i(81412);
    Object localObject1;
    Object localObject3;
    Object localObject4;
    if (this.qhz != null)
    {
      localObject1 = this.qhz.getString("stat_url");
      if (((this.cvp == 6) || (this.cvp == 0)) && (!bo.isNullOrNil((String)localObject1)))
      {
        localObject3 = "";
        localObject4 = "";
      }
    }
    try
    {
      localObject1 = URLEncoder.encode(bo.nullAsNil((String)localObject1), "UTF-8");
      localObject3 = localObject1;
      String str = URLEncoder.encode(bo.nullAsNil(this.qhy), "UTF-8");
      localObject3 = str;
      localObject4 = localObject1;
      localObject1 = localObject3;
      com.tencent.mm.plugin.report.service.h.pYm.e(13329, new Object[] { localObject4, localObject1, Integer.valueOf(paramInt) });
      AppMethodBeat.o(81412);
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.QBarStringHandler", localUnsupportedEncodingException, "", new Object[0]);
        Object localObject2 = localObject4;
        localObject4 = localObject3;
      }
    }
  }

  private void a(Activity paramActivity, int paramInt, String paramString, boolean paramBoolean)
  {
    int i = 2;
    AppMethodBeat.i(81409);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.QBarStringHandler", "start search contact %s", new Object[] { paramString });
    if (paramInt == 2);
    for (paramInt = i; ; paramInt = 1)
    {
      paramString = new com.tencent.mm.plugin.messenger.a.f(paramString, paramInt, 5, paramBoolean);
      this.qhB.put(paramString, Integer.valueOf(1));
      g.Rg().a(paramString, 0);
      paramActivity.getString(2131297061);
      this.jMB = com.tencent.mm.ui.base.h.b(paramActivity, paramActivity.getString(2131302753), new e.7(this, paramString));
      AppMethodBeat.o(81409);
      return;
    }
  }

  private void a(Activity paramActivity, String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    AppMethodBeat.i(81410);
    if (this.jSW > 0);
    for (int i = this.jSW; ; i = Cb(this.qhx))
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.QBarStringHandler", "getA8Key text:%s, mQBarStringSource: %s, sceneValue: %s", new Object[] { paramString1, Integer.valueOf(this.qhx), Integer.valueOf(i) });
      final com.tencent.mm.modelsimple.h localh = new com.tencent.mm.modelsimple.h(paramString1, i, paramInt1, paramInt2, paramString2, (int)System.currentTimeMillis(), new byte[0]);
      if (paramString1.startsWith("http://weixin.qq.com/r/"))
      {
        String str = paramActivity.getIntent().getStringExtra("img_gallery_session_id");
        paramInt1 = com.tencent.mm.ui.e.a.MQ(this.qhx);
        localh.lV(paramInt1);
        paramString1 = "";
        paramString2 = paramString1;
        if (!bo.isNullOrNil(str))
        {
          paramString2 = v.Zp().nV(str);
          if (paramString2 != null)
            paramString1 = paramString2.getString("url", null);
          localh.tq(paramString1);
          paramString2 = paramString1;
        }
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.QBarStringHandler", "getA8Key currentUrl:%s, qBarScene: %d", new Object[] { paramString2, Integer.valueOf(paramInt1) });
      }
      this.qhB.put(localh, Integer.valueOf(1));
      g.Rg().a(localh, 0);
      if (this.jMB != null)
        this.jMB.dismiss();
      paramActivity.getString(2131297061);
      this.jMB = com.tencent.mm.ui.base.h.b(paramActivity, paramActivity.getString(2131302102), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          AppMethodBeat.i(81401);
          g.Rg().c(localh);
          if (e.this.qhA != null)
            e.this.qhA.o(1, null);
          AppMethodBeat.o(81401);
        }
      });
      AppMethodBeat.o(81410);
      return;
    }
  }

  private int chV()
  {
    int i = 30;
    int j = i;
    switch (this.qhx)
    {
    default:
    case 0:
    case 2:
    case 1:
    }
    for (j = i; ; j = 45)
      return j;
  }

  public final void a(Activity paramActivity, String paramString, int paramInt1, int paramInt2, int paramInt3, e.a parama, Bundle paramBundle)
  {
    AppMethodBeat.i(81405);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.QBarStringHandler", "deal QBarString %s, source:%d, codeType: %s, codeVersion: %s", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.mActivity = paramActivity;
    this.qhx = paramInt1;
    this.qhy = paramString;
    this.qhA = parama;
    this.qhz = paramBundle;
    parama = "";
    if (paramBundle != null)
      parama = paramBundle.getString("stat_url", "");
    if (bo.isNullOrNil(paramString))
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.QBarStringHandler", "qbarstring is null or nil");
      AppMethodBeat.o(81405);
    }
    while (true)
    {
      return;
      if (g.Rg().acS() == 0)
      {
        Toast.makeText(paramActivity, paramActivity.getString(2131299946), 0).show();
        if (this.qhA != null)
          this.qhA.o(0, null);
        AppMethodBeat.o(81405);
      }
      else
      {
        paramBundle = "";
        if (paramString.startsWith("weixin://qr/"))
          paramBundle = paramString.substring(12) + "@qr";
        if (!bo.isNullOrNil(paramBundle))
        {
          a(paramActivity, paramInt1, paramBundle, false);
          AppMethodBeat.o(81405);
        }
        else
        {
          com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.QBarStringHandler", "qbarString: %s, auth native: %s, remittance: %s", new Object[] { paramString, Boolean.TRUE, Boolean.TRUE });
          if (paramString.startsWith("weixin://wxpay/bizpayurl"))
          {
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.QBarStringHandler", "do native pay");
            this.qhA.o(5, null);
            paramInt1 = Cb(this.qhx);
            paramInt2 = Bx(paramInt1);
            paramActivity = new mf();
            paramActivity.cHZ.url = paramString;
            paramActivity.cHZ.cIb = paramInt2;
            paramActivity.cHZ.scene = paramInt1;
            paramActivity.cHZ.context = this.mActivity;
            if (paramInt2 == 13)
            {
              com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.QBarStringHandler", "add source and sourceType");
              paramActivity.cHZ.source = this.source;
              paramActivity.cHZ.cvp = this.cvp;
            }
            paramActivity.callback = new e.1(this, paramActivity);
            com.tencent.mm.sdk.b.a.xxA.a(paramActivity, Looper.myLooper());
            new ak(Looper.getMainLooper()).postDelayed(new e.4(this, paramActivity), 10000L);
            Cc(11);
            com.tencent.mm.plugin.report.service.h.pYm.e(16472, new Object[] { Integer.valueOf(2), paramString, parama });
            AppMethodBeat.o(81405);
          }
          else if ((paramString.startsWith("https://wx.tenpay.com/f2f")) || (paramString.startsWith("wxp://f2f")))
          {
            if (this.qhA != null)
              this.qhA.o(5, null);
            paramInt1 = Bx(Cb(this.qhx));
            com.tencent.mm.pluginsdk.wallet.h.a(this.mActivity, 1, paramString, paramInt1, null);
            if (this.qhA != null)
              this.qhA.o(3, null);
            Cc(11);
            com.tencent.mm.plugin.report.service.h.pYm.e(16472, new Object[] { Integer.valueOf(1), paramString, parama });
            AppMethodBeat.o(81405);
          }
          else if (paramString.startsWith("wxp://wbf2f"))
          {
            if (this.qhA != null)
              this.qhA.o(5, null);
            paramInt1 = Bx(Cb(this.qhx));
            com.tencent.mm.pluginsdk.wallet.h.a(this.mActivity, 6, paramString, paramInt1, null);
            if (this.qhA != null)
              this.qhA.o(3, null);
            Cc(11);
            com.tencent.mm.plugin.report.service.h.pYm.e(16472, new Object[] { Integer.valueOf(3), paramString, parama });
            AppMethodBeat.o(81405);
          }
          else
          {
            if ((paramInt2 == 22) && (paramString.startsWith("m")))
            {
              com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.QBarStringHandler", "go to reward");
              if (this.qhA != null)
                this.qhA.o(5, null);
              paramInt2 = Bx(Cb(this.qhx));
              paramInt1 = 1;
              if (this.jSW == 37)
                paramInt1 = 2;
              while (true)
              {
                com.tencent.mm.pluginsdk.wallet.h.a(this.mActivity, paramString, paramInt2, parama, paramInt1);
                if (this.qhA != null)
                  this.qhA.o(3, null);
                Cc(11);
                com.tencent.mm.plugin.report.service.h.pYm.e(16472, new Object[] { Integer.valueOf(6), paramString, parama });
                AppMethodBeat.o(81405);
                break;
                if (this.jSW == 38)
                  paramInt1 = 3;
                else if (this.jSW == 40)
                  paramInt1 = 4;
              }
            }
            if (paramString.startsWith("https://payapp.weixin.qq.com/qr/"))
            {
              com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.QBarStringHandler", "f2f pay material");
              if (this.qhA != null)
                this.qhA.o(5, null);
              paramInt2 = Cb(this.qhx);
              paramInt1 = Bx(paramInt2);
              paramActivity = new pr();
              paramActivity.cLS.cLU = paramString;
              paramActivity.cLS.scene = paramInt2;
              paramActivity.cLS.type = 0;
              paramActivity.cLS.aIq = new WeakReference(this.mActivity);
              paramActivity.cLS.callback = new e.5(this, paramActivity, paramInt1);
              com.tencent.mm.sdk.b.a.xxA.m(paramActivity);
              Cc(11);
              com.tencent.mm.plugin.report.service.h.pYm.e(16472, new Object[] { Integer.valueOf(5), paramString, parama });
              AppMethodBeat.o(81405);
            }
            else if ((paramInt2 == 22) && (paramString.startsWith("n")))
            {
              com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.QBarStringHandler", "qr reward pay material");
              if (this.qhA != null)
                this.qhA.o(5, null);
              paramInt2 = Cb(this.qhx);
              paramInt1 = Bx(paramInt2);
              paramActivity = new pr();
              paramActivity.cLS.cLU = paramString;
              paramActivity.cLS.scene = paramInt2;
              paramActivity.cLS.type = 1;
              paramActivity.cLS.aIq = new WeakReference(this.mActivity);
              paramActivity.cLS.callback = new e.6(this, paramActivity, paramInt1, parama, paramInt2);
              com.tencent.mm.sdk.b.a.xxA.m(paramActivity);
              Cc(11);
              com.tencent.mm.plugin.report.service.h.pYm.e(16472, new Object[] { Integer.valueOf(7), paramString, parama });
              AppMethodBeat.o(81405);
            }
            else if (paramString.startsWith("wxhb://f2f"))
            {
              com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.QBarStringHandler", "scan f2f hb url");
              if (paramInt2 != 19)
              {
                AppMethodBeat.o(81405);
              }
              else
              {
                if (this.qhA != null)
                  this.qhA.o(5, null);
                paramActivity = new Intent();
                paramActivity.putExtra("key_share_url", paramString);
                com.tencent.mm.bp.d.b(this.mActivity, "luckymoney", ".f2f.ui.LuckyMoneyF2FReceiveUI", paramActivity, 1);
                com.tencent.mm.plugin.report.service.h.pYm.e(16472, new Object[] { Integer.valueOf(4), paramString, parama });
                Cc(11);
                AppMethodBeat.o(81405);
              }
            }
            else
            {
              a(paramActivity, paramString, paramInt2, paramInt3, this.appId);
              if (this.qhA != null)
                this.qhA.o(5, null);
              AppMethodBeat.o(81405);
            }
          }
        }
      }
    }
  }

  public final void chU()
  {
    AppMethodBeat.i(81406);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.QBarStringHandler", "cancel Deal");
    this.qhy = null;
    this.mActivity = null;
    onPause();
    AppMethodBeat.o(81406);
  }

  public final Context getContext()
  {
    return this.mActivity;
  }

  public final void jZ(boolean paramBoolean)
  {
    AppMethodBeat.i(81413);
    if (paramBoolean)
    {
      if (this.qhA == null)
        break label53;
      this.qhA.o(1, null);
      AppMethodBeat.o(81413);
    }
    while (true)
    {
      return;
      if (this.qhA != null)
        this.qhA.o(3, null);
      label53: AppMethodBeat.o(81413);
    }
  }

  public final void onPause()
  {
    AppMethodBeat.i(81408);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.QBarStringHandler", "onPause");
    g.Rg().b(106, this);
    g.Rg().b(233, this);
    g.Rg().b(666, this);
    g.Rg().b(372, this);
    AppMethodBeat.o(81408);
  }

  public final void onResume()
  {
    AppMethodBeat.i(81407);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.QBarStringHandler", "onResume");
    g.Rg().a(106, this);
    g.Rg().a(233, this);
    g.Rg().a(666, this);
    g.Rg().a(372, this);
    AppMethodBeat.o(81407);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(81411);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.QBarStringHandler", "onSceneEnd: errType = [%s] errCode = [%s] errMsg = [%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    boolean bool;
    if (paramm == null)
      if (paramm == null)
      {
        bool = true;
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.QBarStringHandler", "onSceneEnd() scene is null [%s]", new Object[] { Boolean.valueOf(bool) });
        if (this.qhA != null)
          this.qhA.o(2, null);
        AppMethodBeat.o(81411);
      }
    label265: label714: label1625: 
    while (true)
    {
      return;
      bool = false;
      break;
      if (!this.qhB.containsKey(paramm))
      {
        if ((paramm instanceof com.tencent.mm.ao.c))
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.QBarStringHandler", "emotion scan scene");
      }
      else
      {
        this.qhB.remove(paramm);
        if (this.jMB != null)
        {
          this.jMB.dismiss();
          this.jMB = null;
        }
        if ((paramm.getType() != 372) || (paramInt1 != 4) || (paramInt2 != -2034))
          break label265;
        paramString = new com.tencent.mm.modelsimple.h(((com.tencent.mm.openim.b.n)paramm).gfh, null, 50, 0, 0, new byte[0]);
        g.RQ();
        g.RO().eJo.a(paramString, 0);
        this.qhB.put(paramString, Integer.valueOf(1));
        AppMethodBeat.o(81411);
        continue;
      }
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.QBarStringHandler", "not my scene, don't care it");
      AppMethodBeat.o(81411);
      continue;
      label882: if ((paramInt1 == 4) && (paramInt2 == -4))
      {
        com.tencent.mm.ui.base.h.a(this.mActivity, 2131302097, 2131297061, new e.10(this));
        AppMethodBeat.o(81411);
      }
      else
      {
        int i;
        switch (paramInt1)
        {
        default:
          i = 0;
        case 1:
        case 2:
        }
        while (true)
        {
          if (i == 0)
            break label505;
          if (this.qhA != null)
            this.qhA.o(1, null);
          AppMethodBeat.o(81411);
          break;
          if (g.Rg().acT())
          {
            g.Rg().getNetworkServerIp();
            new StringBuilder().append(paramInt2);
          }
          while (true)
          {
            i = 1;
            break;
            if (com.tencent.mm.network.ab.ch(this.mActivity))
              com.tencent.mm.pluginsdk.ui.tools.h.fR(this.mActivity);
            else
              Toast.makeText(this.mActivity, this.mActivity.getString(2131299945, new Object[] { Integer.valueOf(1), Integer.valueOf(paramInt2) }), 1).show();
          }
          Toast.makeText(this.mActivity, this.mActivity.getString(2131299946, new Object[] { Integer.valueOf(2), Integer.valueOf(paramInt2) }), 1).show();
          i = 1;
        }
        label505: if ((paramInt1 == 4) && (paramInt2 == -2004))
        {
          com.tencent.mm.ui.base.h.g(this.mActivity, 2131302090, 2131297061);
          if (this.qhA != null)
            this.qhA.o(1, null);
          AppMethodBeat.o(81411);
        }
        else if ((paramInt1 != 0) || (paramInt2 != 0))
        {
          Toast.makeText(this.mActivity, this.mActivity.getString(2131299995, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
          if (this.qhA != null)
            this.qhA.o(1, null);
          AppMethodBeat.o(81411);
        }
        else
        {
          Object localObject1;
          if (paramm.getType() == 106)
          {
            paramString = (com.tencent.mm.plugin.messenger.a.f)paramm;
            if (!paramString.opS)
            {
              paramString = paramString.bOj();
              if ((ad.Mn(paramString.wBT)) && (paramString.wCa != null) && (!bo.isNullOrNil(paramString.wCa.gvc)) && (com.tencent.mm.modelappbrand.a.pi(paramString.wCa.gvc)))
                if (this.jSW > 0)
                {
                  paramInt1 = this.jSW;
                  com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.QBarStringHandler", "getA8Key text:%s, mQBarStringSource: %s, sceneValue: %s", new Object[] { this.qhy, Integer.valueOf(this.qhx), Integer.valueOf(paramInt1) });
                  paramString = new com.tencent.mm.modelsimple.h(this.qhy, null, 43, 0, 0, new byte[0]);
                  this.qhB.put(paramString, Integer.valueOf(1));
                  g.Rg().a(paramString, 0);
                  if (this.jMB != null)
                    this.jMB.dismiss();
                  localObject1 = this.mActivity;
                  this.mActivity.getString(2131297061);
                  this.jMB = com.tencent.mm.ui.base.h.b((Context)localObject1, this.mActivity.getString(2131302102), true, new e.3(this, paramString));
                }
            }
            for (paramInt1 = 1; ; paramInt1 = 0)
            {
              if (paramInt1 == 0)
                break label882;
              AppMethodBeat.o(81411);
              break;
              paramInt1 = Cb(this.qhx);
              break label714;
            }
            paramString = ((com.tencent.mm.plugin.messenger.a.f)paramm).bOj();
            Object localObject2 = aa.a(paramString.wcB);
            com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.QBarStringHandler", "handle search contact result, username:" + paramString.wcB);
            o.acd().n((String)localObject2, aa.a(paramString.vEF));
            if ((this.jMB != null) && (this.jMB.isShowing()))
            {
              com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.QBarStringHandler", "tip dialog dismiss");
              this.jMB.dismiss();
            }
            Object localObject3;
            Object localObject4;
            if (bo.nullAsNil((String)localObject2).length() > 0)
            {
              localObject3 = ((j)g.K(j.class)).XM().aoO((String)localObject2);
              if ((localObject3 != null) && (com.tencent.mm.n.a.jh(((ap)localObject3).field_type)) && (((ad)localObject3).dsf()))
              {
                localObject4 = z.aeR().qP((String)localObject2);
                ((com.tencent.mm.aj.d)localObject4).cJ(false);
                localObject1 = ((com.tencent.mm.aj.d)localObject4).fuY;
                if (((d.b)localObject1).fvc != null)
                  ((d.b)localObject1).fvs = ((d.b)localObject1).fvc.optInt("ScanQRCodeType", 0);
                if (((d.b)localObject1).fvs == 1)
                {
                  paramInt1 = 1;
                  if ((paramInt1 == 0) || (((com.tencent.mm.aj.d)localObject4).adP()))
                    break label1223;
                  paramString = new Intent();
                  paramString.putExtra("Chat_User", (String)localObject2);
                  paramString.putExtra("finish_direct", true);
                  com.tencent.mm.plugin.scanner.c.gkE.d(paramString, this.mActivity);
                  paramInt1 = 1;
                }
              }
            }
            while (true)
            {
              if (paramInt1 == 0)
                break label1625;
              if (this.qhA != null)
              {
                paramString = new Bundle();
                paramString.putString("geta8key_fullurl", aa.a(((com.tencent.mm.plugin.messenger.a.f)paramm).bOj().wcB));
                paramString.putInt("geta8key_action_code", 4);
                this.qhA.o(3, paramString);
              }
              Cc(4);
              AppMethodBeat.o(81411);
              break;
              paramInt1 = 0;
              break label1091;
              paramInt1 = chV();
              localObject1 = new Intent();
              com.tencent.mm.api.b.a((Intent)localObject1, paramString, paramInt1);
              if ((localObject3 != null) && (!com.tencent.mm.n.a.jh(((ap)localObject3).field_type)))
                ((Intent)localObject1).putExtra("Contact_IsLBSFriend", true);
              if ((paramString.wBT & 0x8) > 0)
                com.tencent.mm.plugin.report.service.h.pYm.X(10298, (String)localObject2 + "," + paramInt1);
              if (this.mActivity != null)
              {
                if (ad.Mn(paramString.wBT))
                {
                  localObject2 = this.mActivity;
                  if (localObject2 != null)
                  {
                    ((Intent)localObject1).putExtra("qbarScene", this.qhx);
                    localObject2 = ((Activity)localObject2).getIntent().getStringExtra("img_gallery_session_id");
                    if (!bo.isNullOrNil((String)localObject2))
                    {
                      Object localObject5 = v.Zp().nV((String)localObject2);
                      if (localObject5 != null)
                      {
                        localObject3 = ((v.b)localObject5).getString("preUsername", null);
                        localObject2 = ((v.b)localObject5).getString("preChatName", null);
                        localObject4 = ((v.b)localObject5).getString("url", null);
                        localObject5 = ((v.b)localObject5).getString("rawUrl", null);
                        paramInt1 = u.ad((String)localObject3, (String)localObject2);
                        ((Intent)localObject1).putExtra("preUsername", (String)localObject3);
                        ((Intent)localObject1).putExtra("preChatName", (String)localObject2);
                        ((Intent)localObject1).putExtra("url", (String)localObject4);
                        ((Intent)localObject1).putExtra("rawUrl", (String)localObject5);
                        ((Intent)localObject1).putExtra("preChatTYPE", paramInt1);
                      }
                    }
                  }
                }
                com.tencent.mm.plugin.scanner.c.gkE.c((Intent)localObject1, this.mActivity);
                localObject1 = com.tencent.mm.plugin.report.service.h.pYm;
                if (!ad.Mn(paramString.wBT))
                  break label1594;
              }
              for (paramInt1 = 0; ; paramInt1 = 1)
              {
                ((com.tencent.mm.plugin.report.service.h)localObject1).e(14268, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(this.cvp), Integer.valueOf(this.qhx), this.imagePath, this.qhy, bo.nullAsNil(this.cvr) });
                paramInt1 = 1;
                break;
              }
              if (this.mActivity != null)
                Toast.makeText(this.mActivity, 2131302777, 0).show();
              paramInt1 = 0;
            }
            if (this.qhA != null)
              this.qhA.o(1, null);
            AppMethodBeat.o(81411);
          }
          else if (paramm.getType() == 372)
          {
            paramString = ((com.tencent.mm.openim.b.n)paramm).gfg;
            paramm = paramString.jBB;
            com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.QBarStringHandler", "handle search openim contact result, username:".concat(String.valueOf(paramm)));
            if ((this.jMB != null) && (this.jMB.isShowing()))
            {
              com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.QBarStringHandler", "tip dialog dismiss");
              this.jMB.dismiss();
            }
            if (bo.nullAsNil(paramm).length() > 0)
            {
              localObject1 = ((j)g.K(j.class)).XM().aoO(paramm);
              paramInt1 = chV();
              paramm = new Intent();
              com.tencent.mm.api.b.a(paramm, paramString, paramInt1);
              if ((localObject1 != null) && (!com.tencent.mm.n.a.jh(((ap)localObject1).field_type)))
                paramm.putExtra("Contact_IsLBSFriend", true);
              if (this.mActivity != null)
              {
                com.tencent.mm.plugin.scanner.c.gkE.c(paramm, this.mActivity);
                com.tencent.mm.plugin.report.service.h.pYm.e(14268, new Object[] { Integer.valueOf(2), Integer.valueOf(this.cvp), Integer.valueOf(this.qhx), this.imagePath, this.qhy, bo.nullAsNil(this.cvr) });
              }
            }
            for (paramInt1 = 1; ; paramInt1 = 0)
            {
              if (paramInt1 == 0)
                break label1988;
              if (this.qhA != null)
              {
                paramm = new Bundle();
                paramm.putString("geta8key_fullurl", paramString.jBB);
                paramm.putInt("geta8key_action_code", 4);
                this.qhA.o(3, paramm);
              }
              Cc(4);
              AppMethodBeat.o(81411);
              break;
              if (this.mActivity != null)
                Toast.makeText(this.mActivity, 2131302777, 0).show();
            }
            if (this.qhA != null)
              this.qhA.o(1, null);
            AppMethodBeat.o(81411);
          }
          else if (paramm.getType() == 233)
          {
            paramString = ((com.tencent.mm.modelsimple.h)paramm).aiT();
            localObject1 = new Bundle();
            ((Bundle)localObject1).putString("geta8key_fullurl", paramString);
            ((Bundle)localObject1).putInt("geta8key_action_code", ((com.tencent.mm.modelsimple.h)paramm).aiV());
            if (this.qhA != null)
              this.qhA.o(4, (Bundle)localObject1);
            Cc(((com.tencent.mm.modelsimple.h)paramm).aiV());
            if (this.jSW > 0);
            for (paramInt1 = this.jSW; ; paramInt1 = Cb(this.qhx))
            {
              com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.QBarStringHandler", "handleGetA8KeyRedirect, sceneValue: %s", new Object[] { Integer.valueOf(paramInt1) });
              bool = com.tencent.mm.plugin.u.a.c.a(this, (com.tencent.mm.modelsimple.h)paramm, new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                  AppMethodBeat.i(81403);
                  if (e.this.qhA != null)
                    e.this.qhA.o(1, null);
                  AppMethodBeat.o(81403);
                }
              }
              , this.qhy, paramInt1, this.qhx, new Runnable()
              {
                public final void run()
                {
                  AppMethodBeat.i(81394);
                  if (e.this.qhA != null)
                    e.this.qhA.o(3, null);
                  AppMethodBeat.o(81394);
                }
              }
              , this.qhz);
              if ((bool) || (((com.tencent.mm.modelsimple.h)paramm).aiV() != 4))
                break label2222;
              a(this.mActivity, this.qhx, paramString, true);
              AppMethodBeat.o(81411);
              break;
            }
            if ((!bool) && (((com.tencent.mm.modelsimple.h)paramm).aiV() == 29))
            {
              paramm = this.mActivity;
              com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.QBarStringHandler", "start search contact %s", new Object[] { paramString });
              paramString = new com.tencent.mm.openim.b.n(paramString, (byte)0);
              this.qhB.put(paramString, Integer.valueOf(1));
              g.Rg().a(paramString, 0);
              paramm.getString(2131297061);
              this.jMB = com.tencent.mm.ui.base.h.b(paramm, paramm.getString(2131302753), new e.8(this, paramString));
              AppMethodBeat.o(81411);
            }
            else
            {
              com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.QBarStringHandler", "scene geta8key, redirect result = [%s]", new Object[] { Boolean.valueOf(bool) });
              if ((!bool) && (this.qhA != null))
                this.qhA.o(1, null);
              AppMethodBeat.o(81411);
            }
          }
          else if (paramm.getType() == 666)
          {
            if ((paramInt1 == 0) && (paramInt2 == 0))
            {
              if ((paramm instanceof com.tencent.mm.ao.c))
              {
                paramm = ((com.tencent.mm.ao.c)paramm).agd().ProductID;
                com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.QBarStringHandler", "[oneliang]NetSceneScanEmoji productId:%s", new Object[] { paramm });
                paramString = new Intent();
                paramString.putExtra("extra_id", paramm);
                paramString.putExtra("preceding_scence", 11);
                paramString.putExtra("download_entrance_scene", 14);
                com.tencent.mm.bp.d.b(this.mActivity, "emoji", ".ui.EmojiStoreDetailUI", paramString);
                com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.QBarStringHandler", "[oneliang]NetSceneScanEmoji onSceneEnd.");
                if (this.qhA != null)
                  this.qhA.o(3, null);
                AppMethodBeat.o(81411);
              }
            }
            else
              com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.QBarStringHandler", "jump emotion detail failed.");
          }
          else
          {
            AppMethodBeat.o(81411);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.util.e
 * JD-Core Version:    0.6.2
 */