package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class jb extends bsr
{
  public int offset;
  public String query;
  public long vKU;
  public long vKV;
  public int vKW;
  public long vKX;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(108891);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.ai(2, this.vKU);
      paramArrayOfObject.ai(3, this.vKV);
      if (this.query != null)
        paramArrayOfObject.e(4, this.query);
      paramArrayOfObject.iz(5, this.offset);
      paramArrayOfObject.iz(6, this.vKW);
      paramArrayOfObject.ai(7, this.vKX);
      AppMethodBeat.o(108891);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label621;
    label621: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.o(2, this.vKU) + e.a.a.b.b.a.o(3, this.vKV);
      paramInt = i;
      if (this.query != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.query);
      paramInt = paramInt + e.a.a.b.b.a.bs(5, this.offset) + e.a.a.b.b.a.bs(6, this.vKW) + e.a.a.b.b.a.o(7, this.vKX);
      AppMethodBeat.o(108891);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(108891);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        jb localjb = (jb)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(108891);
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
            localjb.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(108891);
          paramInt = i;
          break;
        case 2:
          localjb.vKU = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(108891);
          paramInt = i;
          break;
        case 3:
          localjb.vKV = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(108891);
          paramInt = i;
          break;
        case 4:
          localjb.query = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(108891);
          paramInt = i;
          break;
        case 5:
          localjb.offset = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(108891);
          paramInt = i;
          break;
        case 6:
          localjb.vKW = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(108891);
          paramInt = i;
          break;
        case 7:
          localjb.vKX = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(108891);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(108891);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.jb
 * JD-Core Version:    0.6.2
 */