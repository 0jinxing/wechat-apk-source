package oicq.wlogin_sdk.request;

import com.tencent.matrix.trace.core.AppMethodBeat;
import oicq.wlogin_sdk.a.a;
import oicq.wlogin_sdk.a.aa;
import oicq.wlogin_sdk.a.ae;
import oicq.wlogin_sdk.a.ag;
import oicq.wlogin_sdk.a.ah;
import oicq.wlogin_sdk.a.aj;
import oicq.wlogin_sdk.a.an;
import oicq.wlogin_sdk.a.b;
import oicq.wlogin_sdk.a.c;
import oicq.wlogin_sdk.a.f;
import oicq.wlogin_sdk.a.h;
import oicq.wlogin_sdk.a.k;
import oicq.wlogin_sdk.a.r;
import oicq.wlogin_sdk.a.y;
import oicq.wlogin_sdk.tools.util;

public final class j extends d
{
  public j(i parami)
  {
    this.BUz = 2064;
    this.BUA = 9;
    this.BUC = parami;
  }

  public final byte[] a(long paramLong, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt1, int paramInt2, byte[] paramArrayOfByte3)
  {
    AppMethodBeat.i(96442);
    int i = this.BUC.BUM;
    this.BUC._uin = paramLong;
    byte[] arrayOfByte1 = super.cE(paramArrayOfByte2);
    if (arrayOfByte1 == null)
    {
      paramArrayOfByte1 = null;
      AppMethodBeat.o(96442);
      return paramArrayOfByte1;
    }
    paramArrayOfByte2 = this.BUC.BUN;
    byte[] arrayOfByte2 = this.BUC.BUH.emF();
    byte[] arrayOfByte3 = this.BUC.BUR;
    Object localObject1 = new an();
    Object localObject2 = new b();
    Object localObject3 = new h();
    Object localObject4 = new r();
    Object localObject5 = new c();
    Object localObject6 = new oicq.wlogin_sdk.a.i();
    Object localObject7 = new oicq.wlogin_sdk.a.j();
    Object localObject8 = new k();
    f localf = new f();
    y localy = new y();
    aa localaa = new aa();
    ae localae = new ae();
    ag localag = new ag();
    Object localObject9 = new ah();
    aj localaj = new aj();
    localObject1 = ((an)localObject1).aj(i, paramLong);
    localObject2 = ((b)localObject2).g(paramLong, paramArrayOfByte1);
    this.BUC.BVd = super.cD(arrayOfByte1);
    int j = arrayOfByte1.length;
    if (((a)localObject3).BVi + j > ((a)localObject3).BUn)
    {
      ((a)localObject3).BUn = (((a)localObject3).BVi + j + 128);
      paramArrayOfByte1 = new byte[((a)localObject3).BUn];
      System.arraycopy(((a)localObject3).BUt, 0, paramArrayOfByte1, 0, ((a)localObject3).BVi);
      ((a)localObject3).BUt = paramArrayOfByte1;
    }
    ((a)localObject3).BUo = (((a)localObject3).BVi + j);
    System.arraycopy(arrayOfByte1, 0, ((a)localObject3).BUt, ((a)localObject3).BVi, j);
    ((a)localObject3).BVj = j;
    util.N(((a)localObject3).BUt, 0, ((a)localObject3).BUz);
    util.N(((a)localObject3).BUt, 2, ((a)localObject3).BVj);
    localObject3 = ((a)localObject3).emC();
    util.jh("req2 a1:", util.cO((byte[])localObject3));
    localObject5 = ((c)localObject5).Vk(i);
    localObject6 = ((oicq.wlogin_sdk.a.i)localObject6).emI();
    localObject4 = ((r)localObject4).iB(paramInt1, paramInt2);
    localObject9 = ((ah)localObject9).cK(this.BUC.BUN);
    if (paramArrayOfByte3.length > 0)
      paramArrayOfByte1 = ((oicq.wlogin_sdk.a.j)localObject7).cH(paramArrayOfByte3);
    for (paramInt1 = 8; ; paramInt1 = 7)
    {
      if (paramArrayOfByte2.length > 0);
      for (paramArrayOfByte2 = ((k)localObject8).cI(paramArrayOfByte2); ; paramArrayOfByte2 = new byte[0])
      {
        localObject7 = util.emL();
        localObject8 = util.emM();
        paramInt2 = this.BUC.BUQ;
        arrayOfByte1 = this.BUC.BUP;
        paramArrayOfByte3 = this.BUC.BUS;
        paramArrayOfByte3 = localag.a(paramArrayOfByte2, localy.a((byte[])localObject7, (byte[])localObject8, paramInt2, arrayOfByte1, new byte[0], paramArrayOfByte3), localaa.a(this.BUC.BUY, this.BUC.BUZ, this.BUC.BVa, this.BUC.BUW, this.BUC.BUN), localaj.p(this.BUC.BUU, this.BUC.BUV), this.BUC.BUE);
        arrayOfByte3 = localae.cJ(arrayOfByte3);
        paramInt1 = paramInt1 + 1 + 1;
        if (arrayOfByte2.length > 0)
        {
          paramArrayOfByte2 = localf.cG(arrayOfByte2);
          paramInt1++;
        }
        while (true)
        {
          arrayOfByte2 = new byte[localObject1.length + localObject2.length + localObject3.length + localObject4.length + localObject5.length + localObject6.length + paramArrayOfByte1.length + paramArrayOfByte3.length + paramArrayOfByte2.length + arrayOfByte3.length + 0 + localObject9.length];
          System.arraycopy(localObject1, 0, arrayOfByte2, 0, localObject1.length);
          paramInt2 = localObject1.length + 0;
          System.arraycopy(localObject2, 0, arrayOfByte2, paramInt2, localObject2.length);
          paramInt2 += localObject2.length;
          System.arraycopy(localObject3, 0, arrayOfByte2, paramInt2, localObject3.length);
          paramInt2 += localObject3.length;
          System.arraycopy(localObject4, 0, arrayOfByte2, paramInt2, localObject4.length);
          paramInt2 += localObject4.length;
          System.arraycopy(localObject5, 0, arrayOfByte2, paramInt2, localObject5.length);
          paramInt2 += localObject5.length;
          System.arraycopy(localObject6, 0, arrayOfByte2, paramInt2, localObject6.length);
          paramInt2 += localObject6.length;
          System.arraycopy(paramArrayOfByte1, 0, arrayOfByte2, paramInt2, paramArrayOfByte1.length);
          paramInt2 += paramArrayOfByte1.length;
          System.arraycopy(paramArrayOfByte3, 0, arrayOfByte2, paramInt2, paramArrayOfByte3.length);
          paramInt2 = paramArrayOfByte3.length + paramInt2;
          System.arraycopy(arrayOfByte3, 0, arrayOfByte2, paramInt2, arrayOfByte3.length);
          paramInt2 += arrayOfByte3.length;
          System.arraycopy(new byte[0], 0, arrayOfByte2, paramInt2, 0);
          paramInt2 += 0;
          System.arraycopy(paramArrayOfByte2, 0, arrayOfByte2, paramInt2, paramArrayOfByte2.length);
          System.arraycopy(localObject9, 0, arrayOfByte2, paramArrayOfByte2.length + paramInt2, localObject9.length);
          paramArrayOfByte1 = super.G(arrayOfByte2, this.BUA, paramInt1);
          a(this.BUu, this.BUz, paramLong, this.BUw, this.BUx, i, this.BUy, paramArrayOfByte1);
          paramArrayOfByte1 = super.emC();
          AppMethodBeat.o(96442);
          break;
          paramArrayOfByte2 = new byte[0];
        }
      }
      paramArrayOfByte1 = new byte[0];
    }
  }

