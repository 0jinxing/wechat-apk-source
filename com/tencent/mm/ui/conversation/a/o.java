package com.tencent.mm.ui.conversation.a;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.kr;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.r;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.pluginsdk.ui.b.b;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.ui.ah;
import java.lang.ref.WeakReference;

public final class o extends b
{
  private ProgressDialog ehJ;
  private boolean fIa;
  private TextView gDQ;
  TextView gnB;
  private TextView gnC;
  private ImageView iqT;
  View jAp;
  int sIN;
  private TextView zwQ;
  private TextView zwR;
  private ImageView zwS;
  private ImageView zwT;
  private ImageView zwU;
  private ProgressBar zwV;
  String zwW;
  private boolean zwX;
  int zwY;
  boolean zwZ;
  boolean zxa;
  boolean zxb;
  String zxc;
  ap zxd;
  c<kr> zxe;
  boolean zxf;

  public o(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(34719);
    this.ehJ = null;
    this.fIa = false;
    this.zwX = false;
    this.sIN = 0;
    this.jAp = null;
    this.zxf = false;
    initialize();
    AppMethodBeat.o(34719);
  }

  private void initialize()
  {
    AppMethodBeat.i(34720);
    if ((!this.zwX) && (this.view != null))
    {
      this.jAp = this.view.findViewById(2131826313);
      this.gnB = ((TextView)this.view.findViewById(2131826314));
      this.gnC = ((TextView)this.view.findViewById(2131826315));
      this.gDQ = ((TextView)this.view.findViewById(2131826316));
      this.zwQ = ((TextView)this.view.findViewById(2131824112));
      this.zwV = ((ProgressBar)this.view.findViewById(2131826317));
      this.iqT = ((ImageView)this.view.findViewById(2131824111));
      this.zwS = ((ImageView)this.view.findViewById(2131822694));
      this.zwT = ((ImageView)this.view.findViewById(2131826320));
      this.zwU = ((ImageView)this.view.findViewById(2131826319));
      this.zwR = ((TextView)this.view.findViewById(2131826318));
      this.zwS.setVisibility(8);
      this.zwX = true;
    }
    AppMethodBeat.o(34720);
  }

  private static boolean k(Object paramObject, int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(34723);
    if (paramObject == null)
      AppMethodBeat.o(34723);
    while (true)
    {
      return bool;
      if (((Integer)paramObject).intValue() != paramInt)
      {
        AppMethodBeat.o(34723);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(34723);
      }
    }
  }

