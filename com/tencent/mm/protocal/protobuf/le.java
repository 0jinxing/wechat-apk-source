package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class le extends com.tencent.mm.bt.a
{
  public String vOF;
  public int vOG;
  public String vOH;
  public int vOI;
  public LinkedList<jw> vOJ;

  public le()
  {
    AppMethodBeat.i(80029);
    this.vOJ = new LinkedList();
    AppMethodBeat.o(80029);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80030);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vOF != null)
        paramArrayOfObject.e(1, this.vOF);
      paramArrayOfObject.iz(2, this.vOG);
      if (this.vOH != null)
        paramArrayOfObject.e(3, this.vOH);
      paramArrayOfObject.iz(4, this.vOI);
      paramArrayOfObject.e(5, 8, this.vOJ);
      AppMethodBeat.o(80030);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vOF == null)
        break label531;
    label531: for (paramInt = e.a.a.b.b.a.f(1, this.vOF) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.vOG);
      paramInt = i;
      if (this.vOH != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.vOH);
      paramInt = paramInt + e.a.a.b.b.a.bs(4, this.vOI) + e.a.a.a.c(5, 8, this.vOJ);
      AppMethodBeat.o(80030);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vOJ.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(80030);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        le localle = (le)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80030);
          break;
        case 1:
          localle.vOF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80030);
          paramInt = i;
          break;
        case 2:
          localle.vOG = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80030);
          paramInt = i;
          break;
        case 3:
          localle.vOH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80030);
          paramInt = i;
          break;
        case 4:
          localle.vOI = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80030);
          paramInt = i;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new jw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localle.vOJ.add(paramArrayOfObject);
          }
          AppMethodBeat.o(80030);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80030);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.le
 * JD-Core Version:    0.6.2
 */