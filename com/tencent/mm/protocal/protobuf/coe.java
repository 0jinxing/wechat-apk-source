package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class coe extends bsr
{
  public int Scene;
  public int fJT;
  public SKBuiltinBuffer_t ptz;
  public int vOq;
  public int vPb;
  public bts wUI;
  public String xiM;
  public int xiO;
  public int xlE;
  public LinkedList<bts> xlF;
  public int xlG;

  public coe()
  {
    AppMethodBeat.i(116818);
    this.xlF = new LinkedList();
    AppMethodBeat.o(116818);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(116819);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.ptz == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Data");
        AppMethodBeat.o(116819);
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
      paramArrayOfObject.iz(3, this.vOq);
      if (this.xiM != null)
        paramArrayOfObject.e(4, this.xiM);
      paramArrayOfObject.iz(5, this.fJT);
      paramArrayOfObject.iz(6, this.xiO);
      paramArrayOfObject.iz(7, this.vPb);
      paramArrayOfObject.iz(8, this.xlE);
      paramArrayOfObject.e(9, 8, this.xlF);
      if (this.wUI != null)
      {
        paramArrayOfObject.iy(10, this.wUI.computeSize());
        this.wUI.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(11, this.xlG);
      paramArrayOfObject.iz(12, this.Scene);
      AppMethodBeat.o(116819);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label1230;
    label1230: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.ptz != null)
        i = paramInt + e.a.a.a.ix(2, this.ptz.computeSize());
      i += e.a.a.b.b.a.bs(3, this.vOq);
      paramInt = i;
      if (this.xiM != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.xiM);
      i = paramInt + e.a.a.b.b.a.bs(5, this.fJT) + e.a.a.b.b.a.bs(6, this.xiO) + e.a.a.b.b.a.bs(7, this.vPb) + e.a.a.b.b.a.bs(8, this.xlE) + e.a.a.a.c(9, 8, this.xlF);
      paramInt = i;
      if (this.wUI != null)
        paramInt = i + e.a.a.a.ix(10, this.wUI.computeSize());
      paramInt = paramInt + e.a.a.b.b.a.bs(11, this.xlG) + e.a.a.b.b.a.bs(12, this.Scene);
      AppMethodBeat.o(116819);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.xlF.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.ptz == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Data");
          AppMethodBeat.o(116819);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(116819);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        coe localcoe = (coe)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(116819);
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
            localcoe.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(116819);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcoe.ptz = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(116819);
          paramInt = i;
          break;
        case 3:
          localcoe.vOq = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116819);
          paramInt = i;
          break;
        case 4:
          localcoe.xiM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(116819);
          paramInt = i;
          break;
        case 5:
          localcoe.fJT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116819);
          paramInt = i;
          break;
        case 6:
          localcoe.xiO = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116819);
          paramInt = i;
          break;
        case 7:
          localcoe.vPb = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116819);
          paramInt = i;
          break;
        case 8:
          localcoe.xlE = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116819);
          paramInt = i;
          break;
        case 9:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcoe.xlF.add(paramArrayOfObject);
          }
          AppMethodBeat.o(116819);
          paramInt = i;
          break;
        case 10:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcoe.wUI = paramArrayOfObject;
          }
          AppMethodBeat.o(116819);
          paramInt = i;
          break;
        case 11:
          localcoe.xlG = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116819);
          paramInt = i;
          break;
        case 12:
          localcoe.Scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116819);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(116819);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.coe
 * JD-Core Version:    0.6.2
 */