package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView;
import com.tencent.mm.plugin.fts.ui.widget.FTSMainUIEducationLayout;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.d.a;
import com.tencent.mm.ui.fts.widget.FTSMainUIHotWordLayout;
import com.tencent.mm.ui.fts.widget.SOSEditTextView;

final class FTSSOSHomeWebViewUI$b extends com.tencent.mm.sdk.d.d
{
  com.tencent.mm.sdk.d.c uBP;
  com.tencent.mm.sdk.d.c uBQ;
  com.tencent.mm.sdk.d.c uBR;
  com.tencent.mm.sdk.d.c uBS;

  protected FTSSOSHomeWebViewUI$b(FTSSOSHomeWebViewUI paramFTSSOSHomeWebViewUI, String paramString, Looper paramLooper)
  {
    super(paramString, paramLooper);
    AppMethodBeat.i(8471);
    this.uBP = new a((byte)0);
    this.uBQ = new FTSSOSHomeWebViewUI.b.d(this, (byte)0);
    this.uBR = new FTSSOSHomeWebViewUI.b.b(this, (byte)0);
    this.uBS = new c((byte)0);
    a(this.uBP);
    a(this.uBQ);
    a(this.uBR);
    a(this.uBS);
    b(this.uBP);
    AppMethodBeat.o(8471);
  }

  public final boolean dbC()
  {
    AppMethodBeat.i(8473);
    a locala = dpQ();
    boolean bool;
    if ((locala == this.uBQ) || (locala == this.uBR) || (locala == this.uBS))
    {
      bool = true;
      AppMethodBeat.o(8473);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(8473);
    }
  }

  public final void dbM()
  {
    AppMethodBeat.i(8472);
    this.uBG.uAs.setSearchBarCancelTextContainerVisibile(0);
    b(this.uBP);
    AppMethodBeat.o(8472);
  }

  final class a extends com.tencent.mm.sdk.d.b
  {
    private a()
    {
    }

    public final void enter()
    {
      AppMethodBeat.i(8459);
      super.enter();
      FTSSOSHomeWebViewUI.F(FTSSOSHomeWebViewUI.b.this.uBG);
      AppMethodBeat.o(8459);
    }

    public final void exit()
    {
      AppMethodBeat.i(8460);
      super.exit();
      FTSSOSHomeWebViewUI.G(FTSSOSHomeWebViewUI.b.this.uBG).setBackgroundColor(FTSSOSHomeWebViewUI.b.this.uBG.getResources().getColor(2131690597));
      AppMethodBeat.o(8460);
    }

    public final String getName()
    {
      return "InitSate";
    }

