package com.tencent.mm.plugin.scanner.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.g.a.mv;
import com.tencent.mm.g.a.mv.b;
import com.tencent.mm.plugin.scanner.e;
import com.tencent.mm.plugin.scanner.util.b.a;
import com.tencent.mm.plugin.scanner.util.e.a;
import com.tencent.mm.plugin.scanner.util.o;
import com.tencent.mm.plugin.scanner.util.r;
import com.tencent.mm.plugin.u.a.c.a;
import com.tencent.mm.protocal.protobuf.kx;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public final class p extends i
  implements f, i.a, b.a, c.a
{
  int bufferSize;
  Object cli;
  int cvH;
  private int mMode;
  private int pZN;
  long qeH;
  private e.a qeR;
  com.tencent.mm.plugin.scanner.util.d qfd;
  AtomicBoolean qfe;
  boolean qff;
  boolean qfg;
  private Set<Integer> qfh;
  private float qfi;
  byte[] qfj;
  Point qfk;
  int qfl;
  private TextView qfm;
  boolean qfn;
  private View.OnClickListener qfo;

  public p(i.b paramb, Point paramPoint, int paramInt1, int paramInt2)
  {
    super(paramb, paramPoint);
    AppMethodBeat.i(81212);
    this.qeH = 80L;
    this.cvH = 0;
    this.qfe = new AtomicBoolean(false);
    this.qff = false;
    this.qfg = false;
    this.mMode = 0;
    this.qfi = 1.5F;
    this.cli = new Object();
    this.qfn = false;
    this.qeR = new p.1(this);
    this.qfo = new p.2(this);
    fd(244, 244);
    this.cvH = paramInt1;
    this.mMode = paramInt2;
    this.qev = true;
    this.qel = 1000L;
    if (bo.gO(paramb.getContext()) < 100L)
    {
      com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.scanner.ScanModeQRCode", "memory is not much");
      this.qeH = 280L;
    }
    AppMethodBeat.o(81212);
  }

  public p(i.b paramb, Point paramPoint, int paramInt, Set<Integer> paramSet)
  {
    super(paramb, paramPoint);
    AppMethodBeat.i(81213);
    this.qeH = 80L;
    this.cvH = 0;
    this.qfe = new AtomicBoolean(false);
    this.qff = false;
    this.qfg = false;
    this.mMode = 0;
    this.qfi = 1.5F;
    this.cli = new Object();
    this.qfn = false;
    this.qeR = new p.1(this);
    this.qfo = new p.2(this);
    fd(244, 244);
    this.cvH = paramInt;
    this.qfh = paramSet;
    this.qev = true;
    this.qel = 1000L;
    if (bo.gO(paramb.getContext()) < 100L)
    {
      com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.scanner.ScanModeQRCode", "memory is not much");
      this.qeH = 280L;
    }
    AppMethodBeat.o(81213);
  }

  private void a(int paramInt1, String paramString, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    int i = 1;
    AppMethodBeat.i(81223);
    Activity localActivity = this.qet.getContext();
    Object localObject = new mv();
    if (paramInt1 == 1)
    {
      ((mv)localObject).cIL.cIN = 0;
      ((mv)localObject).cIL.scanResult = paramString;
      if (!this.qfn)
        break label177;
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.scanner.ScanModeQRCode", "need to finish on decode success");
      ((mv)localObject).cIL.bJt = 1;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
      localObject = new Intent();
      ((Intent)localObject).putExtra("key_scan_result", paramString);
      ((Intent)localObject).putExtra("key_scan_result_raw", paramArrayOfByte);
      ((Intent)localObject).putExtra("key_scan_result_type", paramInt1);
      ((Intent)localObject).putExtra("key_scan_result_code_type", paramInt2);
      ((Intent)localObject).putExtra("key_scan_result_code_version", paramInt3);
      localActivity.setResult(-1, (Intent)localObject);
      localActivity.finish();
      localActivity.overridePendingTransition(0, 0);
      AppMethodBeat.o(81223);
    }
    while (true)
    {
      return;
      ((mv)localObject).cIL.cIN = 1;
      break;
      label177: ((mv)localObject).cIL.bJt = 0;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
      if ((((mv)localObject).cIM.ret == 1) || (((mv)localObject).cIM.ret == 2))
      {
        localActivity.finish();
        localActivity.overridePendingTransition(0, 0);
      }
      if (paramInt1 == 1)
      {
        this.qet.cha();
        this.qet.kj(true);
        this.qff = false;
        if (((mv)localObject).cIM.ret != 2)
        {
          if (this.qfg);
          for (paramInt1 = i; ; paramInt1 = 0)
          {
            this.qet.a(paramString, paramInt1, paramInt2, paramInt3, this.qeR);
            AppMethodBeat.o(81223);
            break;
          }
        }
      }
      else if (paramInt1 == 2)
      {
        af(paramString, paramInt2, paramInt3);
      }
      AppMethodBeat.o(81223);
    }
  }

  private void af(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(81228);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.scanner.ScanModeQRCode", "result is null");
      this.qff = false;
      this.qet.kj(false);
      AppMethodBeat.o(81228);
    }
    while (true)
    {
      return;
      paramString = paramString.split(",", 2);
      if ((paramString == null) || (paramString.length < 2))
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.scanner.ScanModeQRCode", "wrong zbar format");
        this.qff = false;
        this.qet.kj(false);
        AppMethodBeat.o(81228);
      }
      else
      {
        com.tencent.mm.plugin.scanner.a.g localg = new com.tencent.mm.plugin.scanner.a.g(r.Ws(paramString[0]), paramString[1], paramInt1, paramInt2);
        localg.pZG = this.qfg;
        com.tencent.mm.kernel.g.Rg().a(localg, 0);
        this.qet.cha();
        this.qet.kj(true);
        paramString = this.qet.getContext();
        this.qet.getContext().getString(2131297061);
        this.ehJ = com.tencent.mm.ui.base.h.b(paramString, this.qet.getContext().getString(2131302102), true, new p.5(this, localg));
        AppMethodBeat.o(81228);
      }
    }
  }

  private void chv()
  {
    AppMethodBeat.i(81221);
    if (this.qet == null)
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.scanner.ScanModeQRCode", "dealWithNetWork(), scanUICallback == null");
      AppMethodBeat.o(81221);
    }
    while (true)
    {
      return;
      if ((com.tencent.mm.kernel.g.Rg().acS() == 6) || (com.tencent.mm.kernel.g.Rg().acS() == 4))
        this.qet.jL(0L);
      AppMethodBeat.o(81221);
    }
  }

  private void chz()
  {
    AppMethodBeat.i(81233);
    if ((!this.qfe.get()) && (this.bufferSize > 0))
    {
      this.qfe.set(true);
      this.bufferSize -= 1;
      if ((this.qfh != null) && (this.qfh.size() > 0))
      {
        ((com.tencent.mm.plugin.scanner.util.d)cgO()).qfh = this.qfh;
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.scanner.ScanModeQRCode", "try decode,buffer size:" + this.bufferSize);
        if ((this.pZN > 0) && (this.qet != null))
          this.qet.jK(30L);
        if ((this.qfj != null) && (this.qfk != null))
        {
          ((com.tencent.mm.plugin.scanner.util.d)cgO()).chT();
          ((com.tencent.mm.plugin.scanner.util.d)cgO()).a(this.qfj, this.qfk);
        }
        if ((com.tencent.mm.plugin.scanner.a.m.pZK.pZN == 30) && (this.qet != null))
          this.qet.chk();
        this.pZN += 1;
        AppMethodBeat.o(81233);
      }
    }
    while (true)
    {
      return;
      if ((this.pZN % 3 < 2) && ((this.mMode == 1) || (this.mMode == 0)))
      {
        ((com.tencent.mm.plugin.scanner.util.d)cgO()).qht = 3;
        break;
      }
      ((com.tencent.mm.plugin.scanner.util.d)cgO()).qht = this.mMode;
      break;
      if (this.qet != null)
        this.qet.jK(0L);
      AppMethodBeat.o(81233);
    }
  }

  public final void K(Bundle paramBundle)
  {
    AppMethodBeat.i(81232);
    if ((paramBundle.containsKey("zoom_action")) && (paramBundle.containsKey("zoom_type")) && (paramBundle.containsKey("zoom_scale")) && (this.qet != null))
      this.qet.ah(paramBundle.getInt("zoom_action"), paramBundle.getInt("zoom_type"), paramBundle.getInt("zoom_scale"));
    AppMethodBeat.o(81232);
  }

  protected final void a(byte[] paramArrayOfByte, Point paramPoint, int paramInt, Rect paramRect)
  {
    AppMethodBeat.i(81234);
    synchronized (this.cli)
    {
      if (this.bufferSize == 1)
      {
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.scanner.ScanModeQRCode", "decode too slow");
        this.bufferSize = 0;
      }
      if (this.qfk == null)
        this.qfk = new Point();
      com.tencent.mm.sdk.g.d.post(new p.8(this, paramArrayOfByte, paramPoint, paramInt, paramRect), "prepare_decode_data");
      AppMethodBeat.o(81234);
      return;
    }
  }

  public final void b(int paramInt1, String paramString, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(81222);
    this.qfe.set(false);
    this.pZN = 0;
    if (this.qet == null)
    {
      com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.scanner.ScanModeQRCode", "scanUICallback == null");
      AppMethodBeat.o(81222);
    }
    while (true)
    {
      return;
      if (this.qff)
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.scanner.ScanModeQRCode", "is decoding, return");
        AppMethodBeat.o(81222);
      }
      else
      {
        this.qff = true;
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.scanner.ScanModeQRCode", "decode success:%s", new Object[] { paramString });
        if (bo.isNullOrNil(paramString))
        {
          this.qff = false;
          AppMethodBeat.o(81222);
        }
        else if (com.tencent.mm.kernel.g.Rg().acS() == 0)
        {
          Toast.makeText(this.qet.getContext(), this.qet.getContext().getString(2131299946), 0).show();
          this.qff = false;
          AppMethodBeat.o(81222);
        }
        else
        {
          com.tencent.mm.plugin.scanner.util.m.qiz.stop();
          a(paramInt1, paramString, paramArrayOfByte1, paramInt2, paramInt3);
          AppMethodBeat.o(81222);
        }
      }
    }
  }

  public final void c(Activity paramActivity, int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(81229);
    this.qff = true;
    if (paramInt2 != -1)
    {
      this.qff = false;
      this.qfe.set(false);
      this.qfg = false;
      AppMethodBeat.o(81229);
      return;
    }
    switch (paramInt1)
    {
    default:
    case 4660:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(81229);
      break;
      if (paramIntent == null)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.scanner.ScanModeQRCode", "onActivityResult data == null");
        this.qff = false;
        this.qfe.set(false);
        this.qfg = false;
        AppMethodBeat.o(81229);
        break;
      }
      this.qfe.set(true);
      paramIntent = com.tencent.mm.ui.tools.a.i(paramActivity, paramIntent, com.tencent.mm.plugin.i.c.XW());
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.scanner.ScanModeQRCode", "select: [%s]", new Object[] { paramIntent });
      new ak().post(new p.6(this, paramActivity));
      if (this.qfd != null)
        this.qfd.sI();
      if (this.qet != null)
        this.qet.kj(true);
      com.tencent.mm.plugin.scanner.a.m.pZK.reset();
      e.cgy().pYI.a(paramIntent, new p.7(this, paramActivity), null);
      AppMethodBeat.o(81229);
      break;
      this.qet.chj();
    }
  }

  protected final void cgN()
  {
    AppMethodBeat.i(81220);
    if (this.qet == null)
    {
      com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.scanner.ScanModeQRCode", "handleNetworkChange(), scanUICallback == null");
      AppMethodBeat.o(81220);
    }
    while (true)
    {
      return;
      chv();
      AppMethodBeat.o(81220);
    }
  }

  protected final com.tencent.mm.plugin.scanner.util.b cgO()
  {
    AppMethodBeat.i(81219);
    if ((this.qfd == null) && (this.qet != null))
      this.qfd = new com.tencent.mm.plugin.scanner.util.d(this, this.mMode, this.qet.chh());
    com.tencent.mm.plugin.scanner.util.d locald = this.qfd;
    AppMethodBeat.o(81219);
    return locald;
  }

  protected final int cgP()
  {
    return 2130970550;
  }

  protected final int cgQ()
  {
    return 244;
  }

  protected final void cgR()
  {
    AppMethodBeat.i(81218);
    j(new Rect(0, 0, 0, 0));
    if (this.mMode == 2)
      this.qet.b(4, null);
    while (true)
    {
      this.qet.a(this);
      onResume();
      AppMethodBeat.o(81218);
      return;
      this.qet.b(0, new p.3(this));
    }
  }

  protected final boolean cgS()
  {
    return true;
  }

  protected final boolean cgT()
  {
    return true;
  }

  public final void chx()
  {
    this.qev = false;
  }

  public final boolean chy()
  {
    return this.qev;
  }

  protected final void f(Point paramPoint)
  {
    AppMethodBeat.i(81214);
    this.qem = null;
    super.f(paramPoint);
    AppMethodBeat.o(81214);
  }

  public final Context getContext()
  {
    AppMethodBeat.i(81230);
    Object localObject;
    if (this.qet == null)
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.scanner.ScanModeQRCode", "getContext(), scanUICallback == null");
      localObject = null;
      AppMethodBeat.o(81230);
    }
    while (true)
    {
      return localObject;
      localObject = this.qet.getContext();
      AppMethodBeat.o(81230);
    }
  }

  protected final void j(Rect paramRect)
  {
    AppMethodBeat.i(81217);
    this.qfm = ((TextView)this.qet.findViewById(2131827215));
    this.qfm.setOnClickListener(this.qfo);
    this.iqU = ((TextView)this.qet.findViewById(2131827209));
    if (paramRect.bottom > 0)
    {
      this.qfm.setVisibility(0);
      RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.iqU.getLayoutParams();
      localLayoutParams.topMargin = (paramRect.bottom + 0 + BackwardSupportUtil.b.b(this.qet.getContext(), 13.0F));
      this.iqU.setLayoutParams(localLayoutParams);
    }
    chv();
    if (this.mMode == 2)
      this.iqU.setText(2131302041);
    while (true)
    {
      kl(true);
      AppMethodBeat.o(81217);
      return;
      if (this.mMode == 1)
        this.iqU.setText(2131302040);
      else if (this.cvH == 1)
        this.iqU.setText(2131302105);
      else if (this.cvH == 2)
        this.iqU.setText(2131305604);
      else
        this.iqU.setText(2131302106);
    }
  }

  public final void jJ(long paramLong)
  {
    AppMethodBeat.i(81224);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.scanner.ScanModeQRCode", "decodeFail cost %s", new Object[] { Long.valueOf(paramLong) });
    this.qfe.set(false);
    synchronized (this.cli)
    {
      chz();
      AppMethodBeat.o(81224);
      return;
    }
  }

  public final void jZ(boolean paramBoolean)
  {
    AppMethodBeat.i(81231);
    if (this.qet == null)
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.scanner.ScanModeQRCode", "continueScan, scanUICallback == null");
      AppMethodBeat.o(81231);
    }
    while (true)
    {
      return;
      if (paramBoolean)
      {
        this.qet.kj(false);
        AppMethodBeat.o(81231);
      }
      else
      {
        this.qet.getContext().finish();
        this.qet.getContext().overridePendingTransition(0, 0);
        AppMethodBeat.o(81231);
      }
    }
  }

  protected final Rect km(boolean paramBoolean)
  {
    AppMethodBeat.i(81216);
    Rect localRect = new Rect(H(true, paramBoolean));
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.scanner.ScanModeQRCode", "display rect:".concat(String.valueOf(localRect)));
    int i = localRect.width();
    int j = localRect.height();
    int k = (int)(i * this.qfi);
    int m = (int)(j * this.qfi);
    int n = k;
    if (k > (int)(this.qeo.x * 0.85F))
      n = (int)(this.qeo.x * 0.85F);
    k = m;
    if (m > (int)(this.qeo.y * 0.85F))
      k = (int)(this.qeo.y * 0.85F);
    m = k;
    if (k % 2 == 1)
      m = k - 1;
    k = n;
    if (n % 2 == 1)
      k = n - 1;
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.scanner.ScanModeQRCode", "newWidth:%d,newHeight:%d", new Object[] { Integer.valueOf(k), Integer.valueOf(m) });
    localRect.left -= (k - i) / 2;
    n = localRect.right;
    localRect.right = ((k - i) / 2 + n);
    localRect.top -= (m - j) / 2;
    localRect.bottom += (m - j) / 2;
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.scanner.ScanModeQRCode", "scan rect:".concat(String.valueOf(localRect)));
    AppMethodBeat.o(81216);
    return localRect;
  }

  protected final void kn(boolean paramBoolean)
  {
    AppMethodBeat.i(81215);
    super.kn(paramBoolean);
    if (this.qfd != null)
      this.qfd.ovx = paramBoolean;
    AppMethodBeat.o(81215);
  }

  protected final void onDestroy()
  {
    this.qfj = null;
  }

  protected final void onPause()
  {
    AppMethodBeat.i(81227);
    super.onPause();
    kl(false);
    com.tencent.mm.kernel.g.Rg().b(1061, this);
    com.tencent.mm.kernel.g.Rg().b(666, this);
    com.tencent.mm.kernel.g.Rg().b(971, this);
    AppMethodBeat.o(81227);
  }

  protected final void onResume()
  {
    AppMethodBeat.i(81226);
    com.tencent.mm.kernel.g.Rg().a(1061, this);
    com.tencent.mm.kernel.g.Rg().a(666, this);
    com.tencent.mm.kernel.g.Rg().a(971, this);
    if (this.qet == null)
    {
      com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.scanner.ScanModeQRCode", "scanUICallback == null");
      AppMethodBeat.o(81226);
    }
    while (true)
    {
      return;
      if (!this.qfg)
        this.qff = false;
      chv();
      AppMethodBeat.o(81226);
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(81225);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.scanner.ScanModeQRCode", "onSceneEnd: errType = [%s] errCode = [%s] errMsg = [%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (this.ehJ != null)
    {
      this.ehJ.dismiss();
      this.ehJ = null;
    }
    boolean bool;
    if ((this.qet == null) || (paramm == null))
      if (paramm == null)
      {
        bool = true;
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.scanner.ScanModeQRCode", "onSceneEnd() scene is null [%s]", new Object[] { Boolean.valueOf(bool) });
        this.qff = false;
        AppMethodBeat.o(81225);
      }
    while (true)
    {
      return;
      bool = false;
      break;
      if ((paramInt1 == 4) && (paramInt2 == -4))
      {
        com.tencent.mm.ui.base.h.a(this.qet.getContext(), 2131302097, 2131297061, new p.4(this));
        AppMethodBeat.o(81225);
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
            break label378;
          jZ(true);
          AppMethodBeat.o(81225);
          break;
          if (com.tencent.mm.kernel.g.Rg().acT())
          {
            com.tencent.mm.kernel.g.Rg().getNetworkServerIp();
            new StringBuilder().append(paramInt2);
          }
          while (true)
          {
            i = 1;
            break;
            if (com.tencent.mm.network.ab.ch(this.qet.getContext()))
              com.tencent.mm.pluginsdk.ui.tools.h.fR(this.qet.getContext());
            else
              Toast.makeText(this.qet.getContext(), this.qet.getContext().getString(2131299945, new Object[] { Integer.valueOf(1), Integer.valueOf(paramInt2) }), 1).show();
          }
          Toast.makeText(this.qet.getContext(), this.qet.getContext().getString(2131299946, new Object[] { Integer.valueOf(2), Integer.valueOf(paramInt2) }), 1).show();
          i = 1;
        }
        label378: if ((paramInt1 == 4) && (paramInt2 == -2004))
        {
          com.tencent.mm.ui.base.h.g(this.qet.getContext(), 2131302090, 2131297061);
          jZ(true);
          AppMethodBeat.o(81225);
        }
        else if ((paramInt1 != 0) || (paramInt2 != 0))
        {
          Toast.makeText(this.qet.getContext(), this.qet.getContext().getString(2131299995, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
          jZ(true);
          AppMethodBeat.o(81225);
        }
        else if (paramm.getType() == 1061)
        {
          paramString = ((com.tencent.mm.plugin.scanner.a.g)paramm).cgG();
          if (paramString == null)
          {
            com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.scanner.ScanModeQRCode", "onSceneEnd(), getResp() == null");
            jZ(true);
            AppMethodBeat.o(81225);
          }
          else
          {
            com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.scanner.ScanModeQRCode", "onSceneEnd() ScanBarcode Type = %s", new Object[] { Integer.valueOf(paramString.jCt) });
            if (bo.isNullOrNil(paramString.vNK))
            {
              jZ(true);
              AppMethodBeat.o(81225);
            }
            else
            {
              switch (o.a(paramString.jCt, paramString.vNK, this, 4, this.qeR, ((com.tencent.mm.plugin.scanner.a.g)paramm).cvn, ((com.tencent.mm.plugin.scanner.a.g)paramm).cvo, ((com.tencent.mm.plugin.scanner.a.g)paramm).pZG))
              {
              default:
              case 0:
              case 1:
              case 2:
              }
              while (true)
              {
                this.qet.kj(false);
                AppMethodBeat.o(81225);
                break;
                this.qet.getContext().finish();
                this.qet.getContext().overridePendingTransition(0, 0);
                AppMethodBeat.o(81225);
                break;
                com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.scanner.ScanModeQRCode", "onSceneEnd() PROCESS_XML_RETURN_TYPE_SEARCH_CONTACT");
                continue;
                com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.scanner.ScanModeQRCode", "onSceneEnd() PROCESS_XML_RETURN_TYPE_WRONG");
                this.qet.jL(0L);
              }
            }
          }
        }
        else if (paramm.getType() == 666)
        {
          if ((paramm instanceof com.tencent.mm.ao.c))
          {
            this.qet.kj(true);
            this.qet.getContext().finish();
            this.qet.getContext().overridePendingTransition(0, 0);
            AppMethodBeat.o(81225);
          }
        }
        else
        {
          if (paramm.getType() == 971)
          {
            this.qet.kj(true);
            this.qet.getContext().finish();
            this.qet.getContext().overridePendingTransition(0, 0);
          }
          AppMethodBeat.o(81225);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.p
 * JD-Core Version:    0.6.2
 */