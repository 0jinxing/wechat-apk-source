package com.tencent.tinker.c.a.b;

import com.tencent.tinker.a.a.b.c;
import com.tencent.tinker.a.a.b.d;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class a
{
  public static final byte[] jrm = { 68, 88, 68, 73, 70, 70 };
  public int AAA;
  public int AAB;
  public int AAD;
  public int AAE;
  public byte[] AAF;
  public final com.tencent.tinker.a.a.a.a AAj;
  private short AAk;
  public int AAl;
  private int AAm;
  public int AAn;
  public int AAo;
  public int AAp;
  public int AAq;
  public int AAr;
  public int AAs;
  public int AAt;
  public int AAu;
  public int AAv;
  public int AAw;
  public int AAx;
  public int AAy;
  public int AAz;

  public a(InputStream paramInputStream)
  {
    this.AAj = new com.tencent.tinker.a.a.a.a(ByteBuffer.wrap(d.y(paramInputStream)));
    paramInputStream = this.AAj.Rr(jrm.length);
    if (c.o(paramInputStream, jrm) != 0)
      throw new IllegalStateException("bad dex patch file magic: " + Arrays.toString(paramInputStream));
    this.AAk = this.AAj.aEY.getShort();
    if (c.b(this.AAk, (short)2) != 0)
      throw new IllegalStateException("bad dex patch file version: " + this.AAk + ", expected: 2");
    this.AAl = this.AAj.aEY.getInt();
    this.AAm = this.AAj.aEY.getInt();
    this.AAn = this.AAj.aEY.getInt();
    this.AAo = this.AAj.aEY.getInt();
    this.AAp = this.AAj.aEY.getInt();
    this.AAq = this.AAj.aEY.getInt();
    this.AAr = this.AAj.aEY.getInt();
    this.AAs = this.AAj.aEY.getInt();
    this.AAt = this.AAj.aEY.getInt();
    this.AAu = this.AAj.aEY.getInt();
    this.AAv = this.AAj.aEY.getInt();
    this.AAw = this.AAj.aEY.getInt();
    this.AAx = this.AAj.aEY.getInt();
    this.AAy = this.AAj.aEY.getInt();
    this.AAz = this.AAj.aEY.getInt();
    this.AAA = this.AAj.aEY.getInt();
    this.AAB = this.AAj.aEY.getInt();
    this.AAD = this.AAj.aEY.getInt();
    this.AAE = this.AAj.aEY.getInt();
    this.AAF = this.AAj.Rr(20);
    paramInputStream = this.AAj;
    int i = this.AAm;
    paramInputStream.aEY.position(i);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.c.a.b.a
 * JD-Core Version:    0.6.2
 */