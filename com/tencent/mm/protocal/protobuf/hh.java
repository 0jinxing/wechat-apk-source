package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class hh extends com.tencent.mm.bt.a
{
  public SKBuiltinBuffer_t vHM;
  public SKBuiltinBuffer_t vHN;
  public String vHS;
  public SKBuiltinBuffer_t vJT;
  public csd vJU;
  public cwd vJV;
  public int vJW;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(58891);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vJT != null)
      {
        paramArrayOfObject.iy(1, this.vJT.computeSize());
        this.vJT.writeFields(paramArrayOfObject);
      }
      if (this.vJU != null)
      {
        paramArrayOfObject.iy(2, this.vJU.computeSize());
        this.vJU.writeFields(paramArrayOfObject);
      }
      if (this.vJV != null)
      {
        paramArrayOfObject.iy(3, this.vJV.computeSize());
        this.vJV.writeFields(paramArrayOfObject);
      }
      if (this.vHM != null)
      {
        paramArrayOfObject.iy(4, this.vHM.computeSize());
        this.vHM.writeFields(paramArrayOfObject);
      }
      if (this.vHN != null)
      {
        paramArrayOfObject.iy(5, this.vHN.computeSize());
        this.vHN.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(6, this.vJW);
      if (this.vHS != null)
        paramArrayOfObject.e(7, this.vHS);
      AppMethodBeat.o(58891);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vJT == null)
        break label1066;
    label1066: for (i = e.a.a.a.ix(1, this.vJT.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vJU != null)
        paramInt = i + e.a.a.a.ix(2, this.vJU.computeSize());
      i = paramInt;
      if (this.vJV != null)
        i = paramInt + e.a.a.a.ix(3, this.vJV.computeSize());
      paramInt = i;
      if (this.vHM != null)
        paramInt = i + e.a.a.a.ix(4, this.vHM.computeSize());
      i = paramInt;
      if (this.vHN != null)
        i = paramInt + e.a.a.a.ix(5, this.vHN.computeSize());
      i += e.a.a.b.b.a.bs(6, this.vJW);
      paramInt = i;
      if (this.vHS != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.vHS);
      AppMethodBeat.o(58891);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(58891);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        hh localhh = (hh)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(58891);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localhh.vJT = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(58891);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new csd();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localhh.vJU = paramArrayOfObject;
          }
          AppMethodBeat.o(58891);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cwd();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localhh.vJV = paramArrayOfObject;
          }
          AppMethodBeat.o(58891);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localhh.vHM = paramArrayOfObject;
          }
          AppMethodBeat.o(58891);
          paramInt = i;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localhh.vHN = paramArrayOfObject;
          }
          AppMethodBeat.o(58891);
          paramInt = i;
          break;
        case 6:
          localhh.vJW = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58891);
          paramInt = i;
          break;
        case 7:
          localhh.vHS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58891);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(58891);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.hh
 * JD-Core Version:    0.6.2
 */