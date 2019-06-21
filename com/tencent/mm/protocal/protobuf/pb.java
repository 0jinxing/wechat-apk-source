package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class pb extends bsr
{
  public long vWl;
  public String vWm;
  public String vWn;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48791);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.ai(2, this.vWl);
      if (this.vWm != null)
        paramArrayOfObject.e(3, this.vWm);
      if (this.vWn != null)
        paramArrayOfObject.e(4, this.vWn);
      AppMethodBeat.o(48791);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label501;
    label501: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.o(2, this.vWl);
      paramInt = i;
      if (this.vWm != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.vWm);
      i = paramInt;
      if (this.vWn != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.vWn);
      AppMethodBeat.o(48791);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48791);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        pb localpb = (pb)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48791);
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
            localpb.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(48791);
          paramInt = i;
          break;
        case 2:
          localpb.vWl = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(48791);
          paramInt = i;
          break;
        case 3:
          localpb.vWm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48791);
          paramInt = i;
          break;
        case 4:
          localpb.vWn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48791);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48791);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.pb
 * JD-Core Version:    0.6.2
 */