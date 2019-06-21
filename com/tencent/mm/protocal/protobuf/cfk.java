package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cfk extends btd
{
  public int vIc;
  public fz wXh;
  public String wcg;
  public gd xeO;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(96298);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(96298);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.wXh != null)
      {
        paramArrayOfObject.iy(2, this.wXh.computeSize());
        this.wXh.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(3, this.vIc);
      if (this.xeO != null)
      {
        paramArrayOfObject.iy(4, this.xeO.computeSize());
        this.xeO.writeFields(paramArrayOfObject);
      }
      if (this.wcg != null)
        paramArrayOfObject.e(5, this.wcg);
      AppMethodBeat.o(96298);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label801;
    label801: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wXh != null)
        i = paramInt + e.a.a.a.ix(2, this.wXh.computeSize());
      i += e.a.a.b.b.a.bs(3, this.vIc);
      paramInt = i;
      if (this.xeO != null)
        paramInt = i + e.a.a.a.ix(4, this.xeO.computeSize());
      i = paramInt;
      if (this.wcg != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.wcg);
      AppMethodBeat.o(96298);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(96298);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(96298);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cfk localcfk = (cfk)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96298);
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
            localcfk.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(96298);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new fz();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fz)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcfk.wXh = ((fz)localObject1);
          }
          AppMethodBeat.o(96298);
          paramInt = i;
          break;
        case 3:
          localcfk.vIc = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96298);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new gd();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((gd)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcfk.xeO = ((gd)localObject1);
          }
          AppMethodBeat.o(96298);
          paramInt = i;
          break;
        case 5:
          localcfk.wcg = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96298);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(96298);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cfk
 * JD-Core Version:    0.6.2
 */