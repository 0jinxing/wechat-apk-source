package com.tencent.mm.ui.chatting.i;

import android.os.HandlerThread;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelvoiceaddr.ui.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.chatting.a.c.b;
import com.tencent.mm.ui.chatting.e.b.b;
import java.util.ArrayList;
import java.util.Iterator;

final class b$2
  implements b.a
{
  private ap emH;
  String yNK;

  b$2(b paramb)
  {
    AppMethodBeat.i(32530);
    this.yNK = "";
    this.emH = new ap(aw.RS().oAl.getLooper(), new ap.a()
    {
      public final boolean BI()
      {
        AppMethodBeat.i(32529);
        boolean bool;
        if (b.2.this.yZb.yZa == null)
        {
          bool = true;
          ab.i("MicroMsg.BaseHistoryListPresenter", "[onTimerExpired]  mDataListCache is null?:%s mSearchText is null?:%s", new Object[] { Boolean.valueOf(bool), Boolean.valueOf(bo.isNullOrNil(b.2.this.yNK)) });
          if (!bo.isNullOrNil(b.2.this.yNK))
            break label158;
          b.2.this.yZb.yYZ.yNK = b.2.this.yNK;
          if (b.2.this.yZb.yZa != null)
            break label124;
          b.2.this.yZb.dFH();
          label111: AppMethodBeat.o(32529);
        }
        while (true)
        {
          return false;
          bool = false;
          break;
          label124: b.2.this.yZb.iPr = b.2.this.yZb.yZa;
          al.d(new Runnable()
          {
            public final void run()
            {
              AppMethodBeat.i(32527);
              if (b.2.this.yZb.yYY != null)
              {
                b.2.this.yZb.yYY.ch(b.2.this.yNK, false);
                b.2.this.yZb.yYZ.aop.notifyChanged();
              }
              AppMethodBeat.o(32527);
            }
          });
          break label111;
          label158: b.2.this.yZb.iPr = b.2.this.yZb.yZa;
          ArrayList localArrayList = new ArrayList();
          Iterator localIterator = b.2.this.yZb.iPr.iterator();
          while (localIterator.hasNext())
          {
            c.b localb = (c.b)localIterator.next();
            if (localb.arg(b.2.this.yNK))
              localArrayList.add(localb);
          }
          b.2.this.yZb.iPr = localArrayList;
          b.2.this.yZb.yYZ.yNK = b.2.this.yNK;
          al.d(new b.2.1.2(this));
          AppMethodBeat.o(32529);
        }
      }
    }
    , false);
    AppMethodBeat.o(32530);
  }

  public final void a(boolean paramBoolean, String[] paramArrayOfString, long paramLong, int paramInt)
  {
  }

  public final void amJ()
  {
  }

  public final void apo()
  {
    AppMethodBeat.i(32531);
    ab.d("MicroMsg.BaseHistoryListPresenter", "onQuitSearch");
    if (this.yZb.yYY != null)
      this.yZb.yYY.onFinish();
    AppMethodBeat.o(32531);
  }

  public final void app()
  {
  }

  public final void apq()
  {
  }

  public final void apr()
  {
    AppMethodBeat.i(32533);
    ab.i("MicroMsg.BaseHistoryListPresenter", "onSearchEditTextReady");
    AppMethodBeat.o(32533);
  }

  public final boolean vN(String paramString)
  {
    return false;
  }

  public final void vO(String paramString)
  {
    AppMethodBeat.i(32532);
    if (!this.yNK.equals(paramString))
    {
      this.yNK = paramString;
      this.emH.stopTimer();
      this.emH.ae(500L, 500L);
    }
    AppMethodBeat.o(32532);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.i.b.2
 * JD-Core Version:    0.6.2
 */