package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bun extends bsr
{
  public String csB;
  public String scope;
  public String state;
  public String wWc;
  public String wWd;
  public String wWe;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(10237);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.csB != null)
        paramArrayOfObject.e(2, this.csB);
      if (this.scope != null)
        paramArrayOfObject.e(3, this.scope);
      if (this.state != null)
        paramArrayOfObject.e(4, this.state);
      if (this.wWc != null)
        paramArrayOfObject.e(5, this.wWc);
      if (this.wWd != null)
        paramArrayOfObject.e(6, this.wWd);
      if (this.wWe != null)
        paramArrayOfObject.e(7, this.wWe);
      AppMethodBeat.o(10237);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label719;
    label719: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.csB != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.csB);
      paramInt = i;
      if (this.scope != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.scope);
      i = paramInt;
      if (this.state != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.state);
      paramInt = i;
      if (this.wWc != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.wWc);
      i = paramInt;
      if (this.wWd != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.wWd);
      paramInt = i;
      if (this.wWe != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.wWe);
      AppMethodBeat.o(10237);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(10237);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bun localbun = (bun)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(10237);
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
            localbun.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(10237);
          paramInt = i;
          break;
        case 2:
          localbun.csB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10237);
          paramInt = i;
          break;
        case 3:
          localbun.scope = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10237);
          paramInt = i;
          break;
        case 4:
          localbun.state = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10237);
          paramInt = i;
          break;
        case 5:
          localbun.wWc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10237);
          paramInt = i;
          break;
        case 6:
          localbun.wWd = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10237);
          paramInt = i;
          break;
        case 7:
          localbun.wWe = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10237);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(10237);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bun
 * JD-Core Version:    0.6.2
 */