package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class byt extends bsr
{
  public int fJT;
  public SKBuiltinBuffer_t ptz;
  public int vFE;
  public float vRq;
  public int vZF;
  public int wXO;
  public float wXP;
  public float wXQ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28650);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.ptz == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Data");
        AppMethodBeat.o(28650);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.ptz != null)
      {
        paramArrayOfObject.iy(2, this.ptz.computeSize());
        this.ptz.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(3, this.wXO);
      paramArrayOfObject.iz(4, this.fJT);
      paramArrayOfObject.r(5, this.wXP);
      paramArrayOfObject.iz(6, this.vZF);
      paramArrayOfObject.iz(7, this.vFE);
      paramArrayOfObject.r(8, this.wXQ);
      paramArrayOfObject.r(9, this.vRq);
      AppMethodBeat.o(28650);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label875;
    label875: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.ptz != null)
        i = paramInt + e.a.a.a.ix(2, this.ptz.computeSize());
      paramInt = i + e.a.a.b.b.a.bs(3, this.wXO) + e.a.a.b.b.a.bs(4, this.fJT) + (e.a.a.b.b.a.fv(5) + 4) + e.a.a.b.b.a.bs(6, this.vZF) + e.a.a.b.b.a.bs(7, this.vFE) + (e.a.a.b.b.a.fv(8) + 4) + (e.a.a.b.b.a.fv(9) + 4);
      AppMethodBeat.o(28650);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.ptz == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Data");
          AppMethodBeat.o(28650);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28650);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        byt localbyt = (byt)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28650);
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
            localbyt.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(28650);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbyt.ptz = paramArrayOfObject;
          }
          AppMethodBeat.o(28650);
          paramInt = i;
          break;
        case 3:
          localbyt.wXO = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28650);
          paramInt = i;
          break;
        case 4:
          localbyt.fJT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28650);
          paramInt = i;
          break;
        case 5:
          localbyt.wXP = Float.intBitsToFloat(((e.a.a.a.a)localObject1).BTU.eia());
          AppMethodBeat.o(28650);
          paramInt = i;
          break;
        case 6:
          localbyt.vZF = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28650);
          paramInt = i;
          break;
        case 7:
          localbyt.vFE = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28650);
          paramInt = i;
          break;
        case 8:
          localbyt.wXQ = Float.intBitsToFloat(((e.a.a.a.a)localObject1).BTU.eia());
          AppMethodBeat.o(28650);
          paramInt = i;
          break;
        case 9:
          localbyt.vRq = Float.intBitsToFloat(((e.a.a.a.a)localObject1).BTU.eia());
          AppMethodBeat.o(28650);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28650);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.byt
 * JD-Core Version:    0.6.2
 */