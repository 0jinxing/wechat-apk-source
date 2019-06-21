package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cad extends com.tencent.mm.bt.a
{
  public int pdi;
  public String vRN;
  public LinkedList<blq> wZm;
  public ze wZn;
  public LinkedList<bpz> wZo;
  public int wZp;
  public cx wpB;

  public cad()
  {
    AppMethodBeat.i(56975);
    this.wZm = new LinkedList();
    this.wZo = new LinkedList();
    AppMethodBeat.o(56975);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(56976);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.pdi);
      paramArrayOfObject.e(2, 8, this.wZm);
      if (this.wZn != null)
      {
        paramArrayOfObject.iy(3, this.wZn.computeSize());
        this.wZn.writeFields(paramArrayOfObject);
      }
      if (this.wpB != null)
      {
        paramArrayOfObject.iy(4, this.wpB.computeSize());
        this.wpB.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(5, 8, this.wZo);
      paramArrayOfObject.iz(6, this.wZp);
      if (this.vRN != null)
        paramArrayOfObject.e(7, this.vRN);
      AppMethodBeat.o(56976);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.pdi) + 0 + e.a.a.a.c(2, 8, this.wZm);
        paramInt = i;
        if (this.wZn != null)
          paramInt = i + e.a.a.a.ix(3, this.wZn.computeSize());
        i = paramInt;
        if (this.wpB != null)
          i = paramInt + e.a.a.a.ix(4, this.wpB.computeSize());
        i = i + e.a.a.a.c(5, 8, this.wZo) + e.a.a.b.b.a.bs(6, this.wZp);
        paramInt = i;
        if (this.vRN != null)
          paramInt = i + e.a.a.b.b.a.f(7, this.vRN);
        AppMethodBeat.o(56976);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wZm.clear();
        this.wZo.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56976);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cad localcad = (cad)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56976);
          break;
        case 1:
          localcad.pdi = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56976);
          paramInt = 0;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new blq();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcad.wZm.add(paramArrayOfObject);
          }
          AppMethodBeat.o(56976);
          paramInt = 0;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new ze();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcad.wZn = paramArrayOfObject;
          }
          AppMethodBeat.o(56976);
          paramInt = 0;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cx();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cx)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcad.wpB = ((cx)localObject1);
          }
          AppMethodBeat.o(56976);
          paramInt = 0;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bpz();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcad.wZo.add(paramArrayOfObject);
          }
          AppMethodBeat.o(56976);
          paramInt = 0;
          break;
        case 6:
          localcad.wZp = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56976);
          paramInt = 0;
          break;
        case 7:
          localcad.vRN = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56976);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(56976);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cad
 * JD-Core Version:    0.6.2
 */