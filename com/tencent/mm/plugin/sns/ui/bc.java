package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aw.e;
import com.tencent.mm.g.a.kd;
import com.tencent.mm.g.a.kd.b;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.ui.base.p;

public final class bc
{
  Context context;
  int cvd;
  long iYa;
  public View.OnClickListener rDA;
  public View.OnClickListener rDB;
  public View.OnClickListener rDC;
  public View.OnClickListener rDD;
  public View.OnClickListener rDE;
  public View.OnClickListener rDF;
  bc.a rDr;
  public View.OnClickListener rDs;
  public View.OnClickListener rDt;
  public View.OnClickListener rDu;
  public View.OnClickListener rDv;
  public View.OnClickListener rDw;
  public View.OnClickListener rDx;
  public View.OnClickListener rDy;
  public View.OnClickListener rDz;
  ae rhQ;
  public View.OnClickListener rvD;
  p tipDialog;

  public bc(Context paramContext, bc.a parama, int paramInt, ae paramae)
  {
    AppMethodBeat.i(39879);
    this.cvd = 0;
    this.iYa = 0L;
    this.rvD = new bc.1(this);
    this.rDs = new bc.8(this);
    this.rDt = new bc.9(this);
    this.rDu = new bc.10(this);
    this.rDv = new bc.11(this);
    this.rDw = new bc.12(this);
    this.rDx = new bc.13(this);
    this.rDy = new bc.14(this);
    this.rDz = new bc.15(this);
    this.rDA = new bc.2(this);
    this.rDB = new bc.3(this);
    this.rDC = new bc.4(this);
    this.rDD = new bc.5(this);
    this.rDE = new bc.6(this);
    this.rDF = new bc.7(this);
    this.context = paramContext;
    this.rDr = parama;
    this.cvd = paramInt;
    this.rhQ = paramae;
    AppMethodBeat.o(39879);
  }

  protected static boolean Wi(String paramString)
  {
    AppMethodBeat.i(39880);
    Object localObject = new kd();
    ((kd)localObject).cFz.action = -2;
    com.tencent.mm.sdk.b.a.xxA.m((b)localObject);
    localObject = ((kd)localObject).cFA.cFB;
    boolean bool;
    if ((localObject != null) && (com.tencent.mm.aw.a.d((e)localObject)) && (paramString.equals(((e)localObject).fJU)) && (com.tencent.mm.aw.a.aie()))
    {
      bool = true;
      AppMethodBeat.o(39880);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(39880);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.bc
 * JD-Core Version:    0.6.2
 */