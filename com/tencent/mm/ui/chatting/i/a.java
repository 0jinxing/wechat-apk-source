package com.tencent.mm.ui.chatting.i;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.support.v7.widget.RecyclerView.v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.o;
import com.tencent.mm.modelappbrand.i;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.chatting.a.c.b;
import com.tencent.mm.ui.chatting.a.c.e;
import com.tencent.mm.ui.chatting.e.b.b;
import com.tencent.mm.ui.tools.j;

public final class a extends b
{
  private int eot;
  com.tencent.mm.at.a.a.c yYR;

  public a(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(32516);
    this.eot = -1;
    paramContext = new com.tencent.mm.at.a.a.c.a();
    paramContext.ePT = 2131230834;
    paramContext.ct(com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 50), com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 50)).ePF = true;
    this.yYR = paramContext.ahG();
    AppMethodBeat.o(32516);
  }

  private static PackageInfo getPackageInfo(Context paramContext, String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(32523);
    if ((paramString == null) || (paramString.length() == 0))
    {
      paramString = null;
      if (paramString != null)
        break label58;
      AppMethodBeat.o(32523);
      paramContext = localObject;
    }
    while (true)
    {
      return paramContext;
      paramString = com.tencent.mm.pluginsdk.model.app.g.bT(paramString, true);
      if (paramString == null)
      {
        paramString = null;
        break;
      }
      paramString = paramString.field_packageName;
      break;
      try
      {
        label58: paramContext = paramContext.getPackageManager().getPackageInfo(paramString, 0);
        AppMethodBeat.o(32523);
      }
      catch (PackageManager.NameNotFoundException paramContext)
      {
        ab.printErrStackTrace("MicroMsg.AppBrandHistoryListPresenter", paramContext, "", new Object[0]);
        AppMethodBeat.o(32523);
        paramContext = localObject;
      }
    }
  }

  public final void a(com.tencent.mm.ui.chatting.a.c.a parama, int paramInt)
  {
    AppMethodBeat.i(32522);
    a.b localb = (a.b)parama;
    parama = (a.a)Oy(paramInt);
    if (bo.isNullOrNil(parama.desc))
    {
      localb.gnC.setVisibility(8);
      o.ahp().a(parama.imagePath, localb.iqT, this.yYR);
      AppMethodBeat.o(32522);
    }
    while (true)
    {
      return;
      localb.gnC.setVisibility(0);
      localb.gnC.setText(localb.gnB.getText());
      localb.gnB.setText(parama.desc);
      a.b.c(localb.gnC, this.yYZ.yNK);
      if (bo.isNullOrNil(parama.iQW))
        break;
      com.tencent.mm.modelappbrand.a.b.abR().a(new a.3(this, localb, parama), parama.iQW, null, ((i)com.tencent.mm.kernel.g.K(i.class)).cq(45, 45));
      AppMethodBeat.o(32522);
    }
  }

  public final String aoy()
  {
    AppMethodBeat.i(32518);
    String str = this.mContext.getString(2131302805);
    AppMethodBeat.o(32518);
    return str;
  }

  public final void dFH()
  {
    AppMethodBeat.i(32517);
    ab.i("MicroMsg.AppBrandHistoryListPresenter", "[loadData] isFirst:%s", new Object[] { Boolean.TRUE });
    this.yYY.dFL();
    com.tencent.mm.plugin.appbrand.r.c.reset();
    com.tencent.mm.plugin.appbrand.r.c.a(this.emo, new a.1(this));
    AppMethodBeat.o(32517);
  }

  public final c.e dFI()
  {
    AppMethodBeat.i(32520);
    c.e local2 = new c.e()
    {
      public final void a(View paramAnonymousView, int paramAnonymousInt, c.b paramAnonymousb)
      {
        AppMethodBeat.i(32509);
        ab.i("MicroMsg.AppBrandHistoryListPresenter", "[onItemClick] position:%s", new Object[] { Integer.valueOf(paramAnonymousInt) });
        a.a(a.this, (a.a)paramAnonymousb);
        AppMethodBeat.o(32509);
      }

      public final void b(View paramAnonymousView, int paramAnonymousInt, c.b paramAnonymousb)
      {
        AppMethodBeat.i(32510);
        ab.i("MicroMsg.AppBrandHistoryListPresenter", "[onItemLongClick] position:%s", new Object[] { Integer.valueOf(paramAnonymousInt) });
        new j(paramAnonymousView.getContext()).b(paramAnonymousView, new a.2.1(this), new a.2.2(this, paramAnonymousb));
        AppMethodBeat.o(32510);
      }
    };
    AppMethodBeat.o(32520);
    return local2;
  }

  public final String dFK()
  {
    AppMethodBeat.i(32519);
    String str = this.mContext.getString(2131302805);
    AppMethodBeat.o(32519);
    return str;
  }

  public final int getType()
  {
    return 33;
  }

  public final RecyclerView.v v(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(32521);
    paramViewGroup = new a.b(this, LayoutInflater.from(paramViewGroup.getContext()).inflate(2130968764, paramViewGroup, false));
    AppMethodBeat.o(32521);
    return paramViewGroup;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.i.a
 * JD-Core Version:    0.6.2
 */