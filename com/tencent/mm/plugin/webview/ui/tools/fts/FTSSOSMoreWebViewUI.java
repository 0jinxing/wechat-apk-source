package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.sdk.h.b;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.fts.widget.SOSEditTextView;
import com.tencent.mm.ui.q;

public class FTSSOSMoreWebViewUI extends BaseSOSWebViewUI
{
  private View uBW;
  private int uBl;

  public final void aMh()
  {
    AppMethodBeat.i(8525);
    super.aMh();
    this.uBW = findViewById(2131823600);
    dby().dJf();
    dby().bBs();
    this.oOO.setVisibility(0);
    dby().bBq();
    this.uBl = com.tencent.mm.bz.a.fromDPToPix(this, 48);
    dby().setIconRes(com.tencent.mm.bd.a.b(getType(), this));
    if (bFf() == 24)
      this.uBW.setVisibility(4);
    findViewById(2131820987).setOnTouchListener(new FTSSOSMoreWebViewUI.1(this));
    if ((getIntent() != null) && (getIntent().getBooleanExtra("ftsneedkeyboard", false)))
      this.mController.contentView.postDelayed(new FTSSOSMoreWebViewUI.2(this), 128L);
    at(getResources().getColor(2131690691), true);
    ImageButton localImageButton = dby().getClearBtn();
    if (localImageButton != null)
      localImageButton.getDrawable().setColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
    AppMethodBeat.o(8525);
  }

  public final int aMi()
  {
    AppMethodBeat.i(8526);
    int i;
    if ((d.iW(23)) && (!b.Mt()))
    {
      i = getResources().getColor(2131690691);
      AppMethodBeat.o(8526);
    }
    while (true)
    {
      return i;
      i = super.aMi();
      AppMethodBeat.o(8526);
    }
  }

  public boolean aMo()
  {
    AppMethodBeat.i(8528);
    dby().bBs();
    this.uBW.setVisibility(0);
    boolean bool = super.aMo();
    AppMethodBeat.o(8528);
    return bool;
  }

  protected final void dbu()
  {
    AppMethodBeat.i(8529);
    finish();
    AppMethodBeat.o(8529);
  }

  protected final void dbv()
  {
    AppMethodBeat.i(8531);
    super.dbv();
    this.uBW.setVisibility(0);
    AppMethodBeat.o(8531);
  }

  protected String getHint()
  {
    AppMethodBeat.i(8530);
    int i = -1;
    String str;
    if ((getType() == 8) && (this.uAK))
    {
      i = 2131300121;
      if (i >= 0)
        break label225;
      str = ah.getContext().getResources().getString(2131297040) + JA(getType());
      AppMethodBeat.o(8530);
    }
    while (true)
    {
      return str;
      switch (getType())
      {
      default:
        break;
      case 1:
        i = 2131302837;
        break;
      case 8:
        i = 2131300120;
        break;
      case 2:
        i = 2131302836;
        break;
      case 16:
        i = 2131300118;
        break;
      case 64:
        i = 2131296613;
        break;
      case 256:
      case 384:
        i = 2131300107;
        break;
      case 128:
        i = 2131300108;
        break;
      case 512:
        i = 2131300116;
        break;
      case 1024:
        i = 2131300117;
        break;
        label225: str = ah.getContext().getResources().getString(2131302835, new Object[] { ah.getContext().getResources().getString(i) });
        AppMethodBeat.o(8530);
      }
    }
  }

  public final int getLayoutId()
  {
    return 2130970838;
  }

  public final void hz(boolean paramBoolean)
  {
    AppMethodBeat.i(8527);
    super.hz(paramBoolean);
    if (!paramBoolean)
    {
      this.uAr.setPadding(this.uBl, 0, this.uAr.getPaddingRight(), 0);
      this.oOO.setVisibility(0);
      dby().bBq();
    }
    dby().bBs();
    AppMethodBeat.o(8527);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSMoreWebViewUI
 * JD-Core Version:    0.6.2
 */