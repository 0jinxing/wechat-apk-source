package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class caf extends bsr
{
  public int Scene;
  public String ptv;
  public int vFH;
  public bts wZq;
  public cao wZr;
  public bts wZs;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(94555);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wZr == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Action");
        AppMethodBeat.o(94555);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.wZr != null)
      {
        paramArrayOfObject.iy(2, this.wZr.computeSize());
        this.wZr.writeFields(paramArrayOfObject);
      }
      if (this.ptv != null)
        paramArrayOfObject.e(3, this.ptv);
      if (this.wZq != null)
      {
        paramArrayOfObject.iy(4, this.wZq.computeSize());
        this.wZq.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(5, this.vFH);
      if (this.wZs != null)
      {
        paramArrayOfObject.iy(6, this.wZs.computeSize());
        this.wZs.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(7, this.Scene);
      AppMethodBeat.o(94555);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label1007;
    label1007: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wZr != null)
        i = paramInt + e.a.a.a.ix(2, this.wZr.computeSize());
      paramInt = i;
      if (this.ptv != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.ptv);
      i = paramInt;
      if (this.wZq != null)
        i = paramInt + e.a.a.a.ix(4, this.wZq.computeSize());
      i += e.a.a.b.b.a.bs(5, this.vFH);
      paramInt = i;
      if (this.wZs != null)
        paramInt = i + e.a.a.a.ix(6, this.wZs.computeSize());
      paramInt += e.a.a.b.b.a.bs(7, this.Scene);
      AppMethodBeat.o(94555);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wZr == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Action");
          AppMethodBeat.o(94555);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(94555);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        caf localcaf = (caf)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94555);
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
            localcaf.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(94555);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cao();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cao)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcaf.wZr = ((cao)localObject1);
          }
          AppMethodBeat.o(94555);
          paramInt = i;
          break;
        case 3:
          localcaf.ptv = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94555);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcaf.wZq = paramArrayOfObject;
          }
          AppMethodBeat.o(94555);
          paramInt = i;
          break;
        case 5:
          localcaf.vFH = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94555);
          paramInt = i;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcaf.wZs = ((bts)localObject1);
          }
          AppMethodBeat.o(94555);
          paramInt = i;
          break;
        case 7:
          localcaf.Scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94555);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(94555);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.caf
 * JD-Core Version:    0.6.2
 */