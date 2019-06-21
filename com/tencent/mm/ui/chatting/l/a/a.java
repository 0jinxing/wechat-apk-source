package com.tencent.mm.ui.chatting.l.a;

import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.h;
import com.tencent.mm.ui.chatting.f.b.a;
import com.tencent.mm.ui.chatting.f.d;
import com.tencent.mm.ui.chatting.f.d.a;
import com.tencent.mm.ui.chatting.f.d.d;
import com.tencent.mm.ui.chatting.l.e;
import com.tencent.mm.ui.chatting.view.MMChattingListView;
import org.xwalk.core.Log;

public abstract class a
  implements b.a
{
  com.tencent.mm.ui.chatting.d.a cgL;
  long yZQ;
  long yZR;
  public d zae;
  int zaf;
  int zag;
  long zah;
  long zai;
  int zaj = 3;

  public a(com.tencent.mm.ui.chatting.d.a parama, d paramd)
  {
    this.cgL = parama;
    this.zae = paramd;
  }

  protected final void Pj(final int paramInt)
  {
    this.zaj = 3;
    this.cgL.Oq(paramInt);
    this.cgL.getListView().postDelayed(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(32715);
        if ((a.this.cgL.getFirstVisiblePosition() > paramInt) || (paramInt > a.this.cgL.getLastVisiblePosition()))
        {
          Log.i("MicroMsg.ChattingLoader.AbstractDataPresenter", "[protectSetSelection] pos:" + paramInt + " reTryCount:" + a.this.zaj);
          a.this.cgL.ho(paramInt, 0);
          a locala = a.this;
          locala.zaj -= 1;
          if (a.this.zaj < 0)
            break label168;
          a.this.cgL.getListView().postDelayed(this, 20L);
          AppMethodBeat.o(32715);
        }
        while (true)
        {
          return;
          Log.i("MicroMsg.ChattingLoader.AbstractDataPresenter", "[protectSetSelection] successfully! pos:" + paramInt);
          label168: AppMethodBeat.o(32715);
        }
      }
    }
    , 200L);
  }

  protected abstract e a(d.a parama, Bundle paramBundle, d.d paramd);

  public void a(d.a parama, boolean paramBoolean, Bundle paramBundle)
  {
    Log.i("MicroMsg.ChattingLoader.AbstractDataPresenter", "[onLoad] action:" + parama + " isBlock:" + paramBoolean + " username:" + this.cgL.getTalkerUserName());
    if (bo.isNullOrNil(this.cgL.getTalkerUserName()))
      Log.w("MicroMsg.ChattingLoader.AbstractDataPresenter", "[onLoad] username is null!");
    while (true)
    {
      return;
      g.BN(13);
      ((h)this.cgL.aF(h.class)).dCU();
      this.zae.a(parama, paramBoolean, new a.1(this, paramBundle, parama));
    }
  }

  public void a(MMChattingListView paramMMChattingListView, d.d<bi> paramd)
  {
    g.BO(13);
    paramMMChattingListView.getBaseAdapter().notifyDataSetChanged();
    ((h)this.cgL.aF(h.class)).dCV();
    if (paramd.yYA == d.a.yYu)
      this.cgL.yTx.cch();
  }

  public String toString()
  {
    return getClass().getName();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.l.a.a
 * JD-Core Version:    0.6.2
 */