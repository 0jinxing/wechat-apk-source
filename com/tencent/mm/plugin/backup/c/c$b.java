package com.tencent.mm.plugin.backup.c;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.s;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.backup.b.d;
import com.tencent.mm.plugin.backup.b.f.a;
import com.tencent.mm.plugin.backup.f.h.a;
import com.tencent.mm.plugin.backup.i.u;
import com.tencent.mm.protocal.protobuf.gu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;
import java.util.concurrent.LinkedBlockingQueue;
import junit.framework.Assert;

final class c$b
{
  String TAG;
  String bCu;
  boolean hkm;
  LinkedBlockingQueue<Runnable> jrP;
  c.a jrQ;
  private long jrR;
  String jrS;
  Vector<String> jrT;
  private Vector<gu> jrU;
  HashMap<Long, h.a> jrV;
  long jrW;
  private final com.tencent.mm.plugin.backup.g.c.b jrX;
  private final Runnable jrY;
  final Runnable jrZ;
  int jre;
  long jrg;
  long jrh;
  String talker;

  public c$b(c paramc, c.a parama, f.a parama1)
  {
    AppMethodBeat.i(17187);
    this.TAG = "";
    this.jrP = new LinkedBlockingQueue();
    this.jrg = 0L;
    this.jrh = 0L;
    this.jrR = 0L;
    this.jrS = "";
    this.jrT = new Vector();
    this.jrU = new Vector();
    this.jrV = new HashMap();
    this.jrW = 0L;
    this.hkm = false;
    this.jrX = new c.b.1(this);
    this.jrY = new c.b.3(this);
    this.jrZ = new c.b.4(this);
    this.jrW = bo.anU();
    this.jrQ = parama;
    this.talker = parama1.jrd;
    this.jre = parama1.jre;
    if (t.kH(this.talker))
    {
      paramc = s.getDisplayName(this.talker, this.talker);
      this.bCu = paramc;
      parama = new StringBuilder("MicroMsg.BackupPackAndSend.tag.");
      if (!this.hkm)
        break label299;
    }
    label299: for (paramc = "S."; ; paramc = "W.")
    {
      this.TAG = (paramc + this.jre + "." + this.bCu);
      ab.i(this.TAG, "initTagNow [%d,%s,%s] [%s]", new Object[] { Integer.valueOf(this.jre), this.bCu, this.talker, an.doQ() });
      AppMethodBeat.o(17187);
      return;
      paramc = s.mJ(this.talker);
      break;
    }
  }

  public final boolean a(gu paramgu, long paramLong1, long paramLong2, LinkedList<u> paramLinkedList, HashMap<Long, h.a> paramHashMap)
  {
    AppMethodBeat.i(17188);
    this.jrU.add(paramgu);
    long l1 = this.jrR;
    if (paramLong1 > 0L);
    for (long l2 = paramLong1; ; l2 = 0L)
    {
      this.jrR = (l2 + l1);
      if (this.jrg == 0L)
        this.jrg = paramLong2;
      this.jrh = paramLong2;
      this.jrV.putAll(paramHashMap);
      paramHashMap = paramLinkedList.iterator();
      while (paramHashMap.hasNext())
      {
        paramgu = (u)paramHashMap.next();
        m(paramgu.cHr, paramgu.path, false);
      }
    }
    ab.i(this.TAG, "addToTag msgtime[%d,%d] size[%d,%d] baklist:%d media:%d timeDiff:%d", new Object[] { Long.valueOf(this.jrg), Long.valueOf(this.jrh), Long.valueOf(paramLong1), Long.valueOf(this.jrR), Integer.valueOf(this.jrU.size()), Integer.valueOf(paramLinkedList.size()), Long.valueOf(bo.gb(this.jrW)) });
    boolean bool;
    if ((this.jrR > 83886080L) || (this.jrU.size() > 80))
    {
      aSJ();
      bool = true;
      AppMethodBeat.o(17188);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(17188);
    }
  }

  public final void aSJ()
  {
    AppMethodBeat.i(17189);
    this.jrS = ("MSG_" + this.jrU.size() + "_" + this.talker + "_" + bo.anU());
    ab.i(this.TAG, "setTagEnd msgtime[%d,%d], size:%d baklist:%d bigfile:%d id:%s timeDiff:%d", new Object[] { Long.valueOf(this.jrg), Long.valueOf(this.jrh), Long.valueOf(this.jrR), Integer.valueOf(this.jrU.size()), Integer.valueOf(this.jrV.size()), this.jrS, Long.valueOf(bo.gb(this.jrW)) });
    if (this.jrU.size() > 0)
    {
      m(this.jrS, null, false);
      if (this.jrV.isEmpty())
      {
        this.jrP.offer(this.jrZ);
        AppMethodBeat.o(17189);
      }
    }
    while (true)
    {
      return;
      this.jrP.offer(this.jrY);
      AppMethodBeat.o(17189);
      continue;
      ab.w(this.TAG, "setTagEnd NoFileSend, Go Send Tag: Direct. baklist:%d media:%d bigFileMap:%d ", new Object[] { Integer.valueOf(this.jrU.size()), Integer.valueOf(this.jrT.size()), Integer.valueOf(this.jrV.size()) });
      Assert.assertTrue("cursorEnd NOMsg, chatMsgList should empty", this.jrU.isEmpty());
      Assert.assertTrue("cursorEnd NOMsg, MediaList should empty", this.jrT.isEmpty());
      Assert.assertTrue("cursorEnd NOMsg, BigFileList should empty", this.jrV.isEmpty());
      this.jrP.offer(this.jrZ);
      AppMethodBeat.o(17189);
    }
  }

  final void m(String paramString1, String paramString2, boolean paramBoolean)
  {
    boolean bool = true;
    AppMethodBeat.i(17190);
    c.b.2 local2 = new c.b.2(this);
    ab.i(this.TAG, "postSendFile isBigFile[%b], baklst:%d Id:%s path:%s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(this.jrU.size()), paramString1, paramString2 });
    if (!TextUtils.isEmpty(paramString2))
    {
      this.jrT.add(paramString1);
      if (paramString1 != null)
      {
        com.tencent.mm.plugin.backup.g.c.a(this.jrX, local2, paramString1, paramString2, this.jrL.jrF.jqU);
        AppMethodBeat.o(17190);
      }
    }
    else
    {
      if (this.jrU.isEmpty())
        break label173;
    }
    label173: for (paramBoolean = bool; ; paramBoolean = false)
    {
      Assert.assertTrue("chatMsgList should not empty", paramBoolean);
      if (paramString1 != null)
        com.tencent.mm.plugin.backup.g.c.a(this.jrX, local2, paramString1, new LinkedList(this.jrU), this.jrL.jrF.jqU);
      AppMethodBeat.o(17190);
      break;
    }
  }

  public final String toString()
  {
    return this.TAG;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.c.c.b
 * JD-Core Version:    0.6.2
 */