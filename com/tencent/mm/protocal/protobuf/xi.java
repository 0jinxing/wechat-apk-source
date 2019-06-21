package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class xi extends btd
{
  public int jCt;
  public SKBuiltinBuffer_t wdg;
  public int wdh;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80049);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(80049);
        throw paramArrayOfObject;
      }
      if (this.wdg == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: PackageBuf");
        AppMethodBeat.o(80049);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.wdg != null)
      {
        paramArrayOfObject.iy(2, this.wdg.computeSize());
        this.wdg.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(3, this.jCt);
      paramArrayOfObject.iz(4, this.wdh);
      AppMethodBeat.o(80049);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label668;
    label668: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wdg != null)
        i = paramInt + e.a.a.a.ix(2, this.wdg.computeSize());
      paramInt = i + e.a.a.b.b.a.bs(3, this.jCt) + e.a.a.b.b.a.bs(4, this.wdh);
      AppMethodBeat.o(80049);
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
          AppMethodBeat.o(80049);
          throw paramArrayOfObject;
        }
        if (this.wdg == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: PackageBuf");
          AppMethodBeat.o(80049);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(80049);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        xi localxi = (xi)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80049);
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
            localxi.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(80049);
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
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localxi.wdg = paramArrayOfObject;
          }
          AppMethodBeat.o(80049);
          paramInt = i;
          break;
        case 3:
          localxi.jCt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80049);
          paramInt = i;
          break;
        case 4:
          localxi.wdh = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80049);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80049);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.xi
 * JD-Core Version:    0.6.2
 */