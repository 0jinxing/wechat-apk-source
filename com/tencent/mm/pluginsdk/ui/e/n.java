package com.tencent.mm.pluginsdk.ui.e;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.applet.m;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.base.a.a;
import java.lang.ref.WeakReference;

public class n extends ClickableSpan
  implements a
{
  private int eHE;
  private String hcl;
  boolean mEnable;
  private WeakReference<View> nq;
  public boolean ozq;
  private Context vsp;
  private int vsu;
  protected h vsv;
  private m vsw;

  public n()
  {
    this.ozq = false;
    this.vsv = null;
    this.vsw = null;
    this.mEnable = true;
    this.nq = null;
    this.vsp = null;
  }

  public n(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(79879);
    this.ozq = false;
    this.vsv = null;
    this.vsw = null;
    this.mEnable = true;
    this.nq = null;
    this.vsp = null;
    gP(paramInt1, paramInt2);
    this.vsv = new h();
    AppMethodBeat.o(79879);
  }

  public n(int paramInt, m paramm)
  {
    AppMethodBeat.i(79878);
    this.ozq = false;
    this.vsv = null;
    this.vsw = null;
    this.mEnable = true;
    this.nq = null;
    this.vsp = null;
    int i;
    int j;
    if (paramm != null)
    {
      i = paramm.linkColor;
      j = paramm.backgroundColor;
    }
    while (true)
    {
      if ((i == 0) && (j == 0))
        Hy(paramInt);
      while (true)
      {
        this.vsv = new h();
        this.vsw = paramm;
        AppMethodBeat.o(79878);
        return;
        gP(i, j);
      }
      j = 0;
      i = 0;
    }
  }

  protected void Hy(int paramInt)
  {
    AppMethodBeat.i(79880);
    Context localContext = ah.getContext();
    switch (paramInt)
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(79880);
      while (true)
      {
        return;
        gP(localContext.getResources().getColor(2131689872), localContext.getResources().getColor(2131689482));
        AppMethodBeat.o(79880);
        continue;
        gP(localContext.getResources().getColor(2131689776), localContext.getResources().getColor(2131690480));
        AppMethodBeat.o(79880);
      }
      gP(localContext.getResources().getColor(2131690489), localContext.getResources().getColor(2131690480));
    }
  }

  protected final void gP(int paramInt1, int paramInt2)
  {
    this.vsu = paramInt1;
    this.eHE = paramInt2;
  }

  public final int getType()
  {
    if (this.vsw == null);
    for (int i = 2147483647; ; i = this.vsw.type)
      return i;
  }

  public final void oT(boolean paramBoolean)
  {
    this.ozq = paramBoolean;
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(79881);
    h localh;
    if ((this.vsv != null) && (this.vsw != null) && (this.mEnable))
    {
      localh = this.vsv;
      if (this.vsp == null)
        break label74;
    }
    label74: for (Context localContext = this.vsp; ; localContext = paramView.getContext())
    {
      localh.mContext = localContext;
      this.vsv.a(paramView, this.vsw);
      this.vsv.mContext = null;
      AppMethodBeat.o(79881);
      return;
    }
  }

  public final void setContext(Context paramContext)
  {
    this.vsp = paramContext;
    this.vsv.mContext = paramContext;
  }

  public final void setSessionId(String paramString)
  {
    this.hcl = paramString;
    if (this.vsv != null)
      this.vsv.hcl = this.hcl;
  }

  public void updateDrawState(TextPaint paramTextPaint)
  {
    AppMethodBeat.i(79882);
    super.updateDrawState(paramTextPaint);
    paramTextPaint.setColor(this.vsu);
    paramTextPaint.setUnderlineText(false);
    paramTextPaint.linkColor = this.vsu;
    if (this.ozq)
    {
      paramTextPaint.bgColor = this.eHE;
      AppMethodBeat.o(79882);
    }
    while (true)
    {
      return;
      paramTextPaint.bgColor = 0;
      AppMethodBeat.o(79882);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.e.n
 * JD-Core Version:    0.6.2
 */