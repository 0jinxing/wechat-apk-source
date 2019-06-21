package com.tencent.mm.plugin.downloader_app.ui;

import android.content.Context;
import android.support.v7.widget.RecyclerView.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.l;
import com.tencent.mm.plugin.downloader_app.b.h;
import com.tencent.mm.plugin.downloader_app.b.i;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

public final class b extends RecyclerView.a<b.a>
{
  h<i> kQR;
  private boolean kQS;
  private boolean kQT;
  private boolean kQU;
  private boolean kQV;
  boolean kQW;
  boolean kQX;
  private Context mContext;

  public b(Context paramContext)
  {
    AppMethodBeat.i(136285);
    this.kQR = new h();
    this.kQS = true;
    this.kQT = false;
    this.kQU = false;
    this.kQV = false;
    this.kQW = false;
    this.kQX = true;
    this.mContext = paramContext;
    AppMethodBeat.o(136285);
  }

  public final void P(LinkedList<i> paramLinkedList)
  {
    AppMethodBeat.i(136288);
    if (bo.ek(paramLinkedList))
      AppMethodBeat.o(136288);
    while (true)
    {
      return;
      if (paramLinkedList.size() == 1)
      {
        int i = this.kQR.indexOf(paramLinkedList.get(0));
        this.kQR.remove(i);
        l.q(new b.2(this, i));
        AppMethodBeat.o(136288);
      }
      else
      {
        this.kQR.removeAll(paramLinkedList);
        l.q(new b.3(this));
        AppMethodBeat.o(136288);
      }
    }
  }

  public final boolean biL()
  {
    AppMethodBeat.i(136289);
    boolean bool;
    if (this.kQR.size() <= 5)
    {
      bool = true;
      AppMethodBeat.o(136289);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(136289);
    }
  }

  public final int getItemCount()
  {
    AppMethodBeat.i(136287);
    int i = this.kQR.size();
    AppMethodBeat.o(136287);
    return i;
  }

  public final int getItemViewType(int paramInt)
  {
    AppMethodBeat.i(136286);
    paramInt = ((i)this.kQR.get(paramInt)).type;
    AppMethodBeat.o(136286);
    return paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.ui.b
 * JD-Core Version:    0.6.2
 */