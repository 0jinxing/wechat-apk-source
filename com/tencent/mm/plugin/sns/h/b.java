package com.tencent.mm.plugin.sns.h;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bau;
import java.util.LinkedList;

public final class b extends com.tencent.mm.bt.a
{
  public bau cNr;
  public int fDG;
  public String qQd;
  public int qQe;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(36823);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.cNr != null)
      {
        paramArrayOfObject.iy(1, this.cNr.computeSize());
        this.cNr.writeFields(paramArrayOfObject);
      }
      if (this.qQd != null)
        paramArrayOfObject.e(2, this.qQd);
      paramArrayOfObject.iz(3, this.fDG);
      paramArrayOfObject.iz(4, this.qQe);
      AppMethodBeat.o(36823);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.cNr == null)
        break label481;
    label481: for (paramInt = e.a.a.a.ix(1, this.cNr.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.qQd != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.qQd);
      paramInt = i + e.a.a.b.b.a.bs(3, this.fDG) + e.a.a.b.b.a.bs(4, this.qQe);
      AppMethodBeat.o(36823);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(36823);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        b localb = (b)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(36823);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bau();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((bau)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localb.cNr = ((bau)localObject1);
          }
          AppMethodBeat.o(36823);
          paramInt = i;
          break;
        case 2:
          localb.qQd = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(36823);
          paramInt = i;
          break;
        case 3:
          localb.fDG = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(36823);
          paramInt = i;
          break;
        case 4:
          localb.qQe = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(36823);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(36823);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.h.b
 * JD-Core Version:    0.6.2
 */