package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class asl extends bsr
{
  public String fKh;
  public String guW;
  public String nbs;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(54949);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.fKh == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: AppId");
        AppMethodBeat.o(54949);
        throw paramArrayOfObject;
      }
      if (this.nbs == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Lang");
        AppMethodBeat.o(54949);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.fKh != null)
        paramArrayOfObject.e(2, this.fKh);
      if (this.nbs != null)
        paramArrayOfObject.e(3, this.nbs);
      if (this.guW != null)
        paramArrayOfObject.e(4, this.guW);
      AppMethodBeat.o(54949);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label609;
    label609: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.fKh != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.fKh);
      i = paramInt;
      if (this.nbs != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.nbs);
      paramInt = i;
      if (this.guW != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.guW);
      AppMethodBeat.o(54949);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.fKh == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: AppId");
          AppMethodBeat.o(54949);
          throw paramArrayOfObject;
        }
        if (this.nbs == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Lang");
          AppMethodBeat.o(54949);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(54949);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        asl localasl = (asl)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(54949);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((hl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localasl.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(54949);
          paramInt = i;
          break;
        case 2:
          localasl.fKh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(54949);
          paramInt = i;
          break;
        case 3:
          localasl.nbs = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(54949);
          paramInt = i;
          break;
        case 4:
          localasl.guW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(54949);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(54949);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.asl
 * JD-Core Version:    0.6.2
 */