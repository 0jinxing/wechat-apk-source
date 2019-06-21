package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bmj extends bsr
{
  public long wOP;
  public long wOS;
  public String wPm;
  public int wPn;
  public int wPo;
  public int wem;
  public long wen;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28593);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wPm == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: FromUsername");
        AppMethodBeat.o(28593);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.wPm != null)
        paramArrayOfObject.e(2, this.wPm);
      paramArrayOfObject.iz(3, this.wem);
      paramArrayOfObject.ai(4, this.wen);
      paramArrayOfObject.ai(5, this.wOP);
      paramArrayOfObject.iz(6, this.wPn);
      paramArrayOfObject.ai(7, this.wOS);
      paramArrayOfObject.iz(8, this.wPo);
      AppMethodBeat.o(28593);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label731;
    label731: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wPm != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wPm);
      paramInt = i + e.a.a.b.b.a.bs(3, this.wem) + e.a.a.b.b.a.o(4, this.wen) + e.a.a.b.b.a.o(5, this.wOP) + e.a.a.b.b.a.bs(6, this.wPn) + e.a.a.b.b.a.o(7, this.wOS) + e.a.a.b.b.a.bs(8, this.wPo);
      AppMethodBeat.o(28593);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wPm == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: FromUsername");
          AppMethodBeat.o(28593);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28593);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bmj localbmj = (bmj)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28593);
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
            localbmj.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(28593);
          paramInt = i;
          break;
        case 2:
          localbmj.wPm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28593);
          paramInt = i;
          break;
        case 3:
          localbmj.wem = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28593);
          paramInt = i;
          break;
        case 4:
          localbmj.wen = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(28593);
          paramInt = i;
          break;
        case 5:
          localbmj.wOP = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(28593);
          paramInt = i;
          break;
        case 6:
          localbmj.wPn = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28593);
          paramInt = i;
          break;
        case 7:
          localbmj.wOS = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(28593);
          paramInt = i;
          break;
        case 8:
          localbmj.wPo = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28593);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28593);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bmj
 * JD-Core Version:    0.6.2
 */