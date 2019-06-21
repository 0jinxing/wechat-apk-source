package com.tencent.mm.plugin.backup.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class p extends com.tencent.mm.bt.a
{
  public String ID;
  public long jBS;
  public int jBV;
  public int jBW;
  public int jBX;
  public long jBY;
  public long jBZ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(18063);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.ID == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ID");
        AppMethodBeat.o(18063);
        throw paramArrayOfObject;
      }
      if (this.ID != null)
        paramArrayOfObject.e(1, this.ID);
      paramArrayOfObject.iz(2, this.jBV);
      paramArrayOfObject.iz(3, this.jBW);
      paramArrayOfObject.iz(4, this.jBX);
      paramArrayOfObject.ai(5, this.jBS);
      paramArrayOfObject.ai(6, this.jBY);
      paramArrayOfObject.ai(7, this.jBZ);
      AppMethodBeat.o(18063);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.ID == null)
        break label566;
    label566: for (paramInt = e.a.a.b.b.a.f(1, this.ID) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.jBV) + e.a.a.b.b.a.bs(3, this.jBW) + e.a.a.b.b.a.bs(4, this.jBX) + e.a.a.b.b.a.o(5, this.jBS) + e.a.a.b.b.a.o(6, this.jBY) + e.a.a.b.b.a.o(7, this.jBZ);
      AppMethodBeat.o(18063);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.ID == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ID");
          AppMethodBeat.o(18063);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(18063);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        p localp = (p)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(18063);
          break;
        case 1:
          localp.ID = locala.BTU.readString();
          AppMethodBeat.o(18063);
          paramInt = i;
          break;
        case 2:
          localp.jBV = locala.BTU.vd();
          AppMethodBeat.o(18063);
          paramInt = i;
          break;
        case 3:
          localp.jBW = locala.BTU.vd();
          AppMethodBeat.o(18063);
          paramInt = i;
          break;
        case 4:
          localp.jBX = locala.BTU.vd();
          AppMethodBeat.o(18063);
          paramInt = i;
          break;
        case 5:
          localp.jBS = locala.BTU.ve();
          AppMethodBeat.o(18063);
          paramInt = i;
          break;
        case 6:
          localp.jBY = locala.BTU.ve();
          AppMethodBeat.o(18063);
          paramInt = i;
          break;
        case 7:
          localp.jBZ = locala.BTU.ve();
          AppMethodBeat.o(18063);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(18063);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.i.p
 * JD-Core Version:    0.6.2
 */