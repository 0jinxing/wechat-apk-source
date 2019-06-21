package com.tencent.mm.plugin.scanner.ui;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.Display;
import android.view.WindowManager;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.compatible.e.c;
import com.tencent.mm.compatible.e.d;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.scanner.util.b.a;
import com.tencent.mm.plugin.scanner.util.j;
import com.tencent.mm.plugin.scanner.util.r;
import com.tencent.mm.protocal.protobuf.beo;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;

public final class o extends i
  implements com.tencent.mm.ai.f, b.a
{
  private int ctE;
  int qeJ;
  int qeK;
  private long qeL;
  private final int qeM;
  private final int qeN;
  private final int qeQ;
  com.tencent.mm.plugin.scanner.a.f qeV;
  private int qeW;
  private TextView qeX;
  private TextView qeY;
  private final int qeZ;
  private final int qfa;
  private ak qfb;

  public o(i.b paramb, Point paramPoint)
  {
    super(paramb, paramPoint, (byte)0);
    AppMethodBeat.i(81186);
    this.qeJ = 0;
    this.qeK = 2;
    this.qeW = 0;
    this.qeM = 184;
    this.qeN = 46;
    this.qeQ = 50;
    this.qeZ = 5000;
    this.qfa = 8000;
    this.qfb = new o.1(this);
    fd(184, 46);
    ab.d("MicroMsg.scanner.ScanModeOCR", "frameRectWidth = [%s], frameRectHeight = [%s]", new Object[] { Integer.valueOf(this.qep), Integer.valueOf(this.qeq) });
    this.ctE = ((int)(System.currentTimeMillis() & 0xFFFFFFFF));
    AppMethodBeat.o(81186);
  }

  private void chv()
  {
    AppMethodBeat.i(81193);
    if (this.qet == null)
    {
      ab.e("MicroMsg.scanner.ScanModeOCR", "dealWithNetWork(), scanUICallback == null");
      AppMethodBeat.o(81193);
    }
    while (true)
    {
      return;
      if ((g.Rg().acS() == 6) || (g.Rg().acS() == 4))
      {
        this.qet.jL(0L);
        AppMethodBeat.o(81193);
      }
      else
      {
        this.qeX.setText("");
        this.qeY.setText("");
        this.qet.kj(true);
        AppMethodBeat.o(81193);
      }
    }
  }

  private void fR(String paramString1, String paramString2)
  {
    AppMethodBeat.i(81197);
    if (!bo.isNullOrNil(paramString1))
    {
      this.iqU.setVisibility(8);
      this.qeX.setText(paramString1);
      this.qeX.setVisibility(0);
      if (bo.isNullOrNil(paramString2))
        break label87;
      this.iqU.setVisibility(8);
      this.qeY.setText(paramString2);
      this.qeY.setVisibility(0);
      AppMethodBeat.o(81197);
    }
    while (true)
    {
      return;
      this.qeX.setText("");
      break;
      label87: this.qeY.setText("");
      AppMethodBeat.o(81197);
    }
  }

  protected final Rect H(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(81189);
    Object localObject;
    if ((paramBoolean1) || (this.qem == null))
    {
      if (r.cio())
      {
        localObject = new Point();
        this.qet.getContext().getWindowManager().getDefaultDisplay().getRealSize((Point)localObject);
        this.qem = new Rect(0, 0, ((Point)localObject).x, ((Point)localObject).y);
      }
    }
    else
    {
      localObject = this.qem;
      AppMethodBeat.o(81189);
    }
    while (true)
    {
      return localObject;
      localObject = super.H(paramBoolean1, paramBoolean2);
      AppMethodBeat.o(81189);
    }
  }

  public final void K(Bundle paramBundle)
  {
  }

  public final void b(int paramInt1, String paramString, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(81194);
    if (this.qet == null)
    {
      ab.w("MicroMsg.scanner.ScanModeOCR", "scanUICallback == null");
      AppMethodBeat.o(81194);
      return;
    }
    if ((paramArrayOfByte2 == null) || (paramArrayOfByte2.length <= 0))
    {
      boolean bool;
      if (paramArrayOfByte2 == null)
      {
        bool = true;
        label44: ab.w("MicroMsg.scanner.ScanModeOCR", "greyData null:[%s]", new Object[] { Boolean.valueOf(bool) });
        if ((System.currentTimeMillis() - this.qeL <= 1840L) || (((j)this.qen).qin != true))
          break label128;
        this.qeL = System.currentTimeMillis();
        this.qet.jL(0L);
      }
      while (true)
      {
        this.qeW = 0;
        AppMethodBeat.o(81194);
        break;
        bool = false;
        break label44;
        label128: this.qet.jK(40L);
      }
    }
    if (this.qeJ >= this.qeK)
    {
      if ((System.currentTimeMillis() - this.qeL > 1840L) && (((j)this.qen).qin == true))
      {
        this.qeL = System.currentTimeMillis();
        this.qet.jL(0L);
      }
      while (true)
      {
        ab.w("MicroMsg.scanner.ScanModeOCR", "hasDoSceneCount[%s], maxDoSceneCount[%s]", new Object[] { Integer.valueOf(this.qeJ), Integer.valueOf(this.qeK) });
        AppMethodBeat.o(81194);
        break;
        this.qet.jK(40L);
      }
    }
    this.qeV = new com.tencent.mm.plugin.scanner.a.f(paramArrayOfByte2, "en", "zh_CN", this.ctE);
    g.Rg().a(this.qeV, 0);
    this.qeJ += 1;
    this.qfb.removeMessages(0);
    if (at.is2G(this.qet.getContext()))
    {
      this.qfb.sendEmptyMessageDelayed(0, 8000L);
      label335: this.qeu += paramArrayOfByte2.length;
      ab.d("MicroMsg.scanner.ScanModeOCR", "totalNetworkFlow[%s], hasTakePicNum[%s], maxDoSceneCount[%s]", new Object[] { Integer.valueOf(this.qeu), Integer.valueOf(this.qeW), Integer.valueOf(this.qeK) });
      if ((System.currentTimeMillis() - this.qeL <= 1840L) || (((j)this.qen).qin != true))
        break label496;
      this.qeL = System.currentTimeMillis();
      this.qet.jL(0L);
    }
    while (true)
    {
      ab.v("MicroMsg.scanner.ScanModeOCR", "onDecodeFinished:" + this.qeJ + "," + this.qeW);
      AppMethodBeat.o(81194);
      break;
      this.qfb.sendEmptyMessageDelayed(0, 5000L);
      break label335;
      label496: this.qet.jK(40L);
    }
  }

  protected final void cgN()
  {
    AppMethodBeat.i(81192);
    if (this.qet == null)
    {
      ab.w("MicroMsg.scanner.ScanModeOCR", "scanUICallback == null");
      AppMethodBeat.o(81192);
    }
    while (true)
    {
      return;
      chv();
      AppMethodBeat.o(81192);
    }
  }

  protected final com.tencent.mm.plugin.scanner.util.b cgO()
  {
    AppMethodBeat.i(81191);
    int i;
    if (this.qen == null)
    {
      i = 50;
      if (q.etc.erl > 0)
      {
        i = q.etc.erl;
        ab.d("MicroMsg.scanner.ScanModeOCR", "ImageQuality=[%s]", new Object[] { Integer.valueOf(q.etc.erl) });
      }
      if (!at.is2G(this.qet.getContext()))
        break label110;
    }
    label110: for (this.qen = new j(this, i - 10, true, this.qet.chh()); ; this.qen = new j(this, i, true, this.qet.chh()))
    {
      com.tencent.mm.plugin.scanner.util.b localb = this.qen;
      AppMethodBeat.o(81191);
      return localb;
    }
  }

  protected final int cgP()
  {
    return 2130970548;
  }

  protected final int cgQ()
  {
    return 0;
  }

  protected final void cgR()
  {
    AppMethodBeat.i(81188);
    j(new Rect(0, 0, 0, 0));
    this.qet.b(4, null);
    this.qet.jL(0L);
    onResume();
    AppMethodBeat.o(81188);
  }

  protected final boolean cgS()
  {
    return true;
  }

  protected final boolean cgT()
  {
    return false;
  }

  protected final void j(Rect paramRect)
  {
    AppMethodBeat.i(81187);
    this.iqU = ((TextView)this.qet.findViewById(2131827209));
    this.qeY = ((TextView)this.qet.findViewById(2131827213));
    this.qeX = ((TextView)this.qet.findViewById(2131827212));
    this.iqU = ((TextView)this.qet.findViewById(2131827209));
    if (paramRect.bottom > 0)
    {
      RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.iqU.getLayoutParams();
      localLayoutParams.topMargin = (paramRect.bottom + 0 + BackwardSupportUtil.b.b(this.qet.getContext(), 13.0F));
      this.iqU.setLayoutParams(localLayoutParams);
      localLayoutParams = (RelativeLayout.LayoutParams)this.qeX.getLayoutParams();
      localLayoutParams.topMargin = (paramRect.bottom + 0 + BackwardSupportUtil.b.b(this.qet.getContext(), 13.0F));
      this.qeX.setLayoutParams(localLayoutParams);
      this.qeX.setVisibility(4);
    }
    if (d.Lt())
    {
      this.iqU.setPadding(BackwardSupportUtil.b.b(this.qet.getContext(), 54.0F), this.iqU.getPaddingTop(), BackwardSupportUtil.b.b(this.qet.getContext(), 54.0F), this.iqU.getPaddingBottom());
      this.qeX.setPadding(BackwardSupportUtil.b.b(this.qet.getContext(), 54.0F), this.qeX.getPaddingTop(), BackwardSupportUtil.b.b(this.qet.getContext(), 54.0F), this.qeX.getPaddingBottom());
    }
    if (this.qen != null)
      ((j)this.qen).ovx = this.qet.chh();
    chv();
    kl(true);
    AppMethodBeat.o(81187);
  }

  public final void jJ(long paramLong)
  {
    AppMethodBeat.i(81195);
    ab.d("MicroMsg.scanner.ScanModeOCR", "decodeFail");
    if (this.qet == null)
    {
      ab.w("MicroMsg.scanner.ScanModeOCR", "scanUICallback == null");
      AppMethodBeat.o(81195);
    }
    while (true)
    {
      return;
      if ((System.currentTimeMillis() - this.qeL > 1840L) && (((j)this.qen).qin == true))
      {
        this.qeL = System.currentTimeMillis();
        this.qet.jL(0L);
        AppMethodBeat.o(81195);
      }
      else
      {
        this.qet.jK(40L);
        AppMethodBeat.o(81195);
      }
    }
  }

  protected final void kn(boolean paramBoolean)
  {
    AppMethodBeat.i(81190);
    super.kn(paramBoolean);
    if (this.qen != null)
      ((j)this.qen).ovx = paramBoolean;
    AppMethodBeat.o(81190);
  }

  protected final void onDestroy()
  {
  }

  protected final void onPause()
  {
    AppMethodBeat.i(81199);
    kl(false);
    g.Rg().b(392, this);
    AppMethodBeat.o(81199);
  }

  protected final void onResume()
  {
    AppMethodBeat.i(81198);
    g.Rg().a(392, this);
    if (this.qet == null)
    {
      ab.w("MicroMsg.scanner.ScanModeOCR", "scanUICallback == null");
      AppMethodBeat.o(81198);
    }
    while (true)
    {
      return;
      chv();
      AppMethodBeat.o(81198);
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(81196);
    this.qfb.removeMessages(0);
    switch (paramm.getType())
    {
    default:
    case 392:
    }
    while (true)
    {
      AppMethodBeat.o(81196);
      while (true)
      {
        return;
        this.qeJ -= 1;
        if ((paramInt1 != 0) || (paramInt2 != 0))
        {
          ab.e("MicroMsg.scanner.ScanModeOCR", "onSceneEnd() errType = [%s], errCode = [%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
          this.qeL -= 300L;
          fR(null, null);
          AppMethodBeat.o(81196);
        }
        else
        {
          ab.d("MicroMsg.scanner.ScanModeOCR", "onSceneEnd() errType = [%s], errCode = [%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
          paramString = (com.tencent.mm.plugin.scanner.a.f)paramm;
          if ((paramString.ehh != null) && (paramString.ehh.fsH.fsP != null));
          for (paramString = (beo)paramString.ehh.fsH.fsP; ; paramString = null)
          {
            if (paramString != null)
              break label212;
            ab.e("MicroMsg.scanner.ScanModeOCR", "onSceneEnd(), getResp() == null");
            fR(null, null);
            AppMethodBeat.o(81196);
            break;
          }
          label212: ab.d("MicroMsg.scanner.ScanModeOCR", "onSceneEnd() clientScanID = %s, imageType = %s, source = %s, translate = %s", new Object[] { Integer.valueOf(paramString.vOn), Integer.valueOf(paramString.vOr), paramString.wIF, paramString.wIG });
          if (!bo.isNullOrNil(paramString.wIG))
            break;
          AppMethodBeat.o(81196);
        }
      }
      fR(paramString.wIF, paramString.wIG);
      if (this.qeV != null)
        g.Rg().c(this.qeV);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.o
 * JD-Core Version:    0.6.2
 */