    public final boolean k(Message paramMessage)
    {
      AppMethodBeat.i(8461);
      switch (paramMessage.what)
      {
      case 2:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      default:
      case 15:
      case 0:
      case 13:
      case 14:
      case 1:
      case 3:
      case 4:
      case 5:
      }
      while (true)
      {
        boolean bool = super.k(paramMessage);
        AppMethodBeat.o(8461);
        return bool;
        if ((FTSSOSHomeWebViewUI.c(FTSSOSHomeWebViewUI.b.this.uBG) != null) && (FTSSOSHomeWebViewUI.c(FTSSOSHomeWebViewUI.b.this.uBG).getVisibility() == 0))
        {
          MotionEvent localMotionEvent = (MotionEvent)paramMessage.obj;
          FTSSOSHomeWebViewUI.c(FTSSOSHomeWebViewUI.b.this.uBG).H(localMotionEvent);
          continue;
          if (FTSSOSHomeWebViewUI.b.this.uBG.getTotalQuery().length() > 0)
          {
            FTSSOSHomeWebViewUI.b.this.uBG.dby().bBq();
            FTSSOSHomeWebViewUI.b.this.uBG.dby().bBs();
            FTSSOSHomeWebViewUI.b.this.uBG.dby().mLL.clearFocus();
            FTSSOSHomeWebViewUI.d(FTSSOSHomeWebViewUI.b.this.uBG, 0);
            FTSSOSHomeWebViewUI.H(FTSSOSHomeWebViewUI.b.this.uBG).b(a.b.uCI);
            FTSSOSHomeWebViewUI.a(FTSSOSHomeWebViewUI.b.this.uBG, a.b.uCI);
            FTSSOSHomeWebViewUI.b.this.uBG.uAr.setBackgroundResource(2131690691);
            FTSSOSHomeWebViewUI.z(FTSSOSHomeWebViewUI.b.this.uBG).clear();
            continue;
            FTSSOSHomeWebViewUI.b.this.uBG.dby().bBs();
            FTSSOSHomeWebViewUI.b.this.uBG.dby().mLL.clearFocus();
            FTSSOSHomeWebViewUI.d(FTSSOSHomeWebViewUI.b.this.uBG, 0);
            FTSSOSHomeWebViewUI.H(FTSSOSHomeWebViewUI.b.this.uBG).a(a.b.uCI, false);
            FTSSOSHomeWebViewUI.a(FTSSOSHomeWebViewUI.b.this.uBG, a.b.uCI);
            FTSSOSHomeWebViewUI.b.this.uBG.uAr.setBackgroundResource(2131690691);
            FTSSOSHomeWebViewUI.z(FTSSOSHomeWebViewUI.b.this.uBG).clear();
            FTSSOSHomeWebViewUI.b.this.b(FTSSOSHomeWebViewUI.b.this.uBR);
            FTSSOSHomeWebViewUI.b.this.uBG.uAx = true;
            continue;
            FTSSOSHomeWebViewUI.b.this.uBG.dby().bBq();
            FTSSOSHomeWebViewUI.b.this.uBG.dby().bBs();
            FTSSOSHomeWebViewUI.I(FTSSOSHomeWebViewUI.b.this.uBG).b(a.b.uCI);
            FTSSOSHomeWebViewUI.a(FTSSOSHomeWebViewUI.b.this.uBG, a.b.uCI);
            FTSSOSHomeWebViewUI.b.this.uBG.uAr.setBackgroundResource(2131690691);
            FTSSOSHomeWebViewUI.z(FTSSOSHomeWebViewUI.b.this.uBG).clear();
            FTSSOSHomeWebViewUI.J(FTSSOSHomeWebViewUI.b.this.uBG);
            continue;
            FTSSOSHomeWebViewUI.b.this.uBG.uAx = true;
            FTSSOSHomeWebViewUI.b.this.b(FTSSOSHomeWebViewUI.b.this.uBQ);
            continue;
            FTSSOSHomeWebViewUI.b.this.uBG.uAx = true;
            FTSSOSHomeWebViewUI.b.this.b(FTSSOSHomeWebViewUI.b.this.uBR);
            continue;
            if ((FTSSOSHomeWebViewUI.b.this.uBG.dby().getEditText().hasFocus()) && (FTSSOSHomeWebViewUI.b.this.uBG.getTotalQuery().length() > 0))
              FTSSOSHomeWebViewUI.A(FTSSOSHomeWebViewUI.b.this.uBG);
            if ((FTSSOSHomeWebViewUI.b.this.uBG.dby().getEditText().hasFocus()) && (FTSSOSHomeWebViewUI.b.this.uBG.getTotalQuery().length() == 0))
            {
              FTSSOSHomeWebViewUI.b.this.uBG.dby().bBs();
              FTSSOSHomeWebViewUI.b.this.uBG.dby().bBq();
              FTSSOSHomeWebViewUI.b.this.uBG.uAr.setBackgroundResource(2131690691);
              FTSSOSHomeWebViewUI.b.this.uBG.uAs.setSearchBarCancelTextContainerVisibile(8);
              FTSSOSHomeWebViewUI.z(FTSSOSHomeWebViewUI.b.this.uBG).clear();
              FTSSOSHomeWebViewUI.I(FTSSOSHomeWebViewUI.b.this.uBG).b(a.b.uCI);
              FTSSOSHomeWebViewUI.a(FTSSOSHomeWebViewUI.b.this.uBG, a.b.uCI);
              FTSSOSHomeWebViewUI.b.this.uBG.ab(new FTSSOSHomeWebViewUI.b.a.1(this));
              h.pYm.e(15521, new Object[] { Integer.valueOf(FTSSOSHomeWebViewUI.b.this.uBG.scene), Integer.valueOf(3), FTSSOSHomeWebViewUI.b.this.uBG.dby().getInEditTextQuery(), Long.valueOf(System.currentTimeMillis()), Integer.valueOf(FTSSOSHomeWebViewUI.b.this.uBG.uAO) });
            }
          }
        }
      }
    }
  }

  final class c extends com.tencent.mm.sdk.d.b
  {
    private c()
    {
    }

