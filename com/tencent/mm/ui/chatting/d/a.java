package com.tencent.mm.ui.chatting.d;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.view.View;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d.a;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.MMFragment;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.ae;
import com.tencent.mm.ui.chatting.af;
import com.tencent.mm.ui.chatting.c.v;
import com.tencent.mm.ui.chatting.g.b;

public final class a
{
  private static ak yTt;
  public boolean caA;
  public ad sRl;
  public String yTA;
  public String yTB;
  public com.tencent.mm.ui.chatting.g.a yTu;
  public b yTv;
  public String yTw;
  public BaseChattingUIFragment yTx;
  public ae yTy;
  public af yTz;

  static
  {
    AppMethodBeat.i(31947);
    yTt = new ak();
    AppMethodBeat.o(31947);
  }

  public a(BaseChattingUIFragment paramBaseChattingUIFragment, ae paramae, af paramaf)
  {
    AppMethodBeat.i(31911);
    this.yTu = new com.tencent.mm.ui.chatting.g.a(this);
    this.yTv = new b(this);
    this.caA = false;
    this.yTx = paramBaseChattingUIFragment;
    this.yTy = paramae;
    this.yTz = paramaf;
    AppMethodBeat.o(31911);
  }

  public static ak dFz()
  {
    return yTt;
  }

  public final void Na(int paramInt)
  {
    AppMethodBeat.i(31944);
    ab.i("MicroMsg.ChattingContext", "[updateOptionMenuIcon] menuID:%d iconID:%s", new Object[] { Integer.valueOf(2), Integer.valueOf(paramInt) });
    this.yTy.updateOptionMenuIcon(2, paramInt);
    AppMethodBeat.o(31944);
  }

  public final void Oq(int paramInt)
  {
    AppMethodBeat.i(31935);
    ab.i("MicroMsg.ChattingContext", "[setSelection] pos:%s isSmooth:%s", new Object[] { Integer.valueOf(paramInt), Boolean.FALSE });
    this.yTy.Oq(paramInt);
    AppMethodBeat.o(31935);
  }

  public final void Or(int paramInt)
  {
    AppMethodBeat.i(31925);
    this.yTy.Or(paramInt);
    AppMethodBeat.o(31925);
  }

  public final void a(Intent paramIntent, int paramInt, d.a parama)
  {
    AppMethodBeat.i(31923);
    this.yTv.a(paramIntent, paramInt, parama);
    AppMethodBeat.o(31923);
  }

  public final void a(Class<? extends v> paramClass, v paramv)
  {
    AppMethodBeat.i(31946);
    this.yTu.a(paramClass, paramv);
    AppMethodBeat.o(31946);
  }

  public final <T extends v, V extends Class<T>> T aF(V paramV)
  {
    AppMethodBeat.i(31945);
    paramV = this.yTu.aF(paramV);
    AppMethodBeat.o(31945);
    return paramV;
  }

  public final void aWv()
  {
    AppMethodBeat.i(31934);
    ab.i("MicroMsg.ChattingContext", "[notifyDataSetChange]");
    this.yTy.aWv();
    AppMethodBeat.o(31934);
  }

  public final void af(ad paramad)
  {
    AppMethodBeat.i(31913);
    this.sRl = paramad;
    this.yTA = com.tencent.xweb.util.d.x((paramad.field_username + System.currentTimeMillis()).getBytes());
    AppMethodBeat.o(31913);
  }

  public final void aqX()
  {
    AppMethodBeat.i(31932);
    ab.i("MicroMsg.ChattingContext", "[hideVKB]");
    this.yTy.hideVKB();
    AppMethodBeat.o(31932);
  }

  public final void bY(int paramInt)
  {
    AppMethodBeat.i(31940);
    ab.i("MicroMsg.ChattingContext", "[scrollToLast] position:%d", new Object[] { Integer.valueOf(paramInt) });
    this.yTy.bY(paramInt);
    AppMethodBeat.o(31940);
  }

  public final void c(Context paramContext, String paramString, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    AppMethodBeat.i(31930);
    ab.i("MicroMsg.ChattingContext", "[showDialog]");
    this.yTy.c(paramContext, paramString, paramOnCancelListener);
    AppMethodBeat.o(31930);
  }

  public final void dCy()
  {
    AppMethodBeat.i(31937);
    ab.i("MicroMsg.ChattingContext", "[smoothScrollBy] dis:%s duration:%s", new Object[] { Integer.valueOf(0), Integer.valueOf(0) });
    this.yTy.dCy();
    AppMethodBeat.o(31937);
  }

  public final String dDw()
  {
    AppMethodBeat.i(31915);
    String str = bo.bc(((com.tencent.mm.ui.chatting.c.b.d)aF(com.tencent.mm.ui.chatting.c.b.d.class)).dDw(), this.sRl.field_nickname);
    AppMethodBeat.o(31915);
    return str;
  }

  public final void dFA()
  {
    AppMethodBeat.i(31939);
    ab.i("MicroMsg.ChattingContext", "[scrollToLast] force:%b", new Object[] { Boolean.TRUE });
    this.yTy.aj(true, true);
    AppMethodBeat.o(31939);
  }

  public final String dFt()
  {
    if (this.yTB != null);
    for (String str = this.yTB; ; str = "")
      return str;
  }

  public final String dFu()
  {
    AppMethodBeat.i(31914);
    if (this.yTw == null)
    {
      this.yTw = r.Yz();
      if (!ad.mR(getTalkerUserName()))
        break label56;
    }
    label56: for (String str = ad.aoC(this.yTw); ; str = this.yTw)
    {
      this.yTw = str;
      str = this.yTw;
      AppMethodBeat.o(31914);
      return str;
    }
  }

