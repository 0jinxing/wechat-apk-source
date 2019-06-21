package com.google.b.f.b;

import com.google.b.f.a.a;
import com.google.b.f.a.c;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class f
{
  com.google.b.f.a.b bBQ;
  a bBR;
  c bBS;
  int bBT = -1;
  public b bBU;

  public final String toString()
  {
    AppMethodBeat.i(57296);
    Object localObject = new StringBuilder(200);
    ((StringBuilder)localObject).append("<<\n");
    ((StringBuilder)localObject).append(" mode: ");
    ((StringBuilder)localObject).append(this.bBQ);
    ((StringBuilder)localObject).append("\n ecLevel: ");
    ((StringBuilder)localObject).append(this.bBR);
    ((StringBuilder)localObject).append("\n version: ");
    ((StringBuilder)localObject).append(this.bBS);
    ((StringBuilder)localObject).append("\n maskPattern: ");
    ((StringBuilder)localObject).append(this.bBT);
    if (this.bBU == null)
      ((StringBuilder)localObject).append("\n matrix: null\n");
    while (true)
    {
      ((StringBuilder)localObject).append(">>\n");
      localObject = ((StringBuilder)localObject).toString();
      AppMethodBeat.o(57296);
      return localObject;
      ((StringBuilder)localObject).append("\n matrix:\n");
      ((StringBuilder)localObject).append(this.bBU);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.b.f.b.f
 * JD-Core Version:    0.6.2
 */