    public final void enter()
    {
      AppMethodBeat.i(8465);
      super.enter();
      FTSSOSHomeWebViewUI.b.this.uBG.uAr.setPadding(FTSSOSHomeWebViewUI.L(FTSSOSHomeWebViewUI.b.this.uBG), 0, 0, 0);
      FTSSOSHomeWebViewUI.b.this.uBG.dby().bBs();
      FTSSOSHomeWebViewUI.b.this.uBG.oOO.setVisibility(0);
      FTSSOSHomeWebViewUI.b.this.uBG.dby().bBq();
      FTSSOSHomeWebViewUI.b(FTSSOSHomeWebViewUI.b.this.uBG).setVisibility(0);
      FTSSOSHomeWebViewUI.c(FTSSOSHomeWebViewUI.b.this.uBG).setVisibility(8);
      FTSSOSHomeWebViewUI.s(FTSSOSHomeWebViewUI.b.this.uBG).setVisibility(8);
      FTSSOSHomeWebViewUI.T(FTSSOSHomeWebViewUI.b.this.uBG).setVisibility(8);
      FTSSOSHomeWebViewUI.N(FTSSOSHomeWebViewUI.b.this.uBG).setVisibility(0);
      FTSSOSHomeWebViewUI.b.this.uBG.uAs.setSearchBarCancelTextContainerVisibile(0);
      FTSSOSHomeWebViewUI.b.this.uBG.uAs.setVoiceImageButtonVisibile(0);
      AppMethodBeat.o(8465);
    }

    public final void exit()
    {
      AppMethodBeat.i(8466);
      super.exit();
      FTSSOSHomeWebViewUI.b.this.uBG.aqX();
      AppMethodBeat.o(8466);
    }

    public final String getName()
    {
      return "SearchWithFocusNoResultState";
    }

    public final boolean k(Message paramMessage)
    {
      AppMethodBeat.i(8467);
      switch (paramMessage.what)
      {
      case 1:
      case 3:
      case 4:
      case 6:
      case 7:
      case 8:
      default:
      case 5:
      case 10:
      case 0:
      case 2:
      case 9:
      }
      while (true)
      {
        boolean bool = super.k(paramMessage);
        AppMethodBeat.o(8467);
        return bool;
        if (FTSSOSHomeWebViewUI.b.this.uBG.dby().getEditText().hasFocus())
        {
          FTSSOSHomeWebViewUI.b.this.b(FTSSOSHomeWebViewUI.b.this.uBQ);
          h.pYm.e(15521, new Object[] { Integer.valueOf(FTSSOSHomeWebViewUI.b.this.uBG.scene), Integer.valueOf(2), FTSSOSHomeWebViewUI.b.this.uBG.dby().getInEditTextQuery(), Long.valueOf(System.currentTimeMillis()), Integer.valueOf(FTSSOSHomeWebViewUI.b.this.uBG.uAO) });
          continue;
          if (FTSSOSHomeWebViewUI.b.this.uBG.getTotalQuery().length() > 0)
          {
            FTSSOSHomeWebViewUI.b.this.b(FTSSOSHomeWebViewUI.b.this.uBR);
            continue;
            if (FTSSOSHomeWebViewUI.b.this.uBG.getTotalQuery().length() > 0)
            {
              FTSSOSHomeWebViewUI.b.this.uBG.dby().bBs();
              FTSSOSHomeWebViewUI.b.this.uBG.dby().mLL.clearFocus();
              FTSSOSHomeWebViewUI.z(FTSSOSHomeWebViewUI.b.this.uBG).clear();
              FTSSOSHomeWebViewUI.b.this.b(FTSSOSHomeWebViewUI.b.this.uBR);
              continue;
              if (!FTSSOSHomeWebViewUI.b.this.uBG.uBp)
              {
                FTSSOSHomeWebViewUI.S(FTSSOSHomeWebViewUI.b.this.uBG);
                FTSSOSHomeWebViewUI.T(FTSSOSHomeWebViewUI.b.this.uBG).setVisibility(8);
                FTSSOSHomeWebViewUI.d(FTSSOSHomeWebViewUI.b.this.uBG, 0);
                FTSSOSHomeWebViewUI.U(FTSSOSHomeWebViewUI.b.this.uBG).b(a.b.uCH);
                FTSSOSHomeWebViewUI.a(FTSSOSHomeWebViewUI.b.this.uBG, a.b.uCH);
              }
              else
              {
                FTSSOSHomeWebViewUI.b.this.uBG.finish();
                continue;
                FTSSOSHomeWebViewUI.b.this.b(FTSSOSHomeWebViewUI.b.this.uBP);
              }
            }
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.b
 * JD-Core Version:    0.6.2
 */