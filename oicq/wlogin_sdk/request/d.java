package oicq.wlogin_sdk.request;

import com.tencent.matrix.trace.core.AppMethodBeat;
import oicq.wlogin_sdk.a.a;
import oicq.wlogin_sdk.a.ab;
import oicq.wlogin_sdk.a.ac;
import oicq.wlogin_sdk.a.ad;
import oicq.wlogin_sdk.a.af;
import oicq.wlogin_sdk.a.ah;
import oicq.wlogin_sdk.a.ai;
import oicq.wlogin_sdk.a.ak;
import oicq.wlogin_sdk.a.al;
import oicq.wlogin_sdk.a.am;
import oicq.wlogin_sdk.a.ap;
import oicq.wlogin_sdk.a.e;
import oicq.wlogin_sdk.a.f;
import oicq.wlogin_sdk.a.g;
import oicq.wlogin_sdk.a.h;
import oicq.wlogin_sdk.a.j;
import oicq.wlogin_sdk.a.l;
import oicq.wlogin_sdk.a.m;
import oicq.wlogin_sdk.a.n;
import oicq.wlogin_sdk.a.o;
import oicq.wlogin_sdk.a.p;
import oicq.wlogin_sdk.a.q;
import oicq.wlogin_sdk.a.s;
import oicq.wlogin_sdk.a.t;
import oicq.wlogin_sdk.a.u;
import oicq.wlogin_sdk.a.v;
import oicq.wlogin_sdk.a.w;
import oicq.wlogin_sdk.a.x;
import oicq.wlogin_sdk.a.z;
import oicq.wlogin_sdk.tools.ErrMsg;
import oicq.wlogin_sdk.tools.util;

public class d
{
  protected static int BUv = 0;
  protected int BUA;
  byte BUB;
  protected i BUC;
  int BUn;
  int BUo;
  int BUp;
  int BUq;
  public int BUr;
  protected int BUs;
  protected byte[] BUt;
  protected int BUu;
  protected int BUw;
  protected int BUx;
  protected int BUy;
  protected int BUz;

  public d()
  {
    AppMethodBeat.i(96427);
    this.BUn = 4096;
    this.BUo = 0;
    this.BUp = 27;
    this.BUq = 0;
    this.BUr = 15;
    this.BUs = 0;
    this.BUt = new byte[this.BUn];
    this.BUu = 8001;
    this.BUw = 0;
    this.BUx = 0;
    this.BUy = 0;
    this.BUz = 0;
    this.BUA = 0;
    AppMethodBeat.o(96427);
  }

