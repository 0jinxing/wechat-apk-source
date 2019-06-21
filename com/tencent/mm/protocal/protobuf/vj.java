package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class vj extends bsr
{
  public int Scene;
  public int ehB;
  public String vEf;
  public LinkedList<vt> vEh;

  public vj()
  {
    AppMethodBeat.i(5572);
    this.vEh = new LinkedList();
    AppMethodBeat.o(5572);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(5573);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.ehB);
      paramArrayOfObject.e(3, 8, this.vEh);
      if (this.vEf != null)
        paramArrayOfObject.e(4, this.vEf);
      paramArrayOfObject.iz(5, this.Scene);
      AppMethodBeat.o(5573);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label636;
    label636: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.ehB) + e.a.a.a.c(3, 8, this.vEh);
      paramInt = i;
      if (this.vEf != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.vEf);
      paramInt += e.a.a.b.b.a.bs(5, this.Scene);
      AppMethodBeat.o(5573);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vEh.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(5573);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        vj localvj = (vj)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(5573);
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
            localvj.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(5573);
          paramInt = i;
          break;
        case 2:
          localvj.ehB = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5573);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new vt();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((vt)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localvj.vEh.add(localObject1);
          }
          AppMethodBeat.o(5573);
          paramInt = i;
          break;
        case 4:
          localvj.vEf = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(5573);
          paramInt = i;
          break;
        case 5:
          localvj.Scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5573);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(5573);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.vj
 * JD-Core Version:    0.6.2
 */