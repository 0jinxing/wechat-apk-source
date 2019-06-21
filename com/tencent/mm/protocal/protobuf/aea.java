package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class aea extends bsr
{
  public int count;
  public String csB;
  public String desc;
  public int scene;
  public String sign;
  public int wlY;
  public int wlZ;
  public String wma;
  public String wmb;
  public String wmc;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48843);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.csB == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: appid");
        AppMethodBeat.o(48843);
        throw paramArrayOfObject;
      }
      if (this.wmb == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: busi_id");
        AppMethodBeat.o(48843);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.wlY);
      if (this.csB != null)
        paramArrayOfObject.e(3, this.csB);
      if (this.desc != null)
        paramArrayOfObject.e(4, this.desc);
      paramArrayOfObject.iz(5, this.wlZ);
      if (this.wma != null)
        paramArrayOfObject.e(6, this.wma);
      paramArrayOfObject.iz(7, this.count);
      paramArrayOfObject.iz(8, this.scene);
      if (this.wmb != null)
        paramArrayOfObject.e(9, this.wmb);
      if (this.sign != null)
        paramArrayOfObject.e(10, this.sign);
      if (this.wmc != null)
        paramArrayOfObject.e(11, this.wmc);
      AppMethodBeat.o(48843);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label997;
    label997: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.wlY);
      paramInt = i;
      if (this.csB != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.csB);
      i = paramInt;
      if (this.desc != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.desc);
      i += e.a.a.b.b.a.bs(5, this.wlZ);
      paramInt = i;
      if (this.wma != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.wma);
      paramInt = paramInt + e.a.a.b.b.a.bs(7, this.count) + e.a.a.b.b.a.bs(8, this.scene);
      i = paramInt;
      if (this.wmb != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.wmb);
      paramInt = i;
      if (this.sign != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.sign);
      i = paramInt;
      if (this.wmc != null)
        i = paramInt + e.a.a.b.b.a.f(11, this.wmc);
      AppMethodBeat.o(48843);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.csB == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: appid");
          AppMethodBeat.o(48843);
          throw paramArrayOfObject;
        }
        if (this.wmb == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: busi_id");
          AppMethodBeat.o(48843);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(48843);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aea localaea = (aea)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48843);
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
            localaea.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(48843);
          paramInt = i;
          break;
        case 2:
          localaea.wlY = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48843);
          paramInt = i;
          break;
        case 3:
          localaea.csB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48843);
          paramInt = i;
          break;
        case 4:
          localaea.desc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48843);
          paramInt = i;
          break;
        case 5:
          localaea.wlZ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48843);
          paramInt = i;
          break;
        case 6:
          localaea.wma = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48843);
          paramInt = i;
          break;
        case 7:
          localaea.count = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48843);
          paramInt = i;
          break;
        case 8:
          localaea.scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48843);
          paramInt = i;
          break;
        case 9:
          localaea.wmb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48843);
          paramInt = i;
          break;
        case 10:
          localaea.sign = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48843);
          paramInt = i;
          break;
        case 11:
          localaea.wmc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48843);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48843);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aea
 * JD-Core Version:    0.6.2
 */