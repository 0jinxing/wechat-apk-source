package com.tencent.mm.plugin.messenger.foundation.a.a;

import android.database.Cursor;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.e.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.bi.a;
import com.tencent.mm.storage.bi.b;
import com.tencent.mm.storage.bi.c;
import com.tencent.mm.storage.bi.d;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public abstract interface h extends g
{
  public abstract Cursor G(String paramString1, String paramString2, int paramInt);

  public abstract void K(ArrayList<Long> paramArrayList);

  public abstract void P(String paramString, long paramLong);

  public abstract bi Q(String paramString, long paramLong);

  public abstract void QW(String paramString);

  public abstract void QX(String paramString);

  public abstract void QY(String paramString);

  public abstract Cursor QZ(String paramString);

  public abstract bi R(String paramString, long paramLong);

  public abstract bi Ra(String paramString);

  public abstract bi Rb(String paramString);

  public abstract bi Rc(String paramString);

  public abstract bi Rd(String paramString);

  public abstract List<bi> Re(String paramString);

  public abstract Cursor Rf(String paramString);

  public abstract void Rg(String paramString);

  public abstract int Rh(String paramString);

  public abstract int Ri(String paramString);

  public abstract Cursor Rj(String paramString);

  public abstract Cursor Rk(String paramString);

  public abstract bi.c Rl(String paramString);

  public abstract bi.d Rm(String paramString);

  public abstract bi.a Rn(String paramString);

  public abstract bi.b Ro(String paramString);

  public abstract int Rp(String paramString);

  public abstract int Rq(String paramString);

  public abstract String Rr(String paramString);

  public abstract long Rs(String paramString);

  public abstract long Rt(String paramString);

  public abstract long Ru(String paramString);

  public abstract bi Rv(String paramString);

  public abstract int Rw(String paramString);

  public abstract List<bi> Rx(String paramString);

  public abstract long Ry(String paramString);

  public abstract Cursor Rz(String paramString);

  public abstract bi S(String paramString, long paramLong);

  public abstract List<bi> T(String paramString, long paramLong);

  public abstract List<bi> U(String paramString, long paramLong);

  public abstract bi V(String paramString, long paramLong);

  public abstract bi W(String paramString, long paramLong);

  public abstract boolean X(String paramString, long paramLong);

  public abstract int Y(bi parambi);

  public abstract bi Y(String paramString, long paramLong);

  public abstract long Z(bi parambi);

  public abstract long Z(String paramString, long paramLong);

  public abstract Cursor a(String paramString, long paramLong1, long paramLong2, boolean paramBoolean);

  public abstract void a(long paramLong, bi parambi);

  public abstract void a(com.tencent.mm.cd.h paramh, String paramString);

  public abstract void a(a parama);

  public abstract void a(a parama, Looper paramLooper);

  public abstract void a(b paramb);

  public abstract void a(c paramc);

  public abstract void a(com.tencent.mm.storage.e parame);

  public abstract int aa(String paramString, long paramLong);

  public abstract List<bi> aa(String paramString, int paramInt1, int paramInt2);

  public abstract void aa(bi parambi);

  public abstract int ab(bi parambi);

  public abstract int ab(String paramString, long paramLong);

  public abstract Cursor ab(String paramString, int paramInt1, int paramInt2);

  public abstract int ac(String paramString, long paramLong);

  public abstract String ad(String paramString, long paramLong);

  public abstract bi ae(String paramString, long paramLong);

  public abstract bi af(String paramString, long paramLong);

  public abstract Cursor b(String paramString, long paramLong1, long paramLong2, int paramInt);

  public abstract void b(long paramLong, bi parambi);

  public abstract void b(String paramString1, String paramString2, String[] paramArrayOfString);

  public abstract void bOA();

  public abstract void bOB();

  public abstract ArrayList<bi> bOC();

  public abstract List<bi> bOD();

  public abstract Cursor bOE();

  public abstract String bOF();

  public abstract String bOG();

  public abstract List<bi> bOH();

  public abstract com.tencent.mm.cd.h bOy();

  public abstract void bOz();

  public abstract long c(bi parambi, boolean paramBoolean);

  public abstract Cursor c(String paramString, long paramLong1, long paramLong2, int paramInt);

  public abstract int cA(String paramString, int paramInt);

  public abstract Cursor cB(String paramString, int paramInt);

  public abstract bi[] cC(String paramString, int paramInt);

  public abstract Cursor cD(String paramString, int paramInt);

  public abstract List<bi> cs(String paramString, int paramInt);

  public abstract List<bi> ct(String paramString, int paramInt);

  public abstract Cursor cu(String paramString, int paramInt);

  public abstract Cursor cv(String paramString, int paramInt);

  public abstract Cursor cw(String paramString, int paramInt);

  public abstract int cx(String paramString, int paramInt);

  public abstract Cursor cy(String paramString, int paramInt);

  public abstract Cursor cz(String paramString, int paramInt);

  public abstract Cursor d(String paramString, long paramLong1, long paramLong2, int paramInt);

  public abstract int e(String paramString, long paramLong, int paramInt);

  public abstract long f(String paramString, long paramLong, int paramInt);

  public abstract bi fa(String paramString1, String paramString2);

  public abstract Cursor fb(String paramString1, String paramString2);

  public abstract int fc(String paramString1, String paramString2);

  public abstract LinkedList<bi> fd(String paramString1, String paramString2);

  public abstract long g(String paramString, long paramLong, int paramInt);

  public abstract List<bi> g(String paramString, long paramLong, boolean paramBoolean);

  public abstract Cursor h(String paramString, int paramInt, long paramLong);

  public abstract Cursor h(String paramString, long paramLong, int paramInt);

  public abstract Cursor i(String paramString, int paramInt, long paramLong);

  public abstract bi jf(long paramLong);

  public abstract int jg(long paramLong);

  public abstract boolean jh(long paramLong);

  public abstract boolean ji(long paramLong);

  public abstract void jj(long paramLong);

  public abstract int oA(String paramString);

  public abstract boolean oB(String paramString);

  public abstract Cursor p(String paramString, long paramLong1, long paramLong2);

  public abstract Cursor q(String paramString, long paramLong1, long paramLong2);

  public abstract int r(String paramString, long paramLong1, long paramLong2);

  public abstract int s(String paramString, long paramLong1, long paramLong2);

  public abstract Cursor t(String paramString, long paramLong1, long paramLong2);

  public abstract int u(String paramString, long paramLong1, long paramLong2);

  public abstract int v(String paramString, long paramLong1, long paramLong2);

  public abstract Cursor w(String paramString, long paramLong1, long paramLong2);

  public abstract bi yw(int paramInt);

  public static abstract interface a
  {
    public abstract void a(h paramh, h.c paramc);
  }

  public static final class b
  {
    public long fDH;
    public String name;
    private a[] oqF;
    public int oqG;

    public b(int paramInt, String paramString, a[] paramArrayOfa)
    {
      AppMethodBeat.i(60017);
      if (paramString.length() > 0)
      {
        bool2 = true;
        Assert.assertTrue(bool2);
        this.name = paramString;
        if (paramArrayOfa.length != 2)
          break label151;
        bool2 = true;
        label41: Assert.assertTrue(bool2);
        if (paramArrayOfa[0].oqI < paramArrayOfa[0].oqH)
          break label157;
        bool2 = true;
        label65: Assert.assertTrue(bool2);
        if (paramArrayOfa[1].oqI < paramArrayOfa[1].oqH)
          break label163;
        bool2 = true;
        label89: Assert.assertTrue(bool2);
        if (paramArrayOfa[1].oqH < paramArrayOfa[0].oqI)
          break label169;
      }
      label151: label157: label163: label169: for (boolean bool2 = bool1; ; bool2 = false)
      {
        Assert.assertTrue(bool2);
        this.oqF = paramArrayOfa;
        this.oqG = paramInt;
        this.fDH = paramArrayOfa[0].oqH;
        AppMethodBeat.o(60017);
        return;
        bool2 = false;
        break;
        bool2 = false;
        break label41;
        bool2 = false;
        break label65;
        bool2 = false;
        break label89;
      }
    }

    public static a[] a(long paramLong1, long paramLong2, long paramLong3, long paramLong4)
    {
      AppMethodBeat.i(60020);
      a locala1 = new a((byte)0);
      locala1.oqH = paramLong1;
      locala1.oqI = paramLong2;
      a locala2 = new a((byte)0);
      locala2.oqH = paramLong3;
      locala2.oqI = paramLong4;
      AppMethodBeat.o(60020);
      return new a[] { locala1, locala2 };
    }

    public final void ac(bi parambi)
    {
      try
      {
        AppMethodBeat.i(60019);
        a locala = this.oqF[0];
        if (this.fDH == locala.oqI)
        {
          this.fDH = this.oqF[1].oqH;
          com.tencent.mm.plugin.report.e.pXa.a(111L, 251L, 1L, false);
        }
        while (true)
        {
          if (!b.dnQ())
            ab.i("MicroMsg.MsgTable", "incMsgLocalId %d  ", new Object[] { Long.valueOf(this.fDH) });
          parambi.setMsgId(this.fDH);
          AppMethodBeat.o(60019);
          return;
          this.fDH += 1L;
        }
      }
      finally
      {
      }
      throw parambi;
    }

    public final boolean jk(long paramLong)
    {
      boolean bool = true;
      a[] arrayOfa = this.oqF;
      int i = arrayOfa.length;
      int j = 0;
      int k;
      if (j < i)
      {
        a locala = arrayOfa[j];
        if ((paramLong >= locala.oqH) && (paramLong <= locala.oqI))
        {
          k = 1;
          label53: if (k == 0)
            break label66;
        }
      }
      while (true)
      {
        return bool;
        k = 0;
        break label53;
        label66: j++;
        break;
        bool = false;
      }
    }

    public final void yx(int paramInt)
    {
      AppMethodBeat.i(60018);
      ab.i("MicroMsg.MsgTable", "summermsg setMsgLocalId [%d, %d]  regions[%d, %d] stack[%s]", new Object[] { Long.valueOf(this.fDH), Integer.valueOf(paramInt), Long.valueOf(this.oqF[0].oqI), Long.valueOf(this.oqF[1].oqH), bo.dpG() });
      if ((paramInt > this.oqF[0].oqI) && (paramInt < this.oqF[1].oqH))
      {
        ab.i("MicroMsg.MsgTable", "summermsg setMsgLocalId revised msgLocalId to %d", new Object[] { Long.valueOf(this.oqF[1].oqH) });
        this.fDH = this.oqF[1].oqH;
        com.tencent.mm.plugin.report.e.pXa.a(111L, 169L, 1L, false);
        AppMethodBeat.o(60018);
      }
      while (true)
      {
        return;
        this.fDH = paramInt;
        AppMethodBeat.o(60018);
      }
    }

    public static final class a
    {
      long oqH;
      long oqI;
    }
  }

  public static final class c
  {
    public long jMj;
    public String oqJ;
    public ArrayList<bi> oqK;
    public int oqL;
    public int oqM;
    public int oqN;
    public long oqO;
    public String talker;

    public c(String paramString1, String paramString2, bi parambi)
    {
      this(paramString1, paramString2, parambi, 0);
    }

    public c(String paramString1, String paramString2, bi parambi, int paramInt)
    {
      AppMethodBeat.i(60021);
      this.oqK = new ArrayList();
      this.oqM = 0;
      this.oqN = 0;
      this.oqO = 0L;
      this.jMj = -1L;
      this.talker = paramString1;
      this.oqJ = paramString2;
      this.oqL = paramInt;
      if (parambi != null)
        l = parambi.field_bizChatId;
      this.jMj = l;
      if (parambi != null)
        this.oqK.add(parambi);
      AppMethodBeat.o(60021);
    }

    public c(String paramString1, String paramString2, bi parambi, int paramInt, byte paramByte)
    {
      this(paramString1, paramString2, parambi, 0);
      this.oqN = paramInt;
    }

    public static boolean ad(bi parambi)
    {
      if ((parambi != null) && (parambi.field_isSend == 0) && (parambi.field_status == 3));
      for (boolean bool = true; ; bool = false)
        return bool;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.messenger.foundation.a.a.h
 * JD-Core Version:    0.6.2
 */