package com.google.b.f.b;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b
{
  final byte[][] bBJ;
  public final int height;
  public final int width;

  public b(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(57177);
    this.bBJ = new byte[paramInt2][paramInt1];
    this.width = paramInt1;
    this.height = paramInt2;
    AppMethodBeat.o(57177);
  }

  public final byte bH(int paramInt1, int paramInt2)
  {
    return this.bBJ[paramInt2][paramInt1];
  }

  public final void set(int paramInt1, int paramInt2, int paramInt3)
  {
    this.bBJ[paramInt2][paramInt1] = ((byte)(byte)paramInt3);
  }

  public final void set(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    byte[] arrayOfByte = this.bBJ[paramInt2];
    if (paramBoolean);
    for (paramInt2 = 1; ; paramInt2 = 0)
    {
      arrayOfByte[paramInt1] = ((byte)(byte)paramInt2);
      return;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(57178);
    Object localObject = new StringBuilder(this.width * 2 * this.height + 2);
    for (int i = 0; i < this.height; i++)
    {
      int j = 0;
      if (j < this.width)
      {
        switch (this.bBJ[i][j])
        {
        default:
          ((StringBuilder)localObject).append("  ");
        case 0:
        case 1:
        }
        while (true)
        {
          j++;
          break;
          ((StringBuilder)localObject).append(" 0");
          continue;
          ((StringBuilder)localObject).append(" 1");
        }
      }
      ((StringBuilder)localObject).append('\n');
    }
    localObject = ((StringBuilder)localObject).toString();
    AppMethodBeat.o(57178);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.b.f.b.b
 * JD-Core Version:    0.6.2
 */