package com.tencent.mm.plugin.scanner.ui;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.compatible.e.c;
import com.tencent.mm.compatible.e.d;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.scanner.a.h;
import com.tencent.mm.plugin.scanner.util.b.a;
import com.tencent.mm.plugin.scanner.util.e.a;
import com.tencent.mm.plugin.scanner.util.j;
import com.tencent.mm.plugin.scanner.util.o;
import com.tencent.mm.plugin.scanner.util.r;
import com.tencent.mm.protocal.protobuf.kz;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;

public final class k extends i
  implements f, b.a
{
  private static int qeG = 300;
  private int ctE;
  private TextView qbp;
  private View qbq;
  private long qeH;
  h qeI;
  private int qeJ;
  private int qeK;
  private long qeL;
  private final int qeM;
  private final int qeN;
  private final long qeO;
  private long qeP;
  private final int qeQ;
  private e.a qeR;
  private View.OnTouchListener qeS;

  public k(i.b paramb, Point paramPoint)
  {
    super(paramb, paramPoint);
    AppMethodBeat.i(81169);
    this.qeH = 130L;
    this.qeJ = 0;
    this.qeK = 1;
    this.qeM = 300;
    this.qeN = 400;
    this.qeO = 30000L;
    this.qeQ = 50;
    this.qeR = new k.1(this);
    fd(300, 400);
    ab.d("MicroMsg.scanner.ScanModeImage", "frameRectWidth = [%s], frameRectHeight = [%s]", new Object[] { Integer.valueOf(this.qep), Integer.valueOf(this.qeq) });
    if (bo.gO(paramb.getContext()) < 100L)
    {
      ab.w("MicroMsg.scanner.ScanModeImage", "memory is not much");
      this.qeH = 300L;
    }
    this.ctE = ((int)(System.currentTimeMillis() & 0xFFFFFFFF));
    this.qeP = System.currentTimeMillis();
    AppMethodBeat.o(81169);
  }

  private void chv()
  {
    AppMethodBeat.i(81175);
    if (this.qet == null)
    {
      ab.e("MicroMsg.scanner.ScanModeImage", "dealWithNetWork(), scanUICallback == null");
      AppMethodBeat.o(81175);
    }
    while (true)
    {
      return;
      if ((g.Rg().acS() == 6) || (g.Rg().acS() == 4))
        this.qet.jL(0L);
      AppMethodBeat.o(81175);
    }
  }

  private void chw()
  {
    AppMethodBeat.i(81178);
    al.d(new k.2(this));
    AppMethodBeat.o(81178);
  }

  public final void K(Bundle paramBundle)
  {
  }

  public final void b(int paramInt1, String paramString, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(81176);
    if (this.qet == null)
    {
      ab.w("MicroMsg.scanner.ScanModeImage", "scanUICallback == null");
      AppMethodBeat.o(81176);
    }
    while (true)
    {
      return;
      if ((paramArrayOfByte2 == null) || (paramArrayOfByte2.length <= 0))
      {
        ab.w("MicroMsg.scanner.ScanModeImage", "greyData null");
        if ((System.currentTimeMillis() - this.qeL > 1800L + this.qeH) && (((j)this.qen).qin == true))
        {
          this.qeL = System.currentTimeMillis();
          this.qet.jL(0L);
          AppMethodBeat.o(81176);
        }
        else
        {
          this.qet.jK(this.qeH);
          AppMethodBeat.o(81176);
        }
      }
      else
      {
        chw();
        if (this.qeJ >= this.qeK)
        {
          ab.i("MicroMsg.scanner.ScanModeImage", "too quick to send image, return now");
          this.qet.jK(this.qeH);
          if ((System.currentTimeMillis() - this.qeL > 1800L + this.qeH) && (((j)this.qen).qin == true))
          {
            this.qeL = System.currentTimeMillis();
            this.qet.jL(0L);
            AppMethodBeat.o(81176);
          }
          else
          {
            this.qet.jK(this.qeH);
            AppMethodBeat.o(81176);
          }
        }
        else
        {
          this.qeI = new h(paramArrayOfByte2, paramArrayOfByte2.length, this.ctE);
          g.Rg().a(this.qeI, 0);
          this.qeJ += 1;
          this.qeu += paramArrayOfByte2.length;
          ab.d("MicroMsg.scanner.ScanModeImage", "totalNetworkFlow : [%s]", new Object[] { Integer.valueOf(this.qeu) });
          if ((System.currentTimeMillis() - this.qeL > 1800L + this.qeH) && (((j)this.qen).qin == true))
          {
            this.qeL = System.currentTimeMillis();
            this.qet.jL(0L);
            AppMethodBeat.o(81176);
          }
          else
          {
            this.qet.jK(this.qeH);
            AppMethodBeat.o(81176);
          }
        }
      }
    }
  }

  protected final void cgN()
  {
    AppMethodBeat.i(81174);
    if (this.qet == null)
    {
      ab.w("MicroMsg.scanner.ScanModeImage", "scanUICallback == null");
      AppMethodBeat.o(81174);
    }
    while (true)
    {
      return;
      chv();
      AppMethodBeat.o(81174);
    }
  }

  protected final com.tencent.mm.plugin.scanner.util.b cgO()
  {
    AppMethodBeat.i(81173);
    int i;
    if (this.qen == null)
    {
      i = 50;
      if (q.etc.erl > 0)
      {
        i = q.etc.erl;
        ab.d("MicroMsg.scanner.ScanModeImage", "ImageQuality=[%s]", new Object[] { Integer.valueOf(q.etc.erl) });
      }
      if (!at.is2G(this.qet.getContext()))
        break label107;
    }
    label107: for (this.qen = new j(this, i - 10, false, this.qet.chh()); ; this.qen = new j(this, i, false, this.qet.chh()))
    {
      com.tencent.mm.plugin.scanner.util.b localb = this.qen;
      AppMethodBeat.o(81173);
      return localb;
    }
  }

  protected final int cgP()
  {
    return 2130970546;
  }

  protected final int cgQ()
  {
    return qeG;
  }

  protected final void cgR()
  {
    AppMethodBeat.i(81171);
    j(new Rect(0, 0, 0, 0));
    this.qet.b(4, null);
    onResume();
    AppMethodBeat.o(81171);
  }

  protected final boolean cgS()
  {
    return true;
  }

  protected final boolean cgT()
  {
    return true;
  }

  protected final void j(Rect paramRect)
  {
    AppMethodBeat.i(81170);
    this.qbq = this.qet.findViewById(2131827193);
    this.qbp = ((TextView)this.qet.findViewById(2131827194));
    this.iqU = ((TextView)this.qet.findViewById(2131827209));
    this.iqU.setText(r.fT(r.qiR, this.qet.getContext().getString(2131302745)));
    if (paramRect.bottom > 0)
    {
      RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.iqU.getLayoutParams();
      localLayoutParams.topMargin = (paramRect.bottom + 0 + BackwardSupportUtil.b.b(this.qet.getContext(), 13.0F));
      this.iqU.setLayoutParams(localLayoutParams);
    }
    if (d.Lt())
      this.iqU.setPadding(BackwardSupportUtil.b.b(this.qet.getContext(), 54.0F), this.iqU.getPaddingTop(), BackwardSupportUtil.b.b(this.qet.getContext(), 54.0F), this.iqU.getPaddingBottom());
    if (this.qen != null)
      ((j)this.qen).ovx = this.qet.chh();
    chv();
    kl(true);
    AppMethodBeat.o(81170);
  }

  public final void jJ(long paramLong)
  {
    AppMethodBeat.i(81177);
    ab.d("MicroMsg.scanner.ScanModeImage", "decodeFail");
    if (this.qet == null)
    {
      ab.w("MicroMsg.scanner.ScanModeImage", "scanUICallback == null");
      AppMethodBeat.o(81177);
    }
    while (true)
    {
      return;
      chw();
      if ((System.currentTimeMillis() - this.qeL > 1800L + this.qeH) && (((j)this.qen).qin == true))
      {
        this.qeL = System.currentTimeMillis();
        this.qet.jL(0L);
        AppMethodBeat.o(81177);
      }
      else
      {
        this.qet.jK(this.qeH);
        AppMethodBeat.o(81177);
      }
    }
  }

  protected final void kn(boolean paramBoolean)
  {
    AppMethodBeat.i(81172);
    super.kn(paramBoolean);
    if (this.qen != null)
      ((j)this.qen).ovx = paramBoolean;
    AppMethodBeat.o(81172);
  }

  protected final void onDestroy()
  {
  }

  protected final void onPause()
  {
    AppMethodBeat.i(81181);
    super.onPause();
    kl(false);
    g.Rg().b(1062, this);
    AppMethodBeat.o(81181);
  }

  protected final void onResume()
  {
    AppMethodBeat.i(81180);
    g.Rg().a(1062, this);
    if (this.qet == null)
    {
      ab.w("MicroMsg.scanner.ScanModeImage", "scanUICallback == null");
      AppMethodBeat.o(81180);
    }
    while (true)
    {
      return;
      this.qeJ = 0;
      chv();
      AppMethodBeat.o(81180);
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(81179);
    this.qeJ = 0;
    if ((this.qet == null) || (paramm == null))
    {
      if (paramm == null);
      for (boolean bool = true; ; bool = false)
      {
        ab.e("MicroMsg.scanner.ScanModeImage", "onSceneEnd() scene is null [%s]", new Object[] { Boolean.valueOf(bool) });
        AppMethodBeat.o(81179);
        return;
      }
    }
    if (paramm.getType() == 1062)
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
        break label163;
      ab.e("MicroMsg.scanner.ScanModeImage", "onSceneEnd() errType = [%s], errCode = [%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      this.iqU.setText(r.fT(r.qiR, this.qet.getContext().getString(2131302745)));
    }
    while (true)
    {
      if (this.qeI != null)
        g.Rg().c(this.qeI);
      AppMethodBeat.o(81179);
      break;
      label163: this.qeJ = this.qeK;
      paramString = (h)paramm;
      if ((paramString.ehh != null) && (paramString.ehh.fsH.fsP != null));
      for (paramString = (kz)paramString.ehh.fsH.fsP; ; paramString = null)
      {
        if (paramString != null)
          break label237;
        ab.e("MicroMsg.scanner.ScanModeImage", "onSceneEnd(), getResp() == null");
        AppMethodBeat.o(81179);
        break;
      }
      label237: ab.d("MicroMsg.scanner.ScanModeImage", "onSceneEnd() clientScanID = %s, imageType = %s", new Object[] { Integer.valueOf(paramString.vOn), Integer.valueOf(paramString.vOr) });
      switch (o.a(paramString.jCt, paramString.vOt, this, 3, this.qeR, 0, 0, false))
      {
      default:
        break;
      case 0:
        this.qet.cha();
        if ((this.qet != null) && (this.qet.getContext() != null))
          this.qet.chi();
        break;
      case 1:
        ab.d("MicroMsg.scanner.ScanModeImage", "onSceneEnd() PROCESS_XML_RETURN_TYPE_SEARCH_CONTACT");
        break;
      case 2:
        ab.e("MicroMsg.scanner.ScanModeImage", "onSceneEnd() PROCESS_XML_RETURN_TYPE_WRONG");
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.k
 * JD-Core Version:    0.6.2
 */