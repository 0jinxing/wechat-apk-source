package com.tencent.mm.plugin.fav.ui.gallery;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Looper;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.support.v7.widget.RecyclerView.h;
import android.support.v7.widget.RecyclerView.i;
import android.support.v7.widget.RecyclerView.s;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import java.util.ArrayList;
import java.util.List;

public final class h
  implements e.b, g.a
{
  ArrayList<f.c> iPr;
  List<Long> idList;
  private GridLayoutManager kvk;
  Context mContext;
  private ak mHandler;
  int moA;
  g.b mow;
  f mox;
  boolean moy;
  int moz;

  public h(Context paramContext)
  {
    AppMethodBeat.i(74595);
    this.iPr = null;
    this.moy = false;
    this.mHandler = new ak(Looper.getMainLooper());
    this.moz = 0;
    this.idList = new ArrayList();
    this.moA = 0;
    this.mContext = paramContext;
    this.iPr = new ArrayList();
    AppMethodBeat.o(74595);
  }

  public final RecyclerView.a bfB()
  {
    AppMethodBeat.i(74599);
    this.mox = new f(this.mContext, this.iPr, this.mow);
    this.mox.moc = new h.3(this);
    f localf = this.mox;
    AppMethodBeat.o(74599);
    return localf;
  }

  public final <T extends RecyclerView.i> T bfC()
  {
    AppMethodBeat.i(74597);
    if (this.kvk == null)
    {
      this.kvk = new GridLayoutManager(4);
      this.kvk.akZ = new h.1(this);
    }
    GridLayoutManager localGridLayoutManager = this.kvk;
    AppMethodBeat.o(74597);
    return localGridLayoutManager;
  }

  public final void bwq()
  {
    AppMethodBeat.i(74601);
    this.mox.mod = true;
    e.a.bwv().mnY = true;
    GridLayoutManager localGridLayoutManager = (GridLayoutManager)bfC();
    int i = localGridLayoutManager.iQ();
    int j = localGridLayoutManager.iS();
    this.mox.c(i, j - i + 1, Integer.valueOf(0));
    AppMethodBeat.o(74601);
  }

  public final void bwr()
  {
    AppMethodBeat.i(74602);
    this.mox.mod = false;
    e.a.bwv().clear();
    e.a.bwv().mnY = false;
    this.mox.aop.notifyChanged();
    AppMethodBeat.o(74602);
  }

  public final void bww()
  {
    this.moy = true;
  }

  public final boolean bwy()
  {
    AppMethodBeat.i(74603);
    boolean bool = e.a.bwv().mnY;
    AppMethodBeat.o(74603);
    return bool;
  }

  public final RecyclerView.h dN(final Context paramContext)
  {
    AppMethodBeat.i(74598);
    paramContext = new RecyclerView.h()
    {
      public final void a(Rect paramAnonymousRect, View paramAnonymousView, RecyclerView paramAnonymousRecyclerView, RecyclerView.s paramAnonymouss)
      {
        AppMethodBeat.i(74591);
        int i = (int)paramContext.getResources().getDimension(2131427815);
        paramAnonymousRect.bottom = i;
        paramAnonymousRect.top = i;
        paramAnonymousRect.left = i;
        paramAnonymousRect.right = i;
        AppMethodBeat.o(74591);
      }
    };
    AppMethodBeat.o(74598);
    return paramContext;
  }

  public final void onDetach()
  {
    AppMethodBeat.i(74596);
    if (this.mow != null)
    {
      this.mow.a(null);
      this.mow = null;
    }
    e locale = e.a.bwv();
    locale.mnZ.clear();
    locale.clear();
    locale.mnY = false;
    AppMethodBeat.o(74596);
  }

  public final void onResume()
  {
    AppMethodBeat.i(74604);
    if ((this.moy) && (e.a.bwv().mnY))
    {
      this.mow.vF(e.a.bwv().mnX.size());
      this.mox.aop.notifyChanged();
    }
    AppMethodBeat.o(74604);
  }

  public final void s(boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(74605);
    this.mox.kuX = true;
    this.mow.fO(paramBoolean);
    g.RQ();
    g.RS().aa(new h.4(this, paramBoolean, paramInt));
    AppMethodBeat.o(74605);
  }

  public final void vH(int paramInt)
  {
    AppMethodBeat.i(74600);
    ab.i("MicroMsg.MediaHistoryGalleryPresenter", "[handleSelectedItem] type:%s", new Object[] { Integer.valueOf(paramInt) });
    ArrayList localArrayList = e.a.bwv().mnX;
    switch (paramInt)
    {
    default:
    case 0:
    }
    while (true)
    {
      AppMethodBeat.o(74600);
      return;
      this.mow.bS(localArrayList);
      this.mow.bwr();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.gallery.h
 * JD-Core Version:    0.6.2
 */