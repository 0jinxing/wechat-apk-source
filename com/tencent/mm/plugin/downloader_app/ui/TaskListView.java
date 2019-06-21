package com.tencent.mm.plugin.downloader_app.ui;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.l;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView;
import com.tencent.mm.plugin.downloader_app.b.d;
import com.tencent.mm.plugin.downloader_app.b.d.a;
import com.tencent.mm.plugin.downloader_app.b.d.b;
import com.tencent.mm.plugin.downloader_app.b.d.d;
import com.tencent.mm.plugin.downloader_app.b.d.e;
import com.tencent.mm.plugin.downloader_app.b.d.f;
import com.tencent.mm.plugin.downloader_app.b.d.g;
import com.tencent.mm.plugin.downloader_app.b.e;
import com.tencent.mm.plugin.downloader_app.b.h;
import com.tencent.mm.plugin.downloader_app.b.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class TaskListView extends MRecyclerView
{
  private Map<String, i> kOT;
  b kQZ;
  DownloadMainUI.a kRa;
  boolean kRb;
  private d.d kRc;
  private d.a kRd;
  private d.b kRe;
  private d.f kRf;
  private d.e kRg;
  private d.g kRh;
  private boolean kRi;

  public TaskListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(136301);
    this.kOT = new HashMap();
    this.kRc = new TaskListView.1(this);
    this.kRd = new TaskListView.3(this);
    this.kRe = new TaskListView.4(this);
    this.kRf = new TaskListView.5(this);
    this.kRg = new TaskListView.6(this);
    this.kRh = new TaskListView.7(this);
    this.kRi = true;
    AppMethodBeat.o(136301);
  }

  private void c(i parami)
  {
    AppMethodBeat.i(136306);
    b localb = this.kQZ;
    localb.kQR.remove(parami);
    h localh = localb.kQR;
    int i = 0;
    if (i < localh.size())
    {
      e locale = (e)localh.get(i);
      if (parami.biK() > locale.biK());
    }
    for (int j = 1; ; j = 0)
    {
      if (j == 0)
        i = localh.size();
      localh.add(i, parami);
      l.q(new b.1(localb));
      AppMethodBeat.o(136306);
      return;
      i++;
      break;
      i = 0;
    }
  }

  public final void biU()
  {
    AppMethodBeat.i(136308);
    this.kRb = false;
    if (this.kRa != null)
      this.kRa.gl(false);
    Object localObject = this.kQZ.kQR;
    if (this.kQZ.biL())
    {
      ((DownloadMainUI)getContext()).gk(true);
      AppMethodBeat.o(136308);
    }
    while (true)
    {
      return;
      localObject = ((h)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        i locali = (i)((Iterator)localObject).next();
        locali.kci = false;
        locali.gBF = false;
      }
      this.kQZ.kQX = true;
      this.kQZ.aop.notifyChanged();
      this.kRi = true;
      AppMethodBeat.o(136308);
    }
  }

  public int getSize()
  {
    AppMethodBeat.i(136307);
    int i = this.kQZ.kQR.size();
    AppMethodBeat.o(136307);
    return i;
  }

  public void onAttachedToWindow()
  {
    AppMethodBeat.i(136303);
    super.onAttachedToWindow();
    d.a(this.kRc);
    d.a(this.kRd);
    d.a(this.kRe);
    d.a(this.kRf);
    d.a(this.kRg);
    d.a(this.kRh);
    AppMethodBeat.o(136303);
  }

  public void onDetachedFromWindow()
  {
    AppMethodBeat.i(136304);
    super.onDetachedFromWindow();
    d.b(this.kRc);
    d.b(this.kRd);
    d.b(this.kRe);
    d.b(this.kRf);
    d.b(this.kRg);
    d.b(this.kRh);
    AppMethodBeat.o(136304);
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(136302);
    super.onFinishInflate();
    ab.d("MicroMsg.TaskListView", "onFinishInflate");
    getContext();
    setLayoutManager(new LinearLayoutManager());
    this.kQZ = new b(getContext());
    setAdapter(this.kQZ);
    a(new a(getResources()));
    setOnItemLongClickListener(new TaskListView.8(this));
    setOnItemClickListener(new TaskListView.9(this));
    AppMethodBeat.o(136302);
  }

  public void setData(LinkedList<i> paramLinkedList)
  {
    AppMethodBeat.i(136305);
    Object localObject1 = paramLinkedList.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (i)((Iterator)localObject1).next();
      if (!bo.isNullOrNil(((i)localObject2).appId))
        this.kOT.put(((i)localObject2).appId, localObject2);
    }
    Object localObject2 = this.kQZ;
    ((b)localObject2).kQR.clear();
    localObject1 = ((b)localObject2).kQR;
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext())
      ((h)localObject1).a((e)paramLinkedList.next());
    ((b)localObject2).kQR.a(new i(1));
    ((b)localObject2).kQR.a(new i(3));
    ((b)localObject2).kQR.a(new i(5));
    ((b)localObject2).kQR.a(new i(7));
    ((RecyclerView.a)localObject2).aop.notifyChanged();
    AppMethodBeat.o(136305);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.ui.TaskListView
 * JD-Core Version:    0.6.2
 */