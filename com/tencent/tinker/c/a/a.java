package com.tencent.tinker.c.a;

import com.tencent.tinker.a.a.i.e;
import com.tencent.tinker.a.a.r;
import com.tencent.tinker.a.a.s;
import com.tencent.tinker.a.a.t;
import com.tencent.tinker.a.a.t.a;
import com.tencent.tinker.a.a.u;
import com.tencent.tinker.c.a.a.a.j;
import com.tencent.tinker.c.a.a.a.l;
import com.tencent.tinker.c.a.a.a.m;
import com.tencent.tinker.c.a.a.a.o;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class a
{
  private com.tencent.tinker.c.a.a.a.i<com.tencent.tinker.a.a.a> AzA;
  private com.tencent.tinker.c.a.a.a.i<com.tencent.tinker.a.a.k> AzB;
  private com.tencent.tinker.c.a.a.a.i<com.tencent.tinker.a.a.d> AzC;
  private final com.tencent.tinker.a.a.i Azk;
  private final com.tencent.tinker.a.a.i Azl;
  private final com.tencent.tinker.c.a.b.a Azm;
  private final com.tencent.tinker.c.a.c.c Azn;
  private com.tencent.tinker.c.a.a.a.i<s> Azo;
  private com.tencent.tinker.c.a.a.a.i<Integer> Azp;
  private com.tencent.tinker.c.a.a.a.i<r> Azq;
  private com.tencent.tinker.c.a.a.a.i<com.tencent.tinker.a.a.n> Azr;
  private com.tencent.tinker.c.a.a.a.i<com.tencent.tinker.a.a.p> Azs;
  private com.tencent.tinker.c.a.a.a.i<com.tencent.tinker.a.a.f> Azt;
  private com.tencent.tinker.c.a.a.a.i<u> Azu;
  private com.tencent.tinker.c.a.a.a.i<com.tencent.tinker.a.a.c> Azv;
  private com.tencent.tinker.c.a.a.a.i<com.tencent.tinker.a.a.b> Azw;
  private com.tencent.tinker.c.a.a.a.i<com.tencent.tinker.a.a.e> Azx;
  private com.tencent.tinker.c.a.a.a.i<com.tencent.tinker.a.a.g> Azy;
  private com.tencent.tinker.c.a.a.a.i<com.tencent.tinker.a.a.h> Azz;

  private a(com.tencent.tinker.a.a.i parami, com.tencent.tinker.c.a.b.a parama)
  {
    this.Azk = parami;
    this.Azm = parama;
    this.Azl = new com.tencent.tinker.a.a.i(parama.AAl);
    this.Azn = new com.tencent.tinker.c.a.c.c();
  }

  public a(InputStream paramInputStream1, InputStream paramInputStream2)
  {
    this(new com.tencent.tinker.a.a.i(paramInputStream1), new com.tencent.tinker.c.a.b.a(paramInputStream2));
  }

  public final void b(OutputStream paramOutputStream)
  {
    int i = 0;
    Object localObject1 = this.Azk.rs(false);
    if (localObject1 == null)
      throw new IOException("failed to compute old dex's signature.");
    if (this.Azm == null)
      throw new IllegalArgumentException("patch file is null.");
    Object localObject2 = this.Azm.AAF;
    if (com.tencent.tinker.a.a.b.c.o((byte[])localObject1, (byte[])localObject2) != 0)
      throw new IOException(String.format("old dex signature mismatch! expected: %s, actual: %s", new Object[] { Arrays.toString((byte[])localObject1), Arrays.toString((byte[])localObject2) }));
    localObject1 = this.Azl.AxY;
    ((t)localObject1).Ays.off = 0;
    ((t)localObject1).Ays.size = 1;
    ((t)localObject1).Ayz.size = 1;
    ((t)localObject1).Ayt.off = this.Azm.AAn;
    ((t)localObject1).Ayu.off = this.Azm.AAo;
    ((t)localObject1).AyA.off = this.Azm.AAu;
    ((t)localObject1).Ayv.off = this.Azm.AAp;
    ((t)localObject1).Ayw.off = this.Azm.AAq;
    ((t)localObject1).Ayx.off = this.Azm.AAr;
    ((t)localObject1).Ayy.off = this.Azm.AAs;
    ((t)localObject1).Ayz.off = this.Azm.AAt;
    ((t)localObject1).AyF.off = this.Azm.AAz;
    ((t)localObject1).AyH.off = this.Azm.AAB;
    ((t)localObject1).AyC.off = this.Azm.AAw;
    ((t)localObject1).AyB.off = this.Azm.AAv;
    ((t)localObject1).AyJ.off = this.Azm.AAE;
    ((t)localObject1).AyI.off = this.Azm.AAD;
    ((t)localObject1).AyG.off = this.Azm.AAA;
    ((t)localObject1).AyE.off = this.Azm.AAy;
    ((t)localObject1).AyD.off = this.Azm.AAx;
    ((t)localObject1).fileSize = this.Azm.AAl;
    Arrays.sort(((t)localObject1).AyK);
    ((t)localObject1).dRV();
    this.Azo = new com.tencent.tinker.c.a.a.a.n(this.Azm, this.Azk, this.Azl, this.Azn);
    this.Azp = new o(this.Azm, this.Azk, this.Azl, this.Azn);
    this.Azq = new l(this.Azm, this.Azk, this.Azl, this.Azn);
    this.Azr = new j(this.Azm, this.Azk, this.Azl, this.Azn);
    this.Azs = new com.tencent.tinker.c.a.a.a.k(this.Azm, this.Azk, this.Azl, this.Azn);
    this.Azt = new com.tencent.tinker.c.a.a.a.f(this.Azm, this.Azk, this.Azl, this.Azn);
    this.Azu = new com.tencent.tinker.c.a.a.a.p(this.Azm, this.Azk, this.Azl, this.Azn);
    this.Azv = new com.tencent.tinker.c.a.a.a.b(this.Azm, this.Azk, this.Azl, this.Azn);
    this.Azw = new com.tencent.tinker.c.a.a.a.c(this.Azm, this.Azk, this.Azl, this.Azn);
    this.Azx = new com.tencent.tinker.c.a.a.a.e(this.Azm, this.Azk, this.Azl, this.Azn);
    this.Azy = new com.tencent.tinker.c.a.a.a.g(this.Azm, this.Azk, this.Azl, this.Azn);
    this.Azz = new com.tencent.tinker.c.a.a.a.h(this.Azm, this.Azk, this.Azl, this.Azn);
    this.AzA = new com.tencent.tinker.c.a.a.a.a(this.Azm, this.Azk, this.Azl, this.Azn);
    this.AzB = new m(this.Azm, this.Azk, this.Azl, this.Azn);
    this.AzC = new com.tencent.tinker.c.a.a.a.d(this.Azm, this.Azk, this.Azl, this.Azn);
    this.Azo.execute();
    this.Azp.execute();
    this.Azu.execute();
    this.Azq.execute();
    this.Azr.execute();
    this.Azs.execute();
    this.AzA.execute();
    this.Azw.execute();
    this.Azv.execute();
    this.AzC.execute();
    this.Azz.execute();
    this.Azy.execute();
    this.Azx.execute();
    this.AzB.execute();
    this.Azt.execute();
    localObject2 = this.Azl.Rm(((t)localObject1).Ays.off);
    ((i.e)localObject2).write(("dex\n" + "035" + "").getBytes("UTF-8"));
    ((i.e)localObject2).writeInt(((t)localObject1).gai);
    ((i.e)localObject2).write(((t)localObject1).nTL);
    ((i.e)localObject2).writeInt(((t)localObject1).fileSize);
    ((i.e)localObject2).writeInt(112);
    ((i.e)localObject2).writeInt(305419896);
    ((i.e)localObject2).writeInt(((t)localObject1).AyL);
    ((i.e)localObject2).writeInt(((t)localObject1).AyM);
    ((i.e)localObject2).writeInt(((t)localObject1).Ayz.off);
    ((i.e)localObject2).writeInt(((t)localObject1).Ayt.size);
    if (((t)localObject1).Ayt.exists())
    {
      j = ((t)localObject1).Ayt.off;
      ((i.e)localObject2).writeInt(j);
      ((i.e)localObject2).writeInt(((t)localObject1).Ayu.size);
      if (!((t)localObject1).Ayu.exists())
        break label1317;
      j = ((t)localObject1).Ayu.off;
      label1087: ((i.e)localObject2).writeInt(j);
      ((i.e)localObject2).writeInt(((t)localObject1).Ayv.size);
      if (!((t)localObject1).Ayv.exists())
        break label1323;
      j = ((t)localObject1).Ayv.off;
      label1125: ((i.e)localObject2).writeInt(j);
      ((i.e)localObject2).writeInt(((t)localObject1).Ayw.size);
      if (!((t)localObject1).Ayw.exists())
        break label1329;
      j = ((t)localObject1).Ayw.off;
      label1163: ((i.e)localObject2).writeInt(j);
      ((i.e)localObject2).writeInt(((t)localObject1).Ayx.size);
      if (!((t)localObject1).Ayx.exists())
        break label1335;
    }
    label1317: label1323: label1329: label1335: for (int j = ((t)localObject1).Ayx.off; ; j = 0)
    {
      ((i.e)localObject2).writeInt(j);
      ((i.e)localObject2).writeInt(((t)localObject1).Ayy.size);
      j = i;
      if (((t)localObject1).Ayy.exists())
        j = ((t)localObject1).Ayy.off;
      ((i.e)localObject2).writeInt(j);
      ((i.e)localObject2).writeInt(((t)localObject1).lgV);
      ((i.e)localObject2).writeInt(((t)localObject1).AyN);
      ((t)localObject1).b(this.Azl.Rm(((t)localObject1).Ayz.off));
      this.Azl.dRw();
      paramOutputStream.write(this.Azl.aEY.array());
      paramOutputStream.flush();
      return;
      j = 0;
      break;
      j = 0;
      break label1087;
      j = 0;
      break label1125;
      j = 0;
      break label1163;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.c.a.a
 * JD-Core Version:    0.6.2
 */