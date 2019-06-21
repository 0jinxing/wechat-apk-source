package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class afv extends bsr
{
  public String kmt;
  public String signature;
  public String tyv;
  public String vOV;
  public String wbO;
  public String wmY;
  public String wmZ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(11765);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wbO == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: corp_id");
        AppMethodBeat.o(11765);
        throw paramArrayOfObject;
      }
      if (this.wmY == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: group_id");
        AppMethodBeat.o(11765);
        throw paramArrayOfObject;
      }
      if (this.tyv == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: time_stamp");
        AppMethodBeat.o(11765);
        throw paramArrayOfObject;
      }
      if (this.kmt == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: nonce_str");
        AppMethodBeat.o(11765);
        throw paramArrayOfObject;
      }
      if (this.signature == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: signature");
        AppMethodBeat.o(11765);
        throw paramArrayOfObject;
      }
      if (this.vOV == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: from_url");
        AppMethodBeat.o(11765);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.wbO != null)
        paramArrayOfObject.e(2, this.wbO);
      if (this.wmY != null)
        paramArrayOfObject.e(3, this.wmY);
      if (this.tyv != null)
        paramArrayOfObject.e(4, this.tyv);
      if (this.kmt != null)
        paramArrayOfObject.e(5, this.kmt);
      if (this.signature != null)
        paramArrayOfObject.e(6, this.signature);
      if (this.vOV != null)
        paramArrayOfObject.e(7, this.vOV);
      if (this.wmZ != null)
        paramArrayOfObject.e(8, this.wmZ);
      AppMethodBeat.o(11765);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label1091;
    label1091: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wbO != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wbO);
      i = paramInt;
      if (this.wmY != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wmY);
      int j = i;
      if (this.tyv != null)
        j = i + e.a.a.b.b.a.f(4, this.tyv);
      paramInt = j;
      if (this.kmt != null)
        paramInt = j + e.a.a.b.b.a.f(5, this.kmt);
      i = paramInt;
      if (this.signature != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.signature);
      paramInt = i;
      if (this.vOV != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.vOV);
      i = paramInt;
      if (this.wmZ != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.wmZ);
      AppMethodBeat.o(11765);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wbO == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: corp_id");
          AppMethodBeat.o(11765);
          throw paramArrayOfObject;
        }
        if (this.wmY == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: group_id");
          AppMethodBeat.o(11765);
          throw paramArrayOfObject;
        }
        if (this.tyv == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: time_stamp");
          AppMethodBeat.o(11765);
          throw paramArrayOfObject;
        }
        if (this.kmt == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: nonce_str");
          AppMethodBeat.o(11765);
          throw paramArrayOfObject;
        }
        if (this.signature == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: signature");
          AppMethodBeat.o(11765);
          throw paramArrayOfObject;
        }
        if (this.vOV == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: from_url");
          AppMethodBeat.o(11765);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(11765);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        afv localafv = (afv)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(11765);
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
            localafv.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(11765);
          paramInt = i;
          break;
        case 2:
          localafv.wbO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(11765);
          paramInt = i;
          break;
        case 3:
          localafv.wmY = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(11765);
          paramInt = i;
          break;
        case 4:
          localafv.tyv = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(11765);
          paramInt = i;
          break;
        case 5:
          localafv.kmt = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(11765);
          paramInt = i;
          break;
        case 6:
          localafv.signature = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(11765);
          paramInt = i;
          break;
        case 7:
          localafv.vOV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(11765);
          paramInt = i;
          break;
        case 8:
          localafv.wmZ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(11765);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(11765);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.afv
 * JD-Core Version:    0.6.2
 */