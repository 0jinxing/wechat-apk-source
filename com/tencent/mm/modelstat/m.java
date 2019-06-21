package com.tencent.mm.modelstat;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bb;
import com.tencent.mm.sdk.platformtools.bb.b;
import com.tencent.mm.sdk.platformtools.bb.c;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashSet;
import junit.framework.Assert;

public final class m extends com.tencent.mm.sdk.e.k
  implements bb.c<Integer, k>
{
  private static final String[] fTO = { "realMobileBytesIn", "realWifiBytesIn", "realMobileBytesOut", "realWifiBytesOut" };
  public static final String[] fnj = { "CREATE TABLE IF NOT EXISTS netstat ( id INTEGER PRIMARY KEY, peroid INT, textCountIn INT, textBytesIn INT, imageCountIn INT, imageBytesIn INT, voiceCountIn INT, voiceBytesIn INT, videoCountIn INT, videoBytesIn INT, mobileBytesIn INT, wifiBytesIn INT, sysMobileBytesIn INT, sysWifiBytesIn INT, textCountOut INT, textBytesOut INT, imageCountOut INT, imageBytesOut INT, voiceCountOut INT, voiceBytesOut INT, videoCountOut INT, videoBytesOut INT, mobileBytesOut INT, wifiBytesOut INT, sysMobileBytesOut INT, sysWifiBytesOut INT, reserved1 INT, reserved2 INT, reserved3 TEXT, realMobileBytesIn INT, realWifiBytesIn INT, realMobileBytesOut INT, realWifiBytesOut INT) ", "CREATE INDEX IF NOT EXISTS  statInfoIndex ON netstat ( peroid ) " };
  private long fTL;
  public bb<Integer, k> fTM;
  private long fTN;
  public h fni;

  public m(h paramh)
  {
    AppMethodBeat.i(78753);
    this.fni = paramh;
    this.fTM = new bb(this, g.RS().oAl.getLooper(), 30, 2);
    paramh = new HashSet();
    Object localObject1 = fTO;
    int j = localObject1.length;
    for (int k = 0; k < j; k++)
      paramh.add(localObject1[k]);
    localObject1 = this.fni.a("PRAGMA table_info(netstat);", null, 2);
    k = ((Cursor)localObject1).getColumnIndex("name");
    while (((Cursor)localObject1).moveToNext())
      paramh.remove(((Cursor)localObject1).getString(k));
    ((Cursor)localObject1).close();
    localObject1 = fTO;
    j = localObject1.length;
    for (k = i; k < j; k++)
    {
      Object localObject2 = localObject1[k];
      if (paramh.contains(localObject2))
      {
        localObject2 = "ALTER TABLE netstat ADD COLUMN " + (String)localObject2 + " INT;";
        this.fni.hY("netstat", (String)localObject2);
      }
    }
    this.fTN = System.currentTimeMillis();
    AppMethodBeat.o(78753);
  }

  public final void a(k paramk)
  {
    AppMethodBeat.i(78755);
    Assert.assertNotNull(paramk);
    long l = System.currentTimeMillis();
    if (paramk.fSZ <= 0)
      paramk.fSZ = ((int)(l / 86400000L));
    if (paramk.fSZ <= 0)
    {
      AppMethodBeat.o(78755);
      return;
    }
    k localk = md(paramk.fSZ);
    if ((localk != null) && (paramk.fSZ == localk.fSZ))
    {
      localk.bJt |= 1;
      paramk.fTa += localk.fTb;
      paramk.fTb += localk.fTb;
      paramk.fTc += localk.fTd;
      paramk.fTd += localk.fTd;
      paramk.fTe += localk.fTe;
      paramk.fTf += localk.fTf;
      paramk.fTg += localk.fTg;
      paramk.fTh += localk.fTh;
      paramk.fTi += localk.fTi;
      paramk.fTj += localk.fTj;
      paramk.fTk += localk.fTk;
      paramk.fTl += localk.fTl;
      paramk.fTm += localk.fTn;
      paramk.fTn += localk.fTn;
      paramk.fTo += localk.fTp;
      paramk.fTp += localk.fTp;
      paramk.fTq += localk.fTq;
      paramk.fTr += localk.fTr;
      paramk.fTs += localk.fTs;
      paramk.fTt += localk.fTt;
      paramk.fTu += localk.fTu;
      paramk.fTv += localk.fTv;
      paramk.fTw += localk.fTw;
      paramk.fTx += localk.fTx;
      paramk.fTy += localk.fTy;
      paramk.fTz += localk.fTz;
      paramk.fTA += localk.fTA;
      paramk.fTB += localk.fTB;
      paramk.id = localk.id;
      if (l - this.fTN > 300000L)
        ab.i("MicroMsg.NetStat", paramk.toString());
    }
    while (true)
    {
      this.fTN = l;
      b(paramk);
      AppMethodBeat.o(78755);
      break;
      paramk.bJt |= 2;
      paramk.id = -1;
      if (localk != null)
        ab.i("MicroMsg.NetStat", localk.toString());
      else
        ab.i("MicroMsg.NetStat", "NetStat started.");
    }
  }

  public final void a(bb.b<Integer, k> paramb)
  {
    AppMethodBeat.i(78761);
    int i = paramb.xBj;
    k localk = (k)paramb.values;
    int j;
    if ((localk != null) && (i == 1))
    {
      j = localk.fSZ;
      i = localk.id;
      if (j > 0)
      {
        paramb = new ContentValues();
        if ((localk.bJt & 0x2) != 0)
          paramb.put("peroid", Integer.valueOf(localk.fSZ));
        if ((localk.bJt & 0x4) != 0)
          paramb.put("textCountIn", Integer.valueOf(localk.fTa));
        if ((localk.bJt & 0x8) != 0)
          paramb.put("textBytesIn", Integer.valueOf(localk.fTb));
        if ((localk.bJt & 0x10) != 0)
          paramb.put("imageCountIn", Integer.valueOf(localk.fTc));
        if ((localk.bJt & 0x20) != 0)
          paramb.put("imageBytesIn", Integer.valueOf(localk.fTd));
        if ((localk.bJt & 0x40) != 0)
          paramb.put("voiceCountIn", Integer.valueOf(localk.fTe));
        if ((localk.bJt & 0x80) != 0)
          paramb.put("voiceBytesIn", Integer.valueOf(localk.fTf));
        if ((localk.bJt & 0x100) != 0)
          paramb.put("videoCountIn", Integer.valueOf(localk.fTg));
        if ((localk.bJt & 0x200) != 0)
          paramb.put("videoBytesIn", Integer.valueOf(localk.fTh));
        if ((localk.bJt & 0x400) != 0)
          paramb.put("mobileBytesIn", Integer.valueOf(localk.fTi));
        if ((localk.bJt & 0x800) != 0)
          paramb.put("wifiBytesIn", Integer.valueOf(localk.fTj));
        if ((localk.bJt & 0x1000) != 0)
          paramb.put("sysMobileBytesIn", Integer.valueOf(localk.fTk));
        if ((localk.bJt & 0x2000) != 0)
          paramb.put("sysWifiBytesIn", Integer.valueOf(localk.fTl));
        if ((localk.bJt & 0x4000) != 0)
          paramb.put("textCountOut", Integer.valueOf(localk.fTm));
        if ((localk.bJt & 0x8000) != 0)
          paramb.put("textBytesOut", Integer.valueOf(localk.fTn));
        if ((localk.bJt & 0x10000) != 0)
          paramb.put("imageCountOut", Integer.valueOf(localk.fTo));
        if ((localk.bJt & 0x20000) != 0)
          paramb.put("imageBytesOut", Integer.valueOf(localk.fTp));
        if ((localk.bJt & 0x40000) != 0)
          paramb.put("voiceCountOut", Integer.valueOf(localk.fTq));
        if ((localk.bJt & 0x80000) != 0)
          paramb.put("voiceBytesOut", Integer.valueOf(localk.fTr));
        if ((localk.bJt & 0x100000) != 0)
          paramb.put("videoCountOut", Integer.valueOf(localk.fTs));
        if ((localk.bJt & 0x200000) != 0)
          paramb.put("videoBytesOut", Integer.valueOf(localk.fTt));
        if ((localk.bJt & 0x400000) != 0)
          paramb.put("mobileBytesOut", Integer.valueOf(localk.fTu));
        if ((localk.bJt & 0x800000) != 0)
          paramb.put("wifiBytesOut", Integer.valueOf(localk.fTv));
        if ((localk.bJt & 0x1000000) != 0)
          paramb.put("sysMobileBytesOut", Integer.valueOf(localk.fTw));
        if ((localk.bJt & 0x2000000) != 0)
          paramb.put("sysWifiBytesOut", Integer.valueOf(localk.fTx));
        if ((localk.bJt & 0x4000000) != 0)
          paramb.put("realMobileBytesIn", Integer.valueOf(localk.fTy));
        if ((localk.bJt & 0x8000000) != 0)
          paramb.put("realWifiBytesIn", Integer.valueOf(localk.fTz));
        if ((localk.bJt & 0x10000000) != 0)
          paramb.put("realMobileBytesOut", Integer.valueOf(localk.fTA));
        if ((localk.bJt & 0x20000000) != 0)
          paramb.put("realWifiBytesOut", Integer.valueOf(localk.fTB));
        if (i < 0)
        {
          localk.id = ((int)this.fni.insert("netstat", "id", paramb));
          AppMethodBeat.o(78761);
        }
      }
    }
    while (true)
    {
      return;
      this.fni.update("netstat", paramb, "peroid=".concat(String.valueOf(j)), null);
      AppMethodBeat.o(78761);
    }
  }

  public final void akk()
  {
    AppMethodBeat.i(78757);
    int i = (int)(bo.dpB() / 86400000L);
    if (md(i) != null)
      AppMethodBeat.o(78757);
    while (true)
    {
      return;
      k localk = new k();
      localk.fSZ = i;
      localk.id = -1;
      b(localk);
      AppMethodBeat.o(78757);
    }
  }

  public final long akl()
  {
    AppMethodBeat.i(78758);
    this.fTM.pl(true);
    int i = (int)((bo.anU() - 1296000000L) / 86400000L);
    int j = (int)(bo.dpB() / 86400000L);
    Object localObject = "SELECT peroid FROM netstat  WHERE peroid > " + i + " order by peroid limit 1";
    localObject = this.fni.a((String)localObject, null, 2);
    if (((Cursor)localObject).moveToFirst())
      j = ((Cursor)localObject).getInt(((Cursor)localObject).getColumnIndex("peroid"));
    ((Cursor)localObject).close();
    long l = j;
    AppMethodBeat.o(78758);
    return l * 86400000L;
  }

  public final boolean akm()
  {
    boolean bool = false;
    AppMethodBeat.i(78760);
    if (this.fni.inTransaction())
    {
      ab.i("MicroMsg.NetStat", "summer preAppend inTransaction return false");
      AppMethodBeat.o(78760);
    }
    while (true)
    {
      return bool;
      this.fTL = this.fni.iV(Thread.currentThread().getId());
      if (this.fTL <= 0L)
      {
        ab.i("MicroMsg.NetStat", "summer preAppend ticket: " + this.fTL + " return false");
        AppMethodBeat.o(78760);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(78760);
      }
    }
  }

  public final void akn()
  {
    AppMethodBeat.i(78762);
    if (this.fTL > 0L)
      this.fni.mB(this.fTL);
    AppMethodBeat.o(78762);
  }

  public final boolean b(k paramk)
  {
    AppMethodBeat.i(78756);
    Assert.assertNotNull(paramk);
    if (paramk.fSZ > 0);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      bool = this.fTM.A(Integer.valueOf(paramk.fSZ), paramk);
      AppMethodBeat.o(78756);
      return bool;
    }
  }

  public final k md(int paramInt)
  {
    AppMethodBeat.i(78754);
    Object localObject1 = (k)this.fTM.get(Integer.valueOf(paramInt));
    Object localObject2;
    Object localObject3;
    if (localObject1 == null)
    {
      localObject2 = this.fni.a("netstat", null, "peroid = ".concat(String.valueOf(paramInt)), null, null, null, null, 2);
      localObject3 = localObject1;
      if (((Cursor)localObject2).moveToFirst())
      {
        localObject3 = new k();
        ((k)localObject3).d((Cursor)localObject2);
      }
      ((Cursor)localObject2).close();
      if (localObject3 != null)
        this.fTM.A(Integer.valueOf(paramInt), localObject3);
    }
    while (true)
    {
      AppMethodBeat.o(78754);
      return localObject3;
      localObject1 = this.fTM;
      localObject2 = new k();
      ((k)localObject2).bJt = 0;
      ((k)localObject2).id = 0;
      ((k)localObject2).fSZ = 0;
      ((k)localObject2).fTa = 0;
      ((k)localObject2).fTb = 0;
      ((k)localObject2).fTc = 0;
      ((k)localObject2).fTd = 0;
      ((k)localObject2).fTe = 0;
      ((k)localObject2).fTf = 0;
      ((k)localObject2).fTg = 0;
      ((k)localObject2).fTh = 0;
      ((k)localObject2).fTi = 0;
      ((k)localObject2).fTj = 0;
      ((k)localObject2).fTk = 0;
      ((k)localObject2).fTl = 0;
      ((k)localObject2).fTm = 0;
      ((k)localObject2).fTn = 0;
      ((k)localObject2).fTo = 0;
      ((k)localObject2).fTp = 0;
      ((k)localObject2).fTq = 0;
      ((k)localObject2).fTr = 0;
      ((k)localObject2).fTs = 0;
      ((k)localObject2).fTt = 0;
      ((k)localObject2).fTu = 0;
      ((k)localObject2).fTv = 0;
      ((k)localObject2).fTw = 0;
      ((k)localObject2).fTx = 0;
      ((k)localObject2).fTy = 0;
      ((k)localObject2).fTz = 0;
      ((k)localObject2).fTA = 0;
      ((k)localObject2).fTB = 0;
      ((bb)localObject1).A(Integer.valueOf(paramInt), localObject2);
      continue;
      localObject3 = localObject1;
      if (((k)localObject1).fSZ != paramInt)
        localObject3 = null;
    }
  }

  public final k me(int paramInt)
  {
    k localk = null;
    AppMethodBeat.i(78759);
    this.fTM.pl(true);
    Object localObject = "SELECT MAX( id), MAX( peroid), SUM( textCountIn), SUM( textBytesIn), SUM( imageCountIn), SUM( imageBytesIn), SUM( voiceCountIn), SUM( voiceBytesIn), SUM( videoCountIn), SUM( videoBytesIn), SUM( mobileBytesIn), SUM( wifiBytesIn), SUM( sysMobileBytesIn), SUM( sysWifiBytesIn), SUM( textCountOut), SUM( textBytesOut), SUM( imageCountOut), SUM( imageBytesOut), SUM( voiceCountOut), SUM( voiceBytesOut), SUM( videoCountOut), SUM( videoBytesOut), SUM( mobileBytesOut), SUM( wifiBytesOut), SUM( sysMobileBytesOut), SUM( sysWifiBytesOut ), SUM( realMobileBytesIn ), SUM( realWifiBytesIn ), SUM( realMobileBytesOut ), SUM( realWifiBytesOut ) FROM netstat WHERE peroid >= ".concat(String.valueOf(paramInt));
    localObject = this.fni.a((String)localObject, null, 2);
    if (((Cursor)localObject).moveToFirst())
    {
      localk = new k();
      localk.d((Cursor)localObject);
    }
    ((Cursor)localObject).close();
    AppMethodBeat.o(78759);
    return localk;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.m
 * JD-Core Version:    0.6.2
 */