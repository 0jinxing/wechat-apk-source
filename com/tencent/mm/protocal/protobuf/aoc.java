package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class aoc extends bsr
{
  public String cMC;
  public String code;
  public String kbU;
  public int scene;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(89101);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.cMC != null)
        paramArrayOfObject.e(2, this.cMC);
      paramArrayOfObject.iz(3, this.scene);
      if (this.kbU != null)
        paramArrayOfObject.e(4, this.kbU);
      if (this.code != null)
        paramArrayOfObject.e(5, this.code);
      AppMethodBeat.o(89101);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label563;
    label563: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.cMC != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.cMC);
      i += e.a.a.b.b.a.bs(3, this.scene);
      paramInt = i;
      if (this.kbU != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.kbU);
      i = paramInt;
      if (this.code != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.code);
      AppMethodBeat.o(89101);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(89101);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aoc localaoc = (aoc)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89101);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaoc.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(89101);
          paramInt = i;
          break;
        case 2:
          localaoc.cMC = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89101);
          paramInt = i;
          break;
        case 3:
          localaoc.scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89101);
          paramInt = i;
          break;
        case 4:
          localaoc.kbU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89101);
          paramInt = i;
          break;
        case 5:
          localaoc.code = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89101);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(89101);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aoc
 * JD-Core Version:    0.6.2
 */