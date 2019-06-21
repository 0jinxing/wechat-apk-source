package com.tencent.mm.ui.chatting.viewitems;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a.c;
import com.tencent.mm.model.v;
import com.tencent.mm.modelappbrand.k;
import com.tencent.mm.plugin.appbrand.r.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.l;
import java.lang.ref.WeakReference;

public final class s
{
  static final class c
    implements l
  {
    private WeakReference<com.tencent.mm.ui.chatting.d.a> zei;

    public final void dxA()
    {
      AppMethodBeat.i(33062);
      ((k)com.tencent.mm.kernel.g.K(k.class)).abC();
      AppMethodBeat.o(33062);
    }

    public final void dxB()
    {
      AppMethodBeat.i(33063);
      ((k)com.tencent.mm.kernel.g.K(k.class)).abD();
      AppMethodBeat.o(33063);
    }

    public final void dxC()
    {
      AppMethodBeat.i(33064);
      ab.i("MicroMsg.ChattingLifecycleChangedListener", "onChattingExitAnimStart, then detach DynamicPageView.");
      if (this.zei == null)
        AppMethodBeat.o(33064);
      while (true)
      {
        return;
        com.tencent.mm.ui.chatting.d.a locala = (com.tencent.mm.ui.chatting.d.a)this.zei.get();
        if (locala != null)
        {
          v.Zp().nV(s.e.bE(locala));
          ((com.tencent.mm.ui.chatting.c.b.g)locala.aF(com.tencent.mm.ui.chatting.c.b.g.class)).b(this);
          ((k)com.tencent.mm.kernel.g.K(k.class)).po(s.e.bE(locala));
        }
        AppMethodBeat.o(33064);
      }
    }

    public final void dxD()
    {
    }

    public final void dxx()
    {
    }

    public final void dxy()
    {
    }

    public final void dxz()
    {
    }

    final void k(com.tencent.mm.ui.chatting.d.a parama)
    {
      AppMethodBeat.i(33061);
      this.zei = new WeakReference(parama);
      ((com.tencent.mm.ui.chatting.c.b.g)parama.aF(com.tencent.mm.ui.chatting.c.b.g.class)).a(this);
      AppMethodBeat.o(33061);
    }
  }

  static final class d extends c.a
  {
    public static final int zej;
    public static final int zek;
    static c zel;
    protected ImageView zbO;
    protected ImageView zbR;
    protected ImageView zbS;
    protected TextView zbU;
    protected ChattingItemFooter zbV;
    protected ImageView zbW;
    protected LinearLayout zbX;
    protected ViewGroup zbY;
    protected TextView zbZ;
    protected LinearLayout zca;
    ImageView zci;
    protected TextView zcm;
    protected ImageView zcn;
    protected TextView zco;
    protected TextView zcp;
    protected LinearLayout zcq;
    protected ImageView zcr;
    protected ImageView zcs;
    protected TextView zct;
    protected TextView zet;
    protected TextView zeu;

    static
    {
      AppMethodBeat.i(33066);
      zej = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 240);
      zek = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 192);
      com.tencent.mm.at.a.a.c.a locala = new com.tencent.mm.at.a.a.c.a();
      locala.ePT = 2131230834;
      locala.ct(com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 20), com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 20)).ePF = true;
      zel = locala.ahG();
      AppMethodBeat.o(33066);
    }

    public final d C(View paramView, boolean paramBoolean)
    {
      AppMethodBeat.i(33065);
      super.eP(paramView);
      this.zbO = ((ImageView)paramView.findViewById(2131822557));
      this.zbR = ((ImageView)this.mRR.findViewById(2131822556));
      this.zbS = ((ImageView)this.mRR.findViewById(2131822555));
      this.zbU = ((TextView)paramView.findViewById(2131822454));
      this.zbW = ((ImageView)paramView.findViewById(2131822558));
      this.moo = ((CheckBox)paramView.findViewById(2131820580));
      this.iVh = paramView.findViewById(2131820586);
      this.qkY = ((TextView)paramView.findViewById(2131821102));
      this.zbV = ((ChattingItemFooter)paramView.findViewById(2131822554));
      this.zbX = ((LinearLayout)paramView.findViewById(2131822514));
      this.zbY = ((ViewGroup)paramView.findViewById(2131822511));
      this.zbZ = ((TextView)paramView.findViewById(2131822513));
      this.zca = ((LinearLayout)paramView.findViewById(2131821893));
      this.jPL = paramView.findViewById(2131822515);
      if (!paramBoolean)
      {
        this.zci = ((ImageView)this.mRR.findViewById(2131822661));
        this.pyf = ((ProgressBar)this.mRR.findViewById(2131822660));
      }
      this.zcq = ((LinearLayout)paramView.findViewById(2131822516));
      this.zcr = ((ImageView)paramView.findViewById(2131822522));
      this.zcs = ((ImageView)paramView.findViewById(2131822521));
      this.zct = ((TextView)paramView.findViewById(2131822519));
      this.zcm = ((TextView)paramView.findViewById(2131822520));
      this.zet = ((TextView)paramView.findViewById(2131822588));
      this.zcn = ((ImageView)paramView.findViewById(2131822517));
      this.zco = ((TextView)paramView.findViewById(2131822518));
      this.zcp = ((TextView)paramView.findViewById(2131822524));
      this.zeu = ((TextView)paramView.findViewById(2131822589));
      AppMethodBeat.o(33065);
      return this;
    }
  }

  static final class e
  {
    static String bE(Object paramObject)
    {
      AppMethodBeat.i(33067);
      paramObject = "WxaUpdatableMsg#" + n.bE(paramObject);
      AppMethodBeat.o(33067);
      return paramObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.s
 * JD-Core Version:    0.6.2
 */