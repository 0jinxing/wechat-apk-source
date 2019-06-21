package com.tencent.mm.plugin.setting.model;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.plugin.messenger.foundation.a.a.k;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bq;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public final class l
{
  public final al eKj;
  Object mLock;
  public Runnable mRunnable;
  public boolean qjN;
  public boolean qjO;
  public boolean qjP;
  final CountDownLatch qjQ;
  HashSet<String> qjR;
  HashSet<String> qjS;
  HashSet<String> qjT;
  HashSet<String> qjU;
  public l.a qjV;
  public UnfamiliarContactDetailUI.h qjW;
  public long qjX;

  public l(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, UnfamiliarContactDetailUI.h paramh)
  {
    AppMethodBeat.i(126877);
    this.mLock = new Object();
    this.qjR = new HashSet();
    this.qjS = new HashSet();
    this.qjT = new HashSet();
    this.qjU = new HashSet();
    this.qjN = paramBoolean1;
    this.qjO = paramBoolean2;
    this.qjP = paramBoolean3;
    int i;
    int j;
    if (this.qjO)
    {
      i = 1;
      if (!this.qjN)
        break label212;
      j = 1;
      label99: if (!this.qjP)
        break label218;
    }
    label212: label218: for (int k = 1; ; k = 0)
    {
      i = k + (j + i);
      ab.i("MicroMsg.UnfamiliarContactEngine", "[UnfamiliarContactEngine] count:%s [%s:%s:%s]", new Object[] { Integer.valueOf(i), Boolean.valueOf(this.qjO), Boolean.valueOf(this.qjN), Boolean.valueOf(this.qjP) });
      this.qjQ = new CountDownLatch(i);
      this.eKj = new al("UnfamiliarContactEngine");
      this.qjW = paramh;
      AppMethodBeat.o(126877);
      return;
      i = 0;
      break;
      j = 0;
      break label99;
    }
  }

  final void g(LinkedList<String> paramLinkedList, int paramInt)
  {
    AppMethodBeat.i(126878);
    long l = System.currentTimeMillis();
    if (paramInt + 10 < paramLinkedList.size());
    for (int i = paramInt + 10; ; i = paramLinkedList.size())
    {
      List localList = paramLinkedList.subList(paramInt, i);
      i locali = new i();
      locali.hbo = 8;
      locali.query = bo.c(localList, ",");
      locali.mEw = new l.4(this, i, localList, paramLinkedList, l);
      locali.handler = this.eKj.doN();
      ((n)g.M(n.class)).search(2, locali);
      AppMethodBeat.o(126878);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.model.l
 * JD-Core Version:    0.6.2
 */