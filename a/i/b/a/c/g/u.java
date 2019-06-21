package a.i.b.a.c.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

final class u extends d
{
  private static final int[] BAh;
  private final int BAi;
  private final d BAj;
  private final d BAk;
  private final int BAl;
  private final int BAm;
  private int puf;

  static
  {
    AppMethodBeat.i(121619);
    ArrayList localArrayList = new ArrayList();
    int i = 1;
    int j = 1;
    while (true)
    {
      int k = j;
      if (i <= 0)
        break;
      localArrayList.add(Integer.valueOf(i));
      j = i;
      i = k + i;
    }
    localArrayList.add(Integer.valueOf(2147483647));
    BAh = new int[localArrayList.size()];
    for (i = 0; i < BAh.length; i++)
      BAh[i] = ((Integer)localArrayList.get(i)).intValue();
    AppMethodBeat.o(121619);
  }

  private u(d paramd1, d paramd2)
  {
    AppMethodBeat.i(121605);
    this.puf = 0;
    this.BAj = paramd1;
    this.BAk = paramd2;
    this.BAl = paramd1.size();
    this.BAi = (this.BAl + paramd2.size());
    this.BAm = (Math.max(paramd1.ehT(), paramd2.ehT()) + 1);
    AppMethodBeat.o(121605);
  }

  static d a(d paramd1, d paramd2)
  {
    AppMethodBeat.i(121606);
    Object localObject;
    int i;
    if ((paramd1 instanceof u))
    {
      localObject = (u)paramd1;
      if (paramd2.size() == 0)
        break label282;
      if (paramd1.size() == 0)
        break label277;
      i = paramd1.size() + paramd2.size();
      if (i >= 128)
        break label66;
      paramd1 = b(paramd1, paramd2);
    }
    label277: label282: 
    while (true)
    {
      AppMethodBeat.o(121606);
      return paramd1;
      localObject = null;
      break;
      label66: if ((localObject != null) && (((u)localObject).BAk.size() + paramd2.size() < 128))
      {
        paramd1 = b(((u)localObject).BAk, paramd2);
        paramd1 = new u(((u)localObject).BAj, paramd1);
      }
      else if ((localObject != null) && (((u)localObject).BAj.ehT() > ((u)localObject).BAk.ehT()) && (((u)localObject).BAm > paramd2.ehT()))
      {
        paramd1 = new u(((u)localObject).BAk, paramd2);
        paramd1 = new u(((u)localObject).BAj, paramd1);
      }
      else
      {
        int j = Math.max(paramd1.ehT(), paramd2.ehT());
        if (i >= BAh[(j + 1)])
        {
          paramd1 = new u(paramd1, paramd2);
        }
        else
        {
          localObject = new u.a((byte)0);
          ((u.a)localObject).f(paramd1);
          ((u.a)localObject).f(paramd2);
          for (paramd2 = (d)((u.a)localObject).BAn.pop(); ; paramd2 = new u((d)((u.a)localObject).BAn.pop(), paramd2, (byte)0))
          {
            paramd1 = paramd2;
            if (((u.a)localObject).BAn.isEmpty())
              break;
          }
          paramd1 = paramd2;
        }
      }
    }
  }

  private static p b(d paramd1, d paramd2)
  {
    AppMethodBeat.i(121607);
    int i = paramd1.size();
    int j = paramd2.size();
    byte[] arrayOfByte = new byte[i + j];
    paramd1.f(arrayOfByte, 0, 0, i);
    paramd2.f(arrayOfByte, 0, i, j);
    paramd1 = new p(arrayOfByte);
    AppMethodBeat.o(121607);
    return paramd1;
  }

  protected final int aR(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(121612);
    if (paramInt2 + paramInt3 <= this.BAl)
    {
      paramInt1 = this.BAj.aR(paramInt1, paramInt2, paramInt3);
      AppMethodBeat.o(121612);
    }
    while (true)
    {
      return paramInt1;
      if (paramInt2 >= this.BAl)
      {
        paramInt1 = this.BAk.aR(paramInt1, paramInt2 - this.BAl, paramInt3);
        AppMethodBeat.o(121612);
      }
      else
      {
        int i = this.BAl - paramInt2;
        paramInt1 = this.BAj.aR(paramInt1, paramInt2, i);
        paramInt1 = this.BAk.aR(paramInt1, 0, paramInt3 - i);
        AppMethodBeat.o(121612);
      }
    }
  }

  protected final int aS(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(121615);
    if (paramInt2 + paramInt3 <= this.BAl)
    {
      paramInt1 = this.BAj.aS(paramInt1, paramInt2, paramInt3);
      AppMethodBeat.o(121615);
    }
    while (true)
    {
      return paramInt1;
      if (paramInt2 >= this.BAl)
      {
        paramInt1 = this.BAk.aS(paramInt1, paramInt2 - this.BAl, paramInt3);
        AppMethodBeat.o(121615);
      }
      else
      {
        int i = this.BAl - paramInt2;
        paramInt1 = this.BAj.aS(paramInt1, paramInt2, i);
        paramInt1 = this.BAk.aS(paramInt1, 0, paramInt3 - i);
        AppMethodBeat.o(121615);
      }
    }
  }

