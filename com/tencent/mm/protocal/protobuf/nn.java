package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class nn extends com.tencent.mm.bt.a
{
  public String name;
  public LinkedList<ul> vRR;
  public int vRS;
  public String vRT;
  public String vzX;

  public nn()
  {
    AppMethodBeat.i(28351);
    this.vRR = new LinkedList();
    AppMethodBeat.o(28351);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28352);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.e(1, 8, this.vRR);
      if (this.vzX != null)
        paramArrayOfObject.e(2, this.vzX);
      paramArrayOfObject.iz(3, this.vRS);
      if (this.vRT != null)
        paramArrayOfObject.e(4, this.vRT);
      if (this.name != null)
        paramArrayOfObject.e(5, this.name);
      AppMethodBeat.o(28352);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.a.c(1, 8, this.vRR) + 0;
        paramInt = i;
        if (this.vzX != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.vzX);
        i = paramInt + e.a.a.b.b.a.bs(3, this.vRS);
        paramInt = i;
        if (this.vRT != null)
          paramInt = i + e.a.a.b.b.a.f(4, this.vRT);
        i = paramInt;
        if (this.name != null)
          i = paramInt + e.a.a.b.b.a.f(5, this.name);
        AppMethodBeat.o(28352);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vRR.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28352);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        nn localnn = (nn)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28352);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new ul();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localnn.vRR.add(paramArrayOfObject);
          }
          AppMethodBeat.o(28352);
          paramInt = 0;
          break;
        case 2:
          localnn.vzX = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28352);
          paramInt = 0;
          break;
        case 3:
          localnn.vRS = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28352);
          paramInt = 0;
          break;
        case 4:
          localnn.vRT = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28352);
          paramInt = 0;
          break;
        case 5:
          localnn.name = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28352);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(28352);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.nn
 * JD-Core Version:    0.6.2
 */