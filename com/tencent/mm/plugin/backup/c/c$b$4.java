package com.tencent.mm.plugin.backup.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.b.b.b;
import com.tencent.mm.plugin.backup.b.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ai;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import java.util.Vector;
import junit.framework.Assert;

final class c$b$4
  implements Runnable
{
  c$b$4(c.b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(17186);
    Assert.assertTrue(toString() + ", check running. ", this.jsa.hkm);
    boolean bool1;
    switch (com.tencent.mm.plugin.backup.b.d.aSx())
    {
    default:
      if (this.jsa.jre == this.jsa.jrL.jrF.aSu().jqY - 1)
      {
        bool1 = true;
        label106: if (bool1)
          break label768;
      }
      break;
    case 1:
    case 21:
    case 22:
    }
    label768: for (boolean bool2 = true; ; bool2 = false)
    {
      Object localObject = new ai(bool2);
      c.b.4.1 local1 = new c.b.4.1(this, bool1, (ai)localObject);
      new com.tencent.mm.plugin.backup.g.d(this.jsa.talker, this.jsa.jrg, this.jsa.jrh, this.jsa.jrS, this.jsa.bCu, new LinkedList(this.jsa.jrT), local1).aUc();
      if (bool1)
      {
        ab.w(this.jsa.TAG, "sendTag last Session :[%d/%d] wait tag resp callback .", new Object[] { Integer.valueOf(this.jsa.jre), Integer.valueOf(this.jsa.jrL.jrF.aSu().jqY - 1) });
        ((ai)localObject).block();
      }
      this.jsa.hkm = false;
      AppMethodBeat.o(17186);
      return;
      ab.i(this.jsa.TAG, "sendTag session:%d time[%d,%d] media:%d nick:%s id:%s timeDiff:%s", new Object[] { Integer.valueOf(this.jsa.jrL.jrF.aSu().jqX), Long.valueOf(this.jsa.jrg), Long.valueOf(this.jsa.jrh), Integer.valueOf(this.jsa.jrT.size()), this.jsa.bCu, this.jsa.jrS, Long.valueOf(bo.gb(this.jsa.jrW)) });
      if (this.jsa.jrL.jrF.aSu().jqX >= this.jsa.jre + 1)
        break;
      int i = this.jsa.jrL.jrF.aSu().jqY;
      localObject = this.jsa.jrL.jrF.aSu();
      if (this.jsa.jre + 1 > i);
      while (true)
      {
        ((e)localObject).jqX = i;
        this.jsa.jrL.jrE.rj(this.jsa.jrL.jrF.aSu().jqW);
        break;
        i = this.jsa.jre + 1;
      }
      ab.i(this.jsa.TAG, "sendTag session:%d time[%d,%d] media:%d nick:%s id:%s timeDiff:%s", new Object[] { Integer.valueOf(this.jsa.jrL.jrF.aSu().jqX), Long.valueOf(this.jsa.jrg), Long.valueOf(this.jsa.jrh), Integer.valueOf(this.jsa.jrT.size()), this.jsa.bCu, this.jsa.jrS, Long.valueOf(bo.gb(this.jsa.jrW)) });
      if (this.jsa.jrL.jrF.aSu().jqX >= this.jsa.jre + 1)
        break;
      i = this.jsa.jrL.jrF.aSu().jqY;
      localObject = this.jsa.jrL.jrF.aSu();
      if (this.jsa.jre + 1 > i);
      while (true)
      {
        ((e)localObject).jqX = i;
        this.jsa.jrL.jrE.rj(this.jsa.jrL.jrF.aSu().jqW);
        break;
        i = this.jsa.jre + 1;
      }
      bool1 = false;
      break label106;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(17185);
    String str = this.jsa.TAG + ".sendTag";
    AppMethodBeat.o(17185);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.c.c.b.4
 * JD-Core Version:    0.6.2
 */