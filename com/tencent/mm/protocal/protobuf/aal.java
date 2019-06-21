package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class aal extends bsr
{
  public int OpCode;
  public float vRp;
  public float vRq;
  public String wdB;
  public String wfF;
  public int wfG;
  public String wfH;
  public String wfI;
  public int wfJ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28403);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.OpCode);
      if (this.wfF != null)
        paramArrayOfObject.e(3, this.wfF);
      paramArrayOfObject.r(4, this.vRp);
      paramArrayOfObject.r(5, this.vRq);
      paramArrayOfObject.iz(6, this.wfG);
      if (this.wfH != null)
        paramArrayOfObject.e(7, this.wfH);
      if (this.wfI != null)
        paramArrayOfObject.e(8, this.wfI);
      paramArrayOfObject.iz(9, this.wfJ);
      if (this.wdB != null)
        paramArrayOfObject.e(10, this.wdB);
      AppMethodBeat.o(28403);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label836;
    label836: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.OpCode);
      paramInt = i;
      if (this.wfF != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.wfF);
      i = paramInt + (e.a.a.b.b.a.fv(4) + 4) + (e.a.a.b.b.a.fv(5) + 4) + e.a.a.b.b.a.bs(6, this.wfG);
      paramInt = i;
      if (this.wfH != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.wfH);
      i = paramInt;
      if (this.wfI != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.wfI);
      i += e.a.a.b.b.a.bs(9, this.wfJ);
      paramInt = i;
      if (this.wdB != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.wdB);
      AppMethodBeat.o(28403);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28403);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aal localaal = (aal)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28403);
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
            localaal.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(28403);
          paramInt = i;
          break;
        case 2:
          localaal.OpCode = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28403);
          paramInt = i;
          break;
        case 3:
          localaal.wfF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28403);
          paramInt = i;
          break;
        case 4:
          localaal.vRp = Float.intBitsToFloat(((e.a.a.a.a)localObject1).BTU.eia());
          AppMethodBeat.o(28403);
          paramInt = i;
          break;
        case 5:
          localaal.vRq = Float.intBitsToFloat(((e.a.a.a.a)localObject1).BTU.eia());
          AppMethodBeat.o(28403);
          paramInt = i;
          break;
        case 6:
          localaal.wfG = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28403);
          paramInt = i;
          break;
        case 7:
          localaal.wfH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28403);
          paramInt = i;
          break;
        case 8:
          localaal.wfI = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28403);
          paramInt = i;
          break;
        case 9:
          localaal.wfJ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28403);
          paramInt = i;
          break;
        case 10:
          localaal.wdB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28403);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28403);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aal
 * JD-Core Version:    0.6.2
 */