package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zk extends com.tencent.mm.bt.a
{
  public int weH;
  public String weI;
  public String weJ;
  public String weK;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28395);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.weH);
      if (this.weI != null)
        paramArrayOfObject.e(2, this.weI);
      if (this.weJ != null)
        paramArrayOfObject.e(3, this.weJ);
      if (this.weK != null)
        paramArrayOfObject.e(4, this.weK);
      AppMethodBeat.o(28395);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.weH) + 0;
        paramInt = i;
        if (this.weI != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.weI);
        i = paramInt;
        if (this.weJ != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.weJ);
        paramInt = i;
        if (this.weK != null)
          paramInt = i + e.a.a.b.b.a.f(4, this.weK);
        AppMethodBeat.o(28395);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28395);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        zk localzk = (zk)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28395);
          break;
        case 1:
          localzk.weH = locala.BTU.vd();
          AppMethodBeat.o(28395);
          paramInt = 0;
          break;
        case 2:
          localzk.weI = locala.BTU.readString();
          AppMethodBeat.o(28395);
          paramInt = 0;
          break;
        case 3:
          localzk.weJ = locala.BTU.readString();
          AppMethodBeat.o(28395);
          paramInt = 0;
          break;
        case 4:
          localzk.weK = locala.BTU.readString();
          AppMethodBeat.o(28395);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(28395);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.zk
 * JD-Core Version:    0.6.2
 */