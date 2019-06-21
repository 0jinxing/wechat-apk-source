package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class jv extends com.tencent.mm.bt.a
{
  public mw vMl;
  public mw vMm;
  public mw vMn;
  public SKBuiltinBuffer_t vMo;
  public SKBuiltinBuffer_t vMp;
  public mw vMq;
  public int vMr;
  public mv vMs;
  public mv vMt;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(837);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vMl != null)
      {
        paramArrayOfObject.iy(1, this.vMl.computeSize());
        this.vMl.writeFields(paramArrayOfObject);
      }
      if (this.vMm != null)
      {
        paramArrayOfObject.iy(2, this.vMm.computeSize());
        this.vMm.writeFields(paramArrayOfObject);
      }
      if (this.vMn != null)
      {
        paramArrayOfObject.iy(4, this.vMn.computeSize());
        this.vMn.writeFields(paramArrayOfObject);
      }
      if (this.vMo != null)
      {
        paramArrayOfObject.iy(5, this.vMo.computeSize());
        this.vMo.writeFields(paramArrayOfObject);
      }
      if (this.vMp != null)
      {
        paramArrayOfObject.iy(6, this.vMp.computeSize());
        this.vMp.writeFields(paramArrayOfObject);
      }
      if (this.vMq != null)
      {
        paramArrayOfObject.iy(7, this.vMq.computeSize());
        this.vMq.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(8, this.vMr);
      if (this.vMs != null)
      {
        paramArrayOfObject.iy(9, this.vMs.computeSize());
        this.vMs.writeFields(paramArrayOfObject);
      }
      if (this.vMt != null)
      {
        paramArrayOfObject.iy(10, this.vMt.computeSize());
        this.vMt.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(837);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vMl == null)
        break label1508;
    label1508: for (i = e.a.a.a.ix(1, this.vMl.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vMm != null)
        paramInt = i + e.a.a.a.ix(2, this.vMm.computeSize());
      int j = paramInt;
      if (this.vMn != null)
        j = paramInt + e.a.a.a.ix(4, this.vMn.computeSize());
      i = j;
      if (this.vMo != null)
        i = j + e.a.a.a.ix(5, this.vMo.computeSize());
      paramInt = i;
      if (this.vMp != null)
        paramInt = i + e.a.a.a.ix(6, this.vMp.computeSize());
      i = paramInt;
      if (this.vMq != null)
        i = paramInt + e.a.a.a.ix(7, this.vMq.computeSize());
      i += e.a.a.b.b.a.bs(8, this.vMr);
      paramInt = i;
      if (this.vMs != null)
        paramInt = i + e.a.a.a.ix(9, this.vMs.computeSize());
      i = paramInt;
      if (this.vMt != null)
        i = paramInt + e.a.a.a.ix(10, this.vMt.computeSize());
      AppMethodBeat.o(837);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(837);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        jv localjv = (jv)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 3:
        default:
          AppMethodBeat.o(837);
          paramInt = -1;
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new mw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localjv.vMl = paramArrayOfObject;
          }
          AppMethodBeat.o(837);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new mw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((mw)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localjv.vMm = ((mw)localObject1);
          }
          AppMethodBeat.o(837);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new mw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localjv.vMn = paramArrayOfObject;
          }
          AppMethodBeat.o(837);
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
            localjv.vMo = paramArrayOfObject;
          }
          AppMethodBeat.o(837);
          paramInt = i;
          break;
        case 6:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localjv.vMp = paramArrayOfObject;
          }
          AppMethodBeat.o(837);
          paramInt = i;
          break;
        case 7:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new mw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localjv.vMq = paramArrayOfObject;
          }
          AppMethodBeat.o(837);
          paramInt = i;
          break;
        case 8:
          localjv.vMr = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(837);
          paramInt = i;
          break;
        case 9:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new mv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((mv)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localjv.vMs = ((mv)localObject1);
          }
          AppMethodBeat.o(837);
          paramInt = i;
          break;
        case 10:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new mv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localjv.vMt = paramArrayOfObject;
          }
          AppMethodBeat.o(837);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(837);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.jv
 * JD-Core Version:    0.6.2
 */