  public final boolean aMN()
  {
    boolean bool1 = true;
    int i = 0;
    AppMethodBeat.i(34722);
    final int j = aw.Rg().acS();
    Object localObject = aw.Rg().getNetworkServerIp();
    this.zwW = String.format("http://w.mail.qq.com/cgi-bin/report_mm?failuretype=1&devicetype=2&clientversion=%s&os=%s&username=%s&iport=%s&t=weixin_bulletin&f=xhtml&lang=%s", new Object[] { "0x" + Integer.toHexString(d.vxo), d.eSg, r.Yz(), localObject, aa.dor() });
    initialize();
    ab.i("MicroMsg.NetWarnView", "update st:%d", new Object[] { Integer.valueOf(j) });
    boolean bool2;
    boolean bool3;
    switch (j)
    {
    case 1:
    case 4:
    default:
      bool2 = false;
      ((Context)this.vlu.get()).getResources().getColor(2131690581);
      if (bool2)
      {
        this.gDQ.setVisibility(8);
        this.gnB.setVisibility(0);
        this.jAp.setBackgroundResource(2130840455);
        localObject = new LinearLayout.LayoutParams(this.iqT.getLayoutParams());
        ((LinearLayout.LayoutParams)localObject).setMargins(com.tencent.mm.bz.a.fromDPToPix((Context)this.vlu.get(), 28), 0, com.tencent.mm.bz.a.fromDPToPix((Context)this.vlu.get(), 24), 0);
        this.iqT.setLayoutParams((ViewGroup.LayoutParams)localObject);
        if (k(this.iqT.getTag(), 2131231415))
        {
          this.iqT.setTag(Integer.valueOf(2131231415));
          this.iqT.setImageDrawable(ah.f((Context)this.vlu.get(), 2131231415, ((Context)this.vlu.get()).getResources().getColor(2131689602)));
        }
        this.zwT.setVisibility(8);
        this.zwU.setVisibility(8);
        this.zwR.setVisibility(8);
      }
      bool3 = bool2;
      if (!bool2)
      {
        this.zwS.setVisibility(8);
        bool3 = bool2;
        if (ae.ghT)
        {
          j = at.getBackgroundLimitType((Context)this.vlu.get());
          if ((!at.isLimited(j)) || (this.zxf))
            break;
          this.gnB.setText(((Context)this.vlu.get()).getString(2131302030));
          this.gnC.setText(((Context)this.vlu.get()).getString(2131302029));
          this.gnC.setVisibility(0);
          this.zwQ.setVisibility(8);
          this.zwV.setVisibility(8);
          this.iqT.setVisibility(0);
          this.zwS.setVisibility(0);
          this.jAp.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              AppMethodBeat.i(34715);
              try
              {
                at.startSettingItent((Context)o.this.vlu.get(), j);
                AppMethodBeat.o(34715);
                return;
              }
              catch (Exception paramAnonymousView)
              {
                while (true)
                {
                  ab.printErrStackTrace("MicroMsg.NetWarnView", paramAnonymousView, "", new Object[0]);
                  AppMethodBeat.o(34715);
                }
              }
            }
          });
          this.zwS.setOnClickListener(new o.7(this, j));
          bool2 = bool1;
          label542: bool3 = bool2;
        }
      }
      if (k(this.zwU.getTag(), 2131231067))
      {
        this.zwU.setTag(Integer.valueOf(2131231067));
        this.zwU.setImageResource(2131231067);
      }
      if (k(this.zwS.getTag(), 2131231067))
      {
        this.zwS.setTag(Integer.valueOf(2131231067));
        this.zwS.setImageResource(2130837971);
      }
      localObject = this.jAp;
      if (!bool3);
      break;
    case 0:
    case 3:
    case 2:
    case 5:
    }
    while (true)
    {
      ((View)localObject).setVisibility(i);
      AppMethodBeat.o(34722);
      return bool3;
      this.gnB.setText(2131301654);
      this.gnC.setVisibility(8);
      this.zwQ.setVisibility(8);
      this.zwV.setVisibility(8);
      this.iqT.setVisibility(0);
      this.jAp.setOnClickListener(new o.3(this));
      bool2 = true;
      break;
      this.gnB.setText(2131301650);
      this.gnC.setVisibility(8);
      this.zwQ.setVisibility(8);
      this.zwV.setVisibility(0);
      this.iqT.setVisibility(0);
      bool2 = true;
      break;
      if (this.sIN == 1)
        this.gnB.setText(((Context)this.vlu.get()).getResources().getString(2131301653, new Object[] { Integer.valueOf(this.zwY) }));
      while (true)
      {
        this.gnC.setVisibility(8);
        this.zwQ.setVisibility(8);
        this.zwV.setVisibility(8);
        this.iqT.setVisibility(0);
        this.jAp.setOnClickListener(new o.4(this));
        bool2 = true;
        break;
        this.gnB.setText(2131301652);
      }
      this.gnB.setText(2131301655);
      this.gnC.setText(((Context)this.vlu.get()).getString(2131301656));
      this.gnC.setVisibility(0);
      this.zwQ.setVisibility(8);
      this.zwV.setVisibility(8);
      this.iqT.setVisibility(0);
      this.jAp.setOnClickListener(new o.5(this));
      bool2 = true;
      break;
      this.zwS.setVisibility(8);
      break label542;
      i = 8;
    }
  }

  final void dJb()
  {
    AppMethodBeat.i(34721);
    if (this.zxd != null)
    {
      this.zxd.stopTimer();
      this.zxd = null;
    }
    AppMethodBeat.o(34721);
  }

  public final void destroy()
  {
    AppMethodBeat.i(34724);
    dJb();
    if (this.zxe != null)
      com.tencent.mm.sdk.b.a.xxA.d(this.zxe);
    AppMethodBeat.o(34724);
  }

  public final int getLayoutId()
  {
    return 2130970293;
  }

  public final int getOrder()
  {
    return 4;
  }

  public final void setVisibility(int paramInt)
  {
    AppMethodBeat.i(34725);
    if (this.jAp != null)
      this.jAp.setVisibility(paramInt);
    AppMethodBeat.o(34725);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.a.o
 * JD-Core Version:    0.6.2
 */