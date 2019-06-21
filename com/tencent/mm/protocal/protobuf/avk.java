package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class avk extends btd
{
  public int cyE;
  public avi wzj;
  public int wzs;
  public int wzt;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(96251);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(96251);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.wzj != null)
      {
        paramArrayOfObject.iy(2, this.wzj.computeSize());
        this.wzj.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(3, this.cyE);
      paramArrayOfObject.iz(4, this.wzs);
      paramArrayOfObject.iz(5, this.wzt);
      AppMethodBeat.o(96251);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label669;
    label669: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wzj != null)
        i = paramInt + e.a.a.a.ix(2, this.wzj.computeSize());
      paramInt = i + e.a.a.b.b.a.bs(3, this.cyE) + e.a.a.b.b.a.bs(4, this.wzs) + e.a.a.b.b.a.bs(5, this.wzt);
      AppMethodBeat.o(96251);
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
          AppMethodBeat.o(96251);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(96251);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        avk localavk = (avk)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96251);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((BaseResponse)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localavk.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(96251);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new avi();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((avi)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localavk.wzj = ((avi)localObject1);
          }
          AppMethodBeat.o(96251);
          paramInt = i;
          break;
        case 3:
          localavk.cyE = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96251);
          paramInt = i;
          break;
        case 4:
          localavk.wzs = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96251);
          paramInt = i;
          break;
        case 5:
          localavk.wzt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96251);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(96251);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.avk
 * JD-Core Version:    0.6.2
 */