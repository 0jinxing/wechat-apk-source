package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class axz extends bsr
{
  public int OpCode;
  public SKBuiltinBuffer_t vIl;
  public float vRp;
  public float vRq;
  public int wfG;
  public String wfH;
  public String wfI;
  public int wfJ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(55527);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.OpCode);
      paramArrayOfObject.r(3, this.vRp);
      paramArrayOfObject.r(4, this.vRq);
      paramArrayOfObject.iz(5, this.wfG);
      if (this.wfH != null)
        paramArrayOfObject.e(6, this.wfH);
      if (this.wfI != null)
        paramArrayOfObject.e(7, this.wfI);
      paramArrayOfObject.iz(8, this.wfJ);
      if (this.vIl != null)
      {
        paramArrayOfObject.iy(9, this.vIl.computeSize());
        this.vIl.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(55527);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label845;
    label845: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.OpCode) + (e.a.a.b.b.a.fv(3) + 4) + (e.a.a.b.b.a.fv(4) + 4) + e.a.a.b.b.a.bs(5, this.wfG);
      paramInt = i;
      if (this.wfH != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.wfH);
      i = paramInt;
      if (this.wfI != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.wfI);
      i += e.a.a.b.b.a.bs(8, this.wfJ);
      paramInt = i;
      if (this.vIl != null)
        paramInt = i + e.a.a.a.ix(9, this.vIl.computeSize());
      AppMethodBeat.o(55527);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(55527);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        axz localaxz = (axz)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(55527);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaxz.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(55527);
          paramInt = i;
          break;
        case 2:
          localaxz.OpCode = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(55527);
          paramInt = i;
          break;
        case 3:
          localaxz.vRp = Float.intBitsToFloat(((e.a.a.a.a)localObject1).BTU.eia());
          AppMethodBeat.o(55527);
          paramInt = i;
          break;
        case 4:
          localaxz.vRq = Float.intBitsToFloat(((e.a.a.a.a)localObject1).BTU.eia());
          AppMethodBeat.o(55527);
          paramInt = i;
          break;
        case 5:
          localaxz.wfG = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(55527);
          paramInt = i;
          break;
        case 6:
          localaxz.wfH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55527);
          paramInt = i;
          break;
        case 7:
          localaxz.wfI = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(55527);
          paramInt = i;
          break;
        case 8:
          localaxz.wfJ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(55527);
          paramInt = i;
          break;
        case 9:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaxz.vIl = paramArrayOfObject;
          }
          AppMethodBeat.o(55527);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(55527);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.axz
 * JD-Core Version:    0.6.2
 */