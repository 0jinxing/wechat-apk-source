package com.tencent.mm.plugin.appbrand.debugger;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.widget.a.c.a;
import java.util.LinkedList;

@SuppressLint({"ViewConstructor"})
public final class u extends FrameLayout
{
  private l hjR;
  ViewGroup hkC;
  RemoteDebugMoveView hkD;
  private LinkedList<String> hkE;
  TextView hkF;
  TextView hkG;
  TextView hkH;
  TextView hkI;
  TextView hkJ;
  TextView hkK;
  TextView hkL;
  ImageView hkM;
  ImageView hkN;
  View hkO;
  boolean hkP;
  private u.a hkQ;
  private c hkR;
  View.OnClickListener mOnClickListener;

  public u(Context paramContext, l paraml, u.a parama)
  {
    super(paramContext);
    AppMethodBeat.i(101925);
    this.hkE = new LinkedList();
    this.hkP = false;
    this.mOnClickListener = new u.3(this);
    this.hjR = paraml;
    this.hkQ = parama;
    setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    setBackgroundColor(getContext().getResources().getColor(2131690597));
    setId(2131820551);
    AppMethodBeat.o(101925);
  }

  private boolean azt()
  {
    AppMethodBeat.i(101929);
    boolean bool;
    if ((this.hjR.azb()) || (this.hjR.azc()) || (this.hjR.azd()))
    {
      bool = true;
      AppMethodBeat.o(101929);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(101929);
    }
  }

  public final void azs()
  {
    AppMethodBeat.i(101928);
    al.d(new u.2(this));
    AppMethodBeat.o(101928);
  }

  final void azu()
  {
    AppMethodBeat.i(101930);
    if ((this.hkR != null) && (this.hkR.isShowing()))
      AppMethodBeat.o(101930);
    while (true)
    {
      return;
      Context localContext = getContext();
      if (((localContext instanceof Activity)) && (((Activity)localContext).isFinishing()))
      {
        AppMethodBeat.o(101930);
      }
      else
      {
        this.hkR = new c.a(localContext).asD(localContext.getString(2131296812)).asE("").Qc(2131297764).a(new u.4(this)).Qd(2131297763).aMb();
        this.hkR.show();
        AppMethodBeat.o(101930);
      }
    }
  }

  public final void azv()
  {
    AppMethodBeat.i(101931);
    al.d(new u.5(this));
    AppMethodBeat.o(101931);
  }

  public final void azw()
  {
    AppMethodBeat.i(101933);
    azs();
    azv();
    AppMethodBeat.o(101933);
  }

  public final void bringToFront()
  {
    AppMethodBeat.i(101927);
    if (this.hkC == null)
    {
      ab.w("MicroMsg.RemoteDebugView", "bringToFront mContentView is null");
      AppMethodBeat.o(101927);
    }
    while (true)
    {
      return;
      this.hkC.bringChildToFront(this);
      AppMethodBeat.o(101927);
    }
  }

  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(101926);
    boolean bool;
    if (azt())
    {
      bool = true;
      AppMethodBeat.o(101926);
    }
    while (true)
    {
      return bool;
      bool = super.onTouchEvent(paramMotionEvent);
      AppMethodBeat.o(101926);
    }
  }

  public final void show()
  {
    AppMethodBeat.i(101932);
    if (this.hkP)
    {
      this.hkO.setVisibility(0);
      if (this.hkE.size() > 0)
      {
        this.hkL.setVisibility(0);
        this.hkJ.setVisibility(8);
      }
    }
    while (true)
    {
      invalidate();
      AppMethodBeat.o(101932);
      return;
      this.hkL.setVisibility(8);
      break;
      this.hkO.setVisibility(8);
      this.hkL.setVisibility(8);
      this.hkJ.setVisibility(0);
    }
  }

  public final void zQ(String paramString)
  {
    AppMethodBeat.i(101934);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(101934);
    while (true)
    {
      return;
      al.d(new u.9(this, paramString));
      AppMethodBeat.o(101934);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.debugger.u
 * JD-Core Version:    0.6.2
 */