  final byte[] G(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(96431);
    byte[] arrayOfByte = new byte[paramArrayOfByte.length + 4];
    util.N(arrayOfByte, 0, paramInt1);
    util.N(arrayOfByte, 2, paramInt2);
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 4, paramArrayOfByte.length);
    arrayOfByte = oicq.wlogin_sdk.tools.d.a(arrayOfByte, arrayOfByte.length, this.BUC.BUG);
    paramArrayOfByte = new byte[arrayOfByte.length + this.BUC.BUG.length];
    System.arraycopy(this.BUC.BUG, 0, paramArrayOfByte, 0, this.BUC.BUG.length);
    System.arraycopy(arrayOfByte, 0, paramArrayOfByte, this.BUC.BUG.length, arrayOfByte.length);
    AppMethodBeat.o(96431);
    return paramArrayOfByte;
  }

  public final void H(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(96432);
    ai localai = new ai();
    if (localai.L(paramArrayOfByte, paramInt1, paramInt2) >= 0)
    {
      paramArrayOfByte = this.BUC.BVc;
      Object localObject = new byte[localai.BVQ];
      System.arraycopy(localai.BUt, localai.BVi + 6, localObject, 0, localai.BVQ);
      paramArrayOfByte.title = new String((byte[])localObject);
      localObject = this.BUC.BVc;
      paramArrayOfByte = new byte[localai.BVR];
      System.arraycopy(localai.BUt, localai.BVi + 8 + localai.BVQ, paramArrayOfByte, 0, localai.BVR);
      ((ErrMsg)localObject).message = new String(paramArrayOfByte);
      paramArrayOfByte = this.BUC.BVc;
      localObject = new byte[localai.BVS];
      System.arraycopy(localai.BUt, localai.BVi + 12 + localai.BVQ + localai.BVR, localObject, 0, localai.BVS);
      paramArrayOfByte.BVZ = new String((byte[])localObject);
      AppMethodBeat.o(96432);
    }
    while (true)
    {
      return;
      this.BUC.BVc.emK();
      AppMethodBeat.o(96432);
    }
  }

  public int I(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(96436);
    Object localObject1 = new f();
    Object localObject2 = new g();
    Object localObject3 = new s();
    int i;
    if ((this.BUz == 2064) && (this.BUA == 9))
    {
      i = 0;
      if (paramInt2 < 5)
      {
        paramInt1 = -1009;
        AppMethodBeat.o(96436);
      }
    }
    else
    {
      while (true)
      {
        return paramInt1;
        if ((this.BUz == 2064) && (this.BUA == 10))
        {
          i = 1;
          break;
        }
        if ((this.BUz == 2064) && (this.BUA == 2))
        {
          i = 2;
          break;
        }
        if ((this.BUz == 2064) && (this.BUA == 13))
        {
          i = 4;
          break;
        }
        paramInt1 = -1012;
        AppMethodBeat.o(96436);
      }
    }
    paramInt2 = ab(paramArrayOfByte, paramInt1 + 2);
    emD();
    int j = paramInt1 + 5;
    label326: long l1;
    o localo;
    p localp;
    l locall;
    q localq;
    t localt;
    Object localObject4;
    Object localObject5;
    Object localObject6;
    Object localObject8;
    Object localObject9;
    ad localad;
    Object localObject10;
    Object localObject11;
    Object localObject12;
    Object localObject13;
    byte[] arrayOfByte1;
    byte[] arrayOfByte2;
    byte[] arrayOfByte3;
    byte[] arrayOfByte4;
    byte[] arrayOfByte5;
    byte[] arrayOfByte6;
    label635: long l2;
    switch (paramInt2)
    {
    default:
      H(paramArrayOfByte, j, this.BUo - j - 1);
      paramInt1 = paramInt2;
    case 0:
      e locale;
      oicq.wlogin_sdk.a.d locald;
      m localm;
      j localj;
      Object localObject7;
      n localn;
      ab localab;
      ac localac;
      while (true)
      {
        AppMethodBeat.o(96436);
        break;
        if (i == 1)
          if (this.BUC.BUF == null)
          {
            paramInt1 = -1006;
            AppMethodBeat.o(96436);
            break;
          }
        for (paramInt1 = ((a)localObject3).b(paramArrayOfByte, j, this.BUo - j - 1, this.BUC.BUF); ; paramInt1 = ((a)localObject3).b(paramArrayOfByte, j, this.BUo - j - 1, this.BUC.BUE))
        {
          if (paramInt1 >= 0)
            break label326;
          util.awF("119 can not decrypt, ret=".concat(String.valueOf(paramInt1)));
          break;
        }
        l1 = 4294967295L;
        localo = new o();
        localp = new p();
        locall = new l();
        localq = new q();
        locale = new e();
        localt = new t();
        locald = new oicq.wlogin_sdk.a.d();
        localm = new m();
        localObject4 = new u();
        localObject5 = new w();
        localObject6 = new x();
        localj = new j();
        localObject7 = new h();
        localn = new n();
        localObject8 = new z();
        localObject9 = new v();
        localad = new ad();
        localab = new ab();
        localObject10 = new af();
        localObject11 = new ap();
        localObject12 = new ak();
        paramArrayOfByte = new al();
        localObject13 = new am();
        localObject2 = null;
        arrayOfByte1 = null;
        arrayOfByte2 = null;
        arrayOfByte3 = null;
        arrayOfByte4 = null;
        localObject1 = null;
        arrayOfByte5 = null;
        arrayOfByte6 = null;
        localac = new ac();
        localObject3 = ((a)localObject3).emF();
        paramInt2 = localObject3.length;
        localo.L((byte[])localObject3, 2, paramInt2);
        localp.L((byte[])localObject3, 2, paramInt2);
        locall.L((byte[])localObject3, 2, paramInt2);
        localq.L((byte[])localObject3, 2, paramInt2);
        paramInt1 = localt.L((byte[])localObject3, 2, paramInt2);
        if (paramInt1 >= 0)
          break label655;
        if (paramInt1 >= 0)
          break label1717;
        util.awF("parse 119 failed, ret=".concat(String.valueOf(paramInt1)));
      }
      label655: if (locale.L((byte[])localObject3, 2, paramInt2) >= 0)
        localObject1 = locale.emF();
      if (localj.L((byte[])localObject3, 2, paramInt2) >= 0)
        util.a(this.BUC._context, localj.emF());
      if (locald.L((byte[])localObject3, 2, paramInt2) >= 0)
        localObject2 = locald.emF();
      if (localm.L((byte[])localObject3, 2, paramInt2) >= 0)
        arrayOfByte1 = localm.emF();
      if (((a)localObject4).L((byte[])localObject3, 2, paramInt2) >= 0)
        arrayOfByte2 = ((a)localObject4).emF();
      if (((a)localObject5).L((byte[])localObject3, 2, paramInt2) >= 0)
        arrayOfByte3 = ((a)localObject5).emF();
      if (((a)localObject6).L((byte[])localObject3, 2, paramInt2) >= 0)
        arrayOfByte4 = ((a)localObject6).emF();
      if (((a)localObject8).L((byte[])localObject3, 2, paramInt2) >= 0)
      {
        arrayOfByte5 = new byte[((z)localObject8).BVH];
        System.arraycopy(((z)localObject8).BUt, ((z)localObject8).BVi + 2, arrayOfByte5, 0, arrayOfByte5.length);
        arrayOfByte6 = new byte[((z)localObject8).BVI];
        System.arraycopy(((z)localObject8).BUt, ((z)localObject8).BVi + 2 + ((z)localObject8).BVH + 2, arrayOfByte6, 0, arrayOfByte6.length);
      }
      if (paramArrayOfByte.L((byte[])localObject3, 2, paramInt2) >= 0)
      {
        localObject5 = new h();
        localObject4 = new n();
        localObject6 = new am();
        localObject8 = new ah();
        paramArrayOfByte = paramArrayOfByte.emF();
        paramInt1 = paramArrayOfByte.length;
        if (((a)localObject5).L(paramArrayOfByte, 2, paramInt1) < 0)
        {
          paramArrayOfByte = null;
          label944: if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0))
            break label1692;
          this.BUC.BVf = ((byte[])paramArrayOfByte.clone());
          util.jh("fast data:", util.cO(paramArrayOfByte));
        }
      }
      else
      {
        label977: paramArrayOfByte = new byte[7][0];
        if (localac.L((byte[])localObject3, 2, paramInt2) >= 0)
          paramArrayOfByte[0] = localac.emF();
        paramInt1 = localn.L((byte[])localObject3, 2, paramInt2);
        if ((((a)localObject7).L((byte[])localObject3, 2, paramInt2) >= 0) && (paramInt1 >= 0))
        {
          this.BUC.BUE = localn.emF();
          this.BUC.BVd = cD(((a)localObject7).emF());
          paramArrayOfByte[1] = ((byte[])this.BUC.BVd.clone());
        }
        if (localab.L((byte[])localObject3, 2, paramInt2) >= 0)
        {
          localObject7 = new byte[localab.BVK];
          System.arraycopy(localab.BUt, localab.BVi + 2, localObject7, 0, localObject7.length);
          paramArrayOfByte[2] = localObject7;
        }
        if (((a)localObject10).L((byte[])localObject3, 2, paramInt2) >= 0)
          paramArrayOfByte[3] = ((a)localObject10).emF();
        if (((a)localObject11).L((byte[])localObject3, 2, paramInt2) >= 0)
          paramArrayOfByte[4] = ((a)localObject11).emF();
        if (((a)localObject12).L((byte[])localObject3, 2, paramInt2) >= 0)
          paramArrayOfByte[5] = ((a)localObject12).emF();
        if (((a)localObject13).L((byte[])localObject3, 2, paramInt2) >= 0)
          paramArrayOfByte[6] = ((a)localObject13).emF();
        if (((a)localObject9).L((byte[])localObject3, 2, paramInt2) < 0)
          break label1834;
        if (this.BUC.BUL != -1L)
          break label1705;
        l2 = util.ag(((v)localObject9).BUt, ((v)localObject9).BVi);
        label1245: l1 = 0xFFFFFFFF & util.ag(((v)localObject9).BUt, ((v)localObject9).BVi + 4);
      }
      break;
    case 1:
    case 2:
    }
    while (true)
    {
      if ((localad.L((byte[])localObject3, 2, paramInt2) >= 0) && (localad.emJ() != 0));
      for (long l3 = localad.emJ(); ; l3 = 2160000L)
      {
        if (l3 < l2)
          l3 = l2;
        while (true)
        {
          localObject12 = this.BUC;
          long l4 = this.BUC._uin;
          long l5 = this.BUC.BUJ;
          long l6 = i.emE();
          long l7 = i.emE();
          long l8 = i.emE();
          localObject11 = new byte[2];
          System.arraycopy(localt.BUt, localt.BVi, localObject11, 0, 2);
          localObject9 = new byte[1];
          System.arraycopy(localt.BUt, localt.BVi + 2, localObject9, 0, 1);
          localObject13 = new byte[1];
          System.arraycopy(localt.BUt, localt.BVi + 2 + 1, localObject13, 0, 1);
          localObject10 = new byte[localt.BVF];
          System.arraycopy(localt.BUt, localt.BVi + 2 + 1 + 1 + 1, localObject10, 0, localt.BVF);
          ((i)localObject12).a(l4, l5, l1, l6, l2 + l7, l3 + l8, (byte[])localObject11, (byte[])localObject9, (byte[])localObject13, (byte[])localObject10, locall.emF(), localo.emF(), localq.emF(), localp.emF(), (byte[])localObject1, arrayOfByte1, (byte[])localObject2, arrayOfByte2, arrayOfByte3, arrayOfByte4, arrayOfByte5, arrayOfByte6, paramArrayOfByte);
          paramInt1 = 0;
          break label635;
          if (((a)localObject4).L(paramArrayOfByte, 2, paramInt1) < 0)
          {
            paramArrayOfByte = null;
            break label944;
          }
          if (((a)localObject6).L(paramArrayOfByte, 2, paramInt1) < 0)
          {
            paramArrayOfByte = null;
            break label944;
          }
          localObject5 = ((a)localObject5).emC();
          localObject4 = ((a)localObject4).emC();
          localObject6 = ((a)localObject6).emC();
          localObject8 = ((ah)localObject8).cK(this.BUC.BUN);
          paramArrayOfByte = new byte[localObject5.length + 3 + localObject4.length + localObject6.length + localObject8.length];
          paramArrayOfByte[0] = ((byte)64);
          util.N(paramArrayOfByte, 1, 4);
          System.arraycopy(localObject5, 0, paramArrayOfByte, 3, localObject5.length);
          paramInt1 = localObject5.length + 3;
          System.arraycopy(localObject4, 0, paramArrayOfByte, paramInt1, localObject4.length);
          paramInt1 = localObject4.length + paramInt1;
          System.arraycopy(localObject6, 0, paramArrayOfByte, paramInt1, localObject6.length);
          System.arraycopy(localObject8, 0, paramArrayOfByte, paramInt1 + localObject6.length, localObject8.length);
          break label944;
          label1692: this.BUC.BVf = new byte[0];
          break label977;
          label1705: l2 = this.BUC.BUL;
          break label1245;
          label1717: paramInt1 = 0;
          break;
          H(paramArrayOfByte, j, this.BUo - j - 1);
          paramInt1 = paramInt2;
          break;
          i = ((a)localObject1).L(paramArrayOfByte, j, this.BUo - j - 1);
          paramInt1 = i;
          if (i >= 0)
          {
            this.BUC.BUH = ((f)localObject1);
            i = ((a)localObject2).L(paramArrayOfByte, j, this.BUo - j - 1);
            paramInt1 = i;
            if (i >= 0)
            {
              this.BUC.BUI = ((g)localObject2);
              paramInt1 = paramInt2;
              break;
            }
          }
          break;
        }
      }
      label1834: l2 = 3600L;
    }
  }

  public final void a(int paramInt1, int paramInt2, long paramLong, int paramInt3, int paramInt4, int paramInt5, int paramInt6, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(96428);
    int i = paramArrayOfByte.length;
    int j = BUv + 1;
    BUv = j;
    this.BUo = 0;
    util.M(this.BUt, this.BUo, 2);
    this.BUo += 1;
    util.N(this.BUt, this.BUo, this.BUp + 2 + i);
    this.BUo += 2;
    util.N(this.BUt, this.BUo, paramInt1);
    this.BUo += 2;
    util.N(this.BUt, this.BUo, paramInt2);
    this.BUo += 2;
    util.N(this.BUt, this.BUo, j);
    this.BUo += 2;
    util.O(this.BUt, this.BUo, (int)paramLong);
    this.BUo += 4;
    util.M(this.BUt, this.BUo, 3);
    this.BUo += 1;
    util.M(this.BUt, this.BUo, 0);
    this.BUo += 1;
    util.M(this.BUt, this.BUo, paramInt3);
    this.BUo += 1;
    util.O(this.BUt, this.BUo, paramInt4);
    this.BUo += 4;
    util.O(this.BUt, this.BUo, paramInt5);
    this.BUo += 4;
    util.O(this.BUt, this.BUo, paramInt6);
    this.BUo += 4;
    if (this.BUo + i + 1 > this.BUn)
    {
      this.BUn = (this.BUo + i + 1 + 128);
      byte[] arrayOfByte = new byte[this.BUn];
      System.arraycopy(this.BUt, 0, arrayOfByte, 0, this.BUo);
      this.BUt = arrayOfByte;
    }
    System.arraycopy(paramArrayOfByte, 0, this.BUt, this.BUo, i);
    this.BUo = (i + this.BUo);
    util.M(this.BUt, this.BUo, 3);
    this.BUo += 1;
    AppMethodBeat.o(96428);
  }

  public final int aa(byte[] paramArrayOfByte, int paramInt)
  {
    int i = -1002;
    int j = 0;
    AppMethodBeat.i(96429);
    if (paramInt <= this.BUr + 2)
    {
      paramInt = -1009;
      AppMethodBeat.o(96429);
    }
    while (true)
    {
      return paramInt;
      this.BUs = (paramInt - this.BUr - 2);
      if (paramInt > this.BUn)
      {
        this.BUn = (paramInt + 128);
        this.BUt = new byte[this.BUn];
      }
      this.BUo = paramInt;
      System.arraycopy(paramArrayOfByte, 0, this.BUt, 0, paramInt);
      paramArrayOfByte = this.BUt;
      paramInt = this.BUr + 1;
      paramArrayOfByte = oicq.wlogin_sdk.tools.d.decrypt(paramArrayOfByte, paramInt, this.BUs, this.BUC.BUG);
      if (paramArrayOfByte == null);
      for (paramInt = -1002; ; paramInt = j)
      {
        if (paramInt >= 0)
          break label253;
        AppMethodBeat.o(96429);
        paramInt = i;
        break;
        this.BUs = paramArrayOfByte.length;
        if (paramArrayOfByte.length + this.BUr + 2 > this.BUn)
        {
          this.BUn = (paramArrayOfByte.length + this.BUr + 2);
          byte[] arrayOfByte = new byte[this.BUn];
          System.arraycopy(this.BUt, 0, arrayOfByte, 0, this.BUo);
          this.BUt = arrayOfByte;
        }
        this.BUo = 0;
        System.arraycopy(paramArrayOfByte, 0, this.BUt, paramInt, paramArrayOfByte.length);
        paramInt = this.BUo;
        int k = this.BUr;
        this.BUo = (paramArrayOfByte.length + (k + 2) + paramInt);
      }
      label253: paramInt = I(this.BUt, this.BUr + 1, this.BUs);
      AppMethodBeat.o(96429);
    }
  }

  public final int ab(byte[] paramArrayOfByte, int paramInt)
  {
    this.BUB = ((byte)paramArrayOfByte[paramInt]);
    return paramArrayOfByte[paramInt] & 0xFF;
  }

  public final byte[] cD(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(96434);
    if (paramArrayOfByte == null)
    {
      paramArrayOfByte = null;
      AppMethodBeat.o(96434);
    }
    while (true)
    {
      return paramArrayOfByte;
      byte[] arrayOfByte = new byte[paramArrayOfByte.length + this.BUC.BUE.length];
      System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, paramArrayOfByte.length);
      System.arraycopy(this.BUC.BUE, 0, arrayOfByte, paramArrayOfByte.length, this.BUC.BUE.length);
      AppMethodBeat.o(96434);
      paramArrayOfByte = arrayOfByte;
    }
  }

  public final byte[] cE(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(96435);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length < 16))
    {
      paramArrayOfByte = null;
      AppMethodBeat.o(96435);
    }
    while (true)
    {
      return paramArrayOfByte;
      byte[] arrayOfByte = (byte[])paramArrayOfByte.clone();
      int i = arrayOfByte.length - 16;
      paramArrayOfByte = new byte[i];
      System.arraycopy(arrayOfByte, 0, paramArrayOfByte, 0, i);
      this.BUC.BUE = new byte[16];
      System.arraycopy(arrayOfByte, i, this.BUC.BUE, 0, 16);
      AppMethodBeat.o(96435);
    }
  }

  public final byte[] emC()
  {
    AppMethodBeat.i(96430);
    byte[] arrayOfByte = new byte[this.BUo];
    System.arraycopy(this.BUt, 0, arrayOfByte, 0, this.BUo);
    AppMethodBeat.o(96430);
    return arrayOfByte;
  }

  public final void emD()
  {
    AppMethodBeat.i(96433);
    this.BUC.BVc.emK();
    AppMethodBeat.o(96433);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.request.d
 * JD-Core Version:    0.6.2
 */