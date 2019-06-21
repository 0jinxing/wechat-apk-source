package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class aze extends bsr
{
  public String lang;
  public int limit;
  public int offset;
  public String wCY;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80118);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.offset);
      paramArrayOfObject.iz(3, this.limit);
      if (this.lang != null)
        paramArrayOfObject.e(4, this.lang);
      if (this.wCY != null)
        paramArrayOfObject.e(5, this.wCY);
      AppMethodBeat.o(80118);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label543;
    label543: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.offset) + e.a.a.b.b.a.bs(3, this.limit);
      paramInt = i;
      if (this.lang != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.lang);
      i = paramInt;
      if (this.wCY != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.wCY);
      AppMethodBeat.o(80118);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(80118);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aze localaze = (aze)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80118);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaze.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(80118);
          paramInt = i;
          break;
        case 2:
          localaze.offset = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80118);
          paramInt = i;
          break;
        case 3:
          localaze.limit = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80118);
          paramInt = i;
          break;
        case 4:
          localaze.lang = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80118);
          paramInt = i;
          break;
        case 5:
          localaze.wCY = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80118);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80118);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aze
 * JD-Core Version:    0.6.2
 */