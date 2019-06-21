package com.tencent.mm.j.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b extends com.tencent.mm.bt.a
{
  public int eoA;
  public String eoB;
  public String eoz;
  public String userName;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(59616);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.userName != null)
        paramArrayOfObject.e(1, this.userName);
      if (this.eoz != null)
        paramArrayOfObject.e(2, this.eoz);
      paramArrayOfObject.iz(3, this.eoA);
      if (this.eoB != null)
        paramArrayOfObject.e(4, this.eoB);
      AppMethodBeat.o(59616);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.userName == null)
        break label400;
    label400: for (paramInt = e.a.a.b.b.a.f(1, this.userName) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.eoz != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.eoz);
      i += e.a.a.b.b.a.bs(3, this.eoA);
      paramInt = i;
      if (this.eoB != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.eoB);
      AppMethodBeat.o(59616);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(59616);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        b localb = (b)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(59616);
          break;
        case 1:
          localb.userName = locala.BTU.readString();
          AppMethodBeat.o(59616);
          paramInt = i;
          break;
        case 2:
          localb.eoz = locala.BTU.readString();
          AppMethodBeat.o(59616);
          paramInt = i;
          break;
        case 3:
          localb.eoA = locala.BTU.vd();
          AppMethodBeat.o(59616);
          paramInt = i;
          break;
        case 4:
          localb.eoB = locala.BTU.readString();
          AppMethodBeat.o(59616);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(59616);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.j.a.a.b
 * JD-Core Version:    0.6.2
 */