package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bqp extends bsr
{
  public String tgu;
  public int wOi;
  public String wOm;
  public String wOn;
  public String wan;
  public int wao;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56954);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.wOi);
      if (this.wOn != null)
        paramArrayOfObject.e(3, this.wOn);
      if (this.wan != null)
        paramArrayOfObject.e(4, this.wan);
      paramArrayOfObject.iz(5, this.wao);
      if (this.wOm != null)
        paramArrayOfObject.e(6, this.wOm);
      if (this.tgu != null)
        paramArrayOfObject.e(100, this.tgu);
      AppMethodBeat.o(56954);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label701;
    label701: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.wOi);
      paramInt = i;
      if (this.wOn != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.wOn);
      i = paramInt;
      if (this.wan != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.wan);
      i += e.a.a.b.b.a.bs(5, this.wao);
      paramInt = i;
      if (this.wOm != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.wOm);
      i = paramInt;
      if (this.tgu != null)
        i = paramInt + e.a.a.b.b.a.f(100, this.tgu);
      AppMethodBeat.o(56954);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56954);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bqp localbqp = (bqp)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56954);
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
            localbqp.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(56954);
          paramInt = i;
          break;
        case 2:
          localbqp.wOi = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56954);
          paramInt = i;
          break;
        case 3:
          localbqp.wOn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56954);
          paramInt = i;
          break;
        case 4:
          localbqp.wan = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56954);
          paramInt = i;
          break;
        case 5:
          localbqp.wao = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56954);
          paramInt = i;
          break;
        case 6:
          localbqp.wOm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56954);
          paramInt = i;
          break;
        case 100:
          localbqp.tgu = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56954);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56954);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bqp
 * JD-Core Version:    0.6.2
 */