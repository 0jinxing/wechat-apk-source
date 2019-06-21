package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class nh extends bsr
{
  public String vHD;
  public String vRO;
  public aw vRP;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56740);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.vRO != null)
        paramArrayOfObject.e(2, this.vRO);
      if (this.vHD != null)
        paramArrayOfObject.e(3, this.vHD);
      if (this.vRP != null)
      {
        paramArrayOfObject.iy(4, this.vRP.computeSize());
        this.vRP.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(56740);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label609;
    label609: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vRO != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.vRO);
      i = paramInt;
      if (this.vHD != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vHD);
      paramInt = i;
      if (this.vRP != null)
        paramInt = i + e.a.a.a.ix(4, this.vRP.computeSize());
      AppMethodBeat.o(56740);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56740);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        nh localnh = (nh)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56740);
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
            localnh.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(56740);
          paramInt = i;
          break;
        case 2:
          localnh.vRO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56740);
          paramInt = i;
          break;
        case 3:
          localnh.vHD = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56740);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new aw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localnh.vRP = paramArrayOfObject;
          }
          AppMethodBeat.o(56740);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56740);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.nh
 * JD-Core Version:    0.6.2
 */