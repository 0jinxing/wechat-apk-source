package oicq.wlogin_sdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import oicq.wlogin_sdk.tools.d;
import oicq.wlogin_sdk.tools.util;

public class a
{
  public int BUn;
  public int BUo;
  public byte[] BUt;
  public int BUz;
  int BVh;
  public int BVi;
  public int BVj;

  public a()
  {
    AppMethodBeat.i(96481);
    this.BUn = 128;
    this.BUo = 0;
    this.BVh = 0;
    this.BVi = 4;
    this.BVj = 0;
    this.BUt = new byte[this.BUn];
    this.BUz = 0;
    AppMethodBeat.o(96481);
  }

  private void J(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(96484);
    if (paramInt2 > this.BUn)
    {
      this.BUn = (paramInt2 + 128);
      this.BUt = new byte[this.BUn];
    }
    this.BUo = paramInt2;
    System.arraycopy(paramArrayOfByte, paramInt1, this.BUt, 0, paramInt2);
    this.BUz = util.af(paramArrayOfByte, paramInt1);
    this.BVj = (paramInt2 - this.BVi);
    AppMethodBeat.o(96484);
  }

  private static int K(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(96488);
    int i = paramArrayOfByte.length;
    while (true)
    {
      if (paramInt1 >= i);
      do
      {
        int j = -1;
        do
        {
          AppMethodBeat.o(96488);
          return j;
          if (paramInt1 + 2 > i)
            break;
          j = paramInt1;
        }
        while (util.af(paramArrayOfByte, paramInt1) == paramInt2);
        paramInt1 += 2;
      }
      while (paramInt1 + 2 > i);
      paramInt1 += util.af(paramArrayOfByte, paramInt1) + 2;
    }
  }

  private int d(byte[] paramArrayOfByte1, int paramInt, byte[] paramArrayOfByte2)
  {
    int i = -1;
    AppMethodBeat.i(96490);
    if (this.BVi >= paramInt)
    {
      AppMethodBeat.o(96490);
      paramInt = i;
    }
    while (true)
    {
      return paramInt;
      this.BVj = util.af(paramArrayOfByte1, 2);
      if (this.BVi + this.BVj > paramInt)
      {
        AppMethodBeat.o(96490);
        paramInt = i;
      }
      else
      {
        paramArrayOfByte2 = d.decrypt(paramArrayOfByte1, this.BVi, this.BVj, paramArrayOfByte2);
        if (paramArrayOfByte2 == null)
        {
          paramInt = -1015;
          AppMethodBeat.o(96490);
        }
        else
        {
          if (this.BVi + paramArrayOfByte2.length > this.BUn)
          {
            this.BUn = (this.BVi + paramArrayOfByte2.length);
            this.BUt = new byte[this.BUn];
          }
          this.BUo = 0;
          System.arraycopy(paramArrayOfByte1, 0, this.BUt, 0, this.BVi);
          this.BUo += this.BVi;
          System.arraycopy(paramArrayOfByte2, 0, this.BUt, this.BUo, paramArrayOfByte2.length);
          this.BUo += paramArrayOfByte2.length;
          this.BVj = paramArrayOfByte2.length;
          if (!emH().booleanValue())
          {
            paramInt = -1005;
            AppMethodBeat.o(96490);
          }
          else
          {
            AppMethodBeat.o(96490);
            paramInt = 0;
          }
        }
      }
    }
  }

  public final int L(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = -1;
    AppMethodBeat.i(96489);
    int j = K(paramArrayOfByte, paramInt1, this.BUz);
    if (j < 0)
    {
      AppMethodBeat.o(96489);
      paramInt1 = i;
    }
    while (true)
    {
      return paramInt1;
      paramInt1 = paramInt2 - (j - paramInt1);
      if (this.BVi >= paramInt1)
      {
        AppMethodBeat.o(96489);
        paramInt1 = i;
      }
      else
      {
        this.BVj = util.af(paramArrayOfByte, j + 2);
        if (this.BVi + this.BVj > paramInt1)
        {
          AppMethodBeat.o(96489);
          paramInt1 = i;
        }
        else
        {
          J(paramArrayOfByte, j, this.BVi + this.BVj);
          if (!emH().booleanValue())
          {
            paramInt1 = -1005;
            AppMethodBeat.o(96489);
          }
          else
          {
            paramInt1 = this.BVi + j + this.BVj;
            AppMethodBeat.o(96489);
          }
        }
      }
    }
  }

  public final void Vj(int paramInt)
  {
    AppMethodBeat.i(96485);
    util.N(this.BUt, this.BUo, paramInt);
    this.BUo += 2;
    util.N(this.BUt, this.BUo, 0);
    this.BUo += 2;
    AppMethodBeat.o(96485);
  }

  public final void ac(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(96487);
    if (paramInt > this.BUn - this.BVi)
    {
      this.BUn = (this.BVi + paramInt + 64);
      byte[] arrayOfByte = new byte[this.BUn];
      System.arraycopy(this.BUt, 0, arrayOfByte, 0, this.BUo);
      this.BUt = arrayOfByte;
    }
    this.BVj = paramInt;
    System.arraycopy(paramArrayOfByte, 0, this.BUt, this.BUo, paramInt);
    this.BUo += paramInt;
    AppMethodBeat.o(96487);
  }

  public final int b(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2)
  {
    AppMethodBeat.i(96491);
    int i = K(paramArrayOfByte1, paramInt1, this.BUz);
    if (i < 0)
    {
      paramInt1 = -1;
      AppMethodBeat.o(96491);
    }
    while (true)
    {
      return paramInt1;
      paramInt1 = paramInt2 - (i - paramInt1);
      byte[] arrayOfByte = new byte[paramInt1];
      System.arraycopy(paramArrayOfByte1, i, arrayOfByte, 0, paramInt1);
      paramInt1 = d(arrayOfByte, paramInt1, paramArrayOfByte2);
      AppMethodBeat.o(96491);
    }
  }

  public final byte[] emC()
  {
    AppMethodBeat.i(96482);
    byte[] arrayOfByte = new byte[this.BUo];
    System.arraycopy(this.BUt, 0, arrayOfByte, 0, this.BUo);
    AppMethodBeat.o(96482);
    return arrayOfByte;
  }

  public final byte[] emF()
  {
    AppMethodBeat.i(96483);
    byte[] arrayOfByte = new byte[this.BVj];
    System.arraycopy(this.BUt, this.BVi, arrayOfByte, 0, this.BVj);
    AppMethodBeat.o(96483);
    return arrayOfByte;
  }

  public final void emG()
  {
    AppMethodBeat.i(96486);
    util.N(this.BUt, 2, this.BUo - this.BVi);
    AppMethodBeat.o(96486);
  }

  public Boolean emH()
  {
    return Boolean.TRUE;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.a.a
 * JD-Core Version:    0.6.2
 */