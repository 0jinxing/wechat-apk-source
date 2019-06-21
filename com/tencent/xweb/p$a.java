package com.tencent.xweb;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum p$a
{
  int value;

  static
  {
    AppMethodBeat.i(3836);
    AME = new a("SMALLEST", 0, 50);
    AMF = new a("SMALLER", 1, 75);
    AMG = new a("NORMAL", 2, 100);
    AMH = new a("LARGER", 3, 150);
    AMI = new a("LARGEST", 4, 200);
    AMJ = new a[] { AME, AMF, AMG, AMH, AMI };
    AppMethodBeat.o(3836);
  }

  private p$a(int paramInt)
  {
    this.value = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.p.a
 * JD-Core Version:    0.6.2
 */