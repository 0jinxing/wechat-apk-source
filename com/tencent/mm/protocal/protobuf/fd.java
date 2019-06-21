package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class fd extends btd
{
  public com.tencent.mm.bt.b vGZ;
  public int vHe;
  public int vHf;
  public fi vHg;
  public fe vHh;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28315);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(28315);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.vHe);
      paramArrayOfObject.iz(3, this.vHf);
      if (this.vGZ != null)
        paramArrayOfObject.c(4, this.vGZ);
      if (this.vHg != null)
      {
        paramArrayOfObject.iy(5, this.vHg.computeSize());
        this.vHg.writeFields(paramArrayOfObject);
      }
      if (this.vHh != null)
      {
        paramArrayOfObject.iy(6, this.vHh.computeSize());
        this.vHh.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(28315);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label859;
    label859: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.vHe) + e.a.a.b.b.a.bs(3, this.vHf);
      paramInt = i;
      if (this.vGZ != null)
        paramInt = i + e.a.a.b.b.a.b(4, this.vGZ);
      i = paramInt;
      if (this.vHg != null)
        i = paramInt + e.a.a.a.ix(5, this.vHg.computeSize());
      paramInt = i;
      if (this.vHh != null)
        paramInt = i + e.a.a.a.ix(6, this.vHh.computeSize());
      AppMethodBeat.o(28315);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(28315);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28315);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        fd localfd = (fd)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28315);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localfd.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(28315);
          paramInt = i;
          break;
        case 2:
          localfd.vHe = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28315);
          paramInt = i;
          break;
        case 3:
          localfd.vHf = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28315);
          paramInt = i;
          break;
        case 4:
          localfd.vGZ = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(28315);
          paramInt = i;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new fi();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localfd.vHg = paramArrayOfObject;
          }
          AppMethodBeat.o(28315);
          paramInt = i;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new fe();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fe)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localfd.vHh = ((fe)localObject1);
          }
          AppMethodBeat.o(28315);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28315);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.fd
 * JD-Core Version:    0.6.2
 */