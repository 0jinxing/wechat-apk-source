package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import java.util.LinkedList;

public final class avq extends bsr
{
  public String csB;
  public String cvO;
  public String signature;
  public String url;
  public String wzd;
  public String wzf;
  public String wzg;
  public b wzh;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(10207);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.url != null)
        paramArrayOfObject.e(2, this.url);
      if (this.csB != null)
        paramArrayOfObject.e(3, this.csB);
      if (this.wzd != null)
        paramArrayOfObject.e(4, this.wzd);
      if (this.cvO != null)
        paramArrayOfObject.e(5, this.cvO);
      if (this.wzf != null)
        paramArrayOfObject.e(6, this.wzf);
      if (this.signature != null)
        paramArrayOfObject.e(7, this.signature);
      if (this.wzg != null)
        paramArrayOfObject.e(8, this.wzg);
      if (this.wzh != null)
        paramArrayOfObject.c(9, this.wzh);
      AppMethodBeat.o(10207);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label859;
    label859: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.url != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.url);
      paramInt = i;
      if (this.csB != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.csB);
      i = paramInt;
      if (this.wzd != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.wzd);
      int j = i;
      if (this.cvO != null)
        j = i + e.a.a.b.b.a.f(5, this.cvO);
      paramInt = j;
      if (this.wzf != null)
        paramInt = j + e.a.a.b.b.a.f(6, this.wzf);
      i = paramInt;
      if (this.signature != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.signature);
      paramInt = i;
      if (this.wzg != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.wzg);
      i = paramInt;
      if (this.wzh != null)
        i = paramInt + e.a.a.b.b.a.b(9, this.wzh);
      AppMethodBeat.o(10207);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(10207);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        avq localavq = (avq)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(10207);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((hl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localavq.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(10207);
          paramInt = i;
          break;
        case 2:
          localavq.url = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10207);
          paramInt = i;
          break;
        case 3:
          localavq.csB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10207);
          paramInt = i;
          break;
        case 4:
          localavq.wzd = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10207);
          paramInt = i;
          break;
        case 5:
          localavq.cvO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10207);
          paramInt = i;
          break;
        case 6:
          localavq.wzf = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10207);
          paramInt = i;
          break;
        case 7:
          localavq.signature = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10207);
          paramInt = i;
          break;
        case 8:
          localavq.wzg = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10207);
          paramInt = i;
          break;
        case 9:
          localavq.wzh = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(10207);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(10207);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.avq
 * JD-Core Version:    0.6.2
 */