  final void b(OutputStream paramOutputStream, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(121609);
    if (paramInt1 + paramInt2 <= this.BAl)
    {
      this.BAj.b(paramOutputStream, paramInt1, paramInt2);
      AppMethodBeat.o(121609);
    }
    while (true)
    {
      return;
      if (paramInt1 >= this.BAl)
      {
        this.BAk.b(paramOutputStream, paramInt1 - this.BAl, paramInt2);
        AppMethodBeat.o(121609);
      }
      else
      {
        int i = this.BAl - paramInt1;
        this.BAj.b(paramOutputStream, paramInt1, i);
        this.BAk.b(paramOutputStream, 0, paramInt2 - i);
        AppMethodBeat.o(121609);
      }
    }
  }

  public final d.a ehP()
  {
    AppMethodBeat.i(121617);
    u.c localc = new u.c(this, (byte)0);
    AppMethodBeat.o(121617);
    return localc;
  }

  public final boolean ehQ()
  {
    boolean bool = false;
    AppMethodBeat.i(121611);
    int i = this.BAj.aR(0, 0, this.BAl);
    if (this.BAk.aR(i, 0, this.BAk.size()) == 0)
    {
      bool = true;
      AppMethodBeat.o(121611);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(121611);
    }
  }

  public final e ehR()
  {
    AppMethodBeat.i(121616);
    e locale = e.S(new u.d(this));
    AppMethodBeat.o(121616);
    return locale;
  }

  protected final int ehT()
  {
    return this.BAm;
  }

  protected final boolean ehU()
  {
    if (this.BAi >= BAh[this.BAm]);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  protected final int ehV()
  {
    return this.puf;
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(121613);
    boolean bool;
    if (paramObject == this)
    {
      bool = true;
      AppMethodBeat.o(121613);
    }
    while (true)
    {
      return bool;
      if (!(paramObject instanceof d))
      {
        bool = false;
        AppMethodBeat.o(121613);
      }
      else
      {
        paramObject = (d)paramObject;
        if (this.BAi != paramObject.size())
        {
          bool = false;
          AppMethodBeat.o(121613);
        }
        else if (this.BAi == 0)
        {
          bool = true;
          AppMethodBeat.o(121613);
        }
        else
        {
          if (this.puf == 0)
            break;
          i = paramObject.ehV();
          if ((i == 0) || (this.puf == i))
            break;
          bool = false;
          AppMethodBeat.o(121613);
        }
      }
    }
    int j = 0;
    u.b localb1 = new u.b(this, (byte)0);
    p localp = (p)localb1.next();
    int i = 0;
    u.b localb2 = new u.b(paramObject, (byte)0);
    paramObject = (p)localb2.next();
    int k = 0;
    while (true)
    {
      int m = localp.size() - j;
      int n = paramObject.size() - i;
      int i1 = Math.min(m, n);
      if (j == 0);
      for (bool = localp.a(paramObject, i, i1); ; bool = paramObject.a(localp, j, i1))
      {
        if (bool)
          break label236;
        bool = false;
        AppMethodBeat.o(121613);
        break;
      }
      label236: k += i1;
      if (k >= this.BAi)
      {
        if (k == this.BAi)
        {
          bool = true;
          AppMethodBeat.o(121613);
          break;
        }
        paramObject = new IllegalStateException();
        AppMethodBeat.o(121613);
        throw paramObject;
      }
      if (i1 == m)
      {
        j = 0;
        localp = (p)localb1.next();
      }
      while (true)
      {
        if (i1 != n)
          break label341;
        i = 0;
        paramObject = (p)localb2.next();
        break;
        j += i1;
      }
      label341: i += i1;
    }
  }

  protected final void g(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(121608);
    if (paramInt1 + paramInt3 <= this.BAl)
    {
      this.BAj.g(paramArrayOfByte, paramInt1, paramInt2, paramInt3);
      AppMethodBeat.o(121608);
    }
    while (true)
    {
      return;
      if (paramInt1 >= this.BAl)
      {
        this.BAk.g(paramArrayOfByte, paramInt1 - this.BAl, paramInt2, paramInt3);
        AppMethodBeat.o(121608);
      }
      else
      {
        int i = this.BAl - paramInt1;
        this.BAj.g(paramArrayOfByte, paramInt1, paramInt2, i);
        this.BAk.g(paramArrayOfByte, 0, paramInt2 + i, paramInt3 - i);
        AppMethodBeat.o(121608);
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(121614);
    int i = this.puf;
    int j = i;
    if (i == 0)
    {
      i = aS(this.BAi, 0, this.BAi);
      j = i;
      if (i == 0)
        j = 1;
      this.puf = j;
    }
    AppMethodBeat.o(121614);
    return j;
  }

  public final int size()
  {
    return this.BAi;
  }

  public final String toString(String paramString)
  {
    AppMethodBeat.i(121610);
    paramString = new String(toByteArray(), paramString);
    AppMethodBeat.o(121610);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.g.u
 * JD-Core Version:    0.6.2
 */