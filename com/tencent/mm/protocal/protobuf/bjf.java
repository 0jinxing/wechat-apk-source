package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bjf extends bsr
{
  public String aOt;
  public int wMs;
  public String wMu;
  public String wMv;
  public String wMw;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56892);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.wMs);
      if (this.aOt != null)
        paramArrayOfObject.e(3, this.aOt);
      if (this.wMu != null)
        paramArrayOfObject.e(4, this.wMu);
      if (this.wMv != null)
        paramArrayOfObject.e(5, this.wMv);
      if (this.wMw != null)
        paramArrayOfObject.e(6, this.wMw);
      AppMethodBeat.o(56892);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label626;
    label626: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.wMs);
      paramInt = i;
      if (this.aOt != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.aOt);
      i = paramInt;
      if (this.wMu != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.wMu);
      paramInt = i;
      if (this.wMv != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.wMv);
      i = paramInt;
      if (this.wMw != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.wMw);
      AppMethodBeat.o(56892);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56892);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bjf localbjf = (bjf)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56892);
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
            localbjf.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(56892);
          paramInt = i;
          break;
        case 2:
          localbjf.wMs = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56892);
          paramInt = i;
          break;
        case 3:
          localbjf.aOt = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56892);
          paramInt = i;
          break;
        case 4:
          localbjf.wMu = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56892);
          paramInt = i;
          break;
        case 5:
          localbjf.wMv = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56892);
          paramInt = i;
          break;
        case 6:
          localbjf.wMw = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56892);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56892);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bjf
 * JD-Core Version:    0.6.2
 */