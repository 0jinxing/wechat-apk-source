package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class awj extends bsr
{
  public String csB;
  public String signature;
  public int timestamp;
  public String vzM;
  public String wzf;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(135605);
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
      if (this.vzM != null)
        paramArrayOfObject.e(3, this.vzM);
      if (this.signature != null)
        paramArrayOfObject.e(4, this.signature);
      paramArrayOfObject.iz(5, this.timestamp);
      if (this.wzf != null)
        paramArrayOfObject.e(6, this.wzf);
      AppMethodBeat.o(135605);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label626;
    label626: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.csB != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.csB);
      i = paramInt;
      if (this.vzM != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vzM);
      paramInt = i;
      if (this.signature != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.signature);
      i = paramInt + e.a.a.b.b.a.bs(5, this.timestamp);
      paramInt = i;
      if (this.wzf != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.wzf);
      AppMethodBeat.o(135605);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(135605);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        awj localawj = (awj)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(135605);
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
            localawj.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(135605);
          paramInt = i;
          break;
        case 2:
          localawj.csB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(135605);
          paramInt = i;
          break;
        case 3:
          localawj.vzM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(135605);
          paramInt = i;
          break;
        case 4:
          localawj.signature = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(135605);
          paramInt = i;
          break;
        case 5:
          localawj.timestamp = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(135605);
          paramInt = i;
          break;
        case 6:
          localawj.wzf = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(135605);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(135605);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.awj
 * JD-Core Version:    0.6.2
 */