package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class py extends bsr
{
  public String cBT;
  public String pPZ;
  public String pQe;
  public long pSg;
  public String vWF;
  public String vWY;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48812);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.cBT == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: req_key");
        AppMethodBeat.o(48812);
        throw paramArrayOfObject;
      }
      if (this.vWY == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: transfer_id");
        AppMethodBeat.o(48812);
        throw paramArrayOfObject;
      }
      if (this.pQe == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: transaction_id");
        AppMethodBeat.o(48812);
        throw paramArrayOfObject;
      }
      if (this.pPZ == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: receiver_openid");
        AppMethodBeat.o(48812);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.cBT != null)
        paramArrayOfObject.e(2, this.cBT);
      if (this.vWY != null)
        paramArrayOfObject.e(3, this.vWY);
      if (this.pQe != null)
        paramArrayOfObject.e(4, this.pQe);
      if (this.pPZ != null)
        paramArrayOfObject.e(5, this.pPZ);
      paramArrayOfObject.ai(6, this.pSg);
      if (this.vWF != null)
        paramArrayOfObject.e(7, this.vWF);
      AppMethodBeat.o(48812);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label882;
    label882: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.cBT != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.cBT);
      i = paramInt;
      if (this.vWY != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vWY);
      paramInt = i;
      if (this.pQe != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.pQe);
      i = paramInt;
      if (this.pPZ != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.pPZ);
      i += e.a.a.b.b.a.o(6, this.pSg);
      paramInt = i;
      if (this.vWF != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.vWF);
      AppMethodBeat.o(48812);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.cBT == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: req_key");
          AppMethodBeat.o(48812);
          throw paramArrayOfObject;
        }
        if (this.vWY == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: transfer_id");
          AppMethodBeat.o(48812);
          throw paramArrayOfObject;
        }
        if (this.pQe == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: transaction_id");
          AppMethodBeat.o(48812);
          throw paramArrayOfObject;
        }
        if (this.pPZ == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: receiver_openid");
          AppMethodBeat.o(48812);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(48812);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        py localpy = (py)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48812);
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
            localpy.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(48812);
          paramInt = i;
          break;
        case 2:
          localpy.cBT = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48812);
          paramInt = i;
          break;
        case 3:
          localpy.vWY = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48812);
          paramInt = i;
          break;
        case 4:
          localpy.pQe = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48812);
          paramInt = i;
          break;
        case 5:
          localpy.pPZ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48812);
          paramInt = i;
          break;
        case 6:
          localpy.pSg = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(48812);
          paramInt = i;
          break;
        case 7:
          localpy.vWF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48812);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48812);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.py
 * JD-Core Version:    0.6.2
 */