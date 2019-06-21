package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class buw extends com.tencent.mm.bt.a
{
  public int Scene;
  public int vOq;
  public long vQd;
  public String vQg;
  public axy wDI;
  public int wWo;
  public LinkedList<cmg> wWp;
  public String wol;

  public buw()
  {
    AppMethodBeat.i(124347);
    this.wWp = new LinkedList();
    AppMethodBeat.o(124347);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(124348);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wol == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: KeyWord");
        AppMethodBeat.o(124348);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.ai(1, this.vQd);
      if (this.wol != null)
        paramArrayOfObject.e(2, this.wol);
      paramArrayOfObject.iz(3, this.vOq);
      if (this.wDI != null)
      {
        paramArrayOfObject.iy(4, this.wDI.computeSize());
        this.wDI.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(5, this.wWo);
      paramArrayOfObject.e(6, 8, this.wWp);
      paramArrayOfObject.iz(7, this.Scene);
      if (this.vQg != null)
        paramArrayOfObject.e(8, this.vQg);
      AppMethodBeat.o(124348);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.o(1, this.vQd) + 0;
        paramInt = i;
        if (this.wol != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.wol);
        i = paramInt + e.a.a.b.b.a.bs(3, this.vOq);
        paramInt = i;
        if (this.wDI != null)
          paramInt = i + e.a.a.a.ix(4, this.wDI.computeSize());
        i = paramInt + e.a.a.b.b.a.bs(5, this.wWo) + e.a.a.a.c(6, 8, this.wWp) + e.a.a.b.b.a.bs(7, this.Scene);
        paramInt = i;
        if (this.vQg != null)
          paramInt = i + e.a.a.b.b.a.f(8, this.vQg);
        AppMethodBeat.o(124348);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wWp.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wol == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: KeyWord");
          AppMethodBeat.o(124348);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(124348);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        buw localbuw = (buw)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(124348);
          break;
        case 1:
          localbuw.vQd = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(124348);
          paramInt = 0;
          break;
        case 2:
          localbuw.wol = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(124348);
          paramInt = 0;
          break;
        case 3:
          localbuw.vOq = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(124348);
          paramInt = 0;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new axy();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbuw.wDI = paramArrayOfObject;
          }
          AppMethodBeat.o(124348);
          paramInt = 0;
          break;
        case 5:
          localbuw.wWo = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(124348);
          paramInt = 0;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cmg();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cmg)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbuw.wWp.add(localObject1);
          }
          AppMethodBeat.o(124348);
          paramInt = 0;
          break;
        case 7:
          localbuw.Scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(124348);
          paramInt = 0;
          break;
        case 8:
          localbuw.vQg = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(124348);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(124348);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.buw
 * JD-Core Version:    0.6.2
 */