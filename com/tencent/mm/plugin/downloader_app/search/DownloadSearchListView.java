package com.tencent.mm.plugin.downloader_app.search;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView;
import com.tencent.mm.plugin.downloader.b.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.List;

public class DownloadSearchListView extends MRecyclerView
{
  List<b> kPA;
  private a.b kPB;
  a kPy;
  List<b> kPz;
  Context mContext;

  public DownloadSearchListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(136174);
    this.kPB = new DownloadSearchListView.1(this);
    this.mContext = paramContext;
    AppMethodBeat.o(136174);
  }

  public DownloadSearchListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(136175);
    this.kPB = new DownloadSearchListView.1(this);
    this.mContext = paramContext;
    AppMethodBeat.o(136175);
  }

  public final void IN(String paramString)
  {
    AppMethodBeat.i(136179);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(136179);
    while (true)
    {
      return;
      b.al(this.mContext, paramString);
      this.kPz = b.dD(this.mContext);
      AppMethodBeat.o(136179);
    }
  }

  public void onAttachedToWindow()
  {
    AppMethodBeat.i(136176);
    ab.i("MicroMsg.DownloadSearchListView", "onAttachedToWindow");
    super.onAttachedToWindow();
    com.tencent.mm.plugin.downloader.b.a.a(this.kPB);
    AppMethodBeat.o(136176);
  }

  public void onDetachedFromWindow()
  {
    AppMethodBeat.i(136177);
    ab.i("MicroMsg.DownloadSearchListView", "onDetachedFromWindow");
    super.onDetachedFromWindow();
    com.tencent.mm.plugin.downloader.b.a.b(this.kPB);
    AppMethodBeat.o(136177);
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(136178);
    super.onFinishInflate();
    getContext();
    setLayoutManager(new LinearLayoutManager());
    this.kPy = new a(this.mContext, this);
    setAdapter(this.kPy);
    a(new c(getResources()));
    this.kPz = b.dD(this.mContext);
    this.kPA = new ArrayList();
    AppMethodBeat.o(136178);
  }

  void setData(List<b> paramList)
  {
    AppMethodBeat.i(136180);
    a locala = this.kPy;
    locala.iPr.clear();
    if (!bo.ek(paramList))
      locala.iPr.addAll(paramList);
    locala.aop.notifyChanged();
    AppMethodBeat.o(136180);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.search.DownloadSearchListView
 * JD-Core Version:    0.6.2
 */