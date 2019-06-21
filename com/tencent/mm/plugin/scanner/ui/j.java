package com.tencent.mm.plugin.scanner.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.pn;
import com.tencent.mm.g.b.a.bk;
import com.tencent.mm.plugin.scanner.util.b;
import com.tencent.mm.plugin.scanner.util.b.a;
import com.tencent.mm.plugin.scanner.util.g;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class j extends i
  implements b.a
{
  private long qaM;
  private long qbE;
  private HighlightRectSideView qeA;
  boolean qeB;
  private bk qeC;
  private View.OnClickListener qeD;

  public j(i.b paramb, Point paramPoint, DisplayMetrics paramDisplayMetrics, int paramInt)
  {
    super(paramb, paramPoint);
    AppMethodBeat.i(81159);
    this.qeB = false;
    this.qeC = new bk();
    this.qeD = new j.1(this);
    if (paramInt == 1)
    {
      paramPoint = new Point(paramDisplayMetrics.widthPixels, paramDisplayMetrics.heightPixels);
      paramInt = paramPoint.y - (int)(118.0F * paramDisplayMetrics.density);
      paramPoint = new Point((int)((int)(paramInt * 1.586F) / paramDisplayMetrics.density), (int)(paramInt / paramDisplayMetrics.density));
      paramb.getContext().setResult(0);
      this.qer = 0;
      this.qes = 64;
      fd(paramPoint.x, paramPoint.y);
      if (bo.gO(paramb.getContext()) >= 100L)
        break label218;
      ab.w("MicroMsg.ScanModeBankCard", "memory is not much");
    }
    label218: for (this.qaM = 280L; ; this.qaM = 80L)
    {
      paramb = this.qeC;
      paramb.cVR = 1L;
      paramb.ajK();
      this.qbE = System.currentTimeMillis();
      AppMethodBeat.o(81159);
      return;
      paramPoint = new Point(paramDisplayMetrics.heightPixels, paramDisplayMetrics.widthPixels);
      break;
    }
  }

  public final void K(Bundle paramBundle)
  {
  }

  public final void b(int paramInt1, String paramString, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(81164);
    ab.d("MicroMsg.ScanModeBankCard", "decode success, resultType:%d", new Object[] { Integer.valueOf(paramInt1) });
    if (3 != paramInt1)
    {
      ab.e("MicroMsg.ScanModeBankCard", "decode success, but result type error:".concat(String.valueOf(paramInt1)));
      AppMethodBeat.o(81164);
    }
    while (true)
    {
      return;
      paramArrayOfByte1 = this.qeC;
      paramArrayOfByte1.cVR = 2L;
      paramArrayOfByte1.dco = (System.currentTimeMillis() - this.qbE);
      paramArrayOfByte1.ajK();
      paramArrayOfByte1 = ((g)this.qen).chW();
      if (this.qeB)
      {
        this.qet.chj();
        ConfirmScanBankCardResultUI.c(paramArrayOfByte1, paramString);
        AppMethodBeat.o(81164);
      }
      else
      {
        paramArrayOfByte2 = new pn();
        paramArrayOfByte2.cLJ.cardId = paramString;
        paramArrayOfByte2.cLJ.cLK = paramArrayOfByte1;
        a.xxA.m(paramArrayOfByte2);
        this.qet.getContext().finish();
        AppMethodBeat.o(81164);
      }
    }
  }

  protected final void cgN()
  {
  }

  protected final b cgO()
  {
    AppMethodBeat.i(81161);
    if ((this.qen == null) && (this.qet != null))
      this.qen = new g(this, this.qet.chh(), this.qeB);
    b localb = this.qen;
    AppMethodBeat.o(81161);
    return localb;
  }

  protected final int cgP()
  {
    return 2130970538;
  }

  protected final int cgQ()
  {
    return 300;
  }

  protected final void cgR()
  {
  }

  protected final boolean cgS()
  {
    return false;
  }

  protected final boolean cgT()
  {
    return false;
  }

  protected final void j(Rect paramRect)
  {
    AppMethodBeat.i(81163);
    LinearLayout localLinearLayout = (LinearLayout)this.qet.findViewById(2131827186);
    TextView localTextView = (TextView)this.qet.findViewById(2131827187);
    this.qeA = ((HighlightRectSideView)this.qet.findViewById(2131827189));
    this.qeA.setMaskRect(paramRect);
    paramRect = this.qet.getContext().getIntent();
    if (paramRect != null)
    {
      paramRect = bo.bc(paramRect.getStringExtra("bank_card_owner"), "");
      localTextView.setText(String.format(this.qet.getContext().getResources().getString(2131302726), new Object[] { paramRect }));
    }
    while (true)
    {
      if (bo.isNullOrNil(paramRect))
      {
        localLinearLayout.setVisibility(8);
        AppMethodBeat.o(81163);
      }
      while (true)
      {
        return;
        localLinearLayout.setVisibility(0);
        ((ImageView)this.qet.findViewById(2131827188)).setOnClickListener(this.qeD);
        AppMethodBeat.o(81163);
      }
      paramRect = null;
    }
  }

  public final void jJ(long paramLong)
  {
    AppMethodBeat.i(81165);
    ab.d("MicroMsg.ScanModeBankCard", "onDecodeFailed");
    if (this.qet == null)
    {
      ab.e("MicroMsg.ScanModeBankCard", "ui callback is null");
      AppMethodBeat.o(81165);
    }
    while (true)
    {
      return;
      boolean[] arrayOfBoolean = ((g)this.qen).qhL;
      this.qeA.setShowRectEdges(arrayOfBoolean);
      this.qet.jK(this.qaM);
      AppMethodBeat.o(81165);
    }
  }

  protected final void kn(boolean paramBoolean)
  {
    AppMethodBeat.i(81162);
    super.kn(paramBoolean);
    if ((this.qen != null) && (this.qet != null))
    {
      g localg = (g)this.qen;
      paramBoolean = this.qet.chh();
      ab.d("MicroMsg.ScanBankCardDecoder", "need rotate:".concat(String.valueOf(paramBoolean)));
      localg.qhJ = paramBoolean;
    }
    AppMethodBeat.o(81162);
  }

  protected final void onDestroy()
  {
    AppMethodBeat.i(81160);
    bk localbk = this.qeC;
    localbk.cVR = 4L;
    localbk.ajK();
    AppMethodBeat.o(81160);
  }

  protected final void onPause()
  {
  }

  protected final void onResume()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.j
 * JD-Core Version:    0.6.2
 */