  public final byte[] a(long paramLong, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, int paramInt1, int paramInt2, byte[] paramArrayOfByte4)
  {
    AppMethodBeat.i(96441);
    int i = this.BUC.BUM;
    this.BUC._uin = paramLong;
    util.jh("IMEI", util.cO(this.BUC.BUN));
    byte[] arrayOfByte1 = this.BUC.BUE;
    byte[] arrayOfByte2 = this.BUC.BUN;
    byte[] arrayOfByte3 = this.BUC.BUH.emF();
    byte[] arrayOfByte4 = this.BUC.BUR;
    Object localObject1 = new an();
    Object localObject2 = new b();
    Object localObject3 = new h();
    Object localObject4 = new r();
    c localc = new c();
    Object localObject5 = new oicq.wlogin_sdk.a.i();
    Object localObject6 = new oicq.wlogin_sdk.a.j();
    Object localObject7 = new k();
    Object localObject8 = new f();
    y localy = new y();
    aa localaa = new aa();
    Object localObject9 = new ae();
    ag localag = new ag();
    Object localObject10 = new ah();
    aj localaj = new aj();
    localObject1 = ((an)localObject1).aj(i, paramLong);
    localObject2 = ((b)localObject2).g(paramLong, paramArrayOfByte1);
    paramArrayOfByte3 = ((h)localObject3).a(i, paramLong, paramArrayOfByte2, paramArrayOfByte1, paramArrayOfByte3, arrayOfByte1, this.BUC.BUZ, this.BUC.BUN);
    this.BUC.BVd = super.cD(((a)localObject3).emF());
    localObject3 = localc.Vk(i);
    localObject5 = ((oicq.wlogin_sdk.a.i)localObject5).emI();
    localObject4 = ((r)localObject4).iB(paramInt1, paramInt2);
    localObject10 = ((ah)localObject10).cK(this.BUC.BUN);
    paramInt1 = 7;
    if (paramArrayOfByte4.length > 0)
    {
      paramArrayOfByte1 = ((oicq.wlogin_sdk.a.j)localObject6).cH(paramArrayOfByte4);
      paramInt1 = 8;
    }
    while (true)
    {
      if (arrayOfByte2.length > 0);
      for (paramArrayOfByte2 = ((k)localObject7).cI(arrayOfByte2); ; paramArrayOfByte2 = new byte[0])
      {
        arrayOfByte2 = util.emL();
        localObject7 = util.emM();
        paramInt2 = this.BUC.BUQ;
        paramArrayOfByte4 = this.BUC.BUP;
        localObject6 = this.BUC.BUS;
        paramArrayOfByte4 = localag.a(paramArrayOfByte2, localy.a(arrayOfByte2, (byte[])localObject7, paramInt2, paramArrayOfByte4, new byte[0], (byte[])localObject6), localaa.a(this.BUC.BUY, this.BUC.BUZ, this.BUC.BVa, this.BUC.BUW, this.BUC.BUN), localaj.p(this.BUC.BUU, this.BUC.BUV), this.BUC.BUE);
        localObject9 = ((ae)localObject9).cJ(arrayOfByte4);
        paramInt1 = paramInt1 + 1 + 1;
        if (arrayOfByte3.length > 0)
        {
          paramArrayOfByte2 = ((f)localObject8).cG(arrayOfByte3);
          paramInt1++;
        }
        while (true)
        {
          localObject8 = new byte[localObject1.length + localObject2.length + paramArrayOfByte3.length + localObject4.length + localObject3.length + localObject5.length + paramArrayOfByte1.length + paramArrayOfByte4.length + paramArrayOfByte2.length + localObject9.length + 0 + localObject10.length];
          System.arraycopy(localObject1, 0, localObject8, 0, localObject1.length);
          paramInt2 = localObject1.length + 0;
          System.arraycopy(localObject2, 0, localObject8, paramInt2, localObject2.length);
          paramInt2 += localObject2.length;
          System.arraycopy(paramArrayOfByte3, 0, localObject8, paramInt2, paramArrayOfByte3.length);
          paramInt2 += paramArrayOfByte3.length;
          System.arraycopy(localObject4, 0, localObject8, paramInt2, localObject4.length);
          paramInt2 += localObject4.length;
          System.arraycopy(localObject3, 0, localObject8, paramInt2, localObject3.length);
          paramInt2 += localObject3.length;
          System.arraycopy(localObject5, 0, localObject8, paramInt2, localObject5.length);
          paramInt2 += localObject5.length;
          System.arraycopy(paramArrayOfByte1, 0, localObject8, paramInt2, paramArrayOfByte1.length);
          paramInt2 += paramArrayOfByte1.length;
          System.arraycopy(paramArrayOfByte4, 0, localObject8, paramInt2, paramArrayOfByte4.length);
          paramInt2 = paramArrayOfByte4.length + paramInt2;
          System.arraycopy(localObject9, 0, localObject8, paramInt2, localObject9.length);
          paramInt2 += localObject9.length;
          System.arraycopy(new byte[0], 0, localObject8, paramInt2, 0);
          paramInt2 += 0;
          System.arraycopy(paramArrayOfByte2, 0, localObject8, paramInt2, paramArrayOfByte2.length);
          System.arraycopy(localObject10, 0, localObject8, paramArrayOfByte2.length + paramInt2, localObject10.length);
          paramArrayOfByte1 = super.G((byte[])localObject8, this.BUA, paramInt1);
          a(this.BUu, this.BUz, paramLong, this.BUw, this.BUx, i, this.BUy, paramArrayOfByte1);
          paramArrayOfByte1 = super.emC();
          AppMethodBeat.o(96441);
          return paramArrayOfByte1;
          paramArrayOfByte2 = new byte[0];
        }
      }
      paramArrayOfByte1 = new byte[0];
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.request.j
 * JD-Core Version:    0.6.2
 */