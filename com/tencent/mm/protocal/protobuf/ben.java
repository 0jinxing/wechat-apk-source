package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class ben extends bsr
{
  public int vOn;
  public SKBuiltinBuffer_t vOo;
  public int vOr;
  public int vOs;
  public String wID;
  public String wIE;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(81505);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vOo == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ImageBuffer");
        AppMethodBeat.o(81505);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.vOn);
      if (this.vOo != null)
      {
        paramArrayOfObject.iy(3, this.vOo.computeSize());
        this.vOo.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(4, this.vOr);
      if (this.wID != null)
        paramArrayOfObject.e(5, this.wID);
      if (this.wIE != null)
        paramArrayOfObject.e(6, this.wIE);
      paramArrayOfObject.iz(7, this.vOs);
      AppMethodBeat.o(81505);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label802;
    label802: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.vOn);
      paramInt = i;
      if (this.vOo != null)
        paramInt = i + e.a.a.a.ix(3, this.vOo.computeSize());
      i = paramInt + e.a.a.b.b.a.bs(4, this.vOr);
      paramInt = i;
      if (this.wID != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.wID);
      i = paramInt;
      if (this.wIE != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.wIE);
      paramInt = i + e.a.a.b.b.a.bs(7, this.vOs);
      AppMethodBeat.o(81505);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vOo == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ImageBuffer");
          AppMethodBeat.o(81505);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(81505);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ben localben = (ben)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(81505);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localben.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(81505);
          paramInt = i;
          break;
        case 2:
          localben.vOn = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(81505);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localben.vOo = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(81505);
          paramInt = i;
          break;
        case 4:
          localben.vOr = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(81505);
          paramInt = i;
          break;
        case 5:
          localben.wID = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(81505);
          paramInt = i;
          break;
        case 6:
          localben.wIE = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(81505);
          paramInt = i;
          break;
        case 7:
          localben.vOs = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(81505);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(81505);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ben
 * JD-Core Version:    0.6.2
 */