  public final boolean dFv()
  {
    AppMethodBeat.i(31918);
    String str = getTalkerUserName();
    boolean bool;
    if ((ad.mR(str)) || (ad.aow(str)) || (ad.aou(str)) || (t.no(str)))
    {
      bool = true;
      AppMethodBeat.o(31918);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(31918);
    }
  }

  public final boolean dFw()
  {
    AppMethodBeat.i(31919);
    boolean bool;
    if ((t.kH(getTalkerUserName())) || (t.mP(getTalkerUserName())))
    {
      bool = true;
      AppMethodBeat.o(31919);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(31919);
    }
  }

  public final boolean dFx()
  {
    AppMethodBeat.i(31920);
    boolean bool;
    if ((t.kH(getTalkerUserName())) || (t.mP(getTalkerUserName())) || (((com.tencent.mm.ui.chatting.c.b.d)aF(com.tencent.mm.ui.chatting.c.b.d.class)).dDn()))
    {
      bool = true;
      AppMethodBeat.o(31920);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(31920);
    }
  }

  public final boolean dFy()
  {
    AppMethodBeat.i(31921);
    boolean bool;
    if ((!this.sRl.dsf()) && (!t.nF(getTalkerUserName())) && (!ad.aou(getTalkerUserName())))
    {
      AppMethodBeat.o(31921);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (((com.tencent.mm.ui.chatting.c.b.d)aF(com.tencent.mm.ui.chatting.c.b.d.class)).dDm())
      {
        AppMethodBeat.o(31921);
        bool = true;
      }
      else
      {
        bool = false;
        AppMethodBeat.o(31921);
      }
    }
  }

  public final void dismissDialog()
  {
    AppMethodBeat.i(31931);
    ab.i("MicroMsg.ChattingContext", "[dismissDialog]");
    this.yTy.dismissDialog();
    AppMethodBeat.o(31931);
  }

  public final View findViewById(int paramInt)
  {
    AppMethodBeat.i(31916);
    View localView = this.yTx.findViewById(paramInt);
    AppMethodBeat.o(31916);
    return localView;
  }

  public final View getChildAt(int paramInt)
  {
    AppMethodBeat.i(31929);
    View localView = this.yTy.getChildAt(paramInt);
    AppMethodBeat.o(31929);
    return localView;
  }

  public final Activity getContext()
  {
    AppMethodBeat.i(138624);
    Activity localActivity = this.yTx.getContext();
    AppMethodBeat.o(138624);
    return localActivity;
  }

  public final int getFirstVisiblePosition()
  {
    AppMethodBeat.i(31926);
    int i = this.yTy.getFirstVisiblePosition();
    AppMethodBeat.o(31926);
    return i;
  }

  public final int getHeaderViewsCount()
  {
    AppMethodBeat.i(31928);
    int i = this.yTy.getHeaderViewsCount();
    AppMethodBeat.o(31928);
    return i;
  }

  public final int getLastVisiblePosition()
  {
    AppMethodBeat.i(31927);
    int i = this.yTy.getLastVisiblePosition();
    AppMethodBeat.o(31927);
    return i;
  }

  @Deprecated
  public final ListView getListView()
  {
    AppMethodBeat.i(31924);
    ListView localListView = this.yTy.getListView();
    AppMethodBeat.o(31924);
    return localListView;
  }

  public final String getTalkerUserName()
  {
    AppMethodBeat.i(31912);
    String str;
    if (this.sRl == null)
    {
      str = "";
      AppMethodBeat.o(31912);
    }
    while (true)
    {
      return str;
      str = bo.bc(this.sRl.field_username, "");
      AppMethodBeat.o(31912);
    }
  }

  public final void ho(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(31936);
    ab.i("MicroMsg.ChattingContext", "[setSelectionFromTop] pos:%s offset:%s isSmooth:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.FALSE });
    this.yTy.ho(paramInt1, paramInt2);
    AppMethodBeat.o(31936);
  }

  public final void qp(boolean paramBoolean)
  {
    AppMethodBeat.i(31938);
    ab.i("MicroMsg.ChattingContext", "[scrollToLast] force:%b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.yTy.qp(paramBoolean);
    AppMethodBeat.o(31938);
  }

  public final void qv(boolean paramBoolean)
  {
    AppMethodBeat.i(31942);
    ab.i("MicroMsg.ChattingContext", "[showOptionMenu] menuID:%d show:%s", new Object[] { Integer.valueOf(2), Boolean.valueOf(paramBoolean) });
    this.yTy.showOptionMenu(2, paramBoolean);
    AppMethodBeat.o(31942);
  }

  public final void setKeepScreenOn(boolean paramBoolean)
  {
    AppMethodBeat.i(31941);
    ab.i("MicroMsg.ChattingContext", "[setKeepScreenOn] force:%b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.yTy.setKeepScreenOn(paramBoolean);
    AppMethodBeat.o(31941);
  }

  public final void showOptionMenu(boolean paramBoolean)
  {
    AppMethodBeat.i(31943);
    ab.i("MicroMsg.ChattingContext", "[showOptionMenu] show:%s", new Object[] { Boolean.valueOf(paramBoolean) });
    this.yTy.showOptionMenu(paramBoolean);
    AppMethodBeat.o(31943);
  }

  public final void showVKB()
  {
    AppMethodBeat.i(31933);
    ab.i("MicroMsg.ChattingContext", "[showVKB]");
    this.yTy.showVKB();
    AppMethodBeat.o(31933);
  }

  public final void startActivity(Intent paramIntent)
  {
    AppMethodBeat.i(31922);
    this.yTx.startActivity(paramIntent);
    AppMethodBeat.o(31922);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.d.a
 * JD-Core Version:    0.6.2
 */