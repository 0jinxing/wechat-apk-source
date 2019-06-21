package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class byr extends bsr
{
  public int OpCode;
  public SKBuiltinBuffer_t vIl;
  public float vRp;
  public float vRq;
  public int wYa;
  public int wYb;
  public int wfG;
  public String wfH;
  public String wfI;
  public int wfJ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28648);
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
      paramArrayOfObject.iz(8, this.wYa);
      paramArrayOfObject.iz(9, this.wYb);
      paramArrayOfObject.iz(10, this.wfJ);
      if (this.vIl != null)
      {
        paramArrayOfObject.iy(11, this.vIl.computeSize());
        this.vIl.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(28648);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label957;
    label957: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.OpCode) + (e.a.a.b.b.a.fv(3) + 4) + (e.a.a.b.b.a.fv(4) + 4) + e.a.a.b.b.a.bs(5, this.wfG);
      paramInt = i;
      if (this.wfH != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.wfH);
      i = paramInt;
      if (this.wfI != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.wfI);
      i = i + e.a.a.b.b.a.bs(8, this.wYa) + e.a.a.b.b.a.bs(9, this.wYb) + e.a.a.b.b.a.bs(10, this.wfJ);
      paramInt = i;
      if (this.vIl != null)
        paramInt = i + e.a.a.a.ix(11, this.vIl.computeSize());
      AppMethodBeat.o(28648);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28648);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        byr localbyr = (byr)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28648);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((hl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbyr.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(28648);
          paramInt = i;
          break;
        case 2:
          localbyr.OpCode = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28648);
          paramInt = i;
          break;
        case 3:
          localbyr.vRp = Float.intBitsToFloat(((e.a.a.a.a)localObject1).BTU.eia());
          AppMethodBeat.o(28648);
          paramInt = i;
          break;
        case 4:
          localbyr.vRq = Float.intBitsToFloat(((e.a.a.a.a)localObject1).BTU.eia());
          AppMethodBeat.o(28648);
          paramInt = i;
          break;
        case 5:
          localbyr.wfG = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28648);
          paramInt = i;
          break;
        case 6:
          localbyr.wfH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28648);
          paramInt = i;
          break;
        case 7:
          localbyr.wfI = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28648);
          paramInt = i;
          break;
        case 8:
          localbyr.wYa = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28648);
          paramInt = i;
          break;
        case 9:
          localbyr.wYb = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28648);
          paramInt = i;
          break;
        case 10:
          localbyr.wfJ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28648);
          paramInt = i;
          break;
        case 11:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbyr.vIl = paramArrayOfObject;
          }
          AppMethodBeat.o(28648);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28648);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.byr
 * JD-Core Version:    0.6.2
 */